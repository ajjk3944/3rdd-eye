package al;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.p;
import androidx.media3.common.b0;
import androidx.media3.common.c0;
import androidx.media3.common.g0;
import androidx.media3.common.v;
import androidx.media3.common.x;
import androidx.media3.common.z;
import ar.k;
import com.google.android.exoplayer2.ui.PlayerView;
import com.staircase3.opensignal.OpensignalApplication;
import com.staircase3.opensignal.activities.SpeedTestActivity;
import com.staircase3.opensignal.goldstar.videotest.test.VideoTestActivity;
import com.staircase3.opensignal.goldstar.widget.DateTimeView;
import com.staircase3.opensignal.goldstar.widget.NetworkInfoView;
import com.staircase3.opensignal.goldstar.widget.TestStatusView;
import com.staircase3.opensignal.viewcontrollers.TestsFragment;
import com.staircase3.opensignal.views.TestButtonView;
import com.survicate.surveys.entities.survey.Workspace;
import i.j;
import io.sentry.android.core.e0;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.MissingResourceException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import m9.h;
import mq.o;
import n0.b2;
import n0.x0;
import oe.h0;
import on.i0;
import u.y;
import w.d0;
import w.i;
import w.s;
import w.u;
import wt.w;
import x1.c1;
import x1.f0;
import x1.f1;
import x1.g1;
import x1.l1;
import x1.r;
import x1.v1;
import x1.z0;
import y1.k1;
import z0.l;
import z0.m;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: l, reason: collision with root package name */
    public static c f818l;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f819a;

    /* renamed from: b, reason: collision with root package name */
    public Object f820b;

    /* renamed from: c, reason: collision with root package name */
    public Object f821c;

    /* renamed from: d, reason: collision with root package name */
    public Object f822d;

    /* renamed from: e, reason: collision with root package name */
    public Object f823e;

    /* renamed from: f, reason: collision with root package name */
    public Object f824f;

    /* renamed from: g, reason: collision with root package name */
    public Object f825g;

    /* renamed from: h, reason: collision with root package name */
    public Object f826h;

    /* renamed from: i, reason: collision with root package name */
    public Object f827i;
    public Object j;
    public Object k;

    public /* synthetic */ c(int i10) {
        this.f819a = i10;
    }

    public static final void a(c cVar, l lVar, f1 f1Var) {
        for (l lVar2 = lVar.f26499f; lVar2 != null; lVar2 = lVar2.f26499f) {
            if (lVar2 == ((c1) cVar.f821c)) {
                f0 f0VarC = ((f0) cVar.f820b).C();
                f1Var.f24823q = f0VarC != null ? (r) f0VarC.D.f822d : null;
                cVar.f823e = f1Var;
                return;
            } else {
                if ((lVar2.f26497d & 2) != 0) {
                    return;
                }
                lVar2.b0(f1Var);
            }
        }
    }

    public static Object c(c cVar, Comparable comparable, w.f fVar, rq.c cVar2) {
        Object objA = ((k) ((om.f) cVar.f820b).f19555g).a((w.l) ((k8.b) cVar.f822d).B);
        Object value = ((b2) ((x0) ((k8.b) cVar.f822d).f14199y)).getValue();
        om.f fVar2 = (om.f) cVar.f820b;
        d0 d0Var = new d0(fVar, fVar2, value, comparable, (w.l) ((k) fVar2.f19554d).a(objA));
        long j = ((k8.b) cVar.f822d).f14195d;
        u uVar = (u) cVar.f825g;
        w.b bVar = new w.b(cVar, objA, d0Var, j, null);
        s sVar = s.Default;
        uVar.getClass();
        return w.g(new g8.d(sVar, uVar, bVar, null), cVar2);
    }

    public static l f(z0.k kVar, l lVar) {
        l lVarD;
        if (kVar instanceof z0) {
            lVarD = ((z0) kVar).d();
            lVarD.f26497d = g1.f(lVarD);
        } else {
            x1.c cVar = new x1.c();
            cVar.f26497d = g1.d(kVar);
            cVar.f24776p = kVar;
            cVar.f24777q = new HashSet();
            lVarD = cVar;
        }
        if (lVarD.f26506o) {
            u1.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        lVarD.j = true;
        l lVar2 = lVar.f26500g;
        if (lVar2 != null) {
            lVar2.f26499f = lVarD;
            lVarD.f26500g = lVar2;
        }
        lVar.f26500g = lVarD;
        lVarD.f26499f = lVar;
        return lVarD;
    }

    public static l g(l lVar) {
        boolean z10 = lVar.f26506o;
        if (z10) {
            y yVar = g1.f24843a;
            if (!z10) {
                u1.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            g1.a(lVar, -1, 2);
            lVar.Z();
            lVar.T();
        }
        l lVar2 = lVar.f26500g;
        l lVar3 = lVar.f26499f;
        if (lVar2 != null) {
            lVar2.f26499f = lVar3;
            lVar.f26500g = null;
        }
        if (lVar3 != null) {
            lVar3.f26500g = lVar2;
            lVar.f26499f = null;
        }
        br.l.b(lVar3);
        return lVar3;
    }

    public static boolean j() {
        return f818l != null;
    }

    public static void k() {
        e0.d("SurvicateSDK/6.4.3", "You need to initialize the SDK before using its methods.");
    }

    public static void m(kn.c cVar) {
        if (!j()) {
            k();
            return;
        }
        io.sentry.k kVar = (io.sentry.k) f818l.f822d;
        kVar.getClass();
        kVar.f12399r = o.B0((List) kVar.f12399r, cVar);
    }

    public static void s(z0.k kVar, z0.k kVar2, l lVar) {
        if ((kVar instanceof z0) && (kVar2 instanceof z0)) {
            br.l.c(lVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((z0) kVar2).e(lVar);
            if (lVar.f26506o) {
                g1.c(lVar);
                return;
            } else {
                lVar.k = true;
                return;
            }
        }
        if (!(lVar instanceof x1.c)) {
            u1.a.b("Unknown Modifier.Node type");
            return;
        }
        x1.c cVar = (x1.c) lVar;
        if (cVar.f26506o) {
            cVar.e0();
        }
        cVar.f24776p = kVar2;
        cVar.f26497d = g1.d(kVar2);
        if (cVar.f26506o) {
            cVar.c0(false);
        }
        if (lVar.f26506o) {
            g1.c(lVar);
        } else {
            lVar.k = true;
        }
    }

    public void b(String str, String str2) {
        HashMap map = (HashMap) this.f825g;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public androidx.media3.common.e0 d() {
        b0 b0Var;
        ((df.c) this.f824f).getClass();
        Uri uri = (Uri) this.f821c;
        if (uri != null) {
            String str = (String) this.f822d;
            ((df.c) this.f824f).getClass();
            b0Var = new b0(uri, str, null, (List) this.f825g, (h0) this.f826h);
        } else {
            b0Var = null;
        }
        String str2 = (String) this.f820b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        v vVar = (v) this.f823e;
        vVar.getClass();
        x xVar = new x(vVar);
        z zVarA = ((androidx.media3.common.y) this.j).a();
        g0 g0Var = (g0) this.f827i;
        if (g0Var == null) {
            g0Var = g0.f1655e0;
        }
        return new androidx.media3.common.e0(str3, xVar, b0Var, zVarA, g0Var, (c0) this.k);
    }

    public h e() {
        String strF = ((String) this.f820b) == null ? " transportName" : "";
        if (((m9.k) this.f822d) == null) {
            strF = strF.concat(" encodedPayload");
        }
        if (((Long) this.f823e) == null) {
            strF = w.g.f(strF, " eventMillis");
        }
        if (((Long) this.f824f) == null) {
            strF = w.g.f(strF, " uptimeMillis");
        }
        if (((HashMap) this.f825g) == null) {
            strF = w.g.f(strF, " autoMetadata");
        }
        if (strF.isEmpty()) {
            return new h((String) this.f820b, (Integer) this.f821c, (m9.k) this.f822d, ((Long) this.f823e).longValue(), ((Long) this.f824f).longValue(), (HashMap) this.f825g, (Integer) this.f826h, (String) this.f827i, (byte[]) this.j, (byte[]) this.k);
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public void h(Context context) {
        AtomicBoolean atomicBoolean = OpensignalApplication.D;
        if (atomicBoolean.get()) {
            p(context);
            atomicBoolean.set(false);
            return;
        }
        AtomicBoolean atomicBoolean2 = OpensignalApplication.B;
        if (atomicBoolean2.get()) {
            t(context);
            atomicBoolean2.set(false);
        }
    }

    public boolean i(int i10) {
        return (i10 & ((l) this.f825g).f26498e) != 0;
    }

    public void l() throws MissingResourceException {
        bn.d dVar = ((bn.e) this.f824f).f2839a;
        kn.d.f((kn.d) this.f827i, null, "post_assistant_result", 0L, 11);
        ((kn.d) this.f827i).d(dVar.a());
    }

    public void n() {
        Workspace workspace = (Workspace) ((on.k) this.f821c).f19639c.f9209d;
        if (workspace != null) {
            Date lastUpdatedAt = workspace.getLastUpdatedAt();
            Date date = new Date();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            br.l.e(lastUpdatedAt, "oldDate");
            br.l.e(timeUnit, "timeUnit");
            if (timeUnit.convert(date.getTime() - lastUpdatedAt.getTime(), TimeUnit.MILLISECONDS) <= 10) {
                return;
            }
        }
        i0 i0Var = (i0) this.f823e;
        w.s(i0Var.f19634g, null, null, new p(i0Var, (pq.c) null, 4), 3);
    }

    public void o() {
        for (l lVar = (l) this.f825g; lVar != null; lVar = lVar.f26500g) {
            lVar.Y();
            if (lVar.j) {
                y yVar = g1.f24843a;
                if (!lVar.f26506o) {
                    u1.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                g1.a(lVar, -1, 1);
            }
            if (lVar.k) {
                g1.c(lVar);
            }
            lVar.j = false;
            lVar.k = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lq.h] */
    public void p(Context context) {
        ((qm.f) this.f822d).getClass();
        if (!qm.f.a(context) || !qm.f.c(context, "android.permission.READ_PHONE_STATE")) {
            TestsFragment testsFragment = (TestsFragment) this.f820b;
            qm.f fVar = (qm.f) testsFragment.M0.getValue();
            j jVarL = testsFragment.l();
            fVar.getClass();
            qm.f.e(jVarL);
            return;
        }
        om.f fVar2 = (om.f) this.f821c;
        com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) fVar2.f19555g, "tab_speedtest", "button_click", "run_speedtest", 8);
        Activity activity = (Activity) fVar2.f19554d;
        Intent intent = new Intent(activity, (Class<?>) SpeedTestActivity.class);
        if (activity != null) {
            activity.startActivity(intent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0154, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0156, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0157, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0182, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018d, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0191, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0194, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0196, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a0, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a2, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b0, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c3, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c7, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cd, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cf, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(int r32, p0.e r33, p0.e r34, z0.l r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 929
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.c.q(int, p0.e, p0.e, z0.l, boolean):void");
    }

    public void r() {
        x1.x xVar;
        f0 f0Var = (f0) this.f820b;
        f1 f1Var = (r) this.f822d;
        for (l lVar = ((v1) this.f824f).f26499f; lVar != null; lVar = lVar.f26499f) {
            x1.v vVarF = x1.k.f(lVar);
            if (vVarF != null) {
                f1 f1Var2 = lVar.f26502i;
                if (f1Var2 != null) {
                    x1.x xVar2 = (x1.x) f1Var2;
                    x1.v vVar = xVar2.N;
                    xVar2.V0(vVarF);
                    xVar = xVar2;
                    if (vVar != lVar) {
                        l1 l1Var = xVar2.I;
                        xVar = xVar2;
                        if (l1Var != null) {
                            ((k1) l1Var).invalidate();
                            xVar = xVar2;
                        }
                    }
                } else {
                    x1.x xVar3 = new x1.x(f0Var, vVarF);
                    lVar.b0(xVar3);
                    xVar = xVar3;
                }
                f1Var.f24823q = xVar;
                xVar.f24822p = f1Var;
                f1Var = xVar;
            } else {
                lVar.b0(f1Var);
            }
        }
        f0 f0VarC = f0Var.C();
        f1Var.f24823q = f0VarC != null ? (r) f0VarC.D.f822d : null;
        this.f823e = f1Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lq.h] */
    public void t(Context context) {
        ((qm.f) this.f822d).getClass();
        if (!qm.f.a(context) || !qm.f.c(context, "android.permission.READ_PHONE_STATE")) {
            TestsFragment testsFragment = (TestsFragment) this.f820b;
            qm.f fVar = (qm.f) testsFragment.M0.getValue();
            j jVarL = testsFragment.l();
            fVar.getClass();
            qm.f.e(jVarL);
            return;
        }
        om.f fVar2 = (om.f) this.f821c;
        com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) fVar2.f19555g, "tab_speedtest", "button_click", "run_videotest", 8);
        Activity activity = (Activity) fVar2.f19554d;
        Intent intent = new Intent(activity, (Class<?>) VideoTestActivity.class);
        if (activity != null) {
            activity.startActivity(intent);
        }
    }

    public String toString() {
        switch (this.f819a) {
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                StringBuilder sb2 = new StringBuilder("[");
                l lVar = (l) this.f825g;
                v1 v1Var = (v1) this.f824f;
                if (lVar == v1Var) {
                    sb2.append("]");
                } else {
                    while (true) {
                        if (lVar != null && lVar != v1Var) {
                            sb2.append(String.valueOf(lVar));
                            if (lVar.f26500g == v1Var) {
                                sb2.append("]");
                            } else {
                                sb2.append(",");
                                lVar = lVar.f26500g;
                            }
                        }
                    }
                }
                String string = sb2.toString();
                br.l.d(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    public c(TestsFragment testsFragment, om.f fVar, qm.f fVar2, ll.c cVar, bn.e eVar, an.a aVar, bl.a aVar2, kn.d dVar, wm.a aVar3) {
        this.f819a = 6;
        br.l.e(fVar2, "permissionsManager");
        br.l.e(cVar, "isOnWifiUseCase");
        br.l.e(eVar, "oscaResultRepository");
        br.l.e(aVar, "oscaAnalytics");
        br.l.e(aVar2, "dateTimeRepository");
        br.l.e(dVar, "survey");
        br.l.e(aVar3, "sdkAssistant");
        this.f820b = testsFragment;
        this.f821c = fVar;
        this.f822d = fVar2;
        this.f823e = cVar;
        this.f824f = eVar;
        this.f825g = aVar;
        this.f826h = aVar2;
        this.f827i = dVar;
        this.j = aVar3;
        this.k = new tl.b(this);
    }

    public c(f0 f0Var) {
        this.f819a = 8;
        this.f820b = f0Var;
        c1 c1Var = new c1();
        c1Var.f26498e = -1;
        this.f821c = c1Var;
        r rVar = new r(f0Var);
        this.f822d = rVar;
        this.f823e = rVar;
        v1 v1Var = rVar.N;
        this.f824f = v1Var;
        this.f825g = v1Var;
        this.j = new p0.e(new m[16]);
    }

    public c(Comparable comparable, om.f fVar, Float f10, int i10) {
        Object obj;
        Object obj2;
        this.f819a = 7;
        w.l lVar = null;
        f10 = (i10 & 4) != 0 ? null : f10;
        this.f820b = fVar;
        this.f821c = f10;
        k8.b bVar = new k8.b(fVar, comparable, lVar, 60);
        this.f822d = bVar;
        this.f823e = androidx.compose.runtime.c.f(Boolean.FALSE);
        this.f824f = androidx.compose.runtime.c.f(comparable);
        this.f825g = new u();
        new w.x(f10);
        w.l lVar2 = (w.l) bVar.B;
        boolean z10 = lVar2 instanceof w.h;
        if (z10) {
            obj = w.c.f24097e;
        } else if (lVar2 instanceof i) {
            obj = w.c.f24098f;
        } else {
            obj = lVar2 instanceof w.j ? w.c.f24099g : w.c.f24100h;
        }
        this.f826h = obj;
        if (z10) {
            obj2 = w.c.f24093a;
        } else if (lVar2 instanceof i) {
            obj2 = w.c.f24094b;
        } else {
            obj2 = lVar2 instanceof w.j ? w.c.f24095c : w.c.f24096d;
        }
        this.f827i = obj2;
        this.j = obj;
        this.k = obj2;
    }

    public c(ConstraintLayout constraintLayout, bm.d dVar, b9.c cVar, PlayerView playerView, f fVar, ImageView imageView, TextView textView, ProgressBar progressBar, ProgressBar progressBar2, TextView textView2) {
        this.f819a = 0;
        this.f820b = constraintLayout;
        this.f821c = dVar;
        this.f822d = cVar;
        this.f823e = playerView;
        this.f824f = fVar;
        this.f825g = imageView;
        this.f826h = textView;
        this.j = progressBar;
        this.k = progressBar2;
        this.f827i = textView2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v4 cq.n, still in use, count: 2, list:
          (r5v4 cq.n) from 0x00c2: MOVE (r16v0 cq.n) = (r5v4 cq.n)
          (r5v4 cq.n) from 0x009d: MOVE (r16v3 cq.n) = (r5v4 cq.n)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public c(on.a0 r26) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.c.<init>(on.a0):void");
    }

    public c(ConstraintLayout constraintLayout, View view, DateTimeView dateTimeView, TextView textView, TextView textView2, TextView textView3, NetworkInfoView networkInfoView, TestStatusView testStatusView, TextView textView4, TextView textView5) {
        this.f819a = 2;
        this.f820b = constraintLayout;
        this.f821c = view;
        this.f822d = dateTimeView;
        this.f826h = textView;
        this.f827i = textView2;
        this.f823e = textView3;
        this.f824f = networkInfoView;
        this.f825g = testStatusView;
        this.j = textView4;
        this.k = textView5;
    }

    public c(ConstraintLayout constraintLayout, bm.d dVar, TestButtonView testButtonView, TestButtonView testButtonView2, TestButtonView testButtonView3, TestButtonView testButtonView4, TestButtonView testButtonView5, Group group, Group group2, Button button) {
        this.f819a = 1;
        this.f820b = constraintLayout;
        this.f821c = dVar;
        this.f822d = testButtonView;
        this.f823e = testButtonView2;
        this.f824f = testButtonView3;
        this.f825g = testButtonView4;
        this.f826h = testButtonView5;
        this.f827i = group;
        this.j = group2;
        this.k = button;
    }
}
