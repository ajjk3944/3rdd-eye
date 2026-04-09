package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m91 implements p81, c80, lr0 {

    /* renamed from: c, reason: collision with root package name */
    public static final m91 f13807c;

    /* renamed from: d, reason: collision with root package name */
    public static final m91 f13808d;

    /* renamed from: e, reason: collision with root package name */
    public static final m91 f13809e;

    /* renamed from: f, reason: collision with root package name */
    public static final m91 f13810f;
    public static final m91 g;

    /* renamed from: h, reason: collision with root package name */
    public static final m91 f13811h;

    /* renamed from: i, reason: collision with root package name */
    public static final m91 f13812i;
    public static final m91 j;

    /* renamed from: k, reason: collision with root package name */
    public static final m91 f13813k;

    /* renamed from: l, reason: collision with root package name */
    public static final m91 f13814l;

    /* renamed from: m, reason: collision with root package name */
    public static final m91 f13815m;

    /* renamed from: n, reason: collision with root package name */
    public static final m91 f13816n;

    /* renamed from: o, reason: collision with root package name */
    public static final m91 f13817o;

    /* renamed from: p, reason: collision with root package name */
    public static final m91 f13818p;

    /* renamed from: q, reason: collision with root package name */
    public static final m91 f13819q;

    /* renamed from: r, reason: collision with root package name */
    public static final m91 f13820r;

    /* renamed from: s, reason: collision with root package name */
    public static final m91 f13821s;

    /* renamed from: t, reason: collision with root package name */
    public static final m91 f13822t;

    /* renamed from: u, reason: collision with root package name */
    public static final m91 f13823u;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13824a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13825b;

    static {
        int i4 = 0;
        f13807c = new m91("ENABLED", i4);
        f13808d = new m91("DISABLED", i4);
        f13809e = new m91("DESTROYED", i4);
        int i10 = 1;
        f13810f = new m91("TINK", i10);
        g = new m91("CRUNCHY", i10);
        f13811h = new m91("NO_PREFIX", i10);
        int i11 = 2;
        f13812i = new m91("TINK", i11);
        j = new m91("CRUNCHY", i11);
        f13813k = new m91("NO_PREFIX", i11);
        int i12 = 3;
        f13814l = new m91("TINK", i12);
        f13815m = new m91("NO_PREFIX", i12);
        int i13 = 4;
        f13816n = new m91("TINK", i13);
        f13817o = new m91("CRUNCHY", i13);
        f13818p = new m91("LEGACY", i13);
        f13819q = new m91("NO_PREFIX", i13);
        int i14 = 5;
        f13820r = new m91("TINK", i14);
        f13821s = new m91("CRUNCHY", i14);
        f13822t = new m91("LEGACY", i14);
        f13823u = new m91("NO_PREFIX", i14);
    }

    public /* synthetic */ m91(String str, int i4) {
        this.f13824a = i4;
        this.f13825b = str;
    }

    @Override // com.google.android.gms.internal.ads.lr0
    /* renamed from: c */
    public Object mo170c(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.f13825b, Integer.toString(0)});
        return null;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        ua.j.C.f35265h.g(this.f13825b, th2);
    }

    public String toString() {
        switch (this.f13824a) {
            case 0:
                return this.f13825b;
            case 1:
                return this.f13825b;
            case 2:
                return this.f13825b;
            case 3:
                return this.f13825b;
            case 4:
                return this.f13825b;
            case 5:
                return this.f13825b;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public /* synthetic */ void mo162c(Object obj) {
        switch (this.f13824a) {
            case 7:
                ((j80) obj).g(this.f13825b);
                break;
            default:
                ((x80) obj).k(this.f13825b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
    }
}
