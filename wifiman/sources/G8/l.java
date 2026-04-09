package g8;

import I3.f;
import Yg.J;
import Zg.AbstractC3689v;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import c.AbstractC4164s;
import c.C4143L;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.ubnt.usurvey.R;
import d8.InterfaceC5305a;
import ec.AbstractC5452a;
import gg.AbstractC5912b;
import h8.AbstractActivityC5957b;
import h8.EnumC5958c;
import h8.InterfaceC5966k;
import hc.C5973a;
import i8.InterfaceC6084a;
import i8.s;
import j8.InterfaceC6259a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import lc.InterfaceC6573d;
import ld.InterfaceC6575b;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import oc.InterfaceC7118c;
import org.kodein.di.DI;
import rc.InterfaceC7585a;
import rj.InterfaceC7810x2;
import s1.AbstractC7874b;
import sj.AbstractC7986a;
import sj.C7992d;
import vc.InterfaceC8208a;

/* loaded from: classes3.dex */
public abstract class l extends AbstractActivityC5957b {

    /* renamed from: H, reason: collision with root package name */
    private final Yg.m f47740H;

    /* renamed from: I, reason: collision with root package name */
    private final Yg.m f47741I;

    /* renamed from: J, reason: collision with root package name */
    private final Yg.m f47742J;

    /* renamed from: N, reason: collision with root package name */
    private final Yg.m f47743N;

    /* renamed from: X, reason: collision with root package name */
    private final Yg.m f47744X;

    /* renamed from: Y, reason: collision with root package name */
    private final Yg.m f47745Y;

    /* renamed from: Z, reason: collision with root package name */
    private final Yg.m f47746Z;

    /* renamed from: f1, reason: collision with root package name */
    private final Yg.m f47747f1;

    /* renamed from: g1, reason: collision with root package name */
    private final Yg.m f47748g1;

    /* renamed from: h1, reason: collision with root package name */
    private final Yg.m f47749h1;

    /* renamed from: i1, reason: collision with root package name */
    private final Yg.m f47750i1;

    /* renamed from: j1, reason: collision with root package name */
    private List f47751j1;

