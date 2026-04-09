package mi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f16778d = new a0(1);

    @Override // ar.k
    public final Object a(Object obj) {
        return String.format("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(((Number) obj).byteValue() & 255)}, 1));
    }
}
