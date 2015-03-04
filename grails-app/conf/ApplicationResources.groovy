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
        resource url:[dir:'js', file:'jquery.sortElemets.js']
        resource url:[dir:'js', file:'jquery.jsonp-2.3.1.min.js']
        resource url:[dir:'js', file:'trove.js']
        resource url:'https://ajax.googleapis.com/jsapi', attrs:[type:'js'], disposition: 'head'
        resource url:[dir:'js', file:'charts2.js']
        resource url:[dir:'js', file:'species.show.js']
        resource url:[dir:'js', file:'audio.min.js']
        resource url:[dir:'js', file:'jquery.qtip.min.js']
        resource url:[dir:'js', file:'moment.min.js']
    }

    imageSearch {
        dependsOn 'jquery-migration'
        resource url:[dir:'js', file:'jquery.tools.min.js']
        resource url:[dir:'js', file:'jquery.inview.min.js']
        resource url:[dir:'js', file:'jquery.livequery.min.js']
    }

    cleanHtml {
        resource url:[dir:'js', file:'jquery.htmlClean.js']
    }

    snazzy {
        resource url:[dir:'css', file:'snazzy.css']
    }

    colorbox {
        dependsOn 'jquery'
        resource url:[dir:'css', file:'colorbox.css']
        resource url:[dir:'js', file:'jquery.colorbox-min.js']
    }

    fancybox {
        dependsOn 'jquery'
        resource url:[dir:'css', file:'jquery.fancybox.css']
        resource url:[dir:'js', file:'jquery.fancybox.pack.js']
    }
}