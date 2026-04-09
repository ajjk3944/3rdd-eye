package com.ui.wmw.api.v1;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public abstract class ApiV1BluetoothSettingsRequest {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsRequest$BluetoothMode;", "Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsRequest;", "", "mode", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsRequest$BluetoothMode;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Y6.i(generateAdapter = true)
    public static final /* data */ class BluetoothMode extends ApiV1BluetoothSettingsRequest {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BluetoothMode(@Y6.g(name = "btMode") String mode) {
            super(null);
            AbstractC6492s.i(mode, "mode");
            this.mode = mode;
        }

        /* renamed from: a, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        public final BluetoothMode copy(@Y6.g(name = "btMode") String mode) {
            AbstractC6492s.i(mode, "mode");
            return new BluetoothMode(mode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BluetoothMode) && AbstractC6492s.d(this.mode, ((BluetoothMode) other).mode);
        }

        public int hashCode() {
            return this.mode.hashCode();
        }

        public String toString() {
            return "BluetoothMode(mode=" + this.mode + ")";
        }
    }

    public /* synthetic */ ApiV1BluetoothSettingsRequest(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ApiV1BluetoothSettingsRequest() {
    }
}
