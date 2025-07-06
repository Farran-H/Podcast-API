package controllers

import javax.inject._
import play.api.mvc._
import controllers.AssetsFinder
import views.html.index

@Singleton
class HomeController @Inject()(
    cc: ControllerComponents,
    assetsFinder: AssetsFinder
) extends AbstractController(cc) {

  def home: Action[AnyContent] = Action {
  Ok(index(assetsFinder))
  }
}
