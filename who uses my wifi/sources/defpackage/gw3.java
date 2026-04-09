package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase_Impl;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class gw3 implements kw3, ld, cs, pl0, dj0, af1, vo1, t9, hh3, iq3, q12 {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public /* synthetic */ gw3(int i, Object obj) {
        this.f = i;
        this.g = null;
        this.h = obj;
    }

    public static gw3 D(qz3 qz3Var) {
        return new gw3(qz3Var, ow3.a(qz3Var.A()), 0);
    }

    public static int q(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public void A(wo0 wo0Var) {
        l61 l61Var = (l61) ((bw0) this.g).get(wo0Var);
        if (l61Var == null) {
            return;
        }
        l61Var.a &= -2;
    }

    public void B(wo0 wo0Var) {
        l80 l80Var = (l80) this.h;
        int iF = l80Var.f() - 1;
        while (true) {
            if (iF < 0) {
                break;
            }
            if (wo0Var == l80Var.g(iF)) {
                Object[] objArr = l80Var.h;
                Object obj = objArr[iF];
                Object obj2 = yb.l;
                if (obj != obj2) {
                    objArr[iF] = obj2;
                    l80Var.f = true;
                }
            } else {
                iF--;
            }
        }
        l61 l61Var = (l61) ((bw0) this.g).remove(wo0Var);
        if (l61Var != null) {
            l61Var.a = 0;
            l61Var.b = null;
            l61Var.c = null;
            l61.d.c(l61Var);
        }
    }

    public void C(boolean z) {
        hs hsVar = (hs) ((vq2) ((z71) this.h).g).h;
        if (hsVar.h != z) {
            if (hsVar.g != null) {
                rr rrVarA = rr.a();
                gs gsVar = hsVar.g;
                rrVarA.getClass();
                pu1.i(gsVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = rrVarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    rrVarA.b.remove(gsVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            hsVar.h = z;
            if (z) {
                hs.a(hsVar.f, rr.a().b());
            }
        }
    }

    public void F(t82 t82Var) {
        Handler handler = (Handler) this.g;
        if (handler != null) {
            handler.post(new jq3(this, t82Var, 20));
        }
    }

    public void G(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", (String) this.h);
            ag2 ag2Var = (ag2) this.g;
            if (ag2Var != null) {
                ag2Var.c("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            gi2.c0("Error occurred while dispatching error event.", e);
        }
    }

    public void H(int i, int i2, int i3, int i4) throws JSONException {
        try {
            ((ag2) this.g).c("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            gi2.c0("Error occurred while dispatching size change.", e);
        }
    }

    public void I(String str) throws JSONException {
        try {
            ((ag2) this.g).c("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            gi2.c0("Error occurred while dispatching state change.", e);
        }
    }

    public void J(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            ((ag2) this.g).c("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            gi2.c0("Error occurred while obtaining screen information.", e);
        }
    }

    @Override // defpackage.t9
    public void T(int i) {
        ((pd2) this.g).b(new RuntimeException(ex0.j(new StringBuilder(String.valueOf(i).length() + 23), "onConnectionSuspended: ", i)));
    }

    @Override // defpackage.t9
    public void Y() {
        try {
            ((pd2) this.g).a((s42) ((vw1) ((ij) this.h).f).t());
        } catch (DeadObjectException e) {
            ((pd2) this.g).b(e);
        }
    }

    @Override // defpackage.vo1
    public File a() {
        if (((File) this.g) == null) {
            this.g = new File(((Context) this.h).getCacheDir(), "volley");
        }
        return (File) this.g;
    }

    @Override // defpackage.cs
    public Object b() {
        return (c41) this.g;
    }

    @Override // defpackage.af1
    public void d() {
        byte[] bArr = v23.b;
        int length = bArr.length;
        ((kz2) this.h).z(0, bArr);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnTouchListener, hv1] */
    @Override // defpackage.q12
    public void e(MotionEvent motionEvent) {
        ((hv1) this.g).onTouch(null, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b A[EDGE_INSN: B:67:0x011b->B:51:0x011b BREAK  A[LOOP:1: B:39:0x00e4->B:50:0x010a], SYNTHETIC] */
    @Override // defpackage.af1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.ze1 f(defpackage.mf1 r17, long r18) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw3.f(mf1, long):ze1");
    }

    @Override // defpackage.cs
    public boolean g(CharSequence charSequence, int i, int i2, q31 q31Var) {
        if ((q31Var.c & 4) > 0) {
            return true;
        }
        if (((c41) this.g) == null) {
            this.g = new c41(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((fr) this.h).getClass();
        ((c41) this.g).setSpan(new r31(q31Var), i, i2, 33);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hv1, rs2] */
    @Override // defpackage.q12
    /* renamed from: h */
    public JSONObject mo20h() {
        return ((hv1) this.g).q();
    }

    @Override // defpackage.dj0
    public void i(gi4 gi4Var) {
        ((tb1) this.h).b.remove((k01) this.g);
    }

    @Override // defpackage.pl0
    public void j(ArrayList arrayList) {
        i30.m(arrayList, "openPorts");
        d10 d10Var = (d10) this.g;
        ArrayList arrayList2 = new ArrayList();
        d10Var.g = arrayList2;
        arrayList2.addAll(yf.o0(arrayList));
        ArrayList arrayList3 = d10Var.g;
        if (arrayList3 != null) {
            MainActivity mainActivity = (MainActivity) this.h;
            if (arrayList3.containsAll(zf.j0(631, 9100))) {
                d10Var.f = R.drawable.ic_outline_print_24;
                d10Var.a = ro.o;
                return;
            }
            if (arrayList3.contains(554)) {
                d10Var.f = R.drawable.ic_device_ip_camera;
                d10Var.a = ro.n;
                if (i30.c(d10Var.c, d10Var.b)) {
                    String string = mainActivity.getString(R.string.txt_camera);
                    i30.l(string, "getString(...)");
                    d10Var.c = string;
                    return;
                }
                String str = d10Var.c + " (" + mainActivity.getString(R.string.txt_camera) + ")";
                i30.m(str, "<set-?>");
                d10Var.c = str;
                return;
            }
            if (arrayList3.containsAll(zf.j0(22, 80, 443)) && !i30.c(d10Var.b, mainActivity.P)) {
                d10Var.a = ro.p;
                d10Var.f = R.drawable.ic_device_robot_vacuum_cleaner;
                if (i30.c(d10Var.c, d10Var.b)) {
                    String string2 = mainActivity.getString(R.string.txt_robot_vacuum_cleaner);
                    i30.l(string2, "getString(...)");
                    d10Var.c = string2;
                    return;
                }
                return;
            }
            if (!arrayList3.contains(80) || i30.c(d10Var.b, mainActivity.P)) {
                return;
            }
            d10Var.a = ro.i;
            d10Var.f = R.drawable.ic_access_point_24;
            if (i30.c(d10Var.c, mainActivity.getString(R.string.txt_generic))) {
                String string3 = mainActivity.getString(R.string.txt_access_point);
                i30.l(string3, "getString(...)");
                d10Var.c = string3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hv1, rs2] */
    @Override // defpackage.q12
    /* renamed from: l */
    public JSONObject mo21l() {
        return ((hv1) this.g).m();
    }

    public void m(Object obj, String str) {
        ((ArrayList) this.g).add(str + "=" + String.valueOf(obj));
    }

    public void n(wo0 wo0Var, tg0 tg0Var) {
        bw0 bw0Var = (bw0) this.g;
        l61 l61VarA = (l61) bw0Var.get(wo0Var);
        if (l61VarA == null) {
            l61VarA = l61.a();
            bw0Var.put(wo0Var, l61VarA);
        }
        l61VarA.c = tg0Var;
        l61VarA.a |= 8;
    }

    public KeyListener o(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((vq2) ((z71) this.h).g).getClass();
        if (keyListener instanceof bs) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new bs(keyListener);
    }

    @Override // defpackage.ld
    public void onCancel() {
        ((Animator) this.g).end();
        if (xw.F(2)) {
            Objects.toString((lx0) this.h);
        }
    }

    @Override // defpackage.iq3
    public /* synthetic */ void p(Object obj) {
        switch (this.f) {
            case 27:
                kl2 kl2Var = (kl2) this.h;
                kl2Var.getClass();
                md2.f.execute(new fu1(24, kl2Var));
                ((g4) this.g).p((el2) obj);
                break;
            default:
                ((ag2) obj).v0((String) this.g, (y32) this.h);
                break;
        }
    }

    public void r() {
        ((SparseIntArray) this.g).clear();
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        switch (this.f) {
            case 27:
                kl2 kl2Var = (kl2) this.h;
                kl2Var.getClass();
                md2.f.execute(new fu1(24, kl2Var));
                ((g4) this.g).s(th);
                break;
        }
    }

    public void t(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.g).getContext().obtainStyledAttributes(attributeSet, hn0.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            C(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public String toString() {
        switch (this.f) {
            case 11:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.h.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.g;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case 12:
                String str = "[ ";
                if (((fx0) this.g) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((fx0) this.g).m[i2] + " ";
                    }
                }
                return str + "] " + ((fx0) this.g);
            default:
                return super.toString();
        }
    }

    public yr u(InputConnection inputConnection, EditorInfo editorInfo) {
        z71 z71Var = (z71) this.h;
        if (inputConnection == null) {
            z71Var.getClass();
            inputConnection = null;
        } else {
            vq2 vq2Var = (vq2) z71Var.g;
            vq2Var.getClass();
            if (!(inputConnection instanceof yr)) {
                inputConnection = new yr((EditText) vq2Var.g, inputConnection, editorInfo);
            }
        }
        return (yr) inputConnection;
    }

    public void v(pv pvVar) {
        Handler handler = (Handler) this.h;
        f23 f23Var = (f23) this.g;
        int i = pvVar.b;
        if (i == 0) {
            handler.post(new jq3(f23Var, pvVar.a, 5));
        } else {
            handler.post(new cd(f23Var, i, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(android.content.Context r12, android.content.res.XmlResourceParser r13) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw3.w(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void x() {
        ((zs0) this.g).a();
    }

    public void y(Bundle bundle) {
        zs0 zs0Var = (zs0) this.g;
        Bundle bundleB = uk2.b((gk0[]) Arrays.copyOf(new gk0[0], 0));
        Bundle bundle2 = zs0Var.f;
        if (bundle2 != null) {
            bundleB.putAll(bundle2);
        }
        synchronized (zs0Var.c) {
            for (Map.Entry entry : zs0Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((ys0) entry.getValue()).a();
                i30.m(str, "key");
                bundleB.putBundle(str, bundleA);
            }
        }
        if (bundleB.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleB);
    }

    public tg0 z(wo0 wo0Var, int i) {
        l61 l61Var;
        tg0 tg0Var;
        bw0 bw0Var = (bw0) this.g;
        int iD = bw0Var.d(wo0Var);
        if (iD >= 0 && (l61Var = (l61) bw0Var.i(iD)) != null) {
            int i2 = l61Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                l61Var.a = i3;
                if (i == 4) {
                    tg0Var = l61Var.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    tg0Var = l61Var.c;
                }
                if ((i3 & 12) == 0) {
                    bw0Var.g(iD);
                    l61Var.a = 0;
                    l61Var.b = null;
                    l61Var.c = null;
                    l61.d.c(l61Var);
                }
                return tg0Var;
            }
        }
        return null;
    }

    public /* synthetic */ gw3(Object obj, Object obj2, int i) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    @Override // defpackage.hh3
    /* renamed from: a, reason: collision with other method in class */
    public /* synthetic */ th3 mo10a() {
        sf2 sf2Var = (sf2) this.g;
        th3 th3VarMo10a = ((hh3) this.h).mo10a();
        vg0 vg0Var = new vg0(17, sf2Var);
        return new nf2(sf2Var.f, th3VarMo10a, sf2Var.s, sf2Var.t, sf2Var, vg0Var);
    }

    public /* synthetic */ gw3(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, hv1, rs2] */
    @Override // defpackage.q12
    /* renamed from: a, reason: collision with other method in class */
    public void mo11a() {
        sn3 sn3Var = cs2.u;
        ?? r1 = (hv1) this.g;
        Map mapK = r1.k();
        if (mapK == null) {
            return;
        }
        int i = sn3Var.i;
        int i2 = 0;
        while (i2 < i) {
            Object obj = mapK.get((String) sn3Var.get(i2));
            i2++;
            if (obj != null) {
                r1.onClick((ViewGroup) this.h);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gw3(rs2 rs2Var, ViewGroup viewGroup) {
        this.f = 28;
        this.g = (hv1) rs2Var;
        this.h = viewGroup;
    }

    public gw3(int i) {
        this.f = i;
        switch (i) {
            case 9:
                this.g = new SparseIntArray();
                this.h = new SparseIntArray();
                break;
            case 14:
                this.g = new bw0(0);
                this.h = new l80();
                break;
            case 19:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.g = byteArrayOutputStream;
                this.h = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    public gw3(Handler handler, oa4 oa4Var) {
        this.f = 18;
        if (oa4Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.g = handler;
        this.h = oa4Var;
    }

    public /* synthetic */ gw3(Object obj) {
        this.f = 11;
        this.h = obj;
        this.g = new ArrayList();
    }

    public gw3(String str, qb1 qb1Var, pz pzVar) {
        this.f = 2;
        this.h = str;
        this.g = qb1Var;
    }

    public gw3(kl2 kl2Var, g4 g4Var) {
        this.f = 27;
        this.g = g4Var;
        Objects.requireNonNull(kl2Var);
        this.h = kl2Var;
    }

    public gw3(au2 au2Var, String str, y32 y32Var) {
        this.f = 29;
        this.g = str;
        this.h = y32Var;
    }

    public /* synthetic */ gw3(x13 x13Var) {
        this.f = 20;
        this.g = x13Var;
        this.h = new kz2();
    }

    public gw3(WorkDatabase_Impl workDatabase_Impl) {
        this.f = 15;
        this.g = workDatabase_Impl;
        this.h = new io(workDatabase_Impl, 3);
    }

    public gw3(zs0 zs0Var) {
        this.f = 13;
        this.g = zs0Var;
        this.h = new vq2(zs0Var);
    }

    public gw3(jm0 jm0Var) {
        this.f = 12;
        this.h = jm0Var;
    }

    public gw3(EditText editText) {
        this.f = 3;
        this.g = editText;
        this.h = new z71(editText);
    }

    public gw3(Animation animation) {
        this.f = 8;
        this.g = animation;
        this.h = null;
    }

    private final void E(Throwable th) {
    }

    @Override // defpackage.pl0
    public void k(int i, boolean z) {
    }
}
