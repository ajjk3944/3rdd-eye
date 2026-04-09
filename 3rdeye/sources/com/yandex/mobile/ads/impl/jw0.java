package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface jw0 {

    public interface a {
    }

    public static final class b extends fw0 {
        public b(int i, long j4, Object obj) {
            super(i, j4, obj);
        }

        public b(fw0 fw0Var) {
            super(fw0Var);
        }

        public b(Object obj) {
            super(obj);
        }

        public b(Object obj, int i, int i10, long j4) {
            super(obj, i, i10, j4);
        }

        public b(Object obj, long j4) {
            super(obj, j4);
        }
    }

    public interface c {
        void a(jw0 jw0Var, v42 v42Var);
    }

    dw0 a(b bVar, vc vcVar, long j4);

    void a(Handler handler, c40 c40Var);

    void a(Handler handler, kw0 kw0Var);

    void a(c40 c40Var);

    void a(dw0 dw0Var);

    void a(c cVar);

    void a(c cVar, q62 q62Var, gi1 gi1Var);

    void a(kw0 kw0Var);

    void b(c cVar);

    void c(c cVar);

    xv0 getMediaItem();

    void maybeThrowSourceInfoRefreshError() throws IOException;
}
