package He;

import He.p;
import T.InterfaceC3551q0;
import c0.AbstractC4183l;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final a f7870b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3551q0 f7871a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3551q0 d(InterfaceC4184m Saver, p it) {
            AbstractC6492s.i(Saver, "$this$Saver");
            AbstractC6492s.i(it, "it");
            return it.f7871a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p e(InterfaceC3551q0 it) {
            AbstractC6492s.i(it, "it");
            return new p(it);
        }

        public final InterfaceC4182k c() {
            return AbstractC4183l.a(new InterfaceC6839p() { // from class: He.n
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return p.a.d((InterfaceC4184m) obj, (p) obj2);
                }
            }, new InterfaceC6835l() { // from class: He.o
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return p.a.e((InterfaceC3551q0) obj);
                }
            });
        }

        private a() {
        }
    }

    public p(InterfaceC3551q0 isVisible) {
        AbstractC6492s.i(isVisible, "isVisible");
        this.f7871a = isVisible;
    }

    public final void b() {
        this.f7871a.setValue(q.HIDDEN);
    }

    public final boolean c() {
        return this.f7871a.getValue() == q.VISIBLE;
    }

    public final void d() {
        this.f7871a.setValue(q.VISIBLE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && AbstractC6492s.d(this.f7871a, ((p) obj).f7871a);
    }

    public int hashCode() {
        return this.f7871a.hashCode();
    }

    public String toString() {
        return "State(isVisible=" + this.f7871a + ")";
    }
}
