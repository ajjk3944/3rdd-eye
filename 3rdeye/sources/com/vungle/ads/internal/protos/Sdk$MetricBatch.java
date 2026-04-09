package com.vungle.ads.internal.protos;

import com.google.protobuf.AbstractC4016a;
import com.google.protobuf.AbstractC4026i;
import com.google.protobuf.AbstractC4027j;
import com.google.protobuf.AbstractC4042z;
import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C4034q;
import com.google.protobuf.e0;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class Sdk$MetricBatch extends AbstractC4042z<Sdk$MetricBatch, a> implements b {
    private static final Sdk$MetricBatch DEFAULT_INSTANCE;
    public static final int METRICS_FIELD_NUMBER = 1;
    private static volatile e0<Sdk$MetricBatch> PARSER;
    private B.i<Sdk$SDKMetric> metrics_ = AbstractC4042z.emptyProtobufList();

    public static final class a extends AbstractC4042z.b<Sdk$MetricBatch, a> implements b {
        public /* synthetic */ a(com.vungle.ads.internal.protos.a aVar) {
            this();
        }

        public a addAllMetrics(Iterable<? extends Sdk$SDKMetric> iterable) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addAllMetrics(iterable);
            return this;
        }

        public a addMetrics(Sdk$SDKMetric sdk$SDKMetric) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addMetrics(sdk$SDKMetric);
            return this;
        }

        public a clearMetrics() {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).clearMetrics();
            return this;
        }

        @Override // com.vungle.ads.internal.protos.b
        public Sdk$SDKMetric getMetrics(int i) {
            return ((Sdk$MetricBatch) this.instance).getMetrics(i);
        }

        @Override // com.vungle.ads.internal.protos.b
        public int getMetricsCount() {
            return ((Sdk$MetricBatch) this.instance).getMetricsCount();
        }

        @Override // com.vungle.ads.internal.protos.b
        public List<Sdk$SDKMetric> getMetricsList() {
            return Collections.unmodifiableList(((Sdk$MetricBatch) this.instance).getMetricsList());
        }

        public a removeMetrics(int i) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).removeMetrics(i);
            return this;
        }

        public a setMetrics(int i, Sdk$SDKMetric sdk$SDKMetric) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).setMetrics(i, sdk$SDKMetric);
            return this;
        }

        private a() {
            super(Sdk$MetricBatch.DEFAULT_INSTANCE);
        }

        public a addMetrics(int i, Sdk$SDKMetric sdk$SDKMetric) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addMetrics(i, sdk$SDKMetric);
            return this;
        }

        public a setMetrics(int i, Sdk$SDKMetric.a aVar) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).setMetrics(i, aVar.build());
            return this;
        }

        public a addMetrics(Sdk$SDKMetric.a aVar) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addMetrics(aVar.build());
            return this;
        }

        public a addMetrics(int i, Sdk$SDKMetric.a aVar) {
            copyOnWrite();
            ((Sdk$MetricBatch) this.instance).addMetrics(i, aVar.build());
            return this;
        }
    }

    static {
        Sdk$MetricBatch sdk$MetricBatch = new Sdk$MetricBatch();
        DEFAULT_INSTANCE = sdk$MetricBatch;
        AbstractC4042z.registerDefaultInstance(Sdk$MetricBatch.class, sdk$MetricBatch);
    }

    private Sdk$MetricBatch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetrics(Iterable<? extends Sdk$SDKMetric> iterable) {
        ensureMetricsIsMutable();
        AbstractC4016a.addAll((Iterable) iterable, (List) this.metrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(sdk$SDKMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetrics() {
        this.metrics_ = AbstractC4042z.emptyProtobufList();
    }

    private void ensureMetricsIsMutable() {
        B.i<Sdk$SDKMetric> iVar = this.metrics_;
        if (iVar.isModifiable()) {
            return;
        }
        this.metrics_ = AbstractC4042z.mutableCopy(iVar);
    }

    public static Sdk$MetricBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$MetricBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$MetricBatch) AbstractC4042z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$MetricBatch parseFrom(ByteBuffer byteBuffer) throws C {
        return (Sdk$MetricBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e0<Sdk$MetricBatch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetrics(int i) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetrics(int i, Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.set(i, sdk$SDKMetric);
    }

    @Override // com.google.protobuf.AbstractC4042z
    public final Object dynamicMethod(AbstractC4042z.h hVar, Object obj, Object obj2) {
        e0 cVar;
        com.vungle.ads.internal.protos.a aVar = null;
        switch (com.vungle.ads.internal.protos.a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[hVar.ordinal()]) {
            case 1:
                return new Sdk$MetricBatch();
            case 2:
                return new a(aVar);
            case 3:
                return AbstractC4042z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"metrics_", Sdk$SDKMetric.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                e0<Sdk$MetricBatch> e0Var = PARSER;
                if (e0Var != null) {
                    return e0Var;
                }
                synchronized (Sdk$MetricBatch.class) {
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

    @Override // com.vungle.ads.internal.protos.b
    public Sdk$SDKMetric getMetrics(int i) {
        return this.metrics_.get(i);
    }

    @Override // com.vungle.ads.internal.protos.b
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // com.vungle.ads.internal.protos.b
    public List<Sdk$SDKMetric> getMetricsList() {
        return this.metrics_;
    }

    public e getMetricsOrBuilder(int i) {
        return this.metrics_.get(i);
    }

    public List<? extends e> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    public static a newBuilder(Sdk$MetricBatch sdk$MetricBatch) {
        return DEFAULT_INSTANCE.createBuilder(sdk$MetricBatch);
    }

    public static Sdk$MetricBatch parseDelimitedFrom(InputStream inputStream, C4034q c4034q) throws IOException {
        return (Sdk$MetricBatch) AbstractC4042z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c4034q);
    }

    public static Sdk$MetricBatch parseFrom(ByteBuffer byteBuffer, C4034q c4034q) throws C {
        return (Sdk$MetricBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c4034q);
    }

    public static Sdk$MetricBatch parseFrom(AbstractC4026i abstractC4026i) throws C {
        return (Sdk$MetricBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, abstractC4026i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(int i, Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(i, sdk$SDKMetric);
    }

    public static Sdk$MetricBatch parseFrom(AbstractC4026i abstractC4026i, C4034q c4034q) throws C {
        return (Sdk$MetricBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, abstractC4026i, c4034q);
    }

    public static Sdk$MetricBatch parseFrom(byte[] bArr) throws C {
        return (Sdk$MetricBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$MetricBatch parseFrom(byte[] bArr, C4034q c4034q) throws C {
        return (Sdk$MetricBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, bArr, c4034q);
    }

    public static Sdk$MetricBatch parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$MetricBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$MetricBatch parseFrom(InputStream inputStream, C4034q c4034q) throws IOException {
        return (Sdk$MetricBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, inputStream, c4034q);
    }

    public static Sdk$MetricBatch parseFrom(AbstractC4027j abstractC4027j) throws IOException {
        return (Sdk$MetricBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, abstractC4027j);
    }

    public static Sdk$MetricBatch parseFrom(AbstractC4027j abstractC4027j, C4034q c4034q) throws IOException {
        return (Sdk$MetricBatch) AbstractC4042z.parseFrom(DEFAULT_INSTANCE, abstractC4027j, c4034q);
    }
}
