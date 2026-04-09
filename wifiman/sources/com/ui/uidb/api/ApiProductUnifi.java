package com.ui.uidb.api;

import Y6.g;
import Y6.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u0004\u0016\u0017\u0018\u0012B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/ui/uidb/api/ApiProductUnifi;", "", "Lcom/ui/uidb/api/ApiProductUnifi$Network;", "network", "<init>", "(Lcom/ui/uidb/api/ApiProductUnifi$Network;)V", "copy", "(Lcom/ui/uidb/api/ApiProductUnifi$Network;)Lcom/ui/uidb/api/ApiProductUnifi;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ui/uidb/api/ApiProductUnifi$Network;", "()Lcom/ui/uidb/api/ApiProductUnifi$Network;", SnmpConfigurator.O_BIND_ADDRESS, "Network", "BleService", "ShadowMode", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiProductUnifi {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Network network;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/ui/uidb/api/ApiProductUnifi$BleService;", "", "", "configured", "default", "Lcom/ui/uidb/api/ApiProductUnifi$BleService$Features;", "features", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ui/uidb/api/ApiProductUnifi$BleService$Features;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ui/uidb/api/ApiProductUnifi$BleService$Features;)Lcom/ui/uidb/api/ApiProductUnifi$BleService;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "Lcom/ui/uidb/api/ApiProductUnifi$BleService$Features;", "()Lcom/ui/uidb/api/ApiProductUnifi$BleService$Features;", "Features", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class BleService {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String configured;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String default;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Features features;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ui/uidb/api/ApiProductUnifi$BleService$Features;", "", "", "ucore", "<init>", "(Ljava/lang/Boolean;)V", "copy", "(Ljava/lang/Boolean;)Lcom/ui/uidb/api/ApiProductUnifi$BleService$Features;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @i(generateAdapter = true)
        public static final /* data */ class Features {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Boolean ucore;

            public Features(@g(name = "ucore") Boolean bool) {
                this.ucore = bool;
            }

            /* renamed from: a, reason: from getter */
            public final Boolean getUcore() {
                return this.ucore;
            }

            public final Features copy(@g(name = "ucore") Boolean ucore) {
                return new Features(ucore);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Features) && AbstractC6492s.d(this.ucore, ((Features) other).ucore);
            }

            public int hashCode() {
                Boolean bool = this.ucore;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            public String toString() {
                return "Features(ucore=" + this.ucore + ")";
            }
        }

        public BleService(@g(name = "configured") String str, @g(name = "default") String str2, @g(name = "features") Features features) {
            this.configured = str;
            this.default = str2;
            this.features = features;
        }

        /* renamed from: a, reason: from getter */
        public final String getConfigured() {
            return this.configured;
        }

        /* renamed from: b, reason: from getter */
        public final String getDefault() {
            return this.default;
        }

        /* renamed from: c, reason: from getter */
        public final Features getFeatures() {
            return this.features;
        }

        public final BleService copy(@g(name = "configured") String configured, @g(name = "default") String str, @g(name = "features") Features features) {
            return new BleService(configured, str, features);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BleService)) {
                return false;
            }
            BleService bleService = (BleService) other;
            return AbstractC6492s.d(this.configured, bleService.configured) && AbstractC6492s.d(this.default, bleService.default) && AbstractC6492s.d(this.features, bleService.features);
        }

        public int hashCode() {
            String str = this.configured;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.default;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Features features = this.features;
            return iHashCode2 + (features != null ? features.hashCode() : 0);
        }

        public String toString() {
            return "BleService(configured=" + this.configured + ", default=" + this.default + ", features=" + this.features + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lcom/ui/uidb/api/ApiProductUnifi$Network;", "", "", "Lcom/ui/uidb/api/ApiProductUnifi$BleService;", "bleServices", "", "type", "model", "Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;", "shadowMode", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;)V", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;)Lcom/ui/uidb/api/ApiProductUnifi$Network;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", "()Ljava/util/List;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "d", SnmpConfigurator.O_COMMUNITY, "Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;", "()Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Network {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List bleServices;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String model;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShadowMode shadowMode;

        public Network(@g(name = "bleServices") List<BleService> list, @g(name = "type") String str, @g(name = "model") String str2, @g(name = "shadowMode") ShadowMode shadowMode) {
            this.bleServices = list;
            this.type = str;
            this.model = str2;
            this.shadowMode = shadowMode;
        }

        /* renamed from: a, reason: from getter */
        public final List getBleServices() {
            return this.bleServices;
        }

        /* renamed from: b, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        /* renamed from: c, reason: from getter */
        public final ShadowMode getShadowMode() {
            return this.shadowMode;
        }

        public final Network copy(@g(name = "bleServices") List<BleService> bleServices, @g(name = "type") String type, @g(name = "model") String model, @g(name = "shadowMode") ShadowMode shadowMode) {
            return new Network(bleServices, type, model, shadowMode);
        }

        /* renamed from: d, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Network)) {
                return false;
            }
            Network network = (Network) other;
            return AbstractC6492s.d(this.bleServices, network.bleServices) && AbstractC6492s.d(this.type, network.type) && AbstractC6492s.d(this.model, network.model) && AbstractC6492s.d(this.shadowMode, network.shadowMode);
        }

        public int hashCode() {
            List list = this.bleServices;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.type;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.model;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ShadowMode shadowMode = this.shadowMode;
            return iHashCode3 + (shadowMode != null ? shadowMode.hashCode() : 0);
        }

        public String toString() {
            return "Network(bleServices=" + this.bleServices + ", type=" + this.type + ", model=" + this.model + ", shadowMode=" + this.shadowMode + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;", "", "", "interconnectPortNumber", "", "interconnectPortInterface", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Integer;", SnmpConfigurator.O_BIND_ADDRESS, "()Ljava/lang/Integer;", "Ljava/lang/String;", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class ShadowMode {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer interconnectPortNumber;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String interconnectPortInterface;

        public ShadowMode(@g(name = "interconnectPortNumber") Integer num, @g(name = "interconnectPortInterface") String str) {
            this.interconnectPortNumber = num;
            this.interconnectPortInterface = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getInterconnectPortInterface() {
            return this.interconnectPortInterface;
        }

        /* renamed from: b, reason: from getter */
        public final Integer getInterconnectPortNumber() {
            return this.interconnectPortNumber;
        }

        public final ShadowMode copy(@g(name = "interconnectPortNumber") Integer interconnectPortNumber, @g(name = "interconnectPortInterface") String interconnectPortInterface) {
            return new ShadowMode(interconnectPortNumber, interconnectPortInterface);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShadowMode)) {
                return false;
            }
            ShadowMode shadowMode = (ShadowMode) other;
            return AbstractC6492s.d(this.interconnectPortNumber, shadowMode.interconnectPortNumber) && AbstractC6492s.d(this.interconnectPortInterface, shadowMode.interconnectPortInterface);
        }

        public int hashCode() {
            Integer num = this.interconnectPortNumber;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.interconnectPortInterface;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ShadowMode(interconnectPortNumber=" + this.interconnectPortNumber + ", interconnectPortInterface=" + this.interconnectPortInterface + ")";
        }
    }

    public ApiProductUnifi(@g(name = "network") Network network) {
        this.network = network;
    }

    /* renamed from: a, reason: from getter */
    public final Network getNetwork() {
        return this.network;
    }

    public final ApiProductUnifi copy(@g(name = "network") Network network) {
        return new ApiProductUnifi(network);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiProductUnifi) && AbstractC6492s.d(this.network, ((ApiProductUnifi) other).network);
    }

    public int hashCode() {
        Network network = this.network;
        if (network == null) {
            return 0;
        }
        return network.hashCode();
    }

    public String toString() {
        return "ApiProductUnifi(network=" + this.network + ")";
    }
}
