package nk;

import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class a implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f29964a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f29965b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29966c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29967d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29968e = false;

    /* renamed from: f, reason: collision with root package name */
    public final int f29969f;
    public final int g;

    public a(int i4, int i10, Class cls, Object obj, String str, String str2) {
        this.f29964a = obj;
        this.f29965b = cls;
        this.f29966c = str;
        this.f29967d = str2;
        this.f29969f = i4;
        this.g = i10 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f29968e == aVar.f29968e && this.f29969f == aVar.f29969f && this.g == aVar.g && k.a(this.f29964a, aVar.f29964a) && this.f29965b.equals(aVar.f29965b) && this.f29966c.equals(aVar.f29966c) && this.f29967d.equals(aVar.f29967d);
    }

    @Override // nk.h
    public final int getArity() {
        return this.f29969f;
    }

    public final int hashCode() {
        Object obj = this.f29964a;
        return ((((je.u.m(je.u.m((this.f29965b.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.f29966c), 31, this.f29967d) + (this.f29968e ? 1231 : 1237)) * 31) + this.f29969f) * 31) + this.g;
    }

    public final String toString() {
        v.f29987a.getClass();
        return w.a(this);
    }
}
