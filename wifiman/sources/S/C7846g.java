package s;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6713l0;

/* renamed from: s.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7846g {

    /* renamed from: a, reason: collision with root package name */
    private final float f60766a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6713l0 f60767b;

    public /* synthetic */ C7846g(float f10, AbstractC6713l0 abstractC6713l0, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, abstractC6713l0);
    }

    public final AbstractC6713l0 a() {
        return this.f60767b;
    }

    public final float b() {
        return this.f60766a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7846g)) {
            return false;
        }
        C7846g c7846g = (C7846g) obj;
        return Y0.h.n(this.f60766a, c7846g.f60766a) && AbstractC6492s.d(this.f60767b, c7846g.f60767b);
    }

    public int hashCode() {
        return (Y0.h.p(this.f60766a) * 31) + this.f60767b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) Y0.h.r(this.f60766a)) + ", brush=" + this.f60767b + ')';
    }

    private C7846g(float f10, AbstractC6713l0 abstractC6713l0) {
        this.f60766a = f10;
        this.f60767b = abstractC6713l0;
    }
}
