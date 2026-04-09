package com.unity3d.services.core.domain.task;

import c9.c;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.j0;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/j0;", "Lkotlin/Result;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "<anonymous>", "(Lkotlinx/coroutines/j0;)Lkotlin/Result;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", i = {0, 0, 1}, l = {46, 64, 71}, m = "invokeSuspend", n = {"$this$withContext", AdActivity.REQUEST_KEY_EXTRA, AdActivity.REQUEST_KEY_EXTRA}, s = {"L$0", "L$3", "L$2"})
@SourceDebugExtension({"SMAP\nInitializeStateLoadWeb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializeStateLoadWeb.kt\ncom/unity3d/services/core/domain/task/InitializeStateLoadWeb$doWork$2\n+ 2 CoroutineExtensions.kt\ncom/unity3d/services/core/extensions/CoroutineExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n24#2:110\n14#2,12:111\n26#2:124\n1#3:123\n*S KotlinDebug\n*F\n+ 1 InitializeStateLoadWeb.kt\ncom/unity3d/services/core/domain/task/InitializeStateLoadWeb$doWork$2\n*L\n40#1:110\n40#1:111,12\n40#1:124\n40#1:123\n*E\n"})
/* loaded from: classes3.dex */
public final class InitializeStateLoadWeb$doWork$2 extends SuspendLambda implements p {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, c cVar) {
        super(2, cVar);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, cVar);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x017d, code lost:
    
        if (r0 == r8) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #3 {all -> 0x004a, blocks: (B:17:0x003d, B:42:0x0148, B:39:0x0129), top: B:79:0x000c, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0161 A[Catch: all -> 0x0020, CancellationException -> 0x0023, TryCatch #5 {CancellationException -> 0x0023, all -> 0x0020, blocks: (B:8:0x0018, B:50:0x0180, B:54:0x01a3, B:56:0x01ad, B:59:0x01b8, B:60:0x01ca, B:62:0x01cd, B:63:0x01d9, B:45:0x015b, B:47:0x0161, B:51:0x0183, B:52:0x0195, B:44:0x0151, B:37:0x0123, B:53:0x0196, B:36:0x0119, B:27:0x0075, B:17:0x003d, B:42:0x0148, B:39:0x0129), top: B:79:0x000c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0183 A[Catch: all -> 0x0020, CancellationException -> 0x0023, TryCatch #5 {CancellationException -> 0x0023, all -> 0x0020, blocks: (B:8:0x0018, B:50:0x0180, B:54:0x01a3, B:56:0x01ad, B:59:0x01b8, B:60:0x01ca, B:62:0x01cd, B:63:0x01d9, B:45:0x015b, B:47:0x0161, B:51:0x0183, B:52:0x0195, B:44:0x0151, B:37:0x0123, B:53:0x0196, B:36:0x0119, B:27:0x0075, B:17:0x003d, B:42:0x0148, B:39:0x0129), top: B:79:0x000c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0196 A[Catch: all -> 0x0020, CancellationException -> 0x0023, TryCatch #5 {CancellationException -> 0x0023, all -> 0x0020, blocks: (B:8:0x0018, B:50:0x0180, B:54:0x01a3, B:56:0x01ad, B:59:0x01b8, B:60:0x01ca, B:62:0x01cd, B:63:0x01d9, B:45:0x015b, B:47:0x0161, B:51:0x0183, B:52:0x0195, B:44:0x0151, B:37:0x0123, B:53:0x0196, B:36:0x0119, B:27:0x0075, B:17:0x003d, B:42:0x0148, B:39:0x0129), top: B:79:0x000c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cd A[Catch: all -> 0x0020, CancellationException -> 0x0023, TryCatch #5 {CancellationException -> 0x0023, all -> 0x0020, blocks: (B:8:0x0018, B:50:0x0180, B:54:0x01a3, B:56:0x01ad, B:59:0x01b8, B:60:0x01ca, B:62:0x01cd, B:63:0x01d9, B:45:0x015b, B:47:0x0161, B:51:0x0183, B:52:0x0195, B:44:0x0151, B:37:0x0123, B:53:0x0196, B:36:0x0119, B:27:0x0075, B:17:0x003d, B:42:0x0148, B:39:0x0129), top: B:79:0x000c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fc  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // l9.p
    @Nullable
    public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
        return ((InitializeStateLoadWeb$doWork$2) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
