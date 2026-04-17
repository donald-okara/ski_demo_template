package ke.don.ski_demo_template

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform