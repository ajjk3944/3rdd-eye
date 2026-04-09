package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg0 implements qg0, p81, n40, m00, ua.d, bl0, ep0, c80, lr0, OnCompleteListener, jy0, ll1, l31, rd0, ox1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15650a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15651b;

    public rg0(int i4) {
        this.f15650a = i4;
        switch (i4) {
            case 23:
                this.f15651b = e51.r(new Object[]{1, 5}, 2);
                break;
            default:
                this.f15651b = new int[2];
                break;
        }
    }

    public static rg0 k(y21 y21Var) {
        return new rg0(19, new kh0(13, y21Var));
    }

    private final void m() {
        xk0 xk0Var = (xk0) this.f15651b;
        synchronized (xk0Var) {
            xk0Var.j = null;
        }
    }

    private final /* synthetic */ void q(o40 o40Var) {
        xk0 xk0Var = (xk0) this.f15651b;
        b90 b90Var = (b90) o40Var;
        synchronized (xk0Var) {
            xk0Var.j = b90Var;
            b90Var.a();
        }
    }

    @Override // ua.d
    public void a() {
        ((e60) ((s10) this.f15651b).T.a()).onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.l31
    public /* synthetic */ Object b() {
        return (b) this.f15651b;
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public int c(Object obj) {
        ex1 ex1Var = (ex1) obj;
        HashMap map = px1.f15143a;
        mx1 mx1Var = (mx1) this.f15651b;
        String str = ex1Var.f10905b;
        return ((str.equals(mx1Var.f14052m) || str.equals(px1.d(mx1Var))) && ex1Var.f(mx1Var, false) && ex1Var.g(mx1Var)) ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.ep0
    public /* synthetic */ m10 d(dp0 dp0Var) {
        return ((po0) this.f15651b).b(dp0Var);
    }

    @Override // com.google.android.gms.internal.ads.jy0
    public /* synthetic */ void e(Object obj, FileOutputStream fileOutputStream) {
        ((qm1) obj).c(fileOutputStream);
    }

    @Override // com.google.android.gms.internal.ads.jy0
    public Object f(FileInputStream fileInputStream) throws ao1 {
        try {
            po1 po1VarO = ((qn1) ((qm1) this.f15651b)).o();
            jn1 jn1Var = jn1.f12801a;
            int i4 = um1.f17262a;
            jn1 jn1Var2 = jn1.f12802b;
            pn1 pn1Var = (pn1) po1VarO;
            pn1Var.getClass();
            dn1 dn1Var = new dn1(fileInputStream);
            qn1 qn1VarL = qn1.l(pn1Var.f15055a, dn1Var, jn1Var2);
            dn1Var.i(0);
            if (qn1.x(qn1VarL, true)) {
                return qn1VarL;
            }
            throw new ao1(new cp1().getMessage());
        } catch (ao1 e2) {
            throw new hy0("Cannot read proto.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ll1
    public Object g(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            try {
                return ((nl1) this.f15651b).g(str, (Provider) obj);
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        switch (this.f15650a) {
            case 1:
                try {
                    ((lr0) this.f15651b).mo170c((SQLiteDatabase) obj);
                    return;
                } catch (Exception e2) {
                    za.i.e("Error executing function on offline signal database: ".concat(String.valueOf(e2.getMessage())));
                    return;
                }
            case 12:
                it0 it0Var = (it0) this.f15651b;
                synchronized (it0Var) {
                    try {
                        it0Var.f12437m.set(false);
                        if (obj != null) {
                            it0Var.f12435k.a();
                            it0Var.f12441q.set(true);
                            it0Var.b(obj);
                        }
                        if (obj == null || it0Var.f12432f == null) {
                            it0Var.c(obj == null);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                ((f21) this.f15651b).c();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public void i(o40 o40Var) {
        switch (this.f15650a) {
            case 5:
                q(o40Var);
                return;
            default:
                sp0 sp0Var = (sp0) this.f15651b;
                oc0 oc0Var = (oc0) o40Var;
                synchronized (sp0Var) {
                    try {
                        sp0Var.j = oc0Var;
                        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16193k4)).booleanValue()) {
                            oc0Var.f14665u.f11255a = sp0Var.f16505e;
                        }
                        sp0Var.j.a();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public /* synthetic */ vd.b j(iu iuVar) {
        return ((xg0) ((cs1) ((pq0) this.f15651b).f15075d).a()).j4(iuVar.f12479h);
    }

    public JSONObject l(View view) {
        if (view == null) {
            return uu0.a(0, 0, 0, 0);
        }
        int[] iArr = (int[]) this.f15651b;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return uu0.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        switch (this.f15650a) {
            case 1:
                za.i.e("Failed to get offline signal database: ".concat(String.valueOf(th2.getMessage())));
                return;
            case 12:
                it0 it0Var = (it0) this.f15651b;
                synchronized (it0Var) {
                    try {
                        it0Var.f12437m.set(false);
                        if ((th2 instanceof ft0) && ((ft0) th2).f11257a == 0) {
                            throw null;
                        }
                        it0Var.c(true);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            default:
                f21 f21Var = (f21) this.f15651b;
                f21Var.b(th2);
                f21Var.c();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        ox0 ox0Var = (ox0) this.f15651b;
        if (task.isCanceled()) {
            ox0Var.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            ox0Var.e(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            throw new IllegalStateException();
        }
        ox0Var.f(exception);
    }

    @Override // com.google.android.gms.internal.ads.m00
    public /* synthetic */ void p(String str, int i4, String str2, boolean z3) {
        qz qzVar = (qz) this.f15651b;
        qzVar.R0();
        qzVar.X().G();
    }

    public List r(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itM = ((k31) this.f15651b).m(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            j31 j31Var = (j31) itM;
            if (!j31Var.hasNext()) {
                return DesugarCollections.unmodifiableList(arrayList);
            }
            arrayList.add((String) j31Var.next());
        }
    }

    public void s(int i4, Object obj, xo1 xo1Var) {
        hn1 hn1Var = (hn1) this.f15651b;
        qm1 qm1Var = (qm1) obj;
        hn1Var.M(i4, 2);
        hn1Var.b0(qm1Var.d(xo1Var));
        xo1Var.h(qm1Var, this);
    }

    @Override // com.google.android.gms.internal.ads.jy0
    public /* synthetic */ Object zzc() {
        return (qm1) this.f15651b;
    }

    @Override // com.google.android.gms.internal.ads.n40
    /* renamed from: b */
    public va.a2 mo165b() throws kq0 {
        try {
            return ((is) ((ci0) this.f15651b).f10135b).z1();
        } catch (RemoteException e2) {
            throw new kq0(e2);
        }
    }

    @Override // ua.d
    /* renamed from: zzc, reason: collision with other method in class */
    public void mo171zzc() {
        s10 s10Var = (s10) this.f15651b;
        ((o60) s10Var.P.a()).a();
        u80 u80Var = (u80) s10Var.V.a();
        synchronized (u80Var) {
            u80Var.p1(h80.j);
        }
    }

    public /* synthetic */ rg0(int i4, Object obj) {
        this.f15650a = i4;
        this.f15651b = obj;
    }

    @Override // com.google.android.gms.internal.ads.bl0
    /* renamed from: b */
    public void mo167b() {
        switch (this.f15650a) {
            case 5:
                m();
                return;
            default:
                sp0 sp0Var = (sp0) this.f15651b;
                synchronized (sp0Var) {
                    sp0Var.j = null;
                }
                return;
        }
    }

    public /* synthetic */ rg0(int i4, Object obj, Object obj2) {
        this.f15650a = i4;
        this.f15651b = obj2;
    }

    @Override // com.google.android.gms.internal.ads.lr0
    /* renamed from: c, reason: collision with other method in class */
    public /* synthetic */ Object mo170c(Object obj) {
        if (((Boolean) ol.f14724c.u()).booleanValue()) {
            ((yr0) this.f15651b).b();
        }
        return obj;
    }

    public /* synthetic */ rg0(qu1 qu1Var, Object obj, long j) {
        this.f15650a = 24;
        this.f15651b = obj;
    }

    public rg0(Matcher matcher) {
        this.f15650a = 18;
        matcher.getClass();
        this.f15651b = matcher;
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public void mo162c(Object obj) {
        switch (this.f15650a) {
            case 10:
                pr0 pr0Var = (pr0) this.f15651b;
                ((tr0) obj).p((qr0) pr0Var.f15079a, pr0Var.f15080b);
                break;
            default:
                ((ru1) obj).H1();
                break;
        }
    }

    public rg0(g21 g21Var, f21 f21Var) {
        this.f15650a = 17;
        this.f15651b = f21Var;
        Objects.requireNonNull(g21Var);
    }

    public rg0(hn1 hn1Var) {
        this.f15650a = 21;
        Charset charset = yn1.f18811a;
        if (hn1Var == null) {
            throw new NullPointerException("output");
        }
        this.f15651b = hn1Var;
        hn1Var.f11929b = this;
    }

    @Override // ua.d
    public void o(View view) {
    }
}
