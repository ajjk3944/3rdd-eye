package v;

import T.InterfaceC3551q0;
import T.t1;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6531g;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3551q0 f63313a;

    public static abstract class a {

        /* renamed from: v.i$a$a, reason: collision with other inner class name */
        public static final class C2243a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2243a f63314a = new C2243a();

            private C2243a() {
                super(null);
            }

            public String toString() {
                return "Closed";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final long f63315a;

            public /* synthetic */ b(long j10, DefaultConstructorMarker defaultConstructorMarker) {
                this(j10);
            }

            public final long a() {
                return this.f63315a;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof b) {
                    return C6531g.j(this.f63315a, ((b) obj).f63315a);
                }
                return false;
            }

            public int hashCode() {
                return C6531g.o(this.f63315a);
            }

            public String toString() {
                return "Open(offset=" + ((Object) C6531g.t(this.f63315a)) + ')';
            }

            private b(long j10) {
                super(null);
                this.f63315a = j10;
                if (!AbstractC6532h.c(j10)) {
                    throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(a aVar) {
        this.f63313a = t1.d(aVar, null, 2, null);
    }

    public final a a() {
        return (a) this.f63313a.getValue();
    }

    public final void b(a aVar) {
        this.f63313a.setValue(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return AbstractC6492s.d(((i) obj).a(), a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "ContextMenuState(status=" + a() + ')';
    }

    public /* synthetic */ i(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.C2243a.f63314a : aVar);
    }
}
