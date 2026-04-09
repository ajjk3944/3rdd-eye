package p6;

import com.patrykandpatrick.vico.core.throwable.IllegalPercentageException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7230a {

    /* renamed from: b, reason: collision with root package name */
    public static final C2030a f57684b = new C2030a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7230a f57685c = new b(100, C7234e.f57693a);

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC7230a f57686d = new b(0, C7235f.f57696a);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7232c f57687a;

    /* renamed from: p6.a$a, reason: collision with other inner class name */
    public static final class C2030a {
        public /* synthetic */ C2030a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2030a() {
        }
    }

    /* renamed from: p6.a$b */
    public static final class b extends AbstractC7230a {

        /* renamed from: e, reason: collision with root package name */
        private final int f57688e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, InterfaceC7232c cornerTreatment) {
            super(cornerTreatment, null);
            AbstractC6492s.i(cornerTreatment, "cornerTreatment");
            this.f57688e = i10;
            if (i10 < 0 || i10 >= 101) {
                throw new IllegalPercentageException(i10);
            }
        }

        @Override // p6.AbstractC7230a
        public float a(float f10, float f11) {
            return (f10 / 100) * this.f57688e;
        }
    }

    public /* synthetic */ AbstractC7230a(InterfaceC7232c interfaceC7232c, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7232c);
    }

    public abstract float a(float f10, float f11);

    public final InterfaceC7232c b() {
        return this.f57687a;
    }

    private AbstractC7230a(InterfaceC7232c interfaceC7232c) {
        this.f57687a = interfaceC7232c;
    }
}
