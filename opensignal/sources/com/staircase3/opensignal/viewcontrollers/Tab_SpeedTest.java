package com.staircase3.opensignal.viewcontrollers;

import a8.f;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.e0;
import bf.n;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.y3;
import com.staircase3.opensignal.activities.SpeedTestActivity;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedResultActivity;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedTestResult;
import com.staircase3.opensignal.goldstar.widget.DateTimeView;
import com.staircase3.opensignal.goldstar.widget.NetworkInfoView;
import com.staircase3.opensignal.goldstar.widget.TestStatusView;
import com.staircase3.opensignal.models.NetworkUiState;
import com.staircase3.opensignal.utils.k;
import com.staircase3.opensignal.utils.r;
import com.staircase3.opensignal.utils.u;
import com.staircase3.opensignal.views.SpeedDialView;
import cq.h;
import i.j;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import lq.q;
import o2.g;
import pq.i;
import qm.l;
import wt.w;

/* loaded from: classes.dex */
public class Tab_SpeedTest extends l {
    public static boolean V0 = false;
    public SpeedTestResult A0;
    public ValueAnimator B0;
    public ValueAnimator C0;
    public ValueAnimator D0;
    public f G0;
    public g H0;
    public fl.b I0;
    public LinearLayout M0;
    public OnSpeedTestStateChangeListener N0;
    public final e0 R0;
    public final SpeedInventor S0;
    public int T0;
    public int U0;

    /* renamed from: x0, reason: collision with root package name */
    public ProgressBar f6246x0;

    /* renamed from: y0, reason: collision with root package name */
    public SpeedDialView f6247y0;

    /* renamed from: z0, reason: collision with root package name */
    public View f6248z0;
    public final LinearInterpolator E0 = new LinearInterpolator();
    public boolean F0 = false;
    public NetworkUiState J0 = new NetworkUiState();
    public final Object K0 = y3.A(jn.c.class);
    public final Object L0 = y3.A(qm.e.class);
    public final Object O0 = y3.A(qm.f.class);
    public final Object P0 = y3.A(r.class);
    public final Object Q0 = y3.A(tm.e.class);

    /* renamed from: com.staircase3.opensignal.viewcontrollers.Tab_SpeedTest$8, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass8 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6262a;

        static {
            int[] iArr = new int[gm.b.values().length];
            f6262a = iArr;
            try {
                iArr[gm.b.LATENCY_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6262a[gm.b.LATENCY_RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6262a[gm.b.LATENCY_FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6262a[gm.b.DOWNLOAD_STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6262a[gm.b.DOWNLOAD_RUNNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6262a[gm.b.DOWNLOAD_FINISHED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6262a[gm.b.UPLOAD_STARTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6262a[gm.b.UPLOAD_RUNNING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6262a[gm.b.UPLOAD_FINISHED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6262a[gm.b.UNMAPPED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface OnSpeedTestStateChangeListener {
    }

    public static class SpeedInventor {

        /* renamed from: f, reason: collision with root package name */
        public static Random f6263f;

        /* renamed from: a, reason: collision with root package name */
        public long f6264a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f6265b = 0;

        /* renamed from: c, reason: collision with root package name */
        public long f6266c;

        /* renamed from: d, reason: collision with root package name */
        public final float f6267d;

        /* renamed from: e, reason: collision with root package name */
        public final float f6268e;

        public SpeedInventor(float f10, float f11) {
            this.f6268e = f10;
            this.f6267d = f11;
            f6263f = new Random();
        }

        public static long a(SpeedInventor speedInventor) {
            if (speedInventor.f6264a <= 0) {
                return -1L;
            }
            if (speedInventor.f6266c == 0) {
                return -1L;
            }
            return speedInventor.f6265b + f6263f.nextInt((int) r0);
        }

