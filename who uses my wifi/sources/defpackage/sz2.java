package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.security.NetworkSecurityPolicy;
import android.webkit.WebView;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class sz2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ sz2(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    private final void a() {
        jb3 jb3Var = (jb3) this.h;
        nx2 nx2Var = (nx2) this.g;
        synchronized (jb3Var) {
            bf2 bf2Var = jb3Var.h;
            if (bf2Var != null) {
                try {
                    String str = jb3Var.k;
                    Parcel parcelU = bf2Var.U();
                    parcelU.writeString(str);
                    iv1.c(parcelU, nx2Var);
                    bf2Var.M0(parcelU, 3);
                } catch (RemoteException unused) {
                    gi2.i0("Failed to call onAdFailedToPreload");
                }
            }
        }
    }

    private final void b() throws RemoteException {
        Object ik3Var;
        IInterface iInterface;
        IBinder iBinder = (IBinder) this.h;
        int i = jk3.f;
        if (iBinder == null) {
            ik3Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
            ik3Var = iInterfaceQueryLocalInterface instanceof kk3 ? (kk3) iInterfaceQueryLocalInterface : new ik3(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService", 2);
        }
        sk3 sk3Var = (sk3) this.g;
        x03 x03Var = sk3Var.a;
        x03Var.o = ik3Var;
        int i2 = 0;
        ((er3) x03Var.i).a("linkToDeath", new Object[0]);
        try {
            iInterface = (kk3) x03Var.o;
        } catch (RemoteException e) {
            ((er3) sk3Var.a.i).f(e, "linkToDeath failed", new Object[0]);
        }
        if (iInterface == null) {
            throw null;
        }
        ((sb1) iInterface).g.linkToDeath((tk3) x03Var.m, 0);
        x03 x03Var2 = sk3Var.a;
        x03Var2.f = false;
        synchronized (((ArrayList) x03Var2.k)) {
            try {
                ArrayList arrayList = (ArrayList) x03Var2.k;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((Runnable) obj).run();
                }
                ((ArrayList) x03Var2.k).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        synchronized (((mn2) this.h).i) {
            ((dj0) ((mn2) this.h).h).i((gi4) this.g);
        }
    }

    private final void d() {
        ra4 ra4Var = (ra4) this.g;
        SharedPreferences sharedPreferences = ((Context) this.h).getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (ra4Var.a) {
                try {
                    ra4Var.f = sharedPreferences;
                    ra4Var.g = editorEdit;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    ra4Var.h = ra4Var.f.getBoolean("use_https", ra4Var.h);
                    ra4Var.u = ra4Var.f.getBoolean("content_url_opted_out", ra4Var.u);
                    ra4Var.i = ra4Var.f.getString("content_url_hashes", ra4Var.i);
                    ra4Var.k = ra4Var.f.getBoolean("gad_idless", ra4Var.k);
                    ra4Var.v = ra4Var.f.getBoolean("content_vertical_opted_out", ra4Var.v);
                    ra4Var.j = ra4Var.f.getString("content_vertical_hashes", ra4Var.j);
                    ra4Var.r = ra4Var.f.getInt("version_code", ra4Var.r);
                    if (((Boolean) m02.g.w()).booleanValue() && tw1.e.c.j) {
                        ra4Var.n = new ed2("", 0L);
                    } else {
                        ra4Var.n = new ed2(ra4Var.f.getString("app_settings_json", ra4Var.n.e), ra4Var.f.getLong("app_settings_last_update_ms", ra4Var.n.f));
                    }
                    ra4Var.o = ra4Var.f.getLong("app_last_background_time_ms", ra4Var.o);
                    ra4Var.q = ra4Var.f.getInt("request_in_session_count", ra4Var.q);
                    ra4Var.p = ra4Var.f.getLong("first_ad_req_time_ms", ra4Var.p);
                    ra4Var.s = ra4Var.f.getStringSet("never_pool_slots", ra4Var.s);
                    ra4Var.w = ra4Var.f.getString("display_cutout", ra4Var.w);
                    ra4Var.B = ra4Var.f.getInt("app_measurement_npa", ra4Var.B);
                    ra4Var.C = ra4Var.f.getInt("sd_app_measure_npa", ra4Var.C);
                    ra4Var.D = ra4Var.f.getLong("sd_app_measure_npa_ts", ra4Var.D);
                    ra4Var.x = ra4Var.f.getString("inspector_info", ra4Var.x);
                    ra4Var.y = ra4Var.f.getBoolean("linked_device", ra4Var.y);
                    ra4Var.z = ra4Var.f.getString("linked_ad_unit", ra4Var.z);
                    ra4Var.A = ra4Var.f.getString("inspector_ui_storage", ra4Var.A);
                    ra4Var.l = ra4Var.f.getString("IABTCF_TCString", ra4Var.l);
                    ra4Var.m = ra4Var.f.getInt("gad_has_consent_for_cookies", ra4Var.m);
                    try {
                        ra4Var.t = new JSONObject(ra4Var.f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException unused) {
                        gi2.q0(5);
                    }
                    ra4Var.i();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            hg4.C.h.d("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th2);
            gi2.R();
        }
    }

    private final void e() {
        synchronized (((mn2) this.h).i) {
            gj0 gj0Var = (gj0) ((mn2) this.h).h;
            Exception excA = ((gi4) this.g).a();
            ou1.j(excA);
            gj0Var.q(excA);
        }
    }

    private final void f() {
        synchronized (((ft3) this.h).h) {
            try {
                mn2 mn2Var = ((ft3) this.h).i;
                if (mn2Var != null) {
                    ((gi4) mn2Var.h).e(((gi4) this.g).b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:260:0x02ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws defpackage.fb4, android.os.RemoteException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz2.run():void");
    }

    public /* synthetic */ sz2(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.g = obj2;
        this.h = obj;
    }

    public sz2(fr frVar, WebView webView, String str) {
        this.f = 13;
        this.g = webView;
        this.h = str;
    }
}
