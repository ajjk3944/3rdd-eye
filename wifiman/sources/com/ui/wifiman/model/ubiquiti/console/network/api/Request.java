package com.ui.wifiman.model.ubiquiti.console.network.api;

import Y6.g;
import Y6.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"com/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Request", "", "", "clientID", "clientName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Request;", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Request;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* renamed from: com.ui.wifiman.model.ubiquiti.console.network.api.ApiUnifiConsoleTeleportAccess$Request, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class Request {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientID;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientName;

    public Request(@g(name = "client_id") String str, @g(name = "client_name") String str2) {
        this.clientID = str;
        this.clientName = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getClientID() {
        return this.clientID;
    }

    /* renamed from: b, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    public final Request copy(@g(name = "client_id") String clientID, @g(name = "client_name") String clientName) {
        return new Request(clientID, clientName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Request)) {
            return false;
        }
        Request request = (Request) other;
        return AbstractC6492s.d(this.clientID, request.clientID) && AbstractC6492s.d(this.clientName, request.clientName);
    }

    public int hashCode() {
        String str = this.clientID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Request(clientID=" + this.clientID + ", clientName=" + this.clientName + ")";
    }
}
