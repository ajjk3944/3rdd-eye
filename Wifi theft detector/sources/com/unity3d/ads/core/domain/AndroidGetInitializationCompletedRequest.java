package com.unity3d.ads.core.domain;

import c9.c;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "invoke", "(Lc9/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidGetInitializationCompletedRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetInitializationCompletedRequest.kt\ncom/unity3d/ads/core/domain/AndroidGetInitializationCompletedRequest\n+ 2 InitializationCompletedEventRequestKt.kt\ngatewayprotocol/v1/InitializationCompletedEventRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKt\n*L\n1#1,26:1\n10#2:27\n1#3:28\n1#3:30\n484#4:29\n*S KotlinDebug\n*F\n+ 1 AndroidGetInitializationCompletedRequest.kt\ncom/unity3d/ads/core/domain/AndroidGetInitializationCompletedRequest\n*L\n15#1:27\n15#1:28\n20#1:30\n20#1:29\n*E\n"})
/* loaded from: classes3.dex */
public final class AndroidGetInitializationCompletedRequest implements GetInitializationCompletedRequest {

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest", f = "AndroidGetInitializationCompletedRequest.kt", i = {0, 0}, l = {16, 24}, m = "invoke", n = {"this", "$this$invoke_u24lambda_u240"}, s = {"L$0", "L$2"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return AndroidGetInitializationCompletedRequest.this.invoke(this);
        }
    }

    public AndroidGetInitializationCompletedRequest(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull DeviceInfoRepository deviceInfoRepository) {
        p.e(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        p.e(deviceInfoRepository, "deviceInfoRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetInitializationCompletedRequest
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull c9.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            java.lang.String r3 = "newBuilder()"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.c.b(r9)
            return r9
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            java.lang.Object r2 = r0.L$3
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r2 = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) r2
            java.lang.Object r5 = r0.L$2
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r5 = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) r5
            java.lang.Object r6 = r0.L$1
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r6 = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) r6
            java.lang.Object r7 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest r7 = (com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest) r7
            kotlin.c.b(r9)
            goto L70
        L4a:
            kotlin.c.b(r9)
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl$Companion r9 = gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.INSTANCE
            gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder r2 = gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder()
            kotlin.jvm.internal.p.d(r2, r3)
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r2 = r9._create(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r9 = r8.deviceInfoRepository
            r0.L$0 = r8
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r5
            java.lang.Object r9 = r9.staticDeviceInfo(r0)
            if (r9 != r1) goto L6d
            goto Lab
        L6d:
            r7 = r8
            r5 = r2
            r6 = r5
        L70:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r9 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r9
            r2.setStaticDeviceInfo(r9)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r9 = r7.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r9 = r9.getDynamicDeviceInfo()
            r5.setDynamicDeviceInfo(r9)
            gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest r9 = r6._build()
            gatewayprotocol.v1.UniversalRequestKt r2 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r2 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
            kotlin.jvm.internal.p.d(r5, r3)
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r2 = r2._create(r5)
            r2.setInitializationCompletedEventRequest(r9)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r9 = r2._build()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r2 = r7.getUniversalRequestForPayLoad
            r3 = 0
            r0.L$0 = r3
            r0.L$1 = r3
            r0.L$2 = r3
            r0.L$3 = r3
            r0.label = r4
            java.lang.Object r9 = r2.invoke(r9, r0)
            if (r9 != r1) goto Lac
        Lab:
            return r1
        Lac:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.invoke(c9.c):java.lang.Object");
    }
}
