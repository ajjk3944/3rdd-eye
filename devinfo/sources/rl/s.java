package rl;

import a0.x0;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public nm.d0 f33136b;

    /* renamed from: e, reason: collision with root package name */
    public final pf.u f33139e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33140f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final b f33141h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f33142i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final b f33143k;

    /* renamed from: l, reason: collision with root package name */
    public final b f33144l;

    /* renamed from: m, reason: collision with root package name */
    public final b f33145m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f33146n;

    /* renamed from: o, reason: collision with root package name */
    public final List f33147o;

    /* renamed from: p, reason: collision with root package name */
    public final List f33148p;

    /* renamed from: q, reason: collision with root package name */
    public final fm.c f33149q;

    /* renamed from: r, reason: collision with root package name */
    public final e f33150r;

    /* renamed from: s, reason: collision with root package name */
    public int f33151s;

    /* renamed from: t, reason: collision with root package name */
    public int f33152t;

    /* renamed from: u, reason: collision with root package name */
    public int f33153u;

    /* renamed from: a, reason: collision with root package name */
    public final x0 f33135a = new x0(29);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f33137c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f33138d = new ArrayList();

    public s() {
        TimeZone timeZone = sl.h.f33837a;
        this.f33139e = new pf.u(16);
        this.f33140f = true;
        this.g = true;
        b bVar = b.f33032b;
        this.f33141h = bVar;
        this.f33142i = true;
        this.j = true;
        this.f33143k = b.f33033c;
        this.f33144l = b.f33034d;
        this.f33145m = bVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        nk.k.d(socketFactory, "getDefault(...)");
        this.f33146n = socketFactory;
        this.f33147o = t.C;
        this.f33148p = t.B;
        this.f33149q = fm.c.f24093a;
        this.f33150r = e.f33055c;
        this.f33151s = 10000;
        this.f33152t = 10000;
        this.f33153u = 10000;
    }
}
