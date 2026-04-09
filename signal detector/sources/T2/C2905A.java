package t2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.H9;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import q2.C2841s;

/* renamed from: t2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2905A {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23537a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23538b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f23539c;

    public C2905A(Context context) {
        this.f23539c = context;
    }

    public final void a() {
        E9 e9 = H9.Fb;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            C2911G c2911g = p2.j.f22785C.f22790c;
            HashMap mapR = C2911G.R((String) c2841s.f23270c.a(H9.Kb));
            for (String str : mapR.keySet()) {
                synchronized (this) {
                    try {
                        HashMap map = this.f23537a;
                        if (!map.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f23539c) : this.f23539c.getSharedPreferences(str, 0);
                            y yVar = new y(this, str);
                            map.put(str, yVar);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(yVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            b(new z(mapR));
        }
    }

    public final synchronized void b(z zVar) {
        this.f23538b.add(zVar);
    }
}
