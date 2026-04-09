package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Looper;
import com.yandex.mobile.ads.impl.i60;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.jz;
import com.yandex.mobile.ads.impl.n00;
import com.yandex.mobile.ads.impl.oa;
import com.yandex.mobile.ads.impl.tz;
import com.yandex.mobile.ads.impl.wz;

/* loaded from: classes3.dex */
public interface i60 extends bi1 {

    public interface a {
        void a();
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Context f28509a;

        /* renamed from: b, reason: collision with root package name */
        m32 f28510b;

        /* renamed from: c, reason: collision with root package name */
        h32<vo1> f28511c;

        /* renamed from: d, reason: collision with root package name */
        h32<jw0.a> f28512d;

        /* renamed from: e, reason: collision with root package name */
        h32<s52> f28513e;

        /* renamed from: f, reason: collision with root package name */
        h32<pr0> f28514f;

        /* renamed from: g, reason: collision with root package name */
        h32<pi> f28515g;

        /* renamed from: h, reason: collision with root package name */
        zd0<dp, xc> f28516h;
        Looper i;

        /* renamed from: j, reason: collision with root package name */
        ih f28517j;

        /* renamed from: k, reason: collision with root package name */
        int f28518k;

        /* renamed from: l, reason: collision with root package name */
        boolean f28519l;

        /* renamed from: m, reason: collision with root package name */
        uw1 f28520m;

        /* renamed from: n, reason: collision with root package name */
        wz f28521n;

        /* renamed from: o, reason: collision with root package name */
        long f28522o;

        /* renamed from: p, reason: collision with root package name */
        long f28523p;

        /* renamed from: q, reason: collision with root package name */
        boolean f28524q;

        /* renamed from: r, reason: collision with root package name */
        boolean f28525r;

        public b(final Context context) {
            this(context, new h32() { // from class: com.yandex.mobile.ads.impl.V0
                @Override // com.yandex.mobile.ads.impl.h32
                public final Object get() {
                    return i60.b.a(context);
                }
            }, new T0(context, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static jw0.a b(Context context) {
            return new b00(new jz.a(context, new tz.a()), new sz());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static s52 c(Context context) {
            return new n00(context, n00.c.a(context), new oa.b(0));
        }

        public final i60 a() {
            if (this.f28525r) {
                throw new IllegalStateException();
            }
            this.f28525r = true;
            return new m60(this);
        }

        private b(final Context context, h32<vo1> h32Var, h32<jw0.a> h32Var2) {
            this(context, h32Var, h32Var2, new T0(context, 0), new G0(1), new h32() { // from class: com.yandex.mobile.ads.impl.U0
                @Override // com.yandex.mobile.ads.impl.h32
                public final Object get() {
                    return ez.a(context);
                }
            }, new E0(3));
        }

        private b(Context context, h32<vo1> h32Var, h32<jw0.a> h32Var2, h32<s52> h32Var3, h32<pr0> h32Var4, h32<pi> h32Var5, zd0<dp, xc> zd0Var) {
            this.f28509a = context;
            this.f28511c = h32Var;
            this.f28512d = h32Var2;
            this.f28513e = h32Var3;
            this.f28514f = h32Var4;
            this.f28515g = h32Var5;
            this.f28516h = zd0Var;
            this.i = s82.c();
            this.f28517j = ih.f28660h;
            this.f28518k = 1;
            this.f28519l = true;
            this.f28520m = uw1.f34231c;
            this.f28521n = new wz.a().a();
            this.f28510b = dp.f26283a;
            this.f28522o = 500L;
            this.f28523p = 2000L;
            this.f28524q = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vo1 a(Context context) {
            return new g00(context);
        }
    }

    void a(am1 am1Var);
}
