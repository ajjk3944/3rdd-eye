package B;

import T.InterfaceC3551q0;
import T.o1;
import T.z1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;
import sh.C7974i;

/* loaded from: classes.dex */
public final class B implements z1 {

    /* renamed from: e, reason: collision with root package name */
    private static final a f863e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f864a;

    /* renamed from: b, reason: collision with root package name */
    private final int f865b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f866c;

    /* renamed from: d, reason: collision with root package name */
    private int f867d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C7974i b(int i10, int i11, int i12) {
            int i13 = (i10 / i11) * i11;
            return AbstractC7978m.s(Math.max(i13 - i12, 0), i13 + i11 + i12);
        }

        private a() {
        }
    }

    public B(int i10, int i11, int i12) {
        this.f864a = i11;
        this.f865b = i12;
        this.f866c = o1.h(f863e.b(i10, i11, i12), o1.p());
        this.f867d = i10;
    }

    private void i(C7974i c7974i) {
        this.f866c.setValue(c7974i);
    }

    @Override // T.z1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C7974i getValue() {
        return (C7974i) this.f866c.getValue();
    }

    public final void j(int i10) {
        if (i10 != this.f867d) {
            this.f867d = i10;
            i(f863e.b(i10, this.f864a, this.f865b));
        }
    }
}
