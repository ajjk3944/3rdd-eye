package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {Sdk$SDKError.Reason.AD_NOT_LOADED_VALUE, Sdk$SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk$SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, Sdk$SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements l9.p {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ s0 $shared;
    final /* synthetic */ b1 $started;
    final /* synthetic */ b $upstream;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements l9.p {
        /* synthetic */ int I$0;
        int label;

        public AnonymousClass1(c9.c cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c9.c create(Object obj, c9.c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i10, c9.c cVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i10), cVar)).invokeSuspend(y8.s.f25199a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return d9.a.a(this.I$0 > 0);
        }

        @Override // l9.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (c9.c) obj2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/SharingCommand;", "it", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/SharingCommand;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements l9.p {
        final /* synthetic */ Object $initialValue;
        final /* synthetic */ s0 $shared;
        final /* synthetic */ b $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f22401a;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.f22425a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.f22426b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.f22427c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f22401a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, s0 s0Var, Object obj, c9.c cVar) {
            super(2, cVar);
            this.$upstream = bVar;
            this.$shared = s0Var;
            this.$initialValue = obj;
        }

        @Override // l9.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SharingCommand sharingCommand, c9.c cVar) {
            return ((AnonymousClass2) create(sharingCommand, cVar)).invokeSuspend(y8.s.f25199a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c9.c create(Object obj, c9.c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                int i11 = a.f22401a[((SharingCommand) this.L$0).ordinal()];
                if (i11 == 1) {
                    b bVar = this.$upstream;
                    s0 s0Var = this.$shared;
                    this.label = 1;
                    if (bVar.collect(s0Var, this) == objF) {
                        return objF;
                    }
                } else if (i11 == 3) {
                    Object obj2 = this.$initialValue;
                    if (obj2 == y0.f22492a) {
                        this.$shared.j();
                    } else {
                        this.$shared.a(obj2);
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return y8.s.f25199a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(b1 b1Var, b bVar, s0 s0Var, Object obj, c9.c cVar) {
        super(2, cVar);
        this.$started = b1Var;
        this.$upstream = bVar;
        this.$shared = s0Var;
        this.$initialValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c9.c create(Object obj, c9.c cVar) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r8.collect(r1, r7) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (kotlinx.coroutines.flow.d.j(r8, r1, r7) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L21
            if (r1 != r2) goto L15
            goto L21
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.c.b(r8)
            goto L5c
        L21:
            kotlin.c.b(r8)
            goto L8d
        L25:
            kotlin.c.b(r8)
            kotlinx.coroutines.flow.b1 r8 = r7.$started
            kotlinx.coroutines.flow.b1$a r1 = kotlinx.coroutines.flow.b1.f22443a
            kotlinx.coroutines.flow.b1 r6 = r1.a()
            if (r8 != r6) goto L3f
            kotlinx.coroutines.flow.b r8 = r7.$upstream
            kotlinx.coroutines.flow.s0 r1 = r7.$shared
            r7.label = r5
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto L8d
            goto L8c
        L3f:
            kotlinx.coroutines.flow.b1 r8 = r7.$started
            kotlinx.coroutines.flow.b1 r1 = r1.b()
            r5 = 0
            if (r8 != r1) goto L69
            kotlinx.coroutines.flow.s0 r8 = r7.$shared
            kotlinx.coroutines.flow.d1 r8 = r8.g()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r5)
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.d.s(r8, r1, r7)
            if (r8 != r0) goto L5c
            goto L8c
        L5c:
            kotlinx.coroutines.flow.b r8 = r7.$upstream
            kotlinx.coroutines.flow.s0 r1 = r7.$shared
            r7.label = r3
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto L8d
            goto L8c
        L69:
            kotlinx.coroutines.flow.b1 r8 = r7.$started
            kotlinx.coroutines.flow.s0 r1 = r7.$shared
            kotlinx.coroutines.flow.d1 r1 = r1.g()
            kotlinx.coroutines.flow.b r8 = r8.a(r1)
            kotlinx.coroutines.flow.b r8 = kotlinx.coroutines.flow.d.l(r8)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            kotlinx.coroutines.flow.b r3 = r7.$upstream
            kotlinx.coroutines.flow.s0 r4 = r7.$shared
            java.lang.Object r6 = r7.$initialValue
            r1.<init>(r3, r4, r6, r5)
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.flow.d.j(r8, r1, r7)
            if (r8 != r0) goto L8d
        L8c:
            return r0
        L8d:
            y8.s r8 = y8.s.f25199a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // l9.p
    public final Object invoke(kotlinx.coroutines.j0 j0Var, c9.c cVar) {
        return ((FlowKt__ShareKt$launchSharing$1) create(j0Var, cVar)).invokeSuspend(y8.s.f25199a);
    }
}
