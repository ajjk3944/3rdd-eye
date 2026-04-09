.class public final Lcom/ui/btle/v2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/btle/v2/f$a;,
        Lcom/ui/btle/v2/f$b;
    }
.end annotation


# instance fields
.field private final a:[B


# direct methods
.method private synthetic constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/btle/v2/f;->a:[B

    return-void
.end method

.method public static final synthetic a([B)Lcom/ui/btle/v2/f;
    .locals 1

    new-instance v0, Lcom/ui/btle/v2/f;

    invoke-direct {v0, p0}, Lcom/ui/btle/v2/f;-><init>([B)V

    return-object v0
.end method

.method public static b([B)[B
    .locals 1

    const-string/jumbo v0, "data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static c([BLjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/ui/btle/v2/f;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/ui/btle/v2/f;

    invoke-virtual {p1}, Lcom/ui/btle/v2/f;->f()[B

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static d([B)I
    .locals 0

    invoke-static {p0}, Ljava/util/Arrays;->hashCode([B)I

    move-result p0

    return p0
.end method

.method public static e([B)Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BTLEv2PacketFrame(data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/ui/btle/v2/f;->a:[B

    invoke-static {v0, p1}, Lcom/ui/btle/v2/f;->c([BLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic f()[B
    .locals 1

    iget-object v0, p0, Lcom/ui/btle/v2/f;->a:[B

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/btle/v2/f;->a:[B

    invoke-static {v0}, Lcom/ui/btle/v2/f;->d([B)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/btle/v2/f;->a:[B

    invoke-static {v0}, Lcom/ui/btle/v2/f;->e([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
