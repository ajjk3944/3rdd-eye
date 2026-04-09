package Vc;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class a implements Uc.a {

    /* renamed from: a, reason: collision with root package name */
    private final Uc.b f23330a;

    /* renamed from: b, reason: collision with root package name */
    private final inet.ipaddr.g f23331b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23332c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23333d;

    /* renamed from: e, reason: collision with root package name */
    private final String f23334e;

    /* renamed from: f, reason: collision with root package name */
    private final String f23335f;

    /* renamed from: g, reason: collision with root package name */
    private final com.ui.wifiman.model.vendor.d f23336g;

    /* renamed from: h, reason: collision with root package name */
    private final String f23337h;

    /* renamed from: i, reason: collision with root package name */
    private final String f23338i;

    /* renamed from: j, reason: collision with root package name */
    private final String f23339j;

    /* renamed from: k, reason: collision with root package name */
    private final String f23340k;

    /* renamed from: l, reason: collision with root package name */
    private final String f23341l;

    /* renamed from: m, reason: collision with root package name */
    private final String f23342m;

    /* renamed from: n, reason: collision with root package name */
    private final List f23343n;

    /* renamed from: o, reason: collision with root package name */
    private final List f23344o;

    /* renamed from: p, reason: collision with root package name */
    private final long f23345p;

    /* renamed from: q, reason: collision with root package name */
    private final g f23346q;

    public a(Uc.b bVar, inet.ipaddr.g ipAddress, String str, String str2, String str3, String str4, com.ui.wifiman.model.vendor.d dVar, String str5, String str6, String str7, String str8, String str9, String str10, List devices, List services, long j10, g xmlDevice) {
        AbstractC6492s.i(ipAddress, "ipAddress");
        AbstractC6492s.i(devices, "devices");
        AbstractC6492s.i(services, "services");
        AbstractC6492s.i(xmlDevice, "xmlDevice");
        this.f23330a = bVar;
        this.f23331b = ipAddress;
        this.f23332c = str;
        this.f23333d = str2;
        this.f23334e = str3;
        this.f23335f = str4;
        this.f23336g = dVar;
        this.f23337h = str5;
        this.f23338i = str6;
        this.f23339j = str7;
        this.f23340k = str8;
        this.f23341l = str9;
        this.f23342m = str10;
        this.f23343n = devices;
        this.f23344o = services;
        this.f23345p = j10;
        this.f23346q = xmlDevice;
    }

    @Override // Uc.a
    public String a() {
        return this.f23341l;
    }

    @Override // Uc.a
    public String b() {
        return this.f23333d;
    }

    @Override // Uc.a
    public com.ui.wifiman.model.vendor.d c() {
        return this.f23336g;
    }

    @Override // Uc.a
    public inet.ipaddr.g d() {
        return this.f23331b;
    }

    @Override // Uc.a
    public String e() {
        return this.f23337h;
    }

    @Override // Uc.a
    public String f() {
        return this.f23335f;
    }

    public List g() {
        return this.f23343n;
    }

    @Override // Uc.a
    public String getName() {
        return this.f23332c;
    }

    @Override // Uc.a
    public Uc.b getType() {
        return this.f23330a;
    }
}
