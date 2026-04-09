package d5;

import android.content.Context;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7005a;

    /* renamed from: b, reason: collision with root package name */
    public final a5.x f7006b;

    /* renamed from: c, reason: collision with root package name */
    public final i f7007c;

    /* renamed from: d, reason: collision with root package name */
    public final i f7008d;

    /* renamed from: e, reason: collision with root package name */
    public ne.n f7009e;

    /* renamed from: f, reason: collision with root package name */
    public ne.n f7010f;

    /* renamed from: g, reason: collision with root package name */
    public ne.n f7011g;

    /* renamed from: h, reason: collision with root package name */
    public final Looper f7012h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.media3.common.f f7013i;
    public final int j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final x0 f7014l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7015m;

    /* renamed from: n, reason: collision with root package name */
    public final long f7016n;

    /* renamed from: o, reason: collision with root package name */
    public final com.google.android.exoplayer2.j f7017o;

    /* renamed from: p, reason: collision with root package name */
    public final long f7018p;

    /* renamed from: q, reason: collision with root package name */
    public final long f7019q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7020r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7021s;

    public k(Context context) {
        i iVar = new i(context, 0);
        i iVar2 = new i(context, 1);
        i iVar3 = new i(context, 2);
        j jVar = new j(0);
        i iVar4 = new i(context, 3);
        context.getClass();
        this.f7005a = context;
        this.f7007c = iVar;
        this.f7008d = iVar2;
        this.f7009e = iVar3;
        this.f7010f = jVar;
        this.f7011g = iVar4;
        int i10 = a5.d0.f105a;
        Looper looperMyLooper = Looper.myLooper();
        this.f7012h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f7013i = androidx.media3.common.f.B;
        this.j = 1;
        this.k = true;
        this.f7014l = x0.f7100c;
        this.f7015m = 5000L;
        this.f7016n = 15000L;
        this.f7017o = new com.google.android.exoplayer2.j(1, a5.d0.G(20L), a5.d0.G(500L));
        this.f7006b = a5.b.f92a;
        this.f7018p = 500L;
        this.f7019q = ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        this.f7020r = true;
    }
}
