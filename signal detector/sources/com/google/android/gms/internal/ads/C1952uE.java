package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.uE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1952uE implements BD, InterfaceC1223gl, Eu {

    /* renamed from: C, reason: collision with root package name */
    public static final C1952uE f17080C;

    /* renamed from: c, reason: collision with root package name */
    public static final C1952uE f17081c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1952uE f17082d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1952uE f17083e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1952uE f17084f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1952uE f17085g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1952uE f17086h;
    public static final C1952uE i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1952uE f17087j;

    /* renamed from: k, reason: collision with root package name */
    public static final C1952uE f17088k;

    /* renamed from: l, reason: collision with root package name */
    public static final C1952uE f17089l;

    /* renamed from: m, reason: collision with root package name */
    public static final C1952uE f17090m;

    /* renamed from: n, reason: collision with root package name */
    public static final C1952uE f17091n;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17092a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17093b;

    static {
        int i3 = 0;
        f17081c = new C1952uE("SHA1", i3);
        f17082d = new C1952uE("SHA224", i3);
        f17083e = new C1952uE("SHA256", i3);
        f17084f = new C1952uE("SHA384", i3);
        f17085g = new C1952uE("SHA512", i3);
        int i6 = 1;
        f17086h = new C1952uE("TINK", i6);
        i = new C1952uE("CRUNCHY", i6);
        f17087j = new C1952uE("NO_PREFIX", i6);
        int i7 = 2;
        f17088k = new C1952uE("TINK", i7);
        f17089l = new C1952uE("NO_PREFIX", i7);
        int i8 = 3;
        f17090m = new C1952uE("SHA256", i8);
        f17091n = new C1952uE("SHA384", i8);
        f17080C = new C1952uE("SHA512", i8);
    }

    public /* synthetic */ C1952uE(String str, int i3) {
        this.f17092a = i3;
        this.f17093b = str;
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object b(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.f17093b, Integer.toString(0)});
        return null;
    }

    public String toString() {
        switch (this.f17092a) {
            case 0:
                return this.f17093b;
            case 1:
                return this.f17093b;
            case 2:
                return this.f17093b;
            case 3:
                return this.f17093b;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        p2.j.f22785C.f22795h.g(this.f17093b, th);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((InterfaceC1545ml) obj).c(this.f17093b);
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
    }
}
