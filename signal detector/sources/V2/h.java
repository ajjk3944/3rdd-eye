package V2;

import B4.InterfaceC0140b;
import B4.l;
import C0.t;
import G3.C0152f;
import R.C0187n;
import S3.p;
import V0.o;
import V0.r;
import Y2.A;
import Y2.C0213o;
import Y2.C0214p;
import Y2.N;
import Y2.O;
import Y2.z;
import a.AbstractC0241a;
import android.animation.Animator;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.t0;
import androidx.work.impl.WorkDatabase_Impl;
import c3.i;
import c3.j;
import com.apm.insight.R;
import com.bumptech.glide.n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.lefan.signal.db.SquatterBean;
import com.lefan.signal.ui.wifi.SquatterDetailActivity;
import com.lefan.signal.ui.wifi.WifiFragment;
import d4.C2269c;
import e1.C2299b;
import h0.C2351a;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import k0.AbstractComponentCallbacksC2617v;
import k0.K;
import l1.InterfaceC2639e;
import l1.k;
import n1.C;
import o1.InterfaceC2753a;
import q0.C2789b;
import q0.v;
import q2.C2834o;
import r1.q;
import t2.C2911G;
import t2.HandlerC2908D;
import t2.x;
import u.AbstractC2939h;
import u.C2936e;
import u.C2938g;
import u.C2940i;
import u1.C2947b;
import u1.C2949d;
import u2.m;

