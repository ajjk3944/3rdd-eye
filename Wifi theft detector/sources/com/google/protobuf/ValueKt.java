package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.Value;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/ValueKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ValueKt {

    @NotNull
    public static final ValueKt INSTANCE = new ValueKt();

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR$\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\"8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010-\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00103\u001a\u00020.2\u0006\u0010\u001c\u001a\u00020.8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00107\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u000e\"\u0004\b5\u00106R$\u0010=\u001a\u0002082\u0006\u0010\u001c\u001a\u0002088G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010C\u001a\u00020>2\u0006\u0010\u001c\u001a\u00020>8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0011\u0010G\u001a\u00020D8G¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/google/protobuf/ValueKt$Dsl;", "", "Lcom/google/protobuf/Value$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/Value$Builder;)V", "Lcom/google/protobuf/Value;", "_build", "()Lcom/google/protobuf/Value;", "Ly8/s;", "clearNullValue", "()V", "", "hasNullValue", "()Z", "clearNumberValue", "hasNumberValue", "clearStringValue", "hasStringValue", "clearBoolValue", "hasBoolValue", "clearStructValue", "hasStructValue", "clearListValue", "hasListValue", "clearKind", "Lcom/google/protobuf/Value$Builder;", "Lcom/google/protobuf/NullValue;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getNullValue", "()Lcom/google/protobuf/NullValue;", "setNullValue", "(Lcom/google/protobuf/NullValue;)V", "nullValue", "", "getNullValueValue", "()I", "setNullValueValue", "(I)V", "nullValueValue", "", "getNumberValue", "()D", "setNumberValue", "(D)V", "numberValue", "", "getStringValue", "()Ljava/lang/String;", "setStringValue", "(Ljava/lang/String;)V", "stringValue", "getBoolValue", "setBoolValue", "(Z)V", "boolValue", "Lcom/google/protobuf/Struct;", "getStructValue", "()Lcom/google/protobuf/Struct;", "setStructValue", "(Lcom/google/protobuf/Struct;)V", "structValue", "Lcom/google/protobuf/ListValue;", "getListValue", "()Lcom/google/protobuf/ListValue;", "setListValue", "(Lcom/google/protobuf/ListValue;)V", "listValue", "Lcom/google/protobuf/Value$KindCase;", "getKindCase", "()Lcom/google/protobuf/Value$KindCase;", "kindCase", "Companion", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final Value.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/ValueKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/ValueKt$Dsl;", "builder", "Lcom/google/protobuf/Value$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(Value.Builder builder) {
                kotlin.jvm.internal.p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Value.Builder builder, kotlin.jvm.internal.i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ Value _build() {
            Value valueBuild = this._builder.build();
            kotlin.jvm.internal.p.d(valueBuild, "_builder.build()");
            return valueBuild;
        }

        public final void clearBoolValue() {
            this._builder.clearBoolValue();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearListValue() {
            this._builder.clearListValue();
        }

        public final void clearNullValue() {
            this._builder.clearNullValue();
        }

        public final void clearNumberValue() {
            this._builder.clearNumberValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final void clearStructValue() {
            this._builder.clearStructValue();
        }

        @JvmName(name = "getBoolValue")
        public final boolean getBoolValue() {
            return this._builder.getBoolValue();
        }

        @JvmName(name = "getKindCase")
        @NotNull
        public final Value.KindCase getKindCase() {
            Value.KindCase kindCase = this._builder.getKindCase();
            kotlin.jvm.internal.p.d(kindCase, "_builder.getKindCase()");
            return kindCase;
        }

        @JvmName(name = "getListValue")
        @NotNull
        public final ListValue getListValue() {
            ListValue listValue = this._builder.getListValue();
            kotlin.jvm.internal.p.d(listValue, "_builder.getListValue()");
            return listValue;
        }

        @JvmName(name = "getNullValue")
        @NotNull
        public final NullValue getNullValue() {
            NullValue nullValue = this._builder.getNullValue();
            kotlin.jvm.internal.p.d(nullValue, "_builder.getNullValue()");
            return nullValue;
        }

        @JvmName(name = "getNullValueValue")
        public final int getNullValueValue() {
            return this._builder.getNullValueValue();
        }

        @JvmName(name = "getNumberValue")
        public final double getNumberValue() {
            return this._builder.getNumberValue();
        }

        @JvmName(name = "getStringValue")
        @NotNull
        public final String getStringValue() {
            String stringValue = this._builder.getStringValue();
            kotlin.jvm.internal.p.d(stringValue, "_builder.getStringValue()");
            return stringValue;
        }

        @JvmName(name = "getStructValue")
        @NotNull
        public final Struct getStructValue() {
            Struct structValue = this._builder.getStructValue();
            kotlin.jvm.internal.p.d(structValue, "_builder.getStructValue()");
            return structValue;
        }

        public final boolean hasBoolValue() {
            return this._builder.hasBoolValue();
        }

        public final boolean hasListValue() {
            return this._builder.hasListValue();
        }

        public final boolean hasNullValue() {
            return this._builder.hasNullValue();
        }

        public final boolean hasNumberValue() {
            return this._builder.hasNumberValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final boolean hasStructValue() {
            return this._builder.hasStructValue();
        }

        @JvmName(name = "setBoolValue")
        public final void setBoolValue(boolean z10) {
            this._builder.setBoolValue(z10);
        }

        @JvmName(name = "setListValue")
        public final void setListValue(@NotNull ListValue value) {
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.setListValue(value);
        }

        @JvmName(name = "setNullValue")
        public final void setNullValue(@NotNull NullValue value) {
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.setNullValue(value);
        }

        @JvmName(name = "setNullValueValue")
        public final void setNullValueValue(int i10) {
            this._builder.setNullValueValue(i10);
        }

        @JvmName(name = "setNumberValue")
        public final void setNumberValue(double d10) {
            this._builder.setNumberValue(d10);
        }

        @JvmName(name = "setStringValue")
        public final void setStringValue(@NotNull String value) {
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.setStringValue(value);
        }

        @JvmName(name = "setStructValue")
        public final void setStructValue(@NotNull Struct value) {
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.setStructValue(value);
        }

        private Dsl(Value.Builder builder) {
            this._builder = builder;
        }
    }

    private ValueKt() {
    }
}
