package org.kodein.type;

import Zg.AbstractC3682n;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class l implements ParameterizedType {

    /* renamed from: d, reason: collision with root package name */
    public static final a f56958d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Class f56959a;

    /* renamed from: b, reason: collision with root package name */
    private final Type[] f56960b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f56961c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(ParameterizedType type) {
            AbstractC6492s.i(type, "type");
            if (type instanceof l) {
                return (l) type;
            }
            Class clsF = j.f(type);
            Type[] actualTypeArguments = type.getActualTypeArguments();
            AbstractC6492s.h(actualTypeArguments, "type.actualTypeArguments");
            ArrayList arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                arrayList.add(j.h(type2));
            }
            return new l(clsF, (Type[]) arrayList.toArray(new Type[0]), j.h(type.getOwnerType()));
        }

        private a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f56962a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Type it) {
            AbstractC6492s.i(it, "it");
            String typeName = it.getTypeName();
            AbstractC6492s.h(typeName, "it.typeName");
            return typeName;
        }
    }

    public l(Class rawType, Type[] args, Type type) {
        AbstractC6492s.i(rawType, "rawType");
        AbstractC6492s.i(args, "args");
        this.f56959a = rawType;
        this.f56960b = args;
        this.f56961c = type;
    }

    @Override // java.lang.reflect.ParameterizedType
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Class getRawType() {
        return this.f56959a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Type)) {
            return false;
        }
        return j.l(this, (Type) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f56960b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f56961c;
    }

    public int hashCode() {
        return j.m(this);
    }

    public String toString() {
        String simpleName;
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f56961c;
        if (type != null) {
            sb2.append(type.getTypeName());
            sb2.append("$");
            if (this.f56961c instanceof ParameterizedType) {
                String name = this.f56959a.getName();
                AbstractC6492s.h(name, "rawType.name");
                StringBuilder sb3 = new StringBuilder();
                Type rawType = ((ParameterizedType) this.f56961c).getRawType();
                AbstractC6492s.g(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                sb3.append(((Class) rawType).getName());
                sb3.append('$');
                simpleName = t.L(name, sb3.toString(), "", false, 4, null);
            } else {
                simpleName = this.f56959a.getSimpleName();
            }
            sb2.append(simpleName);
        } else {
            sb2.append(this.f56959a.getName());
        }
        Type[] typeArr = this.f56960b;
        if (!(typeArr.length == 0)) {
            sb2.append(AbstractC3682n.I0(typeArr, ", ", "<", ">", 0, null, b.f56962a, 24, null));
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
