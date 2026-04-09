package com.ui.wmw.wifi;

import gg.AbstractC5912b;
import h9.C5969a;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final C5969a f45520a;

    /* renamed from: b, reason: collision with root package name */
    private final String f45521b;

    /* renamed from: c, reason: collision with root package name */
    private final S8.c f45522c;

    /* renamed from: d, reason: collision with root package name */
    private final int f45523d;

    /* renamed from: e, reason: collision with root package name */
    private final int f45524e;

    /* renamed from: f, reason: collision with root package name */
    private final int f45525f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f45526g;

    /* renamed from: h, reason: collision with root package name */
    private final S8.d f45527h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f45528i;

    /* renamed from: j, reason: collision with root package name */
    private final S8.l f45529j;

    /* renamed from: k, reason: collision with root package name */
    private final int f45530k;

    /* renamed from: l, reason: collision with root package name */
    private final Integer f45531l;

    /* renamed from: m, reason: collision with root package name */
    private final Integer f45532m;

    /* renamed from: n, reason: collision with root package name */
    private final Boolean f45533n;

    /* renamed from: o, reason: collision with root package name */
    private final Float f45534o;

    /* renamed from: p, reason: collision with root package name */
    private final Integer f45535p;

    /* renamed from: q, reason: collision with root package name */
    private final S8.a f45536q;

    /* renamed from: r, reason: collision with root package name */
    private final S8.j f45537r;

    /* renamed from: s, reason: collision with root package name */
    private final Set f45538s;

    /* renamed from: t, reason: collision with root package name */
    private final long f45539t;

    /* renamed from: com.ui.wmw.wifi.a$a, reason: collision with other inner class name */
    public interface InterfaceC1679a {
        gg.i a();

        gg.i b();

        AbstractC5912b c(Set set);
    }

    public a(C5969a bssid, String str, S8.c band, int i10, int i11, int i12, Integer num, S8.d bandwidth, Set supportedChannelWidths, S8.l signal, int i13, Integer num2, Integer num3, Boolean bool, Float f10, Integer num4, S8.a ieeeMode, S8.j jVar, Set set, long j10) {
        AbstractC6492s.i(bssid, "bssid");
        AbstractC6492s.i(band, "band");
        AbstractC6492s.i(bandwidth, "bandwidth");
        AbstractC6492s.i(supportedChannelWidths, "supportedChannelWidths");
        AbstractC6492s.i(signal, "signal");
        AbstractC6492s.i(ieeeMode, "ieeeMode");
        this.f45520a = bssid;
        this.f45521b = str;
        this.f45522c = band;
        this.f45523d = i10;
        this.f45524e = i11;
        this.f45525f = i12;
        this.f45526g = num;
        this.f45527h = bandwidth;
        this.f45528i = supportedChannelWidths;
        this.f45529j = signal;
        this.f45530k = i13;
        this.f45531l = num2;
        this.f45532m = num3;
        this.f45533n = bool;
        this.f45534o = f10;
        this.f45535p = num4;
        this.f45536q = ieeeMode;
        this.f45537r = jVar;
        this.f45538s = set;
        this.f45539t = j10;
    }

    public final S8.c a() {
        return this.f45522c;
    }

    public final S8.d b() {
        return this.f45527h;
    }

    public final C5969a c() {
        return this.f45520a;
    }

    public final int d() {
        return this.f45524e;
    }

    public final int e() {
        return this.f45525f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f45520a, aVar.f45520a) && AbstractC6492s.d(this.f45521b, aVar.f45521b) && this.f45522c == aVar.f45522c && this.f45523d == aVar.f45523d && this.f45524e == aVar.f45524e && this.f45525f == aVar.f45525f && AbstractC6492s.d(this.f45526g, aVar.f45526g) && this.f45527h == aVar.f45527h && AbstractC6492s.d(this.f45528i, aVar.f45528i) && AbstractC6492s.d(this.f45529j, aVar.f45529j) && this.f45530k == aVar.f45530k && AbstractC6492s.d(this.f45531l, aVar.f45531l) && AbstractC6492s.d(this.f45532m, aVar.f45532m) && AbstractC6492s.d(this.f45533n, aVar.f45533n) && AbstractC6492s.d(this.f45534o, aVar.f45534o) && AbstractC6492s.d(this.f45535p, aVar.f45535p) && this.f45536q == aVar.f45536q && AbstractC6492s.d(this.f45537r, aVar.f45537r) && AbstractC6492s.d(this.f45538s, aVar.f45538s) && this.f45539t == aVar.f45539t;
    }

    public final Integer f() {
        return this.f45526g;
    }

    public final Float g() {
        return this.f45534o;
    }

    public final S8.a h() {
        return this.f45536q;
    }

    public int hashCode() {
        return this.f45520a.hashCode();
    }

    public final Integer i() {
        return this.f45531l;
    }

    public final S8.j j() {
        return this.f45537r;
    }

    public final long k() {
        return this.f45539t;
    }

    public final S8.l l() {
        return this.f45529j;
    }

    public final int m() {
        return this.f45530k;
    }

    public final String n() {
        return this.f45521b;
    }

    public final Integer o() {
        return this.f45535p;
    }

    public final Set p() {
        return this.f45528i;
    }

    public final Set q() {
        return this.f45538s;
    }

    public final Integer r() {
        return this.f45532m;
    }

    public final Boolean s() {
        return this.f45533n;
    }

    public String toString() {
        return "WMWResult[" + this.f45520a.d(":") + "] - ssid: " + this.f45521b + ", ieee: " + this.f45536q + ", sec: " + this.f45537r + ", ch: " + this.f45524e + ", ch_center " + this.f45525f + ", sta: " + this.f45535p;
    }
}
