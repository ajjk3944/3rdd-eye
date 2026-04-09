package a4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.ActionMenuView;
import androidx.lifecycle.f1;
import com.google.android.gms.internal.ads.ao1;
import com.google.android.gms.internal.ads.cc;
import com.google.android.gms.internal.ads.cj;
import com.google.android.gms.internal.ads.dc;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.gc;
import com.google.android.gms.internal.ads.hb;
import com.google.android.gms.internal.ads.hc;
import com.google.android.gms.internal.ads.hk;
import com.google.android.gms.internal.ads.ib;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.lc;
import com.google.android.gms.internal.ads.li;
import com.google.android.gms.internal.ads.lr0;
import com.google.android.gms.internal.ads.mb;
import com.google.android.gms.internal.ads.mq0;
import com.google.android.gms.internal.ads.nb;
import com.google.android.gms.internal.ads.ne0;
import com.google.android.gms.internal.ads.nn1;
import com.google.android.gms.internal.ads.oa;
import com.google.android.gms.internal.ads.p81;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.pq0;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rb;
import com.google.android.gms.internal.ads.sb;
import com.google.android.gms.internal.ads.ti;
import com.google.android.gms.internal.ads.ui;
import com.google.android.gms.internal.ads.w5;
import com.google.android.gms.internal.ads.wb;
import com.google.android.gms.internal.ads.wi;
import com.google.android.gms.internal.ads.yv1;
import com.google.android.gms.internal.ads.z51;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.u;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import d0.z1;
import d3.p;
import i.d0;
import java.util.ArrayList;
import java.util.HashMap;
import o.x;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d implements p81, lr0, b2.a, x, pi.i, le.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f188a;

    /* renamed from: b, reason: collision with root package name */
    public Object f189b;

    public d(int i4) {
        switch (i4) {
            case 5:
                this.f189b = new SparseBooleanArray();
                break;
            case 8:
                this.f189b = new z2.k();
                this.f188a = false;
                break;
            case 15:
                this.f189b = new Handler(Looper.getMainLooper(), new hd.a(1));
                break;
            default:
                dc dcVar = new dc(0);
                w5 w5Var = new w5(23);
                wb wbVar = new wb(rb.f15609b, 0, new w5(false));
                wbVar.f17960d = w5Var;
                this.f189b = new hc(dcVar, wbVar);
                this.f188a = false;
                break;
        }
    }

    public n4 A(String str, boolean z3) {
        Boolean boolValueOf = Boolean.valueOf(z3);
        Object obj = n4.g;
        return new n4(this, str, boolValueOf, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object B(long r34, j$.util.Optional r36) throws com.google.android.gms.internal.ads.fb, com.google.android.gms.internal.ads.ib {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.d.B(long, j$.util.Optional):java.lang.Object");
    }

    public n4 C(String str, String str2) {
        Object obj = n4.g;
        return new n4(this, str, str2, 3);
    }

    @Override // b2.a
    public long U(long j, long j8, int i4) {
        if (!this.f188a) {
            return 0L;
        }
        z1 z1Var = (z1) this.f189b;
        if (z1Var.f21919a.b()) {
            return 0L;
        }
        return z1Var.h(z1Var.d(z1Var.f21919a.e(z1Var.d(z1Var.g(j8)))));
    }

    @Override // pi.i
    public void a() {
        if (this.f188a) {
            return;
        }
        StorageCleanActivity storageCleanActivity = (StorageCleanActivity) this.f189b;
        int i4 = StorageCleanActivity.K;
        storageCleanActivity.E();
        this.f188a = true;
    }

    @Override // le.k
    public void b(le.j jVar, int i4) {
        StringBuilder sb2 = (StringBuilder) this.f189b;
        if (this.f188a) {
            this.f188a = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i4);
    }

    @Override // com.google.android.gms.internal.ads.lr0
    /* renamed from: c */
    public Object mo170c(Object obj) {
        long j;
        pq0 pq0Var = (pq0) this.f189b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f188a) {
            ((Context) pq0Var.f15073b).deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(ti.P(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (ao1 e2) {
                za.i.e("Unable to deserialize proto from offline signals database:");
                za.i.e(e2.getMessage());
            }
        }
        cursorQuery.close();
        Context context = (Context) pq0Var.f15073b;
        ui uiVarA = wi.A();
        String packageName = context.getPackageName();
        uiVarA.b();
        ((wi) uiVarA.f14755b).F(packageName);
        String str = Build.MODEL;
        uiVarA.b();
        ((wi) uiVarA.f14755b).G();
        int iN = nn1.n(sQLiteDatabase, 0);
        uiVarA.b();
        ((wi) uiVarA.f14755b).C(iN);
        uiVarA.b();
        ((wi) uiVarA.f14755b).B(arrayList);
        int iN2 = nn1.n(sQLiteDatabase, 1);
        uiVarA.b();
        ((wi) uiVarA.f14755b).D(iN2);
        int iN3 = nn1.n(sQLiteDatabase, 3);
        uiVarA.b();
        ((wi) uiVarA.f14755b).I(iN3);
        ua.j.C.f35267k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        uiVarA.b();
        ((wi) uiVarA.f14755b).E(jCurrentTimeMillis);
        Cursor cursorB = nn1.B(sQLiteDatabase, 2);
        if (cursorB.getCount() > 0) {
            cursorB.moveToNext();
            j = cursorB.getLong(cursorB.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        cursorB.close();
        uiVarA.b();
        ((wi) uiVarA.f14755b).H(j);
        wi wiVar = (wi) uiVarA.e();
        int size = arrayList.size();
        long jN = 0;
        for (int i4 = 0; i4 < size; i4++) {
            ti tiVar = (ti) arrayList.get(i4);
            if (tiVar.O() == 2 && tiVar.N() > jN) {
                jN = tiVar.N();
            }
        }
        if (jN != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jN));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        li liVar = (li) pq0Var.f15074c;
        synchronized (liVar) {
            if (liVar.f13496c) {
                try {
                    hk hkVar = liVar.f13495b;
                    hkVar.b();
                    ((ik) hkVar.f14755b).I(wiVar);
                } catch (NullPointerException e10) {
                    ua.j.C.f35265h.f("AdMobClearcutLogger.modify", e10);
                }
            }
        }
        za.a aVar = (za.a) pq0Var.f15075d;
        cj cjVarB = dj.B();
        int i10 = aVar.f38130b;
        cjVarB.b();
        ((dj) cjVarB.f14755b).C(i10);
        int i11 = aVar.f38131c;
        cjVarB.b();
        ((dj) cjVarB.f14755b).D(i11);
        int i12 = true != aVar.f38132d ? 2 : 0;
        cjVarB.b();
        ((dj) cjVarB.f14755b).A(i12);
        liVar.a(new ne0(4, (dj) cjVarB.e()));
        liVar.b(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        nn1.E(sQLiteDatabase, "failed_requests");
        nn1.E(sQLiteDatabase, "total_requests");
        nn1.E(sQLiteDatabase, "completed_requests");
        return null;
    }

    public void d() {
        synchronized (this) {
            try {
                if (this.f188a) {
                    return;
                }
                this.f188a = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f189b;
                if (cancellationSignal != null) {
                    try {
                        cancellationSignal.cancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // o.x
    public void e(o.m mVar, boolean z3) {
        p.k kVar;
        d0 d0Var = (d0) this.f189b;
        if (this.f188a) {
            return;
        }
        this.f188a = true;
        ActionMenuView actionMenuView = d0Var.f25276b.f30779a.f818a;
        if (actionMenuView != null && (kVar = actionMenuView.f749t) != null) {
            kVar.h();
            p.g gVar = kVar.f30742t;
            if (gVar != null && gVar.b()) {
                gVar.f30307i.dismiss();
            }
        }
        d0Var.f25277c.onPanelClosed(108, mVar);
        this.f188a = false;
    }

    public boolean f() {
        return this.f188a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(int r7, java.lang.CharSequence r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L48
            if (r7 < 0) goto L48
            int r0 = r8.length()
            int r0 = r0 - r7
            if (r0 < 0) goto L48
            java.lang.Object r0 = r6.f189b
            c4.e r0 = (c4.e) r0
            if (r0 != 0) goto L16
            boolean r7 = r6.f()
            return r7
        L16:
            r0.getClass()
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L1d:
            r4 = 1
            if (r2 >= r7) goto L3d
            if (r3 != r1) goto L3d
            char r3 = r8.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            a4.d r5 = c4.f.f2754a
            if (r3 == 0) goto L39
            if (r3 == r4) goto L37
            if (r3 == r1) goto L37
            switch(r3) {
                case 14: goto L39;
                case 15: goto L39;
                case 16: goto L37;
                case 17: goto L37;
                default: goto L35;
            }
        L35:
            r3 = r1
            goto L3a
        L37:
            r3 = r0
            goto L3a
        L39:
            r3 = r4
        L3a:
            int r2 = r2 + 1
            goto L1d
        L3d:
            if (r3 == 0) goto L47
            if (r3 == r4) goto L46
            boolean r7 = r6.f()
            return r7
        L46:
            return r0
        L47:
            return r4
        L48:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.d.g(int, java.lang.CharSequence):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo163h(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.d.mo163h(java.lang.Object):void");
    }

    public void i() {
        this.f188a = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // b2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(long r4, long r6, ck.c r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof d0.n1
            if (r4 == 0) goto L13
            r4 = r8
            d0.n1 r4 = (d0.n1) r4
            int r5 = r4.f21802d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.f21802d = r5
            goto L1a
        L13:
            d0.n1 r4 = new d0.n1
            ek.c r8 = (ek.c) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.f21800b
            int r8 = r4.f21802d
            r0 = 1
            if (r8 == 0) goto L31
            if (r8 != r0) goto L29
            long r6 = r4.f21799a
            ci.b.D(r5)
            goto L50
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ci.b.D(r5)
            boolean r5 = r3.f188a
            r1 = 0
            if (r5 == 0) goto L58
            java.lang.Object r5 = r3.f189b
            d0.z1 r5 = (d0.z1) r5
            boolean r8 = r5.f21926i
            if (r8 == 0) goto L43
            goto L54
        L43:
            r4.f21799a = r6
            r4.f21802d = r0
            java.lang.Object r5 = r5.a(r6, r4)
            dk.a r4 = dk.a.f22275a
            if (r5 != r4) goto L50
            return r4
        L50:
            d3.p r5 = (d3.p) r5
            long r1 = r5.f21974a
        L54:
            long r1 = d3.p.d(r6, r1)
        L58:
            d3.p r4 = new d3.p
            r4.<init>(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.d.j(long, long, ck.c):java.lang.Object");
    }

    public void k(char c9) {
        t7.m mVar = (t7.m) this.f189b;
        mVar.l(mVar.f34473b, 1);
        char[] cArr = (char[]) mVar.f34474c;
        int i4 = mVar.f34473b;
        mVar.f34473b = i4 + 1;
        cArr[i4] = c9;
    }

    public synchronized void l(y yVar, boolean z3) {
        try {
            if (this.f188a || z3) {
                ((Handler) this.f189b).obtainMessage(1, yVar).sendToTarget();
            } else {
                this.f188a = true;
                yVar.a();
                this.f188a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        za.i.e("Failed to get signals bundle");
    }

    public void p() throws ib {
        hc hcVar = (hc) this.f189b;
        boolean z3 = this.f188a;
        String strA = qb.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
        if (z3) {
            return;
        }
        try {
            HashMap map = gc.f11484a;
            oa oaVar = new oa(4);
            oaVar.i(sb.f15942a, lc.f(nb.f14215s));
            oaVar.i(sb.f15944b, w5.q(0L));
            oaVar.i(sb.f15946c, w5.q(1L));
            oaVar.i(sb.f15948d, w5.q(2L));
            oaVar.i(sb.f15950e, w5.q(3L));
            oaVar.i(sb.f15952f, w5.q(4L));
            oaVar.i(sb.g, w5.q(7L));
            oaVar.i(sb.f15955h, w5.q(-1L));
            oaVar.i(sb.f15957i, w5.q(-2L));
            oaVar.i(sb.j, lc.f(mb.f13837b));
            oaVar.i(sb.f15960k, lc.f(mb.f13839d));
            oaVar.i(sb.f15962l, lc.f(mb.j));
            oaVar.i(sb.f15964m, lc.f(mb.f13844k));
            oaVar.i(sb.f15966n, lc.f(mb.f13847n));
            oaVar.i(sb.f15968o, lc.f(nb.f14210n));
            oaVar.i(sb.f15969p, lc.f(mb.f13841f));
            oaVar.i(sb.f15970q, lc.f(mb.g));
            oaVar.i(sb.f15971r, lc.f(mb.f13842h));
            oaVar.i(sb.f15972s, lc.f(mb.f13843i));
            oaVar.i(sb.f15973t, lc.f(nb.f14205h));
            oaVar.i(sb.f15974u, lc.f(nb.j));
            oaVar.i(sb.f15976w, lc.f(mb.f13848o));
            oaVar.i(sb.f15977x, lc.f(mb.f13849p));
            oaVar.i(sb.f15978y, lc.f(mb.f13852s));
            oaVar.i(sb.f15979z, lc.f(mb.f13853t));
            oaVar.i(sb.A, lc.f(mb.f13854u));
            oaVar.i(sb.B, lc.f(mb.f13855v));
            oaVar.i(sb.C, lc.f(nb.f14200b));
            oaVar.i(sb.D, lc.f(nb.f14202d));
            oaVar.i(sb.E, lc.f(nb.f14203e));
            oaVar.i(sb.F, lc.f(nb.f14204f));
            oaVar.i(sb.G, lc.f(nb.f14207k));
            oaVar.i(sb.H, lc.f(nb.f14208l));
            oaVar.i(sb.I, lc.f(nb.f14212p));
            oaVar.i(sb.J, lc.f(nb.f14213q));
            oaVar.i(sb.K, lc.f(nb.f14217u));
            oaVar.i(sb.L, lc.f(nb.f14218v));
            oaVar.i(sb.M, lc.f(pb.f14954b));
            oaVar.i(sb.N, lc.f(pb.f14956d));
            oaVar.i(sb.U, lc.f(pb.f14957e));
            oaVar.i(sb.O, lc.f(pb.j));
            oaVar.i(sb.P, lc.f(pb.f14961k));
            oaVar.i(sb.Q, lc.f(pb.f14964n));
            oaVar.i(sb.R, lc.f(pb.f14967q));
            oaVar.i(sb.S, lc.f(mb.f13850q));
            oaVar.i(sb.T, lc.f(pb.f14962l));
            oaVar.i(sb.V, lc.f(mb.f13845l));
            oaVar.i(sb.W, lc.f(pb.g));
            oaVar.i(sb.X, lc.f(pb.f14959h));
            oaVar.i(sb.f15975v, lc.f(nb.f14206i));
            oaVar.i(sb.Y, lc.f(pb.f14966p));
            oaVar.i(sb.Z, lc.f(nb.f14209m));
            oaVar.i(sb.f15943a0, lc.f(pb.f14965o));
            oaVar.i(sb.f15945b0, lc.f(nb.f14201c));
            oaVar.i(sb.f15947c0, lc.f(pb.f14955c));
            oaVar.i(sb.f15949d0, lc.f(mb.f13851r));
            oaVar.i(sb.f15951e0, lc.f(pb.f14963m));
            oaVar.i(sb.f15953f0, lc.f(mb.f13840e));
            oaVar.i(sb.f15954g0, lc.f(pb.f14958f));
            oaVar.i(sb.f15956h0, lc.f(nb.f14216t));
            oaVar.i(sb.f15958i0, lc.f(mb.f13838c));
            oaVar.i(sb.f15959j0, lc.f(pb.f14960i));
            oaVar.i(sb.f15961k0, lc.f(nb.f14211o));
            oaVar.i(sb.f15963l0, lc.f(mb.f13846m));
            oaVar.i(sb.f15965m0, lc.f(nb.f14214r));
            oaVar.i(sb.f15967n0, lc.f(nb.g));
            z51 z51VarV = oaVar.v(true);
            for (long j = -1; j >= -82; j--) {
                sb sbVar = (sb) map.get(Long.valueOf(j));
                if (sbVar == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 36);
                    sb2.append(strA);
                    sb2.append(j);
                    throw new ac.m(sb2.toString());
                }
                hcVar.f11824a.d((lc) z51VarV.get(sbVar));
            }
            for (int i4 = 82; i4 < 1159; i4++) {
                hcVar.f11824a.d(lc.a(null));
            }
            this.f188a = true;
        } catch (cc e2) {
            throw new ib(hb.f11802b, e2);
        }
    }

    @Override // b2.a
    public Object q(long j, ck.c cVar) {
        return new p(0L);
    }

    @Override // pi.i
    public void r() {
        StorageCleanActivity storageCleanActivity = (StorageCleanActivity) this.f189b;
        storageCleanActivity.f32744a.a(new jg.k(storageCleanActivity, this));
    }

    public void s(int i4) {
        mq0.c0(!this.f188a);
        ((SparseBooleanArray) this.f189b).append(i4, true);
    }

    @Override // pi.i
    public void t(String str) {
        nk.k.e(str, "msg");
        if (this.f188a) {
            return;
        }
        StorageCleanActivity storageCleanActivity = (StorageCleanActivity) this.f189b;
        int i4 = StorageCleanActivity.K;
        storageCleanActivity.E();
        this.f188a = true;
    }

    public void u(p3 p3Var) {
        if (this.f188a) {
            u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((f1) this.f189b).I(new ba.a(p3Var, ba.c.f2090a), new com.google.gson.internal.b(14));
        } catch (Throwable unused) {
            u.h("BillingLogger", "logging failed.");
        }
    }

    @Override // o.x
    public boolean v(o.m mVar) {
        ((d0) this.f189b).f25277c.onMenuOpened(108, mVar);
        return true;
    }

    public yv1 w() {
        mq0.c0(!this.f188a);
        this.f188a = true;
        return new yv1((SparseBooleanArray) this.f189b);
    }

    public n4 x(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        Object obj = n4.g;
        return new n4(this, str, lValueOf, 0);
    }

    @Override // b2.a
    public /* synthetic */ long y(int i4, long j) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0441 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0406 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object z(j$.util.Optional r21) throws com.google.android.gms.internal.ads.fb, com.google.android.gms.internal.ads.ib {
        /*
            Method dump skipped, instructions count: 1387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.d.z(j$.util.Optional):java.lang.Object");
    }

    public d(Uri uri, boolean z3, boolean z10) {
        this.f189b = uri;
        this.f188a = z3;
    }

    public /* synthetic */ d(Object obj) {
        this.f189b = obj;
    }

    public /* synthetic */ d(Object obj, byte b10) {
        this.f189b = obj;
        this.f188a = true;
    }

    public /* synthetic */ d(Object obj, boolean z3) {
        this.f188a = z3;
        this.f189b = obj;
    }

    public d(c4.e eVar, boolean z3) {
        this(eVar);
        this.f188a = z3;
    }

    public void m() {
    }

    public void o() {
    }
}
