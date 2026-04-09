package dd;

/* renamed from: dd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5347a {

    /* renamed from: dd.a$a, reason: collision with other inner class name */
    public static final class C1716a {
        public static /* synthetic */ gg.i a(InterfaceC5347a interfaceC5347a, String str, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stats");
            }
            if ((i12 & 2) != 0) {
                i10 = 3000;
            }
            if ((i12 & 4) != 0) {
                i11 = 1000;
            }
            return interfaceC5347a.a(str, i10, i11);
        }
    }

    gg.i a(String str, int i10, int i11);
}
