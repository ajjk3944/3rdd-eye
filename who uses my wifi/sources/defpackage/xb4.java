package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.OverwritingInputMerger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xb4 implements g8, l01, ws2, an1, t9, td2, fd0, hd0, jd0, dp2, ug2, o93, qq2, k73 {
    public static xb4 j;
    public static final Object k = new Object();
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;

    public /* synthetic */ xb4(int i) {
        this.f = i;
    }

    public static final SharedPreferences I(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void K(Context context) throws fb4 {
        if (I(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new fb4("Failed to store the app set ID last used time.");
    }

    public static boolean g(Editable editable, KeyEvent keyEvent, boolean z) {
        r31[] r31VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (r31VarArr = (r31[]) editable.getSpans(selectionStart, selectionEnd, r31.class)) != null && r31VarArr.length > 0) {
                for (r31 r31Var : r31VarArr) {
                    int spanStart = editable.getSpanStart(r31Var);
                    int spanEnd = editable.getSpanEnd(r31Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static xb4 r(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new xb4(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0), 10);
    }

    public gq3 A(lm2 lm2Var) {
        n70 n70VarR;
        n70 n70VarJ;
        t83 t83Var = (t83) this.g;
        Executor executor = (Executor) this.h;
        mc2 mc2Var = new mc2(t83Var, lm2Var, executor);
        g73 g73Var = (g73) mc2Var.j;
        if (g73Var == null) {
            if (((Boolean) d12.a.w()).booleanValue()) {
                nl2 nl2VarA = lm2Var.a();
                d93 d93Var = (d93) t83Var.h;
                km2 km2Var = nl2VarA.i;
                q93 q93VarA = nl2VarA.c.a(km2Var.b(), s93.z).s(new z02(nl2VarA, d93Var, 4)).A();
                vg0 vg0Var = new vg0(18, nl2VarA);
                q93VarA.c(new jq3(q93VarA, vg0Var, 0), nl2VarA.j);
                n70VarJ = pu1.J(pu1.P(gq3.r(q93VarA), new f73(mc2Var, 1), executor), my2.class, new f73(mc2Var, 0), executor);
            } else {
                g73 g73Var2 = new g73(null, mc2Var.x());
                mc2Var.j = g73Var2;
                n70VarJ = pu1.r(g73Var2);
            }
            n70VarR = pu1.P(n70VarJ, gj1.s, executor);
        } else {
            n70VarR = pu1.r(g73Var);
        }
        return pu1.J(pu1.O(gq3.r(n70VarR), new z02(this, lm2Var, 14), executor), Exception.class, new gj1(18), executor);
    }

    public void B(nf1 nf1Var, in1 in1Var) {
        int i = 0;
        while (true) {
            jg1[] jg1VarArr = (jg1[]) this.h;
            if (i >= jg1VarArr.length) {
                return;
            }
            in1Var.a();
            in1Var.b();
            jg1 jg1VarZ = nf1Var.z(in1Var.d, 3);
            ph4 ph4Var = (ph4) ((List) this.g).get(i);
            String str = ph4Var.m;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zt0.X(z, "Invalid closed caption MIME type provided: %s", str);
            gg4 gg4Var = new gg4();
            in1Var.b();
            gg4Var.a = in1Var.e;
            gg4Var.d("video/mp2t");
            gg4Var.e(str);
            gg4Var.e = ph4Var.e;
            gg4Var.d = ph4Var.d;
            gg4Var.I = ph4Var.J;
            gg4Var.o = ph4Var.p;
            jg1VarZ.d(new ph4(gg4Var));
            jg1VarArr[i] = jg1VarZ;
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02b0, code lost:
    
        throw new defpackage.hx2(r3.toString(), 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02d3, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ee, code lost:
    
        r13.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0275, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r2.append("Received error HTTP response code: ");
        r2.append(r0);
        defpackage.gi2.i0(r2.toString());
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r3.append("Received error HTTP response code: ");
        r3.append(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.zy2 C(defpackage.yy2 r22) throws java.net.ProtocolException, defpackage.hx2 {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb4.C(yy2):zy2");
    }

    @Override // defpackage.eu2
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public jr3 mo18a() {
        return new jr3((lx2) ((ls2) this.g).mo18a(), ((xn1) this.h).mo18a(), (mo1) ((ls2) this.i).mo18a(), 10);
    }

    public void E(long j2, kz2 kz2Var) {
        if (kz2Var.B() < 9) {
            return;
        }
        int iB = kz2Var.b();
        int iB2 = kz2Var.b();
        int iK = kz2Var.K();
        if (iB == 434 && iB2 == 1195456820 && iK == 3) {
            ((fw3) this.i).x(j2, kz2Var);
        }
    }

    public synchronized void F(pc4 pc4Var, int i) {
        this.i = null;
        z23 z23Var = new z23(i);
        f23 f23Var = new f23(this);
        ((bu1) this.g).o(pc4Var, (String) this.h, z23Var, f23Var);
    }

    public c83 G() {
        return (c83) ((h83) this.g).b.g;
    }

    public ArrayList H() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.h;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) tw1.e.c.a((iz1) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ob1.C(arrayList3, new so1("gad:dynamite_module:experiment_id", "", 4));
        ob1.C(arrayList3, wl2.j);
        ob1.C(arrayList3, wl2.k);
        ob1.C(arrayList3, wl2.l);
        ob1.C(arrayList3, wl2.m);
        ob1.C(arrayList3, wl2.n);
        ob1.C(arrayList3, wl2.D);
        ob1.C(arrayList3, wl2.o);
        ob1.C(arrayList3, wl2.v);
        ob1.C(arrayList3, wl2.w);
        ob1.C(arrayList3, wl2.x);
        ob1.C(arrayList3, wl2.y);
        ob1.C(arrayList3, wl2.z);
        ob1.C(arrayList3, wl2.A);
        ob1.C(arrayList3, wl2.B);
        ob1.C(arrayList3, wl2.C);
        ob1.C(arrayList3, wl2.p);
        ob1.C(arrayList3, wl2.q);
        ob1.C(arrayList3, wl2.r);
        ob1.C(arrayList3, wl2.s);
        ob1.C(arrayList3, wl2.t);
        ob1.C(arrayList3, wl2.u);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public ArrayList J() {
        ArrayList arrayListH = H();
        ArrayList arrayList = (ArrayList) this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) tw1.e.c.a((iz1) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayListH.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ob1.C(arrayList2, m54.c);
        arrayListH.addAll(arrayList2);
        return arrayListH;
    }

    @Override // defpackage.t9
    public void Y() {
        wy0 wy0Var = (wy0) this.i;
        synchronized (wy0Var.h) {
            try {
                if (wy0Var.f) {
                    return;
                }
                wy0Var.f = true;
                vw1 vw1Var = (vw1) wy0Var.g;
                if (vw1Var == null) {
                    return;
                }
                ld2 ld2Var = md2.a;
                ww1 ww1Var = (ww1) this.g;
                yw1 yw1Var = (yw1) this.h;
                yw1Var.f.c(new jq3(yw1Var, ld2Var.a(new vd(this, vw1Var, ww1Var, yw1Var, 6, false)), 25, false), md2.g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.an1
    public void b(x13 x13Var, nf1 nf1Var, in1 in1Var) {
        this.h = x13Var;
        in1Var.a();
        in1Var.b();
        jg1 jg1VarZ = nf1Var.z(in1Var.d, 5);
        this.i = jg1VarZ;
        jg1VarZ.d((ph4) this.g);
    }

    @Override // defpackage.o93
    public Object c(Object obj) {
        switch (this.f) {
            case 25:
                return C((yy2) obj);
            default:
                jz2 jz2Var = (jz2) this.g;
                ug4 ug4Var = (ug4) this.h;
                String str = (String) this.i;
                jz2Var.getClass();
                jz2Var.g.execute(new gi((SQLiteDatabase) obj, str, ug4Var, 19));
                return null;
        }
    }

    @Override // defpackage.qq2
    public a83 d() {
        return (a83) this.h;
    }

    @Override // defpackage.an1
    public void e(kz2 kz2Var) {
        long jA;
        long j2;
        ((x13) this.h).getClass();
        String str = v23.a;
        x13 x13Var = (x13) this.h;
        synchronized (x13Var) {
            try {
                long j3 = x13Var.c;
                jA = j3 != -9223372036854775807L ? j3 + x13Var.b : x13Var.a();
            } finally {
            }
        }
        x13 x13Var2 = (x13) this.h;
        synchronized (x13Var2) {
            j2 = x13Var2.b;
        }
        if (jA == -9223372036854775807L || j2 == -9223372036854775807L) {
            return;
        }
        ph4 ph4Var = (ph4) this.g;
        if (j2 != ph4Var.r) {
            gg4 gg4Var = new gg4(ph4Var);
            gg4Var.q = j2;
            ph4 ph4Var2 = new ph4(gg4Var);
            this.g = ph4Var2;
            ((jg1) this.i).d(ph4Var2);
        }
        int iB = kz2Var.B();
        ((jg1) this.i).a(kz2Var, iB, 0);
        ((jg1) this.i).c(jA, 1, iB, 0, null);
    }

    public mj0 f() {
        UUID uuid = (UUID) this.g;
        oa1 oa1Var = (oa1) this.h;
        HashSet hashSet = (HashSet) this.i;
        mj0 mj0Var = new mj0();
        mj0Var.a = uuid;
        mj0Var.b = oa1Var;
        mj0Var.c = hashSet;
        ri riVar = oa1Var.j;
        boolean z = riVar.h.a.size() > 0 || riVar.d || riVar.b || riVar.c;
        if (((oa1) this.h).q && z) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.g = UUID.randomUUID();
        oa1 oa1Var2 = (oa1) this.h;
        oa1 oa1Var3 = new oa1();
        oa1Var3.b = 1;
        im imVar = im.c;
        oa1Var3.e = imVar;
        oa1Var3.f = imVar;
        oa1Var3.j = ri.i;
        oa1Var3.l = 1;
        oa1Var3.m = 30000L;
        oa1Var3.p = -1L;
        oa1Var3.r = 1;
        oa1Var3.a = oa1Var2.a;
        oa1Var3.c = oa1Var2.c;
        oa1Var3.b = oa1Var2.b;
        oa1Var3.d = oa1Var2.d;
        oa1Var3.e = new im(oa1Var2.e);
        oa1Var3.f = new im(oa1Var2.f);
        oa1Var3.g = oa1Var2.g;
        oa1Var3.h = oa1Var2.h;
        oa1Var3.i = oa1Var2.i;
        ri riVar2 = oa1Var2.j;
        ri riVar3 = new ri();
        riVar3.a = 1;
        riVar3.f = -1L;
        riVar3.g = -1L;
        riVar3.h = new hj();
        riVar3.b = riVar2.b;
        riVar3.c = riVar2.c;
        riVar3.a = riVar2.a;
        riVar3.d = riVar2.d;
        riVar3.e = riVar2.e;
        riVar3.h = riVar2.h;
        oa1Var3.j = riVar3;
        oa1Var3.k = oa1Var2.k;
        oa1Var3.l = oa1Var2.l;
        oa1Var3.m = oa1Var2.m;
        oa1Var3.n = oa1Var2.n;
        oa1Var3.o = oa1Var2.o;
        oa1Var3.p = oa1Var2.p;
        oa1Var3.q = oa1Var2.q;
        oa1Var3.r = oa1Var2.r;
        this.h = oa1Var3;
        oa1Var3.a = ((UUID) this.g).toString();
        return mj0Var;
    }

    @Override // defpackage.g8
    public gi4 h() {
        k01 k01Var = new k01();
        ((ExecutorService) this.i).execute(new sz2(this, k01Var, 17));
        return k01Var.a;
    }

    @Override // defpackage.k73
    public /* bridge */ /* synthetic */ n70 i(lv2 lv2Var, j73 j73Var) {
        return A(null);
    }

    public void j(Runnable runnable) {
        ((lu0) this.g).execute(runnable);
    }

    public ColorStateList k(int i) {
        int resourceId;
        ColorStateList colorStateListD;
        TypedArray typedArray = (TypedArray) this.h;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListD = ob1.d((Context) this.g, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListD;
    }

    @Override // defpackage.k73
    public /* bridge */ /* synthetic */ Object l() {
        return null;
    }

    public Drawable m(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.h;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : ob1.h((Context) this.g, resourceId);
    }

    public Drawable n(int i) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.h).hasValue(i) || (resourceId = ((TypedArray) this.h).getResourceId(i, 0)) == 0) {
            return null;
        }
        l6 l6VarA = l6.a();
        Context context = (Context) this.g;
        synchronized (l6VarA) {
            drawableD = l6VarA.a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public Typeface o(int i, int i2, j7 j7Var) {
        int resourceId = ((TypedArray) this.h).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.i) == null) {
            this.i = new TypedValue();
        }
        Context context = (Context) this.g;
        TypedValue typedValue = (TypedValue) this.i;
        ThreadLocal threadLocal = fq0.a;
        if (context.isRestricted()) {
            return null;
        }
        return fq0.a(context, resourceId, typedValue, i2, j7Var, true, false);
    }

    public boolean p(CharSequence charSequence, int i, int i2, q31 q31Var) {
        if ((q31Var.c & 3) == 0) {
            or orVar = (or) this.i;
            oe0 oe0VarB = q31Var.b();
            int iA = oe0VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) oe0VarB.i).getShort(iA + oe0VarB.f);
            }
            cn cnVar = (cn) orVar;
            cnVar.getClass();
            ThreadLocal threadLocal = cn.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = cnVar.a;
            String string = sb.toString();
            int i3 = fk0.a;
            boolean zA = dk0.a(textPaint, string);
            int i4 = q31Var.c & 4;
            q31Var.c = zA ? i4 | 2 : i4 | 1;
        }
        return (q31Var.c & 3) == 2;
    }

    @Override // defpackage.qq2
    public void q(boolean z, Context context, an2 an2Var) throws pq2 {
        n83 n83Var;
        try {
            u83 u83Var = (u83) ((c03) this.g).b;
            u83Var.b(z);
            w62 w62Var = u83Var.a;
            if (((e51) ((r03) this.i).d).h < ((Integer) tw1.e.c.a(mz1.Q0)).intValue()) {
                try {
                    w62Var.f();
                    return;
                } finally {
                }
            } else {
                try {
                    w62Var.e1(new oi0(context));
                    return;
                } finally {
                }
            }
        } catch (n83 e) {
            gi2.f0("Cannot show interstitial.");
            throw new pq2(e.getCause());
        }
        gi2.f0("Cannot show interstitial.");
        throw new pq2(e.getCause());
    }

    public void s() {
        ou1.h("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error 0.");
        gi2.U(sb.toString());
        try {
            ((z62) this.g).m0(0);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    public void t(r2 r2Var) {
        ou1.h("#008 Must be called on the main UI thread.");
        int i = r2Var.g;
        String str = (String) r2Var.h;
        String str2 = (String) r2Var.i;
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        gi2.U(sb.toString());
        try {
            ((z62) this.g).K0(r2Var.d());
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    public void u(r2 r2Var) {
        ou1.h("#008 Must be called on the main UI thread.");
        int i = r2Var.g;
        String str = (String) r2Var.h;
        String str2 = (String) r2Var.i;
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        gi2.U(sb.toString());
        try {
            ((z62) this.g).K0(r2Var.d());
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.ug2
    public void v(String str, int i, String str2, boolean z) {
        mt2 mt2Var = (mt2) this.g;
        ag2 ag2Var = (ag2) this.h;
        yw1 yw1Var = (yw1) this.i;
        mt2Var.getClass();
        l83 l83Var = mt2Var.a;
        if (!((Boolean) tw1.e.c.a(mz1.n4)).booleanValue()) {
            ih3 ih3Var = l83Var.a;
            if (ih3Var != null && ag2Var.f() != null) {
                ag2Var.f().C3(ih3Var);
            }
            yw1Var.d();
            return;
        }
        if (z) {
            ih3 ih3Var2 = l83Var.a;
            if (ih3Var2 != null && ag2Var.f() != null) {
                ag2Var.f().C3(ih3Var2);
            }
            yw1Var.d();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        yw1Var.b(new r13(ex0.k(sb, ", Failing URL: ", str2), 1));
    }

    public void w(r2 r2Var) {
        ou1.h("#008 Must be called on the main UI thread.");
        int i = r2Var.g;
        String str = (String) r2Var.h;
        String str2 = (String) r2Var.i;
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        gi2.U(sb.toString());
        try {
            ((z62) this.g).K0(r2Var.d());
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    public void x(t50 t50Var) {
        mu0 mu0Var = (mu0) this.i;
        if (mu0Var != null) {
            mu0Var.run();
        }
        mu0 mu0Var2 = new mu0((d60) this.g, t50Var);
        this.i = mu0Var2;
        ((Handler) this.h).postAtFrontOfQueue(mu0Var2);
    }

    public Object y(CharSequence charSequence, int i, int i2, int i3, boolean z, cs csVar) {
        int i4;
        char c;
        ds dsVar = new ds((qe0) ((mc2) this.h).i);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zG = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zG) {
                SparseArray sparseArray = dsVar.c.a;
                qe0 qe0Var = sparseArray == null ? null : (qe0) sparseArray.get(iCodePointAt);
                if (dsVar.a == 2) {
                    if (qe0Var != null) {
                        dsVar.c = qe0Var;
                        dsVar.f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            dsVar.a();
                        } else if (iCodePointAt != 65039) {
                            qe0 qe0Var2 = dsVar.c;
                            if (qe0Var2.b != null) {
                                if (dsVar.f != 1) {
                                    dsVar.d = qe0Var2;
                                    dsVar.a();
                                } else if (dsVar.b()) {
                                    dsVar.d = dsVar.c;
                                    dsVar.a();
                                } else {
                                    dsVar.a();
                                }
                                c = 3;
                            } else {
                                dsVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (qe0Var == null) {
                    dsVar.a();
                    c = 1;
                } else {
                    dsVar.a = 2;
                    dsVar.c = qe0Var;
                    dsVar.f = 1;
                    c = 2;
                }
                dsVar.e = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !p(charSequence, i4, iCharCount, dsVar.d.b)) {
                        zG = csVar.g(charSequence, i4, iCharCount, dsVar.d.b);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (dsVar.a == 2 && dsVar.c.b != null && ((dsVar.f > 1 || dsVar.b()) && i5 < i3 && zG && (z || !p(charSequence, i4, iCharCount, dsVar.c.b)))) {
            csVar.g(charSequence, i4, iCharCount, dsVar.c.b);
        }
        return csVar.b();
    }

    public void z() {
        ((TypedArray) this.h).recycle();
    }

    public /* synthetic */ xb4(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ xb4(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public /* synthetic */ xb4(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f = i;
        this.g = obj2;
        this.h = obj3;
        this.i = obj;
    }

    @Override // defpackage.td2, defpackage.dp2
    /* renamed from: c */
    public /* synthetic */ void mo14c(Object obj) {
        ea3 ea3Var;
        switch (this.f) {
            case 18:
                gi2.G("loadNewJavascriptEngine (success): Trying to acquire lock");
                mm2 mm2Var = (mm2) this.i;
                synchronized (mm2Var.b) {
                    try {
                        gi2.G("loadNewJavascriptEngine (success): Lock acquired");
                        mm2Var.g = 0;
                        b62 b62Var = (b62) mm2Var.f;
                        if (b62Var != null && ((b62) this.g) != b62Var) {
                            gi2.G("New JS engine is loaded, marking previous one as destroyable.");
                            ((b62) mm2Var.f).y();
                        }
                        mm2Var.f = (b62) this.g;
                        if (((Boolean) n02.d.w()).booleanValue() && (ea3Var = (ea3) mm2Var.e) != null) {
                            aa3 aa3Var = (aa3) this.h;
                            aa3Var.b(true);
                            ea3Var.b(aa3Var.n());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                gi2.G("loadNewJavascriptEngine (success): Lock released");
                return;
            default:
                ((um2) obj).J((ka2) this.g, (String) this.h, (String) this.i);
                return;
        }
    }

    public xb4(z62 z62Var) {
        this.f = 19;
        this.g = z62Var;
    }

    public xb4(th2 th2Var, Context context, ld2 ld2Var) {
        this.f = 24;
        this.h = th2Var;
        this.g = context;
        this.i = ld2Var;
    }

    public xb4(h83 h83Var, a83 a83Var, String str) {
        this.f = 20;
        this.g = h83Var;
        this.h = a83Var;
        this.i = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public xb4() {
        this.f = 17;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public xb4(Context context) {
        this.f = 0;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.h = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.i = Executors.newSingleThreadExecutor();
        this.g = context;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new bh3(8, this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public xb4(String str) {
        this.f = 13;
        gg4 gg4Var = new gg4();
        gg4Var.d("video/mp2t");
        gg4Var.e(str);
        this.g = new ph4(gg4Var);
    }

    public xb4(t83 t83Var, ld2 ld2Var) {
        this.f = 29;
        this.i = new su2(8);
        this.g = t83Var;
        this.h = ld2Var;
    }

    public xb4(int i, List list) {
        this.f = i;
        switch (i) {
            case 14:
                this.g = list;
                this.h = new jg1[list.size()];
                fw3 fw3Var = new fw3(new of3(10, this));
                this.i = fw3Var;
                fw3Var.w(3);
                break;
            default:
                this.i = list;
                this.g = new ArrayList(list.size());
                this.h = new ArrayList(list.size());
                for (int i2 = 0; i2 < list.size(); i2++) {
                    ((ArrayList) this.g).add(new cv0((List) ((ib0) list.get(i2)).b.g));
                    ((ArrayList) this.h).add(((ib0) list.get(i2)).c.Q0());
                }
                break;
        }
    }

    public xb4(e60 e60Var) {
        this.f = 9;
        this.g = new d60(e60Var);
        this.h = new Handler();
    }

    @Override // defpackage.t9
    public void T(int i) {
    }

    public xb4(Drawable.Callback callback, String str, Map map) {
        this.f = 1;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.h = str.concat("/");
        } else {
            this.h = str;
        }
        this.i = map;
        if (!(callback instanceof View)) {
            this.g = null;
        } else {
            this.g = ((View) callback).getContext().getApplicationContext();
        }
    }

    public xb4(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, RecyclerView recyclerView, Toolbar toolbar) {
        this.f = 2;
        this.g = linearLayout;
        this.h = recyclerView;
        this.i = toolbar;
    }

    public xb4(ExecutorService executorService) {
        this.f = 11;
        this.h = new Handler(Looper.getMainLooper());
        this.i = new ia1(0, this);
        this.g = new lu0(executorService);
    }

    public xb4(Runnable runnable) {
        this.f = 7;
        this.h = new CopyOnWriteArrayList();
        this.i = new HashMap();
        this.g = runnable;
    }

    public xb4(Class cls) {
        this.f = 8;
        HashSet hashSet = new HashSet();
        this.i = hashSet;
        this.g = UUID.randomUUID();
        this.h = new oa1(((UUID) this.g).toString(), cls.getName());
        hashSet.add(cls.getName());
        ((oa1) this.h).d = OverwritingInputMerger.class.getName();
    }

    public xb4(mc2 mc2Var, fr frVar, cn cnVar, Set set) {
        this.f = 5;
        this.g = frVar;
        this.h = mc2Var;
        this.i = cnVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            y(str, 0, str.length(), 1, true, new er3(str, 2));
        }
    }
}
