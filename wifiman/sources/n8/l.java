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
import rj.InterfaceC7810x2;
import s9.d;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class l extends b.c {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ th.l[] f15462o = {O.h(new F(l.class, "wizardManager", "getWizardManager()Lcom/ubnt/usurvey/ui/wizard/AppWizardManager;", 0)), O.h(new F(l.class, "permissionsService", "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;", 0))};

    /* renamed from: p, reason: collision with root package name */
    public static final int f15463p = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f15464g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f15465h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f15466i;

    /* renamed from: j, reason: collision with root package name */
    private final z f15467j;

    /* renamed from: k, reason: collision with root package name */
    private final z f15468k;

    /* renamed from: l, reason: collision with root package name */
    private final z f15469l;

    /* renamed from: m, reason: collision with root package name */
    private final z f15470m;

    /* renamed from: n, reason: collision with root package name */
    private final z f15471n;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends org.kodein.type.o<N8.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends org.kodein.type.o<com.ui.wifiman.model.android.permissions.d> {
    }

    public l(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f15464g = di2;
        org.kodein.type.i iVarE = s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, N8.a.class), null);
        th.l[] lVarArr = f15462o;
        this.f15465h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f15466i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, com.ui.wifiman.model.android.permissions.d.class), null).a(this, lVarArr[1]);
        this.f15467j = P.a(new d.b(R.string.wizard_location_permission_title));
        this.f15468k = P.a(new d.b(R.string.wizard_location_permission_message));
        this.f15469l = P.a(Pe.b.f18633a.d());
        this.f15470m = P.a(new d.b(R.string.wizard_location_permission_btn_grant));
        this.f15471n = P.a(new d.b(R.string.wizard_location_permission_btn_skip));
    }

    private final com.ui.wifiman.model.android.permissions.d w0() {
        return (com.ui.wifiman.model.android.permissions.d) this.f15466i.getValue();
    }

    private final N8.a z0() {
        return (N8.a) this.f15465h.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f15464g;
    }

    @Override // Hf.d
    public void r0() {
        C8658d.f66727a.d(w0().a(com.ui.wifiman.model.android.permissions.a.LOCATION_FINE), this);
    }

    @Override // Hf.d
    public void s0() {
        C8658d.f66727a.d(z0().c(), this);
    }

    @Override // Hf.d
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public z n0() {
        return this.f15470m;
    }

    @Override // Hf.d
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public z o0() {
        return this.f15471n;
    }

    @Override // Hf.d
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public z p0() {
        return this.f15469l;
    }

    @Override // Hf.d
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public z q0() {
        return this.f15468k;
    }

    @Override // Hf.d
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public z getTitle() {
        return this.f15467j;
    }
}
