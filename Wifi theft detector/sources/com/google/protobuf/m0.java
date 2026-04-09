package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class m0 {
    private static final m0 INSTANCE = new m0();
    private final ConcurrentMap<Class<?>, q0> schemaCache = new ConcurrentHashMap();
    private final r0 schemaFactory = new y();

    private m0() {
    }

    public static m0 getInstance() {
        return INSTANCE;
    }

    public int getTotalSchemaSize() {
        int schemaSize = 0;
        for (q0 q0Var : this.schemaCache.values()) {
            if (q0Var instanceof f0) {
                schemaSize += ((f0) q0Var).getSchemaSize();
            }
        }
        return schemaSize;
    }

    public <T> boolean isInitialized(T t10) {
        return schemaFor((m0) t10).isInitialized(t10);
    }

    public <T> void makeImmutable(T t10) {
        schemaFor((m0) t10).makeImmutable(t10);
    }

    public <T> void mergeFrom(T t10, p0 p0Var) throws IOException {
        mergeFrom(t10, p0Var, ExtensionRegistryLite.getEmptyRegistry());
    }

    public q0 registerSchema(Class<?> cls, q0 q0Var) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(q0Var, "schema");
        return this.schemaCache.putIfAbsent(cls, q0Var);
    }

    @CanIgnoreReturnValue
    public q0 registerSchemaOverride(Class<?> cls, q0 q0Var) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(q0Var, "schema");
        return this.schemaCache.put(cls, q0Var);
    }

    public <T> q0 schemaFor(Class<T> cls) {
        q0 q0VarRegisterSchema;
        Internal.checkNotNull(cls, "messageType");
        q0 q0VarCreateSchema = this.schemaCache.get(cls);
        return (q0VarCreateSchema != null || (q0VarRegisterSchema = registerSchema(cls, (q0VarCreateSchema = this.schemaFactory.createSchema(cls)))) == null) ? q0VarCreateSchema : q0VarRegisterSchema;
    }

    public <T> void writeTo(T t10, Writer writer) throws IOException {
        schemaFor((m0) t10).writeTo(t10, writer);
    }

    public <T> void mergeFrom(T t10, p0 p0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        schemaFor((m0) t10).mergeFrom(t10, p0Var, extensionRegistryLite);
    }

    public <T> q0 schemaFor(T t10) {
        return schemaFor((Class) t10.getClass());
    }
}
