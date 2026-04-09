package com.unity3d.services.core.domain.task;

import c9.c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.MetricTask", f = "MetricTask.kt", i = {0, 0, 0}, l = {24}, m = "invoke-gIAlu-s$suspendImpl", n = {"$this", "result", "start$iv"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
public final class MetricTask$invoke$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricTask<P, R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MetricTask$invoke$1(MetricTask<? super P, R> metricTask, c cVar) {
        super(cVar);
        this.this$0 = metricTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM248invokegIAlus$suspendImpl = MetricTask.m248invokegIAlus$suspendImpl(this.this$0, null, this);
        return objM248invokegIAlus$suspendImpl == a.f() ? objM248invokegIAlus$suspendImpl : Result.a(objM248invokegIAlus$suspendImpl);
    }
}
