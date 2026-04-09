package com.unity3d.ads.core.data.repository;

import c9.c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.j0;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "<anonymous>", "(Lkotlinx/coroutines/j0;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$nativeConfiguration$1", f = "AndroidSessionRepository.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class AndroidSessionRepository$nativeConfiguration$1 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSessionRepository$nativeConfiguration$1(AndroidSessionRepository androidSessionRepository, c cVar) {
        super(2, cVar);
        this.this$0 = androidSessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        return new AndroidSessionRepository$nativeConfiguration$1(this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objF = a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return obj;
        }
        kotlin.c.b(obj);
        b bVar = this.this$0.persistedNativeConfiguration;
        this.label = 1;
        Object objR = d.r(bVar, this);
        return objR == objF ? objF : objR;
    }

    @Override // l9.p
    @Nullable
    public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
        return ((AndroidSessionRepository$nativeConfiguration$1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
