package ya;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.sk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f37493a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f37494b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f37495c;

    public x(Context context) {
        this.f37495c = context;
    }

    public final void a() {
        pk pkVar = sk.Hb;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            f0 f0Var = ua.j.C.f35261c;
            HashMap mapR = f0.R((String) sVar.f36166c.a(sk.Mb));
            for (String str : mapR.keySet()) {
                synchronized (this) {
                    try {
                        HashMap map = this.f37493a;
                        if (!map.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f37495c) : this.f37495c.getSharedPreferences(str, 0);
                            v vVar = new v(this, str);
                            map.put(str, vVar);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(vVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            b(new w(mapR));
        }
    }

    public final synchronized void b(w wVar) {
        this.f37494b.add(wVar);
    }
}
