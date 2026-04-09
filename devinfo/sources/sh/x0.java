package sh;

import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.h1;
import androidx.lifecycle.j1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f1;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class x0 extends a implements SharedPreferences.OnSharedPreferenceChangeListener, ah.n {
    public b5.n0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public se.b f33782a0;

    /* renamed from: b0, reason: collision with root package name */
    public final ArrayList f33783b0 = new ArrayList();

    /* renamed from: c0, reason: collision with root package name */
    public RecyclerView f33784c0;

    /* renamed from: d0, reason: collision with root package name */
    public View f33785d0;

    /* renamed from: e0, reason: collision with root package name */
    public ig.e f33786e0;

    /* renamed from: f0, reason: collision with root package name */
    public zg.b f33787f0;

    /* renamed from: g0, reason: collision with root package name */
    public n.a f33788g0;

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.registerOnSharedPreferenceChangeListener(this);
        ah.o.f400d.b(this);
        this.f33787f0 = zg.c.g(W(), this, new lf.e(13, this));
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f33784c0 == null) {
            RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate(R.layout.tab_tests, viewGroup, false);
            this.f33784c0 = recyclerView;
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            dj.b.k(recyclerView, com.liuzh.deviceinfo.utilities.f.d());
            f1 layoutManager = this.f33784c0.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.g = new r0(this, gridLayoutManager);
            }
            boolean zK = com.liuzh.deviceinfo.utilities.d.k();
            com.liuzh.deviceinfo.utilities.t tVar = com.liuzh.deviceinfo.utilities.t.f21303b;
            ArrayList arrayList = this.f33783b0;
            arrayList.clear();
            arrayList.add(new u0("storage_analyze", R.drawable.ic_sd_card, u(R.string.storage_analyze), tVar.f21304a.getInt("storage_analyze", 2)));
            String strU = u(R.string.display_test);
            SharedPreferences sharedPreferences = tVar.f21304a;
            arrayList.add(new u0("screen_specific", R.drawable.ic_phone_android, strU, sharedPreferences.getInt("test_display", 2)));
            arrayList.add(new t0());
            if (!zK && U().getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
                arrayList.add(new u0("test_flashlight", R.drawable.ic_flashlight, u(R.string.flashlight_test), sharedPreferences.getInt("test_flashlight", 2)));
            }
            arrayList.add(new u0("test_loud_speaker", R.drawable.ic_speaker, u(R.string.loudspeaker_test), sharedPreferences.getInt("test_loud_speaker", 2)));
            if (!zK) {
                arrayList.add(new u0("test_ear_speaker", R.drawable.ic_earspeaker, u(R.string.earspeaker_test), sharedPreferences.getInt("test_ear_speaker", 2)));
                arrayList.add(new u0("test_ear_proximity", R.drawable.ic_earproximity, u(R.string.earproximity_test), sharedPreferences.getInt("test_ear_proximity", 2)));
                SensorManager sensorManager = (SensorManager) U().getSystemService("sensor");
                if (sensorManager != null && sensorManager.getDefaultSensor(2) != null) {
                    arrayList.add(new u0("test_light_sensor", R.drawable.ic_light_sensor, u(R.string.lightsensor_test), sharedPreferences.getInt("test_light_sensor", 2)));
                }
            }
            arrayList.add(new u0("test_vibration", R.drawable.ic_vibration, u(R.string.vibration_test), sharedPreferences.getInt("test_vibration", 2)));
            if (U().getPackageManager().hasSystemFeature("android.hardware.wifi") && !com.liuzh.deviceinfo.utilities.d.f21252a) {
                arrayList.add(new u0("test_wifi", R.drawable.ic_wifi, u(R.string.wifi_test), sharedPreferences.getInt("test_wifi", 2)));
            }
            if (U().getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
                arrayList.add(new u0("test_bluetooth", R.drawable.ic_bluetooth, u(R.string.bluetooth_test), sharedPreferences.getInt("test_bluetooth", 2)));
            }
            if (!zK && U().getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                arrayList.add(new u0("test_fingerprint", R.drawable.ic_fingerprint, u(R.string.fingerprint_test), sharedPreferences.getInt("test_fingerprint", 2)));
            }
            if (!zK) {
                arrayList.add(new u0("test_volume_up", R.drawable.ic_volume_up, u(R.string.volumeup_test), sharedPreferences.getInt("test_volume_up", 2)));
                arrayList.add(new u0("test_volume_down", R.drawable.ic_volume_down, u(R.string.volumedown_test), sharedPreferences.getInt("test_volume_down", 2)));
            }
            ig.e eVar = new ig.e(this);
            this.f33786e0 = eVar;
            this.f33784c0.setAdapter(eVar);
            int i4 = Build.VERSION.SDK_INT;
            i.g gVarU = U();
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            s0 s0Var = new s0(0);
            b5.n0 n0Var = new b5.n0();
            if (executorServiceNewSingleThreadExecutor == null) {
                throw new IllegalArgumentException("Executor must not be null.");
            }
            b5.u0 u0VarS = gVarU.s();
            j1 j1VarE = gVarU.e();
            h1 h1VarB = gVarU.b();
            h5.c cVarC = gVarU.c();
            nk.k.e(h1VarB, "factory");
            a0.x0 x0Var = new a0.x0(j1VarE, h1VarB, cVarC);
            nk.e eVarA = nk.v.a(t.s.class);
            String strB = eVarA.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            t.s sVar = (t.s) x0Var.D(eVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            n0Var.f1843a = u0VarS;
            sVar.f33854b = executorServiceNewSingleThreadExecutor;
            sVar.f33855c = s0Var;
            this.Z = n0Var;
            String strU2 = u(R.string.fingerprint_test);
            String strU3 = u(R.string.place_your_finger);
            String strU4 = u(R.string.place_enrolled_finger);
            String strU5 = u(android.R.string.cancel);
            if (TextUtils.isEmpty(strU2)) {
                throw new IllegalArgumentException("Title must be set and non-empty.");
            }
            if (!com.bumptech.glide.e.G(0)) {
                StringBuilder sbW = je.u.w(i4, "Authenticator combination is unsupported on API ", ": ");
                sbW.append(String.valueOf(0));
                throw new IllegalArgumentException(sbW.toString());
            }
            if (TextUtils.isEmpty(strU5)) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            TextUtils.isEmpty(strU5);
            this.f33782a0 = new se.b(strU2, strU3, strU4, strU5);
        }
        h0();
        return this.f33784c0;
    }

    @Override // b5.z
    public final void H() {
        this.F = true;
        n.a aVar = this.f33788g0;
        if (aVar != null) {
            aVar.b();
            this.f33788g0 = null;
        }
        com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.unregisterOnSharedPreferenceChangeListener(this);
        ah.o.f400d.h(this);
    }

    @Override // b5.z
    public final void N() {
        this.F = true;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        if (com.liuzh.deviceinfo.utilities.f.g()) {
            i0();
        }
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        ph.d dVar = new ph.d(7, view);
        WeakHashMap weakHashMap = e4.v0.f22405a;
        e4.m0.j(view, dVar);
    }

    public final void h0() {
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        if (com.liuzh.deviceinfo.utilities.f.g()) {
            i0();
            return;
        }
        pi.a aVarC = ag.a.c(R.layout.ad_native_common);
        cg.a.f2848b.f(r5.c.g("action", "load"), "ad_tab_test");
        je.u.k(W(), new ej.f(2, (Object) this), aVarC);
    }

    @Override // ah.n
    public final void i(boolean z3) {
        if (z3) {
            i0();
        } else {
            h0();
        }
    }

    public final void i0() {
        ArrayList arrayList;
        if (c0()) {
            return;
        }
        int i4 = 0;
        while (true) {
            arrayList = this.f33783b0;
            if (i4 >= arrayList.size()) {
                i4 = -1;
                break;
            } else if (arrayList.get(i4) instanceof t0) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 != -1) {
            this.f33785d0 = null;
            arrayList.remove(i4);
            this.f33786e0.notifyItemRemoved(i4);
            n.a aVar = this.f33788g0;
            if (aVar != null) {
                aVar.b();
                this.f33788g0 = null;
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        int i4 = 0;
        int i10 = -1;
        while (true) {
            ArrayList arrayList = this.f33783b0;
            if (i4 >= arrayList.size()) {
                break;
            }
            u0 u0Var = (u0) arrayList.get(i4);
            if (str.equals(u0Var.f33763a)) {
                u0Var.f33766d = com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.getInt(u0Var.f33763a, 2);
                i10 = i4;
            }
            i4++;
        }
        ig.e eVar = this.f33786e0;
        if (eVar == null || i10 == -1) {
            return;
        }
        eVar.notifyItemChanged(i10);
    }
}
