package dh;

import Yg.u;
import eh.AbstractC5467b;
import eh.EnumC5466a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: dh.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5386k implements InterfaceC5380e, kotlin.coroutines.jvm.internal.e {

    /* renamed from: b, reason: collision with root package name */
    private static final a f46089b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f46090c = AtomicReferenceFieldUpdater.newUpdater(C5386k.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5380e f46091a;
    private volatile Object result;

    /* renamed from: dh.k$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C5386k(InterfaceC5380e delegate, Object obj) {
        AbstractC6492s.i(delegate, "delegate");
        this.f46091a = delegate;
        this.result = obj;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        EnumC5466a enumC5466a = EnumC5466a.UNDECIDED;
        if (obj == enumC5466a) {
            if (androidx.concurrent.futures.b.a(f46090c, this, enumC5466a, AbstractC5467b.g())) {
                return AbstractC5467b.g();
            }
            obj = this.result;
        }
        if (obj == EnumC5466a.RESUMED) {
            return AbstractC5467b.g();
        }
        if (obj instanceof u.b) {
            throw ((u.b) obj).f25019a;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        InterfaceC5380e interfaceC5380e = this.f46091a;
        if (interfaceC5380e instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) interfaceC5380e;
        }
        return null;
    }

    @Override // dh.InterfaceC5380e
    public InterfaceC5384i getContext() {
        return this.f46091a.getContext();
    }

    @Override // dh.InterfaceC5380e
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC5466a enumC5466a = EnumC5466a.UNDECIDED;
            if (obj2 == enumC5466a) {
                if (androidx.concurrent.futures.b.a(f46090c, this, enumC5466a, obj)) {
                    return;
                }
            } else {
                if (obj2 != AbstractC5467b.g()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.b.a(f46090c, this, AbstractC5467b.g(), EnumC5466a.RESUMED)) {
                    this.f46091a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f46091a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5386k(InterfaceC5380e delegate) {
        this(delegate, EnumC5466a.UNDECIDED);
        AbstractC6492s.i(delegate, "delegate");
    }
}
