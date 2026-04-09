package ya;

import android.content.SharedPreferences;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f37490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f37491b;

    public v(x xVar, String str) {
        Objects.requireNonNull(xVar);
        this.f37491b = xVar;
        this.f37490a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        x xVar = this.f37491b;
        synchronized (xVar) {
            try {
                ArrayList arrayList = xVar.f37494b;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    String str2 = this.f37490a;
                    HashMap map = ((w) obj).f37492a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        ua.j.C.f35265h.i().F(false);
                    }
                }
            } finally {
            }
        }
    }
}
