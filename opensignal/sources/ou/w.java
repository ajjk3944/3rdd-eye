package ou;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import lf.t1;
import p.l2;

/* loaded from: classes.dex */
public final class w {
    public l2 A;

    /* renamed from: a, reason: collision with root package name */
    public js.e f19980a = new js.e(8);

    /* renamed from: b, reason: collision with root package name */
    public i.g0 f19981b = new i.g0(28);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f19982c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f19983d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public io.sentry.android.replay.capture.e f19984e = new io.sentry.android.replay.capture.e(23, p.f19959a);

    /* renamed from: f, reason: collision with root package name */
    public boolean f19985f = true;

    /* renamed from: g, reason: collision with root package name */
    public b f19986g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19987h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19988i;
    public b j;
    public g k;

    /* renamed from: l, reason: collision with root package name */
    public b f19989l;

    /* renamed from: m, reason: collision with root package name */
    public ProxySelector f19990m;

    /* renamed from: n, reason: collision with root package name */
    public b f19991n;

    /* renamed from: o, reason: collision with root package name */
    public SocketFactory f19992o;

    /* renamed from: p, reason: collision with root package name */
    public SSLSocketFactory f19993p;

    /* renamed from: q, reason: collision with root package name */
    public X509TrustManager f19994q;

    /* renamed from: r, reason: collision with root package name */
    public List f19995r;

    /* renamed from: s, reason: collision with root package name */
    public List f19996s;

    /* renamed from: t, reason: collision with root package name */
    public HostnameVerifier f19997t;

    /* renamed from: u, reason: collision with root package name */
    public j f19998u;

    /* renamed from: v, reason: collision with root package name */
    public t1 f19999v;

    /* renamed from: w, reason: collision with root package name */
    public int f20000w;

    /* renamed from: x, reason: collision with root package name */
    public int f20001x;

    /* renamed from: y, reason: collision with root package name */
    public int f20002y;

    /* renamed from: z, reason: collision with root package name */
    public long f20003z;

    public w() {
        b bVar = b.f19866a;
        this.f19986g = bVar;
        this.f19987h = true;
        this.f19988i = true;
        this.j = b.f19867b;
        this.f19989l = b.f19868c;
        this.f19991n = bVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        br.l.d(socketFactory, "getDefault()");
        this.f19992o = socketFactory;
        this.f19995r = x.Y;
        this.f19996s = x.X;
        this.f19997t = bv.c.f2998a;
        this.f19998u = j.f19921c;
        this.f20000w = 10000;
        this.f20001x = 10000;
        this.f20002y = 10000;
        this.f20003z = 1024L;
    }
}
