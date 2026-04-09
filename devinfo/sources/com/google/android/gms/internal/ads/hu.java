package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu implements z21 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11973b;

    public /* synthetic */ hu(int i4, Object obj) {
        this.f11972a = i4;
        this.f11973b = obj;
    }

    @Override // com.google.android.gms.internal.ads.z21
    public final Object apply(Object obj) throws JSONException, IOException {
        SharedPreferences sharedPreferences;
        int i4 = 3;
        int i10 = 0;
        int i11 = -1;
        String str = null;
        switch (this.f11972a) {
            case 0:
                b7 b7Var = (b7) this.f11973b;
                JSONObject jSONObject = (JSONObject) obj;
                pk pkVar = sk.f16033a;
                va.s sVar = va.s.f36163e;
                w5 w5Var = sVar.f36165b;
                pq0 pq0Var = sVar.f36164a;
                Context context = (Context) b7Var.f9606b;
                SharedPreferences sharedPreferencesV = w5.v(context);
                if (sharedPreferencesV != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferencesV.edit();
                    Objects.requireNonNull(pq0Var);
                    ArrayList arrayList = (ArrayList) pq0Var.f15073b;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        pk pkVar2 = (pk) obj2;
                        if (pkVar2.f15024a == 1) {
                            Object objA = pkVar2.a(jSONObject);
                            switch (pkVar2.f15028e) {
                                case 0:
                                    editorEdit.putBoolean(pkVar2.f15025b, ((Boolean) objA).booleanValue());
                                    break;
                                case 1:
                                    editorEdit.putInt(pkVar2.f15025b, ((Integer) objA).intValue());
                                    break;
                                case 2:
                                    editorEdit.putLong(pkVar2.f15025b, ((Long) objA).longValue());
                                    break;
                                case 3:
                                    editorEdit.putFloat(pkVar2.f15025b, ((Float) objA).floatValue());
                                    break;
                                default:
                                    editorEdit.putString(pkVar2.f15025b, (String) objA);
                                    break;
                            }
                        }
                    }
                    if (jSONObject != null) {
                        editorEdit.putString("flag_configuration", jSONObject.toString());
                    } else {
                        za.i.e("Flag Json is null.");
                    }
                    if (((Boolean) ul.f17253o.u()).booleanValue() || ((Boolean) ul.f17254p.u()).booleanValue()) {
                        w5 w5Var2 = va.s.f36163e.f36165b;
                        editorEdit.apply();
                    } else {
                        w5 w5Var3 = va.s.f36163e.f36165b;
                        editorEdit.commit();
                    }
                    if (((Boolean) ul.f17245e.u()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
                        w5 w5Var4 = va.s.f36163e.f36165b;
                        try {
                            sharedPreferences = context.getSharedPreferences("google_adapter_flags", 0);
                        } catch (IllegalStateException e2) {
                            za.i.i("", e2);
                            sharedPreferences = null;
                        }
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                            JSONObject jSONObject2 = new JSONObject();
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (next.startsWith("adapter:")) {
                                    try {
                                        jSONObject2.put(next, jSONObject.get(next));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            editorEdit2.putString("flag_configuration", jSONObject2.toString());
                            editorEdit2.apply();
                        }
                    }
                    SharedPreferences sharedPreferences2 = (SharedPreferences) b7Var.f9607c;
                    if (sharedPreferences2 != null) {
                        SharedPreferences.Editor editorEdit3 = sharedPreferences2.edit();
                        ua.j.C.f35267k.getClass();
                        editorEdit3.putLong("js_last_update", System.currentTimeMillis()).apply();
                    }
                }
                return null;
            case 1:
                hc0 hc0Var = (hc0) this.f11973b;
                qz qzVar = (qz) obj;
                qzVar.Z("/result", hc0Var.f11833h);
                i00 i00VarX = qzVar.X();
                ua.a aVar = new ua.a(hc0Var.f11829c, null);
                lh0 lh0Var = hc0Var.f11834i;
                ct0 ct0Var = hc0Var.j;
                qd0 qd0Var = hc0Var.f11830d;
                cc0 cc0Var = hc0Var.f11827a;
                i00VarX.j(null, cc0Var, cc0Var, cc0Var, cc0Var, false, null, aVar, null, null, lh0Var, ct0Var, qd0Var, null, null, null, null, null, null, null, null, null);
                return qzVar;
            case 2:
                return ((o10) this.f11973b).a0();
            case 3:
                return ((ql0) this.f11973b).c();
            case 4:
                ((zl0) this.f11973b).f19117a.f("AppSetIdInfoSignal", (Exception) obj);
                return new am0(str, i11, i10);
            case 5:
                ((zw) ((ol0) this.f11973b).f14728b).f("AppSetIdInfoGmscoreSignal", (Exception) obj);
                return new am0(str, i11, i4);
            case 6:
                ((ko0) this.f11973b).f13219a.f("TrustlessTokenSignal", (Exception) obj);
                return new ml0(str, 5);
            case 7:
                ar0 ar0Var = (ar0) this.f11973b;
                ar0Var.f9392c = (o40) obj;
                return ar0Var;
            case 8:
                return (az0) this.f11973b;
            case 9:
                az0 az0Var = (az0) obj;
                ((ez0) this.f11973b).f10931f.set(az0Var);
                return az0Var;
            case 10:
                return new Boolean(((s11) this.f11973b).b((zy0) obj));
            case 11:
                xy0 xy0Var = (xy0) obj;
                g21 g21Var = ((t01) this.f11973b).f16629d;
                int iH = xy0Var.H() - 1;
                if (iH == 1 || iH == 2) {
                    return xy0Var;
                }
                if (iH == 3) {
                    int iH2 = xy0Var.H() - 1;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iH2).length());
                    sb2.append(iH2);
                    g21Var.c(TTAdConstant.IMAGE_MODE_CAROUSEL_IMG, sb2.toString());
                    int iH3 = xy0Var.H() - 1;
                    throw new p01(d.h.q(iH3, "r: ", new StringBuilder(String.valueOf(iH3).length() + 3)));
                }
                if (iH != 12) {
                    int iH4 = xy0Var.H() - 1;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iH4).length());
                    sb3.append(iH4);
                    g21Var.c(WebSocketProtocol.CLOSE_NO_STATUS_CODE, sb3.toString());
                    int iH5 = xy0Var.H() - 1;
                    throw new o01(d.h.q(iH5, "r: ", new StringBuilder(String.valueOf(iH5).length() + 3)));
                }
                int iH6 = xy0Var.H() - 1;
                StringBuilder sb4 = new StringBuilder(String.valueOf(iH6).length());
                sb4.append(iH6);
                g21Var.c(WebSocketProtocol.CLOSE_NO_STATUS_CODE, sb4.toString());
                int iH7 = xy0Var.H() - 1;
                throw new n01(d.h.q(iH7, "r: ", new StringBuilder(String.valueOf(iH7).length() + 3)));
            case 12:
                c11 c11Var = (c11) this.f11973b;
                byte[] bArr = (byte[]) obj;
                a4.d dVar = new a4.d(2);
                f21 f21VarA = c11Var.f9919e.a(20102);
                try {
                    try {
                        f21VarA.a();
                        synchronized (c11Var.f9920f) {
                            c11Var.j = g5.a(dVar, bArr);
                        }
                        f21VarA.c();
                        return null;
                    } catch (fb e10) {
                        e = e10;
                        f21VarA.b(e);
                        throw new ac.m("r: 2", e);
                    } catch (ib e11) {
                        e = e11;
                        f21VarA.b(e);
                        throw new ac.m("r: 2", e);
                    } catch (Throwable th2) {
                        f21VarA.b(th2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    f21VarA.c();
                    throw th3;
                }
            case 13:
                m11 m11Var = (m11) this.f11973b;
                zy0 zy0Var = (zy0) obj;
                m11Var.getClass();
                if (zy0Var == null || zy0Var.equals(zy0.F())) {
                    return null;
                }
                return new xv0(zy0Var.A(), ((ky0) m11Var.f13726e.a()).f13289a, m11Var.f13724c.f13289a, m11Var.g);
            default:
                x11 x11Var = (x11) this.f11973b;
                String str2 = (String) obj;
                if (!yr1.k(str2)) {
                    return str2;
                }
                File file = new File(x11Var.f18260a.getPackageResourcePath());
                if (file.exists() && file.canRead()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            byte[] bArr2 = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                            for (int i13 = fileInputStream.read(bArr2); i13 != -1; i13 = fileInputStream.read(bArr2)) {
                                messageDigest.update(bArr2, 0, i13);
                            }
                            m61 m61VarF = m61.f13779f.f();
                            byte[] bArrDigest = messageDigest.digest();
                            String strG = m61VarF.g(bArrDigest.length, bArrDigest);
                            fileInputStream.close();
                            return strG;
                        } finally {
                        }
                    } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused2) {
                    }
                }
                return "";
        }
    }
}
