.class public abstract LG7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/HashMap;)V
    .locals 12

    const-string/jumbo v0, "x"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x1a3a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "Internet Backplane Protocol"

    const/16 v3, 0x1a3a

    const-string/jumbo v4, "ibprotocol"

    const-string/jumbo v5, "udp"

    invoke-direct {v1, v3, v4, v5, v2}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a3b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v3, "Fibotrader Communications"

    const-string/jumbo v4, "fibotrader-com"

    const-string/jumbo v6, "tcp"

    invoke-direct {v2, v0, v4, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v3, "fibotrader-com"

    const-string/jumbo v4, "Fibotrader Communications"

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v3, "princity-agent"

    const-string/jumbo v4, "Princity Agent"

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const/4 v3, 0x0

    const-string/jumbo v4, "Reserved"

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a6f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "bmc-perf-agent"

    const-string v8, "BMC PERFORM AGENT"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "bmc-perf-agent"

    const-string v8, "BMC PERFORM AGENT"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "bmc-perf-mgrd"

    const-string v8, "BMC PERFORM MGRD"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "bmc-perf-mgrd"

    const-string v8, "BMC PERFORM MGRD"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a71

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "adi-gxp-srvprt"

    const-string v8, "ADInstruments GxP Server"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "adi-gxp-srvprt"

    const-string v8, "ADInstruments GxP Server"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a72

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "plysrv-http"

    const-string/jumbo v8, "PolyServe http"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "plysrv-http"

    const-string/jumbo v8, "PolyServe http"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a73

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "plysrv-https"

    const-string/jumbo v8, "PolyServe https"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "plysrv-https"

    const-string/jumbo v8, "PolyServe https"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a79

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "ntz-tracker"

    const-string/jumbo v8, "netTsunami Tracker"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a7a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ntz-p2p-storage"

    const-string/jumbo v7, "netTsunami p2p storage system"

    const/16 v8, 0x1a7a

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a7a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a7a

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a80

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bfd-lag"

    const-string v7, "Bidirectional Forwarding Detection (BFD) on Link Aggregation Group (LAG) Interfaces"

    const/16 v8, 0x1a80

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a81

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dgpf-exchg"

    const-string v7, "DGPF Individual Exchange"

    const/16 v8, 0x1a81

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a81

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dgpf-exchg"

    const-string v7, "DGPF Individual Exchange"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smc-jmx"

    const-string/jumbo v7, "Sun Java Web Console JMX"

    const/16 v8, 0x1a82

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smc-jmx"

    const-string/jumbo v7, "Sun Java Web Console JMX"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a83

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smc-admin"

    const-string/jumbo v7, "Sun Web Console Admin"

    const/16 v8, 0x1a83

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a83

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smc-admin"

    const-string/jumbo v7, "Sun Web Console Admin"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a84

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smc-http"

    const-string/jumbo v7, "SMC-HTTP"

    const/16 v8, 0x1a84

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a84

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smc-http"

    const-string/jumbo v7, "SMC-HTTP"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a85

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "radg"

    const-string/jumbo v7, "GSS-API for the Oracle Remote Administration Daemon"

    const/16 v8, 0x1a85

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a85

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a85

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a86

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hnmp"

    const-string/jumbo v7, "HNMP"

    const/16 v8, 0x1a86

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a86

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hnmp"

    const-string/jumbo v7, "HNMP"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a87

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hnm"

    const-string/jumbo v7, "Halcyon Network Manager"

    const/16 v8, 0x1a87

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a87

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hnm"

    const-string/jumbo v7, "Halcyon Network Manager"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a91

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acnet"

    const-string v7, "ACNET Control System Protocol"

    const/16 v8, 0x1a91

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a91

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acnet"

    const-string v7, "ACNET Control System Protocol"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1aa1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pentbox-sim"

    const-string/jumbo v7, "PenTBox Secure IM Protocol"

    const/16 v8, 0x1aa1

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1aa1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1aa1

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1aaf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ambit-lm"

    const-string/jumbo v7, "ambit-lm"

    const/16 v8, 0x1aaf

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1aaf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ambit-lm"

    const-string/jumbo v7, "ambit-lm"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ab9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netmo-default"

    const-string/jumbo v7, "Netmo Default"

    const/16 v8, 0x1ab9

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ab9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netmo-default"

    const-string/jumbo v7, "Netmo Default"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1aba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netmo-http"

    const-string/jumbo v7, "Netmo HTTP"

    const/16 v8, 0x1aba

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1aba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netmo-http"

    const-string/jumbo v7, "Netmo HTTP"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ac2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iccrushmore"

    const-string/jumbo v7, "ICCRUSHMORE"

    const/16 v8, 0x1ac2

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ac2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iccrushmore"

    const-string/jumbo v7, "ICCRUSHMORE"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ad4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acctopus-cc"

    const-string v7, "Acctopus Command Channel"

    const/16 v8, 0x1ad4

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ad4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acctopus-st"

    const-string v7, "Acctopus Status"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ae8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "muse"

    const-string/jumbo v7, "MUSE"

    const/16 v8, 0x1ae8

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ae8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "muse"

    const-string/jumbo v7, "MUSE"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1af4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rtimeviewer"

    const-string/jumbo v7, "R*TIME Viewer Data Interface"

    const/16 v8, 0x1af4

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1af4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1af4

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1af5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jetstream"

    const-string/jumbo v7, "Novell Jetstream messaging protocol"

    const/16 v8, 0x1af5

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1af5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1af5

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b0c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "split-ping"

    const-string/jumbo v7, "Ping with RX/TX latency/loss split"

    const/16 v8, 0x1b0c

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b0c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "split-ping"

    const-string/jumbo v7, "Ping with RX/TX latency/loss split"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b17

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ethoscan"

    const-string/jumbo v7, "EthoScan Service"

    const/16 v8, 0x1b17

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b17

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ethoscan"

    const-string/jumbo v7, "EthoScan Service"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b18

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xsmsvc"

    const-string/jumbo v7, "XenSource Management Service"

    const/16 v8, 0x1b18

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b18

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xsmsvc"

    const-string/jumbo v7, "XenSource Management Service"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bioserver"

    const-string v7, "Biometrics Server"

    const/16 v8, 0x1b22

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bioserver"

    const-string v7, "Biometrics Server"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b27

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "otlp"

    const-string/jumbo v7, "OTLP"

    const/16 v8, 0x1b27

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b27

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "otlp"

    const-string/jumbo v7, "OTLP"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b31

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmact3"

    const-string/jumbo v7, "JMACT3"

    const/16 v8, 0x1b31

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b31

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmact3"

    const-string/jumbo v7, "JMACT3"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmevt2"

    const-string/jumbo v7, "jmevt2"

    const/16 v8, 0x1b32

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmevt2"

    const-string/jumbo v7, "jmevt2"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b33

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "swismgr1"

    const-string/jumbo v7, "swismgr1"

    const/16 v8, 0x1b33

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b33

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "swismgr1"

    const-string/jumbo v7, "swismgr1"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b34

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "swismgr2"

    const-string/jumbo v7, "swismgr2"

    const/16 v8, 0x1b34

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b34

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "swismgr2"

    const-string/jumbo v7, "swismgr2"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b35

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "swistrap"

    const-string/jumbo v7, "swistrap"

    const/16 v8, 0x1b35

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b35

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "swistrap"

    const-string/jumbo v7, "swistrap"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "swispol"

    const-string/jumbo v7, "swispol"

    const/16 v8, 0x1b36

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "swispol"

    const-string/jumbo v7, "swispol"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b39

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acmsoda"

    const-string/jumbo v7, "acmsoda"

    const/16 v8, 0x1b39

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b39

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acmsoda"

    const-string/jumbo v7, "acmsoda"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b3a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "conductor"

    const-string v8, "Conductor test coordination protocol"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "conductor for multiplex"

    const-string/jumbo v8, "conductor-mpx"

    const-string/jumbo v9, "sctp"

    invoke-direct {v2, v0, v8, v9, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b44

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1b44

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b44

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qolyester"

    const-string/jumbo v7, "QoS-extended OLSR protocol"

    const/16 v8, 0x1b44

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b55

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "MobilitySrv"

    const-string/jumbo v7, "Mobility XE Protocol"

    const/16 v8, 0x1b55

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b55

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "MobilitySrv"

    const-string/jumbo v7, "Mobility XE Protocol"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b56

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iatp-highpri"

    const-string/jumbo v7, "IATP-highPri"

    const/16 v8, 0x1b56

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b56

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iatp-highpri"

    const-string/jumbo v7, "IATP-highPri"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b57

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iatp-normalpri"

    const-string/jumbo v7, "IATP-normalPri"

    const/16 v8, 0x1b57

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b57

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iatp-normalpri"

    const-string/jumbo v7, "IATP-normalPri"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b58

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-fileserver"

    const-string/jumbo v7, "file server itself"

    const/16 v8, 0x1b58

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b58

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-fileserver"

    const-string/jumbo v7, "file server itself"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b59

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-callback"

    const-string/jumbo v7, "callbacks to cache managers"

    const/16 v8, 0x1b59

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b59

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-callback"

    const-string/jumbo v7, "callbacks to cache managers"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b5a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-prserver"

    const-string/jumbo v7, "users & groups database"

    const/16 v8, 0x1b5a

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b5a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-prserver"

    const-string/jumbo v7, "users & groups database"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b5b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-vlserver"

    const-string/jumbo v7, "volume location database"

    const/16 v8, 0x1b5b

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b5b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-vlserver"

    const-string/jumbo v7, "volume location database"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b5c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-kaserver"

    const-string v7, "AFS/Kerberos authentication service"

    const/16 v8, 0x1b5c

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b5c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-kaserver"

    const-string v7, "AFS/Kerberos authentication service"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b5d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-volser"

    const-string/jumbo v7, "volume managment server"

    const/16 v8, 0x1b5d

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b5d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-volser"

    const-string/jumbo v7, "volume managment server"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b5e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-errors"

    const-string/jumbo v7, "error interpretation service"

    const/16 v8, 0x1b5e

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b5e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-errors"

    const-string/jumbo v7, "error interpretation service"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b5f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-bos"

    const-string/jumbo v7, "basic overseer process"

    const/16 v8, 0x1b5f

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b5f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-bos"

    const-string/jumbo v7, "basic overseer process"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-update"

    const-string/jumbo v7, "server-to-server updater"

    const/16 v8, 0x1b60

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-update"

    const-string/jumbo v7, "server-to-server updater"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-rmtsys"

    const-string/jumbo v7, "remote cache manager service"

    const/16 v8, 0x1b61

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afs3-rmtsys"

    const-string/jumbo v7, "remote cache manager service"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b62

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ups-onlinet"

    const-string/jumbo v7, "onlinet uninterruptable power supplies"

    const/16 v8, 0x1b62

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b62

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ups-onlinet"

    const-string/jumbo v7, "onlinet uninterruptable power supplies"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b63

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "talon-disc"

    const-string/jumbo v7, "Talon Discovery Port"

    const/16 v8, 0x1b63

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b63

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "talon-disc"

    const-string/jumbo v7, "Talon Discovery Port"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "talon-engine"

    const-string/jumbo v7, "Talon Engine"

    const/16 v8, 0x1b64

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "talon-engine"

    const-string/jumbo v7, "Talon Engine"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b65

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "microtalon-dis"

    const-string/jumbo v7, "Microtalon Discovery"

    const/16 v8, 0x1b65

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b65

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "microtalon-dis"

    const-string/jumbo v7, "Microtalon Discovery"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b66

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "microtalon-com"

    const-string/jumbo v7, "Microtalon Communications"

    const/16 v8, 0x1b66

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b66

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "microtalon-com"

    const-string/jumbo v7, "Microtalon Communications"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b67

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "talon-webserver"

    const-string/jumbo v7, "Talon Webserver"

    const/16 v8, 0x1b67

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b67

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "talon-webserver"

    const-string/jumbo v7, "Talon Webserver"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spg"

    const-string/jumbo v7, "SPG Controls Carrier"

    const/16 v8, 0x1b68

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spg"

    const-string/jumbo v7, "SPG Controls Carrier"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "grasp"

    const-string/jumbo v7, "GeneRic Autonomic Signaling Protocol"

    const/16 v8, 0x1b69

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "grasp"

    const-string/jumbo v7, "GeneRic Autonomic Signaling Protocol"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fisa-svc"

    const-string/jumbo v7, "FISA Service"

    const/16 v8, 0x1b6a

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1b6a

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b6b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "doceri-ctl"

    const-string/jumbo v7, "doceri drawing service control"

    const/16 v8, 0x1b6b

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b6b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "doceri-view"

    const-string/jumbo v7, "doceri drawing service screen view"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b6c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dpserve"

    const-string v7, "DP Serve"

    const/16 v8, 0x1b6c

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b6c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dpserve"

    const-string v7, "DP Serve"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b6d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dpserveadmin"

    const-string v7, "DP Serve Admin"

    const/16 v8, 0x1b6d

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b6d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dpserveadmin"

    const-string v7, "DP Serve Admin"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctdp"

    const-string v7, "CT Discovery Protocol"

    const/16 v8, 0x1b6e

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctdp"

    const-string v7, "CT Discovery Protocol"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b6f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ct2nmcs"

    const-string v7, "Comtech T2 NMCS"

    const/16 v8, 0x1b6f

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b6f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ct2nmcs"

    const-string v7, "Comtech T2 NMCS"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vmsvc"

    const-string/jumbo v7, "Vormetric service"

    const/16 v8, 0x1b70

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vmsvc"

    const-string/jumbo v7, "Vormetric service"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b71

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vmsvc-2"

    const-string/jumbo v7, "Vormetric Service II"

    const/16 v8, 0x1b71

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b71

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vmsvc-2"

    const-string/jumbo v7, "Vormetric Service II"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b72

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "loreji-panel"

    const-string/jumbo v7, "Loreji Webhosting Panel"

    const/16 v8, 0x1b72

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b72

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1b72

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "op-probe"

    const-string/jumbo v7, "ObjectPlanet probe"

    const/16 v8, 0x1b76

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "op-probe"

    const-string/jumbo v7, "ObjectPlanet probe"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b77

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iposplanet"

    const-string/jumbo v7, "IPOSPLANET retailing multi devices protocol"

    const/16 v8, 0x1b77

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b77

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1b77

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1b80

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "quest-disc"

    const-string/jumbo v7, "Quest application level network service discovery"

    const/16 v8, 0x1b80

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b9e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "arcp"

    const-string v7, "ARCP"

    const/16 v8, 0x1b9e

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b9e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "arcp"

    const-string v7, "ARCP"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b9f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iwg1"

    const-string/jumbo v7, "IWGADTS Aircraft Housekeeping Message"

    const/16 v8, 0x1b9f

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1b9f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iwg1"

    const-string/jumbo v7, "IWGADTS Aircraft Housekeeping Message"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ba0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iba-cfg"

    const-string/jumbo v7, "iba Device Configuration Protocol"

    const/16 v8, 0x1ba0

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ba0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iba-cfg-disc"

    const-string/jumbo v7, "iba Device Configuration Protocol"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ba1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "martalk"

    const-string/jumbo v7, "MarTalk protocol"

    const/16 v8, 0x1ba1

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ba1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1ba1

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ba8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "empowerid"

    const-string/jumbo v7, "EmpowerID Communication"

    const/16 v8, 0x1ba8

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ba8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "empowerid"

    const-string/jumbo v7, "EmpowerID Communication"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bb0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1bb0

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bb0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "zixi-transport"

    const-string/jumbo v7, "Zixi live video transport protocol"

    const/16 v8, 0x1bb0

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bb7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jdp-disc"

    const-string/jumbo v7, "Java Discovery Protocol"

    const/16 v8, 0x1bb7

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bb7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1bb7

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bbb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lazy-ptop"

    const-string/jumbo v7, "lazy-ptop"

    const/16 v8, 0x1bbb

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bbb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lazy-ptop"

    const-string/jumbo v7, "lazy-ptop"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bbc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "font-service"

    const-string/jumbo v7, "X Font Service"

    const/16 v8, 0x1bbc

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bbc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "font-service"

    const-string/jumbo v7, "X Font Service"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bbd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "elcn"

    const-string/jumbo v7, "Embedded Light Control Network"

    const/16 v8, 0x1bbd

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bbd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "elcn"

    const-string/jumbo v7, "Embedded Light Control Network"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bc3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1bc3

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bc3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aes-x170"

    const-string v7, "AES-X170"

    const/16 v8, 0x1bc3

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bcd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rothaga"

    const-string/jumbo v7, "Encrypted chat and file transfer service"

    const/16 v8, 0x1bcd

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bcd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1bcd

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bd1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "virprot-lm"

    const-string/jumbo v7, "Virtual Prototypes License Manager"

    const/16 v8, 0x1bd1

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bd1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "virprot-lm"

    const-string/jumbo v7, "Virtual Prototypes License Manager"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bd2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1bd2

    const-string/jumbo v7, "Unassigned"

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bd3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "snif"

    const-string/jumbo v8, "End-to-end TLS Relay Control Connection"

    const/16 v10, 0x1bd3

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bd3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1bd3

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bd8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scenidm"

    const-string/jumbo v8, "intelligent data manager"

    const/16 v10, 0x1bd8

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bd8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scenidm"

    const-string/jumbo v8, "intelligent data manager"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bd9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scenccs"

    const-string v8, "Catalog Content Search"

    const/16 v10, 0x1bd9

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bd9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scenccs"

    const-string v8, "Catalog Content Search"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bf9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cabsm-comm"

    const-string v8, "CA BSM Comm"

    const/16 v10, 0x1bf9

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bf9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cabsm-comm"

    const-string v8, "CA BSM Comm"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bfa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "caistoragemgr"

    const-string v8, "CA Storage Manager"

    const/16 v10, 0x1bfa

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bfa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "caistoragemgr"

    const-string v8, "CA Storage Manager"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bfb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cacsambroker"

    const-string v8, "CA Connection Broker"

    const/16 v10, 0x1bfb

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bfb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cacsambroker"

    const-string v8, "CA Connection Broker"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bfc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fsr"

    const-string/jumbo v8, "File System Repository Agent"

    const/16 v10, 0x1bfc

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bfc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fsr"

    const-string/jumbo v8, "File System Repository Agent"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bfd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "doc-server"

    const-string v8, "Document WCF Server"

    const/16 v10, 0x1bfd

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bfd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "doc-server"

    const-string v8, "Document WCF Server"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bfe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aruba-server"

    const-string v8, "Aruba eDiscovery Server"

    const/16 v10, 0x1bfe

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bfe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aruba-server"

    const-string v8, "Aruba eDiscovery Server"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "casrmagent"

    const-string v8, "CA SRM Agent"

    const/16 v10, 0x1bff

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1bff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1bff

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cnckadserver"

    const-string/jumbo v8, "cncKadServer DB & Inventory Services"

    const/16 v10, 0x1c00

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c00

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ccag-pib"

    const-string v8, "Consequor Consulting Process Integration Bridge"

    const/16 v10, 0x1c01

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ccag-pib"

    const-string v8, "Consequor Consulting Process Integration Bridge"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c02

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nsrp"

    const-string v8, "Adaptive Name/Service Resolution"

    const/16 v10, 0x1c02

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c02

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nsrp"

    const-string v8, "Adaptive Name/Service Resolution"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c03

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "drm-production"

    const-string v8, "Discovery and Retention Mgt Production"

    const/16 v10, 0x1c03

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c03

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "drm-production"

    const-string v8, "Discovery and Retention Mgt Production"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c04

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "metalbend"

    const-string/jumbo v8, "Port used for MetalBend programmable interface"

    const/16 v10, 0x1c04

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c04

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c04

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c05

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "zsecure"

    const-string/jumbo v8, "zSecure Server"

    const/16 v10, 0x1c05

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c05

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c05

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c06

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "clutild"

    const-string v8, "Clutild"

    const/16 v10, 0x1c06

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c06

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "clutild"

    const-string v8, "Clutild"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c0d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "janus-disc"

    const-string/jumbo v8, "Janus Guidewire Enterprise Discovery Service Bus"

    const/16 v10, 0x1c0d

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c0d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c0d

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fodms"

    const-string/jumbo v8, "FODMS FLIP"

    const/16 v10, 0x1c20

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fodms"

    const-string/jumbo v8, "FODMS FLIP"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c21

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dlip"

    const-string v8, "DLIP"

    const/16 v10, 0x1c21

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c21

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dlip"

    const-string v8, "DLIP"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pon-ictp"

    const-string/jumbo v8, "Inter-Channel Termination Protocol (ICTP) for multi-wavelength PON\n    (Passive Optical Network) systems"

    const/16 v10, 0x1c22

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c22

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c2f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "PS-Server"

    const-string v8, "Communication ports for PaperStream Server services"

    const/16 v10, 0x1c2f

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c2f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c2f

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c30

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "PS-Capture-Pro"

    const-string/jumbo v8, "PaperStream Capture Professional"

    const/16 v10, 0x1c30

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c30

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c30

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c3b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ramp"

    const-string/jumbo v8, "Registry A & M Protocol"

    const/16 v10, 0x1c3b

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c3b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ramp"

    const-string/jumbo v8, "Registry A & M Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "citrixupp"

    const-string v8, "Citrix Universal Printing Port"

    const/16 v10, 0x1c3c

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c3c

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c3d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "citrixuppg"

    const-string v8, "Citrix UPP Gateway"

    const/16 v10, 0x1c3d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c3d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c3d

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c42

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asa-gateways"

    const-string/jumbo v8, "Traffic forwarding for Okta cloud infra"

    const/16 v10, 0x1c42

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c42

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c42

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c43

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aspcoordination"

    const-string v8, "ASP Coordination Protocol"

    const/16 v10, 0x1c43

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c43

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c43

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c44

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "display"

    const-string/jumbo v8, "Wi-Fi Alliance Wi-Fi Display Protocol"

    const/16 v10, 0x1c44

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c44

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c44

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c45

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pads"

    const-string/jumbo v8, "PADS (Public Area Display System) Server"

    const/16 v10, 0x1c45

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c45

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c45

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c4c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "frc-hicp"

    const-string/jumbo v8, "FrontRow Calypso Human Interface Control Protocol"

    const/16 v10, 0x1c4c

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c4c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "frc-hicp-disc"

    const-string/jumbo v8, "FrontRow Calypso Human Interface Control Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c5e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cnap"

    const-string v8, "Calypso Network Access Protocol"

    const/16 v10, 0x1c5e

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c5e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cnap"

    const-string v8, "Calypso Network Access Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "watchme-7272"

    const-string/jumbo v8, "WatchMe Monitoring 7272"

    const/16 v10, 0x1c68

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "watchme-7272"

    const-string/jumbo v8, "WatchMe Monitoring 7272"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oma-rlp"

    const-string/jumbo v8, "OMA Roaming Location"

    const/16 v10, 0x1c69

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oma-rlp"

    const-string/jumbo v8, "OMA Roaming Location"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oma-rlp-s"

    const-string/jumbo v8, "OMA Roaming Location SEC"

    const/16 v10, 0x1c6a

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oma-rlp-s"

    const-string/jumbo v8, "OMA Roaming Location SEC"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c6b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oma-ulp"

    const-string/jumbo v8, "OMA UserPlane Location"

    const/16 v10, 0x1c6b

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c6b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oma-ulp"

    const-string/jumbo v8, "OMA UserPlane Location"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c6c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oma-ilp"

    const-string/jumbo v8, "OMA Internal Location Protocol"

    const/16 v10, 0x1c6c

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c6c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oma-ilp"

    const-string/jumbo v8, "OMA Internal Location Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c6d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oma-ilp-s"

    const-string/jumbo v8, "OMA Internal Location Secure Protocol"

    const/16 v10, 0x1c6d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c6d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oma-ilp-s"

    const-string/jumbo v8, "OMA Internal Location Secure Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oma-dcdocbs"

    const-string/jumbo v8, "OMA Dynamic Content Delivery over CBS"

    const/16 v10, 0x1c6e

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oma-dcdocbs"

    const-string/jumbo v8, "OMA Dynamic Content Delivery over CBS"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c6f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctxlic"

    const-string v8, "Citrix Licensing"

    const/16 v10, 0x1c6f

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c6f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctxlic"

    const-string v8, "Citrix Licensing"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "itactionserver1"

    const-string/jumbo v8, "ITACTIONSERVER 1"

    const/16 v10, 0x1c70

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "itactionserver1"

    const-string/jumbo v8, "ITACTIONSERVER 1"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c71

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "itactionserver2"

    const-string/jumbo v8, "ITACTIONSERVER 2"

    const/16 v10, 0x1c71

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c71

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "itactionserver2"

    const-string/jumbo v8, "ITACTIONSERVER 2"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c72

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mzca-action"

    const-string/jumbo v8, "eventACTION/ussACTION (MZCA) server"

    const/16 v10, 0x1c72

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c72

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mzca-alert"

    const-string/jumbo v8, "eventACTION/ussACTION (MZCA) alert"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c73

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "genstat"

    const-string/jumbo v8, "General Statistics Rendezvous Protocol"

    const/16 v10, 0x1c73

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1c73

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1c73

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cc5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lcm-server"

    const-string/jumbo v8, "LifeKeeper Communications"

    const/16 v10, 0x1cc5

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cc5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lcm-server"

    const-string/jumbo v8, "LifeKeeper Communications"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cdf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mindfilesys"

    const-string/jumbo v8, "mind-file system server"

    const/16 v10, 0x1cdf

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cdf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mindfilesys"

    const-string/jumbo v8, "mind-file system server"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mrssrendezvous"

    const-string/jumbo v8, "mrss-rendezvous server"

    const/16 v10, 0x1ce0

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mrssrendezvous"

    const-string/jumbo v8, "mrss-rendezvous server"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nfoldman"

    const-string/jumbo v8, "nFoldMan Remote Publish"

    const/16 v10, 0x1ce1

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nfoldman"

    const-string/jumbo v8, "nFoldMan Remote Publish"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fse"

    const-string/jumbo v8, "File system export of backup images"

    const/16 v10, 0x1ce2

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fse"

    const-string/jumbo v8, "File system export of backup images"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "winqedit"

    const-string/jumbo v8, "winqedit"

    const/16 v10, 0x1ce3

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "winqedit"

    const-string/jumbo v8, "winqedit"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1ce4

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hexarc"

    const-string/jumbo v8, "Hexarc Command Language"

    const/16 v10, 0x1ce5

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hexarc"

    const-string/jumbo v8, "Hexarc Command Language"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rtps-discovery"

    const-string/jumbo v8, "RTPS Discovery"

    const/16 v10, 0x1ce8

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rtps-discovery"

    const-string/jumbo v8, "RTPS Discovery"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rtps-dd-ut"

    const-string/jumbo v8, "RTPS Data-Distribution User-Traffic"

    const/16 v10, 0x1ce9

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ce9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rtps-dd-ut"

    const-string/jumbo v8, "RTPS Data-Distribution User-Traffic"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rtps-dd-mt"

    const-string/jumbo v8, "RTPS Data-Distribution Meta-Traffic"

    const/16 v10, 0x1cea

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rtps-dd-mt"

    const-string/jumbo v8, "RTPS Data-Distribution Meta-Traffic"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cf2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ionixnetmon"

    const-string/jumbo v8, "Ionix Network Monitor"

    const/16 v10, 0x1cf2

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cf2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ionixnetmon"

    const-string/jumbo v8, "Ionix Network Monitor"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cf3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "daqstream"

    const-string/jumbo v8, "Streaming of measurement data"

    const/16 v10, 0x1cf3

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cf3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "daqstream"

    const-string/jumbo v8, "Streaming of measurement data"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cfc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1cfc

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cfc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ipluminary"

    const-string/jumbo v8, "Multichannel real-time lighting control"

    const/16 v10, 0x1cfc

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cfd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mtportmon"

    const-string/jumbo v8, "Matisse Port Monitor"

    const/16 v10, 0x1cfd

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1cfd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mtportmon"

    const-string/jumbo v8, "Matisse Port Monitor"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d02

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmdmgr"

    const-string/jumbo v8, "OpenView DM Postmaster Manager"

    const/16 v10, 0x1d02

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d02

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmdmgr"

    const-string/jumbo v8, "OpenView DM Postmaster Manager"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d03

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oveadmgr"

    const-string/jumbo v8, "OpenView DM Event Agent Manager"

    const/16 v10, 0x1d03

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d03

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oveadmgr"

    const-string/jumbo v8, "OpenView DM Event Agent Manager"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d04

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovladmgr"

    const-string/jumbo v8, "OpenView DM Log Agent Manager"

    const/16 v10, 0x1d04

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d04

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovladmgr"

    const-string/jumbo v8, "OpenView DM Log Agent Manager"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d05

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "opi-sock"

    const-string/jumbo v8, "OpenView DM rqt communication"

    const/16 v10, 0x1d05

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d05

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "opi-sock"

    const-string/jumbo v8, "OpenView DM rqt communication"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d06

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xmpv7"

    const-string/jumbo v8, "OpenView DM xmpv7 api pipe"

    const/16 v10, 0x1d06

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d06

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xmpv7"

    const-string/jumbo v8, "OpenView DM xmpv7 api pipe"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d07

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmd"

    const-string/jumbo v8, "OpenView DM ovc/xmpv3 api pipe"

    const/16 v10, 0x1d07

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d07

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmd"

    const-string/jumbo v8, "OpenView DM ovc/xmpv3 api pipe"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d0d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "faximum"

    const-string/jumbo v8, "Faximum"

    const/16 v10, 0x1d0d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d0d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "faximum"

    const-string/jumbo v8, "Faximum"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d13

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oracleas-https"

    const-string/jumbo v8, "Oracle Application Server HTTPS"

    const/16 v10, 0x1d13

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d13

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oracleas-https"

    const-string/jumbo v8, "Oracle Application Server HTTPS"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d2f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sttunnel"

    const-string/jumbo v8, "Stateless Transport Tunneling Protocol"

    const/16 v10, 0x1d2f

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d2f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1d2f

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d30

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1d30

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d31

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rise"

    const-string/jumbo v8, "Rise: The Vieneo Province"

    const/16 v10, 0x1d31

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d31

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rise"

    const-string/jumbo v8, "Rise: The Vieneo Province"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "neo4j"

    const-string/jumbo v8, "Neo4j Graph Database"

    const/16 v10, 0x1d32

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1d32

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openit"

    const-string/jumbo v8, "IT Asset Management"

    const/16 v10, 0x1d36

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1d36

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d43

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "telops-lmd"

    const-string/jumbo v8, "telops-lmd"

    const/16 v10, 0x1d43

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d43

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "telops-lmd"

    const-string/jumbo v8, "telops-lmd"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d4c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "silhouette"

    const-string/jumbo v8, "Silhouette User"

    const/16 v10, 0x1d4c

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d4c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "silhouette"

    const-string/jumbo v8, "Silhouette User"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d4d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovbus"

    const-string/jumbo v8, "HP OpenView Bus Daemon"

    const/16 v10, 0x1d4d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d4d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovbus"

    const-string/jumbo v8, "HP OpenView Bus Daemon"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d54

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "adcp"

    const-string v8, "Automation Device Configuration Protocol"

    const/16 v10, 0x1d54

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d54

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1d54

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d55

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acplt"

    const-string v8, "ACPLT - process automation service"

    const/16 v10, 0x1d55

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d55

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1d55

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d56

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovhpas"

    const-string/jumbo v8, "HP OpenView Application Server"

    const/16 v10, 0x1d56

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d56

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovhpas"

    const-string/jumbo v8, "HP OpenView Application Server"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d57

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pafec-lm"

    const-string/jumbo v8, "pafec-lm"

    const/16 v10, 0x1d57

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d57

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pafec-lm"

    const-string/jumbo v8, "pafec-lm"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "saratoga"

    const-string/jumbo v8, "Saratoga Transfer Protocol"

    const/16 v10, 0x1d76

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "saratoga"

    const-string/jumbo v8, "Saratoga Transfer Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d77

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "atul"

    const-string/jumbo v8, "atul server"

    const/16 v10, 0x1d77

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d77

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "atul"

    const-string/jumbo v8, "atul server"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d78

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nta-ds"

    const-string/jumbo v8, "FlowAnalyzer DisplayServer"

    const/16 v10, 0x1d78

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d78

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nta-ds"

    const-string/jumbo v8, "FlowAnalyzer DisplayServer"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d79

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nta-us"

    const-string/jumbo v8, "FlowAnalyzer UtilityServer"

    const/16 v10, 0x1d79

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d79

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nta-us"

    const-string/jumbo v8, "FlowAnalyzer UtilityServer"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d7a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cfs"

    const-string v8, "Cisco Fabric service"

    const/16 v10, 0x1d7a

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d7a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cfs"

    const-string v8, "Cisco Fabric service"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d7b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cwmp"

    const-string v8, "Broadband Forum CWMP"

    const/16 v10, 0x1d7b

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d7b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cwmp"

    const-string v8, "Broadband Forum CWMP"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d7c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tidp"

    const-string/jumbo v8, "Threat Information Distribution Protocol"

    const/16 v10, 0x1d7c

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d7c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tidp"

    const-string/jumbo v8, "Threat Information Distribution Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d7d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nls-tl"

    const-string/jumbo v8, "Network Layer Signaling Transport Layer"

    const/16 v10, 0x1d7d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d7d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nls-tl"

    const-string/jumbo v8, "Network Layer Signaling Transport Layer"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d7e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1d7e

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d7e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cloudsignaling"

    const-string v8, "Cloud Signaling Service"

    const/16 v10, 0x1d7e

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d7f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "controlone-con"

    const-string v8, "ControlONE Console signaling"

    const/16 v10, 0x1d7f

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d7f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1d7f

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d88

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sncp"

    const-string/jumbo v8, "Sniffer Command Protocol"

    const/16 v10, 0x1d88

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d88

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sncp"

    const-string/jumbo v8, "Sniffer Command Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d8b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cfw"

    const-string v8, "Control Framework"

    const/16 v10, 0x1d8b

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d8b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1d8b

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d8e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vsi-omega"

    const-string/jumbo v8, "VSI Omega"

    const/16 v10, 0x1d8e

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d8e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vsi-omega"

    const-string/jumbo v8, "VSI Omega"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d91

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dell-eql-asm"

    const-string v8, "Dell EqualLogic Host Group Management"

    const/16 v10, 0x1d91

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d91

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1d91

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d92

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aries-kfinder"

    const-string v8, "Aries Kfinder"

    const/16 v10, 0x1d92

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d92

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aries-kfinder"

    const-string v8, "Aries Kfinder"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d96

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "coherence"

    const-string/jumbo v8, "Oracle Coherence Cluster Service"

    const/16 v10, 0x1d96

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1d96

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "coherence-disc"

    const-string/jumbo v8, "Oracle Coherence Cluster discovery service"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1da4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-lm"

    const-string/jumbo v8, "Sun License Manager"

    const/16 v10, 0x1da4

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1da4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-lm"

    const-string/jumbo v8, "Sun License Manager"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1db6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mipi-debug"

    const-string/jumbo v8, "MIPI Alliance Debug"

    const/16 v10, 0x1db6

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1db6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mipi-debug"

    const-string/jumbo v8, "MIPI Alliance Debug"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dc8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "indi"

    const-string/jumbo v8, "Instrument Neutral Distributed Interface"

    const/16 v10, 0x1dc8

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dc8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "indi"

    const-string/jumbo v8, "Instrument Neutral Distributed Interface"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dc9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1dc9

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "simco"

    const-string/jumbo v10, "SImple Middlebox COnfiguration (SIMCO) Server"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string v8, "De-registered"

    invoke-direct {v2, v0, v3, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "simco"

    const-string/jumbo v10, "SImple Middlebox COnfiguration (SIMCO)"

    invoke-direct {v2, v0, v8, v9, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dcb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "soap-http"

    const-string/jumbo v8, "SOAP Service Port"

    const/16 v10, 0x1dcb

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dcb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "soap-http"

    const-string/jumbo v8, "SOAP Service Port"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dcc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "zen-pawn"

    const-string/jumbo v8, "Primary Agent Work Notification"

    const/16 v10, 0x1dcc

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dcc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "zen-pawn"

    const-string/jumbo v8, "Primary Agent Work Notification"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dcd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xdas"

    const-string/jumbo v8, "OpenXDAS Wire Protocol"

    const/16 v10, 0x1dcd

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dcd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xdas"

    const-string/jumbo v8, "OpenXDAS Wire Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hawk"

    const-string/jumbo v8, "HA Web Konsole"

    const/16 v10, 0x1dce

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1dce

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dcf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tesla-sys-msg"

    const-string/jumbo v8, "TESLA System Messaging"

    const/16 v10, 0x1dcf

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dcf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1dcf

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dd0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1dd0

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dd1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmdfmgt"

    const-string/jumbo v8, "PMDF Management"

    const/16 v10, 0x1dd1

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dd1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmdfmgt"

    const-string/jumbo v8, "PMDF Management"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1de0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cuseeme"

    const-string/jumbo v8, "bonjour-cuseeme"

    const/16 v10, 0x1de0

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1de0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cuseeme"

    const-string/jumbo v8, "bonjour-cuseeme"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1def

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rome"

    const-string/jumbo v8, "Proprietary immutable distributed data storage"

    const/16 v10, 0x1def

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1def

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rome"

    const-string/jumbo v8, "Proprietary immutable distributed data storage"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1df8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "imqstomp"

    const-string/jumbo v8, "iMQ STOMP Server"

    const/16 v10, 0x1df8

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1df8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1df8

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1df9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "imqstomps"

    const-string/jumbo v8, "iMQ STOMP Server over SSL"

    const/16 v10, 0x1df9

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1df9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1df9

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dfa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "imqtunnels"

    const-string/jumbo v8, "iMQ SSL tunnel"

    const/16 v10, 0x1dfa

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dfa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "imqtunnels"

    const-string/jumbo v8, "iMQ SSL tunnel"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dfb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "imqtunnel"

    const-string/jumbo v8, "iMQ Tunnel"

    const/16 v10, 0x1dfb

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dfb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "imqtunnel"

    const-string/jumbo v8, "iMQ Tunnel"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dfc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "imqbrokerd"

    const-string/jumbo v8, "iMQ Broker Rendezvous"

    const/16 v10, 0x1dfc

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dfc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "imqbrokerd"

    const-string/jumbo v8, "iMQ Broker Rendezvous"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dfd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-user-https"

    const-string/jumbo v8, "Sun App Server - HTTPS"

    const/16 v10, 0x1dfd

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1dfd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-user-https"

    const-string/jumbo v8, "Sun App Server - HTTPS"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-do"

    const-string/jumbo v8, "Microsoft Delivery Optimization Peer-to-Peer"

    const/16 v10, 0x1e00

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-do"

    const-string/jumbo v8, "Microsoft Delivery Optimization Peer-to-Peer"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e03

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dmt"

    const-string v8, "Cleondris DMT"

    const/16 v10, 0x1e03

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e03

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1e03

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e07

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bolt"

    const-string v8, "Bolt database connection"

    const/16 v10, 0x1e07

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e07

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1e07

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e08

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1e08

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e09

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "collaber"

    const-string v8, "Collaber Network Service"

    const/16 v10, 0x1e09

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e09

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "collaber"

    const-string v8, "Collaber Network Service"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e0a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sovd"

    const-string/jumbo v8, "Service-Oriented Vehicle Diagnostics"

    const/16 v10, 0x1e0a

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e0a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1e0a

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e11

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "klio"

    const-string/jumbo v8, "KLIO communications"

    const/16 v10, 0x1e11

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e11

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "klio"

    const-string/jumbo v8, "KLIO communications"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e14

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "em7-secom"

    const-string/jumbo v8, "EM7 Secure Communications"

    const/16 v10, 0x1e14

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e14

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1e14

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e15

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "nfapi"

    const-string/jumbo v10, "SCF nFAPI defining MAC/PHY split"

    invoke-direct {v2, v0, v8, v9, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e1b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sync-em7"

    const-string/jumbo v8, "EM7 Dynamic Updates"

    const/16 v10, 0x1e1b

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e1b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sync-em7"

    const-string/jumbo v8, "EM7 Dynamic Updates"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e1c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scinet"

    const-string/jumbo v8, "scientia.net"

    const/16 v10, 0x1e1c

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e1c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scinet"

    const-string/jumbo v8, "scientia.net"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e28

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "medimageportal"

    const-string/jumbo v8, "MedImage Portal"

    const/16 v10, 0x1e28

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e28

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "medimageportal"

    const-string/jumbo v8, "MedImage Portal"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e2c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nsdeepfreezectl"

    const-string/jumbo v8, "Novell Snap-in Deep Freeze Control"

    const/16 v10, 0x1e2c

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e2c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nsdeepfreezectl"

    const-string/jumbo v8, "Novell Snap-in Deep Freeze Control"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e2d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nitrogen"

    const-string/jumbo v8, "Nitrogen Service"

    const/16 v10, 0x1e2d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e2d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nitrogen"

    const-string/jumbo v8, "Nitrogen Service"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e2e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "freezexservice"

    const-string/jumbo v8, "FreezeX Console Service"

    const/16 v10, 0x1e2e

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e2e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "freezexservice"

    const-string/jumbo v8, "FreezeX Console Service"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e2f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trident-data"

    const-string/jumbo v8, "Trident Systems Data"

    const/16 v10, 0x1e2f

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e2f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trident-data"

    const-string/jumbo v8, "Trident Systems Data"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e30

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "osvr"

    const-string/jumbo v10, "Open-Source Virtual Reality"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "osvr"

    const-string/jumbo v10, "Open-Source Virtual Reality"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "osvr"

    const-string/jumbo v10, "Open-Source Virtual Reality"

    invoke-direct {v2, v0, v8, v9, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smip"

    const-string/jumbo v8, "Smith Protocol over IP"

    const/16 v10, 0x1e36

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smip"

    const-string/jumbo v8, "Smith Protocol over IP"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e3a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aiagent"

    const-string/jumbo v8, "HP Enterprise Discovery Agent"

    const/16 v10, 0x1e3a

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e3a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aiagent"

    const-string/jumbo v8, "HP Enterprise Discovery Agent"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e3d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scriptview"

    const-string/jumbo v8, "ScriptView Network"

    const/16 v10, 0x1e3d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e3d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scriptview"

    const-string/jumbo v8, "ScriptView Network"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e3e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msss"

    const-string/jumbo v8, "Mugginsoft Script Server Service"

    const/16 v10, 0x1e3e

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e3e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1e3e

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e3f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sstp-1"

    const-string/jumbo v8, "Sakura Script Transfer Protocol"

    const/16 v10, 0x1e3f

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e3f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sstp-1"

    const-string/jumbo v8, "Sakura Script Transfer Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e40

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "raqmon-pdu"

    const-string/jumbo v8, "RAQMON PDU"

    const/16 v10, 0x1e40

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e40

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "raqmon-pdu"

    const-string/jumbo v8, "RAQMON PDU"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e43

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prgp"

    const-string/jumbo v8, "Put/Run/Get Protocol"

    const/16 v10, 0x1e43

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e43

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prgp"

    const-string/jumbo v8, "Put/Run/Get Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e5f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inetfs"

    const-string v8, "A File System using TLS over a wide area network"

    const/16 v10, 0x1e5f

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e5f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1e5f

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1e60

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cbt"

    const-string/jumbo v8, "cbt"

    const/16 v10, 0x1e61

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cbt"

    const-string/jumbo v8, "cbt"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e62

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "interwise"

    const-string/jumbo v8, "Interwise"

    const/16 v10, 0x1e62

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e62

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "interwise"

    const-string/jumbo v8, "Interwise"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e63

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vstat"

    const-string/jumbo v8, "VSTAT"

    const/16 v10, 0x1e63

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e63

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vstat"

    const-string/jumbo v8, "VSTAT"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1e64

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e65

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "accu-lmgr"

    const-string/jumbo v8, "accu-lmgr"

    const/16 v10, 0x1e65

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e65

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "accu-lmgr"

    const-string/jumbo v8, "accu-lmgr"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "s-bfd"

    const-string/jumbo v8, "Seamless Bidirectional Forwarding Detection (S-BFD)"

    const/16 v10, 0x1e68

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1e68

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1e69

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "minivend"

    const-string/jumbo v8, "MINIVEND"

    const/16 v10, 0x1e6a

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "minivend"

    const-string/jumbo v8, "MINIVEND"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e6b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "popup-reminders"

    const-string/jumbo v8, "Popup Reminders Receive"

    const/16 v10, 0x1e6b

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e6b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "popup-reminders"

    const-string/jumbo v8, "Popup Reminders Receive"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e6c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1e6c

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e6d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "office-tools"

    const-string/jumbo v8, "Office Tools Pro Receive"

    const/16 v10, 0x1e6d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e6d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "office-tools"

    const-string/jumbo v8, "Office Tools Pro Receive"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e72

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "q3ade"

    const-string/jumbo v8, "Q3ADE Cluster Service"

    const/16 v10, 0x1e72

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e72

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "q3ade"

    const-string/jumbo v8, "Q3ADE Cluster Service"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e75

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pnet-conn"

    const-string/jumbo v8, "Propel Connector port"

    const/16 v10, 0x1e75

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e75

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pnet-conn"

    const-string/jumbo v8, "Propel Connector port"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pnet-enc"

    const-string/jumbo v8, "Propel Encoder port"

    const/16 v10, 0x1e76

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pnet-enc"

    const-string/jumbo v8, "Propel Encoder port"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e77

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "altbsdp"

    const-string v8, "Alternate BSDP Service"

    const/16 v10, 0x1e77

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e77

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "altbsdp"

    const-string v8, "Alternate BSDP Service"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e78

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asr"

    const-string v8, "Apple Software Restore"

    const/16 v10, 0x1e78

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e78

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asr"

    const-string v8, "Apple Software Restore"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e79

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ssp-client"

    const-string/jumbo v8, "Secure Server Protocol - client"

    const/16 v10, 0x1e79

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e79

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ssp-client"

    const-string/jumbo v8, "Secure Server Protocol - client"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e7a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vns-tp"

    const-string/jumbo v8, "Virtualized Network Services Tunnel Protocol"

    const/16 v10, 0x1e7a

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e7a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1e7a

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rbt-wanopt"

    const-string/jumbo v8, "Riverbed WAN Optimization Protocol"

    const/16 v10, 0x1e82

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rbt-wanopt"

    const-string/jumbo v8, "Riverbed WAN Optimization Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ea5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-7845"

    const-string v8, "APC 7845"

    const/16 v10, 0x1ea5

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ea5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-7845"

    const-string v8, "APC 7845"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ea6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-7846"

    const-string v8, "APC 7846"

    const/16 v10, 0x1ea6

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ea6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-7846"

    const-string v8, "APC 7846"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ea7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csoauth"

    const-string v8, "A product key authentication protocol made by CSO"

    const/16 v10, 0x1ea7

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ea7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1ea7

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ebd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mobileanalyzer"

    const-string/jumbo v8, "MobileAnalyzer& MobileMonitor"

    const/16 v10, 0x1ebd

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ebd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1ebd

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ebe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rbt-smc"

    const-string/jumbo v8, "Riverbed Steelhead Mobile Service"

    const/16 v10, 0x1ebe

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ebe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1ebe

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ebf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mdm"

    const-string/jumbo v8, "Mobile Device Management"

    const/16 v10, 0x1ebf

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ebf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1ebf

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ec0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1ec0

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ec0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mipv6tls"

    const-string/jumbo v8, "TLS-based Mobile IPv6 Security"

    const/16 v10, 0x1ec0

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ec6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "owms"

    const-string/jumbo v8, "Opswise Message Service"

    const/16 v10, 0x1ec6

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ec6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1ec6

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ec7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1ec7

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ec8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pss"

    const-string/jumbo v8, "Pearson"

    const/16 v10, 0x1ec8

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ec8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pss"

    const-string/jumbo v8, "Pearson"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ecf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ubroker"

    const-string/jumbo v8, "Universal Broker"

    const/16 v10, 0x1ecf

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ecf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ubroker"

    const-string/jumbo v8, "Universal Broker"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1edc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mevent"

    const-string/jumbo v8, "Multicast Event"

    const/16 v10, 0x1edc

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1edc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mevent"

    const-string/jumbo v8, "Multicast Event"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1edd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tnos-sp"

    const-string/jumbo v8, "TNOS Service Protocol"

    const/16 v10, 0x1edd

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1edd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tnos-sp"

    const-string/jumbo v8, "TNOS Service Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ede

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tnos-dp"

    const-string/jumbo v8, "TNOS shell Protocol"

    const/16 v10, 0x1ede

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ede

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tnos-dp"

    const-string/jumbo v8, "TNOS shell Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1edf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tnos-dps"

    const-string/jumbo v8, "TNOS Secure DiaguardProtocol"

    const/16 v10, 0x1edf

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1edf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tnos-dps"

    const-string/jumbo v8, "TNOS Secure DiaguardProtocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ee9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qo-secure"

    const-string/jumbo v8, "QuickObjects secure port"

    const/16 v10, 0x1ee9

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ee9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qo-secure"

    const-string/jumbo v8, "QuickObjects secure port"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1efc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "t2-drm"

    const-string/jumbo v8, "Tier 2 Data Resource Manager"

    const/16 v10, 0x1efc

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1efc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "t2-drm"

    const-string/jumbo v8, "Tier 2 Data Resource Manager"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1efd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "t2-brm"

    const-string/jumbo v8, "Tier 2 Business Rules Manager"

    const/16 v10, 0x1efd

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1efd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "t2-brm"

    const-string/jumbo v8, "Tier 2 Business Rules Manager"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f1a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "generalsync"

    const-string/jumbo v8, "Encrypted, extendable, general-purpose synchronization protocol"

    const/16 v10, 0x1f1a

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f1a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "generalsync"

    const-string/jumbo v8, "Encrypted, extendable, general-purpose synchronization protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f1f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "supercell"

    const-string/jumbo v8, "Supercell"

    const/16 v10, 0x1f1f

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f1f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "supercell"

    const-string/jumbo v8, "Supercell"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f2b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "micromuse-ncps"

    const-string/jumbo v8, "Micromuse-ncps"

    const/16 v10, 0x1f2b

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f2b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "micromuse-ncps"

    const-string/jumbo v8, "Micromuse-ncps"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f2c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "quest-vista"

    const-string/jumbo v8, "Quest Vista"

    const/16 v10, 0x1f2c

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f2c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "quest-vista"

    const-string/jumbo v8, "Quest Vista"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f2d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sossd-collect"

    const-string/jumbo v8, "Spotlight on SQL Server Desktop Collect"

    const/16 v10, 0x1f2d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f2d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f2d

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f2e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sossd-agent"

    const-string/jumbo v8, "Spotlight on SQL Server Desktop Agent"

    const/16 v10, 0x1f2e

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f2e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sossd-disc"

    const-string/jumbo v8, "Spotlight on SQL Server Desktop Agent Discovery"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f3d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pushns"

    const-string/jumbo v8, "PUSH Notification Service"

    const/16 v10, 0x1f3d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f3d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f3d

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f3e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f3e

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f3e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "usicontentpush"

    const-string/jumbo v8, "USI Content Push Service"

    const/16 v10, 0x1f3e

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f3f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "irdmi2"

    const-string/jumbo v8, "iRDMI2"

    const/16 v10, 0x1f3f

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f3f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "irdmi2"

    const-string/jumbo v8, "iRDMI2"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f40

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "irdmi"

    const-string/jumbo v8, "iRDMI"

    const/16 v10, 0x1f40

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f40

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "irdmi"

    const-string/jumbo v8, "iRDMI"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f41

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vcom-tunnel"

    const-string/jumbo v8, "VCOM Tunnel"

    const/16 v10, 0x1f41

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f41

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vcom-tunnel"

    const-string/jumbo v8, "VCOM Tunnel"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f42

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "teradataordbms"

    const-string/jumbo v8, "Teradata ORDBMS"

    const/16 v10, 0x1f42

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f42

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "teradataordbms"

    const-string/jumbo v8, "Teradata ORDBMS"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f43

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mcreport"

    const-string/jumbo v8, "Mulberry Connect Reporting Service"

    const/16 v10, 0x1f43

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f43

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mcreport"

    const-string/jumbo v8, "Mulberry Connect Reporting Service"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f44

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "p2pevolvenet"

    const-string/jumbo v8, "Opensource Evolv Enterprise Platform P2P Network Node Connection Protocol"

    const/16 v10, 0x1f44

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f44

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f44

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f45

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mxi"

    const-string/jumbo v8, "MXI Generation II for z/OS"

    const/16 v10, 0x1f45

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f45

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mxi"

    const-string/jumbo v8, "MXI Generation II for z/OS"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f46

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wpl-analytics"

    const-string/jumbo v8, "World Programming analytics"

    const/16 v10, 0x1f46

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f46

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wpl-disc"

    const-string/jumbo v8, "World Programming analytics discovery"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f47

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "warppipe"

    const-string/jumbo v8, "I/O oriented cluster computing software"

    const/16 v10, 0x1f47

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f47

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "warppipe"

    const-string/jumbo v8, "I/O oriented cluster computing software"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f48

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "http-alt"

    const-string/jumbo v8, "HTTP Alternate"

    const/16 v10, 0x1f48

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f48

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "http-alt"

    const-string/jumbo v8, "HTTP Alternate"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f49

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nvme-disc"

    const-string/jumbo v8, "NVMe over Fabrics Discovery Service"

    const/16 v10, 0x1f49

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f49

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f49

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f4a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f4a

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f4f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cfg-cloud"

    const-string v8, "Configuration Cloud Service"

    const/16 v10, 0x1f4f

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f4f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f4f

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f50

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ads-s"

    const-string v8, "Beckhoff Automation Device Specification"

    const/16 v10, 0x1f50

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f50

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f50

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f51

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f51

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f51

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cisco-cloudsec"

    const-string v8, "Cisco Cloudsec Dataplane Port Number"

    const/16 v10, 0x1f51

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f52

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f52

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f53

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qbdb"

    const-string/jumbo v8, "QB DB Dynamic Port"

    const/16 v10, 0x1f53

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f53

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qbdb"

    const-string/jumbo v8, "QB DB Dynamic Port"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f54

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "intu-ec-svcdisc"

    const-string/jumbo v8, "Intuit Entitlement Service and Discovery"

    const/16 v10, 0x1f54

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f54

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "intu-ec-svcdisc"

    const-string/jumbo v8, "Intuit Entitlement Service and Discovery"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f55

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "intu-ec-client"

    const-string/jumbo v8, "Intuit Entitlement Client"

    const/16 v10, 0x1f55

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f55

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "intu-ec-client"

    const-string/jumbo v8, "Intuit Entitlement Client"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f56

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oa-system"

    const-string/jumbo v8, "oa-system"

    const/16 v10, 0x1f56

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f56

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oa-system"

    const-string/jumbo v8, "oa-system"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f57

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "arca-api"

    const-string v8, "ARCATrust vault API"

    const/16 v10, 0x1f57

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f57

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "arca-api"

    const-string v8, "ARCATrust vault API"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f58

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f58

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f59

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ca-audit-da"

    const-string v8, "CA Audit Distribution Agent"

    const/16 v10, 0x1f59

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f59

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ca-audit-da"

    const-string v8, "CA Audit Distribution Agent"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f5a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ca-audit-ds"

    const-string v8, "CA Audit Distribution Server"

    const/16 v10, 0x1f5a

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f5a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ca-audit-ds"

    const-string v8, "CA Audit Distribution Server"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f5b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "papachi-p2p-srv"

    const-string/jumbo v8, "peer tracker and data relay service"

    const/16 v10, 0x1f5b

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f5b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "papachi-p2p-srv"

    const-string/jumbo v8, "peer tracker and data relay service"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pro-ed"

    const-string/jumbo v8, "ProEd"

    const/16 v10, 0x1f60

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pro-ed"

    const-string/jumbo v8, "ProEd"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mindprint"

    const-string/jumbo v8, "MindPrint"

    const/16 v10, 0x1f61

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mindprint"

    const-string/jumbo v8, "MindPrint"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f62

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vantronix-mgmt"

    const-string v8, ".vantronix Management"

    const/16 v10, 0x1f62

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f62

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vantronix-mgmt"

    const-string v8, ".vantronix Management"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ampify"

    const-string v8, "Ampify Messaging Protocol"

    const/16 v10, 0x1f68

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ampify"

    const-string v8, "Ampify Messaging Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "enguity-xccetp"

    const-string/jumbo v8, "Xcorpeon ASIC Carrier Ethernet Transport"

    const/16 v10, 0x1f69

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "enguity-xccetp"

    const-string/jumbo v8, "Xcorpeon ASIC Carrier Ethernet Transport"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fs-agent"

    const-string/jumbo v8, "FireScope Agent"

    const/16 v10, 0x1f6a

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f6a

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f6b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fs-server"

    const-string/jumbo v8, "FireScope Server"

    const/16 v10, 0x1f6b

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f6b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f6b

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f6c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fs-mgmt"

    const-string/jumbo v8, "FireScope Management Interface"

    const/16 v10, 0x1f6c

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f6c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f6c

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f73

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rocrail"

    const-string/jumbo v8, "Rocrail Client Service"

    const/16 v10, 0x1f73

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f73

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f73

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f74

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "senomix01"

    const-string/jumbo v8, "Senomix Timesheets Server"

    const/16 v10, 0x1f74

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f74

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "senomix01"

    const-string/jumbo v8, "Senomix Timesheets Server"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f75

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f75

    const-string/jumbo v8, "senomix02"

    const-string/jumbo v10, "Senomix Timesheets Client [1 year assignment]"

    invoke-direct {v1, v2, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f75

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v8, "senomix02"

    invoke-direct {v1, v2, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f76

    const-string/jumbo v8, "senomix03"

    const-string/jumbo v11, "Senomix Timesheets Server [1 year assignment]"

    invoke-direct {v1, v2, v8, v6, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v8, "senomix03"

    invoke-direct {v1, v2, v8, v5, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f77

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f77

    const-string/jumbo v8, "senomix04"

    invoke-direct {v1, v2, v8, v6, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f77

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v8, "senomix04"

    invoke-direct {v1, v2, v8, v5, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f78

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f78

    const-string/jumbo v8, "senomix05"

    invoke-direct {v1, v2, v8, v6, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f78

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v8, "senomix05"

    invoke-direct {v1, v2, v8, v5, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f79

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f79

    const-string/jumbo v8, "senomix06"

    invoke-direct {v1, v2, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f79

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v8, "senomix06"

    invoke-direct {v1, v2, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f7a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f7a

    const-string/jumbo v8, "senomix07"

    invoke-direct {v1, v2, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f7a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v8, "senomix07"

    invoke-direct {v1, v2, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f7b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f7b

    const-string/jumbo v8, "senomix08"

    invoke-direct {v1, v2, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f7b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v8, "senomix08"

    invoke-direct {v1, v2, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f7c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f7c

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f7c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aero"

    const-string v8, "Asymmetric Extended Route Optimization (AERO)"

    const/16 v10, 0x1f7c

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f7d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nikatron-dev"

    const-string/jumbo v8, "Nikatron Device Protocol"

    const/16 v10, 0x1f7d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f7d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f7d

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "toad-bi-appsrvr"

    const-string/jumbo v8, "Toad BI Application Server"

    const/16 v10, 0x1f82

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f82

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f83

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "infi-async"

    const-string/jumbo v8, "Infinidat async replication"

    const/16 v10, 0x1f83

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f83

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f83

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f86

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ucs-isc"

    const-string/jumbo v8, "Oracle Unified Communication Suite\'s Indexed Search Converter"

    const/16 v10, 0x1f86

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f86

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f86

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f8a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gadugadu"

    const-string/jumbo v8, "Gadu-Gadu"

    const/16 v10, 0x1f8a

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f8a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gadugadu"

    const-string/jumbo v8, "Gadu-Gadu"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f8d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f8d

    const-string v8, ""

    invoke-direct {v1, v2, v8, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f8d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f90

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "http-alt"

    const-string/jumbo v8, "HTTP Alternate (see port 80)"

    const/16 v10, 0x1f90

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f90

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "http-alt"

    const-string/jumbo v8, "HTTP Alternate (see port 80)"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f91

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sunproxyadmin"

    const-string/jumbo v8, "Sun Proxy Admin Service"

    const/16 v10, 0x1f91

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f91

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sunproxyadmin"

    const-string/jumbo v8, "Sun Proxy Admin Service"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f92

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "us-cli"

    const-string/jumbo v8, "Utilistor (Client)"

    const/16 v10, 0x1f92

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f92

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "us-cli"

    const-string/jumbo v8, "Utilistor (Client)"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f93

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "us-srv"

    const-string/jumbo v8, "Utilistor (Server)"

    const/16 v10, 0x1f93

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f93

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "us-srv"

    const-string/jumbo v8, "Utilistor (Server)"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f94

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "websnp"

    const-string/jumbo v8, "Snarl Network Protocol over HTTP"

    const/16 v10, 0x1f94

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f94

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f94

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f95

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f95

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f96

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "d-s-n"

    const-string v8, "Distributed SCADA Networking Rendezvous Port"

    const/16 v10, 0x1f96

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f96

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "d-s-n"

    const-string v8, "Distributed SCADA Networking Rendezvous Port"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f97

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "simplifymedia"

    const-string/jumbo v8, "Simplify Media SPP Protocol"

    const/16 v10, 0x1f97

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f97

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "simplifymedia"

    const-string/jumbo v8, "Simplify Media SPP Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f98

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "radan-http"

    const-string/jumbo v8, "Radan HTTP"

    const/16 v10, 0x1f98

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f98

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "radan-http"

    const-string/jumbo v8, "Radan HTTP"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f99

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f99

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f9a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "opsmessaging"

    const-string/jumbo v8, "Vehicle to station messaging"

    const/16 v10, 0x1f9a

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f9a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f9a

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f9b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jamlink"

    const-string/jumbo v8, "Jam Link Framework"

    const/16 v10, 0x1f9b

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1f9b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1f9b

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fa1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sac"

    const-string/jumbo v8, "SAC Port Id"

    const/16 v10, 0x1fa1

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fa1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sac"

    const-string/jumbo v8, "SAC Port Id"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fa4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xprint-server"

    const-string/jumbo v8, "Xprint Server"

    const/16 v10, 0x1fa4

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fa4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xprint-server"

    const-string/jumbo v8, "Xprint Server"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fa5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ldoms-migr"

    const-string/jumbo v8, "Logical Domains Migration"

    const/16 v10, 0x1fa5

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fa5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1fa5

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fa6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kz-migr"

    const-string/jumbo v8, "Oracle Kernel zones migration server"

    const/16 v10, 0x1fa6

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fa6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1fa6

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1faf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1faf

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1faf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "skynetflow"

    const-string/jumbo v8, "Skynetflow network services"

    const/16 v10, 0x1faf

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fb3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mtl8000-matrix"

    const-string/jumbo v8, "MTL8000 Matrix"

    const/16 v10, 0x1fb3

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fb3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mtl8000-matrix"

    const-string/jumbo v8, "MTL8000 Matrix"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fb4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cp-cluster"

    const-string v8, "Check Point Clustering"

    const/16 v10, 0x1fb4

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fb4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cp-cluster"

    const-string v8, "Check Point Clustering"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fb5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "purityrpc"

    const-string/jumbo v8, "Purity replication clustering and remote management"

    const/16 v10, 0x1fb5

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fb5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1fb5

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fb6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "privoxy"

    const-string/jumbo v8, "Privoxy HTTP proxy"

    const/16 v10, 0x1fb6

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fb6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "privoxy"

    const-string/jumbo v8, "Privoxy HTTP proxy"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fb9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apollo-data"

    const-string v8, "Apollo Data Port"

    const/16 v10, 0x1fb9

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fb9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apollo-data"

    const-string v8, "Apollo Data Port"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apollo-admin"

    const-string v8, "Apollo Admin Port"

    const/16 v10, 0x1fba

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apollo-admin"

    const-string v8, "Apollo Admin Port"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fc0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "paycash-online"

    const-string/jumbo v8, "PayCash Online Protocol"

    const/16 v10, 0x1fc0

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fc0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "paycash-online"

    const-string/jumbo v8, "PayCash Online Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fc1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "paycash-wbp"

    const-string/jumbo v8, "PayCash Wallet-Browser"

    const/16 v10, 0x1fc1

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fc1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "paycash-wbp"

    const-string/jumbo v8, "PayCash Wallet-Browser"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fc2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "indigo-vrmi"

    const-string/jumbo v8, "INDIGO-VRMI"

    const/16 v10, 0x1fc2

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fc2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "indigo-vrmi"

    const-string/jumbo v8, "INDIGO-VRMI"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fc3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "indigo-vbcp"

    const-string/jumbo v8, "INDIGO-VBCP"

    const/16 v10, 0x1fc3

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fc3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "indigo-vbcp"

    const-string/jumbo v8, "INDIGO-VBCP"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fc4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dbabble"

    const-string/jumbo v8, "dbabble"

    const/16 v10, 0x1fc4

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fc4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dbabble"

    const-string/jumbo v8, "dbabble"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fcc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "puppet"

    const-string/jumbo v8, "The Puppet master service"

    const/16 v10, 0x1fcc

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fcc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1fcc

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fd4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "isdd"

    const-string/jumbo v8, "i-SDD file transfer"

    const/16 v10, 0x1fd4

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fd4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "isdd"

    const-string/jumbo v8, "i-SDD file transfer"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fd5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1fd5

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fd5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eor-game"

    const-string/jumbo v8, "Edge of Reality game data"

    const/16 v10, 0x1fd5

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fd9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "quantastor"

    const-string/jumbo v8, "QuantaStor Management Interface"

    const/16 v10, 0x1fd9

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fd9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1fd9

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fe0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "patrol"

    const-string/jumbo v8, "Patrol"

    const/16 v10, 0x1fe0

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fe0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "patrol"

    const-string/jumbo v8, "Patrol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fe1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "patrol-snmp"

    const-string/jumbo v8, "Patrol SNMP"

    const/16 v10, 0x1fe1

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fe1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "patrol-snmp"

    const-string/jumbo v8, "Patrol SNMP"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fe2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lpar2rrd"

    const-string/jumbo v8, "LPAR2RRD client server communication"

    const/16 v10, 0x1fe2

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fe2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1fe2

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ff5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "intermapper"

    const-string/jumbo v8, "Intermapper network management system"

    const/16 v10, 0x1ff5

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ff5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1ff5

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ff6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vmware-fdm"

    const-string/jumbo v8, "VMware Fault Domain Manager"

    const/16 v10, 0x1ff6

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ff6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vmware-fdm"

    const-string/jumbo v8, "VMware Fault Domain Manager"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ff7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "proremote"

    const-string/jumbo v8, "ProRemote"

    const/16 v10, 0x1ff7

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ff7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1ff7

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ff8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "itach"

    const-string/jumbo v8, "Remote iTach Connection"

    const/16 v10, 0x1ff8

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ff8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "itach"

    const-string/jumbo v8, "Remote iTach Connection"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ffe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gcp-rphy"

    const-string/jumbo v8, "Generic control plane for RPHY"

    const/16 v10, 0x1ffe

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1ffe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1ffe

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "limnerpressure"

    const-string/jumbo v8, "Limner Pressure"

    const/16 v10, 0x1fff

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1fff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1fff

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2000

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spytechphone"

    const-string/jumbo v8, "SpyTech Phone Service"

    const/16 v10, 0x2000

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2000

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spytechphone"

    const-string/jumbo v8, "SpyTech Phone Service"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2001

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2001

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2002

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "blp1"

    const-string v8, "Bloomberg data API"

    const/16 v10, 0x2002

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2002

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "blp1"

    const-string v8, "Bloomberg data API"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2003

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "blp2"

    const-string v8, "Bloomberg feed"

    const/16 v10, 0x2003

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2003

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "blp2"

    const-string v8, "Bloomberg feed"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2007

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vvr-data"

    const-string/jumbo v8, "VVR DATA"

    const/16 v10, 0x2007

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2007

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vvr-data"

    const-string/jumbo v8, "VVR DATA"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2008

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trivnet1"

    const-string/jumbo v8, "TRIVNET"

    const/16 v10, 0x2008

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2008

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trivnet1"

    const-string/jumbo v8, "TRIVNET"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2009

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trivnet2"

    const-string/jumbo v8, "TRIVNET"

    const/16 v10, 0x2009

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2009

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trivnet2"

    const-string/jumbo v8, "TRIVNET"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x200a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x200a

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x200a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aesop"

    const-string v8, "Audio+Ethernet Standard Open Protocol"

    const/16 v10, 0x200a

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x200c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-perfworks"

    const-string/jumbo v8, "LM Perfworks"

    const/16 v10, 0x200c

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x200c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-perfworks"

    const-string/jumbo v8, "LM Perfworks"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x200d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-instmgr"

    const-string/jumbo v8, "LM Instmgr"

    const/16 v10, 0x200d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x200d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-instmgr"

    const-string/jumbo v8, "LM Instmgr"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x200e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-dta"

    const-string/jumbo v8, "LM Dta"

    const/16 v10, 0x200e

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x200e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-dta"

    const-string/jumbo v8, "LM Dta"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x200f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-sserver"

    const-string/jumbo v8, "LM SServer"

    const/16 v10, 0x200f

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x200f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-sserver"

    const-string/jumbo v8, "LM SServer"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2010

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-webwatcher"

    const-string/jumbo v8, "LM Webwatcher"

    const/16 v10, 0x2010

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2010

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-webwatcher"

    const-string/jumbo v8, "LM Webwatcher"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2013

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2013

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2013

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aruba-papi"

    const-string v8, "Aruba Networks AP management"

    const/16 v10, 0x2013

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2026

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rexecj"

    const-string/jumbo v8, "RexecJ Server"

    const/16 v10, 0x2026

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2026

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rexecj"

    const-string/jumbo v8, "RexecJ Server"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2027

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2027

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2027

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hncp-udp-port"

    const-string/jumbo v8, "HNCP"

    const/16 v10, 0x2027

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2028

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2028

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2028

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hncp-dtls-port"

    const-string/jumbo v8, "HNCP over DTLS"

    const/16 v10, 0x2028

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2033

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synapse-nhttps"

    const-string/jumbo v8, "Synapse Non Blocking HTTPS"

    const/16 v10, 0x2033

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2033

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synapse-nhttps"

    const-string/jumbo v8, "Synapse Non Blocking HTTPS"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x204a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x204a

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x204a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "espeasy-p2p"

    const-string/jumbo v8, "ESPeasy peer-2-peer communication"

    const/16 v10, 0x204a

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x204e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "robot-remote"

    const-string/jumbo v8, "Robot Framework Remote Library Interface"

    const/16 v10, 0x204e

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x204e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x204e

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2054

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-mcc"

    const-string/jumbo v8, "Microsoft Connected Cache"

    const/16 v10, 0x2054

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2054

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-mcc"

    const-string/jumbo v8, "Microsoft Connected Cache"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2058

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synapse-nhttp"

    const-string/jumbo v8, "Synapse Non Blocking HTTP"

    const/16 v10, 0x2058

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2058

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synapse-nhttp"

    const-string/jumbo v8, "Synapse Non Blocking HTTP"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2059

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2059

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x205a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "libelle"

    const-string/jumbo v10, "Libelle EnterpriseBus"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "libelle-disc"

    const-string/jumbo v10, "Libelle EnterpriseBus discovery"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v9, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "dccp"

    invoke-direct {v2, v0, v3, v8, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2064

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "blp3"

    const-string v8, "Bloomberg professional"

    const/16 v10, 0x2064

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2064

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "blp3"

    const-string v8, "Bloomberg professional"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2065

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hiperscan-id"

    const-string/jumbo v8, "Hiperscan Identification Service"

    const/16 v10, 0x2065

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2065

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2065

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2066

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "blp4"

    const-string v8, "Bloomberg intelligent client"

    const/16 v10, 0x2066

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2066

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "blp4"

    const-string v8, "Bloomberg intelligent client"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x206c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tmi"

    const-string/jumbo v8, "Transport Management Interface"

    const/16 v10, 0x206c

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x206c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tmi"

    const-string/jumbo v8, "Transport Management Interface"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x206d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amberon"

    const-string v8, "Amberon PPC/PPS"

    const/16 v10, 0x206d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x206d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amberon"

    const-string v8, "Amberon PPC/PPS"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2079

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hub-open-net"

    const-string/jumbo v8, "Hub Open Network"

    const/16 v10, 0x2079

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2079

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2079

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2080

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tnp-discover"

    const-string/jumbo v8, "Thin(ium) Network Protocol"

    const/16 v10, 0x2080

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2080

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tnp-discover"

    const-string/jumbo v8, "Thin(ium) Network Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2081

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tnp"

    const-string/jumbo v8, "Thin(ium) Network Protocol"

    const/16 v10, 0x2081

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2081

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tnp"

    const-string/jumbo v8, "Thin(ium) Network Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2082

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "garmin-marine"

    const-string/jumbo v8, "Garmin Marine"

    const/16 v10, 0x2082

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2082

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "garmin-marine"

    const-string/jumbo v8, "Garmin Marine"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x209f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "server-find"

    const-string/jumbo v8, "Server Find"

    const/16 v10, 0x209f

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x209f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "server-find"

    const-string/jumbo v8, "Server Find"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cruise-enum"

    const-string v8, "Cruise ENUM"

    const/16 v10, 0x20b8

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cruise-enum"

    const-string v8, "Cruise ENUM"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cruise-swroute"

    const-string v8, "Cruise SWROUTE"

    const/16 v10, 0x20b9

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cruise-swroute"

    const-string v8, "Cruise SWROUTE"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cruise-config"

    const-string v8, "Cruise CONFIG"

    const/16 v10, 0x20ba

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cruise-config"

    const-string v8, "Cruise CONFIG"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20bb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cruise-diags"

    const-string v8, "Cruise DIAGS"

    const/16 v10, 0x20bb

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20bb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cruise-diags"

    const-string v8, "Cruise DIAGS"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cruise-update"

    const-string v8, "Cruise UPDATE"

    const/16 v10, 0x20bc

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cruise-update"

    const-string v8, "Cruise UPDATE"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20bf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "m2mservices"

    const-string/jumbo v8, "M2m Services"

    const/16 v10, 0x20bf

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20bf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "m2mservices"

    const-string/jumbo v8, "M2m Services"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "marathontp"

    const-string/jumbo v8, "Marathon Transport Protocol"

    const/16 v10, 0x20c0

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x20c0

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20d0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cvd"

    const-string/jumbo v8, "cvd"

    const/16 v10, 0x20d0

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20d0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cvd"

    const-string/jumbo v8, "cvd"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sabarsd"

    const-string/jumbo v8, "sabarsd"

    const/16 v10, 0x20d1

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sabarsd"

    const-string/jumbo v8, "sabarsd"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20d2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "abarsd"

    const-string/jumbo v8, "abarsd"

    const/16 v10, 0x20d2

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20d2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "abarsd"

    const-string/jumbo v8, "abarsd"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20d3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "admind"

    const-string/jumbo v8, "admind"

    const/16 v10, 0x20d3

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20d3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "admind"

    const-string/jumbo v8, "admind"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20d4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "svcloud"

    const-string/jumbo v8, "SuperVault Cloud"

    const/16 v10, 0x20d4

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20d4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x20d4

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20d5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "svbackup"

    const-string/jumbo v8, "SuperVault Backup"

    const/16 v10, 0x20d5

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20d5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x20d5

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dlpx-sp"

    const-string v8, "Delphix Session Protocol"

    const/16 v10, 0x20df

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x20df

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20e0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "espeech"

    const-string/jumbo v8, "eSpeech Session Protocol"

    const/16 v10, 0x20e0

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20e0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "espeech"

    const-string/jumbo v8, "eSpeech Session Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20e1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "espeech-rtp"

    const-string/jumbo v8, "eSpeech RTP Protocol"

    const/16 v10, 0x20e1

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20e1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "espeech-rtp"

    const-string/jumbo v8, "eSpeech RTP Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aritts"

    const-string v8, "Aristech text-to-speech server"

    const/16 v10, 0x20e7

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x20e7

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pgbackrest"

    const-string/jumbo v8, "PostgreSQL Backup"

    const/16 v10, 0x20f0

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x20f0

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x20f1

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aws-as2"

    const-string/jumbo v8, "Non Persistent Desktop and Application Streaming"

    const/16 v10, 0x20f1

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20fa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cybro-a-bus"

    const-string v8, "CyBro A-bus Protocol"

    const/16 v10, 0x20fa

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20fa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cybro-a-bus"

    const-string v8, "CyBro A-bus Protocol"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20fb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcsync-https"

    const-string/jumbo v8, "PCsync HTTPS"

    const/16 v10, 0x20fb

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20fb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcsync-https"

    const-string/jumbo v8, "PCsync HTTPS"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcsync-http"

    const-string/jumbo v8, "PCsync HTTP"

    const/16 v10, 0x20fc

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcsync-http"

    const-string/jumbo v8, "PCsync HTTP"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "copy"

    const-string/jumbo v8, "Port for copy peer sync feature"

    const/16 v10, 0x20fd

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x20fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "copy-disc"

    const-string/jumbo v8, "Port for copy discovery"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2100

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "matrix-fed"

    const-string/jumbo v8, "Matrix Federation Protocol"

    const/16 v10, 0x2100

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2100

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2100

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2101

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2101

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2102

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "npmp"

    const-string/jumbo v8, "npmp"

    const/16 v10, 0x2102

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2102

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "npmp"

    const-string/jumbo v8, "npmp"

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2109

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nexentamv"

    const-string/jumbo v8, "Nexenta Management GUI"

    const/16 v10, 0x2109

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2109

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2109

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2116

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cisco-avp"

    const-string v8, "Cisco Address Validation Protocol"

    const/16 v10, 0x2116

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2116

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2116

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2117

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "pim-port"

    const-string/jumbo v10, "PIM over Reliable Transport"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "pim-port"

    const-string/jumbo v10, "PIM over Reliable Transport"

    invoke-direct {v2, v0, v8, v9, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2118

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "otv"

    const-string/jumbo v8, "Overlay Transport Virtualization (OTV)"

    const/16 v9, 0x2118

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2118

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "otv"

    const-string/jumbo v8, "Overlay Transport Virtualization (OTV)"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2119

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vp2p"

    const-string/jumbo v8, "Virtual Point to Point"

    const/16 v9, 0x2119

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2119

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vp2p"

    const-string/jumbo v8, "Virtual Point to Point"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x211a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "noteshare"

    const-string v8, "AquaMinds NoteShare"

    const/16 v9, 0x211a

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x211a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "noteshare"

    const-string v8, "AquaMinds NoteShare"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2134

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fmtp"

    const-string/jumbo v8, "Flight Message Transfer Protocol"

    const/16 v9, 0x2134

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2134

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fmtp"

    const-string/jumbo v8, "Flight Message Transfer Protocol"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2135

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cmtp-mgt"

    const-string v8, "CYTEL Message Transfer Management"

    const/16 v9, 0x2135

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2135

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cmtp-av"

    const-string v8, "CYTEL Message Transfer Audio and Video"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2136

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ftnmtp"

    const-string/jumbo v8, "FTN Message Transfer Protocol"

    const/16 v9, 0x2136

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2136

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2136

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2137

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lsp-self-ping"

    const-string/jumbo v8, "MPLS LSP Self-Ping"

    const/16 v9, 0x2137

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2137

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2137

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x216a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rtsp-alt"

    const-string/jumbo v8, "RTSP Alternate (see port 554)"

    const/16 v9, 0x216a

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x216a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rtsp-alt"

    const-string/jumbo v8, "RTSP Alternate (see port 554)"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x216b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "d-fence"

    const-string/jumbo v8, "SYMAX D-FENCE"

    const/16 v9, 0x216b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x216b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "d-fence"

    const-string/jumbo v8, "SYMAX D-FENCE"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2177

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dof-tunnel"

    const-string v8, "DOF Tunneling Protocol"

    const/16 v9, 0x2177

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2177

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dof-tunnel"

    const-string v8, "DOF Tunneling Protocol"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2198

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asterix"

    const-string/jumbo v8, "Surveillance Data"

    const/16 v9, 0x2198

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2198

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asterix"

    const-string/jumbo v8, "Surveillance Data"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x21a1

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canon-cpp-disc"

    const-string v8, "Canon Compact Printer Protocol Discovery"

    const/16 v9, 0x21a1

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canon-mfnp"

    const-string v8, "Canon MFNP Service"

    const/16 v9, 0x21a2

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canon-mfnp"

    const-string v8, "Canon MFNP Service"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canon-bjnp1"

    const-string v8, "Canon BJNP Port 1"

    const/16 v9, 0x21a3

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canon-bjnp1"

    const-string v8, "Canon BJNP Port 1"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canon-bjnp2"

    const-string v8, "Canon BJNP Port 2"

    const/16 v9, 0x21a4

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canon-bjnp2"

    const-string v8, "Canon BJNP Port 2"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canon-bjnp3"

    const-string v8, "Canon BJNP Port 3"

    const/16 v9, 0x21a5

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canon-bjnp3"

    const-string v8, "Canon BJNP Port 3"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canon-bjnp4"

    const-string v8, "Canon BJNP Port 4"

    const/16 v9, 0x21a6

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canon-bjnp4"

    const-string v8, "Canon BJNP Port 4"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "imink"

    const-string/jumbo v8, "Imink Service Control"

    const/16 v9, 0x21a7

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21a7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x21a7

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21d9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "monetra"

    const-string/jumbo v8, "Monetra"

    const/16 v9, 0x21d9

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21d9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x21d9

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21da

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "monetra-admin"

    const-string/jumbo v8, "Monetra Administrative Access"

    const/16 v9, 0x21da

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21da

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x21da

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x21db

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spartan"

    const-string/jumbo v8, "Spartan management"

    const/16 v9, 0x21dc

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x21dc

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msi-cps-rm"

    const-string/jumbo v8, "Motorola Solutions Customer Programming Software for Radio Management"

    const/16 v9, 0x21e3

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msi-cps-rm-disc"

    const-string/jumbo v8, "Motorola Solutions Customer Programming Software for Radio Management Discovery"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-as-jmxrmi"

    const-string/jumbo v8, "Sun App Server - JMX/RMI"

    const/16 v9, 0x21ee

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-as-jmxrmi"

    const-string/jumbo v8, "Sun App Server - JMX/RMI"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x21ef

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openremote-ctrl"

    const-string/jumbo v8, "OpenRemote Controller HTTP/REST"

    const/16 v9, 0x21f0

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x21f0

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21fb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vnyx"

    const-string/jumbo v8, "VNYX Primary Port"

    const/16 v9, 0x21fb

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x21fb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x21fb

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2206

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "semi-grpc"

    const-string/jumbo v8, "gRPC for SEMI Standards implementations"

    const/16 v9, 0x2206

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2206

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2206

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2207

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nvc"

    const-string/jumbo v8, "Nuance Voice Control"

    const/16 v9, 0x2207

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2207

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2207

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x221c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x221c

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x221c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dtp-net"

    const-string v8, "DASGIP Net Services"

    const/16 v9, 0x221c

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x221d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ibus"

    const-string/jumbo v8, "iBus"

    const/16 v9, 0x221d

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x221d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ibus"

    const-string/jumbo v8, "iBus"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x222e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dey-keyneg"

    const-string v8, "DEY Storage Key Negotiation"

    const/16 v9, 0x222e

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x222e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x222e

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x223b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mc-appserver"

    const-string/jumbo v8, "MC-APPSERVER"

    const/16 v9, 0x223b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x223b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mc-appserver"

    const-string/jumbo v8, "MC-APPSERVER"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x223c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openqueue"

    const-string/jumbo v8, "OPENQUEUE"

    const/16 v9, 0x223c

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x223c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openqueue"

    const-string/jumbo v8, "OPENQUEUE"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x223d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ultraseek-http"

    const-string/jumbo v8, "Ultraseek HTTP"

    const/16 v9, 0x223d

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x223d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ultraseek-http"

    const-string/jumbo v8, "Ultraseek HTTP"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x223e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amcs"

    const-string v8, "Agilent Connectivity Service"

    const/16 v9, 0x223e

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x223e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amcs"

    const-string v8, "Agilent Connectivity Service"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x223f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "core-of-source"

    const-string/jumbo v8, "Online mobile multiplayer game"

    const/16 v9, 0x223f

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x223f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x223f

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2240

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sandpolis"

    const-string/jumbo v8, "Sandpolis Server"

    const/16 v9, 0x2240

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2240

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2240

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2241

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oktaauthenticat"

    const-string/jumbo v8, "Okta MultiPlatform Access Mgmt for Cloud Svcs"

    const/16 v9, 0x2241

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2241

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2241

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2242

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dpap"

    const-string v8, "Digital Photo Access Protocol (iPhoto)"

    const/16 v9, 0x2242

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2242

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dpap"

    const-string v8, "Digital Photo Access Protocol (iPhoto)"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x224a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "uec"

    const-string/jumbo v8, "Stonebranch Universal Enterprise Controller"

    const/16 v9, 0x224a

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x224a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x224a

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2252

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msgclnt"

    const-string/jumbo v8, "Message Client"

    const/16 v9, 0x2252

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2252

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msgclnt"

    const-string/jumbo v8, "Message Client"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2253

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msgsrvr"

    const-string/jumbo v8, "Message Server"

    const/16 v9, 0x2253

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2253

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msgsrvr"

    const-string/jumbo v8, "Message Server"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2259

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acd-pm"

    const-string v8, "Accedian Performance Measurement"

    const/16 v9, 0x2259

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2259

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acd-pm"

    const-string v8, "Accedian Performance Measurement"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2260

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sunwebadmin"

    const-string/jumbo v8, "Sun Web Server Admin Service"

    const/16 v9, 0x2260

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2260

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sunwebadmin"

    const-string/jumbo v8, "Sun Web Server Admin Service"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2264

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "truecm"

    const-string/jumbo v8, "truecm"

    const/16 v9, 0x2264

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2264

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "truecm"

    const-string/jumbo v8, "truecm"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2265

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2265

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2265

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pfcp"

    const-string v8, "Destination Port number for PFCP"

    const/16 v9, 0x2265

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2266

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2266

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2267

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2267

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2267

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hes-clip"

    const-string/jumbo v8, "HES-CLIP Interoperability protocol"

    const/16 v9, 0x2267

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2268

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2268

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2268

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ssports-bcast"

    const-string/jumbo v8, "STATSports Broadcast Service"

    const/16 v9, 0x2268

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2269

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2269

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2269

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3gpp-monp"

    const-string/jumbo v8, "MCPTT Off-Network Protocol (MONP)"

    const/16 v9, 0x2269

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22a9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dxspider"

    const-string/jumbo v8, "dxspider linking protocol"

    const/16 v9, 0x22a9

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22a9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dxspider"

    const-string/jumbo v8, "dxspider linking protocol"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22b0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cddbp-alt"

    const-string v8, "CDDBP"

    const/16 v9, 0x22b0

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22b0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cddbp-alt"

    const-string v8, "CDDBP"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "galaxy4d"

    const-string/jumbo v8, "Galaxy4D Online Game Engine"

    const/16 v9, 0x22b1

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x22b1

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x22b2

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "secure-mqtt"

    const-string/jumbo v8, "Secure MQTT"

    const/16 v9, 0x22b3

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "secure-mqtt"

    const-string/jumbo v8, "Secure MQTT"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-tcp-1"

    const-string/jumbo v8, "NewsEDGE server TCP (TCP 1)"

    const/16 v9, 0x22b8

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-udp-1"

    const-string/jumbo v8, "NewsEDGE server UDP (UDP 1)"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-tcp-2"

    const-string v8, "Desktop Data TCP 1"

    const/16 v9, 0x22b9

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-udp-2"

    const-string/jumbo v8, "NewsEDGE server broadcast"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-tcp-3"

    const-string v8, "Desktop Data TCP 2"

    const/16 v9, 0x22ba

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-udp-3"

    const-string/jumbo v8, "NewsEDGE client broadcast"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22bb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-tcp-4"

    const-string v8, "Desktop Data TCP 3: NESS application"

    const/16 v9, 0x22bb

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22bb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-udp-4"

    const-string v8, "Desktop Data UDP 3: NESS application"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-tcp-5"

    const-string v8, "Desktop Data TCP 4: FARM product"

    const/16 v9, 0x22bc

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-udp-5"

    const-string v8, "Desktop Data UDP 4: FARM product"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22bd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-tcp-6"

    const-string v8, "Desktop Data TCP 5: NewsEDGE/Web application"

    const/16 v9, 0x22bd

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22bd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-udp-6"

    const-string v8, "Desktop Data UDP 5: NewsEDGE/Web application"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22be

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-tcp-7"

    const-string v8, "Desktop Data TCP 6: COAL application"

    const/16 v9, 0x22be

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22be

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ddi-udp-7"

    const-string v8, "Desktop Data UDP 6: COAL application"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22c3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ospf-lite"

    const-string/jumbo v8, "ospf-lite"

    const/16 v9, 0x22c3

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22c3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ospf-lite"

    const-string/jumbo v8, "ospf-lite"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmb-cds1"

    const-string/jumbo v8, "JMB-CDS 1"

    const/16 v9, 0x22c4

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmb-cds1"

    const-string/jumbo v8, "JMB-CDS 1"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmb-cds2"

    const-string/jumbo v8, "JMB-CDS 2"

    const/16 v9, 0x22c5

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmb-cds2"

    const-string/jumbo v8, "JMB-CDS 2"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22cc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dpp"

    const-string/jumbo v8, "WFA Device Provisioning Protocol"

    const/16 v9, 0x22cc

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22cc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x22cc

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22cd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x22cd

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22ce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "manyone-http"

    const-string/jumbo v7, "manyone-http"

    const/16 v8, 0x22ce

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22ce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "manyone-http"

    const-string/jumbo v7, "manyone-http"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22cf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "manyone-xml"

    const-string/jumbo v7, "manyone-xml"

    const/16 v8, 0x22cf

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22cf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "manyone-xml"

    const-string/jumbo v7, "manyone-xml"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22d0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wcbackup"

    const-string/jumbo v7, "Windows Client Backup"

    const/16 v8, 0x22d0

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22d0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wcbackup"

    const-string/jumbo v7, "Windows Client Backup"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dragonfly"

    const-string v7, "Dragonfly System Service"

    const/16 v8, 0x22d1

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dragonfly"

    const-string v7, "Dragonfly System Service"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "twds"

    const-string/jumbo v7, "Transaction Warehouse Data Service"

    const/16 v8, 0x22e9

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x22e9

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22f9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ub-dns-control"

    const-string/jumbo v7, "unbound dns nameserver control"

    const/16 v8, 0x22f9

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22f9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x22f9

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22fa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cumulus-admin"

    const-string v7, "Cumulus Admin Port"

    const/16 v8, 0x22fa

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x22fa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cumulus-admin"

    const-string v7, "Cumulus Admin Port"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2314

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nod-provider"

    const-string/jumbo v7, "Network of Devices Provider"

    const/16 v8, 0x2314

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2314

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nod-provider"

    const-string/jumbo v7, "Network of Devices Provider"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2315

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nod-client"

    const-string/jumbo v7, "Network of Devices Client"

    const/16 v8, 0x2315

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2315

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2315

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x231d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sunwebadmins"

    const-string/jumbo v7, "Sun Web Server SSL Admin Service"

    const/16 v8, 0x231d

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x231d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sunwebadmins"

    const-string/jumbo v7, "Sun Web Server SSL Admin Service"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x231e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "http-wmap"

    const-string/jumbo v7, "webmail HTTP service"

    const/16 v8, 0x231e

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x231e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "http-wmap"

    const-string/jumbo v7, "webmail HTTP service"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x231f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "https-wmap"

    const-string/jumbo v7, "webmail HTTPS service"

    const/16 v8, 0x231f

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x231f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "https-wmap"

    const-string/jumbo v7, "webmail HTTPS service"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2325

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oracle-ms-ens"

    const-string/jumbo v7, "Oracle Messaging Server Event Notification Service"

    const/16 v8, 0x2325

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x2325

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x2325

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
