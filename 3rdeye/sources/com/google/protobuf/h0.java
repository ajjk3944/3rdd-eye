package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Protobuf.java */
/* loaded from: classes2.dex */
public final class h0 {
    private static final h0 INSTANCE = new h0();
    private final ConcurrentMap<Class<?>, n0<?>> schemaCache = new ConcurrentHashMap();
    private final o0 schemaFactory = new L();

    private h0() {
    }

    public static h0 getInstance() {
        return INSTANCE;
    }

    public int getTotalSchemaSize() {
        int schemaSize = 0;
        for (n0<?> n0Var : this.schemaCache.values()) {
            if (n0Var instanceof X) {
                schemaSize = ((X) n0Var).getSchemaSize() + schemaSize;
            }
        }
        return schemaSize;
    }

    public <T> boolean isInitialized(T t10) {
        return schemaFor((h0) t10).isInitialized(t10);
    }

    public <T> void makeImmutable(T t10) {
        schemaFor((h0) t10).makeImmutable(t10);
    }

    public <T> void mergeFrom(T t10, l0 l0Var) throws IOException {
        mergeFrom(t10, l0Var, C4034q.getEmptyRegistry());
    }

    public n0<?> registerSchema(Class<?> cls, n0<?> n0Var) {
        B.checkNotNull(cls, "messageType");
        B.checkNotNull(n0Var, "schema");
        return this.schemaCache.putIfAbsent(cls, n0Var);
    }

    public n0<?> registerSchemaOverride(Class<?> cls, n0<?> n0Var) {
        B.checkNotNull(cls, "messageType");
        B.checkNotNull(n0Var, "schema");
        return this.schemaCache.put(cls, n0Var);
    }

    public <T> n0<T> schemaFor(Class<T> cls) {
        B.checkNotNull(cls, "messageType");
        n0<T> n0VarCreateSchema = (n0) this.schemaCache.get(cls);
        if (n0VarCreateSchema == null) {
            n0VarCreateSchema = this.schemaFactory.createSchema(cls);
            n0<T> n0Var = (n0<T>) registerSchema(cls, n0VarCreateSchema);
            if (n0Var != null) {
                return n0Var;
            }
        }
        return n0VarCreateSchema;
    }

    public <T> void writeTo(T t10, B0 b02) throws IOException {
        schemaFor((h0) t10).writeTo(t10, b02);
    }

    public <T> void mergeFrom(T t10, l0 l0Var, C4034q c4034q) throws IOException {
        schemaFor((h0) t10).mergeFrom(t10, l0Var, c4034q);
    }

    public <T> n0<T> schemaFor(T t10) {
        return schemaFor((Class) t10.getClass());
    }
}
