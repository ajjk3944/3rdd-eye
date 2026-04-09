package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.os.Bundle;
import c9.c;
import com.unity3d.ads.core.domain.LifecycleEvent;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.l;
import kotlinx.coroutines.j0;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1", f = "AndroidGetLifecycleFlow.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1 extends SuspendLambda implements p {
    final /* synthetic */ l $$this$channelFlow;
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Bundle $bundle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1(l lVar, Activity activity, Bundle bundle, c cVar) {
        super(2, cVar);
        this.$$this$channelFlow = lVar;
        this.$activity = activity;
        this.$bundle = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        return new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1(this.$$this$channelFlow, this.$activity, this.$bundle, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objF = kotlin.coroutines.intrinsics.a.f();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            l lVar = this.$$this$channelFlow;
            LifecycleEvent.SaveInstanceState saveInstanceState = new LifecycleEvent.SaveInstanceState(new WeakReference(this.$activity), this.$bundle);
            this.label = 1;
            if (lVar.b(saveInstanceState, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return s.f25199a;
    }

    @Override // l9.p
    @Nullable
    public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
        return ((AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
