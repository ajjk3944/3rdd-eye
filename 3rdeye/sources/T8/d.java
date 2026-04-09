package t8;

import c9.C2097r;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: BasePerformanceDataClass.kt */
/* loaded from: classes3.dex */
public class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence listToCsv$lambda$0(String it) {
        l.f(it, "it");
        return it;
    }

    public final String booleanToString(boolean z10) {
        return z10 ? "true" : "false";
    }

    public final long calculateDuration(long j4, long j10) {
        if (j10 == 0 || j4 == 0) {
            return 0L;
        }
        return j4 - j10;
    }

    public final String listToCsv(List<String> list) {
        l.f(list, "list");
        return C2097r.u0(list, null, null, null, new A8.d(3), 31);
    }
}