        public static void b(SpeedInventor speedInventor, long j) {
            if (j < 0) {
                speedInventor.getClass();
                return;
            }
            speedInventor.f6264a = j;
            float f10 = j;
            long jRound = Math.round((speedInventor.f6267d + 1.0f) * f10);
            long jRound2 = Math.round((1.0f - speedInventor.f6268e) * f10);
            speedInventor.f6265b = jRound2;
            speedInventor.f6266c = jRound - jRound2;
        }
    }

    public static class SpeedTestServiceListener implements em.a {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f6269a;

        public SpeedTestServiceListener(Tab_SpeedTest tab_SpeedTest) {
            this.f6269a = new WeakReference(tab_SpeedTest);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
        @Override // em.a
        public final void a() {
            final Tab_SpeedTest tab_SpeedTest = (Tab_SpeedTest) this.f6269a.get();
            if (tab_SpeedTest != null) {
                ?? r12 = tab_SpeedTest.O0;
                if (Tab_SpeedTest.V0) {
                    return;
                }
                Context contextX = tab_SpeedTest.X();
                ((qm.f) r12.getValue()).getClass();
                if (qm.f.a(contextX)) {
                    ((qm.f) r12.getValue()).getClass();
                    if (qm.f.c(contextX, "android.permission.READ_PHONE_STATE")) {
                        j jVarL = tab_SpeedTest.l();
                        if (jVarL == null || !tab_SpeedTest.i0()) {
                            return;
                        }
                        jVarL.runOnUiThread(new Runnable() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_SpeedTest.2
                            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
                            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, lq.h] */
                            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, lq.h] */
                            @Override // java.lang.Runnable
                            public final void run() throws Resources.NotFoundException {
                                Tab_SpeedTest tab_SpeedTest2 = Tab_SpeedTest.this;
                                jn.c cVar = (jn.c) tab_SpeedTest2.K0.getValue();
                                cVar.getClass();
                                if (((Boolean) w.w(i.f20621a, new h(cVar, null, 3))).booleanValue()) {
                                    Tab_SpeedTest.V0 = true;
                                    tab_SpeedTest2.f6246x0.setProgress(0);
                                    tab_SpeedTest2.m0(gm.b.LATENCY_RUNNING);
                                }
                                tm.c cVarB = ((tm.e) tab_SpeedTest2.Q0.getValue()).b(((r) tab_SpeedTest2.P0.getValue()).a(tab_SpeedTest2.X()));
                                f fVar = tab_SpeedTest2.G0;
                                tab_SpeedTest2.X();
                                fVar.getClass();
                                f.A(new d4.w(fVar, cVarB, null, 2));
                                tab_SpeedTest2.j0(true);
                            }
                        });
                        return;
                    }
                }
                j jVarL2 = tab_SpeedTest.l();
                if (jVarL2 == null || !tab_SpeedTest.i0()) {
                    return;
                }
                ((qm.f) r12.getValue()).getClass();
                qm.f.e(jVarL2);
            }
        }

        @Override // em.a
        public final void b(final gm.a aVar, final SpeedTestResult speedTestResult, final long j) {
            Objects.toString(aVar);
            Objects.toString(speedTestResult);
            final Tab_SpeedTest tab_SpeedTest = (Tab_SpeedTest) this.f6269a.get();
            final NetworkUiState networkUiState = ((Tab_SpeedTest) this.f6269a.get()).J0;
            if (tab_SpeedTest != null) {
                Objects.toString(aVar);
                Objects.toString(speedTestResult);
                if (aVar.f9627a == gm.b.UPLOAD_FINISHED) {
                    Tab_SpeedTest.V0 = false;
                    tab_SpeedTest.j0(false);
                    if (speedTestResult != null) {
                        synchronized (tab_SpeedTest) {
                            bm.d dVarL = ic.a.s(tab_SpeedTest.n()).l();
                            com.staircase3.opensignal.utils.l lVar = networkUiState.D;
                            br.l.e(lVar, "<set-?>");
                            speedTestResult.K = lVar;
                            dVarL.K(speedTestResult);
                        }
                    }
                }
                final j jVarL = tab_SpeedTest.l();
                if (jVarL == null || !tab_SpeedTest.i0()) {
                    return;
                }
                jVarL.runOnUiThread(new Runnable() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_SpeedTest.7
                    @Override // java.lang.Runnable
                    public final void run() throws Resources.NotFoundException {
                        final Tab_SpeedTest tab_SpeedTest2 = Tab_SpeedTest.this;
                        SpeedInventor speedInventor = tab_SpeedTest2.S0;
                        SpeedTestResult speedTestResult2 = speedTestResult;
                        tab_SpeedTest2.A0 = speedTestResult2;
                        gm.a aVar2 = aVar;
                        gm.b bVar = aVar2.f9627a;
                        boolean z10 = aVar2.f9628b;
                        int i10 = AnonymousClass8.f6262a[bVar.ordinal()];
                        j jVar = jVarL;
                        switch (i10) {
                            case 1:
                                tab_SpeedTest2.m0(gm.b.LATENCY_RUNNING);
                                return;
                            case 2:
                                tab_SpeedTest2.m0(bVar);
                                long j7 = speedTestResult2.f6099x;
                                boolean z11 = tab_SpeedTest2.F0;
                                if (!z11 && !z11) {
                                    tab_SpeedTest2.F0 = true;
                                    LinearLayout linearLayout = tab_SpeedTest2.M0;
                                    linearLayout.setVisibility(8);
                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) linearLayout.findViewById(qk.h.spinner_animation_view);
                                    lottieAnimationView.H = false;
                                    lottieAnimationView.D.j();
                                    tab_SpeedTest2.D0 = ValueAnimator.ofInt(1, 30);
                                    final SpeedInventor speedInventor2 = new SpeedInventor(0.1f, 0.1f);
                                    tab_SpeedTest2.D0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_SpeedTest.3
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            Tab_SpeedTest tab_SpeedTest3 = Tab_SpeedTest.this;
                                            if (iIntValue != tab_SpeedTest3.T0) {
                                                tab_SpeedTest3.T0 = iIntValue;
                                                SpeedTestResult speedTestResult3 = tab_SpeedTest3.A0;
                                                if (speedTestResult3 != null) {
                                                    boolean z12 = speedTestResult3.L;
                                                    SpeedInventor speedInventor3 = speedInventor2;
                                                    if (!z12 && iIntValue != 30) {
                                                        Tab_SpeedTest.h0(tab_SpeedTest3, SpeedInventor.a(speedInventor3));
                                                        return;
                                                    }
                                                    long j10 = speedTestResult3.f6099x;
                                                    SpeedInventor.b(speedInventor3, j10);
                                                    Tab_SpeedTest.h0(tab_SpeedTest3, j10);
                                                }
                                            }
                                        }
                                    });
                                    tab_SpeedTest2.D0.setDuration(9800L);
                                    tab_SpeedTest2.D0.setInterpolator(tab_SpeedTest2.E0);
                                    tab_SpeedTest2.D0.start();
                                    ic.a.n(tab_SpeedTest2.f6247y0);
                                    SpeedDialView speedDialView = tab_SpeedTest2.f6247y0;
                                    speedDialView.f6345x = true;
                                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
                                    valueAnimatorOfFloat.setDuration(speedDialView.T);
                                    valueAnimatorOfFloat.setRepeatCount(-1);
                                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                    valueAnimatorOfFloat.addUpdateListener(new bq.b(4, speedDialView));
                                    speedDialView.U = valueAnimatorOfFloat;
                                    valueAnimatorOfFloat.start();
                                }
                                if (tab_SpeedTest2.F0 && z10) {
                                    tab_SpeedTest2.l0(jVar);
                                    return;
                                }
                                return;
                            case 3:
                                ValueAnimator valueAnimator = tab_SpeedTest2.D0;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                SpeedDialView speedDialView2 = tab_SpeedTest2.f6247y0;
                                speedDialView2.f6345x = false;
                                ValueAnimator valueAnimator2 = speedDialView2.U;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                                if (z10) {
                                    tab_SpeedTest2.l0(jVar);
                                    return;
                                }
                                g gVar = tab_SpeedTest2.H0;
                                String str = "" + speedTestResult2.f6099x;
                                gVar.getClass();
                                br.l.e(str, "latency");
                                al.c cVar = (al.c) gVar.f18754d;
                                if (cVar == null) {
                                    br.l.l("binding");
                                    throw null;
                                }
                                ((TextView) cVar.f823e).setText(str);
                                g gVar2 = tab_SpeedTest2.H0;
                                Integer numB0 = gVar2.b0(qk.d.complementary_3);
                                if (numB0 != null) {
                                    int iIntValue = numB0.intValue();
                                    al.c cVar2 = (al.c) gVar2.f18754d;
                                    if (cVar2 != null) {
                                        ((TextView) cVar2.f823e).setTextColor(iIntValue);
                                        return;
                                    } else {
                                        br.l.l("binding");
                                        throw null;
                                    }
                                }
                                return;
                            case 4:
                                if (z10) {
                                    return;
                                }
                                tab_SpeedTest2.m0(bVar);
                                ic.a.n(tab_SpeedTest2.f6246x0);
                                tab_SpeedTest2.B0 = ValueAnimator.ofInt(0, 50);
                                final SpeedInventor speedInventor3 = new SpeedInventor(0.005f, 0.005f);
                                tab_SpeedTest2.B0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_SpeedTest.4
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) throws NumberFormatException {
                                        Tab_SpeedTest tab_SpeedTest3 = Tab_SpeedTest.this;
                                        if (tab_SpeedTest3.i0()) {
                                            int iIntValue2 = ((Integer) valueAnimator3.getAnimatedValue()).intValue();
                                            tab_SpeedTest3.f6246x0.setProgress(iIntValue2);
                                            if (iIntValue2 == 100) {
                                                tab_SpeedTest3.k0();
                                            }
                                            SpeedTestResult speedTestResult3 = tab_SpeedTest3.A0;
                                            boolean z12 = speedTestResult3.M;
                                            SpeedInventor speedInventor4 = speedInventor3;
                                            if (!z12) {
                                                Tab_SpeedTest.g0(tab_SpeedTest3, SpeedInventor.a(speedInventor4));
                                            } else {
                                                SpeedInventor.b(speedInventor4, speedTestResult3.f6097g);
                                                Tab_SpeedTest.g0(tab_SpeedTest3, speedInventor4.f6264a);
                                            }
                                        }
                                    }
                                });
                                tab_SpeedTest2.B0.setDuration(tab_SpeedTest2.A0.O);
                                ValueAnimator.setFrameDelay(40L);
                                tab_SpeedTest2.B0.start();
                                return;
                            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            default:
                                return;
                            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                tab_SpeedTest2.k0();
                                return;
                            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                                tab_SpeedTest2.m0(bVar);
                                SpeedInventor.b(speedInventor, tab_SpeedTest2.A0.f6098r);
                                ic.a.n(tab_SpeedTest2.f6246x0);
                                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(50, 100);
                                tab_SpeedTest2.C0 = valueAnimatorOfInt;
                                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_SpeedTest.5
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) throws NumberFormatException {
                                        Tab_SpeedTest tab_SpeedTest3 = Tab_SpeedTest.this;
                                        if (tab_SpeedTest3.i0()) {
                                            int iIntValue2 = ((Integer) valueAnimator3.getAnimatedValue()).intValue();
                                            tab_SpeedTest3.f6246x0.setProgress(iIntValue2);
                                            if (iIntValue2 != tab_SpeedTest3.U0) {
                                                tab_SpeedTest3.U0 = iIntValue2;
                                                if (tab_SpeedTest3.A0 != null) {
                                                    long jA = SpeedInventor.a(tab_SpeedTest3.S0);
                                                    if (tab_SpeedTest3.i0() && jA > 0) {
                                                        tab_SpeedTest3.n0(jA, SpeedDialView.a.UPLOAD);
                                                        com.staircase3.opensignal.utils.g gVarA = com.staircase3.opensignal.utils.i.a(jA);
                                                        String strR = tab_SpeedTest3.r(gVarA.f6181b.getResourceId());
                                                        g gVar3 = tab_SpeedTest3.H0;
                                                        String str2 = gVarA.f6180a;
                                                        gVar3.getClass();
                                                        br.l.e(str2, "upload");
                                                        br.l.e(strR, "unit");
                                                        al.c cVar3 = (al.c) gVar3.f18754d;
                                                        if (cVar3 == null) {
                                                            br.l.l("binding");
                                                            throw null;
                                                        }
                                                        ((TextView) cVar3.k).setText(str2);
                                                        ((TextView) cVar3.j).setText(strR);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                });
                                tab_SpeedTest2.C0.setDuration(tab_SpeedTest2.A0.P);
                                ValueAnimator.setFrameDelay(40L);
                                tab_SpeedTest2.C0.start();
                                return;
                            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                                SpeedInventor.b(speedInventor, tab_SpeedTest2.A0.f6098r);
                                return;
                            case 9:
                                Tab_SpeedTest.V0 = false;
                                tab_SpeedTest2.j0(false);
                                Objects.toString(speedTestResult2);
                                if (tab_SpeedTest2.n() != null) {
                                    int i11 = SpeedResultActivity.f6092c0;
                                    Context contextN = tab_SpeedTest2.n();
                                    br.l.e(contextN, "context");
                                    br.l.e(speedTestResult2, "mySpeedTestResult");
                                    NetworkUiState networkUiState2 = networkUiState;
                                    br.l.e(networkUiState2, "networkUiState");
                                    Intent intent = new Intent(contextN, (Class<?>) SpeedResultActivity.class);
                                    intent.putExtra("INTENT_EXTRA_SPEED_TEST_RESULT", speedTestResult2);
                                    intent.putExtra("INTENT_EXTRA_NETWORK_STATE_RESULT", networkUiState2);
                                    intent.putExtra("INTENT_EXTRA_TASK_ID", j);
                                    contextN.startActivity(intent);
                                    if (tab_SpeedTest2.l() != null) {
                                        tab_SpeedTest2.l().finish();
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
    }

    public Tab_SpeedTest() {
        y3.A(k.class);
        this.R0 = new e0() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_SpeedTest.1
            @Override // androidx.lifecycle.e0
            public final void b(Object obj) {
                NetworkUiState networkUiState = (NetworkUiState) obj;
                Objects.toString(networkUiState);
                Tab_SpeedTest tab_SpeedTest = Tab_SpeedTest.this;
                tab_SpeedTest.J0 = networkUiState;
                g gVar = tab_SpeedTest.H0;
                gVar.getClass();
                br.l.e(networkUiState, "networkUiState");
                al.c cVar = (al.c) gVar.f18754d;
                if (cVar != null) {
                    ((NetworkInfoView) cVar.f824f).setNetworkInformation(networkUiState);
                } else {
                    br.l.l("binding");
                    throw null;
                }
            }
        };
        this.S0 = new SpeedInventor(0.005f, 0.005f);
        this.T0 = -1;
        this.U0 = -1;
    }

    public static void g0(Tab_SpeedTest tab_SpeedTest, long j) throws NumberFormatException {
        if (tab_SpeedTest.i0() && j > 0) {
            tab_SpeedTest.n0(j, SpeedDialView.a.DOWNLOAD);
            com.staircase3.opensignal.utils.g gVarA = com.staircase3.opensignal.utils.i.a(j);
            tab_SpeedTest.H0.h0(gVarA.f6180a, tab_SpeedTest.r(gVarA.f6181b.getResourceId()));
        }
    }

    public static void h0(Tab_SpeedTest tab_SpeedTest, long j) {
        if (tab_SpeedTest.i0()) {
            if (j < 0) {
                j = -1;
            }
            String str = j != -1 ? com.staircase3.opensignal.utils.i.f6182a.format(j) : "---";
            g gVar = tab_SpeedTest.H0;
            gVar.getClass();
            br.l.e(str, "latency");
            al.c cVar = (al.c) gVar.f18754d;
            if (cVar != null) {
                ((TextView) cVar.f823e).setText(str);
            } else {
                br.l.l("binding");
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, lq.h] */
    @Override // androidx.fragment.app.b
    public final void D(Bundle bundle) {
        super.D(bundle);
        b0();
        Objects.toString(bundle);
        this.I0 = ((fl.c) y3.s(fl.c.class)).a();
        jn.c cVar = (jn.c) this.K0.getValue();
        cVar.getClass();
        f fVar = new f(new kj.a(new aj.c(ch.l.f3962t5.d())), (xj.l) cVar.f13788y.getValue(), (fm.k) cVar.f13787x.getValue(), (fm.j) cVar.f13786r.getValue(), (fm.i) cVar.f13785g.getValue());
        this.G0 = fVar;
        fVar.f202h = new SpeedTestServiceListener(this);
        f fVar2 = this.G0;
        Context contextX = X();
        fVar2.getClass();
        f.A(new d4.w(fVar2, contextX, null, 1));
    }

    @Override // androidx.fragment.app.b
    public final void E(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(qk.j.tab_overview_menu, menu);
    }

    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.f6248z0;
        if (view != null) {
            View view2 = (View) view.getParent();
            if (view2 != viewGroup && view2 != null) {
                ((ViewGroup) view2).removeView(this.f6248z0);
            }
            return this.f6248z0;
        }
        this.f6248z0 = layoutInflater.inflate(qk.i.tab_speed_test_alpha, (ViewGroup) null);
        se.b.W(l(), qk.d.status_bar_background);
        g gVar = new g(layoutInflater);
        this.H0 = gVar;
        al.c cVar = (al.c) gVar.f18754d;
        if (cVar == null) {
            br.l.l("binding");
            throw null;
        }
        ((DateTimeView) cVar.f822d).setVisibility(4);
        al.c cVar2 = (al.c) this.H0.f18754d;
        if (cVar2 == null) {
            br.l.l("binding");
            throw null;
        }
        ((NetworkInfoView) cVar2.f824f).getLayoutParams().width = -1;
        g gVar2 = this.H0;
        Integer numB0 = gVar2.b0(qk.d.white);
        if (numB0 != null) {
            int iIntValue = numB0.intValue();
            al.c cVar3 = (al.c) gVar2.f18754d;
            if (cVar3 == null) {
                br.l.l("binding");
                throw null;
            }
            ((TextView) cVar3.f823e).setTextColor(iIntValue);
        }
        g gVar3 = this.H0;
        Integer numB02 = gVar3.b0(qk.d.white);
        if (numB02 != null) {
            int iIntValue2 = numB02.intValue();
            al.c cVar4 = (al.c) gVar3.f18754d;
            if (cVar4 == null) {
                br.l.l("binding");
                throw null;
            }
            ((TextView) cVar4.f827i).setTextColor(iIntValue2);
        }
        g gVar4 = this.H0;
        Integer numB03 = gVar4.b0(qk.d.white);
        if (numB03 != null) {
            int iIntValue3 = numB03.intValue();
            al.c cVar5 = (al.c) gVar4.f18754d;
            if (cVar5 == null) {
                br.l.l("binding");
                throw null;
            }
            ((TextView) cVar5.k).setTextColor(iIntValue3);
        }
        LinearLayout linearLayout = (LinearLayout) this.f6248z0.findViewById(qk.h.topHeader);
        al.c cVar6 = (al.c) this.H0.f18754d;
        if (cVar6 == null) {
            br.l.l("binding");
            throw null;
        }
        linearLayout.addView((ConstraintLayout) cVar6.f820b);
        this.f6247y0 = (SpeedDialView) this.f6248z0.findViewById(qk.h.speedDialView);
        this.f6246x0 = (ProgressBar) this.f6248z0.findViewById(qk.h.load_progress);
        this.M0 = (LinearLayout) this.f6248z0.findViewById(qk.h.spinnerLayout);
        al.c cVar7 = (al.c) this.H0.f18754d;
        if (cVar7 == null) {
            br.l.l("binding");
            throw null;
        }
        ((TestStatusView) cVar7.f825g).setVisibility(0);
        this.I0.d(t(), this.R0);
        return this.f6248z0;
    }

    @Override // androidx.fragment.app.b
    public final void G() {
        V0 = false;
        j0(false);
        this.f6248z0 = null;
        f fVar = this.G0;
        fVar.f202h = null;
        Context contextN = n();
        fVar.getClass();
        br.l.e(contextN, "context");
        ((kj.a) fVar.f195a).f14445b = null;
        f.A(new fm.f(fVar, null, 1));
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.C0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.D0;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f1410c0 = true;
    }

    @Override // androidx.fragment.app.b
    public final void H() {
        this.I0.i(t());
        this.f1410c0 = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // androidx.fragment.app.b
    public final boolean M(MenuItem menuItem) {
        ((qm.e) this.L0.getValue()).a(l(), menuItem.getItemId());
        return false;
    }

    @Override // androidx.fragment.app.b
    public final void P(Bundle bundle) {
        e0(true);
    }

    public final boolean i0() {
        return !this.Y && w();
    }

    public final void j0(boolean z10) {
        OnSpeedTestStateChangeListener onSpeedTestStateChangeListener = this.N0;
        if (onSpeedTestStateChangeListener != null) {
            ((SpeedTestActivity) onSpeedTestStateChangeListener).T = z10;
        }
    }

    public final void k0() {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (i0()) {
            com.staircase3.opensignal.utils.g gVarA = com.staircase3.opensignal.utils.i.a(this.A0.f6097g);
            this.H0.h0(gVarA.f6180a, r(gVarA.f6181b.getResourceId()));
            g gVar = this.H0;
            Integer numB0 = gVar.b0(qk.d.complementary_3);
            if (numB0 != null) {
                int iIntValue = numB0.intValue();
                al.c cVar = (al.c) gVar.f18754d;
                if (cVar == null) {
                    br.l.l("binding");
                    throw null;
                }
                ((TextView) cVar.f827i).setTextColor(iIntValue);
            }
            this.f6246x0.setProgress(50);
        }
    }

    public final void l0(Context context) {
        Toast.makeText(context, context.getString(qk.l.last_test_bad_1) + "\n" + context.getString(qk.l.last_test_bad_2), 1).show();
        V0 = false;
        j0(false);
    }

    public final void m0(gm.b bVar) throws Resources.NotFoundException {
        if (i0()) {
            int i10 = qk.l.testing_latency;
            if (bVar == gm.b.LATENCY_RUNNING || bVar == gm.b.LATENCY_STARTED) {
                i10 = qk.l.testing_latency;
            } else if (bVar == gm.b.DOWNLOAD_STARTED || bVar == gm.b.DOWNLOAD_RUNNING) {
                i10 = qk.l.testing_download;
            } else if (bVar == gm.b.UPLOAD_STARTED || bVar == gm.b.UPLOAD_RUNNING) {
                i10 = qk.l.testing_upload;
            }
            String string = q().getString(i10);
            g gVar = this.H0;
            gVar.getClass();
            br.l.e(string, "testLabel");
            al.c cVar = (al.c) gVar.f18754d;
            if (cVar == null) {
                br.l.l("binding");
                throw null;
            }
            TextView testStatusTextView = ((TestStatusView) cVar.f825g).getTestStatusTextView();
            q qVar = u.f6195a;
            testStatusTextView.setText(Html.fromHtml(string, 0));
        }
    }

    public final void n0(long j, SpeedDialView.a aVar) throws NumberFormatException {
        List list;
        double d6;
        float f10;
        SpeedDialView speedDialView = this.f6247y0;
        speedDialView.getClass();
        br.l.e(aVar, "testType");
        speedDialView.f6346y = aVar;
        int[] iArr = com.staircase3.opensignal.views.a.f6353a;
        int i10 = iArr[aVar.ordinal()];
        if (i10 == 1) {
            list = speedDialView.B;
        } else {
            if (i10 != 2) {
                throw new n();
            }
            list = speedDialView.D;
        }
        int i11 = iArr[aVar.ordinal()];
        if (i11 == 1) {
            d6 = speedDialView.P;
        } else {
            if (i11 != 2) {
                throw new n();
            }
            d6 = speedDialView.Q;
        }
        float f11 = j / 1000.0f;
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            f10 = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                e5.Q();
                throw null;
            }
            int i14 = Integer.parseInt((String) next);
            if (i14 < f11) {
                i12 = i13;
            } else if (i14 != 0) {
                int i15 = Integer.parseInt((String) list.get(i12 - 1));
                f10 = (float) (((i12 + ((f11 - i15) / (i14 - i15))) - 1) * d6);
            }
        }
        speedDialView.R = f10;
        speedDialView.invalidate();
    }
}
