package A3;

import A2.C0117e;
import B4.C0141c;
import R.InterfaceC0188o;
import R.O;
import R.o0;
import R.r0;
import Y2.C0200b;
import Y2.C0207i;
import Y2.C0209k;
import Y2.M;
import Y2.S;
import Y2.W;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import b4.C0344i;
import c3.j;
import com.apm.insight.R;
import com.bumptech.glide.e;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.lefan.base.activity.LanguageActivity;
import com.lefan.base.activity.PrivacyActivity;
import com.lefan.base.activity.SuggestActivity;
import com.lefan.signal.MainActivity;
import com.lefan.signal.MyApplication;
import com.lefan.signal.ad.FreeAdActivity;
import h0.C2351a;
import java.util.concurrent.Executor;
import k0.K;
import n.InterfaceC2675i;
import n.MenuC2677k;
import p4.C2781h;
import q4.C2857a;
import q5.i;

/* loaded from: classes.dex */
public final class B implements InterfaceC2675i, InterfaceC0188o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationView f358a;

    public /* synthetic */ B(NavigationView navigationView) {
        this.f358a = navigationView;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // n.InterfaceC2675i
    public boolean f(MenuC2677k menuC2677k, MenuItem menuItem) {
        W3.a aVar;
        c3.j jVar;
        boolean z6;
        D d6 = this.f358a.f18413j;
        final int i = 0;
        byte b5 = 0;
        if (d6 == null) {
            return false;
        }
        H4.b bVar = (H4.b) d6;
        final MainActivity mainActivity = bVar.f1802a;
        q5.l lVar = bVar.f1803b;
        SwitchMaterial switchMaterial = bVar.f1804c;
        int i3 = MainActivity.f18804V;
        q5.i.e(menuItem, "it");
        final int i6 = 3;
        final int i7 = 1;
        switch (menuItem.getItemId()) {
            case R.id.nav_agreement /* 2131296889 */:
                Intent intent = new Intent(mainActivity, (Class<?>) PrivacyActivity.class);
                intent.putExtra("my_name", "agreement");
                mainActivity.startActivity(intent);
                return true;
            case R.id.nav_bright_screen /* 2131296890 */:
            case R.id.nav_controller_view_tag /* 2131296891 */:
            case R.id.nav_host_fragment_activity_main /* 2131296893 */:
            case R.id.nav_host_fragment_container /* 2131296894 */:
            case R.id.nav_view /* 2131296903 */:
            default:
                return true;
            case R.id.nav_evaluate /* 2131296892 */:
                if (com.bumptech.glide.e.f6496b == null) {
                    com.bumptech.glide.e.w(mainActivity);
                    return true;
                }
                if (!mainActivity.isFinishing() && !mainActivity.isDestroyed()) {
                    c3.j jVar2 = com.bumptech.glide.e.f6495a;
                    if (jVar2 == null || (aVar = (W3.a) jVar2.c()) == null) {
                        com.bumptech.glide.e.w(mainActivity);
                    } else {
                        C2351a c2351a = com.bumptech.glide.e.f6496b;
                        c3.j jVar3 = null;
                        if (c2351a != null) {
                            W3.b bVar2 = (W3.b) aVar;
                            if (bVar2.f4024b) {
                                jVar = new c3.j();
                                jVar.g(null);
                            } else {
                                Intent intent2 = new Intent(mainActivity, (Class<?>) PlayCoreDialogWrapperActivity.class);
                                intent2.putExtra("confirmation_intent", bVar2.f4023a);
                                intent2.putExtra("window_flags", mainActivity.getWindow().getDecorView().getWindowSystemUiVisibility());
                                c3.f fVar = new c3.f();
                                intent2.putExtra("result_receiver", new W3.c((Handler) c2351a.f20442c, fVar));
                                mainActivity.startActivity(intent2);
                                jVar = fVar.f5902a;
                            }
                            jVar3 = jVar;
                        }
                        final long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jVar3 != null) {
                            jVar3.a(new c3.b() { // from class: v4.a
                                @Override // c3.b
                                public final void e(j jVar4) {
                                    i.e(jVar4, "it");
                                    boolean zE = jVar4.e();
                                    MainActivity mainActivity2 = mainActivity;
                                    if (!zE) {
                                        if (mainActivity2.isFinishing() || mainActivity2.isDestroyed()) {
                                            return;
                                        }
                                        e.w(mainActivity2);
                                        e.f6495a = null;
                                        e.r(mainActivity2);
                                        return;
                                    }
                                    if (System.currentTimeMillis() - jCurrentTimeMillis >= 200) {
                                        e.f6495a = null;
                                        e.r(mainActivity2);
                                    } else {
                                        if (mainActivity2.isFinishing() || mainActivity2.isDestroyed()) {
                                            return;
                                        }
                                        e.w(mainActivity2);
                                    }
                                }
                            });
                            return true;
                        }
                    }
                }
                return true;
            case R.id.nav_language /* 2131296895 */:
                Intent intent3 = new Intent(mainActivity, (Class<?>) LanguageActivity.class);
                intent3.putExtra("flavor", "google");
                boolean z7 = MyApplication.f18812d;
                intent3.putExtra("data_test", false);
                mainActivity.startActivity(intent3);
                return true;
            case R.id.nav_mode /* 2131296896 */:
                new B4.o().f0(mainActivity.s(), "mode_select");
                return true;
            case R.id.nav_num_locale /* 2131296897 */:
                K kS = mainActivity.s();
                c1.g gVar = new c1.g(27, (boolean) (b5 == true ? 1 : 0));
                gVar.f5897c = mainActivity.getString(R.string.string_tip);
                gVar.f5898d = mainActivity.getString(R.string.restart_app);
                gVar.f5896b = mainActivity.getString(R.string.number_locale_restart_tip);
                V2.e eVar = new V2.e(lVar, switchMaterial, mainActivity, i6);
                if (kS != null) {
                    C0141c c0141c = new C0141c();
                    c0141c.f704C0 = gVar;
                    c0141c.f703B0 = eVar;
                    c0141c.e0(kS, "custom_dialog");
                    return true;
                }
                return true;
            case R.id.nav_privacy /* 2131296898 */:
                Intent intent4 = new Intent(mainActivity, (Class<?>) PrivacyActivity.class);
                intent4.putExtra("my_name", "privacy");
                mainActivity.startActivity(intent4);
                return true;
            case R.id.nav_privacy_settings /* 2131296899 */:
                C2857a c2857a = (C2857a) mainActivity.f18805O.getValue();
                final C2781h c2781h = new C2781h(0, mainActivity);
                c2857a.getClass();
                C0209k c0209k = (C0209k) ((M) C0200b.c(mainActivity).f4307f).a();
                c0209k.getClass();
                Y2.z.a();
                S s5 = (S) ((M) C0200b.c(mainActivity).f4309h).a();
                if (s5 == null) {
                    Y2.z.f4385a.post(new Runnable() { // from class: Y2.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    c2781h.a(new Q(1, "No consentInformation.").a());
                                    break;
                                case 1:
                                    c2781h.a(new Q(3, "No valid response received yet.").a());
                                    break;
                                case 2:
                                    c2781h.a(new Q(3, "Privacy options form is not required.").a());
                                    break;
                                default:
                                    c2781h.a(new Q(3, "Privacy options form is being loading. Please try again later.").a());
                                    break;
                            }
                        }
                    });
                    return true;
                }
                final int i8 = 2;
                if (s5.f4281c.f4344c.get() != null || s5.b() == 2) {
                    if (s5.b() == 2) {
                        Y2.z.f4385a.post(new Runnable() { // from class: Y2.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i8) {
                                    case 0:
                                        c2781h.a(new Q(1, "No consentInformation.").a());
                                        break;
                                    case 1:
                                        c2781h.a(new Q(3, "No valid response received yet.").a());
                                        break;
                                    case 2:
                                        c2781h.a(new Q(3, "Privacy options form is not required.").a());
                                        break;
                                    default:
                                        c2781h.a(new Q(3, "Privacy options form is being loading. Please try again later.").a());
                                        break;
                                }
                            }
                        });
                        return true;
                    }
                    C0207i c0207i = (C0207i) c0209k.f4345d.get();
                    if (c0207i == null) {
                        Y2.z.f4385a.post(new Runnable() { // from class: Y2.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        c2781h.a(new Q(1, "No consentInformation.").a());
                                        break;
                                    case 1:
                                        c2781h.a(new Q(3, "No valid response received yet.").a());
                                        break;
                                    case 2:
                                        c2781h.a(new Q(3, "Privacy options form is not required.").a());
                                        break;
                                    default:
                                        c2781h.a(new Q(3, "Privacy options form is being loading. Please try again later.").a());
                                        break;
                                }
                            }
                        });
                        return true;
                    }
                    c0207i.a(mainActivity, c2781h);
                    c0209k.f4343b.execute(new C0.k(14, c0209k));
                    return true;
                }
                Y2.z.f4385a.post(new Runnable() { // from class: Y2.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                c2781h.a(new Q(1, "No consentInformation.").a());
                                break;
                            case 1:
                                c2781h.a(new Q(3, "No valid response received yet.").a());
                                break;
                            case 2:
                                c2781h.a(new Q(3, "Privacy options form is not required.").a());
                                break;
                            default:
                                c2781h.a(new Q(3, "Privacy options form is being loading. Please try again later.").a());
                                break;
                        }
                    }
                });
                if (s5.d()) {
                    synchronized (s5.f4283e) {
                        z6 = s5.f4285g;
                    }
                    if (!z6) {
                        s5.c(true);
                        C0200b c0200b = s5.f4280b;
                        C0344i c0344i = s5.f4286h;
                        U0.j jVar4 = new U0.j(21, s5);
                        C0117e c0117e = new C0117e(23, s5);
                        c0200b.getClass();
                        ((Executor) c0200b.f4305d).execute(new W(c0200b, mainActivity, c0344i, jVar4, c0117e));
                        return true;
                    }
                }
                Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + s5.d() + ", retryRequestIsInProgress=" + s5.e());
                return true;
            case R.id.nav_record /* 2131296900 */:
                new B4.j().f0(mainActivity.s(), "icp");
                return true;
            case R.id.nav_share /* 2131296901 */:
                B4.y yVar = new B4.y();
                yVar.f763B0 = "google";
                yVar.e0(mainActivity.s(), "share_apk_dialog");
                return true;
            case R.id.nav_suggest /* 2131296902 */:
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) SuggestActivity.class));
                return true;
            case R.id.nav_vip /* 2131296904 */:
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) FreeAdActivity.class));
                return true;
        }
    }

    @Override // R.InterfaceC0188o
    public r0 p(View view, r0 r0Var) {
        NavigationView navigationView = this.f358a;
        if (navigationView.f24158b == null) {
            navigationView.f24158b = new Rect();
        }
        Rect rect = navigationView.f24158b;
        int iB = r0Var.b();
        o0 o0Var = r0Var.f3359a;
        rect.set(iB, r0Var.d(), r0Var.c(), r0Var.a());
        x3.q qVar = navigationView.i;
        qVar.getClass();
        int iD = r0Var.d();
        if (qVar.f24140N != iD) {
            qVar.f24140N = iD;
            int i = (qVar.f24145b.getChildCount() <= 0 && qVar.f24139L) ? qVar.f24140N : 0;
            NavigationMenuView navigationMenuView = qVar.f24144a;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = qVar.f24144a;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, r0Var.a());
        O.b(qVar.f24145b, r0Var);
        navigationView.setWillNotDraw(o0Var.j().equals(J.c.f2006e) || navigationView.f24157a == null);
        navigationView.postInvalidateOnAnimation();
        return o0Var.c();
    }

    @Override // n.InterfaceC2675i
    public void o(MenuC2677k menuC2677k) {
    }
}
