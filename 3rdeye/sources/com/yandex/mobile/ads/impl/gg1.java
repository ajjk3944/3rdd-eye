package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public interface gg1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27683a = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f27684a = new a();

        private a() {
        }

        public static gg1 a(boolean z10) {
            return new hg1(z10, new Handler(Looper.getMainLooper()));
        }
    }

    void a(long j4, ig1 ig1Var);

    void a(z42 z42Var);

    void invalidate();

    void pause();

    void resume();

    void stop();
}
