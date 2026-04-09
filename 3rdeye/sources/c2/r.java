package c2;

import c9.C2097r;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;

/* compiled from: RawQueries.kt */
/* loaded from: classes.dex */
public final class r {
    public static final void a(StringBuilder sb, int i) {
        if (i <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i10 = 0; i10 < i; i10++) {
            arrayList.add("?");
        }
        sb.append(C2097r.u0(arrayList, StringUtils.COMMA, null, null, null, 62));
    }
}
