package com.liuzh.deviceinfo.location;

import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.applovin.impl.sdk.ad.f;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.location.RealtimeSatelliteActivity;
import com.liuzh.deviceinfo.utilities.d;
import com.liuzh.deviceinfo.view.GpsSkyView;
import d.m;
import dj.b;
import e4.m0;
import e4.v0;
import hg.a;
import java.util.WeakHashMap;
import qh.n;
import sh.u;
import sh.x;
import wi.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class RealtimeSatelliteActivity extends a implements SensorEventListener {
    public static final /* synthetic */ int S = 0;
    public LocationManager B;
    public x C;
    public ug.a D;
    public GpsStatus E;
    public u F;
    public GpsSkyView G;
    public SensorManager H;
    public Location I;
    public Sensor J;
    public Sensor K;
    public n.a L = null;
    public boolean M = false;
    public final float[] N = new float[16];
    public final float[] O = new float[4];
    public final float[] P = new float[16];
    public final float[] Q = new float[3];
    public GeomagneticField R;

    public final void D() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.btm_ad_container);
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            frameLayout.setVisibility(8);
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.mid_ad_container);
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
            frameLayout2.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [android.location.GpsStatus$Listener, ug.a] */
    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws NoSuchFieldException, SecurityException {
        LocationProvider provider;
        LocationProvider provider2;
        super.onCreate(bundle);
        if (!i.b(this, "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            Toast.makeText(this, R.string.missing_permission, 0).show();
            finish();
            return;
        }
        m.a(this);
        setContentView(R.layout.activity_realtime_satellite);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        z(toolbar);
        A();
        zh.i.e(toolbar);
        View viewFindViewById = findViewById(R.id.root_container);
        f fVar = new f(25, toolbar, viewFindViewById);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(viewFindViewById, fVar);
        this.G = (GpsSkyView) findViewById(R.id.sky_view);
        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iD = com.liuzh.deviceinfo.utilities.f.d();
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollview);
        if (scrollView != null) {
            b.m(scrollView, iD);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.legend_container);
        if (viewGroup instanceof ScrollView) {
            b.m((ScrollView) viewGroup, iD);
        }
        AsyncTask.execute(new com.applovin.mediation.nativeAds.adPlacer.a(this, viewGroup, iD, 12));
        this.H = (SensorManager) getSystemService("sensor");
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        int i4 = 1;
        if (sensorManager == null || sensorManager.getDefaultSensor(11) == null) {
            Sensor defaultSensor = this.H.getDefaultSensor(3);
            this.K = defaultSensor;
            if (defaultSensor != null) {
                this.H.registerListener(this, defaultSensor, 1);
            }
        } else {
            Sensor defaultSensor2 = this.H.getDefaultSensor(11);
            this.J = defaultSensor2;
            this.H.registerListener(this, defaultSensor2, 16000);
        }
        LocationManager locationManager = (LocationManager) getSystemService("location");
        this.B = locationManager;
        if (locationManager != null) {
            provider = locationManager.getProvider("gps");
            provider2 = this.B.getProvider("network");
        } else {
            provider = null;
            provider2 = null;
        }
        LocationManager locationManager2 = this.B;
        if (locationManager2 == null || provider == null) {
            finish();
            Toast.makeText(this, getString(R.string.gps_not_supported), 0).show();
        } else {
            this.F = new u(1, this);
            locationManager2.requestLocationUpdates(provider.getName(), 1000L, 1.0f, this.F);
            if (provider2 != null) {
                this.B.requestLocationUpdates(provider2.getName(), 1000L, 1.0f, this.F);
            }
            if (d.f21254c) {
                x xVar = new x(1, this);
                this.C = xVar;
                this.B.registerGnssStatusCallback(xVar);
            } else {
                ?? r12 = new GpsStatus.Listener() { // from class: ug.a
                    @Override // android.location.GpsStatus.Listener
                    public final void onGpsStatusChanged(int i10) {
                        RealtimeSatelliteActivity realtimeSatelliteActivity = this.f35327a;
                        GpsStatus gpsStatus = realtimeSatelliteActivity.B.getGpsStatus(realtimeSatelliteActivity.E);
                        realtimeSatelliteActivity.E = gpsStatus;
                        if (i10 == 1) {
                            GpsSkyView gpsSkyView = realtimeSatelliteActivity.G;
                            gpsSkyView.f21331u = true;
                            gpsSkyView.invalidate();
                        } else {
                            if (i10 != 2) {
                                if (i10 == 4 && gpsStatus != null) {
                                    realtimeSatelliteActivity.G.setSats(gpsStatus);
                                    return;
                                }
                                return;
                            }
                            GpsSkyView gpsSkyView2 = realtimeSatelliteActivity.G;
                            gpsSkyView2.f21331u = false;
                            gpsSkyView2.F = 0;
                            gpsSkyView2.invalidate();
                        }
                    }
                };
                this.D = r12;
                this.B.addGpsStatusListener(r12);
            }
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.btm_ad_container);
        if (frameLayout == null) {
            return;
        }
        if (com.liuzh.deviceinfo.utilities.f.g()) {
            D();
            return;
        }
        pd.b.p(frameLayout, false);
        je.u.k(this, new n(this, frameLayout, i4), ag.a.f361d);
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        n.a aVar = this.L;
        if (aVar != null) {
            aVar.b();
            this.L = null;
        }
        LocationManager locationManager = this.B;
        if (locationManager != null) {
            u uVar = this.F;
            if (uVar != null) {
                try {
                    locationManager.removeUpdates(uVar);
                } catch (Exception unused) {
                }
            }
            try {
                if (d.f21254c) {
                    x xVar = this.C;
                    if (xVar != null) {
                        this.B.unregisterGnssStatusCallback(xVar);
                    }
                } else {
                    ug.a aVar2 = this.D;
                    if (aVar2 != null) {
                        this.B.removeGpsStatusListener(aVar2);
                    }
                }
            } catch (Exception unused2) {
            }
        }
        SensorManager sensorManager = this.H;
        if (sensorManager != null) {
            Sensor sensor = this.J;
            if (sensor != null) {
                sensorManager.unregisterListener(this, sensor);
                return;
            }
            Sensor sensor2 = this.K;
            if (sensor2 != null) {
                sensorManager.unregisterListener(this, sensor2);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        double declination;
        int type = sensorEvent.sensor.getType();
        if (type == 3) {
            declination = sensorEvent.values[0];
        } else {
            if (type != 11) {
                return;
            }
            boolean z3 = this.M;
            float[] fArr = this.O;
            float[] fArr2 = this.N;
            if (z3) {
                System.arraycopy(sensorEvent.values, 0, fArr, 0, 4);
                SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            } else {
                try {
                    SensorManager.getRotationMatrixFromVector(fArr2, sensorEvent.values);
                } catch (IllegalArgumentException unused) {
                    this.M = true;
                    System.arraycopy(sensorEvent.values, 0, fArr, 0, 4);
                    SensorManager.getRotationMatrixFromVector(fArr2, fArr);
                }
            }
            int rotation = getWindowManager().getDefaultDisplay().getRotation();
            float[] fArr3 = this.Q;
            if (rotation != 0) {
                float[] fArr4 = this.P;
                if (rotation == 1) {
                    SensorManager.remapCoordinateSystem(fArr2, 2, 129, fArr4);
                    SensorManager.getOrientation(fArr4, fArr3);
                } else if (rotation == 2) {
                    SensorManager.remapCoordinateSystem(fArr2, 129, 130, fArr4);
                    SensorManager.getOrientation(fArr4, fArr3);
                } else if (rotation != 3) {
                    SensorManager.getOrientation(fArr2, fArr3);
                } else {
                    SensorManager.remapCoordinateSystem(fArr2, 130, 1, fArr4);
                    SensorManager.getOrientation(fArr4, fArr3);
                }
            } else {
                SensorManager.getOrientation(fArr2, fArr3);
            }
            declination = Math.toDegrees(fArr3[0]);
            Math.toDegrees(fArr3[1]);
        }
        if (this.R != null) {
            declination = ((((float) (declination + r10.getDeclination())) % 360.0f) + 360.0f) % 360.0f;
        }
        GpsSkyView gpsSkyView = this.G;
        gpsSkyView.f21330t = declination;
        gpsSkyView.invalidate();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i4) {
    }
}
