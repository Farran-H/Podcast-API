package models

case class Podcast(
  id: Long,
  title: String,
  description: String,
  category: String
)
object Podcast {
  import play.api.libs.json._

  implicit val podcastFormat: OFormat[Podcast] = Json.format[Podcast]
}

