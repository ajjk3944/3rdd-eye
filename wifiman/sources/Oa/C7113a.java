package oa;

import Y0.h;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: oa.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7113a {

    /* renamed from: a, reason: collision with root package name */
    private final C2009a f55600a;

    /* renamed from: b, reason: collision with root package name */
    private final E.a f55601b;

    /* renamed from: oa.a$a, reason: collision with other inner class name */
    public static final class C2009a {

        /* renamed from: a, reason: collision with root package name */
        private final float f55602a;

        public /* synthetic */ C2009a(float f10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10);
        }

        public final float a() {
            return this.f55602a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2009a) && h.n(this.f55602a, ((C2009a) obj).f55602a);
        }

        public int hashCode() {
            return h.p(this.f55602a);
        }

        public String toString() {
            return "CornerRadius(card=" + h.r(this.f55602a) + ")";
        }

        private C2009a(float f10) {
            this.f55602a = f10;
        }

        public /* synthetic */ C2009a(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? h.j(10) : f10, null);
        }
    }

    public C7113a(C2009a corner, E.a card) {
        AbstractC6492s.i(corner, "corner");
        AbstractC6492s.i(card, "card");
        this.f55600a = corner;
        this.f55601b = card;
    }

    public final E.a a() {
        return this.f55601b;
    }

    public final C2009a b() {
        return this.f55600a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C7113a(C2009a c2009a, E.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        c2009a = (i10 & 1) != 0 ? new C2009a(0.0f, 1, null) : c2009a;
        this(c2009a, (i10 & 2) != 0 ? E.h.d(c2009a.a()) : aVar);
    }
}
