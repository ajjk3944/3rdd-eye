package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yandex.mobile.ads.impl.e32;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class i42 extends mk implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    private int f28472A;

    /* renamed from: B, reason: collision with root package name */
    private long f28473B;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f28474n;

    /* renamed from: o, reason: collision with root package name */
    private final h42 f28475o;

    /* renamed from: p, reason: collision with root package name */
    private final e32 f28476p;

    /* renamed from: q, reason: collision with root package name */
    private final ec0 f28477q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f28478r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f28479s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f28480t;

    /* renamed from: u, reason: collision with root package name */
    private int f28481u;

    /* renamed from: v, reason: collision with root package name */
    private dc0 f28482v;

    /* renamed from: w, reason: collision with root package name */
    private c32 f28483w;

    /* renamed from: x, reason: collision with root package name */
    private f32 f28484x;

    /* renamed from: y, reason: collision with root package name */
    private g32 f28485y;

    /* renamed from: z, reason: collision with root package name */
    private g32 f28486z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i42(h42 h42Var, Looper looper) {
        super(3);
        e32 e32Var = e32.f26657a;
        this.f28475o = (h42) zf.a(h42Var);
        this.f28474n = looper == null ? null : s82.a(looper, (Handler.Callback) this);
        this.f28476p = e32Var;
        this.f28477q = new ec0();
        this.f28473B = -9223372036854775807L;
    }

    private void A() {
        this.f28484x = null;
        this.f28472A = -1;
        g32 g32Var = this.f28485y;
        if (g32Var != null) {
            g32Var.h();
            this.f28485y = null;
        }
        g32 g32Var2 = this.f28486z;
        if (g32Var2 != null) {
            g32Var2.h();
            this.f28486z = null;
        }
    }

    private void B() {
        A();
        c32 c32Var = this.f28483w;
        c32Var.getClass();
        c32Var.release();
        this.f28483w = null;
        this.f28481u = 0;
    }

    private long y() {
        if (this.f28472A == -1) {
            return Long.MAX_VALUE;
        }
        this.f28485y.getClass();
        if (this.f28472A >= this.f28485y.a()) {
            return Long.MAX_VALUE;
        }
        return this.f28485y.a(this.f28472A);
    }

    private void z() {
        this.f28480t = true;
        e32 e32Var = this.f28476p;
        dc0 dc0Var = this.f28482v;
        dc0Var.getClass();
        this.f28483w = ((e32.a) e32Var).a(dc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.mk, com.yandex.mobile.ads.impl.so1
    public final boolean a() {
        return this.f28479s;
    }

    public final void c(long j4) {
        if (!k()) {
            throw new IllegalStateException();
        }
        this.f28473B = j4;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final boolean d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.so1, com.yandex.mobile.ads.impl.to1
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List<av> list = (List) message.obj;
        this.f28475o.onCues(list);
        this.f28475o.a(new cv(list));
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void u() {
        this.f28482v = null;
        this.f28473B = -9223372036854775807L;
        List<av> list = Collections.EMPTY_LIST;
        Handler handler = this.f28474n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            this.f28475o.onCues(list);
            this.f28475o.a(new cv(list));
        }
        B();
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void a(long j4, boolean z10) {
        List<av> list = Collections.EMPTY_LIST;
        Handler handler = this.f28474n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            this.f28475o.onCues(list);
            this.f28475o.a(new cv(list));
        }
        this.f28478r = false;
        this.f28479s = false;
        this.f28473B = -9223372036854775807L;
        if (this.f28481u != 0) {
            B();
            z();
        } else {
            A();
            c32 c32Var = this.f28483w;
            c32Var.getClass();
            c32Var.flush();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void a(dc0[] dc0VarArr, long j4, long j10) {
        this.f28482v = dc0VarArr[0];
        if (this.f28483w != null) {
            this.f28481u = 1;
        } else {
            z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    @Override // com.yandex.mobile.ads.impl.so1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r11, long r13) throws com.yandex.mobile.ads.impl.ly {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.i42.a(long, long):void");
    }

    @Override // com.yandex.mobile.ads.impl.to1
    public final int a(dc0 dc0Var) {
        if (((e32.a) this.f28476p).b(dc0Var)) {
            return P3.b(dc0Var.f26071F == 0 ? 4 : 2, 0, 0);
        }
        if (k01.e(dc0Var.f26083m)) {
            return P3.b(1, 0, 0);
        }
        return P3.b(0, 0, 0);
    }
}
