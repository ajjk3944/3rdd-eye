package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AudienceManagementRequestOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AudienceManagementRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AudienceManagementRequestKt {

    @NotNull
    public static final AudienceManagementRequestKt INSTANCE = new AudienceManagementRequestKt();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010-\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lgatewayprotocol/v1/AudienceManagementRequestKt$Dsl;", "", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest$Builder;)V", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "_build", "()Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "Ly8/s;", "clearSessionCounters", "()V", "", "hasSessionCounters", "()Z", "clearStaticDeviceInfo", "hasStaticDeviceInfo", "clearDynamicDeviceInfo", "hasDynamicDeviceInfo", "clearAudienceManagementData", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest$Builder;", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "sessionCounters", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "staticDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "dynamicDeviceInfo", "Lcom/google/protobuf/ByteString;", "getAudienceManagementData", "()Lcom/google/protobuf/ByteString;", "setAudienceManagementData", "(Lcom/google/protobuf/ByteString;)V", "audienceManagementData", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AudienceManagementRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AudienceManagementRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ AudienceManagementRequestOuterClass.AudienceManagementRequest _build() {
            AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequestBuild = this._builder.build();
            p.d(audienceManagementRequestBuild, "_builder.build()");
            return audienceManagementRequestBuild;
        }

        public final void clearAudienceManagementData() {
            this._builder.clearAudienceManagementData();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        @JvmName(name = "getAudienceManagementData")
        @NotNull
        public final ByteString getAudienceManagementData() {
            ByteString audienceManagementData = this._builder.getAudienceManagementData();
            p.d(audienceManagementData, "_builder.getAudienceManagementData()");
            return audienceManagementData;
        }

        @JvmName(name = "getDynamicDeviceInfo")
        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            p.d(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        @JvmName(name = "getSessionCounters")
        @NotNull
        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            p.d(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        @JvmName(name = "getStaticDeviceInfo")
        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            p.d(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        @JvmName(name = "setAudienceManagementData")
        public final void setAudienceManagementData(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setAudienceManagementData(value);
        }

        @JvmName(name = "setDynamicDeviceInfo")
        public final void setDynamicDeviceInfo(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            p.e(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        @JvmName(name = "setSessionCounters")
        public final void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters value) {
            p.e(value, "value");
            this._builder.setSessionCounters(value);
        }

        @JvmName(name = "setStaticDeviceInfo")
        public final void setStaticDeviceInfo(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            p.e(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        private Dsl(AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AudienceManagementRequestKt() {
    }
}
