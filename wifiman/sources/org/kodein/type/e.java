package org.kodein.type;

import Zg.AbstractC3682n;
import Zg.Q;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public abstract class e extends org.kodein.type.a implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final a f56950e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Yg.m f56951f = Yg.n.b(c.f56954a);

    /* renamed from: g, reason: collision with root package name */
    private static final Yg.m f56952g = Yg.n.b(b.f56953a);

    public static final class a {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lorg/kodein/type/e$a$a;", "T", "", "<init>", "()V", "Ljava/lang/reflect/Type;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Ljava/lang/reflect/Type;", "type", "kaverit"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: org.kodein.type.e$a$a, reason: collision with other inner class name */
        private static abstract class AbstractC2019a<T> {
            public final Type a() {
                Type genericSuperclass = getClass().getGenericSuperclass();
                AbstractC6492s.g(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
                AbstractC6492s.h(type, "(javaClass.genericSuperc…e).actualTypeArguments[0]");
                return type;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean d() {
            return ((Boolean) e.f56952g.getValue()).booleanValue();
        }

        private final boolean e() {
            return ((Boolean) e.f56951f.getValue()).booleanValue();
        }

        public final boolean a(Type left, Type right) {
            AbstractC6492s.i(left, "left");
            AbstractC6492s.i(right, "right");
            if (!AbstractC6492s.d(left.getClass(), right.getClass())) {
                return false;
            }
            if (!e() || !(left instanceof ParameterizedType)) {
                if (!d() || !(left instanceof GenericArrayType)) {
                    return AbstractC6492s.d(left, right);
                }
                Type genericComponentType = ((GenericArrayType) left).getGenericComponentType();
                AbstractC6492s.h(genericComponentType, "left.genericComponentType");
                Type genericComponentType2 = ((GenericArrayType) right).getGenericComponentType();
                AbstractC6492s.h(genericComponentType2, "right.genericComponentType");
                return a(genericComponentType, genericComponentType2);
            }
            ParameterizedType parameterizedType = (ParameterizedType) right;
            ParameterizedType parameterizedType2 = (ParameterizedType) left;
            Type rawType = parameterizedType2.getRawType();
            AbstractC6492s.h(rawType, "left.rawType");
            Type rawType2 = parameterizedType.getRawType();
            AbstractC6492s.h(rawType2, "right.rawType");
            if (!a(rawType, rawType2)) {
                return false;
            }
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            AbstractC6492s.h(actualTypeArguments, "left.actualTypeArguments");
            Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
            AbstractC6492s.h(actualTypeArguments2, "right.actualTypeArguments");
            return b(actualTypeArguments, actualTypeArguments2);
        }

        public final boolean b(Type[] left, Type[] right) {
            AbstractC6492s.i(left, "left");
            AbstractC6492s.i(right, "right");
            if (left.length != right.length) {
                return false;
            }
            Iterable iterableC0 = AbstractC3682n.c0(left);
            if (!(iterableC0 instanceof Collection) || !((Collection) iterableC0).isEmpty()) {
                Iterator it = iterableC0.iterator();
                while (it.hasNext()) {
                    int iD = ((Q) it).d();
                    if (!e.f56950e.a(left[iD], right[iD])) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int c(Type type) {
            AbstractC6492s.i(type, "type");
            if (!e() || !(type instanceof ParameterizedType)) {
                if (!d() || !(type instanceof GenericArrayType)) {
                    return type.hashCode();
                }
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                AbstractC6492s.h(genericComponentType, "type.genericComponentType");
                return c(genericComponentType) + 53;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            AbstractC6492s.h(rawType, "type.rawType");
            int iC = c(rawType);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            AbstractC6492s.h(actualTypeArguments, "type.actualTypeArguments");
            for (Type arg : actualTypeArguments) {
                AbstractC6492s.h(arg, "arg");
                iC = (iC * 31) + c(arg);
            }
            return iC;
        }

        private a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f56953a = new b();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001¨\u0006\u0005"}, d2 = {"org/kodein/type/e$b$a", "Lorg/kodein/type/e$a$a;", "", "", "", "kaverit"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends a.AbstractC2019a<List<? extends String>[]> {
            a() {
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001¨\u0006\u0005"}, d2 = {"org/kodein/type/e$b$b", "Lorg/kodein/type/e$a$a;", "", "", "", "kaverit"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: org.kodein.type.e$b$b, reason: collision with other inner class name */
        public static final class C2020b extends a.AbstractC2019a<List<? extends String>[]> {
            C2020b() {
            }
        }

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            AbstractC6492s.g(new a().a(), "null cannot be cast to non-null type java.lang.reflect.GenericArrayType");
            AbstractC6492s.g(new C2020b().a(), "null cannot be cast to non-null type java.lang.reflect.GenericArrayType");
            return Boolean.valueOf(!AbstractC6492s.d((GenericArrayType) r0, (GenericArrayType) r2));
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f56954a = new c();

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"org/kodein/type/e$c$a", "Lorg/kodein/type/e$a$a;", "", "", "kaverit"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends a.AbstractC2019a<List<? extends String>> {
            a() {
            }
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"org/kodein/type/e$c$b", "Lorg/kodein/type/e$a$a;", "", "", "kaverit"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b extends a.AbstractC2019a<List<? extends String>> {
            b() {
            }
        }

        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            AbstractC6492s.g(new a().a(), "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
            AbstractC6492s.g(new b().a(), "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
            return Boolean.valueOf(!AbstractC6492s.d((ParameterizedType) r0, (ParameterizedType) r2));
        }
    }

    @Override // org.kodein.type.q
    public String h() {
        return org.kodein.type.b.g(e());
    }

    @Override // org.kodein.type.q
    public String i() {
        return org.kodein.type.b.h(e());
    }

    @Override // org.kodein.type.a
    public final boolean j(q other) {
        AbstractC6492s.i(other, "other");
        if (other instanceof i) {
            return f56950e.a(e(), ((i) other).e());
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // org.kodein.type.a
    public final int k() {
        return f56950e.c(e());
    }
}
