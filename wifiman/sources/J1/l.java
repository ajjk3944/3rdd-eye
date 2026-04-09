package j1;

import j1.e;
import java.util.HashSet;
import k1.C6356b;

/* loaded from: classes.dex */
public abstract class l extends j {

    /* renamed from: M0, reason: collision with root package name */
    private int f50030M0 = 0;

    /* renamed from: N0, reason: collision with root package name */
    private int f50031N0 = 0;

    /* renamed from: O0, reason: collision with root package name */
    private int f50032O0 = 0;

    /* renamed from: P0, reason: collision with root package name */
    private int f50033P0 = 0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f50034Q0 = 0;

    /* renamed from: R0, reason: collision with root package name */
    private int f50035R0 = 0;

    /* renamed from: S0, reason: collision with root package name */
    private int f50036S0 = 0;

    /* renamed from: T0, reason: collision with root package name */
    private int f50037T0 = 0;

    /* renamed from: U0, reason: collision with root package name */
    private boolean f50038U0 = false;

    /* renamed from: V0, reason: collision with root package name */
    private int f50039V0 = 0;

    /* renamed from: W0, reason: collision with root package name */
    private int f50040W0 = 0;

    /* renamed from: X0, reason: collision with root package name */
    protected C6356b.a f50041X0 = new C6356b.a();

    /* renamed from: Y0, reason: collision with root package name */
    C6356b.InterfaceC1888b f50042Y0 = null;

    public boolean d1(HashSet hashSet) {
        for (int i10 = 0; i10 < this.f50028L0; i10++) {
            if (hashSet.contains(this.f50027K0[i10])) {
                return true;
            }
        }
        return false;
    }

    public int e1() {
        return this.f50040W0;
    }

    public int f1() {
        return this.f50039V0;
    }

    public int g1() {
        return this.f50031N0;
    }

    public int h1() {
        return this.f50036S0;
    }

    public int i1() {
        return this.f50037T0;
    }

    public int j1() {
        return this.f50030M0;
    }

    public void k1(int i10, int i11, int i12, int i13) {
    }

    protected void l1(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.f50042Y0 == null && F() != null) {
            this.f50042Y0 = ((f) F()).t1();
        }
        C6356b.a aVar = this.f50041X0;
        aVar.f51023a = bVar;
        aVar.f51024b = bVar2;
        aVar.f51025c = i10;
        aVar.f51026d = i11;
        this.f50042Y0.b(eVar, aVar);
        eVar.U0(this.f50041X0.f51027e);
        eVar.z0(this.f50041X0.f51028f);
        eVar.y0(this.f50041X0.f51030h);
        eVar.o0(this.f50041X0.f51029g);
    }

    protected boolean m1() {
        e eVar = this.f49891Z;
        C6356b.InterfaceC1888b interfaceC1888bT1 = eVar != null ? ((f) eVar).t1() : null;
        if (interfaceC1888bT1 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.f50028L0; i10++) {
            e eVar2 = this.f50027K0[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b bVarR = eVar2.r(0);
                e.b bVarR2 = eVar2.r(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarR != bVar || eVar2.f49936w == 1 || bVarR2 != bVar || eVar2.f49938x == 1) {
                    if (bVarR == bVar) {
                        bVarR = e.b.WRAP_CONTENT;
                    }
                    if (bVarR2 == bVar) {
                        bVarR2 = e.b.WRAP_CONTENT;
                    }
                    C6356b.a aVar = this.f50041X0;
                    aVar.f51023a = bVarR;
                    aVar.f51024b = bVarR2;
                    aVar.f51025c = eVar2.O();
                    this.f50041X0.f51026d = eVar2.u();
                    interfaceC1888bT1.b(eVar2, this.f50041X0);
                    eVar2.U0(this.f50041X0.f51027e);
                    eVar2.z0(this.f50041X0.f51028f);
                    eVar2.o0(this.f50041X0.f51029g);
                }
            }
        }
        return true;
    }

    public boolean n1() {
        return this.f50038U0;
    }

    protected void o1(boolean z10) {
        this.f50038U0 = z10;
    }

    public void p1(int i10, int i11) {
        this.f50039V0 = i10;
        this.f50040W0 = i11;
    }

    public void q1(int i10) {
        this.f50031N0 = i10;
    }

    public void r1(int i10) {
        this.f50035R0 = i10;
    }

    public void s1(int i10) {
        this.f50032O0 = i10;
        this.f50036S0 = i10;
    }

    public void t1(int i10) {
        this.f50033P0 = i10;
        this.f50037T0 = i10;
    }

    public void u1(int i10) {
        this.f50034Q0 = i10;
        this.f50036S0 = i10;
        this.f50037T0 = i10;
    }

    public void v1(int i10) {
        this.f50030M0 = i10;
    }
}
