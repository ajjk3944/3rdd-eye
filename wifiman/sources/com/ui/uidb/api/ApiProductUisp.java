package com.ui.uidb.api;

import Y6.g;
import Y6.i;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0003$%\u0018BI\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJR\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010\"¨\u0006&"}, d2 = {"Lcom/ui/uidb/api/ApiProductUisp;", "", "", "line", "", "legacyLookup", "Lcom/ui/uidb/api/ApiProductUisp$Firmware;", "fw", "", "Lcom/ui/uidb/api/ApiProductUisp$BleService;", "bleServices", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ui/uidb/api/ApiProductUisp$Firmware;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/ui/uidb/api/ApiProductUisp$Firmware;Ljava/util/Map;)Lcom/ui/uidb/api/ApiProductUisp;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "d", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/util/List;", SnmpConfigurator.O_COMMUNITY, "()Ljava/util/List;", "Lcom/ui/uidb/api/ApiProductUisp$Firmware;", "()Lcom/ui/uidb/api/ApiProductUisp$Firmware;", "Ljava/util/Map;", "()Ljava/util/Map;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Firmware", "BleService", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiProductUisp {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String line;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List legacyLookup;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Firmware fw;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map bleServices;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ui/uidb/api/ApiProductUisp$BleService;", "", "", "mode", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/ui/uidb/api/ApiProductUisp$BleService;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class BleService {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mode;

        public BleService(@g(name = "mode") String str) {
            this.mode = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        public final BleService copy(@g(name = "mode") String mode) {
            return new BleService(mode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BleService) && AbstractC6492s.d(this.mode, ((BleService) other).mode);
        }

        public int hashCode() {
            String str = this.mode;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "BleService(mode=" + this.mode + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ui/uidb/api/ApiProductUisp$Firmware;", "", "", "", "board", "platform", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/ui/uidb/api/ApiProductUisp$Firmware;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", "()Ljava/util/List;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Firmware {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List board;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String platform;

        public Firmware(@g(name = "board") List<String> list, @g(name = "platform") String str) {
            this.board = list;
            this.platform = str;
        }

        /* renamed from: a, reason: from getter */
        public final List getBoard() {
            return this.board;
        }

        /* renamed from: b, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        public final Firmware copy(@g(name = "board") List<String> board, @g(name = "platform") String platform) {
            return new Firmware(board, platform);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Firmware)) {
                return false;
            }
            Firmware firmware = (Firmware) other;
            return AbstractC6492s.d(this.board, firmware.board) && AbstractC6492s.d(this.platform, firmware.platform);
        }

        public int hashCode() {
            List list = this.board;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.platform;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Firmware(board=" + this.board + ", platform=" + this.platform + ")";
        }
    }

    public ApiProductUisp(@g(name = "line") String str, @g(name = "nameLegacy") List<String> list, @g(name = "firmware") Firmware firmware, @g(name = "bleServices") Map<String, BleService> map) {
        this.line = str;
        this.legacyLookup = list;
        this.fw = firmware;
        this.bleServices = map;
    }

    /* renamed from: a, reason: from getter */
    public final Map getBleServices() {
        return this.bleServices;
    }

    /* renamed from: b, reason: from getter */
    public final Firmware getFw() {
        return this.fw;
    }

    /* renamed from: c, reason: from getter */
    public final List getLegacyLookup() {
        return this.legacyLookup;
    }

    public final ApiProductUisp copy(@g(name = "line") String line, @g(name = "nameLegacy") List<String> legacyLookup, @g(name = "firmware") Firmware fw, @g(name = "bleServices") Map<String, BleService> bleServices) {
        return new ApiProductUisp(line, legacyLookup, fw, bleServices);
    }

    /* renamed from: d, reason: from getter */
    public final String getLine() {
        return this.line;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiProductUisp)) {
            return false;
        }
        ApiProductUisp apiProductUisp = (ApiProductUisp) other;
        return AbstractC6492s.d(this.line, apiProductUisp.line) && AbstractC6492s.d(this.legacyLookup, apiProductUisp.legacyLookup) && AbstractC6492s.d(this.fw, apiProductUisp.fw) && AbstractC6492s.d(this.bleServices, apiProductUisp.bleServices);
    }

    public int hashCode() {
        String str = this.line;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.legacyLookup;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Firmware firmware = this.fw;
        int iHashCode3 = (iHashCode2 + (firmware == null ? 0 : firmware.hashCode())) * 31;
        Map map = this.bleServices;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "ApiProductUisp(line=" + this.line + ", legacyLookup=" + this.legacyLookup + ", fw=" + this.fw + ", bleServices=" + this.bleServices + ")";
    }
}
