package P6;

import android.content.Context;
import android.os.Process;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18091a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f18092b = new HashSet();

    o(Context context) {
        this.f18091a = context;
    }

    private boolean b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("permission is null");
        }
        if (this.f18092b.contains(str)) {
            return true;
        }
        boolean z10 = this.f18091a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        if (z10) {
            this.f18092b.add(str);
        }
        return z10;
    }

    boolean a(String[] strArr) {
        for (String str : strArr) {
            if (b(str)) {
                return true;
            }
        }
        return false;
    }
}
