package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ListValue;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/ListValueKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ListValueKt {

    @NotNull
    public static final ListValueKt INSTANCE = new ListValueKt();

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0011\u0010\u000fJ-\u0010\u0017\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0087\n¢\u0006\u0004\b\u0018\u0010\u0016J0\u0010\u001d\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\nH\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/google/protobuf/ListValueKt$Dsl;", "", "Lcom/google/protobuf/ListValue$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/ListValue$Builder;)V", "Lcom/google/protobuf/ListValue;", "_build", "()Lcom/google/protobuf/ListValue;", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Value;", "Lcom/google/protobuf/ListValueKt$Dsl$ValuesProxy;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ly8/s;", "addValues", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/Value;)V", "add", "plusAssignValues", "plusAssign", "", "values", "addAllValues", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllValues", "", "index", "setValues", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/Value;)V", "set", "clearValues", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lcom/google/protobuf/ListValue$Builder;", "getValues", "()Lcom/google/protobuf/kotlin/DslList;", "Companion", "ValuesProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final ListValue.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/ListValueKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/ListValueKt$Dsl;", "builder", "Lcom/google/protobuf/ListValue$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(ListValue.Builder builder) {
                kotlin.jvm.internal.p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/ListValueKt$Dsl$ValuesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ValuesProxy extends DslProxy {
            private ValuesProxy() {
            }
        }

        public /* synthetic */ Dsl(ListValue.Builder builder, kotlin.jvm.internal.i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ ListValue _build() {
            ListValue listValueBuild = this._builder.build();
            kotlin.jvm.internal.p.d(listValueBuild, "_builder.build()");
            return listValueBuild;
        }

        @JvmName(name = "addAllValues")
        public final /* synthetic */ void addAllValues(DslList dslList, Iterable values) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(values, "values");
            this._builder.addAllValues(values);
        }

        @JvmName(name = "addValues")
        public final /* synthetic */ void addValues(DslList dslList, Value value) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.addValues(value);
        }

        @JvmName(name = "clearValues")
        public final /* synthetic */ void clearValues(DslList dslList) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            this._builder.clearValues();
        }

        public final /* synthetic */ DslList getValues() {
            List<Value> valuesList = this._builder.getValuesList();
            kotlin.jvm.internal.p.d(valuesList, "_builder.getValuesList()");
            return new DslList(valuesList);
        }

        @JvmName(name = "plusAssignAllValues")
        public final /* synthetic */ void plusAssignAllValues(DslList<Value, ValuesProxy> dslList, Iterable<Value> values) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(values, "values");
            addAllValues(dslList, values);
        }

        @JvmName(name = "plusAssignValues")
        public final /* synthetic */ void plusAssignValues(DslList<Value, ValuesProxy> dslList, Value value) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(value, "value");
            addValues(dslList, value);
        }

        @JvmName(name = "setValues")
        public final /* synthetic */ void setValues(DslList dslList, int i10, Value value) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.setValues(i10, value);
        }

        private Dsl(ListValue.Builder builder) {
            this._builder = builder;
        }
    }

    private ListValueKt() {
    }
}
