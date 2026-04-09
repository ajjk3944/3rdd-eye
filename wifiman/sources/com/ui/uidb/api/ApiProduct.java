package com.ui.uidb.api;

import Y6.g;
import Y6.i;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;
import org.webrtc.MediaStreamTrack;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b.\b\u0081\b\u0018\u0000 L2\u00020\u0001:\u0005MNOP)B\u0083\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0016\b\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0001\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u008c\u0002\u0010\u001f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0016\b\u0003\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0016\b\u0003\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b4\u0010\"R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u00106\u001a\u0004\b8\u00107R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b9\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b.\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b;\u0010E\u001a\u0004\b)\u0010FR\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b4\u0010:\u001a\u0004\bA\u0010<R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bC\u0010:\u001a\u0004\b0\u0010<R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b?\u0010G\u001a\u0004\b,\u0010HR%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b=\u00107R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bI\u0010K¨\u0006Q"}, d2 = {"Lcom/ui/uidb/api/ApiProduct;", "", "", "id", "Lcom/ui/uidb/api/ApiProduct$Names;", "names", "Lcom/ui/uidb/api/ApiProduct$Line;", "line", "type", "", "image", MediaStreamTrack.VIDEO_TRACK_KIND, "", "systemIds", "Lcom/ui/uidb/api/ApiProduct$Triplet;", "lookupTriplets", "Lcom/ui/uidb/api/ApiProductUnifi;", "unifi", "Lcom/ui/uidb/api/ApiProductUisp;", "uisp", "Lcom/ui/uidb/api/ApiProduct$Btle;", "btle", "shortnames", "guids", "Lcom/ui/uidb/api/ApiProductCompliance;", "compliance", "minAdoptVersion", "", "isArSupported", "<init>", "(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct$Names;Lcom/ui/uidb/api/ApiProduct$Line;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductUnifi;Lcom/ui/uidb/api/ApiProductUisp;Lcom/ui/uidb/api/ApiProduct$Btle;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductCompliance;Ljava/util/Map;Ljava/lang/Boolean;)V", "copy", "(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct$Names;Lcom/ui/uidb/api/ApiProduct$Line;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductUnifi;Lcom/ui/uidb/api/ApiProductUisp;Lcom/ui/uidb/api/ApiProduct$Btle;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductCompliance;Ljava/util/Map;Ljava/lang/Boolean;)Lcom/ui/uidb/api/ApiProduct;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "d", SnmpConfigurator.O_BIND_ADDRESS, "Lcom/ui/uidb/api/ApiProduct$Names;", "i", "()Lcom/ui/uidb/api/ApiProduct$Names;", SnmpConfigurator.O_COMMUNITY, "Lcom/ui/uidb/api/ApiProduct$Line;", "f", "()Lcom/ui/uidb/api/ApiProduct$Line;", "l", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/util/Map;", "()Ljava/util/Map;", SnmpConfigurator.O_OPERATION, "g", "Ljava/util/List;", "k", "()Ljava/util/List;", "h", "Lcom/ui/uidb/api/ApiProductUnifi;", SnmpConfigurator.O_CONTEXT_NAME, "()Lcom/ui/uidb/api/ApiProductUnifi;", "j", "Lcom/ui/uidb/api/ApiProductUisp;", "m", "()Lcom/ui/uidb/api/ApiProductUisp;", "Lcom/ui/uidb/api/ApiProduct$Btle;", "()Lcom/ui/uidb/api/ApiProduct$Btle;", "Lcom/ui/uidb/api/ApiProductCompliance;", "()Lcom/ui/uidb/api/ApiProductCompliance;", "p", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "q", "Names", "Line", "Triplet", "Btle", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiProduct {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Names names;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Line line;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map image;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map video;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List systemIds;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List lookupTriplets;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final ApiProductUnifi unifi;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final ApiProductUisp uisp;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Btle btle;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final List shortnames;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final List guids;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final ApiProductCompliance compliance;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map minAdoptVersion;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isArSupported;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ui/uidb/api/ApiProduct$Btle;", "", "", "factory", "configured", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ui/uidb/api/ApiProduct$Btle;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Btle {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String factory;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String configured;

        public Btle(@g(name = "factoryDefault") String str, @g(name = "userConfigured") String str2) {
            this.factory = str;
            this.configured = str2;
        }

        /* renamed from: a, reason: from getter */
        public final String getConfigured() {
            return this.configured;
        }

        /* renamed from: b, reason: from getter */
        public final String getFactory() {
            return this.factory;
        }

        public final Btle copy(@g(name = "factoryDefault") String factory, @g(name = "userConfigured") String configured) {
            return new Btle(factory, configured);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Btle)) {
                return false;
            }
            Btle btle = (Btle) other;
            return AbstractC6492s.d(this.factory, btle.factory) && AbstractC6492s.d(this.configured, btle.configured);
        }

        public int hashCode() {
            String str = this.factory;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.configured;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Btle(factory=" + this.factory + ", configured=" + this.configured + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ui/uidb/api/ApiProduct$Line;", "", "", "id", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ui/uidb/api/ApiProduct$Line;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Line {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        public Line(@g(name = "id") String str, @g(name = "name") String str2) {
            this.id = str;
            this.name = str2;
        }

        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Line copy(@g(name = "id") String id2, @g(name = "name") String name) {
            return new Line(id2, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Line)) {
                return false;
            }
            Line line = (Line) other;
            return AbstractC6492s.d(this.id, line.id) && AbstractC6492s.d(this.name, line.name);
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Line(id=" + this.id + ", name=" + this.name + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ui/uidb/api/ApiProduct$Names;", "", "", "name", "nameAbbreviated", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ui/uidb/api/ApiProduct$Names;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Names {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nameAbbreviated;

        public Names(@g(name = "name") String str, @g(name = "abbrev") String str2) {
            this.name = str;
            this.nameAbbreviated = str2;
        }

        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: b, reason: from getter */
        public final String getNameAbbreviated() {
            return this.nameAbbreviated;
        }

        public final Names copy(@g(name = "name") String name, @g(name = "abbrev") String nameAbbreviated) {
            return new Names(name, nameAbbreviated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Names)) {
                return false;
            }
            Names names = (Names) other;
            return AbstractC6492s.d(this.name, names.name) && AbstractC6492s.d(this.nameAbbreviated, names.nameAbbreviated);
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.nameAbbreviated;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Names(name=" + this.name + ", nameAbbreviated=" + this.nameAbbreviated + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ui/uidb/api/ApiProduct$Triplet;", "", "", "modelV1", "productName", "modelV2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ui/uidb/api/ApiProduct$Triplet;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Triplet {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String modelV1;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String modelV2;

        public Triplet(@g(name = "k1") String str, @g(name = "k2") String str2, @g(name = "k3") String str3) {
            this.modelV1 = str;
            this.productName = str2;
            this.modelV2 = str3;
        }

        /* renamed from: a, reason: from getter */
        public final String getModelV1() {
            return this.modelV1;
        }

        /* renamed from: b, reason: from getter */
        public final String getModelV2() {
            return this.modelV2;
        }

        /* renamed from: c, reason: from getter */
        public final String getProductName() {
            return this.productName;
        }

        public final Triplet copy(@g(name = "k1") String modelV1, @g(name = "k2") String productName, @g(name = "k3") String modelV2) {
            return new Triplet(modelV1, productName, modelV2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Triplet)) {
                return false;
            }
            Triplet triplet = (Triplet) other;
            return AbstractC6492s.d(this.modelV1, triplet.modelV1) && AbstractC6492s.d(this.productName, triplet.productName) && AbstractC6492s.d(this.modelV2, triplet.modelV2);
        }

        public int hashCode() {
            String str = this.modelV1;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.productName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.modelV2;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Triplet(modelV1=" + this.modelV1 + ", productName=" + this.productName + ", modelV2=" + this.modelV2 + ")";
        }
    }

    public ApiProduct(@g(name = "id") String str, @g(name = "product") Names names, @g(name = "line") Line line, @g(name = "deviceType") String str2, @g(name = "images") Map<String, String> map, @g(name = "videos") Map<String, String> map2, @g(name = "sysids") List<String> list, @g(name = "triplets") List<Triplet> list2, @g(name = "unifi") ApiProductUnifi apiProductUnifi, @g(name = "uisp") ApiProductUisp apiProductUisp, @g(name = "btle") Btle btle, @g(name = "shortnames") List<String> list3, @g(name = "guids") List<String> list4, @g(name = "compliance") ApiProductCompliance apiProductCompliance, @g(name = "minAdoptVersion") Map<String, String> map3, @g(name = "isARSupported") Boolean bool) {
        this.id = str;
        this.names = names;
        this.line = line;
        this.type = str2;
        this.image = map;
        this.video = map2;
        this.systemIds = list;
        this.lookupTriplets = list2;
        this.unifi = apiProductUnifi;
        this.uisp = apiProductUisp;
        this.btle = btle;
        this.shortnames = list3;
        this.guids = list4;
        this.compliance = apiProductCompliance;
        this.minAdoptVersion = map3;
        this.isArSupported = bool;
    }

    /* renamed from: a, reason: from getter */
    public final Btle getBtle() {
        return this.btle;
    }

    /* renamed from: b, reason: from getter */
    public final ApiProductCompliance getCompliance() {
        return this.compliance;
    }

    /* renamed from: c, reason: from getter */
    public final List getGuids() {
        return this.guids;
    }

    public final ApiProduct copy(@g(name = "id") String id2, @g(name = "product") Names names, @g(name = "line") Line line, @g(name = "deviceType") String type, @g(name = "images") Map<String, String> image, @g(name = "videos") Map<String, String> video, @g(name = "sysids") List<String> systemIds, @g(name = "triplets") List<Triplet> lookupTriplets, @g(name = "unifi") ApiProductUnifi unifi, @g(name = "uisp") ApiProductUisp uisp, @g(name = "btle") Btle btle, @g(name = "shortnames") List<String> shortnames, @g(name = "guids") List<String> guids, @g(name = "compliance") ApiProductCompliance compliance, @g(name = "minAdoptVersion") Map<String, String> minAdoptVersion, @g(name = "isARSupported") Boolean isArSupported) {
        return new ApiProduct(id2, names, line, type, image, video, systemIds, lookupTriplets, unifi, uisp, btle, shortnames, guids, compliance, minAdoptVersion, isArSupported);
    }

    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final Map getImage() {
        return this.image;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiProduct)) {
            return false;
        }
        ApiProduct apiProduct = (ApiProduct) other;
        return AbstractC6492s.d(this.id, apiProduct.id) && AbstractC6492s.d(this.names, apiProduct.names) && AbstractC6492s.d(this.line, apiProduct.line) && AbstractC6492s.d(this.type, apiProduct.type) && AbstractC6492s.d(this.image, apiProduct.image) && AbstractC6492s.d(this.video, apiProduct.video) && AbstractC6492s.d(this.systemIds, apiProduct.systemIds) && AbstractC6492s.d(this.lookupTriplets, apiProduct.lookupTriplets) && AbstractC6492s.d(this.unifi, apiProduct.unifi) && AbstractC6492s.d(this.uisp, apiProduct.uisp) && AbstractC6492s.d(this.btle, apiProduct.btle) && AbstractC6492s.d(this.shortnames, apiProduct.shortnames) && AbstractC6492s.d(this.guids, apiProduct.guids) && AbstractC6492s.d(this.compliance, apiProduct.compliance) && AbstractC6492s.d(this.minAdoptVersion, apiProduct.minAdoptVersion) && AbstractC6492s.d(this.isArSupported, apiProduct.isArSupported);
    }

    /* renamed from: f, reason: from getter */
    public final Line getLine() {
        return this.line;
    }

    /* renamed from: g, reason: from getter */
    public final List getLookupTriplets() {
        return this.lookupTriplets;
    }

    /* renamed from: h, reason: from getter */
    public final Map getMinAdoptVersion() {
        return this.minAdoptVersion;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Names names = this.names;
        int iHashCode2 = (iHashCode + (names == null ? 0 : names.hashCode())) * 31;
        Line line = this.line;
        int iHashCode3 = (iHashCode2 + (line == null ? 0 : line.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.image;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.video;
        int iHashCode6 = (iHashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31;
        List list = this.systemIds;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.lookupTriplets;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ApiProductUnifi apiProductUnifi = this.unifi;
        int iHashCode9 = (iHashCode8 + (apiProductUnifi == null ? 0 : apiProductUnifi.hashCode())) * 31;
        ApiProductUisp apiProductUisp = this.uisp;
        int iHashCode10 = (iHashCode9 + (apiProductUisp == null ? 0 : apiProductUisp.hashCode())) * 31;
        Btle btle = this.btle;
        int iHashCode11 = (iHashCode10 + (btle == null ? 0 : btle.hashCode())) * 31;
        List list3 = this.shortnames;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.guids;
        int iHashCode13 = (iHashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
        ApiProductCompliance apiProductCompliance = this.compliance;
        int iHashCode14 = (iHashCode13 + (apiProductCompliance == null ? 0 : apiProductCompliance.hashCode())) * 31;
        Map map3 = this.minAdoptVersion;
        int iHashCode15 = (iHashCode14 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Boolean bool = this.isArSupported;
        return iHashCode15 + (bool != null ? bool.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final Names getNames() {
        return this.names;
    }

    /* renamed from: j, reason: from getter */
    public final List getShortnames() {
        return this.shortnames;
    }

    /* renamed from: k, reason: from getter */
    public final List getSystemIds() {
        return this.systemIds;
    }

    /* renamed from: l, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: m, reason: from getter */
    public final ApiProductUisp getUisp() {
        return this.uisp;
    }

    /* renamed from: n, reason: from getter */
    public final ApiProductUnifi getUnifi() {
        return this.unifi;
    }

    /* renamed from: o, reason: from getter */
    public final Map getVideo() {
        return this.video;
    }

    /* renamed from: p, reason: from getter */
    public final Boolean getIsArSupported() {
        return this.isArSupported;
    }

    public String toString() {
        return "ApiProduct(id=" + this.id + ", names=" + this.names + ", line=" + this.line + ", type=" + this.type + ", image=" + this.image + ", video=" + this.video + ", systemIds=" + this.systemIds + ", lookupTriplets=" + this.lookupTriplets + ", unifi=" + this.unifi + ", uisp=" + this.uisp + ", btle=" + this.btle + ", shortnames=" + this.shortnames + ", guids=" + this.guids + ", compliance=" + this.compliance + ", minAdoptVersion=" + this.minAdoptVersion + ", isArSupported=" + this.isArSupported + ")";
    }
}
