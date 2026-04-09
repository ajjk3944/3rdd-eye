package bm;

import ak.c0;
import ak.k;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.ServiceState;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import b5.g;
import br.l;
import br.w;
import ch.n;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import com.opensignal.sdk.data.task.TickJobService;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase_Impl;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedResultActivity;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedTestResult;
import com.staircase3.opensignal.goldstar.widget.NetworkInfoView;
import com.staircase3.opensignal.goldstar.widget.NetworkStatusView;
import f5.f0;
import g1.p;
import h7.h0;
import h9.c3;
import h9.f2;
import h9.j1;
import h9.l0;
import h9.m1;
import h9.o1;
import h9.r2;
import ht.x;
import ht.y0;
import i.j0;
import io.sentry.android.core.e0;
import io.sentry.c4;
import io.sentry.i1;
import io.sentry.o6;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import kt.j;
import lq.q;
import mq.o;
import mq.y;
import om.f;
import p.l2;
import qk.h;
import sm.m;
import t2.i;
import xr.b0;
import xr.z;

/* loaded from: classes.dex */
public final class d implements g, hk.d, ff.b, ff.a, qj.a {

    /* renamed from: x, reason: collision with root package name */
    public static d f2824x;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2825a;

    /* renamed from: d, reason: collision with root package name */
    public Object f2826d;

    /* renamed from: g, reason: collision with root package name */
    public Object f2827g;

    /* renamed from: r, reason: collision with root package name */
    public Object f2828r;

