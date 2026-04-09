package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import f4.InterfaceFutureC2326a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import q2.C2841s;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.ep, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1118ep implements InterfaceC1711pp {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f13978h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    public final C1431kf f13979a;

    /* renamed from: b, reason: collision with root package name */
    public final ID f13980b;

    /* renamed from: c, reason: collision with root package name */
    public final C0960bu f13981c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f13982d;

    /* renamed from: e, reason: collision with root package name */
    public final C0514Fp f13983e;

    /* renamed from: f, reason: collision with root package name */
    public final Xu f13984f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f13985g;

    public C1118ep(Context context, C0960bu c0960bu, C1431kf c1431kf, ID id, ScheduledExecutorService scheduledExecutorService, C0514Fp c0514Fp, Xu xu) {
        this.f13985g = context;
        this.f13981c = c0960bu;
        this.f13979a = c1431kf;
        this.f13980b = id;
        this.f13982d = scheduledExecutorService;
        this.f13983e = c0514Fp;
        this.f13984f = xu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1711pp
    public final InterfaceFutureC2326a e(C1807re c1807re) {
        InterfaceFutureC2326a interfaceFutureC2326aD;
        C1431kf c1431kf = this.f13979a;
        ID id = (ID) c1431kf.f15174c;
        String str = c1807re.f16579d;
        C2911G c2911g = p2.j.f22785C.f22790c;
        if (C2911G.f(str)) {
            interfaceFutureC2326aD = AbstractC1984ut.w(new C1765qp(1));
        } else {
            interfaceFutureC2326aD = AbstractC1984ut.D(((C0623Mf) ((ID) c1431kf.f15173b)).b(new CallableC1890t6(c1431kf, 5, c1807re)), ExecutionException.class, C1704pi.f16202c, id);
        }
        OC ocD = AbstractC1984ut.D(interfaceFutureC2326aD, C1765qp.class, new C0900ap(c1431kf, c1807re, Binder.getCallingUid(), 0), id);
        Su suY = AbstractC1135f5.y(this.f13985g, 11);
        C1476lN.x(ocD, suY);
        YC ycF = AbstractC1984ut.F(ocD, new C0738Tb(6, this), this.f13980b);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.s6)).booleanValue()) {
            ycF = AbstractC1984ut.D(AbstractC1984ut.E(ycF, ((Integer) r2.f23270c.a(H9.t6)).intValue(), TimeUnit.SECONDS, this.f13982d), TimeoutException.class, C1704pi.f16203d, AbstractC0640Nf.f10011g);
        }
        C1476lN.I(ycF, this.f13984f, suY, false);
        ycF.a(new CD(ycF, 0, new Nx(19, this)), AbstractC0640Nf.f10011g);
        return ycF;
    }
}
