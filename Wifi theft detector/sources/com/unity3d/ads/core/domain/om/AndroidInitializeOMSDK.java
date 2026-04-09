package com.unity3d.ads.core.domain.om;

import android.content.Context;
import c9.c;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidInitializeOMSDK;", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "omRepository", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "Ly8/s;", "invoke", "(Lc9/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidInitializeOMSDK implements InitializeOMSDK {

    @NotNull
    private final Context context;

    @NotNull
    private final OpenMeasurementRepository omRepository;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK", f = "AndroidInitializeOMSDK.kt", i = {0, 0}, l = {27}, m = "invoke", n = {"this", "startTime"}, s = {"L$0", "J$0"})
    /* renamed from: com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidInitializeOMSDK.this.invoke(this);
        }
    }

    public AndroidInitializeOMSDK(@NotNull Context context, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull SessionRepository sessionRepository, @NotNull OpenMeasurementRepository omRepository) {
        p.e(context, "context");
        p.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        p.e(sessionRepository, "sessionRepository");
        p.e(omRepository, "omRepository");
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.omRepository = omRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.om.InitializeOMSDK
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull c9.c r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.AnonymousClass1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1 r2 = (com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1 r2 = new com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            long r3 = r2.J$0
            java.lang.Object r2 = r2.L$0
            com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK r2 = (com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK) r2
            kotlin.c.b(r1)
            goto L6f
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            kotlin.c.b(r1)
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r0.sessionRepository
            boolean r1 = r1.isOmEnabled()
            if (r1 == 0) goto Ld1
            t9.j r1 = t9.j.f24475a
            long r6 = r1.b()
            com.unity3d.ads.core.domain.SendDiagnosticEvent r8 = r0.sendDiagnosticEvent
            r15 = 62
            r16 = 0
            java.lang.String r9 = "om_activate_started"
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r1 = r0.omRepository
            android.content.Context r4 = r0.context
            r2.L$0 = r0
            r2.J$0 = r6
            r2.label = r5
            java.lang.Object r1 = r1.activateOM(r4, r2)
            if (r1 != r3) goto L6d
            return r3
        L6d:
            r2 = r0
            r3 = r6
        L6f:
            com.unity3d.ads.core.data.model.OMResult r1 = (com.unity3d.ads.core.data.model.OMResult) r1
            boolean r5 = r1 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r5 == 0) goto L90
            com.unity3d.ads.core.domain.SendDiagnosticEvent r6 = r2.sendDiagnosticEvent
            t9.j$a r1 = t9.j.a.b(r3)
            double r1 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r1)
            java.lang.Double r8 = d9.a.b(r1)
            r13 = 60
            r14 = 0
            java.lang.String r7 = "om_activate_success_time"
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto Ld1
        L90:
            boolean r5 = r1 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r5 == 0) goto Ld1
            com.unity3d.ads.core.domain.SendDiagnosticEvent r6 = r2.sendDiagnosticEvent
            t9.j$a r2 = t9.j.a.b(r3)
            double r2 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r2)
            java.lang.Double r8 = d9.a.b(r2)
            java.util.Map r2 = z8.h0.c()
            com.unity3d.ads.core.data.model.OMResult$Failure r1 = (com.unity3d.ads.core.data.model.OMResult.Failure) r1
            java.lang.String r3 = r1.getReason()
            java.lang.String r4 = "reason"
            r2.put(r4, r3)
            java.lang.String r3 = r1.getReasonDebug()
            if (r3 == 0) goto Lc0
            java.lang.String r3 = "reason_debug"
            java.lang.String r1 = r1.getReasonDebug()
            r2.put(r3, r1)
        Lc0:
            y8.s r1 = y8.s.f25199a
            java.util.Map r9 = z8.h0.b(r2)
            r13 = 56
            r14 = 0
            java.lang.String r7 = "om_activate_failure_time"
            r10 = 0
            r11 = 0
            r12 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        Ld1:
            y8.s r1 = y8.s.f25199a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.invoke(c9.c):java.lang.Object");
    }
}
