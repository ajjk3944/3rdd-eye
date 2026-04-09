package org.kodein.di;

import Yg.y;
import java.util.List;
import java.util.Map;
import org.kodein.di.DI;
import rj.N5;

/* loaded from: classes4.dex */
public interface h {

    public static final class a {
        public static /* synthetic */ List a(h hVar, DI.e eVar, int i10, boolean z10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: find");
            }
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            return hVar.d(eVar, i10, z10);
        }
    }

    Map a();

    y b(DI.e eVar);

    List c();

    List d(DI.e eVar, int i10, boolean z10);

    List e(N5 n52);
}
