BaiduMapJS = {

    //添加滚动效果
    enableScrollWheelZoom:function(mp){
        mp.enableScrollWheelZoom();
    },

    //去除地图公路。铁路线
    removeRoadFromMap:function(mp){
        mp.setMapStyle({
            styleJson:[
                {
                    "featureType": "road",
                    "elementType": "all",
                    "stylers": {
                        "color": "#ffffff",
                        "visibility": "off"
                    }
                }
            ]
        });
    }
}


