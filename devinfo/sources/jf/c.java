package jf;

import a0.s;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import b5.d0;
import c2.q;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.google.android.gms.internal.ads.or;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import d8.b0;
import d8.v;
import d8.w;
import e4.c2;
import e4.n0;
import e4.v0;
import ec.h;
import ec.h1;
import ec.o1;
import ec.s0;
import ec.z1;
import eg.l;
import f4.f;
import f4.p;
import g8.j;
import g8.k;
import j$.util.DesugarCollections;
import j2.r;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeoutException;
import je.z;
import km.d;
import km.g;
import km.m;
import p.k3;
import p.u3;
import p.v3;
import pi.i;
import rl.a0;
import rl.c0;
import t6.i0;
import va.o;
import yb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class c implements s, PAGAppOpenAdInteractionListener, w, d8.a, i, ga.b, k, e4.s, k3, g, m, p {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f27639c;

    /* renamed from: d, reason: collision with root package name */
    public static c f27640d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27641a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27642b;

    public /* synthetic */ c(int i4, Object obj) {
        this.f27641a = i4;
        this.f27642b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A(ec.z1 r2, int r3) {
        /*
            r1 = this;
            r0 = -30
            if (r3 == r0) goto L1e
            r0 = -20
            if (r3 == r0) goto L1b
            r0 = -10
            if (r3 == r0) goto L18
            if (r3 == 0) goto L1b
            r0 = 30
            if (r3 == r0) goto L15
            ec.h r3 = ec.h.UNSET
            goto L20
        L15:
            ec.h r3 = ec.h.INITIALIZATION
            goto L20
        L18:
            ec.h r3 = ec.h.MANIFEST
            goto L20
        L1b:
            ec.h r3 = ec.h.API
            goto L20
        L1e:
            ec.h r3 = ec.h.TCF
        L20:
            java.lang.Object r0 = r1.f27642b
            java.util.EnumMap r0 = (java.util.EnumMap) r0
            r0.put(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.c.A(ec.z1, int):void");
    }

    public void B(z1 z1Var, h hVar) {
        ((EnumMap) this.f27642b).put((EnumMap) z1Var, (z1) hVar);
    }

    @Override // pi.i
    public void a() {
        switch (this.f27641a) {
            case 14:
                l lVar = (l) this.f27642b;
                if (!i0.l(lVar.n())) {
                    lVar.U().finish();
                    break;
                }
                break;
        }
    }

    @Override // f4.p
    public boolean c(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f27642b;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        boolean z3 = view.getLayoutDirection() == 1;
        int i4 = swipeDismissBehavior.f20347d;
        int width = (!(i4 == 0 && z3) && (i4 != 1 || z3)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = v0.f22405a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // g8.k
    public int d() {
        return (e() << 8) | e();
    }

    @Override // g8.k
    public short e() throws IOException {
        int i4 = ((InputStream) this.f27642b).read();
        if (i4 != -1) {
            return (short) i4;
        }
        throw new j();
    }

    @Override // g8.k
    public int f(int i4, byte[] bArr) throws j {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i4 && (i11 = ((InputStream) this.f27642b).read(bArr, i10, i4 - i10)) != -1) {
            i10 += i11;
        }
        if (i10 == 0 && i11 == -1) {
            throw new j();
        }
        return i10;
    }

    @Override // km.g
    public void g(d dVar, Throwable th2) {
        ((xk.h) this.f27642b).resumeWith(ci.b.h(th2));
    }

    @Override // xj.a
    public Object get() {
        return new e((Context) ((f4.e) this.f27642b).f23649a, new i7.b(), new ja.c(), 21);
    }

    public f h(int i4) {
        return null;
    }

    @Override // d8.w
    public v i(b0 b0Var) {
        switch (this.f27641a) {
            case 8:
                return new d8.b(0, (AssetManager) this.f27642b, this);
            default:
                return new d8.b((Resources) this.f27642b, b0Var.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // e4.s
    public c2 j(View view, c2 c2Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i4;
        int i10;
        int i11;
        int i12;
        int iD = c2Var.d();
        i.v vVar = (i.v) this.f27642b;
        Context context = vVar.f25374k;
        int iD2 = c2Var.d();
        ActionBarContextView actionBarContextView = vVar.f25385v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i4 = 0;
            i10 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vVar.f25385v.getLayoutParams();
            if (vVar.f25385v.isShown()) {
                if (vVar.f25369c0 == null) {
                    vVar.f25369c0 = new Rect();
                    vVar.f25370d0 = new Rect();
                }
                Rect rect = vVar.f25369c0;
                Rect rect2 = vVar.f25370d0;
                rect.set(c2Var.b(), c2Var.d(), c2Var.c(), c2Var.a());
                ViewGroup viewGroup = vVar.A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = v3.f30896a;
                    u3.a(viewGroup, rect, rect2);
                    i11 = 0;
                } else {
                    if (v3.f30896a) {
                        i11 = 0;
                    } else {
                        v3.f30896a = true;
                        i11 = 0;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            v3.f30897b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                v3.f30897b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = v3.f30897b;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[i11] = rect;
                            objArr[1] = rect2;
                            method.invoke(viewGroup, objArr);
                        } catch (Exception e2) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                        }
                    }
                }
                int i13 = rect.top;
                int i14 = rect.left;
                int i15 = rect.right;
                ViewGroup viewGroup2 = vVar.A;
                WeakHashMap weakHashMap = v0.f22405a;
                c2 c2VarA = n0.a(viewGroup2);
                int iB = c2VarA == null ? i11 : c2VarA.b();
                int iC = c2VarA == null ? i11 : c2VarA.c();
                if (marginLayoutParams.topMargin == i13 && marginLayoutParams.leftMargin == i14 && marginLayoutParams.rightMargin == i15) {
                    i12 = i11;
                } else {
                    marginLayoutParams.topMargin = i13;
                    marginLayoutParams.leftMargin = i14;
                    marginLayoutParams.rightMargin = i15;
                    i12 = 1;
                }
                if (i13 <= 0 || vVar.C != null) {
                    View view2 = vVar.C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i16 = marginLayoutParams2.height;
                        int i17 = marginLayoutParams.topMargin;
                        if (i16 != i17 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i17;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            vVar.C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    vVar.C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    vVar.A.addView(vVar.C, -1, layoutParams);
                }
                View view4 = vVar.C;
                i = view4 == null ? i11 : 1;
                if (i != 0 && view4.getVisibility() != 0) {
                    View view5 = vVar.C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & Segment.SIZE) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!vVar.H && i != 0) {
                    iD2 = i11;
                }
                i10 = i;
                i4 = i11;
                i = i12;
            } else {
                i4 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    i10 = 0;
                } else {
                    i10 = 0;
                    i = 0;
                }
            }
            if (i != 0) {
                vVar.f25385v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = vVar.C;
        if (view6 != null) {
            view6.setVisibility(i10 != 0 ? i4 : 8);
        }
        return v0.j(view, iD != iD2 ? c2Var.f(c2Var.b(), iD2, c2Var.c(), c2Var.a()) : c2Var);
    }

    public f k(int i4) {
        return null;
    }

    @Override // km.m
    public Object l(Object obj) {
        c0 c0Var = (c0) obj;
        a0 a0Var = c0Var.f33051a;
        if (a0Var == null) {
            a0Var = new a0(c0Var.m(), c0Var.c());
            c0Var.f33051a = a0Var;
        }
        yf.b bVar = new yf.b(a0Var);
        bVar.f37600o = 2;
        try {
            Object objB = ((com.google.gson.w) this.f27642b).b(bVar);
            if (bVar.Z() == 10) {
                return objB;
            }
            throw new com.google.gson.m("JSON document was not fully consumed.");
        } finally {
            c0Var.close();
        }
    }

    public Set m() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.f27642b)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f27642b);
        }
        return setUnmodifiableSet;
    }

    public void n() {
        ((d0) this.f27642b).f1768d.R();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        bb.i iVar = ((aa.c) this.f27642b).f262d;
        if (iVar != null) {
            iVar.h();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
        bb.i iVar = ((aa.c) this.f27642b).f262d;
        if (iVar != null) {
            iVar.onAdClosed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        aa.c cVar = (aa.c) this.f27642b;
        bb.i iVar = cVar.f262d;
        if (iVar != null) {
            iVar.e();
            cVar.f262d.g();
        }
    }

    @Override // km.g
    public void p(d dVar, km.v0 v0Var) {
        xk.h hVar = (xk.h) this.f27642b;
        if (!v0Var.f28510a.f33217p) {
            hVar.resumeWith(ci.b.h(new km.s(v0Var)));
            return;
        }
        Object obj = v0Var.f28511b;
        if (obj != null) {
            hVar.resumeWith(obj);
            return;
        }
        o oVarRequest = dVar.request();
        oVarRequest.getClass();
        nk.e eVarA = nk.v.a(km.w.class);
        Object objCast = pk.a.h(eVarA).cast(((cm.g) oVarRequest.f36150f).k(eVarA));
        nk.k.b(objCast);
        km.w wVar = (km.w) objCast;
        hVar.resumeWith(ci.b.h(new yj.d("Response from " + wVar.f28512a.getName() + '.' + wVar.f28514c.getName() + " was null but response body type was declared as non-null")));
    }

    @Override // pi.i
    public void r() {
        int i4 = this.f27641a;
    }

    @Override // d8.a
    public com.bumptech.glide.load.data.d s(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.j(assetManager, str, 1);
    }

    @Override // g8.k
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.f27642b;
        if (j < 0) {
            return 0L;
        }
        long j8 = j;
        while (j8 > 0) {
            long jSkip = inputStream.skip(j8);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j8 -= jSkip;
        }
        return j - j8;
    }

    @Override // pi.i
    public void t(String str) {
        switch (this.f27641a) {
            case 14:
                a();
                break;
            default:
                nk.k.e(str, "msg");
                ((StorageCleanActivity) this.f27642b).finish();
                break;
        }
    }

    public String toString() {
        switch (this.f27641a) {
            case 10:
                StringBuilder sb2 = new StringBuilder("1");
                for (z1 z1Var : z1.values()) {
                    h hVar = (h) ((EnumMap) this.f27642b).get(z1Var);
                    if (hVar == null) {
                        hVar = h.UNSET;
                    }
                    sb2.append(hVar.f22763a);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void v(com.google.android.gms.internal.consent_sdk.d dVar, Thread thread, Throwable th2) {
        je.m mVar = (je.m) this.f27642b;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            z3.q();
            try {
                z.a(mVar.f27572e.f28258a.b(new je.k(mVar, System.currentTimeMillis(), th2, thread, dVar)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e2) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e2);
            }
        }
    }

    public void w() {
        synchronized (this.f27642b) {
        }
    }

    public boolean x(int i4, int i10, Bundle bundle) {
        return false;
    }

    public i4 y(yb.i iVar, r rVar) {
        int i4;
        long J;
        long j;
        boolean z3;
        x.o oVar = (x.o) this.f27642b;
        List list = (List) iVar.f37516b;
        x.o oVar2 = new x.o(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            c2.r rVar2 = (c2.r) list.get(i10);
            long j8 = rVar2.f2674a;
            q qVar = (q) oVar.e(j8);
            if (qVar == null) {
                i4 = i10;
                j = rVar2.f2675b;
                J = rVar2.f2677d;
                z3 = false;
            } else {
                long j9 = qVar.f2671a;
                boolean z10 = qVar.f2673c;
                i4 = i10;
                J = rVar.J(qVar.f2672b);
                j = j9;
                z3 = z10;
            }
            long j10 = rVar2.f2674a;
            List list2 = list;
            int i11 = size;
            oVar2.i(new c2.p(j10, rVar2.f2675b, rVar2.f2677d, rVar2.f2678e, rVar2.f2679f, j, J, z3, rVar2.g, rVar2.f2681i, rVar2.j, rVar2.f2682k), j10);
            boolean z11 = rVar2.f2678e;
            if (z11) {
                oVar.i(new q(rVar2.f2675b, rVar2.f2676c, z11), j8);
            } else {
                oVar.j(j8);
            }
            i10 = i4 + 1;
            list = list2;
            size = i11;
        }
        return new i4(oVar2, iVar);
    }

    public void z(int i4, String str, List list, boolean z3, boolean z10) {
        or orVar;
        h1 h1Var = (h1) this.f27642b;
        int i10 = i4 - 1;
        if (i10 == 0) {
            s0 s0Var = ((o1) h1Var.f218b).f22954f;
            o1.m(s0Var);
            orVar = s0Var.f23059n;
        } else if (i10 != 1) {
            if (i10 == 3) {
                s0 s0Var2 = ((o1) h1Var.f218b).f22954f;
                o1.m(s0Var2);
                orVar = s0Var2.f23060o;
            } else if (i10 != 4) {
                s0 s0Var3 = ((o1) h1Var.f218b).f22954f;
                o1.m(s0Var3);
                orVar = s0Var3.f23058m;
            } else if (z3) {
                s0 s0Var4 = ((o1) h1Var.f218b).f22954f;
                o1.m(s0Var4);
                orVar = s0Var4.f23056k;
            } else if (z10) {
                s0 s0Var5 = ((o1) h1Var.f218b).f22954f;
                o1.m(s0Var5);
                orVar = s0Var5.j;
            } else {
                s0 s0Var6 = ((o1) h1Var.f218b).f22954f;
                o1.m(s0Var6);
                orVar = s0Var6.f23057l;
            }
        } else if (z3) {
            s0 s0Var7 = ((o1) h1Var.f218b).f22954f;
            o1.m(s0Var7);
            orVar = s0Var7.f23054h;
        } else if (z10) {
            s0 s0Var8 = ((o1) h1Var.f218b).f22954f;
            o1.m(s0Var8);
            orVar = s0Var8.g;
        } else {
            s0 s0Var9 = ((o1) h1Var.f218b).f22954f;
            o1.m(s0Var9);
            orVar = s0Var9.f23055i;
        }
        int size = list.size();
        if (size == 1) {
            orVar.e(list.get(0), str);
            return;
        }
        if (size == 2) {
            orVar.f(list.get(0), list.get(1), str);
        } else if (size != 3) {
            orVar.d(str);
        } else {
            orVar.g(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public c(o7.d dVar, y4.a aVar) {
        this.f27641a = 4;
        this.f27642b = aVar;
        dVar.o(new be.b(1, this));
    }

    public c(EnumMap enumMap) {
        this.f27641a = 10;
        EnumMap enumMap2 = new EnumMap(z1.class);
        this.f27642b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public c(com.google.gson.j jVar, com.google.gson.w wVar) {
        this.f27641a = 28;
        this.f27642b = wVar;
    }

    public c(int i4) {
        this.f27641a = i4;
        switch (i4) {
            case 5:
                this.f27642b = new x.o((Object) null);
                break;
            case 6:
                this.f27642b = new HashMap();
                break;
            case 10:
                this.f27642b = new EnumMap(z1.class);
                break;
            case 13:
                break;
            case 15:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f27642b = new f4.h(this);
                    break;
                } else {
                    this.f27642b = new f4.g(this);
                    break;
                }
            case 19:
                this.f27642b = new Object();
                new Handler(Looper.getMainLooper(), new hd.e(0, this));
                break;
            case 23:
                this.f27642b = new w0.e(new j0.k[16]);
                break;
            default:
                this.f27642b = new HashSet();
                break;
        }
    }

    @Override // a0.s
    public a0.a0 get(int i4) {
        return ((a0.b0[]) this.f27642b)[i4];
    }

    public c(a0.r rVar, float f10, float f11) {
        this.f27641a = 1;
        int iB = rVar.b();
        a0.b0[] b0VarArr = new a0.b0[iB];
        for (int i4 = 0; i4 < iB; i4++) {
            b0VarArr[i4] = new a0.b0(f10, f11, rVar.a(i4));
        }
        this.f27642b = b0VarArr;
    }

    private final void o() {
    }

    private final /* synthetic */ void q() {
    }

    private final /* bridge */ void u() {
    }

    public void b(int i4, f fVar, String str, Bundle bundle) {
    }
}
