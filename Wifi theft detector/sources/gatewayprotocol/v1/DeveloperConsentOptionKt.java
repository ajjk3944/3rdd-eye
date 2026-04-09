package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DeveloperConsentOptionKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeveloperConsentOptionKt {

    @NotNull
    public static final DeveloperConsentOptionKt INSTANCE = new DeveloperConsentOptionKt();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0013\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020%8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010,\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001d¨\u0006."}, d2 = {"Lgatewayprotocol/v1/DeveloperConsentOptionKt$Dsl;", "", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption$Builder;)V", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption;", "_build", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption;", "Ly8/s;", "clearType", "()V", "clearCustomType", "", "hasCustomType", "()Z", "clearValue", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption$Builder;", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getType", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentType;", "setType", "(Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentType;)V", HandleInvocationsFromAdViewer.KEY_AD_TYPE, "", "getTypeValue", "()I", "setTypeValue", "(I)V", "typeValue", "", "getCustomType", "()Ljava/lang/String;", "setCustomType", "(Ljava/lang/String;)V", "customType", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;", "getValue", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;", "setValue", "(Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;)V", "getValueValue", "setValueValue", "valueValue", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final DeveloperConsentOuterClass.DeveloperConsentOption.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DeveloperConsentOptionKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DeveloperConsentOptionKt$Dsl;", "builder", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ DeveloperConsentOuterClass.DeveloperConsentOption _build() {
            DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOptionBuild = this._builder.build();
            p.d(developerConsentOptionBuild, "_builder.build()");
            return developerConsentOptionBuild;
        }

        public final void clearCustomType() {
            this._builder.clearCustomType();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @JvmName(name = "getCustomType")
        @NotNull
        public final String getCustomType() {
            String customType = this._builder.getCustomType();
            p.d(customType, "_builder.getCustomType()");
            return customType;
        }

        @JvmName(name = "getType")
        @NotNull
        public final DeveloperConsentOuterClass.DeveloperConsentType getType() {
            DeveloperConsentOuterClass.DeveloperConsentType type = this._builder.getType();
            p.d(type, "_builder.getType()");
            return type;
        }

        @JvmName(name = "getTypeValue")
        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        @JvmName(name = "getValue")
        @NotNull
        public final DeveloperConsentOuterClass.DeveloperConsentChoice getValue() {
            DeveloperConsentOuterClass.DeveloperConsentChoice value = this._builder.getValue();
            p.d(value, "_builder.getValue()");
            return value;
        }

        @JvmName(name = "getValueValue")
        public final int getValueValue() {
            return this._builder.getValueValue();
        }

        public final boolean hasCustomType() {
            return this._builder.hasCustomType();
        }

        @JvmName(name = "setCustomType")
        public final void setCustomType(@NotNull String value) {
            p.e(value, "value");
            this._builder.setCustomType(value);
        }

        @JvmName(name = "setType")
        public final void setType(@NotNull DeveloperConsentOuterClass.DeveloperConsentType value) {
            p.e(value, "value");
            this._builder.setType(value);
        }

        @JvmName(name = "setTypeValue")
        public final void setTypeValue(int i10) {
            this._builder.setTypeValue(i10);
        }

        @JvmName(name = "setValue")
        public final void setValue(@NotNull DeveloperConsentOuterClass.DeveloperConsentChoice value) {
            p.e(value, "value");
            this._builder.setValue(value);
        }

        @JvmName(name = "setValueValue")
        public final void setValueValue(int i10) {
            this._builder.setValueValue(i10);
        }

        private Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
            this._builder = builder;
        }
    }

    private DeveloperConsentOptionKt() {
    }
}
