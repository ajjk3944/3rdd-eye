package pd;

import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Fg.a f57873a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f57874b;

    public static final class a implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f57876b;

        public a(boolean z10) {
            this.f57876b = z10;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                r.this.f57873a.h(Boolean.valueOf(this.f57876b));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public r() {
        Fg.a aVarK2 = Fg.a.k2(Boolean.FALSE);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f57873a = aVarK2;
        gg.i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f57874b = iVarI2;
    }

    @Override // pd.q
    public gg.i a() {
        return this.f57874b;
    }

    @Override // pd.q
    public AbstractC5912b b(boolean z10) {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(z10));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }
}
