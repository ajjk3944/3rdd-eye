package com.unity3d.services.core.domain.task;

import c9.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.j0;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/j0;", "Lkotlin/Result;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)Lkotlin/Result;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", i = {0, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 8, 9, 9, 10, 11}, l = {48, 53, 58, 60, 65, 67, 71, 74, 89, 92, 100, 103, 106}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "$this$withContext", "configuration", "resetResult", "$this$withContext", "configuration", "$this$withContext", "configuration", "configResult", "$this$withContext", "configuration", "configResult", "loadCacheResult", "configResult", "configResult", "loadWebResult", "configResult", "configResult"}, s = {"L$0", "L$0", "L$0", "L$2", "L$0", "L$0", "L$2", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$1", "L$1", "L$2", "L$1", "L$1"})
@SourceDebugExtension({"SMAP\nInitializeSDK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializeSDK.kt\ncom/unity3d/services/core/domain/task/InitializeSDK$doWork$2\n+ 2 CoroutineExtensions.kt\ncom/unity3d/services/core/extensions/CoroutineExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n24#2:130\n14#2,2:131\n16#2,10:134\n26#2:145\n1#3:133\n1#3:144\n*S KotlinDebug\n*F\n+ 1 InitializeSDK.kt\ncom/unity3d/services/core/domain/task/InitializeSDK$doWork$2\n*L\n41#1:130\n41#1:131,2\n41#1:134,10\n41#1:145\n41#1:144\n*E\n"})
/* loaded from: classes3.dex */
public final class InitializeSDK$doWork$2 extends SuspendLambda implements p {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2(InitializeSDK initializeSDK, c cVar) {
        super(2, cVar);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, cVar);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0355, code lost:
    
