package com.ui.wifiman.model.ubiquiti.console.network.api;

import Y6.g;
import Y6.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevices;", "", "", "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevice;", "network", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevices;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", "()Ljava/util/List;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ApiUnifiConsoleDevices {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List network;

    public ApiUnifiConsoleDevices(@g(name = "network_devices") List<ApiUnifiConsoleDevice> list) {
        this.network = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getNetwork() {
        return this.network;
    }

    public final ApiUnifiConsoleDevices copy(@g(name = "network_devices") List<ApiUnifiConsoleDevice> network) {
        return new ApiUnifiConsoleDevices(network);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiUnifiConsoleDevices) && AbstractC6492s.d(this.network, ((ApiUnifiConsoleDevices) other).network);
    }

    public int hashCode() {
        List list = this.network;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "ApiUnifiConsoleDevices(network=" + this.network + ")";
    }
}
