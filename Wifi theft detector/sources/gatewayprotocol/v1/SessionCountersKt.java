package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.SessionCountersOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/SessionCountersKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SessionCountersKt {

    @NotNull
    public static final SessionCountersKt INSTANCE = new SessionCountersKt();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001d\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R$\u0010#\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R$\u0010&\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R$\u0010)\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019R$\u0010,\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R$\u0010/\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019¨\u00061"}, d2 = {"Lgatewayprotocol/v1/SessionCountersKt$Dsl;", "", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;)V", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "_build", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "Ly8/s;", "clearLoadRequests", "()V", "clearLoadRequestsAdm", "clearBannerLoadRequests", "clearBannerRequestsAdm", "clearBannerImpressions", "clearGlobalAdsFocusTime", "clearGlobalAdsFocusChangeCount", "clearFocusChangeCount", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getLoadRequests", "()I", "setLoadRequests", "(I)V", "loadRequests", "getLoadRequestsAdm", "setLoadRequestsAdm", "loadRequestsAdm", "getBannerLoadRequests", "setBannerLoadRequests", "bannerLoadRequests", "getBannerRequestsAdm", "setBannerRequestsAdm", "bannerRequestsAdm", "getBannerImpressions", "setBannerImpressions", "bannerImpressions", "getGlobalAdsFocusTime", "setGlobalAdsFocusTime", "globalAdsFocusTime", "getGlobalAdsFocusChangeCount", "setGlobalAdsFocusChangeCount", "globalAdsFocusChangeCount", "getFocusChangeCount", "setFocusChangeCount", "focusChangeCount", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final SessionCountersOuterClass.SessionCounters.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/SessionCountersKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/SessionCountersKt$Dsl;", "builder", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(SessionCountersOuterClass.SessionCounters.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(SessionCountersOuterClass.SessionCounters.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ SessionCountersOuterClass.SessionCounters _build() {
            SessionCountersOuterClass.SessionCounters sessionCountersBuild = this._builder.build();
            p.d(sessionCountersBuild, "_builder.build()");
            return sessionCountersBuild;
        }

        public final void clearBannerImpressions() {
            this._builder.clearBannerImpressions();
        }

        public final void clearBannerLoadRequests() {
            this._builder.clearBannerLoadRequests();
        }

        public final void clearBannerRequestsAdm() {
            this._builder.clearBannerRequestsAdm();
        }

        public final void clearFocusChangeCount() {
            this._builder.clearFocusChangeCount();
        }

        public final void clearGlobalAdsFocusChangeCount() {
            this._builder.clearGlobalAdsFocusChangeCount();
        }

        public final void clearGlobalAdsFocusTime() {
            this._builder.clearGlobalAdsFocusTime();
        }

        public final void clearLoadRequests() {
            this._builder.clearLoadRequests();
        }

        public final void clearLoadRequestsAdm() {
            this._builder.clearLoadRequestsAdm();
        }

        @JvmName(name = "getBannerImpressions")
        public final int getBannerImpressions() {
            return this._builder.getBannerImpressions();
        }

        @JvmName(name = "getBannerLoadRequests")
        public final int getBannerLoadRequests() {
            return this._builder.getBannerLoadRequests();
        }

        @JvmName(name = "getBannerRequestsAdm")
        public final int getBannerRequestsAdm() {
            return this._builder.getBannerRequestsAdm();
        }

        @JvmName(name = "getFocusChangeCount")
        public final int getFocusChangeCount() {
            return this._builder.getFocusChangeCount();
        }

        @JvmName(name = "getGlobalAdsFocusChangeCount")
        public final int getGlobalAdsFocusChangeCount() {
            return this._builder.getGlobalAdsFocusChangeCount();
        }

        @JvmName(name = "getGlobalAdsFocusTime")
        public final int getGlobalAdsFocusTime() {
            return this._builder.getGlobalAdsFocusTime();
        }

        @JvmName(name = "getLoadRequests")
        public final int getLoadRequests() {
            return this._builder.getLoadRequests();
        }

        @JvmName(name = "getLoadRequestsAdm")
        public final int getLoadRequestsAdm() {
            return this._builder.getLoadRequestsAdm();
        }

        @JvmName(name = "setBannerImpressions")
        public final void setBannerImpressions(int i10) {
            this._builder.setBannerImpressions(i10);
        }

        @JvmName(name = "setBannerLoadRequests")
        public final void setBannerLoadRequests(int i10) {
            this._builder.setBannerLoadRequests(i10);
        }

        @JvmName(name = "setBannerRequestsAdm")
        public final void setBannerRequestsAdm(int i10) {
            this._builder.setBannerRequestsAdm(i10);
        }

        @JvmName(name = "setFocusChangeCount")
        public final void setFocusChangeCount(int i10) {
            this._builder.setFocusChangeCount(i10);
        }

        @JvmName(name = "setGlobalAdsFocusChangeCount")
        public final void setGlobalAdsFocusChangeCount(int i10) {
            this._builder.setGlobalAdsFocusChangeCount(i10);
        }

        @JvmName(name = "setGlobalAdsFocusTime")
        public final void setGlobalAdsFocusTime(int i10) {
            this._builder.setGlobalAdsFocusTime(i10);
        }

        @JvmName(name = "setLoadRequests")
        public final void setLoadRequests(int i10) {
            this._builder.setLoadRequests(i10);
        }

        @JvmName(name = "setLoadRequestsAdm")
        public final void setLoadRequestsAdm(int i10) {
            this._builder.setLoadRequestsAdm(i10);
        }

        private Dsl(SessionCountersOuterClass.SessionCounters.Builder builder) {
            this._builder = builder;
        }
    }

    private SessionCountersKt() {
    }
}
