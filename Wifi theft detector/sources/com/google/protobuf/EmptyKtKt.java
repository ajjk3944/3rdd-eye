package com.google.protobuf;

import com.google.protobuf.Empty;
import com.google.protobuf.EmptyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/EmptyKt$Dsl;", "Ly8/s;", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/google/protobuf/Empty;", "-initializeempty", "(Ll9/l;)Lcom/google/protobuf/Empty;", "empty", "copy", "(Lcom/google/protobuf/Empty;Ll9/l;)Lcom/google/protobuf/Empty;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmptyKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptyKt.kt\ncom/google/protobuf/EmptyKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* loaded from: classes3.dex */
public final class EmptyKtKt {
    @JvmName(name = "-initializeempty")
    @NotNull
    /* renamed from: -initializeempty, reason: not valid java name */
    public static final Empty m171initializeempty(@NotNull l9.l block) {
        kotlin.jvm.internal.p.e(block, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.INSTANCE;
        Empty.Builder builderNewBuilder = Empty.newBuilder();
        kotlin.jvm.internal.p.d(builderNewBuilder, "newBuilder()");
        EmptyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Empty copy(@NotNull Empty empty, @NotNull l9.l block) {
        kotlin.jvm.internal.p.e(empty, "<this>");
        kotlin.jvm.internal.p.e(block, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.INSTANCE;
        Empty.Builder builder = empty.toBuilder();
        kotlin.jvm.internal.p.d(builder, "this.toBuilder()");
        EmptyKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
