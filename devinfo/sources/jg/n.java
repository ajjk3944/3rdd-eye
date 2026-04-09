package jg;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import com.liuzh.deviceinfo.splash.SplashActivity;
import com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity;
import ec.b0;
import fb.r;
import km.y;
import m8.s;
import nm.d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n implements androidx.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27680b;

    public /* synthetic */ n(int i4, Object obj) {
        this.f27679a = i4;
        this.f27680b = obj;
    }

    @Override // androidx.lifecycle.h
    public final void c(a0 a0Var) throws InterruptedException {
        int i4 = this.f27679a;
        int i10 = 1;
        Object obj = this.f27680b;
        switch (i4) {
            case 0:
                break;
            case 1:
                d0 d0Var = (d0) obj;
                ((SplashActivity) d0Var.f30011b).f32744a.b(this);
                SplashActivity splashActivity = (SplashActivity) d0Var.f30011b;
                int i11 = SplashActivity.K;
                splashActivity.F(false);
                break;
            case 2:
                d0 d0Var2 = (d0) obj;
                ((rh.e) ((r) d0Var2.f30011b).f23968c).f32959h.f32744a.b(this);
                SplashActivity splashActivity2 = ((rh.e) ((r) d0Var2.f30011b).f23968c).f32959h;
                int i12 = SplashActivity.K;
                splashActivity2.F(false);
                break;
            case 3:
                km.n nVar = (km.n) obj;
                ((SplashActivity) nVar.f28443c).f32744a.b(this);
                ((rh.b) nVar.f28442b).run();
                break;
            case 4:
                y yVar = (y) obj;
                ((rh.e) yVar.f28522b).f32959h.f32744a.b(this);
                SplashActivity splashActivity3 = ((rh.e) yVar.f28522b).f32959h;
                int i13 = SplashActivity.K;
                splashActivity3.F(false);
                break;
            case 5:
                (Build.VERSION.SDK_INT >= 28 ? w4.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new b0(i10), 500L);
                ((t) obj).b(this);
                break;
            case 6:
                break;
            default:
                s sVar = (s) obj;
                ((AppsAnalyzeActivity) sVar.f28984c).f32744a.b(this);
                if (!sVar.f28982a) {
                    ((k1.b) sVar.f28983b).run();
                    sVar.f28982a = true;
                    break;
                }
                break;
        }
    }

    @Override // androidx.lifecycle.h
    public final void e(a0 a0Var) {
        int i4 = this.f27679a;
    }

    @Override // androidx.lifecycle.h
    public final void m(a0 a0Var) {
        switch (this.f27679a) {
            case 0:
                StorageCleanActivity storageCleanActivity = (StorageCleanActivity) this.f27680b;
                storageCleanActivity.f32744a.b(this);
                storageCleanActivity.finish();
                break;
            case 6:
                AppsAnalyzeActivity appsAnalyzeActivity = (AppsAnalyzeActivity) this.f27680b;
                appsAnalyzeActivity.f32744a.b(this);
                appsAnalyzeActivity.finish();
                break;
        }
    }

    @Override // androidx.lifecycle.h
    public final void onDestroy(a0 a0Var) {
        int i4 = this.f27679a;
    }

    @Override // androidx.lifecycle.h
    public final void onStart(a0 a0Var) {
        int i4 = this.f27679a;
    }

    @Override // androidx.lifecycle.h
    public final void onStop(a0 a0Var) {
        int i4 = this.f27679a;
    }

    public n(EmojiCompatInitializer emojiCompatInitializer, t tVar) {
        this.f27679a = 5;
        this.f27680b = tVar;
    }

    private final /* bridge */ void A(a0 a0Var) {
    }

    private final /* synthetic */ void B(a0 a0Var) {
    }

    private final /* bridge */ void C(a0 a0Var) {
    }

    private final /* synthetic */ void D(a0 a0Var) {
    }

    private final /* synthetic */ void E(a0 a0Var) {
    }

    private final /* synthetic */ void F(a0 a0Var) {
    }

    private final /* synthetic */ void G(a0 a0Var) {
    }

    private final /* synthetic */ void H(a0 a0Var) {
    }

    private final /* synthetic */ void I(a0 a0Var) {
    }

    private final /* synthetic */ void J(a0 a0Var) {
    }

    private final /* bridge */ void K(a0 a0Var) {
    }

    private final /* synthetic */ void L(a0 a0Var) {
    }

    private final /* synthetic */ void M(a0 a0Var) {
    }

    private final /* synthetic */ void N(a0 a0Var) {
    }

    private final /* synthetic */ void O(a0 a0Var) {
    }

    private final /* synthetic */ void P(a0 a0Var) {
    }

    private final /* synthetic */ void Q(a0 a0Var) {
    }

    private final /* synthetic */ void R(a0 a0Var) {
    }

    private final void a(a0 a0Var) {
    }

    private final void b(a0 a0Var) {
    }

    private final void d(a0 a0Var) {
    }

    private final void f(a0 a0Var) {
    }

    private final void h(a0 a0Var) {
    }

    private final void i(a0 a0Var) {
    }

    private final void j(a0 a0Var) {
    }

    private final void k(a0 a0Var) {
    }

    private final void l(a0 a0Var) {
    }

    private final void n(a0 a0Var) {
    }

    private final void o(a0 a0Var) {
    }

    private final void p(a0 a0Var) {
    }

    private final void q(a0 a0Var) {
    }

    private final void r(a0 a0Var) {
    }

    private final void s(a0 a0Var) {
    }

    private final void t(a0 a0Var) {
    }

    private final /* synthetic */ void u(a0 a0Var) {
    }

    private final /* synthetic */ void v(a0 a0Var) {
    }

    private final /* synthetic */ void w(a0 a0Var) {
    }

    private final /* synthetic */ void x(a0 a0Var) {
    }

    private final /* synthetic */ void y(a0 a0Var) {
    }

    private final /* synthetic */ void z(a0 a0Var) {
    }
}
