package androidx.compose.ui.layout;

import C0.D;
import C0.InterfaceC2523c;
import C0.InterfaceC2524d;
import java.util.Map;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class a implements InterfaceC2524d, InterfaceC2523c {

    /* renamed from: a, reason: collision with root package name */
    private final Y0.t f28966a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2523c f28967b;

    /* renamed from: androidx.compose.ui.layout.a$a, reason: collision with other inner class name */
    public static final class C1066a implements D {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f28968a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28969b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f28970c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28971d;

        C1066a(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l) {
            this.f28968a = i10;
            this.f28969b = i11;
            this.f28970c = map;
            this.f28971d = interfaceC6835l;
        }

        @Override // C0.D
        public int getHeight() {
            return this.f28969b;
        }

        @Override // C0.D
        public int getWidth() {
            return this.f28968a;
        }

        @Override // C0.D
        public Map p() {
            return this.f28970c;
        }

        @Override // C0.D
        public void q() {
        }

        @Override // C0.D
        public InterfaceC6835l r() {
            return this.f28971d;
        }
    }

    public a(InterfaceC2523c interfaceC2523c, Y0.t tVar) {
        this.f28966a = tVar;
        this.f28967b = interfaceC2523c;
    }

    @Override // Y0.d
    public long F0(float f10) {
        return this.f28967b.F0(f10);
    }

    @Override // Y0.d
    public long K1(long j10) {
        return this.f28967b.K1(j10);
    }

    @Override // C0.InterfaceC2523c
    public long N() {
        return this.f28967b.N();
    }

    @Override // Y0.d
    public float N0(float f10) {
        return this.f28967b.N0(f10);
    }

    @Override // Y0.d
    public float N1(long j10) {
        return this.f28967b.N1(j10);
    }

    @Override // C0.InterfaceC2535o
    public boolean a1() {
        return this.f28967b.a1();
    }

    @Override // Y0.d
    public float d1(float f10) {
        return this.f28967b.d1(f10);
    }

    @Override // Y0.l
    public long e0(float f10) {
        return this.f28967b.e0(f10);
    }

    @Override // Y0.d
    public long f0(long j10) {
        return this.f28967b.f0(j10);
    }

    @Override // Y0.d
    public float getDensity() {
        return this.f28967b.getDensity();
    }

    @Override // C0.InterfaceC2535o
    public Y0.t getLayoutDirection() {
        return this.f28966a;
    }

    @Override // androidx.compose.ui.layout.m
    public D i1(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        boolean z10 = false;
        int iD = AbstractC7978m.d(i10, 0);
        int iD2 = AbstractC7978m.d(i11, 0);
        if ((iD & (-16777216)) == 0 && ((-16777216) & iD2) == 0) {
            z10 = true;
        }
        if (!z10) {
            B0.a.b("Size(" + iD + " x " + iD2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C1066a(iD, iD2, map, interfaceC6835l);
    }

    @Override // Y0.l
    public float n0(long j10) {
        return this.f28967b.n0(j10);
    }

    @Override // Y0.d
    public float x(int i10) {
        return this.f28967b.x(i10);
    }

    @Override // Y0.d
    public int x1(float f10) {
        return this.f28967b.x1(f10);
    }

    @Override // Y0.l
    public float y() {
        return this.f28967b.y();
    }
}
