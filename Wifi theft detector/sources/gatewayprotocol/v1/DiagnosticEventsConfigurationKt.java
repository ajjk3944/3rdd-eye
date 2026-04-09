package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DiagnosticEventsConfigurationKt {

    @NotNull
    public static final DiagnosticEventsConfigurationKt INSTANCE = new DiagnosticEventsConfigurationKt();

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 N2\u00020\u0001:\u0003OPNB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ'\u0010\u0016\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0013\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0018\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0013\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0015J-\u0010\u001d\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u0018\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001cJ0\u0010#\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0087\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0007¢\u0006\u0004\b$\u0010%J'\u0010\u0016\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020'0\u00102\u0006\u0010\u0013\u001a\u00020\u0011H\u0007¢\u0006\u0004\b(\u0010\u0015J(\u0010\u0018\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020'0\u00102\u0006\u0010\u0013\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b)\u0010\u0015J-\u0010\u001d\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020'0\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0007¢\u0006\u0004\b*\u0010\u001cJ.\u0010\u0018\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020'0\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0087\n¢\u0006\u0004\b+\u0010\u001cJ0\u0010#\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020'0\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0087\u0002¢\u0006\u0004\b,\u0010\"J\u001f\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020'0\u0010H\u0007¢\u0006\u0004\b-\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R$\u00104\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00109\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010<\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u00106\"\u0004\b;\u00108R$\u0010?\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00101\"\u0004\b>\u00103R$\u0010E\u001a\u00020@2\u0006\u0010\u0013\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010H\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u00106\"\u0004\bG\u00108R\u001d\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001d\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020'0\u00108F¢\u0006\u0006\u001a\u0004\bL\u0010J¨\u0006Q"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl;", "", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder;)V", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "_build", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "Ly8/s;", "clearEnabled", "()V", "clearMaxBatchSize", "clearMaxBatchIntervalMs", "clearTtmEnabled", "clearSeverity", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl$AllowedEventsProxy;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "addAllowedEvents", "(Lcom/google/protobuf/kotlin/DslList;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;)V", "add", "plusAssignAllowedEvents", "plusAssign", "", "values", "addAllAllowedEvents", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllAllowedEvents", "", "index", "setAllowedEvents", "(Lcom/google/protobuf/kotlin/DslList;ILgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;)V", "set", "clearAllowedEvents", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl$BlockedEventsProxy;", "addBlockedEvents", "plusAssignBlockedEvents", "addAllBlockedEvents", "plusAssignAllBlockedEvents", "setBlockedEvents", "clearBlockedEvents", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder;", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "getMaxBatchSize", "()I", "setMaxBatchSize", "(I)V", "maxBatchSize", "getMaxBatchIntervalMs", "setMaxBatchIntervalMs", "maxBatchIntervalMs", "getTtmEnabled", "setTtmEnabled", "ttmEnabled", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity;", "getSeverity", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity;", "setSeverity", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity;)V", "severity", "getSeverityValue", "setSeverityValue", "severityValue", "getAllowedEvents", "()Lcom/google/protobuf/kotlin/DslList;", "allowedEvents", "getBlockedEvents", "blockedEvents", "Companion", "AllowedEventsProxy", "BlockedEventsProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder _builder;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl$AllowedEventsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AllowedEventsProxy extends DslProxy {
            private AllowedEventsProxy() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl$BlockedEventsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BlockedEventsProxy extends DslProxy {
            private BlockedEventsProxy() {
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DiagnosticEventsConfigurationKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ NativeConfigurationOuterClass.DiagnosticEventsConfiguration _build() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfigurationBuild = this._builder.build();
            p.d(diagnosticEventsConfigurationBuild, "_builder.build()");
            return diagnosticEventsConfigurationBuild;
        }

        @JvmName(name = "addAllAllowedEvents")
        public final /* synthetic */ void addAllAllowedEvents(DslList dslList, Iterable values) {
            p.e(dslList, "<this>");
            p.e(values, "values");
            this._builder.addAllAllowedEvents(values);
        }

        @JvmName(name = "addAllBlockedEvents")
        public final /* synthetic */ void addAllBlockedEvents(DslList dslList, Iterable values) {
            p.e(dslList, "<this>");
            p.e(values, "values");
            this._builder.addAllBlockedEvents(values);
        }

        @JvmName(name = "addAllowedEvents")
        public final /* synthetic */ void addAllowedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            this._builder.addAllowedEvents(value);
        }

        @JvmName(name = "addBlockedEvents")
        public final /* synthetic */ void addBlockedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            this._builder.addBlockedEvents(value);
        }

        @JvmName(name = "clearAllowedEvents")
        public final /* synthetic */ void clearAllowedEvents(DslList dslList) {
            p.e(dslList, "<this>");
            this._builder.clearAllowedEvents();
        }

        @JvmName(name = "clearBlockedEvents")
        public final /* synthetic */ void clearBlockedEvents(DslList dslList) {
            p.e(dslList, "<this>");
            this._builder.clearBlockedEvents();
        }

        public final void clearEnabled() {
            this._builder.clearEnabled();
        }

        public final void clearMaxBatchIntervalMs() {
            this._builder.clearMaxBatchIntervalMs();
        }

        public final void clearMaxBatchSize() {
            this._builder.clearMaxBatchSize();
        }

        public final void clearSeverity() {
            this._builder.clearSeverity();
        }

        public final void clearTtmEnabled() {
            this._builder.clearTtmEnabled();
        }

        public final /* synthetic */ DslList getAllowedEvents() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = this._builder.getAllowedEventsList();
            p.d(allowedEventsList, "_builder.getAllowedEventsList()");
            return new DslList(allowedEventsList);
        }

        public final /* synthetic */ DslList getBlockedEvents() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = this._builder.getBlockedEventsList();
            p.d(blockedEventsList, "_builder.getBlockedEventsList()");
            return new DslList(blockedEventsList);
        }

        @JvmName(name = "getEnabled")
        public final boolean getEnabled() {
            return this._builder.getEnabled();
        }

        @JvmName(name = "getMaxBatchIntervalMs")
        public final int getMaxBatchIntervalMs() {
            return this._builder.getMaxBatchIntervalMs();
        }

        @JvmName(name = "getMaxBatchSize")
        public final int getMaxBatchSize() {
            return this._builder.getMaxBatchSize();
        }

        @JvmName(name = "getSeverity")
        @NotNull
        public final DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
            DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity severity = this._builder.getSeverity();
            p.d(severity, "_builder.getSeverity()");
            return severity;
        }

        @JvmName(name = "getSeverityValue")
        public final int getSeverityValue() {
            return this._builder.getSeverityValue();
        }

        @JvmName(name = "getTtmEnabled")
        public final boolean getTtmEnabled() {
            return this._builder.getTtmEnabled();
        }

        @JvmName(name = "plusAssignAllAllowedEvents")
        public final /* synthetic */ void plusAssignAllAllowedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, AllowedEventsProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> values) {
            p.e(dslList, "<this>");
            p.e(values, "values");
            addAllAllowedEvents(dslList, values);
        }

        @JvmName(name = "plusAssignAllBlockedEvents")
        public final /* synthetic */ void plusAssignAllBlockedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, BlockedEventsProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> values) {
            p.e(dslList, "<this>");
            p.e(values, "values");
            addAllBlockedEvents(dslList, values);
        }

        @JvmName(name = "plusAssignAllowedEvents")
        public final /* synthetic */ void plusAssignAllowedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, AllowedEventsProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            addAllowedEvents(dslList, value);
        }

        @JvmName(name = "plusAssignBlockedEvents")
        public final /* synthetic */ void plusAssignBlockedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, BlockedEventsProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            addBlockedEvents(dslList, value);
        }

        @JvmName(name = "setAllowedEvents")
        public final /* synthetic */ void setAllowedEvents(DslList dslList, int i10, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            this._builder.setAllowedEvents(i10, value);
        }

        @JvmName(name = "setBlockedEvents")
        public final /* synthetic */ void setBlockedEvents(DslList dslList, int i10, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            this._builder.setBlockedEvents(i10, value);
        }

        @JvmName(name = "setEnabled")
        public final void setEnabled(boolean z10) {
            this._builder.setEnabled(z10);
        }

        @JvmName(name = "setMaxBatchIntervalMs")
        public final void setMaxBatchIntervalMs(int i10) {
            this._builder.setMaxBatchIntervalMs(i10);
        }

        @JvmName(name = "setMaxBatchSize")
        public final void setMaxBatchSize(int i10) {
            this._builder.setMaxBatchSize(i10);
        }

        @JvmName(name = "setSeverity")
        public final void setSeverity(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity value) {
            p.e(value, "value");
            this._builder.setSeverity(value);
        }

        @JvmName(name = "setSeverityValue")
        public final void setSeverityValue(int i10) {
            this._builder.setSeverityValue(i10);
        }

        @JvmName(name = "setTtmEnabled")
        public final void setTtmEnabled(boolean z10) {
            this._builder.setTtmEnabled(z10);
        }

        private Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventsConfigurationKt() {
    }
}
