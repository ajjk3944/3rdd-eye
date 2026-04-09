package U7;

import J8.AbstractC0686a;
import J8.C0690e;
import N7.C1154e9;
import P7.s;
import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ActivityC1762o;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.fragment.app.v;
import androidx.fragment.app.x;
import com.android.billingclient.api.ProxyBillingActivity;
import com.zipoapps.premium.relaunch.RelaunchActivity;
import com.zipoapps.premiumhelper.e;
import va.a;

/* compiled from: AutoInterstitialsCoordinator.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.d f12492a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.b f12493b;

    /* renamed from: c, reason: collision with root package name */
    public final C0175a f12494c = new C0175a();

    /* renamed from: d, reason: collision with root package name */
    public final b f12495d = new b();

    /* renamed from: e, reason: collision with root package name */
    public Activity f12496e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentCallbacksC1759l f12497f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12498g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12499h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public long f12500j;

    /* compiled from: AutoInterstitialsCoordinator.kt */
    /* renamed from: U7.a$a, reason: collision with other inner class name */
    public final class C0175a extends AbstractC0686a {
        public C0175a() {
        }

        @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.f(activity, "activity");
            a aVar = a.this;
            aVar.getClass();
            if (activity instanceof ActivityC1762o) {
                ActivityC1762o activityC1762o = (ActivityC1762o) activity;
                x supportFragmentManager = activityC1762o.getSupportFragmentManager();
                b bVar = aVar.f12495d;
                v vVar = supportFragmentManager.f15987m;
                synchronized (vVar.f15958a) {
                    try {
                        int size = vVar.f15958a.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            if (vVar.f15958a.get(i).f15960a == bVar) {
                                vVar.f15958a.remove(i);
                                break;
                            }
                            i++;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                activityC1762o.getSupportFragmentManager().f15987m.f15958a.add(new v.a(aVar.f12495d));
            }
            if (a.this.i || !activity.getClass().getName().equals(a.this.f12493b.f43910b.getMainActivityClass().getName())) {
                return;
            }
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            e.a.a().f37024n.f12498g = true;
            a.this.i = true;
        }

        @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) throws Throwable {
            kotlin.jvm.internal.l.f(activity, "activity");
            a aVar = a.this;
            aVar.getClass();
            aVar.f12500j = System.currentTimeMillis();
            if (aVar.a(activity, null)) {
                a.b bVar = va.a.f47104a;
                bVar.o("a");
                bVar.k(C1154e9.i("ActivityAutoInterstitial: ", activity.getClass().getSimpleName(), " is ignored."), new Object[0]);
            } else {
                a.b bVar2 = va.a.f47104a;
                bVar2.o("a");
                bVar2.k(C1154e9.i("ActivityAutoInterstitial: ", activity.getClass().getSimpleName(), " showing interstitial"), new Object[0]);
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                ((f) e.a.a().f37035y.f1156b).f(activity, new s(0L, 7));
            }
            aVar.f12496e = activity;
        }
    }

    /* compiled from: AutoInterstitialsCoordinator.kt */
    public final class b extends x.k {
        public b() {
        }

        @Override // androidx.fragment.app.x.k
        public final void a(x fm, ComponentCallbacksC1759l currentFragment) throws Throwable {
            kotlin.jvm.internal.l.f(fm, "fm");
            kotlin.jvm.internal.l.f(currentFragment, "currentFragment");
            a aVar = a.this;
            aVar.getClass();
            ActivityC1762o activity = currentFragment.getActivity();
            if (activity == null) {
                return;
            }
            if (aVar.a(activity, currentFragment)) {
                a.b bVar = va.a.f47104a;
                bVar.o("a");
                bVar.k(C1154e9.i("FragmentAutoInterstitial: ", currentFragment.getClass().getSimpleName(), " is ignored."), new Object[0]);
            } else {
                a.b bVar2 = va.a.f47104a;
                bVar2.o("a");
                bVar2.k(C1154e9.i("FragmentAutoInterstitial: ", currentFragment.getClass().getSimpleName(), " showing interstitial"), new Object[0]);
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                ((f) e.a.a().f37035y.f1156b).f(activity, new s(0L, 7));
            }
            aVar.f12497f = currentFragment;
        }
    }

    public a(com.zipoapps.premiumhelper.d dVar, l8.b bVar) {
        this.f12492a = dVar;
        this.f12493b = bVar;
    }

    public final boolean a(Activity activity, ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (activity instanceof ProxyBillingActivity) {
            a.b bVar = va.a.f47104a;
            bVar.o("a");
            bVar.k("ActivityAutoInterstitial: isAutoInterstitialIgnored() | Ignored Activity= ProxyBillingActivity", new Object[0]);
            return true;
        }
        if (activity instanceof RelaunchActivity) {
            a.b bVar2 = va.a.f47104a;
            bVar2.o("a");
            bVar2.k("ActivityAutoInterstitial: isAutoInterstitialIgnored() | Ignored Activity= RelaunchActivity", new Object[0]);
            return true;
        }
        if (activity instanceof o) {
            a.b bVar3 = va.a.f47104a;
            bVar3.o("a");
            bVar3.k("ActivityAutoInterstitial: isAutoInterstitialIgnored() | Ignored Activity= NoAutoInterstitialActivity", new Object[0]);
            return true;
        }
        boolean z10 = this.f12498g || this.f12499h;
        this.f12498g = false;
        if (z10) {
            a.b bVar4 = va.a.f47104a;
            bVar4.o("a");
            bVar4.k("ActivityAutoInterstitial: Skipping interstitial because of 'skipNextActivityInterstitial' activity=" + this.f12498g + " happyMoment=" + this.f12499h, new Object[0]);
        }
        if (z10) {
            a.b bVar5 = va.a.f47104a;
            bVar5.o("a");
            bVar5.k("ActivityAutoInterstitial: isAutoInterstitialIgnored() | Ignored checkActivityIgnoreBySkipping(). Activity=".concat(activity.getClass().getSimpleName()), new Object[0]);
            return true;
        }
        if (activity instanceof AppCompatActivity) {
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            e.a.a().f37025o.getClass();
            if (com.zipoapps.premiumhelper.ui.rate.f.b(activity)) {
                a.b bVar6 = va.a.f47104a;
                bVar6.o("a");
                bVar6.k("ActivityAutoInterstitial: isAutoInterstitialIgnored() | Ignored, rateHelper is showing. Activity=".concat(activity.getClass().getSimpleName()), new Object[0]);
                return true;
            }
        }
        if (C0690e.b(activity)) {
            a.b bVar7 = va.a.f47104a;
            bVar7.o("a");
            bVar7.k("ActivityAutoInterstitial: isAutoInterstitialIgnored() | Ignored isAdActivity = true. Activity=".concat(activity.getClass().getSimpleName()), new Object[0]);
            return true;
        }
        A8.k.f132j.getClass();
        if (!A8.k.f134l) {
            a.b bVar8 = va.a.f47104a;
            bVar8.o("a");
            bVar8.k("ActivityAutoInterstitial: isAutoInterstitialIgnored() | Ignored isRelaunchComplete = false. Activity=".concat(activity.getClass().getSimpleName()), new Object[0]);
            return true;
        }
        String name = activity.getClass().getName();
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        Class<? extends Activity> introActivityClass = e.a.a().f37020j.f43910b.getIntroActivityClass();
        if (name.equals(introActivityClass != null ? introActivityClass.getName() : null)) {
            a.b bVar9 = va.a.f47104a;
            bVar9.o("a");
            bVar9.k("ActivityAutoInterstitial: isAutoInterstitialIgnored() | Ignored IntroActivity. Activity=".concat(activity.getClass().getSimpleName()), new Object[0]);
            return true;
        }
        Activity activity2 = this.f12496e;
        if (activity2 != null && C0690e.b(activity2)) {
            a.b bVar10 = va.a.f47104a;
            bVar10.o("a");
            bVar10.k("ActivityAutoInterstitial: isAutoInterstitialIgnored() | Ignored, previousActivity is AdActivity. Activity=".concat(activity.getClass().getSimpleName()), new Object[0]);
            return true;
        }
        if (componentCallbacksC1759l == null) {
            Activity activity3 = this.f12496e;
            if (kotlin.jvm.internal.l.b(activity3 != null ? activity3.getClass().getName() : null, activity.getClass().getName())) {
                a.b bVar11 = va.a.f47104a;
                bVar11.o("a");
                bVar11.k("ActivityAutoInterstitial: isAutoInterstitialIgnored() | Ignored, previousActivity is the same as . Activity=".concat(activity.getClass().getSimpleName()), new Object[0]);
                return true;
            }
        }
        if (componentCallbacksC1759l != null && System.currentTimeMillis() - this.f12500j <= 150) {
            a.b bVar12 = va.a.f47104a;
            bVar12.o("a");
            bVar12.k(C1154e9.i("FragmentAutoInterstitial: ", componentCallbacksC1759l.getClass().getSimpleName(), " is skipped by lastHandleActivityResume."), new Object[0]);
            return true;
        }
        if (componentCallbacksC1759l != null) {
            ComponentCallbacksC1759l componentCallbacksC1759l2 = this.f12497f;
            if (kotlin.jvm.internal.l.b(componentCallbacksC1759l2 != null ? componentCallbacksC1759l2.getClass().getName() : null, componentCallbacksC1759l.getClass().getName())) {
                a.b bVar13 = va.a.f47104a;
                bVar13.o("a");
                bVar13.k("FragmentAutoInterstitial: isAutoInterstitialIgnored() | Ignored same fragment called twice. Fragment=".concat(componentCallbacksC1759l.getClass().getSimpleName()), new Object[0]);
                return true;
            }
        }
        if (componentCallbacksC1759l != null) {
            boolean z11 = this.f12499h;
            if (z11) {
                a.b bVar14 = va.a.f47104a;
                bVar14.o("a");
                bVar14.k("FragmentAutoInterstitial: Skipping interstitial because of 'skipNextFragmentInterstitial' fragment=false happyMoment=" + this.f12499h, new Object[0]);
            }
            if (z11) {
                a.b bVar15 = va.a.f47104a;
                bVar15.o("a");
                bVar15.k("FragmentAutoInterstitial: isAutoInterstitialIgnored() | Ignored checkFragmentIgnoreBySkipping. Fragment=".concat(componentCallbacksC1759l.getClass().getSimpleName()), new Object[0]);
                return true;
            }
        }
        if (componentCallbacksC1759l == null || !y9.n.T(componentCallbacksC1759l.getClass().getName(), "NavHostFragment")) {
            return false;
        }
        a.b bVar16 = va.a.f47104a;
        bVar16.o("a");
        bVar16.k("FragmentAutoInterstitial: isAutoInterstitialIgnored() | Ignored NavHostFragment of navController. Fragment=".concat(componentCallbacksC1759l.getClass().getSimpleName()), new Object[0]);
        return true;
    }
}
