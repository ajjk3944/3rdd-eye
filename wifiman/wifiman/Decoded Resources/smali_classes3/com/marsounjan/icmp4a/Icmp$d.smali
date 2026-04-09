.class public final Lcom/marsounjan/icmp4a/Icmp$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/marsounjan/icmp4a/Icmp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/net/InetAddress;

.field private final b:I

.field private final c:I

.field private final d:F

.field private final e:Lcom/marsounjan/icmp4a/Icmp$b;

.field private final f:Lcom/marsounjan/icmp4a/Icmp$c;


# direct methods
.method public constructor <init>(Ljava/net/InetAddress;IIFLcom/marsounjan/icmp4a/Icmp$b;Lcom/marsounjan/icmp4a/Icmp$c;)V
    .locals 1

    const-string/jumbo v0, "ip"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "result"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->a:Ljava/net/InetAddress;

    iput p2, p0, Lcom/marsounjan/icmp4a/Icmp$d;->b:I

    iput p3, p0, Lcom/marsounjan/icmp4a/Icmp$d;->c:I

    iput p4, p0, Lcom/marsounjan/icmp4a/Icmp$d;->d:F

    iput-object p5, p0, Lcom/marsounjan/icmp4a/Icmp$d;->e:Lcom/marsounjan/icmp4a/Icmp$b;

    iput-object p6, p0, Lcom/marsounjan/icmp4a/Icmp$d;->f:Lcom/marsounjan/icmp4a/Icmp$c;

    return-void
.end method


# virtual methods
.method public final a()Ljava/net/InetAddress;
    .locals 1

    iget-object v0, p0, Lcom/marsounjan/icmp4a/Icmp$d;->a:Ljava/net/InetAddress;

    return-object v0
.end method

.method public final b()Lcom/marsounjan/icmp4a/Icmp$c;
    .locals 1

    iget-object v0, p0, Lcom/marsounjan/icmp4a/Icmp$d;->f:Lcom/marsounjan/icmp4a/Icmp$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/marsounjan/icmp4a/Icmp$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/marsounjan/icmp4a/Icmp$d;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->a:Ljava/net/InetAddress;

    iget-object v3, p1, Lcom/marsounjan/icmp4a/Icmp$d;->a:Ljava/net/InetAddress;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->b:I

    iget v3, p1, Lcom/marsounjan/icmp4a/Icmp$d;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->c:I

    iget v3, p1, Lcom/marsounjan/icmp4a/Icmp$d;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->d:F

    iget v3, p1, Lcom/marsounjan/icmp4a/Icmp$d;->d:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->e:Lcom/marsounjan/icmp4a/Icmp$b;

    iget-object v3, p1, Lcom/marsounjan/icmp4a/Icmp$d;->e:Lcom/marsounjan/icmp4a/Icmp$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->f:Lcom/marsounjan/icmp4a/Icmp$c;

    iget-object p1, p1, Lcom/marsounjan/icmp4a/Icmp$d;->f:Lcom/marsounjan/icmp4a/Icmp$c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/marsounjan/icmp4a/Icmp$d;->a:Ljava/net/InetAddress;

    invoke-virtual {v0}, Ljava/net/InetAddress;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->d:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->e:Lcom/marsounjan/icmp4a/Icmp$b;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/marsounjan/icmp4a/Icmp$b;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->f:Lcom/marsounjan/icmp4a/Icmp$c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "PingStatus(ip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->a:Ljava/net/InetAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", packetsTransmitted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", packetsReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", packetLoss="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", stats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->e:Lcom/marsounjan/icmp4a/Icmp$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/Icmp$d;->f:Lcom/marsounjan/icmp4a/Icmp$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
