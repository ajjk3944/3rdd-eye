.class public abstract LG7/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/HashMap;)V
    .locals 13

    const-string/jumbo v0, "x"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x10e1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "Remote Who Is"

    const/16 v3, 0x10e1

    const-string/jumbo v4, "rwhois"

    const-string/jumbo v5, "tcp"

    invoke-direct {v1, v3, v4, v5, v2}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "Remote Who Is"

    const-string/jumbo v4, "rwhois"

    const-string/jumbo v6, "udp"

    invoke-direct {v1, v3, v4, v6, v2}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trim-event"

    const-string/jumbo v3, "TRIM Event Service"

    const/16 v4, 0x10e2

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trim-event"

    const-string/jumbo v3, "TRIM Event Service"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trim-ice"

    const-string/jumbo v3, "TRIM ICE Service"

    const/16 v4, 0x10e3

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trim-ice"

    const-string/jumbo v3, "TRIM ICE Service"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x10e4

    const/4 v3, 0x0

    const-string/jumbo v4, "Reserved"

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "geognosisadmin"

    const-string v7, "Cadcorp GeognoSIS Administrator"

    const/16 v8, 0x10e5

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "geognosisman"

    const-string v7, "Cadcorp GeognoSIS Administrator"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "geognosis"

    const-string v7, "Cadcorp GeognoSIS"

    const/16 v8, 0x10e6

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "geognosis"

    const-string v7, "Cadcorp GeognoSIS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jaxer-web"

    const-string/jumbo v7, "Jaxer Web Protocol"

    const/16 v8, 0x10e7

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jaxer-web"

    const-string/jumbo v7, "Jaxer Web Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jaxer-manager"

    const-string/jumbo v7, "Jaxer Manager Command Protocol"

    const/16 v8, 0x10e8

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jaxer-manager"

    const-string/jumbo v7, "Jaxer Manager Command Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "publiqare-sync"

    const-string/jumbo v7, "PubliQare Distributed Environment Synchronisation Engine"

    const/16 v8, 0x10e9

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x10e9

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dey-sapi"

    const-string v7, "DEY Storage Administration REST API"

    const/16 v8, 0x10ea

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x10ea

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ktickets-rest"

    const-string/jumbo v7, "ktickets REST API for event management and ticketing systems (embedded POS devices)"

    const/16 v8, 0x10eb

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x10eb

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "getty-focus"

    const-string/jumbo v7, "Getty Images FOCUS service"

    const/16 v8, 0x10ec

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x10ec

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10ed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "ahsp"

    const-string v8, "ArrowHead Service Protocol (AHSP)"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "ahsp"

    const-string v8, "ArrowHead Service Protocol (AHSP)"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string v7, "ArrowHead Service Protocol (AHSP)"

    const-string/jumbo v8, "ahsp"

    const-string/jumbo v9, "sctp"

    invoke-direct {v2, v0, v8, v9, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netconf-ch-ssh"

    const-string/jumbo v7, "NETCONF Call Home (SSH)"

    const/16 v8, 0x10ee

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x10ee

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netconf-ch-tls"

    const-string/jumbo v7, "NETCONF Call Home (TLS)"

    const/16 v8, 0x10ef

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x10ef

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "restconf-ch-tls"

    const-string/jumbo v7, "RESTCONF Call Home (TLS)"

    const/16 v8, 0x10f0

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x10f0

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gaia"

    const-string/jumbo v7, "Gaia Connector Protocol"

    const/16 v8, 0x10f4

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gaia"

    const-string/jumbo v7, "Gaia Connector Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x10f5

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lisp-data"

    const-string/jumbo v7, "LISP Data Packets"

    const/16 v8, 0x10f5

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x10f6

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lisp-control"

    const-string/jumbo v7, "LISP Control Packets"

    const/16 v8, 0x10f6

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unicall"

    const-string/jumbo v7, "UNICALL"

    const/16 v8, 0x10f7

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unicall"

    const-string/jumbo v7, "UNICALL"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vinainstall"

    const-string/jumbo v7, "VinaInstall"

    const/16 v8, 0x10f8

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vinainstall"

    const-string/jumbo v7, "VinaInstall"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "m4-network-as"

    const-string/jumbo v7, "Macro 4 Network AS"

    const/16 v8, 0x10f9

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10f9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "m4-network-as"

    const-string/jumbo v7, "Macro 4 Network AS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10fa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "elanlm"

    const-string/jumbo v7, "ELAN LM"

    const/16 v8, 0x10fa

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10fa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "elanlm"

    const-string/jumbo v7, "ELAN LM"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10fb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lansurveyor"

    const-string/jumbo v7, "LAN Surveyor"

    const/16 v8, 0x10fb

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10fb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lansurveyor"

    const-string/jumbo v7, "LAN Surveyor"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "itose"

    const-string/jumbo v7, "ITOSE"

    const/16 v8, 0x10fc

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "itose"

    const-string/jumbo v7, "ITOSE"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fsportmap"

    const-string/jumbo v7, "File System Port Map"

    const/16 v8, 0x10fd

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fsportmap"

    const-string/jumbo v7, "File System Port Map"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10fe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "net-device"

    const-string/jumbo v7, "Net Device"

    const/16 v8, 0x10fe

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10fe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "net-device"

    const-string/jumbo v7, "Net Device"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10ff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "plcy-net-svcs"

    const-string/jumbo v7, "PLCY Net Services"

    const/16 v8, 0x10ff

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x10ff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "plcy-net-svcs"

    const-string/jumbo v7, "PLCY Net Services"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1100

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pjlink"

    const-string/jumbo v7, "Projector Link"

    const/16 v8, 0x1100

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1100

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pjlink"

    const-string/jumbo v7, "Projector Link"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1101

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "f5-iquery"

    const-string/jumbo v7, "F5 iQuery"

    const/16 v8, 0x1101

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1101

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "f5-iquery"

    const-string/jumbo v7, "F5 iQuery"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1102

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qsnet-trans"

    const-string/jumbo v7, "QSNet Transmitter"

    const/16 v8, 0x1102

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1102

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qsnet-trans"

    const-string/jumbo v7, "QSNet Transmitter"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1103

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qsnet-workst"

    const-string/jumbo v7, "QSNet Workstation"

    const/16 v8, 0x1103

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1103

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qsnet-workst"

    const-string/jumbo v7, "QSNet Workstation"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1104

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qsnet-assist"

    const-string/jumbo v7, "QSNet Assistant"

    const/16 v8, 0x1104

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1104

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qsnet-assist"

    const-string/jumbo v7, "QSNet Assistant"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1105

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qsnet-cond"

    const-string/jumbo v7, "QSNet Conductor"

    const/16 v8, 0x1105

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1105

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qsnet-cond"

    const-string/jumbo v7, "QSNet Conductor"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1106

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qsnet-nucl"

    const-string/jumbo v7, "QSNet Nucleus"

    const/16 v8, 0x1106

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1106

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qsnet-nucl"

    const-string/jumbo v7, "QSNet Nucleus"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1107

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "omabcastltkm"

    const-string/jumbo v7, "OMA BCAST Long-Term Key Messages"

    const/16 v8, 0x1107

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1107

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "omabcastltkm"

    const-string/jumbo v7, "OMA BCAST Long-Term Key Messages"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1108

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "matrix-vnet"

    const-string/jumbo v8, "Matrix VNet Communication Protocol"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "matrix_vnet"

    const-string/jumbo v8, "Matrix VNet Communication Protocol"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1109

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1109

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1109

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nacnl"

    const-string/jumbo v7, "NavCom Discovery and Control Port"

    const/16 v8, 0x1109

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x110a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x110a

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x110a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afore-vdp-disc"

    const-string v7, "AFORE vNode Discovery protocol"

    const/16 v8, 0x110a

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x110e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "shadowstream"

    const-string/jumbo v7, "ShadowStream System"

    const/16 v8, 0x110e

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x110e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x110e

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x110f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x110f

    const-string/jumbo v7, "Unassigned"

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1110

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wxbrief"

    const-string/jumbo v8, "WeatherBrief Direct"

    const/16 v10, 0x1110

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1110

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wxbrief"

    const-string/jumbo v8, "WeatherBrief Direct"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1111

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "epmd"

    const-string/jumbo v8, "Erlang Port Mapper Daemon"

    const/16 v10, 0x1111

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1111

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "epmd"

    const-string/jumbo v8, "Erlang Port Mapper Daemon"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1112

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "elpro-tunnel"

    const-string/jumbo v10, "ELPRO V2 Protocol Tunnel"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "elpro_tunnel"

    const-string/jumbo v10, "ELPRO V2 Protocol Tunnel"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "elpro-tunnel"

    const-string/jumbo v10, "ELPRO V2 Protocol Tunnel"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "elpro_tunnel"

    const-string/jumbo v10, "ELPRO V2 Protocol Tunnel"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1113

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l2c-control"

    const-string/jumbo v8, "LAN2CAN Control"

    const/16 v10, 0x1113

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1113

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l2c-disc"

    const-string/jumbo v8, "LAN2CAN Discovery"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1114

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l2c-data"

    const-string/jumbo v8, "LAN2CAN Data"

    const/16 v10, 0x1114

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1114

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l2c-data"

    const-string/jumbo v8, "LAN2CAN Data"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1115

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "remctl"

    const-string/jumbo v8, "Remote Authenticated Command Service"

    const/16 v10, 0x1115

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1115

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "remctl"

    const-string/jumbo v8, "Remote Authenticated Command Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1116

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "psi-ptt"

    const-string/jumbo v8, "PSI Push-to-Talk Protocol"

    const/16 v10, 0x1116

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1116

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1116

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1117

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tolteces"

    const-string/jumbo v8, "Toltec EasyShare"

    const/16 v10, 0x1117

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1117

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tolteces"

    const-string/jumbo v8, "Toltec EasyShare"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1118

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bip"

    const-string v8, "BioAPI Interworking"

    const/16 v10, 0x1118

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1118

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bip"

    const-string v8, "BioAPI Interworking"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1119

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cp-spxsvr"

    const-string v8, "Cambridge Pixel SPx Server"

    const/16 v10, 0x1119

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1119

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cp-spxsvr"

    const-string v8, "Cambridge Pixel SPx Server"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x111a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cp-spxdpy"

    const-string v8, "Cambridge Pixel SPx Display"

    const/16 v10, 0x111a

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x111a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cp-spxdpy"

    const-string v8, "Cambridge Pixel SPx Display"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x111b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctdb"

    const-string v8, "CTDB"

    const/16 v10, 0x111b

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x111b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctdb"

    const-string v8, "CTDB"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1125

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xandros-cms"

    const-string/jumbo v8, "Xandros Community Management Service"

    const/16 v10, 0x1125

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1125

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xandros-cms"

    const-string/jumbo v8, "Xandros Community Management Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1126

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wiegand"

    const-string/jumbo v8, "Physical Access Control"

    const/16 v10, 0x1126

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1126

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wiegand"

    const-string/jumbo v8, "Physical Access Control"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1127

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apwi-imserver"

    const-string v8, "American Printware IMServer Protocol"

    const/16 v10, 0x1127

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1127

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1127

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1128

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apwi-rxserver"

    const-string v8, "American Printware RXServer Protocol"

    const/16 v10, 0x1128

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1128

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1128

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1129

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apwi-rxspooler"

    const-string v8, "American Printware RXSpooler Protocol"

    const/16 v10, 0x1129

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1129

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1129

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x112a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x112a

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x112a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apwi-disc"

    const-string v8, "American Printware Discovery"

    const/16 v10, 0x112a

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x112b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "omnivisionesx"

    const-string/jumbo v8, "OmniVision communication for Virtual environments"

    const/16 v10, 0x112b

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x112b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "omnivisionesx"

    const-string/jumbo v8, "OmniVision communication for Virtual environments"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x112c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fly"

    const-string/jumbo v8, "Fly Object Space"

    const/16 v10, 0x112c

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x112c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x112c

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1130

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-srv"

    const-string v8, "ASIGRA Services"

    const/16 v10, 0x1130

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1130

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-srv"

    const-string v8, "ASIGRA Services"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1131

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-srvr"

    const-string v8, "ASIGRA Televaulting DS-System Service"

    const/16 v10, 0x1131

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1131

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-srvr"

    const-string v8, "ASIGRA Televaulting DS-System Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1132

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-clnt"

    const-string v8, "ASIGRA Televaulting DS-Client Service"

    const/16 v10, 0x1132

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1132

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-clnt"

    const-string v8, "ASIGRA Televaulting DS-Client Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1133

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-user"

    const-string v8, "ASIGRA Televaulting DS-Client Monitoring/Management"

    const/16 v10, 0x1133

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1133

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-user"

    const-string v8, "ASIGRA Televaulting DS-Client Monitoring/Management"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1134

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-admin"

    const-string v8, "ASIGRA Televaulting DS-System Monitoring/Management"

    const/16 v10, 0x1134

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1134

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-admin"

    const-string v8, "ASIGRA Televaulting DS-System Monitoring/Management"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1135

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-mail"

    const-string v8, "ASIGRA Televaulting Message Level Restore service"

    const/16 v10, 0x1135

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1135

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-mail"

    const-string v8, "ASIGRA Televaulting Message Level Restore service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1136

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-slp"

    const-string v8, "ASIGRA Televaulting DS-Sleeper Service"

    const/16 v10, 0x1136

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1136

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ds-slp"

    const-string v8, "ASIGRA Televaulting DS-Sleeper Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1137

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nacagent"

    const-string/jumbo v8, "Network Access Control Agent"

    const/16 v10, 0x1137

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1137

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1137

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1138

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "slscc"

    const-string/jumbo v8, "SLS Technology Control Centre"

    const/16 v10, 0x1138

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1138

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1138

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1139

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netcabinet-com"

    const-string/jumbo v8, "Net-Cabinet comunication"

    const/16 v10, 0x1139

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1139

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1139

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x113a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "itwo-server"

    const-string/jumbo v8, "RIB iTWO Application Server"

    const/16 v10, 0x113a

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x113a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x113a

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x113b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "found"

    const-string/jumbo v8, "Found Messaging Protocol"

    const/16 v10, 0x113b

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x113b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x113b

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x113c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x113c

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x113c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smallchat"

    const-string/jumbo v8, "SmallChat"

    const/16 v10, 0x113c

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x113d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "avi-nms"

    const-string v8, "AVI Systems NMS"

    const/16 v10, 0x113d

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x113d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "avi-nms-disc"

    const-string v8, "AVI Systems NMS"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x113e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "updog"

    const-string/jumbo v8, "Updog Monitoring and Status Framework"

    const/16 v10, 0x113e

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x113e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x113e

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x113f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "brcd-vr-req"

    const-string v8, "Brocade Virtual Router Request"

    const/16 v10, 0x113f

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x113f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x113f

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1140

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pjj-player"

    const-string/jumbo v8, "PJJ Media Player"

    const/16 v10, 0x1140

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1140

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pjj-player-disc"

    const-string/jumbo v8, "PJJ Media Player discovery"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1141

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "workflowdir"

    const-string/jumbo v8, "Workflow Director Communication"

    const/16 v10, 0x1141

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1141

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1141

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1142

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1142

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1142

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "axysbridge"

    const-string v8, "AXYS communication protocol"

    const/16 v10, 0x1142

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1143

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cbp"

    const-string v8, "Colnod Binary Protocol"

    const/16 v10, 0x1143

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1143

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1143

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1144

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nvme"

    const-string/jumbo v8, "NVM Express over Fabrics storage access"

    const/16 v10, 0x1144

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1144

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nvme"

    const-string/jumbo v8, "NVM Express over Fabrics storage access"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1145

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scaleft"

    const-string/jumbo v8, "Multi-Platform Remote Management for Cloud Infrastructure"

    const/16 v10, 0x1145

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1145

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1145

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1146

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tsepisp"

    const-string/jumbo v8, "TSEP Installation Service Protocol"

    const/16 v10, 0x1146

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1146

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1146

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1147

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "thingkit"

    const-string/jumbo v8, "thingkit secure mesh"

    const/16 v10, 0x1147

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1147

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1147

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1148

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1148

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1149

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netrockey6"

    const-string/jumbo v8, "NetROCKEY6 SMART Plus Service"

    const/16 v10, 0x1149

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1149

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netrockey6"

    const-string/jumbo v8, "NetROCKEY6 SMART Plus Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x114a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "beacon-port-2"

    const-string/jumbo v8, "SMARTS Beacon Port"

    const/16 v10, 0x114a

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x114a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "beacon-port-2"

    const-string/jumbo v8, "SMARTS Beacon Port"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x114b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "drizzle"

    const-string v8, "Drizzle database server"

    const/16 v10, 0x114b

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x114b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x114b

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x114c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "omviserver"

    const-string/jumbo v8, "OMV-Investigation Server-Client"

    const/16 v10, 0x114c

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x114c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x114c

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x114d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "omviagent"

    const-string/jumbo v8, "OMV Investigation Agent-Server"

    const/16 v10, 0x114d

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x114d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x114d

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x114e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rsqlserver"

    const-string/jumbo v8, "REAL SQL Server"

    const/16 v10, 0x114e

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x114e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rsqlserver"

    const-string/jumbo v8, "REAL SQL Server"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x114f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wspipe"

    const-string/jumbo v8, "adWISE Pipe"

    const/16 v10, 0x114f

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x114f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x114f

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1150

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l-acoustics"

    const-string/jumbo v8, "L-ACOUSTICS management"

    const/16 v10, 0x1150

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1150

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l-acoustics"

    const-string/jumbo v8, "L-ACOUSTICS management"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1151

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vop"

    const-string/jumbo v8, "Versile Object Protocol"

    const/16 v10, 0x1151

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1151

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1151

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1159

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1159

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1159

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netblox"

    const-string/jumbo v8, "Netblox Protocol"

    const/16 v10, 0x1159

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x115a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "saris"

    const-string/jumbo v8, "Saris"

    const/16 v10, 0x115a

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x115a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "saris"

    const-string/jumbo v8, "Saris"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x115b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pharos"

    const-string/jumbo v8, "Pharos"

    const/16 v10, 0x115b

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x115b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pharos"

    const-string/jumbo v8, "Pharos"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x115c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "krb524"

    const-string/jumbo v10, "KRB524"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "krb524"

    const-string/jumbo v10, "KRB524"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "nv-video"

    const-string/jumbo v10, "NV Video default"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "nv-video"

    const-string/jumbo v10, "NV Video default"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x115d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "upnotifyp"

    const-string/jumbo v8, "UPNOTIFYP"

    const/16 v10, 0x115d

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x115d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "upnotifyp"

    const-string/jumbo v8, "UPNOTIFYP"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x115e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "n1-fwp"

    const-string/jumbo v8, "N1-FWP"

    const/16 v10, 0x115e

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x115e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "n1-fwp"

    const-string/jumbo v8, "N1-FWP"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x115f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "n1-rmgmt"

    const-string/jumbo v8, "N1-RMGMT"

    const/16 v10, 0x115f

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x115f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "n1-rmgmt"

    const-string/jumbo v8, "N1-RMGMT"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1160

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asc-slmd"

    const-string v8, "ASC Licence Manager"

    const/16 v10, 0x1160

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1160

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asc-slmd"

    const-string v8, "ASC Licence Manager"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1161

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "privatewire"

    const-string/jumbo v8, "PrivateWire"

    const/16 v10, 0x1161

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1161

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "privatewire"

    const-string/jumbo v8, "PrivateWire"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1162

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "camp"

    const-string v8, "Common ASCII Messaging Protocol"

    const/16 v10, 0x1162

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1162

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "camp"

    const-string v8, "Common ASCII Messaging Protocol"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1163

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctisystemmsg"

    const-string v8, "CTI System Msg"

    const/16 v10, 0x1163

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1163

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctisystemmsg"

    const-string v8, "CTI System Msg"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1164

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctiprogramload"

    const-string v8, "CTI Program Load"

    const/16 v10, 0x1164

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1164

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctiprogramload"

    const-string v8, "CTI Program Load"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1165

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nssalertmgr"

    const-string/jumbo v8, "NSS Alert Manager"

    const/16 v10, 0x1165

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1165

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nssalertmgr"

    const-string/jumbo v8, "NSS Alert Manager"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1166

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nssagentmgr"

    const-string/jumbo v8, "NSS Agent Manager"

    const/16 v10, 0x1166

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1166

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nssagentmgr"

    const-string/jumbo v8, "NSS Agent Manager"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1167

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prchat-user"

    const-string/jumbo v8, "PR Chat User"

    const/16 v10, 0x1167

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1167

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prchat-user"

    const-string/jumbo v8, "PR Chat User"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1168

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prchat-server"

    const-string/jumbo v8, "PR Chat Server"

    const/16 v10, 0x1168

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1168

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prchat-server"

    const-string/jumbo v8, "PR Chat Server"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1169

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prRegister"

    const-string/jumbo v8, "PR Register"

    const/16 v10, 0x1169

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1169

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prRegister"

    const-string/jumbo v8, "PR Register"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x116a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mcp"

    const-string/jumbo v8, "Matrix Configuration Protocol"

    const/16 v10, 0x116a

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x116a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mcp"

    const-string/jumbo v8, "Matrix Configuration Protocol"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x116b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x116b

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x116c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ntske"

    const-string/jumbo v8, "Network Time Security Key Establishment"

    const/16 v10, 0x116c

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x116c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x116c

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1184

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpssmgmt"

    const-string/jumbo v8, "hpssmgmt service"

    const/16 v10, 0x1184

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1184

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpssmgmt"

    const-string/jumbo v8, "hpssmgmt service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1185

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "assyst-dr"

    const-string v8, "Assyst Data Repository Service"

    const/16 v10, 0x1185

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1185

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1185

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1186

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icms"

    const-string/jumbo v8, "Integrated Client Message Service"

    const/16 v10, 0x1186

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1186

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icms"

    const-string/jumbo v8, "Integrated Client Message Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1187

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prex-tcp"

    const-string/jumbo v8, "Protocol for Remote Execution over TCP"

    const/16 v10, 0x1187

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1187

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1187

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1188

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "awacs-ice"

    const-string v8, "Apple Wide Area Connectivity Service ICE Bootstrap"

    const/16 v10, 0x1188

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1188

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "awacs-ice"

    const-string v8, "Apple Wide Area Connectivity Service ICE Bootstrap"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1194

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ipsec-nat-t"

    const-string/jumbo v8, "IPsec NAT-Traversal"

    const/16 v10, 0x1194

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1194

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ipsec-nat-t"

    const-string/jumbo v8, "IPsec NAT-Traversal"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1195

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1195

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1196

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a25-fap-fgw"

    const-string v8, "A25 (FAP-FGW)"

    const/16 v10, 0x1196

    invoke-direct {v1, v10, v2, v9, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11b6

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "armagetronad"

    const-string v8, "Armagetron Advanced Game Server"

    const/16 v10, 0x11b6

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ehs"

    const-string/jumbo v8, "Event Heap Server"

    const/16 v10, 0x11b7

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ehs"

    const-string/jumbo v8, "Event Heap Server"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ehs-ssl"

    const-string/jumbo v8, "Event Heap Server SSL"

    const/16 v10, 0x11b8

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ehs-ssl"

    const-string/jumbo v8, "Event Heap Server SSL"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wssauthsvc"

    const-string/jumbo v8, "WSS Security Service"

    const/16 v10, 0x11b9

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wssauthsvc"

    const-string/jumbo v8, "WSS Security Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "swx-gate"

    const-string/jumbo v8, "Software Data Exchange Gateway"

    const/16 v10, 0x11ba

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "swx-gate"

    const-string/jumbo v8, "Software Data Exchange Gateway"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "worldscores"

    const-string/jumbo v8, "WorldScores"

    const/16 v10, 0x11c1

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "worldscores"

    const-string/jumbo v8, "WorldScores"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sf-lm"

    const-string/jumbo v8, "SF License Manager (Sentinel)"

    const/16 v10, 0x11c2

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sf-lm"

    const-string/jumbo v8, "SF License Manager (Sentinel)"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lanner-lm"

    const-string/jumbo v8, "Lanner License Manager"

    const/16 v10, 0x11c3

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lanner-lm"

    const-string/jumbo v8, "Lanner License Manager"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synchromesh"

    const-string/jumbo v8, "Synchromesh"

    const/16 v10, 0x11c4

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synchromesh"

    const-string/jumbo v8, "Synchromesh"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aegate"

    const-string v8, "Aegate PMR Service"

    const/16 v10, 0x11c5

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aegate"

    const-string v8, "Aegate PMR Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gds-adppiw-db"

    const-string/jumbo v8, "Perman I Interbase Server"

    const/16 v10, 0x11c6

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gds-adppiw-db"

    const-string/jumbo v8, "Perman I Interbase Server"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ieee-mih"

    const-string/jumbo v8, "MIH Services"

    const/16 v10, 0x11c7

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ieee-mih"

    const-string/jumbo v8, "MIH Services"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "menandmice-mon"

    const-string/jumbo v8, "Men and Mice Monitoring"

    const/16 v10, 0x11c8

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "menandmice-mon"

    const-string/jumbo v8, "Men and Mice Monitoring"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icshostsvc"

    const-string/jumbo v8, "ICS host services"

    const/16 v10, 0x11c9

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11c9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11c9

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11ca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msfrs"

    const-string/jumbo v8, "MS FRS Replication"

    const/16 v10, 0x11ca

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11ca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msfrs"

    const-string/jumbo v8, "MS FRS Replication"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11cb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rsip"

    const-string/jumbo v8, "RSIP Port"

    const/16 v10, 0x11cb

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11cb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rsip"

    const-string/jumbo v8, "RSIP Port"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11cc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "dtn-bundle"

    const-string v10, "DTN Bundle TCP CL Protocol"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "dtn-bundle"

    const-string v10, "DTN Bundle UDP CL Protocol"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "dccp"

    const-string v10, "DTN Bundle DCCP CL Protocol"

    const-string/jumbo v11, "dtn-bundle"

    invoke-direct {v2, v0, v11, v8, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11cd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11cd

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11cd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mtcevrunqss"

    const-string/jumbo v8, "Marathon everRun Quorum Service Server"

    const/16 v10, 0x11cd

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11ce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11ce

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11ce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mtcevrunqman"

    const-string/jumbo v8, "Marathon everRun Quorum Service Manager"

    const/16 v10, 0x11ce

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11cf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hylafax"

    const-string/jumbo v8, "HylaFAX"

    const/16 v10, 0x11cf

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11cf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hylafax"

    const-string/jumbo v8, "HylaFAX"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11d3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amahi-anywhere"

    const-string v8, "Amahi Anywhere"

    const/16 v10, 0x11d3

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11d3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11d3

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11d6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kwtc"

    const-string/jumbo v8, "Kids Watch Time Control Service"

    const/16 v10, 0x11d6

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11d6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kwtc"

    const-string/jumbo v8, "Kids Watch Time Control Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11d7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tram"

    const-string/jumbo v8, "TRAM"

    const/16 v10, 0x11d7

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11d7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tram"

    const-string/jumbo v8, "TRAM"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11d8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bmc-reporting"

    const-string v8, "BMC Reporting"

    const/16 v10, 0x11d8

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11d8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bmc-reporting"

    const-string v8, "BMC Reporting"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11d9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iax"

    const-string/jumbo v8, "Inter-Asterisk eXchange"

    const/16 v10, 0x11d9

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11d9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iax"

    const-string/jumbo v8, "Inter-Asterisk eXchange"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11da

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "deploymentmap"

    const-string/jumbo v8, "Service to distribute and update within a site deployment information for Oracle Communications Suite"

    const/16 v10, 0x11da

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11da

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11da

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cardifftec-back"

    const-string v8, "A port for communication between a server and client for a custom backup system"

    const/16 v10, 0x11dd

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11dd

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rid"

    const-string/jumbo v8, "RID over HTTP/TLS"

    const/16 v10, 0x11ee

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11ee

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l3t-at-an"

    const-string/jumbo v8, "HRPD L3T (AT-AN)"

    const/16 v10, 0x11ef

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l3t-at-an"

    const-string/jumbo v8, "HRPD L3T (AT-AN)"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11f0

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hrpd-ith-at-an"

    const-string/jumbo v8, "HRPD-ITH (AT-AN)"

    const/16 v10, 0x11f0

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ipt-anri-anri"

    const-string/jumbo v8, "IPT (ANRI-ANRI)"

    const/16 v10, 0x11f1

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ipt-anri-anri"

    const-string/jumbo v8, "IPT (ANRI-ANRI)"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ias-session"

    const-string/jumbo v8, "IAS-Session (ANRI-ANRI)"

    const/16 v10, 0x11f2

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ias-session"

    const-string/jumbo v8, "IAS-Session (ANRI-ANRI)"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ias-paging"

    const-string/jumbo v8, "IAS-Paging (ANRI-ANRI)"

    const/16 v10, 0x11f3

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ias-paging"

    const-string/jumbo v8, "IAS-Paging (ANRI-ANRI)"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ias-neighbor"

    const-string/jumbo v8, "IAS-Neighbor (ANRI-ANRI)"

    const/16 v10, 0x11f4

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ias-neighbor"

    const-string/jumbo v8, "IAS-Neighbor (ANRI-ANRI)"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a21-an-1xbs"

    const-string v8, "A21 (AN-1xBS)"

    const/16 v10, 0x11f5

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a21-an-1xbs"

    const-string v8, "A21 (AN-1xBS)"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a16-an-an"

    const-string v8, "A16 (AN-AN)"

    const/16 v10, 0x11f6

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a16-an-an"

    const-string v8, "A16 (AN-AN)"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a17-an-an"

    const-string v8, "A17 (AN-AN)"

    const/16 v10, 0x11f7

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a17-an-an"

    const-string v8, "A17 (AN-AN)"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "piranha1"

    const-string/jumbo v8, "Piranha1"

    const/16 v10, 0x11f8

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "piranha1"

    const-string/jumbo v8, "Piranha1"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "piranha2"

    const-string/jumbo v8, "Piranha2"

    const/16 v10, 0x11f9

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11f9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "piranha2"

    const-string/jumbo v8, "Piranha2"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11fa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mtsserver"

    const-string/jumbo v8, "EAX MTS Server"

    const/16 v10, 0x11fa

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11fa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11fa

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11fb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "menandmice-upg"

    const-string/jumbo v8, "Men & Mice Upgrade Agent"

    const/16 v10, 0x11fb

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11fb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11fb

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "irp"

    const-string/jumbo v8, "Identity Registration Protocol"

    const/16 v10, 0x11fc

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11fc

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sixchat"

    const-string v8, "Direct End to End Secure Chat Protocol"

    const/16 v10, 0x11fd

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11fd

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11fe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sixid"

    const-string/jumbo v8, "Secure ID to IP registration and lookup"

    const/16 v10, 0x11fe

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x11fe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x11fe

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x120d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x120d

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x120d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ventoso"

    const-string v8, "Bidirectional single port remote radio VOIP and Control stream"

    const/16 v10, 0x120d

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1226

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dots-signal"

    const-string v8, "Distributed Denial-of-Service Open Threat Signaling (DOTS) \n      Signal Channel Protocol. The service name is used to construct the SRV \n      service names \"_dots-signal._udp\" and \"_dots-signal._tcp\" for \n      discovering DOTS servers used to establish DOTS signal channel."

    const/16 v10, 0x1226

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1226

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dots-signal"

    const-string v8, "Distributed Denial-of-Service Open Threat Signaling (DOTS) \n      Signal Channel Protocol. The service name is used to construct the SRV \n      service names \"_dots-signal._udp\" and \"_dots-signal._tcp\" for \n      discovering DOTS servers used to establish DOTS signal channel."

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1232

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "playsta2-app"

    const-string/jumbo v8, "PlayStation2 App Port"

    const/16 v10, 0x1232

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1232

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "playsta2-app"

    const-string/jumbo v8, "PlayStation2 App Port"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1233

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "playsta2-lob"

    const-string/jumbo v8, "PlayStation2 Lobby Port"

    const/16 v10, 0x1233

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1233

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "playsta2-lob"

    const-string/jumbo v8, "PlayStation2 Lobby Port"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1234

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smaclmgr"

    const-string/jumbo v8, "smaclmgr"

    const/16 v10, 0x1234

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1234

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smaclmgr"

    const-string/jumbo v8, "smaclmgr"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1235

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kar2ouche"

    const-string/jumbo v8, "Kar2ouche Peer location service"

    const/16 v10, 0x1235

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1235

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kar2ouche"

    const-string/jumbo v8, "Kar2ouche Peer location service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1236

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oms"

    const-string/jumbo v8, "OrbitNet Message Service"

    const/16 v10, 0x1236

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1236

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oms"

    const-string/jumbo v8, "OrbitNet Message Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1237

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "noteit"

    const-string/jumbo v8, "Note It! Message Service"

    const/16 v10, 0x1237

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1237

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "noteit"

    const-string/jumbo v8, "Note It! Message Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1238

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ems"

    const-string/jumbo v8, "Rimage Messaging Server"

    const/16 v10, 0x1238

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1238

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ems"

    const-string/jumbo v8, "Rimage Messaging Server"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1239

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "contclientms"

    const-string v8, "Container Client Message Service"

    const/16 v10, 0x1239

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1239

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "contclientms"

    const-string v8, "Container Client Message Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x123a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eportcomm"

    const-string v8, "E-Port Message Service"

    const/16 v10, 0x123a

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x123a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eportcomm"

    const-string v8, "E-Port Message Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x123b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mmacomm"

    const-string/jumbo v8, "MMA Comm Services"

    const/16 v10, 0x123b

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x123b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mmacomm"

    const-string/jumbo v8, "MMA Comm Services"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x123c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mmaeds"

    const-string/jumbo v8, "MMA EDS Service"

    const/16 v10, 0x123c

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x123c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mmaeds"

    const-string/jumbo v8, "MMA EDS Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x123d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eportcommdata"

    const-string v8, "E-Port Data Service"

    const/16 v10, 0x123d

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x123d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eportcommdata"

    const-string v8, "E-Port Data Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x123e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "light"

    const-string/jumbo v8, "Light packets transfer protocol"

    const/16 v10, 0x123e

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x123e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "light"

    const-string/jumbo v8, "Light packets transfer protocol"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x123f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acter"

    const-string v8, "Bull RSF action server"

    const/16 v10, 0x123f

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x123f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acter"

    const-string v8, "Bull RSF action server"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1240

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rfa"

    const-string/jumbo v8, "remote file access server"

    const/16 v10, 0x1240

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1240

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rfa"

    const-string/jumbo v8, "remote file access server"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1241

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cxws"

    const-string v8, "CXWS Operations"

    const/16 v10, 0x1241

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1241

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cxws"

    const-string v8, "CXWS Operations"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1242

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "appiq-mgmt"

    const-string v8, "AppIQ Agent Management"

    const/16 v10, 0x1242

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1242

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "appiq-mgmt"

    const-string v8, "AppIQ Agent Management"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1243

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dhct-status"

    const-string v8, "BIAP Device Status"

    const/16 v10, 0x1243

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1243

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dhct-status"

    const-string v8, "BIAP Device Status"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1244

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dhct-alerts"

    const-string v8, "BIAP Generic Alert"

    const/16 v10, 0x1244

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1244

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dhct-alerts"

    const-string v8, "BIAP Generic Alert"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1245

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bcs"

    const-string v8, "Business Continuity Servi"

    const/16 v10, 0x1245

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1245

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bcs"

    const-string v8, "Business Continuity Servi"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1246

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "traversal"

    const-string/jumbo v8, "boundary traversal"

    const/16 v10, 0x1246

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1246

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "traversal"

    const-string/jumbo v8, "boundary traversal"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1247

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mgesupervision"

    const-string/jumbo v8, "MGE UPS Supervision"

    const/16 v10, 0x1247

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1247

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mgesupervision"

    const-string/jumbo v8, "MGE UPS Supervision"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1248

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mgemanagement"

    const-string/jumbo v8, "MGE UPS Management"

    const/16 v10, 0x1248

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1248

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mgemanagement"

    const-string/jumbo v8, "MGE UPS Management"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1249

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "parliant"

    const-string/jumbo v8, "Parliant Telephony System"

    const/16 v10, 0x1249

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1249

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "parliant"

    const-string/jumbo v8, "Parliant Telephony System"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x124a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "finisar"

    const-string/jumbo v8, "finisar"

    const/16 v10, 0x124a

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x124a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "finisar"

    const-string/jumbo v8, "finisar"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x124b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spike"

    const-string/jumbo v8, "Spike Clipboard Service"

    const/16 v10, 0x124b

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x124b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spike"

    const-string/jumbo v8, "Spike Clipboard Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x124c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rfid-rp1"

    const-string/jumbo v8, "RFID Reader Protocol 1.0"

    const/16 v10, 0x124c

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x124c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rfid-rp1"

    const-string/jumbo v8, "RFID Reader Protocol 1.0"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x124d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "autopac"

    const-string v8, "Autopac Protocol"

    const/16 v10, 0x124d

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x124d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "autopac"

    const-string v8, "Autopac Protocol"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x124e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msp-os"

    const-string/jumbo v8, "Manina Service Protocol"

    const/16 v10, 0x124e

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x124e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msp-os"

    const-string/jumbo v8, "Manina Service Protocol"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x124f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nst"

    const-string/jumbo v8, "Network Scanner Tool FTP"

    const/16 v10, 0x124f

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x124f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nst"

    const-string/jumbo v8, "Network Scanner Tool FTP"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1250

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mobile-p2p"

    const-string/jumbo v8, "Mobile P2P Service"

    const/16 v10, 0x1250

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1250

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mobile-p2p"

    const-string/jumbo v8, "Mobile P2P Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1251

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "altovacentral"

    const-string v8, "Altova DatabaseCentral"

    const/16 v10, 0x1251

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1251

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "altovacentral"

    const-string v8, "Altova DatabaseCentral"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1252

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prelude"

    const-string/jumbo v8, "Prelude IDS message proto"

    const/16 v10, 0x1252

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1252

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prelude"

    const-string/jumbo v8, "Prelude IDS message proto"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1253

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mtn"

    const-string/jumbo v8, "monotone Netsync Protocol"

    const/16 v10, 0x1253

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1253

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mtn"

    const-string/jumbo v8, "monotone Netsync Protocol"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1254

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "conspiracy"

    const-string v8, "Conspiracy messaging"

    const/16 v10, 0x1254

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1254

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "conspiracy"

    const-string v8, "Conspiracy messaging"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x125c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netxms-agent"

    const-string/jumbo v8, "NetXMS Agent"

    const/16 v10, 0x125c

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x125c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netxms-agent"

    const-string/jumbo v8, "NetXMS Agent"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x125d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netxms-mgmt"

    const-string/jumbo v8, "NetXMS Management"

    const/16 v10, 0x125d

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x125d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netxms-mgmt"

    const-string/jumbo v8, "NetXMS Management"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x125e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netxms-sync"

    const-string/jumbo v8, "NetXMS Server Synchronization"

    const/16 v10, 0x125e

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x125e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netxms-sync"

    const-string/jumbo v8, "NetXMS Server Synchronization"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x125f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "npqes-test"

    const-string/jumbo v8, "Network Performance Quality Evaluation System Test Service"

    const/16 v10, 0x125f

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x125f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x125f

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1260

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "assuria-ins"

    const-string v8, "Assuria Insider"

    const/16 v10, 0x1260

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1260

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1260

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1267

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "trinity-dist"

    const-string/jumbo v10, "Trinity Trust Network Node Communication"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "trinity-dist"

    const-string/jumbo v10, "Trinity Trust Network Node Communication"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "trinity-dist"

    const-string/jumbo v10, "Trinity Trust Network Node Communication"

    invoke-direct {v2, v0, v8, v9, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1275

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "truckstar"

    const-string/jumbo v8, "TruckStar Service"

    const/16 v10, 0x1275

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1275

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "truckstar"

    const-string/jumbo v8, "TruckStar Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1276

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1276

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1276

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a26-fap-fgw"

    const-string v8, "A26 (FAP-FGW)"

    const/16 v10, 0x1276

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1277

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcis"

    const-string/jumbo v8, "F-Link Client Information Service"

    const/16 v10, 0x1277

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1277

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcis-disc"

    const-string/jumbo v8, "F-Link Client Information Service Discovery"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1278

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "capmux"

    const-string v8, "CA Port Multiplexer"

    const/16 v10, 0x1278

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1278

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "capmux"

    const-string v8, "CA Port Multiplexer"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1279

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1279

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1279

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gsmtap"

    const-string/jumbo v8, "GSM Interface Tap"

    const/16 v10, 0x1279

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x127a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gearman"

    const-string/jumbo v8, "Gearman Job Queue System"

    const/16 v10, 0x127a

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x127a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gearman"

    const-string/jumbo v8, "Gearman Job Queue System"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x127b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "remcap"

    const-string/jumbo v8, "Remote Capture Protocol"

    const/16 v10, 0x127b

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x127b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x127b

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x127c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x127c

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x127c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ohmtrigger"

    const-string/jumbo v8, "OHM server trigger"

    const/16 v10, 0x127c

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x127d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "resorcs"

    const-string/jumbo v8, "RES Orchestration Catalog Services"

    const/16 v10, 0x127d

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x127d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x127d

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1281

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ipdr-sp"

    const-string/jumbo v8, "IPDR/SP"

    const/16 v10, 0x1281

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1281

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ipdr-sp"

    const-string/jumbo v8, "IPDR/SP"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1282

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "solera-lpn"

    const-string/jumbo v8, "SoleraTec Locator"

    const/16 v10, 0x1282

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1282

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "solera-lpn"

    const-string/jumbo v8, "SoleraTec Locator"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1283

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "ipfix"

    const-string/jumbo v10, "IP Flow Info Export"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "ipfix"

    const-string/jumbo v10, "IP Flow Info Export"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "ipfix"

    const-string/jumbo v10, "IP Flow Info Export"

    invoke-direct {v2, v0, v8, v9, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1284

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "ipfixs"

    const-string/jumbo v10, "ipfix protocol over TLS"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "ipfixs"

    const-string/jumbo v10, "ipfix protocol over DTLS"

    invoke-direct {v2, v0, v8, v9, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "ipfixs"

    const-string/jumbo v10, "ipfix protocol over DTLS"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1285

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lumimgrd"

    const-string/jumbo v8, "Luminizer Manager"

    const/16 v10, 0x1285

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1285

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lumimgrd"

    const-string/jumbo v8, "Luminizer Manager"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1286

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sicct"

    const-string/jumbo v8, "SICCT"

    const/16 v10, 0x1286

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1286

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sicct-sdp"

    const-string/jumbo v8, "SICCT Service Discovery Protocol"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1287

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openhpid"

    const-string/jumbo v8, "openhpi HPI service"

    const/16 v10, 0x1287

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1287

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openhpid"

    const-string/jumbo v8, "openhpi HPI service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1288

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ifsp"

    const-string/jumbo v8, "Internet File Synchronization Protocol"

    const/16 v10, 0x1288

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1288

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ifsp"

    const-string/jumbo v8, "Internet File Synchronization Protocol"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1289

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fmp"

    const-string/jumbo v8, "Funambol Mobile Push"

    const/16 v10, 0x1289

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1289

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fmp"

    const-string/jumbo v8, "Funambol Mobile Push"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x128a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x128a

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x128a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "intelliadm-disc"

    const-string/jumbo v8, "IntelliAdmin Discovery"

    const/16 v10, 0x128a

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x128b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "buschtrommel"

    const-string/jumbo v8, "peer-to-peer file exchange protocol"

    const/16 v10, 0x128b

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x128b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x128b

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x128d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "profilemac"

    const-string/jumbo v8, "Profile for Mac"

    const/16 v10, 0x128d

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x128d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "profilemac"

    const-string/jumbo v8, "Profile for Mac"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x128e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ssad"

    const-string/jumbo v8, "Simple Service Auto Discovery"

    const/16 v10, 0x128e

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x128e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ssad"

    const-string/jumbo v8, "Simple Service Auto Discovery"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x128f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spocp"

    const-string/jumbo v8, "Simple Policy Control Protocol"

    const/16 v10, 0x128f

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x128f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spocp"

    const-string/jumbo v8, "Simple Policy Control Protocol"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1290

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "snap"

    const-string/jumbo v8, "Simple Network Audio Protocol"

    const/16 v10, 0x1290

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1290

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "snap"

    const-string/jumbo v8, "Simple Network Audio Protocol"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1291

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "simon"

    const-string/jumbo v8, "Simple Invocation of Methods Over Network (SIMON)"

    const/16 v10, 0x1291

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1291

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "simon-disc"

    const-string/jumbo v8, "Simple Invocation of Methods Over Network (SIMON) Discovery"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1292

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1292

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1292

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gre-in-udp"

    const-string/jumbo v8, "GRE-in-UDP Encapsulation"

    const/16 v10, 0x1292

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1293

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1293

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1293

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gre-udp-dtls"

    const-string/jumbo v8, "GRE-in-UDP Encapsulation with DTLS"

    const/16 v10, 0x1293

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1294

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "RDCenter"

    const-string/jumbo v8, "Reticle Decision Center"

    const/16 v10, 0x1294

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1294

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1294

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12a6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "converge"

    const-string v8, "Converge RPC"

    const/16 v10, 0x12a6

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12a6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x12a6

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bfd-multi-ctl"

    const-string v8, "BFD Multihop Control"

    const/16 v10, 0x12b0

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bfd-multi-ctl"

    const-string v8, "BFD Multihop Control"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x12b1

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cncp"

    const-string v8, "Cisco Nexus Control Protocol"

    const/16 v10, 0x12b1

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smart-install"

    const-string/jumbo v8, "Smart Install Service"

    const/16 v10, 0x12b2

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x12b2

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sia-ctrl-plane"

    const-string/jumbo v8, "Service Insertion Architecture (SIA) Control-Plane"

    const/16 v10, 0x12b3

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x12b3

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xmcp"

    const-string/jumbo v8, "eXtensible Messaging Client Protocol"

    const/16 v10, 0x12b4

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x12b4

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vxlan"

    const-string/jumbo v8, "Virtual eXtensible Local Area Network (VXLAN)"

    const/16 v10, 0x12b5

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x12b5

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vxlan-gpe"

    const-string/jumbo v8, "Generic Protocol Extension for Virtual eXtensible Local Area Network (VXLAN)"

    const/16 v10, 0x12b6

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x12b6

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "roce"

    const-string/jumbo v8, "IP Routable RocE"

    const/16 v10, 0x12b7

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x12b7

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unified-bus"

    const-string/jumbo v8, "IP Routable Unified Bus"

    const/16 v10, 0x12b8

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unified-bus"

    const-string/jumbo v8, "IP Routable Unified Bus"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iims"

    const-string/jumbo v8, "Icona Instant Messenging System"

    const/16 v10, 0x12c0

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iims"

    const-string/jumbo v8, "Icona Instant Messenging System"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iwec"

    const-string/jumbo v8, "Icona Web Embedded Chat"

    const/16 v10, 0x12c1

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iwec"

    const-string/jumbo v8, "Icona Web Embedded Chat"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12c2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ilss"

    const-string/jumbo v8, "Icona License System Server"

    const/16 v10, 0x12c2

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12c2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ilss"

    const-string/jumbo v8, "Icona License System Server"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12c3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "notateit"

    const-string/jumbo v8, "Notateit Messaging"

    const/16 v10, 0x12c3

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12c3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "notateit-disc"

    const-string/jumbo v8, "Notateit Messaging Discovery"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x12c4

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aja-ntv4-disc"

    const-string v8, "AJA ntv4 Video System Discovery"

    const/16 v10, 0x12c4

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "htcp"

    const-string/jumbo v8, "HTCP"

    const/16 v10, 0x12db

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "htcp"

    const-string/jumbo v8, "HTCP"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "varadero-0"

    const-string/jumbo v8, "Varadero-0"

    const/16 v10, 0x12e5

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "varadero-0"

    const-string/jumbo v8, "Varadero-0"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "varadero-1"

    const-string/jumbo v8, "Varadero-1"

    const/16 v10, 0x12e6

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "varadero-1"

    const-string/jumbo v8, "Varadero-1"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "varadero-2"

    const-string/jumbo v8, "Varadero-2"

    const/16 v10, 0x12e7

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "varadero-2"

    const-string/jumbo v8, "Varadero-2"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "opcua-tcp"

    const-string/jumbo v8, "OPC UA Connection Protocol"

    const/16 v10, 0x12e8

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "opcua-udp"

    const-string/jumbo v8, "OPC UA Multicast Datagram Protocol"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "quosa"

    const-string/jumbo v8, "QUOSA Virtual Library Service"

    const/16 v10, 0x12e9

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "quosa"

    const-string/jumbo v8, "QUOSA Virtual Library Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gw-asv"

    const-string/jumbo v8, "nCode ICE-flow Library AppServer"

    const/16 v10, 0x12ea

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gw-asv"

    const-string/jumbo v8, "nCode ICE-flow Library AppServer"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "opcua-tls"

    const-string/jumbo v8, "OPC UA TCP Protocol over TLS/SSL"

    const/16 v10, 0x12eb

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "opcua-tls"

    const-string/jumbo v8, "OPC UA TCP Protocol over TLS/SSL"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gw-log"

    const-string/jumbo v8, "nCode ICE-flow Library LogServer"

    const/16 v10, 0x12ec

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gw-log"

    const-string/jumbo v8, "nCode ICE-flow Library LogServer"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12ed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wcr-remlib"

    const-string/jumbo v8, "WordCruncher Remote Library Service"

    const/16 v10, 0x12ed

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12ed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wcr-remlib"

    const-string/jumbo v8, "WordCruncher Remote Library Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "contamac-icm"

    const-string v10, "Contamac ICM Service"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "contamac_icm"

    const-string v10, "Contamac ICM Service"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "contamac-icm"

    const-string v10, "Contamac ICM Service"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "contamac_icm"

    const-string v10, "Contamac ICM Service"

    invoke-direct {v2, v0, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wfc"

    const-string/jumbo v8, "Web Fresh Communication"

    const/16 v10, 0x12ef

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wfc"

    const-string/jumbo v8, "Web Fresh Communication"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "appserv-http"

    const-string v8, "App Server - Admin HTTP"

    const/16 v10, 0x12f0

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "appserv-http"

    const-string v8, "App Server - Admin HTTP"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "appserv-https"

    const-string v8, "App Server - Admin HTTPS"

    const/16 v10, 0x12f1

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "appserv-https"

    const-string v8, "App Server - Admin HTTPS"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-as-nodeagt"

    const-string/jumbo v8, "Sun App Server - NA"

    const/16 v10, 0x12f2

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-as-nodeagt"

    const-string/jumbo v8, "Sun App Server - NA"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "derby-repli"

    const-string v8, "Apache Derby Replication"

    const/16 v10, 0x12f3

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x12f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "derby-repli"

    const-string v8, "Apache Derby Replication"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1303

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unify-debug"

    const-string/jumbo v8, "Unify Debugger"

    const/16 v10, 0x1303

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1303

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unify-debug"

    const-string/jumbo v8, "Unify Debugger"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1304

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "phrelay"

    const-string/jumbo v8, "Photon Relay"

    const/16 v10, 0x1304

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1304

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "phrelay"

    const-string/jumbo v8, "Photon Relay"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1305

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "phrelaydbg"

    const-string/jumbo v8, "Photon Relay Debug"

    const/16 v10, 0x1305

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1305

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "phrelaydbg"

    const-string/jumbo v8, "Photon Relay Debug"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1306

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cc-tracking"

    const-string v8, "Citcom Tracking Service"

    const/16 v10, 0x1306

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1306

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cc-tracking"

    const-string v8, "Citcom Tracking Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1307

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wired"

    const-string/jumbo v8, "Wired"

    const/16 v10, 0x1307

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1307

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wired"

    const-string/jumbo v8, "Wired"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x130c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tritium-can"

    const-string/jumbo v8, "Tritium CAN Bus Bridge Service"

    const/16 v10, 0x130c

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x130c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tritium-can"

    const-string/jumbo v8, "Tritium CAN Bus Bridge Service"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x130d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lmcs"

    const-string/jumbo v8, "Lighting Management Control System"

    const/16 v10, 0x130d

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x130d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lmcs"

    const-string/jumbo v8, "Lighting Management Control System"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x130e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x130e

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x130e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inst-discovery"

    const-string v8, "Agilent Instrument Discovery"

    const/16 v10, 0x130e

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x130f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsdl-event"

    const-string/jumbo v8, "WSDL Event Receiver"

    const/16 v10, 0x130f

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x130f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x130f

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1310

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hislip"

    const-string/jumbo v8, "IVI High-Speed LAN Instrument Protocol"

    const/16 v10, 0x1310

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1310

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1310

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1311

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1311

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1311

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "socp-t"

    const-string/jumbo v8, "SOCP Time Synchronization Protocol"

    const/16 v10, 0x1311

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1312

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1312

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1312

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "socp-c"

    const-string/jumbo v8, "SOCP Control Protocol"

    const/16 v10, 0x1312

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1313

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wmlserver"

    const-string/jumbo v8, "Meier-Phelps License Server"

    const/16 v10, 0x1313

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1313

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1313

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1314

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hivestor"

    const-string/jumbo v8, "HiveStor Distributed File System"

    const/16 v10, 0x1314

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1314

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hivestor"

    const-string/jumbo v8, "HiveStor Distributed File System"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1315

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "abbs"

    const-string v8, "ABBS"

    const/16 v10, 0x1315

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1315

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "abbs"

    const-string v8, "ABBS"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1318

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xcap-portal"

    const-string/jumbo v8, "xcap code analysis portal public user access"

    const/16 v10, 0x1318

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1318

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1318

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1319

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xcap-control"

    const-string/jumbo v8, "xcap code analysis portal cluster control and administration"

    const/16 v10, 0x1319

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1319

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1319

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x131e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lyskom"

    const-string/jumbo v8, "LysKOM Protocol A"

    const/16 v10, 0x131e

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x131e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lyskom"

    const-string/jumbo v8, "LysKOM Protocol A"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1323

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "radmin-port"

    const-string/jumbo v8, "RAdmin Port"

    const/16 v10, 0x1323

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1323

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "radmin-port"

    const-string/jumbo v8, "RAdmin Port"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1324

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hfcs"

    const-string/jumbo v8, "HFSQL Client/Server Database Engine"

    const/16 v10, 0x1324

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1324

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hfcs"

    const-string/jumbo v8, "HFSQL Client/Server Database Engine"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1325

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "flr-agent"

    const-string/jumbo v10, "FileLocator Remote Search Agent"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "flr_agent"

    const-string/jumbo v10, "FileLocator Remote Search Agent"

    invoke-direct {v2, v0, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1326

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "magiccontrol"

    const-string/jumbo v8, "magicCONROL RF and Data Interface"

    const/16 v10, 0x1326

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1326

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1326

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1330

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lutap"

    const-string/jumbo v8, "Technicolor LUT Access Protocol"

    const/16 v10, 0x1330

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1330

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1330

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1331

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lutcp"

    const-string/jumbo v8, "LUTher Control Protocol"

    const/16 v10, 0x1331

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1332

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bones"

    const-string v8, "Bones Remote Control"

    const/16 v10, 0x1332

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1332

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bones"

    const-string v8, "Bones Remote Control"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1333

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "frcs"

    const-string/jumbo v8, "Fibics Remote Control Service"

    const/16 v10, 0x1333

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1333

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1333

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1348

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "an-signaling"

    const-string/jumbo v8, "Signal protocol port for autonomic networking"

    const/16 v10, 0x1348

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1348

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1348

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1349

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1349

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1349

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "atsc-mh-ssc"

    const-string v8, "ATSC-M/H Service Signaling Channel"

    const/16 v10, 0x1349

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x134c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x134c

    const-string/jumbo v8, "eq-office-4940"

    const-string/jumbo v10, "Equitrac Office"

    invoke-direct {v1, v2, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x134c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v8, "eq-office-4940"

    invoke-direct {v1, v2, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x134d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x134d

    const-string/jumbo v8, "eq-office-4941"

    invoke-direct {v1, v2, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x134d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v8, "eq-office-4941"

    invoke-direct {v1, v2, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x134e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x134e

    const-string/jumbo v8, "eq-office-4942"

    invoke-direct {v1, v2, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x134e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v8, "eq-office-4942"

    invoke-direct {v1, v2, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1355

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "munin"

    const-string/jumbo v8, "Munin Graphing Framework"

    const/16 v10, 0x1355

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1355

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "munin"

    const-string/jumbo v8, "Munin Graphing Framework"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1356

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sybasesrvmon"

    const-string/jumbo v8, "Sybase Server Monitor"

    const/16 v10, 0x1356

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1356

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sybasesrvmon"

    const-string/jumbo v8, "Sybase Server Monitor"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1357

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pwgwims"

    const-string/jumbo v8, "PWG WIMS"

    const/16 v10, 0x1357

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1357

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pwgwims"

    const-string/jumbo v8, "PWG WIMS"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1358

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sagxtsds"

    const-string/jumbo v8, "SAG Directory Server"

    const/16 v10, 0x1358

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1358

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sagxtsds"

    const-string/jumbo v8, "SAG Directory Server"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1359

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dbsyncarbiter"

    const-string/jumbo v8, "Synchronization Arbiter"

    const/16 v10, 0x1359

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1359

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1359

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1369

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ccss-qmm"

    const-string v8, "CCSS QMessageMonitor"

    const/16 v10, 0x1369

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1369

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ccss-qmm"

    const-string v8, "CCSS QMessageMonitor"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x136a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ccss-qsm"

    const-string v8, "CCSS QSystemMonitor"

    const/16 v10, 0x136a

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x136a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ccss-qsm"

    const-string v8, "CCSS QSystemMonitor"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x136b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "burp"

    const-string v8, "BackUp and Restore Program"

    const/16 v10, 0x136b

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x136b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x136b

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1374

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctxs-vpp"

    const-string v8, "Citrix Virtual Path"

    const/16 v10, 0x1374

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1374

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1374

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1377

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1377

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1378

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "webyast"

    const-string/jumbo v8, "WebYast"

    const/16 v10, 0x1378

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1378

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1378

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1379

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gerhcs"

    const-string/jumbo v8, "GER HC Standard"

    const/16 v10, 0x1379

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1379

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1379

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x137a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mrip"

    const-string/jumbo v8, "Model Railway Interface Program"

    const/16 v10, 0x137a

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x137a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mrip"

    const-string/jumbo v8, "Model Railway Interface Program"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x137b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smar-se-port1"

    const-string/jumbo v8, "SMAR Ethernet Port 1"

    const/16 v10, 0x137b

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x137b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smar-se-port1"

    const-string/jumbo v8, "SMAR Ethernet Port 1"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x137c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smar-se-port2"

    const-string/jumbo v8, "SMAR Ethernet Port 2"

    const/16 v10, 0x137c

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x137c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smar-se-port2"

    const-string/jumbo v8, "SMAR Ethernet Port 2"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x137d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "parallel"

    const-string/jumbo v8, "Parallel for GAUSS (tm)"

    const/16 v10, 0x137d

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x137d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "parallel"

    const-string/jumbo v8, "Parallel for GAUSS (tm)"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x137e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "busycal"

    const-string v8, "BusySync Calendar Synch. Protocol"

    const/16 v10, 0x137e

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x137e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "busycal"

    const-string v8, "BusySync Calendar Synch. Protocol"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x137f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vrt"

    const-string/jumbo v8, "VITA Radio Transport"

    const/16 v10, 0x137f

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x137f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vrt"

    const-string/jumbo v8, "VITA Radio Transport"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1387

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hfcs-manager"

    const-string/jumbo v8, "HFSQL Client/Server Database Engine Manager"

    const/16 v10, 0x1387

    invoke-direct {v1, v10, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1387

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hfcs-manager"

    const-string/jumbo v8, "HFSQL Client/Server Database Engine Manager"

    invoke-direct {v1, v10, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1388

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1388

    const-string/jumbo v8, "commplex-main"

    const-string v10, ""

    invoke-direct {v1, v2, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1388

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v8, "commplex-main"

    invoke-direct {v1, v2, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1389

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1389

    const-string/jumbo v8, "commplex-link"

    invoke-direct {v1, v2, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1389

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v8, "commplex-link"

    invoke-direct {v1, v2, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x138a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rfe"

    const-string/jumbo v8, "radio free ethernet"

    const/16 v11, 0x138a

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x138a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rfe"

    const-string/jumbo v8, "radio free ethernet"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x138b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fmpro-internal"

    const-string/jumbo v8, "FileMaker, Inc. - Proprietary transport"

    const/16 v11, 0x138b

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x138b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fmpro-internal"

    const-string/jumbo v8, "FileMaker, Inc. - Proprietary name binding"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x138c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "avt-profile-1"

    const-string/jumbo v11, "RTP media data"

    invoke-direct {v2, v0, v8, v5, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "avt-profile-1"

    const-string/jumbo v11, "RTP media data"

    invoke-direct {v2, v0, v8, v6, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "dccp"

    const-string/jumbo v11, "RTP media data"

    const-string/jumbo v12, "avt-profile-1"

    invoke-direct {v2, v0, v12, v8, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x138d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "avt-profile-2"

    const-string/jumbo v8, "RTP control protocol"

    const/16 v11, 0x138d

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x138d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "avt-profile-2"

    const-string/jumbo v8, "RTP control protocol"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x138d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dccp"

    const-string/jumbo v8, "RTP control protocol"

    const-string/jumbo v12, "avt-profile-2"

    invoke-direct {v1, v11, v12, v2, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x138e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsm-server"

    const-string/jumbo v8, "wsm server"

    const/16 v11, 0x138e

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x138e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsm-server"

    const-string/jumbo v8, "wsm server"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x138f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsm-server-ssl"

    const-string/jumbo v8, "wsm server ssl"

    const/16 v11, 0x138f

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x138f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsm-server-ssl"

    const-string/jumbo v8, "wsm server ssl"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1390

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synapsis-edge"

    const-string/jumbo v8, "Synapsis EDGE"

    const/16 v11, 0x1390

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1390

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synapsis-edge"

    const-string/jumbo v8, "Synapsis EDGE"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1391

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "winfs"

    const-string/jumbo v8, "Microsoft Windows Filesystem"

    const/16 v11, 0x1391

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1391

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "winfs"

    const-string/jumbo v8, "Microsoft Windows Filesystem"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1392

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "telelpathstart"

    const-string/jumbo v8, "TelepathStart"

    const/16 v11, 0x1392

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1392

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "telelpathstart"

    const-string/jumbo v8, "TelepathStart"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1393

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "telelpathattack"

    const-string/jumbo v8, "TelepathAttack"

    const/16 v11, 0x1393

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1393

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "telelpathattack"

    const-string/jumbo v8, "TelepathAttack"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1394

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nsp"

    const-string/jumbo v8, "NetOnTap Service"

    const/16 v11, 0x1394

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1394

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nsp"

    const-string/jumbo v8, "NetOnTap Service"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1395

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fmpro-v6"

    const-string/jumbo v8, "FileMaker, Inc. - Proprietary transport"

    const/16 v11, 0x1395

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1395

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fmpro-v6"

    const-string/jumbo v8, "FileMaker, Inc. - Proprietary transport"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1396

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1396

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1396

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "onpsocket"

    const-string/jumbo v8, "Overlay Network Protocol"

    const/16 v11, 0x1396

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1397

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fmwp"

    const-string/jumbo v8, "FileMaker, Inc. - Web publishing"

    const/16 v11, 0x1397

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1397

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1397

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x139c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "zenginkyo-1"

    const-string/jumbo v8, "zenginkyo-1"

    const/16 v11, 0x139c

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x139c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "zenginkyo-1"

    const-string/jumbo v8, "zenginkyo-1"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x139d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "zenginkyo-2"

    const-string/jumbo v8, "zenginkyo-2"

    const/16 v11, 0x139d

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x139d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "zenginkyo-2"

    const-string/jumbo v8, "zenginkyo-2"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x139e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mice"

    const-string/jumbo v8, "mice server"

    const/16 v11, 0x139e

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x139e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mice"

    const-string/jumbo v8, "mice server"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x139f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "htuilsrv"

    const-string/jumbo v8, "Htuil Server for PLD2"

    const/16 v11, 0x139f

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x139f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "htuilsrv"

    const-string/jumbo v8, "Htuil Server for PLD2"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scpi-telnet"

    const-string/jumbo v8, "SCPI-TELNET"

    const/16 v11, 0x13a0

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scpi-telnet"

    const-string/jumbo v8, "SCPI-TELNET"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scpi-raw"

    const-string/jumbo v8, "SCPI-RAW"

    const/16 v11, 0x13a1

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scpi-raw"

    const-string/jumbo v8, "SCPI-RAW"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "strexec-d"

    const-string/jumbo v8, "Storix I/O daemon (data)"

    const/16 v11, 0x13a2

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "strexec-d"

    const-string/jumbo v8, "Storix I/O daemon (data)"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "strexec-s"

    const-string/jumbo v8, "Storix I/O daemon (stat)"

    const/16 v11, 0x13a3

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "strexec-s"

    const-string/jumbo v8, "Storix I/O daemon (stat)"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qvr"

    const-string/jumbo v8, "Quiqum Virtual Relais"

    const/16 v11, 0x13a4

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13a4

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "infobright"

    const-string/jumbo v8, "Infobright Database Server"

    const/16 v11, 0x13a5

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "infobright"

    const-string/jumbo v8, "Infobright Database Server"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13a6

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13a7

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dmp"

    const-string v8, "Direct Message Protocol"

    const/16 v11, 0x13a7

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "signacert-agent"

    const-string/jumbo v8, "SignaCert Enterprise Trust Server Agent"

    const/16 v11, 0x13a8

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13a8

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jtnetd-server"

    const-string/jumbo v8, "Janstor Secure Data"

    const/16 v11, 0x13a9

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13a9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13a9

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13aa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jtnetd-status"

    const-string/jumbo v8, "Janstor Status"

    const/16 v11, 0x13aa

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13aa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13aa

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asnaacceler8db"

    const-string/jumbo v8, "asnaacceler8db"

    const/16 v11, 0x13b2

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asnaacceler8db"

    const-string/jumbo v8, "asnaacceler8db"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "swxadmin"

    const-string/jumbo v8, "ShopWorX Administration"

    const/16 v11, 0x13b3

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "swxadmin"

    const-string/jumbo v8, "ShopWorX Administration"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lxi-evntsvc"

    const-string/jumbo v8, "LXI Event Service"

    const/16 v11, 0x13b4

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lxi-evntsvc"

    const-string/jumbo v8, "LXI Event Service"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "osp"

    const-string/jumbo v8, "Open Settlement Protocol"

    const/16 v11, 0x13b5

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13b5

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13b6

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vpm-udp"

    const-string/jumbo v8, "Vishay PM UDP Service"

    const/16 v11, 0x13b6

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13b7

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iscape"

    const-string/jumbo v8, "iSCAPE Data Broadcasting"

    const/16 v11, 0x13b7

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "texai"

    const-string/jumbo v8, "Texai Message Service"

    const/16 v11, 0x13b8

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13b8

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ivocalize"

    const-string/jumbo v8, "iVocalize Web Conference"

    const/16 v11, 0x13b9

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ivocalize"

    const-string/jumbo v8, "iVocalize Web Conference"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mmcc"

    const-string/jumbo v8, "multimedia conference control tool"

    const/16 v11, 0x13ba

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mmcc"

    const-string/jumbo v8, "multimedia conference control tool"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13bb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ita-agent"

    const-string/jumbo v8, "ITA Agent"

    const/16 v11, 0x13bb

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13bb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ita-agent"

    const-string/jumbo v8, "ITA Agent"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ita-manager"

    const-string/jumbo v8, "ITA Manager"

    const/16 v11, 0x13bc

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ita-manager"

    const-string/jumbo v8, "ITA Manager"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13bd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rlm"

    const-string/jumbo v8, "RLM License Server"

    const/16 v11, 0x13bd

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13bd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rlm-disc"

    const-string/jumbo v8, "RLM Discovery Server"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13be

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rlm-admin"

    const-string/jumbo v8, "RLM administrative interface"

    const/16 v11, 0x13be

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13be

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13be

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13bf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unot"

    const-string/jumbo v8, "UNOT"

    const/16 v11, 0x13bf

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13bf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unot"

    const-string/jumbo v8, "UNOT"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "intecom-ps1"

    const-string/jumbo v8, "Intecom Pointspan 1"

    const/16 v11, 0x13c0

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "intecom-ps1"

    const-string/jumbo v8, "Intecom Pointspan 1"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "intecom-ps2"

    const-string/jumbo v8, "Intecom Pointspan 2"

    const/16 v11, 0x13c1

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "intecom-ps2"

    const-string/jumbo v8, "Intecom Pointspan 2"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13c2

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "locus-disc"

    const-string/jumbo v8, "Locus Discovery"

    const/16 v11, 0x13c2

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sds"

    const-string/jumbo v8, "SIP Directory Services"

    const/16 v11, 0x13c3

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sds"

    const-string/jumbo v8, "SIP Directory Services"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sip"

    const-string/jumbo v8, "SIP"

    const/16 v11, 0x13c4

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sip"

    const-string/jumbo v8, "SIP"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sip"

    const-string/jumbo v8, "SIP"

    invoke-direct {v1, v11, v2, v9, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sips"

    const-string/jumbo v8, "SIP-TLS"

    const/16 v11, 0x13c5

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sips"

    const-string/jumbo v8, "SIP-TLS"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sips"

    const-string/jumbo v8, "SIP-TLS"

    invoke-direct {v1, v11, v2, v9, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "na-localise"

    const-string/jumbo v8, "Localisation access"

    const/16 v11, 0x13c6

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "na-localise"

    const-string/jumbo v8, "Localisation access"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csrpc"

    const-string/jumbo v8, "centrify secure RPC"

    const/16 v11, 0x13c7

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13c7

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ca-1"

    const-string v8, "Channel Access 1"

    const/16 v11, 0x13c8

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ca-1"

    const-string v8, "Channel Access 1"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ca-2"

    const-string v8, "Channel Access 2"

    const/16 v11, 0x13c9

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13c9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ca-2"

    const-string v8, "Channel Access 2"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "stanag-5066"

    const-string/jumbo v8, "STANAG-5066-SUBNET-INTF"

    const/16 v11, 0x13ca

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "stanag-5066"

    const-string/jumbo v8, "STANAG-5066-SUBNET-INTF"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13cb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "authentx"

    const-string v8, "Authentx Service"

    const/16 v11, 0x13cb

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13cb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "authentx"

    const-string v8, "Authentx Service"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13cc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bitforestsrv"

    const-string v8, "Bitforest Data Service"

    const/16 v11, 0x13cc

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13cc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13cc

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13cd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "i-net-2000-npr"

    const-string/jumbo v8, "I/Net 2000-NPR"

    const/16 v11, 0x13cd

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13cd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "i-net-2000-npr"

    const-string/jumbo v8, "I/Net 2000-NPR"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vtsas"

    const-string/jumbo v8, "VersaTrans Server Agent Service"

    const/16 v11, 0x13ce

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vtsas"

    const-string/jumbo v8, "VersaTrans Server Agent Service"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13cf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "powerschool"

    const-string/jumbo v8, "PowerSchool"

    const/16 v11, 0x13cf

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13cf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "powerschool"

    const-string/jumbo v8, "PowerSchool"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ayiya"

    const-string v8, "Anything In Anything"

    const/16 v11, 0x13d0

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ayiya"

    const-string v8, "Anything In Anything"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tag-pm"

    const-string v8, "Advantage Group Port Mgr"

    const/16 v11, 0x13d1

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tag-pm"

    const-string v8, "Advantage Group Port Mgr"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "alesquery"

    const-string v8, "ALES Query"

    const/16 v11, 0x13d2

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "alesquery"

    const-string v8, "ALES Query"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pvaccess"

    const-string/jumbo v8, "Experimental Physics and Industrial Control System"

    const/16 v11, 0x13d3

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13d3

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pixelpusher"

    const-string/jumbo v8, "PixelPusher pixel data"

    const/16 v11, 0x13d6

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13d6

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13d7

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cp-spxrpts"

    const-string v8, "Cambridge Pixel SPx Reports"

    const/16 v11, 0x13d7

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "onscreen"

    const-string/jumbo v8, "OnScreen Data Collection Service"

    const/16 v11, 0x13d8

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "onscreen"

    const-string/jumbo v8, "OnScreen Data Collection Service"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sdl-ets"

    const-string/jumbo v8, "SDL - Ent Trans Server"

    const/16 v11, 0x13d9

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13d9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sdl-ets"

    const-string/jumbo v8, "SDL - Ent Trans Server"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13da

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qcp"

    const-string/jumbo v8, "Qpur Communication Protocol"

    const/16 v11, 0x13da

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13da

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qcp"

    const-string/jumbo v8, "Qpur Communication Protocol"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qfp"

    const-string/jumbo v8, "Qpur File Protocol"

    const/16 v11, 0x13db

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qfp"

    const-string/jumbo v8, "Qpur File Protocol"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "llrp"

    const-string/jumbo v8, "EPCglobal Low-Level Reader Protocol"

    const/16 v11, 0x13dc

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "llrp"

    const-string/jumbo v8, "EPCglobal Low-Level Reader Protocol"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "encrypted-llrp"

    const-string/jumbo v8, "EPCglobal Encrypted LLRP"

    const/16 v11, 0x13dd

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "encrypted-llrp"

    const-string/jumbo v8, "EPCglobal Encrypted LLRP"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13de

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aprigo-cs"

    const-string v8, "Aprigo Collection Service"

    const/16 v11, 0x13de

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13de

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13de

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "biotic"

    const-string v8, "BIOTIC - Binary Internet of Things Interoperable Communication"

    const/16 v11, 0x13df

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13df

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13e2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "car"

    const-string v8, "Candidate AR"

    const/16 v11, 0x13e2

    invoke-direct {v1, v11, v2, v9, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cxtp"

    const-string v8, "Context Transfer Protocol"

    const/16 v11, 0x13e3

    invoke-direct {v1, v11, v2, v9, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13e4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13e4

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13e4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "magpie"

    const-string/jumbo v8, "Magpie Binary"

    const/16 v11, 0x13e4

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sentinel-lm"

    const-string/jumbo v8, "Sentinel LM"

    const/16 v11, 0x13e5

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sentinel-lm"

    const-string/jumbo v8, "Sentinel LM"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hart-ip"

    const-string/jumbo v8, "HART-IP"

    const/16 v11, 0x13e6

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hart-ip"

    const-string/jumbo v8, "HART-IP"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sentlm-srv2srv"

    const-string/jumbo v8, "SentLM Srv2Srv"

    const/16 v11, 0x13eb

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sentlm-srv2srv"

    const-string/jumbo v8, "SentLM Srv2Srv"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "socalia"

    const-string/jumbo v8, "Socalia service mux"

    const/16 v11, 0x13ec

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "socalia"

    const-string/jumbo v8, "Socalia service mux"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "talarian-tcp"

    const-string/jumbo v8, "Talarian_TCP"

    const/16 v11, 0x13ed

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "talarian-udp"

    const-string/jumbo v8, "Talarian_UDP"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oms-nonsecure"

    const-string/jumbo v8, "Oracle OMS non-secure"

    const/16 v11, 0x13ee

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "oms-nonsecure"

    const-string/jumbo v8, "Oracle OMS non-secure"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "actifio-c2c"

    const-string v8, "Actifio C2C"

    const/16 v11, 0x13ef

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13ef

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13f0

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tinymessage"

    const-string/jumbo v8, "TinyMessage"

    const/16 v11, 0x13f0

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13f1

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hughes-ap"

    const-string/jumbo v8, "Hughes Association Protocol"

    const/16 v11, 0x13f1

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "actifioudsagent"

    const-string v8, "Actifio UDS Agent"

    const/16 v11, 0x13f2

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13f2

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "actifioreplic"

    const-string v8, "Disk to Disk replication between Actifio Clusters"

    const/16 v11, 0x13f3

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13f3

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13f7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "taep-as-svc"

    const-string/jumbo v8, "TAEP AS service"

    const/16 v11, 0x13f7

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13f7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "taep-as-svc"

    const-string/jumbo v8, "TAEP AS service"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13f8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pm-cmdsvr"

    const-string/jumbo v8, "PeerMe Msg Cmd Service"

    const/16 v11, 0x13f8

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13f8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pm-cmdsvr"

    const-string/jumbo v8, "PeerMe Msg Cmd Service"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13f9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13f9

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13fa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ev-services"

    const-string/jumbo v8, "Enterprise Vault Services"

    const/16 v11, 0x13fa

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13fa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13fa

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13fb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "autobuild"

    const-string/jumbo v8, "Symantec Autobuild Service"

    const/16 v11, 0x13fb

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13fb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13fb

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13fc

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "emb-proj-cmd"

    const-string/jumbo v8, "EPSON Projecter Image Transfer"

    const/16 v11, 0x13fc

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gradecam"

    const-string/jumbo v8, "GradeCam Image Processing"

    const/16 v11, 0x13fd

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x13fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x13fd

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1400

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "barracuda-bbs"

    const-string v8, "Barracuda Backup Protocol"

    const/16 v11, 0x1400

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1400

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "barracuda-bbs"

    const-string v8, "Barracuda Backup Protocol"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x140d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nbt-pc"

    const-string/jumbo v8, "Policy Commander"

    const/16 v11, 0x140d

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x140d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nbt-pc"

    const-string/jumbo v8, "Policy Commander"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x140e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ppactivation"

    const-string/jumbo v8, "PP ActivationServer"

    const/16 v11, 0x140e

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x140e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x140e

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x140f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "erp-scale"

    const-string/jumbo v8, "ERP-Scale"

    const/16 v11, 0x140f

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x140f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x140f

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1410

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1410

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1410

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "minotaur-sa"

    const-string/jumbo v8, "Minotaur SA"

    const/16 v11, 0x1410

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1411

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctsd"

    const-string/jumbo v8, "MyCTS server port"

    const/16 v11, 0x1411

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1411

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctsd"

    const-string/jumbo v8, "MyCTS server port"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1419

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "rmonitor-secure"

    const-string/jumbo v11, "RMONITOR SECURE"

    invoke-direct {v2, v0, v8, v5, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "rmonitor_secure"

    const-string/jumbo v11, "RMONITOR SECURE"

    invoke-direct {v2, v0, v8, v5, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "rmonitor-secure"

    const-string/jumbo v11, "RMONITOR SECURE"

    invoke-direct {v2, v0, v8, v6, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "rmonitor_secure"

    const-string/jumbo v11, "RMONITOR SECURE"

    invoke-direct {v2, v0, v8, v6, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x141a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "social-alarm"

    const-string/jumbo v8, "Social Alarm Service"

    const/16 v11, 0x141a

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x141a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x141a

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x141e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "atmp"

    const-string v8, "Ascend Tunnel Management Protocol"

    const/16 v11, 0x141e

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x141e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "atmp"

    const-string v8, "Ascend Tunnel Management Protocol"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x141f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "esri-sde"

    const-string/jumbo v11, "ESRI SDE Instance"

    invoke-direct {v2, v0, v8, v5, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "esri_sde"

    const-string/jumbo v11, "ESRI SDE Instance"

    invoke-direct {v2, v0, v8, v5, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "esri-sde"

    const-string/jumbo v11, "ESRI SDE Remote Start"

    invoke-direct {v2, v0, v8, v6, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "esri_sde"

    const-string/jumbo v11, "ESRI SDE Remote Start"

    invoke-direct {v2, v0, v8, v6, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1420

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sde-discovery"

    const-string/jumbo v8, "ESRI SDE Instance Discovery"

    const/16 v11, 0x1420

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1420

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sde-discovery"

    const-string/jumbo v8, "ESRI SDE Instance Discovery"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1421

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1421

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1421

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1422

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bzflag"

    const-string v8, "BZFlag game server"

    const/16 v11, 0x1422

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1422

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bzflag"

    const-string v8, "BZFlag game server"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1423

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asctrl-agent"

    const-string/jumbo v8, "Oracle asControl Agent"

    const/16 v11, 0x1423

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1423

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asctrl-agent"

    const-string/jumbo v8, "Oracle asControl Agent"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1424

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rugameonline"

    const-string/jumbo v8, "Russian Online Game"

    const/16 v11, 0x1424

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1424

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1424

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1425

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mediat"

    const-string/jumbo v8, "Mediat Remote Object Exchange"

    const/16 v11, 0x1425

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1425

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1425

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1429

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "snmpssh"

    const-string/jumbo v8, "SNMP over SSH Transport Model"

    const/16 v11, 0x1429

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1429

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1429

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x142a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "snmpssh-trap"

    const-string/jumbo v8, "SNMP Notification over SSH Transport Model"

    const/16 v11, 0x142a

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x142a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x142a

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x142b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sbackup"

    const-string/jumbo v8, "Shadow Backup"

    const/16 v11, 0x142b

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x142b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x142b

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x142c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vpa"

    const-string/jumbo v8, "Virtual Protocol Adapter"

    const/16 v11, 0x142c

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x142c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vpa-disc"

    const-string/jumbo v8, "Virtual Protocol Adapter Discovery"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x142d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "ife-icorp"

    const-string/jumbo v11, "ife_1corp"

    invoke-direct {v2, v0, v8, v5, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "ife_icorp"

    const-string/jumbo v11, "ife_1corp"

    invoke-direct {v2, v0, v8, v5, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "ife-icorp"

    const-string/jumbo v11, "ife_1corp"

    invoke-direct {v2, v0, v8, v6, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "ife_icorp"

    const-string/jumbo v11, "ife_1corp"

    invoke-direct {v2, v0, v8, v6, v11}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x142e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "winpcs"

    const-string/jumbo v8, "WinPCS Service Connection"

    const/16 v11, 0x142e

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x142e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "winpcs"

    const-string/jumbo v8, "WinPCS Service Connection"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x142f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scte104"

    const-string/jumbo v8, "SCTE104 Connection"

    const/16 v11, 0x142f

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x142f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scte104"

    const-string/jumbo v8, "SCTE104 Connection"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1430

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scte30"

    const-string/jumbo v8, "SCTE30 Connection"

    const/16 v11, 0x1430

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1430

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scte30"

    const-string/jumbo v8, "SCTE30 Connection"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1434

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcoip-mgmt"

    const-string/jumbo v8, "PC over IP Endpoint Management"

    const/16 v11, 0x1434

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1434

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1434

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1446

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aol"

    const-string v8, "America-Online"

    const/16 v11, 0x1446

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1446

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aol"

    const-string v8, "America-Online"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1447

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aol-1"

    const-string v8, "AmericaOnline1"

    const/16 v11, 0x1447

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1447

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aol-1"

    const-string v8, "AmericaOnline1"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1448

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aol-2"

    const-string v8, "AmericaOnline2"

    const/16 v11, 0x1448

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1448

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aol-2"

    const-string v8, "AmericaOnline2"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1449

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aol-3"

    const-string v8, "AmericaOnline3"

    const/16 v11, 0x1449

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1449

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aol-3"

    const-string v8, "AmericaOnline3"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x144a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cpscomm"

    const-string v8, "CipherPoint Config Service"

    const/16 v11, 0x144a

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x144a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x144a

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x144b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ampl-lic"

    const-string/jumbo v8, "The protocol is used by a license server and client programs to control use of program licenses that float to networked machines"

    const/16 v11, 0x144b

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x144b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x144b

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x144c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ampl-tableproxy"

    const-string/jumbo v8, "The protocol is used by two programs that exchange \"table\" data used in the AMPL modeling language"

    const/16 v11, 0x144c

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x144c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x144c

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x144d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tunstall-lwp"

    const-string/jumbo v8, "Tunstall Lone worker device interface"

    const/16 v11, 0x144d

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x144d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x144d

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1450

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "targus-getdata"

    const-string/jumbo v8, "TARGUS GetData"

    const/16 v11, 0x1450

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1450

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "targus-getdata"

    const-string/jumbo v8, "TARGUS GetData"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1451

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "targus-getdata1"

    const-string/jumbo v8, "TARGUS GetData 1"

    const/16 v11, 0x1451

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1451

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "targus-getdata1"

    const-string/jumbo v8, "TARGUS GetData 1"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1452

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "targus-getdata2"

    const-string/jumbo v8, "TARGUS GetData 2"

    const/16 v11, 0x1452

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1452

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "targus-getdata2"

    const-string/jumbo v8, "TARGUS GetData 2"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1453

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "targus-getdata3"

    const-string/jumbo v8, "TARGUS GetData 3"

    const/16 v11, 0x1453

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1453

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "targus-getdata3"

    const-string/jumbo v8, "TARGUS GetData 3"

    invoke-direct {v1, v11, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1459

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nomad"

    const-string/jumbo v8, "Nomad Device Video Transfer"

    const/16 v11, 0x1459

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1459

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1459

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x145f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "noteza"

    const-string/jumbo v8, "NOTEZA Data Safety Service"

    const/16 v11, 0x145f

    invoke-direct {v1, v11, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x145f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x145f

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x145f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "noteza"

    const-string/jumbo v8, "NOTEZA Data Safety Service"

    invoke-direct {v1, v11, v2, v9, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1465

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3exmp"

    const-string v8, "3eTI Extensible Management Protocol for OAMP"

    const/16 v9, 0x1465

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1465

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1465

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1466

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xmpp-client"

    const-string/jumbo v8, "XMPP Client Connection"

    const/16 v9, 0x1466

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1466

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1466

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1467

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpvirtgrp"

    const-string/jumbo v8, "HP Virtual Machine Group Management"

    const/16 v9, 0x1467

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1467

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpvirtgrp"

    const-string/jumbo v8, "HP Virtual Machine Group Management"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1468

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpvirtctrl"

    const-string/jumbo v8, "HP Virtual Machine Console Operations"

    const/16 v9, 0x1468

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1468

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpvirtctrl"

    const-string/jumbo v8, "HP Virtual Machine Console Operations"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1469

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hp-server"

    const-string/jumbo v8, "HP Server"

    const/16 v9, 0x1469

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1469

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hp-server"

    const-string/jumbo v8, "HP Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x146a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hp-status"

    const-string/jumbo v8, "HP Status"

    const/16 v9, 0x146a

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x146a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hp-status"

    const-string/jumbo v8, "HP Status"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x146b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "perfd"

    const-string/jumbo v8, "HP System Performance Metric Service"

    const/16 v9, 0x146b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x146b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "perfd"

    const-string/jumbo v8, "HP System Performance Metric Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x146c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpvroom"

    const-string/jumbo v8, "HP Virtual Room Service"

    const/16 v9, 0x146c

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x146c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x146c

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x146d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jaxflow"

    const-string/jumbo v8, "Netflow/IPFIX/sFlow Collector and Forwarder Management"

    const/16 v9, 0x146d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x146d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x146d

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x146e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jaxflow-data"

    const-string/jumbo v8, "JaxMP RealFlow application and protocol data"

    const/16 v9, 0x146e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x146e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x146e

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x146f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "crusecontrol"

    const-string/jumbo v8, "Remote Control of Scan Software for Cruse Scanners"

    const/16 v9, 0x146f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x146f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x146f

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1470

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csedaemon"

    const-string v8, "Cruse Scanning System Service"

    const/16 v9, 0x1470

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1470

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1470

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1471

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "enfs"

    const-string/jumbo v8, "Etinnae Network File Service"

    const/16 v9, 0x1471

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1471

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1471

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1472

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eenet"

    const-string/jumbo v8, "EEnet communications"

    const/16 v9, 0x1472

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1472

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eenet"

    const-string/jumbo v8, "EEnet communications"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1473

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "galaxy-network"

    const-string/jumbo v8, "Galaxy Network Service"

    const/16 v9, 0x1473

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1473

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "galaxy-network"

    const-string/jumbo v8, "Galaxy Network Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1474

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1474

    const-string/jumbo v8, "padl2sim"

    invoke-direct {v1, v2, v8, v5, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1474

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v8, "padl2sim"

    invoke-direct {v1, v2, v8, v6, v10}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1475

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mnet-discovery"

    const-string/jumbo v8, "m-net discovery"

    const/16 v9, 0x1475

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1475

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mnet-discovery"

    const-string/jumbo v8, "m-net discovery"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x147a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "attune"

    const-string v8, "ATTUne API"

    const/16 v9, 0x147a

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x147a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x147a

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x147b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xycstatus"

    const-string/jumbo v8, "xyClient Status API and rendevous point"

    const/16 v9, 0x147b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x147b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x147b

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x147c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x147c

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x147d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "downtools"

    const-string v7, "DownTools Control Protocol"

    const/16 v8, 0x147d

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x147d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "downtools-disc"

    const-string v7, "DownTools Discovery Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x147e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x147e

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x147e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "capwap-control"

    const-string v7, "CAPWAP Control Protocol"

    const/16 v8, 0x147e

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x147f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x147f

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x147f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "capwap-data"

    const-string v7, "CAPWAP Data Protocol"

    const/16 v8, 0x147f

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1480

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "caacws"

    const-string v7, "CA Access Control Web Service"

    const/16 v8, 0x1480

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1480

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "caacws"

    const-string v7, "CA Access Control Web Service"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1481

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "caaclang2"

    const-string v7, "CA AC Lang Service"

    const/16 v8, 0x1481

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1481

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "caaclang2"

    const-string v7, "CA AC Lang Service"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1482

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "soagateway"

    const-string/jumbo v7, "soaGateway"

    const/16 v8, 0x1482

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1482

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "soagateway"

    const-string/jumbo v7, "soaGateway"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1483

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "caevms"

    const-string v7, "CA eTrust VM Service"

    const/16 v8, 0x1483

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1483

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "caevms"

    const-string v7, "CA eTrust VM Service"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1484

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "movaz-ssc"

    const-string/jumbo v7, "Movaz SSC"

    const/16 v8, 0x1484

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1484

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "movaz-ssc"

    const-string/jumbo v7, "Movaz SSC"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1485

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kpdp"

    const-string/jumbo v7, "Kohler Power Device Protocol"

    const/16 v8, 0x1485

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1485

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1485

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1486

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "logcabin"

    const-string/jumbo v7, "LogCabin storage service"

    const/16 v8, 0x1486

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1486

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1486

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1490

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3com-njack-1"

    const-string v7, "3Com Network Jack Port 1"

    const/16 v8, 0x1490

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1490

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3com-njack-1"

    const-string v7, "3Com Network Jack Port 1"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1491

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3com-njack-2"

    const-string v7, "3Com Network Jack Port 2"

    const/16 v8, 0x1491

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1491

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3com-njack-2"

    const-string v7, "3Com Network Jack Port 2"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1495

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xmpp-server"

    const-string/jumbo v7, "XMPP Server Connection"

    const/16 v8, 0x1495

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1495

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1495

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1496

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cartographerxmp"

    const-string v7, "Cartographer XMP"

    const/16 v8, 0x1496

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1496

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cartographerxmp"

    const-string v7, "Cartographer XMP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1497

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cuelink"

    const-string/jumbo v7, "StageSoft CueLink messaging"

    const/16 v8, 0x1497

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1497

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cuelink-disc"

    const-string/jumbo v7, "StageSoft CueLink discovery"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1498

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pk"

    const-string/jumbo v7, "PK"

    const/16 v8, 0x1498

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1498

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pk"

    const-string/jumbo v7, "PK"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14a0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xmpp-bosh"

    const-string v7, "Bidirectional-streams Over Synchronous HTTP (BOSH)"

    const/16 v8, 0x14a0

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14a0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x14a0

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "undo-lm"

    const-string/jumbo v7, "Undo License Manager"

    const/16 v8, 0x14a1

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x14a1

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14a2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "transmit-port"

    const-string/jumbo v3, "Marimba Transmitter Port"

    const/16 v4, 0x14a2

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14a2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "transmit-port"

    const-string/jumbo v3, "Marimba Transmitter Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "presence"

    const-string/jumbo v3, "XMPP Link-Local Messaging"

    const/16 v4, 0x14b2

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "presence"

    const-string/jumbo v3, "XMPP Link-Local Messaging"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
