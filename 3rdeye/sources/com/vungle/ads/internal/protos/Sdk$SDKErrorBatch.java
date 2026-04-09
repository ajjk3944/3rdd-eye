package com.vungle.ads.internal.protos;

import com.google.protobuf.AbstractC4016a;
import com.google.protobuf.AbstractC4026i;
import com.google.protobuf.AbstractC4027j;
import com.google.protobuf.AbstractC4042z;
import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C4034q;
import com.google.protobuf.e0;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class Sdk$SDKErrorBatch extends AbstractC4042z<Sdk$SDKErrorBatch, a> implements c {
    private static final Sdk$SDKErrorBatch DEFAULT_INSTANCE;
    public static final int ERRORS_FIELD_NUMBER = 1;
    private static volatile e0<Sdk$SDKErrorBatch> PARSER;
    private B.i<Sdk$SDKError> errors_ = AbstractC4042z.emptyProtobufList();

    public static final class a extends AbstractC4042z.b<Sdk$SDKErrorBatch, a> implements c {
        public /* synthetic */ a(com.vungle.ads.internal.protos.a aVar) {
            this();
        }

        public a addAllErrors(Iterable<? extends Sdk$SDKError> iterable) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addAllErrors(iterable);
            return this;
        }

        public a addErrors(Sdk$SDKError sdk$SDKError) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addErrors(sdk$SDKError);
            return this;
        }

        public a clearErrors() {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).clearErrors();
            return this;
        }

        @Override // com.vungle.ads.internal.protos.c
        public Sdk$SDKError getErrors(int i) {
            return ((Sdk$SDKErrorBatch) this.instance).getErrors(i);
        }

        @Override // com.vungle.ads.internal.protos.c
        public int getErrorsCount() {
            return ((Sdk$SDKErrorBatch) this.instance).getErrorsCount();
        }

        @Override // com.vungle.ads.internal.protos.c
        public List<Sdk$SDKError> getErrorsList() {
            return Collections.unmodifiableList(((Sdk$SDKErrorBatch) this.instance).getErrorsList());
        }

        public a removeErrors(int i) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).removeErrors(i);
            return this;
        }

        public a setErrors(int i, Sdk$SDKError sdk$SDKError) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).setErrors(i, sdk$SDKError);
            return this;
        }

        private a() {
            super(Sdk$SDKErrorBatch.DEFAULT_INSTANCE);
        }

        public a addErrors(int i, Sdk$SDKError sdk$SDKError) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addErrors(i, sdk$SDKError);
            return this;
        }

        public a setErrors(int i, Sdk$SDKError.a aVar) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).setErrors(i, aVar.build());
            return this;
        }

        public a addErrors(Sdk$SDKError.a aVar) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addErrors(aVar.build());
            return this;
        }

        public a addErrors(int i, Sdk$SDKError.a aVar) {
            copyOnWrite();
            ((Sdk$SDKErrorBatch) this.instance).addErrors(i, aVar.build());
            return this;
        }
    }

    static {
        Sdk$SDKErrorBatch sdk$SDKErrorBatch = new Sdk$SDKErrorBatch();
        DEFAULT_INSTANCE = sdk$SDKErrorBatch;
        AbstractC4042z.registerDefaultInstance(Sdk$SDKErrorBatch.class, sdk$SDKErrorBatch);
    }

    private Sdk$SDKErrorBatch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllErrors(Iterable<? extends Sdk$SDKError> iterable) {
        ensureErrorsIsMutable();
        AbstractC4016a.addAll((Iterable) iterable, (List) this.errors_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addErrors(Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.add(sdk$SDKError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrors() {
        this.errors_ = AbstractC4042z.emptyProtobufList();
    }

    private void ensureErrorsIsMutable() {
        B.i<Sdk$SDKError> iVar = this.errors_;
        if (iVar.isModifiable()) {
            return;
        }
        this.errors_ = AbstractC4042z.mutableCopy(iVar);
    }

    public static Sdk$SDKErrorBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$SDKErrorBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKErrorBatch) AbstractC4042z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKErrorBatch parseFrom(ByteBuffer byteBuffer) throws C {
        return (Sdk$SDKErrorBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e0<Sdk$SDKErrorBatch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeErrors(int i) {
        ensureErrorsIsMutable();
        this.errors_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrors(int i, Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.set(i, sdk$SDKError);
    }

    @Override // com.google.protobuf.AbstractC4042z
    public final Object dynamicMethod(AbstractC4042z.h hVar, Object obj, Object obj2) {
        e0 cVar;
        com.vungle.ads.internal.protos.a aVar = null;
        switch (com.vungle.ads.internal.protos.a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[hVar.ordinal()]) {
            case 1:
                return new Sdk$SDKErrorBatch();
            case 2:
                return new a(aVar);
            case 3:
                return AbstractC4042z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"errors_", Sdk$SDKError.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                e0<Sdk$SDKErrorBatch> e0Var = PARSER;
                if (e0Var != null) {
                    return e0Var;
                }
                synchronized (Sdk$SDKErrorBatch.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new AbstractC4042z.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.vungle.ads.internal.protos.c
    public Sdk$SDKError getErrors(int i) {
        return this.errors_.get(i);
    }

    @Override // com.vungle.ads.internal.protos.c
    public int getErrorsCount() {
        return this.errors_.size();
    }

    @Override // com.vungle.ads.internal.protos.c
    public List<Sdk$SDKError> getErrorsList() {
        return this.errors_;
    }

    public d getErrorsOrBuilder(int i) {
        return this.errors_.get(i);
    }

    public List<? extends d> getErrorsOrBuilderList() {
        return this.errors_;
    }

    public static a newBuilder(Sdk$SDKErrorBatch sdk$SDKErrorBatch) {
        return DEFAULT_INSTANCE.createBuilder(sdk$SDKErrorBatch);
    }

    public static Sdk$SDKErrorBatch parseDelimitedFrom(InputStream inputStream, C4034q c4034q) throws IOException {
        return (Sdk$SDKErrorBatch) AbstractC4042z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c4034q);
    }

    public static Sdk$SDKErrorBatch parseFrom(ByteBuffer byteBuffer, C4034q c4034q) throws C {
        return (Sdk$SDKErrorBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c4034q);
    }

    public static Sdk$SDKErrorBatch parseFrom(AbstractC4026i abstractC4026i) throws C {
        return (Sdk$SDKErrorBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, abstractC4026i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addErrors(int i, Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.add(i, sdk$SDKError);
    }

    public static Sdk$SDKErrorBatch parseFrom(AbstractC4026i abstractC4026i, C4034q c4034q) throws C {
        return (Sdk$SDKErrorBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, abstractC4026i, c4034q);
    }

    public static Sdk$SDKErrorBatch parseFrom(byte[] bArr) throws C {
        return (Sdk$SDKErrorBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKErrorBatch parseFrom(byte[] bArr, C4034q c4034q) throws C {
        return (Sdk$SDKErrorBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, bArr, c4034q);
    }

    public static Sdk$SDKErrorBatch parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKErrorBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKErrorBatch parseFrom(InputStream inputStream, C4034q c4034q) throws IOException {
        return (Sdk$SDKErrorBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, inputStream, c4034q);
    }

    public static Sdk$SDKErrorBatch parseFrom(AbstractC4027j abstractC4027j) throws IOException {
        return (Sdk$SDKErrorBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, abstractC4027j);
    }

    public static Sdk$SDKErrorBatch parseFrom(AbstractC4027j abstractC4027j, C4034q c4034q) throws IOException {
        return (Sdk$SDKErrorBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, abstractC4027j, c4034q);
    }
}
