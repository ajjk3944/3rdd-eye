.class public abstract LG7/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/HashMap;)V
    .locals 12

    const-string/jumbo v0, "x"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x14b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "NLG Data Service"

    const/16 v3, 0x14b3

    const-string/jumbo v4, "nlg-data"

    const-string/jumbo v5, "tcp"

    invoke-direct {v1, v3, v4, v5, v2}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "NLG Data Service"

    const-string/jumbo v4, "nlg-data"

    const-string/jumbo v6, "udp"

    invoke-direct {v1, v3, v4, v6, v2}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-hb"

    const-string/jumbo v3, "HA cluster heartbeat"

    const/16 v4, 0x14b4

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-hb"

    const-string/jumbo v3, "HA cluster heartbeat"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-gs"

    const-string/jumbo v3, "HA cluster general services"

    const/16 v4, 0x14b5

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-gs"

    const-string/jumbo v3, "HA cluster general services"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-cfg"

    const-string/jumbo v3, "HA cluster configuration"

    const/16 v4, 0x14b6

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-cfg"

    const-string/jumbo v3, "HA cluster configuration"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-probe"

    const-string/jumbo v3, "HA cluster probing"

    const/16 v4, 0x14b7

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-probe"

    const-string/jumbo v3, "HA cluster probing"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-local"

    const-string/jumbo v3, "HA Cluster Commands"

    const/16 v4, 0x14b8

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-local"

    const-string/jumbo v3, "HA Cluster Commands"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-test"

    const-string/jumbo v3, "HA Cluster Test"

    const/16 v4, 0x14b9

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-test"

    const-string/jumbo v3, "HA Cluster Test"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-mc-grp"

    const-string/jumbo v3, "Sun MC Group"

    const/16 v4, 0x14ba

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-mc-grp"

    const-string/jumbo v3, "Sun MC Group"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14bb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sco-aip"

    const-string/jumbo v3, "SCO AIP"

    const/16 v4, 0x14bb

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14bb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sco-aip"

    const-string/jumbo v3, "SCO AIP"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cfengine"

    const-string v3, "CFengine"

    const/16 v4, 0x14bc

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cfengine"

    const-string v3, "CFengine"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14bd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jprinter"

    const-string/jumbo v3, "J Printer"

    const/16 v4, 0x14bd

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14bd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jprinter"

    const-string/jumbo v3, "J Printer"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14be

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "outlaws"

    const-string/jumbo v3, "Outlaws"

    const/16 v4, 0x14be

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14be

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "outlaws"

    const-string/jumbo v3, "Outlaws"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14bf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x14bf

    const/4 v3, 0x0

    const-string/jumbo v4, "Unassigned"

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "permabit-cs"

    const-string/jumbo v7, "Permabit Client-Server"

    const/16 v8, 0x14c0

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "permabit-cs"

    const-string/jumbo v7, "Permabit Client-Server"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rrdp"

    const-string/jumbo v7, "Real-time & Reliable Data"

    const/16 v8, 0x14c1

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rrdp"

    const-string/jumbo v7, "Real-time & Reliable Data"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "opalis-rbt-ipc"

    const-string/jumbo v7, "opalis-rbt-ipc"

    const/16 v8, 0x14c2

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "opalis-rbt-ipc"

    const-string/jumbo v7, "opalis-rbt-ipc"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-poll"

    const-string/jumbo v7, "HA Cluster UDP Polling"

    const/16 v8, 0x14c3

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hacl-poll"

    const-string/jumbo v7, "HA Cluster UDP Polling"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpbladems"

    const-string/jumbo v7, "HPBladeSystem Monitor Service"

    const/16 v8, 0x14c4

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x14c4

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpdevms"

    const-string/jumbo v7, "HP Device Monitor Service"

    const/16 v8, 0x14c5

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x14c5

    const-string/jumbo v7, "Reserved"

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pkix-cmc"

    const-string/jumbo v8, "PKIX Certificate Management using CMS (CMC)"

    const/16 v9, 0x14c6

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x14c6

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x14c7

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bsfserver-zn"

    const-string/jumbo v8, "Webservices-based Zn interface of BSF"

    const/16 v9, 0x14c8

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x14c8

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bsfsvr-zn-ssl"

    const-string/jumbo v8, "Webservices-based Zn interface of BSF over SSL"

    const/16 v9, 0x14c9

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14c9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x14c9

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kfserver"

    const-string/jumbo v8, "Sculptor Database Server"

    const/16 v9, 0x14df

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kfserver"

    const-string/jumbo v8, "Sculptor Database Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14e0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xkotodrcp"

    const-string/jumbo v8, "xkoto DRCP"

    const/16 v9, 0x14e0

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14e0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xkotodrcp"

    const-string/jumbo v8, "xkoto DRCP"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "stuns"

    const-string/jumbo v9, "Session Traversal Utilities for NAT (STUN) port"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "stuns"

    const-string/jumbo v9, "STUN over DTLS"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "turns"

    const-string/jumbo v9, "TURN over TLS"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "turns"

    const-string/jumbo v9, "TURN over DTLS"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "stun-behaviors"

    const-string/jumbo v9, "STUN Behavior Discovery over TLS"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "stun-behaviors"

    const-string/jumbo v9, "Reserved for a future enhancement of STUN-BEHAVIOR"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x14e6

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcp-multicast"

    const-string/jumbo v8, "Port Control Protocol Multicast"

    const/16 v9, 0x14e6

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x14e7

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcp"

    const-string/jumbo v8, "Port Control Protocol"

    const/16 v9, 0x14e7

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dns-llq"

    const-string v8, "DNS Long-Lived Queries"

    const/16 v9, 0x14e8

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dns-llq"

    const-string v8, "DNS Long-Lived Queries"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mdns"

    const-string/jumbo v8, "Multicast DNS"

    const/16 v9, 0x14e9

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mdns"

    const-string/jumbo v8, "Multicast DNS"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mdnsresponder"

    const-string/jumbo v8, "Multicast DNS Responder IPC"

    const/16 v9, 0x14ea

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mdnsresponder"

    const-string/jumbo v8, "Multicast DNS Responder IPC"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "llmnr"

    const-string/jumbo v8, "LLMNR"

    const/16 v9, 0x14eb

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "llmnr"

    const-string/jumbo v8, "LLMNR"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-smlbiz"

    const-string/jumbo v8, "Microsoft Small Business"

    const/16 v9, 0x14ec

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-smlbiz"

    const-string/jumbo v8, "Microsoft Small Business"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14ed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsdapi"

    const-string/jumbo v8, "Web Services for Devices"

    const/16 v9, 0x14ed

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14ed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsdapi"

    const-string/jumbo v8, "Web Services for Devices"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsdapi-s"

    const-string/jumbo v8, "WS for Devices Secured"

    const/16 v9, 0x14ee

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsdapi-s"

    const-string/jumbo v8, "WS for Devices Secured"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-alerter"

    const-string/jumbo v8, "Microsoft Alerter"

    const/16 v9, 0x14ef

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-alerter"

    const-string/jumbo v8, "Microsoft Alerter"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-sideshow"

    const-string/jumbo v8, "Protocol for Windows SideShow"

    const/16 v9, 0x14f0

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-sideshow"

    const-string/jumbo v8, "Protocol for Windows SideShow"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-s-sideshow"

    const-string/jumbo v8, "Secure Protocol for Windows SideShow"

    const/16 v9, 0x14f1

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-s-sideshow"

    const-string/jumbo v8, "Secure Protocol for Windows SideShow"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "serverwsd2"

    const-string/jumbo v8, "Microsoft Windows Server WSD2 Service"

    const/16 v9, 0x14f2

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "serverwsd2"

    const-string/jumbo v8, "Microsoft Windows Server WSD2 Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "net-projection"

    const-string/jumbo v8, "Windows Network Projection"

    const/16 v9, 0x14f3

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "net-projection"

    const-string/jumbo v8, "Windows Network Projection"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14f4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kdnet"

    const-string/jumbo v8, "Microsoft Kernel Debugger"

    const/16 v9, 0x14f4

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x14f4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x14f4

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1515

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "stresstester"

    const-string/jumbo v8, "StressTester(tm) Injector"

    const/16 v9, 0x1515

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1515

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "stresstester"

    const-string/jumbo v8, "StressTester(tm) Injector"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1516

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "elektron-admin"

    const-string/jumbo v8, "Elektron Administration"

    const/16 v9, 0x1516

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1516

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "elektron-admin"

    const-string/jumbo v8, "Elektron Administration"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1517

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "securitychase"

    const-string/jumbo v8, "SecurityChase"

    const/16 v9, 0x1517

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1517

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "securitychase"

    const-string/jumbo v8, "SecurityChase"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1518

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "excerpt"

    const-string/jumbo v8, "Excerpt Search"

    const/16 v9, 0x1518

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1518

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "excerpt"

    const-string/jumbo v8, "Excerpt Search"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1519

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "excerpts"

    const-string/jumbo v8, "Excerpt Search Secure"

    const/16 v9, 0x1519

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1519

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "excerpts"

    const-string/jumbo v8, "Excerpt Search Secure"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x151a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mftp"

    const-string/jumbo v8, "OmniCast MFTP"

    const/16 v9, 0x151a

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x151a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mftp"

    const-string/jumbo v8, "OmniCast MFTP"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x151b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpoms-ci-lstn"

    const-string/jumbo v8, "HPOMS-CI-LSTN"

    const/16 v9, 0x151b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x151b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpoms-ci-lstn"

    const-string/jumbo v8, "HPOMS-CI-LSTN"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x151c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpoms-dps-lstn"

    const-string/jumbo v8, "HPOMS-DPS-LSTN"

    const/16 v9, 0x151c

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x151c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpoms-dps-lstn"

    const-string/jumbo v8, "HPOMS-DPS-LSTN"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x151d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netsupport"

    const-string/jumbo v8, "NetSupport"

    const/16 v9, 0x151d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x151d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netsupport"

    const-string/jumbo v8, "NetSupport"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x151e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "systemics-sox"

    const-string/jumbo v8, "Systemics Sox"

    const/16 v9, 0x151e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x151e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "systemics-sox"

    const-string/jumbo v8, "Systemics Sox"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x151f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "foresyte-clear"

    const-string/jumbo v8, "Foresyte-Clear"

    const/16 v9, 0x151f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x151f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "foresyte-clear"

    const-string/jumbo v8, "Foresyte-Clear"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1520

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "foresyte-sec"

    const-string/jumbo v8, "Foresyte-Sec"

    const/16 v9, 0x1520

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1520

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "foresyte-sec"

    const-string/jumbo v8, "Foresyte-Sec"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1521

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "salient-dtasrv"

    const-string/jumbo v8, "Salient Data Server"

    const/16 v9, 0x1521

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1521

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "salient-dtasrv"

    const-string/jumbo v8, "Salient Data Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1522

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "salient-usrmgr"

    const-string/jumbo v8, "Salient User Manager"

    const/16 v9, 0x1522

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1522

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "salient-usrmgr"

    const-string/jumbo v8, "Salient User Manager"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1523

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "actnet"

    const-string v8, "ActNet"

    const/16 v9, 0x1523

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1523

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "actnet"

    const-string v8, "ActNet"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1524

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "continuus"

    const-string v8, "Continuus"

    const/16 v9, 0x1524

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1524

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "continuus"

    const-string v8, "Continuus"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1525

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wwiotalk"

    const-string/jumbo v8, "WWIOTALK"

    const/16 v9, 0x1525

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1525

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wwiotalk"

    const-string/jumbo v8, "WWIOTALK"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1526

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "statusd"

    const-string/jumbo v8, "StatusD"

    const/16 v9, 0x1526

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1526

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "statusd"

    const-string/jumbo v8, "StatusD"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1527

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ns-server"

    const-string/jumbo v8, "NS Server"

    const/16 v9, 0x1527

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1527

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ns-server"

    const-string/jumbo v8, "NS Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1528

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sns-gateway"

    const-string/jumbo v8, "SNS Gateway"

    const/16 v9, 0x1528

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1528

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sns-gateway"

    const-string/jumbo v8, "SNS Gateway"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1529

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sns-agent"

    const-string/jumbo v8, "SNS Agent"

    const/16 v9, 0x1529

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1529

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sns-agent"

    const-string/jumbo v8, "SNS Agent"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x152a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mcntp"

    const-string/jumbo v8, "MCNTP"

    const/16 v9, 0x152a

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x152a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mcntp"

    const-string/jumbo v8, "MCNTP"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x152b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dj-ice"

    const-string v8, "DJ-ICE"

    const/16 v9, 0x152b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x152b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dj-ice"

    const-string v8, "DJ-ICE"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x152c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cylink-c"

    const-string v8, "Cylink-C"

    const/16 v9, 0x152c

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x152c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cylink-c"

    const-string v8, "Cylink-C"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x152d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netsupport2"

    const-string/jumbo v8, "Net Support 2"

    const/16 v9, 0x152d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x152d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netsupport2"

    const-string/jumbo v8, "Net Support 2"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x152e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "salient-mux"

    const-string/jumbo v8, "Salient MUX"

    const/16 v9, 0x152e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x152e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "salient-mux"

    const-string/jumbo v8, "Salient MUX"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x152f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "virtualuser"

    const-string/jumbo v8, "VIRTUALUSER"

    const/16 v9, 0x152f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x152f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "virtualuser"

    const-string/jumbo v8, "VIRTUALUSER"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1530

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "beyond-remote"

    const-string v8, "Beyond Remote"

    const/16 v9, 0x1530

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1530

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "beyond-remote"

    const-string v8, "Beyond Remote"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1531

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "br-channel"

    const-string v8, "Beyond Remote Command Channel"

    const/16 v9, 0x1531

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1531

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "br-channel"

    const-string v8, "Beyond Remote Command Channel"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1532

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "devbasic"

    const-string v8, "DEVBASIC"

    const/16 v9, 0x1532

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1532

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "devbasic"

    const-string v8, "DEVBASIC"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1533

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sco-peer-tta"

    const-string/jumbo v8, "SCO-PEER-TTA"

    const/16 v9, 0x1533

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1533

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sco-peer-tta"

    const-string/jumbo v8, "SCO-PEER-TTA"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1534

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "telaconsole"

    const-string/jumbo v8, "TELACONSOLE"

    const/16 v9, 0x1534

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1534

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "telaconsole"

    const-string/jumbo v8, "TELACONSOLE"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1535

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "base"

    const-string v8, "Billing and Accounting System Exchange"

    const/16 v9, 0x1535

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1535

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "base"

    const-string v8, "Billing and Accounting System Exchange"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1536

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "radec-corp"

    const-string/jumbo v8, "RADEC CORP"

    const/16 v9, 0x1536

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1536

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "radec-corp"

    const-string/jumbo v8, "RADEC CORP"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1537

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "park-agent"

    const-string/jumbo v8, "PARK AGENT"

    const/16 v9, 0x1537

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1537

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "park-agent"

    const-string/jumbo v8, "PARK AGENT"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1538

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "postgresql"

    const-string/jumbo v8, "PostgreSQL Database"

    const/16 v9, 0x1538

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1538

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "postgresql"

    const-string/jumbo v8, "PostgreSQL Database"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1539

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pyrrho"

    const-string/jumbo v8, "Pyrrho DBMS"

    const/16 v9, 0x1539

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1539

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pyrrho"

    const-string/jumbo v8, "Pyrrho DBMS"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x153a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sgi-arrayd"

    const-string/jumbo v8, "SGI Array Services Daemon"

    const/16 v9, 0x153a

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x153a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sgi-arrayd"

    const-string/jumbo v8, "SGI Array Services Daemon"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x153b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sceanics"

    const-string/jumbo v8, "SCEANICS situation and action notification"

    const/16 v9, 0x153b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x153b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sceanics"

    const-string/jumbo v8, "SCEANICS situation and action notification"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x153c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x153c

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x153c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmip6-cntl"

    const-string/jumbo v8, "pmip6-cntl"

    const/16 v9, 0x153c

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x153d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x153d

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x153d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmip6-data"

    const-string/jumbo v8, "pmip6-data"

    const/16 v9, 0x153d

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1543

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spss"

    const-string/jumbo v8, "Pearson HTTPS"

    const/16 v9, 0x1543

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1543

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spss"

    const-string/jumbo v8, "Pearson HTTPS"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1544

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1544

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1545

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "smbdirect"

    const-string/jumbo v9, "Server Message Block over Remote Direct Memory Access"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "Server Message Block over Remote Direct Memory Access"

    const-string/jumbo v9, "smbdirect"

    const-string/jumbo v10, "sctp"

    invoke-direct {v2, v0, v9, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x154a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tiepie"

    const-string/jumbo v8, "TiePie engineering data acquisition"

    const/16 v9, 0x154a

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x154a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tiepie-disc"

    const-string/jumbo v8, "TiePie engineering data acquisition (discovery)"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x154d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "surebox"

    const-string/jumbo v8, "SureBox"

    const/16 v9, 0x154d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x154d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "surebox"

    const-string/jumbo v8, "SureBox"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x154e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-5454"

    const-string v8, "APC 5454"

    const/16 v9, 0x154e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x154e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-5454"

    const-string v8, "APC 5454"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x154f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-5455"

    const-string v8, "APC 5455"

    const/16 v9, 0x154f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x154f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-5455"

    const-string v8, "APC 5455"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1550

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-5456"

    const-string v8, "APC 5456"

    const/16 v9, 0x1550

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1550

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-5456"

    const-string v8, "APC 5456"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1555

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "silkmeter"

    const-string/jumbo v8, "SILKMETER"

    const/16 v9, 0x1555

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1555

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "silkmeter"

    const-string/jumbo v8, "SILKMETER"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1556

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ttl-publisher"

    const-string/jumbo v8, "TTL Publisher"

    const/16 v9, 0x1556

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1556

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ttl-publisher"

    const-string/jumbo v8, "TTL Publisher"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1557

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ttlpriceproxy"

    const-string/jumbo v8, "TTL Price Proxy"

    const/16 v9, 0x1557

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1557

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ttlpriceproxy"

    const-string/jumbo v8, "TTL Price Proxy"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1558

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "quailnet"

    const-string/jumbo v8, "Quail Networks Object Broker"

    const/16 v9, 0x1558

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1558

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "quailnet"

    const-string/jumbo v8, "Quail Networks Object Broker"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1559

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netops-broker"

    const-string/jumbo v8, "NETOPS-BROKER"

    const/16 v9, 0x1559

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1559

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netops-broker"

    const-string/jumbo v8, "NETOPS-BROKER"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x155e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apsolab-col"

    const-string/jumbo v8, "The Apsolab company\'s data collection protocol (native api)"

    const/16 v9, 0x155e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x155e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x155e

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x155f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apsolab-cols"

    const-string/jumbo v8, "The Apsolab company\'s secure data collection protocol (native api)"

    const/16 v9, 0x155f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x155f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x155f

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1560

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apsolab-tag"

    const-string/jumbo v8, "The Apsolab company\'s dynamic tag protocol"

    const/16 v9, 0x1560

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1560

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1560

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1561

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apsolab-tags"

    const-string/jumbo v8, "The Apsolab company\'s secure dynamic tag protocol"

    const/16 v9, 0x1561

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1561

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1561

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1562

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apsolab-rpc"

    const-string/jumbo v8, "The Apsolab company\'s status query protocol"

    const/16 v9, 0x1562

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1562

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1562

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1563

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apsolab-data"

    const-string/jumbo v8, "The Apsolab company\'s data retrieval protocol"

    const/16 v9, 0x1563

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1563

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1563

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x157c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcp-addr-srvr1"

    const-string/jumbo v8, "fcp-addr-srvr1"

    const/16 v9, 0x157c

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x157c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcp-addr-srvr1"

    const-string/jumbo v8, "fcp-addr-srvr1"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x157d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcp-addr-srvr2"

    const-string/jumbo v8, "fcp-addr-srvr2"

    const/16 v9, 0x157d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x157d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcp-addr-srvr2"

    const-string/jumbo v8, "fcp-addr-srvr2"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x157e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcp-srvr-inst1"

    const-string/jumbo v8, "fcp-srvr-inst1"

    const/16 v9, 0x157e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x157e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcp-srvr-inst1"

    const-string/jumbo v8, "fcp-srvr-inst1"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x157f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcp-srvr-inst2"

    const-string/jumbo v8, "fcp-srvr-inst2"

    const/16 v9, 0x157f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x157f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcp-srvr-inst2"

    const-string/jumbo v8, "fcp-srvr-inst2"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1580

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcp-cics-gw1"

    const-string/jumbo v8, "fcp-cics-gw1"

    const/16 v9, 0x1580

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1580

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcp-cics-gw1"

    const-string/jumbo v8, "fcp-cics-gw1"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1581

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "checkoutdb"

    const-string v8, "Checkout Database"

    const/16 v9, 0x1581

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1581

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "checkoutdb"

    const-string v8, "Checkout Database"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1582

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amc"

    const-string v8, "Amcom Mobile Connect"

    const/16 v9, 0x1582

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1582

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amc"

    const-string v8, "Amcom Mobile Connect"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1583

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "psl-management"

    const-string/jumbo v8, "PowerSysLab Electrical Management"

    const/16 v9, 0x1583

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1583

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1583

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15a4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "matter"

    const-string/jumbo v8, "Matter Operational Discovery and Communi"

    const/16 v9, 0x15a4

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15a4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "matter"

    const-string/jumbo v8, "Matter Operational Discovery and Communi"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15a7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qftest-licserve"

    const-string/jumbo v8, "QF-Test License Server"

    const/16 v9, 0x15a7

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15a7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x15a7

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15ae

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cbus"

    const-string/jumbo v8, "Model Railway control using the CBUS message protocol"

    const/16 v9, 0x15ae

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15ae

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x15ae

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sgi-eventmond"

    const-string/jumbo v8, "SGI Eventmond Port"

    const/16 v9, 0x15b1

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sgi-eventmond"

    const-string/jumbo v8, "SGI Eventmond Port"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sgi-esphttp"

    const-string/jumbo v8, "SGI ESP HTTP"

    const/16 v9, 0x15b2

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sgi-esphttp"

    const-string/jumbo v8, "SGI ESP HTTP"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "personal-agent"

    const-string/jumbo v8, "Personal Agent"

    const/16 v9, 0x15b3

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "personal-agent"

    const-string/jumbo v8, "Personal Agent"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "freeciv"

    const-string/jumbo v8, "Freeciv gameplay"

    const/16 v9, 0x15b4

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "freeciv"

    const-string/jumbo v8, "Freeciv gameplay"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "farenet"

    const-string/jumbo v8, "Sandlab FARENET"

    const/16 v9, 0x15b5

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x15b5

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15bd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dp-bura"

    const-string v8, "Data Protector BURA"

    const/16 v9, 0x15bd

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15bd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x15bd

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15be

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "westec-connect"

    const-string/jumbo v8, "Westec Connect"

    const/16 v9, 0x15be

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15be

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x15be

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15bf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dof-dps-mc-sec"

    const-string v8, "DOF Protocol Stack Multicast/Secure Transport"

    const/16 v9, 0x15bf

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15bf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dof-dps-mc-sec"

    const-string v8, "DOF Protocol Stack Multicast/Secure Transport"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sdt"

    const-string/jumbo v8, "Session Data Transport Multicast"

    const/16 v9, 0x15c0

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sdt"

    const-string/jumbo v8, "Session Data Transport Multicast"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rdmnet-ctrl"

    const-string/jumbo v8, "PLASA E1.33, Remote Device Management (RDM) controller status notifications"

    const/16 v9, 0x15c1

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rdmnet-device"

    const-string/jumbo v8, "PLASA E1.33, Remote Device Management (RDM) messages"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sdmmp"

    const-string/jumbo v8, "SAS Domain Management Messaging Protocol"

    const/16 v9, 0x15c5

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sdmmp"

    const-string/jumbo v8, "SAS Domain Management Messaging Protocol"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15c6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lsi-bobcat"

    const-string/jumbo v8, "SAS IO Forwarding"

    const/16 v9, 0x15c6

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15c6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x15c6

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15c7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ora-oap"

    const-string/jumbo v8, "Oracle Access Protocol"

    const/16 v9, 0x15c7

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15c7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x15c7

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15cb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fdtracks"

    const-string/jumbo v8, "FleetDisplay Tracking Service"

    const/16 v9, 0x15cb

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15cb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x15cb

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15cc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tmosms0"

    const-string/jumbo v8, "T-Mobile SMS Protocol Message 0"

    const/16 v9, 0x15cc

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15cc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tmosms0"

    const-string/jumbo v8, "T-Mobile SMS Protocol Message 0"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15cd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tmosms1"

    const-string/jumbo v8, "T-Mobile SMS Protocol Message 1"

    const/16 v9, 0x15cd

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15cd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tmosms1"

    const-string/jumbo v8, "T-Mobile SMS Protocol Message 1"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15ce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fac-restore"

    const-string/jumbo v8, "T-Mobile SMS Protocol Message 3"

    const/16 v9, 0x15ce

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15ce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fac-restore"

    const-string/jumbo v8, "T-Mobile SMS Protocol Message 3"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15cf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tmo-icon-sync"

    const-string/jumbo v8, "T-Mobile SMS Protocol Message 2"

    const/16 v9, 0x15cf

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15cf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tmo-icon-sync"

    const-string/jumbo v8, "T-Mobile SMS Protocol Message 2"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15d0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bis-web"

    const-string v8, "BeInSync-Web"

    const/16 v9, 0x15d0

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15d0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bis-web"

    const-string v8, "BeInSync-Web"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bis-sync"

    const-string v8, "BeInSync-sync"

    const/16 v9, 0x15d1

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bis-sync"

    const-string v8, "BeInSync-sync"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15d2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "att-mt-sms"

    const-string/jumbo v8, "Planning to send mobile terminated SMS to the specific port so that the SMS is not visible to the client"

    const/16 v9, 0x15d2

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15d2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x15d2

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ininmessaging"

    const-string/jumbo v8, "inin secure messaging"

    const/16 v9, 0x15dd

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ininmessaging"

    const-string/jumbo v8, "inin secure messaging"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15de

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mctfeed"

    const-string/jumbo v8, "MCT Market Data Feed"

    const/16 v9, 0x15de

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15de

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mctfeed"

    const-string/jumbo v8, "MCT Market Data Feed"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "esinstall"

    const-string/jumbo v8, "Enterprise Security Remote Install"

    const/16 v9, 0x15df

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "esinstall"

    const-string/jumbo v8, "Enterprise Security Remote Install"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15e0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "esmmanager"

    const-string/jumbo v8, "Enterprise Security Manager"

    const/16 v9, 0x15e0

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15e0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "esmmanager"

    const-string/jumbo v8, "Enterprise Security Manager"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15e1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "esmagent"

    const-string/jumbo v8, "Enterprise Security Agent"

    const/16 v9, 0x15e1

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15e1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "esmagent"

    const-string/jumbo v8, "Enterprise Security Agent"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15e2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a1-msc"

    const-string v8, "A1-MSC"

    const/16 v9, 0x15e2

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15e2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a1-msc"

    const-string v8, "A1-MSC"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a1-bs"

    const-string v8, "A1-BS"

    const/16 v9, 0x15e3

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a1-bs"

    const-string v8, "A1-BS"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15e4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a3-sdunode"

    const-string v8, "A3-SDUNode"

    const/16 v9, 0x15e4

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15e4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a3-sdunode"

    const-string v8, "A3-SDUNode"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a4-sdunode"

    const-string v8, "A4-SDUNode"

    const/16 v9, 0x15e5

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a4-sdunode"

    const-string v8, "A4-SDUNode"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "efr"

    const-string/jumbo v8, "Fiscal Registering Protocol"

    const/16 v9, 0x15f2

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x15f2

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15fb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ninaf"

    const-string/jumbo v8, "Node Initiated Network Association Forma"

    const/16 v9, 0x15fb

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15fb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ninaf"

    const-string/jumbo v8, "Node Initiated Network Association Forma"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "htrust"

    const-string/jumbo v8, "HTrust API"

    const/16 v9, 0x15fc

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "htrust"

    const-string/jumbo v8, "HTrust API"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "symantec-sfdb"

    const-string/jumbo v8, "Symantec Storage Foundation for Database"

    const/16 v9, 0x15fd

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "symantec-sfdb"

    const-string/jumbo v8, "Symantec Storage Foundation for Database"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15fe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "precise-comm"

    const-string/jumbo v8, "PreciseCommunication"

    const/16 v9, 0x15fe

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15fe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "precise-comm"

    const-string/jumbo v8, "PreciseCommunication"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15ff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcanywheredata"

    const-string/jumbo v8, "pcANYWHEREdata"

    const/16 v9, 0x15ff

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15ff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcanywheredata"

    const-string/jumbo v8, "pcANYWHEREdata"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1600

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcanywherestat"

    const-string/jumbo v8, "pcANYWHEREstat"

    const/16 v9, 0x1600

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1600

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcanywherestat"

    const-string/jumbo v8, "pcANYWHEREstat"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1601

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "beorl"

    const-string v8, "BE Operations Request Listener"

    const/16 v9, 0x1601

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1601

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "beorl"

    const-string v8, "BE Operations Request Listener"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1602

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xprtld"

    const-string/jumbo v8, "SF Message Service"

    const/16 v9, 0x1602

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1602

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xprtld"

    const-string/jumbo v8, "SF Message Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1603

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sfmsso"

    const-string/jumbo v8, "SFM Authentication Subsystem"

    const/16 v9, 0x1603

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1603

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1603

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1604

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sfm-db-server"

    const-string/jumbo v8, "SFMdb - SFM DB server"

    const/16 v9, 0x1604

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1604

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1604

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1605

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cssc"

    const-string/jumbo v8, "Symantec CSSC"

    const/16 v9, 0x1605

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1605

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1605

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1606

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "flcrs"

    const-string/jumbo v8, "Symantec Fingerprint Lookup and Container Reference Service"

    const/16 v9, 0x1606

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1606

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1606

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1607

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ics"

    const-string/jumbo v8, "Symantec Integrity Checking Service"

    const/16 v9, 0x1607

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1607

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1607

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x160e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vfmobile"

    const-string/jumbo v8, "Ventureforth Mobile"

    const/16 v9, 0x160e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x160e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x160e

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1622

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nrpe"

    const-string/jumbo v8, "Nagios Remote Plugin Executor"

    const/16 v9, 0x1622

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1622

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1622

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1626

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filemq"

    const-string/jumbo v8, "ZeroMQ file publish-subscribe protocol"

    const/16 v9, 0x1626

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1626

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "zre-disc"

    const-string/jumbo v8, "Local area discovery and messaging over ZeroMQ"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1627

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amqps"

    const-string/jumbo v8, "amqp protocol over TLS/SSL"

    const/16 v9, 0x1627

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1627

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amqps"

    const-string/jumbo v8, "amqp protocol over TLS/SSL"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1628

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "amqp"

    const-string v9, "AMQP"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "amqp"

    const-string v9, "AMQP"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "amqp"

    const-string v9, "AMQP"

    invoke-direct {v2, v0, v8, v10, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1629

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jms"

    const-string/jumbo v8, "JACL Message Server"

    const/16 v9, 0x1629

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1629

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jms"

    const-string/jumbo v8, "JACL Message Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x162a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hyperscsi-port"

    const-string/jumbo v8, "HyperSCSI Port"

    const/16 v9, 0x162a

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x162a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hyperscsi-port"

    const-string/jumbo v8, "HyperSCSI Port"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x162b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "v5ua"

    const-string/jumbo v8, "V5UA application port"

    const/16 v9, 0x162b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x162b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "v5ua"

    const-string/jumbo v8, "V5UA application port"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x162b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "v5ua"

    const-string/jumbo v8, "V5UA application port"

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x162c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "raadmin"

    const-string/jumbo v8, "RA Administration"

    const/16 v9, 0x162c

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x162c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "raadmin"

    const-string/jumbo v8, "RA Administration"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x162d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "questdb2-lnchr"

    const-string/jumbo v8, "Quest Central DB2 Launchr"

    const/16 v9, 0x162d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x162d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "questdb2-lnchr"

    const-string/jumbo v8, "Quest Central DB2 Launchr"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x162e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rrac"

    const-string/jumbo v8, "Remote Replication Agent Connection"

    const/16 v9, 0x162e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x162e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rrac"

    const-string/jumbo v8, "Remote Replication Agent Connection"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x162f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dccm"

    const-string v8, "Direct Cable Connect Manager"

    const/16 v9, 0x162f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x162f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dccm"

    const-string v8, "Direct Cable Connect Manager"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1630

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "auriga-router"

    const-string v8, "Auriga Router Service"

    const/16 v9, 0x1630

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1630

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "auriga-router"

    const-string v8, "Auriga Router Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1631

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ncxcp"

    const-string/jumbo v8, "Net-coneX Control Protocol"

    const/16 v9, 0x1631

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1631

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ncxcp"

    const-string/jumbo v8, "Net-coneX Control Protocol"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1632

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1632

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1632

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "brightcore"

    const-string v8, "BrightCore control & data transfer exchange"

    const/16 v9, 0x1632

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1633

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "coap"

    const-string v8, "Constrained Application Protocol (CoAP)"

    const/16 v9, 0x1633

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1633

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "coap"

    const-string v8, "Constrained Application Protocol"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1634

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "coaps"

    const-string v8, "Constrained Application Protocol (CoAP)"

    const/16 v9, 0x1634

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1634

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "coaps"

    const-string v8, "DTLS-secured CoAP"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1637

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gog-multiplayer"

    const-string/jumbo v8, "GOG multiplayer game protocol"

    const/16 v9, 0x1637

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1637

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1637

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1638

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ggz"

    const-string/jumbo v8, "GGZ Gaming Zone"

    const/16 v9, 0x1638

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1638

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ggz"

    const-string/jumbo v8, "GGZ Gaming Zone"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1639

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qmvideo"

    const-string/jumbo v8, "QM video network management protocol"

    const/16 v9, 0x1639

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1639

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qmvideo"

    const-string/jumbo v8, "QM video network management protocol"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x163d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rbsystem"

    const-string/jumbo v8, "Robert Bosch Data Transfer"

    const/16 v9, 0x163d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x163d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x163d

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1640

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kmip"

    const-string/jumbo v8, "Key Management Interoperability Protocol"

    const/16 v9, 0x1640

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1640

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1640

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1644

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "supportassist"

    const-string v8, "Dell SupportAssist data center management"

    const/16 v9, 0x1644

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1644

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1644

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1649

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "storageos"

    const-string/jumbo v8, "StorageOS REST API"

    const/16 v9, 0x1649

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1649

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1649

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1651

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "proshareaudio"

    const-string/jumbo v8, "proshare conf audio"

    const/16 v9, 0x1651

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1651

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "proshareaudio"

    const-string/jumbo v8, "proshare conf audio"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1652

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prosharevideo"

    const-string/jumbo v8, "proshare conf video"

    const/16 v9, 0x1652

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1652

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prosharevideo"

    const-string/jumbo v8, "proshare conf video"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1653

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prosharedata"

    const-string/jumbo v8, "proshare conf data"

    const/16 v9, 0x1653

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1653

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prosharedata"

    const-string/jumbo v8, "proshare conf data"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1654

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prosharerequest"

    const-string/jumbo v8, "proshare conf request"

    const/16 v9, 0x1654

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1654

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prosharerequest"

    const-string/jumbo v8, "proshare conf request"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1655

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prosharenotify"

    const-string/jumbo v8, "proshare conf notify"

    const/16 v9, 0x1655

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1655

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prosharenotify"

    const-string/jumbo v8, "proshare conf notify"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1656

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dpm"

    const-string v8, "DPM Communication Server"

    const/16 v9, 0x1656

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1656

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dpm"

    const-string v8, "DPM Communication Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1657

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dpm-agent"

    const-string v8, "DPM Agent Coordinator"

    const/16 v9, 0x1657

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1657

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dpm-agent"

    const-string v8, "DPM Agent Coordinator"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1658

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-licensing"

    const-string/jumbo v8, "MS-Licensing"

    const/16 v9, 0x1658

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1658

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-licensing"

    const-string/jumbo v8, "MS-Licensing"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1659

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dtpt"

    const-string v8, "Desktop Passthru Service"

    const/16 v9, 0x1659

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1659

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dtpt"

    const-string v8, "Desktop Passthru Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x165a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msdfsr"

    const-string/jumbo v8, "Microsoft DFS Replication Service"

    const/16 v9, 0x165a

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x165a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msdfsr"

    const-string/jumbo v8, "Microsoft DFS Replication Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x165b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "omhs"

    const-string/jumbo v8, "Operations Manager - Health Service"

    const/16 v9, 0x165b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x165b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "omhs"

    const-string/jumbo v8, "Operations Manager - Health Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x165c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "omsdk"

    const-string/jumbo v8, "Operations Manager - SDK Service"

    const/16 v9, 0x165c

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x165c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "omsdk"

    const-string/jumbo v8, "Operations Manager - SDK Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x165d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-ilm"

    const-string/jumbo v8, "Microsoft Identity Lifecycle Manager"

    const/16 v9, 0x165d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x165d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x165d

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x165e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-ilm-sts"

    const-string/jumbo v8, "Microsoft Lifecycle Manager Secure Token Service"

    const/16 v9, 0x165e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x165e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x165e

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x165f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asgenf"

    const-string v8, "ASG Event Notification Framework"

    const/16 v9, 0x165f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x165f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x165f

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1660

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "io-dist-data"

    const-string v8, "Dist. I/O Comm. Service Data and Control"

    const/16 v9, 0x1660

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1660

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "io-dist-group"

    const-string v8, "Dist. I/O Comm. Service Group Membership"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1661

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openmail"

    const-string/jumbo v8, "Openmail User Agent Layer"

    const/16 v9, 0x1661

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1661

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openmail"

    const-string/jumbo v8, "Openmail User Agent Layer"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1662

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unieng"

    const-string/jumbo v8, "Steltor\'s calendar access"

    const/16 v9, 0x1662

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1662

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unieng"

    const-string/jumbo v8, "Steltor\'s calendar access"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x166d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ida-discover1"

    const-string/jumbo v8, "IDA Discover Port 1"

    const/16 v9, 0x166d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x166d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ida-discover1"

    const-string/jumbo v8, "IDA Discover Port 1"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x166e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ida-discover2"

    const-string/jumbo v8, "IDA Discover Port 2"

    const/16 v9, 0x166e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x166e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ida-discover2"

    const-string/jumbo v8, "IDA Discover Port 2"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x166f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "watchdoc-pod"

    const-string/jumbo v8, "Watchdoc NetPOD Protocol"

    const/16 v9, 0x166f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x166f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "watchdoc-pod"

    const-string/jumbo v8, "Watchdoc NetPOD Protocol"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1670

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "watchdoc"

    const-string/jumbo v8, "Watchdoc Server"

    const/16 v9, 0x1670

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1670

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "watchdoc"

    const-string/jumbo v8, "Watchdoc Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1671

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcopy-server"

    const-string/jumbo v8, "fcopy-server"

    const/16 v9, 0x1671

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1671

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcopy-server"

    const-string/jumbo v8, "fcopy-server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1672

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcopys-server"

    const-string/jumbo v8, "fcopys-server"

    const/16 v9, 0x1672

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1672

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fcopys-server"

    const-string/jumbo v8, "fcopys-server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1673

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tunatic"

    const-string/jumbo v8, "Wildbits Tunatic"

    const/16 v9, 0x1673

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1673

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tunatic"

    const-string/jumbo v8, "Wildbits Tunatic"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1674

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tunalyzer"

    const-string/jumbo v8, "Wildbits Tunalyzer"

    const/16 v9, 0x1674

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1674

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tunalyzer"

    const-string/jumbo v8, "Wildbits Tunalyzer"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1675

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1675

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1676

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rscd"

    const-string v8, "Bladelogic Agent Service"

    const/16 v9, 0x1676

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1676

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rscd"

    const-string v8, "Bladelogic Agent Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x167b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openmailg"

    const-string/jumbo v8, "OpenMail Desk Gateway server"

    const/16 v9, 0x167b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x167b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openmailg"

    const-string/jumbo v8, "OpenMail Desk Gateway server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x167c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x167c

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x167d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "x500ms"

    const-string/jumbo v8, "OpenMail X.500 Directory Server"

    const/16 v9, 0x167d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x167d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "x500ms"

    const-string/jumbo v8, "OpenMail X.500 Directory Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1686

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openmailns"

    const-string/jumbo v8, "OpenMail NewMail Server"

    const/16 v9, 0x1686

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1686

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openmailns"

    const-string/jumbo v8, "OpenMail NewMail Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1687

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "s-openmail"

    const-string/jumbo v8, "OpenMail Suer Agent Layer (Secure)"

    const/16 v9, 0x1687

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1687

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "s-openmail"

    const-string/jumbo v8, "OpenMail Suer Agent Layer (Secure)"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1688

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openmailpxy"

    const-string/jumbo v8, "OpenMail CMTS Server"

    const/16 v9, 0x1688

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1688

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openmailpxy"

    const-string/jumbo v8, "OpenMail CMTS Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1689

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spramsca"

    const-string/jumbo v8, "x509solutions Internal CA"

    const/16 v9, 0x1689

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1689

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spramsca"

    const-string/jumbo v8, "x509solutions Internal CA"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x168a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spramsd"

    const-string/jumbo v8, "x509solutions Secure Data"

    const/16 v9, 0x168a

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x168a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spramsd"

    const-string/jumbo v8, "x509solutions Secure Data"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x168b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netagent"

    const-string/jumbo v8, "NetAgent"

    const/16 v9, 0x168b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x168b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netagent"

    const-string/jumbo v8, "NetAgent"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1691

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "starfield-io"

    const-string v8, "Control commands and responses"

    const/16 v9, 0x1691

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1691

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "starfield-io"

    const-string v8, "Control commands and responses"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1694

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vts-rpc"

    const-string/jumbo v8, "Visual Tag System RPC"

    const/16 v9, 0x1694

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1694

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1694

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1695

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3par-evts"

    const-string v8, "3PAR Event Reporting Service"

    const/16 v9, 0x1695

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1695

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3par-evts"

    const-string v8, "3PAR Event Reporting Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1696

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3par-mgmt"

    const-string v8, "3PAR Management Service"

    const/16 v9, 0x1696

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1696

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3par-mgmt"

    const-string v8, "3PAR Management Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1697

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3par-mgmt-ssl"

    const-string v8, "3PAR Management Service with SSL"

    const/16 v9, 0x1697

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1697

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3par-mgmt-ssl"

    const-string v8, "3PAR Management Service with SSL"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1698

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1698

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1698

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ibar"

    const-string v8, "Cisco Interbox Application Redundancy"

    const/16 v9, 0x1698

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1699

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3par-rcopy"

    const-string v8, "3PAR Inform Remote Copy"

    const/16 v9, 0x1699

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1699

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3par-rcopy"

    const-string v8, "3PAR Inform Remote Copy"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x169a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x169a

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x169a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cisco-redu"

    const-string/jumbo v8, "redundancy notification"

    const/16 v9, 0x169a

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x169b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x169b

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x169b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "waascluster"

    const-string v8, "Cisco WAAS Cluster Protocol"

    const/16 v9, 0x169b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xtreamx"

    const-string/jumbo v8, "XtreamX Supervised Peer message"

    const/16 v9, 0x16a1

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xtreamx"

    const-string/jumbo v8, "XtreamX Supervised Peer message"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16a2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x16a2

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16a2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spdp"

    const-string/jumbo v8, "Simple Peered Discovery Protocol"

    const/16 v9, 0x16a2

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16a6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "enlabel-dpl"

    const-string/jumbo v8, "Proprietary Website deployment service"

    const/16 v9, 0x16a6

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16a6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x16a6

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icmpd"

    const-string/jumbo v8, "ICMPD"

    const/16 v9, 0x16b5

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icmpd"

    const-string/jumbo v8, "ICMPD"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spt-automation"

    const-string/jumbo v8, "Support Automation"

    const/16 v9, 0x16b6

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spt-automation"

    const-string/jumbo v8, "Support Automation"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "autopassdaemon"

    const-string v8, "AutoPass licensing"

    const/16 v9, 0x16bc

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x16bc

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "shiprush-d-ch"

    const-string/jumbo v8, "Z-firm ShipRush interface for web access and bidirectional data"

    const/16 v9, 0x16d1

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x16d1

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16d2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "reversion"

    const-string/jumbo v8, "Reversion Backup/Restore"

    const/16 v9, 0x16d2

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16d2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x16d2

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wherehoo"

    const-string/jumbo v8, "WHEREHOO"

    const/16 v9, 0x16e3

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wherehoo"

    const-string/jumbo v8, "WHEREHOO"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ppsuitemsg"

    const-string/jumbo v8, "PlanetPress Suite Messeng"

    const/16 v9, 0x16e7

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ppsuitemsg"

    const-string/jumbo v8, "PlanetPress Suite Messeng"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "diameters"

    const-string v8, "Diameter over TLS/TCP"

    const/16 v9, 0x16ec

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x16ec

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "diameters"

    const-string v8, "Diameter over DTLS/SCTP"

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x16fb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jute"

    const-string/jumbo v8, "Javascript Unit Test Environment"

    const/16 v9, 0x16fb

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x170c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rfb"

    const-string/jumbo v8, "Remote Framebuffer"

    const/16 v9, 0x170c

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x170c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rfb"

    const-string/jumbo v8, "Remote Framebuffer"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x170f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ff-ice"

    const-string/jumbo v8, "Flight & Flow Info for Collaborative Env"

    const/16 v9, 0x170f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x170f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ff-ice"

    const-string/jumbo v8, "Flight & Flow Info for Collaborative Env"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x170f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ff-ice"

    const-string/jumbo v8, "Flight & Flow Info for Collaborative Env"

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1710

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ag-swim"

    const-string v8, "Air-Ground SWIM"

    const/16 v9, 0x1710

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1710

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ag-swim"

    const-string v8, "Air-Ground SWIM"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1710

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ag-swim"

    const-string v8, "Air-Ground SWIM"

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1711

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asmgcs"

    const-string v8, "Adv Surface Mvmnt and Guidance Cont Sys"

    const/16 v9, 0x1711

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1711

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asmgcs"

    const-string v8, "Adv Surface Mvmnt and Guidance Cont Sys"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1711

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asmgcs"

    const-string v8, "Adv Surface Mvmnt and Guidance Cont Sys"

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1712

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rpas-c2"

    const-string/jumbo v8, "Remotely Piloted Vehicle C&C"

    const/16 v9, 0x1712

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1712

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rpas-c2"

    const-string/jumbo v8, "Remotely Piloted Vehicle C&C"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1712

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rpas-c2"

    const-string/jumbo v8, "Remotely Piloted Vehicle C&C"

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1713

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dsd"

    const-string v8, "Distress and Safety Data App"

    const/16 v9, 0x1713

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1713

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dsd"

    const-string v8, "Distress and Safety Data App"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1713

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dsd"

    const-string v8, "Distress and Safety Data App"

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1714

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ipsma"

    const-string/jumbo v8, "IPS Management Application"

    const/16 v9, 0x1714

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1714

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ipsma"

    const-string/jumbo v8, "IPS Management Application"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1714

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ipsma"

    const-string/jumbo v8, "IPS Management Application"

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1715

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "agma"

    const-string v8, "Air-ground media advisory"

    const/16 v9, 0x1715

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1715

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "agma"

    const-string v8, "Air-ground media advisory"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1715

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "agma"

    const-string v8, "Air-ground media advisory"

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1716

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ats-atn"

    const-string v8, "Air Traffic Services applications using ATN"

    const/16 v9, 0x1716

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1716

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ats-atn"

    const-string v8, "Air Traffic Services applications using ATN"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1716

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cm"

    const-string v8, "Context Management"

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1717

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ats-acars"

    const-string v8, "Air Traffic Services applications using ACARS"

    const/16 v9, 0x1717

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1717

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ats-acars"

    const-string v8, "Air Traffic Services applications using ACARS"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1717

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cpdlc"

    const-string v8, "Controller Pilot Data Link Communication"

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1718

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ais-met"

    const-string v8, "Aeronautical Information Service/Meteorological applications using ACARS"

    const/16 v9, 0x1718

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1718

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ais-met"

    const-string v8, "Aeronautical Information Service/Meteorological applications using ACARS"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1718

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fis"

    const-string/jumbo v8, "Flight Information Services"

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1719

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aoc-acars"

    const-string v8, "Airline operational communications applications using ACARS"

    const/16 v9, 0x1719

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1719

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aoc-acars"

    const-string v8, "Airline operational communications applications using ACARS"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1719

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ads-c"

    const-string v8, "Automatic Dependent Surveillance"

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x174b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "indy"

    const-string/jumbo v8, "Indy Application Server"

    const/16 v9, 0x174b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x174b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "indy"

    const-string/jumbo v8, "Indy Application Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1750

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mppolicy-v5"

    const-string/jumbo v8, "mppolicy-v5"

    const/16 v9, 0x1750

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1750

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mppolicy-v5"

    const-string/jumbo v8, "mppolicy-v5"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1751

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mppolicy-mgr"

    const-string/jumbo v8, "mppolicy-mgr"

    const/16 v9, 0x1751

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1751

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mppolicy-mgr"

    const-string/jumbo v8, "mppolicy-mgr"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1760

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "couchdb"

    const-string v8, "CouchDB"

    const/16 v9, 0x1760

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1760

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "couchdb"

    const-string v8, "CouchDB"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1761

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsman"

    const-string/jumbo v8, "WBEM WS-Management HTTP"

    const/16 v9, 0x1761

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1761

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsman"

    const-string/jumbo v8, "WBEM WS-Management HTTP"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1762

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsmans"

    const-string/jumbo v8, "WBEM WS-Management HTTP over TLS/SSL"

    const/16 v9, 0x1762

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1762

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsmans"

    const-string/jumbo v8, "WBEM WS-Management HTTP over TLS/SSL"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1763

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wbem-rmi"

    const-string/jumbo v8, "WBEM RMI"

    const/16 v9, 0x1763

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1763

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wbem-rmi"

    const-string/jumbo v8, "WBEM RMI"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1764

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wbem-http"

    const-string/jumbo v8, "WBEM CIM-XML (HTTP)"

    const/16 v9, 0x1764

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1764

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wbem-http"

    const-string/jumbo v8, "WBEM CIM-XML (HTTP)"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1765

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wbem-https"

    const-string/jumbo v8, "WBEM CIM-XML (HTTPS)"

    const/16 v9, 0x1765

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1765

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wbem-https"

    const-string/jumbo v8, "WBEM CIM-XML (HTTPS)"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1766

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wbem-exp-https"

    const-string/jumbo v8, "WBEM Export HTTPS"

    const/16 v9, 0x1766

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1766

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wbem-exp-https"

    const-string/jumbo v8, "WBEM Export HTTPS"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1767

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nuxsl"

    const-string/jumbo v8, "NUXSL"

    const/16 v9, 0x1767

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1767

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nuxsl"

    const-string/jumbo v8, "NUXSL"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1768

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "consul-insight"

    const-string v8, "Consul InSight Security"

    const/16 v9, 0x1768

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1768

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "consul-insight"

    const-string v8, "Consul InSight Security"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1769

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cim-rs"

    const-string v8, "DMTF WBEM CIM REST"

    const/16 v9, 0x1769

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1769

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1769

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x176a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rms-agent"

    const-string/jumbo v8, "RMS Agent Listening Service"

    const/16 v9, 0x176a

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x176a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x176a

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x176f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cvsup"

    const-string v8, "CVSup"

    const/16 v9, 0x176f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x176f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cvsup"

    const-string v8, "CVSup"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndl-ahp-svc"

    const-string/jumbo v8, "NDL-AHP-SVC"

    const/16 v9, 0x17b0

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndl-ahp-svc"

    const-string/jumbo v8, "NDL-AHP-SVC"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "winpharaoh"

    const-string/jumbo v8, "WinPharaoh"

    const/16 v9, 0x17b1

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "winpharaoh"

    const-string/jumbo v8, "WinPharaoh"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ewctsp"

    const-string/jumbo v8, "EWCTSP"

    const/16 v9, 0x17b2

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ewctsp"

    const-string/jumbo v8, "EWCTSP"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17b3

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gsmp-ancp"

    const-string/jumbo v8, "GSMP/ANCP"

    const/16 v9, 0x17b4

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17b4

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trip"

    const-string/jumbo v8, "TRIP"

    const/16 v9, 0x17b5

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trip"

    const-string/jumbo v8, "TRIP"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "messageasap"

    const-string/jumbo v8, "Messageasap"

    const/16 v9, 0x17b6

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "messageasap"

    const-string/jumbo v8, "Messageasap"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ssdtp"

    const-string/jumbo v8, "SSDTP"

    const/16 v9, 0x17b7

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ssdtp"

    const-string/jumbo v8, "SSDTP"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "diagnose-proc"

    const-string v8, "DIAGNOSE-PROC"

    const/16 v9, 0x17b8

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "diagnose-proc"

    const-string v8, "DIAGNOSE-PROC"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "directplay8"

    const-string v8, "DirectPlay8"

    const/16 v9, 0x17b9

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "directplay8"

    const-string v8, "DirectPlay8"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "max"

    const-string/jumbo v8, "Microsoft Max"

    const/16 v9, 0x17ba

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "max"

    const-string/jumbo v8, "Microsoft Max"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17bb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dpm-acm"

    const-string/jumbo v8, "Microsoft DPM Access Control Manager"

    const/16 v9, 0x17bb

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17bb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17bb

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msft-dpm-cert"

    const-string/jumbo v8, "Microsoft DPM WCF Certificates"

    const/16 v9, 0x17bc

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17bc

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17bd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iconstructsrv"

    const-string/jumbo v8, "iConstruct Server"

    const/16 v9, 0x17bd

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17bd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17bd

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gue"

    const-string/jumbo v8, "Generic UDP Encapsulation"

    const/16 v9, 0x17c0

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17c0

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "geneve"

    const-string/jumbo v8, "Generic Network Virtualization Encapsulation (Geneve)"

    const/16 v9, 0x17c1

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17c1

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17c2

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "p25cai"

    const-string v8, "APCO Project 25 Common Air Interface - UDP encapsulation"

    const/16 v9, 0x17c2

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17c3

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "miami-bcast"

    const-string/jumbo v8, "telecomsoftware miami broadcast"

    const/16 v9, 0x17c3

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "reload-config"

    const-string/jumbo v8, "Peer to Peer Infrastructure Configuration"

    const/16 v9, 0x17c4

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17c4

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "konspire2b"

    const-string/jumbo v8, "konspire2b p2p network"

    const/16 v9, 0x17c5

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "konspire2b"

    const-string/jumbo v8, "konspire2b p2p network"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pdtp"

    const-string/jumbo v8, "PDTP P2P"

    const/16 v9, 0x17c6

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pdtp"

    const-string/jumbo v8, "PDTP P2P"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ldss"

    const-string/jumbo v8, "Local Download Sharing Service"

    const/16 v9, 0x17c7

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ldss"

    const-string/jumbo v8, "Local Download Sharing Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "doglms"

    const-string/jumbo v8, "SuperDog License Manager"

    const/16 v9, 0x17c8

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17c8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "doglms-notify"

    const-string/jumbo v8, "SuperDog License Manager Notifier"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "raxa-mgmt"

    const-string/jumbo v8, "RAXA Management"

    const/16 v9, 0x17d3

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17d3

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synchronet-db"

    const-string/jumbo v8, "SynchroNet-db"

    const/16 v9, 0x17d4

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synchronet-db"

    const-string/jumbo v8, "SynchroNet-db"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synchronet-rtc"

    const-string/jumbo v8, "SynchroNet-rtc"

    const/16 v9, 0x17d5

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synchronet-rtc"

    const-string/jumbo v8, "SynchroNet-rtc"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synchronet-upd"

    const-string/jumbo v8, "SynchroNet-upd"

    const/16 v9, 0x17d6

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synchronet-upd"

    const-string/jumbo v8, "SynchroNet-upd"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rets"

    const-string/jumbo v8, "RETS"

    const/16 v9, 0x17d7

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rets"

    const-string/jumbo v8, "RETS"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dbdb"

    const-string v8, "DBDB"

    const/16 v9, 0x17d8

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dbdb"

    const-string v8, "DBDB"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "primaserver"

    const-string/jumbo v8, "Prima Server"

    const/16 v9, 0x17d9

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17d9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "primaserver"

    const-string/jumbo v8, "Prima Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17da

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mpsserver"

    const-string/jumbo v8, "MPS Server"

    const/16 v9, 0x17da

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17da

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mpsserver"

    const-string/jumbo v8, "MPS Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "etc-control"

    const-string/jumbo v8, "ETC Control"

    const/16 v9, 0x17db

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "etc-control"

    const-string/jumbo v8, "ETC Control"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sercomm-scadmin"

    const-string/jumbo v8, "Sercomm-SCAdmin"

    const/16 v9, 0x17dc

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sercomm-scadmin"

    const-string/jumbo v8, "Sercomm-SCAdmin"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "globecast-id"

    const-string/jumbo v8, "GLOBECAST-ID"

    const/16 v9, 0x17dd

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "globecast-id"

    const-string/jumbo v8, "GLOBECAST-ID"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17de

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "softcm"

    const-string/jumbo v8, "HP SoftBench CM"

    const/16 v9, 0x17de

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17de

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "softcm"

    const-string/jumbo v8, "HP SoftBench CM"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spc"

    const-string/jumbo v8, "HP SoftBench Sub-Process Control"

    const/16 v9, 0x17df

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spc"

    const-string/jumbo v8, "HP SoftBench Sub-Process Control"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dtspcd"

    const-string v8, "Desk-Top Sub-Process Control Daemon"

    const/16 v9, 0x17e0

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dtspcd"

    const-string v8, "Desk-Top Sub-Process Control Daemon"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dayliteserver"

    const-string v8, "Daylite Server"

    const/16 v9, 0x17e1

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17e1

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wrspice"

    const-string/jumbo v8, "WRspice IPC Service"

    const/16 v9, 0x17e2

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17e2

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xic"

    const-string/jumbo v8, "Xic IPC Service"

    const/16 v9, 0x17e3

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17e3

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xtlserv"

    const-string/jumbo v8, "XicTools License Manager Service"

    const/16 v9, 0x17e4

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17e4

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "daylitetouch"

    const-string v8, "Daylite Touch Sync"

    const/16 v9, 0x17e5

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17e5

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tipc"

    const-string/jumbo v8, "Transparent Inter Process Communication"

    const/16 v9, 0x17e6

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17e6

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spdy"

    const-string/jumbo v8, "SPDY for a faster web"

    const/16 v9, 0x17e9

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17e9

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bex-webadmin"

    const-string v8, "Backup Express Web Server"

    const/16 v9, 0x17ea

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bex-webadmin"

    const-string v8, "Backup Express Web Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "backup-express"

    const-string v8, "Backup Express"

    const/16 v9, 0x17eb

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "backup-express"

    const-string v8, "Backup Express"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pnbs"

    const-string/jumbo v8, "Phlexible Network Backup Service"

    const/16 v9, 0x17ec

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pnbs"

    const-string/jumbo v8, "Phlexible Network Backup Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "damewaremobgtwy"

    const-string/jumbo v8, "The DameWare Mobile Gateway Service"

    const/16 v9, 0x17f2

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x17f2

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17f5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nbt-wol"

    const-string/jumbo v8, "New Boundary Tech WOL"

    const/16 v9, 0x17f5

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17f5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nbt-wol"

    const-string/jumbo v8, "New Boundary Tech WOL"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pulsonixnls"

    const-string/jumbo v8, "Pulsonix Network License Service"

    const/16 v9, 0x17fc

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pulsonixnls"

    const-string/jumbo v8, "Pulsonix Network License Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "meta-corp"

    const-string/jumbo v8, "Meta Corporation License Manager"

    const/16 v9, 0x17fd

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "meta-corp"

    const-string/jumbo v8, "Meta Corporation License Manager"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17fe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aspentec-lm"

    const-string v8, "Aspen Technology License Manager"

    const/16 v9, 0x17fe

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17fe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aspentec-lm"

    const-string v8, "Aspen Technology License Manager"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17ff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "watershed-lm"

    const-string/jumbo v8, "Watershed License Manager"

    const/16 v9, 0x17ff

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17ff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "watershed-lm"

    const-string/jumbo v8, "Watershed License Manager"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1800

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "statsci1-lm"

    const-string/jumbo v8, "StatSci License Manager - 1"

    const/16 v9, 0x1800

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1800

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "statsci1-lm"

    const-string/jumbo v8, "StatSci License Manager - 1"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1801

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "statsci2-lm"

    const-string/jumbo v8, "StatSci License Manager - 2"

    const/16 v9, 0x1801

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1801

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "statsci2-lm"

    const-string/jumbo v8, "StatSci License Manager - 2"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1802

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lonewolf-lm"

    const-string/jumbo v8, "Lone Wolf Systems License Manager"

    const/16 v9, 0x1802

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1802

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lonewolf-lm"

    const-string/jumbo v8, "Lone Wolf Systems License Manager"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1803

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "montage-lm"

    const-string/jumbo v8, "Montage License Manager"

    const/16 v9, 0x1803

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1803

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "montage-lm"

    const-string/jumbo v8, "Montage License Manager"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1804

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ricardo-lm"

    const-string/jumbo v8, "Ricardo North America License Manager"

    const/16 v9, 0x1804

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1804

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ricardo-lm"

    const-string/jumbo v8, "Ricardo North America License Manager"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1805

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tal-pod"

    const-string/jumbo v8, "tal-pod"

    const/16 v9, 0x1805

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1805

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tal-pod"

    const-string/jumbo v8, "tal-pod"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x180f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "efb-aci"

    const-string/jumbo v8, "EFB Application Control Interface"

    const/16 v9, 0x180f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x180f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x180f

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1810

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ecmp"

    const-string/jumbo v8, "Emerson Extensible Control and Management Protocol"

    const/16 v9, 0x1810

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1810

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ecmp-data"

    const-string/jumbo v8, "Emerson Extensible Control and Management Protocol Data"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1811

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "patrol-ism"

    const-string/jumbo v8, "PATROL Internet Srv Mgr"

    const/16 v9, 0x1811

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1811

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "patrol-ism"

    const-string/jumbo v8, "PATROL Internet Srv Mgr"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1812

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "patrol-coll"

    const-string/jumbo v8, "PATROL Collector"

    const/16 v9, 0x1812

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1812

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "patrol-coll"

    const-string/jumbo v8, "PATROL Collector"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1813

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pscribe"

    const-string/jumbo v8, "Precision Scribe Cnx Port"

    const/16 v9, 0x1813

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1813

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pscribe"

    const-string/jumbo v8, "Precision Scribe Cnx Port"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1838

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-x"

    const-string/jumbo v8, "LM-X License Manager by X-Formation"

    const/16 v9, 0x1838

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1838

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-x"

    const-string/jumbo v8, "LM-X License Manager by X-Formation"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1839

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1839

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1839

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "thermo-calc"

    const-string/jumbo v8, "Management of service nodes in a processing grid for thermodynamic calculations"

    const/16 v9, 0x1839

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1841

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qmtps"

    const-string/jumbo v8, "QMTP over TLS"

    const/16 v9, 0x1841

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1841

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qmtps"

    const-string/jumbo v8, "QMTP over TLS"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x184e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "radmind"

    const-string/jumbo v8, "Radmind Access Protocol"

    const/16 v9, 0x184e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x184e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "radmind"

    const-string/jumbo v8, "Radmind Access Protocol"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1861

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jeol-nsdtp-1"

    const-string/jumbo v8, "JEOL Network Services Data Transport Protocol 1"

    const/16 v9, 0x1861

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1861

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jeol-nsddp-1"

    const-string/jumbo v8, "JEOL Network Services Dynamic Discovery Protocol 1"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1862

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jeol-nsdtp-2"

    const-string/jumbo v8, "JEOL Network Services Data Transport Protocol 2"

    const/16 v9, 0x1862

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1862

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jeol-nsddp-2"

    const-string/jumbo v8, "JEOL Network Services Dynamic Discovery Protocol 2"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1863

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jeol-nsdtp-3"

    const-string/jumbo v8, "JEOL Network Services Data Transport Protocol 3"

    const/16 v9, 0x1863

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1863

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jeol-nsddp-3"

    const-string/jumbo v8, "JEOL Network Services Dynamic Discovery Protocol 3"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1864

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jeol-nsdtp-4"

    const-string/jumbo v8, "JEOL Network Services Data Transport Protocol 4"

    const/16 v9, 0x1864

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1864

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jeol-nsddp-4"

    const-string/jumbo v8, "JEOL Network Services Dynamic Discovery Protocol 4"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x186b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tl1-raw-ssl"

    const-string/jumbo v8, "TL1 Raw Over SSL/TLS"

    const/16 v9, 0x186b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x186b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tl1-raw-ssl"

    const-string/jumbo v8, "TL1 Raw Over SSL/TLS"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x186c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tl1-ssh"

    const-string/jumbo v8, "TL1 over SSH"

    const/16 v9, 0x186c

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x186c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tl1-ssh"

    const-string/jumbo v8, "TL1 over SSH"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x186d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "crip"

    const-string v8, "CRIP"

    const/16 v9, 0x186d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x186d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "crip"

    const-string v8, "CRIP"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x187b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gld"

    const-string/jumbo v8, "GridLAB-D User Interface"

    const/16 v9, 0x187b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x187b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x187b

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x187c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "grid"

    const-string/jumbo v8, "Grid Authentication"

    const/16 v9, 0x187c

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x187c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "grid"

    const-string/jumbo v8, "Grid Authentication"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x187d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "grid-alt"

    const-string/jumbo v8, "Grid Authentication Alt"

    const/16 v9, 0x187d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x187d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "grid-alt"

    const-string/jumbo v8, "Grid Authentication Alt"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x189c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bmc-grx"

    const-string v8, "BMC GRX"

    const/16 v9, 0x189c

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x189c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bmc-grx"

    const-string v8, "BMC GRX"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x189d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "bmc-ctd-ldap"

    const-string v9, "BMC CONTROL-D LDAP SERVER"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "bmc_ctd_ldap"

    const-string v9, "BMC CONTROL-D LDAP SERVER"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "bmc-ctd-ldap"

    const-string v9, "BMC CONTROL-D LDAP SERVER"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "bmc_ctd_ldap"

    const-string v9, "BMC CONTROL-D LDAP SERVER"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18a2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ufmp"

    const-string/jumbo v8, "Unified Fabric Management Protocol"

    const/16 v9, 0x18a2

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18a2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ufmp"

    const-string/jumbo v8, "Unified Fabric Management Protocol"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18ab

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scup"

    const-string/jumbo v8, "Sensor Control Unit Protocol"

    const/16 v9, 0x18ab

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18ab

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scup-disc"

    const-string/jumbo v8, "Sensor Control Unit Protocol Discovery Protocol"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18ac

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "abb-escp"

    const-string/jumbo v8, "Ethernet Sensor Communications Protocol"

    const/16 v9, 0x18ac

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18ac

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "abb-escp"

    const-string/jumbo v8, "Ethernet Sensor Communications Protocol"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18ad

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nav-data-cmd"

    const-string/jumbo v8, "Navtech Radar Sensor Data Command"

    const/16 v9, 0x18ad

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18ad

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nav-data"

    const-string/jumbo v8, "Navtech Radar Sensor Data"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18b0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "repsvc"

    const-string v8, "Double-Take Replication Service"

    const/16 v9, 0x18b0

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18b0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "repsvc"

    const-string v8, "Double-Take Replication Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "emp-server1"

    const-string/jumbo v8, "Empress Software Connectivity Server 1"

    const/16 v9, 0x18b1

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "emp-server1"

    const-string/jumbo v8, "Empress Software Connectivity Server 1"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "emp-server2"

    const-string/jumbo v8, "Empress Software Connectivity Server 2"

    const/16 v9, 0x18b2

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "emp-server2"

    const-string/jumbo v8, "Empress Software Connectivity Server 2"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x18b3

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hrd-ncs"

    const-string/jumbo v8, "HR Device Network Configuration Service"

    const/16 v9, 0x18b4

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hrd-ns-disc"

    const-string/jumbo v8, "HR Device Network service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dt-mgmtsvc"

    const-string v8, "Double-Take Management Service"

    const/16 v9, 0x18b5

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x18b5

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dt-vra"

    const-string v8, "Double-Take Virtual Recovery Assistant"

    const/16 v9, 0x18b6

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x18b6

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18c7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sflow"

    const-string/jumbo v8, "sFlow traffic monitoring"

    const/16 v9, 0x18c7

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18c7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sflow"

    const-string/jumbo v8, "sFlow traffic monitoring"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18c8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "streletz"

    const-string v8, "Argus-Spectr security and fire-prevention systems service"

    const/16 v9, 0x18c8

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18c8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x18c8

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18ca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gnutella-svc"

    const-string/jumbo v8, "gnutella-svc"

    const/16 v9, 0x18ca

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18ca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gnutella-svc"

    const-string/jumbo v8, "gnutella-svc"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18cb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gnutella-rtr"

    const-string/jumbo v8, "gnutella-rtr"

    const/16 v9, 0x18cb

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18cb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gnutella-rtr"

    const-string/jumbo v8, "gnutella-rtr"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18ce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "adap"

    const-string v8, "App Discovery and Access Protocol"

    const/16 v9, 0x18ce

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18ce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "adap"

    const-string v8, "App Discovery and Access Protocol"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18d3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmcs"

    const-string/jumbo v8, "PMCS applications"

    const/16 v9, 0x18d3

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18d3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmcs"

    const-string/jumbo v8, "PMCS applications"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18d8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "metaedit-mu"

    const-string/jumbo v8, "MetaEdit+ Multi-User"

    const/16 v9, 0x18d8

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18d8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "metaedit-mu"

    const-string/jumbo v8, "MetaEdit+ Multi-User"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndn"

    const-string/jumbo v8, "Named Data Networking"

    const/16 v9, 0x18db

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x18db

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18e2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "metaedit-se"

    const-string/jumbo v8, "MetaEdit+ Server Administration"

    const/16 v9, 0x18e2

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18e2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "metaedit-se"

    const-string/jumbo v8, "MetaEdit+ Server Administration"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "redis"

    const-string v8, "An advanced key-value cache and store"

    const/16 v9, 0x18eb

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x18eb

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "metatude-mds"

    const-string/jumbo v8, "Metatude Dialogue Server"

    const/16 v9, 0x18ee

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "metatude-mds"

    const-string/jumbo v8, "Metatude Dialogue Server"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18f5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "clariion-evr01"

    const-string/jumbo v8, "clariion-evr01"

    const/16 v9, 0x18f5

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18f5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "clariion-evr01"

    const-string/jumbo v8, "clariion-evr01"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18f6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "metaedit-ws"

    const-string/jumbo v8, "MetaEdit+ WebService API"

    const/16 v9, 0x18f6

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x18f6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "metaedit-ws"

    const-string/jumbo v8, "MetaEdit+ WebService API"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1900

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "boe-cms"

    const-string v8, "Business Objects CMS contact port"

    const/16 v9, 0x1900

    invoke-direct {v1, v9, v2, v3, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1901

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "boe-was"

    const-string/jumbo v8, "boe-was"

    const/16 v9, 0x1901

    invoke-direct {v1, v9, v2, v3, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1902

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "boe-eventsrv"

    const-string/jumbo v8, "boe-eventsrv"

    const/16 v9, 0x1902

    invoke-direct {v1, v9, v2, v3, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1903

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "boe-cachesvr"

    const-string/jumbo v8, "boe-cachesvr"

    const/16 v9, 0x1903

    invoke-direct {v1, v9, v2, v3, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1904

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1904

    const-string/jumbo v8, "boe-filesvr"

    const-string v9, "Business Objects Enterprise internal server"

    invoke-direct {v1, v2, v8, v3, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1905

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1905

    const-string/jumbo v8, "boe-pagesvr"

    invoke-direct {v1, v2, v8, v3, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1906

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1906

    const-string/jumbo v8, "boe-processsvr"

    invoke-direct {v1, v2, v8, v3, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1907

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1907

    const-string/jumbo v8, "boe-resssvr1"

    invoke-direct {v1, v2, v8, v3, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1908

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1908

    const-string/jumbo v8, "boe-resssvr2"

    invoke-direct {v1, v2, v8, v3, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1909

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1909

    const-string/jumbo v8, "boe-resssvr3"

    invoke-direct {v1, v2, v8, v3, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x190a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x190a

    const-string/jumbo v8, "boe-resssvr4"

    invoke-direct {v1, v2, v8, v3, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1911

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "faxcomservice"

    const-string/jumbo v8, "Faxcom Message Service"

    const/16 v9, 0x1911

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1911

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "faxcomservice"

    const-string/jumbo v8, "Faxcom Message Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1912

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "syserverremote"

    const-string/jumbo v8, "SYserver remote commands"

    const/16 v9, 0x1912

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1912

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1912

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1913

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "svdrp"

    const-string/jumbo v8, "Simple VDR Protocol"

    const/16 v9, 0x1913

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1913

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "svdrp-disc"

    const-string/jumbo v8, "Simple VDR Protocol Discovery"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1914

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nim-vdrshell"

    const-string/jumbo v8, "NIM_VDRShell"

    const/16 v9, 0x1914

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1914

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nim-vdrshell"

    const-string/jumbo v8, "NIM_VDRShell"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1915

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nim-wan"

    const-string/jumbo v8, "NIM_WAN"

    const/16 v9, 0x1915

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1915

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nim-wan"

    const-string/jumbo v8, "NIM_WAN"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1920

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pgbouncer"

    const-string/jumbo v8, "PgBouncer"

    const/16 v9, 0x1920

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1920

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1920

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1928

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "heliosd"

    const-string/jumbo v8, "heliosd daemon"

    const/16 v9, 0x1928

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1928

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1928

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1929

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1929

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x192a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tarp"

    const-string/jumbo v8, "Transitory Application Request Protocol"

    const/16 v9, 0x192a

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x192a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x192a

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x192b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-https"

    const-string/jumbo v8, "Service Registry Default HTTPS Domain"

    const/16 v9, 0x192b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x192b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-https"

    const-string/jumbo v8, "Service Registry Default HTTPS Domain"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x192c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "sge-qmaster"

    const-string/jumbo v9, "Grid Engine Qmaster Service"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "sge_qmaster"

    const-string/jumbo v9, "Grid Engine Qmaster Service"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "sge-qmaster"

    const-string/jumbo v9, "Grid Engine Qmaster Service"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "sge_qmaster"

    const-string/jumbo v9, "Grid Engine Qmaster Service"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x192d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "sge-execd"

    const-string/jumbo v9, "Grid Engine Execution Service"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "sge_execd"

    const-string/jumbo v9, "Grid Engine Execution Service"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "sge-execd"

    const-string/jumbo v9, "Grid Engine Execution Service"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "sge_execd"

    const-string/jumbo v9, "Grid Engine Execution Service"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x192e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mysql-proxy"

    const-string/jumbo v8, "MySQL Proxy"

    const/16 v9, 0x192e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x192e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mysql-proxy"

    const-string/jumbo v8, "MySQL Proxy"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1937

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "skip-cert-recv"

    const-string/jumbo v8, "SKIP Certificate Receive"

    const/16 v9, 0x1937

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1937

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "skip-cert-recv"

    const-string/jumbo v8, "SKIP Certificate Receive"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1938

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "skip-cert-send"

    const-string/jumbo v8, "SKIP Certificate Send"

    const/16 v9, 0x1938

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1938

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "skip-cert-send"

    const-string/jumbo v8, "SKIP Certificate Send"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1940

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ieee11073-20701"

    const-string/jumbo v8, "Port assignment for medical device communication in \n    accordance to IEEE 11073-20701"

    const/16 v9, 0x1940

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1940

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ieee11073-20701"

    const-string/jumbo v8, "Port assignment for medical device communication in \n    accordance to IEEE 11073-20701"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1947

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lvision-lm"

    const-string/jumbo v8, "LVision License Manager"

    const/16 v9, 0x1947

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1947

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lvision-lm"

    const-string/jumbo v8, "LVision License Manager"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1950

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-http"

    const-string/jumbo v8, "Service Registry Default HTTP Domain"

    const/16 v9, 0x1950

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1950

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-http"

    const-string/jumbo v8, "Service Registry Default HTTP Domain"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1951

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "servicetags"

    const-string/jumbo v8, "Service Tags"

    const/16 v9, 0x1951

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1951

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "servicetags"

    const-string/jumbo v8, "Service Tags"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1952

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ldoms-mgmt"

    const-string/jumbo v8, "Logical Domains Management Interface"

    const/16 v9, 0x1952

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1952

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ldoms-mgmt"

    const-string/jumbo v8, "Logical Domains Management Interface"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1953

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "SunVTS-RMI"

    const-string/jumbo v8, "SunVTS RMI"

    const/16 v9, 0x1953

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1953

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "SunVTS-RMI"

    const-string/jumbo v8, "SunVTS RMI"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1954

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-jms"

    const-string/jumbo v8, "Service Registry Default JMS Domain"

    const/16 v9, 0x1954

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1954

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-jms"

    const-string/jumbo v8, "Service Registry Default JMS Domain"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1955

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-iiop"

    const-string/jumbo v8, "Service Registry Default IIOP Domain"

    const/16 v9, 0x1955

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1955

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-iiop"

    const-string/jumbo v8, "Service Registry Default IIOP Domain"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1956

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-iiops"

    const-string/jumbo v8, "Service Registry Default IIOPS Domain"

    const/16 v9, 0x1956

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1956

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-iiops"

    const-string/jumbo v8, "Service Registry Default IIOPS Domain"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1957

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-iiop-aut"

    const-string/jumbo v8, "Service Registry Default IIOPAuth Domain"

    const/16 v9, 0x1957

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1957

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-iiop-aut"

    const-string/jumbo v8, "Service Registry Default IIOPAuth Domain"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1958

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-jmx"

    const-string/jumbo v8, "Service Registry Default JMX Domain"

    const/16 v9, 0x1958

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1958

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-jmx"

    const-string/jumbo v8, "Service Registry Default JMX Domain"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1959

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-admin"

    const-string/jumbo v8, "Service Registry Default Admin Domain"

    const/16 v9, 0x1959

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1959

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sun-sr-admin"

    const-string/jumbo v8, "Service Registry Default Admin Domain"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1964

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "boks"

    const-string v8, "BoKS Master"

    const/16 v9, 0x1964

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1964

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "boks"

    const-string v8, "BoKS Master"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1965

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "boks-servc"

    const-string v9, "BoKS Servc"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "boks_servc"

    const-string v9, "BoKS Servc"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "boks-servc"

    const-string v9, "BoKS Servc"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "boks_servc"

    const-string v9, "BoKS Servc"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1966

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "boks-servm"

    const-string v9, "BoKS Servm"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "boks_servm"

    const-string v9, "BoKS Servm"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "boks-servm"

    const-string v9, "BoKS Servm"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "boks_servm"

    const-string v9, "BoKS Servm"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1967

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "boks-clntd"

    const-string v9, "BoKS Clntd"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "boks_clntd"

    const-string v9, "BoKS Clntd"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "boks-clntd"

    const-string v9, "BoKS Clntd"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "boks_clntd"

    const-string v9, "BoKS Clntd"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1968

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1968

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1969

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "badm-priv"

    const-string v9, "BoKS Admin Private Port"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "badm_priv"

    const-string v9, "BoKS Admin Private Port"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "badm-priv"

    const-string v9, "BoKS Admin Private Port"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "badm_priv"

    const-string v9, "BoKS Admin Private Port"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x196a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "badm-pub"

    const-string v9, "BoKS Admin Public Port"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "badm_pub"

    const-string v9, "BoKS Admin Public Port"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "badm-pub"

    const-string v9, "BoKS Admin Public Port"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "badm_pub"

    const-string v9, "BoKS Admin Public Port"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x196b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "bdir-priv"

    const-string v9, "BoKS Dir Server, Private Port"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "bdir_priv"

    const-string v9, "BoKS Dir Server, Private Port"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "bdir-priv"

    const-string v9, "BoKS Dir Server, Private Port"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "bdir_priv"

    const-string v9, "BoKS Dir Server, Private Port"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x196c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "bdir-pub"

    const-string v9, "BoKS Dir Server, Public Port"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "bdir_pub"

    const-string v9, "BoKS Dir Server, Public Port"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "bdir-pub"

    const-string v9, "BoKS Dir Server, Public Port"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "bdir_pub"

    const-string v9, "BoKS Dir Server, Public Port"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x196d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mgcs-mfp-port"

    const-string/jumbo v8, "MGCS-MFP Port"

    const/16 v9, 0x196d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x196d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mgcs-mfp-port"

    const-string/jumbo v8, "MGCS-MFP Port"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x196e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mcer-port"

    const-string/jumbo v8, "MCER Port"

    const/16 v9, 0x196e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x196e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mcer-port"

    const-string/jumbo v8, "MCER Port"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x196f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x196f

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x196f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dccp-udp"

    const-string v8, "Datagram Congestion Control Protocol Encapsulation for NAT Traversal"

    const/16 v9, 0x196f

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1971

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netconf-tls"

    const-string/jumbo v8, "NETCONF over TLS"

    const/16 v9, 0x1971

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1971

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1971

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1972

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "syslog-tls"

    const-string/jumbo v8, "Syslog over TLS"

    const/16 v9, 0x1972

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1972

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "syslog-tls"

    const-string/jumbo v8, "syslog over DTLS"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1972

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dccp"

    const-string/jumbo v8, "syslog over DTLS"

    const-string/jumbo v11, "syslog-tls"

    invoke-direct {v1, v9, v11, v2, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1973

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "elipse-rec"

    const-string/jumbo v8, "Elipse RPC Protocol"

    const/16 v9, 0x1973

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1973

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "elipse-rec"

    const-string/jumbo v8, "Elipse RPC Protocol"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x198f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lds-distrib"

    const-string/jumbo v8, "lds_distrib"

    const/16 v9, 0x198f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x198f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lds-distrib"

    const-string/jumbo v8, "lds_distrib"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1990

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lds-dump"

    const-string/jumbo v8, "LDS Dump Service"

    const/16 v9, 0x1990

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1990

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lds-dump"

    const-string/jumbo v8, "LDS Dump Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1993

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-6547"

    const-string v8, "APC 6547"

    const/16 v9, 0x1993

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1993

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-6547"

    const-string v8, "APC 6547"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1994

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-6548"

    const-string v8, "APC 6548"

    const/16 v9, 0x1994

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1994

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-6548"

    const-string v8, "APC 6548"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1995

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-6549"

    const-string v8, "APC 6549"

    const/16 v9, 0x1995

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1995

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-6549"

    const-string v8, "APC 6549"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1996

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fg-sysupdate"

    const-string/jumbo v8, "fg-sysupdate"

    const/16 v9, 0x1996

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1996

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fg-sysupdate"

    const-string/jumbo v8, "fg-sysupdate"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1997

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sum"

    const-string/jumbo v8, "Software Update Manager"

    const/16 v9, 0x1997

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1997

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sum"

    const-string/jumbo v8, "Software Update Manager"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x199c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "checkmk-agent"

    const-string v8, "Checkmk Monitoring Agent"

    const/16 v9, 0x199c

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x199c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x199c

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x199d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x199d

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x199e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xdsxdm"

    const-string v8, ""

    const/16 v9, 0x199e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x199e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xdsxdm"

    const-string v8, ""

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19a6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sane-port"

    const-string/jumbo v8, "SANE Control Port"

    const/16 v9, 0x19a6

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19a6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sane-port"

    const-string/jumbo v8, "SANE Control Port"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19a7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19a7

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19a8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canit-store"

    const-string v8, "CanIt Storage Manager"

    const/16 v9, 0x19a8

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19a8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canit_store"

    const-string v8, "CanIt Storage Manager"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19a8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rp-reputation"

    const-string/jumbo v8, "Roaring Penguin IP Address Reputation Collection"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "affiliate"

    const-string v8, "Affiliate"

    const/16 v9, 0x19b3

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19b3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "affiliate"

    const-string v8, "Affiliate"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "parsec-master"

    const-string/jumbo v8, "Parsec Masterserver"

    const/16 v9, 0x19b4

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "parsec-master"

    const-string/jumbo v8, "Parsec Masterserver"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "parsec-peer"

    const-string/jumbo v8, "Parsec Peer-to-Peer"

    const/16 v9, 0x19b5

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "parsec-peer"

    const-string/jumbo v8, "Parsec Peer-to-Peer"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "parsec-game"

    const-string/jumbo v8, "Parsec Gameserver"

    const/16 v9, 0x19b6

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "parsec-game"

    const-string/jumbo v8, "Parsec Gameserver"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "joaJewelSuite"

    const-string/jumbo v8, "JOA Jewel Suite"

    const/16 v9, 0x19b7

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "joaJewelSuite"

    const-string/jumbo v8, "JOA Jewel Suite"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19bc

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19c8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mshvlm"

    const-string/jumbo v8, "Microsoft Hyper-V Live Migration"

    const/16 v9, 0x19c8

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19c8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19c8

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19c9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mstmg-sstp"

    const-string/jumbo v8, "Microsoft Threat Management Gateway SSTP"

    const/16 v9, 0x19c9

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19c9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19c9

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19ca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsscomfrmwk"

    const-string/jumbo v8, "Windows WSS Communication Framework"

    const/16 v9, 0x19ca

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19ca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19ca

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "odette-ftps"

    const-string/jumbo v8, "ODETTE-FTP over TLS/SSL"

    const/16 v9, 0x19db

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "odette-ftps"

    const-string/jumbo v8, "ODETTE-FTP over TLS/SSL"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kftp-data"

    const-string/jumbo v8, "Kerberos V5 FTP Data"

    const/16 v9, 0x19dc

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kftp-data"

    const-string/jumbo v8, "Kerberos V5 FTP Data"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kftp"

    const-string/jumbo v8, "Kerberos V5 FTP Control"

    const/16 v9, 0x19dd

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kftp"

    const-string/jumbo v8, "Kerberos V5 FTP Control"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19de

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mcftp"

    const-string/jumbo v8, "Multicast FTP"

    const/16 v9, 0x19de

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19de

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mcftp"

    const-string/jumbo v8, "Multicast FTP"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ktelnet"

    const-string/jumbo v8, "Kerberos V5 Telnet"

    const/16 v9, 0x19df

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ktelnet"

    const-string/jumbo v8, "Kerberos V5 Telnet"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "datascaler-db"

    const-string v8, "DataScaler database"

    const/16 v9, 0x19e0

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19e0

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "datascaler-ctl"

    const-string v8, "DataScaler control"

    const/16 v9, 0x19e1

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19e1

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wago-service"

    const-string/jumbo v8, "WAGO Service and Update"

    const/16 v9, 0x19e2

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wago-service"

    const-string/jumbo v8, "WAGO Service and Update"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nexgen"

    const-string v8, "Allied Electronics NeXGen"

    const/16 v9, 0x19e3

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nexgen"

    const-string v8, "Allied Electronics NeXGen"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afesc-mc"

    const-string v8, "AFE Stock Channel M/C"

    const/16 v9, 0x19e4

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "afesc-mc"

    const-string v8, "AFE Stock Channel M/C"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nexgen-aux"

    const-string/jumbo v8, "Secondary, (non ANDI) multi-protocol multi-function interface to\n    the Allied ANDI-based family of forecourt controllers"

    const/16 v9, 0x19e5

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nexgen-aux"

    const-string/jumbo v8, "Secondary, (non ANDI) multi-protocol multi-function interface to\n      the Allied ANDI-based family of forecourt controllers"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19e6

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19e7

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mxodbc-connect"

    const-string/jumbo v8, "eGenix mxODBC Connect"

    const/16 v9, 0x19e8

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19e8

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19e9

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cisco-vpath-tun"

    const-string v8, "Cisco vPath Services Overlay"

    const/16 v9, 0x19e9

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mpls-pm"

    const-string/jumbo v8, "MPLS Performance Measurement out-of-band response"

    const/16 v9, 0x19ea

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19ea

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19eb

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mpls-udp"

    const-string/jumbo v8, "Encapsulate MPLS packets in UDP tunnels."

    const/16 v9, 0x19eb

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19ec

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mpls-udp-dtls"

    const-string/jumbo v8, "Encapsulate MPLS packets in UDP tunnels with DTLS."

    const/16 v9, 0x19ec

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovsdb"

    const-string/jumbo v8, "Open vSwitch Database protocol"

    const/16 v9, 0x19f0

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19f0

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openflow"

    const-string/jumbo v8, "OpenFlow"

    const/16 v9, 0x19fd

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openflow"

    const-string/jumbo v8, "OpenFlow"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19fe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19fe

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19ff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcs-sf-ui-man"

    const-string/jumbo v8, "PC SOFT - Software factory UI/manager"

    const/16 v9, 0x19ff

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x19ff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x19ff

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "emgmsg"

    const-string/jumbo v8, "Emergency Message Control Service"

    const/16 v9, 0x1a00

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a00

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a01

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "palcom-disc"

    const-string/jumbo v8, "PalCom Discovery"

    const/16 v9, 0x1a01

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a0e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vocaltec-gold"

    const-string/jumbo v8, "Vocaltec Global Online Directory"

    const/16 v9, 0x1a0e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a0e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vocaltec-gold"

    const-string/jumbo v8, "Vocaltec Global Online Directory"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a0f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "p4p-portal"

    const-string/jumbo v8, "P4P Portal Service"

    const/16 v9, 0x1a0f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a0f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "p4p-portal"

    const-string/jumbo v8, "P4P Portal Service"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "vision-server"

    const-string/jumbo v9, "vision_server"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "vision_server"

    const-string/jumbo v9, "vision_server"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "vision-server"

    const-string/jumbo v9, "vision_server"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "vision_server"

    const-string/jumbo v9, "vision_server"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a11

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "vision-elmd"

    const-string/jumbo v9, "vision_elmd"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "vision_elmd"

    const-string/jumbo v9, "vision_elmd"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "vision-elmd"

    const-string/jumbo v9, "vision_elmd"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "vision_elmd"

    const-string/jumbo v9, "vision_elmd"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a16

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vfbp"

    const-string/jumbo v8, "Viscount Freedom Bridge Protocol"

    const/16 v9, 0x1a16

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a16

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vfbp-disc"

    const-string/jumbo v8, "Viscount Freedom Bridge Discovery"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a17

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "osaut"

    const-string/jumbo v8, "Osorno Automation"

    const/16 v9, 0x1a17

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a17

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "osaut"

    const-string/jumbo v8, "Osorno Automation"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a1f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "clever-ctrace"

    const-string v8, "CleverView for cTrace Message Service"

    const/16 v9, 0x1a1f

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a1f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a1f

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "clever-tcpip"

    const-string v8, "CleverView for TCP/IP Message Service"

    const/16 v9, 0x1a20

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a20

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a21

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tsa"

    const-string/jumbo v8, "Tofino Security Appliance"

    const/16 v9, 0x1a21

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a21

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tsa"

    const-string/jumbo v8, "Tofino Security Appliance"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cleverdetect"

    const-string v8, "CLEVERDetect Message Service"

    const/16 v9, 0x1a22

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a22

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a28

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a28

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a28

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "babel"

    const-string v8, "Babel Routing Protocol"

    const/16 v9, 0x1a28

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a29

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ircs-u"

    const-string/jumbo v8, "Internet Relay Chat via TLS/SSL"

    const/16 v9, 0x1a29

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a29

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a29

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a2a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a2a

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a2b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a2b

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a2b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "babel-dtls"

    const-string v8, "Babel Routing Protocol over DTLS"

    const/16 v9, 0x1a2b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a2c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a2c

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a2d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kti-icad-srvr"

    const-string/jumbo v8, "KTI/ICAD Nameserver"

    const/16 v9, 0x1a2d

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a2d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kti-icad-srvr"

    const-string/jumbo v8, "KTI/ICAD Nameserver"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a2d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a2d

    invoke-direct {v1, v2, v3, v10, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a2e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "e-design-net"

    const-string/jumbo v8, "e-Design network"

    const/16 v9, 0x1a2e

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a2e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "e-design-net"

    const-string/jumbo v8, "e-Design network"

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a2e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a2e

    invoke-direct {v1, v2, v3, v10, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a2f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "e-design-web"

    const-string/jumbo v4, "e-Design web"

    const/16 v8, 0x1a2f

    invoke-direct {v1, v8, v2, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a2f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "e-design-web"

    const-string/jumbo v4, "e-Design web"

    invoke-direct {v1, v8, v2, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a30

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a30

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a30

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a30

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "frc-hp"

    const-string/jumbo v4, "ForCES HP (High Priority) channel"

    const/16 v8, 0x1a30

    invoke-direct {v1, v8, v2, v10, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a31

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a31

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a31

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a31

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "frc-mp"

    const-string/jumbo v4, "ForCES MP (Medium Priority) channel"

    const/16 v8, 0x1a31

    invoke-direct {v1, v8, v2, v10, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x1a32

    invoke-direct {v1, v2, v3, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "frc-lp"

    const-string/jumbo v3, "ForCES LP (Low priority) channel"

    const/16 v4, 0x1a32

    invoke-direct {v1, v4, v2, v10, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1a3a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ibprotocol"

    const-string/jumbo v3, "Internet Backplane Protocol"

    const/16 v4, 0x1a3a

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
