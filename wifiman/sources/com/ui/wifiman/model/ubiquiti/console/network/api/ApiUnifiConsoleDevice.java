package com.ui.wifiman.model.ubiquiti.console.network.api;

import Vd.a;
import Y6.g;
import Y6.i;
import h9.C5969a;
import inet.ipaddr.AddressStringException;
import inet.ipaddr.IncompatibleAddressException;
import inet.ipaddr.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJd\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u0013\u0010&\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010%R\u0013\u0010)\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010(R\u0011\u0010,\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b \u0010+¨\u0006-"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevice;", "", "", "id", "_ip", "_ipLan", "name", "_mac", "model", "", "_state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevice;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "g", SnmpConfigurator.O_COMMUNITY, "h", "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "i", "f", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "Lh9/a;", "()Lh9/a;", "mac", "Linet/ipaddr/g;", "()Linet/ipaddr/g;", GenericAddress.TYPE_IP, "LVd/a$a;", "()LVd/a$a;", "state", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ApiUnifiConsoleDevice {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String _ip;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String _ipLan;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String _mac;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String model;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer _state;

    public ApiUnifiConsoleDevice(@g(name = "_id") String str, @g(name = GenericAddress.TYPE_IP) String str2, @g(name = "lan_ip") String str3, @g(name = "name") String str4, @g(name = "mac") String str5, @g(name = "model") String str6, @g(name = "state") Integer num) {
        this.id = str;
        this._ip = str2;
        this._ipLan = str3;
        this.name = str4;
        this._mac = str5;
        this.model = str6;
        this._state = num;
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final inet.ipaddr.g b() {
        String str = this._ipLan;
        if (str == null) {
            str = this._ip;
        }
        if (str == null) {
            return null;
        }
        try {
            return new n(str).g();
        } catch (AddressStringException e10) {
            Z7.b.j("Failed to parse IP " + str, e10, null, 4, null);
            return null;
        } catch (IncompatibleAddressException e11) {
            Z7.b.j("Failed to parse IP " + str, e11, null, 4, null);
            return null;
        }
    }

    public final C5969a c() {
        String str = this._mac;
        if (str != null) {
            return C5969a.f48518b.e(str);
        }
        return null;
    }

    public final ApiUnifiConsoleDevice copy(@g(name = "_id") String id2, @g(name = GenericAddress.TYPE_IP) String _ip, @g(name = "lan_ip") String _ipLan, @g(name = "name") String name, @g(name = "mac") String _mac, @g(name = "model") String model, @g(name = "state") Integer _state) {
        return new ApiUnifiConsoleDevice(id2, _ip, _ipLan, name, _mac, model, _state);
    }

    /* renamed from: d, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiUnifiConsoleDevice)) {
            return false;
        }
        ApiUnifiConsoleDevice apiUnifiConsoleDevice = (ApiUnifiConsoleDevice) other;
        return AbstractC6492s.d(this.id, apiUnifiConsoleDevice.id) && AbstractC6492s.d(this._ip, apiUnifiConsoleDevice._ip) && AbstractC6492s.d(this._ipLan, apiUnifiConsoleDevice._ipLan) && AbstractC6492s.d(this.name, apiUnifiConsoleDevice.name) && AbstractC6492s.d(this._mac, apiUnifiConsoleDevice._mac) && AbstractC6492s.d(this.model, apiUnifiConsoleDevice.model) && AbstractC6492s.d(this._state, apiUnifiConsoleDevice._state);
    }

    public final a.EnumC0868a f() {
        Integer num = this._state;
        return (num != null && num.intValue() == 0) ? a.EnumC0868a.DISCONNECTED : (num != null && num.intValue() == 1) ? a.EnumC0868a.CONNECTED : (num != null && num.intValue() == 2) ? a.EnumC0868a.PENDING : (num != null && num.intValue() == 3) ? a.EnumC0868a.FIRMWARE_MISMATCH : (num != null && num.intValue() == 4) ? a.EnumC0868a.UPGRADING : (num != null && num.intValue() == 5) ? a.EnumC0868a.PROVISIONING : (num != null && num.intValue() == 6) ? a.EnumC0868a.HEARTBEAT_MISSED : (num != null && num.intValue() == 7) ? a.EnumC0868a.ADOPTING : (num != null && num.intValue() == 8) ? a.EnumC0868a.DELETING : (num != null && num.intValue() == 9) ? a.EnumC0868a.INFORM_ERROR : (num != null && num.intValue() == 10) ? a.EnumC0868a.ADOPTION_FAILED : (num != null && num.intValue() == 11) ? a.EnumC0868a.ISOLATED : (num != null && num.intValue() == 12) ? a.EnumC0868a.REMOVED : (num != null && num.intValue() == -1) ? a.EnumC0868a.UNKNOWN : a.EnumC0868a.UNKNOWN;
    }

    /* renamed from: g, reason: from getter */
    public final String get_ip() {
        return this._ip;
    }

    /* renamed from: h, reason: from getter */
    public final String get_ipLan() {
        return this._ipLan;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this._ip;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this._ipLan;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this._mac;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.model;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this._state;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String get_mac() {
        return this._mac;
    }

    /* renamed from: j, reason: from getter */
    public final Integer get_state() {
        return this._state;
    }

    public String toString() {
        return "ApiUnifiConsoleDevice(id=" + this.id + ", _ip=" + this._ip + ", _ipLan=" + this._ipLan + ", name=" + this.name + ", _mac=" + this._mac + ", model=" + this.model + ", _state=" + this._state + ")";
    }
}
