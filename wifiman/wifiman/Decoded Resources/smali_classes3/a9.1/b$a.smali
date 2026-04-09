.class public final La9/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La9/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)[B
    .locals 5

    const-string/jumbo v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/btle/v2/e$a$a;->a:Lcom/ui/btle/v2/e$a$a;

    invoke-virtual {v0}, Lcom/ui/btle/v2/e$a$a;->a()I

    move-result v1

    array-length v2, p1

    add-int/2addr v1, v2

    new-array v2, v1, [B

    const v3, 0xffff

    if-gt v1, v3, :cond_0

    int-to-short v1, v1

    invoke-static {v1}, LYg/H;->b(S)S

    move-result v1

    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v3

    const-string/jumbo v4, "v2FrameBuffer"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3, v1}, Lcom/ui/btle/v2/e$a$a;->c(Ljava/nio/ByteBuffer;S)V

    sget-object v0, Lcom/ui/btle/v2/e$b;->a:Lcom/ui/btle/v2/e$b;

    invoke-virtual {v0, v3, p1}, Lcom/ui/btle/v2/e$b;->b(Ljava/nio/ByteBuffer;[B)V

    invoke-static {v2}, La9/b;->a([B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/ui/btle/v2/BTLEv2$Error$Protocol$InvalidPacketContent;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BTLEv2 Packet payload length is limited to 65535 since it needs to be represented by 2 bytes. Current payload has "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " bytes."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/ui/btle/v2/BTLEv2$Error$Protocol$InvalidPacketContent;-><init>(Ljava/lang/String;)V

    throw p1
.end method
