package U0;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class c implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f3667c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f3668a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3669b;

    public c(String str, String str2) {
        this.f3668a = str;
        this.f3669b = str2;
        f3667c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f3665a;
        String str = this.f3669b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
