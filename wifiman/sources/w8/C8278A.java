package w8;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import com.ubnt.usurvey.R;
import com.ui.wifiman.quicksettings.TeleportTileService;
import i8.InterfaceC6084a;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import ye.C8658d;

/* renamed from: w8.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8278A extends com.ui.wifiman.ui.settings.preferences.o {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ th.l[] f64489j = {O.h(new F(C8278A.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(C8278A.class, "context", "getContext()Landroid/content/Context;", 0))};

    /* renamed from: k, reason: collision with root package name */
    public static final int f64490k = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f64491g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f64492h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f64493i;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.A$a */
    public static final class a extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.A$b */
    public static final class b extends org.kodein.type.o<Context> {
    }

    public C8278A(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f64491g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6084a.class), null);
        th.l[] lVarArr = f64489j;
        this.f64492h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64493i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, Context.class), null).a(this, lVarArr[1]);
    }

    private final Context p0() {
        return (Context) this.f64493i.getValue();
    }

    private final InterfaceC6084a q0() {
        return (InterfaceC6084a) this.f64492h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(C8278A c8278a, Integer num) {
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            Z7.b.h("Teleport Quick Action Explanation - tile added", null, 2, null);
        } else if ((num != null && num.intValue() == 1000) || ((num != null && num.intValue() == 1001) || ((num != null && num.intValue() == 1002) || ((num != null && num.intValue() == 1003) || ((num != null && num.intValue() == 1004) || (num != null && num.intValue() == 1005)))))) {
            Z7.b.j("Teleport Quick Action Explanation - failed to add tile because of : " + num, null, null, 6, null);
        }
        C8658d.f66727a.d(c8278a.q0().a(InterfaceC6084a.b.n.f48939a), c8278a);
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f64491g;
    }

    @Override // com.ui.wifiman.ui.settings.preferences.o
    public void n0() {
        if (Build.VERSION.SDK_INT >= 33) {
            w.a(p0().getSystemService(v.a())).requestAddTileService(new ComponentName(p0(), (Class<?>) TeleportTileService.class), p0().getString(R.string.teleport_quick_settings_title), Icon.createWithResource(p0(), 2131166102), p0().getMainExecutor(), new Consumer() { // from class: w8.z
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C8278A.r0(this.f64649a, (Integer) obj);
                }
            });
        }
    }
}
