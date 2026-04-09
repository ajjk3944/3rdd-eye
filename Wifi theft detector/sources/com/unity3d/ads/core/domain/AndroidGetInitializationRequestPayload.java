package com.unity3d.ads.core.domain;

import c9.c;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "getClientInfo", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "legacyUserConsentRepository", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "mediationInitBlobMetadataReader", "<init>", "(Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;)V", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "invoke", "(Lc9/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidGetInitializationRequestPayload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetInitializationRequestPayload.kt\ncom/unity3d/ads/core/domain/AndroidGetInitializationRequestPayload\n+ 2 InitializationRequestKt.kt\ngatewayprotocol/v1/InitializationRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 InitializationDeviceInfoKt.kt\ngatewayprotocol/v1/InitializationDeviceInfoKtKt\n+ 5 MetadataReader.kt\ncom/unity3d/ads/core/configuration/MetadataReader\n*L\n1#1,84:1\n10#2:85\n1#3:86\n1#3:87\n1#3:89\n10#4:88\n7#5,7:90\n*S KotlinDebug\n*F\n+ 1 AndroidGetInitializationRequestPayload.kt\ncom/unity3d/ads/core/domain/AndroidGetInitializationRequestPayload\n*L\n20#1:85\n20#1:86\n28#1:89\n28#1:88\n65#1:90,7\n*E\n"})
/* loaded from: classes3.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetClientInfo getClientInfo;

    @NotNull
    private final LegacyUserConsentRepository legacyUserConsentRepository;

    @NotNull
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;

    @NotNull
    private final SessionRepository sessionRepository;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload", f = "AndroidGetInitializationRequestPayload.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8}, l = {24, 25, 33, 34, 45, 50, 55, 60, 78}, m = "invoke", n = {"this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "$this$invoke_u24lambda_u249_u24lambda_u242", "this", "$this$invoke_u24lambda_u249", "$this$invoke_u24lambda_u249_u24lambda_u242", "this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "$this$invoke_u24lambda_u249"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$5", "L$0", "L$2", "L$5", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$1"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
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
            return AndroidGetInitializationRequestPayload.this.invoke(this);
        }
    }

    public AndroidGetInitializationRequestPayload(@NotNull GetClientInfo getClientInfo, @NotNull SessionRepository sessionRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull LegacyUserConsentRepository legacyUserConsentRepository, @NotNull MediationInitBlobMetadataReader mediationInitBlobMetadataReader) {
        p.e(getClientInfo, "getClientInfo");
        p.e(sessionRepository, "sessionRepository");
        p.e(deviceInfoRepository, "deviceInfoRepository");
        p.e(legacyUserConsentRepository, "legacyUserConsentRepository");
        p.e(mediationInitBlobMetadataReader, "mediationInitBlobMetadataReader");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b0 A[PHI: r1 r4 r5 r9
  0x02b0: PHI (r1v71 java.lang.Object) = (r1v70 java.lang.Object), (r1v1 java.lang.Object) binds: [B:61:0x02ac, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x02b0: PHI (r4v28 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v25 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v30 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:61:0x02ac, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x02b0: PHI (r5v13 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v10 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v15 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:61:0x02ac, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x02b0: PHI (r9v20 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r9v17 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r9v22 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:61:0x02ac, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d6 A[PHI: r1 r4 r5 r9
  0x02d6: PHI (r1v75 java.lang.Object) = (r1v74 java.lang.Object), (r1v1 java.lang.Object) binds: [B:73:0x02d2, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x02d6: PHI (r4v31 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v28 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v33 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:73:0x02d2, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x02d6: PHI (r5v16 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v13 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v18 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:73:0x02d2, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x02d6: PHI (r9v23 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r9v20 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r9v25 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:73:0x02d2, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f5 A[PHI: r1 r4 r5 r9
  0x02f5: PHI (r1v79 java.lang.Object) = (r1v78 java.lang.Object), (r1v1 java.lang.Object) binds: [B:79:0x02f1, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x02f5: PHI (r4v34 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v31 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v36 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:79:0x02f1, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x02f5: PHI (r5v19 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v16 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v21 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:79:0x02f1, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x02f5: PHI (r9v26 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r9v23 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r9v29 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:79:0x02f1, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0331  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull c9.c r24) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.invoke(c9.c):java.lang.Object");
    }
}
