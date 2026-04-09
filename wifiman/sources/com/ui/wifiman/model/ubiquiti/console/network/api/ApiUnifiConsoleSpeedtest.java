package com.ui.wifiman.model.ubiquiti.console.network.api;

import Y6.g;
import Y6.i;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public final class ApiUnifiConsoleSpeedtest {

    /* renamed from: a, reason: collision with root package name */
    public static final ApiUnifiConsoleSpeedtest f43776a = new ApiUnifiConsoleSpeedtest();

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\b\u0081\b\u0018\u00002\u00020\u0001:\u0003JK%B\u0097\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J \u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b1\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b-\u0010<R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b/\u0010<R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b=\u0010@R\u0019\u0010C\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b6\u0010A\u001a\u0004\b4\u0010BR\u0019\u0010D\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b'\u0010A\u001a\u0004\b2\u0010BR\u0019\u0010E\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b0\u0010A\u001a\u0004\b:\u0010BR\u0019\u0010F\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b.\u0010A\u001a\u0004\b8\u0010BR\u0013\u0010G\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0013\u0010H\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b%\u00107R\u0013\u0010I\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b>\u00107¨\u0006L"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;", "Lcom/ui/wifiman/model/ubiquiti/console/network/api/a;", "", "_latencyMs", "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;", "server", "_statusLatency", "_statusDownload", "_statusUpload", "_statusSummary", "", "_downloadMbps", "_uploadMbps", "", "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;", "progressDownload", "progressUpload", "", "timestamp", "<init>", "(Ljava/lang/Integer;Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V", "id", "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;", "s", "(Ljava/lang/Integer;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;", "copy", "(Ljava/lang/Integer;Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", SnmpConfigurator.O_BIND_ADDRESS, "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;", SnmpConfigurator.O_COMMUNITY, SnmpConfigurator.O_OPERATION, "d", SnmpConfigurator.O_CONTEXT_NAME, "q", "f", "p", "g", "Ljava/lang/Double;", "l", "()Ljava/lang/Double;", "h", SnmpConfigurator.O_RETRIES, "i", "Ljava/util/List;", "()Ljava/util/List;", "j", "k", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;", "()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;", "statusLatency", "statusDownload", "statusUpload", "statusSummary", "latencyMs", "downloadMbps", "uploadMbps", "Server", "Progress", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class State implements com.ui.wifiman.model.ubiquiti.console.network.api.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer _latencyMs;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Server server;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer _statusLatency;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer _statusDownload;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer _statusUpload;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer _statusSummary;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double _downloadMbps;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double _uploadMbps;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final List progressDownload;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final List progressUpload;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long timestamp;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final a statusLatency;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final a statusDownload;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final a statusUpload;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final a statusSummary;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;", "", "", "id", "", "", "records", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/util/List;", "()Ljava/util/List;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @i(generateAdapter = true)
        public static final /* data */ class Progress {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer id;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List records;

            public Progress(@g(name = "id") Integer num, @g(name = "records") List<? extends List<Long>> list) {
                this.id = num;
                this.records = list;
            }

            /* renamed from: a, reason: from getter */
            public final Integer getId() {
                return this.id;
            }

            /* renamed from: b, reason: from getter */
            public final List getRecords() {
                return this.records;
            }

            public final Progress copy(@g(name = "id") Integer id2, @g(name = "records") List<? extends List<Long>> records) {
                return new Progress(id2, records);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Progress)) {
                    return false;
                }
                Progress progress = (Progress) other;
                return AbstractC6492s.d(this.id, progress.id) && AbstractC6492s.d(this.records, progress.records);
            }

            public int hashCode() {
                Integer num = this.id;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                List list = this.records;
                return iHashCode + (list != null ? list.hashCode() : 0);
            }

            public String toString() {
                return "Progress(id=" + this.id + ", records=" + this.records + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJX\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b \u0010\u000fR\u0013\u0010!\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;", "", "", "countryCode", "city", "", "latitude", "longitude", "_provider", "providerUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "Ljava/lang/Float;", "()Ljava/lang/Float;", "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "g", "f", "provider", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @i(generateAdapter = true)
        public static final /* data */ class Server {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String countryCode;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String city;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Float latitude;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Float longitude;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String _provider;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final String providerUrl;

            public Server(@g(name = "cc") String str, @g(name = "city") String str2, @g(name = "lat") Float f10, @g(name = "lon") Float f11, @g(name = "provider") String str3, @g(name = "provider_url") String str4) {
                this.countryCode = str;
                this.city = str2;
                this.latitude = f10;
                this.longitude = f11;
                this._provider = str3;
                this.providerUrl = str4;
            }

            /* renamed from: a, reason: from getter */
            public final String getCity() {
                return this.city;
            }

            /* renamed from: b, reason: from getter */
            public final String getCountryCode() {
                return this.countryCode;
            }

            /* renamed from: c, reason: from getter */
            public final Float getLatitude() {
                return this.latitude;
            }

            public final Server copy(@g(name = "cc") String countryCode, @g(name = "city") String city, @g(name = "lat") Float latitude, @g(name = "lon") Float longitude, @g(name = "provider") String _provider, @g(name = "provider_url") String providerUrl) {
                return new Server(countryCode, city, latitude, longitude, _provider, providerUrl);
            }

            /* renamed from: d, reason: from getter */
            public final Float getLongitude() {
                return this.longitude;
            }

            public final String e() {
                String str = this._provider;
                if (str == null || t.m0(str)) {
                    return null;
                }
                return str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Server)) {
                    return false;
                }
                Server server = (Server) other;
                return AbstractC6492s.d(this.countryCode, server.countryCode) && AbstractC6492s.d(this.city, server.city) && AbstractC6492s.d(this.latitude, server.latitude) && AbstractC6492s.d(this.longitude, server.longitude) && AbstractC6492s.d(this._provider, server._provider) && AbstractC6492s.d(this.providerUrl, server.providerUrl);
            }

            /* renamed from: f, reason: from getter */
            public final String getProviderUrl() {
                return this.providerUrl;
            }

            /* renamed from: g, reason: from getter */
            public final String get_provider() {
                return this._provider;
            }

            public int hashCode() {
                String str = this.countryCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.city;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Float f10 = this.latitude;
                int iHashCode3 = (iHashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
                Float f11 = this.longitude;
                int iHashCode4 = (iHashCode3 + (f11 == null ? 0 : f11.hashCode())) * 31;
                String str3 = this._provider;
                int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.providerUrl;
                return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                return "Server(countryCode=" + this.countryCode + ", city=" + this.city + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", _provider=" + this._provider + ", providerUrl=" + this.providerUrl + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            private static final /* synthetic */ InterfaceC5826a $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;

            /* renamed from: id, reason: collision with root package name */
            private final int f43800id;
            public static final a PENDING = new a("PENDING", 0, 0);
            public static final a IN_PROGRESS = new a("IN_PROGRESS", 1, 1);
            public static final a COMPLETED = new a("COMPLETED", 2, 2);

            private static final /* synthetic */ a[] $values() {
                return new a[]{PENDING, IN_PROGRESS, COMPLETED};
            }

            static {
                a[] aVarArr$values = $values();
                $VALUES = aVarArr$values;
                $ENTRIES = AbstractC5827b.a(aVarArr$values);
            }

            private a(String str, int i10, int i11) {
                this.f43800id = i11;
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

            public final int getId() {
                return this.f43800id;
            }
        }

        public State(@g(name = "latency") Integer num, @g(name = "server") Server server, @g(name = "status_ping") Integer num2, @g(name = "status_download") Integer num3, @g(name = "status_upload") Integer num4, @g(name = "status_summary") Integer num5, @g(name = "xput_download") Double d10, @g(name = "xput_upload") Double d11, @g(name = "download-progress") List<Progress> list, @g(name = "upload-progress") List<Progress> list2, @g(name = "timestamp") Long l10) {
            this._latencyMs = num;
            this.server = server;
            this._statusLatency = num2;
            this._statusDownload = num3;
            this._statusUpload = num4;
            this._statusSummary = num5;
            this._downloadMbps = d10;
            this._uploadMbps = d11;
            this.progressDownload = list;
            this.progressUpload = list2;
            this.timestamp = l10;
            this.statusLatency = s(num2);
            this.statusDownload = s(num3);
            this.statusUpload = s(num4);
            this.statusSummary = s(num5);
        }

        private final a s(Integer id2) {
            a aVar = a.PENDING;
            int id3 = aVar.getId();
            if (id2 != null && id2.intValue() == id3) {
                return aVar;
            }
            a aVar2 = a.IN_PROGRESS;
            int id4 = aVar2.getId();
            if (id2 != null && id2.intValue() == id4) {
                return aVar2;
            }
            a aVar3 = a.COMPLETED;
            int id5 = aVar3.getId();
            if (id2 != null && id2.intValue() == id5) {
                return aVar3;
            }
            return null;
        }

        public final Double a() {
            Double d10 = this._downloadMbps;
            if (d10 == null || d10.doubleValue() <= 0.0d) {
                return null;
            }
            return d10;
        }

        public final Integer b() {
            Integer num = this._latencyMs;
            if (num == null || num.intValue() <= 0) {
                return null;
            }
            return num;
        }

        /* renamed from: c, reason: from getter */
        public final List getProgressDownload() {
            return this.progressDownload;
        }

        public final State copy(@g(name = "latency") Integer _latencyMs, @g(name = "server") Server server, @g(name = "status_ping") Integer _statusLatency, @g(name = "status_download") Integer _statusDownload, @g(name = "status_upload") Integer _statusUpload, @g(name = "status_summary") Integer _statusSummary, @g(name = "xput_download") Double _downloadMbps, @g(name = "xput_upload") Double _uploadMbps, @g(name = "download-progress") List<Progress> progressDownload, @g(name = "upload-progress") List<Progress> progressUpload, @g(name = "timestamp") Long timestamp) {
            return new State(_latencyMs, server, _statusLatency, _statusDownload, _statusUpload, _statusSummary, _downloadMbps, _uploadMbps, progressDownload, progressUpload, timestamp);
        }

        /* renamed from: d, reason: from getter */
        public final List getProgressUpload() {
            return this.progressUpload;
        }

        /* renamed from: e, reason: from getter */
        public final Server getServer() {
            return this.server;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return AbstractC6492s.d(this._latencyMs, state._latencyMs) && AbstractC6492s.d(this.server, state.server) && AbstractC6492s.d(this._statusLatency, state._statusLatency) && AbstractC6492s.d(this._statusDownload, state._statusDownload) && AbstractC6492s.d(this._statusUpload, state._statusUpload) && AbstractC6492s.d(this._statusSummary, state._statusSummary) && AbstractC6492s.d(this._downloadMbps, state._downloadMbps) && AbstractC6492s.d(this._uploadMbps, state._uploadMbps) && AbstractC6492s.d(this.progressDownload, state.progressDownload) && AbstractC6492s.d(this.progressUpload, state.progressUpload) && AbstractC6492s.d(this.timestamp, state.timestamp);
        }

        /* renamed from: f, reason: from getter */
        public final a getStatusDownload() {
            return this.statusDownload;
        }

        /* renamed from: g, reason: from getter */
        public final a getStatusLatency() {
            return this.statusLatency;
        }

        /* renamed from: h, reason: from getter */
        public final a getStatusSummary() {
            return this.statusSummary;
        }

        public int hashCode() {
            Integer num = this._latencyMs;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Server server = this.server;
            int iHashCode2 = (iHashCode + (server == null ? 0 : server.hashCode())) * 31;
            Integer num2 = this._statusLatency;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this._statusDownload;
            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this._statusUpload;
            int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this._statusSummary;
            int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Double d10 = this._downloadMbps;
            int iHashCode7 = (iHashCode6 + (d10 == null ? 0 : d10.hashCode())) * 31;
            Double d11 = this._uploadMbps;
            int iHashCode8 = (iHashCode7 + (d11 == null ? 0 : d11.hashCode())) * 31;
            List list = this.progressDownload;
            int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.progressUpload;
            int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Long l10 = this.timestamp;
            return iHashCode10 + (l10 != null ? l10.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final a getStatusUpload() {
            return this.statusUpload;
        }

        /* renamed from: j, reason: from getter */
        public final Long getTimestamp() {
            return this.timestamp;
        }

        public final Double k() {
            Double d10 = this._uploadMbps;
            if (d10 == null || d10.doubleValue() <= 0.0d) {
                return null;
            }
            return d10;
        }

        /* renamed from: l, reason: from getter */
        public final Double get_downloadMbps() {
            return this._downloadMbps;
        }

        /* renamed from: m, reason: from getter */
        public final Integer get_latencyMs() {
            return this._latencyMs;
        }

        /* renamed from: n, reason: from getter */
        public final Integer get_statusDownload() {
            return this._statusDownload;
        }

        /* renamed from: o, reason: from getter */
        public final Integer get_statusLatency() {
            return this._statusLatency;
        }

        /* renamed from: p, reason: from getter */
        public final Integer get_statusSummary() {
            return this._statusSummary;
        }

        /* renamed from: q, reason: from getter */
        public final Integer get_statusUpload() {
            return this._statusUpload;
        }

        /* renamed from: r, reason: from getter */
        public final Double get_uploadMbps() {
            return this._uploadMbps;
        }

        public String toString() {
            return "State(_latencyMs=" + this._latencyMs + ", server=" + this.server + ", _statusLatency=" + this._statusLatency + ", _statusDownload=" + this._statusDownload + ", _statusUpload=" + this._statusUpload + ", _statusSummary=" + this._statusSummary + ", _downloadMbps=" + this._downloadMbps + ", _uploadMbps=" + this._uploadMbps + ", progressDownload=" + this.progressDownload + ", progressUpload=" + this.progressUpload + ", timestamp=" + this.timestamp + ")";
        }
    }

    private ApiUnifiConsoleSpeedtest() {
    }

    public final ApiUnifiConsoleRequestCmd a() {
        return new ApiUnifiConsoleRequestCmd("speedtest");
    }
}
