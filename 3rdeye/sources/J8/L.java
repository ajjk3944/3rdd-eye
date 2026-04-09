package J8;

import A9.C0575f;
import F9.C0663f;
import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import g0.C4356c;
import java.util.LinkedHashSet;

/* compiled from: ShakeDetector.kt */
/* loaded from: classes3.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public float f2831a;

    /* renamed from: b, reason: collision with root package name */
    public float f2832b;

    /* renamed from: c, reason: collision with root package name */
    public float f2833c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f2834d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final D9.J f2835e;

    /* renamed from: f, reason: collision with root package name */
    public final D9.J f2836f;

    /* renamed from: g, reason: collision with root package name */
    public final M f2837g;

    /* compiled from: ShakeDetector.kt */
    public interface a {
        void a();
    }

    public L(Application application, C0663f c0663f) {
        Boolean bool = Boolean.FALSE;
        this.f2835e = D9.E.c(bool);
        this.f2836f = D9.E.c(bool);
        this.f2837g = new M(this);
        Object systemService = application.getSystemService("sensor");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f2832b = 9.80665f;
        this.f2833c = 9.80665f;
        androidx.lifecycle.J.f16049j.f16055g.addObserver(new J(this));
        C0575f.e(c0663f, null, null, new K(this, sensorManager, defaultSensor, null), 3);
    }

    public final void a(a aVar) {
        LinkedHashSet linkedHashSet = this.f2834d;
        linkedHashSet.add(aVar);
        Boolean boolValueOf = Boolean.valueOf(!linkedHashSet.isEmpty());
        D9.J j4 = this.f2836f;
        j4.getClass();
        j4.g(null, boolValueOf);
        va.a.f47104a.a(C4356c.h(linkedHashSet.size(), "Add listener. Count - "), new Object[0]);
    }
}
