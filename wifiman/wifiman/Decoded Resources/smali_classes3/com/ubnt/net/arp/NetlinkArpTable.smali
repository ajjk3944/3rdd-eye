.class public Lcom/ubnt/net/arp/NetlinkArpTable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/net/arp/NetlinkArpTable$ArpNeighbor;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string/jumbo v0, "netlink-arp"

    invoke-static {p1, v0}, Lcom/ubnt/net/arp/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private static native getNativeArpTable()[Lcom/ubnt/net/arp/NetlinkArpTable$ArpNeighbor;
.end method


# virtual methods
.method public getArpTable()Ljava/util/HashMap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/ubnt/net/arp/NetlinkArpTable;->getNativeArpTable()[Lcom/ubnt/net/arp/NetlinkArpTable$ArpNeighbor;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v0, v3

    iget-object v5, v4, Lcom/ubnt/net/arp/NetlinkArpTable$ArpNeighbor;->ip:Ljava/lang/String;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    iget-object v5, v4, Lcom/ubnt/net/arp/NetlinkArpTable$ArpNeighbor;->mac:Ljava/lang/String;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    iget-object v5, v4, Lcom/ubnt/net/arp/NetlinkArpTable$ArpNeighbor;->ip:Ljava/lang/String;

    iget-object v4, v4, Lcom/ubnt/net/arp/NetlinkArpTable$ArpNeighbor;->mac:Ljava/lang/String;

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method
