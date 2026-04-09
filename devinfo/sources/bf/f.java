package bf;

import a0.r;
import a0.v0;
import androidx.lifecycle.f1;
import com.google.android.gms.internal.measurement.a9;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.q7;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import d8.b0;
import d8.c0;
import d8.l;
import d8.w;
import ec.d0;
import ec.v;
import java.io.InputStream;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements v0, de.d, cb.d, w, ec.f, v {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f f2162b = new f(6);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f f2163c = new f(13);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f f2164d = new f(14);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f f2165e = new f(15);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f f2166f = new f(16);
    public static final /* synthetic */ f g = new f(17);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f f2167h = new f(18);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ f f2168i = new f(19);
    public static final /* synthetic */ f j = new f(20);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ f f2169k = new f(21);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ f f2170l = new f(22);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f f2171m = new f(23);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ f f2172n = new f(24);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ f f2173o = new f(25);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ f f2174p = new f(26);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ f f2175q = new f(27);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ f f2176r = new f(28);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ f f2177s = new f(29);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2178a;

    public /* synthetic */ f(int i4) {
        this.f2178a = i4;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    @Override // ec.v
    public Object b() {
        switch (this.f2178a) {
            case 14:
                return new Boolean(((Boolean) q7.f19886a.b()).booleanValue());
            case 15:
                List list = d0.f22616a;
                c7.f19649b.get();
                Long l10 = (Long) e7.f19679b.b();
                l10.getClass();
                return l10;
            case 16:
                List list2 = d0.f22616a;
                Boolean bool = (Boolean) a9.f19613a.b();
                bool.getClass();
                return bool;
            case 17:
                List list3 = d0.f22616a;
                Boolean bool2 = (Boolean) b7.f19631a.b();
                bool2.getClass();
                return bool2;
            case 18:
                List list4 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19696k0.b()).longValue());
            case 19:
                List list5 = d0.f22616a;
                c7.f19649b.get();
                return (String) e7.f19716u0.b();
            case 20:
                List list6 = d0.f22616a;
                c7.f19649b.get();
                return (String) e7.N.b();
            case 21:
                List list7 = d0.f22616a;
                c7.f19649b.get();
                Long l11 = (Long) e7.U.b();
                l11.getClass();
                return l11;
            case 22:
                List list8 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.K.b()).longValue());
            case 23:
                List list9 = d0.f22616a;
                c7.f19649b.get();
                Long l12 = (Long) e7.S.b();
                l12.getClass();
                return l12;
            case 24:
                List list10 = d0.f22616a;
                c7.f19649b.get();
                Long l13 = (Long) e7.I.b();
                l13.getClass();
                return l13;
            case 25:
                List list11 = d0.f22616a;
                c7.f19649b.get();
                Long l14 = (Long) e7.f19718v0.b();
                l14.getClass();
                return l14;
            case 26:
                List list12 = d0.f22616a;
                c7.f19649b.get();
                Long l15 = (Long) e7.f19692i.b();
                l15.getClass();
                return l15;
            case 27:
                List list13 = d0.f22616a;
                c7.f19649b.get();
                Long l16 = (Long) e7.V.b();
                l16.getClass();
                return l16;
            case 28:
                List list14 = d0.f22616a;
                c7.f19649b.get();
                return (String) e7.f19690h.b();
            default:
                List list15 = d0.f22616a;
                c7.f19649b.get();
                Long l17 = (Long) e7.f19706p0.b();
                l17.getClass();
                return l17;
        }
    }

    @Override // de.d
    public /* synthetic */ Object c(f1 f1Var) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(f1Var);
    }

    @Override // ec.f
    public /* synthetic */ String e(String str, String str2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.gson.internal.n f(xf.a r9, boolean r10) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.f.f(xf.a, boolean):com.google.gson.internal.n");
    }

    @Override // a0.v0
    public long g(r rVar, r rVar2, r rVar3) {
        return 0 * 1000000;
    }

    @Override // d8.w
    public d8.v i(b0 b0Var) {
        return new c0(b0Var.b(l.class, InputStream.class), 1);
    }

    @Override // a0.v0
    public r r(long j8, r rVar, r rVar2, r rVar3) {
        return j8 < ((long) 0) * 1000000 ? rVar : rVar2;
    }

    public String toString() {
        switch (this.f2178a) {
            case 10:
                return Collections.EMPTY_MAP.toString();
            default:
                return super.toString();
        }
    }

    @Override // a0.v0
    public /* synthetic */ void d() {
    }

    @Override // a0.v0
    public r q(r rVar, r rVar2, r rVar3) {
        return rVar3;
    }

    @Override // a0.v0
    public r j(long j8, r rVar, r rVar2, r rVar3) {
        return rVar3;
    }
}
