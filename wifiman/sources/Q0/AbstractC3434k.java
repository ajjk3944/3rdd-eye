package Q0;

import T.z1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Q0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3434k {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19069b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final O f19070c = new C3431h();

    /* renamed from: d, reason: collision with root package name */
    private static final E f19071d = new E("sans-serif", "FontFamily.SansSerif");

    /* renamed from: e, reason: collision with root package name */
    private static final E f19072e = new E("serif", "FontFamily.Serif");

    /* renamed from: f, reason: collision with root package name */
    private static final E f19073f = new E("monospace", "FontFamily.Monospace");

    /* renamed from: g, reason: collision with root package name */
    private static final E f19074g = new E("cursive", "FontFamily.Cursive");

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19075a;

    /* renamed from: Q0.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final O a() {
            return AbstractC3434k.f19070c;
        }

        private a() {
        }
    }

    /* renamed from: Q0.k$b */
    public interface b {
        static /* synthetic */ z1 b(b bVar, AbstractC3434k abstractC3434k, A a10, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i12 & 1) != 0) {
                abstractC3434k = null;
            }
            if ((i12 & 2) != 0) {
                a10 = A.f18971b.e();
            }
            if ((i12 & 4) != 0) {
                i10 = v.f19100b.b();
            }
            if ((i12 & 8) != 0) {
                i11 = w.f19104b.a();
            }
            return bVar.a(abstractC3434k, a10, i10, i11);
        }

        z1 a(AbstractC3434k abstractC3434k, A a10, int i10, int i11);
    }

    public /* synthetic */ AbstractC3434k(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    private AbstractC3434k(boolean z10) {
        this.f19075a = z10;
    }
}
