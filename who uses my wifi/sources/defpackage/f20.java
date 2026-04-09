package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.work.impl.WorkDatabase;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f20 implements ti0, m2, qm0, yu, b2, vg2, td2, hh3, iq3, dp2, ug2, oy2, qq2, j73 {
    public static final fr h = new fr(23);
    public static volatile f20 i;
    public final /* synthetic */ int f;
    public Object g;

    public /* synthetic */ f20(int i2, Object obj) {
        this.f = i2;
        this.g = obj;
    }

    @Override // defpackage.ti0
    public o91 B(View view, o91 o91Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        o91 o91VarB = o91Var;
        switch (this.f) {
            case 2:
                int iD = o91VarB.d();
                h6 h6Var = (h6) this.g;
                Context context = h6Var.p;
                int iD2 = o91VarB.d();
                ActionBarContextView actionBarContextView = h6Var.A;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    i2 = 0;
                    z = false;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) h6Var.A.getLayoutParams();
                    if (h6Var.A.isShown()) {
                        if (h6Var.h0 == null) {
                            h6Var.h0 = new Rect();
                            h6Var.i0 = new Rect();
                        }
                        Rect rect = h6Var.h0;
                        Rect rect2 = h6Var.i0;
                        rect.set(o91VarB.b(), o91VarB.d(), o91VarB.c(), o91VarB.a());
                        ViewGroup viewGroup = h6Var.F;
                        if (Build.VERSION.SDK_INT >= 29) {
                            boolean z4 = g71.a;
                            c71.a(viewGroup, rect, rect2);
                        } else {
                            if (!g71.a) {
                                g71.a = true;
                                try {
                                    Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    g71.b = declaredMethod;
                                    if (!declaredMethod.isAccessible()) {
                                        g71.b.setAccessible(true);
                                    }
                                } catch (NoSuchMethodException unused) {
                                }
                            }
                            Method method = g71.b;
                            if (method != null) {
                                try {
                                    method.invoke(viewGroup, rect, rect2);
                                } catch (Exception unused2) {
                                }
                            }
                        }
                        int i3 = rect.top;
                        int i4 = rect.left;
                        int i5 = rect.right;
                        ViewGroup viewGroup2 = h6Var.F;
                        WeakHashMap weakHashMap = e61.a;
                        o91 o91VarA = u51.a(viewGroup2);
                        int iB = o91VarA == null ? 0 : o91VarA.b();
                        int iC = o91VarA == null ? 0 : o91VarA.c();
                        if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                            z3 = false;
                        } else {
                            marginLayoutParams.topMargin = i3;
                            marginLayoutParams.leftMargin = i4;
                            marginLayoutParams.rightMargin = i5;
                            z3 = true;
                        }
                        if (i3 <= 0 || h6Var.H != null) {
                            View view2 = h6Var.H;
                            if (view2 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                int i6 = marginLayoutParams2.height;
                                int i7 = marginLayoutParams.topMargin;
                                if (i6 != i7 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                                    marginLayoutParams2.height = i7;
                                    marginLayoutParams2.leftMargin = iB;
                                    marginLayoutParams2.rightMargin = iC;
                                    h6Var.H.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            View view3 = new View(context);
                            h6Var.H = view3;
                            view3.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = iB;
                            layoutParams.rightMargin = iC;
                            h6Var.F.addView(h6Var.H, -1, layoutParams);
                        }
                        View view4 = h6Var.H;
                        boolean z5 = view4 != null;
                        if (z5 && view4.getVisibility() != 0) {
                            View view5 = h6Var.H;
                            view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? kj.a(context, R.color.abc_decor_view_status_guard_light) : kj.a(context, R.color.abc_decor_view_status_guard));
                        }
                        if (!h6Var.M && z5) {
                            iD2 = 0;
                        }
                        z2 = z3;
                        z = z5;
                        i2 = 0;
                    } else {
                        i2 = 0;
                        if (marginLayoutParams.topMargin != 0) {
                            marginLayoutParams.topMargin = 0;
                            z = false;
                            z2 = true;
                        } else {
                            z = false;
                            z2 = false;
                        }
                    }
                    if (z2) {
                        h6Var.A.setLayoutParams(marginLayoutParams);
                    }
                }
                View view6 = h6Var.H;
                if (view6 != null) {
                    view6.setVisibility(z ? i2 : 8);
                }
                if (iD != iD2) {
                    int iB2 = o91VarB.b();
                    int iC2 = o91VarB.c();
                    int iA = o91VarB.a();
                    int i8 = Build.VERSION.SDK_INT;
                    f91 e91Var = i8 >= 30 ? new e91(o91VarB) : i8 >= 29 ? new d91(o91VarB) : new c91(o91VarB);
                    e91Var.g(y20.b(iB2, iD2, iC2, iA));
                    o91VarB = e91Var.b();
                }
                WeakHashMap weakHashMap2 = e61.a;
                WindowInsets windowInsetsF = o91VarB.f();
                if (windowInsetsF == null) {
                    return o91VarB;
                }
                WindowInsets windowInsetsB = r51.b(view, windowInsetsF);
                return !windowInsetsB.equals(windowInsetsF) ? o91.g(view, windowInsetsB) : o91VarB;
            default:
                vb vbVar = (vb) this.g;
                ub ubVar = vbVar.s;
                if (ubVar != null) {
                    vbVar.k.Y.remove(ubVar);
                }
                ub ubVar2 = new ub(vbVar.n, o91VarB);
                vbVar.s = ubVar2;
                ubVar2.e(vbVar.getWindow());
                BottomSheetBehavior bottomSheetBehavior = vbVar.k;
                ub ubVar3 = vbVar.s;
                ArrayList arrayList = bottomSheetBehavior.Y;
                if (!arrayList.contains(ubVar3)) {
                    arrayList.add(ubVar3);
                }
                return o91VarB;
        }
    }

    @Override // defpackage.hh3
    /* renamed from: a */
    public /* synthetic */ th3 mo10a() {
        AtomicInteger atomicInteger = sf2.z;
        return new cf3((byte[]) this.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.yu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(defpackage.av r6, defpackage.oj r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.p
            if (r0 == 0) goto L13
            r0 = r7
            p r0 = (defpackage.p) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L1a
        L13:
            p r0 = new p
            qj r7 = (defpackage.qj) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.j
            int r1 = r0.l
            z31 r2 = defpackage.z31.a
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            gs0 r6 = r0.i
            defpackage.bd2.x(r7)     // Catch: java.lang.Throwable -> L2b
            goto L58
        L2b:
            r7 = move-exception
            goto L62
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.bd2.x(r7)
            gs0 r7 = new gs0
            hk r1 = r0.g
            defpackage.i30.j(r1)
            r7.<init>(r6, r1)
            r0.i = r7     // Catch: java.lang.Throwable -> L60
            r0.l = r3     // Catch: java.lang.Throwable -> L60
            java.lang.Object r6 = r5.g     // Catch: java.lang.Throwable -> L60
            lw0 r6 = (defpackage.lw0) r6     // Catch: java.lang.Throwable -> L60
            java.lang.Object r6 = r6.f(r7, r0)     // Catch: java.lang.Throwable -> L60
            rk r0 = defpackage.rk.f
            if (r6 != r0) goto L53
            goto L54
        L53:
            r6 = r2
        L54:
            if (r6 != r0) goto L57
            return r0
        L57:
            r6 = r7
        L58:
            r6.n()
            return r2
        L5c:
            r4 = r7
            r7 = r6
            r6 = r4
            goto L62
        L60:
            r6 = move-exception
            goto L5c
        L62:
            r6.n()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f20.b(av, oj):java.lang.Object");
    }

    @Override // defpackage.td2, defpackage.dp2
    /* renamed from: c */
    public /* synthetic */ void mo14c(Object obj) {
        switch (this.f) {
            case 15:
                ((pd2) this.g).a((c62) obj);
                break;
            case 19:
                ((xm2) obj).R((pq2) this.g);
                break;
            default:
                ((jo2) obj).G0((fa2) this.g);
                break;
        }
    }

    @Override // defpackage.qq2
    public a83 d() {
        return (a83) this.g;
    }

    @Override // defpackage.oy2
    public /* synthetic */ n70 e(fa2 fa2Var) {
        return ((xy2) ((z94) ((t83) this.g).i).d()).C3(fa2Var, Binder.getCallingUid());
    }

    @Override // defpackage.m2
    public void f(Object obj) {
        l2 l2Var = (l2) obj;
        xw xwVar = (xw) this.g;
        uw uwVar = (uw) xwVar.C.pollFirst();
        if (uwVar == null) {
            return;
        }
        String str = uwVar.f;
        int i2 = uwVar.g;
        iw iwVarJ = xwVar.c.j(str);
        if (iwVarJ == null) {
            return;
        }
        iwVarJ.s(i2, l2Var.f, l2Var.g);
    }

    public void g(final i5 i5Var, final mz mzVar) {
        vq2 vq2Var = new vq2(i5Var, 5);
        ((ArrayList) vq2Var.g).add("D95CBDBF1A2CCD1B6766C3D9D2B99818");
        ((ArrayList) vq2Var.g).add("33C61DE73F8EAEB87B9ECE6E920D98CC");
        ((ArrayList) vq2Var.g).add("8BB648896523BB8F17DB8AD774027092");
        vq2Var.d();
        fr frVar = new fr(16);
        va4 va4Var = (va4) this.g;
        uh uhVar = new uh() { // from class: kz
            @Override // defpackage.uh
            public final void d() {
                lz lzVar = new lz(0, mzVar);
                i5 i5Var2 = i5Var;
                if (((va4) ((ls2) gi1.c(i5Var2).l).mo18a()).a()) {
                    lzVar.a(null);
                    return;
                }
                z42 z42Var = (z42) ((ls2) gi1.c(i5Var2).j).mo18a();
                ok2.a();
                vq2 vq2Var2 = new vq2(i5Var2, lzVar, 23);
                of3 of3Var = new of3(12, lzVar);
                z42Var.getClass();
                ok2.a();
                z52 z52Var = (z52) z42Var.c.get();
                if (z52Var == null) {
                    of3Var.j(new ah3("No available form can be built.", 3).a());
                    return;
                }
                f20 f20Var = (f20) z42Var.a.mo18a();
                f20Var.getClass();
                gi1 gi1Var = (gi1) f20Var.g;
                ls2 ls2VarB = ls2.b(new vg0(16, (ax0) gi1Var.g));
                ax0 ax0Var = new ax0(z52Var);
                zs1 zs1Var = new zs1(20, false);
                ax0 ax0Var2 = (ax0) gi1Var.g;
                ls2 ls2Var = (ls2) gi1Var.k;
                xn1 xn1Var = (xn1) gi1Var.m;
                ls2 ls2Var2 = (ls2) gi1Var.h;
                ls2 ls2VarB2 = ls2.b(new bu1(ax0Var2, (ls2) gi1Var.i, ls2VarB, ls2Var2, ax0Var, new vq2(ls2VarB, new bu1(ax0Var2, ls2VarB, ls2Var, xn1Var, zs1Var, ls2Var2, 5), 25), 3));
                if (((ls2) zs1Var.g) != null) {
                    throw new IllegalStateException();
                }
                zs1Var.g = ls2VarB2;
                ((bw1) zs1Var.mo18a()).b(vq2Var2, of3Var);
            }
        };
        dk dkVar = new dk(mzVar);
        synchronized (va4Var.d) {
            va4Var.f = true;
        }
        va4Var.h = frVar;
        gi1 gi1Var = va4Var.b;
        gi1Var.getClass();
        ((Executor) gi1Var.h).execute(new ea1(gi1Var, i5Var, frVar, uhVar, dkVar, 6, false));
    }

    @Override // defpackage.j73
    public /* synthetic */ yh2 h(i73 i73Var) {
        return ((t63) this.g).b(i73Var);
    }

    @Override // defpackage.qm0
    public void i(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.g).setResultCode(i2);
    }

    public int j(int i2) {
        WorkDatabase workDatabase;
        int i3;
        synchronized (f20.class) {
            try {
                workDatabase = (WorkDatabase) this.g;
                workDatabase.c();
                Long lY = workDatabase.j().y("next_job_scheduler_id");
                i3 = 0;
                int iIntValue = lY != null ? lY.intValue() : 0;
                workDatabase.j().A(new xl0("next_job_scheduler_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.h();
                workDatabase.f();
                if (iIntValue < 0 || iIntValue > i2) {
                    ((WorkDatabase) this.g).j().A(new xl0("next_job_scheduler_id", 1));
                } else {
                    i3 = iIntValue;
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            } finally {
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.wn1 k(defpackage.mf1 r18, defpackage.us0 r19, int r20) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f20.k(mf1, us0, int):wn1");
    }

    public void l(jo1 jo1Var, rl rlVar, jq3 jq3Var) {
        synchronized (jo1Var.j) {
            jo1Var.n = true;
        }
        jo1Var.a("post-response");
        ((vb1) this.g).g.post(new gi(jo1Var, rlVar, jq3Var, 11));
    }

    public void n(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb = new StringBuilder("[");
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z = false;
            }
            sb.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            lm3 lm3Var = (lm3) this.g;
            if (lm3Var == null) {
                lm3Var = new lm3();
                this.g = lm3Var;
            }
            rm3 rm3VarL = (rm3) lm3Var.get(obj);
            if (rm3VarL == null) {
                rm3VarL = dn3.l(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                lm3 lm3Var2 = (lm3) this.g;
                if (lm3Var2 == null) {
                    lm3Var2 = new lm3();
                    this.g = lm3Var2;
                }
                lm3Var2.put(obj, rm3VarL);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                ob1.v(obj, next);
                rm3VarL.c(next);
            }
        }
    }

    public void o(long j) {
        bu1 bu1Var = new bu1("creation");
        bu1Var.g = Long.valueOf(j);
        bu1Var.i = "nativeObjectNotCreated";
        r(bu1Var);
    }

    @Override // defpackage.iq3
    public void p(Object obj) {
        switch (this.f) {
            case 18:
                nj2 nj2Var = (nj2) this.g;
                db3 db3Var = nj2Var.l;
                h83 h83Var = nj2Var.j;
                a83 a83Var = nj2Var.k;
                nj2Var.m.b(true == hg4.C.h.i(nj2Var.f) ? 2 : 1, db3Var.b(h83Var, a83Var, false, "", (String) obj, a83Var.c, null));
                return;
            default:
                jb3 jb3Var = (jb3) this.g;
                synchronized (jb3Var) {
                    try {
                        jb3Var.l.set(false);
                        if (obj != null) {
                            kb3 kb3Var = jb3Var.j;
                            kb3Var.e = kb3Var.a;
                            kb3Var.c = 0L;
                            jb3Var.o.set(true);
                            jb3Var.a(obj);
                        }
                        jb3Var.b(obj == null);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public void r(bu1 bu1Var) {
        String strJ = bu1Var.j();
        gi2.f0("Dispatching AFMA event on publisher webview: ".concat(strJ));
        m42 m42Var = (m42) this.g;
        Parcel parcelU = m42Var.U();
        parcelU.writeString(strJ);
        m42Var.M0(parcelU, 1);
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        switch (this.f) {
            case 18:
                return;
            default:
                jb3 jb3Var = (jb3) this.g;
                synchronized (jb3Var) {
                    try {
                        jb3Var.l.set(false);
                        if ((th instanceof fb3) && ((fb3) th).f == 0) {
                            throw null;
                        }
                        jb3Var.b(true);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // defpackage.ug2
    public /* synthetic */ void v(String str, int i2, String str2, boolean z) {
        ((yw1) this.g).d();
    }

    public /* synthetic */ f20(int i2, boolean z) {
        this.f = i2;
    }

    @Override // defpackage.vg2
    /* renamed from: a, reason: collision with other method in class */
    public void mo7a() {
        w52 w52Var = (w52) this.g;
        hg4.C.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = w52Var.c;
        ArrayList arrayList = w52Var.b;
        arrayList.add(Long.valueOf(jCurrentTimeMillis - j));
        String strValueOf = String.valueOf(arrayList.get(0));
        StringBuilder sb = new StringBuilder(strValueOf.length() + 52);
        sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
        sb.append(strValueOf);
        sb.append(" ms.");
        gi2.G(sb.toString());
        lf4.l.postDelayed(new v52(w52Var.a, w52Var.d, w52Var.e, arrayList, j, 1), ((Integer) tw1.e.c.a(mz1.c)).intValue());
    }

    public f20(vg0 vg0Var, a83 a83Var) {
        this.f = 24;
        this.g = a83Var;
    }

    public f20(Handler handler) {
        this.f = 13;
        this.g = new vb1(this, handler);
    }

    public f20(Context context) {
        this.f = 1;
        va4 va4Var = (va4) ((ls2) gi1.c(context).l).mo18a();
        i30.l(va4Var, "getConsentInformation(...)");
        this.g = va4Var;
    }

    public f20(int i2) {
        Handler handler;
        Handler handlerB;
        this.f = i2;
        switch (i2) {
            case 11:
                this.g = new kz2(10);
                return;
            default:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handlerB = vn.b(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                        handler = new Handler(mainLooper);
                    } catch (InvocationTargetException e) {
                        Throwable cause = e.getCause();
                        if (!(cause instanceof RuntimeException)) {
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                            throw new RuntimeException(cause);
                        }
                        throw ((RuntimeException) cause);
                    }
                    handlerB = handler;
                }
                this.g = handlerB;
                return;
        }
    }

    private final void m(Throwable th) {
    }

    @Override // defpackage.qq2
    public void q(boolean z, Context context, an2 an2Var) {
    }
}
