modules = {
    application {
        dependsOn 'jquery-migration'
        resource url:'js/application.js'
        resource url:'css/AlaBsAdditions.css'
    }

    search {
        dependsOn 'application'
        resource url:[dir:'css', file:'bie.search.css']
        resource url:[dir:'js', file:'jquery.sortElemets.js']
        resource url:[dir:'js', file:'search.js']
    }

    show {
        dependsOn 'application, colorbox, fancybox, cleanHtml, snazzy, bootstrap'
        resource url:[dir:'css', file:'species.css']
        resource url:[dir:'css', file:'jquery.qtip.min.css']
        resource url:[dir:'js', file:'jquery.sortElemets.js', disposition: 'head']
        resource url:[dir:'js', file:'jquery.jsonp-2.3.1.min.js', disposition: 'head']
        resource url:[dir:'js', file:'trove.js', disposition: 'head']
        resource url:'https://ajax.googleapis.com/jsapi', attrs:[type:'js'], disposition: 'head'
        resource url:[dir:'js', file:'charts2.js', disposition: 'head']
        resource url:[dir:'js', file:'species.show.js', disposition: 'head']
        resource url:[dir:'js', file:'audio.min.js', disposition: 'head']
        resource url:[dir:'js', file:'jquery.qtip.min.js', disposition: 'head']
        resource url:[dir:'js', file:'moment.min.js', disposition: 'head']
    }

    cleanHtml {
        resource url:[dir:'js', file:'jquery.htmlClean.js', disposition: 'head']
    }

    snazzy {
        resource url:[dir:'css', file:'snazzy.css', disposition: 'head']
    }

    colorbox {
        dependsOn 'jquery'
        resource url:[dir:'css', file:'colorbox.css']
        resource url:[dir:'js', file:'jquery.colorbox-min.js'], disposition: 'head'
    }

    fancybox {
        dependsOn 'jquery'
        resource url:[dir:'css', file:'jquery.fancybox.css']
        resource url:[dir:'js', file:'jquery.fancybox.pack.js'], disposition: 'head'
    }
}