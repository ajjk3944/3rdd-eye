package com.ubnt.teleport.unifi.cloud.api;

import Y6.g;
import Y6.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB1\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError;", "", "", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError$Error;", "errors", "", "reason", "exception", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", "()Ljava/util/List;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, "Error", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiTeleportCloudError {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List errors;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reason;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String exception;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError$Error;", "", "", "message", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError$Error;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Error {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        public Error(@g(name = "message") String str) {
            this.message = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Error copy(@g(name = "message") String message) {
            return new Error(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && AbstractC6492s.d(this.message, ((Error) other).message);
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ')';
        }
    }

    public ApiTeleportCloudError(@g(name = "errors") List<Error> list, @g(name = "reason") String str, @g(name = "exception") String str2) {
        this.errors = list;
        this.reason = str;
        this.exception = str2;
    }

    /* renamed from: a, reason: from getter */
    public final List getErrors() {
        return this.errors;
    }

    /* renamed from: b, reason: from getter */
    public final String getException() {
        return this.exception;
    }

    /* renamed from: c, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final ApiTeleportCloudError copy(@g(name = "errors") List<Error> errors, @g(name = "reason") String reason, @g(name = "exception") String exception) {
        return new ApiTeleportCloudError(errors, reason, exception);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiTeleportCloudError)) {
            return false;
        }
        ApiTeleportCloudError apiTeleportCloudError = (ApiTeleportCloudError) other;
        return AbstractC6492s.d(this.errors, apiTeleportCloudError.errors) && AbstractC6492s.d(this.reason, apiTeleportCloudError.reason) && AbstractC6492s.d(this.exception, apiTeleportCloudError.exception);
    }

    public int hashCode() {
        List list = this.errors;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.reason;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.exception;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ApiTeleportCloudError(errors=" + this.errors + ", reason=" + this.reason + ", exception=" + this.exception + ')';
    }
}
