package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HeaderBiddingTokenKt {

    @NotNull
    public static final HeaderBiddingTokenKt INSTANCE = new HeaderBiddingTokenKt();

    @Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 Å\u00012\u00020\u0001:\u0004Å\u0001Æ\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0011J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0011J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0011J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u000bJ\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0011J\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u000bJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u0011J\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u000bJ\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u0011J\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\u000bJ\r\u0010!\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\u0011J\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u000bJ\r\u0010#\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0011J\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u000bJ\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010\u0011J\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010\u000bJ\r\u0010'\u001a\u00020\u000f¢\u0006\u0004\b'\u0010\u0011J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010\u000bJ\r\u0010)\u001a\u00020\u000f¢\u0006\u0004\b)\u0010\u0011J\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u000bJ\r\u0010+\u001a\u00020\u000f¢\u0006\u0004\b+\u0010\u0011J\r\u0010,\u001a\u00020\t¢\u0006\u0004\b,\u0010\u000bJ\r\u0010-\u001a\u00020\u000f¢\u0006\u0004\b-\u0010\u0011J5\u00105\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/H\u0007¢\u0006\u0004\b3\u00104J6\u00107\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/H\u0087\n¢\u0006\u0004\b6\u00104J-\u0010:\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0006\u00101\u001a\u00020/H\u0007¢\u0006\u0004\b8\u00109J9\u0010?\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/0;H\u0007¢\u0006\u0004\b=\u0010>J%\u0010B\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.H\u0007¢\u0006\u0004\b@\u0010AJ\r\u0010C\u001a\u00020\t¢\u0006\u0004\bC\u0010\u000bJ\r\u0010D\u001a\u00020\u000f¢\u0006\u0004\bD\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER$\u0010K\u001a\u00020F2\u0006\u00102\u001a\u00020F8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010Q\u001a\u00020L2\u0006\u00102\u001a\u00020L8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010T\u001a\u00020F2\u0006\u00102\u001a\u00020F8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010H\"\u0004\bS\u0010JR$\u0010Z\u001a\u00020U2\u0006\u00102\u001a\u00020U8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010`\u001a\u00020[2\u0006\u00102\u001a\u00020[8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010f\u001a\u00020a2\u0006\u00102\u001a\u00020a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010l\u001a\u00020g2\u0006\u00102\u001a\u00020g8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010r\u001a\u00020m2\u0006\u00102\u001a\u00020m8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010x\u001a\u00020s2\u0006\u00102\u001a\u00020s8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0017\u0010{\u001a\u0004\u0018\u00010s*\u00020\u00008F¢\u0006\u0006\u001a\u0004\by\u0010zR&\u0010\u0081\u0001\u001a\u00020|2\u0006\u00102\u001a\u00020|8G@GX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R'\u0010\u0084\u0001\u001a\u00020F2\u0006\u00102\u001a\u00020F8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0082\u0001\u0010H\"\u0005\b\u0083\u0001\u0010JR(\u0010\u0088\u0001\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0085\u0001\u0010\u0011\"\u0006\b\u0086\u0001\u0010\u0087\u0001R+\u0010\u008e\u0001\u001a\u00030\u0089\u00012\u0007\u00102\u001a\u00030\u0089\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0089\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R+\u0010\u0097\u0001\u001a\u00030\u0092\u00012\u0007\u00102\u001a\u00030\u0092\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001b\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0092\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R+\u0010 \u0001\u001a\u00030\u009b\u00012\u0007\u00102\u001a\u00030\u009b\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R'\u0010£\u0001\u001a\u00020L2\u0006\u00102\u001a\u00020L8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¡\u0001\u0010N\"\u0005\b¢\u0001\u0010PR+\u0010©\u0001\u001a\u00030¤\u00012\u0007\u00102\u001a\u00030¤\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R\u001b\u0010¬\u0001\u001a\u0005\u0018\u00010¤\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R+\u0010²\u0001\u001a\u00030\u00ad\u00012\u0007\u00102\u001a\u00030\u00ad\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R\u001b\u0010µ\u0001\u001a\u0005\u0018\u00010\u00ad\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R(\u0010¸\u0001\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\u000f\u001a\u0005\b¶\u0001\u0010\u0011\"\u0006\b·\u0001\u0010\u0087\u0001R&\u0010»\u0001\u001a\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.8G¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001R+\u0010Á\u0001\u001a\u00030¼\u00012\u0007\u00102\u001a\u00030¼\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R\u001b\u0010Ä\u0001\u001a\u0005\u0018\u00010¼\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001¨\u0006Ç\u0001"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;", "", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;)V", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "_build", "()Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "Ly8/s;", "clearTokenId", "()V", "clearTokenNumber", "clearSessionToken", "clearClientInfo", "", "hasClientInfo", "()Z", "clearTimestamps", "hasTimestamps", "clearSessionCounters", "hasSessionCounters", "clearStaticDeviceInfo", "hasStaticDeviceInfo", "clearDynamicDeviceInfo", "hasDynamicDeviceInfo", "clearPii", "hasPii", "clearCampaignState", "hasCampaignState", "clearTcf", "hasTcf", "clearScarSignalsCollected", "hasScarSignalsCollected", "clearLimitedSessionToken", "hasLimitedSessionToken", "clearInitializationData", "hasInitializationData", "clearAdFormat", "hasAdFormat", "clearTestData", "hasTestData", "clearTokenCounters", "hasTokenCounters", "clearOfferwallEnabled", "hasOfferwallEnabled", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl$ExtrasProxy;", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "putExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;Ljava/lang/String;)V", "put", "setExtras", "set", "removeExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;)V", "remove", "", "map", "putAllExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/util/Map;)V", "putAll", "clearExtras", "(Lcom/google/protobuf/kotlin/DslMap;)V", "clear", "clearMediationInfo", "hasMediationInfo", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;", "Lcom/google/protobuf/ByteString;", "getTokenId", "()Lcom/google/protobuf/ByteString;", "setTokenId", "(Lcom/google/protobuf/ByteString;)V", "tokenId", "", "getTokenNumber", "()I", "setTokenNumber", "(I)V", "tokenNumber", "getSessionToken", "setSessionToken", "sessionToken", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "getClientInfo", "()Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "setClientInfo", "(Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;)V", "clientInfo", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getTimestamps", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "timestamps", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "sessionCounters", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "staticDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "dynamicDeviceInfo", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPii", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "setPii", "(Lgatewayprotocol/v1/PiiOuterClass$Pii;)V", "pii", "getPiiOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "piiOrNull", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "getCampaignState", "()Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "setCampaignState", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;)V", "campaignState", "getTcf", "setTcf", "tcf", "getScarSignalsCollected", "setScarSignalsCollected", "(Z)V", "scarSignalsCollected", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "getLimitedSessionToken", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "setLimitedSessionToken", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;)V", "limitedSessionToken", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "limitedSessionTokenOrNull", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "getInitializationData", "()Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "setInitializationData", "(Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;)V", "initializationData", "getInitializationDataOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "initializationDataOrNull", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "adFormat", "getAdFormatValue", "setAdFormatValue", "adFormatValue", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "getTestData", "()Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "setTestData", "(Lgatewayprotocol/v1/TestDataOuterClass$TestData;)V", "testData", "getTestDataOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "testDataOrNull", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "getTokenCounters", "()Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "setTokenCounters", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;)V", "tokenCounters", "getTokenCountersOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "tokenCountersOrNull", "getOfferwallEnabled", "setOfferwallEnabled", "offerwallEnabled", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", "extras", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "getMediationInfo", "()Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "setMediationInfo", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;)V", "mediationInfo", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfoOrNull", "Companion", "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;", "builder", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ HeaderBiddingTokenOuterClass.HeaderBiddingToken _build() {
            HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingTokenBuild = this._builder.build();
            p.d(headerBiddingTokenBuild, "_builder.build()");
            return headerBiddingTokenBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        @JvmName(name = "clearExtras")
        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            p.e(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearInitializationData() {
            this._builder.clearInitializationData();
        }

        public final void clearLimitedSessionToken() {
            this._builder.clearLimitedSessionToken();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearOfferwallEnabled() {
            this._builder.clearOfferwallEnabled();
        }

        public final void clearPii() {
            this._builder.clearPii();
        }

        public final void clearScarSignalsCollected() {
            this._builder.clearScarSignalsCollected();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearTestData() {
            this._builder.clearTestData();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final void clearTokenCounters() {
            this._builder.clearTokenCounters();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final void clearTokenNumber() {
            this._builder.clearTokenNumber();
        }

        @JvmName(name = "getAdFormat")
        @NotNull
        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            p.d(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        @JvmName(name = "getAdFormatValue")
        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        @JvmName(name = "getCampaignState")
        @NotNull
        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            p.d(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        @JvmName(name = "getClientInfo")
        @NotNull
        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            p.d(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        @JvmName(name = "getDynamicDeviceInfo")
        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            p.d(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        @JvmName(name = "getExtrasMap")
        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            p.d(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        @JvmName(name = "getInitializationData")
        @NotNull
        public final InitializationDataOuterClass.InitializationData getInitializationData() {
            InitializationDataOuterClass.InitializationData initializationData = this._builder.getInitializationData();
            p.d(initializationData, "_builder.getInitializationData()");
            return initializationData;
        }

        @Nullable
        public final InitializationDataOuterClass.InitializationData getInitializationDataOrNull(@NotNull Dsl dsl) {
            p.e(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getInitializationDataOrNull(dsl._builder);
        }

        @JvmName(name = "getLimitedSessionToken")
        @NotNull
        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
            UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
            p.d(limitedSessionToken, "_builder.getLimitedSessionToken()");
            return limitedSessionToken;
        }

        @Nullable
        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(@NotNull Dsl dsl) {
            p.e(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getLimitedSessionTokenOrNull(dsl._builder);
        }

        @JvmName(name = "getMediationInfo")
        @NotNull
        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this._builder.getMediationInfo();
            p.d(mediationInfo, "_builder.getMediationInfo()");
            return mediationInfo;
        }

        @Nullable
        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(@NotNull Dsl dsl) {
            p.e(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getMediationInfoOrNull(dsl._builder);
        }

        @JvmName(name = "getOfferwallEnabled")
        public final boolean getOfferwallEnabled() {
            return this._builder.getOfferwallEnabled();
        }

        @JvmName(name = "getPii")
        @NotNull
        public final PiiOuterClass.Pii getPii() {
            PiiOuterClass.Pii pii = this._builder.getPii();
            p.d(pii, "_builder.getPii()");
            return pii;
        }

        @Nullable
        public final PiiOuterClass.Pii getPiiOrNull(@NotNull Dsl dsl) {
            p.e(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getPiiOrNull(dsl._builder);
        }

        @JvmName(name = "getScarSignalsCollected")
        public final boolean getScarSignalsCollected() {
            return this._builder.getScarSignalsCollected();
        }

        @JvmName(name = "getSessionCounters")
        @NotNull
        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            p.d(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        @JvmName(name = "getSessionToken")
        @NotNull
        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            p.d(sessionToken, "_builder.getSessionToken()");
            return sessionToken;
        }

        @JvmName(name = "getStaticDeviceInfo")
        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            p.d(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        @JvmName(name = "getTcf")
        @NotNull
        public final ByteString getTcf() {
            ByteString tcf = this._builder.getTcf();
            p.d(tcf, "_builder.getTcf()");
            return tcf;
        }

        @JvmName(name = "getTestData")
        @NotNull
        public final TestDataOuterClass.TestData getTestData() {
            TestDataOuterClass.TestData testData = this._builder.getTestData();
            p.d(testData, "_builder.getTestData()");
            return testData;
        }

        @Nullable
        public final TestDataOuterClass.TestData getTestDataOrNull(@NotNull Dsl dsl) {
            p.e(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTestDataOrNull(dsl._builder);
        }

        @JvmName(name = "getTimestamps")
        @NotNull
        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            p.d(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        @JvmName(name = "getTokenCounters")
        @NotNull
        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCounters() {
            HeaderBiddingTokenOuterClass.TokenCounters tokenCounters = this._builder.getTokenCounters();
            p.d(tokenCounters, "_builder.getTokenCounters()");
            return tokenCounters;
        }

        @Nullable
        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCountersOrNull(@NotNull Dsl dsl) {
            p.e(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTokenCountersOrNull(dsl._builder);
        }

        @JvmName(name = "getTokenId")
        @NotNull
        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            p.d(tokenId, "_builder.getTokenId()");
            return tokenId;
        }

        @JvmName(name = "getTokenNumber")
        public final int getTokenNumber() {
            return this._builder.getTokenNumber();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasInitializationData() {
            return this._builder.hasInitializationData();
        }

        public final boolean hasLimitedSessionToken() {
            return this._builder.hasLimitedSessionToken();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final boolean hasOfferwallEnabled() {
            return this._builder.hasOfferwallEnabled();
        }

        public final boolean hasPii() {
            return this._builder.hasPii();
        }

        public final boolean hasScarSignalsCollected() {
            return this._builder.hasScarSignalsCollected();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final boolean hasTcf() {
            return this._builder.hasTcf();
        }

        public final boolean hasTestData() {
            return this._builder.hasTestData();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final boolean hasTokenCounters() {
            return this._builder.hasTokenCounters();
        }

        @JvmName(name = "putAllExtras")
        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            p.e(dslMap, "<this>");
            p.e(map, "map");
            this._builder.putAllExtras(map);
        }

        @JvmName(name = "putExtras")
        public final void putExtras(@NotNull DslMap<String, String, ExtrasProxy> dslMap, @NotNull String key, @NotNull String value) {
            p.e(dslMap, "<this>");
            p.e(key, "key");
            p.e(value, "value");
            this._builder.putExtras(key, value);
        }

        @JvmName(name = "removeExtras")
        public final /* synthetic */ void removeExtras(DslMap dslMap, String key) {
            p.e(dslMap, "<this>");
            p.e(key, "key");
            this._builder.removeExtras(key);
        }

        @JvmName(name = "setAdFormat")
        public final void setAdFormat(@NotNull AdFormatOuterClass.AdFormat value) {
            p.e(value, "value");
            this._builder.setAdFormat(value);
        }

        @JvmName(name = "setAdFormatValue")
        public final void setAdFormatValue(int i10) {
            this._builder.setAdFormatValue(i10);
        }

        @JvmName(name = "setCampaignState")
        public final void setCampaignState(@NotNull CampaignStateOuterClass.CampaignState value) {
            p.e(value, "value");
            this._builder.setCampaignState(value);
        }

        @JvmName(name = "setClientInfo")
        public final void setClientInfo(@NotNull ClientInfoOuterClass.ClientInfo value) {
            p.e(value, "value");
            this._builder.setClientInfo(value);
        }

        @JvmName(name = "setDynamicDeviceInfo")
        public final void setDynamicDeviceInfo(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            p.e(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        @JvmName(name = "setExtras")
        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            p.e(dslMap, "<this>");
            p.e(key, "key");
            p.e(value, "value");
            putExtras(dslMap, key, value);
        }

        @JvmName(name = "setInitializationData")
        public final void setInitializationData(@NotNull InitializationDataOuterClass.InitializationData value) {
            p.e(value, "value");
            this._builder.setInitializationData(value);
        }

        @JvmName(name = "setLimitedSessionToken")
        public final void setLimitedSessionToken(@NotNull UniversalRequestOuterClass.LimitedSessionToken value) {
            p.e(value, "value");
            this._builder.setLimitedSessionToken(value);
        }

        @JvmName(name = "setMediationInfo")
        public final void setMediationInfo(@NotNull MediationInfoOuterClass.MediationInfo value) {
            p.e(value, "value");
            this._builder.setMediationInfo(value);
        }

        @JvmName(name = "setOfferwallEnabled")
        public final void setOfferwallEnabled(boolean z10) {
            this._builder.setOfferwallEnabled(z10);
        }

        @JvmName(name = "setPii")
        public final void setPii(@NotNull PiiOuterClass.Pii value) {
            p.e(value, "value");
            this._builder.setPii(value);
        }

        @JvmName(name = "setScarSignalsCollected")
        public final void setScarSignalsCollected(boolean z10) {
            this._builder.setScarSignalsCollected(z10);
        }

        @JvmName(name = "setSessionCounters")
        public final void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters value) {
            p.e(value, "value");
            this._builder.setSessionCounters(value);
        }

        @JvmName(name = "setSessionToken")
        public final void setSessionToken(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setSessionToken(value);
        }

        @JvmName(name = "setStaticDeviceInfo")
        public final void setStaticDeviceInfo(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            p.e(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        @JvmName(name = "setTcf")
        public final void setTcf(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setTcf(value);
        }

        @JvmName(name = "setTestData")
        public final void setTestData(@NotNull TestDataOuterClass.TestData value) {
            p.e(value, "value");
            this._builder.setTestData(value);
        }

        @JvmName(name = "setTimestamps")
        public final void setTimestamps(@NotNull TimestampsOuterClass.Timestamps value) {
            p.e(value, "value");
            this._builder.setTimestamps(value);
        }

        @JvmName(name = "setTokenCounters")
        public final void setTokenCounters(@NotNull HeaderBiddingTokenOuterClass.TokenCounters value) {
            p.e(value, "value");
            this._builder.setTokenCounters(value);
        }

        @JvmName(name = "setTokenId")
        public final void setTokenId(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setTokenId(value);
        }

        @JvmName(name = "setTokenNumber")
        public final void setTokenNumber(int i10) {
            this._builder.setTokenNumber(i10);
        }

        private Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
            this._builder = builder;
        }
    }

    private HeaderBiddingTokenKt() {
    }
}
