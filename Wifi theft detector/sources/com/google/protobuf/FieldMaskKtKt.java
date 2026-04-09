package com.google.protobuf;

import com.google.protobuf.FieldMask;
import com.google.protobuf.FieldMaskKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/FieldMaskKt$Dsl;", "Ly8/s;", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/google/protobuf/FieldMask;", "-initializefieldMask", "(Ll9/l;)Lcom/google/protobuf/FieldMask;", "fieldMask", "copy", "(Lcom/google/protobuf/FieldMask;Ll9/l;)Lcom/google/protobuf/FieldMask;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFieldMaskKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldMaskKt.kt\ncom/google/protobuf/FieldMaskKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
/* loaded from: classes3.dex */
public final class FieldMaskKtKt {
    @JvmName(name = "-initializefieldMask")
    @NotNull
    /* renamed from: -initializefieldMask, reason: not valid java name */
    public static final FieldMask m175initializefieldMask(@NotNull l9.l block) {
        kotlin.jvm.internal.p.e(block, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.INSTANCE;
        FieldMask.Builder builderNewBuilder = FieldMask.newBuilder();
        kotlin.jvm.internal.p.d(builderNewBuilder, "newBuilder()");
        FieldMaskKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final FieldMask copy(@NotNull FieldMask fieldMask, @NotNull l9.l block) {
        kotlin.jvm.internal.p.e(fieldMask, "<this>");
        kotlin.jvm.internal.p.e(block, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.INSTANCE;
        FieldMask.Builder builder = fieldMask.toBuilder();
        kotlin.jvm.internal.p.d(builder, "this.toBuilder()");
        FieldMaskKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
