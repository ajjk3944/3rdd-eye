package W0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m0.e1;
import m0.j1;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23545a = a.f23546a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f23546a = new a();

        private a() {
        }

        public final n a(AbstractC6713l0 abstractC6713l0, float f10) {
            if (abstractC6713l0 == null) {
                return b.f23547b;
            }
            if (abstractC6713l0 instanceof j1) {
                return b(m.c(((j1) abstractC6713l0).b(), f10));
            }
            if (abstractC6713l0 instanceof e1) {
                return new W0.c((e1) abstractC6713l0, f10);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final n b(long j10) {
            return j10 != 16 ? new W0.d(j10, null) : b.f23547b;
        }
    }

    public static final class b implements n {

        /* renamed from: b, reason: collision with root package name */
        public static final b f23547b = new b();

        private b() {
        }

        @Override // W0.n
        public float b() {
            return Float.NaN;
        }

        @Override // W0.n
        public long c() {
            return C6733v0.f52951b.e();
        }

        @Override // W0.n
        public AbstractC6713l0 e() {
            return null;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {
        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(n.this.b());
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {
        d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            return n.this;
        }
    }

    float b();

    long c();

    default n d(n nVar) {
        boolean z10 = nVar instanceof W0.c;
        return (z10 && (this instanceof W0.c)) ? new W0.c(((W0.c) nVar).a(), m.d(nVar.b(), new c())) : (!z10 || (this instanceof W0.c)) ? (z10 || !(this instanceof W0.c)) ? nVar.f(new d()) : this : nVar;
    }

    AbstractC6713l0 e();

    default n f(InterfaceC6824a interfaceC6824a) {
        return !AbstractC6492s.d(this, b.f23547b) ? this : (n) interfaceC6824a.invoke();
    }
}
