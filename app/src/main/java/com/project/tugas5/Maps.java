package com.project.tugas5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class Maps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        MapView map = (MapView) findViewById(R.id.map);
        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);

        GeoPoint starPoint = new GeoPoint(-5.396410, 105.308245);
        IMapController mapController = map.getController();
        mapController.setZoom(17);
        mapController.setCenter(starPoint);
        Marker starMarker = new Marker(map);
        starMarker.setPosition(starPoint);
        starMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(starMarker);
        map.invalidate();
        starMarker.setIcon(getResources().getDrawable(R.drawable.gmbr1));
        starMarker.setTitle("RumahKu");

        GeoPoint starPoint1 = new GeoPoint(-5.379532, 105.251695);
        IMapController mapController1 = map.getController();
        mapController1.setCenter(starPoint1);
        Marker starMarker1 = new Marker(map);
        starMarker1.setPosition(starPoint1);
        starMarker1.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(starMarker1);
        map.invalidate();
        starMarker1.setIcon(getResources().getDrawable(R.drawable.gmbr2));
        starMarker1.setTitle("Universitas Bandar Lampung");

        GeoPoint starPoint2 = new GeoPoint(-5.375392, 105.246242);
        IMapController mapController2 = map.getController();
        mapController2.setCenter(starPoint2);
        Marker starMarker2 = new Marker(map);
        starMarker2.setPosition(starPoint2);
        starMarker2.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(starMarker2);
        map.invalidate();
        starMarker2.setIcon(getResources().getDrawable(R.drawable.gmbr3));
        starMarker2.setTitle("Universitas Bandar Lampung Pascasarjana");

        GeoPoint starPoint4 = new GeoPoint(-5.381785 , 105.259613);
        IMapController mapController4 = map.getController();
        mapController4.setCenter(starPoint4);
        Marker starMarker4 = new Marker(map);
        starMarker4.setPosition(starPoint4);
        starMarker4.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(starMarker4);
        map.invalidate();
        starMarker4.setIcon(getResources().getDrawable(R.drawable.gmbr4));
        starMarker4.setTitle("Mal Boemi Kedaton");

        GeoPoint starPoint3 = new GeoPoint(-5.372220, 105.240891);
        IMapController mapController3 = map.getController();
        mapController3.setCenter(starPoint3);
        Marker starMarker3 = new Marker(map);
        starMarker3.setPosition(starPoint3);
        starMarker3.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(starMarker3);
        map.invalidate();
        starMarker3.setIcon(getResources().getDrawable(R.drawable.gmbr5));
        starMarker3.setTitle("Museum Lampung");
    }
}
