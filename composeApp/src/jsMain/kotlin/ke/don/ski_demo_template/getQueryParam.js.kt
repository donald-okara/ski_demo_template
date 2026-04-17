package ke.don.ski_demo_template

import kotlinx.browser.window

actual fun getQueryParam(key: String): String? {
    return window.location.search
        .removePrefix("?")
        .split("&")
        .mapNotNull {
            val parts = it.split("=")
            val k = parts.getOrNull(0)
            val v = parts.getOrNull(1)
            if (k == key) v else null
        }
        .firstOrNull()
}