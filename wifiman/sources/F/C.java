package F;

import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: g, reason: collision with root package name */
    public static final a f4816g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final C f4817h = new C(null, null, null, null, null, null, 63, null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f4818a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f4819b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6835l f4820c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6835l f4821d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6835l f4822e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6835l f4823f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a() {
            return C.f4817h;
        }

        private a() {
        }
    }

    public C(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, InterfaceC6835l interfaceC6835l4, InterfaceC6835l interfaceC6835l5, InterfaceC6835l interfaceC6835l6) {
        this.f4818a = interfaceC6835l;
        this.f4819b = interfaceC6835l2;
        this.f4820c = interfaceC6835l3;
        this.f4821d = interfaceC6835l4;
        this.f4822e = interfaceC6835l5;
        this.f4823f = interfaceC6835l6;
    }

    public final InterfaceC6835l b() {
        return this.f4818a;
    }

    public final InterfaceC6835l c() {
        return this.f4819b;
    }

    public final InterfaceC6835l d() {
        return this.f4820c;
    }

    public final InterfaceC6835l e() {
        return this.f4821d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f4818a == c10.f4818a && this.f4819b == c10.f4819b && this.f4820c == c10.f4820c && this.f4821d == c10.f4821d && this.f4822e == c10.f4822e && this.f4823f == c10.f4823f;
    }

    public final InterfaceC6835l f() {
        return this.f4822e;
    }

    public final InterfaceC6835l g() {
        return this.f4823f;
    }

    public int hashCode() {
        InterfaceC6835l interfaceC6835l = this.f4818a;
        int iHashCode = (interfaceC6835l != null ? interfaceC6835l.hashCode() : 0) * 31;
        InterfaceC6835l interfaceC6835l2 = this.f4819b;
        int iHashCode2 = (iHashCode + (interfaceC6835l2 != null ? interfaceC6835l2.hashCode() : 0)) * 31;
        InterfaceC6835l interfaceC6835l3 = this.f4820c;
        int iHashCode3 = (iHashCode2 + (interfaceC6835l3 != null ? interfaceC6835l3.hashCode() : 0)) * 31;
        InterfaceC6835l interfaceC6835l4 = this.f4821d;
        int iHashCode4 = (iHashCode3 + (interfaceC6835l4 != null ? interfaceC6835l4.hashCode() : 0)) * 31;
        InterfaceC6835l interfaceC6835l5 = this.f4822e;
        int iHashCode5 = (iHashCode4 + (interfaceC6835l5 != null ? interfaceC6835l5.hashCode() : 0)) * 31;
        InterfaceC6835l interfaceC6835l6 = this.f4823f;
        return iHashCode5 + (interfaceC6835l6 != null ? interfaceC6835l6.hashCode() : 0);
    }

    public /* synthetic */ C(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, InterfaceC6835l interfaceC6835l4, InterfaceC6835l interfaceC6835l5, InterfaceC6835l interfaceC6835l6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : interfaceC6835l, (i10 & 2) != 0 ? null : interfaceC6835l2, (i10 & 4) != 0 ? null : interfaceC6835l3, (i10 & 8) != 0 ? null : interfaceC6835l4, (i10 & 16) != 0 ? null : interfaceC6835l5, (i10 & 32) != 0 ? null : interfaceC6835l6);
    }
}
