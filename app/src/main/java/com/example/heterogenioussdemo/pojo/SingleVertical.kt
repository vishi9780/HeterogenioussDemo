package com.example.heterogenioussdemo.pojo


class SingleVertical {

    var header: String? = null
    var subHeader: String? = null
    var image: Int = 0

    constructor() {

    }

    constructor(header: String, subHeader: String, image: Int) {
        this.header = header
        this.subHeader = subHeader
        this.image = image
    }

    constructor(image: Int, header: String, subHeader: String) {
        this.header = header
        this.subHeader = subHeader
        this.image = image
    }
}
