package org.kodein.type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lorg/kodein/type/o;", "T", "", "<init>", "()V", "Ljava/lang/reflect/Type;", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/reflect/Type;", "()Ljava/lang/reflect/Type;", "superType", "kaverit"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class o<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Type superType;

    public o() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = genericSuperclass instanceof ParameterizedType ? (ParameterizedType) genericSuperclass : null;
        if (parameterizedType == null) {
            throw new RuntimeException("Invalid TypeToken; must specify type parameters");
        }
        Type type = parameterizedType.getActualTypeArguments()[0];
        AbstractC6492s.h(type, "(javaClass.genericSuperc…)).actualTypeArguments[0]");
        this.superType = type;
    }

    /* renamed from: a, reason: from getter */
    public final Type getSuperType() {
        return this.superType;
    }
}