        if (r12 != r0) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0272 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027e A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d9 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0328 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x033b A[Catch: all -> 0x001e, CancellationException -> 0x0022, PHI: r1 r2
  0x033b: PHI (r1v39 java.lang.Object) = (r1v37 java.lang.Object), (r1v37 java.lang.Object), (r1v42 java.lang.Object) binds: [B:125:0x0326, B:127:0x0338, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x033b: PHI (r2v33 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r2v30 com.unity3d.services.core.domain.task.InitializeSDK)
  (r2v30 com.unity3d.services.core.domain.task.InitializeSDK)
  (r2v36 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:125:0x0326, B:127:0x0338, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[PHI: r1 r4 r12
  0x00eb: PHI (r1v6 com.unity3d.services.core.domain.task.InitializeSDK) = (r1v2 com.unity3d.services.core.domain.task.InitializeSDK), (r1v14 com.unity3d.services.core.domain.task.InitializeSDK) binds: [B:60:0x0177, B:45:0x00ea] A[DONT_GENERATE, DONT_INLINE]
  0x00eb: PHI (r4v6 kotlinx.coroutines.j0) = (r4v2 kotlinx.coroutines.j0), (r4v7 kotlinx.coroutines.j0) binds: [B:60:0x0177, B:45:0x00ea] A[DONT_GENERATE, DONT_INLINE]
  0x00eb: PHI (r12v23 java.lang.Object) = (r12v21 java.lang.Object), (r12v29 java.lang.Object) binds: [B:60:0x0177, B:45:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c2 A[Catch: all -> 0x001e, CancellationException -> 0x0022, PHI: r1 r2 r4 r12
  0x01c2: PHI (r1v15 com.unity3d.services.core.configuration.Configuration) = 
  (r1v10 com.unity3d.services.core.configuration.Configuration)
  (r1v18 com.unity3d.services.core.configuration.Configuration)
 binds: [B:69:0x01be, B:41:0x00ce] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r2v5 com.unity3d.services.core.domain.task.InitializeSDK) = (r2v2 com.unity3d.services.core.domain.task.InitializeSDK), (r2v7 com.unity3d.services.core.domain.task.InitializeSDK) binds: [B:69:0x01be, B:41:0x00ce] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r4v8 kotlinx.coroutines.j0) = (r4v6 kotlinx.coroutines.j0), (r4v11 kotlinx.coroutines.j0) binds: [B:69:0x01be, B:41:0x00ce] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r12v30 java.lang.Object) = (r12v26 java.lang.Object), (r12v34 java.lang.Object) binds: [B:69:0x01be, B:41:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c8 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e6 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f2 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0212 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0229 A[Catch: all -> 0x001e, CancellationException -> 0x0022, PHI: r1 r2 r4 r5
  0x0229: PHI (r1v23 java.lang.Object) = (r1v20 java.lang.Object), (r1v20 java.lang.Object), (r1v24 java.lang.Object) binds: [B:85:0x0210, B:87:0x0225, B:32:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x0229: PHI (r2v12 com.unity3d.services.core.configuration.Configuration) = 
  (r2v9 com.unity3d.services.core.configuration.Configuration)
  (r2v9 com.unity3d.services.core.configuration.Configuration)
  (r2v14 com.unity3d.services.core.configuration.Configuration)
 binds: [B:85:0x0210, B:87:0x0225, B:32:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x0229: PHI (r4v16 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r4v13 com.unity3d.services.core.domain.task.InitializeSDK)
  (r4v13 com.unity3d.services.core.domain.task.InitializeSDK)
  (r4v18 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:85:0x0210, B:87:0x0225, B:32:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x0229: PHI (r5v12 kotlinx.coroutines.j0) = (r5v11 kotlinx.coroutines.j0), (r5v11 kotlinx.coroutines.j0), (r5v14 kotlinx.coroutines.j0) binds: [B:85:0x0210, B:87:0x0225, B:32:0x0096] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024b A[Catch: all -> 0x001e, CancellationException -> 0x0022, PHI: r1 r2 r4 r5 r12
  0x024b: PHI (r1v25 java.lang.Object) = (r1v23 java.lang.Object), (r1v28 java.lang.Object) binds: [B:90:0x0247, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r2v15 com.unity3d.services.core.configuration.Configuration) = 
  (r2v12 com.unity3d.services.core.configuration.Configuration)
  (r2v22 com.unity3d.services.core.configuration.Configuration)
 binds: [B:90:0x0247, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r4v19 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r4v16 com.unity3d.services.core.domain.task.InitializeSDK)
  (r4v21 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:90:0x0247, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r5v15 kotlinx.coroutines.j0) = (r5v12 kotlinx.coroutines.j0), (r5v21 kotlinx.coroutines.j0) binds: [B:90:0x0247, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r12v46 java.lang.Object) = (r12v45 java.lang.Object), (r12v54 java.lang.Object) binds: [B:90:0x0247, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0251 A[Catch: all -> 0x001e, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001e, blocks: (B:6:0x0013, B:132:0x0358, B:13:0x002c, B:129:0x033b, B:16:0x0037, B:124:0x0322, B:126:0x0328, B:19:0x004a, B:117:0x02ee, B:120:0x02ff, B:22:0x0055, B:112:0x02d3, B:114:0x02d9, B:26:0x0065, B:98:0x026c, B:100:0x0272, B:101:0x027d, B:29:0x007d, B:92:0x024b, B:94:0x0251, B:102:0x027e, B:104:0x0289, B:106:0x0293, B:108:0x0299, B:109:0x02b0, B:118:0x02f9, B:133:0x0362, B:134:0x0369, B:32:0x0096, B:89:0x0229, B:35:0x00a7, B:84:0x020c, B:86:0x0212, B:38:0x00b8, B:77:0x01e0, B:79:0x01e6, B:80:0x01f1, B:41:0x00ce, B:71:0x01c2, B:73:0x01c8, B:81:0x01f2, B:44:0x00e1, B:62:0x017b, B:64:0x0181, B:65:0x0199, B:68:0x01a5, B:48:0x00f6, B:58:0x015c, B:59:0x015e, B:51:0x0104, B:53:0x0121, B:55:0x0127), top: B:145:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // l9.p
    @Nullable
    public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
        return ((InitializeSDK$doWork$2) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
