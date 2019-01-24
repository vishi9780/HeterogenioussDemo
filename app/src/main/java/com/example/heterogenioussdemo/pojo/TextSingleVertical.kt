package com.example.heterogenioussdemo.pojo


class TextSingleVertical {

    var header: String? = null
    var subHeader: String? = null
    var image: Int = 0

    constructor() {

    }

    constructor(image: Int, header: String, subHeader: String) {
        this.header = header
        this.subHeader = subHeader
        this.image = image
    }
}
