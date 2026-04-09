package gatewayprotocol.v1;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/OperativeEventErrorDataKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OperativeEventErrorDataKt {

    @NotNull
    public static final OperativeEventErrorDataKt INSTANCE = new OperativeEventErrorDataKt();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lgatewayprotocol/v1/OperativeEventErrorDataKt$Dsl;", "", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorData$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorData$Builder;)V", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorData;", "_build", "()Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorData;", "Ly8/s;", "clearErrorType", "()V", "clearMessage", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorData$Builder;", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getErrorType", "()Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;", "setErrorType", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;)V", "errorType", "", "getErrorTypeValue", "()I", "setErrorTypeValue", "(I)V", "errorTypeValue", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", PglCryptUtils.KEY_MESSAGE, "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final OperativeEventRequestOuterClass.OperativeEventErrorData.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/OperativeEventErrorDataKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/OperativeEventErrorDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorData$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ OperativeEventRequestOuterClass.OperativeEventErrorData _build() {
            OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorDataBuild = this._builder.build();
            p.d(operativeEventErrorDataBuild, "_builder.build()");
            return operativeEventErrorDataBuild;
        }

        public final void clearErrorType() {
            this._builder.clearErrorType();
        }

        public final void clearMessage() {
            this._builder.clearMessage();
        }

        @JvmName(name = "getErrorType")
        @NotNull
        public final OperativeEventRequestOuterClass.OperativeEventErrorType getErrorType() {
            OperativeEventRequestOuterClass.OperativeEventErrorType errorType = this._builder.getErrorType();
            p.d(errorType, "_builder.getErrorType()");
            return errorType;
        }

        @JvmName(name = "getErrorTypeValue")
        public final int getErrorTypeValue() {
            return this._builder.getErrorTypeValue();
        }

        @JvmName(name = "getMessage")
        @NotNull
        public final String getMessage() {
            String message = this._builder.getMessage();
            p.d(message, "_builder.getMessage()");
            return message;
        }

        @JvmName(name = "setErrorType")
        public final void setErrorType(@NotNull OperativeEventRequestOuterClass.OperativeEventErrorType value) {
            p.e(value, "value");
            this._builder.setErrorType(value);
        }

        @JvmName(name = "setErrorTypeValue")
        public final void setErrorTypeValue(int i10) {
            this._builder.setErrorTypeValue(i10);
        }

        @JvmName(name = "setMessage")
        public final void setMessage(@NotNull String value) {
            p.e(value, "value");
            this._builder.setMessage(value);
        }

        private Dsl(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder) {
            this._builder = builder;
        }
    }

    private OperativeEventErrorDataKt() {
    }
}
