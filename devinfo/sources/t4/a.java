package t4;

import java.util.Map;
import nk.k;
import nk.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34164a = new a(1);

    @Override // mk.c
    public final Object invoke(Object obj) {
        String strValueOf;
        Map.Entry entry = (Map.Entry) obj;
        k.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "[");
            int i4 = 0;
            for (byte b10 : (byte[]) value) {
                i4++;
                if (i4 > 1) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append((CharSequence) String.valueOf((int) b10));
            }
            sb2.append((CharSequence) "]");
            strValueOf = sb2.toString();
        } else {
            strValueOf = String.valueOf(entry.getValue());
        }
        return r5.c.m(new StringBuilder("  "), ((d) entry.getKey()).f34168a, " = ", strValueOf);
    }
}
