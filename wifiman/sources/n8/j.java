package N8;

import Hf.b;
import Li.P;
import Li.z;
import com.ubnt.usurvey.R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import org.kodein.di.DI;
import org.kodein.type.s;
import s9.d;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class j extends b.a {

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ th.l[] f15443n = {O.h(new F(j.class, "wizardManager", "getWizardManager()Lcom/ubnt/usurvey/ui/wizard/AppWizardManager;", 0))};

    /* renamed from: o, reason: collision with root package name */
    public static final int f15444o = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f15445g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f15446h;

    /* renamed from: i, reason: collision with root package name */
    private final z f15447i;

    /* renamed from: j, reason: collision with root package name */
    private final z f15448j;

    /* renamed from: k, reason: collision with root package name */
    private final z f15449k;

    /* renamed from: l, reason: collision with root package name */
    private final z f15450l;

    /* renamed from: m, reason: collision with root package name */
    private final z f15451m;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends org.kodein.type.o<N8.a> {
    }

    public j(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f15445g = di2;
        org.kodein.type.i iVarE = s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f15446h = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, N8.a.class), null).a(this, f15443n[0]);
        this.f15447i = P.a(new d.b(R.string.wizard_speedtest_local_title));
        this.f15448j = P.a(new d.b(R.string.wizard_speedtest_local_message));
        this.f15449k = P.a(Pe.b.f18633a.a());
        this.f15450l = P.a(new d.b(R.string.wizard_speedtest_local_btn_continue));
        this.f15451m = P.a(null);
    }

    private final N8.a y0() {
        return (N8.a) this.f15446h.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f15445g;
    }

    @Override // Hf.d
    public void r0() {
        C8658d.f66727a.d(y0().b(), this);
    }

    @Override // Hf.d
    public void s0() {
    }

    @Override // Hf.d
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public z n0() {
        return this.f15450l;
    }

    @Override // Hf.d
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public z o0() {
        return this.f15451m;
    }

    @Override // Hf.d
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public z p0() {
        return this.f15449k;
    }

    @Override // Hf.d
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public z q0() {
        return this.f15448j;
    }

    @Override // Hf.d
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public z getTitle() {
        return this.f15447i;
    }
}
