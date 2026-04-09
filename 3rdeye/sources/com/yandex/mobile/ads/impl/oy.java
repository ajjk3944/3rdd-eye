package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class oy {

    /* renamed from: a, reason: collision with root package name */
    public final String f31522a;

    /* renamed from: b, reason: collision with root package name */
    public final dc0 f31523b;

    /* renamed from: c, reason: collision with root package name */
    public final dc0 f31524c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31525d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31526e;

    public oy(String str, dc0 dc0Var, dc0 dc0Var2, int i, int i10) {
        zf.a(i == 0 || i10 == 0);
        this.f31522a = zf.a(str);
        this.f31523b = (dc0) zf.a(dc0Var);
        this.f31524c = (dc0) zf.a(dc0Var2);
        this.f31525d = i;
        this.f31526e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oy.class == obj.getClass()) {
            oy oyVar = (oy) obj;
            if (this.f31525d == oyVar.f31525d && this.f31526e == oyVar.f31526e && this.f31522a.equals(oyVar.f31522a) && this.f31523b.equals(oyVar.f31523b) && this.f31524c.equals(oyVar.f31524c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31524c.hashCode() + ((this.f31523b.hashCode() + C4121h3.a(this.f31522a, (((this.f31525d + 527) * 31) + this.f31526e) * 31, 31)) * 31);
    }
}
