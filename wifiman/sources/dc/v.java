package Dc;

import Cc.AbstractC2558b;
import Cc.InterfaceC2557a;
import a8.C3772b;
import com.ui.wifiman.model.bluetooth.le.a;
import h9.C5969a;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv6.C6205b;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC6492s;
import wc.C8321a;
import xa.InterfaceC8439a;

/* loaded from: classes4.dex */
final class v implements InterfaceC2557a {

    /* renamed from: a, reason: collision with root package name */
    private final C3772b f3279a;

    /* renamed from: b, reason: collision with root package name */
    private final C8321a f3280b;

    /* renamed from: c, reason: collision with root package name */
    private final TreeSet f3281c;

    /* renamed from: d, reason: collision with root package name */
    private final Cc.l f3282d;

    /* renamed from: e, reason: collision with root package name */
    private final j f3283e;

    /* renamed from: f, reason: collision with root package name */
    private final a.C1388a f3284f;

    public v(j device) {
        AbstractC6492s.i(device, "device");
        this.f3279a = device.u();
        this.f3281c = new TreeSet();
        this.f3283e = device;
    }

    @Override // Cc.InterfaceC2557a
    public String b() {
        return InterfaceC2557a.C0116a.i(this);
    }

    @Override // Cc.InterfaceC2557a
    public com.ui.wifiman.model.vendor.d c() {
        return InterfaceC2557a.C0116a.m(this);
    }

    @Override // Cc.InterfaceC2557a, Cc.k
    public AbstractC2558b d() {
        return InterfaceC2557a.C0116a.a(this);
    }

    @Override // Cc.InterfaceC2557a
    public Long e() {
        return InterfaceC2557a.C0116a.l(this);
    }

    @Override // Cc.InterfaceC2557a
    public InterfaceC8439a.d f() {
        return InterfaceC2557a.C0116a.k(this);
    }

    @Override // Cc.InterfaceC2557a
    public a.C1388a g() {
        return this.f3284f;
    }

    @Override // Cc.InterfaceC2557a
    public Cc.l getConfig() {
        return this.f3282d;
    }

    @Override // Cc.k
    public C3772b getId() {
        return this.f3279a;
    }

    @Override // Cc.InterfaceC2557a
    public String getName() {
        return InterfaceC2557a.C0116a.j(this);
    }

    @Override // Cc.InterfaceC2557a
    public String h() {
        return InterfaceC2557a.C0116a.b(this);
    }

    @Override // Cc.InterfaceC2557a
    public C6205b i() {
        return InterfaceC2557a.C0116a.f(this);
    }

    @Override // Cc.InterfaceC2557a
    public j j() {
        return this.f3283e;
    }

    @Override // Cc.InterfaceC2557a
    public Set k() {
        return InterfaceC2557a.C0116a.h(this);
    }

    @Override // Cc.InterfaceC2557a
    public C5969a l() {
        return InterfaceC2557a.C0116a.g(this);
    }

    @Override // Cc.InterfaceC2557a
    public TreeSet m() {
        return this.f3281c;
    }

    @Override // Cc.InterfaceC2557a
    public C6180b n() {
        return InterfaceC2557a.C0116a.e(this);
    }

    @Override // Cc.InterfaceC2557a
    public String o() {
        return InterfaceC2557a.C0116a.c(this);
    }

    @Override // Cc.InterfaceC2557a
    public C8321a p() {
        return this.f3280b;
    }

    @Override // Cc.InterfaceC2557a
    public Set q() {
        return InterfaceC2557a.C0116a.d(this);
    }
}
