package P;

import L2.w;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.internal.ads.A5;
import com.google.android.gms.internal.ads.A8;
import com.google.android.gms.internal.ads.AbstractC0582Jp;
import com.google.android.gms.internal.ads.AbstractC1404k5;
import com.google.android.gms.internal.ads.AbstractC2213z5;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.C0971c5;
import com.google.android.gms.internal.ads.C1190g5;
import com.google.android.gms.internal.ads.C1244h5;
import com.google.android.gms.internal.ads.C1264hP;
import com.google.android.gms.internal.ads.C1283hr;
import com.google.android.gms.internal.ads.C1338iu;
import com.google.android.gms.internal.ads.C1350j5;
import com.google.android.gms.internal.ads.C1458l5;
import com.google.android.gms.internal.ads.C1465lC;
import com.google.android.gms.internal.ads.C1636oL;
import com.google.android.gms.internal.ads.C1728q5;
import com.google.android.gms.internal.ads.C1994v2;
import com.google.android.gms.internal.ads.C2051w5;
import com.google.android.gms.internal.ads.C2055w9;
import com.google.android.gms.internal.ads.C2109x9;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.EnumC0917b5;
import com.google.android.gms.internal.ads.EnumC1512m5;
import com.google.android.gms.internal.ads.Eu;
import com.google.android.gms.internal.ads.I8;
import com.google.android.gms.internal.ads.J4;
import com.google.android.gms.internal.ads.J8;
import com.google.android.gms.internal.ads.L8;
import com.google.android.gms.internal.ads.R8;
import com.google.android.gms.internal.ads.S8;
import h.C;
import java.util.ArrayList;
import java.util.HashMap;
import n.MenuC2677k;
import n.v;
import n1.z;
import o.C2713g;
import o.C2723l;
import p2.j;
import u2.C2951a;
import u2.k;
import x3.InterfaceC2994C;

/* loaded from: classes.dex */
public final class g implements BD, Eu, v, InterfaceC2994C {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3117a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3118b;

    public g(int i) {
        switch (i) {
            case 4:
                this.f3118b = new SparseBooleanArray();
                break;
            case 7:
                this.f3118b = new Handler(Looper.getMainLooper(), new J3.c(1));
                break;
            default:
                w wVar = new w(5, (byte) 0);
                C1994v2 c1994v2 = new C1994v2(23);
                C1728q5 c1728q5 = new C1728q5(C1458l5.f15349b, 0, new C1994v2(false));
                c1728q5.f16320d = c1994v2;
                this.f3118b = new A5(wVar, c1728q5);
                this.f3117a = false;
                break;
        }
    }

