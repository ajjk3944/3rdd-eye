package h0;

import A1.s;
import B4.InterfaceC0140b;
import C0.t;
import C0.x;
import G3.C0152f;
import R.D;
import R.O;
import R.S;
import U4.m;
import Y2.AbstractC0218u;
import Y2.C0204f;
import Y2.C0207i;
import Y2.EnumC0215q;
import Y2.Q;
import Y2.r;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n0;
import androidx.work.impl.WorkDatabase_Impl;
import b4.C0339d;
import b4.C0344i;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.activity.SplashActivity;
import com.lefan.signal.ui.wifi.SquatterActivity;
import f0.C2315A;
import f0.p;
import f0.w;
import h.AbstractActivityC2349g;
import h.n;
import h.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.AbstractComponentCallbacksC2617v;
import k0.B;
import k0.K;
import l1.InterfaceC2639e;
import n.MenuC2677k;
import n.z;
import o1.C2755c;
import o1.InterfaceC2759g;
import p4.C2781h;
import t.AbstractC2899a;
import u.C2940i;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2351a implements G0.a, O0.a, c3.b, S3.c, e4.d, InterfaceC0140b, p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20440a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20441b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20442c;

    public /* synthetic */ C2351a(int i, Object obj) {
        this.f20440a = i;
        this.f20442c = obj;
    }

    public void A(int i) {
        ArrayList arrayList = (ArrayList) this.f20442c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((n0) ((ArrayList) this.f20442c).get(size)).f5554a >= i) {
                    ((ArrayList) this.f20442c).remove(size);
                }
            }
        }
        I(i);
    }

    public Object B(InterfaceC2759g interfaceC2759g) {
        HashMap map = (HashMap) this.f20442c;
        C2755c c2755c = (C2755c) map.get(interfaceC2759g);
        if (c2755c == null) {
            c2755c = new C2755c(interfaceC2759g);
            map.put(interfaceC2759g, c2755c);
        } else {
            interfaceC2759g.a();
        }
        C2755c c2755c2 = c2755c.f22674d;
        c2755c2.f22673c = c2755c.f22673c;
        c2755c.f22673c.f22674d = c2755c2;
        C2755c c2755c3 = (C2755c) this.f20441b;
        c2755c.f22674d = c2755c3;
        C2755c c2755c4 = c2755c3.f22673c;
        c2755c.f22673c = c2755c4;
        c2755c4.f22674d = c2755c;
        c2755c.f22674d.f22673c = c2755c;
        ArrayList arrayList = c2755c.f22672b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c2755c.f22672b.remove(size - 1);
        }
        return null;
    }

    public ArrayList C(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f20441b;
        t tVarA = t.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
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

    public n0 D(int i, int i3, int i6) {
        ArrayList arrayList = (ArrayList) this.f20442c;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            n0 n0Var = (n0) ((ArrayList) this.f20442c).get(i7);
            int i8 = n0Var.f5554a;
            if (i8 >= i3) {
                return null;
            }
            if (i8 >= i && (i6 == 0 || n0Var.f5555b == i6 || n0Var.f5557d)) {
                return n0Var;
            }
        }
        return null;
    }

    public n0 E(int i) {
        ArrayList arrayList = (ArrayList) this.f20442c;
        if (arrayList == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n0 n0Var = (n0) ((ArrayList) this.f20442c).get(size);
            if (n0Var.f5554a == i) {
                return n0Var;
            }
        }
        return null;
    }

    public synchronized List F(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f20441b).contains(str)) {
                ((ArrayList) this.f20441b).add(str);
            }
            arrayList = (List) ((HashMap) this.f20442c).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f20442c).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized ArrayList G(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f20441b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            List<C1.d> list = (List) ((HashMap) this.f20442c).get((String) obj);
            if (list != null) {
                for (C1.d dVar : list) {
                    if ((dVar.f1142a.isAssignableFrom(cls) && cls2.isAssignableFrom(dVar.f1143b)) && !arrayList.contains(dVar.f1143b)) {
                        arrayList.add(dVar.f1143b);
                    }
                }
            }
        }
        return arrayList;
    }

    public String H(InterfaceC2639e interfaceC2639e) {
        String strF;
        synchronized (((H1.l) this.f20441b)) {
            strF = (String) ((H1.l) this.f20441b).a(interfaceC2639e);
        }
        if (strF == null) {
            strF = f(interfaceC2639e);
        }
        synchronized (((H1.l) this.f20441b)) {
            ((H1.l) this.f20441b).d(interfaceC2639e, strF);
        }
        return strF;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int I(int r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f20441b
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            goto Lb
        L8:
            int r0 = r0.length
            if (r5 < r0) goto Lc
        Lb:
            return r1
        Lc:
            java.lang.Object r0 = r4.f20442c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L14
        L12:
            r0 = r1
            goto L54
        L14:
            androidx.recyclerview.widget.n0 r0 = r4.E(r5)
            if (r0 == 0) goto L21
            java.lang.Object r2 = r4.f20442c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.remove(r0)
        L21:
            java.lang.Object r0 = r4.f20442c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r2 = 0
        L2a:
            if (r2 >= r0) goto L3e
            java.lang.Object r3 = r4.f20442c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.n0 r3 = (androidx.recyclerview.widget.n0) r3
            int r3 = r3.f5554a
            if (r3 < r5) goto L3b
            goto L3f
        L3b:
            int r2 = r2 + 1
            goto L2a
        L3e:
            r2 = r1
        L3f:
            if (r2 == r1) goto L12
            java.lang.Object r0 = r4.f20442c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r2)
            androidx.recyclerview.widget.n0 r0 = (androidx.recyclerview.widget.n0) r0
            java.lang.Object r3 = r4.f20442c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.remove(r2)
            int r0 = r0.f5554a
        L54:
            if (r0 != r1) goto L64
            java.lang.Object r0 = r4.f20441b
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r5, r2, r1)
            java.lang.Object r5 = r4.f20441b
            int[] r5 = (int[]) r5
            int r5 = r5.length
            return r5
        L64:
            int r0 = r0 + 1
            java.lang.Object r2 = r4.f20441b
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r2 = r4.f20441b
            int[] r2 = (int[]) r2
            java.util.Arrays.fill(r2, r5, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C2351a.I(int):int");
    }

    public void J(int i, int i3) {
        int[] iArr = (int[]) this.f20441b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i6 = i + i3;
        z(i6);
        int[] iArr2 = (int[]) this.f20441b;
        System.arraycopy(iArr2, i, iArr2, i6, (iArr2.length - i) - i3);
        Arrays.fill((int[]) this.f20441b, i, i6, -1);
        ArrayList arrayList = (ArrayList) this.f20442c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n0 n0Var = (n0) ((ArrayList) this.f20442c).get(size);
            int i7 = n0Var.f5554a;
            if (i7 >= i) {
                n0Var.f5554a = i7 + i3;
            }
        }
    }

    public void K(int i, int i3) {
        int[] iArr = (int[]) this.f20441b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i6 = i + i3;
        z(i6);
        int[] iArr2 = (int[]) this.f20441b;
        System.arraycopy(iArr2, i6, iArr2, i, (iArr2.length - i) - i3);
        int[] iArr3 = (int[]) this.f20441b;
        Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f20442c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n0 n0Var = (n0) ((ArrayList) this.f20442c).get(size);
            int i7 = n0Var.f5554a;
            if (i7 >= i) {
                if (i7 < i6) {
                    ((ArrayList) this.f20442c).remove(size);
                } else {
                    n0Var.f5554a = i7 - i3;
                }
            }
        }
    }

    public void L(m.a aVar) {
        c1.g gVar = (c1.g) this.f20441b;
        ((ActionMode.Callback) gVar.f5896b).onDestroyActionMode(gVar.p(aVar));
        v vVar = (v) this.f20442c;
        if (vVar.f20393K != null) {
            vVar.f20420l.getDecorView().removeCallbacks(vVar.f20394L);
        }
        if (vVar.f20392J != null) {
            S s5 = vVar.M;
            if (s5 != null) {
                s5.b();
            }
            S sA = O.a(vVar.f20392J);
            sA.a(0.0f);
            vVar.M = sA;
            sA.d(new n(2, this));
        }
        vVar.f20391I = null;
        ViewGroup viewGroup = vVar.f20396O;
        WeakHashMap weakHashMap = O.f3270a;
        D.c(viewGroup);
        vVar.P();
    }

    public boolean M(m.a aVar, Menu menu) {
        ViewGroup viewGroup = ((v) this.f20442c).f20396O;
        WeakHashMap weakHashMap = O.f3270a;
        D.c(viewGroup);
        c1.g gVar = (c1.g) this.f20441b;
        ActionMode.Callback callback = (ActionMode.Callback) gVar.f5896b;
        m.e eVarP = gVar.p(aVar);
        C2940i c2940i = (C2940i) gVar.f5899e;
        Menu zVar = (Menu) c2940i.get(menu);
        if (zVar == null) {
            zVar = new z((Context) gVar.f5897c, (MenuC2677k) menu);
            c2940i.put(menu, zVar);
        }
        return callback.onPrepareActionMode(eVarP, zVar);
    }

    public void N(O.g gVar) {
        L2.i iVar = (L2.i) this.f20442c;
        U0.j jVar = (U0.j) this.f20441b;
        int i = gVar.f3047b;
        if (i == 0) {
            iVar.execute(new A1.d(jVar, gVar.f3046a, 11, false));
        } else {
            iVar.execute(new A3.h(i, 3, jVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x022b, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fc A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #2 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:19:0x005e, B:114:0x022b, B:26:0x0070, B:27:0x007e, B:51:0x00bb, B:29:0x0082, B:36:0x0092, B:39:0x009c, B:42:0x00a6, B:52:0x00c9, B:53:0x00d1, B:90:0x0146, B:91:0x014d, B:92:0x0165, B:94:0x0168, B:95:0x0173, B:96:0x018b, B:98:0x018e, B:99:0x0199, B:100:0x01b1, B:102:0x01b4, B:103:0x01be, B:104:0x01d6, B:106:0x01d9, B:107:0x01e3, B:108:0x01fb, B:109:0x01fc, B:110:0x0209, B:111:0x0216, B:112:0x021f, B:55:0x00d6, B:58:0x00e1, B:61:0x00ec, B:64:0x00f5, B:67:0x0100, B:70:0x010a, B:73:0x0114, B:76:0x011e, B:79:0x0128, B:82:0x0132, B:113:0x0228), top: B:122:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0209 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #2 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:19:0x005e, B:114:0x022b, B:26:0x0070, B:27:0x007e, B:51:0x00bb, B:29:0x0082, B:36:0x0092, B:39:0x009c, B:42:0x00a6, B:52:0x00c9, B:53:0x00d1, B:90:0x0146, B:91:0x014d, B:92:0x0165, B:94:0x0168, B:95:0x0173, B:96:0x018b, B:98:0x018e, B:99:0x0199, B:100:0x01b1, B:102:0x01b4, B:103:0x01be, B:104:0x01d6, B:106:0x01d9, B:107:0x01e3, B:108:0x01fb, B:109:0x01fc, B:110:0x0209, B:111:0x0216, B:112:0x021f, B:55:0x00d6, B:58:0x00e1, B:61:0x00ec, B:64:0x00f5, B:67:0x0100, B:70:0x010a, B:73:0x0114, B:76:0x011e, B:79:0x0128, B:82:0x0132, B:113:0x0228), top: B:122:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0216 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #2 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:19:0x005e, B:114:0x022b, B:26:0x0070, B:27:0x007e, B:51:0x00bb, B:29:0x0082, B:36:0x0092, B:39:0x009c, B:42:0x00a6, B:52:0x00c9, B:53:0x00d1, B:90:0x0146, B:91:0x014d, B:92:0x0165, B:94:0x0168, B:95:0x0173, B:96:0x018b, B:98:0x018e, B:99:0x0199, B:100:0x01b1, B:102:0x01b4, B:103:0x01be, B:104:0x01d6, B:106:0x01d9, B:107:0x01e3, B:108:0x01fb, B:109:0x01fc, B:110:0x0209, B:111:0x0216, B:112:0x021f, B:55:0x00d6, B:58:0x00e1, B:61:0x00ec, B:64:0x00f5, B:67:0x0100, B:70:0x010a, B:73:0x0114, B:76:0x011e, B:79:0x0128, B:82:0x0132, B:113:0x0228), top: B:122:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021f A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #2 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:19:0x005e, B:114:0x022b, B:26:0x0070, B:27:0x007e, B:51:0x00bb, B:29:0x0082, B:36:0x0092, B:39:0x009c, B:42:0x00a6, B:52:0x00c9, B:53:0x00d1, B:90:0x0146, B:91:0x014d, B:92:0x0165, B:94:0x0168, B:95:0x0173, B:96:0x018b, B:98:0x018e, B:99:0x0199, B:100:0x01b1, B:102:0x01b4, B:103:0x01be, B:104:0x01d6, B:106:0x01d9, B:107:0x01e3, B:108:0x01fb, B:109:0x01fc, B:110:0x0209, B:111:0x0216, B:112:0x021f, B:55:0x00d6, B:58:0x00e1, B:61:0x00ec, B:64:0x00f5, B:67:0x0100, B:70:0x010a, B:73:0x0114, B:76:0x011e, B:79:0x0128, B:82:0x0132, B:113:0x0228), top: B:122:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void O(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C2351a.O(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void P(InterfaceC2759g interfaceC2759g, Object obj) {
        HashMap map = (HashMap) this.f20442c;
        C2755c c2755c = (C2755c) map.get(interfaceC2759g);
        if (c2755c == null) {
            c2755c = new C2755c(interfaceC2759g);
            c2755c.f22674d = c2755c;
            C2755c c2755c2 = (C2755c) this.f20441b;
            c2755c.f22674d = c2755c2.f22674d;
            c2755c.f22673c = c2755c2;
            c2755c2.f22674d = c2755c;
            c2755c.f22674d.f22673c = c2755c;
            map.put(interfaceC2759g, c2755c);
        } else {
            interfaceC2759g.a();
        }
        if (c2755c.f22672b == null) {
            c2755c.f22672b = new ArrayList();
        }
        c2755c.f22672b.add(obj);
    }

    public Object Q() {
        C2755c c2755c = (C2755c) this.f20441b;
        C2755c c2755c2 = c2755c.f22674d;
        while (true) {
            boolean zEquals = c2755c2.equals(c2755c);
            Object obj = c2755c2.f22671a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = c2755c2.f22672b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c2755c2.f22672b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C2755c c2755c3 = c2755c2.f22674d;
            c2755c3.f22673c = c2755c2.f22673c;
            c2755c2.f22673c.f22674d = c2755c3;
            ((HashMap) this.f20442c).remove(obj);
            ((InterfaceC2759g) obj).a();
            c2755c2 = c2755c2.f22674d;
        }
    }

    public void R(int i, int i3, int i6, int i7) {
        AbstractC2899a abstractC2899a = (AbstractC2899a) this.f20442c;
        abstractC2899a.f23508d.set(i, i3, i6, i7);
        Rect rect = abstractC2899a.f23507c;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i3 + rect.top, i6 + rect.right, i7 + rect.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    public K4.c S(Activity activity, C0344i c0344i) throws Q, PackageManager.NameNotFoundException {
        Bundle bundle;
        String string;
        Collection collection;
        PackageInfo packageInfo;
        c0344i.getClass();
        Application application = (Application) this.f20441b;
        boolean z6 = AbstractC0218u.c() || new ArrayList().contains(AbstractC0218u.a(application.getApplicationContext()));
        K4.c cVar = new K4.c(2);
        cVar.f2214g = Collections.EMPTY_MAP;
        cVar.f2216j = Collections.EMPTY_LIST;
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new Q(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        cVar.f2209b = string;
        if (z6) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(EnumC0215q.f4357a);
            collection = arrayList;
        } else {
            collection = Collections.EMPTY_LIST;
        }
        cVar.f2216j = collection;
        cVar.f2214g = ((C0204f) this.f20442c).a();
        cVar.f2213f = Boolean.FALSE;
        cVar.f2210c = Locale.getDefault().toLanguageTag();
        I.d dVar = new I.d();
        dVar.f1850b = 1;
        int i = Build.VERSION.SDK_INT;
        dVar.f1852d = Integer.valueOf(i);
        dVar.f1851c = Build.MODEL;
        dVar.f1850b = 2;
        cVar.f2212e = dVar;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        c1.g gVar = new c1.g(11, false);
        Object arrayList2 = Collections.EMPTY_LIST;
        gVar.f5899e = arrayList2;
        gVar.f5896b = Integer.valueOf(configuration.screenWidthDp);
        gVar.f5897c = Integer.valueOf(configuration.screenHeightDp);
        gVar.f5898d = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i >= 28) {
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        r rVar = new r();
                        rVar.f4360b = Integer.valueOf(rect.left);
                        rVar.f4361c = Integer.valueOf(rect.right);
                        rVar.f4359a = Integer.valueOf(rect.top);
                        rVar.f4362d = Integer.valueOf(rect.bottom);
                        arrayList2.add(rVar);
                    }
                }
            }
        }
        gVar.f5899e = arrayList2;
        cVar.f2215h = gVar;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        V2.e eVar = new V2.e(14);
        eVar.f3868b = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        eVar.f3869c = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            eVar.f3870d = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        cVar.i = eVar;
        cVar.f2211d = new S4.r(13);
        return cVar;
    }

    @Override // S3.c, Y2.O
    public Object a() {
        return new R3.k(((R3.e) ((U0.j) this.f20441b).f3677b).f3409b, (R3.l) ((S3.c) this.f20442c).a());
    }

    @Override // f0.p
    public Object b() {
        return (C2315A) this.f20441b;
    }

    @Override // f0.p
    public boolean c(CharSequence charSequence, int i, int i3, f0.v vVar) {
        if ((vVar.f20025c & 4) > 0) {
            return true;
        }
        if (((C2315A) this.f20441b) == null) {
            this.f20441b = new C2315A(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C0344i) this.f20442c).getClass();
        ((C2315A) this.f20441b).setSpan(new w(vVar), i, i3, 33);
        return true;
    }

    public void d(n0 n0Var) {
        if (((ArrayList) this.f20442c) == null) {
            this.f20442c = new ArrayList();
        }
        int size = ((ArrayList) this.f20442c).size();
        for (int i = 0; i < size; i++) {
            n0 n0Var2 = (n0) ((ArrayList) this.f20442c).get(i);
            if (n0Var2.f5554a == n0Var.f5554a) {
                ((ArrayList) this.f20442c).remove(i);
            }
            if (n0Var2.f5554a >= n0Var.f5554a) {
                ((ArrayList) this.f20442c).add(i, n0Var);
                return;
            }
        }
        ((ArrayList) this.f20442c).add(n0Var);
    }

    @Override // c3.b
    public void e(c3.j jVar) {
        switch (this.f20440a) {
            case 6:
                ((Map) ((V2.h) this.f20442c).f3876c).remove((c3.f) this.f20441b);
                return;
            default:
                C0339d c0339d = (C0339d) this.f20441b;
                c3.f fVar = (c3.f) this.f20442c;
                synchronized (c0339d.f5742f) {
                    c0339d.f5741e.remove(fVar);
                }
                return;
        }
    }

    public String f(InterfaceC2639e interfaceC2639e) {
        String str;
        p1.f fVar = (p1.f) ((V2.e) this.f20442c).h();
        try {
            interfaceC2639e.a(fVar.f22744a);
            byte[] bArrDigest = fVar.f22744a.digest();
            char[] cArr = H1.p.f1780b;
            synchronized (cArr) {
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b5 = bArrDigest[i];
                    int i3 = i * 2;
                    char[] cArr2 = H1.p.f1779a;
                    cArr[i3] = cArr2[(b5 & 255) >>> 4];
                    cArr[i3 + 1] = cArr2[b5 & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            ((V2.e) this.f20442c).d(fVar);
        }
    }

    public void g() {
        int[] iArr = (int[]) this.f20441b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f20442c = null;
    }

    @Override // O0.a
    public View getRoot() {
        return (LinearLayout) this.f20441b;
    }

    public void h(boolean z6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = ((K) this.f20442c).f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            abstractComponentCallbacksC2617v.p().f21514m.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
            }
        }
    }

    @Override // B4.InterfaceC0140b
    public void i(Dialog dialog) {
        SquatterActivity squatterActivity = (SquatterActivity) this.f20442c;
        if (dialog != null) {
            dialog.dismiss();
        }
        try {
            squatterActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://" + ((String) this.f20441b))));
        } catch (ActivityNotFoundException unused) {
            F4.d.b(squatterActivity, squatterActivity.getString(R.string.open_web_failed));
        }
    }

    @Override // G0.a
    public G0.b j(s sVar) {
        return new x((Context) sVar.f123b, (String) this.f20441b, ((C0.s) sVar.f125d).f1100a, ((G0.a) this.f20442c).j(sVar));
    }

    public void k(boolean z6) {
        K k6 = (K) this.f20442c;
        AbstractActivityC2349g abstractActivityC2349g = k6.f21522u.f21726j;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = k6.f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            abstractComponentCallbacksC2617v.p().f21514m.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
            }
        }
    }

    public void l(boolean z6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = ((K) this.f20442c).f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            abstractComponentCallbacksC2617v.p().f21514m.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
            }
        }
    }

    @Override // B4.InterfaceC0140b
    public void m(Dialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // e4.d
    public void n(C0207i c0207i) {
        c0207i.a((SplashActivity) this.f20441b, (C2781h) this.f20442c);
    }

    public void o(boolean z6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = ((K) this.f20442c).f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            abstractComponentCallbacksC2617v.p().f21514m.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
            }
        }
    }

    public void p(boolean z6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = ((K) this.f20442c).f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            abstractComponentCallbacksC2617v.p().f21514m.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
            }
        }
    }

    public void q(boolean z6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = ((K) this.f20442c).f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            abstractComponentCallbacksC2617v.p().f21514m.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
            }
        }
    }

    public void r(boolean z6) {
        K k6 = (K) this.f20442c;
        AbstractActivityC2349g abstractActivityC2349g = k6.f21522u.f21726j;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = k6.f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            abstractComponentCallbacksC2617v.p().f21514m.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
            }
        }
    }

    public void s(boolean z6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = ((K) this.f20442c).f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            abstractComponentCallbacksC2617v.p().f21514m.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
            }
        }
    }

    public void t(boolean z6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = ((K) this.f20442c).f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            abstractComponentCallbacksC2617v.p().f21514m.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
            }
        }
    }

    public String toString() {
        switch (this.f20440a) {
            case 10:
                return "Bounds{lower=" + ((J.c) this.f20441b) + " upper=" + ((J.c) this.f20442c) + "}";
            case 27:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C2755c c2755c = (C2755c) this.f20441b;
                C2755c c2755c2 = c2755c.f22673c;
                boolean z6 = false;
                while (!c2755c2.equals(c2755c)) {
                    sb.append('{');
                    sb.append(c2755c2.f22671a);
                    sb.append(':');
                    ArrayList arrayList = c2755c2.f22672b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c2755c2 = c2755c2.f22673c;
                    z6 = true;
                }
                if (z6) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(boolean z6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = ((K) this.f20442c).f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            abstractComponentCallbacksC2617v.p().f21514m.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
            }
        }
    }

    public void v(boolean z6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = ((K) this.f20442c).f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            abstractComponentCallbacksC2617v.p().f21514m.v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
            }
        }
    }

    public void w(boolean z6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = ((K) this.f20442c).f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            abstractComponentCallbacksC2617v.p().f21514m.w(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
            }
        }
    }

    public void x(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v, View view, boolean z6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = ((K) this.f20442c).f21524w;
        if (abstractComponentCallbacksC2617v2 != null) {
            abstractComponentCallbacksC2617v2.p().f21514m.x(abstractComponentCallbacksC2617v, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
                K k6 = (K) this.f20442c;
                if (abstractComponentCallbacksC2617v == ((AbstractComponentCallbacksC2617v) hVar.f3875b)) {
                    C2351a c2351a = k6.f21514m;
                    synchronized (((CopyOnWriteArrayList) c2351a.f20441b)) {
                        try {
                            int size = ((CopyOnWriteArrayList) c2351a.f20441b).size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                }
                                if (((B) ((CopyOnWriteArrayList) c2351a.f20441b).get(i)).f21475a == hVar) {
                                    ((CopyOnWriteArrayList) c2351a.f20441b).remove(i);
                                    break;
                                }
                                i++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    m.a(view, (FrameLayout) hVar.f3876c);
                } else {
                    continue;
                }
            }
        }
    }

    public void y(boolean z6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = ((K) this.f20442c).f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            abstractComponentCallbacksC2617v.p().f21514m.y(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f20441b).iterator();
        while (it.hasNext()) {
            B b5 = (B) it.next();
            if (z6) {
                b5.getClass();
            } else {
                V2.h hVar = b5.f21475a;
            }
        }
    }

    public void z(int i) {
        int[] iArr = (int[]) this.f20441b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f20441b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f20441b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f20441b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public /* synthetic */ C2351a(int i, boolean z6) {
        this.f20440a = i;
    }

    public /* synthetic */ C2351a(Object obj, int i, Object obj2) {
        this.f20440a = i;
        this.f20441b = obj;
        this.f20442c = obj2;
    }

    public /* synthetic */ C2351a(Object obj, Object obj2, int i, boolean z6) {
        this.f20440a = i;
        this.f20442c = obj;
        this.f20441b = obj2;
    }

    public C2351a(W3.f fVar) {
        this.f20440a = 13;
        this.f20442c = new Handler(Looper.getMainLooper());
        this.f20441b = fVar;
    }

    public C2351a(String str, T2.g gVar, C0152f c0152f) {
        this.f20440a = 4;
        this.f20442c = str;
        this.f20441b = gVar;
    }

    public C2351a(int i) {
        this.f20440a = i;
        switch (i) {
            case 8:
                J2.e eVar = J2.e.f2057d;
                this.f20441b = new SparseIntArray();
                this.f20442c = eVar;
                break;
            case 18:
                this.f20441b = new ArrayList();
                this.f20442c = new ArrayList();
                break;
            case 27:
                this.f20441b = new C2755c(null);
                this.f20442c = new HashMap();
                break;
            case 28:
                this.f20441b = new H1.l(0, 1000L);
                this.f20442c = I1.c.a(10, new p1.e(0));
                break;
            default:
                this.f20441b = new ArrayList();
                this.f20442c = new HashMap();
                break;
        }
    }

    public C2351a(WorkDatabase_Impl workDatabase_Impl, int i) {
        this.f20440a = i;
        switch (i) {
            case 23:
                this.f20441b = workDatabase_Impl;
                this.f20442c = new L4.b(workDatabase_Impl, 10);
                break;
            default:
                this.f20441b = workDatabase_Impl;
                this.f20442c = new L4.b(workDatabase_Impl, 7);
                break;
        }
    }

    public C2351a(LinearLayout linearLayout, RecyclerView recyclerView, MaterialButton materialButton) {
        this.f20440a = 5;
        this.f20441b = linearLayout;
        this.f20442c = materialButton;
    }

    public C2351a(K k6) {
        this.f20440a = 26;
        this.f20441b = new CopyOnWriteArrayList();
        this.f20442c = k6;
    }

    public C2351a(EditText editText) {
        this.f20440a = 0;
        this.f20441b = editText;
        k kVar = new k(editText);
        this.f20442c = kVar;
        editText.addTextChangedListener(kVar);
        if (C2353c.f20446b == null) {
            synchronized (C2353c.f20445a) {
                try {
                    if (C2353c.f20446b == null) {
                        C2353c c2353c = new C2353c();
                        try {
                            C2353c.f20447c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C2353c.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C2353c.f20446b = c2353c;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C2353c.f20446b);
    }
}
