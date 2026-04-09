.class public final Lyc/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/os/ParcelUuid;

.field private final b:Landroid/os/ParcelUuid;

.field private final c:Landroid/os/ParcelUuid;

.field private final d:Landroid/os/ParcelUuid;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/ParcelUuid;

    sget-object v1, Lcom/ui/wifiman/model/bluetooth/le/i;->a:Lcom/ui/wifiman/model/bluetooth/le/i;

    const/16 v2, 0x252a

    invoke-virtual {v1, v2}, Lcom/ui/wifiman/model/bluetooth/le/i;->a(I)Ljava/util/UUID;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/ParcelUuid;-><init>(Ljava/util/UUID;)V

    iput-object v0, p0, Lyc/s;->a:Landroid/os/ParcelUuid;

    new-instance v0, Landroid/os/ParcelUuid;

    const/16 v2, 0x2018

    invoke-virtual {v1, v2}, Lcom/ui/wifiman/model/bluetooth/le/i;->a(I)Ljava/util/UUID;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/ParcelUuid;-><init>(Ljava/util/UUID;)V

    iput-object v0, p0, Lyc/s;->b:Landroid/os/ParcelUuid;

    new-instance v0, Landroid/os/ParcelUuid;

    const/16 v2, 0x2119

    invoke-virtual {v1, v2}, Lcom/ui/wifiman/model/bluetooth/le/i;->a(I)Ljava/util/UUID;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/ParcelUuid;-><init>(Ljava/util/UUID;)V

    iput-object v0, p0, Lyc/s;->c:Landroid/os/ParcelUuid;

    new-instance v0, Landroid/os/ParcelUuid;

    const/16 v2, 0x2021

    invoke-virtual {v1, v2}, Lcom/ui/wifiman/model/bluetooth/le/i;->a(I)Ljava/util/UUID;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/ParcelUuid;-><init>(Ljava/util/UUID;)V

    iput-object v0, p0, Lyc/s;->d:Landroid/os/ParcelUuid;

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/le/ScanResult;)Lyc/r;
    .locals 9

    const-string v0, "scanResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/bluetooth/le/ScanRecord;->getServiceData()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v3, p0, Lyc/s;->a:Landroid/os/ParcelUuid;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    if-eqz v2, :cond_0

    sget-object v3, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v3, v2}, Lh9/a$b;->d([B)Lh9/a;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    const-string v3, "Failed to parse MAC"

    invoke-static {v3, v2, v1, v0, v1}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_0
    move-object v2, v1

    :goto_0
    :try_start_1
    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/bluetooth/le/ScanRecord;->getServiceData()Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v4, p0, Lyc/s;->b:Landroid/os/ParcelUuid;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    if-eqz v3, :cond_1

    invoke-static {v3}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v4, :cond_2

    goto :goto_1

    :catchall_1
    move-exception v3

    const-string v4, "Failed to parse Ip address"

    invoke-static {v4, v3, v1, v0, v1}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_1
    :goto_1
    move-object v3, v1

    :cond_2
    :try_start_2
    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Landroid/bluetooth/le/ScanRecord;->getServiceData()Ljava/util/Map;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v5, p0, Lyc/s;->d:Landroid/os/ParcelUuid;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    if-eqz v4, :cond_3

    sget-object v5, Lv7/b;->a:Lv7/b;

    sget-object v6, Lv7/a;->BIG_ENDIAN:Lv7/a;

    invoke-virtual {v5, v4, v6}, Lv7/b;->a([BLv7/a;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    :cond_3
    move-object v4, v1

    :goto_2
    :try_start_3
    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanRecord;->getServiceData()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v5, p0, Lyc/s;->c:Landroid/os/ParcelUuid;

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    if-eqz p1, :cond_4

    sget-object v5, Lv7/b;->a:Lv7/b;

    sget-object v6, Lv7/a;->BIG_ENDIAN:Lv7/a;

    invoke-virtual {v5, p1, v6}, Lv7/b;->b([BLv7/a;)I

    move-result p1

    int-to-long v5, p1

    const/16 p1, 0x3e8

    int-to-long v7, p1

    mul-long/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    const-string v5, "Failed to parse uptime"

    invoke-static {v5, p1, v1, v0, v1}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_4
    move-object p1, v1

    :goto_3
    if-nez v2, :cond_5

    if-nez v3, :cond_5

    if-nez v4, :cond_5

    if-eqz p1, :cond_7

    :cond_5
    if-eqz v3, :cond_6

    invoke-static {v3}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v1

    :cond_6
    new-instance v0, Lyc/r;

    invoke-direct {v0, v2, v1, p1, v4}, Lyc/r;-><init>(Lh9/a;Linet/ipaddr/g;Ljava/lang/Long;Ljava/lang/Boolean;)V

    move-object v1, v0

    :cond_7
    return-object v1
.end method
