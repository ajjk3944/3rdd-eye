package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y40 {

    /* renamed from: a, reason: collision with root package name */
    public final cg0 f18627a;

    /* renamed from: b, reason: collision with root package name */
    public final hq0 f18628b;

    /* renamed from: c, reason: collision with root package name */
    public final sr0 f18629c;

    /* renamed from: d, reason: collision with root package name */
    public final ce1 f18630d;

    /* renamed from: e, reason: collision with root package name */
    public final rj0 f18631e;

    /* renamed from: f, reason: collision with root package name */
    public final x70 f18632f;
    public dq0 g;

    /* renamed from: h, reason: collision with root package name */
    public final pq0 f18633h;

    /* renamed from: i, reason: collision with root package name */
    public final v50 f18634i;
    public final Executor j;

    /* renamed from: k, reason: collision with root package name */
    public final mg0 f18635k;

    /* renamed from: l, reason: collision with root package name */
    public final ei0 f18636l;

    public y40(cg0 cg0Var, hq0 hq0Var, sr0 sr0Var, ce1 ce1Var, rj0 rj0Var, x70 x70Var, dq0 dq0Var, pq0 pq0Var, v50 v50Var, ex exVar, mg0 mg0Var, ei0 ei0Var) {
        this.f18627a = cg0Var;
        this.f18628b = hq0Var;
        this.f18629c = sr0Var;
        this.f18630d = ce1Var;
        this.f18631e = rj0Var;
        this.f18632f = x70Var;
        this.g = dq0Var;
        this.f18633h = pq0Var;
        this.f18634i = v50Var;
        this.j = exVar;
        this.f18635k = mg0Var;
        this.f18636l = ei0Var;
    }

    public final pr0 a(vd.b bVar) {
        if (this.g != null) {
            sr0 sr0Var = this.f18629c;
            qr0 qr0Var = qr0.SERVER_TRANSACTION;
            Objects.requireNonNull(sr0Var);
            return new ai(sr0Var, qr0Var, null, sr0.f16524d, Collections.EMPTY_LIST, yo0.e(this.g)).t();
        }
        ai aiVar = ua.j.C.j;
        aiVar.getClass();
        pk pkVar = sk.X4;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            synchronized (aiVar.f9332c) {
                try {
                    aiVar.x();
                    ScheduledFuture scheduledFuture = (ScheduledFuture) aiVar.f9330a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    aiVar.f9330a = fx.f11277d.schedule((s) aiVar.f9331b, ((Long) sVar.f36166c.a(sk.Y4)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        return this.f18629c.a(qr0.SERVER_TRANSACTION, bVar).i(new fp(4, this.f18635k)).t();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020a A[Catch: all -> 0x00fd, TryCatch #8 {all -> 0x00fd, blocks: (B:31:0x009c, B:33:0x00bb, B:35:0x00c3, B:37:0x00d0, B:39:0x00e8, B:43:0x0114, B:46:0x011f, B:48:0x0127, B:50:0x012e, B:54:0x0137, B:63:0x016f, B:57:0x014b, B:62:0x015a, B:65:0x0174, B:42:0x0100, B:66:0x0188, B:73:0x01a7, B:76:0x01af, B:80:0x01d2, B:82:0x01e8, B:86:0x020a, B:88:0x0221, B:91:0x0235, B:93:0x023b, B:94:0x0248, B:96:0x024b, B:99:0x0254, B:98:0x0251, B:87:0x0214, B:83:0x01fb, B:79:0x01be, B:70:0x0196, B:71:0x019b), top: B:149:0x009c, inners: #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0214 A[Catch: all -> 0x00fd, TryCatch #8 {all -> 0x00fd, blocks: (B:31:0x009c, B:33:0x00bb, B:35:0x00c3, B:37:0x00d0, B:39:0x00e8, B:43:0x0114, B:46:0x011f, B:48:0x0127, B:50:0x012e, B:54:0x0137, B:63:0x016f, B:57:0x014b, B:62:0x015a, B:65:0x0174, B:42:0x0100, B:66:0x0188, B:73:0x01a7, B:76:0x01af, B:80:0x01d2, B:82:0x01e8, B:86:0x020a, B:88:0x0221, B:91:0x0235, B:93:0x023b, B:94:0x0248, B:96:0x024b, B:99:0x0254, B:98:0x0251, B:87:0x0214, B:83:0x01fb, B:79:0x01be, B:70:0x0196, B:71:0x019b), top: B:149:0x009c, inners: #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0233 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0251 A[Catch: all -> 0x00fd, TryCatch #8 {all -> 0x00fd, blocks: (B:31:0x009c, B:33:0x00bb, B:35:0x00c3, B:37:0x00d0, B:39:0x00e8, B:43:0x0114, B:46:0x011f, B:48:0x0127, B:50:0x012e, B:54:0x0137, B:63:0x016f, B:57:0x014b, B:62:0x015a, B:65:0x0174, B:42:0x0100, B:66:0x0188, B:73:0x01a7, B:76:0x01af, B:80:0x01d2, B:82:0x01e8, B:86:0x020a, B:88:0x0221, B:91:0x0235, B:93:0x023b, B:94:0x0248, B:96:0x024b, B:99:0x0254, B:98:0x0251, B:87:0x0214, B:83:0x01fb, B:79:0x01be, B:70:0x0196, B:71:0x019b), top: B:149:0x009c, inners: #6, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.pr0 b() {
        /*
            Method dump skipped, instructions count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y40.b():com.google.android.gms.internal.ads.pr0");
    }

    public final pr0 c(vd.b bVar) {
        ai aiVarI = this.f18629c.a(qr0.RENDERER, bVar).g(new fk0(19, this)).i(this.f18631e);
        pk pkVar = sk.f16320s6;
        va.s sVar = va.s.f36163e;
        if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            long jIntValue = ((Integer) sVar.f36166c.a(sk.f16337t6)).intValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aiVarI = aiVarI.s(jIntValue);
        }
        return aiVarI.t();
    }
}
