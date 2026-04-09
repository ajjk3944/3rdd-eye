package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.Type;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/TypeKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TypeKt {

    @NotNull
    public static final TypeKt INSTANCE = new TypeKt();

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0004^_`aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000f\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u0013\u0010\u0011J-\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0087\n¢\u0006\u0004\b\u001a\u0010\u0018J0\u0010\u001f\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\rH\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b \u0010!J'\u0010\u0012\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u000f\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J(\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u000f\u001a\u00020#H\u0087\n¢\u0006\u0004\b'\u0010&J-\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020#0\u0015H\u0007¢\u0006\u0004\b(\u0010\u0018J.\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020#0\u0015H\u0087\n¢\u0006\u0004\b)\u0010\u0018J0\u0010\u001f\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020#H\u0087\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\fH\u0007¢\u0006\u0004\b,\u0010!J'\u0010\u0012\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0\f2\u0006\u0010\u000f\u001a\u00020-H\u0007¢\u0006\u0004\b/\u00100J(\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0\f2\u0006\u0010\u000f\u001a\u00020-H\u0087\n¢\u0006\u0004\b1\u00100J-\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020-0\u0015H\u0007¢\u0006\u0004\b2\u0010\u0018J.\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020-0\u0015H\u0087\n¢\u0006\u0004\b3\u0010\u0018J0\u0010\u001f\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020-H\u0087\u0002¢\u0006\u0004\b4\u00105J\u001f\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0\fH\u0007¢\u0006\u0004\b6\u0010!J\r\u00107\u001a\u00020\t¢\u0006\u0004\b7\u0010\u000bJ\r\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\t¢\u0006\u0004\b;\u0010\u000bJ\r\u0010<\u001a\u00020\t¢\u0006\u0004\b<\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R$\u0010B\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001d\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001d\u0010G\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f8F¢\u0006\u0006\u001a\u0004\bF\u0010DR\u001d\u0010I\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0\f8F¢\u0006\u0006\u001a\u0004\bH\u0010DR$\u0010O\u001a\u00020J2\u0006\u0010\u000f\u001a\u00020J8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010U\u001a\u00020P2\u0006\u0010\u000f\u001a\u00020P8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010Z\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010]\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010?\"\u0004\b\\\u0010A¨\u0006b"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl;", "", "Lcom/google/protobuf/Type$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/Type$Builder;)V", "Lcom/google/protobuf/Type;", "_build", "()Lcom/google/protobuf/Type;", "Ly8/s;", "clearName", "()V", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Field;", "Lcom/google/protobuf/TypeKt$Dsl$FieldsProxy;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "addFields", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/Field;)V", "add", "plusAssignFields", "plusAssign", "", "values", "addAllFields", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllFields", "", "index", "setFields", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/Field;)V", "set", "clearFields", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "", "Lcom/google/protobuf/TypeKt$Dsl$OneofsProxy;", "addOneofs", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "plusAssignOneofs", "addAllOneofs", "plusAssignAllOneofs", "setOneofs", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "clearOneofs", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/TypeKt$Dsl$OptionsProxy;", "addOptions", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/Option;)V", "plusAssignOptions", "addAllOptions", "plusAssignAllOptions", "setOptions", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/Option;)V", "clearOptions", "clearSourceContext", "", "hasSourceContext", "()Z", "clearSyntax", "clearEdition", "Lcom/google/protobuf/Type$Builder;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "getFields", "()Lcom/google/protobuf/kotlin/DslList;", "fields", "getOneofs", "oneofs", "getOptions", "options", "Lcom/google/protobuf/SourceContext;", "getSourceContext", "()Lcom/google/protobuf/SourceContext;", "setSourceContext", "(Lcom/google/protobuf/SourceContext;)V", "sourceContext", "Lcom/google/protobuf/Syntax;", "getSyntax", "()Lcom/google/protobuf/Syntax;", "setSyntax", "(Lcom/google/protobuf/Syntax;)V", "syntax", "getSyntaxValue", "()I", "setSyntaxValue", "(I)V", "syntaxValue", "getEdition", "setEdition", "edition", "Companion", "FieldsProxy", "OneofsProxy", "OptionsProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final Type.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/TypeKt$Dsl;", "builder", "Lcom/google/protobuf/Type$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(Type.Builder builder) {
                kotlin.jvm.internal.p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$FieldsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$OneofsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class OneofsProxy extends DslProxy {
            private OneofsProxy() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Type.Builder builder, kotlin.jvm.internal.i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ Type _build() {
            Type typeBuild = this._builder.build();
            kotlin.jvm.internal.p.d(typeBuild, "_builder.build()");
            return typeBuild;
        }

        @JvmName(name = "addAllFields")
        public final /* synthetic */ void addAllFields(DslList dslList, Iterable values) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(values, "values");
            this._builder.addAllFields(values);
        }

        @JvmName(name = "addAllOneofs")
        public final /* synthetic */ void addAllOneofs(DslList dslList, Iterable values) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(values, "values");
            this._builder.addAllOneofs(values);
        }

        @JvmName(name = "addAllOptions")
        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(values, "values");
            this._builder.addAllOptions(values);
        }

        @JvmName(name = "addFields")
        public final /* synthetic */ void addFields(DslList dslList, Field value) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.addFields(value);
        }

        @JvmName(name = "addOneofs")
        public final /* synthetic */ void addOneofs(DslList dslList, String value) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.addOneofs(value);
        }

        @JvmName(name = "addOptions")
        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.addOptions(value);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        @JvmName(name = "clearFields")
        public final /* synthetic */ void clearFields(DslList dslList) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            this._builder.clearFields();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        @JvmName(name = "clearOneofs")
        public final /* synthetic */ void clearOneofs(DslList dslList) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            this._builder.clearOneofs();
        }

        @JvmName(name = "clearOptions")
        public final /* synthetic */ void clearOptions(DslList dslList) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        @JvmName(name = "getEdition")
        @NotNull
        public final String getEdition() {
            String edition = this._builder.getEdition();
            kotlin.jvm.internal.p.d(edition, "_builder.getEdition()");
            return edition;
        }

        public final /* synthetic */ DslList getFields() {
            List<Field> fieldsList = this._builder.getFieldsList();
            kotlin.jvm.internal.p.d(fieldsList, "_builder.getFieldsList()");
            return new DslList(fieldsList);
        }

        @JvmName(name = "getName")
        @NotNull
        public final String getName() {
            String name = this._builder.getName();
            kotlin.jvm.internal.p.d(name, "_builder.getName()");
            return name;
        }

        @NotNull
        public final DslList<String, OneofsProxy> getOneofs() {
            List<String> oneofsList = this._builder.getOneofsList();
            kotlin.jvm.internal.p.d(oneofsList, "_builder.getOneofsList()");
            return new DslList<>(oneofsList);
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            kotlin.jvm.internal.p.d(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        @JvmName(name = "getSourceContext")
        @NotNull
        public final SourceContext getSourceContext() {
            SourceContext sourceContext = this._builder.getSourceContext();
            kotlin.jvm.internal.p.d(sourceContext, "_builder.getSourceContext()");
            return sourceContext;
        }

        @JvmName(name = "getSyntax")
        @NotNull
        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            kotlin.jvm.internal.p.d(syntax, "_builder.getSyntax()");
            return syntax;
        }

        @JvmName(name = "getSyntaxValue")
        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        @JvmName(name = "plusAssignAllFields")
        public final /* synthetic */ void plusAssignAllFields(DslList<Field, FieldsProxy> dslList, Iterable<Field> values) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(values, "values");
            addAllFields(dslList, values);
        }

        @JvmName(name = "plusAssignAllOneofs")
        public final /* synthetic */ void plusAssignAllOneofs(DslList<String, OneofsProxy> dslList, Iterable<String> values) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(values, "values");
            addAllOneofs(dslList, values);
        }

        @JvmName(name = "plusAssignAllOptions")
        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> values) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(values, "values");
            addAllOptions(dslList, values);
        }

        @JvmName(name = "plusAssignFields")
        public final /* synthetic */ void plusAssignFields(DslList<Field, FieldsProxy> dslList, Field value) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(value, "value");
            addFields(dslList, value);
        }

        @JvmName(name = "plusAssignOneofs")
        public final /* synthetic */ void plusAssignOneofs(DslList<String, OneofsProxy> dslList, String value) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(value, "value");
            addOneofs(dslList, value);
        }

        @JvmName(name = "plusAssignOptions")
        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option value) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(value, "value");
            addOptions(dslList, value);
        }

        @JvmName(name = "setEdition")
        public final void setEdition(@NotNull String value) {
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.setEdition(value);
        }

        @JvmName(name = "setFields")
        public final /* synthetic */ void setFields(DslList dslList, int i10, Field value) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.setFields(i10, value);
        }

        @JvmName(name = "setName")
        public final void setName(@NotNull String value) {
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.setName(value);
        }

        @JvmName(name = "setOneofs")
        public final /* synthetic */ void setOneofs(DslList dslList, int i10, String value) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.setOneofs(i10, value);
        }

        @JvmName(name = "setOptions")
        public final /* synthetic */ void setOptions(DslList dslList, int i10, Option value) {
            kotlin.jvm.internal.p.e(dslList, "<this>");
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.setOptions(i10, value);
        }

        @JvmName(name = "setSourceContext")
        public final void setSourceContext(@NotNull SourceContext value) {
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.setSourceContext(value);
        }

        @JvmName(name = "setSyntax")
        public final void setSyntax(@NotNull Syntax value) {
            kotlin.jvm.internal.p.e(value, "value");
            this._builder.setSyntax(value);
        }

        @JvmName(name = "setSyntaxValue")
        public final void setSyntaxValue(int i10) {
            this._builder.setSyntaxValue(i10);
        }

        private Dsl(Type.Builder builder) {
            this._builder = builder;
        }
    }

    private TypeKt() {
    }
}
