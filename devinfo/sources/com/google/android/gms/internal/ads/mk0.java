package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mk0 extends mg implements ks {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f13921e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final gx f13922a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f13923b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13924c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13925d;

    public mk0(String str, is isVar, gx gxVar, long j) throws JSONException {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.f13923b = jSONObject;
        this.f13925d = false;
        this.f13922a = gxVar;
        this.f13924c = j;
        try {
            jSONObject.put("adapter_version", isVar.d().toString());
            jSONObject.put("sdk_version", isVar.e().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.ks
    public final synchronized void b(va.w1 w1Var) {
        h4(2, w1Var.f36178b);
    }

    public final synchronized void g(String str) {
        h4(2, str);
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            String string = parcel.readString();
            ng.f(parcel);
            k(string);
        } else if (i4 == 2) {
            String string2 = parcel.readString();
            ng.f(parcel);
            g(string2);
        } else {
            if (i4 != 3) {
                return false;
            }
            va.w1 w1Var = (va.w1) ng.b(parcel, va.w1.CREATOR);
            ng.f(parcel);
            b(w1Var);
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void h4(int i4, String str) {
        try {
            if (this.f13925d) {
                return;
            }
            try {
                JSONObject jSONObject = this.f13923b;
                jSONObject.put("signal_error", str);
                pk pkVar = sk.Y1;
                va.s sVar = va.s.f36163e;
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                    ua.j.C.f35267k.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f13924c);
                }
                if (((Boolean) sVar.f36166c.a(sk.X1)).booleanValue()) {
                    jSONObject.put("signal_error_code", i4);
                }
            } catch (JSONException unused) {
            }
            this.f13922a.b(this.f13923b);
            this.f13925d = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ks
    public final synchronized void k(String str) {
        if (this.f13925d) {
            return;
        }
        if (str == null) {
            g("Adapter returned null signals");
            return;
        }
        try {
            JSONObject jSONObject = this.f13923b;
            jSONObject.put("signals", str);
            pk pkVar = sk.Y1;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                ua.j.C.f35267k.getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f13924c);
            }
            if (((Boolean) sVar.f36166c.a(sk.X1)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f13922a.b(this.f13923b);
        this.f13925d = true;
    }

    public final synchronized void m() {
        if (this.f13925d) {
            return;
        }
        try {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.X1)).booleanValue()) {
                this.f13923b.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f13922a.b(this.f13923b);
        this.f13925d = true;
    }
}
