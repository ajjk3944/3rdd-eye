package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bx1;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface dw0 extends bx1 {

    public interface a extends bx1.a<dw0> {
        void a(dw0 dw0Var);
    }

    long a(long j4, uw1 uw1Var);

    long a(c70[] c70VarArr, boolean[] zArr, ft1[] ft1VarArr, boolean[] zArr2, long j4);

    void a(a aVar, long j4);

    void discardBuffer(long j4, boolean z10);

    m52 getTrackGroups();

    void maybeThrowPrepareError() throws IOException;

    long readDiscontinuity();

    long seekToUs(long j4);
}
