package com.ubnt.teleport.unifi.cloud.api;

import Y6.g;
import Y6.i;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0005 !\"#$B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001d¨\u0006%"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;", "Lcom/ubnt/teleport/unifi/cloud/api/a;", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;", "reachability", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;", "metadata", "<init>", "(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;)V", "copy", "(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;", "()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;", "d", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;", SnmpConfigurator.O_BIND_ADDRESS, "()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;", "()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;", "state", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, SnmpConfigurator.O_AUTH_PROTOCOL, "Location", "Metadata", "Owner", "Reachability", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiTeleportSiteInfo extends a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Reachability reachability;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Metadata metadata;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;", "", "", "latitude", "longitude", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Location {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String latitude;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String longitude;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        public Location(@g(name = "lat") String str, @g(name = "long") String str2, @g(name = "text") String str3) {
            this.latitude = str;
            this.longitude = str2;
            this.text = str3;
        }

        /* renamed from: a, reason: from getter */
        public final String getLatitude() {
            return this.latitude;
        }

        /* renamed from: b, reason: from getter */
        public final String getLongitude() {
            return this.longitude;
        }

        /* renamed from: c, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Location copy(@g(name = "lat") String latitude, @g(name = "long") String longitude, @g(name = "text") String text) {
            return new Location(latitude, longitude, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Location)) {
                return false;
            }
            Location location = (Location) other;
            return AbstractC6492s.d(this.latitude, location.latitude) && AbstractC6492s.d(this.longitude, location.longitude) && AbstractC6492s.d(this.text, location.text);
        }

        public int hashCode() {
            String str = this.latitude;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.longitude;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.text;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Location(latitude=" + this.latitude + ", longitude=" + this.longitude + ", text=" + this.text + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J|\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b&\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b'\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b(\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b)\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b\"\u0010+¨\u0006,"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;", "", "", "imageEngine", "imageId", "", "imageIdUidb", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Owner;", "owner", "wanIP", "siteDeviceName", "siteNetworkName", "sku", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;", "location", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Owner;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;)V", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Owner;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Long;", "()Ljava/lang/Long;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "d", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Owner;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Owner;", "i", "f", "g", "h", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;", "()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Metadata {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long imageEngine;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long imageId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String imageIdUidb;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Owner owner;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String wanIP;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String siteDeviceName;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String siteNetworkName;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sku;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Location location;

        public Metadata(@g(name = "consoleFingerprintEngineId") Long l10, @g(name = "consoleDeviceIconId") Long l11, @g(name = "consoleUidbIconId") String str, @g(name = "owner") Owner owner, @g(name = "wanIp") String str2, @g(name = "name") String str3, @g(name = "localNetworkName") String str4, @g(name = "consoleType") String str5, @g(name = "location") Location location) {
            this.imageEngine = l10;
            this.imageId = l11;
            this.imageIdUidb = str;
            this.owner = owner;
            this.wanIP = str2;
            this.siteDeviceName = str3;
            this.siteNetworkName = str4;
            this.sku = str5;
            this.location = location;
        }

        /* renamed from: a, reason: from getter */
        public final Long getImageEngine() {
            return this.imageEngine;
        }

        /* renamed from: b, reason: from getter */
        public final Long getImageId() {
            return this.imageId;
        }

        /* renamed from: c, reason: from getter */
        public final String getImageIdUidb() {
            return this.imageIdUidb;
        }

        public final Metadata copy(@g(name = "consoleFingerprintEngineId") Long imageEngine, @g(name = "consoleDeviceIconId") Long imageId, @g(name = "consoleUidbIconId") String imageIdUidb, @g(name = "owner") Owner owner, @g(name = "wanIp") String wanIP, @g(name = "name") String siteDeviceName, @g(name = "localNetworkName") String siteNetworkName, @g(name = "consoleType") String sku, @g(name = "location") Location location) {
            return new Metadata(imageEngine, imageId, imageIdUidb, owner, wanIP, siteDeviceName, siteNetworkName, sku, location);
        }

        /* renamed from: d, reason: from getter */
        public final Location getLocation() {
            return this.location;
        }

        /* renamed from: e, reason: from getter */
        public final Owner getOwner() {
            return this.owner;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return AbstractC6492s.d(this.imageEngine, metadata.imageEngine) && AbstractC6492s.d(this.imageId, metadata.imageId) && AbstractC6492s.d(this.imageIdUidb, metadata.imageIdUidb) && AbstractC6492s.d(this.owner, metadata.owner) && AbstractC6492s.d(this.wanIP, metadata.wanIP) && AbstractC6492s.d(this.siteDeviceName, metadata.siteDeviceName) && AbstractC6492s.d(this.siteNetworkName, metadata.siteNetworkName) && AbstractC6492s.d(this.sku, metadata.sku) && AbstractC6492s.d(this.location, metadata.location);
        }

        /* renamed from: f, reason: from getter */
        public final String getSiteDeviceName() {
            return this.siteDeviceName;
        }

        /* renamed from: g, reason: from getter */
        public final String getSiteNetworkName() {
            return this.siteNetworkName;
        }

        /* renamed from: h, reason: from getter */
        public final String getSku() {
            return this.sku;
        }

        public int hashCode() {
            Long l10 = this.imageEngine;
            int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
            Long l11 = this.imageId;
            int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str = this.imageIdUidb;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Owner owner = this.owner;
            int iHashCode4 = (iHashCode3 + (owner == null ? 0 : owner.hashCode())) * 31;
            String str2 = this.wanIP;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.siteDeviceName;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.siteNetworkName;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.sku;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Location location = this.location;
            return iHashCode8 + (location != null ? location.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final String getWanIP() {
            return this.wanIP;
        }

        public String toString() {
            return "Metadata(imageEngine=" + this.imageEngine + ", imageId=" + this.imageId + ", imageIdUidb=" + this.imageIdUidb + ", owner=" + this.owner + ", wanIP=" + this.wanIP + ", siteDeviceName=" + this.siteDeviceName + ", siteNetworkName=" + this.siteNetworkName + ", sku=" + this.sku + ", location=" + this.location + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Owner;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Owner;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Owner {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        public Owner(@g(name = "full_name") String str) {
            this.name = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Owner copy(@g(name = "full_name") String name) {
            return new Owner(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Owner) && AbstractC6492s.d(this.name, ((Owner) other).name);
        }

        public int hashCode() {
            String str = this.name;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Owner(name=" + this.name + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;", "", "", "_state", "", "stateChangeTimestamp", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Long;", "()Ljava/lang/Long;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Reachability {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String _state;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long stateChangeTimestamp;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deviceId;

        public Reachability(@g(name = "state") String str, @g(name = "lastStateChangeTimestamp") Long l10, @g(name = "deviceId") String str2) {
            this._state = str;
            this.stateChangeTimestamp = l10;
            this.deviceId = str2;
        }

        /* renamed from: a, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        /* renamed from: b, reason: from getter */
        public final Long getStateChangeTimestamp() {
            return this.stateChangeTimestamp;
        }

        /* renamed from: c, reason: from getter */
        public final String get_state() {
            return this._state;
        }

        public final Reachability copy(@g(name = "state") String _state, @g(name = "lastStateChangeTimestamp") Long stateChangeTimestamp, @g(name = "deviceId") String deviceId) {
            return new Reachability(_state, stateChangeTimestamp, deviceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reachability)) {
                return false;
            }
            Reachability reachability = (Reachability) other;
            return AbstractC6492s.d(this._state, reachability._state) && AbstractC6492s.d(this.stateChangeTimestamp, reachability.stateChangeTimestamp) && AbstractC6492s.d(this.deviceId, reachability.deviceId);
        }

        public int hashCode() {
            String str = this._state;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l10 = this.stateChangeTimestamp;
            int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str2 = this.deviceId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Reachability(_state=" + this._state + ", stateChangeTimestamp=" + this.stateChangeTimestamp + ", deviceId=" + this.deviceId + ')';
        }
    }

    public ApiTeleportSiteInfo(@g(name = "connectionStateData") Reachability reachability, @g(name = "metadata") Metadata metadata) {
        this.reachability = reachability;
        this.metadata = metadata;
    }

    /* renamed from: b, reason: from getter */
    public final Metadata getMetadata() {
        return this.metadata;
    }

    /* renamed from: c, reason: from getter */
    public final Reachability getReachability() {
        return this.reachability;
    }

    public final ApiTeleportSiteInfo copy(@g(name = "connectionStateData") Reachability reachability, @g(name = "metadata") Metadata metadata) {
        return new ApiTeleportSiteInfo(reachability, metadata);
    }

    public final TeleportCloud.b.EnumC1254b d() {
        Reachability reachability = this.reachability;
        String str = reachability != null ? reachability.get_state() : null;
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2087582999) {
            if (str.equals("CONNECTED")) {
                return TeleportCloud.b.EnumC1254b.CONNECTED;
            }
            return null;
        }
        if (iHashCode == 776631060) {
            if (str.equals("UNSTABLE")) {
                return TeleportCloud.b.EnumC1254b.UNSTABLE;
            }
            return null;
        }
        if (iHashCode == 935892539 && str.equals("DISCONNECTED")) {
            return TeleportCloud.b.EnumC1254b.DISCONNECTED;
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiTeleportSiteInfo)) {
            return false;
        }
        ApiTeleportSiteInfo apiTeleportSiteInfo = (ApiTeleportSiteInfo) other;
        return AbstractC6492s.d(this.reachability, apiTeleportSiteInfo.reachability) && AbstractC6492s.d(this.metadata, apiTeleportSiteInfo.metadata);
    }

    public int hashCode() {
        Reachability reachability = this.reachability;
        int iHashCode = (reachability == null ? 0 : reachability.hashCode()) * 31;
        Metadata metadata = this.metadata;
        return iHashCode + (metadata != null ? metadata.hashCode() : 0);
    }

    public String toString() {
        return "ApiTeleportSiteInfo(reachability=" + this.reachability + ", metadata=" + this.metadata + ')';
    }
}
