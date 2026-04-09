package Mi;

import Li.InterfaceC3220g;
import dh.C5385j;
import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
public interface o extends InterfaceC3220g {

    public static final class a {
        public static /* synthetic */ InterfaceC3220g a(o oVar, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                interfaceC5384i = C5385j.f46088a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                aVar = Ki.a.SUSPEND;
            }
            return oVar.d(interfaceC5384i, i10, aVar);
        }
    }

    InterfaceC3220g d(InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar);
}