/* loaded from: classes.dex */
public final class h implements G2.a, InterfaceC0140b, c3.b, r, N, l, com.bumptech.glide.load.data.c, u2.e, k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3874a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3875b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3876c;

    public /* synthetic */ h(int i, boolean z6) {
        this.f3874a = i;
    }

    private final void t(j jVar) {
        p pVar = (p) this.f3875b;
        c3.f fVar = (c3.f) this.f3876c;
        synchronized (pVar.f3504f) {
            pVar.f3503e.remove(fVar);
        }
    }

    public void A(boolean z6, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f3875b)) {
            map = new HashMap((Map) this.f3875b);
        }
        synchronized (((Map) this.f3876c)) {
            map2 = new HashMap((Map) this.f3876c);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z6 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z6 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((c3.f) entry2.getKey()).a(new K2.d(status));
            }
        }
    }

    public C2269c B() {
        Map map = (Map) this.f3876c;
        if (map == null) {
            throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        if (mapUnmodifiableMap == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        this.f3876c = mapUnmodifiableMap;
        return new C2269c((Integer) this.f3875b, (Map) this.f3876c);
    }

    @Override // Y2.O
    public Object a() {
        C0214p c0214p = (C0214p) ((O) this.f3875b).a();
        Handler handler = z.f4385a;
        A.c(handler);
        return new C0213o(c0214p, handler, ((C2834o) this.f3876c).g());
    }

    @Override // G2.a
    public j b() {
        j jVarB = ((g) this.f3875b).b();
        A0.e eVar = new A0.e(17, this);
        jVarB.getClass();
        i iVar = c3.g.f5903a;
        j jVar = new j();
        jVarB.f5912b.i(new c3.h(iVar, eVar, jVar, 1));
        jVarB.j();
        return jVar;
    }

    @Override // u2.e
    public m c(String str) {
        HandlerC2908D handlerC2908D = C2911G.f23576l;
        C2911G c2911g = p2.j.f22785C.f22790c;
        new x((Context) this.f3875b, (String) this.f3876c, str, null).k();
        return m.f23816a;
    }

    @Override // com.bumptech.glide.load.data.c
    public void d(Exception exc) {
        C c6 = (C) this.f3876c;
        q qVar = (q) this.f3875b;
        q qVar2 = c6.f22168f;
        if (qVar2 == null || qVar2 != qVar) {
            return;
        }
        C c7 = (C) this.f3876c;
        q qVar3 = (q) this.f3875b;
        n1.i iVar = c7.f22164b;
        n1.e eVar = c7.f22169g;
        com.bumptech.glide.load.data.d dVar = qVar3.f23370c;
        iVar.a(eVar, exc, dVar, dVar.c());
    }

    @Override // c3.b
    public void e(j jVar) {
        switch (this.f3874a) {
            case 10:
                t(jVar);
                return;
            default:
                X3.h hVar = (X3.h) this.f3875b;
                c3.f fVar = (c3.f) this.f3876c;
                synchronized (hVar.f4184f) {
                    hVar.f4183e.remove(fVar);
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public void f(Object obj) {
        C c6 = (C) this.f3876c;
        q qVar = (q) this.f3875b;
        q qVar2 = c6.f22168f;
        if (qVar2 == null || qVar2 != qVar) {
            return;
        }
        C c7 = (C) this.f3876c;
        q qVar3 = (q) this.f3875b;
        n1.k kVar = c7.f22163a.f22199p;
        if (obj != null && kVar.a(qVar3.f23370c.c())) {
            c7.f22167e = obj;
            c7.f22164b.o(2);
        } else {
            n1.i iVar = c7.f22164b;
            InterfaceC2639e interfaceC2639e = qVar3.f23368a;
            com.bumptech.glide.load.data.d dVar = qVar3.f23370c;
            iVar.c(interfaceC2639e, obj, dVar, dVar.c(), c7.f22169g);
        }
    }

    public void g(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f3875b).add(AbstractC1135f5.n(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // B4.l
    public void h(B4.m mVar) {
        mVar.dismiss();
    }

    @Override // B4.InterfaceC0140b
    public void i(Dialog dialog) {
        switch (this.f3874a) {
            case 7:
                N4.m mVar = (N4.m) this.f3876c;
                if (dialog != null) {
                    dialog.dismiss();
                }
                try {
                    mVar.W(new Intent("android.intent.action.VIEW", Uri.parse("http://" + ((String) this.f3875b))));
                    break;
                } catch (ActivityNotFoundException unused) {
                    F4.d.b(mVar.m(), mVar.r(R.string.open_web_failed));
                    return;
                }
            default:
                WifiFragment wifiFragment = (WifiFragment) this.f3876c;
                if (dialog != null) {
                    dialog.dismiss();
                }
                try {
                    wifiFragment.W(new Intent("android.intent.action.VIEW", Uri.parse("http://" + ((String) this.f3875b))));
                    break;
                } catch (ActivityNotFoundException unused2) {
                    F4.d.b(wifiFragment.m(), wifiFragment.r(R.string.open_web_failed));
                }
        }
    }

    @Override // B4.l
    public void j(B4.m mVar, String str) {
        mVar.dismiss();
        ((AppCompatTextView) this.f3875b).setText(str);
        SquatterDetailActivity squatterDetailActivity = (SquatterDetailActivity) this.f3876c;
        SquatterBean squatterBean = squatterDetailActivity.f19377Q;
        q5.i.b(squatterBean);
        squatterBean.setBrand(str);
        SquatterBean squatterBean2 = squatterDetailActivity.f19377Q;
        q5.i.b(squatterBean2);
        if (squatterBean2.isMy()) {
            if (str == null) {
                str = Build.BRAND;
            }
            q5.i.b(str);
            com.bumptech.glide.e.z(squatterDetailActivity, "my_device_brand", str);
            return;
        }
        L4.h hVar = (L4.h) squatterDetailActivity.f19376P.getValue();
        SquatterBean squatterBean3 = squatterDetailActivity.f19377Q;
        q5.i.b(squatterBean3);
        hVar.a(squatterBean3);
    }

    public void k(g0 g0Var, C0187n c0187n) {
        C2940i c2940i = (C2940i) this.f3875b;
        t0 t0VarA = (t0) c2940i.get(g0Var);
        if (t0VarA == null) {
            t0VarA = t0.a();
            c2940i.put(g0Var, t0VarA);
        }
        t0VarA.f5609c = c0187n;
        t0VarA.f5607a |= 8;
    }

    @Override // l1.InterfaceC2636b
    public boolean l(Object obj, File file, l1.h hVar) {
        return ((C2947b) this.f3876c).l(new C2949d(((BitmapDrawable) ((n1.z) obj).get()).getBitmap(), (InterfaceC2753a) this.f3875b), file, hVar);
    }

    @Override // B4.InterfaceC0140b
    public void m(Dialog dialog) {
        switch (this.f3874a) {
            case 7:
                if (dialog != null) {
                    dialog.dismiss();
                    break;
                }
                break;
            default:
                if (dialog != null) {
                    dialog.dismiss();
                    break;
                }
                break;
        }
    }

    public Long n(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3875b;
        t tVarA = t.a(1, "SELECT long_value FROM Preference where `key`=?");
        tVarA.c(1, str);
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(tVarA);
        try {
            Long lValueOf = null;
            if (cursorL.moveToFirst() && !cursorL.isNull(0)) {
                lValueOf = Long.valueOf(cursorL.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorL.close();
            tVarA.b();
        }
    }

    @Override // l1.k
    public int o(l1.h hVar) {
        return 2;
    }

    public n p(Context context, com.bumptech.glide.b bVar, C0300w c0300w, K k6, boolean z6) {
        H1.p.a();
        H1.p.a();
        HashMap map = (HashMap) this.f3875b;
        n nVar = (n) map.get(c0300w);
        if (nVar != null) {
            return nVar;
        }
        A1.i iVar = new A1.i(c0300w);
        C0152f c0152f = (C0152f) this.f3876c;
        C0152f c0152f2 = new C0152f(this, k6);
        c0152f.getClass();
        n nVar2 = new n(bVar, iVar, c0152f2, context);
        map.put(c0300w, nVar2);
        iVar.f(new A1.k(this, c0300w));
        if (z6) {
            nVar2.j();
        }
        return nVar2;
    }

    public ArrayList q(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3875b;
        t tVarA = t.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            tVarA.l(1);
        } else {
            tVarA.c(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(tVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorL.getCount());
            while (cursorL.moveToNext()) {
                arrayList.add(cursorL.getString(0));
            }
            return arrayList;
        } finally {
            cursorL.close();
            tVarA.b();
        }
    }

    public void r(C2299b c2299b) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3875b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((L4.b) this.f3876c).f(c2299b);
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
        }
    }

    public boolean s(v vVar) {
        q5.i.e(vVar, "destination");
        int i = v.f23035j;
        for (v vVar2 : x5.h.L(vVar, C2789b.f22951g)) {
            if (((HashSet) this.f3875b).contains(Integer.valueOf(vVar2.f23043h))) {
                if (vVar2 instanceof q0.x) {
                    int i3 = vVar.f23043h;
                    int i6 = q0.x.f23047n;
                    if (i3 == AbstractC0241a.b((q0.x) vVar2).f23043h) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        switch (this.f3874a) {
            case 6:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f3876c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f3875b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case 16:
                return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", (ArrayList) this.f3875b, (ArrayList) this.f3876c);
            default:
                return super.toString();
        }
    }

    public C0187n u(g0 g0Var, int i) {
        t0 t0Var;
        C0187n c0187n;
        C2940i c2940i = (C2940i) this.f3875b;
        int iD = c2940i.d(g0Var);
        if (iD >= 0 && (t0Var = (t0) c2940i.j(iD)) != null) {
            int i3 = t0Var.f5607a;
            if ((i3 & i) != 0) {
                int i6 = i3 & (~i);
                t0Var.f5607a = i6;
                if (i == 4) {
                    c0187n = t0Var.f5608b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0187n = t0Var.f5609c;
                }
                if ((i6 & 12) == 0) {
                    c2940i.h(iD);
                    t0Var.f5607a = 0;
                    t0Var.f5608b = null;
                    t0Var.f5609c = null;
                    t0.f5606d.d(t0Var);
                }
                return c0187n;
            }
        }
        return null;
    }

    public void v(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((C2936e) this.f3876c)) {
            ((C2936e) this.f3876c).put(new H1.n(cls, cls2, cls3), list);
        }
    }

    public void w(String str) {
        p1.b bVar;
        synchronized (this) {
            try {
                bVar = (p1.b) ((HashMap) this.f3875b).get(str);
                H1.g.c(bVar, "Argument must not be null");
                int i = bVar.f22736b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f22736b);
                }
                int i3 = i - 1;
                bVar.f22736b = i3;
                if (i3 == 0) {
                    p1.b bVar2 = (p1.b) ((HashMap) this.f3875b).remove(str);
                    if (!bVar2.equals(bVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                    ((h2.d) this.f3876c).o(bVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bVar.f22735a.unlock();
    }

    public void x(g0 g0Var) {
        t0 t0Var = (t0) ((C2940i) this.f3875b).get(g0Var);
        if (t0Var == null) {
            return;
        }
        t0Var.f5607a &= -2;
    }

    public void y(g0 g0Var) {
        C2938g c2938g = (C2938g) this.f3876c;
        int iJ = c2938g.j() - 1;
        while (true) {
            if (iJ < 0) {
                break;
            }
            if (g0Var == c2938g.k(iJ)) {
                Object[] objArr = c2938g.f23699c;
                Object obj = objArr[iJ];
                Object obj2 = AbstractC2939h.f23701a;
                if (obj != obj2) {
                    objArr[iJ] = obj2;
                    c2938g.f23697a = true;
                }
            } else {
                iJ--;
            }
        }
        t0 t0Var = (t0) ((C2940i) this.f3875b).remove(g0Var);
        if (t0Var != null) {
            t0Var.f5607a = 0;
            t0Var.f5608b = null;
            t0Var.f5609c = null;
            t0.f5606d.d(t0Var);
        }
    }

    public void z(com.bumptech.glide.d dVar) {
        g1.k kVar = (g1.k) this.f3876c;
        ((D) this.f3875b).h(dVar);
        if (dVar instanceof V0.q) {
            kVar.i((V0.q) dVar);
        } else if (dVar instanceof o) {
            kVar.j(((o) dVar).f3834a);
        }
    }

    public h(Context context) {
        e eVar;
        this.f3874a = 0;
        this.f3875b = new g(context, J2.f.f2059b);
        synchronized (e.class) {
            try {
                if (e.f3865e == null) {
                    e.f3865e = new e(context.getApplicationContext());
                }
                eVar = e.f3865e;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3876c = eVar;
    }

    public /* synthetic */ h(Object obj, int i, Object obj2) {
        this.f3874a = i;
        this.f3875b = obj;
        this.f3876c = obj2;
    }

    public /* synthetic */ h(Object obj, Object obj2, int i, boolean z6) {
        this.f3874a = i;
        this.f3876c = obj;
        this.f3875b = obj2;
    }

    public /* synthetic */ h(C2351a c2351a) {
        this.f3874a = 16;
        this.f3875b = new ArrayList((ArrayList) c2351a.f20441b);
        this.f3876c = new ArrayList((ArrayList) c2351a.f20442c);
    }

    public /* synthetic */ h(Object obj) {
        this.f3874a = 6;
        this.f3876c = obj;
        this.f3875b = new ArrayList();
    }

    public h(int i) {
        this.f3874a = i;
        switch (i) {
            case 5:
                this.f3875b = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.f3876c = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            case 11:
                this.f3875b = new D();
                this.f3876c = new g1.k();
                z(r.f3836w);
                break;
            case 17:
                this.f3875b = new C2940i(0);
                this.f3876c = new C2938g();
                break;
            case 19:
                this.f3875b = Choreographer.getInstance();
                this.f3876c = Looper.myLooper();
                break;
            case 22:
                this.f3875b = new Rect();
                this.f3876c = new Rect();
                break;
            case 25:
                this.f3875b = new HashMap();
                this.f3876c = new h2.d(7);
                break;
            default:
                this.f3875b = new AtomicReference();
                this.f3876c = new C2936e(0);
                break;
        }
    }

    public h(C0152f c0152f) {
        this.f3874a = 1;
        this.f3875b = new HashMap();
        this.f3876c = c0152f;
    }

    public h(WorkDatabase_Impl workDatabase_Impl, int i) {
        this.f3874a = i;
        switch (i) {
            case 21:
                this.f3875b = workDatabase_Impl;
                this.f3876c = new L4.b(workDatabase_Impl, 13);
                break;
            default:
                this.f3875b = workDatabase_Impl;
                this.f3876c = new L4.b(workDatabase_Impl, 8);
                break;
        }
    }

    public h(C0.p pVar) {
        this.f3874a = 2;
        this.f3875b = pVar;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        q5.i.d(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f3876c = setNewSetFromMap;
    }

    public h(HashSet hashSet, X.d dVar, H4.e eVar) {
        this.f3874a = 27;
        this.f3875b = hashSet;
        this.f3876c = dVar;
    }

    public h(Animation animation) {
        this.f3874a = 23;
        this.f3875b = animation;
        this.f3876c = null;
    }

    public h(Animator animator) {
        this.f3874a = 23;
        this.f3875b = null;
        this.f3876c = animator;
    }

    public h(ArrayList arrayList, ArrayList arrayList2) {
        this.f3874a = 4;
        int size = arrayList.size();
        this.f3875b = new int[size];
        this.f3876c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f3875b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f3876c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public h(int i, int i3) {
        this.f3874a = 4;
        this.f3875b = new int[]{i, i3};
        this.f3876c = new float[]{0.0f, 1.0f};
    }

    public h(int i, int i3, int i6) {
        this.f3874a = 4;
        this.f3875b = new int[]{i, i3, i6};
        this.f3876c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public h(U4.m mVar, AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v, FrameLayout frameLayout) {
        this.f3874a = 9;
        this.f3875b = abstractComponentCallbacksC2617v;
        this.f3876c = frameLayout;
    }
}
