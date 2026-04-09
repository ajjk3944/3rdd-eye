package ii;

import Bh.InterfaceC2498h;
import java.util.Collection;
import mh.InterfaceC6835l;

/* renamed from: ii.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6167n {

    /* renamed from: ii.n$a */
    public static final class a {
        public static /* synthetic */ Collection a(InterfaceC6167n interfaceC6167n, C6157d c6157d, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i10 & 1) != 0) {
                c6157d = C6157d.f49194o;
            }
            if ((i10 & 2) != 0) {
                interfaceC6835l = InterfaceC6164k.f49220a.c();
            }
            return interfaceC6167n.e(c6157d, interfaceC6835l);
        }
    }

    Collection e(C6157d c6157d, InterfaceC6835l interfaceC6835l);

    InterfaceC2498h g(Zh.f fVar, Ih.b bVar);
}
