package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l23 extends hv1 implements f82 {
    public static final /* synthetic */ int j = 0;
    public final pd2 f;
    public final JSONObject g;
    public final long h;
    public boolean i;

    public l23(String str, d82 d82Var, pd2 pd2Var, long j2) throws JSONException {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.g = jSONObject;
        this.i = false;
        this.f = pd2Var;
        this.h = j2;
        try {
            jSONObject.put("adapter_version", d82Var.c().toString());
            jSONObject.put("sdk_version", d82Var.e().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            iv1.f(parcel);
            synchronized (this) {
                if (!this.i) {
                    if (string == null) {
                        synchronized (this) {
                            B3("Adapter returned null signals", 2);
                        }
                    } else {
                        try {
                            JSONObject jSONObject = this.g;
                            jSONObject.put("signals", string);
                            iz1 iz1Var = mz1.J1;
                            tw1 tw1Var = tw1.e;
                            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                                hg4.C.k.getClass();
                                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.h);
                            }
                            if (((Boolean) tw1Var.c.a(mz1.I1)).booleanValue()) {
                                jSONObject.put("signal_error_code", 0);
                            }
                        } catch (JSONException unused) {
                        }
                        this.f.a(this.g);
                        this.i = true;
                    }
                }
            }
        } else if (i == 2) {
            String string2 = parcel.readString();
            iv1.f(parcel);
            synchronized (this) {
                B3(string2, 2);
            }
        } else {
            if (i != 3) {
                return false;
            }
            nx2 nx2Var = (nx2) iv1.b(parcel, nx2.CREATOR);
            iv1.f(parcel);
            synchronized (this) {
                B3(nx2Var.g, 2);
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void B3(String str, int i) {
        try {
            if (this.i) {
                return;
            }
            try {
                JSONObject jSONObject = this.g;
                jSONObject.put("signal_error", str);
                iz1 iz1Var = mz1.J1;
                tw1 tw1Var = tw1.e;
                if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                    hg4.C.k.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.h);
                }
                if (((Boolean) tw1Var.c.a(mz1.I1)).booleanValue()) {
                    jSONObject.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.f.a(this.g);
            this.i = true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
