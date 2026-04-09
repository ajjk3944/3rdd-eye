package com.unity3d.services.core.domain.task;

import c9.c;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateComplete", f = "InitializeStateComplete.kt", i = {}, l = {21}, m = "doWork-gIAlu-s", n = {}, s = {})
/* loaded from: classes3.dex */
public final class InitializeStateComplete$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$1(InitializeStateComplete initializeStateComplete, c cVar) {
        super(cVar);
        this.this$0 = initializeStateComplete;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM237doWorkgIAlus = this.this$0.mo230doWorkgIAlus((InitializeStateComplete.Params) null, (c) this);
        return objM237doWorkgIAlus == a.f() ? objM237doWorkgIAlus : Result.a(objM237doWorkgIAlus);
    }
}
