package com.ui.wifiman.model.ubiquiti.firmware.api;

import Rj.f;
import Rj.o;
import Rj.t;
import Y6.g;
import Y6.i;
import com.ui.wifiman.model.ubiquiti.firmware.api.ApiUbiquitiFirmware;
import gg.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001:\u0006\u0006\u000f\u0010\u0011\u0012\u0013J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi;", "", "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;", "request", "Lgg/z;", "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenResponse;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;)Lgg/z;", "", "token", "", "filter", "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Firmwares;", SnmpConfigurator.O_BIND_ADDRESS, "(Ljava/lang/String;Ljava/util/List;)Lgg/z;", "Error", "Firmwares", "FwList", "TokenRequest", "TokenResponse", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface UbiquitiFirmwareApi {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Error;", "", "", "statusCode", "", "error", "message", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Error;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Integer;", SnmpConfigurator.O_COMMUNITY, "()Ljava/lang/Integer;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Error {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer statusCode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String error;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        public Error(@g(name = "statusCode") Integer num, @g(name = "error") String str, @g(name = "message") String str2) {
            this.statusCode = num;
            this.error = str;
            this.message = str2;
        }

        /* renamed from: a, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* renamed from: b, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: c, reason: from getter */
        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public final Error copy(@g(name = "statusCode") Integer statusCode, @g(name = "error") String error, @g(name = "message") String message) {
            return new Error(statusCode, error, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return AbstractC6492s.d(this.statusCode, error.statusCode) && AbstractC6492s.d(this.error, error.error) && AbstractC6492s.d(this.message, error.message);
        }

        public int hashCode() {
            Integer num = this.statusCode;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.error;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.message;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Error(statusCode=" + this.statusCode + ", error=" + this.error + ", message=" + this.message + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Firmwares;", "", "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;", "fwList", "<init>", "(Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;)V", "copy", "(Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Firmwares;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;", "()Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Firmwares {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FwList fwList;

        public Firmwares(@g(name = "_embedded") FwList fwList) {
            this.fwList = fwList;
        }

        /* renamed from: a, reason: from getter */
        public final FwList getFwList() {
            return this.fwList;
        }

        public final Firmwares copy(@g(name = "_embedded") FwList fwList) {
            return new Firmwares(fwList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Firmwares) && AbstractC6492s.d(this.fwList, ((Firmwares) other).fwList);
        }

        public int hashCode() {
            FwList fwList = this.fwList;
            if (fwList == null) {
                return 0;
            }
            return fwList.hashCode();
        }

        public String toString() {
            return "Firmwares(fwList=" + this.fwList + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;", "", "", "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;", "fw", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", "()Ljava/util/List;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class FwList {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List fw;

        public FwList(@g(name = "firmware") List<ApiUbiquitiFirmware> list) {
            this.fw = list;
        }

        /* renamed from: a, reason: from getter */
        public final List getFw() {
            return this.fw;
        }

        public final FwList copy(@g(name = "firmware") List<ApiUbiquitiFirmware> fw) {
            return new FwList(fw);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FwList) && AbstractC6492s.d(this.fw, ((FwList) other).fw);
        }

        public int hashCode() {
            List list = this.fw;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "FwList(fw=" + this.fw + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;", "", "", "userId", "ubicAuth", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class TokenRequest {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String userId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ubicAuth;

        public TokenRequest(@g(name = "user_uuid") String userId, @g(name = "ubic_auth") String ubicAuth) {
            AbstractC6492s.i(userId, "userId");
            AbstractC6492s.i(ubicAuth, "ubicAuth");
            this.userId = userId;
            this.ubicAuth = ubicAuth;
        }

        /* renamed from: a, reason: from getter */
        public final String getUbicAuth() {
            return this.ubicAuth;
        }

        /* renamed from: b, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        public final TokenRequest copy(@g(name = "user_uuid") String userId, @g(name = "ubic_auth") String ubicAuth) {
            AbstractC6492s.i(userId, "userId");
            AbstractC6492s.i(ubicAuth, "ubicAuth");
            return new TokenRequest(userId, ubicAuth);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TokenRequest)) {
                return false;
            }
            TokenRequest tokenRequest = (TokenRequest) other;
            return AbstractC6492s.d(this.userId, tokenRequest.userId) && AbstractC6492s.d(this.ubicAuth, tokenRequest.ubicAuth);
        }

        public int hashCode() {
            return (this.userId.hashCode() * 31) + this.ubicAuth.hashCode();
        }

        public String toString() {
            return "TokenRequest(userId=" + this.userId + ", ubicAuth=" + this.ubicAuth + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenResponse;", "", "", "token", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class TokenResponse {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String token;

        public TokenResponse(@g(name = "token") String str) {
            this.token = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public final TokenResponse copy(@g(name = "token") String token) {
            return new TokenResponse(token);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TokenResponse) && AbstractC6492s.d(this.token, ((TokenResponse) other).token);
        }

        public int hashCode() {
            String str = this.token;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "TokenResponse(token=" + this.token + ")";
        }
    }

    public static abstract class a {

        /* renamed from: com.ui.wifiman.model.ubiquiti.firmware.api.UbiquitiFirmwareApi$a$a, reason: collision with other inner class name */
        public static final class C1502a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f43886a;

            /* renamed from: b, reason: collision with root package name */
            private final String f43887b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1502a(ApiUbiquitiFirmware.a channel) {
                super(null);
                AbstractC6492s.i(channel, "channel");
                this.f43886a = channel.getId();
                this.f43887b = "channel";
            }

            @Override // com.ui.wifiman.model.ubiquiti.firmware.api.UbiquitiFirmwareApi.a
            protected String a() {
                return this.f43887b;
            }

            @Override // com.ui.wifiman.model.ubiquiti.firmware.api.UbiquitiFirmwareApi.a
            protected String c() {
                return this.f43886a;
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f43888a;

            /* renamed from: b, reason: collision with root package name */
            private final String f43889b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String value) {
                super(null);
                AbstractC6492s.i(value, "value");
                this.f43888a = value;
                this.f43889b = "product";
            }

            @Override // com.ui.wifiman.model.ubiquiti.firmware.api.UbiquitiFirmwareApi.a
            protected String a() {
                return this.f43889b;
            }

            @Override // com.ui.wifiman.model.ubiquiti.firmware.api.UbiquitiFirmwareApi.a
            protected String c() {
                return this.f43888a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        protected abstract String a();

        public final String b() {
            return "eq~~" + a() + "~~" + c();
        }

        protected abstract String c();

        private a() {
        }
    }

    @o("api/v1/sso-token")
    z<TokenResponse> a(@Rj.a TokenRequest request);

    @f("api/firmware-latest")
    z<Firmwares> b(@Rj.i("Authorization") String token, @t("filter") List<String> filter);
}
