package androidx.compose.ui.layout;

import C0.D;
import C0.InterfaceC2524d;
import E0.C;
import E0.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class d implements InterfaceC2524d, m, j {

    /* renamed from: a, reason: collision with root package name */
    private final C f28980a;

    /* renamed from: b, reason: collision with root package name */
    private b f28981b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28982c;

    public static final class a implements D {

        /* renamed from: a, reason: collision with root package name */
        private final int f28983a;

        /* renamed from: b, reason: collision with root package name */
        private final int f28984b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f28985c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC6835l f28986d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28987e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f28988f;

        a(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, d dVar) {
            this.f28987e = interfaceC6835l2;
            this.f28988f = dVar;
            this.f28983a = i10;
            this.f28984b = i11;
            this.f28985c = map;
            this.f28986d = interfaceC6835l;
        }

        @Override // C0.D
        public int getHeight() {
            return this.f28984b;
        }

        @Override // C0.D
        public int getWidth() {
            return this.f28983a;
        }

        @Override // C0.D
        public Map p() {
            return this.f28985c;
        }

        @Override // C0.D
        public void q() {
            this.f28987e.invoke(this.f28988f.q().q1());
        }

        @Override // C0.D
        public InterfaceC6835l r() {
            return this.f28986d;
        }
    }

    public d(C c10, b bVar) {
        this.f28980a = c10;
        this.f28981b = bVar;
    }

    @Override // Y0.d
    public long F0(float f10) {
        return this.f28980a.F0(f10);
    }

    @Override // Y0.d
    public long K1(long j10) {
        return this.f28980a.K1(j10);
    }

    @Override // C0.InterfaceC2523c
    public long N() {
        Q qC2 = this.f28980a.C2();
        AbstractC6492s.f(qC2);
        D dH1 = qC2.h1();
        return Y0.s.a(dH1.getWidth(), dH1.getHeight());
    }

    @Override // Y0.d
    public float N0(float f10) {
        return this.f28980a.N0(f10);
    }

    @Override // Y0.d
    public float N1(long j10) {
        return this.f28980a.N1(j10);
    }

    @Override // C0.InterfaceC2535o
    public boolean a1() {
        return false;
    }

    public final boolean b() {
        return this.f28982c;
    }

    @Override // Y0.d
    public float d1(float f10) {
        return this.f28980a.d1(f10);
    }

    @Override // Y0.l
    public long e0(float f10) {
        return this.f28980a.e0(f10);
    }

    @Override // Y0.d
    public long f0(long j10) {
        return this.f28980a.f0(j10);
    }

    @Override // Y0.d
    public float getDensity() {
        return this.f28980a.getDensity();
    }

    @Override // C0.InterfaceC2535o
    public Y0.t getLayoutDirection() {
        return this.f28980a.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.m
    public D i1(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
            B0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i10, i11, map, interfaceC6835l, interfaceC6835l2, this);
    }

    @Override // Y0.l
    public float n0(long j10) {
        return this.f28980a.n0(j10);
    }

    public final b p() {
        return this.f28981b;
    }

    public final C q() {
        return this.f28980a;
    }

    public final void r(boolean z10) {
        this.f28982c = z10;
    }

    public final void s(b bVar) {
        this.f28981b = bVar;
    }

    @Override // androidx.compose.ui.layout.m
    public D v1(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l) {
        return this.f28980a.v1(i10, i11, map, interfaceC6835l);
    }

    @Override // Y0.d
    public float x(int i10) {
        return this.f28980a.x(i10);
    }

    @Override // Y0.d
    public int x1(float f10) {
        return this.f28980a.x1(f10);
    }

    @Override // Y0.l
    public float y() {
        return this.f28980a.y();
    }
}
