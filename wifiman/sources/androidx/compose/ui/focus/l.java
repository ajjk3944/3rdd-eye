package androidx.compose.ui.focus;

import androidx.compose.ui.focus.o;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private boolean f28838a = true;

    /* renamed from: b, reason: collision with root package name */
    private o f28839b;

    /* renamed from: c, reason: collision with root package name */
    private o f28840c;

    /* renamed from: d, reason: collision with root package name */
    private o f28841d;

    /* renamed from: e, reason: collision with root package name */
    private o f28842e;

    /* renamed from: f, reason: collision with root package name */
    private o f28843f;

    /* renamed from: g, reason: collision with root package name */
    private o f28844g;

    /* renamed from: h, reason: collision with root package name */
    private o f28845h;

    /* renamed from: i, reason: collision with root package name */
    private o f28846i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC6835l f28847j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC6835l f28848k;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28849a = new a();

        a() {
            super(1);
        }

        public final o a(int i10) {
            return o.f28853b.b();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((d) obj).o());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28850a = new b();

        b() {
            super(1);
        }

        public final o a(int i10) {
            return o.f28853b.b();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((d) obj).o());
        }
    }

    public l() {
        o.a aVar = o.f28853b;
        this.f28839b = aVar.b();
        this.f28840c = aVar.b();
        this.f28841d = aVar.b();
        this.f28842e = aVar.b();
        this.f28843f = aVar.b();
        this.f28844g = aVar.b();
        this.f28845h = aVar.b();
        this.f28846i = aVar.b();
        this.f28847j = a.f28849a;
        this.f28848k = b.f28850a;
    }

    @Override // androidx.compose.ui.focus.k
    public o c() {
        return this.f28843f;
    }

    @Override // androidx.compose.ui.focus.k
    public o e() {
        return this.f28845h;
    }

    @Override // androidx.compose.ui.focus.k
    public o f() {
        return this.f28839b;
    }

    @Override // androidx.compose.ui.focus.k
    public o n() {
        return this.f28844g;
    }

    @Override // androidx.compose.ui.focus.k
    public boolean o() {
        return this.f28838a;
    }

    @Override // androidx.compose.ui.focus.k
    public void p(InterfaceC6835l interfaceC6835l) {
        this.f28847j = interfaceC6835l;
    }

    @Override // androidx.compose.ui.focus.k
    public void q(InterfaceC6835l interfaceC6835l) {
        this.f28848k = interfaceC6835l;
    }

    @Override // androidx.compose.ui.focus.k
    public o r() {
        return this.f28840c;
    }

    @Override // androidx.compose.ui.focus.k
    public o s() {
        return this.f28841d;
    }

    @Override // androidx.compose.ui.focus.k
    public InterfaceC6835l t() {
        return this.f28848k;
    }

    @Override // androidx.compose.ui.focus.k
    public o u() {
        return this.f28846i;
    }

    @Override // androidx.compose.ui.focus.k
    public o v() {
        return this.f28842e;
    }

    @Override // androidx.compose.ui.focus.k
    public void w(boolean z10) {
        this.f28838a = z10;
    }

    @Override // androidx.compose.ui.focus.k
    public InterfaceC6835l x() {
        return this.f28847j;
    }
}
