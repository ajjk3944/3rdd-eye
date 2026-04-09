package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class vq2 implements ul0, kk1, eo1, f41, ad0, ws2, iq3 {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public /* synthetic */ vq2(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.ad0
    public void C(r2 r2Var) {
        try {
            String canonicalName = ((f3) this.h).getClass().getCanonicalName();
            int i = r2Var.g;
            String str = (String) r2Var.h;
            String str2 = (String) r2Var.i;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(i);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            gi2.U(sb.toString());
            z62 z62Var = (z62) this.g;
            z62Var.K0(r2Var.d());
            z62Var.w0(str, i);
            z62Var.m0(i);
        } catch (RemoteException e) {
            gi2.c0("", e);
        }
    }

    @Override // defpackage.eu2
    /* renamed from: a */
    public Object mo18a() {
        aa2 aa2Var = (aa2) ((ls2) this.g).mo18a();
        Handler handler = ok2.a;
        pu1.s(handler);
        return new u82(aa2Var, handler, ((bu1) this.h).p());
    }

    @Override // defpackage.ul0
    public void b(Preference preference) {
        ((PreferenceGroup) this.g).X = Integer.MAX_VALUE;
        em0 em0Var = (em0) this.h;
        Handler handler = em0Var.m;
        a9 a9Var = em0Var.n;
        handler.removeCallbacks(a9Var);
        handler.post(a9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0271 A[LOOP:0: B:160:0x0012->B:149:0x0271, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0291 A[EDGE_INSN: B:181:0x0291->B:150:0x0291 BREAK  A[LOOP:0: B:160:0x0012->B:149:0x0271], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.ho1 c(defpackage.jo1 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq2.c(jo1):ho1");
    }

    public kj1 d() {
        boolean z = true;
        if (!zt0.E() && !((ArrayList) this.g).contains(gi2.B((Context) this.h))) {
            z = false;
        }
        return new kj1(z, this);
    }

    public Bundle e(String str) {
        zs0 zs0Var = (zs0) this.g;
        if (!zs0Var.g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = zs0Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleN = bundle.containsKey(str) ? m54.n(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            zs0Var.f = null;
        }
        return bundleN;
    }

    public View f(int i, int i2, int i3, int i4) {
        m51 m51Var = (m51) this.h;
        n51 n51Var = (n51) this.g;
        int iJ = n51Var.J();
        int iL = n51Var.l();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewH = n51Var.H(i);
            int iR = n51Var.r(viewH);
            int iR2 = n51Var.R(viewH);
            m51Var.b = iJ;
            m51Var.c = iL;
            m51Var.d = iR;
            m51Var.e = iR2;
            if (i3 != 0) {
                m51Var.a = i3;
                if (m51Var.a()) {
                    return viewH;
                }
            }
            if (i4 != 0) {
                m51Var.a = i4;
                if (m51Var.a()) {
                    view = viewH;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x03ab, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [int] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.kk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(byte[] r19, int r20, int r21, defpackage.lk1 r22) throws defpackage.lq1 {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq2.g(byte[], int, int, lk1):void");
    }

    public ys0 h() {
        ys0 ys0Var;
        zs0 zs0Var = (zs0) this.g;
        synchronized (zs0Var.c) {
            Iterator it = zs0Var.d.entrySet().iterator();
            do {
                ys0Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                ys0 ys0Var2 = (ys0) entry.getValue();
                if (i30.c(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    ys0Var = ys0Var2;
                }
            } while (ys0Var == null);
        }
        return ys0Var;
    }

    public Object i(k90 k90Var) {
        return (cw0) this.h;
    }

    public Object j(float f, float f2, Object obj, Object obj2, float f3, float f4, float f5) {
        k90 k90Var = (k90) this.g;
        k90Var.a = f;
        k90Var.b = f2;
        k90Var.f = obj;
        k90Var.g = obj2;
        k90Var.c = f3;
        k90Var.d = f4;
        k90Var.e = f5;
        return i(k90Var);
    }

    @Override // defpackage.f41
    public void k(bw1 bw1Var) {
        bw1Var.a((i5) this.g, (lz) this.h);
    }

    public void l(tn0 tn0Var) {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            ((ArrayList) this.g).add(tn0Var);
            return;
        }
        mb1 mb1Var = (mb1) arrayList.get(arrayList.size() - 1);
        if (mb1Var.a.isEmpty()) {
            mb1Var.b.add(tn0Var);
        } else {
            mb1Var.a.add(tn0Var);
        }
    }

    public boolean m(View view) {
        m51 m51Var = (m51) this.h;
        n51 n51Var = (n51) this.g;
        int iJ = n51Var.J();
        int iL = n51Var.l();
        int iR = n51Var.r(view);
        int iR2 = n51Var.R(view);
        m51Var.b = iJ;
        m51Var.c = iL;
        m51Var.d = iR;
        m51Var.e = iR2;
        m51Var.a = 24579;
        return m51Var.a();
    }

    public void n(c2 c2Var) {
        p21 p21Var = (p21) this.g;
        ((ActionMode.Callback) p21Var.f).onDestroyActionMode(p21Var.k(c2Var));
        h6 h6Var = (h6) this.h;
        if (h6Var.B != null) {
            h6Var.q.getDecorView().removeCallbacks(h6Var.C);
        }
        if (h6Var.A != null) {
            w61 w61Var = h6Var.D;
            if (w61Var != null) {
                w61Var.b();
            }
            w61 w61VarA = e61.a(h6Var.A);
            w61VarA.a(0.0f);
            h6Var.D = w61VarA;
            w61VarA.d(new w5(2, this));
        }
        h6Var.z = null;
        ViewGroup viewGroup = h6Var.F;
        WeakHashMap weakHashMap = e61.a;
        r51.c(viewGroup);
        h6Var.I();
    }

    public boolean o(c2 c2Var, Menu menu) {
        ViewGroup viewGroup = ((h6) this.h).F;
        WeakHashMap weakHashMap = e61.a;
        r51.c(viewGroup);
        p21 p21Var = (p21) this.g;
        ActionMode.Callback callback = (ActionMode.Callback) p21Var.f;
        dz0 dz0VarK = p21Var.k(c2Var);
        bw0 bw0Var = (bw0) p21Var.i;
        Menu ie0Var = (Menu) bw0Var.get(menu);
        if (ie0Var == null) {
            ie0Var = new ie0((Context) p21Var.g, (od0) menu);
            bw0Var.put(menu, ie0Var);
        }
        return callback.onPrepareActionMode(dz0VarK, ie0Var);
    }

    @Override // defpackage.iq3
    public void p(Object obj) {
        switch (this.f) {
            case 26:
                ((td2) this.g).mo14c(obj);
                break;
            case 27:
            default:
                List list = ((hl2) obj).a;
                g4 g4Var = (g4) this.g;
                kl2 kl2Var = (kl2) this.h;
                Executor executor = kl2Var.a;
                if (list != null && !list.isEmpty()) {
                    n70 n70VarO = lq3.g;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        n70VarO = pu1.O(pu1.L(n70VarO, Throwable.class, new u42(3, g4Var), executor), new op1(kl2Var, g4Var, (n70) it.next(), 1), executor);
                    }
                    n70VarO.c(new jq3(n70VarO, new gw3(kl2Var, g4Var), 0), executor);
                    break;
                } else {
                    executor.execute(new jl2(g4Var, 0));
                    break;
                }
                break;
            case 28:
                String str = (String) this.g;
                String str2 = (String) obj;
                nj2 nj2Var = (nj2) this.h;
                nj2Var.m.a(nj2Var.l.b(nj2Var.j, nj2Var.k, false, str, str2, nj2Var.p(), nj2Var.t), nj2Var.s);
                break;
        }
    }

    public void q(String str, ys0 ys0Var) {
        i30.m(ys0Var, "provider");
        zs0 zs0Var = (zs0) this.g;
        synchronized (zs0Var.c) {
            if (zs0Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            zs0Var.d.put(str, ys0Var);
        }
    }

    public void r() {
        if (!((zs0) this.g).h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        g5 g5Var = (g5) this.h;
        if (g5Var == null) {
            g5Var = new g5(this);
        }
        this.h = g5Var;
        try {
            j50.class.getDeclaredConstructor(null);
            g5 g5Var2 = (g5) this.h;
            if (g5Var2 != null) {
                ((LinkedHashSet) g5Var2.b).add(j50.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + j50.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        switch (this.f) {
            case 26:
                ((rd2) this.h).mo8a();
                break;
            case 27:
            default:
                ((g4) this.g).s(th);
                kl2 kl2Var = (kl2) this.h;
                kl2Var.getClass();
                md2.f.execute(new fu1(24, kl2Var));
                break;
            case 28:
                nj2 nj2Var = (nj2) this.h;
                nj2Var.m.a(nj2Var.l.b(nj2Var.j, nj2Var.k, false, (String) this.g, null, nj2Var.p(), nj2Var.t), null);
                break;
        }
    }

    public void t() {
        Object parcelable;
        Integer num;
        bh bhVar = (bh) this.g;
        String str = (String) this.h;
        Bundle bundle = bhVar.g;
        LinkedHashMap linkedHashMap = bhVar.f;
        i30.m(str, "key");
        if (!bhVar.d.contains(str) && (num = (Integer) bhVar.b.remove(str)) != null) {
            bhVar.a.remove(num);
        }
        bhVar.e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = ic.a(bundle, str, l2.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!l2.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Objects.toString((l2) parcelable);
            bundle.remove(str);
        }
        if (bhVar.c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    public String toString() {
        switch (this.f) {
            case 15:
                return "Bounds{lower=" + ((y20) this.g) + " upper=" + ((y20) this.h) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ vq2(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    public /* synthetic */ vq2(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj2;
        this.h = obj3;
    }

    public vq2(us0 us0Var) {
        this.f = 21;
        so1 so1Var = new so1(0, false);
        this.g = us0Var;
        this.h = so1Var;
    }

    public /* synthetic */ vq2(md1 md1Var) {
        this.f = 18;
        this.h = md1Var;
    }

    public vq2(tz1 tz1Var) {
        this.f = 22;
        this.h = tz1Var;
        this.g = new HashMap();
    }

    public vq2(th2 th2Var, Context context, String str) {
        this.f = 27;
        da4 da4VarA = da4.a(context);
        ba4 ba4Var = th2Var.I0;
        l73 l73Var = new l73(da4VarA, ba4Var, th2Var.J0, 1);
        ba4 ba4VarA = ba4.a(new u43(ba4Var, 7));
        ba4 ba4VarA2 = ba4.a(yc0.k);
        ba4 ba4VarA3 = ba4.a(new ar2(da4VarA, th2Var.c, th2Var.D, (ca4) l73Var, ba4VarA, (ga4) ba4VarA2, 8));
        this.g = ba4.a(new dz1(ba4VarA3, ba4VarA, ba4VarA2, 1));
        this.h = ba4.a(new es2(da4.b(str), ba4VarA3, da4VarA, ba4VarA, ba4VarA2, th2Var.h, th2Var.E, th2Var.j));
    }

    public vq2(MainActivity mainActivity) throws IOException {
        File parentFile;
        this.f = 11;
        ah0 ah0Var = new ah0(mainActivity, "nic4.db", null, 1);
        if (!new File(mainActivity.getDatabasePath("nic4.db").getPath()).exists()) {
            File file = new File(mainActivity.getDatabasePath("nic4.db").getPath());
            if (!file.exists() && (parentFile = file.getParentFile()) != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            InputStream inputStreamOpen = mainActivity.getAssets().open("nic4.db");
            i30.l(inputStreamOpen, "open(...)");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            for (int i = inputStreamOpen.read(bArr); i >= 0; i = inputStreamOpen.read(bArr)) {
                fileOutputStream.write(bArr, 0, i);
            }
            inputStreamOpen.close();
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        this.g = ah0Var;
    }

    public vq2(zs0 zs0Var) {
        this.f = 13;
        this.g = zs0Var;
    }

    public vq2(bh bhVar, String str, yb ybVar) {
        this.f = 1;
        this.g = bhVar;
        this.h = str;
    }

    public vq2(cw0 cw0Var) {
        this.f = 10;
        this.g = new k90();
        this.h = cw0Var;
    }

    public vq2(Context context, int i) throws Resources.NotFoundException {
        this.f = i;
        switch (i) {
            case 5:
                this.g = new ArrayList();
                this.h = context.getApplicationContext();
                break;
            default:
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(qb1.p(R.attr.materialCalendarStyle, context, cc0.class.getCanonicalName()).data, gn0.u);
                pz.g(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
                pz.g(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
                pz.g(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
                pz.g(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
                ColorStateList colorStateListE = ob1.e(context, typedArrayObtainStyledAttributes, 7);
                this.g = pz.g(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
                pz.g(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
                this.h = pz.g(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(colorStateListE.getDefaultColor());
                typedArrayObtainStyledAttributes.recycle();
                break;
        }
    }

    public vq2(n51 n51Var) {
        this.f = 14;
        this.g = n51Var;
        m51 m51Var = new m51();
        m51Var.a = 0;
        this.h = m51Var;
    }

    public vq2(ArrayList arrayList, ArrayList arrayList2) {
        this.f = 9;
        int size = arrayList.size();
        this.g = new int[size];
        this.h = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.g)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.h)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public vq2(int i, int i2) {
        this.f = 9;
        this.g = new int[]{i, i2};
        this.h = new float[]{0.0f, 1.0f};
    }

    public vq2(int i) {
        this.f = i;
        switch (i) {
            case 6:
                this.g = new kh0();
                this.h = new nh0();
                break;
            case 10:
                this.g = new k90();
                this.h = null;
                break;
            case 16:
                break;
            case 17:
                fz fzVar = fz.d;
                this.g = new SparseIntArray();
                this.h = fzVar;
                break;
            case 20:
                this.g = new kz2();
                this.h = new nl1();
                break;
            default:
                this.g = Choreographer.getInstance();
                this.h = Looper.myLooper();
                break;
        }
    }

    public vq2(int i, int i2, int i3) {
        this.f = 9;
        this.g = new int[]{i, i2, i3};
        this.h = new float[]{0.0f, 0.5f, 1.0f};
    }

    public vq2(EditText editText) {
        this.f = 7;
        this.g = editText;
        hs hsVar = new hs(editText);
        this.h = hsVar;
        editText.addTextChangedListener(hsVar);
        if (wr.b == null) {
            synchronized (wr.a) {
                try {
                    if (wr.b == null) {
                        wr wrVar = new wr();
                        try {
                            wr.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, wr.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        wr.b = wrVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(wr.b);
    }
}
