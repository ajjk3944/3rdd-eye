package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: AdaptedFunctionReference.java */
/* renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5261a implements i, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f43641b = c.NO_RECEIVER;

    /* renamed from: c, reason: collision with root package name */
    public final Class f43642c = e7.o.class;

    /* renamed from: d, reason: collision with root package name */
    public final String f43643d = "<init>";

    /* renamed from: e, reason: collision with root package name */
    public final String f43644e = "<init>(Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;)V";

    /* renamed from: f, reason: collision with root package name */
    public final boolean f43645f = false;

    /* renamed from: g, reason: collision with root package name */
    public final int f43646g = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5261a)) {
            return false;
        }
        C5261a c5261a = (C5261a) obj;
        return this.f43645f == c5261a.f43645f && this.f43646g == c5261a.f43646g && l.b(this.f43641b, c5261a.f43641b) && l.b(this.f43642c, c5261a.f43642c) && this.f43643d.equals(c5261a.f43643d) && this.f43644e.equals(c5261a.f43644e);
    }

    @Override // kotlin.jvm.internal.i
    public final int getArity() {
        return 0;
    }

    public final int hashCode() {
        Object obj = this.f43641b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f43642c;
        return ((B4.g.n(B4.g.n((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.f43643d), 31, this.f43644e) + (this.f43645f ? 1231 : 1237)) * 961) + this.f43646g;
    }

    public final String toString() {
        x.f43661a.getClass();
        return y.a(this);
    }
}