    public /* synthetic */ d(int i10) {
        this.f2825a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o1 B(m1 m1Var, String str) {
        o1 o1VarB;
        o1 o1Var = (o1) m1Var;
        if (str.equals(o1Var.f10433c)) {
            return o1Var;
        }
        for (Object obj : m1Var.f()) {
            if (obj instanceof o1) {
                o1 o1Var2 = (o1) obj;
                if (str.equals(o1Var2.f10433c)) {
                    return o1Var2;
                }
                if ((obj instanceof m1) && (o1VarB = B((m1) obj, str)) != null) {
                    return o1VarB;
                }
            }
        }
        return null;
    }

    public static d E(InputStream inputStream) throws IOException {
        c3 c3Var = new c3();
        c3Var.f10317a = null;
        c3Var.f10318b = null;
        c3Var.f10319c = false;
        c3Var.f10321e = false;
        c3Var.f10322f = null;
        c3Var.f10323g = null;
        c3Var.f10324h = false;
        c3Var.f10325i = null;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i10 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i10 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            c3Var.B(inputStream);
            return c3Var.f10317a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                e0.d("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public static d p(View view) {
        int i10 = h.introTextView;
        TextView textView = (TextView) b4.A(view, i10);
        if (textView != null) {
            i10 = h.networkInfoView;
            NetworkInfoView networkInfoView = (NetworkInfoView) b4.A(view, i10);
            if (networkInfoView != null) {
                i10 = h.networkStatusView;
                NetworkStatusView networkStatusView = (NetworkStatusView) b4.A(view, i10);
                if (networkStatusView != null) {
                    return new d(textView, networkInfoView, networkStatusView, 4);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static String r(String str, List list) {
        return list.get(0) instanceof String ? o.x0(list, null, str.concat(" IN ("), ")", fi.a.f8880d, 25) : o.x0(list, null, str.concat(" IN ("), ")", null, 57);
    }

    public static String s(List list, List list2) {
        boolean z10;
        if (list.isEmpty() || list2.isEmpty()) {
            return null;
        }
        int i10 = 0;
        if (list.isEmpty()) {
            z10 = true;
            break;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!l.a(o.r0(list), (String) it.next())) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                e5.Q();
                throw null;
            }
            sb2.append(((String) obj) + " = ?");
            if (i10 < list.size() - 1) {
                if (z10) {
                    sb2.append(" AND ");
                } else {
                    sb2.append(" OR ");
                }
            }
            i10 = i11;
        }
        return sb2.toString();
    }

    public f1.a A() {
        f2 f2Var;
        f2 f2Var2;
        f2 f2Var3;
        f2 f2Var4;
        float fC;
        f2 f2Var5;
        j1 j1Var = (j1) this.f2826d;
        l0 l0Var = j1Var.f10379r;
        l0 l0Var2 = j1Var.f10380s;
        if (l0Var == null || l0Var.g() || (f2Var = l0Var.f10400d) == (f2Var2 = f2.percent) || f2Var == (f2Var3 = f2.em) || f2Var == (f2Var4 = f2.ex)) {
            return new f1.a(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fC2 = l0Var.c();
        if (l0Var2 == null) {
            f1.a aVar = ((j1) this.f2826d).f10498o;
            fC = aVar != null ? (aVar.f8401e * fC2) / aVar.f8400d : fC2;
        } else {
            if (l0Var2.g() || (f2Var5 = l0Var2.f10400d) == f2Var2 || f2Var5 == f2Var3 || f2Var5 == f2Var4) {
                return new f1.a(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fC = l0Var2.c();
        }
        return new f1.a(0.0f, 0.0f, fC2, fC);
    }

    public String C() {
        return ((f) this.f2826d).n("sdk_secret", null);
    }

    public hk.e D(hk.h hVar, hk.e eVar) {
        int i10;
        int i11;
        Iterator it;
        r2 r2Var;
        List list;
        q3.a aVar = (q3.a) this.f2826d;
        r2 r2Var2 = (r2) this.f2828r;
        l.e(hVar, "task");
        List<String> list2 = hVar.A;
        l.e(eVar, "state");
        boolean z10 = hVar.f10821t;
        if (z10 || list2.isEmpty() || !((i11 = hk.a.f10797a[eVar.ordinal()]) == 1 || i11 == 2)) {
            r2 r2Var3 = r2Var2;
            if (z10 && (((i10 = hk.a.f10797a[eVar.ordinal()]) == 1 || i10 == 2) && !((ak.g) aVar.f20680g).f530g.f756a.f720a.isEmpty())) {
                List list3 = ((ak.g) aVar.f20680g).f530g.f756a.f720a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (tt.l.D0(((k) obj).f601c)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        k kVar = (k) it2.next();
                        r2 r2Var4 = r2Var3;
                        Long lM = ((f) r2Var4.f10474x).m("last_intensive_task_run_time", 0L);
                        l.d(lM, "getLong(...)");
                        if (L(kVar, hVar, lM.longValue())) {
                            return hk.e.EXECUTE_IMMEDIATELY_IGNORE_DELAY;
                        }
                        r2Var3 = r2Var4;
                    }
                    return hk.e.DO_NOTHING;
                }
            }
        } else if (!((ak.g) aVar.f20680g).f530g.f756a.f720a.isEmpty()) {
            if (list2.isEmpty()) {
                return hk.e.DO_NOTHING;
            }
            List list4 = ((ak.g) aVar.f20680g).f530g.f756a.f720a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list4) {
                if (!tt.l.D0(((k) obj2).f601c)) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                k kVar2 = (k) it3.next();
                n.b("CrossTaskDelayExecutionChecker", hVar.c() + " Checking for crossTaskDelay group:" + kVar2.f601c + ", delay:" + kVar2.f599a);
                for (String str : list2) {
                    n.b("CrossTaskDelayExecutionChecker", hVar.c() + " Checking for group: " + str);
                    if (l.a(str, kVar2.f601c)) {
                        ArrayList arrayListD0 = r2Var2.d0();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it4 = arrayListD0.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            if (((hk.h) next).A.contains(str)) {
                                arrayList3.add(next);
                            }
                        }
                        Iterator it5 = arrayList3.iterator();
                        if (!it5.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        hk.h hVar2 = (hk.h) it5.next();
                        long j = hVar2.f10809f.f9621g;
                        StringBuilder sb2 = new StringBuilder("lastSuccessfulExecutionTime for task:");
                        it = it3;
                        w.g.q(sb2, hVar2.f10805b, " in group:", str, " is ");
                        sb2.append(j);
                        n.b("CrossTaskDelayExecutionChecker", sb2.toString());
                        while (it5.hasNext()) {
                            hk.h hVar3 = (hk.h) it5.next();
                            r2 r2Var5 = r2Var2;
                            List list5 = list2;
                            long j7 = hVar3.f10809f.f9621g;
                            StringBuilder sb3 = new StringBuilder("lastSuccessfulExecutionTime for task:");
                            w.g.q(sb3, hVar3.f10805b, " in group:", str, " is ");
                            sb3.append(j7);
                            n.b("CrossTaskDelayExecutionChecker", sb3.toString());
                            if (j < j7) {
                                j = j7;
                            }
                            r2Var2 = r2Var5;
                            list2 = list5;
                        }
                        r2Var = r2Var2;
                        list = list2;
                        if (!L(kVar2, hVar, j)) {
                            n.b("CrossTaskDelayExecutionChecker", c7.a.o(hVar, new StringBuilder(), " Is not ready to be executed immediately DO_NOTHING"));
                            return hk.e.DO_NOTHING;
                        }
                    } else {
                        it = it3;
                        r2Var = r2Var2;
                        list = list2;
                    }
                    it3 = it;
                    r2Var2 = r2Var;
                    list2 = list;
                }
            }
            n.b("CrossTaskDelayExecutionChecker", c7.a.o(hVar, new StringBuilder(), " Is ready to be EXECUTE_IMMEDIATELY_IGNORE_DELAY for all groups"));
            return hk.e.EXECUTE_IMMEDIATELY_IGNORE_DELAY;
        }
        return eVar;
    }

    public androidx.lifecycle.o F(gk.c cVar) {
        l.e(cVar, "schedule");
        int i10 = gk.d.f9626a[cVar.f9615a.ordinal()];
        if (i10 == 1) {
            return (androidx.lifecycle.o) this.f2826d;
        }
        if (i10 == 2) {
            return (androidx.lifecycle.o) this.f2827g;
        }
        if (i10 == 3) {
            return (androidx.lifecycle.o) this.f2828r;
        }
        throw new bf.n();
    }

    public NetworkCapabilities G() {
        ch.f fVar = (ch.f) this.f2828r;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f2826d;
        if (!((ag.b) this.f2827g).i("android.permission.ACCESS_NETWORK_STATE") || connectivityManager == null) {
            return null;
        }
        int i10 = fVar.f3941a;
        if (i10 == 21 || i10 == 22) {
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo != null && networkInfo.isConnected()) {
                    return connectivityManager.getNetworkCapabilities(network);
                }
            }
        }
        if (fVar.a()) {
            return connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        }
        return null;
    }

    public long H() {
        return ((i1.b) this.f2828r).f11140b.f11139d;
    }

    public Boolean I(int i10, int i11) {
        NetworkCapabilities networkCapabilitiesG;
        if (((ch.f) this.f2828r).f3941a >= i10 && (networkCapabilitiesG = G()) != null) {
            return Boolean.valueOf(networkCapabilitiesG.hasCapability(i11));
        }
        return null;
    }

    public Boolean J(int i10, int i11) {
        NetworkCapabilities networkCapabilitiesG;
        if (((ch.f) this.f2828r).f3941a >= i10 && (networkCapabilitiesG = G()) != null) {
            return Boolean.valueOf(networkCapabilitiesG.hasTransport(i11));
        }
        return null;
    }

    public void K(SpeedTestResult speedTestResult) {
        OpensignalDatabase_Impl opensignalDatabase_Impl = (OpensignalDatabase_Impl) this.f2826d;
        i1 i1VarD = c4.d();
        i1 i1VarZ = i1VarD != null ? i1VarD.z("db.sql.room", "com.staircase3.opensignal.goldstar.persistence.SpeedTestResultDao") : null;
        opensignalDatabase_Impl.b();
        opensignalDatabase_Impl.a();
        opensignalDatabase_Impl.a();
        o7.a aVarI = opensignalDatabase_Impl.g().I();
        opensignalDatabase_Impl.f6078d.c(aVarI);
        if (aVarI.c0()) {
            aVarI.E();
        } else {
            aVarI.j();
        }
        try {
            b bVar = (b) this.f2827g;
            OpensignalDatabase_Impl opensignalDatabase_Impl2 = (OpensignalDatabase_Impl) bVar.f7547b;
            opensignalDatabase_Impl2.a();
            o7.e eVarC = ((AtomicBoolean) bVar.f7548c).compareAndSet(false, true) ? (o7.e) ((q) bVar.f7549d).getValue() : opensignalDatabase_Impl2.c("INSERT OR ABORT INTO `speed_test` (`id`,`time`,`dl_speed`,`ul_speed`,`latency`,`network_type`,`connection_type`,`network_name`,`ssid`,`latitude`,`longitude`,`place_type`,`seen`,`network_provider`,`network_generation`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            try {
                bVar.g(eVarC, speedTestResult);
                eVarC.j0();
                bVar.f(eVarC);
                opensignalDatabase_Impl.g().I().C();
                if (i1VarZ != null) {
                    i1VarZ.a(o6.OK);
                }
            } catch (Throwable th2) {
                bVar.f(eVarC);
                throw th2;
            }
        } finally {
            opensignalDatabase_Impl.j();
            if (i1VarZ != null) {
                i1VarZ.k();
            }
        }
    }

    public boolean L(k kVar, hk.h hVar, long j) {
        String strC = hVar.c();
        dj.h hVar2 = (dj.h) this.f2827g;
        List list = kVar.f600b;
        long j7 = kVar.f599a;
        boolean zY = m.y(hVar, hVar2.e(list));
        n.b("CrossTaskDelayExecutionChecker", strC + " canExecute " + zY);
        if (zY) {
            long j10 = j + j7;
            long jCurrentTimeMillis = j10 - System.currentTimeMillis();
            boolean z10 = System.currentTimeMillis() >= j10;
            n.b("CrossTaskDelayExecutionChecker", strC + " lastRunTime " + j);
            n.b("CrossTaskDelayExecutionChecker", strC + " delayInMillis " + j7);
            n.b("CrossTaskDelayExecutionChecker", strC + " timeLeftToExecuteInMillis " + jCurrentTimeMillis);
            n.b("CrossTaskDelayExecutionChecker", strC + " hasWaitedLongEnough " + z10);
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public boolean M(int i10, c3.g gVar, z2.g gVar2) {
        a3.b bVar = (a3.b) this.f2827g;
        z2.f[] fVarArr = gVar2.T;
        int[] iArr = gVar2.f26569t;
        bVar.f32a = fVarArr[0];
        bVar.f33b = fVarArr[1];
        bVar.f34c = gVar2.q();
        bVar.f35d = gVar2.k();
        bVar.f40i = false;
        bVar.j = i10;
        z2.f fVar = bVar.f32a;
        z2.f fVar2 = z2.f.MATCH_CONSTRAINT;
        boolean z10 = fVar == fVar2;
        boolean z11 = bVar.f33b == fVar2;
        boolean z12 = z10 && gVar2.X > 0.0f;
        boolean z13 = z11 && gVar2.X > 0.0f;
        if (z12 && iArr[0] == 4) {
            bVar.f32a = z2.f.FIXED;
        }
        if (z13 && iArr[1] == 4) {
            bVar.f33b = z2.f.FIXED;
        }
        gVar.b(gVar2, bVar);
        gVar2.O(bVar.f36e);
        gVar2.L(bVar.f37f);
        gVar2.E = bVar.f39h;
        gVar2.I(bVar.f38g);
        bVar.j = 0;
        return bVar.f40i;
    }

    public o1 N(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
        if (strReplace.length() <= 1 || !strReplace.startsWith("#")) {
            return null;
        }
        String strSubstring = strReplace.substring(1);
        HashMap map = (HashMap) this.f2828r;
        if (strSubstring == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(((j1) this.f2826d).f10433c)) {
            return (j1) this.f2826d;
        }
        if (map.containsKey(strSubstring)) {
            return (o1) map.get(strSubstring);
        }
        o1 o1VarB = B((j1) this.f2826d, strSubstring);
        map.put(strSubstring, o1VarB);
        return o1VarB;
    }

    public void O(p pVar) {
        ((i1.b) this.f2828r).f11140b.f11138c = pVar;
    }

    public void P(t2.c cVar) {
        ((i1.b) this.f2828r).f11140b.f11136a = cVar;
    }

    public void Q(i iVar) {
        ((i1.b) this.f2828r).f11140b.f11137b = iVar;
    }

    public void R(long j) {
        ((i1.b) this.f2828r).f11140b.f11139d = j;
    }

    public void S(z2.h hVar, int i10, int i11, int i12) {
        hVar.getClass();
        int i13 = hVar.f26541c0;
        int i14 = hVar.f26543d0;
        hVar.f26541c0 = 0;
        hVar.f26543d0 = 0;
        hVar.O(i11);
        hVar.L(i12);
        if (i13 < 0) {
            hVar.f26541c0 = 0;
        } else {
            hVar.f26541c0 = i13;
        }
        if (i14 < 0) {
            hVar.f26543d0 = 0;
        } else {
            hVar.f26543d0 = i14;
        }
        z2.h hVar2 = (z2.h) this.f2828r;
        hVar2.f26579t0 = i10;
        hVar2.U();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ht.c1 T(xr.i r8, fs.a r9, boolean r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f2826d
            cj.a r0 = (cj.a) r0
            java.lang.Object r1 = r0.f3974d
            ds.a r1 = (ds.a) r1
            java.lang.String r2 = "arrayType"
            br.l.e(r8, r2)
            boolean r9 = r9.f9054d
            xr.b0 r2 = r8.f25507b
            boolean r3 = r2 instanceof xr.z
            r4 = 0
            if (r3 == 0) goto L1a
            r3 = r2
            xr.z r3 = (xr.z) r3
            goto L1b
        L1a:
            r3 = r4
        L1b:
            if (r3 == 0) goto L35
            java.lang.Class r3 = r3.f25519a
            java.lang.Class r5 = java.lang.Void.TYPE
            boolean r5 = br.l.a(r3, r5)
            if (r5 == 0) goto L28
            goto L35
        L28:
            java.lang.String r3 = r3.getName()
            ys.c r3 = ys.c.get(r3)
            or.k r3 = r3.getPrimitiveType()
            goto L36
        L35:
            r3 = r4
        L36:
            ds.c r5 = new ds.c
            r6 = 1
            r5.<init>(r0, r8, r6)
            if (r3 == 0) goto L70
            rr.a0 r8 = r1.f7458o
            or.h r8 = r8.n()
            ht.b0 r8 = r8.q(r3)
            sr.i r10 = new sr.i
            sr.h r0 = r8.getAnnotations()
            r1 = 2
            sr.h[] r1 = new sr.h[r1]
            r2 = 0
            r1[r2] = r0
            r1[r6] = r5
            r10.<init>(r1)
            ht.x r8 = se.b.Q(r8, r10)
            java.lang.String r10 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            br.l.c(r8, r10)
            ht.b0 r8 = (ht.b0) r8
            if (r9 == 0) goto L67
            return r8
        L67:
            ht.b0 r9 = r8.p0(r6)
            ht.c1 r8 = ht.e.j(r8, r9)
            return r8
        L70:
            ht.y0 r8 = ht.y0.COMMON
            r0 = 6
            fs.a r8 = com.google.android.gms.internal.measurement.b4.f0(r8, r9, r4, r0)
            ht.x r8 = r7.U(r2, r8)
            if (r9 == 0) goto L8f
            if (r10 == 0) goto L82
            ht.d1 r9 = ht.d1.OUT_VARIANCE
            goto L84
        L82:
            ht.d1 r9 = ht.d1.INVARIANT
        L84:
            rr.a0 r10 = r1.f7458o
            or.h r10 = r10.n()
            ht.b0 r8 = r10.g(r9, r8, r5)
            return r8
        L8f:
            rr.a0 r9 = r1.f7458o
            or.h r9 = r9.n()
            ht.d1 r10 = ht.d1.INVARIANT
            ht.b0 r9 = r9.g(r10, r8, r5)
            rr.a0 r10 = r1.f7458o
            or.h r10 = r10.n()
            ht.d1 r0 = ht.d1.OUT_VARIANCE
            ht.b0 r8 = r10.g(r0, r8, r5)
            ht.b0 r8 = r8.p0(r6)
            ht.c1 r8 = ht.e.j(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bm.d.T(xr.i, fs.a, boolean):ht.c1");
    }

    public x U(hs.d dVar, fs.a aVar) {
        ds.a aVar2 = (ds.a) ((cj.a) this.f2826d).f3974d;
        if (dVar instanceof z) {
            Class cls = ((z) dVar).f25519a;
            or.k primitiveType = l.a(cls, Void.TYPE) ? null : ys.c.get(cls.getName()).getPrimitiveType();
            return primitiveType != null ? aVar2.f7458o.n().s(primitiveType) : aVar2.f7458o.n().w();
        }
        boolean z10 = false;
        if (!(dVar instanceof xr.q)) {
            if (dVar instanceof xr.i) {
                return T((xr.i) dVar, aVar, false);
            }
            if (dVar instanceof xr.e0) {
                b0 b0VarC = ((xr.e0) dVar).c();
                return b0VarC != null ? U(b0VarC, aVar) : aVar2.f7458o.n().m();
            }
            if (dVar == null) {
                return aVar2.f7458o.n().m();
            }
            throw new UnsupportedOperationException("Unsupported type: " + dVar);
        }
        xr.q qVar = (xr.q) dVar;
        if (!aVar.f9054d && aVar.f9051a != y0.SUPERTYPE) {
            z10 = true;
        }
        Type type = qVar.f25511a;
        boolean zD = qVar.d();
        if (!zD && !z10) {
            ht.b0 b0VarQ = q(qVar, aVar, null);
            return b0VarQ != null ? b0VarQ : kt.k.c(j.UNRESOLVED_JAVA_CLASS, type.toString());
        }
        ht.b0 b0VarQ2 = q(qVar, aVar.b(fs.b.FLEXIBLE_LOWER_BOUND), null);
        if (b0VarQ2 == null) {
            return kt.k.c(j.UNRESOLVED_JAVA_CLASS, type.toString());
        }
        ht.b0 b0VarQ3 = q(qVar, aVar.b(fs.b.FLEXIBLE_UPPER_BOUND), b0VarQ2);
        return b0VarQ3 == null ? kt.k.c(j.UNRESOLVED_JAVA_CLASS, type.toString()) : zD ? new fs.h(b0VarQ2, b0VarQ3) : ht.e.j(b0VarQ2, b0VarQ3);
    }

    public void V(ak.g gVar) {
        ServiceState serviceState;
        vh.a aVar = (vh.a) this.f2828r;
        xi.j jVar = (xi.j) this.f2826d;
        l.e(gVar, "config");
        gVar.toString();
        n.a();
        c0 c0Var = gVar.f529f;
        boolean z10 = c0Var.f449a.k;
        Iterator it = ((Map) this.f2827g).entrySet().iterator();
        while (it.hasNext()) {
            fj.n nVar = (fj.n) ((Map.Entry) it.next()).getValue();
            if (nVar.I != null) {
                nVar.G.G(new fj.m(false, nVar));
                nVar.d();
            }
        }
        bk.c cVar = jVar.f25340g;
        cVar.n(jVar);
        cVar.r(jVar);
        fj.n nVar2 = jVar.Q;
        if (nVar2 != null) {
            synchronized (nVar2.J) {
                nVar2.J.remove(jVar);
            }
        }
        fj.n nVar3 = jVar.Q;
        if (nVar3 != null) {
            nVar3.e(jVar);
        }
        jVar.R = false;
        if (z10) {
            bk.c cVar2 = jVar.f25340g;
            if (((ak.g) jVar.G.f20680g).f529f.f449a.f484o) {
                fj.n nVar4 = jVar.Q;
                jVar.M = (nVar4 == null || (serviceState = nVar4.N) == null) ? null : jVar.H.c(serviceState);
            }
            jVar.b();
            cVar2.p(jVar);
            cVar2.o(jVar);
            fj.n nVar5 = jVar.Q;
            if (nVar5 != null) {
                nVar5.c(jVar);
            }
            fj.n nVar6 = jVar.Q;
            if (nVar6 != null) {
                nVar6.b(jVar);
            }
            jVar.R = true;
        }
        if (!c0Var.f463q.f496a) {
            n.f3969a.remove(aVar);
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = n.f3969a;
        if (copyOnWriteArrayList.contains(aVar)) {
            return;
        }
        copyOnWriteArrayList.add(aVar);
    }

    public void W(z2.h hVar) {
        ArrayList arrayList = (ArrayList) this.f2826d;
        arrayList.clear();
        int size = hVar.f26576q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            z2.g gVar = (z2.g) hVar.f26576q0.get(i10);
            z2.f[] fVarArr = gVar.T;
            z2.f fVar = fVarArr[0];
            z2.f fVar2 = z2.f.MATCH_CONSTRAINT;
            if (fVar == fVar2 || fVarArr[1] == fVar2) {
                arrayList.add(gVar);
            }
        }
        hVar.f26578s0.f43b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [b5.b0, java.lang.Object] */
    @Override // b5.g
    public b5.h a() {
        b5.l lVar = new b5.l((Context) this.f2826d, ((b5.m) this.f2828r).a());
        ?? r12 = this.f2827g;
        if (r12 != 0) {
            lVar.w(r12);
        }
        return lVar;
    }

    @Override // qj.a
    public ArrayList b(hi.a aVar, List list, List list2) throws Throwable {
        ArrayList arrayList = new ArrayList();
        z(aVar, "task_id", list, list2, new fi.d(aVar, arrayList, 0));
        return arrayList;
    }

    @Override // hk.d
    public void c(hk.h hVar) {
        switch (this.f2825a) {
            case 10:
                l.e(hVar, "task");
                n.b("ExecServiceExecPipeline", hVar.c() + " Cancel task with task state - " + hVar.N);
                if (hVar.N == hk.m.STARTED) {
                    n.b("ExecServiceExecPipeline", c7.a.o(hVar, new StringBuilder(), " Stopping job"));
                    hVar.k(true);
                } else {
                    n.b("ExecServiceExecPipeline", c7.a.o(hVar, new StringBuilder(), " Not started. Ignore"));
                }
                synchronized (((HashMap) this.f2828r)) {
                    try {
                        Future future = (Future) ((HashMap) this.f2828r).get(hVar.f10805b);
                        if (future != null) {
                            future.cancel(true);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                l.e(hVar, "task");
                n.b("KeepAliveExecutionPipeline", "stop() called with: task = " + hVar);
                return;
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f2825a) {
            case 12:
                d dVar = new d(((com.google.android.gms.internal.measurement.b) this.f2826d).clone());
                Iterator it = ((ArrayList) this.f2828r).iterator();
                while (it.hasNext()) {
                    ((ArrayList) dVar.f2828r).add(((com.google.android.gms.internal.measurement.b) it.next()).clone());
                }
                return dVar;
            default:
                return super.clone();
        }
    }

    @Override // qj.a
    public Object d(hi.a aVar, long j) throws Throwable {
        Uri uriB = ((vi.a) this.f2827g).b(aVar);
        w wVar = new w();
        u((ContentResolver) this.f2826d, uriB, new fi.e(uriB, j, wVar, aVar));
        return wVar.f2917a;
    }

    @Override // qj.a
    public ArrayList e(hi.a aVar) throws Throwable {
        ArrayList arrayList = new ArrayList();
        fi.d dVar = new fi.d(aVar, arrayList, 1);
        mq.w wVar = mq.w.f16945a;
        z(aVar, "task_name", wVar, wVar, dVar);
        return arrayList;
    }

    @Override // qj.a
    public int f(hi.a aVar, long j) {
        Uri uriB = ((vi.a) this.f2827g).b(aVar);
        Integer num = (Integer) u((ContentResolver) this.f2826d, uriB, new fi.f(uriB, j));
        n.b("ContentProviderDatabaseDataSource", "Trim database, trimmed items by column name: time_in_millis from " + aVar.g() + ". trimmed rows: " + num);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // qj.a
    public long g(hi.a aVar, ContentValues contentValues, long j) {
        l.e(contentValues, "contentValues");
        Uri uriB = ((vi.a) this.f2827g).b(aVar);
        Long l10 = (Long) u((ContentResolver) this.f2826d, uriB, new c1.d(uriB, contentValues, new String[]{String.valueOf(j)}, 2));
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    @Override // qj.a
    public int h(hi.a aVar, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        Uri uriB = ((vi.a) this.f2827g).b(aVar);
        Integer num = (Integer) u((ContentResolver) this.f2826d, uriB, new fi.b(uriB, r("id", list), 0));
        n.b("ContentProviderDatabaseDataSource", "Delete items by id from " + aVar.g() + " deleted rows: " + num);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // hk.d
    public void i(hk.h hVar) {
        switch (this.f2825a) {
            case 10:
                synchronized (((HashMap) this.f2828r)) {
                }
                return;
            default:
                n.b("KeepAliveExecutionPipeline", "unschedule() called with: task = " + hVar);
                return;
        }
    }

    @Override // qj.a
    public ArrayList j(hi.a aVar, List list, List list2) throws Throwable {
        l.e(aVar, "databaseTable");
        ArrayList arrayList = new ArrayList();
        Uri uriB = ((vi.a) this.f2827g).b(aVar);
        String strS = s(list, list2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(list2);
        Object[] array = arrayList2.toArray(new String[arrayList2.size()]);
        l.d(array, "toArray(...)");
        u((ContentResolver) this.f2826d, uriB, new fi.c(uriB, strS, (String[]) array, this, aVar, arrayList));
        return arrayList;
    }

    @Override // qj.a
    public void k(hi.a aVar, ContentValues contentValues) throws Throwable {
        l.e(aVar, "databaseTable");
        l.e(contentValues, "contentValues");
        Uri uriB = ((vi.a) this.f2827g).b(aVar);
        u((ContentResolver) this.f2826d, uriB, new c7.b(uriB, 6, contentValues));
    }

    @Override // ff.a
    public void l(Bundle bundle) {
        synchronized (this.f2827g) {
            Objects.toString(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            this.f2828r = new CountDownLatch(1);
            ((a2.g) this.f2826d).l(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                if (((CountDownLatch) this.f2828r).await(500, TimeUnit.MILLISECONDS)) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                } else {
                    e0.q("FirebaseCrashlytics", "Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            } catch (InterruptedException unused) {
                e0.c("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.f2828r = null;
        }
    }

    @Override // hk.d
    public void m(hk.h hVar, boolean z10) {
        JobInfo pendingJob;
        switch (this.f2825a) {
            case 10:
                n.b("ExecServiceExecPipeline", "execute() called with: task = " + hVar.f10805b + ", ignoreDelay = " + z10);
                synchronized (((HashMap) this.f2828r)) {
                    HashMap map = (HashMap) this.f2828r;
                    String str = hVar.f10805b;
                    Future<?> futureSubmit = ((ExecutorService) this.f2826d).submit(new cj.f(hVar, z10, (df.c) this.f2827g));
                    l.d(futureSubmit, "submit(...)");
                    map.put(str, futureSubmit);
                }
                return;
            default:
                JobScheduler jobScheduler = (JobScheduler) this.f2828r;
                n.b("KeepAliveExecutionPipeline", c7.a.o(hVar, new StringBuilder(), " Execute Tick job"));
                ComponentName componentName = new ComponentName((Context) this.f2826d, (Class<?>) TickJobService.class);
                long j = hVar.f10809f.f9622h;
                ch.l.f3962t5.A();
                long jCurrentTimeMillis = j - System.currentTimeMillis();
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = 0;
                }
                if (((ch.f) this.f2827g).b() && (pendingJob = jobScheduler.getPendingJob(1122115566)) != null && pendingJob.getMinLatencyMillis() < jCurrentTimeMillis) {
                    n.b("KeepAliveExecutionPipeline", hVar.c() + " Job already scheduled with a shorter delay: " + pendingJob.getMinLatencyMillis() + ", not rescheduling");
                    return;
                }
                JobInfo.Builder builder = new JobInfo.Builder(1122115566, componentName);
                if (jCurrentTimeMillis > 0) {
                    n.b("KeepAliveExecutionPipeline", hVar.c() + " Minimum Latency set to " + jCurrentTimeMillis);
                    builder.setMinimumLatency(jCurrentTimeMillis);
                }
                builder.setOverrideDeadline(jCurrentTimeMillis + 1);
                builder.setPersisted(true);
                int iSchedule = jobScheduler.schedule(builder.build());
                n.b("KeepAliveExecutionPipeline", hVar.c() + " scheduled with result : " + iSchedule);
                if (iSchedule == 0) {
                    String strH = h0.b.h(iSchedule, "Error scheduling in keep alive execution pipeline - ");
                    n.b("KeepAliveExecutionPipeline", strH);
                    cj.a.F(strH);
                    return;
                }
                return;
        }
    }

    @Override // ff.b
    public void n(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f2828r;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // qj.a
    public int o(hi.a aVar, String str, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        Uri uriB = ((vi.a) this.f2827g).b(aVar);
        Integer num = (Integer) u((ContentResolver) this.f2826d, uriB, new fi.b(uriB, r(str, list), 1));
        StringBuilder sbU = c7.a.u("Delete items by column name: ", str, " from ");
        sbU.append(aVar.g());
        sbU.append(". deleted rows: ");
        sbU.append(num);
        n.b("ContentProviderDatabaseDataSource", sbU.toString());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f9  */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [ht.b0] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ht.b0 q(xr.q r22, fs.a r23, ht.b0 r24) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bm.d.q(xr.q, fs.a, ht.b0):ht.b0");
    }

    public void t(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f2826d;
        ag.i iVar = new ag.i(byteArrayOutputStream, map, (HashMap) this.f2827g, (xf.d) this.f2828r);
        xf.d dVar = (xf.d) map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, iVar);
        } else {
            throw new xf.b("No encoder for " + obj.getClass());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object u(android.content.ContentResolver r3, android.net.Uri r4, ar.k r5) throws java.lang.Throwable {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2828r
            ch.f r0 = (ch.f) r0
            r1 = 0
            android.content.ContentProviderClient r3 = r3.acquireContentProviderClient(r4)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            java.lang.Object r4 = r5.a(r3)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            if (r3 == 0) goto L1c
            boolean r5 = r0.b()
            if (r5 == 0) goto L19
            r3.close()
            return r4
        L19:
            r3.release()
        L1c:
            return r4
        L1d:
            r4 = move-exception
            r1 = r3
            goto L40
        L20:
            r4 = move-exception
            goto L26
        L22:
            r4 = move-exception
            goto L40
        L24:
            r4 = move-exception
            r3 = r1
        L26:
            java.lang.String r5 = "ContentProviderDatabaseDataSource"
            ch.n.e(r5, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "Exception when executing transaction in ContentProviderDataBaseSource"
            cj.a.E(r4, r5)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L3f
            boolean r4 = r0.b()
            if (r4 == 0) goto L3c
            r3.close()
            goto L3f
        L3c:
            r3.release()
        L3f:
            return r1
        L40:
            if (r1 == 0) goto L4f
            boolean r3 = r0.b()
            if (r3 == 0) goto L4c
            r1.close()
            goto L4f
        L4c:
            r1.release()
        L4f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bm.d.u(android.content.ContentResolver, android.net.Uri, ar.k):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList v() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bm.d.v():java.util.ArrayList");
    }

    public ak.b w() {
        ak.b bVar;
        ak.b bVar2 = (ak.b) this.f2828r;
        if (bVar2 != null) {
            return bVar2;
        }
        String strC = C();
        if (strC != null && (bVar = ((js.e) this.f2827g).e0(strC).f16857b) != null) {
            this.f2828r = bVar;
        }
        return (ak.b) this.f2828r;
    }

    public Intent x() {
        return ((Context) this.f2826d).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    public p y() {
        return ((i1.b) this.f2828r).f11140b.f11138c;
    }

    public ArrayList z(hi.a aVar, String str, List list, List list2, ar.k kVar) throws Throwable {
        ArrayList arrayList = new ArrayList();
        Uri uriB = ((vi.a) this.f2827g).b(aVar);
        List listH = e5.H("DISTINCT ".concat(str));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(listH);
        Object[] array = arrayList2.toArray(new String[arrayList2.size()]);
        l.d(array, "toArray(...)");
        String[] strArr = (String[]) array;
        String strS = s(list, list2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(list2);
        Object[] array2 = arrayList3.toArray(new String[arrayList3.size()]);
        l.d(array2, "toArray(...)");
        u((ContentResolver) this.f2826d, uriB, new fi.c(uriB, strArr, strS, (String[]) array2, kVar));
        return arrayList;
    }

    public d(ch.h hVar, df.c cVar) {
        this.f2825a = 10;
        l.e(hVar, "executorService");
        this.f2826d = hVar;
        this.f2827g = cVar;
        this.f2828r = new HashMap();
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        this.f2825a = i10;
        this.f2826d = obj;
        this.f2827g = obj2;
        this.f2828r = obj3;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, cj.a aVar, int i10) {
        this.f2825a = i10;
        this.f2826d = obj;
        this.f2827g = obj2;
        this.f2828r = obj3;
    }

    public d() {
        this.f2825a = 12;
        this.f2826d = new com.google.android.gms.internal.measurement.b("", 0L, null);
        this.f2827g = new com.google.android.gms.internal.measurement.b("", 0L, null);
        this.f2828r = new ArrayList();
    }

    public d(gk.b bVar, gk.a aVar, gk.a aVar2) {
        this.f2825a = 22;
        l.e(bVar, "rollingWindowScheduleMechanism");
        l.e(aVar, "fixedWindowScheduleMechanism");
        l.e(aVar2, "eventBasedScheduleMechanism");
        this.f2826d = bVar;
        this.f2827g = aVar;
        this.f2828r = aVar2;
    }

    public d(com.google.android.gms.internal.measurement.b bVar) {
        this.f2825a = 12;
        this.f2826d = bVar;
        this.f2827g = bVar.clone();
        this.f2828r = new ArrayList();
    }

    public d(Context context, l2 l2Var) {
        this.f2825a = 27;
        l.e(context, "context");
        this.f2826d = context;
        this.f2827g = l2Var;
        i.f fVar = new i.f(context);
        int i10 = qk.i.let_us_know_dialog;
        i.b bVar = fVar.f11045a;
        bVar.f11003p = null;
        bVar.f11002o = i10;
        bVar.k = false;
        i.g gVarCreate = fVar.create();
        l.d(gVarCreate, "create(...)");
        this.f2828r = gVarCreate;
    }

    public d(r2 r2Var, b9.e eVar, q3.a aVar) {
        this.f2825a = 3;
        l.e(eVar, "recipeEvaluator");
        this.f2826d = r2Var;
        this.f2827g = eVar;
        this.f2828r = aVar;
    }

    public d(f fVar, js.e eVar) {
        this.f2825a = 14;
        this.f2826d = fVar;
        this.f2827g = eVar;
    }

    public d(xi.j jVar, Map map, vh.a aVar) {
        this.f2825a = 26;
        l.e(map, "telephonyPhoneStateRepositories");
        l.e(aVar, "mlvisDiskLogger");
        this.f2826d = jVar;
        this.f2827g = map;
        this.f2828r = aVar;
    }

    public d(SpeedResultActivity speedResultActivity) {
        this.f2825a = 23;
        this.f2826d = speedResultActivity;
        this.f2828r = Executors.newCachedThreadPool();
    }

    public d(q3.a aVar, m mVar, dj.h hVar, r2 r2Var, df.c cVar) {
        this.f2825a = 25;
        this.f2826d = aVar;
        this.f2827g = hVar;
        this.f2828r = r2Var;
    }

    public d(iq.f fVar) {
        this.f2825a = 7;
        l.e(fVar, "timestampProvider");
        yn.b bVar = yn.b.LOCAL;
        mq.x xVar = mq.x.f16946a;
        this.f2826d = xVar;
        this.f2827g = xVar;
        this.f2828r = y.f16947a;
    }

    public d(OpensignalDatabase_Impl opensignalDatabase_Impl) {
        this.f2825a = 0;
        this.f2826d = opensignalDatabase_Impl;
        this.f2827g = new b(opensignalDatabase_Impl, 0);
        this.f2828r = new c(opensignalDatabase_Impl);
    }

    public d(cj.a aVar, ds.e eVar) {
        this.f2825a = 20;
        l.e(eVar, "typeParameterResolver");
        this.f2826d = aVar;
        this.f2827g = eVar;
        this.f2828r = new io.sentry.internal.debugmeta.c(new et.d());
    }

    public d(a2.g gVar) {
        this.f2825a = 18;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2827g = new Object();
        this.f2826d = gVar;
    }

    public d(ConstraintLayout constraintLayout, TextView textView, Button button, Guideline guideline, Button button2, ImageView imageView, View view) {
        this.f2825a = 5;
        this.f2826d = constraintLayout;
        this.f2827g = guideline;
        this.f2828r = view;
    }

    public d(Context context, String str, b5.b0 b0Var) {
        this.f2825a = 8;
        b5.m mVar = new b5.m();
        mVar.f2460r = str;
        this.f2826d = context.getApplicationContext();
        this.f2827g = b0Var;
        this.f2828r = mVar;
    }

    public d(i1.b bVar) {
        this.f2825a = 29;
        this.f2828r = bVar;
        this.f2826d = new h0(this);
    }

    public d(Context context, LocationManager locationManager) {
        this.f2825a = 28;
        this.f2828r = new j0();
        this.f2826d = context;
        this.f2827g = locationManager;
    }

    public d(z2.h hVar) {
        this.f2825a = 1;
        this.f2826d = new ArrayList();
        this.f2827g = new a3.b();
        this.f2828r = hVar;
    }

    public d(y4.c[] cVarArr) {
        this.f2825a = 16;
        f0 f0Var = new f0();
        f5.h0 h0Var = new f5.h0();
        h0Var.f8514c = 1.0f;
        h0Var.f8515d = 1.0f;
        y4.a aVar = y4.a.f25839e;
        h0Var.f8516e = aVar;
        h0Var.f8517f = aVar;
        h0Var.f8518g = aVar;
        h0Var.f8519h = aVar;
        ByteBuffer byteBuffer = y4.c.f25844a;
        h0Var.k = byteBuffer;
        h0Var.f8521l = byteBuffer.asShortBuffer();
        h0Var.f8522m = byteBuffer;
        h0Var.f8513b = -1;
        y4.c[] cVarArr2 = new y4.c[cVarArr.length + 2];
        this.f2826d = cVarArr2;
        System.arraycopy(cVarArr, 0, cVarArr2, 0, cVarArr.length);
        this.f2827g = f0Var;
        this.f2828r = h0Var;
        cVarArr2[cVarArr.length] = f0Var;
        cVarArr2[cVarArr.length + 1] = h0Var;
    }

    public d(f5.z zVar) {
        this.f2825a = 17;
        this.f2828r = zVar;
        this.f2826d = new Handler(Looper.myLooper());
        this.f2827g = new f5.y(0, this);
    }
}
