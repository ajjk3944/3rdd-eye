package g0;

import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6533i;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final a f47372e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f47373f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static int f47374g;

    /* renamed from: a, reason: collision with root package name */
    private final List f47375a;

    /* renamed from: b, reason: collision with root package name */
    private C6533i f47376b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6835l f47377c;

    /* renamed from: d, reason: collision with root package name */
    private final int f47378d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b() {
            int i10;
            synchronized (this) {
                h.f47374g++;
                i10 = h.f47374g;
            }
            return i10;
        }

        private a() {
        }
    }

    public h(List list, C6533i c6533i, InterfaceC6835l interfaceC6835l) {
        this.f47375a = list;
        this.f47376b = c6533i;
        this.f47377c = interfaceC6835l;
        this.f47378d = f47372e.b();
    }

    public final List c() {
        return this.f47375a;
    }

    public final C6533i d() {
        return this.f47376b;
    }

    public final int e() {
        return this.f47378d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC6492s.d(this.f47375a, hVar.f47375a) && AbstractC6492s.d(this.f47376b, hVar.f47376b) && this.f47377c == hVar.f47377c;
    }

    public final InterfaceC6835l f() {
        return this.f47377c;
    }

    public final void g(C6533i c6533i) {
        this.f47376b = c6533i;
    }

    public int hashCode() {
        int iHashCode = this.f47375a.hashCode() * 31;
        C6533i c6533i = this.f47376b;
        int iHashCode2 = (iHashCode + (c6533i != null ? c6533i.hashCode() : 0)) * 31;
        InterfaceC6835l interfaceC6835l = this.f47377c;
        return iHashCode2 + (interfaceC6835l != null ? interfaceC6835l.hashCode() : 0);
    }

    public /* synthetic */ h(List list, C6533i c6533i, InterfaceC6835l interfaceC6835l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC3689v.l() : list, (i10 & 2) != 0 ? null : c6533i, interfaceC6835l);
    }
}
