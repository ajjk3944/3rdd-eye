package gatewayprotocol.v1;

import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a0\u0010\t\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0017*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001b*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0017\u0010\"\u001a\u0004\u0018\u00010\u001f*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0017\u0010&\u001a\u0004\u0018\u00010#*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0017\u0010*\u001a\u0004\u0018\u00010\u000b*\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0017\u0010.\u001a\u0004\u0018\u00010+*\u00020'8F¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0017\u00102\u001a\u0004\u0018\u00010/*\u00020'8F¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00063"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalResponseKt$Dsl;", "Ly8/s;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "-initializeuniversalResponse", "(Ll9/l;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "universalResponse", "copy", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Ll9/l;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;Ll9/l;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "getInitializationResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "initializationResponseOrNull", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "getAdResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adResponseOrNull", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "getAdPlayerConfigResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "adPlayerConfigResponseOrNull", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "getAdDataRefreshResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "adDataRefreshResponseOrNull", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "getPrivacyUpdateResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "privacyUpdateResponseOrNull", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "getAudienceManagementResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "audienceManagementResponseOrNull", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;", "getPayloadOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "payloadOrNull", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "getMutableDataOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "mutableDataOrNull", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getErrorOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "errorOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUniversalResponseKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UniversalResponseKt.kt\ngatewayprotocol/v1/UniversalResponseKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
/* loaded from: classes4.dex */
public final class UniversalResponseKtKt {
    @JvmName(name = "-initializeuniversalResponse")
    @NotNull
    /* renamed from: -initializeuniversalResponse, reason: not valid java name */
    public static final UniversalResponseOuterClass.UniversalResponse m451initializeuniversalResponse(@NotNull l block) {
        p.e(block, "block");
        UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.INSTANCE;
        UniversalResponseOuterClass.UniversalResponse.Builder builderNewBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        UniversalResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final UniversalResponseOuterClass.UniversalResponse copy(@NotNull UniversalResponseOuterClass.UniversalResponse universalResponse, @NotNull l block) {
        p.e(universalResponse, "<this>");
        p.e(block, "block");
        UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.INSTANCE;
        UniversalResponseOuterClass.UniversalResponse.Builder builder = universalResponse.toBuilder();
        p.d(builder, "this.toBuilder()");
        UniversalResponseKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        p.e(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdDataRefreshResponse()) {
            return payloadOrBuilder.getAdDataRefreshResponse();
        }
        return null;
    }

    @Nullable
    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        p.e(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdPlayerConfigResponse()) {
            return payloadOrBuilder.getAdPlayerConfigResponse();
        }
        return null;
    }

    @Nullable
    public static final AdResponseOuterClass.AdResponse getAdResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        p.e(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdResponse()) {
            return payloadOrBuilder.getAdResponse();
        }
        return null;
    }

    @Nullable
    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse getAudienceManagementResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        p.e(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAudienceManagementResponse()) {
            return payloadOrBuilder.getAudienceManagementResponse();
        }
        return null;
    }

    @Nullable
    public static final ErrorOuterClass.Error getErrorOrNull(@NotNull UniversalResponseOuterClass.UniversalResponseOrBuilder universalResponseOrBuilder) {
        p.e(universalResponseOrBuilder, "<this>");
        if (universalResponseOrBuilder.hasError()) {
            return universalResponseOrBuilder.getError();
        }
        return null;
    }

    @Nullable
    public static final InitializationResponseOuterClass.InitializationResponse getInitializationResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        p.e(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationResponse()) {
            return payloadOrBuilder.getInitializationResponse();
        }
        return null;
    }

    @Nullable
    public static final MutableDataOuterClass.MutableData getMutableDataOrNull(@NotNull UniversalResponseOuterClass.UniversalResponseOrBuilder universalResponseOrBuilder) {
        p.e(universalResponseOrBuilder, "<this>");
        if (universalResponseOrBuilder.hasMutableData()) {
            return universalResponseOrBuilder.getMutableData();
        }
        return null;
    }

    @Nullable
    public static final UniversalResponseOuterClass.UniversalResponse.Payload getPayloadOrNull(@NotNull UniversalResponseOuterClass.UniversalResponseOrBuilder universalResponseOrBuilder) {
        p.e(universalResponseOrBuilder, "<this>");
        if (universalResponseOrBuilder.hasPayload()) {
            return universalResponseOrBuilder.getPayload();
        }
        return null;
    }

    @Nullable
    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        p.e(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasPrivacyUpdateResponse()) {
            return payloadOrBuilder.getPrivacyUpdateResponse();
        }
        return null;
    }

    @NotNull
    public static final UniversalResponseOuterClass.UniversalResponse.Payload copy(@NotNull UniversalResponseOuterClass.UniversalResponse.Payload payload, @NotNull l block) {
        p.e(payload, "<this>");
        p.e(block, "block");
        UniversalResponseKt.PayloadKt.Dsl.Companion companion = UniversalResponseKt.PayloadKt.Dsl.INSTANCE;
        UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder = payload.toBuilder();
        p.d(builder, "this.toBuilder()");
        UniversalResponseKt.PayloadKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
