package t2;

import android.content.SharedPreferences;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class y implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f23662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2905A f23663b;

    public y(C2905A c2905a, String str) {
        Objects.requireNonNull(c2905a);
        this.f23663b = c2905a;
        this.f23662a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C2905A c2905a = this.f23663b;
        synchronized (c2905a) {
            try {
                ArrayList arrayList = c2905a.f23538b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str2 = this.f23662a;
                    HashMap map = ((z) obj).f23664a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        p2.j.f22785C.f22795h.i().F(false);
                    }
                }
            } finally {
            }
        }
    }
}
