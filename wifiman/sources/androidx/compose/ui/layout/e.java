package androidx.compose.ui.layout;

import C0.D;
import C0.InterfaceC2535o;
import java.util.Map;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class e implements m, InterfaceC2535o {

    /* renamed from: a, reason: collision with root package name */
    private final Y0.t f28989a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2535o f28990b;

    public static final class a implements D {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f28991a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28992b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f28993c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28994d;

        a(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l) {
            this.f28991a = i10;
            this.f28992b = i11;
            this.f28993c = map;
            this.f28994d = interfaceC6835l;
        }

        @Override // C0.D
        public int getHeight() {
            return this.f28992b;
        }

        @Override // C0.D
        public int getWidth() {
            return this.f28991a;
        }

        @Override // C0.D
        public Map p() {
            return this.f28993c;
        }

        @Override // C0.D
        public void q() {
        }

        @Override // C0.D
        public InterfaceC6835l r() {
            return this.f28994d;
        }
    }

    public e(InterfaceC2535o interfaceC2535o, Y0.t tVar) {
        this.f28989a = tVar;
        this.f28990b = interfaceC2535o;
    }

    @Override // Y0.d
    public long F0(float f10) {
        return this.f28990b.F0(f10);
    }

    @Override // Y0.d
    public long K1(long j10) {
        return this.f28990b.K1(j10);
    }

    @Override // Y0.d
    public float N0(float f10) {
        return this.f28990b.N0(f10);
    }

    @Override // Y0.d
    public float N1(long j10) {
        return this.f28990b.N1(j10);
    }

    @Override // C0.InterfaceC2535o
    public boolean a1() {
        return this.f28990b.a1();
    }

    @Override // Y0.d
    public float d1(float f10) {
        return this.f28990b.d1(f10);
    }

    @Override // Y0.l
    public long e0(float f10) {
        return this.f28990b.e0(f10);
    }

    @Override // Y0.d
    public long f0(long j10) {
        return this.f28990b.f0(j10);
    }

    @Override // Y0.d
    public float getDensity() {
        return this.f28990b.getDensity();
    }

    @Override // C0.InterfaceC2535o
    public Y0.t getLayoutDirection() {
        return this.f28989a;
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
        return new a(iD, iD2, map, interfaceC6835l);
    }

    @Override // Y0.l
    public float n0(long j10) {
        return this.f28990b.n0(j10);
    }

    @Override // Y0.d
    public float x(int i10) {
        return this.f28990b.x(i10);
    }

    @Override // Y0.d
    public int x1(float f10) {
        return this.f28990b.x1(f10);
    }

    @Override // Y0.l
    public float y() {
        return this.f28990b.y();
    }
}
