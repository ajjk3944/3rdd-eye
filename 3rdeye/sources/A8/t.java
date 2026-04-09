package A8;

import A9.E;
import A9.InterfaceC0594o0;
import A9.O;
import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import com.zipoapps.premiumhelper.ui.splash.WarmSplashActivity;
import f9.InterfaceC4347e;
import java.lang.ref.WeakReference;

/* compiled from: WarmSplashCoordinator.kt */
@h9.e(c = "com.zipoapps.premiumhelper.ui.relaunch.WarmSplashCoordinator$scheduleWarmSplashClosure$1", f = "WarmSplashCoordinator.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class t extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f161l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f162m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f163n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u f164o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Activity f165p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j4, u uVar, Activity activity, InterfaceC4347e<? super t> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f163n = j4;
        this.f164o = uVar;
        this.f165p = activity;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        t tVar = new t(this.f163n, this.f164o, this.f165p, interfaceC4347e);
        tVar.f162m = obj;
        return tVar;
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((t) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        E e4;
        WarmSplashActivity warmSplashActivity;
        WarmSplashActivity warmSplashActivity2;
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f161l;
        if (i == 0) {
            b9.n.b(obj);
            E e10 = (E) this.f162m;
            this.f162m = e10;
            this.f161l = 1;
            if (O.a(this.f163n, this) == aVar) {
                return aVar;
            }
            e4 = e10;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e4 = (E) this.f162m;
            b9.n.b(obj);
        }
        InterfaceC0594o0 interfaceC0594o0 = (InterfaceC0594o0) e4.k0().get(InterfaceC0594o0.a.f263b);
        boolean zIsActive = interfaceC0594o0 != null ? interfaceC0594o0.isActive() : true;
        u uVar = this.f164o;
        if (zIsActive) {
            Activity activity = this.f165p;
            kotlin.jvm.internal.l.d(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            w9.i<Object>[] iVarArr = u.i;
            uVar.getClass();
            uVar.f171f.a(uVar, u.i[0]).a("Warm splash activity was destroyed", new Object[0]);
            uVar.f170e = false;
            uVar.f168c.invoke((AppCompatActivity) activity);
            WeakReference<WarmSplashActivity> weakReference = uVar.f172g;
            if (weakReference != null && (warmSplashActivity2 = weakReference.get()) != null) {
                warmSplashActivity2.finish();
            }
            uVar.f172g = null;
        } else {
            w9.i<Object>[] iVarArr2 = u.i;
            WeakReference<WarmSplashActivity> weakReference2 = uVar.f172g;
            if (weakReference2 != null && (warmSplashActivity = weakReference2.get()) != null) {
                warmSplashActivity.finish();
            }
            uVar.f172g = null;
        }
        return C1992A.f18074a;
    }
}
