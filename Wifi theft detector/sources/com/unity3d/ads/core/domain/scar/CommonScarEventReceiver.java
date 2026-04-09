package com.unity3d.ads.core.domain.scar;

import c9.c;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.s0;
import kotlinx.coroutines.flow.x0;
import kotlinx.coroutines.flow.y0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.k;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;
import z8.z;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00062\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "Lkotlinx/coroutines/j0;", "scope", "<init>", "(Lkotlinx/coroutines/j0;)V", "", "eventCategory", "eventId", "", "", "params", "", "sendEvent", "(Ljava/lang/Enum;Ljava/lang/Enum;[Ljava/lang/Object;)Z", "canSend", "()Z", "Lkotlinx/coroutines/j0;", "Lkotlinx/coroutines/flow/s0;", "", "_versionFlow", "Lkotlinx/coroutines/flow/s0;", "Lkotlinx/coroutines/flow/x0;", "versionFlow", "Lkotlinx/coroutines/flow/x0;", "getVersionFlow", "()Lkotlinx/coroutines/flow/x0;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "_gmaEventFlow", "gmaEventFlow", "getGmaEventFlow", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommonScarEventReceiver implements IEventSender {

    @NotNull
    private final s0 _gmaEventFlow;

    @NotNull
    private final s0 _versionFlow;

    @NotNull
    private final x0 gmaEventFlow;

    @NotNull
    private final j0 scope;

    @NotNull
    private final x0 versionFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1", f = "CommonScarEventReceiver.kt", i = {}, l = {35, 41, 52, 66, 73}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCommonScarEventReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonScarEventReceiver.kt\ncom/unity3d/ads/core/domain/scar/CommonScarEventReceiver$sendEvent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
    /* renamed from: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p {
        final /* synthetic */ Enum<?> $eventId;
        final /* synthetic */ Object[] $params;
        int label;
        final /* synthetic */ CommonScarEventReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Enum<?> r12, Object[] objArr, CommonScarEventReceiver commonScarEventReceiver, c cVar) {
            super(2, cVar);
            this.$eventId = r12;
            this.$params = objArr;
            this.this$0 = commonScarEventReceiver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            return new AnonymousClass1(this.$eventId, this.$params, this.this$0, cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        
            if (r3.emit(r2, r21) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
        
            if (r3.emit(r7, r21) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
        
            if (r3.emit(r6, r21) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0124, code lost:
        
            if (r2.emit(r11, r21) == r1) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 298
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
        }
    }

    public CommonScarEventReceiver(@NotNull j0 scope) {
        kotlin.jvm.internal.p.e(scope, "scope");
        this.scope = scope;
        s0 s0VarB = y0.b(0, 0, null, 7, null);
        this._versionFlow = s0VarB;
        this.versionFlow = d.a(s0VarB);
        s0 s0VarB2 = y0.b(0, 0, null, 7, null);
        this._gmaEventFlow = s0VarB2;
        this.gmaEventFlow = d.a(s0VarB2);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return true;
    }

    @NotNull
    public final x0 getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    @NotNull
    public final x0 getVersionFlow() {
        return this.versionFlow;
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(@NotNull Enum<?> eventCategory, @NotNull Enum<?> eventId, @NotNull Object... params) {
        kotlin.jvm.internal.p.e(eventCategory, "eventCategory");
        kotlin.jvm.internal.p.e(eventId, "eventId");
        kotlin.jvm.internal.p.e(params, "params");
        if (!z.C(z8.j0.f(WebViewEventCategory.INIT_GMA, WebViewEventCategory.GMA, WebViewEventCategory.BANNER), eventCategory)) {
            return false;
        }
        k.d(this.scope, null, null, new AnonymousClass1(eventId, params, this, null), 3, null);
        return true;
    }
}
