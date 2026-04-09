package br;

import java.io.Serializable;

/* loaded from: classes.dex */
public class a implements i, Serializable {
    public final int B;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2891a;

    /* renamed from: d, reason: collision with root package name */
    public final Class f2892d;

    /* renamed from: g, reason: collision with root package name */
    public final String f2893g;

    /* renamed from: r, reason: collision with root package name */
    public final String f2894r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2895x = false;

    /* renamed from: y, reason: collision with root package name */
    public final int f2896y;

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f2891a = obj;
        this.f2892d = cls;
        this.f2893g = str;
        this.f2894r = str2;
        this.f2896y = i10;
        this.B = i11 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2895x == aVar.f2895x && this.f2896y == aVar.f2896y && this.B == aVar.B && l.a(this.f2891a, aVar.f2891a) && this.f2892d.equals(aVar.f2892d) && this.f2893g.equals(aVar.f2893g) && this.f2894r.equals(aVar.f2894r);
    }

    @Override // br.i
    public final int f() {
        return this.f2896y;
    }

    public final int hashCode() {
        Object obj = this.f2891a;
        return ((((c7.a.g(this.f2894r, c7.a.g(this.f2893g, (this.f2892d.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31), 31) + (this.f2895x ? 1231 : 1237)) * 31) + this.f2896y) * 31) + this.B;
    }

    public final String toString() {
        return x.f2918a.h(this);
    }
}
