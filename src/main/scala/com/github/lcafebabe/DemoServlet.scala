package com.github.lcafebabe
import org.scalatra._
class DemoServlet extends ScalatraServlet{
  get("/aaa") {
    views.html.hello("Hello123654")
  }

  get("/aa") {
    <html>
      <body>
        <h1>Is JRebel working? </h1>
      </body>
    </html>
  }
}
