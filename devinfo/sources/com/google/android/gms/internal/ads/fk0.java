package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fk0 implements p1, s6, q21, pb.b, n00, bb.b, p81, lr0, c80, pm {

    /* renamed from: c, reason: collision with root package name */
    public static final cl1 f11192c = new cl1((byte) 0, 15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11193a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11194b;

    public /* synthetic */ fk0(int i4, Object obj) {
        this.f11193a = i4;
        this.f11194b = obj;
    }

    @Override // pb.b
    public void S(int i4) {
        ai aiVar = (ai) this.f11194b;
        synchronized (aiVar.f9332c) {
            aiVar.f9335f = null;
            aiVar.f9332c.notifyAll();
        }
    }

    @Override // pb.b
    public void T() {
        di diVar;
        ai aiVar = (ai) this.f11194b;
        synchronized (aiVar.f9332c) {
            try {
                diVar = (di) aiVar.f9333d;
            } catch (DeadObjectException e2) {
                za.i.f("Unable to obtain a cache service instance.", e2);
                ((ai) this.f11194b).r();
            }
            if (diVar != null) {
                aiVar.f9335f = (fi) diVar.t();
                ((ai) this.f11194b).f9332c.notifyAll();
            } else {
                ((ai) this.f11194b).f9332c.notifyAll();
            }
        }
    }

    public void a(String str) {
        try {
            ((kp) this.f11194b).g(str);
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.n00, com.google.android.gms.internal.ads.pm
    /* renamed from: b */
    public void mo169b() {
        switch (this.f11193a) {
            case 12:
                b8.d dVar = (b8.d) this.f11194b;
                ua.j.C.f35267k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = dVar.f2073a;
                ArrayList arrayList = (ArrayList) dVar.f2075c;
                arrayList.add(Long.valueOf(jCurrentTimeMillis - j));
                String strValueOf = String.valueOf(arrayList.get(0));
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 52);
                sb2.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                sb2.append(strValueOf);
                sb2.append(" ms.");
                ya.a0.m(sb2.toString());
                ya.f0.f37440l.postDelayed(new eq((y50) dVar.f2074b, (iq) dVar.f2076d, (zp) dVar.f2077e, arrayList, j, 1), ((Integer) va.s.f36163e.f36166c.a(sk.f16083d)).intValue());
                break;
            default:
                ca0 ca0Var = ((ac0) this.f11194b).f9302d;
                if (ca0Var != null) {
                    ca0Var.i("_videoMediaView");
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.google.android.gms.internal.ads.xv] */
    @Override // com.google.android.gms.internal.ads.lr0
    /* renamed from: c */
    public Object mo170c(Object obj) {
        dq0 dq0Var = (dq0) obj;
        ce1 ce1Var = ((y40) this.f11194b).f18630d;
        ArrayList arrayList = (ArrayList) dq0Var.f10544b.f9453d;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            cq0 cq0Var = (cq0) obj2;
            Map map = (Map) ce1Var.f10094b;
            String str = cq0Var.f10198a;
            JSONObject jSONObject = cq0Var.f10199b;
            if (map.containsKey(str) && jSONObject != null) {
                n20 n20Var = (n20) map.get(str);
                switch (n20Var.f14132a) {
                    case 0:
                        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16404xa)).booleanValue()) {
                            ff0 ff0Var = (ff0) n20Var.f14133b;
                            synchronized (ff0Var) {
                                ff0Var.f11142p = jSONObject;
                            }
                            break;
                        } else {
                            continue;
                        }
                    default:
                        ((xv) ((ce1) n20Var.f14133b).f10095c).a(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
                        break;
                }
            } else {
                Map map2 = (Map) ce1Var.f10095c;
                if (map2.containsKey(str) && jSONObject != null) {
                    h20 h20Var = (h20) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    h20Var.a(map3);
                }
            }
        }
        return dq0Var;
    }

    @Override // com.google.android.gms.internal.ads.s6
    public void d(byte[] bArr, int i4, int i10, ca.c cVar) {
        w40 w40VarA;
        sk0 sk0Var = (sk0) this.f11194b;
        sk0Var.z(i4 + i10, bArr);
        sk0Var.E(i4);
        ArrayList arrayList = new ArrayList();
        while (sk0Var.B() > 0) {
            mq0.y("Incomplete Mp4Webvtt Top Level box header found.", sk0Var.B() >= 8);
            int iB = sk0Var.b() - 8;
            if (sk0Var.b() == 1987343459) {
                CharSequence charSequenceA = null;
                k40 k40VarA = null;
                while (iB > 0) {
                    mq0.y("Incomplete vtt cue box header found.", iB >= 8);
                    int iB2 = sk0Var.b();
                    int iB3 = sk0Var.b();
                    int i11 = iB - 8;
                    int i12 = iB2 - 8;
                    byte[] bArr2 = sk0Var.f16446a;
                    int i13 = sk0Var.f16447b;
                    String str = bq0.f9768a;
                    String str2 = new String(bArr2, i13, i12, StandardCharsets.UTF_8);
                    sk0Var.G(i12);
                    if (iB3 == 1937011815) {
                        a8 a8Var = new a8();
                        b8.c(str2, a8Var);
                        k40VarA = a8Var.a();
                    } else if (iB3 == 1885436268) {
                        charSequenceA = b8.a(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                    iB = i11 - i12;
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (k40VarA != null) {
                    k40VarA.f13013a = charSequenceA;
                    k40VarA.f13014b = null;
                    w40VarA = k40VarA.a();
                } else {
                    Pattern pattern = b8.f9612a;
                    a8 a8Var2 = new a8();
                    a8Var2.f9244c = charSequenceA;
                    w40VarA = a8Var2.a().a();
                }
                arrayList.add(w40VarA);
            } else {
                sk0Var.G(iB);
            }
        }
        cVar.mo160c(new n6(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    public void e(s1 s1Var) {
        long[] jArr = s1Var.f15832e;
        if (jArr.length > 0) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f11194b;
            if (linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jArr[0]), s1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.pm
    public JSONObject f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.p1
    public long g(long j) {
        ((e2) this.f11194b).getClass();
        String str = bq0.f9768a;
        return Math.max(0L, Math.min((j * r0.f10672e) / 1000000, r0.j - 1));
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        switch (this.f11193a) {
            case 15:
                sv.f16551l.remove((vd.b) this.f11194b);
                break;
            case 16:
                ((AtomicInteger) ((androidx.recyclerview.widget.d0) this.f11194b).f1326b).set(1);
                break;
            default:
                try {
                    qz qzVar = (qz) ((List) obj).get(0);
                    if (qzVar != null) {
                        cb0 cb0Var = (cb0) this.f11194b;
                        cb0Var.getClass();
                        cb0Var.f10071c.execute(new a00(qzVar, 5));
                        break;
                    }
                } catch (ClassCastException | IndexOutOfBoundsException e2) {
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.f16167i6)).booleanValue()) {
                        ua.j.C.f35265h.f("omid native display exp", e2);
                    }
                    return;
                }
                break;
        }
    }

    public void i(ha haVar, b5.i0 i0Var, q81 q81Var) {
        synchronized (haVar.f11784e) {
            haVar.f11787i = true;
        }
        haVar.a("post-response");
        ((aa) this.f11194b).f9289b.post(new d1(haVar, i0Var, q81Var, 1));
    }

    public pr1[] k(Handler handler, bt1 bt1Var, bt1 bt1Var2) {
        fz fzVar = (fz) this.f11194b;
        uu1 uu1Var = uu1.f17350h;
        Context context = fzVar.f11294a;
        hw1 hw1Var = new hw1(context);
        mq0.c0(!hw1Var.f11998c);
        hw1Var.f11998c = true;
        if (hw1Var.f12001f == null) {
            hw1Var.f12001f = new av0(new q10[0]);
        }
        if (hw1Var.f12000e == null) {
            if (hw1Var.g == null) {
                hw1Var.g = new fw1(context);
            }
            if (hw1Var.f11999d == null) {
                hw1Var.f11999d = w5.j;
            }
            av0 av0Var = new av0(context);
            ev1 ev1Var = context != null ? null : hw1Var.f11997b;
            Context context2 = (Context) av0Var.f9422b;
            if (context2 == null) {
                av0Var.f9423c = ev1Var;
            }
            fw1 fw1Var = hw1Var.g;
            av0Var.f9424d = fw1Var;
            if (fw1Var == null) {
                av0Var.f9424d = new fw1(context2);
            }
            hw1Var.f12000e = new cw1(av0Var);
        } else {
            mq0.c0(hw1Var.g == null);
            mq0.c0(hw1Var.f11999d == null);
        }
        int i4 = 5;
        mw1 mw1Var = new mw1(context, new mu0(context, i4), handler, bt1Var2, new kw1(hw1Var));
        com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p();
        pVar.f9115b = context;
        pVar.f9116c = uu1.f17350h;
        pVar.f9117d = new mu0(context, i4);
        pVar.f9116c = uu1Var;
        pVar.f9118e = handler;
        pVar.f9119f = bt1Var;
        mq0.c0(!pVar.f9114a);
        Handler handler2 = (Handler) pVar.f9118e;
        mq0.c0((handler2 == null && ((bt1) pVar.f9119f) == null) || !(handler2 == null || ((bt1) pVar.f9119f) == null));
        pVar.f9114a = true;
        return new pr1[]{mw1Var, new i0(pVar)};
    }

    @Override // com.google.android.gms.internal.ads.q21
    public /* synthetic */ void l(long j, sk0 sk0Var) {
        a80.n(j, sk0Var, ((e9) this.f11194b).f10745c);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        switch (this.f11193a) {
            case 15:
                sv.f16551l.remove((vd.b) this.f11194b);
                break;
            case 16:
                ((AtomicInteger) ((androidx.recyclerview.widget.d0) this.f11194b).f1326b).set(-1);
                break;
            default:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16167i6)).booleanValue()) {
                    ua.j.C.f35265h.f("omid native display exp", th2);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.pm
    public JSONObject zzc() {
        return null;
    }

    public /* synthetic */ fk0(int i4, Object obj, Object obj2) {
        this.f11193a = i4;
        this.f11194b = obj2;
    }

    public fk0(int i4) {
        this.f11193a = i4;
        switch (i4) {
            case 2:
                this.f11194b = new LinkedHashMap();
                break;
            case 5:
                this.f11194b = new sk0();
                break;
            default:
                int i10 = um1.f17262a;
                ne0 ne0Var = new ne0(25, new ko1[]{w5.f17896i, f11192c});
                Charset charset = yn1.f18811a;
                this.f11194b = ne0Var;
                break;
        }
    }

    public fk0(Context context, Executor executor) {
        this.f11193a = 9;
        this.f11194b = yo0.z(executor, new qe(0, context));
    }

    public fk0(Handler handler) {
        this.f11193a = 7;
        this.f11194b = new aa(this, handler);
    }

    public fk0(tm tmVar) {
        this.f11193a = 14;
        this.f11194b = new ArrayList();
        try {
            tmVar.a();
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
        try {
            ArrayList arrayListZzc = tmVar.zzc();
            int size = arrayListZzc.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListZzc.get(i4);
                i4++;
                xm xmVarH4 = obj instanceof IBinder ? om.h4((IBinder) obj) : null;
                if (xmVarH4 != null) {
                    ((ArrayList) this.f11194b).add(new l90(xmVarH4));
                }
            }
        } catch (RemoteException e10) {
            za.i.f("", e10);
        }
    }

    public fk0(jn jnVar) {
        Context context;
        this.f11193a = 11;
        this.f11194b = jnVar;
        try {
            context = (Context) vb.b.U0(jnVar.K2());
        } catch (RemoteException | NullPointerException e2) {
            za.i.f("", e2);
            context = null;
        }
        if (context != null) {
            try {
                ((jn) this.f11194b).v(new vb.b(new sa.b(context)));
            } catch (RemoteException e10) {
                za.i.f("", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c, reason: collision with other method in class */
    public /* synthetic */ void mo162c(Object obj) {
        switch (this.f11193a) {
            case 20:
                n60 n60Var = (n60) obj;
                String message = ((e90) this.f11194b).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                n60Var.b(yo0.A(12, message, null));
                break;
            case 21:
                ((j60) obj).J((va.w1) this.f11194b);
                break;
            case 22:
                ((e70) obj).a((va.d3) this.f11194b);
                break;
            case 23:
            default:
                ((x80) obj).a((fb.o) this.f11194b);
                break;
            case 24:
                ((y70) obj).m((pj) this.f11194b);
                break;
            case 25:
                ((xg) obj).w((wg) this.f11194b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.pm
    public void j(MotionEvent motionEvent) {
    }
}
