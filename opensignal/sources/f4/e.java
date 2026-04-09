package f4;

import android.content.SharedPreferences;
import br.l;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8441a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f8442b;

    public e(SharedPreferences sharedPreferences, Set set) {
        l.e(sharedPreferences, "prefs");
        this.f8441a = sharedPreferences;
        this.f8442b = set;
    }
}
