package zc;

import Cc.AbstractC2558b;
import Cc.InterfaceC2557a;
import Cc.l;
import Dc.j;
import a8.C3772b;
import com.ui.wifiman.model.bluetooth.le.a;
import com.ui.wifiman.model.vendor.d;
import h9.C5969a;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv6.C6205b;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC6492s;
import wc.C8321a;
import xa.InterfaceC8439a;

/* renamed from: zc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C8729c implements InterfaceC2557a.b {

    /* renamed from: a, reason: collision with root package name */
    private final C3772b f67243a;

    /* renamed from: b, reason: collision with root package name */
    private final C8321a f67244b;

    /* renamed from: c, reason: collision with root package name */
    private final TreeSet f67245c;

    /* renamed from: d, reason: collision with root package name */
    private final l f67246d;

    /* renamed from: e, reason: collision with root package name */
    private final j f67247e;

    /* renamed from: f, reason: collision with root package name */
    private final a.C1388a f67248f;

    public C8729c(C8321a device) {
        AbstractC6492s.i(device, "device");
        this.f67243a = device.f();
        this.f67244b = device;
        this.f67245c = new TreeSet();
    }

    @Override // Cc.InterfaceC2557a
    public String b() {
        return InterfaceC2557a.b.C0117a.i(this);
    }

    @Override // Cc.InterfaceC2557a
    public d c() {
        return InterfaceC2557a.b.C0117a.m(this);
    }

    @Override // Cc.InterfaceC2557a, Cc.k
    public AbstractC2558b d() {
        return InterfaceC2557a.b.C0117a.a(this);
    }

    @Override // Cc.InterfaceC2557a
    public Long e() {
        return InterfaceC2557a.b.C0117a.l(this);
    }

    @Override // Cc.InterfaceC2557a
    public InterfaceC8439a.d f() {
        return InterfaceC2557a.b.C0117a.k(this);
    }

    @Override // Cc.InterfaceC2557a
    public a.C1388a g() {
        return this.f67248f;
    }

    @Override // Cc.InterfaceC2557a
    public l getConfig() {
        return this.f67246d;
    }

    @Override // Cc.InterfaceC2557a.b, Cc.k
    public C3772b getId() {
        return this.f67243a;
    }

    @Override // Cc.InterfaceC2557a
    public String getName() {
        return InterfaceC2557a.b.C0117a.j(this);
    }

    @Override // Cc.InterfaceC2557a
    public String h() {
        return InterfaceC2557a.b.C0117a.b(this);
    }

    @Override // Cc.InterfaceC2557a
    public C6205b i() {
        return InterfaceC2557a.b.C0117a.f(this);
    }

    @Override // Cc.InterfaceC2557a
    public j j() {
        return this.f67247e;
    }

    @Override // Cc.InterfaceC2557a
    public Set k() {
        return InterfaceC2557a.b.C0117a.h(this);
    }

    @Override // Cc.InterfaceC2557a
    public C5969a l() {
        return InterfaceC2557a.b.C0117a.g(this);
    }

    @Override // Cc.InterfaceC2557a
    public TreeSet m() {
        return this.f67245c;
    }

    @Override // Cc.InterfaceC2557a
    public C6180b n() {
        return InterfaceC2557a.b.C0117a.e(this);
    }

    @Override // Cc.InterfaceC2557a
    public String o() {
        return InterfaceC2557a.b.C0117a.c(this);
    }

    @Override // Cc.InterfaceC2557a
    public C8321a p() {
        return this.f67244b;
    }

    @Override // Cc.InterfaceC2557a
    public Set q() {
        return InterfaceC2557a.b.C0117a.d(this);
    }
}
