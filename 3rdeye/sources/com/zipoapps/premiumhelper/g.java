package com.zipoapps.premiumhelper;

import A8.h;
import A8.k;
import A8.o;
import A9.E;
import J8.C0687b;
import J8.C0690e;
import J8.S;
import J8.x;
import T1.B;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ActivityC1762o;
import androidx.lifecycle.InterfaceC1771d;
import androidx.lifecycle.InterfaceC1790x;
import b9.C1992A;
import b9.n;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import h9.i;
import i8.C4461a;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import p9.p;

/* compiled from: PremiumHelper.kt */
/* loaded from: classes3.dex */
public final class g implements InterfaceC1771d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f37053b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f37054c;

    /* compiled from: PremiumHelper.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$registerProcessLifecycleCallbacks$1$onStart$1$1", f = "PremiumHelper.kt", l = {714}, m = "invokeSuspend")
    public static final class a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f37055l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e f37056m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f37056m = eVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f37056m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f37055l;
            if (i == 0) {
                n.b(obj);
                e eVar = this.f37056m;
                this.f37055l = 1;
                if (eVar.f37027q.l(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    public g(e eVar) {
        this.f37054c = eVar;
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onCreate(InterfaceC1790x interfaceC1790x) {
        this.f37053b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [J8.b, T, android.app.Application$ActivityLifecycleCallbacks] */
    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onStart(InterfaceC1790x interfaceC1790x) {
        int i;
        e eVar = this.f37054c;
        r8.c cVarE = eVar.e();
        c cVar = eVar.i;
        cVarE.g(" *********** APP IS FOREGROUND: " + cVar.i() + " COLD START: " + this.f37053b + " *********** ", new Object[0]);
        e.f37006D.getClass();
        C4461a c4461a = e.a.a().f37021k;
        l.f(c4461a, "<this>");
        c4461a.u("First_app_open", new Bundle[0]);
        if (cVar.j()) {
            B8.c cVar2 = new B8.c(eVar, 5);
            S s10 = eVar.f37032v;
            s10.getClass();
            s10.b(cVar2, new G1.c(1));
        }
        final boolean z10 = true;
        boolean z11 = cVar.f37004a.getInt("app_start_counter", 0) == 0;
        final k kVar = eVar.f37010B;
        x xVar = eVar.f37023m;
        C4461a c4461a2 = eVar.f37021k;
        if (z11) {
            d dVar = eVar.f37012a;
            try {
                PackageInfo packageInfo = dVar.getPackageManager().getPackageInfo(dVar.getPackageName(), 0);
                if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                    eVar.e().l("App was just updated - skipping onboarding and intro!", new Object[0]);
                    c4461a2.i(xVar);
                    SharedPreferences sharedPreferences = cVar.f37004a;
                    int i10 = sharedPreferences.getInt("app_start_counter", 0);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putInt("app_start_counter", i10 + 1);
                    editorEdit.apply();
                    SharedPreferences.Editor editorEdit2 = cVar.f37004a.edit();
                    editorEdit2.putBoolean("is_onboarding_complete", true);
                    editorEdit2.apply();
                    cVar.n(Boolean.TRUE, "intro_complete");
                    k.f(kVar, null, 1);
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        if (cVar.k()) {
            SharedPreferences.Editor editorEdit3 = cVar.f37004a.edit();
            editorEdit3.putBoolean("is_next_app_start_ignored", false);
            editorEdit3.apply();
            return;
        }
        c4461a2.i(xVar);
        final boolean z12 = this.f37053b;
        c cVar3 = kVar.f136b;
        SharedPreferences sharedPreferences2 = cVar3.f37004a;
        if (sharedPreferences2.getBoolean("is_onboarding_complete", false) && (cVar3.i() > 0 || e.a.a().h())) {
            int i11 = sharedPreferences2.getInt("app_start_counter", 0);
            SharedPreferences.Editor editorEdit4 = sharedPreferences2.edit();
            i = i11 + 1;
            editorEdit4.putInt("app_start_counter", i);
            editorEdit4.apply();
        } else {
            i = 0;
        }
        k.f134l = false;
        kVar.f140f = false;
        kVar.f141g = false;
        kVar.f142h = false;
        boolean zJ = cVar3.j();
        d dVar2 = kVar.f135a;
        if (zJ) {
            final boolean z13 = i == 0;
            dVar2.registerActivityLifecycleCallbacks(new A8.l(new p() { // from class: A8.f
                @Override // p9.p
                public final Object invoke(Object obj, Object obj2) {
                    Activity activity = (Activity) obj;
                    Application.ActivityLifecycleCallbacks callbacks = (Application.ActivityLifecycleCallbacks) obj2;
                    kotlin.jvm.internal.l.f(activity, "activity");
                    kotlin.jvm.internal.l.f(callbacks, "callbacks");
                    boolean z14 = activity instanceof AppCompatActivity;
                    k kVar2 = kVar;
                    if (z14 && C0690e.c(activity)) {
                        Intent intent = activity.getIntent();
                        boolean z15 = z13;
                        if (intent == null || intent.getBooleanExtra("show_relaunch", true)) {
                            ActivityC1762o activityC1762o = (ActivityC1762o) activity;
                            kVar2.getClass();
                            com.zipoapps.premiumhelper.e.f37006D.getClass();
                            com.zipoapps.premiumhelper.e eVarA = e.a.a();
                            eVarA.f37025o.g(activityC1762o, B.j(activityC1762o), new e(kVar2, activityC1762o, z15));
                        } else {
                            kVar2.e(z15, activity);
                        }
                    } else {
                        k.f(kVar2, activity, 2);
                    }
                    kVar2.f135a.unregisterActivityLifecycleCallbacks(callbacks);
                    return C1992A.f18074a;
                }
            }));
            return;
        }
        l8.b bVar = kVar.f137c;
        if (i > 0) {
            l8.d<Boolean> PH_SHOW_RELAUNCH_ON_RESUME = i8.d.f38550b0;
            l.e(PH_SHOW_RELAUNCH_ON_RESUME, "PH_SHOW_RELAUNCH_ON_RESUME");
            if (((Boolean) bVar.h(PH_SHOW_RELAUNCH_ON_RESUME)).booleanValue()) {
                dVar2.registerActivityLifecycleCallbacks(new A8.l(new p() { // from class: A8.g
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
                    @Override // p9.p
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
                        /*
                            Method dump skipped, instructions count: 251
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: A8.g.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }));
                return;
            }
            w wVar = new w();
            ?? c0687b = new C0687b(bVar.f43910b.getMainActivityClass(), new o(kVar, wVar));
            wVar.f43660b = c0687b;
            dVar2.registerActivityLifecycleCallbacks(c0687b);
            return;
        }
        l8.d<Boolean> PH_SHOW_INTERSTITIAL_ONBOARDING_BASIC = i8.d.f38546Z;
        l.e(PH_SHOW_INTERSTITIAL_ONBOARDING_BASIC, "PH_SHOW_INTERSTITIAL_ONBOARDING_BASIC");
        if (((Boolean) bVar.h(PH_SHOW_INTERSTITIAL_ONBOARDING_BASIC)).booleanValue()) {
            dVar2.registerActivityLifecycleCallbacks(new A8.l(new h(kVar, 0)));
            return;
        }
        l8.d<Integer> PH_RATEUS_SESSION_START = i8.d.f38536P;
        l.e(PH_RATEUS_SESSION_START, "PH_RATEUS_SESSION_START");
        Integer num = (Integer) bVar.h(PH_RATEUS_SESSION_START);
        if (num != null && num.intValue() == 0) {
            dVar2.registerActivityLifecycleCallbacks(new A8.l(new p() { // from class: A8.f
                @Override // p9.p
                public final Object invoke(Object obj, Object obj2) {
                    Activity activity = (Activity) obj;
                    Application.ActivityLifecycleCallbacks callbacks = (Application.ActivityLifecycleCallbacks) obj2;
                    kotlin.jvm.internal.l.f(activity, "activity");
                    kotlin.jvm.internal.l.f(callbacks, "callbacks");
                    boolean z14 = activity instanceof AppCompatActivity;
                    k kVar2 = kVar;
                    if (z14 && C0690e.c(activity)) {
                        Intent intent = activity.getIntent();
                        boolean z15 = z10;
                        if (intent == null || intent.getBooleanExtra("show_relaunch", true)) {
                            ActivityC1762o activityC1762o = (ActivityC1762o) activity;
                            kVar2.getClass();
                            com.zipoapps.premiumhelper.e.f37006D.getClass();
                            com.zipoapps.premiumhelper.e eVarA = e.a.a();
                            eVarA.f37025o.g(activityC1762o, B.j(activityC1762o), new e(kVar2, activityC1762o, z15));
                        } else {
                            kVar2.e(z15, activity);
                        }
                    } else {
                        k.f(kVar2, activity, 2);
                    }
                    kVar2.f135a.unregisterActivityLifecycleCallbacks(callbacks);
                    return C1992A.f18074a;
                }
            }));
        } else {
            k.f(kVar, null, 1);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onStop(InterfaceC1790x interfaceC1790x) {
        this.f37054c.e().g(" *********** APP IS BACKGROUND *********** ", new Object[0]);
        this.f37053b = false;
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onDestroy(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onPause(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onResume(InterfaceC1790x interfaceC1790x) {
    }
}
