package A2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.C0436Bf;
import com.google.android.gms.internal.ads.C0700Qo;
import com.google.android.gms.internal.ads.C0750Tn;
import com.google.android.gms.internal.ads.C0758Ue;
import com.google.android.gms.internal.ads.C0890af;
import com.google.android.gms.internal.ads.C0969c3;
import com.google.android.gms.internal.ads.C1053de;
import com.google.android.gms.internal.ads.C1268hc;
import j2.C2551g;
import java.util.ArrayDeque;
import java.util.UUID;
import n.C2670d;
import n.MenuC2677k;
import n.ViewOnKeyListenerC2671e;

/* renamed from: A2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0114b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f231c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f233e;

    public /* synthetic */ RunnableC0114b(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f229a = i;
        this.f230b = obj;
        this.f231c = obj2;
        this.f232d = obj3;
        this.f233e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContains;
        e1.h hVarH;
        switch (this.f229a) {
            case 0:
                r rVar = (r) this.f230b;
                String str = (String) this.f231c;
                BinderC0126n binderC0126n = (BinderC0126n) this.f232d;
                C0436Bf c0436Bf = (C0436Bf) this.f233e;
                E e6 = rVar.f319b;
                e6.h();
                synchronized (e6.f160d) {
                    zContains = e6.f157a.contains(str);
                }
                if (zContains || rVar.a()) {
                    return;
                }
                binderC0126n.T2(new S2.b(rVar.f318a), c0436Bf, null);
                return;
            case 1:
                Q q3 = (Q) this.f230b;
                C0750Tn c0750Tn = (C0750Tn) this.f231c;
                ArrayDeque arrayDeque = (ArrayDeque) this.f232d;
                ArrayDeque arrayDeque2 = (ArrayDeque) this.f233e;
                q3.h(c0750Tn, arrayDeque, "to");
                q3.h(c0750Tn, arrayDeque2, "of");
                return;
            case 2:
                E2.b bVar = (E2.b) this.f233e;
                C2551g c2551g = (C2551g) this.f232d;
                Context context = (Context) this.f230b;
                try {
                    new C0758Ue(context, (String) this.f231c).c(c2551g.f21337a, bVar);
                    return;
                } catch (IllegalStateException e7) {
                    C1053de.a(context).e("RewardedAd.load", e7);
                    return;
                }
            case 3:
                C0700Qo c0700Qo = (C0700Qo) this.f233e;
                C2551g c2551g2 = (C2551g) this.f232d;
                Context context2 = (Context) this.f230b;
                try {
                    new C0890af(context2, (String) this.f231c).b(c2551g2.f21337a, c0700Qo);
                    return;
                } catch (IllegalStateException e8) {
                    C1053de.a(context2).e("RewardedInterstitialAd.load", e8);
                    return;
                }
            case 4:
                g1.k kVar = (g1.k) this.f232d;
                UUID uuid = (UUID) this.f230b;
                String string = uuid.toString();
                V0.m mVarF = V0.m.f();
                String str2 = f1.p.f20073c;
                V0.f fVar = (V0.f) this.f231c;
                mVarF.a(str2, "Updating progress for " + uuid + " (" + fVar + ")", new Throwable[0]);
                f1.p pVar = (f1.p) this.f233e;
                WorkDatabase workDatabase = pVar.f20074a;
                WorkDatabase workDatabase2 = pVar.f20074a;
                workDatabase.c();
                try {
                    hVarH = workDatabase2.t().h(string);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (hVarH == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (hVarH.f19909b == 2) {
                    e1.f fVar2 = new e1.f(string, fVar);
                    c1.g gVarS = workDatabase2.s();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) gVarS.f5896b;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((L4.b) gVarS.f5897c).f(fVar2);
                        workDatabase_Impl.m();
                        workDatabase_Impl.j();
                    } catch (Throwable th) {
                        workDatabase_Impl.j();
                        throw th;
                    }
                } else {
                    V0.m.f().i(str2, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.", new Throwable[0]);
                }
                kVar.i(null);
                workDatabase2.m();
                return;
            case 5:
                E2.b bVar2 = (E2.b) this.f233e;
                C2551g c2551g3 = (C2551g) this.f232d;
                Context context3 = (Context) this.f230b;
                try {
                    new C0969c3(context3, (String) this.f231c, c2551g3.f21337a, bVar2).b();
                    return;
                } catch (IllegalStateException e9) {
                    C1053de.a(context3).e("AppOpenAd.load", e9);
                    return;
                }
            case 6:
                ViewOnKeyListenerC2671e viewOnKeyListenerC2671e = (ViewOnKeyListenerC2671e) ((d4.h) this.f233e).f19807b;
                n.m mVar = (n.m) this.f231c;
                C2670d c2670d = (C2670d) this.f230b;
                if (c2670d != null) {
                    viewOnKeyListenerC2671e.f22039N = true;
                    c2670d.f22027b.c(false);
                    viewOnKeyListenerC2671e.f22039N = false;
                }
                if (mVar.isEnabled() && mVar.hasSubMenu()) {
                    ((MenuC2677k) this.f232d).q(mVar, null, 4);
                    return;
                }
                return;
            default:
                E2.b bVar3 = (E2.b) this.f233e;
                C2551g c2551g4 = (C2551g) this.f232d;
                Context context4 = (Context) this.f230b;
                try {
                    new C1268hc(context4, (String) this.f231c).c(c2551g4.f21337a, bVar3);
                    return;
                } catch (IllegalStateException e10) {
                    C1053de.a(context4).e("InterstitialAd.load", e10);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC0114b(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z6) {
        this.f229a = i;
        this.f233e = obj;
        this.f230b = obj2;
        this.f231c = obj3;
        this.f232d = obj4;
    }
}
