package com.ui.wifiman.model.ubiquiti.console.network.api;

import Y6.g;
import Y6.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification", "", "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;", "meta", "<init>", "(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;)V", "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification;", "copy", "(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;", "()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;", "Meta", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* renamed from: com.ui.wifiman.model.ubiquiti.console.network.api.ApiUnifiConsoleEvent$Companion$Identification, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class Identification {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Meta meta;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;", "", "", "resultCode", "type", "mac", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    /* renamed from: com.ui.wifiman.model.ubiquiti.console.network.api.ApiUnifiConsoleEvent$Companion$Identification$Meta, reason: from toString */
    public static final /* data */ class Meta {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String resultCode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mac;

        public Meta(@g(name = "rc") String str, @g(name = "message") String str2, @g(name = "mac") String str3) {
            this.resultCode = str;
            this.type = str2;
            this.mac = str3;
        }

        /* renamed from: a, reason: from getter */
        public final String getMac() {
            return this.mac;
        }

        /* renamed from: b, reason: from getter */
        public final String getResultCode() {
            return this.resultCode;
        }

        /* renamed from: c, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final Meta copy(@g(name = "rc") String resultCode, @g(name = "message") String type, @g(name = "mac") String mac) {
            return new Meta(resultCode, type, mac);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Meta)) {
                return false;
            }
            Meta meta = (Meta) other;
            return AbstractC6492s.d(this.resultCode, meta.resultCode) && AbstractC6492s.d(this.type, meta.type) && AbstractC6492s.d(this.mac, meta.mac);
        }

        public int hashCode() {
            String str = this.resultCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.type;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.mac;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Meta(resultCode=" + this.resultCode + ", type=" + this.type + ", mac=" + this.mac + ")";
        }
    }

    public Identification(@g(name = "meta") Meta meta) {
        this.meta = meta;
    }

    /* renamed from: a, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    public final Identification copy(@g(name = "meta") Meta meta) {
        return new Identification(meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Identification) && AbstractC6492s.d(this.meta, ((Identification) other).meta);
    }

    public int hashCode() {
        Meta meta = this.meta;
        if (meta == null) {
            return 0;
        }
        return meta.hashCode();
    }

    public String toString() {
        return "Identification(meta=" + this.meta + ")";
    }
}
