package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DiagnosticEventKt {

    @NotNull
    public static final DiagnosticEventKt INSTANCE = new DiagnosticEventKt();

    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u008f\u00012\u00020\u0001:\u0006\u008f\u0001\u0090\u0001\u0091\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u000fJ5\u0010\u001b\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ6\u0010\u001d\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0087\n¢\u0006\u0004\b\u001c\u0010\u001aJ-\u0010 \u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010%\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150!H\u0007¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0007¢\u0006\u0004\b&\u0010'J5\u0010\u001b\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020)H\u0007¢\u0006\u0004\b+\u0010,J6\u0010\u001d\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020)H\u0087\n¢\u0006\u0004\b-\u0010,J-\u0010 \u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b.\u0010\u001fJ9\u0010%\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u00142\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)0!H\u0007¢\u0006\u0004\b/\u0010$J%\u0010(\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0014H\u0007¢\u0006\u0004\b0\u0010'J\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u0010\u000bJ\r\u00102\u001a\u00020\t¢\u0006\u0004\b2\u0010\u000bJ\r\u00103\u001a\u00020\r¢\u0006\u0004\b3\u0010\u000fJ\r\u00104\u001a\u00020\t¢\u0006\u0004\b4\u0010\u000bJ\r\u00105\u001a\u00020\r¢\u0006\u0004\b5\u0010\u000fJ\r\u00106\u001a\u00020\t¢\u0006\u0004\b6\u0010\u000bJ\r\u00107\u001a\u00020\r¢\u0006\u0004\b7\u0010\u000fJ\r\u00108\u001a\u00020\t¢\u0006\u0004\b8\u0010\u000bJ\r\u00109\u001a\u00020\r¢\u0006\u0004\b9\u0010\u000fJ\r\u0010:\u001a\u00020\t¢\u0006\u0004\b:\u0010\u000bJ\r\u0010;\u001a\u00020\r¢\u0006\u0004\b;\u0010\u000fJ\r\u0010<\u001a\u00020\t¢\u0006\u0004\b<\u0010\u000bJ\r\u0010=\u001a\u00020\r¢\u0006\u0004\b=\u0010\u000fJ\r\u0010>\u001a\u00020\t¢\u0006\u0004\b>\u0010\u000bJ\r\u0010?\u001a\u00020\r¢\u0006\u0004\b?\u0010\u000fJ\r\u0010@\u001a\u00020\t¢\u0006\u0004\b@\u0010\u000bJ\r\u0010A\u001a\u00020\r¢\u0006\u0004\bA\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR$\u0010H\u001a\u00020C2\u0006\u0010\u0018\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010M\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010R\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010X\u001a\u00020S2\u0006\u0010\u0018\u001a\u00020S8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010^\u001a\u00020Y2\u0006\u0010\u0018\u001a\u00020Y8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R#\u0010a\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148G¢\u0006\u0006\u001a\u0004\b_\u0010`R#\u0010c\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u00148G¢\u0006\u0006\u001a\u0004\bb\u0010`R$\u0010f\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010J\"\u0004\be\u0010LR$\u0010l\u001a\u00020g2\u0006\u0010\u0018\u001a\u00020g8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010o\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010O\"\u0004\bn\u0010QR$\u0010u\u001a\u00020p2\u0006\u0010\u0018\u001a\u00020p8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010x\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010J\"\u0004\bw\u0010LR$\u0010|\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010\u000f\"\u0004\bz\u0010{R$\u0010\u007f\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010J\"\u0004\b~\u0010LR+\u0010\u0085\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0018\u001a\u00030\u0080\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R'\u0010\u0088\u0001\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020)8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010J\"\u0005\b\u0087\u0001\u0010LR'\u0010\u008b\u0001\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u0010O\"\u0005\b\u008a\u0001\u0010QR'\u0010\u008e\u0001\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008c\u0001\u0010O\"\u0005\b\u008d\u0001\u0010Q¨\u0006\u0092\u0001"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl;", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;)V", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "_build", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "Ly8/s;", "clearEventType", "()V", "clearCustomEventType", "", "hasCustomEventType", "()Z", "clearTimestamps", "hasTimestamps", "clearTimeValue", "hasTimeValue", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$StringTagsProxy;", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "putStringTags", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;Ljava/lang/String;)V", "put", "setStringTags", "set", "removeStringTags", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;)V", "remove", "", "map", "putAllStringTags", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/util/Map;)V", "putAll", "clearStringTags", "(Lcom/google/protobuf/kotlin/DslMap;)V", "clear", "", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$IntTagsProxy;", "putIntTags", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;I)V", "setIntTags", "removeIntTags", "putAllIntTags", "clearIntTags", "clearEventId", "clearImpressionOpportunityId", "hasImpressionOpportunityId", "clearPlacementId", "hasPlacementId", "clearAdType", "hasAdType", "clearIsHeaderBidding", "hasIsHeaderBidding", "clearHeaderBiddingTokenNumber", "hasHeaderBiddingTokenNumber", "clearAdFormat", "hasAdFormat", "clearReason", "hasReason", "clearReasonDebug", "hasReasonDebug", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "getEventType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "setEventType", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;)V", "eventType", "getEventTypeValue", "()I", "setEventTypeValue", "(I)V", "eventTypeValue", "getCustomEventType", "()Ljava/lang/String;", "setCustomEventType", "(Ljava/lang/String;)V", "customEventType", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getTimestamps", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "timestamps", "", "getTimeValue", "()D", "setTimeValue", "(D)V", "timeValue", "getStringTagsMap", "()Lcom/google/protobuf/kotlin/DslMap;", "stringTags", "getIntTagsMap", "intTags", "getEventId", "setEventId", "eventId", "Lcom/google/protobuf/ByteString;", "getImpressionOpportunityId", "()Lcom/google/protobuf/ByteString;", "setImpressionOpportunityId", "(Lcom/google/protobuf/ByteString;)V", "impressionOpportunityId", "getPlacementId", "setPlacementId", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getAdType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "setAdType", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;)V", "adType", "getAdTypeValue", "setAdTypeValue", "adTypeValue", "getIsHeaderBidding", "setIsHeaderBidding", "(Z)V", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "getHeaderBiddingTokenNumber", "setHeaderBiddingTokenNumber", "headerBiddingTokenNumber", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "adFormat", "getAdFormatValue", "setAdFormatValue", "adFormatValue", "getReason", "setReason", "reason", "getReasonDebug", "setReasonDebug", "reasonDebug", "Companion", "IntTagsProxy", "StringTagsProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl;", "builder", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$IntTagsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class IntTagsProxy extends DslProxy {
            private IntTagsProxy() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$StringTagsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class StringTagsProxy extends DslProxy {
            private StringTagsProxy() {
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEvent _build() {
            DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEventBuild = this._builder.build();
            p.d(diagnosticEventBuild, "_builder.build()");
            return diagnosticEventBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdType() {
            this._builder.clearAdType();
        }

        public final void clearCustomEventType() {
            this._builder.clearCustomEventType();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearHeaderBiddingTokenNumber() {
            this._builder.clearHeaderBiddingTokenNumber();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        @JvmName(name = "clearIntTags")
        public final /* synthetic */ void clearIntTags(DslMap dslMap) {
            p.e(dslMap, "<this>");
            this._builder.clearIntTags();
        }

        public final void clearIsHeaderBidding() {
            this._builder.clearIsHeaderBidding();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearReason() {
            this._builder.clearReason();
        }

        public final void clearReasonDebug() {
            this._builder.clearReasonDebug();
        }

        @JvmName(name = "clearStringTags")
        public final /* synthetic */ void clearStringTags(DslMap dslMap) {
            p.e(dslMap, "<this>");
            this._builder.clearStringTags();
        }

        public final void clearTimeValue() {
            this._builder.clearTimeValue();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
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

        @JvmName(name = "getAdType")
        @NotNull
        public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
            DiagnosticEventRequestOuterClass.DiagnosticAdType adType = this._builder.getAdType();
            p.d(adType, "_builder.getAdType()");
            return adType;
        }

        @JvmName(name = "getAdTypeValue")
        public final int getAdTypeValue() {
            return this._builder.getAdTypeValue();
        }

        @JvmName(name = "getCustomEventType")
        @NotNull
        public final String getCustomEventType() {
            String customEventType = this._builder.getCustomEventType();
            p.d(customEventType, "_builder.getCustomEventType()");
            return customEventType;
        }

        @JvmName(name = "getEventId")
        public final int getEventId() {
            return this._builder.getEventId();
        }

        @JvmName(name = "getEventType")
        @NotNull
        public final DiagnosticEventRequestOuterClass.DiagnosticEventType getEventType() {
            DiagnosticEventRequestOuterClass.DiagnosticEventType eventType = this._builder.getEventType();
            p.d(eventType, "_builder.getEventType()");
            return eventType;
        }

        @JvmName(name = "getEventTypeValue")
        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
        }

        @JvmName(name = "getHeaderBiddingTokenNumber")
        public final int getHeaderBiddingTokenNumber() {
            return this._builder.getHeaderBiddingTokenNumber();
        }

        @JvmName(name = "getImpressionOpportunityId")
        @NotNull
        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            p.d(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        @JvmName(name = "getIntTagsMap")
        public final /* synthetic */ DslMap getIntTagsMap() {
            Map<String, Integer> intTagsMap = this._builder.getIntTagsMap();
            p.d(intTagsMap, "_builder.getIntTagsMap()");
            return new DslMap(intTagsMap);
        }

        @JvmName(name = "getIsHeaderBidding")
        public final boolean getIsHeaderBidding() {
            return this._builder.getIsHeaderBidding();
        }

        @JvmName(name = "getPlacementId")
        @NotNull
        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            p.d(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        @JvmName(name = "getReason")
        @NotNull
        public final String getReason() {
            String reason = this._builder.getReason();
            p.d(reason, "_builder.getReason()");
            return reason;
        }

        @JvmName(name = "getReasonDebug")
        @NotNull
        public final String getReasonDebug() {
            String reasonDebug = this._builder.getReasonDebug();
            p.d(reasonDebug, "_builder.getReasonDebug()");
            return reasonDebug;
        }

        @JvmName(name = "getStringTagsMap")
        public final /* synthetic */ DslMap getStringTagsMap() {
            Map<String, String> stringTagsMap = this._builder.getStringTagsMap();
            p.d(stringTagsMap, "_builder.getStringTagsMap()");
            return new DslMap(stringTagsMap);
        }

        @JvmName(name = "getTimeValue")
        public final double getTimeValue() {
            return this._builder.getTimeValue();
        }

        @JvmName(name = "getTimestamps")
        @NotNull
        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            p.d(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasAdType() {
            return this._builder.hasAdType();
        }

        public final boolean hasCustomEventType() {
            return this._builder.hasCustomEventType();
        }

        public final boolean hasHeaderBiddingTokenNumber() {
            return this._builder.hasHeaderBiddingTokenNumber();
        }

        public final boolean hasImpressionOpportunityId() {
            return this._builder.hasImpressionOpportunityId();
        }

        public final boolean hasIsHeaderBidding() {
            return this._builder.hasIsHeaderBidding();
        }

        public final boolean hasPlacementId() {
            return this._builder.hasPlacementId();
        }

        public final boolean hasReason() {
            return this._builder.hasReason();
        }

        public final boolean hasReasonDebug() {
            return this._builder.hasReasonDebug();
        }

        public final boolean hasTimeValue() {
            return this._builder.hasTimeValue();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        @JvmName(name = "putAllIntTags")
        public final /* synthetic */ void putAllIntTags(DslMap dslMap, Map map) {
            p.e(dslMap, "<this>");
            p.e(map, "map");
            this._builder.putAllIntTags(map);
        }

        @JvmName(name = "putAllStringTags")
        public final /* synthetic */ void putAllStringTags(DslMap dslMap, Map map) {
            p.e(dslMap, "<this>");
            p.e(map, "map");
            this._builder.putAllStringTags(map);
        }

        @JvmName(name = "putIntTags")
        public final void putIntTags(@NotNull DslMap<String, Integer, IntTagsProxy> dslMap, @NotNull String key, int i10) {
            p.e(dslMap, "<this>");
            p.e(key, "key");
            this._builder.putIntTags(key, i10);
        }

        @JvmName(name = "putStringTags")
        public final void putStringTags(@NotNull DslMap<String, String, StringTagsProxy> dslMap, @NotNull String key, @NotNull String value) {
            p.e(dslMap, "<this>");
            p.e(key, "key");
            p.e(value, "value");
            this._builder.putStringTags(key, value);
        }

        @JvmName(name = "removeIntTags")
        public final /* synthetic */ void removeIntTags(DslMap dslMap, String key) {
            p.e(dslMap, "<this>");
            p.e(key, "key");
            this._builder.removeIntTags(key);
        }

        @JvmName(name = "removeStringTags")
        public final /* synthetic */ void removeStringTags(DslMap dslMap, String key) {
            p.e(dslMap, "<this>");
            p.e(key, "key");
            this._builder.removeStringTags(key);
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

        @JvmName(name = "setAdType")
        public final void setAdType(@NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType value) {
            p.e(value, "value");
            this._builder.setAdType(value);
        }

        @JvmName(name = "setAdTypeValue")
        public final void setAdTypeValue(int i10) {
            this._builder.setAdTypeValue(i10);
        }

        @JvmName(name = "setCustomEventType")
        public final void setCustomEventType(@NotNull String value) {
            p.e(value, "value");
            this._builder.setCustomEventType(value);
        }

        @JvmName(name = "setEventId")
        public final void setEventId(int i10) {
            this._builder.setEventId(i10);
        }

        @JvmName(name = "setEventType")
        public final void setEventType(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            p.e(value, "value");
            this._builder.setEventType(value);
        }

        @JvmName(name = "setEventTypeValue")
        public final void setEventTypeValue(int i10) {
            this._builder.setEventTypeValue(i10);
        }

        @JvmName(name = "setHeaderBiddingTokenNumber")
        public final void setHeaderBiddingTokenNumber(int i10) {
            this._builder.setHeaderBiddingTokenNumber(i10);
        }

        @JvmName(name = "setImpressionOpportunityId")
        public final void setImpressionOpportunityId(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        @JvmName(name = "setIntTags")
        public final /* synthetic */ void setIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String key, int i10) {
            p.e(dslMap, "<this>");
            p.e(key, "key");
            putIntTags(dslMap, key, i10);
        }

        @JvmName(name = "setIsHeaderBidding")
        public final void setIsHeaderBidding(boolean z10) {
            this._builder.setIsHeaderBidding(z10);
        }

        @JvmName(name = "setPlacementId")
        public final void setPlacementId(@NotNull String value) {
            p.e(value, "value");
            this._builder.setPlacementId(value);
        }

        @JvmName(name = "setReason")
        public final void setReason(@NotNull String value) {
            p.e(value, "value");
            this._builder.setReason(value);
        }

        @JvmName(name = "setReasonDebug")
        public final void setReasonDebug(@NotNull String value) {
            p.e(value, "value");
            this._builder.setReasonDebug(value);
        }

        @JvmName(name = "setStringTags")
        public final /* synthetic */ void setStringTags(DslMap<String, String, StringTagsProxy> dslMap, String key, String value) {
            p.e(dslMap, "<this>");
            p.e(key, "key");
            p.e(value, "value");
            putStringTags(dslMap, key, value);
        }

        @JvmName(name = "setTimeValue")
        public final void setTimeValue(double d10) {
            this._builder.setTimeValue(d10);
        }

        @JvmName(name = "setTimestamps")
        public final void setTimestamps(@NotNull TimestampsOuterClass.Timestamps value) {
            p.e(value, "value");
            this._builder.setTimestamps(value);
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventKt() {
    }
}
