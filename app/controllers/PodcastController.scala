package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import models.Podcast

@Singleton
class PodcastController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  private val sampleData = List(
    Podcast(1, "Tech Talk", "A podcast about technology", "Technology"),
    Podcast(2, "History Hour", "A podcast about history", "History")
  )

  def listAll = Action {
    Ok(Json.toJson(sampleData))
  }

  def getById(id: Long) = Action {
    sampleData.find(_.id == id)
      .map(p => Ok(Json.toJson(p)))
      .getOrElse(NotFound(Json.obj("error" -> "Podcast not found")))
  }

  def searchByCategory(category: String) = Action {
    val result = sampleData.filter(_.category.toLowerCase == category.toLowerCase)
    Ok(Json.toJson(result))
  }
}

