package Cc;

import Zg.d0;
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
public final class j implements InterfaceC2557a {

    /* renamed from: a, reason: collision with root package name */
    private final String f2509a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2510b;

    /* renamed from: c, reason: collision with root package name */
    private final com.ui.wifiman.model.vendor.d f2511c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2558b f2512d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2557a f2513e;

    public j(String str, String str2, com.ui.wifiman.model.vendor.d dVar, AbstractC2558b _type, InterfaceC2557a interfaceC2557a) {
        AbstractC6492s.i(_type, "_type");
        this.f2509a = str;
        this.f2510b = str2;
        this.f2511c = dVar;
        this.f2512d = _type;
        this.f2513e = interfaceC2557a;
    }

    public static /* synthetic */ j r(j jVar, String str, String str2, com.ui.wifiman.model.vendor.d dVar, AbstractC2558b abstractC2558b, InterfaceC2557a interfaceC2557a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jVar.f2509a;
        }
        if ((i10 & 2) != 0) {
            str2 = jVar.f2510b;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            dVar = jVar.f2511c;
        }
        com.ui.wifiman.model.vendor.d dVar2 = dVar;
        if ((i10 & 8) != 0) {
            abstractC2558b = jVar.f2512d;
        }
        AbstractC2558b abstractC2558b2 = abstractC2558b;
        if ((i10 & 16) != 0) {
            interfaceC2557a = jVar.f2513e;
        }
        return jVar.a(str, str3, dVar2, abstractC2558b2, interfaceC2557a);
    }

    public final j a(String str, String str2, com.ui.wifiman.model.vendor.d dVar, AbstractC2558b _type, InterfaceC2557a interfaceC2557a) {
        AbstractC6492s.i(_type, "_type");
        return new j(str, str2, dVar, _type, interfaceC2557a);
    }

    @Override // Cc.InterfaceC2557a
    public String b() {
        String str = this.f2510b;
        if (str != null) {
            return str;
        }
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.b();
        }
        return null;
    }

    @Override // Cc.InterfaceC2557a
    public com.ui.wifiman.model.vendor.d c() {
        com.ui.wifiman.model.vendor.d dVar = this.f2511c;
        if (dVar != null) {
            return dVar;
        }
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.c();
        }
        return null;
    }

    @Override // Cc.InterfaceC2557a, Cc.k
    public AbstractC2558b d() {
        return this.f2512d;
    }

    @Override // Cc.InterfaceC2557a
    public Long e() {
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.e();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC6492s.d(this.f2509a, jVar.f2509a) && AbstractC6492s.d(this.f2510b, jVar.f2510b) && AbstractC6492s.d(this.f2511c, jVar.f2511c) && AbstractC6492s.d(this.f2512d, jVar.f2512d) && AbstractC6492s.d(this.f2513e, jVar.f2513e);
    }

    @Override // Cc.InterfaceC2557a
    public InterfaceC8439a.d f() {
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.f();
        }
        return null;
    }

    @Override // Cc.InterfaceC2557a
    public a.C1388a g() {
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.g();
        }
        return null;
    }

    @Override // Cc.InterfaceC2557a
    public l getConfig() {
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.getConfig();
        }
        return null;
    }

    @Override // Cc.k
    public C3772b getId() {
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.getId();
        }
        return null;
    }

    @Override // Cc.InterfaceC2557a
    public String getName() {
        String str = this.f2509a;
        if (str != null) {
            return str;
        }
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.getName();
        }
        return null;
    }

    @Override // Cc.InterfaceC2557a
    public String h() {
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.h();
        }
        return null;
    }

    public int hashCode() {
        String str = this.f2509a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2510b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.ui.wifiman.model.vendor.d dVar = this.f2511c;
        int iHashCode3 = (((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f2512d.hashCode()) * 31;
        InterfaceC2557a interfaceC2557a = this.f2513e;
        return iHashCode3 + (interfaceC2557a != null ? interfaceC2557a.hashCode() : 0);
    }

    @Override // Cc.InterfaceC2557a
    public C6205b i() {
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.i();
        }
        return null;
    }

    @Override // Cc.InterfaceC2557a
    public Dc.j j() {
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.j();
        }
        return null;
    }

    @Override // Cc.InterfaceC2557a
    public Set k() {
        Set setK;
        InterfaceC2557a interfaceC2557a = this.f2513e;
        return (interfaceC2557a == null || (setK = interfaceC2557a.k()) == null) ? d0.e() : setK;
    }

    @Override // Cc.InterfaceC2557a
    public C5969a l() {
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.l();
        }
        return null;
    }

    @Override // Cc.InterfaceC2557a
    public TreeSet m() {
        TreeSet treeSetM;
        InterfaceC2557a interfaceC2557a = this.f2513e;
        return (interfaceC2557a == null || (treeSetM = interfaceC2557a.m()) == null) ? new TreeSet() : treeSetM;
    }

    @Override // Cc.InterfaceC2557a
    public C6180b n() {
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.n();
        }
        return null;
    }

    @Override // Cc.InterfaceC2557a
    public String o() {
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.o();
        }
        return null;
    }

    @Override // Cc.InterfaceC2557a
    public C8321a p() {
        InterfaceC2557a interfaceC2557a = this.f2513e;
        if (interfaceC2557a != null) {
            return interfaceC2557a.p();
        }
        return null;
    }

    @Override // Cc.InterfaceC2557a
    public Set q() {
        Set setQ;
        InterfaceC2557a interfaceC2557a = this.f2513e;
        return (interfaceC2557a == null || (setQ = interfaceC2557a.q()) == null) ? d0.e() : setQ;
    }

    public String toString() {
        return "MyselfDevice(_name=" + this.f2509a + ", _model=" + this.f2510b + ", _vendor=" + this.f2511c + ", _type=" + this.f2512d + ", combined=" + this.f2513e + ")";
    }
}
