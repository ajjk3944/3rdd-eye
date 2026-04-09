package D9;

import D9.o;
import T.InterfaceC3551q0;
import T.t1;
import c0.AbstractC4183l;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6533i;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3172c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3551q0 f3173a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f3174b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3551q0 d(InterfaceC4184m Saver, o it) {
            AbstractC6492s.i(Saver, "$this$Saver");
            AbstractC6492s.i(it, "it");
            return it.f3173a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o e(InterfaceC3551q0 it) {
            AbstractC6492s.i(it, "it");
            return new o(it);
        }

        public final InterfaceC4182k c() {
            return AbstractC4183l.a(new InterfaceC6839p() { // from class: D9.m
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return o.a.d((InterfaceC4184m) obj, (o) obj2);
                }
            }, new InterfaceC6835l() { // from class: D9.n
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return o.a.e((InterfaceC3551q0) obj);
                }
            });
        }

        private a() {
        }
    }

    public o(InterfaceC3551q0 isVisible) {
        AbstractC6492s.i(isVisible, "isVisible");
        this.f3173a = isVisible;
        this.f3174b = t1.d(new C6533i(0.0f, 0.0f, 0.0f, 0.0f), null, 2, null);
    }

    public final C6533i b() {
        return (C6533i) this.f3174b.getValue();
    }

    public final void c() {
        this.f3173a.setValue(p.HIDDEN);
    }

    public final boolean d() {
        return this.f3173a.getValue() == p.VISIBLE;
    }

    public final void e(C6533i rect) {
        AbstractC6492s.i(rect, "rect");
        this.f3174b.setValue(C6533i.d(rect, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && AbstractC6492s.d(this.f3173a, ((o) obj).f3173a);
    }

    public final void f() {
        this.f3173a.setValue(p.VISIBLE);
    }

    public int hashCode() {
        return this.f3173a.hashCode();
    }

    public String toString() {
        return "State(isVisible=" + this.f3173a + ")";
    }
}
