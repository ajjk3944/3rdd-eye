package com.google.protobuf;

import com.google.protobuf.Method;
import com.google.protobuf.MethodKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/MethodKt$Dsl;", "Ly8/s;", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/google/protobuf/Method;", "-initializemethod", "(Ll9/l;)Lcom/google/protobuf/Method;", "method", "copy", "(Lcom/google/protobuf/Method;Ll9/l;)Lcom/google/protobuf/Method;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMethodKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodKt.kt\ncom/google/protobuf/MethodKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
/* loaded from: classes3.dex */
public final class MethodKtKt {
    @JvmName(name = "-initializemethod")
    @NotNull
    /* renamed from: -initializemethod, reason: not valid java name */
    public static final Method m181initializemethod(@NotNull l9.l block) {
        kotlin.jvm.internal.p.e(block, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.INSTANCE;
        Method.Builder builderNewBuilder = Method.newBuilder();
        kotlin.jvm.internal.p.d(builderNewBuilder, "newBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Method copy(@NotNull Method method, @NotNull l9.l block) {
        kotlin.jvm.internal.p.e(method, "<this>");
        kotlin.jvm.internal.p.e(block, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.INSTANCE;
        Method.Builder builder = method.toBuilder();
        kotlin.jvm.internal.p.d(builder, "this.toBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
