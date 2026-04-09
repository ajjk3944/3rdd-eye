package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class d01 extends mk implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    private final a01 f25901n;

    /* renamed from: o, reason: collision with root package name */
    private final c01 f25902o;

    /* renamed from: p, reason: collision with root package name */
    private final Handler f25903p;

    /* renamed from: q, reason: collision with root package name */
    private final b01 f25904q;

    /* renamed from: r, reason: collision with root package name */
    private zz0 f25905r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f25906s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f25907t;

    /* renamed from: u, reason: collision with root package name */
    private long f25908u;

    /* renamed from: v, reason: collision with root package name */
    private long f25909v;

    /* renamed from: w, reason: collision with root package name */
    private yz0 f25910w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d01(c01 c01Var, Looper looper) {
        super(5);
        a01 a01Var = a01.f24355a;
        this.f25902o = (c01) zf.a(c01Var);
        this.f25903p = looper == null ? null : s82.a(looper, (Handler.Callback) this);
        this.f25901n = (a01) zf.a(a01Var);
        this.f25904q = new b01();
        this.f25909v = -9223372036854775807L;
    }

    private void a(yz0 yz0Var, ArrayList arrayList) {
        for (int i = 0; i < yz0Var.c(); i++) {
            dc0 dc0VarA = yz0Var.a(i).a();
            if (dc0VarA == null || !this.f25901n.a(dc0VarA)) {
                arrayList.add(yz0Var.a(i));
            } else {
                hy1 hy1VarB = this.f25901n.b(dc0VarA);
                byte[] bArrB = yz0Var.a(i).b();
                bArrB.getClass();
                this.f25904q.b();
                this.f25904q.e(bArrB.length);
                ByteBuffer byteBuffer = this.f25904q.f30572d;
                int i10 = s82.f32899a;
                byteBuffer.put(bArrB);
                this.f25904q.h();
                yz0 yz0VarA = hy1VarB.a(this.f25904q);
                if (yz0VarA != null) {
                    a(yz0VarA, arrayList);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final boolean d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.so1, com.yandex.mobile.ads.impl.to1
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f25902o.a((yz0) message.obj);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void u() {
        this.f25910w = null;
        this.f25909v = -9223372036854775807L;
        this.f25905r = null;
    }

    @Override // com.yandex.mobile.ads.impl.mk, com.yandex.mobile.ads.impl.so1
    public final boolean a() {
        return this.f25907t;
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void a(long j4, boolean z10) {
        this.f25910w = null;
        this.f25909v = -9223372036854775807L;
        this.f25906s = false;
        this.f25907t = false;
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void a(dc0[] dc0VarArr, long j4, long j10) {
        this.f25905r = this.f25901n.b(dc0VarArr[0]);
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(long j4, long j10) {
        boolean z10;
        do {
            z10 = false;
            if (!this.f25906s && this.f25910w == null) {
                this.f25904q.b();
                ec0 ec0VarQ = q();
                int iA = a(ec0VarQ, this.f25904q, 0);
                if (iA == -4) {
                    if (this.f25904q.f()) {
                        this.f25906s = true;
                    } else {
                        b01 b01Var = this.f25904q;
                        b01Var.f25039j = this.f25908u;
                        b01Var.h();
                        zz0 zz0Var = this.f25905r;
                        int i = s82.f32899a;
                        yz0 yz0VarA = zz0Var.a(this.f25904q);
                        if (yz0VarA != null) {
                            ArrayList arrayList = new ArrayList(yz0VarA.c());
                            a(yz0VarA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f25910w = new yz0(arrayList);
                                this.f25909v = this.f25904q.f30574f;
                            }
                        }
                    }
                } else if (iA == -5) {
                    dc0 dc0Var = ec0VarQ.f26789b;
                    dc0Var.getClass();
                    this.f25908u = dc0Var.f26087q;
                }
            }
            yz0 yz0Var = this.f25910w;
            if (yz0Var != null && this.f25909v <= j4) {
                Handler handler = this.f25903p;
                if (handler != null) {
                    handler.obtainMessage(0, yz0Var).sendToTarget();
                } else {
                    this.f25902o.a(yz0Var);
                }
                this.f25910w = null;
                this.f25909v = -9223372036854775807L;
                z10 = true;
            }
            if (this.f25906s && this.f25910w == null) {
                this.f25907t = true;
            }
        } while (z10);
    }

    @Override // com.yandex.mobile.ads.impl.to1
    public final int a(dc0 dc0Var) {
        if (this.f25901n.a(dc0Var)) {
            return P3.b(dc0Var.f26071F == 0 ? 4 : 2, 0, 0);
        }
        return P3.b(0, 0, 0);
    }
}
