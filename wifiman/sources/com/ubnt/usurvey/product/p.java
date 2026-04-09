package com.ubnt.usurvey.product;

import gg.AbstractC5912b;

/* loaded from: classes3.dex */
public interface p {

    public static final class a {
        public static /* synthetic */ AbstractC5912b a(p pVar, boolean z10, long j10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncIfNecessary");
            }
            if ((i10 & 2) != 0) {
                j10 = O7.f.f17623a.a();
            }
            return pVar.a(z10, j10);
        }
    }

    AbstractC5912b a(boolean z10, long j10);
}
