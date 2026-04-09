package lk;

import ar.k;
import br.n;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final a f15540d = new a(1);

    @Override // ar.k
    public final Object a(Object obj) {
        return String.format("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(((Number) obj).byteValue() & 255)}, 1));
    }
}
