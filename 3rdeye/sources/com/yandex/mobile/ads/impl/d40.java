package com.yandex.mobile.ads.impl;

import android.os.Looper;
import com.facebook.ads.AdError;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.c40;

/* loaded from: classes3.dex */
public interface d40 {

    /* renamed from: a, reason: collision with root package name */
    public static final d40 f25945a = new a();

    public class a implements d40 {
        @Override // com.yandex.mobile.ads.impl.d40
        public final /* synthetic */ b a(c40.a aVar, dc0 dc0Var) {
            return X.a(this, aVar, dc0Var);
        }

        @Override // com.yandex.mobile.ads.impl.d40
        public final b40 b(c40.a aVar, dc0 dc0Var) {
            if (dc0Var.f26086p == null) {
                return null;
            }
            return new p50(new b40.a(new y72(), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // com.yandex.mobile.ads.impl.d40
        public final /* synthetic */ void prepare() {
            X.b(this);
        }

        @Override // com.yandex.mobile.ads.impl.d40
        public final /* synthetic */ void release() {
            X.c(this);
        }

        @Override // com.yandex.mobile.ads.impl.d40
        public final void a(Looper looper, gi1 gi1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.d40
        public final int a(dc0 dc0Var) {
            return dc0Var.f26086p != null ? 1 : 0;
        }
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f25946a = new S1(1);

        void release();
    }

    int a(dc0 dc0Var);

    b a(c40.a aVar, dc0 dc0Var);

    void a(Looper looper, gi1 gi1Var);

    b40 b(c40.a aVar, dc0 dc0Var);

    void prepare();

    void release();
}
