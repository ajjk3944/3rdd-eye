package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class rt implements s6, ca, hx, y81, p81, c80, pm, vh0, f90, or0, h3.i, hf1 {

    /* renamed from: d, reason: collision with root package name */
    public static nw f15751d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15752a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15753b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15754c;

    public /* synthetic */ rt(int i4, Object obj, Object obj2) {
        this.f15752a = i4;
        this.f15753b = obj;
        this.f15754c = obj2;
    }

    public void A(String str) throws JSONException {
        try {
            ((qz) this.f15753b).h("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e2) {
            za.i.f("Error occurred while dispatching state change.", e2);
        }
    }

    public void B(int i4, int i10, int i11, int i12, float f10, int i13) {
        try {
            ((qz) this.f15753b).h("onScreenInfoChanged", new JSONObject().put("width", i4).put("height", i10).put("maxSizeWidth", i11).put("maxSizeHeight", i12).put("density", f10).put("rotation", i13));
        } catch (JSONException e2) {
            za.i.f("Error occurred while obtaining screen information.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public wp0 a() {
        return (wp0) this.f15754c;
    }

    @Override // com.google.android.gms.internal.ads.y81
    /* renamed from: b */
    public /* synthetic */ l91 mo168b() {
        AtomicInteger atomicInteger = fz.f11292u;
        l91 l91VarMo168b = ((y81) this.f15753b).mo168b();
        byte[] bArr = (byte[]) this.f15754c;
        return new dz(new t51(bArr), bArr.length, l91VarMo168b);
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public void mo162c(Object obj) {
        switch (this.f15752a) {
            case 12:
                ((j80) obj).f((String) this.f15753b, (String) this.f15754c);
                break;
            default:
                pr0 pr0Var = (pr0) this.f15753b;
                ((tr0) obj).b((qr0) pr0Var.f15079a, pr0Var.f15080b, (Throwable) this.f15754c);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x03ad, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03fb  */
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
    @Override // com.google.android.gms.internal.ads.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(byte[] r19, int r20, int r21, ca.c r22) throws com.google.android.gms.internal.ads.ua {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rt.d(byte[], int, int, ca.c):void");
    }

    @Override // com.google.android.gms.internal.ads.f90
    public void e(boolean z3, Context context, m60 m60Var) throws kq0, e90 {
        try {
            qq0 qq0Var = (qq0) ((ci0) this.f15753b).f10135b;
            qq0Var.b(z3);
            try {
                qq0Var.f15399a.I0(new vb.b(context));
            } catch (Throwable th2) {
                throw new kq0(th2);
            }
        } catch (kq0 e2) {
            throw new e90(e2.getCause());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    @Override // com.google.android.gms.internal.ads.pm
    public JSONObject f() {
        return ((mg) this.f15753b).E1();
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public byte[] g(int i4, byte[] bArr) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        switch (this.f15752a) {
            case 27:
                if (i4 > 16) {
                    throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
                }
                Provider provider = (Provider) this.f15754c;
                SecretKeySpec secretKeySpec = (SecretKeySpec) this.f15753b;
                Mac mac = Mac.getInstance("AESCMAC", provider);
                mac.init(secretKeySpec);
                byte[] bArrDoFinal = mac.doFinal(bArr);
                return i4 == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i4);
            default:
                return bArr.length <= 64 ? ((if1) this.f15753b).g(i4, bArr) : ((rt) this.f15754c).g(i4, bArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        Bundle bundle;
        switch (this.f15752a) {
            case 10:
                String str = (String) this.f15753b;
                String str2 = (String) obj;
                b30 b30Var = (b30) this.f15754c;
                b30Var.f9573h.a(b30Var.g.b(b30Var.f9571e, b30Var.f9572f, false, str, str2, b30Var.a(), b30Var.f9579o, b30Var.f9583s), b30Var.f9578n);
                return;
            case 11:
                List list = ((r40) obj).f15525a;
                r7 r7Var = (r7) this.f15753b;
                u40 u40Var = (u40) this.f15754c;
                Executor executor = u40Var.f17083a;
                if (list == null || list.isEmpty()) {
                    executor.execute(new t40(r7Var, 0));
                    return;
                }
                vd.b bVarF = s81.f15906b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bVarF = yo0.F(yo0.D(bVarF, Throwable.class, new fp(3, r7Var), executor), new s40(u40Var, r7Var, (vd.b) it.next(), 0), executor);
                }
                bVarF.a(new q81(0, bVarF, new l90(u40Var, r7Var)), executor);
                return;
            case 12:
            case 13:
            case 15:
            default:
                g gVar = (g) this.f15754c;
                synchronized (gVar) {
                    try {
                        gVar.f11328e = null;
                        ((ArrayDeque) gVar.f11327d).addFirst((uo0) this.f15753b);
                        if (gVar.f11324a == 1) {
                            gVar.e();
                        }
                    } finally {
                    }
                }
                return;
            case 14:
                ((qz) obj).Z((String) this.f15753b, (oo) this.f15754c);
                return;
            case 16:
                fu fuVar = (fu) this.f15754c;
                iu iuVar = (iu) this.f15753b;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                try {
                    pk pkVar = sk.B2;
                    va.s sVar = va.s.f36163e;
                    if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                        fuVar.a3(parcelFileDescriptor);
                        return;
                    }
                    if (((Boolean) sVar.f36166c.a(sk.C2)).booleanValue() && (bundle = iuVar.f12483m) != null) {
                        ua.j.C.f35267k.getClass();
                        bundle.putLong("binder-call-start", System.currentTimeMillis());
                    }
                    fuVar.d3(parcelFileDescriptor, iuVar);
                    return;
                } catch (RemoteException e2) {
                    ya.a0.n("Service can't call client", e2);
                    return;
                }
        }
    }

    @Override // h3.i
    public /* synthetic */ Object i(h3.h hVar) {
        x11.e((Context) this.f15753b, (sx0) this.f15754c, hVar);
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnTouchListener, com.google.android.gms.internal.ads.mg] */
    @Override // com.google.android.gms.internal.ads.pm
    public void j(MotionEvent motionEvent) {
        ((mg) this.f15753b).onTouch(null, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a2 A[LOOP:0: B:177:0x0012->B:155:0x02a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c2 A[EDGE_INSN: B:189:0x02c2->B:156:0x02c2 BREAK  A[LOOP:0: B:177:0x0012->B:155:0x02a2], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.ca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.fa l(com.google.android.gms.internal.ads.ha r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rt.l(com.google.android.gms.internal.ads.ha):com.google.android.gms.internal.ads.fa");
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        switch (this.f15752a) {
            case 10:
                b30 b30Var = (b30) this.f15754c;
                b30Var.f9573h.a(b30Var.g.b(b30Var.f9571e, b30Var.f9572f, false, (String) this.f15753b, null, b30Var.a(), b30Var.f9579o, b30Var.f9583s), null);
                return;
            case 11:
                ((r7) this.f15753b).n(th2);
                u40 u40Var = (u40) this.f15754c;
                u40Var.getClass();
                fx.f11279f.execute(new s30(1, u40Var));
                return;
            case 12:
            case 13:
            case 15:
            default:
                g gVar = (g) this.f15754c;
                synchronized (gVar) {
                    gVar.f11328e = null;
                }
                return;
            case 14:
                return;
            case 16:
                try {
                    fu fuVar = (fu) this.f15754c;
                    va.w1 w1VarI = yo0.i(th2);
                    fuVar.N2(new ya.l(yr1.k(th2.getMessage()) ? w1VarI.f36178b : th2.getMessage(), w1VarI.f36177a));
                    return;
                } catch (RemoteException e2) {
                    ya.a0.n("Service can't call client", e2);
                    return;
                }
        }
    }

    public Enum o(Object obj) throws GeneralSecurityException {
        Enum r02 = (Enum) ((Map) this.f15754c).get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public synchronized String p() {
        return (String) this.f15754c;
    }

    public void q(wp0 wp0Var) {
        u("aai", wp0Var.f18114w);
        u("request_id", wp0Var.f18097n0);
        u("ad_format", wp0.a(wp0Var.f18074b));
    }

    public void r(ib.a aVar) {
        nw nwVar;
        vb.b bVar;
        nw nwVar2;
        va.z2 z2VarA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = (Context) this.f15753b;
        synchronized (rt.class) {
            try {
                if (f15751d == null) {
                    va.o oVar = va.r.g.f36158b;
                    yq yqVar = new yq();
                    oVar.getClass();
                    f15751d = (nw) new va.e(oVar, context, yqVar).d(context, false);
                }
                nwVar = f15751d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (nwVar == null) {
            aVar.a("Internal Error, query info generator is null.");
            return;
        }
        vb.b bVar2 = new vb.b(context);
        va.d2 d2Var = (va.d2) this.f15754c;
        if (d2Var == null) {
            bVar = bVar2;
            nwVar2 = nwVar;
            z2VarA = new va.z2(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, jCurrentTimeMillis, 0L);
        } else {
            bVar = bVar2;
            nwVar2 = nwVar;
            d2Var.f36063m = jCurrentTimeMillis;
            z2VarA = va.b3.a(context, d2Var);
        }
        try {
            nwVar2.v3(bVar, new rw(null, "BANNER", null, z2VarA, 0, null), new qt(this, aVar));
        } catch (RemoteException unused) {
            aVar.a("Internal Error.");
        }
    }

    public boolean s(int i4) {
        return ((yv1) this.f15753b).f18891a.get(i4);
    }

    public Object t(Enum r32) throws GeneralSecurityException {
        Object obj = ((Map) this.f15753b).get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }

    public void u(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ((ConcurrentHashMap) this.f15753b).put(str, str2);
    }

    public void v() {
        ((qd0) this.f15754c).f15316b.execute(new pd0(this, 2));
    }

    public za.k w() {
        boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.f16442zf)).booleanValue();
        za.k kVar = za.k.f38156a;
        if (!zBooleanValue) {
            v();
            return kVar;
        }
        qd0 qd0Var = (qd0) this.f15754c;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f15753b;
        ud0 ud0Var = qd0Var.f15315a;
        ud0Var.getClass();
        if (concurrentHashMap.isEmpty()) {
            za.i.c("Empty paramMap.");
            return kVar;
        }
        String strA = ud0Var.f17179f.a(concurrentHashMap);
        ya.a0.m(strA);
        return ud0Var.f17177d.a(null, strA);
    }

    public void x() {
        ((qd0) this.f15754c).f15316b.execute(new pd0(this, 0));
    }

    public void y(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put(PglCryptUtils.KEY_MESSAGE, str).put("action", (String) this.f15754c);
            qz qzVar = (qz) this.f15753b;
            if (qzVar != null) {
                qzVar.h("onError", jSONObjectPut);
            }
        } catch (JSONException e2) {
            za.i.f("Error occurred while dispatching error event.", e2);
        }
    }

    public void z(int i4, int i10, int i11, int i12) throws JSONException {
        try {
            ((qz) this.f15753b).h("onSizeChanged", new JSONObject().put("x", i4).put("y", i10).put("width", i11).put("height", i12));
        } catch (JSONException e2) {
            za.i.f("Error occurred while dispatching size change.", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    @Override // com.google.android.gms.internal.ads.pm
    public JSONObject zzc() {
        return ((mg) this.f15753b).I1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rt(bb0 bb0Var, ViewGroup viewGroup) {
        this.f15752a = 13;
        this.f15753b = (mg) bb0Var;
        this.f15754c = viewGroup;
    }

    public /* synthetic */ rt(Object obj, Object obj2, Object obj3, int i4) {
        this.f15752a = i4;
        this.f15753b = obj2;
        this.f15754c = obj3;
    }

    @Override // com.google.android.gms.internal.ads.vh0
    public Object b() {
        za.a aVar = (za.a) this.f15753b;
        int i4 = aVar.f38130b;
        int i10 = aVar.f38131c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 1 + String.valueOf(i10).length());
        sb2.append(i4);
        sb2.append(".");
        sb2.append(i10);
        String string = sb2.toString();
        if (!TextUtils.isEmpty("Google")) {
            if (!TextUtils.isEmpty(string)) {
                return new zt0(new u70("Google", string), (WebView) this.f15754c);
            }
            throw new IllegalArgumentException("Version is null or empty");
        }
        throw new IllegalArgumentException("Name is null or empty");
    }

    public /* synthetic */ rt(Object obj, boolean z3, Object obj2, int i4) {
        this.f15752a = i4;
        this.f15753b = obj2;
        this.f15754c = obj;
    }

    public rt(int i4) {
        this.f15752a = i4;
        switch (i4) {
            case 8:
                break;
            case 22:
                rg0 rg0Var = new rg0(13);
                this.f15753b = rg0Var;
                this.f15754c = new kh0(10, rg0Var);
                break;
            case 25:
                rt rtVar = nn1.B;
                this.f15753b = new av0((av0) rtVar.f15753b);
                this.f15754c = Arrays.copyOf((long[]) rtVar.f15754c, 10);
                break;
            default:
                this.f15753b = new sk0();
                this.f15754c = new u7();
                break;
        }
    }

    public /* synthetic */ rt(a0 a0Var) {
        this.f15752a = 1;
        this.f15754c = a0Var;
    }

    public rt(w5 w5Var) {
        this.f15752a = 4;
        oa oaVar = new oa((byte) 0, 0);
        this.f15753b = w5Var;
        this.f15754c = oaVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View$OnClickListener, com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    @Override // com.google.android.gms.internal.ads.hx
    /* renamed from: b */
    public void mo164b() {
        switch (this.f15752a) {
            case 6:
                ya.a0.m("callJs > getEngine: Promise rejected");
                ((gx) this.f15753b).d(new lq("Unable to obtain a JavascriptEngine."));
                ((hq) this.f15754c).y();
                break;
            case 13:
                u51 u51Var = oa0.f14620p;
                ?? r12 = (mg) this.f15753b;
                Map mapD1 = r12.D1();
                if (mapD1 != null) {
                    int i4 = u51Var.f17098d;
                    int i10 = 0;
                    while (i10 < i4) {
                        Object obj = mapD1.get((String) u51Var.get(i10));
                        i10++;
                        if (obj != null) {
                            r12.onClick((ViewGroup) this.f15754c);
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                ck0 ck0Var = (ck0) this.f15753b;
                wk wkVar = (wk) this.f15754c;
                xk xkVar = (xk) ck0Var.f10147d;
                Parcel parcelT = xkVar.T();
                ng.e(parcelT, wkVar);
                xkVar.g1(parcelT, 1);
                break;
        }
    }

    public rt(vk vkVar) {
        this.f15752a = 5;
        this.f15754c = vkVar;
        this.f15753b = new HashMap();
    }

    public rt(qd0 qd0Var) {
        this.f15752a = 15;
        this.f15754c = qd0Var;
        this.f15753b = new ConcurrentHashMap();
    }

    public rt(u51 u51Var, int[] iArr) {
        this.f15752a = 23;
        this.f15753b = x41.q(u51Var);
        this.f15754c = iArr;
    }

    public rt(yv1 yv1Var, SparseArray sparseArray) {
        this.f15752a = 29;
        this.f15753b = yv1Var;
        SparseBooleanArray sparseBooleanArray = yv1Var.f18891a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
            int iA = yv1Var.a(i4);
            qu1 qu1Var = (qu1) sparseArray.get(iA);
            qu1Var.getClass();
            sparseArray2.append(iA, qu1Var);
        }
        this.f15754c = sparseArray2;
    }

    public rt(byte[] bArr, Provider provider) throws GeneralSecurityException {
        this.f15752a = 27;
        if (al0.q(1)) {
            this.f15753b = new SecretKeySpec(bArr, "AES");
            this.f15754c = provider;
            return;
        }
        throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
    }

    private final void m(Throwable th2) {
    }
}
