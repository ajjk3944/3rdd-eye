package org.kodein.type;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c implements GenericArrayType {

    /* renamed from: b, reason: collision with root package name */
    public static final a f56946b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Type f56947a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(Type type) {
            c cVar;
            AbstractC6492s.i(type, "type");
            if (type instanceof c) {
                return (c) type;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (type instanceof GenericArrayType) {
                Type typeH = j.h(((GenericArrayType) type).getGenericComponentType());
                AbstractC6492s.h(typeH, "type.genericComponentType.kodein()");
                cVar = new c(typeH, defaultConstructorMarker);
            } else {
                cVar = new c(j.h(type), defaultConstructorMarker);
            }
            return cVar;
        }

        private a() {
        }
    }

    public /* synthetic */ c(Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(type);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Type)) {
            return false;
        }
        return j.l(this, (Type) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f56947a;
    }

    public int hashCode() {
        return j.m(this);
    }

    public String toString() {
        return "[L" + this.f56947a + ';';
    }

    private c(Type type) {
        this.f56947a = type;
    }
}
