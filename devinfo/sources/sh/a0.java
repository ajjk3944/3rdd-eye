package sh;

import android.graphics.drawable.Drawable;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.location.OnNmeaMessageListener;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.internal.ads.s9;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class a0 extends a {
    public LocationManager Z;

    /* renamed from: a0, reason: collision with root package name */
    public x f33618a0;

    /* renamed from: b0, reason: collision with root package name */
    public y f33619b0;

    /* renamed from: c0, reason: collision with root package name */
    public GpsStatus f33620c0;

    /* renamed from: d0, reason: collision with root package name */
    public s f33621d0;

    /* renamed from: e0, reason: collision with root package name */
    public w f33622e0;

    /* renamed from: f0, reason: collision with root package name */
    public u f33623f0;

    /* renamed from: g0, reason: collision with root package name */
    public View f33624g0;

    /* renamed from: h0, reason: collision with root package name */
    public LinearLayout f33625h0;

    /* renamed from: k0, reason: collision with root package name */
    public j1.q f33628k0;

    /* renamed from: l0, reason: collision with root package name */
    public Location f33629l0;

    /* renamed from: m0, reason: collision with root package name */
    public FrameLayout f33630m0;

    /* renamed from: n0, reason: collision with root package name */
    public String f33631n0;

    /* renamed from: o0, reason: collision with root package name */
    public b5.t f33632o0;

    /* renamed from: q0, reason: collision with root package name */
    public ViewGroup f33634q0;

    /* renamed from: i0, reason: collision with root package name */
    public final HashMap f33626i0 = new HashMap();

    /* renamed from: j0, reason: collision with root package name */
    public final HashMap f33627j0 = new HashMap();

    /* renamed from: p0, reason: collision with root package name */
    public final r f33633p0 = new r(0, this);

    /* renamed from: r0, reason: collision with root package name */
    public final t f33635r0 = new t(this);

    public static void h0(a0 a0Var) {
        int size;
        HashMap map = a0Var.f33626i0;
        HashMap map2 = a0Var.f33627j0;
        if (a0Var.c0() || map2.isEmpty()) {
            return;
        }
        Iterator it = map2.keySet().iterator();
        while (true) {
            size = 0;
            if (!it.hasNext()) {
                break;
            }
            Integer num = (Integer) it.next();
            List list = (List) map.get(num);
            z zVar = (z) map2.get(num);
            if (zVar != null) {
                zVar.f33794a.setText(DeviceInfoApp.f21145f.getString(R.string.num_of_satellite, Integer.valueOf(list == null ? 0 : list.size())));
            }
        }
        j1.q qVar = a0Var.f33628k0;
        if (qVar != null) {
            ArrayList arrayList = new ArrayList(map.values());
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj = arrayList.get(i4);
                i4++;
                List list2 = (List) obj;
                if (list2 != null) {
                    size = list2.size() + size;
                }
            }
            ((TextView) ((qg.d) qVar.f27058a).j).setText(String.valueOf(size));
        }
    }

    public static void i0(a0 a0Var, int i4) {
        if (a0Var.c0()) {
            return;
        }
        if (i4 == 0) {
            a0Var.f33631n0 = "";
        } else {
            a0Var.f33631n0 = TimeUnit.MILLISECONDS.toSeconds(i4) + " sec";
        }
        j1.q qVar = a0Var.f33628k0;
        if (qVar != null) {
            ((TextView) ((qg.d) qVar.f27058a).f32343n).setText(a0Var.f33631n0);
        }
    }

    public static void j0(a0 a0Var, GnssStatus gnssStatus) {
        int i4;
        int satelliteCount = gnssStatus.getSatelliteCount();
        HashMap map = a0Var.f33626i0;
        for (List list : map.values()) {
            if (list != null) {
                list.clear();
            }
        }
        for (int i10 = 0; i10 < satelliteCount; i10++) {
            s9 s9Var = new s9();
            gnssStatus.getAzimuthDegrees(i10);
            gnssStatus.getCn0DbHz(i10);
            gnssStatus.getElevationDegrees(i10);
            switch (gnssStatus.getConstellationType(i10)) {
                case 1:
                    i4 = 0;
                    break;
                case 2:
                    i4 = 6;
                    break;
                case 3:
                    i4 = 1;
                    break;
                case 4:
                    i4 = 3;
                    break;
                case 5:
                    i4 = 2;
                    break;
                case 6:
                    i4 = 4;
                    break;
                case 7:
                    i4 = 5;
                    break;
                default:
                    i4 = -1;
                    break;
            }
            s9Var.f15910b = i4;
            if (com.liuzh.deviceinfo.utilities.d.f21253b) {
                gnssStatus.getCarrierFrequencyHz(i10);
            }
            gnssStatus.getSvid(i10);
            List arrayList = (List) map.get(Integer.valueOf(s9Var.f15910b));
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(Integer.valueOf(s9Var.f15910b), arrayList);
            }
            arrayList.add(s9Var);
        }
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        this.f33632o0 = (b5.t) h(new b5.o0(3), new lf.e(12, this));
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        com.liuzh.deviceinfo.utilities.f.n(this.f33633p0);
        ah.o.f400d.b(this.f33635r0);
        k0();
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NoSuchFieldException, SecurityException {
        View view = this.f33624g0;
        if (view != null) {
            return view;
        }
        boolean z3 = false;
        View viewInflate = layoutInflater.inflate(R.layout.tab_gps, viewGroup, false);
        this.f33624g0 = viewInflate;
        ScrollView scrollView = (ScrollView) viewInflate.findViewById(R.id.scrollView);
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        dj.b.m(scrollView, com.liuzh.deviceinfo.utilities.f.d());
        this.f33625h0 = (LinearLayout) this.f33624g0.findViewById(R.id.satellite_container);
        this.f33630m0 = (FrameLayout) this.f33624g0.findViewById(R.id.details_card);
        ViewGroup viewGroup2 = (ViewGroup) this.f33624g0.findViewById(R.id.procard_container);
        this.f33634q0 = viewGroup2;
        viewGroup2.removeAllViews();
        if (ah.o.f400d.c() || !new Random().nextBoolean()) {
            this.f33634q0.setVisibility(8);
        } else {
            layoutInflater.inflate(R.layout.item_procard_home, this.f33634q0);
            this.f33634q0.setVisibility(0);
            ((TextView) this.f33634q0.findViewById(R.id.summary)).setText(t().getString(R.string.active_pro_for_noads_summary, u(R.string.pro_version)));
            this.f33634q0.findViewById(R.id.procard_container).setOnClickListener(new oi.i(3));
            this.f33634q0.findViewById(R.id.iv_close).setOnClickListener(new aa.j(11, this));
        }
        AsyncTask.execute(new fb.r(this, z3, layoutInflater, 12));
        return this.f33624g0;
    }

    @Override // b5.z
    public final void H() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.F = true;
        ah.o.f400d.h(this.f33635r0);
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        com.liuzh.deviceinfo.utilities.f.f21257c.unregisterOnSharedPreferenceChangeListener(this.f33633p0);
        LocationManager locationManager = this.Z;
        if (locationManager == null) {
            return;
        }
        u uVar = this.f33623f0;
        if (uVar != null) {
            locationManager.removeUpdates(uVar);
        }
        if (com.liuzh.deviceinfo.utilities.d.f21254c) {
            x xVar = this.f33618a0;
            if (xVar != null) {
                this.Z.unregisterGnssStatusCallback(xVar);
            }
            s sVar = this.f33621d0;
            if (sVar != null) {
                this.Z.removeNmeaListener(sVar);
                return;
            }
            return;
        }
        y yVar = this.f33619b0;
        if (yVar != null) {
            this.Z.removeGpsStatusListener(yVar);
        }
        if (this.f33622e0 != null) {
            try {
                LocationManager.class.getMethod("removeNmeaListener", GpsStatus.NmeaListener.class).invoke(this.Z, this.f33622e0);
            } catch (Exception unused) {
            }
        }
    }

    @Override // b5.z
    public final void N() {
        this.F = true;
        n0();
        if (this.Z == null) {
            k0();
        }
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        ph.d dVar = new ph.d(3, view);
        WeakHashMap weakHashMap = e4.v0.f22405a;
        e4.m0.j(view, dVar);
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [sh.s] */
    public final void k0() {
        LocationProvider provider;
        LocationProvider provider2;
        if (wi.i.b(W(), zg.c.f38280b) && this.Z == null) {
            LocationManager locationManager = (LocationManager) W().getSystemService("location");
            this.Z = locationManager;
            if (locationManager != null) {
                provider = locationManager.getProvider("gps");
                provider2 = this.Z.getProvider("network");
            } else {
                provider = null;
                provider2 = null;
            }
            LocationManager locationManager2 = this.Z;
            if (locationManager2 == null || provider == null) {
                Toast.makeText(W(), u(R.string.gps_not_supported), 0).show();
                return;
            }
            this.f33623f0 = new u(0, this);
            locationManager2.requestLocationUpdates(provider.getName(), 1000L, 1.0f, this.f33623f0, Looper.getMainLooper());
            if (provider2 != null) {
                this.Z.requestLocationUpdates(provider2.getName(), 1000L, 1.0f, this.f33623f0, Looper.getMainLooper());
            }
            if (com.liuzh.deviceinfo.utilities.d.f21254c) {
                x xVar = new x(0, this);
                this.f33618a0 = xVar;
                try {
                    this.Z.registerGnssStatusCallback(xVar, new Handler(Looper.getMainLooper()));
                } catch (SecurityException unused) {
                    Toast.makeText(p(), R.string.missing_permission, 0).show();
                }
                if (this.f33621d0 == null) {
                    this.f33621d0 = new OnNmeaMessageListener() { // from class: sh.s
                        @Override // android.location.OnNmeaMessageListener
                        public final void onNmeaMessage(String str, long j) {
                            this.f33758a.l0(str);
                        }
                    };
                }
                this.Z.addNmeaListener(this.f33621d0);
                return;
            }
            y yVar = new y(this);
            this.f33619b0 = yVar;
            this.Z.addGpsStatusListener(yVar);
            if (this.f33622e0 == null) {
                this.f33622e0 = new w(this);
            }
            try {
                LocationManager.class.getMethod("addNmeaListener", GpsStatus.NmeaListener.class).invoke(this.Z, this.f33622e0);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l0(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.a0.l0(java.lang.String):void");
    }

    public final void m0() {
        boolean z3 = com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("already_request_location_permission", false);
        String[] strArr = zg.c.f38280b;
        if (!(!z3 ? true : wi.i.d(this, strArr))) {
            rg.f.j0(R.string.tab_gps_permission_rational, this);
        } else {
            this.f33632o0.a(strArr);
            com.liuzh.deviceinfo.utilities.f.k("already_request_location_permission", true);
        }
    }

    public final void n0() {
        if (c0() || this.f33624g0 == null) {
            return;
        }
        if (wi.i.b(W(), zg.c.f38280b)) {
            this.f33624g0.findViewById(R.id.permission_card).setVisibility(8);
            return;
        }
        this.f33624g0.findViewById(R.id.permission_card).setVisibility(0);
        View viewFindViewById = this.f33624g0.findViewById(R.id.action_grant_permission);
        if (com.liuzh.deviceinfo.utilities.d.k()) {
            com.liuzh.deviceinfo.utilities.y.k(viewFindViewById);
        }
        Drawable background = viewFindViewById.getBackground();
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        viewFindViewById.setBackground(wb.e.M(background, com.liuzh.deviceinfo.utilities.f.d()));
        viewFindViewById.setOnClickListener(new com.applovin.mediation.nativeAds.a(22, this));
    }
}
