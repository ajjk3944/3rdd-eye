package h4;

import ar.k;
import br.l;
import br.n;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final a f9889d = new a(1);

    @Override // ar.k
    public final Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        l.e(entry, "entry");
        Object value = entry.getValue();
        return h0.b.s(new StringBuilder("  "), ((e) entry.getKey()).f9895a, " = ", value instanceof byte[] ? mq.l.t0((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
    }
}
