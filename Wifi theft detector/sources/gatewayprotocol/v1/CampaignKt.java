package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/CampaignKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CampaignKt {

    @NotNull
    public static final CampaignKt INSTANCE = new CampaignKt();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010(\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010+\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R$\u00101\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020,8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00104\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020,8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u0017\u00107\u001a\u0004\u0018\u00010,*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lgatewayprotocol/v1/CampaignKt$Dsl;", "", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign$Builder;)V", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "_build", "()Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "Ly8/s;", "clearDataVersion", "()V", "clearData", "clearPlacementId", "clearImpressionOpportunityId", "clearLoadTimestamp", "", "hasLoadTimestamp", "()Z", "clearShowTimestamp", "hasShowTimestamp", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign$Builder;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getDataVersion", "()I", "setDataVersion", "(I)V", "dataVersion", "Lcom/google/protobuf/ByteString;", "getData", "()Lcom/google/protobuf/ByteString;", "setData", "(Lcom/google/protobuf/ByteString;)V", "data", "", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "getImpressionOpportunityId", "setImpressionOpportunityId", "impressionOpportunityId", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getLoadTimestamp", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setLoadTimestamp", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "loadTimestamp", "getShowTimestamp", "setShowTimestamp", "showTimestamp", "getShowTimestampOrNull", "(Lgatewayprotocol/v1/CampaignKt$Dsl;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "showTimestampOrNull", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final CampaignStateOuterClass.Campaign.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/CampaignKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/CampaignKt$Dsl;", "builder", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.Campaign.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.Campaign.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ CampaignStateOuterClass.Campaign _build() {
            CampaignStateOuterClass.Campaign campaignBuild = this._builder.build();
            p.d(campaignBuild, "_builder.build()");
            return campaignBuild;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final void clearDataVersion() {
            this._builder.clearDataVersion();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearLoadTimestamp() {
            this._builder.clearLoadTimestamp();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearShowTimestamp() {
            this._builder.clearShowTimestamp();
        }

        @JvmName(name = "getData")
        @NotNull
        public final ByteString getData() {
            ByteString data = this._builder.getData();
            p.d(data, "_builder.getData()");
            return data;
        }

        @JvmName(name = "getDataVersion")
        public final int getDataVersion() {
            return this._builder.getDataVersion();
        }

        @JvmName(name = "getImpressionOpportunityId")
        @NotNull
        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            p.d(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        @JvmName(name = "getLoadTimestamp")
        @NotNull
        public final TimestampsOuterClass.Timestamps getLoadTimestamp() {
            TimestampsOuterClass.Timestamps loadTimestamp = this._builder.getLoadTimestamp();
            p.d(loadTimestamp, "_builder.getLoadTimestamp()");
            return loadTimestamp;
        }

        @JvmName(name = "getPlacementId")
        @NotNull
        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            p.d(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        @JvmName(name = "getShowTimestamp")
        @NotNull
        public final TimestampsOuterClass.Timestamps getShowTimestamp() {
            TimestampsOuterClass.Timestamps showTimestamp = this._builder.getShowTimestamp();
            p.d(showTimestamp, "_builder.getShowTimestamp()");
            return showTimestamp;
        }

        @Nullable
        public final TimestampsOuterClass.Timestamps getShowTimestampOrNull(@NotNull Dsl dsl) {
            p.e(dsl, "<this>");
            return CampaignKtKt.getShowTimestampOrNull(dsl._builder);
        }

        public final boolean hasLoadTimestamp() {
            return this._builder.hasLoadTimestamp();
        }

        public final boolean hasShowTimestamp() {
            return this._builder.hasShowTimestamp();
        }

        @JvmName(name = "setData")
        public final void setData(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setData(value);
        }

        @JvmName(name = "setDataVersion")
        public final void setDataVersion(int i10) {
            this._builder.setDataVersion(i10);
        }

        @JvmName(name = "setImpressionOpportunityId")
        public final void setImpressionOpportunityId(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        @JvmName(name = "setLoadTimestamp")
        public final void setLoadTimestamp(@NotNull TimestampsOuterClass.Timestamps value) {
            p.e(value, "value");
            this._builder.setLoadTimestamp(value);
        }

        @JvmName(name = "setPlacementId")
        public final void setPlacementId(@NotNull String value) {
            p.e(value, "value");
            this._builder.setPlacementId(value);
        }

        @JvmName(name = "setShowTimestamp")
        public final void setShowTimestamp(@NotNull TimestampsOuterClass.Timestamps value) {
            p.e(value, "value");
            this._builder.setShowTimestamp(value);
        }

        private Dsl(CampaignStateOuterClass.Campaign.Builder builder) {
            this._builder = builder;
        }
    }

    private CampaignKt() {
    }
}
