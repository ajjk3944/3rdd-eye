package Mi;

import Ii.A0;
import Li.InterfaceC3221h;
import Yg.J;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class t extends kotlin.coroutines.jvm.internal.d implements InterfaceC3221h, kotlin.coroutines.jvm.internal.e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3221h f13301a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5384i f13302b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13303c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC5384i f13304d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC5380e f13305e;

    public t(InterfaceC3221h interfaceC3221h, InterfaceC5384i interfaceC5384i) {
        super(p.f13295a, C5385j.f46088a);
        this.f13301a = interfaceC3221h;
        this.f13302b = interfaceC5384i;
        this.f13303c = ((Number) interfaceC5384i.fold(0, new InterfaceC6839p() { // from class: Mi.s
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(t.t(((Integer) obj).intValue(), (InterfaceC5384i.b) obj2));
            }
        })).intValue();
    }

    private final void E(k kVar, Object obj) {
        throw new IllegalStateException(kotlin.text.t.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + kVar.f13294b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    private final void o(InterfaceC5384i interfaceC5384i, InterfaceC5384i interfaceC5384i2, Object obj) {
        if (interfaceC5384i2 instanceof k) {
            E((k) interfaceC5384i2, obj);
        }
        w.b(this, interfaceC5384i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(int i10, InterfaceC5384i.b bVar) {
        return i10 + 1;
    }

    private final Object v(InterfaceC5380e interfaceC5380e, Object obj) {
        InterfaceC5384i context = interfaceC5380e.getContext();
        A0.l(context);
        InterfaceC5384i interfaceC5384i = this.f13304d;
        if (interfaceC5384i != context) {
            o(context, interfaceC5384i, obj);
            this.f13304d = context;
        }
        this.f13305e = interfaceC5380e;
        mh.q qVar = u.f13306a;
        InterfaceC3221h interfaceC3221h = this.f13301a;
        AbstractC6492s.g(interfaceC3221h, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        AbstractC6492s.g(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objS = qVar.s(interfaceC3221h, obj, this);
        if (!AbstractC6492s.d(objS, AbstractC5467b.g())) {
            this.f13305e = null;
        }
        return objS;
    }

    @Override // Li.InterfaceC3221h
    public Object a(Object obj, InterfaceC5380e interfaceC5380e) {
        try {
            Object objV = v(interfaceC5380e, obj);
            if (objV == AbstractC5467b.g()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
            }
            return objV == AbstractC5467b.g() ? objV : J.f24997a;
        } catch (Throwable th2) {
            this.f13304d = new k(th2, interfaceC5380e.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        InterfaceC5380e interfaceC5380e = this.f13305e;
        if (interfaceC5380e instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) interfaceC5380e;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, dh.InterfaceC5380e
    public InterfaceC5384i getContext() {
        InterfaceC5384i interfaceC5384i = this.f13304d;
        return interfaceC5384i == null ? C5385j.f46088a : interfaceC5384i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected Object invokeSuspend(Object obj) {
        Throwable thH = Yg.u.h(obj);
        if (thH != null) {
            this.f13304d = new k(thH, getContext());
        }
        InterfaceC5380e interfaceC5380e = this.f13305e;
        if (interfaceC5380e != null) {
            interfaceC5380e.resumeWith(obj);
        }
        return AbstractC5467b.g();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
