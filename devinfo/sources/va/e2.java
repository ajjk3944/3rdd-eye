package va;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.bh;
import com.google.android.gms.internal.ads.jf0;
import com.google.android.gms.internal.ads.yq;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: e, reason: collision with root package name */
    public a f36074e;

    /* renamed from: f, reason: collision with root package name */
    public pa.c f36075f;
    public pa.h[] g;

    /* renamed from: h, reason: collision with root package name */
    public qa.d f36076h;
    public pa.t j;

    /* renamed from: k, reason: collision with root package name */
    public String f36078k;

    /* renamed from: l, reason: collision with root package name */
    public final pa.k f36079l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f36080m;

    /* renamed from: n, reason: collision with root package name */
    public pa.n f36081n;

    /* renamed from: a, reason: collision with root package name */
    public final yq f36070a = new yq();

    /* renamed from: c, reason: collision with root package name */
    public final pa.s f36072c = new pa.s();

    /* renamed from: d, reason: collision with root package name */
    public final jf0 f36073d = new jf0(this);

    /* renamed from: o, reason: collision with root package name */
    public final AtomicLong f36082o = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final b3 f36071b = b3.f36034a;

    /* renamed from: i, reason: collision with root package name */
    public l0 f36077i = null;

    public e2(pa.k kVar) {
        this.f36079l = kVar;
        new AtomicBoolean(false);
    }

    public static c3 a(Context context, pa.h[] hVarArr) {
        for (pa.h hVar : hVarArr) {
            if (hVar.equals(pa.h.f31529l)) {
                return new c3("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        c3 c3Var = new c3(context, hVarArr);
        c3Var.j = false;
        return c3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[Catch: RemoteException -> 0x00d3, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d3, blocks: (B:28:0x00a0, B:30:0x00a6, B:32:0x00b4, B:34:0x00c6, B:37:0x00d5), top: B:54:0x00a0, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(va.d2 r13) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: va.e2.b(va.d2):void");
    }

    public final void c(a aVar) {
        try {
            this.f36074e = aVar;
            l0 l0Var = this.f36077i;
            if (l0Var != null) {
                l0Var.t0(aVar != null ? new p(aVar) : null);
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    public final void d(pa.h... hVarArr) {
        pa.k kVar = this.f36079l;
        this.g = hVarArr;
        try {
            l0 l0Var = this.f36077i;
            if (l0Var != null) {
                l0Var.j1(a(kVar.getContext(), this.g));
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
        kVar.requestLayout();
    }

    public final void e(qa.d dVar) {
        try {
            this.f36076h = dVar;
            l0 l0Var = this.f36077i;
            if (l0Var != null) {
                l0Var.X3(dVar != null ? new bh(dVar) : null);
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }
}
