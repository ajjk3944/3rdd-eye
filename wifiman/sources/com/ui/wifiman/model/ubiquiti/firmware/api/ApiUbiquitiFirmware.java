package com.ui.wifiman.model.ubiquiti.firmware.api;

import Y6.g;
import Y6.i;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001:\u000312\u001eB\u0097\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J \u0001\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\u001e\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b#\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b!\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b(\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b,\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b'\u00100¨\u00063"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;", "", "", "id", "channel", "createdTimestamp", "product", "", "fileSize", "checksum", "version", "", "versionMajor", "versionMinor", "versionPatch", "versionPrerelease", "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;", "links", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "d", "g", "Ljava/lang/Long;", "()Ljava/lang/Long;", "f", "h", "Ljava/lang/Integer;", "i", "()Ljava/lang/Integer;", "j", "k", "l", "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;", "()Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;", "Links", "Link", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ApiUbiquitiFirmware {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String channel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String createdTimestamp;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String product;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long fileSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String checksum;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String version;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer versionMajor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer versionMinor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer versionPatch;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String versionPrerelease;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Links links;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;", "", "", "url", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Link {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        public Link(@g(name = "href") String str) {
            this.url = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Link copy(@g(name = "href") String url) {
            return new Link(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Link) && AbstractC6492s.d(this.url, ((Link) other).url);
        }

        public int hashCode() {
            String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Link(url=" + this.url + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;", "", "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;", "data", "<init>", "(Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;)V", "copy", "(Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;", "()Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Links {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Link data;

        public Links(@g(name = "data") Link link) {
            this.data = link;
        }

        /* renamed from: a, reason: from getter */
        public final Link getData() {
            return this.data;
        }

        public final Links copy(@g(name = "data") Link data) {
            return new Links(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Links) && AbstractC6492s.d(this.data, ((Links) other).data);
        }

        public int hashCode() {
            Link link = this.data;
            if (link == null) {
                return 0;
            }
            return link.hashCode();
        }

        public String toString() {
            return "Links(data=" + this.data + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        /* renamed from: id, reason: collision with root package name */
        private final String f43868id;
        public static final a RELEASE = new a("RELEASE", 0, "release");
        public static final a BETA = new a("BETA", 1, "beta-public");
        public static final a INTERNAL = new a("INTERNAL", 2, "internal");

        private static final /* synthetic */ a[] $values() {
            return new a[]{RELEASE, BETA, INTERNAL};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, String str2) {
            this.f43868id = str2;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final String getId() {
            return this.f43868id;
        }
    }

    public ApiUbiquitiFirmware(@g(name = "id") String str, @g(name = "channel") String str2, @g(name = "created") String str3, @g(name = "product") String str4, @g(name = "file_size") Long l10, @g(name = "sha256_checksum") String str5, @g(name = "version") String str6, @g(name = "version_major") Integer num, @g(name = "version_minor") Integer num2, @g(name = "version_patch") Integer num3, @g(name = "version_prerelease") String str7, @g(name = "_links") Links links) {
        this.id = str;
        this.channel = str2;
        this.createdTimestamp = str3;
        this.product = str4;
        this.fileSize = l10;
        this.checksum = str5;
        this.version = str6;
        this.versionMajor = num;
        this.versionMinor = num2;
        this.versionPatch = num3;
        this.versionPrerelease = str7;
        this.links = links;
    }

    /* renamed from: a, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* renamed from: b, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    /* renamed from: c, reason: from getter */
    public final String getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public final ApiUbiquitiFirmware copy(@g(name = "id") String id2, @g(name = "channel") String channel, @g(name = "created") String createdTimestamp, @g(name = "product") String product, @g(name = "file_size") Long fileSize, @g(name = "sha256_checksum") String checksum, @g(name = "version") String version, @g(name = "version_major") Integer versionMajor, @g(name = "version_minor") Integer versionMinor, @g(name = "version_patch") Integer versionPatch, @g(name = "version_prerelease") String versionPrerelease, @g(name = "_links") Links links) {
        return new ApiUbiquitiFirmware(id2, channel, createdTimestamp, product, fileSize, checksum, version, versionMajor, versionMinor, versionPatch, versionPrerelease, links);
    }

    /* renamed from: d, reason: from getter */
    public final Long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiUbiquitiFirmware)) {
            return false;
        }
        ApiUbiquitiFirmware apiUbiquitiFirmware = (ApiUbiquitiFirmware) other;
        return AbstractC6492s.d(this.id, apiUbiquitiFirmware.id) && AbstractC6492s.d(this.channel, apiUbiquitiFirmware.channel) && AbstractC6492s.d(this.createdTimestamp, apiUbiquitiFirmware.createdTimestamp) && AbstractC6492s.d(this.product, apiUbiquitiFirmware.product) && AbstractC6492s.d(this.fileSize, apiUbiquitiFirmware.fileSize) && AbstractC6492s.d(this.checksum, apiUbiquitiFirmware.checksum) && AbstractC6492s.d(this.version, apiUbiquitiFirmware.version) && AbstractC6492s.d(this.versionMajor, apiUbiquitiFirmware.versionMajor) && AbstractC6492s.d(this.versionMinor, apiUbiquitiFirmware.versionMinor) && AbstractC6492s.d(this.versionPatch, apiUbiquitiFirmware.versionPatch) && AbstractC6492s.d(this.versionPrerelease, apiUbiquitiFirmware.versionPrerelease) && AbstractC6492s.d(this.links, apiUbiquitiFirmware.links);
    }

    /* renamed from: f, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    /* renamed from: g, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* renamed from: h, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.createdTimestamp;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.product;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l10 = this.fileSize;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str5 = this.checksum;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.version;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.versionMajor;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.versionMinor;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.versionPatch;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.versionPrerelease;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Links links = this.links;
        return iHashCode11 + (links != null ? links.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final Integer getVersionMajor() {
        return this.versionMajor;
    }

    /* renamed from: j, reason: from getter */
    public final Integer getVersionMinor() {
        return this.versionMinor;
    }

    /* renamed from: k, reason: from getter */
    public final Integer getVersionPatch() {
        return this.versionPatch;
    }

    /* renamed from: l, reason: from getter */
    public final String getVersionPrerelease() {
        return this.versionPrerelease;
    }

    public String toString() {
        return "ApiUbiquitiFirmware(id=" + this.id + ", channel=" + this.channel + ", createdTimestamp=" + this.createdTimestamp + ", product=" + this.product + ", fileSize=" + this.fileSize + ", checksum=" + this.checksum + ", version=" + this.version + ", versionMajor=" + this.versionMajor + ", versionMinor=" + this.versionMinor + ", versionPatch=" + this.versionPatch + ", versionPrerelease=" + this.versionPrerelease + ", links=" + this.links + ")";
    }
}