    /* renamed from: l1, reason: collision with root package name */
    static final /* synthetic */ th.l[] f47738l1 = {O.h(new F(l.class, "activityResultModel", "getActivityResultModel()Lcom/ui/wifiman/model/android/activityresult/ActivityResult$Launcher;", 0)), O.h(new F(l.class, "appSynchronizer", "getAppSynchronizer()Lcom/ubnt/usurvey/sync/AppRuntimeSynchronizer;", 0)), O.h(new F(l.class, "permissionsService", "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionActivityApi;", 0)), O.h(new F(l.class, "appReviewActivityApi", "getAppReviewActivityApi()Lcom/ui/wifiman/model/android/review/AppReviewActivityApi;", 0)), O.h(new F(l.class, "appWindowActivityApi", "getAppWindowActivityApi()Lcom/ui/wifiman/model/android/window/AppWindowActivityApi;", 0)), O.h(new F(l.class, "deepLinkProcessor", "getDeepLinkProcessor()Lcom/ubnt/usurvey/ui/arch/routing/WifimanDeeplink$Processor;", 0)), O.h(new F(l.class, "appSessionManager", "getAppSessionManager()Lcom/ui/wifiman/model/session/AppSessionManager;", 0)), O.h(new F(l.class, "appThemeService", "getAppThemeService()Lcom/ubnt/usurvey/ui/arch/theme/ThemeService;", 0)), O.h(new F(l.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(l.class, "toastServiceActivityApi", "getToastServiceActivityApi()Lcom/ui/wifiman/domain/toast/ToastServiceActivityApi;", 0)), O.h(new F(l.class, "appLifecycleOperator", "getAppLifecycleOperator()Lcom/ui/wifiman/model/android/lifecycle/AppLifecycleServiceOperator;", 0)), O.g(new D(l.class, "di", "<v#0>", 0)), O.g(new D(l.class, "localeService", "<v#1>", 0))};

    /* renamed from: k1, reason: collision with root package name */
    public static final a f47737k1 = new a(null);

    /* renamed from: m1, reason: collision with root package name */
    public static final int f47739m1 = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends org.kodein.type.o<Y7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends org.kodein.type.o<hc.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<InterfaceC7118c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<InterfaceC6573d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends org.kodein.type.o<InterfaceC5305a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends org.kodein.type.o<com.ui.wifiman.model.android.permissions.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends org.kodein.type.o<InterfaceC7585a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends org.kodein.type.o<InterfaceC8208a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends org.kodein.type.o<s.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends org.kodein.type.o<InterfaceC6575b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: g8.l$l, reason: collision with other inner class name */
    public static final class C1774l extends org.kodein.type.o<InterfaceC6259a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m extends org.kodein.type.o<InterfaceC6084a> {
    }

    public l() {
        org.kodein.type.i iVarE = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6573d.class), null);
        th.l[] lVarArr = f47738l1;
        this.f47740H = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f47741I = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC5305a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f47742J = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, com.ui.wifiman.model.android.permissions.b.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f47743N = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, InterfaceC7585a.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f47744X = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, InterfaceC8208a.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f47745Y = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, s.d.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f47746Z = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE7, InterfaceC6575b.class), null).a(this, lVarArr[6]);
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new C1774l().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f47747f1 = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE8, InterfaceC6259a.class), null).a(this, lVarArr[7]);
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f47748g1 = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE9, InterfaceC6084a.class), null).a(this, lVarArr[8]);
        org.kodein.type.i iVarE10 = org.kodein.type.s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f47749h1 = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE10, hc.c.class), null).a(this, lVarArr[9]);
        org.kodein.type.i iVarE11 = org.kodein.type.s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE11, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f47750i1 = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE11, InterfaceC7118c.class), null).a(this, lVarArr[10]);
    }

    private final void A1() {
        InterfaceC5966k.a.q(this, s1().b(), EnumC5958c.PAUSED, null, null, false, new InterfaceC6835l() { // from class: g8.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return l.B1(this.f47733a, (C5973a) obj);
            }
        }, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J B1(l lVar, C5973a it) {
        AbstractC6492s.i(it, "it");
        lVar.O1(it);
        return J.f24997a;
    }

    private final void C1() {
        InterfaceC5966k.a.q(this, p1().b(), EnumC5958c.DESTROYED, null, null, false, new InterfaceC6835l() { // from class: g8.i
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return l.D1(this.f47735a, ((Boolean) obj).booleanValue());
            }
        }, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J D1(l lVar, boolean z10) {
        if (z10) {
            lVar.getWindow().addFlags(128);
        } else {
            lVar.getWindow().clearFlags(128);
        }
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J E1() {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J F1() {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J G1() {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J H1() {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J I1(l lVar, List permissionRequest) {
        AbstractC6492s.i(permissionRequest, "permissionRequest");
        List<String> list = permissionRequest;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        for (String str : list) {
            arrayList.add(Boolean.valueOf(AbstractC7874b.t(lVar, (String) permissionRequest.get(0))));
        }
        lVar.f47751j1 = arrayList;
        AbstractC7874b.s(lVar, (String[]) permissionRequest.toArray(new String[0]), 1);
        return J.f24997a;
    }

    private final void J1(InterfaceC6084a.AbstractC1811a abstractC1811a) {
        if (abstractC1811a instanceof InterfaceC6084a.AbstractC1811a.f) {
            return;
        }
        if (abstractC1811a instanceof InterfaceC6084a.AbstractC1811a.h) {
            L1((InterfaceC6084a.AbstractC1811a.h) abstractC1811a);
            return;
        }
        if (abstractC1811a instanceof InterfaceC6084a.AbstractC1811a.d) {
            LocationRequest locationRequestB = LocationRequest.b();
            AbstractC6492s.h(locationRequestB, "create(...)");
            f.a aVarA = new f.a().a(locationRequestB);
            AbstractC6492s.h(aVarA, "addLocationRequest(...)");
            aVarA.c(true);
            AbstractC6492s.f(I3.e.b(this).b(aVarA.b()).addOnFailureListener(new OnFailureListener() { // from class: g8.b
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    l.K1(this.f47731a, exc);
                }
            }));
            return;
        }
        if (abstractC1811a instanceof InterfaceC6084a.AbstractC1811a.b) {
            ((InterfaceC6084a.AbstractC1811a.b) abstractC1811a).a().invoke(this);
            return;
        }
        if (abstractC1811a instanceof InterfaceC6084a.AbstractC1811a.C1812a) {
            J1((InterfaceC6084a.AbstractC1811a) ((InterfaceC6084a.AbstractC1811a.C1812a) abstractC1811a).a().invoke(this));
            return;
        }
        if (abstractC1811a instanceof InterfaceC6084a.AbstractC1811a.c) {
            finishAffinity();
        } else {
            if (abstractC1811a instanceof InterfaceC6084a.AbstractC1811a.e) {
                return;
            }
            if (!(abstractC1811a instanceof InterfaceC6084a.AbstractC1811a.g)) {
                throw new NoWhenBranchMatchedException();
            }
            O1(((InterfaceC6084a.AbstractC1811a.g) abstractC1811a).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(l lVar, Exception exception) {
        AbstractC6492s.i(exception, "exception");
        if (exception instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exception).a(lVar, 2);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    private final void L1(InterfaceC6084a.AbstractC1811a.h hVar) {
        Intent intent = (Intent) hVar.d().invoke(this);
        try {
            if (hVar.e() != null) {
                startActivityForResult(intent, hVar.e().intValue());
            } else {
                startActivity(intent);
            }
            if (hVar.a() != null || hVar.b() != null) {
                Integer numA = hVar.a();
                int iIntValue = numA != null ? numA.intValue() : 0;
                Integer numB = hVar.b();
                overridePendingTransition(iIntValue, numB != null ? numB.intValue() : 0);
            }
            if (hVar.c()) {
                finish();
            }
        } catch (ActivityNotFoundException e10) {
            Z7.b.e("Failed to process StartActivity routing event", e10, null, 4, null);
            O1(new C5973a(new AbstractC5452a.C1741a(R.string.unexpected_error_message, new Object[0]), false, 2, null));
        } catch (SecurityException e11) {
            Z7.b.e("Failed to process StartActivity routing event", e11, null, 4, null);
            O1(new C5973a(new AbstractC5452a.C1741a(R.string.unexpected_error_message, new Object[0]), false, 2, null));
        }
    }

    private final void M1() {
        AbstractC4164s.b(this, null, C4143L.f33516e.c(-16777216), 1, null);
    }

    private final void N1() {
        setRequestedOrientation(getResources().getBoolean(R.bool.isTablet) ? -1 : 12);
    }

    private final void O1(C5973a c5973a) {
        Toast.makeText(this, c5973a.b().a(this), c5973a.a() ? 1 : 0).show();
    }

    private static final DI h1(Yg.m mVar) {
        return (DI) mVar.getValue();
    }

    private static final Y7.a i1(Yg.m mVar) {
        return (Y7.a) mVar.getValue();
    }

    private final InterfaceC6573d j1() {
        return (InterfaceC6573d) this.f47740H.getValue();
    }

    private final InterfaceC7118c k1() {
        return (InterfaceC7118c) this.f47750i1.getValue();
    }

    private final InterfaceC7585a l1() {
        return (InterfaceC7585a) this.f47743N.getValue();
    }

    private final InterfaceC6575b m1() {
        return (InterfaceC6575b) this.f47746Z.getValue();
    }

    private final InterfaceC5305a n1() {
        return (InterfaceC5305a) this.f47741I.getValue();
    }

    private final InterfaceC6259a o1() {
        return (InterfaceC6259a) this.f47747f1.getValue();
    }

    private final InterfaceC8208a p1() {
        return (InterfaceC8208a) this.f47744X.getValue();
    }

    private final s.d q1() {
        return (s.d) this.f47745Y.getValue();
    }

    private final com.ui.wifiman.model.android.permissions.b r1() {
        return (com.ui.wifiman.model.android.permissions.b) this.f47742J.getValue();
    }

    private final hc.c s1() {
        return (hc.c) this.f47749h1.getValue();
    }

    private final InterfaceC6084a t1() {
        return (InterfaceC6084a) this.f47748g1.getValue();
    }

    private final void u1() {
        InterfaceC5966k.a.q(this, t1().b(), EnumC5958c.PAUSED, null, null, false, new InterfaceC6835l() { // from class: g8.k
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return l.v1(this.f47736a, (InterfaceC6084a.AbstractC1811a) obj);
            }
        }, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J v1(l lVar, InterfaceC6084a.AbstractC1811a it) {
        AbstractC6492s.i(it, "it");
        lVar.J1(it);
        return J.f24997a;
    }

    private final void w1() {
        InterfaceC5966k.a.p(this, j1().d(), EnumC5958c.PAUSED, null, null, false, new InterfaceC6835l() { // from class: g8.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return l.x1(this.f47734a, (InterfaceC6573d.a) obj);
            }
        }, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J x1(l lVar, InterfaceC6573d.a request) {
        AbstractC6492s.i(request, "request");
        lVar.startActivityForResult(request.a(), request.b());
        Z7.b.h("Activity Result Request launched " + request.b(), null, 2, null);
        return J.f24997a;
    }

    private final void y1() {
        InterfaceC5966k.a.o(this, o1().c(), EnumC5958c.DESTROYED, null, false, new InterfaceC6824a() { // from class: g8.j
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return l.z1();
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J z1() {
        return J.f24997a;
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        if (context == null) {
            throw new IllegalStateException("context unavailable in attachBaseContext");
        }
        C7992d c7992dD = AbstractC7986a.d(context);
        th.l[] lVarArr = f47738l1;
        DI diH1 = h1(c7992dD.a(null, lVarArr[11]));
        org.kodein.type.i iVarE = org.kodein.type.s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        super.attachBaseContext(i1(org.kodein.di.d.a(diH1, new org.kodein.type.d(iVarE, Y7.a.class), null).a(null, lVarArr[12])).a(context));
    }

    @Override // androidx.fragment.app.AbstractActivityC3999j, c.AbstractActivityC4155j, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Z7.b.h("Activity Result Request Obtained " + i10, null, 2, null);
        j1().c(i10, i11, intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC3999j, c.AbstractActivityC4155j, s1.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        M1();
        super.onCreate(bundle);
        N1();
        y1();
        C1();
        if (bundle == null) {
            s.d dVarQ1 = q1();
            Intent intent = getIntent();
            AbstractC6492s.h(intent, "getIntent(...)");
            dVarQ1.c(intent);
        }
    }

    @Override // c.AbstractActivityC4155j, android.app.Activity
    protected void onNewIntent(Intent intent) {
        AbstractC6492s.i(intent, "intent");
        super.onNewIntent(intent);
        q1().c(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC3999j, android.app.Activity
    protected void onPause() {
        super.onPause();
        k1().c();
    }

    @Override // androidx.fragment.app.AbstractActivityC3999j, c.AbstractActivityC4155j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        AbstractC6492s.i(permissions, "permissions");
        AbstractC6492s.i(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        if (grantResults.length == 0) {
            return;
        }
        int length = grantResults.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (grantResults[i11] == 0) {
                InterfaceC5966k.a.o(this, r1().d(), EnumC5958c.DESTROYED, null, false, new InterfaceC6824a() { // from class: g8.a
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return l.E1();
                    }
                }, 6, null);
                break;
            }
            i11++;
        }
        for (int i12 : grantResults) {
            if (i12 == -1) {
                int length2 = permissions.length;
                int i13 = 0;
                boolean z10 = false;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = i14 + 1;
                    boolean zT = AbstractC7874b.t(this, permissions[i13]);
                    List list = this.f47751j1;
                    if ((list != null ? AbstractC6492s.d(AbstractC3689v.t0(list, i14), Boolean.FALSE) : false) && !zT) {
                        z10 = true;
                    }
                    i13++;
                    i14 = i15;
                }
                if (z10) {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", getPackageName(), null));
                    startActivity(intent);
                    return;
                }
                return;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC3999j, android.app.Activity
    protected void onResume() {
        super.onResume();
        u1();
        A1();
        w1();
        InterfaceC5966k.a.o(this, r1().d(), EnumC5958c.PAUSED, null, false, new InterfaceC6824a() { // from class: g8.c
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return l.F1();
            }
        }, 6, null);
        k1().a();
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.AbstractActivityC3999j, android.app.Activity
    protected void onStart() {
        super.onStart();
        k1().d();
        AbstractC5912b abstractC5912bA = n1().a();
        EnumC5958c enumC5958c = EnumC5958c.STOPPED;
        InterfaceC5966k.a.o(this, abstractC5912bA, enumC5958c, null, false, new InterfaceC6824a() { // from class: g8.d
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return l.G1();
            }
        }, 6, null);
        l1().b(this);
        InterfaceC5966k.a.o(this, m1().b(), enumC5958c, null, false, new InterfaceC6824a() { // from class: g8.e
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return l.H1();
            }
        }, 6, null);
        InterfaceC5966k.a.q(this, r1().c(), enumC5958c, null, null, false, new InterfaceC6835l() { // from class: g8.f
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return l.I1(this.f47732a, (List) obj);
            }
        }, 14, null);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.AbstractActivityC3999j, android.app.Activity
    protected void onStop() {
        super.onStop();
        k1().b();
        l1().d(this);
    }
}
