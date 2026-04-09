.class public abstract LG7/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/HashMap;)V
    .locals 10

    const-string/jumbo v0, "x"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xab4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "Alarm"

    const/16 v3, 0xab4

    const-string/jumbo v4, "alarm"

    const-string/jumbo v5, "tcp"

    invoke-direct {v1, v3, v4, v5, v2}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xab4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "Alarm"

    const-string/jumbo v4, "alarm"

    const-string/jumbo v6, "udp"

    invoke-direct {v1, v3, v4, v6, v2}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xab5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tsb"

    const-string/jumbo v3, "TSB"

    const/16 v4, 0xab5

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xab5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tsb"

    const-string/jumbo v3, "TSB"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xab6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tsb2"

    const-string/jumbo v3, "TSB2"

    const/16 v4, 0xab6

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xab6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tsb2"

    const-string/jumbo v3, "TSB2"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xab7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "murx"

    const-string/jumbo v3, "murx"

    const/16 v4, 0xab7

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xab7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "murx"

    const-string/jumbo v3, "murx"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xab8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "honyaku"

    const-string/jumbo v3, "honyaku"

    const/16 v4, 0xab8

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xab8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "honyaku"

    const-string/jumbo v3, "honyaku"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xab9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "urbisnet"

    const-string/jumbo v3, "URBISNET"

    const/16 v4, 0xab9

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xab9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "urbisnet"

    const-string/jumbo v3, "URBISNET"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cpudpencap"

    const-string v3, "CPUDPENCAP"

    const/16 v4, 0xaba

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cpudpencap"

    const-string v3, "CPUDPENCAP"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xabb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xabb

    const-string/jumbo v3, "fjippol-swrly"

    const-string v4, ""

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xabb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v3, "fjippol-swrly"

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xabc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xabc

    const-string/jumbo v3, "fjippol-polsvr"

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xabc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v3, "fjippol-polsvr"

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xabd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xabd

    const-string/jumbo v3, "fjippol-cnsl"

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xabd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v3, "fjippol-cnsl"

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xabe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xabe

    const-string/jumbo v3, "fjippol-port1"

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xabe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v3, "fjippol-port1"

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xabf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xabf

    const-string/jumbo v3, "fjippol-port2"

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xabf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v3, "fjippol-port2"

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rsisysaccess"

    const-string/jumbo v3, "RSISYS ACCESS"

    const/16 v4, 0xac0

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rsisysaccess"

    const-string/jumbo v3, "RSISYS ACCESS"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "de-spot"

    const-string/jumbo v3, "de-spot"

    const/16 v4, 0xac1

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "de-spot"

    const-string/jumbo v3, "de-spot"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apollo-cc"

    const-string v3, "APOLLO CC"

    const/16 v4, 0xac2

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apollo-cc"

    const-string v3, "APOLLO CC"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "expresspay"

    const-string/jumbo v3, "Express Pay"

    const/16 v4, 0xac3

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "expresspay"

    const-string/jumbo v3, "Express Pay"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "simplement-tie"

    const-string/jumbo v3, "simplement-tie"

    const/16 v4, 0xac4

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "simplement-tie"

    const-string/jumbo v3, "simplement-tie"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cnrp"

    const-string v3, "CNRP"

    const/16 v4, 0xac5

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cnrp"

    const-string v3, "CNRP"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apollo-status"

    const-string v3, "APOLLO Status"

    const/16 v4, 0xac6

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apollo-status"

    const-string v3, "APOLLO Status"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apollo-gms"

    const-string v3, "APOLLO GMS"

    const/16 v4, 0xac7

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apollo-gms"

    const-string v3, "APOLLO GMS"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sabams"

    const-string/jumbo v3, "Saba MS"

    const/16 v4, 0xac8

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sabams"

    const-string/jumbo v3, "Saba MS"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dicom-iscl"

    const-string v3, "DICOM ISCL"

    const/16 v4, 0xac9

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xac9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dicom-iscl"

    const-string v3, "DICOM ISCL"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dicom-tls"

    const-string v3, "DICOM TLS"

    const/16 v4, 0xaca

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dicom-tls"

    const-string v3, "DICOM TLS"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xacb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "desktop-dna"

    const-string v3, "Desktop DNA"

    const/16 v4, 0xacb

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xacb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "desktop-dna"

    const-string v3, "Desktop DNA"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xacc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "data-insurance"

    const-string v3, "Data Insurance"

    const/16 v4, 0xacc

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xacc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "data-insurance"

    const-string v3, "Data Insurance"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xacd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qip-audup"

    const-string/jumbo v3, "qip-audup"

    const/16 v4, 0xacd

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xacd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qip-audup"

    const-string/jumbo v3, "qip-audup"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xace

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "compaq-scp"

    const-string v3, "Compaq SCP"

    const/16 v4, 0xace

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xace

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "compaq-scp"

    const-string v3, "Compaq SCP"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xacf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "uadtc"

    const-string/jumbo v3, "UADTC"

    const/16 v4, 0xacf

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xacf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "uadtc"

    const-string/jumbo v3, "UADTC"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "uacs"

    const-string/jumbo v3, "UACS"

    const/16 v4, 0xad0

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "uacs"

    const-string/jumbo v3, "UACS"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "exce"

    const-string/jumbo v3, "eXcE"

    const/16 v4, 0xad1

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "exce"

    const-string/jumbo v3, "eXcE"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "veronica"

    const-string/jumbo v3, "Veronica"

    const/16 v4, 0xad2

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "veronica"

    const-string/jumbo v3, "Veronica"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vergencecm"

    const-string/jumbo v3, "Vergence CM"

    const/16 v4, 0xad3

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vergencecm"

    const-string/jumbo v3, "Vergence CM"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "auris"

    const-string/jumbo v3, "auris"

    const/16 v4, 0xad4

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "auris"

    const-string/jumbo v3, "auris"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rbakcup1"

    const-string/jumbo v3, "RBackup Remote Backup"

    const/16 v4, 0xad5

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rbakcup1"

    const-string/jumbo v3, "RBackup Remote Backup"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rbakcup2"

    const-string/jumbo v3, "RBackup Remote Backup"

    const/16 v4, 0xad6

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rbakcup2"

    const-string/jumbo v3, "RBackup Remote Backup"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smpp"

    const-string/jumbo v3, "SMPP"

    const/16 v4, 0xad7

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smpp"

    const-string/jumbo v3, "SMPP"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ridgeway1"

    const-string/jumbo v3, "Ridgeway Systems & Software"

    const/16 v4, 0xad8

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ridgeway1"

    const-string/jumbo v3, "Ridgeway Systems & Software"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ridgeway2"

    const-string/jumbo v3, "Ridgeway Systems & Software"

    const/16 v4, 0xad9

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xad9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ridgeway2"

    const-string/jumbo v3, "Ridgeway Systems & Software"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xada

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gwen-sonya"

    const-string/jumbo v3, "Gwen-Sonya"

    const/16 v4, 0xada

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xada

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gwen-sonya"

    const-string/jumbo v3, "Gwen-Sonya"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xadb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lbc-sync"

    const-string/jumbo v3, "LBC Sync"

    const/16 v4, 0xadb

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xadb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lbc-sync"

    const-string/jumbo v3, "LBC Sync"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xadc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lbc-control"

    const-string/jumbo v3, "LBC Control"

    const/16 v4, 0xadc

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xadc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lbc-control"

    const-string/jumbo v3, "LBC Control"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xadd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "whosells"

    const-string/jumbo v3, "whosells"

    const/16 v4, 0xadd

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xadd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "whosells"

    const-string/jumbo v3, "whosells"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xade

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "everydayrc"

    const-string/jumbo v3, "everydayrc"

    const/16 v4, 0xade

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xade

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "everydayrc"

    const-string/jumbo v3, "everydayrc"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xadf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aises"

    const-string v3, "AISES"

    const/16 v4, 0xadf

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xadf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aises"

    const-string v3, "AISES"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "www-dev"

    const-string/jumbo v3, "world wide web - development"

    const/16 v4, 0xae0

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "www-dev"

    const-string/jumbo v3, "world wide web - development"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aic-np"

    const-string/jumbo v3, "aic-np"

    const/16 v4, 0xae1

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aic-np"

    const-string/jumbo v3, "aic-np"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aic-oncrpc"

    const-string/jumbo v3, "aic-oncrpc - Destiny MCD database"

    const/16 v4, 0xae2

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aic-oncrpc"

    const-string/jumbo v3, "aic-oncrpc - Destiny MCD database"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "piccolo"

    const-string/jumbo v3, "piccolo - Cornerstone Software"

    const/16 v4, 0xae3

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "piccolo"

    const-string/jumbo v3, "piccolo - Cornerstone Software"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fryeserv"

    const-string/jumbo v3, "NetWare Loadable Module - Seagate Software"

    const/16 v4, 0xae4

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fryeserv"

    const-string/jumbo v3, "NetWare Loadable Module - Seagate Software"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "media-agent"

    const-string/jumbo v3, "Media Agent"

    const/16 v4, 0xae5

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "media-agent"

    const-string/jumbo v3, "Media Agent"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "plgproxy"

    const-string/jumbo v3, "PLG Proxy"

    const/16 v4, 0xae6

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "plgproxy"

    const-string/jumbo v3, "PLG Proxy"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mtport-regist"

    const-string/jumbo v3, "MT Port Registrator"

    const/16 v4, 0xae7

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mtport-regist"

    const-string/jumbo v3, "MT Port Registrator"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "f5-globalsite"

    const-string/jumbo v3, "f5-globalsite"

    const/16 v4, 0xae8

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "f5-globalsite"

    const-string/jumbo v3, "f5-globalsite"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "initlsmsad"

    const-string/jumbo v3, "initlsmsad"

    const/16 v4, 0xae9

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xae9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "initlsmsad"

    const-string/jumbo v3, "initlsmsad"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "Unassigned"

    const/16 v3, 0xaea

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4, v4, v2}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaeb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "livestats"

    const-string/jumbo v3, "LiveStats"

    const/16 v7, 0xaeb

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaeb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "livestats"

    const-string/jumbo v3, "LiveStats"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ac-tech"

    const-string/jumbo v3, "ac-tech"

    const/16 v7, 0xaec

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ac-tech"

    const-string/jumbo v3, "ac-tech"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "esp-encap"

    const-string/jumbo v3, "esp-encap"

    const/16 v7, 0xaed

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "esp-encap"

    const-string/jumbo v3, "esp-encap"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tmesis-upshot"

    const-string/jumbo v3, "TMESIS-UPShot"

    const/16 v7, 0xaee

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tmesis-upshot"

    const-string/jumbo v3, "TMESIS-UPShot"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icon-discover"

    const-string/jumbo v3, "ICON Discover"

    const/16 v7, 0xaef

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icon-discover"

    const-string/jumbo v3, "ICON Discover"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acc-raid"

    const-string v3, "ACC RAID"

    const/16 v7, 0xaf0

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acc-raid"

    const-string v3, "ACC RAID"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "igcp"

    const-string/jumbo v3, "IGCP"

    const/16 v7, 0xaf1

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "igcp"

    const-string/jumbo v3, "IGCP"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "veritas-tcp1"

    const-string/jumbo v3, "Veritas TCP1"

    const/16 v7, 0xaf2

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "veritas-udp1"

    const-string/jumbo v3, "Veritas UDP1"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "btprjctrl"

    const-string/jumbo v3, "btprjctrl"

    const/16 v7, 0xaf3

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "btprjctrl"

    const-string/jumbo v3, "btprjctrl"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dvr-esm"

    const-string/jumbo v3, "March Networks Digital Video Recorders and Enterprise Service Manager products"

    const/16 v7, 0xaf4

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dvr-esm"

    const-string/jumbo v3, "March Networks Digital Video Recorders and Enterprise Service Manager products"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wta-wsp-s"

    const-string/jumbo v3, "WTA WSP-S"

    const/16 v7, 0xaf5

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wta-wsp-s"

    const-string/jumbo v3, "WTA WSP-S"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cspuni"

    const-string/jumbo v3, "cspuni"

    const/16 v7, 0xaf6

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cspuni"

    const-string/jumbo v3, "cspuni"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cspmulti"

    const-string/jumbo v3, "cspmulti"

    const/16 v7, 0xaf7

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cspmulti"

    const-string/jumbo v3, "cspmulti"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "j-lan-p"

    const-string/jumbo v3, "J-LAN-P"

    const/16 v7, 0xaf8

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "j-lan-p"

    const-string/jumbo v3, "J-LAN-P"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "corbaloc"

    const-string v3, "CORBA LOC"

    const/16 v7, 0xaf9

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaf9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "corbaloc"

    const-string v3, "CORBA LOC"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xafa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netsteward"

    const-string v3, "Active Net Steward"

    const/16 v7, 0xafa

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xafa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netsteward"

    const-string v3, "Active Net Steward"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xafb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gsiftp"

    const-string/jumbo v3, "GSI FTP"

    const/16 v7, 0xafb

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xafb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gsiftp"

    const-string/jumbo v3, "GSI FTP"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xafc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "atmtcp"

    const-string/jumbo v3, "atmtcp"

    const/16 v7, 0xafc

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xafc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "atmtcp"

    const-string/jumbo v3, "atmtcp"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xafd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "llm-pass"

    const-string/jumbo v3, "llm-pass"

    const/16 v7, 0xafd

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xafd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "llm-pass"

    const-string/jumbo v3, "llm-pass"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xafe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "llm-csv"

    const-string/jumbo v3, "llm-csv"

    const/16 v7, 0xafe

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xafe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "llm-csv"

    const-string/jumbo v3, "llm-csv"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lbc-measure"

    const-string/jumbo v3, "LBC Measurement"

    const/16 v7, 0xaff

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xaff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lbc-measure"

    const-string/jumbo v3, "LBC Measurement"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lbc-watchdog"

    const-string/jumbo v3, "LBC Watchdog"

    const/16 v7, 0xb00

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lbc-watchdog"

    const-string/jumbo v3, "LBC Watchdog"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nmsigport"

    const-string/jumbo v3, "NMSig Port"

    const/16 v7, 0xb01

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nmsigport"

    const-string/jumbo v3, "NMSig Port"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb02

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rmlnk"

    const-string/jumbo v3, "rmlnk"

    const/16 v7, 0xb02

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb02

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rmlnk"

    const-string/jumbo v3, "rmlnk"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb03

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fc-faultnotify"

    const-string/jumbo v3, "FC Fault Notification"

    const/16 v7, 0xb03

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb03

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fc-faultnotify"

    const-string/jumbo v3, "FC Fault Notification"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb04

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "univision"

    const-string/jumbo v3, "UniVision"

    const/16 v7, 0xb04

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb04

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "univision"

    const-string/jumbo v3, "UniVision"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb05

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vrts-at-port"

    const-string/jumbo v3, "VERITAS Authentication Service"

    const/16 v7, 0xb05

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb05

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vrts-at-port"

    const-string/jumbo v3, "VERITAS Authentication Service"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb06

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ka0wuc"

    const-string/jumbo v3, "ka0wuc"

    const/16 v7, 0xb06

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb06

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ka0wuc"

    const-string/jumbo v3, "ka0wuc"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb07

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cqg-netlan"

    const-string v3, "CQG Net/LAN"

    const/16 v7, 0xb07

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb07

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cqg-netlan"

    const-string v3, "CQG Net/LAN"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb08

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cqg-netlan-1"

    const-string v3, "CQG Net/LAN 1"

    const/16 v7, 0xb08

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb08

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cqg-netlan-1"

    const-string v3, "CQG Net/Lan 1"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb09

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xb09

    const-string v3, "(unassigned) Possibly assigned"

    invoke-direct {v1, v2, v4, v4, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb0a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "slc-systemlog"

    const-string/jumbo v3, "slc systemlog"

    const/16 v7, 0xb0a

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb0a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "slc-systemlog"

    const-string/jumbo v3, "slc systemlog"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb0b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "slc-ctrlrloops"

    const-string/jumbo v3, "slc ctrlrloops"

    const/16 v7, 0xb0b

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb0b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "slc-ctrlrloops"

    const-string/jumbo v3, "slc ctrlrloops"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb0c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "itm-lm"

    const-string/jumbo v3, "ITM License Manager"

    const/16 v7, 0xb0c

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb0c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "itm-lm"

    const-string/jumbo v3, "ITM License Manager"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb0d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "silkp1"

    const-string/jumbo v3, "silkp1"

    const/16 v7, 0xb0d

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb0d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "silkp1"

    const-string/jumbo v3, "silkp1"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb0e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "silkp2"

    const-string/jumbo v3, "silkp2"

    const/16 v7, 0xb0e

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb0e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "silkp2"

    const-string/jumbo v3, "silkp2"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb0f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "silkp3"

    const-string/jumbo v3, "silkp3"

    const/16 v7, 0xb0f

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb0f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "silkp3"

    const-string/jumbo v3, "silkp3"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "silkp4"

    const-string/jumbo v3, "silkp4"

    const/16 v7, 0xb10

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "silkp4"

    const-string/jumbo v3, "silkp4"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb11

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "glishd"

    const-string/jumbo v3, "glishd"

    const/16 v7, 0xb11

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb11

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "glishd"

    const-string/jumbo v3, "glishd"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb12

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "evtp"

    const-string/jumbo v3, "EVTP"

    const/16 v7, 0xb12

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb12

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "evtp"

    const-string/jumbo v3, "EVTP"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb13

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "evtp-data"

    const-string/jumbo v3, "EVTP-DATA"

    const/16 v7, 0xb13

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb13

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "evtp-data"

    const-string/jumbo v3, "EVTP-DATA"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb14

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "catalyst"

    const-string/jumbo v3, "catalyst"

    const/16 v7, 0xb14

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb14

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "catalyst"

    const-string/jumbo v3, "catalyst"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb15

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "repliweb"

    const-string/jumbo v3, "Repliweb"

    const/16 v7, 0xb15

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb15

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "repliweb"

    const-string/jumbo v3, "Repliweb"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb16

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "starbot"

    const-string/jumbo v3, "Starbot"

    const/16 v7, 0xb16

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb16

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "starbot"

    const-string/jumbo v3, "Starbot"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb17

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nmsigport"

    const-string/jumbo v3, "NMSigPort"

    const/16 v7, 0xb17

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb17

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nmsigport"

    const-string/jumbo v3, "NMSigPort"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb18

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l3-exprt"

    const-string/jumbo v3, "l3-exprt"

    const/16 v7, 0xb18

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb18

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l3-exprt"

    const-string/jumbo v3, "l3-exprt"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb19

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l3-ranger"

    const-string/jumbo v3, "l3-ranger"

    const/16 v7, 0xb19

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb19

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l3-ranger"

    const-string/jumbo v3, "l3-ranger"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb1a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l3-hawk"

    const-string/jumbo v3, "l3-hawk"

    const/16 v7, 0xb1a

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb1a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "l3-hawk"

    const-string/jumbo v3, "l3-hawk"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb1b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pdnet"

    const-string/jumbo v3, "PDnet"

    const/16 v7, 0xb1b

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb1b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pdnet"

    const-string/jumbo v3, "PDnet"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb1c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bpcp-poll"

    const-string v3, "BPCP POLL"

    const/16 v7, 0xb1c

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb1c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bpcp-poll"

    const-string v3, "BPCP POLL"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb1d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bpcp-trap"

    const-string v3, "BPCP TRAP"

    const/16 v7, 0xb1d

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb1d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bpcp-trap"

    const-string v3, "BPCP TRAP"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb1e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aimpp-hello"

    const-string v3, "AIMPP Hello"

    const/16 v7, 0xb1e

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb1e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aimpp-hello"

    const-string v3, "AIMPP Hello"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb1f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aimpp-port-req"

    const-string v3, "AIMPP Port Req"

    const/16 v7, 0xb1f

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb1f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aimpp-port-req"

    const-string v3, "AIMPP Port Req"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amt-blc-port"

    const-string v3, "AMT-BLC-PORT"

    const/16 v7, 0xb20

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amt-blc-port"

    const-string v3, "AMT-BLC-PORT"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb21

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fxp"

    const-string/jumbo v3, "FXP"

    const/16 v7, 0xb21

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb21

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fxp"

    const-string/jumbo v3, "FXP"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "metaconsole"

    const-string/jumbo v3, "MetaConsole"

    const/16 v7, 0xb22

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "metaconsole"

    const-string/jumbo v3, "MetaConsole"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb23

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "webemshttp"

    const-string/jumbo v3, "webemshttp"

    const/16 v7, 0xb23

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb23

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "webemshttp"

    const-string/jumbo v3, "webemshttp"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb24

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bears-01"

    const-string/jumbo v3, "bears-01"

    const/16 v7, 0xb24

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb24

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bears-01"

    const-string/jumbo v3, "bears-01"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb25

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ispipes"

    const-string/jumbo v3, "ISPipes"

    const/16 v7, 0xb25

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb25

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ispipes"

    const-string/jumbo v3, "ISPipes"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb26    # 4.0E-42f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "infomover"

    const-string/jumbo v3, "InfoMover"

    const/16 v7, 0xb26    # 4.0E-42f

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb26    # 4.0E-42f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "infomover"

    const-string/jumbo v3, "InfoMover"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb27    # 4.001E-42f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msrp"

    const-string/jumbo v3, "MSRP over TCP"

    const/16 v7, 0xb27    # 4.001E-42f

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb27    # 4.001E-42f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xb27    # 4.001E-42f

    const-string/jumbo v3, "Reserved"

    invoke-direct {v1, v2, v4, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb28

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cesdinv"

    const-string/jumbo v7, "cesdinv"

    const/16 v8, 0xb28

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb28

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cesdinv"

    const-string/jumbo v7, "cesdinv"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb29

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "simctlp"

    const-string/jumbo v7, "SimCtIP"

    const/16 v8, 0xb29

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb29

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "simctlp"

    const-string/jumbo v7, "SimCtIP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb2a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ecnp"

    const-string/jumbo v7, "ECNP"

    const/16 v8, 0xb2a

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb2a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ecnp"

    const-string/jumbo v7, "ECNP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb2b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "activememory"

    const-string v7, "Active Memory"

    const/16 v8, 0xb2b

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb2b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "activememory"

    const-string v7, "Active Memory"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb2c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dialpad-voice1"

    const-string v7, "Dialpad Voice 1"

    const/16 v8, 0xb2c

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb2c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dialpad-voice1"

    const-string v7, "Dialpad Voice 1"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb2d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dialpad-voice2"

    const-string v7, "Dialpad Voice 2"

    const/16 v8, 0xb2d

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb2d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dialpad-voice2"

    const-string v7, "Dialpad Voice 2"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb2e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ttg-protocol"

    const-string/jumbo v7, "TTG Protocol"

    const/16 v8, 0xb2e

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb2e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ttg-protocol"

    const-string/jumbo v7, "TTG Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb2f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sonardata"

    const-string/jumbo v7, "Sonar Data"

    const/16 v8, 0xb2f

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb2f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sonardata"

    const-string/jumbo v7, "Sonar Data"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb30

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "astronova-main"

    const-string/jumbo v7, "main 5001 cmd"

    const/16 v8, 0xb30

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb30

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "astronova-main"

    const-string/jumbo v7, "main 5001 cmd"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb31

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pit-vpn"

    const-string/jumbo v7, "pit-vpn"

    const/16 v8, 0xb31

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb31

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pit-vpn"

    const-string/jumbo v7, "pit-vpn"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iwlistener"

    const-string/jumbo v7, "iwlistener"

    const/16 v8, 0xb32

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iwlistener"

    const-string/jumbo v7, "iwlistener"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb33

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "esps-portal"

    const-string/jumbo v7, "esps-portal"

    const/16 v8, 0xb33

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb33

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "esps-portal"

    const-string/jumbo v7, "esps-portal"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb34

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "npep-messaging"

    const-string/jumbo v7, "Norman Proprietaqry Events Protocol"

    const/16 v8, 0xb34

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb34

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "npep-messaging"

    const-string/jumbo v7, "Norman Proprietaqry Events Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb35

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icslap"

    const-string/jumbo v7, "ICSLAP"

    const/16 v8, 0xb35

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb35

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icslap"

    const-string/jumbo v7, "ICSLAP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "daishi"

    const-string/jumbo v7, "daishi"

    const/16 v8, 0xb36

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "daishi"

    const-string/jumbo v7, "daishi"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb37

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msi-selectplay"

    const-string/jumbo v7, "MSI Select Play"

    const/16 v8, 0xb37

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb37

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "msi-selectplay"

    const-string/jumbo v7, "MSI Select Play"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb38

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "radix"

    const-string/jumbo v7, "RADIX"

    const/16 v8, 0xb38

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb38

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "radix"

    const-string/jumbo v7, "RADIX"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb39

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "psrt"

    const-string/jumbo v7, "PubSub Realtime Telemetry Protocol"

    const/16 v8, 0xb39

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb39

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "psrt"

    const-string/jumbo v7, "PubSub Realtime Telemetry Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb3a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dxmessagebase1"

    const-string v7, "DX Message Base Transport Protocol"

    const/16 v8, 0xb3a

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb3a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dxmessagebase1"

    const-string v7, "DX Message Base Transport Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb3b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dxmessagebase2"

    const-string v7, "DX Message Base Transport Protocol"

    const/16 v8, 0xb3b

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb3b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dxmessagebase2"

    const-string v7, "DX Message Base Transport Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sps-tunnel"

    const-string/jumbo v7, "SPS Tunnel"

    const/16 v8, 0xb3c

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sps-tunnel"

    const-string/jumbo v7, "SPS Tunnel"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb3d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bluelance"

    const-string v7, "BLUELANCE"

    const/16 v8, 0xb3d

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb3d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bluelance"

    const-string v7, "BLUELANCE"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb3e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aap"

    const-string v7, "AAP"

    const/16 v8, 0xb3e

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb3e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aap"

    const-string v7, "AAP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb3f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ucentric-ds"

    const-string/jumbo v7, "ucentric-ds"

    const/16 v8, 0xb3f

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb3f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ucentric-ds"

    const-string/jumbo v7, "ucentric-ds"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb40

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synapse"

    const-string/jumbo v7, "Synapse Transport"

    const/16 v8, 0xb40

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb40

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synapse"

    const-string/jumbo v7, "Synapse Transport"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb41

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndsp"

    const-string/jumbo v7, "NDSP"

    const/16 v8, 0xb41

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb41

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndsp"

    const-string/jumbo v7, "NDSP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb42

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndtp"

    const-string/jumbo v7, "NDTP"

    const/16 v8, 0xb42

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb42

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndtp"

    const-string/jumbo v7, "NDTP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb43

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndnp"

    const-string/jumbo v7, "NDNP"

    const/16 v8, 0xb43

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb43

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndnp"

    const-string/jumbo v7, "NDNP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb44

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "flashmsg"

    const-string/jumbo v7, "Flash Msg"

    const/16 v8, 0xb44

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb44

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "flashmsg"

    const-string/jumbo v7, "Flash Msg"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb45

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "topflow"

    const-string/jumbo v7, "TopFlow"

    const/16 v8, 0xb45

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb45

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "topflow"

    const-string/jumbo v7, "TopFlow"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb46

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "responselogic"

    const-string/jumbo v7, "RESPONSELOGIC"

    const/16 v8, 0xb46

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb46

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "responselogic"

    const-string/jumbo v7, "RESPONSELOGIC"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb47

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aironetddp"

    const-string/jumbo v7, "aironet"

    const/16 v8, 0xb47

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb47

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aironetddp"

    const-string/jumbo v7, "aironet"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb48

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spcsdlobby"

    const-string/jumbo v7, "SPCSDLOBBY"

    const/16 v8, 0xb48

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb48

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spcsdlobby"

    const-string/jumbo v7, "SPCSDLOBBY"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb49

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rsom"

    const-string/jumbo v7, "RSOM"

    const/16 v8, 0xb49

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb49

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rsom"

    const-string/jumbo v7, "RSOM"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb4a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cspclmulti"

    const-string v7, "CSPCLMULTI"

    const/16 v8, 0xb4a

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb4a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cspclmulti"

    const-string v7, "CSPCLMULTI"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb4b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cinegrfx-elmd"

    const-string v7, "CINEGRFX-ELMD License Manager"

    const/16 v8, 0xb4b

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb4b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cinegrfx-elmd"

    const-string v7, "CINEGRFX-ELMD License Manager"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb4c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "snifferdata"

    const-string/jumbo v7, "SNIFFERDATA"

    const/16 v8, 0xb4c

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb4c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "snifferdata"

    const-string/jumbo v7, "SNIFFERDATA"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb4d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vseconnector"

    const-string/jumbo v7, "VSECONNECTOR"

    const/16 v8, 0xb4d

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb4d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vseconnector"

    const-string/jumbo v7, "VSECONNECTOR"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb4e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "abacus-remote"

    const-string v7, "ABACUS-REMOTE"

    const/16 v8, 0xb4e

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb4e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "abacus-remote"

    const-string v7, "ABACUS-REMOTE"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb4f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "natuslink"

    const-string/jumbo v7, "NATUS LINK"

    const/16 v8, 0xb4f

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb4f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "natuslink"

    const-string/jumbo v7, "NATUS LINK"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb50

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ecovisiong6-1"

    const-string/jumbo v7, "ECOVISIONG6-1"

    const/16 v8, 0xb50

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb50

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ecovisiong6-1"

    const-string/jumbo v7, "ECOVISIONG6-1"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb51

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "citrix-rtmp"

    const-string v7, "Citrix RTMP"

    const/16 v8, 0xb51

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb51

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "citrix-rtmp"

    const-string v7, "Citrix RTMP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb52

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "appliance-cfg"

    const-string v7, "APPLIANCE-CFG"

    const/16 v8, 0xb52

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb52

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "appliance-cfg"

    const-string v7, "APPLIANCE-CFG"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb53

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "powergemplus"

    const-string/jumbo v7, "POWERGEMPLUS"

    const/16 v8, 0xb53

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb53

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "powergemplus"

    const-string/jumbo v7, "POWERGEMPLUS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb54

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "quicksuite"

    const-string/jumbo v7, "QUICKSUITE"

    const/16 v8, 0xb54

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb54

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "quicksuite"

    const-string/jumbo v7, "QUICKSUITE"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb55

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "allstorcns"

    const-string v7, "ALLSTORCNS"

    const/16 v8, 0xb55

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb55

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "allstorcns"

    const-string v7, "ALLSTORCNS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb56

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netaspi"

    const-string/jumbo v7, "NET ASPI"

    const/16 v8, 0xb56

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb56

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netaspi"

    const-string/jumbo v7, "NET ASPI"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb57

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "suitcase"

    const-string/jumbo v7, "SUITCASE"

    const/16 v8, 0xb57

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb57

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "suitcase"

    const-string/jumbo v7, "SUITCASE"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb58

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "m2ua"

    const-string/jumbo v8, "M2UA"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "m2ua"

    const-string/jumbo v8, "M2UA"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "sctp"

    const-string/jumbo v8, "M2UA"

    const-string/jumbo v9, "m2ua"

    invoke-direct {v2, v0, v9, v7, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb59

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "m3ua"

    const-string/jumbo v8, "M3UA"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string v7, "De-registered"

    invoke-direct {v2, v0, v4, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "sctp"

    const-string/jumbo v8, "M3UA"

    const-string/jumbo v9, "m3ua"

    invoke-direct {v2, v0, v9, v7, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb5a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "caller9"

    const-string v7, "CALLER9"

    const/16 v8, 0xb5a

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb5a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "caller9"

    const-string v7, "CALLER9"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb5b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "webmethods-b2b"

    const-string/jumbo v7, "WEBMETHODS B2B"

    const/16 v8, 0xb5b

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb5b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "webmethods-b2b"

    const-string/jumbo v7, "WEBMETHODS B2B"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb5c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mao"

    const-string/jumbo v7, "mao"

    const/16 v8, 0xb5c

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb5c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mao"

    const-string/jumbo v7, "mao"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb5d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "funk-dialout"

    const-string/jumbo v7, "Funk Dialout"

    const/16 v8, 0xb5d

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb5d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "funk-dialout"

    const-string/jumbo v7, "Funk Dialout"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb5e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tdaccess"

    const-string/jumbo v7, "TDAccess"

    const/16 v8, 0xb5e

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb5e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tdaccess"

    const-string/jumbo v7, "TDAccess"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb5f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "blockade"

    const-string v7, "Blockade"

    const/16 v8, 0xb5f

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb5f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "blockade"

    const-string v7, "Blockade"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "epicon"

    const-string/jumbo v7, "Epicon"

    const/16 v8, 0xb60

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "epicon"

    const-string/jumbo v7, "Epicon"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "boosterware"

    const-string v7, "Booster Ware"

    const/16 v8, 0xb61

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "boosterware"

    const-string v7, "Booster Ware"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb62

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gamelobby"

    const-string/jumbo v7, "Game Lobby"

    const/16 v8, 0xb62

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb62

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gamelobby"

    const-string/jumbo v7, "Game Lobby"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb63

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tksocket"

    const-string/jumbo v7, "TK Socket"

    const/16 v8, 0xb63

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb63

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tksocket"

    const-string/jumbo v7, "TK Socket"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "elvin-server"

    const-string/jumbo v8, "Elvin Server"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "elvin_server"

    const-string/jumbo v8, "Elvin Server"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "elvin-server"

    const-string/jumbo v8, "Elvin Server"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "elvin_server"

    const-string/jumbo v8, "Elvin Server"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb65

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "elvin-client"

    const-string/jumbo v8, "Elvin Client"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "elvin_client"

    const-string/jumbo v8, "Elvin Client"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "elvin-client"

    const-string/jumbo v8, "Elvin Client"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "elvin_client"

    const-string/jumbo v8, "Elvin Client"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb66

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kastenchasepad"

    const-string/jumbo v7, "Kasten Chase Pad"

    const/16 v8, 0xb66

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb66

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kastenchasepad"

    const-string/jumbo v7, "Kasten Chase Pad"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb67

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "roboer"

    const-string/jumbo v7, "roboER"

    const/16 v8, 0xb67

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb67

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "roboer"

    const-string/jumbo v7, "roboER"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "roboeda"

    const-string/jumbo v7, "roboEDA"

    const/16 v8, 0xb68

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "roboeda"

    const-string/jumbo v7, "roboEDA"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cesdcdman"

    const-string v7, "CESD Contents Delivery Management"

    const/16 v8, 0xb69

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cesdcdman"

    const-string v7, "CESD Contents Delivery Management"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cesdcdtrn"

    const-string v7, "CESD Contents Delivery Data Transfer"

    const/16 v8, 0xb6a

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cesdcdtrn"

    const-string v7, "CESD Contents Delivery Data Transfer"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb6b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wta-wsp-wtp-s"

    const-string/jumbo v7, "WTA-WSP-WTP-S"

    const/16 v8, 0xb6b

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb6b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wta-wsp-wtp-s"

    const-string/jumbo v7, "WTA-WSP-WTP-S"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb6c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "precise-vip"

    const-string/jumbo v7, "PRECISE-VIP"

    const/16 v8, 0xb6c

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb6c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "precise-vip"

    const-string/jumbo v7, "PRECISE-VIP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb6d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xb6d

    const-string/jumbo v7, "Unassigned (FRP-Released 12/7/00)"

    invoke-direct {v1, v2, v4, v4, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mobile-file-dl"

    const-string/jumbo v7, "MOBILE-FILE-DL"

    const/16 v8, 0xb6e

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mobile-file-dl"

    const-string/jumbo v7, "MOBILE-FILE-DL"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb6f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unimobilectrl"

    const-string/jumbo v7, "UNIMOBILECTRL"

    const/16 v8, 0xb6f

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb6f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unimobilectrl"

    const-string/jumbo v7, "UNIMOBILECTRL"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "redstone-cpss"

    const-string/jumbo v7, "REDSTONE-CPSS"

    const/16 v8, 0xb70

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "redstone-cpss"

    const-string/jumbo v7, "REDSTONE-CPSS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb71

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amx-webadmin"

    const-string v7, "AMX-WEBADMIN"

    const/16 v8, 0xb71

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb71

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amx-webadmin"

    const-string v7, "AMX-WEBADMIN"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb72

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amx-weblinx"

    const-string v7, "AMX-WEBLINX"

    const/16 v8, 0xb72

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb72

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amx-weblinx"

    const-string v7, "AMX-WEBLINX"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb73

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "circle-x"

    const-string v7, "Circle-X"

    const/16 v8, 0xb73

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb73

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "circle-x"

    const-string v7, "Circle-X"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb74

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "incp"

    const-string/jumbo v7, "INCP"

    const/16 v8, 0xb74

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb74

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "incp"

    const-string/jumbo v7, "INCP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb75

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "4-tieropmgw"

    const-string v7, "4-TIER OPM GW"

    const/16 v8, 0xb75

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb75

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "4-tieropmgw"

    const-string v7, "4-TIER OPM GW"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "4-tieropmcli"

    const-string v7, "4-TIER OPM CLI"

    const/16 v8, 0xb76

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "4-tieropmcli"

    const-string v7, "4-TIER OPM CLI"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb77

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qtp"

    const-string/jumbo v7, "QTP"

    const/16 v8, 0xb77

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb77

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qtp"

    const-string/jumbo v7, "QTP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb78

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "otpatch"

    const-string/jumbo v7, "OTPatch"

    const/16 v8, 0xb78

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb78

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "otpatch"

    const-string/jumbo v7, "OTPatch"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb79

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pnaconsult-lm"

    const-string/jumbo v7, "PNACONSULT-LM"

    const/16 v8, 0xb79

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb79

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pnaconsult-lm"

    const-string/jumbo v7, "PNACONSULT-LM"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb7a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sm-pas-1"

    const-string/jumbo v7, "SM-PAS-1"

    const/16 v8, 0xb7a

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb7a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sm-pas-1"

    const-string/jumbo v7, "SM-PAS-1"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb7b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sm-pas-2"

    const-string/jumbo v7, "SM-PAS-2"

    const/16 v8, 0xb7b

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb7b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sm-pas-2"

    const-string/jumbo v7, "SM-PAS-2"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb7c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sm-pas-3"

    const-string/jumbo v7, "SM-PAS-3"

    const/16 v8, 0xb7c

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb7c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sm-pas-3"

    const-string/jumbo v7, "SM-PAS-3"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb7d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sm-pas-4"

    const-string/jumbo v7, "SM-PAS-4"

    const/16 v8, 0xb7d

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb7d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sm-pas-4"

    const-string/jumbo v7, "SM-PAS-4"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb7e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sm-pas-5"

    const-string/jumbo v7, "SM-PAS-5"

    const/16 v8, 0xb7e

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb7e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sm-pas-5"

    const-string/jumbo v7, "SM-PAS-5"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb7f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ttnrepository"

    const-string/jumbo v7, "TTNRepository"

    const/16 v8, 0xb7f

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb7f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ttnrepository"

    const-string/jumbo v7, "TTNRepository"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "megaco-h248"

    const-string/jumbo v7, "Megaco H-248"

    const/16 v8, 0xb80

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "megaco-h248"

    const-string/jumbo v7, "Megaco H-248"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sctp"

    const-string/jumbo v7, "Megaco-H.248 text"

    const-string/jumbo v9, "megaco-h248"

    invoke-direct {v1, v8, v9, v2, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb81

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "h248-binary"

    const-string/jumbo v7, "H248 Binary"

    const/16 v8, 0xb81

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb81

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "h248-binary"

    const-string/jumbo v7, "H248 Binary"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb81

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sctp"

    const-string/jumbo v7, "Megaco/H.248 binary"

    const-string/jumbo v9, "h248-binary"

    invoke-direct {v1, v8, v9, v2, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fjsvmpor"

    const-string/jumbo v7, "FJSVmpor"

    const/16 v8, 0xb82

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fjsvmpor"

    const-string/jumbo v7, "FJSVmpor"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb83

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gpsd"

    const-string/jumbo v7, "GPS Daemon request/response protocol"

    const/16 v8, 0xb83

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb83

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gpsd"

    const-string/jumbo v7, "GPS Daemon request/response protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb84

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wap-push"

    const-string/jumbo v7, "WAP PUSH"

    const/16 v8, 0xb84

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb84

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wap-push"

    const-string/jumbo v7, "WAP PUSH"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb85

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wap-pushsecure"

    const-string/jumbo v7, "WAP PUSH SECURE"

    const/16 v8, 0xb85

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb85

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wap-pushsecure"

    const-string/jumbo v7, "WAP PUSH SECURE"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb86

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "esip"

    const-string/jumbo v7, "ESIP"

    const/16 v8, 0xb86

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb86

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "esip"

    const-string/jumbo v7, "ESIP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb87

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ottp"

    const-string/jumbo v7, "OTTP"

    const/16 v8, 0xb87

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb87

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ottp"

    const-string/jumbo v7, "OTTP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb88

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mpfwsas"

    const-string/jumbo v7, "MPFWSAS"

    const/16 v8, 0xb88

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb88

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mpfwsas"

    const-string/jumbo v7, "MPFWSAS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb89

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovalarmsrv"

    const-string/jumbo v7, "OVALARMSRV"

    const/16 v8, 0xb89

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb89

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovalarmsrv"

    const-string/jumbo v7, "OVALARMSRV"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb8a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovalarmsrv-cmd"

    const-string/jumbo v7, "OVALARMSRV-CMD"

    const/16 v8, 0xb8a

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb8a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovalarmsrv-cmd"

    const-string/jumbo v7, "OVALARMSRV-CMD"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb8b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csnotify"

    const-string v7, "CSNOTIFY"

    const/16 v8, 0xb8b

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb8b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csnotify"

    const-string v7, "CSNOTIFY"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb8c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovrimosdbman"

    const-string/jumbo v7, "OVRIMOSDBMAN"

    const/16 v8, 0xb8c

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb8c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovrimosdbman"

    const-string/jumbo v7, "OVRIMOSDBMAN"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb8d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmact5"

    const-string/jumbo v7, "JAMCT5"

    const/16 v8, 0xb8d

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb8d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmact5"

    const-string/jumbo v7, "JAMCT5"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb8e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmact6"

    const-string/jumbo v7, "JAMCT6"

    const/16 v8, 0xb8e

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb8e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmact6"

    const-string/jumbo v7, "JAMCT6"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb8f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rmopagt"

    const-string/jumbo v7, "RMOPAGT"

    const/16 v8, 0xb8f

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb8f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rmopagt"

    const-string/jumbo v7, "RMOPAGT"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb90

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dfoxserver"

    const-string v7, "DFOXSERVER"

    const/16 v8, 0xb90

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb90

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dfoxserver"

    const-string v7, "DFOXSERVER"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb91

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "boldsoft-lm"

    const-string v7, "BOLDSOFT-LM"

    const/16 v8, 0xb91

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb91

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "boldsoft-lm"

    const-string v7, "BOLDSOFT-LM"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb92

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iph-policy-cli"

    const-string/jumbo v7, "IPH-POLICY-CLI"

    const/16 v8, 0xb92

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb92

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iph-policy-cli"

    const-string/jumbo v7, "IPH-POLICY-CLI"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb93

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iph-policy-adm"

    const-string/jumbo v7, "IPH-POLICY-ADM"

    const/16 v8, 0xb93

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb93

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iph-policy-adm"

    const-string/jumbo v7, "IPH-POLICY-ADM"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb94

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bullant-srap"

    const-string v7, "BULLANT SRAP"

    const/16 v8, 0xb94

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb94

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bullant-srap"

    const-string v7, "BULLANT SRAP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb95

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bullant-rap"

    const-string v7, "BULLANT RAP"

    const/16 v8, 0xb95

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb95

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bullant-rap"

    const-string v7, "BULLANT RAP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb96

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "idp-infotrieve"

    const-string/jumbo v7, "IDP-INFOTRIEVE"

    const/16 v8, 0xb96

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb96

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "idp-infotrieve"

    const-string/jumbo v7, "IDP-INFOTRIEVE"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb97

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ssc-agent"

    const-string/jumbo v7, "SSC-AGENT"

    const/16 v8, 0xb97

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb97

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ssc-agent"

    const-string/jumbo v7, "SSC-AGENT"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb98

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "enpp"

    const-string/jumbo v7, "ENPP"

    const/16 v8, 0xb98

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb98

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "enpp"

    const-string/jumbo v7, "ENPP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb99

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "essp"

    const-string/jumbo v7, "ESSP"

    const/16 v8, 0xb99

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb99

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "essp"

    const-string/jumbo v7, "ESSP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb9a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "index-net"

    const-string/jumbo v7, "INDEX-NET"

    const/16 v8, 0xb9a

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb9a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "index-net"

    const-string/jumbo v7, "INDEX-NET"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb9b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netclip"

    const-string/jumbo v7, "NetClip clipboard daemon"

    const/16 v8, 0xb9b

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb9b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netclip"

    const-string/jumbo v7, "NetClip clipboard daemon"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb9c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmsm-webrctl"

    const-string/jumbo v7, "PMSM Webrctl"

    const/16 v8, 0xb9c

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb9c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmsm-webrctl"

    const-string/jumbo v7, "PMSM Webrctl"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb9d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "svnetworks"

    const-string/jumbo v7, "SV Networks"

    const/16 v8, 0xb9d

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb9d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "svnetworks"

    const-string/jumbo v7, "SV Networks"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb9e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "signal"

    const-string/jumbo v7, "Signal"

    const/16 v8, 0xb9e

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb9e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "signal"

    const-string/jumbo v7, "Signal"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb9f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fjmpcm"

    const-string/jumbo v7, "Fujitsu Configuration Management Service"

    const/16 v8, 0xb9f

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xb9f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fjmpcm"

    const-string/jumbo v7, "Fujitsu Configuration Management Service"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cns-srv-port"

    const-string v7, "CNS Server Port"

    const/16 v8, 0xba0

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cns-srv-port"

    const-string v7, "CNS Server Port"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ttc-etap-ns"

    const-string/jumbo v7, "TTCs Enterprise Test Access Protocol - NS"

    const/16 v8, 0xba1

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ttc-etap-ns"

    const-string/jumbo v7, "TTCs Enterprise Test Access Protocol - NS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ttc-etap-ds"

    const-string/jumbo v7, "TTCs Enterprise Test Access Protocol - DS"

    const/16 v8, 0xba2

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ttc-etap-ds"

    const-string/jumbo v7, "TTCs Enterprise Test Access Protocol - DS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "h263-video"

    const-string/jumbo v7, "H.263 Video Streaming"

    const/16 v8, 0xba3

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "h263-video"

    const-string/jumbo v7, "H.263 Video Streaming"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wimd"

    const-string/jumbo v7, "Instant Messaging Service"

    const/16 v8, 0xba4

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wimd"

    const-string/jumbo v7, "Instant Messaging Service"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mylxamport"

    const-string/jumbo v7, "MYLXAMPORT"

    const/16 v8, 0xba5

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mylxamport"

    const-string/jumbo v7, "MYLXAMPORT"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iwb-whiteboard"

    const-string/jumbo v7, "IWB-WHITEBOARD"

    const/16 v8, 0xba6

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iwb-whiteboard"

    const-string/jumbo v7, "IWB-WHITEBOARD"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netplan"

    const-string/jumbo v7, "NETPLAN"

    const/16 v8, 0xba7

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netplan"

    const-string/jumbo v7, "NETPLAN"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpidsadmin"

    const-string/jumbo v7, "HPIDSADMIN"

    const/16 v8, 0xba8

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpidsadmin"

    const-string/jumbo v7, "HPIDSADMIN"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpidsagent"

    const-string/jumbo v7, "HPIDSAGENT"

    const/16 v8, 0xba9

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xba9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hpidsagent"

    const-string/jumbo v7, "HPIDSAGENT"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbaa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "stonefalls"

    const-string/jumbo v7, "STONEFALLS"

    const/16 v8, 0xbaa

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbaa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "stonefalls"

    const-string/jumbo v7, "STONEFALLS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbab

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "identify"

    const-string/jumbo v7, "identify"

    const/16 v8, 0xbab

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbab

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "identify"

    const-string/jumbo v7, "identify"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbac

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hippad"

    const-string/jumbo v7, "HIPPA Reporting Protocol"

    const/16 v8, 0xbac

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbac

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hippad"

    const-string/jumbo v7, "HIPPA Reporting Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbad

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "zarkov"

    const-string/jumbo v7, "ZARKOV Intelligent Agent Communication"

    const/16 v8, 0xbad

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbad

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "zarkov"

    const-string/jumbo v7, "ZARKOV Intelligent Agent Communication"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbae

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "boscap"

    const-string v7, "BOSCAP"

    const/16 v8, 0xbae

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbae

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "boscap"

    const-string v7, "BOSCAP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbaf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wkstn-mon"

    const-string/jumbo v7, "WKSTN-MON"

    const/16 v8, 0xbaf

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbaf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wkstn-mon"

    const-string/jumbo v7, "WKSTN-MON"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "avenyo"

    const-string v7, "Avenyo Server"

    const/16 v8, 0xbb0

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "avenyo"

    const-string v7, "Avenyo Server"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "veritas-vis1"

    const-string/jumbo v7, "VERITAS VIS1"

    const/16 v8, 0xbb1

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "veritas-vis1"

    const-string/jumbo v7, "VERITAS VIS1"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "veritas-vis2"

    const-string/jumbo v7, "VERITAS VIS2"

    const/16 v8, 0xbb2

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "veritas-vis2"

    const-string/jumbo v7, "VERITAS VIS2"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "idrs"

    const-string/jumbo v7, "IDRS"

    const/16 v8, 0xbb3

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "idrs"

    const-string/jumbo v7, "IDRS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vsixml"

    const-string/jumbo v7, "vsixml"

    const/16 v8, 0xbb4

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vsixml"

    const-string/jumbo v7, "vsixml"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rebol"

    const-string/jumbo v7, "REBOL"

    const/16 v8, 0xbb5

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rebol"

    const-string/jumbo v7, "REBOL"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "realsecure"

    const-string/jumbo v7, "Real Secure"

    const/16 v8, 0xbb6

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "realsecure"

    const-string/jumbo v7, "Real Secure"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "remoteware-un"

    const-string/jumbo v7, "RemoteWare Unassigned"

    const/16 v8, 0xbb7

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "remoteware-un"

    const-string/jumbo v7, "RemoteWare Unassigned"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "hbci"

    const-string/jumbo v8, "HBCI"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "hbci"

    const-string/jumbo v8, "HBCI"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "remoteware-cl"

    const-string/jumbo v8, "RemoteWare Client"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "remoteware-cl"

    const-string/jumbo v8, "RemoteWare Client"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "origo-native"

    const-string/jumbo v7, "OrigoDB Server Native Interface"

    const/16 v8, 0xbb9

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbb9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xbb9

    invoke-direct {v1, v2, v4, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "exlm-agent"

    const-string/jumbo v8, "EXLM Agent"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "exlm-agent"

    const-string/jumbo v8, "EXLM Agent"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "remoteware-srv"

    const-string/jumbo v8, "RemoteWare Server"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "remoteware-srv"

    const-string/jumbo v8, "RemoteWare Server"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbbb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cgms"

    const-string v7, "CGMS"

    const/16 v8, 0xbbb

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbbb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cgms"

    const-string v7, "CGMS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbbc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csoftragent"

    const-string v7, "Csoft Agent"

    const/16 v8, 0xbbc

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbbc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csoftragent"

    const-string v7, "Csoft Agent"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbbd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "geniuslm"

    const-string/jumbo v7, "Genius License Manager"

    const/16 v8, 0xbbd

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbbd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "geniuslm"

    const-string/jumbo v7, "Genius License Manager"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbbe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ii-admin"

    const-string/jumbo v7, "Instant Internet Admin"

    const/16 v8, 0xbbe

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbbe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ii-admin"

    const-string/jumbo v7, "Instant Internet Admin"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbbf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lotusmtap"

    const-string/jumbo v7, "Lotus Mail Tracking Agent Protocol"

    const/16 v8, 0xbbf

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbbf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lotusmtap"

    const-string/jumbo v7, "Lotus Mail Tracking Agent Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "midnight-tech"

    const-string/jumbo v7, "Midnight Technologies"

    const/16 v8, 0xbc0

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "midnight-tech"

    const-string/jumbo v7, "Midnight Technologies"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pxc-ntfy"

    const-string/jumbo v7, "PXC-NTFY"

    const/16 v8, 0xbc1

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pxc-ntfy"

    const-string/jumbo v7, "PXC-NTFY"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gw"

    const-string/jumbo v7, "Telerate Workstation"

    const/16 v8, 0xbc2

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ping-pong"

    const-string/jumbo v7, "Telerate Workstation"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trusted-web"

    const-string/jumbo v7, "Trusted Web"

    const/16 v8, 0xbc3

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trusted-web"

    const-string/jumbo v7, "Trusted Web"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "twsdss"

    const-string/jumbo v7, "Trusted Web Client"

    const/16 v8, 0xbc4

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "twsdss"

    const-string/jumbo v7, "Trusted Web Client"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gilatskysurfer"

    const-string/jumbo v7, "Gilat Sky Surfer"

    const/16 v8, 0xbc5

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gilatskysurfer"

    const-string/jumbo v7, "Gilat Sky Surfer"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "broker-service"

    const-string v8, "Broker Service"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "broker_service"

    const-string v8, "Broker Service"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "broker-service"

    const-string v8, "Broker Service"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "broker_service"

    const-string v8, "Broker Service"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nati-dstp"

    const-string/jumbo v7, "NATI DSTP"

    const/16 v8, 0xbc7

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nati-dstp"

    const-string/jumbo v7, "NATI DSTP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "notify-srvr"

    const-string/jumbo v8, "Notify Server"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "notify_srvr"

    const-string/jumbo v8, "Notify Server"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "notify-srvr"

    const-string/jumbo v8, "Notify Server"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "notify_srvr"

    const-string/jumbo v8, "Notify Server"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbc9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "event-listener"

    const-string/jumbo v8, "Event Listener"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "event_listener"

    const-string/jumbo v8, "Event Listener"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "event-listener"

    const-string/jumbo v8, "Event Listener"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "event_listener"

    const-string/jumbo v8, "Event Listener"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "srvc-registry"

    const-string/jumbo v8, "Service Registry"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "srvc_registry"

    const-string/jumbo v8, "Service Registry"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "srvc-registry"

    const-string/jumbo v8, "Service Registry"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "srvc_registry"

    const-string/jumbo v8, "Service Registry"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbcb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "resource-mgr"

    const-string/jumbo v8, "Resource Manager"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "resource_mgr"

    const-string/jumbo v8, "Resource Manager"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "resource-mgr"

    const-string/jumbo v8, "Resource Manager"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "resource_mgr"

    const-string/jumbo v8, "Resource Manager"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbcc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cifs"

    const-string v7, "CIFS"

    const/16 v8, 0xbcc

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbcc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cifs"

    const-string v7, "CIFS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbcd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "agriserver"

    const-string v7, "AGRI Server"

    const/16 v8, 0xbcd

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbcd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "agriserver"

    const-string v7, "AGRI Server"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csregagent"

    const-string v7, "CSREGAGENT"

    const/16 v8, 0xbce

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csregagent"

    const-string v7, "CSREGAGENT"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbcf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "magicnotes"

    const-string/jumbo v7, "magicnotes"

    const/16 v8, 0xbcf

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbcf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "magicnotes"

    const-string/jumbo v7, "magicnotes"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "nds-sso"

    const-string/jumbo v8, "NDS_SSO"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "nds_sso"

    const-string/jumbo v8, "NDS_SSO"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "nds-sso"

    const-string/jumbo v8, "NDS_SSO"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "nds_sso"

    const-string/jumbo v8, "NDS_SSO"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "arepa-raft"

    const-string v7, "Arepa Raft"

    const/16 v8, 0xbd1

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "arepa-raft"

    const-string v7, "Arepa Raft"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "agri-gateway"

    const-string v7, "AGRI Gateway"

    const/16 v8, 0xbd2

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "agri-gateway"

    const-string v7, "AGRI Gateway"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "LiebDevMgmt-C"

    const-string/jumbo v8, "LiebDevMgmt_C"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "LiebDevMgmt_C"

    const-string/jumbo v8, "LiebDevMgmt_C"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "LiebDevMgmt-C"

    const-string/jumbo v8, "LiebDevMgmt_C"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "LiebDevMgmt_C"

    const-string/jumbo v8, "LiebDevMgmt_C"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "LiebDevMgmt-DM"

    const-string/jumbo v8, "LiebDevMgmt_DM"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "LiebDevMgmt_DM"

    const-string/jumbo v8, "LiebDevMgmt_DM"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "LiebDevMgmt-DM"

    const-string/jumbo v8, "LiebDevMgmt_DM"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "LiebDevMgmt_DM"

    const-string/jumbo v8, "LiebDevMgmt_DM"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "LiebDevMgmt-A"

    const-string/jumbo v8, "LiebDevMgmt_A"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "LiebDevMgmt_A"

    const-string/jumbo v8, "LiebDevMgmt_A"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "LiebDevMgmt-A"

    const-string/jumbo v8, "LiebDevMgmt_A"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "LiebDevMgmt_A"

    const-string/jumbo v8, "LiebDevMgmt_A"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "arepa-cas"

    const-string v7, "Arepa Cas"

    const/16 v8, 0xbd6

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "arepa-cas"

    const-string v7, "Arepa Cas"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eppc"

    const-string/jumbo v7, "Remote AppleEvents/PPC Toolbox"

    const/16 v8, 0xbd7

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eppc"

    const-string/jumbo v7, "Remote AppleEvents/PPC Toolbox"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "redwood-chat"

    const-string/jumbo v7, "Redwood Chat"

    const/16 v8, 0xbd8

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "redwood-chat"

    const-string/jumbo v7, "Redwood Chat"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pdb"

    const-string/jumbo v7, "PDB"

    const/16 v8, 0xbd9

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbd9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pdb"

    const-string/jumbo v7, "PDB"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbda

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "osmosis-aeea"

    const-string/jumbo v7, "Osmosis / Helix (R) AEEA Port"

    const/16 v8, 0xbda

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbda

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "osmosis-aeea"

    const-string/jumbo v7, "Osmosis / Helix (R) AEEA Port"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbdb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fjsv-gssagt"

    const-string/jumbo v7, "FJSV gssagt"

    const/16 v8, 0xbdb

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbdb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fjsv-gssagt"

    const-string/jumbo v7, "FJSV gssagt"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbdc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hagel-dump"

    const-string/jumbo v7, "Hagel DUMP"

    const/16 v8, 0xbdc

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbdc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hagel-dump"

    const-string/jumbo v7, "Hagel DUMP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbdd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hp-san-mgmt"

    const-string/jumbo v7, "HP SAN Mgmt"

    const/16 v8, 0xbdd

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbdd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hp-san-mgmt"

    const-string/jumbo v7, "HP SAN Mgmt"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbde

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "santak-ups"

    const-string/jumbo v7, "Santak UPS"

    const/16 v8, 0xbde

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbde

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "santak-ups"

    const-string/jumbo v7, "Santak UPS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbdf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cogitate"

    const-string v7, "Cogitate, Inc."

    const/16 v8, 0xbdf

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbdf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cogitate"

    const-string v7, "Cogitate, Inc."

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tomato-springs"

    const-string/jumbo v7, "Tomato Springs"

    const/16 v8, 0xbe0

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tomato-springs"

    const-string/jumbo v7, "Tomato Springs"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "di-traceware"

    const-string/jumbo v7, "di-traceware"

    const/16 v8, 0xbe1

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "di-traceware"

    const-string/jumbo v7, "di-traceware"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "journee"

    const-string/jumbo v7, "journee"

    const/16 v8, 0xbe2

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "journee"

    const-string/jumbo v7, "journee"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "brp"

    const-string v7, "Broadcast Routing Protocol"

    const/16 v8, 0xbe3

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "brp"

    const-string v7, "Broadcast Routing Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "epp"

    const-string/jumbo v7, "EndPoint Protocol"

    const/16 v8, 0xbe4

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "epp"

    const-string/jumbo v7, "EndPoint Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "responsenet"

    const-string/jumbo v7, "ResponseNet"

    const/16 v8, 0xbe5

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "responsenet"

    const-string/jumbo v7, "ResponseNet"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "di-ase"

    const-string/jumbo v7, "di-ase"

    const/16 v8, 0xbe6

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "di-ase"

    const-string/jumbo v7, "di-ase"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hlserver"

    const-string/jumbo v7, "Fast Security HL Server"

    const/16 v8, 0xbe7

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hlserver"

    const-string/jumbo v7, "Fast Security HL Server"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pctrader"

    const-string/jumbo v7, "Sierra Net PC Trader"

    const/16 v8, 0xbe8

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pctrader"

    const-string/jumbo v7, "Sierra Net PC Trader"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nsws"

    const-string/jumbo v7, "NSWS"

    const/16 v8, 0xbe9

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbe9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nsws"

    const-string/jumbo v7, "NSWS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "gds-db"

    const-string/jumbo v8, "gds_db"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "gds_db"

    const-string/jumbo v8, "gds_db"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "gds-db"

    const-string/jumbo v8, "gds_db"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "gds_db"

    const-string/jumbo v8, "gds_db"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbeb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "galaxy-server"

    const-string/jumbo v7, "Galaxy Server"

    const/16 v8, 0xbeb

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbeb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "galaxy-server"

    const-string/jumbo v7, "Galaxy Server"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-3052"

    const-string v7, "APC 3052"

    const/16 v8, 0xbec

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apc-3052"

    const-string v7, "APC 3052"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dsom-server"

    const-string/jumbo v7, "dsom-server"

    const/16 v8, 0xbed

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dsom-server"

    const-string/jumbo v7, "dsom-server"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amt-cnf-prot"

    const-string v7, "AMT CNF PROT"

    const/16 v8, 0xbee

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amt-cnf-prot"

    const-string v7, "AMT CNF PROT"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "policyserver"

    const-string/jumbo v7, "Policy Server"

    const/16 v8, 0xbef

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "policyserver"

    const-string/jumbo v7, "Policy Server"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cdl-server"

    const-string v7, "CDL Server"

    const/16 v8, 0xbf0

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cdl-server"

    const-string v7, "CDL Server"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "goahead-fldup"

    const-string/jumbo v7, "GoAhead FldUp"

    const/16 v8, 0xbf1

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "goahead-fldup"

    const-string/jumbo v7, "GoAhead FldUp"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "videobeans"

    const-string/jumbo v7, "videobeans"

    const/16 v8, 0xbf2

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "videobeans"

    const-string/jumbo v7, "videobeans"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qsoft"

    const-string/jumbo v7, "qsoft"

    const/16 v8, 0xbf3

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qsoft"

    const-string/jumbo v7, "qsoft"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "interserver"

    const-string/jumbo v7, "interserver"

    const/16 v8, 0xbf4

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "interserver"

    const-string/jumbo v7, "interserver"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cautcpd"

    const-string/jumbo v7, "cautcpd"

    const/16 v8, 0xbf5

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cautcpd"

    const-string/jumbo v7, "cautcpd"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ncacn-ip-tcp"

    const-string/jumbo v7, "ncacn-ip-tcp"

    const/16 v8, 0xbf6

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ncacn-ip-tcp"

    const-string/jumbo v7, "ncacn-ip-tcp"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ncadg-ip-udp"

    const-string/jumbo v7, "ncadg-ip-udp"

    const/16 v8, 0xbf7

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ncadg-ip-udp"

    const-string/jumbo v7, "ncadg-ip-udp"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rprt"

    const-string/jumbo v7, "Remote Port Redirector"

    const/16 v8, 0xbf8

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rprt"

    const-string/jumbo v7, "Remote Port Redirector"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "slinterbase"

    const-string/jumbo v7, "slinterbase"

    const/16 v8, 0xbf9

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbf9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "slinterbase"

    const-string/jumbo v7, "slinterbase"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbfa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netattachsdmp"

    const-string/jumbo v7, "NETATTACHSDMP"

    const/16 v8, 0xbfa

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbfa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netattachsdmp"

    const-string/jumbo v7, "NETATTACHSDMP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbfb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fjhpjp"

    const-string/jumbo v7, "FJHPJP"

    const/16 v8, 0xbfb

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbfb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fjhpjp"

    const-string/jumbo v7, "FJHPJP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbfc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ls3bcast"

    const-string/jumbo v7, "ls3 Broadcast"

    const/16 v8, 0xbfc

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbfc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ls3bcast"

    const-string/jumbo v7, "ls3 Broadcast"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbfd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ls3"

    const-string/jumbo v7, "ls3"

    const/16 v8, 0xbfd

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbfd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ls3"

    const-string/jumbo v7, "ls3"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbfe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mgxswitch"

    const-string/jumbo v7, "MGXSWITCH"

    const/16 v8, 0xbfe

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbfe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mgxswitch"

    const-string/jumbo v7, "MGXSWITCH"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xplat-replicate"

    const-string v7, "Crossplatform replication protocol"

    const/16 v8, 0xbff

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xbff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xbff

    invoke-direct {v1, v2, v4, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csd-monitor"

    const-string v7, "ContinuStor Monitor Port"

    const/16 v8, 0xc00

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csd-monitor"

    const-string v7, "ContinuStor Monitor Port"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vcrp"

    const-string/jumbo v7, "Very simple chatroom prot"

    const/16 v8, 0xc01

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vcrp"

    const-string/jumbo v7, "Very simple chatroom prot"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc02

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xbox"

    const-string/jumbo v7, "Xbox game port"

    const/16 v8, 0xc02

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc02

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xbox"

    const-string/jumbo v7, "Xbox game port"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc03

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "orbix-locator"

    const-string/jumbo v7, "Orbix 2000 Locator"

    const/16 v8, 0xc03

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc03

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "orbix-locator"

    const-string/jumbo v7, "Orbix 2000 Locator"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc04

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "orbix-config"

    const-string/jumbo v7, "Orbix 2000 Config"

    const/16 v8, 0xc04

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc04

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "orbix-config"

    const-string/jumbo v7, "Orbix 2000 Config"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc05

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "orbix-loc-ssl"

    const-string/jumbo v7, "Orbix 2000 Locator SSL"

    const/16 v8, 0xc05

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc05

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "orbix-loc-ssl"

    const-string/jumbo v7, "Orbix 2000 Locator SSL"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc06

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "orbix-cfg-ssl"

    const-string/jumbo v7, "Orbix 2000 Locator SSL"

    const/16 v8, 0xc06

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc06

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "orbix-cfg-ssl"

    const-string/jumbo v7, "Orbix 2000 Locator SSL"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc07

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lv-frontpanel"

    const-string/jumbo v7, "LV Front Panel"

    const/16 v8, 0xc07

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc07

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lv-frontpanel"

    const-string/jumbo v7, "LV Front Panel"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc08

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v7, "stm-pproc"

    const-string/jumbo v8, "stm_pproc"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "stm_pproc"

    const-string/jumbo v8, "stm_pproc"

    invoke-direct {v2, v0, v7, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "stm-pproc"

    const-string/jumbo v8, "stm_pproc"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v7, "stm_pproc"

    const-string/jumbo v8, "stm_pproc"

    invoke-direct {v2, v0, v7, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc09

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tl1-lv"

    const-string/jumbo v7, "TL1-LV"

    const/16 v8, 0xc09

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc09

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tl1-lv"

    const-string/jumbo v7, "TL1-LV"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc0a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tl1-raw"

    const-string/jumbo v7, "TL1-RAW"

    const/16 v8, 0xc0a

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc0a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tl1-raw"

    const-string/jumbo v7, "TL1-RAW"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc0b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tl1-telnet"

    const-string/jumbo v7, "TL1-TELNET"

    const/16 v8, 0xc0b

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc0b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tl1-telnet"

    const-string/jumbo v7, "TL1-TELNET"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc0c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "itm-mccs"

    const-string/jumbo v7, "ITM-MCCS"

    const/16 v8, 0xc0c

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc0c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "itm-mccs"

    const-string/jumbo v7, "ITM-MCCS"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc0d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcihreq"

    const-string/jumbo v7, "PCIHReq"

    const/16 v8, 0xc0d

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc0d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcihreq"

    const-string/jumbo v7, "PCIHReq"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc0e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jdl-dbkitchen"

    const-string/jumbo v7, "JDL-DBKitchen"

    const/16 v8, 0xc0e

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc0e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jdl-dbkitchen"

    const-string/jumbo v7, "JDL-DBKitchen"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc0f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asoki-sma"

    const-string v7, "Asoki SMA"

    const/16 v8, 0xc0f

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc0f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asoki-sma"

    const-string v7, "Asoki SMA"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xdtp"

    const-string/jumbo v7, "eXtensible Data Transfer Protocol"

    const/16 v8, 0xc10

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xdtp"

    const-string/jumbo v7, "eXtensible Data Transfer Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc11

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ptk-alink"

    const-string/jumbo v7, "ParaTek Agent Linking"

    const/16 v8, 0xc11

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc11

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ptk-alink"

    const-string/jumbo v7, "ParaTek Agent Linking"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc12

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "stss"

    const-string/jumbo v7, "Senforce Session Services"

    const/16 v8, 0xc12

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc12

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "stss"

    const-string/jumbo v7, "Senforce Session Services"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc13

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "1ci-smcs"

    const-string v7, "1Ci Server Management"

    const/16 v8, 0xc13

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc13

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "1ci-smcs"

    const-string v7, "1Ci Server Management"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc14

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xc14

    const-string/jumbo v7, "Unassigned"

    invoke-direct {v1, v2, v4, v4, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc15

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rapidmq-center"

    const-string/jumbo v7, "Jiiva RapidMQ Center"

    const/16 v8, 0xc15

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc15

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rapidmq-center"

    const-string/jumbo v7, "Jiiva RapidMQ Center"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc16

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rapidmq-reg"

    const-string/jumbo v7, "Jiiva RapidMQ Registry"

    const/16 v8, 0xc16

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc16

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rapidmq-reg"

    const-string/jumbo v7, "Jiiva RapidMQ Registry"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc17

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "panasas"

    const-string/jumbo v7, "Panasas rendezvous port"

    const/16 v8, 0xc17

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc17

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "panasas"

    const-string/jumbo v7, "Panasas rendezvous port"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc18

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndl-aps"

    const-string v7, "Active Print Server Port"

    const/16 v8, 0xc18

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc18

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndl-aps"

    const-string v7, "Active Print Server Port"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc19

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xc19

    invoke-direct {v1, v2, v4, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc19

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    invoke-direct {v1, v2, v4, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc19

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sctp"

    const-string/jumbo v7, "ITU-T Q.1902.1/Q.2150.3"

    const/16 v8, 0xc19

    const-string/jumbo v9, "itu-bicc-stc"

    invoke-direct {v1, v8, v9, v2, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc1a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "umm-port"

    const-string/jumbo v7, "Universal Message Manager"

    const/16 v8, 0xc1a

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc1a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "umm-port"

    const-string/jumbo v7, "Universal Message Manager"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc1b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "chmd"

    const-string v7, "CHIPSY Machine Daemon"

    const/16 v8, 0xc1b

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc1b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "chmd"

    const-string v7, "CHIPSY Machine Daemon"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc1c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "opcon-xps"

    const-string/jumbo v7, "OpCon/xps"

    const/16 v8, 0xc1c

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc1c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "opcon-xps"

    const-string/jumbo v7, "OpCon/xps"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc1d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hp-pxpib"

    const-string/jumbo v7, "HP PolicyXpert PIB Server"

    const/16 v8, 0xc1d

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc1d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hp-pxpib"

    const-string/jumbo v7, "HP PolicyXpert PIB Server"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc1e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "slslavemon"

    const-string/jumbo v7, "SoftlinK Slave Mon Port"

    const/16 v8, 0xc1e

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc1e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "slslavemon"

    const-string/jumbo v7, "SoftlinK Slave Mon Port"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc1f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "autocuesmi"

    const-string v7, "Autocue SMI Protocol"

    const/16 v8, 0xc1f

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc1f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "autocuesmi"

    const-string v7, "Autocue SMI Protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "autocuelog"

    const-string v7, "Autocue Logger Protocol"

    const/16 v8, 0xc20

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "autocuetime"

    const-string v7, "Autocue Time Service"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc21

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cardbox"

    const-string v7, "Cardbox"

    const/16 v8, 0xc21

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc21

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cardbox"

    const-string v7, "Cardbox"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cardbox-http"

    const-string v7, "Cardbox HTTP"

    const/16 v8, 0xc22

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cardbox-http"

    const-string v7, "Cardbox HTTP"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc23

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "business"

    const-string v7, "Business protocol"

    const/16 v8, 0xc23

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc23

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "business"

    const-string v7, "Business protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc24

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "geolocate"

    const-string/jumbo v7, "Geolocate protocol"

    const/16 v8, 0xc24

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc24

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "geolocate"

    const-string/jumbo v7, "Geolocate protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc25

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "personnel"

    const-string/jumbo v7, "Personnel protocol"

    const/16 v8, 0xc25

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc25

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "personnel"

    const-string/jumbo v7, "Personnel protocol"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc26

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sim-control"

    const-string/jumbo v7, "simulator control port"

    const/16 v8, 0xc26

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc26

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sim-control"

    const-string/jumbo v7, "simulator control port"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc27

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsynch"

    const-string/jumbo v7, "Web Synchronous Services"

    const/16 v8, 0xc27

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc27

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wsynch"

    const-string/jumbo v7, "Web Synchronous Services"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc28

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ksysguard"

    const-string/jumbo v7, "KDE System Guard"

    const/16 v8, 0xc28

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc28

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ksysguard"

    const-string/jumbo v7, "KDE System Guard"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc29

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cs-auth-svr"

    const-string v7, "CS-Authenticate Svr Port"

    const/16 v8, 0xc29

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc29

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cs-auth-svr"

    const-string v7, "CS-Authenticate Svr Port"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc2a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ccmad"

    const-string v7, "CCM AutoDiscover"

    const/16 v8, 0xc2a

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc2a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ccmad"

    const-string v7, "CCM AutoDiscover"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc2b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mctet-master"

    const-string/jumbo v7, "MCTET Master"

    const/16 v8, 0xc2b

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc2b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mctet-master"

    const-string/jumbo v7, "MCTET Master"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc2c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mctet-gateway"

    const-string/jumbo v7, "MCTET Gateway"

    const/16 v8, 0xc2c

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc2c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mctet-gateway"

    const-string/jumbo v7, "MCTET Gateway"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc2d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mctet-jserv"

    const-string/jumbo v7, "MCTET Jserv"

    const/16 v8, 0xc2d

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc2d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mctet-jserv"

    const-string/jumbo v7, "MCTET Jserv"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc2e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pkagent"

    const-string/jumbo v7, "PKAgent"

    const/16 v8, 0xc2e

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc2e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pkagent"

    const-string/jumbo v7, "PKAgent"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc2f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "d2000kernel"

    const-string v7, "D2000 Kernel Port"

    const/16 v8, 0xc2f

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc2f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "d2000kernel"

    const-string v7, "D2000 Kernel Port"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc30

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "d2000webserver"

    const-string v7, "D2000 Webserver Port"

    const/16 v8, 0xc30

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc30

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "d2000webserver"

    const-string v7, "D2000 Webserver Port"

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc31

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcmk-remote"

    const-string/jumbo v7, "The pacemaker remote (pcmk-remote) service extends high availability functionality outside of the Linux cluster into remote nodes."

    const/16 v8, 0xc31

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc31

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xc31

    invoke-direct {v1, v2, v4, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vtr-emulator"

    const-string/jumbo v3, "MTI VTR Emulator port"

    const/16 v7, 0xc32

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vtr-emulator"

    const-string/jumbo v3, "MTI VTR Emulator port"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc33

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "edix"

    const-string/jumbo v3, "EDI Translation Protocol"

    const/16 v7, 0xc33

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc33

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "edix"

    const-string/jumbo v3, "EDI Translation Protocol"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc34

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "beacon-port"

    const-string v3, "Beacon Port"

    const/16 v7, 0xc34

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc34

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "beacon-port"

    const-string v3, "Beacon Port"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc35

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a13-an"

    const-string v3, "A13-AN Interface"

    const/16 v7, 0xc35

    invoke-direct {v1, v7, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc35

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a13-an"

    const-string v3, "A13-AN Interface"

    invoke-direct {v1, v7, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0xc36

    const-string/jumbo v3, "Unassigned"

    invoke-direct {v1, v2, v4, v4, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc37

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctx-bridge"

    const-string v3, "CTX Bridge Port"

    const/16 v4, 0xc37

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc37

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ctx-bridge"

    const-string v3, "CTX Bridge Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc38

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndl-aas"

    const-string v3, "Active API Server Port"

    const/16 v4, 0xc38

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc38

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndl-aas"

    const-string v3, "Active API Server Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc39

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netport-id"

    const-string/jumbo v3, "NetPort Discovery Port"

    const/16 v4, 0xc39

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc39

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netport-id"

    const-string/jumbo v3, "NetPort Discovery Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc3a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icpv2"

    const-string/jumbo v3, "ICPv2"

    const/16 v4, 0xc3a

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc3a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icpv2"

    const-string/jumbo v3, "ICPv2"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc3b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netbookmark"

    const-string/jumbo v3, "Net Book Mark"

    const/16 v4, 0xc3b

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc3b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netbookmark"

    const-string/jumbo v3, "Net Book Mark"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-rule-engine"

    const-string/jumbo v3, "Microsoft Business Rule Engine Update Service"

    const/16 v4, 0xc3c

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ms-rule-engine"

    const-string/jumbo v3, "Microsoft Business Rule Engine Update Service"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc3d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prism-deploy"

    const-string/jumbo v3, "Prism Deploy User Port"

    const/16 v4, 0xc3d

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc3d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "prism-deploy"

    const-string/jumbo v3, "Prism Deploy User Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc3e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ecp"

    const-string/jumbo v3, "Extensible Code Protocol"

    const/16 v4, 0xc3e

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc3e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ecp"

    const-string/jumbo v3, "Extensible Code Protocol"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc3f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "peerbook-port"

    const-string/jumbo v3, "PeerBook Port"

    const/16 v4, 0xc3f

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc3f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "peerbook-port"

    const-string/jumbo v3, "PeerBook Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc40

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "grubd"

    const-string/jumbo v3, "Grub Server Port"

    const/16 v4, 0xc40

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc40

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "grubd"

    const-string/jumbo v3, "Grub Server Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc41

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rtnt-1"

    const-string/jumbo v3, "rtnt-1 data packets"

    const/16 v4, 0xc41

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc41

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rtnt-1"

    const-string/jumbo v3, "rtnt-1 data packets"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc42

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rtnt-2"

    const-string/jumbo v3, "rtnt-2 data packets"

    const/16 v4, 0xc42

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc42

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rtnt-2"

    const-string/jumbo v3, "rtnt-2 data packets"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc43

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "incognitorv"

    const-string/jumbo v3, "Incognito Rendez-Vous"

    const/16 v4, 0xc43

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc43

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "incognitorv"

    const-string/jumbo v3, "Incognito Rendez-Vous"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc44

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ariliamulti"

    const-string v3, "Arilia Multiplexor"

    const/16 v4, 0xc44

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc44

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ariliamulti"

    const-string v3, "Arilia Multiplexor"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc45

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vmodem"

    const-string/jumbo v3, "VMODEM"

    const/16 v4, 0xc45

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc45

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vmodem"

    const-string/jumbo v3, "VMODEM"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc46

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rdc-wh-eos"

    const-string/jumbo v3, "RDC WH EOS"

    const/16 v4, 0xc46

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc46

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rdc-wh-eos"

    const-string/jumbo v3, "RDC WH EOS"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc47

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "seaview"

    const-string/jumbo v3, "Sea View"

    const/16 v4, 0xc47

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc47

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "seaview"

    const-string/jumbo v3, "Sea View"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc48

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tarantella"

    const-string/jumbo v3, "Tarantella"

    const/16 v4, 0xc48

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc48

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tarantella"

    const-string/jumbo v3, "Tarantella"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc49

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csi-lfap"

    const-string v3, "CSI-LFAP"

    const/16 v4, 0xc49

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc49

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csi-lfap"

    const-string v3, "CSI-LFAP"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc4a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bears-02"

    const-string/jumbo v3, "bears-02"

    const/16 v4, 0xc4a

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc4a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bears-02"

    const-string/jumbo v3, "bears-02"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc4b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rfio"

    const-string/jumbo v3, "RFIO"

    const/16 v4, 0xc4b

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc4b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rfio"

    const-string/jumbo v3, "RFIO"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc4c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nm-game-admin"

    const-string/jumbo v3, "NetMike Game Administrator"

    const/16 v4, 0xc4c

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc4c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nm-game-admin"

    const-string/jumbo v3, "NetMike Game Administrator"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc4d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nm-game-server"

    const-string/jumbo v3, "NetMike Game Server"

    const/16 v4, 0xc4d

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc4d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nm-game-server"

    const-string/jumbo v3, "NetMike Game Server"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc4e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nm-asses-admin"

    const-string/jumbo v3, "NetMike Assessor Administrator"

    const/16 v4, 0xc4e

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc4e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nm-asses-admin"

    const-string/jumbo v3, "NetMike Assessor Administrator"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc4f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nm-assessor"

    const-string/jumbo v3, "NetMike Assessor"

    const/16 v4, 0xc4f

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc4f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nm-assessor"

    const-string/jumbo v3, "NetMike Assessor"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc50

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "feitianrockey"

    const-string/jumbo v3, "FeiTian Port"

    const/16 v4, 0xc50

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc50

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "feitianrockey"

    const-string/jumbo v3, "FeiTian Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc51

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "s8-client-port"

    const-string/jumbo v3, "S8Cargo Client Port"

    const/16 v4, 0xc51

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc51

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "s8-client-port"

    const-string/jumbo v3, "S8Cargo Client Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc52

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ccmrmi"

    const-string/jumbo v3, "ON RMI Registry"

    const/16 v4, 0xc52

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc52

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ccmrmi"

    const-string/jumbo v3, "ON RMI Registry"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc53

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jpegmpeg"

    const-string/jumbo v3, "JpegMpeg Port"

    const/16 v4, 0xc53

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc53

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jpegmpeg"

    const-string/jumbo v3, "JpegMpeg Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc54

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "indura"

    const-string/jumbo v3, "Indura Collector"

    const/16 v4, 0xc54

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc54

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "indura"

    const-string/jumbo v3, "Indura Collector"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc55

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lsa-comm"

    const-string/jumbo v3, "LSA Communicator"

    const/16 v4, 0xc55

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc55

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lsa-comm"

    const-string/jumbo v3, "LSA Communicator"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc56

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "stvp"

    const-string/jumbo v3, "SmashTV Protocol"

    const/16 v4, 0xc56

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc56

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "stvp"

    const-string/jumbo v3, "SmashTV Protocol"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc57

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "navegaweb-port"

    const-string/jumbo v3, "NavegaWeb Tarification"

    const/16 v4, 0xc57

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc57

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "navegaweb-port"

    const-string/jumbo v3, "NavegaWeb Tarification"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc58

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tip-app-server"

    const-string/jumbo v3, "TIP Application Server"

    const/16 v4, 0xc58

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc58

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tip-app-server"

    const-string/jumbo v3, "TIP Application Server"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc59

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "doc1lm"

    const-string v3, "DOC1 License Manager"

    const/16 v4, 0xc59

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc59

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "doc1lm"

    const-string v3, "DOC1 License Manager"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc5a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sflm"

    const-string/jumbo v3, "SFLM"

    const/16 v4, 0xc5a

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc5a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sflm"

    const-string/jumbo v3, "SFLM"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc5b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "res-sap"

    const-string/jumbo v3, "RES-SAP"

    const/16 v4, 0xc5b

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc5b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "res-sap"

    const-string/jumbo v3, "RES-SAP"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc5c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "imprs"

    const-string/jumbo v3, "IMPRS"

    const/16 v4, 0xc5c

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc5c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "imprs"

    const-string/jumbo v3, "IMPRS"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc5d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "newgenpay"

    const-string/jumbo v3, "Newgenpay Engine Service"

    const/16 v4, 0xc5d

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc5d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "newgenpay"

    const-string/jumbo v3, "Newgenpay Engine Service"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc5e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sossecollector"

    const-string/jumbo v3, "Quest Spotlight Out-Of-Process Collector"

    const/16 v4, 0xc5e

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc5e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sossecollector"

    const-string/jumbo v3, "Quest Spotlight Out-Of-Process Collector"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc5f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nowcontact"

    const-string/jumbo v3, "Now Contact Public Server"

    const/16 v4, 0xc5f

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc5f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nowcontact"

    const-string/jumbo v3, "Now Contact Public Server"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "poweronnud"

    const-string/jumbo v3, "Now Up-to-Date Public Server"

    const/16 v4, 0xc60

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "poweronnud"

    const-string/jumbo v3, "Now Up-to-Date Public Server"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "serverview-as"

    const-string/jumbo v3, "SERVERVIEW-AS"

    const/16 v4, 0xc61

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "serverview-as"

    const-string/jumbo v3, "SERVERVIEW-AS"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc62

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "serverview-asn"

    const-string/jumbo v3, "SERVERVIEW-ASN"

    const/16 v4, 0xc62

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc62

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "serverview-asn"

    const-string/jumbo v3, "SERVERVIEW-ASN"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc63

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "serverview-gf"

    const-string/jumbo v3, "SERVERVIEW-GF"

    const/16 v4, 0xc63

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc63

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "serverview-gf"

    const-string/jumbo v3, "SERVERVIEW-GF"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "serverview-rm"

    const-string/jumbo v3, "SERVERVIEW-RM"

    const/16 v4, 0xc64

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "serverview-rm"

    const-string/jumbo v3, "SERVERVIEW-RM"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc65

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "serverview-icc"

    const-string/jumbo v3, "SERVERVIEW-ICC"

    const/16 v4, 0xc65

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc65

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "serverview-icc"

    const-string/jumbo v3, "SERVERVIEW-ICC"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc66

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "armi-server"

    const-string v3, "ARMI Server"

    const/16 v4, 0xc66

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc66

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "armi-server"

    const-string v3, "ARMI Server"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc67

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "t1-e1-over-ip"

    const-string/jumbo v3, "T1_E1_Over_IP"

    const/16 v4, 0xc67

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc67

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "t1-e1-over-ip"

    const-string/jumbo v3, "T1_E1_Over_IP"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ars-master"

    const-string v3, "ARS Master"

    const/16 v4, 0xc68

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ars-master"

    const-string v3, "ARS Master"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "phonex-port"

    const-string/jumbo v3, "Phonex Protocol"

    const/16 v4, 0xc69

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "phonex-port"

    const-string/jumbo v3, "Phonex Protocol"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "radclientport"

    const-string/jumbo v3, "Radiance UltraEdge Port"

    const/16 v4, 0xc6a

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "radclientport"

    const-string/jumbo v3, "Radiance UltraEdge Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc6b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "h2gf-w-2m"

    const-string/jumbo v3, "H2GF W.2m Handover prot."

    const/16 v4, 0xc6b

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc6b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "h2gf-w-2m"

    const-string/jumbo v3, "H2GF W.2m Handover prot."

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc6c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mc-brk-srv"

    const-string/jumbo v3, "Millicent Broker Server"

    const/16 v4, 0xc6c

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc6c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mc-brk-srv"

    const-string/jumbo v3, "Millicent Broker Server"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc6d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bmcpatrolagent"

    const-string v3, "BMC Patrol Agent"

    const/16 v4, 0xc6d

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc6d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bmcpatrolagent"

    const-string v3, "BMC Patrol Agent"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bmcpatrolrnvu"

    const-string v3, "BMC Patrol Rendezvous"

    const/16 v4, 0xc6e

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bmcpatrolrnvu"

    const-string v3, "BMC Patrol Rendezvous"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc6f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cops-tls"

    const-string v3, "COPS/TLS"

    const/16 v4, 0xc6f

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc6f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cops-tls"

    const-string v3, "COPS/TLS"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apogeex-port"

    const-string v3, "ApogeeX Port"

    const/16 v4, 0xc70

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apogeex-port"

    const-string v3, "ApogeeX Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc71

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smpppd"

    const-string/jumbo v3, "SuSE Meta PPPD"

    const/16 v4, 0xc71

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc71

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smpppd"

    const-string/jumbo v3, "SuSE Meta PPPD"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc72

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iiw-port"

    const-string/jumbo v3, "IIW Monitor User Port"

    const/16 v4, 0xc72

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc72

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iiw-port"

    const-string/jumbo v3, "IIW Monitor User Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc73

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "odi-port"

    const-string/jumbo v3, "Open Design Listen Port"

    const/16 v4, 0xc73

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc73

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "odi-port"

    const-string/jumbo v3, "Open Design Listen Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc74

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "brcm-comm-port"

    const-string v3, "Broadcom Port"

    const/16 v4, 0xc74

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc74

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "brcm-comm-port"

    const-string v3, "Broadcom Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc75

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcle-infex"

    const-string/jumbo v3, "Pinnacle Sys InfEx Port"

    const/16 v4, 0xc75

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc75

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pcle-infex"

    const-string/jumbo v3, "Pinnacle Sys InfEx Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csvr-proxy"

    const-string v3, "ConServR Proxy"

    const/16 v4, 0xc76

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csvr-proxy"

    const-string v3, "ConServR Proxy"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc77

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csvr-sslproxy"

    const-string v3, "ConServR SSL Proxy"

    const/16 v4, 0xc77

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc77

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csvr-sslproxy"

    const-string v3, "ConServR SSL Proxy"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc78

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "firemonrcc"

    const-string/jumbo v3, "FireMon Revision Control"

    const/16 v4, 0xc78

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc78

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "firemonrcc"

    const-string/jumbo v3, "FireMon Revision Control"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc79

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spandataport"

    const-string/jumbo v3, "SpanDataPort"

    const/16 v4, 0xc79

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc79

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spandataport"

    const-string/jumbo v3, "SpanDataPort"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc7a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "magbind"

    const-string/jumbo v3, "Rockstorm MAG protocol"

    const/16 v4, 0xc7a

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc7a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "magbind"

    const-string/jumbo v3, "Rockstorm MAG protocol"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc7b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ncu-1"

    const-string/jumbo v3, "Network Control Unit"

    const/16 v4, 0xc7b

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc7b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ncu-1"

    const-string/jumbo v3, "Network Control Unit"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc7c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ncu-2"

    const-string/jumbo v3, "Network Control Unit"

    const/16 v4, 0xc7c

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc7c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ncu-2"

    const-string/jumbo v3, "Network Control Unit"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc7d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "embrace-dp-s"

    const-string/jumbo v3, "Embrace Device Protocol Server"

    const/16 v4, 0xc7d

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc7d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "embrace-dp-s"

    const-string/jumbo v3, "Embrace Device Protocol Server"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc7e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "embrace-dp-c"

    const-string/jumbo v3, "Embrace Device Protocol Client"

    const/16 v4, 0xc7e

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc7e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "embrace-dp-c"

    const-string/jumbo v3, "Embrace Device Protocol Client"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc7f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dmod-workspace"

    const-string v3, "DMOD WorkSpace"

    const/16 v4, 0xc7f

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc7f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dmod-workspace"

    const-string v3, "DMOD WorkSpace"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tick-port"

    const-string/jumbo v3, "Press-sense Tick Port"

    const/16 v4, 0xc80

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tick-port"

    const-string/jumbo v3, "Press-sense Tick Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc81

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cpq-tasksmart"

    const-string v3, "CPQ-TaskSmart"

    const/16 v4, 0xc81

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc81

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cpq-tasksmart"

    const-string v3, "CPQ-TaskSmart"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "intraintra"

    const-string/jumbo v3, "IntraIntra"

    const/16 v4, 0xc82

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "intraintra"

    const-string/jumbo v3, "IntraIntra"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc83

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netwatcher-mon"

    const-string/jumbo v3, "Network Watcher Monitor"

    const/16 v4, 0xc83

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc83

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netwatcher-mon"

    const-string/jumbo v3, "Network Watcher Monitor"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc84

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netwatcher-db"

    const-string/jumbo v3, "Network Watcher DB Access"

    const/16 v4, 0xc84

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc84

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netwatcher-db"

    const-string/jumbo v3, "Network Watcher DB Access"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc85

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "isns"

    const-string/jumbo v3, "iSNS Server Port"

    const/16 v4, 0xc85

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc85

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "isns"

    const-string/jumbo v3, "iSNS Server Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc86

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ironmail"

    const-string/jumbo v3, "IronMail POP Proxy"

    const/16 v4, 0xc86

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc86

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ironmail"

    const-string/jumbo v3, "IronMail POP Proxy"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc87

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vx-auth-port"

    const-string/jumbo v3, "Veritas Authentication Port"

    const/16 v4, 0xc87

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc87

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vx-auth-port"

    const-string/jumbo v3, "Veritas Authentication Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc88

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pfu-prcallback"

    const-string/jumbo v3, "PFU PR Callback"

    const/16 v4, 0xc88

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc88

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pfu-prcallback"

    const-string/jumbo v3, "PFU PR Callback"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc89

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netwkpathengine"

    const-string/jumbo v3, "HP OpenView Network Path Engine Server"

    const/16 v4, 0xc89

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc89

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netwkpathengine"

    const-string/jumbo v3, "HP OpenView Network Path Engine Server"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc8a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "flamenco-proxy"

    const-string/jumbo v3, "Flamenco Networks Proxy"

    const/16 v4, 0xc8a

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc8a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "flamenco-proxy"

    const-string/jumbo v3, "Flamenco Networks Proxy"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc8b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "avsecuremgmt"

    const-string v3, "Avocent Secure Management"

    const/16 v4, 0xc8b

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc8b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "avsecuremgmt"

    const-string v3, "Avocent Secure Management"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc8c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "surveyinst"

    const-string/jumbo v3, "Survey Instrument"

    const/16 v4, 0xc8c

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc8c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "surveyinst"

    const-string/jumbo v3, "Survey Instrument"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc8d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "neon24x7"

    const-string/jumbo v3, "NEON 24X7 Mission Control"

    const/16 v4, 0xc8d

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc8d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "neon24x7"

    const-string/jumbo v3, "NEON 24X7 Mission Control"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc8e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmq-daemon-1"

    const-string/jumbo v3, "JMQ Daemon Port 1"

    const/16 v4, 0xc8e

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc8e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmq-daemon-1"

    const-string/jumbo v3, "JMQ Daemon Port 1"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc8f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmq-daemon-2"

    const-string/jumbo v3, "JMQ Daemon Port 2"

    const/16 v4, 0xc8f

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc8f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jmq-daemon-2"

    const-string/jumbo v3, "JMQ Daemon Port 2"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc90

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ferrari-foam"

    const-string/jumbo v3, "Ferrari electronic FOAM"

    const/16 v4, 0xc90

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc90

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ferrari-foam"

    const-string/jumbo v3, "Ferrari electronic FOAM"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc91

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unite"

    const-string/jumbo v3, "Unified IP & Telecom Environment"

    const/16 v4, 0xc91

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc91

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unite"

    const-string/jumbo v3, "Unified IP & Telecom Environment"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc92

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smartpackets"

    const-string/jumbo v3, "EMC SmartPackets"

    const/16 v4, 0xc92

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc92

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "smartpackets"

    const-string/jumbo v3, "EMC SmartPackets"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc93

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wms-messenger"

    const-string/jumbo v3, "WMS Messenger"

    const/16 v4, 0xc93

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc93

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wms-messenger"

    const-string/jumbo v3, "WMS Messenger"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc94

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xnm-ssl"

    const-string/jumbo v3, "XML NM over SSL"

    const/16 v4, 0xc94

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc94

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xnm-ssl"

    const-string/jumbo v3, "XML NM over SSL"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc95

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xnm-clear-text"

    const-string/jumbo v3, "XML NM over TCP"

    const/16 v4, 0xc95

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc95

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xnm-clear-text"

    const-string/jumbo v3, "XML NM over TCP"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc96

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "glbp"

    const-string/jumbo v3, "Gateway Load Balancing Pr"

    const/16 v4, 0xc96

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc96

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "glbp"

    const-string/jumbo v3, "Gateway Load Balancing Pr"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc97

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "digivote"

    const-string v3, "DIGIVOTE (R) Vote-Server"

    const/16 v4, 0xc97

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc97

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "digivote"

    const-string v3, "DIGIVOTE (R) Vote-Server"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc98

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aes-discovery"

    const-string v3, "AES Discovery Port"

    const/16 v4, 0xc98

    invoke-direct {v1, v4, v2, v5, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0xc98

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aes-discovery"

    const-string v3, "AES Discovery Port"

    invoke-direct {v1, v4, v2, v6, v3}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
