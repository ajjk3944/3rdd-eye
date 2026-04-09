package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Bj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0440Bj {

    /* renamed from: a, reason: collision with root package name */
    public final C1173fp f7394a;

    /* renamed from: b, reason: collision with root package name */
    public final C0960bu f7395b;

    /* renamed from: c, reason: collision with root package name */
    public final Mu f7396c;

    /* renamed from: d, reason: collision with root package name */
    public final C0697Ql f7397d;

    /* renamed from: e, reason: collision with root package name */
    public final C0753Tq f7398e;

    /* renamed from: f, reason: collision with root package name */
    public final C0951bl f7399f;

    /* renamed from: g, reason: collision with root package name */
    public Xt f7400g;

    /* renamed from: h, reason: collision with root package name */
    public final C1338iu f7401h;
    public final C0831Yj i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f7402j;

    /* renamed from: k, reason: collision with root package name */
    public final C1657op f7403k;

    /* renamed from: l, reason: collision with root package name */
    public final C1228gq f7404l;

    public C0440Bj(C1173fp c1173fp, C0960bu c0960bu, Mu mu, C0697Ql c0697Ql, C0753Tq c0753Tq, C0951bl c0951bl, Xt xt, C1338iu c1338iu, C0831Yj c0831Yj, C0623Mf c0623Mf, C1657op c1657op, C1228gq c1228gq) {
        this.f7394a = c1173fp;
        this.f7395b = c0960bu;
        this.f7396c = mu;
        this.f7397d = c0697Ql;
        this.f7398e = c0753Tq;
        this.f7399f = c0951bl;
        this.f7400g = xt;
        this.f7401h = c1338iu;
        this.i = c0831Yj;
        this.f7402j = c0623Mf;
        this.f7403k = c1657op;
        this.f7404l = c1228gq;
    }

    public final Ju a(InterfaceFutureC2326a interfaceFutureC2326a) {
        if (this.f7400g != null) {
            Mu mu = this.f7396c;
            Ku ku = Ku.SERVER_TRANSACTION;
            Objects.requireNonNull(mu);
            return new C1677p8(mu, ku, null, Mu.f9922d, Collections.EMPTY_LIST, AbstractC1984ut.e(this.f7400g)).u();
        }
        C1677p8 c1677p8 = p2.j.f22785C.f22796j;
        c1677p8.getClass();
        E9 e9 = H9.f8697X4;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            synchronized (c1677p8.f16139c) {
                try {
                    c1677p8.y();
                    ScheduledFuture scheduledFuture = (ScheduledFuture) c1677p8.f16137a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    c1677p8.f16137a = AbstractC0640Nf.f10008d.schedule((RunnableC1883t) c1677p8.f16138b, ((Long) c2841s.f23270c.a(H9.f8702Y4)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        return this.f7396c.a(interfaceFutureC2326a, Ku.SERVER_TRANSACTION).i(new C0738Tb(4, this.f7403k)).u();
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
    public final com.google.android.gms.internal.ads.Ju b() {
        /*
            Method dump skipped, instructions count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0440Bj.b():com.google.android.gms.internal.ads.Ju");
    }

    public final Ju c(InterfaceFutureC2326a interfaceFutureC2326a) {
        C1677p8 c1677p8I = this.f7396c.a(interfaceFutureC2326a, Ku.RENDERER).g(new Rx(14, this)).i(this.f7398e);
        E9 e9 = H9.s6;
        C2841s c2841s = C2841s.f23267e;
        if (!((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            long jIntValue = ((Integer) c2841s.f23270c.a(H9.t6)).intValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c1677p8I = c1677p8I.t(jIntValue);
        }
        return c1677p8I.u();
    }
}
