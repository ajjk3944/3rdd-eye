package c0;

import T.S0;
import c0.InterfaceC4179h;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4175d implements InterfaceC4184m, S0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4182k f33598a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC4179h f33599b;

    /* renamed from: c, reason: collision with root package name */
    private String f33600c;

    /* renamed from: d, reason: collision with root package name */
    private Object f33601d;

    /* renamed from: e, reason: collision with root package name */
    private Object[] f33602e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC4179h.a f33603f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6824a f33604g = new a();

    /* renamed from: c0.d$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            InterfaceC4182k interfaceC4182k = C4175d.this.f33598a;
            C4175d c4175d = C4175d.this;
            Object obj = c4175d.f33601d;
            if (obj != null) {
                return interfaceC4182k.b(c4175d, obj);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    }

    public C4175d(InterfaceC4182k interfaceC4182k, InterfaceC4179h interfaceC4179h, String str, Object obj, Object[] objArr) {
        this.f33598a = interfaceC4182k;
        this.f33599b = interfaceC4179h;
        this.f33600c = str;
        this.f33601d = obj;
        this.f33602e = objArr;
    }

    private final void h() {
        InterfaceC4179h interfaceC4179h = this.f33599b;
        if (this.f33603f == null) {
            if (interfaceC4179h != null) {
                AbstractC4174c.f(interfaceC4179h, this.f33604g.invoke());
                this.f33603f = interfaceC4179h.e(this.f33600c, this.f33604g);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.f33603f + ") is not null").toString());
    }

    @Override // c0.InterfaceC4184m
    public boolean a(Object obj) {
        InterfaceC4179h interfaceC4179h = this.f33599b;
        return interfaceC4179h == null || interfaceC4179h.a(obj);
    }

    @Override // T.S0
    public void b() {
        InterfaceC4179h.a aVar = this.f33603f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // T.S0
    public void c() {
        InterfaceC4179h.a aVar = this.f33603f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // T.S0
    public void d() {
        h();
    }

    public final Object g(Object[] objArr) {
        if (Arrays.equals(objArr, this.f33602e)) {
            return this.f33601d;
        }
        return null;
    }

    public final void i(InterfaceC4182k interfaceC4182k, InterfaceC4179h interfaceC4179h, String str, Object obj, Object[] objArr) {
        boolean z10;
        boolean z11 = true;
        if (this.f33599b != interfaceC4179h) {
            this.f33599b = interfaceC4179h;
            z10 = true;
        } else {
            z10 = false;
        }
        if (AbstractC6492s.d(this.f33600c, str)) {
            z11 = z10;
        } else {
            this.f33600c = str;
        }
        this.f33598a = interfaceC4182k;
        this.f33601d = obj;
        this.f33602e = objArr;
        InterfaceC4179h.a aVar = this.f33603f;
        if (aVar == null || !z11) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.f33603f = null;
        h();
    }
}
