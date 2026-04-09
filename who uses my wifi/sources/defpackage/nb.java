package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nb implements d71, ee0, iq3, o93 {
    public boolean f;
    public final Object g;

    public nb(int i) {
        switch (i) {
            case 6:
                this.g = new SparseBooleanArray();
                break;
            default:
                t3 t3Var = new t3(9, (byte) 0);
                us0 us0Var = new us0();
                r2 r2Var = new r2(vp1.b, 0, new ts0());
                r2Var.j = us0Var;
                this.g = new iq1(t3Var, r2Var);
                this.f = false;
                break;
        }
    }

    public boolean a() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L48
            if (r8 < 0) goto L48
            int r0 = r7.length()
            int r0 = r0 - r8
            if (r0 < 0) goto L48
            java.lang.Object r0 = r6.g
            pz r0 = (defpackage.pz) r0
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
            nb r5 = defpackage.w01.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb.b(java.lang.CharSequence, int):boolean");
    }

    @Override // defpackage.o93
    public Object c(Object obj) {
        long j;
        t83 t83Var = (t83) this.g;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f) {
            ((Context) t83Var.g).deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(kx1.P(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (a64 e) {
                gi2.Z("Unable to deserialize proto from offline signals database:");
                gi2.Z(e.getMessage());
            }
        }
        cursorQuery.close();
        Context context = (Context) t83Var.g;
        lx1 lx1VarA = nx1.A();
        String packageName = context.getPackageName();
        lx1VarA.b();
        ((nx1) lx1VarA.g).F(packageName);
        String str = Build.MODEL;
        lx1VarA.b();
        ((nx1) lx1VarA.g).G();
        int iL = wl2.L(sQLiteDatabase, 0);
        lx1VarA.b();
        ((nx1) lx1VarA.g).C(iL);
        lx1VarA.b();
        ((nx1) lx1VarA.g).B(arrayList);
        int iL2 = wl2.L(sQLiteDatabase, 1);
        lx1VarA.b();
        ((nx1) lx1VarA.g).D(iL2);
        int iL3 = wl2.L(sQLiteDatabase, 3);
        lx1VarA.b();
        ((nx1) lx1VarA.g).I(iL3);
        hg4.C.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        lx1VarA.b();
        ((nx1) lx1VarA.g).E(jCurrentTimeMillis);
        Cursor cursorU = wl2.U(sQLiteDatabase, 2);
        if (cursorU.getCount() > 0) {
            cursorU.moveToNext();
            j = cursorU.getLong(cursorU.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        cursorU.close();
        lx1VarA.b();
        ((nx1) lx1VarA.g).H(j);
        nx1 nx1Var = (nx1) lx1VarA.d();
        int size = arrayList.size();
        long jN = 0;
        for (int i = 0; i < size; i++) {
            kx1 kx1Var = (kx1) arrayList.get(i);
            if (kx1Var.O() == 2 && kx1Var.N() > jN) {
                jN = kx1Var.N();
            }
        }
        if (jN != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jN));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        cx1 cx1Var = (cx1) t83Var.h;
        synchronized (cx1Var) {
            if (cx1Var.c) {
                try {
                    yy1 yy1Var = cx1Var.b;
                    yy1Var.b();
                    ((zy1) yy1Var.g).I(nx1Var);
                } catch (NullPointerException e2) {
                    hg4.C.h.d("AdMobClearcutLogger.modify", e2);
                }
            }
            e51 e51Var = (e51) t83Var.i;
            tx1 tx1VarB = ux1.B();
            int i2 = e51Var.g;
            tx1VarB.b();
            ((ux1) tx1VarB.g).C(i2);
            int i3 = e51Var.h;
            tx1VarB.b();
            ((ux1) tx1VarB.g).D(i3);
            int i4 = true != e51Var.i ? 2 : 0;
            tx1VarB.b();
            ((ux1) tx1VarB.g).A(i4);
            ux1 ux1Var = (ux1) tx1VarB.d();
            synchronized (cx1Var) {
                if (cx1Var.c) {
                    try {
                        yy1 yy1Var2 = cx1Var.b;
                        vy1 vy1Var = (vy1) ((zy1) yy1Var2.g).A().s();
                        vy1Var.b();
                        ((wy1) vy1Var.g).C(ux1Var);
                        yy1Var2.b();
                        ((zy1) yy1Var2.g).G((wy1) vy1Var.d());
                    } catch (NullPointerException e3) {
                        hg4.C.h.d("AdMobClearcutLogger.modify", e3);
                    }
                }
                cx1Var.b(10004);
                sQLiteDatabase.delete("offline_signal_contents", null, null);
                wl2.X(sQLiteDatabase, "failed_requests");
                wl2.X(sQLiteDatabase, "total_requests");
                wl2.X(sQLiteDatabase, "completed_requests");
                return null;
            }
        }
        cx1Var.b(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        wl2.X(sQLiteDatabase, "failed_requests");
        wl2.X(sQLiteDatabase, "total_requests");
        wl2.X(sQLiteDatabase, "completed_requests");
        return null;
    }

    public void d() throws kp1 {
        iq1 iq1Var = (iq1) this.g;
        boolean z = this.f;
        String strA = up1.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
        if (z) {
            return;
        }
        try {
            HashMap map = hq1.a;
            so1 so1Var = new so1(4);
            so1Var.p(wp1.f, oq1.f(rp1.s));
            so1Var.p(wp1.g, ts0.m(0L));
            so1Var.p(wp1.h, ts0.m(1L));
            so1Var.p(wp1.i, ts0.m(2L));
            so1Var.p(wp1.j, ts0.m(3L));
            so1Var.p(wp1.k, ts0.m(4L));
            so1Var.p(wp1.l, ts0.m(7L));
            so1Var.p(wp1.m, ts0.m(-1L));
            so1Var.p(wp1.n, ts0.m(-2L));
            so1Var.p(wp1.o, oq1.f(np1.b));
            so1Var.p(wp1.p, oq1.f(np1.d));
            so1Var.p(wp1.q, oq1.f(np1.j));
            so1Var.p(wp1.r, oq1.f(np1.k));
            so1Var.p(wp1.s, oq1.f(np1.n));
            so1Var.p(wp1.t, oq1.f(rp1.n));
            so1Var.p(wp1.u, oq1.f(np1.f));
            so1Var.p(wp1.v, oq1.f(np1.g));
            so1Var.p(wp1.w, oq1.f(np1.h));
            so1Var.p(wp1.x, oq1.f(np1.i));
            so1Var.p(wp1.y, oq1.f(rp1.h));
            so1Var.p(wp1.z, oq1.f(rp1.j));
            so1Var.p(wp1.B, oq1.f(np1.o));
            so1Var.p(wp1.C, oq1.f(np1.p));
            so1Var.p(wp1.D, oq1.f(np1.s));
            so1Var.p(wp1.E, oq1.f(np1.t));
            so1Var.p(wp1.F, oq1.f(np1.u));
            so1Var.p(wp1.G, oq1.f(np1.v));
            so1Var.p(wp1.H, oq1.f(rp1.b));
            so1Var.p(wp1.I, oq1.f(rp1.d));
            so1Var.p(wp1.J, oq1.f(rp1.e));
            so1Var.p(wp1.K, oq1.f(rp1.f));
            so1Var.p(wp1.L, oq1.f(rp1.k));
            so1Var.p(wp1.M, oq1.f(rp1.l));
            so1Var.p(wp1.N, oq1.f(rp1.p));
            so1Var.p(wp1.O, oq1.f(rp1.q));
            so1Var.p(wp1.P, oq1.f(rp1.u));
            so1Var.p(wp1.Q, oq1.f(rp1.v));
            so1Var.p(wp1.R, oq1.f(tp1.b));
            so1Var.p(wp1.S, oq1.f(tp1.d));
            so1Var.p(wp1.Z, oq1.f(tp1.e));
            so1Var.p(wp1.T, oq1.f(tp1.j));
            so1Var.p(wp1.U, oq1.f(tp1.k));
            so1Var.p(wp1.V, oq1.f(tp1.n));
            so1Var.p(wp1.W, oq1.f(tp1.q));
            so1Var.p(wp1.X, oq1.f(np1.q));
            so1Var.p(wp1.Y, oq1.f(tp1.l));
            so1Var.p(wp1.a0, oq1.f(np1.l));
            so1Var.p(wp1.b0, oq1.f(tp1.g));
            so1Var.p(wp1.c0, oq1.f(tp1.h));
            so1Var.p(wp1.A, oq1.f(rp1.i));
            so1Var.p(wp1.d0, oq1.f(tp1.p));
            so1Var.p(wp1.e0, oq1.f(rp1.m));
            so1Var.p(wp1.f0, oq1.f(tp1.o));
            so1Var.p(wp1.g0, oq1.f(rp1.c));
            so1Var.p(wp1.h0, oq1.f(tp1.c));
            so1Var.p(wp1.i0, oq1.f(np1.r));
            so1Var.p(wp1.j0, oq1.f(tp1.m));
            so1Var.p(wp1.k0, oq1.f(np1.e));
            so1Var.p(wp1.l0, oq1.f(tp1.f));
            so1Var.p(wp1.m0, oq1.f(rp1.t));
            so1Var.p(wp1.n0, oq1.f(np1.c));
            so1Var.p(wp1.o0, oq1.f(tp1.i));
            so1Var.p(wp1.p0, oq1.f(rp1.o));
            so1Var.p(wp1.q0, oq1.f(np1.m));
            so1Var.p(wp1.r0, oq1.f(rp1.r));
            so1Var.p(wp1.s0, oq1.f(rp1.g));
            xn3 xn3VarU = so1Var.u();
            for (long j = -1; j >= -82; j--) {
                wp1 wp1Var = (wp1) map.get(Long.valueOf(j));
                if (wp1Var == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 36);
                    sb.append(strA);
                    sb.append(j);
                    throw new rg(sb.toString());
                }
                iq1Var.a.y((oq1) xn3VarU.get(wp1Var));
            }
            for (int i = 82; i < 1159; i++) {
                iq1Var.a.y(oq1.a(null));
            }
            this.f = true;
        } catch (fq1 e) {
            throw new kp1(jp1.g, e);
        }
    }

    public void e(int i) {
        zt0.b0(!this.f);
        ((SparseBooleanArray) this.g).append(i, true);
    }

    @Override // defpackage.ee0
    public void f(od0 od0Var, boolean z) {
        y1 y1Var;
        f21 f21Var = (f21) this.g;
        if (this.f) {
            return;
        }
        this.f = true;
        ActionMenuView actionMenuView = f21Var.g.a.f;
        if (actionMenuView != null && (y1Var = actionMenuView.y) != null) {
            y1Var.c();
            v1 v1Var = y1Var.y;
            if (v1Var != null && v1Var.b()) {
                v1Var.i.dismiss();
            }
        }
        f21Var.h.onPanelClosed(108, od0Var);
        this.f = false;
    }

    public of4 g() {
        zt0.b0(!this.f);
        this.f = true;
        return new of4((SparseBooleanArray) this.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0441 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0406 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(java.util.Optional r20) throws defpackage.hp1, defpackage.kp1 {
        /*
            Method dump skipped, instructions count: 1387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb.h(java.util.Optional):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    @Override // defpackage.d71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.o91 i(android.view.View r17, defpackage.o91 r18, defpackage.e71 r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            l91 r4 = r2.a
            r5 = 7
            y20 r5 = r4.f(r5)
            r6 = 32
            y20 r4 = r4.f(r6)
            java.lang.Object r6 = r0.g
            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r6
            boolean r7 = r6.o
            int r8 = r5.b
            int r9 = r5.c
            int r10 = r5.a
            r6.w = r8
            int r8 = r1.getLayoutDirection()
            r12 = 1
            if (r8 != r12) goto L2c
            r8 = r12
            goto L2d
        L2c:
            r8 = 0
        L2d:
            int r13 = r1.getPaddingBottom()
            int r14 = r1.getPaddingLeft()
            int r15 = r1.getPaddingRight()
            if (r7 == 0) goto L44
            int r13 = r2.a()
            r6.v = r13
            int r11 = r3.d
            int r13 = r13 + r11
        L44:
            boolean r11 = r6.p
            if (r11 == 0) goto L51
            if (r8 == 0) goto L4d
            int r11 = r3.c
            goto L4f
        L4d:
            int r11 = r3.a
        L4f:
            int r14 = r11 + r10
        L51:
            boolean r11 = r6.q
            if (r11 == 0) goto L5e
            if (r8 == 0) goto L5a
            int r3 = r3.a
            goto L5c
        L5a:
            int r3 = r3.c
        L5c:
            int r15 = r3 + r9
        L5e:
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            boolean r8 = r6.s
            if (r8 == 0) goto L70
            int r8 = r3.leftMargin
            if (r8 == r10) goto L70
            r3.leftMargin = r10
            r11 = r12
            goto L71
        L70:
            r11 = 0
        L71:
            boolean r8 = r6.t
            if (r8 == 0) goto L7c
            int r8 = r3.rightMargin
            if (r8 == r9) goto L7c
            r3.rightMargin = r9
            r11 = r12
        L7c:
            boolean r8 = r6.u
            if (r8 == 0) goto L89
            int r8 = r3.topMargin
            int r5 = r5.b
            if (r8 == r5) goto L89
            r3.topMargin = r5
            goto L8a
        L89:
            r12 = r11
        L8a:
            if (r12 == 0) goto L8f
            r1.setLayoutParams(r3)
        L8f:
            int r3 = r1.getPaddingTop()
            r1.setPadding(r14, r3, r15, r13)
            boolean r1 = r0.f
            if (r1 == 0) goto L9e
            int r3 = r4.d
            r6.m = r3
        L9e:
            if (r7 != 0) goto La4
            if (r1 == 0) goto La3
            goto La4
        La3:
            return r2
        La4:
            r6.P()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb.i(android.view.View, o91, e71):o91");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(long r34, java.util.Optional r36) throws defpackage.hp1, defpackage.kp1 {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb.j(long, java.util.Optional):java.lang.Object");
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
    @Override // defpackage.iq3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb.p(java.lang.Object):void");
    }

    @Override // defpackage.ee0
    public boolean r(od0 od0Var) {
        ((f21) this.g).h.onMenuOpened(108, od0Var);
        return true;
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        gi2.Z("Failed to get signals bundle");
    }

    public /* synthetic */ nb(Object obj) {
        this.g = obj;
    }

    public /* synthetic */ nb(Object obj, boolean z) {
        this.g = obj;
        this.f = z;
    }

    public nb(pz pzVar, boolean z) {
        this(pzVar);
        this.f = z;
    }
}
