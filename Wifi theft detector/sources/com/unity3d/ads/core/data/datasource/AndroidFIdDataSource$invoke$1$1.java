package com.unity3d.ads.core.data.datasource;

import c9.f;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import l9.l;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "", "<anonymous>", "(Lkotlinx/coroutines/j0;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1", f = "AndroidFIdDataSource.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class AndroidFIdDataSource$invoke$1$1 extends SuspendLambda implements p {
    final /* synthetic */ Task<String> $task;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFIdDataSource$invoke$1$1(Task<String> task, c9.c cVar) {
        super(2, cVar);
        this.$task = task;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c9.c create(@Nullable Object obj, @NotNull c9.c cVar) {
        return new AndroidFIdDataSource$invoke$1$1(this.$task, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objF = kotlin.coroutines.intrinsics.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return obj;
        }
        kotlin.c.b(obj);
        Task<String> task = this.$task;
        this.L$0 = task;
        this.label = 1;
        final f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(this));
        final l lVar = new l() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$1
            {
                super(1);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((String) obj2);
                return s.f25199a;
            }

            public final void invoke(@Nullable String str) {
                fVar.resumeWith(Result.b(str));
            }
        };
        task.addOnSuccessListener(new OnSuccessListener(lVar) { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$sam$com_google_android_gms_tasks_OnSuccessListener$0
            private final /* synthetic */ l function;

            {
                kotlin.jvm.internal.p.e(lVar, "function");
                this.function = lVar;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj2) {
                this.function.invoke(obj2);
            }
        });
        task.addOnFailureListener(new OnFailureListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(@NotNull Exception it) {
                kotlin.jvm.internal.p.e(it, "it");
                c9.c cVar = fVar;
                Result.Companion companion = Result.INSTANCE;
                cVar.resumeWith(Result.b(kotlin.c.a(it)));
            }
        });
        Object objA = fVar.a();
        if (objA == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(this);
        }
        return objA == objF ? objF : objA;
    }

    @Override // l9.p
    @Nullable
    public final Object invoke(@NotNull j0 j0Var, @Nullable c9.c cVar) {
        return ((AndroidFIdDataSource$invoke$1$1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
