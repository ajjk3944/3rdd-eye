package com.unity3d.services.core.domain.task;

import c9.c;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError", f = "InitializeStateNetworkError.kt", i = {}, l = {33}, m = "doWork-gIAlu-s", n = {}, s = {})
/* loaded from: classes3.dex */
public final class InitializeStateNetworkError$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$1(InitializeStateNetworkError initializeStateNetworkError, c cVar) {
        super(cVar);
        this.this$0 = initializeStateNetworkError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo230doWorkgIAlus = this.this$0.mo230doWorkgIAlus((InitializeStateNetworkError.Params) null, (c) this);
        return objMo230doWorkgIAlus == a.f() ? objMo230doWorkgIAlus : Result.a(objMo230doWorkgIAlus);
    }
}
