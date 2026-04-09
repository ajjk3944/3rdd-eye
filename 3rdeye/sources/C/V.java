package C;

import N7.C1154e9;
import S5.f;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.l;
import b2.C1842w;
import b2.InterfaceC1843x;
import c.ActivityC2008f;
import com.applovin.impl.C2158z0;
import com.applovin.impl.b8;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.e3;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.s1;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.vungle.ads.C4055m;
import com.vungle.ads.L;
import com.vungle.ads.internal.c;
import com.yandex.mobile.ads.impl.A3;
import d0.s;
import d2.AbstractC4266a;
import d2.C4268c;
import f2.RunnableC4331a;
import io.appmetrica.analytics.impl.C4572e;
import io.appmetrica.analytics.impl.C4859p1;
import io.appmetrica.analytics.impl.C4961t0;
import java.util.ArrayList;
import z0.C5848a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class V implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f658c;

    public /* synthetic */ V(Object obj, int i) {
        this.f657b = i;
        this.f658c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        Animation animationLoadAnimation = null;
        int i = 0;
        switch (this.f657b) {
            case 0:
                ((W) this.f658c).o();
                return;
            case 1:
                ((E.D) this.f658c).b();
                return;
            case 2:
                ((k0) this.f658c).d();
                return;
            case 3:
                int i10 = ContentLoadingProgressBar.f15501d;
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) this.f658c;
                contentLoadingProgressBar.getClass();
                System.currentTimeMillis();
                contentLoadingProgressBar.setVisibility(0);
                return;
            case 4:
                S5.f this$0 = (S5.f) this.f658c;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                f.a aVar = this$0.f11918c;
                int i11 = aVar.f11936K;
                if (i11 != Integer.MIN_VALUE) {
                    animationLoadAnimation = AnimationUtils.loadAnimation(this$0.f11917b, i11);
                } else {
                    int i12 = f.d.f11973e[aVar.f11935J.ordinal()];
                    if (i12 != 1) {
                        if (i12 == 2) {
                            int i13 = f.d.f11969a[aVar.f11954n.ordinal()];
                            if (i13 == 1) {
                                i11 = R.anim.balloon_shake_top;
                            } else if (i13 == 2) {
                                i11 = R.anim.balloon_shake_bottom;
                            } else if (i13 == 3) {
                                i11 = R.anim.balloon_shake_right;
                            } else {
                                if (i13 != 4) {
                                    throw new b9.j();
                                }
                                i11 = R.anim.balloon_shake_left;
                            }
                        } else if (i12 == 3) {
                            i11 = R.anim.balloon_fade;
                        }
                    } else if (aVar.f11949h) {
                        int i14 = f.d.f11969a[aVar.f11954n.ordinal()];
                        if (i14 == 1) {
                            i11 = R.anim.balloon_heartbeat_top;
                        } else if (i14 == 2) {
                            i11 = R.anim.balloon_heartbeat_bottom;
                        } else if (i14 == 3) {
                            i11 = R.anim.balloon_heartbeat_right;
                        } else {
                            if (i14 != 4) {
                                throw new b9.j();
                            }
                            i11 = R.anim.balloon_heartbeat_left;
                        }
                    } else {
                        i11 = R.anim.balloon_heartbeat_center;
                    }
                    animationLoadAnimation = AnimationUtils.loadAnimation(this$0.f11917b, i11);
                }
                if (animationLoadAnimation != null) {
                    this$0.f11919d.f12291b.startAnimation(animationLoadAnimation);
                    return;
                }
                return;
            case 5:
                V1.d.d((V1.d) this.f658c);
                return;
            case 6:
                androidx.fragment.app.I.c((ArrayList) this.f658c, 4);
                return;
            case 7:
                CoroutineWorker._init_$lambda$0((CoroutineWorker) this.f658c);
                return;
            case 8:
                ActivityC2008f.ViewTreeObserverOnDrawListenerC0276f this$02 = (ActivityC2008f.ViewTreeObserverOnDrawListenerC0276f) this.f658c;
                kotlin.jvm.internal.l.f(this$02, "this$0");
                Runnable runnable = this$02.f18277c;
                if (runnable != null) {
                    runnable.run();
                    this$02.f18277c = null;
                    return;
                }
                return;
            case 9:
                b8.a((WebView) this.f658c);
                return;
            case 10:
                AppLovinBroadcastManager.sendBroadcastSync((CommunicatorMessageImpl) this.f658c, null);
                return;
            case 11:
                ((e3) this.f658c).notifyDataSetChanged();
                return;
            case 12:
                ((MaxAdViewImpl) this.f658c).c();
                return;
            case 13:
                ((com.applovin.impl.mediation.h) this.f658c).l();
                return;
            case 14:
                ((s1) this.f658c).G();
                return;
            case 15:
                ((s4) this.f658c).c();
                return;
            case 16:
                ((com.applovin.impl.sdk.d) this.f658c).c();
                return;
            case 17:
                ((C2158z0) this.f658c).j();
                return;
            case 18:
                C4055m.m118init$lambda1((com.vungle.ads.internal.executor.i) this.f658c);
                return;
            case 19:
                L.b.m19onAdEnd$lambda2((com.vungle.ads.L) this.f658c);
                return;
            case 20:
                c.a.m36onAdImpression$lambda1((com.vungle.ads.internal.c) this.f658c);
                return;
            case 21:
                d0.s sVar = (d0.s) this.f658c;
                if (sVar.f37279w) {
                    S.g(sVar.f37258a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                    sVar.f37280x = null;
                    sVar.l();
                    sVar.f37279w = false;
                    return;
                }
                return;
            case 22:
                ((s.c) this.f658c).b();
                return;
            case 23:
                View view = (View) this.f658c;
                ((InputMethodManager) C5848a.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 24:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f658c;
                if (constraintTrackingWorker.f16942e.f37349b instanceof AbstractC4266a.b) {
                    return;
                }
                String strH = constraintTrackingWorker.getInputData().h("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                androidx.work.m mVarE = androidx.work.m.e();
                kotlin.jvm.internal.l.e(mVarE, "get()");
                if (strH == null || strH.length() == 0) {
                    mVarE.c(f2.b.f37814a, "No worker to delegate to.");
                    C4268c<l.a> future = constraintTrackingWorker.f16942e;
                    kotlin.jvm.internal.l.e(future, "future");
                    future.i(new l.a.C0267a());
                    return;
                }
                androidx.work.l lVarA = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), strH, constraintTrackingWorker.f16939b);
                constraintTrackingWorker.f16943f = lVarA;
                if (lVarA == null) {
                    mVarE.a(f2.b.f37814a, "No worker to delegate to.");
                    C4268c<l.a> future2 = constraintTrackingWorker.f16942e;
                    kotlin.jvm.internal.l.e(future2, "future");
                    future2.i(new l.a.C0267a());
                    return;
                }
                T1.z zVarC = T1.z.c(constraintTrackingWorker.getApplicationContext());
                kotlin.jvm.internal.l.e(zVarC, "getInstance(applicationContext)");
                InterfaceC1843x interfaceC1843xY = zVarC.f12232c.y();
                String string = constraintTrackingWorker.getId().toString();
                kotlin.jvm.internal.l.e(string, "id.toString()");
                C1842w c1842wU = interfaceC1843xY.u(string);
                if (c1842wU == null) {
                    C4268c<l.a> future3 = constraintTrackingWorker.f16942e;
                    kotlin.jvm.internal.l.e(future3, "future");
                    String str = f2.b.f37814a;
                    future3.i(new l.a.C0267a());
                    return;
                }
                G5.c cVar = zVarC.f12239k;
                kotlin.jvm.internal.l.e(cVar, "workManagerImpl.trackers");
                X1.e eVar = new X1.e(cVar);
                A9.A a10 = zVarC.f12233d.a();
                kotlin.jvm.internal.l.e(a10, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
                constraintTrackingWorker.f16942e.addListener(new RunnableC4331a(X1.h.a(eVar, c1842wU, a10, constraintTrackingWorker), i), new c2.x());
                if (!eVar.a(c1842wU)) {
                    mVarE.a(f2.b.f37814a, "Constraints not met for delegate " + strH + ". Requesting retry.");
                    C4268c<l.a> future4 = constraintTrackingWorker.f16942e;
                    kotlin.jvm.internal.l.e(future4, "future");
                    future4.i(new l.a.b());
                    return;
                }
                mVarE.a(f2.b.f37814a, "Constraints met for delegate ".concat(strH));
                try {
                    androidx.work.l lVar = constraintTrackingWorker.f16943f;
                    kotlin.jvm.internal.l.c(lVar);
                    A4.a<l.a> aVarStartWork = lVar.startWork();
                    kotlin.jvm.internal.l.e(aVarStartWork, "delegate!!.startWork()");
                    aVarStartWork.addListener(new A3(5, constraintTrackingWorker, aVarStartWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    String str2 = f2.b.f37814a;
                    mVarE.b(str2, C1154e9.i("Delegated worker ", strH, " threw exception in startWork."), th);
                    synchronized (constraintTrackingWorker.f16940c) {
                        try {
                            if (!constraintTrackingWorker.f16941d) {
                                C4268c<l.a> future5 = constraintTrackingWorker.f16942e;
                                kotlin.jvm.internal.l.e(future5, "future");
                                future5.i(new l.a.C0267a());
                                return;
                            } else {
                                mVarE.a(str2, "Constraints were unmet, Retrying.");
                                C4268c<l.a> future6 = constraintTrackingWorker.f16942e;
                                kotlin.jvm.internal.l.e(future6, "future");
                                future6.i(new l.a.b());
                                return;
                            }
                        } finally {
                        }
                    }
                }
            case 25:
                ((h5.b) this.f658c).c();
                return;
            case 26:
                ((C4572e) this.f658c).a();
                return;
            case 27:
                ((C4859p1) this.f658c).e();
                return;
            case 28:
                ((C4961t0) this.f658c).o();
                return;
            default:
                SideSheetBehavior.c cVar2 = (SideSheetBehavior.c) this.f658c;
                cVar2.f23028b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                V0.c cVar3 = sideSheetBehavior.i;
                if (cVar3 != null && cVar3.g()) {
                    cVar2.a(cVar2.f23027a);
                    return;
                } else {
                    if (sideSheetBehavior.f23011h == 2) {
                        sideSheetBehavior.s(cVar2.f23027a);
                        return;
                    }
                    return;
                }
        }
    }
}