    public boolean a() {
        return this.f3117a;
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object b(Object obj) {
        long j6;
        C1338iu c1338iu = (C1338iu) this.f3118b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f3117a) {
            ((Context) c1338iu.f14822b).deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(I8.P(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (C1636oL e6) {
                k.e("Unable to deserialize proto from offline signals database:");
                k.e(e6.getMessage());
            }
        }
        cursorQuery.close();
        Context context = (Context) c1338iu.f14822b;
        J8 j8A = L8.A();
        String packageName = context.getPackageName();
        j8A.b();
        ((L8) j8A.f13551b).F(packageName);
        String str = Build.MODEL;
        j8A.b();
        ((L8) j8A.f13551b).G();
        int iD = AbstractC0582Jp.D(sQLiteDatabase, 0);
        j8A.b();
        ((L8) j8A.f13551b).C(iD);
        j8A.b();
        ((L8) j8A.f13551b).B(arrayList);
        int iD2 = AbstractC0582Jp.D(sQLiteDatabase, 1);
        j8A.b();
        ((L8) j8A.f13551b).D(iD2);
        int iD3 = AbstractC0582Jp.D(sQLiteDatabase, 3);
        j8A.b();
        ((L8) j8A.f13551b).I(iD3);
        j.f22785C.f22797k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        j8A.b();
        ((L8) j8A.f13551b).E(jCurrentTimeMillis);
        Cursor cursorC0 = AbstractC0582Jp.c0(sQLiteDatabase, 2);
        if (cursorC0.getCount() > 0) {
            cursorC0.moveToNext();
            j6 = cursorC0.getLong(cursorC0.getColumnIndexOrThrow("value"));
        } else {
            j6 = 0;
        }
        cursorC0.close();
        j8A.b();
        ((L8) j8A.f13551b).H(j6);
        L8 l8 = (L8) j8A.d();
        int size = arrayList.size();
        long jN = 0;
        for (int i = 0; i < size; i++) {
            I8 i8 = (I8) arrayList.get(i);
            if (i8.O() == 2 && i8.N() > jN) {
                jN = i8.N();
            }
        }
        if (jN != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jN));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        A8 a8 = (A8) c1338iu.f14823c;
        synchronized (a8) {
            if (a8.f6938c) {
                try {
                    C2055w9 c2055w9 = a8.f6937b;
                    c2055w9.b();
                    ((C2109x9) c2055w9.f13551b).I(l8);
                } catch (NullPointerException e7) {
                    j.f22785C.f22795h.f("AdMobClearcutLogger.modify", e7);
                }
            }
        }
        C2951a c2951a = (C2951a) c1338iu.f14824d;
        R8 r8B = S8.B();
        int i3 = c2951a.f23785b;
        r8B.b();
        ((S8) r8B.f13551b).C(i3);
        int i6 = c2951a.f23786c;
        r8B.b();
        ((S8) r8B.f13551b).D(i6);
        int i7 = true != c2951a.f23787d ? 2 : 0;
        r8B.b();
        ((S8) r8B.f13551b).A(i7);
        a8.a(new C1283hr(24, (S8) r8B.d()));
        a8.b(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        AbstractC0582Jp.f0(sQLiteDatabase, "failed_requests");
        AbstractC0582Jp.f0(sQLiteDatabase, "total_requests");
        AbstractC0582Jp.f0(sQLiteDatabase, "completed_requests");
        return null;
    }

    @Override // n.v
    public void c(MenuC2677k menuC2677k, boolean z6) {
        C2723l c2723l;
        C c6 = (C) this.f3118b;
        if (this.f3117a) {
            return;
        }
        this.f3117a = true;
        ActionMenuView actionMenuView = c6.f20259a.f22522a.f5005a;
        if (actionMenuView != null && (c2723l = actionMenuView.f4848H) != null) {
            c2723l.g();
            C2713g c2713g = c2723l.f22549I;
            if (c2713g != null && c2713g.b()) {
                c2713g.i.dismiss();
            }
        }
        c6.f20260b.onPanelClosed(108, menuC2677k);
        this.f3117a = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo11d(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P.g.mo11d(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L48
            if (r8 < 0) goto L48
            int r0 = r7.length()
            int r0 = r0 - r8
            if (r0 < 0) goto L48
            java.lang.Object r0 = r6.f3118b
            P.f r0 = (P.f) r0
            if (r0 != 0) goto L16
            boolean r7 = r6.a()
            return r7
        L16:
            r0.getClass()
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L1d:
            r4 = 1
            if (r2 >= r8) goto L3d
            if (r3 != r1) goto L3d
            char r3 = r7.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            P.g r5 = P.h.f3119a
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
            boolean r7 = r6.a()
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
        throw new UnsupportedOperationException("Method not decompiled: P.g.e(java.lang.CharSequence, int):boolean");
    }

    public synchronized void f(z zVar, boolean z6) {
        try {
            if (this.f3117a || z6) {
                ((Handler) this.f3118b).obtainMessage(1, zVar).sendToTarget();
            } else {
                this.f3117a = true;
                zVar.b();
                this.f3117a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // n.v
    public boolean g(MenuC2677k menuC2677k) {
        ((C) this.f3118b).f20260b.onMenuOpened(108, menuC2677k);
        return true;
    }

    public void h() {
        A5 a52 = (A5) this.f3118b;
        boolean z6 = this.f3117a;
        String strA = AbstractC1404k5.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
        if (z6) {
            return;
        }
        try {
            HashMap map = AbstractC2213z5.f17829a;
            J4 j42 = new J4(4);
            j42.k(EnumC1512m5.f15552a, E5.f(C1244h5.f14444s));
            j42.k(EnumC1512m5.f15554b, C1994v2.o(0L));
            j42.k(EnumC1512m5.f15555c, C1994v2.o(1L));
            j42.k(EnumC1512m5.f15557d, C1994v2.o(2L));
            j42.k(EnumC1512m5.f15559e, C1994v2.o(3L));
            j42.k(EnumC1512m5.f15561f, C1994v2.o(4L));
            j42.k(EnumC1512m5.f15563g, C1994v2.o(7L));
            j42.k(EnumC1512m5.f15565h, C1994v2.o(-1L));
            j42.k(EnumC1512m5.i, C1994v2.o(-2L));
            j42.k(EnumC1512m5.f15568j, E5.f(C1190g5.f14199b));
            j42.k(EnumC1512m5.f15570k, E5.f(C1190g5.f14201d));
            j42.k(EnumC1512m5.f15572l, E5.f(C1190g5.f14206j));
            j42.k(EnumC1512m5.f15574m, E5.f(C1190g5.f14207k));
            j42.k(EnumC1512m5.f15576n, E5.f(C1190g5.f14210n));
            j42.k(EnumC1512m5.f15529C, E5.f(C1244h5.f14439n));
            j42.k(EnumC1512m5.f15530D, E5.f(C1190g5.f14203f));
            j42.k(EnumC1512m5.f15531E, E5.f(C1190g5.f14204g));
            j42.k(EnumC1512m5.f15532F, E5.f(C1190g5.f14205h));
            j42.k(EnumC1512m5.f15533G, E5.f(C1190g5.i));
            j42.k(EnumC1512m5.f15534H, E5.f(C1244h5.f14434h));
            j42.k(EnumC1512m5.f15535I, E5.f(C1244h5.f14435j));
            j42.k(EnumC1512m5.f15537K, E5.f(C1190g5.f14211o));
            j42.k(EnumC1512m5.f15538L, E5.f(C1190g5.f14212p));
            j42.k(EnumC1512m5.M, E5.f(C1190g5.f14215s));
            j42.k(EnumC1512m5.f15539N, E5.f(C1190g5.f14216t));
            j42.k(EnumC1512m5.f15540O, E5.f(C1190g5.f14217u));
            j42.k(EnumC1512m5.f15541P, E5.f(C1190g5.f14218v));
            j42.k(EnumC1512m5.f15542Q, E5.f(C1244h5.f14428b));
            j42.k(EnumC1512m5.f15543R, E5.f(C1244h5.f14430d));
            j42.k(EnumC1512m5.f15544S, E5.f(C1244h5.f14431e));
            j42.k(EnumC1512m5.f15545T, E5.f(C1244h5.f14432f));
            j42.k(EnumC1512m5.f15546U, E5.f(C1244h5.f14436k));
            j42.k(EnumC1512m5.f15547V, E5.f(C1244h5.f14437l));
            j42.k(EnumC1512m5.f15548W, E5.f(C1244h5.f14441p));
            j42.k(EnumC1512m5.f15549X, E5.f(C1244h5.f14442q));
            j42.k(EnumC1512m5.f15550Y, E5.f(C1244h5.f14446u));
            j42.k(EnumC1512m5.f15551Z, E5.f(C1244h5.f14447v));
            j42.k(EnumC1512m5.f15553a0, E5.f(C1350j5.f14892b));
            j42.k(EnumC1512m5.b0, E5.f(C1350j5.f14894d));
            j42.k(EnumC1512m5.f15567i0, E5.f(C1350j5.f14895e));
            j42.k(EnumC1512m5.f15556c0, E5.f(C1350j5.f14899j));
            j42.k(EnumC1512m5.f15558d0, E5.f(C1350j5.f14900k));
            j42.k(EnumC1512m5.f15560e0, E5.f(C1350j5.f14903n));
            j42.k(EnumC1512m5.f15562f0, E5.f(C1350j5.f14906q));
            j42.k(EnumC1512m5.f15564g0, E5.f(C1190g5.f14213q));
            j42.k(EnumC1512m5.f15566h0, E5.f(C1350j5.f14901l));
            j42.k(EnumC1512m5.f15569j0, E5.f(C1190g5.f14208l));
            j42.k(EnumC1512m5.f15571k0, E5.f(C1350j5.f14897g));
            j42.k(EnumC1512m5.f15573l0, E5.f(C1350j5.f14898h));
            j42.k(EnumC1512m5.f15536J, E5.f(C1244h5.i));
            j42.k(EnumC1512m5.f15575m0, E5.f(C1350j5.f14905p));
            j42.k(EnumC1512m5.f15577n0, E5.f(C1244h5.f14438m));
            j42.k(EnumC1512m5.f15578o0, E5.f(C1350j5.f14904o));
            j42.k(EnumC1512m5.f15579p0, E5.f(C1244h5.f14429c));
            j42.k(EnumC1512m5.f15580q0, E5.f(C1350j5.f14893c));
            j42.k(EnumC1512m5.f15581r0, E5.f(C1190g5.f14214r));
            j42.k(EnumC1512m5.f15582s0, E5.f(C1350j5.f14902m));
            j42.k(EnumC1512m5.f15583t0, E5.f(C1190g5.f14202e));
            j42.k(EnumC1512m5.f15584u0, E5.f(C1350j5.f14896f));
            j42.k(EnumC1512m5.v0, E5.f(C1244h5.f14445t));
            j42.k(EnumC1512m5.f15585w0, E5.f(C1190g5.f14200c));
            j42.k(EnumC1512m5.f15586x0, E5.f(C1350j5.i));
            j42.k(EnumC1512m5.f15587y0, E5.f(C1244h5.f14440o));
            j42.k(EnumC1512m5.f15588z0, E5.f(C1190g5.f14209m));
            j42.k(EnumC1512m5.f15527A0, E5.f(C1244h5.f14443r));
            j42.k(EnumC1512m5.f15528B0, E5.f(C1244h5.f14433g));
            C1465lC c1465lCW = j42.w(true);
            for (long j6 = -1; j6 >= -82; j6--) {
                EnumC1512m5 enumC1512m5 = (EnumC1512m5) map.get(Long.valueOf(j6));
                if (enumC1512m5 == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 36);
                    sb.append(strA);
                    sb.append(j6);
                    throw new J0.c(sb.toString());
                }
                a52.f6931a.r((E5) c1465lCW.get(enumC1512m5));
            }
            for (int i = 82; i < 1159; i++) {
                a52.f6931a.r(E5.a(null));
            }
            this.f3117a = true;
        } catch (C2051w5 e6) {
            throw new C0971c5(EnumC0917b5.f13304b, e6);
        }
    }

    public void i(int i) {
        AbstractC0582Jp.h0(!this.f3117a);
        ((SparseBooleanArray) this.f3118b).append(i, true);
    }

    public C1264hP j() {
        AbstractC0582Jp.h0(!this.f3117a);
        this.f3117a = true;
        return new C1264hP((SparseBooleanArray) this.f3118b);
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0407 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(j$.util.Optional r21) throws com.google.android.gms.internal.ads.C0971c5, com.google.android.gms.internal.ads.Z4 {
        /*
            Method dump skipped, instructions count: 1388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P.g.k(j$.util.Optional):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    @Override // x3.InterfaceC2994C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public R.r0 l(android.view.View r13, R.r0 r14, com.google.android.gms.internal.ads.Rr r15) {
        /*
            r12 = this;
            R.o0 r0 = r14.f3359a
            r1 = 519(0x207, float:7.27E-43)
            J.c r1 = r0.f(r1)
            r2 = 32
            J.c r0 = r0.f(r2)
            java.lang.Object r2 = r12.f3118b
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            int r3 = r1.f2008b
            int r4 = r1.f2009c
            int r5 = r1.f2007a
            r2.f18122K = r3
            int r3 = r13.getLayoutDirection()
            r6 = 0
            r7 = 1
            if (r3 != r7) goto L24
            r3 = r7
            goto L25
        L24:
            r3 = r6
        L25:
            int r8 = r13.getPaddingBottom()
            int r9 = r13.getPaddingLeft()
            int r10 = r13.getPaddingRight()
            boolean r11 = r2.f18114C
            if (r11 == 0) goto L3e
            int r8 = r14.a()
            r2.f18121J = r8
            int r11 = r15.f11057d
            int r8 = r8 + r11
        L3e:
            boolean r11 = r2.f18115D
            if (r11 == 0) goto L4a
            if (r3 == 0) goto L47
            int r9 = r15.f11056c
            goto L49
        L47:
            int r9 = r15.f11054a
        L49:
            int r9 = r9 + r5
        L4a:
            boolean r11 = r2.f18116E
            if (r11 == 0) goto L57
            if (r3 == 0) goto L53
            int r15 = r15.f11054a
            goto L55
        L53:
            int r15 = r15.f11056c
        L55:
            int r10 = r15 + r4
        L57:
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r15 = (android.view.ViewGroup.MarginLayoutParams) r15
            boolean r3 = r2.f18118G
            if (r3 == 0) goto L68
            int r3 = r15.leftMargin
            if (r3 == r5) goto L68
            r15.leftMargin = r5
            r6 = r7
        L68:
            boolean r3 = r2.f18119H
            if (r3 == 0) goto L73
            int r3 = r15.rightMargin
            if (r3 == r4) goto L73
            r15.rightMargin = r4
            r6 = r7
        L73:
            boolean r3 = r2.f18120I
            if (r3 == 0) goto L80
            int r3 = r15.topMargin
            int r1 = r1.f2008b
            if (r3 == r1) goto L80
            r15.topMargin = r1
            goto L81
        L80:
            r7 = r6
        L81:
            if (r7 == 0) goto L86
            r13.setLayoutParams(r15)
        L86:
            int r15 = r13.getPaddingTop()
            r13.setPadding(r9, r15, r10, r8)
            boolean r13 = r12.f3117a
            if (r13 == 0) goto L95
            int r15 = r0.f2010d
            r2.f18159m = r15
        L95:
            boolean r15 = r2.f18114C
            if (r15 != 0) goto L9d
            if (r13 == 0) goto L9c
            goto L9d
        L9c:
            return r14
        L9d:
            r2.P()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: P.g.l(android.view.View, R.r0, com.google.android.gms.internal.ads.Rr):R.r0");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(long r34, j$.util.Optional r36) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P.g.m(long, j$.util.Optional):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        k.e("Failed to get signals bundle");
    }

    public /* synthetic */ g(Object obj) {
        this.f3118b = obj;
    }

    public /* synthetic */ g(Object obj, boolean z6) {
        this.f3117a = z6;
        this.f3118b = obj;
    }

    public g(f fVar, boolean z6) {
        this(fVar);
        this.f3117a = z6;
    }
}
