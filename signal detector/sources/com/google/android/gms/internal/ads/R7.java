package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class R7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10845a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10846b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10847c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10848d;

    /* renamed from: e, reason: collision with root package name */
    public final L2.w f10849e;

    /* renamed from: f, reason: collision with root package name */
    public final W1 f10850f;

    /* renamed from: n, reason: collision with root package name */
    public int f10857n;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10851g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f10852h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f10853j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public int f10854k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f10855l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f10856m = 0;

    /* renamed from: o, reason: collision with root package name */
    public String f10858o = "";

    /* renamed from: p, reason: collision with root package name */
    public String f10859p = "";

    /* renamed from: q, reason: collision with root package name */
    public String f10860q = "";

    public R7(int i, int i3, int i6, int i7, int i8, int i9, int i10, boolean z6) {
        this.f10845a = i;
        this.f10846b = i3;
        this.f10847c = i6;
        this.f10848d = z6;
        this.f10849e = new L2.w(i7, 6);
        W1 w12 = new W1();
        w12.f12141a = i8;
        i9 = (i9 > 64 || i9 < 0) ? 64 : i9;
        if (i10 <= 0) {
            w12.f12142b = 1;
        } else {
            w12.f12142b = i10;
        }
        w12.f12143c = new C0865a8(i9);
        this.f10850f = w12;
    }

    public static final String f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            sb.append((String) arrayList.get(i));
            sb.append(' ');
            i++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final boolean a() {
        boolean z6;
        synchronized (this.f10851g) {
            z6 = this.f10856m == 0;
        }
        return z6;
    }

    public final void b(String str, boolean z6, float f2, float f5, float f6, float f7) {
        e(str, z6, f2, f5, f6, f7);
        synchronized (this.f10851g) {
            try {
                if (this.f10856m < 0) {
                    u2.k.c("ActivityContent: negative number of WebViews.");
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f10851g) {
            try {
                int i = this.f10854k;
                int i3 = this.f10855l;
                int i6 = this.f10846b;
                if (!this.f10848d) {
                    i6 = (i3 * i6) + (i * this.f10845a);
                }
                if (i6 > this.f10857n) {
                    this.f10857n = i6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f10851g) {
            try {
                int i = this.f10854k;
                int i3 = this.f10855l;
                int i6 = this.f10846b;
                if (!this.f10848d) {
                    i6 = (i3 * i6) + (i * this.f10845a);
                }
                if (i6 > this.f10857n) {
                    this.f10857n = i6;
                    p2.j jVar = p2.j.f22785C;
                    if (!jVar.f22795h.i().p()) {
                        L2.w wVar = this.f10849e;
                        this.f10858o = wVar.m(this.f10852h);
                        this.f10859p = wVar.m(this.i);
                    }
                    if (!jVar.f22795h.i().q()) {
                        this.f10860q = this.f10850f.b(this.i, this.f10853j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(String str, boolean z6, float f2, float f5, float f6, float f7) {
        if (str != null) {
            if (str.length() < this.f10847c) {
                return;
            }
            synchronized (this.f10851g) {
                try {
                    this.f10852h.add(str);
                    this.f10854k += str.length();
                    if (z6) {
                        this.i.add(str);
                        this.f10853j.add(new X7(f2, f5, f6, f7, r10.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof R7)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((R7) obj).f10858o;
        return str != null && str.equals(this.f10858o);
    }

    public final int hashCode() {
        return this.f10858o.hashCode();
    }

    public final String toString() {
        int i = this.f10855l;
        int i3 = this.f10857n;
        int i6 = this.f10854k;
        String strF = f(this.f10852h);
        String strF2 = f(this.i);
        String str = this.f10858o;
        String str2 = this.f10859p;
        String str3 = this.f10860q;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i3).length();
        int length3 = String.valueOf(i6).length();
        int length4 = String.valueOf(strF).length();
        int length5 = String.valueOf(strF2).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        AbstractC2763b.h(sb, "ActivityContent fetchId: ", i, " score:", i3);
        sb.append(" total_length:");
        sb.append(i6);
        sb.append("\n text: ");
        sb.append(strF);
        A.f.w(sb, "\n viewableText", strF2, "\n signture: ", str);
        return AbstractC1135f5.o(sb, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}
