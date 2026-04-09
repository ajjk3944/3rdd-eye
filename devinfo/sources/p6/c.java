package p6;

import android.os.Build;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f31377c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f31378a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31379b;

    public c(String str, String str2) {
        this.f31378a = str;
        this.f31379b = str2;
        f31377c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f31375a;
        String str = this.f31379b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
