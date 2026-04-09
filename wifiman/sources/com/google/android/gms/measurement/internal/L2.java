package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class L2 extends AbstractC4830d4 {

    /* renamed from: c, reason: collision with root package name */
    private char f35978c;

    /* renamed from: d, reason: collision with root package name */
    private long f35979d;

    /* renamed from: e, reason: collision with root package name */
    private String f35980e;

    /* renamed from: f, reason: collision with root package name */
    private final N2 f35981f;

    /* renamed from: g, reason: collision with root package name */
    private final N2 f35982g;

    /* renamed from: h, reason: collision with root package name */
    private final N2 f35983h;

    /* renamed from: i, reason: collision with root package name */
    private final N2 f35984i;

    /* renamed from: j, reason: collision with root package name */
    private final N2 f35985j;

    /* renamed from: k, reason: collision with root package name */
    private final N2 f35986k;

    /* renamed from: l, reason: collision with root package name */
    private final N2 f35987l;

    /* renamed from: m, reason: collision with root package name */
    private final N2 f35988m;

    /* renamed from: n, reason: collision with root package name */
    private final N2 f35989n;

    L2(C4976v3 c4976v3) {
        super(c4976v3);
        this.f35978c = (char) 0;
        this.f35979d = -1L;
        this.f35981f = new N2(this, 6, false, false);
        this.f35982g = new N2(this, 6, true, false);
        this.f35983h = new N2(this, 6, false, true);
        this.f35984i = new N2(this, 5, false, false);
        this.f35985j = new N2(this, 5, true, false);
        this.f35986k = new N2(this, 5, false, true);
        this.f35987l = new N2(this, 4, false, false);
        this.f35988m = new N2(this, 3, false, false);
        this.f35989n = new N2(this, 2, false, false);
    }

    private static String A(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    private final String L() {
        String str;
        synchronized (this) {
            try {
                if (this.f35980e == null) {
                    this.f35980e = this.f36331a.N() != null ? this.f36331a.N() : "FA";
                }
                AbstractC7901p.l(this.f35980e);
                str = this.f35980e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    protected static Object r(String str) {
        if (str == null) {
            return null;
        }
        return new M2(str);
    }

    private static String s(boolean z10, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof M2 ? ((M2) obj).f35999a : z10 ? "-" : String.valueOf(obj);
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String strA = A(C4976v3.class.getCanonicalName());
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && A(className).equals(strA)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i10++;
        }
        return sb2.toString();
    }

    static String t(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strS = s(z10, obj);
        String strS2 = s(z10, obj2);
        String strS3 = s(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strS)) {
            sb2.append(str2);
            sb2.append(strS);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strS2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strS2);
        }
        if (!TextUtils.isEmpty(strS3)) {
            sb2.append(str3);
            sb2.append(strS3);
        }
        return sb2.toString();
    }

    public final N2 B() {
        return this.f35988m;
    }

    public final N2 C() {
        return this.f35981f;
    }

    public final N2 D() {
        return this.f35983h;
    }

    public final N2 E() {
        return this.f35982g;
    }

    public final N2 F() {
        return this.f35987l;
    }

    public final N2 G() {
        return this.f35989n;
    }

    public final N2 H() {
        return this.f35984i;
    }

    public final N2 I() {
        return this.f35986k;
    }

    public final N2 J() {
        return this.f35985j;
    }

    public final String K() {
        Pair pairA;
        if (e().f36266f == null || (pairA = e().f36266f.a()) == null || pairA == X2.f36261B) {
            return null;
        }
        return String.valueOf(pairA.second) + ":" + ((String) pairA.first);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4893l a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ F b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ D2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ X2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4915n5 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ x7 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4830d4
    protected final boolean p() {
        return false;
    }

    protected final void u(int i10, String str) {
        Log.println(i10, L(), str);
    }

    protected final void v(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && y(i10)) {
            u(i10, t(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        AbstractC7901p.l(str);
        C4952s3 c4952s3D = this.f36331a.D();
        if (c4952s3D == null) {
            u(6, "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!c4952s3D.o()) {
            u(6, "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 >= 9) {
            i10 = 8;
        }
        c4952s3D.z(new K2(this, i10, str, obj, obj2, obj3));
    }

    protected final boolean y(int i10) {
        return Log.isLoggable(L(), i10);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.d zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4834e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ L2 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4952s3 zzl() {
        return super.zzl();
    }
}
