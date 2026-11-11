package seg3x02.employeeGql.configuration

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class GraphiqlController {
    @GetMapping("/graphiql")
    fun graphiql() = "forward:/graphiql.html"
}
