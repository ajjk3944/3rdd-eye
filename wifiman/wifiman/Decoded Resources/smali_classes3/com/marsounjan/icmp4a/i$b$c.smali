.class public final Lcom/marsounjan/icmp4a/i$b$c;
.super Lcom/marsounjan/icmp4a/i$b;
.source "SourceFile"

# interfaces
.implements LK5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/marsounjan/icmp4a/i$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:I

.field private final b:Lcom/marsounjan/icmp4a/i$c;


# direct methods
.method private constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/marsounjan/icmp4a/i$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput p1, p0, Lcom/marsounjan/icmp4a/i$b$c;->a:I

    .line 4
    sget-object p1, Lcom/marsounjan/icmp4a/i$c;->PACKET_TOO_BIG:Lcom/marsounjan/icmp4a/i$c;

    iput-object p1, p0, Lcom/marsounjan/icmp4a/i$b$c;->b:Lcom/marsounjan/icmp4a/i$c;

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/marsounjan/icmp4a/i$b$c;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lcom/marsounjan/icmp4a/i$b$c;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/marsounjan/icmp4a/i$b$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/marsounjan/icmp4a/i$b$c;

    iget v1, p0, Lcom/marsounjan/icmp4a/i$b$c;->a:I

    iget p1, p1, Lcom/marsounjan/icmp4a/i$b$c;->a:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/marsounjan/icmp4a/i$b$c;->a:I

    invoke-static {v0}, LYg/C;->d(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "PacketTooBig(mtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/marsounjan/icmp4a/i$b$c;->a:I

    invoke-static {v1}, LYg/C;->g(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
