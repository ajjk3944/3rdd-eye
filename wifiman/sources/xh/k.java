package xh;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xh.h;
import xh.i;

/* loaded from: classes4.dex */
public abstract class k implements h {

    /* renamed from: a, reason: collision with root package name */
    private final Method f66129a;

    /* renamed from: b, reason: collision with root package name */
    private final List f66130b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f66131c;

    public static final class a extends k implements g {

        /* renamed from: d, reason: collision with root package name */
        private final Object f66132d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Method unboxMethod, Object obj) {
            super(unboxMethod, AbstractC3689v.l(), null);
            AbstractC6492s.i(unboxMethod, "unboxMethod");
            this.f66132d = obj;
        }

        @Override // xh.h
        public Object call(Object[] args) {
            AbstractC6492s.i(args, "args");
            d(args);
            return c(this.f66132d, args);
        }
    }

    public static final class b extends k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method unboxMethod) {
            super(unboxMethod, AbstractC3689v.e(unboxMethod.getDeclaringClass()), null);
            AbstractC6492s.i(unboxMethod, "unboxMethod");
        }

        @Override // xh.h
        public Object call(Object[] args) {
            AbstractC6492s.i(args, "args");
            d(args);
            Object obj = args[0];
            i.d dVar = i.f66115e;
            return c(obj, args.length <= 1 ? new Object[0] : AbstractC3682n.s(args, 1, args.length));
        }
    }

    public /* synthetic */ k(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    @Override // xh.h
    public final List a() {
        return this.f66130b;
    }

    protected final Object c(Object obj, Object[] args) {
        AbstractC6492s.i(args, "args");
        return this.f66129a.invoke(obj, Arrays.copyOf(args, args.length));
    }

    public void d(Object[] objArr) {
        h.a.a(this, objArr);
    }

    @Override // xh.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Method b() {
        return null;
    }

    @Override // xh.h
    public final Type getReturnType() {
        return this.f66131c;
    }

    private k(Method method, List list) {
        this.f66129a = method;
        this.f66130b = list;
        Class<?> returnType = method.getReturnType();
        AbstractC6492s.h(returnType, "getReturnType(...)");
        this.f66131c = returnType;
    }
}
