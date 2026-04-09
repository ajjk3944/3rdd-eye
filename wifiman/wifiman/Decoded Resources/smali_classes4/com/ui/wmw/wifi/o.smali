.class public final Lcom/ui/wmw/wifi/o;
.super Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wmw/wifi/p;


# direct methods
.method public constructor <init>(Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;-><init>(Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;)V

    return-void
.end method

.method public static synthetic d(Lcom/ui/wmw/wifi/o;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/wifi/o;->q(Lcom/ui/wmw/wifi/o;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Lcom/ui/wmw/wifi/o;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->h()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No Encryption value for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(I)LS8/d;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wmw/wifi/p$a;->f(Lcom/ui/wmw/wifi/p;I)LS8/d;

    move-result-object p1

    return-object p1
.end method

.method public b(II)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wmw/wifi/p$a;->k(Lcom/ui/wmw/wifi/p;II)Z

    move-result p1

    return p1
.end method

.method public e(Ljava/lang/String;)[B
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wmw/wifi/p$a;->c(Lcom/ui/wmw/wifi/p;Ljava/lang/String;)[B

    move-result-object p1

    return-object p1
.end method

.method public f()LS8/c;
    .locals 4

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/o;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a(I)LS8/c;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->j()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No matching band found for: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()I
    .locals 4

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->e()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid Center Channel: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()Ljava/lang/Integer;
    .locals 3

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->f()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-lez v2, :cond_0

    move-object v1, v0

    :cond_0
    return-object v1
.end method

.method public i()I
    .locals 4

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid Channel: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j()LS8/d;
    .locals 4

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ui/wmw/wifi/o;->a(I)LS8/d;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid channel width: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public k()I
    .locals 4

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->j()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->j()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid frequency: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l(I)LS8/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wmw/wifi/p$a;->g(Lcom/ui/wmw/wifi/p;I)LS8/a;

    move-result-object p1

    return-object p1
.end method

.method public m()LS8/a;
    .locals 4

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lcom/ui/wmw/wifi/o;->e(Ljava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_2

    array-length v1, v0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    invoke-static {v0}, LZg/n;->d0([B)I

    move-result v1

    aget-byte v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/ui/wmw/wifi/o;->l(I)LS8/a;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    :cond_1
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->k()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid IEEE mode data "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->k()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid IEEE mode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public n()I
    .locals 4

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->l()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->l()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid mcs index: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public o()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->o()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    return-object v0
.end method

.method public p()LS8/j;
    .locals 7

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/ui/wmw/wifi/o;->e(Ljava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_1

    array-length v2, v0

    const/4 v3, 0x4

    if-gt v2, v3, :cond_0

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    array-length v4, v0

    sub-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->h()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid security type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object v0, v1

    :goto_0
    sget-object v2, LS8/j;->c:LS8/j$a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ui/wmw/wifi/o;->r(I)Ljava/util/Set;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    new-instance v0, LQf/c;

    invoke-direct {v0, p0}, LQf/c;-><init>(Lcom/ui/wmw/wifi/o;)V

    new-instance v3, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->h()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unknown encryption "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3}, LNf/a;->b(Lmh/a;Ljava/lang/Throwable;)V

    :cond_3
    if-nez v1, :cond_4

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v1

    :cond_4
    invoke-virtual {v2, v1}, LS8/j$a;->a(Ljava/util/Set;)LS8/j;

    move-result-object v0

    return-object v0
.end method

.method public r(I)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wmw/wifi/p$a;->h(Lcom/ui/wmw/wifi/p;I)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public s()LS8/l;
    .locals 4

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->m()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v1, LS8/l;->f:LS8/l$a;

    invoke-virtual {v1, v0}, LS8/l$a;->a(I)LS8/l;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->m()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid signal Strength: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public t()I
    .locals 4

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->n()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->l()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid spatial streams: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public u(I)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wmw/wifi/p$a;->i(Lcom/ui/wmw/wifi/p;I)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public v()Ljava/util/Set;
    .locals 4

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->q()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ui/wmw/wifi/o;->u(I)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->q()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid supported channel width: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public w()Ljava/util/Set;
    .locals 4

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->r()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Invalid data rates "

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/ui/wmw/wifi/o;->e(Ljava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_1

    array-length v2, v0

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ui/wmw/wifi/o;->x(I)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_0
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->r()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor;->c()Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->r()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public x(I)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wmw/wifi/p$a;->j(Lcom/ui/wmw/wifi/p;I)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
