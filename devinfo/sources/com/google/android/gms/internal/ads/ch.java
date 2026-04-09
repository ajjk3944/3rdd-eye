package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ch {

    /* renamed from: a, reason: collision with root package name */
    public final int f10118a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10119b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10120c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10121d;

    /* renamed from: e, reason: collision with root package name */
    public final t7.m f10122e;

    /* renamed from: f, reason: collision with root package name */
    public final w4 f10123f;

    /* renamed from: n, reason: collision with root package name */
    public int f10129n;
    public final Object g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f10124h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f10125i = new ArrayList();
    public final ArrayList j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public int f10126k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f10127l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f10128m = 0;

    /* renamed from: o, reason: collision with root package name */
    public String f10130o = "";

    /* renamed from: p, reason: collision with root package name */
    public String f10131p = "";

    /* renamed from: q, reason: collision with root package name */
    public String f10132q = "";

    public ch(int i4, int i10, int i11, int i12, int i13, int i14, int i15, boolean z3) {
        this.f10118a = i4;
        this.f10119b = i10;
        this.f10120c = i11;
        this.f10121d = z3;
        this.f10122e = new t7.m(i12, 6);
        w4 w4Var = new w4();
        w4Var.f17860a = i13;
        i14 = (i14 > 64 || i14 < 0) ? 64 : i14;
        if (i15 <= 0) {
            w4Var.f17861b = 1;
        } else {
            w4Var.f17861b = i15;
        }
        w4Var.f17862c = new lh(i14);
        this.f10123f = w4Var;
    }

    public static final String f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            sb2.append((String) arrayList.get(i4));
            sb2.append(' ');
            i4++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String string = sb2.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final boolean a() {
        boolean z3;
        synchronized (this.g) {
            z3 = this.f10128m == 0;
        }
        return z3;
    }

    public final void b(String str, boolean z3, float f10, float f11, float f12, float f13) {
        e(str, z3, f10, f11, f12, f13);
        synchronized (this.g) {
            try {
                if (this.f10128m < 0) {
                    za.i.c("ActivityContent: negative number of WebViews.");
                }
                d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.g) {
            try {
                int i4 = this.f10126k;
                int i10 = this.f10127l;
                int i11 = this.f10119b;
                if (!this.f10121d) {
                    i11 = (i10 * i11) + (i4 * this.f10118a);
                }
                if (i11 > this.f10129n) {
                    this.f10129n = i11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        synchronized (this.g) {
            try {
                int i4 = this.f10126k;
                int i10 = this.f10127l;
                int i11 = this.f10119b;
                if (!this.f10121d) {
                    i11 = (i10 * i11) + (i4 * this.f10118a);
                }
                if (i11 > this.f10129n) {
                    this.f10129n = i11;
                    ua.j jVar = ua.j.C;
                    if (!jVar.f35265h.i().p()) {
                        t7.m mVar = this.f10122e;
                        this.f10130o = mVar.D(this.f10124h);
                        this.f10131p = mVar.D(this.f10125i);
                    }
                    if (!jVar.f35265h.i().q()) {
                        this.f10132q = this.f10123f.c(this.f10125i, this.j);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(String str, boolean z3, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() < this.f10120c) {
                return;
            }
            synchronized (this.g) {
                try {
                    this.f10124h.add(str);
                    this.f10126k += str.length();
                    if (z3) {
                        this.f10125i.add(str);
                        this.j.add(new ih(f10, f11, f12, f13, r10.size() - 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ch)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((ch) obj).f10130o;
        return str != null && str.equals(this.f10130o);
    }

    public final int hashCode() {
        return this.f10130o.hashCode();
    }

    public final String toString() {
        int i4 = this.f10127l;
        int i10 = this.f10129n;
        int i11 = this.f10126k;
        String strF = f(this.f10124h);
        String strF2 = f(this.f10125i);
        String str = this.f10130o;
        String str2 = this.f10131p;
        String str3 = this.f10132q;
        int length = String.valueOf(i4).length();
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(i11).length();
        int length4 = String.valueOf(strF).length();
        int length5 = String.valueOf(strF2).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        r5.c.q(i4, i10, "ActivityContent fetchId: ", " score:", sb2);
        sb2.append(" total_length:");
        sb2.append(i11);
        sb2.append("\n text: ");
        sb2.append(strF);
        je.u.B(sb2, "\n viewableText", strF2, "\n signture: ", str);
        return a0.g.p(sb2, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}
