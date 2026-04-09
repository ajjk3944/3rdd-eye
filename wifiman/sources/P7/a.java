package P7;

import gg.AbstractC5912b;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: P7.a$a, reason: collision with other inner class name */
    public static final class C0633a {
        public static /* synthetic */ void a(a aVar, b bVar, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setScreen");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            aVar.c(bVar, str);
        }
    }

    AbstractC5912b a(String str);

    void b(c cVar);

    void c(b bVar, String str);

    AbstractC5912b d(c cVar);
}
