package hf;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6713l0;
import m0.C6733v0;

/* renamed from: hf.K, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6028K {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6713l0 f48639a;

    /* renamed from: b, reason: collision with root package name */
    private final long f48640b;

    public /* synthetic */ C6028K(AbstractC6713l0 abstractC6713l0, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6713l0, j10);
    }

    public final long a() {
        return this.f48640b;
    }

    public final AbstractC6713l0 b() {
        return this.f48639a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6028K)) {
            return false;
        }
        C6028K c6028k = (C6028K) obj;
        return AbstractC6492s.d(this.f48639a, c6028k.f48639a) && C6733v0.m(this.f48640b, c6028k.f48640b);
    }

    public int hashCode() {
        return (this.f48639a.hashCode() * 31) + C6733v0.s(this.f48640b);
    }

    public String toString() {
        return "UiProgressIndicatorColors(color=" + this.f48639a + ", backgroundColor=" + C6733v0.t(this.f48640b) + ")";
    }

    private C6028K(AbstractC6713l0 color, long j10) {
        AbstractC6492s.i(color, "color");
        this.f48639a = color;
        this.f48640b = j10;
    }
}
