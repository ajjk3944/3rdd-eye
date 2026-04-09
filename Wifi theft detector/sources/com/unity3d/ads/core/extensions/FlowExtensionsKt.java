package com.unity3d.ads.core.extensions;

import c9.c;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.channels.l;
import kotlinx.coroutines.channels.o;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.j0;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aq\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u000427\u0010\u000e\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/b;", "", "timeoutMillis", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "Lkotlin/Function2;", "Lkotlin/Function0;", "Ly8/s;", "Lkotlin/ParameterName;", "name", "close", "Lc9/c;", "", "block", "timeoutAfter", "(Lkotlinx/coroutines/flow/b;JZLl9/p;)Lkotlinx/coroutines/flow/b;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowExtensionsKt {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/channels/l;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/channels/l;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", i = {0}, l = {15, 17}, m = "invokeSuspend", n = {"$this$channelFlow"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p {
        final /* synthetic */ boolean $active;
        final /* synthetic */ p $block;
        final /* synthetic */ b $this_timeoutAfter;
        final /* synthetic */ long $timeoutMillis;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", i = {}, l = {10}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03581 extends SuspendLambda implements p {
            final /* synthetic */ l $$this$channelFlow;
            final /* synthetic */ b $this_timeoutAfter;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03581(b bVar, l lVar, c cVar) {
                super(2, cVar);
                this.$this_timeoutAfter = bVar;
                this.$$this$channelFlow = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c create(@Nullable Object obj, @NotNull c cVar) {
                return new C03581(this.$this_timeoutAfter, this.$$this$channelFlow, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objF = a.f();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    b bVar = this.$this_timeoutAfter;
                    final l lVar = this.$$this$channelFlow;
                    kotlinx.coroutines.flow.c cVar = new kotlinx.coroutines.flow.c() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                        @Override // kotlinx.coroutines.flow.c
                        @Nullable
                        public final Object emit(T t10, @NotNull c cVar2) {
                            Object objB = lVar.b(t10, cVar2);
                            return objB == a.f() ? objB : s.f25199a;
                        }
                    };
                    this.label = 1;
                    if (bVar.collect(cVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                o.a.a(this.$$this$channelFlow, null, 1, null);
                return s.f25199a;
            }

            @Override // l9.p
            @Nullable
            public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
                return ((C03581) create(j0Var, cVar)).invokeSuspend(s.f25199a);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
        public /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements l9.a {
            public AnonymousClass2(Object obj) {
                super(0, obj, l.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
            }

            @Override // l9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m226invoke();
                return s.f25199a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m226invoke() {
                o.a.a((l) this.receiver, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10, boolean z10, p pVar, b bVar, c cVar) {
            super(2, cVar);
            this.$timeoutMillis = j10;
            this.$active = z10;
            this.$block = pVar;
            this.$this_timeoutAfter = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        
            if (r12.invoke(r4, r11) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r11.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.c.b(r12)
                goto L5d
            L13:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1b:
                java.lang.Object r1 = r11.L$0
                kotlinx.coroutines.channels.l r1 = (kotlinx.coroutines.channels.l) r1
                kotlin.c.b(r12)
                goto L47
            L23:
                kotlin.c.b(r12)
                java.lang.Object r12 = r11.L$0
                r5 = r12
                kotlinx.coroutines.channels.l r5 = (kotlinx.coroutines.channels.l) r5
                com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1 r8 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1
                kotlinx.coroutines.flow.b r12 = r11.$this_timeoutAfter
                r8.<init>(r12, r5, r2)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                kotlinx.coroutines.i.d(r5, r6, r7, r8, r9, r10)
                long r6 = r11.$timeoutMillis
                r11.L$0 = r5
                r11.label = r4
                java.lang.Object r12 = kotlinx.coroutines.r0.a(r6, r11)
                if (r12 != r0) goto L46
                goto L5c
            L46:
                r1 = r5
            L47:
                boolean r12 = r11.$active
                if (r12 == 0) goto L5d
                l9.p r12 = r11.$block
                com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2 r4 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2
                r4.<init>(r1)
                r11.L$0 = r2
                r11.label = r3
                java.lang.Object r12 = r12.invoke(r4, r11)
                if (r12 != r0) goto L5d
            L5c:
                return r0
            L5d:
                y8.s r12 = y8.s.f25199a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull l lVar, @Nullable c cVar) {
            return ((AnonymousClass1) create(lVar, cVar)).invokeSuspend(s.f25199a);
        }
    }

    @NotNull
    public static final <T> b timeoutAfter(@NotNull b bVar, long j10, boolean z10, @NotNull p block) {
        kotlin.jvm.internal.p.e(bVar, "<this>");
        kotlin.jvm.internal.p.e(block, "block");
        return d.h(new AnonymousClass1(j10, z10, block, bVar, null));
    }

    public static /* synthetic */ b timeoutAfter$default(b bVar, long j10, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return timeoutAfter(bVar, j10, z10, pVar);
    }
}
