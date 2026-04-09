package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.yandex.mobile.ads.impl.aj0;

/* loaded from: classes3.dex */
public final class yc1 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f35708c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    private static volatile yc1 f35709d;

    /* renamed from: a, reason: collision with root package name */
    private final yy1 f35710a;

    /* renamed from: b, reason: collision with root package name */
    private final b82 f35711b;

    public static final class a {
        private a() {
        }

        public final yc1 a(Context context) {
            yc1 yc1Var;
            kotlin.jvm.internal.l.f(context, "context");
            yc1 yc1Var2 = yc1.f35709d;
            if (yc1Var2 != null) {
                return yc1Var2;
            }
            synchronized (this) {
                yc1Var = yc1.f35709d;
                if (yc1Var == null) {
                    yc1Var = new yc1(context);
                    yc1.f35709d = yc1Var;
                }
            }
            return yc1Var;
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    public interface c {
        void a(String str, Bitmap bitmap);
    }

    public /* synthetic */ yc1(Context context) {
        this(context, new si0());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.yandex.mobile.ads.impl.cq1 b(android.content.Context r2) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l.f(r2, r0)
            com.yandex.mobile.ads.impl.ew1 r0 = com.yandex.mobile.ads.impl.ew1.a.a()
            com.yandex.mobile.ads.impl.du1 r0 = r0.a(r2)
            if (r0 == 0) goto L24
            java.lang.Integer r0 = r0.A()
            if (r0 == 0) goto L24
            int r1 = r0.intValue()
            if (r1 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L24
            int r0 = r0.intValue()
            goto L25
        L24:
            r0 = 4
        L25:
            com.yandex.mobile.ads.impl.cq1 r2 = com.yandex.mobile.ads.impl.dq1.a(r2, r0)
            r2.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yc1.b(android.content.Context):com.yandex.mobile.ads.impl.cq1");
    }

    public final b82 c() {
        return this.f35711b;
    }

    public static final class b implements aj0.b {

        /* renamed from: a, reason: collision with root package name */
        private final LruCache<String, Bitmap> f35712a;

        public b(zc1 imageCache) {
            kotlin.jvm.internal.l.f(imageCache, "imageCache");
            this.f35712a = imageCache;
        }

        @Override // com.yandex.mobile.ads.impl.aj0.b
        public final Bitmap a(String key) {
            kotlin.jvm.internal.l.f(key, "key");
            return this.f35712a.get(key);
        }

        @Override // com.yandex.mobile.ads.impl.aj0.b
        public final void a(String key, Bitmap bitmap) {
            kotlin.jvm.internal.l.f(key, "key");
            kotlin.jvm.internal.l.f(bitmap, "bitmap");
            this.f35712a.put(key, bitmap);
        }
    }

    private static zc1 a(Context context) {
        int i;
        kotlin.jvm.internal.l.f(context, "context");
        try {
            int iMaxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
            i = iMaxMemory / 8;
            int i10 = ((int) (((r6.widthPixels * r6.heightPixels) * context.getResources().getDisplayMetrics().density) / 1024)) * 3;
            if (i > i10) {
                i = i10;
            }
        } catch (IllegalArgumentException unused) {
            int i11 = fp0.f27419b;
            i = 5120;
        }
        return new zc1(i >= 5120 ? i : 5120);
    }

    private yc1(Context context, si0 si0Var) {
        zc1 zc1VarA = a(context);
        cq1 cq1VarB = b(context);
        b bVar = new b(zc1VarA);
        this.f35711b = new b82(zc1VarA, si0Var);
        this.f35710a = new yy1(cq1VarB, bVar, si0Var);
    }

    public final yy1 b() {
        return this.f35710a;
    }
}
