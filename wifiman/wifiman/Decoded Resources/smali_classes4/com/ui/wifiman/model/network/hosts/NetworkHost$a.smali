.class public final Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;
.super Lcom/ui/wifiman/model/network/hosts/NetworkHost;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/network/hosts/NetworkHost;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:J

.field private final b:Linet/ipaddr/g;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Ldd/i;


# direct methods
.method public constructor <init>(JLinet/ipaddr/g;Ljava/lang/String;ILdd/i;)V
    .locals 1

    const-string v0, "host"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/network/hosts/NetworkHost;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-wide p1, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->a:J

    iput-object p3, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->b:Linet/ipaddr/g;

    iput-object p4, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->c:Ljava/lang/String;

    iput p5, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->d:I

    iput-object p6, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->e:Ldd/i;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->a:J

    return-wide v0
.end method

.method public c()Ldd/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->e:Ldd/i;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;

    iget-wide v3, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->a:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->b:Linet/ipaddr/g;

    iget-object v3, p1, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->b:Linet/ipaddr/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->d:I

    iget v3, p1, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->e:Ldd/i;

    iget-object p1, p1, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->e:Ldd/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->b:Linet/ipaddr/g;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Linet/ipaddr/a;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->e:Ldd/i;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ldd/i;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->a:J

    iget-object v2, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->b:Linet/ipaddr/g;

    iget-object v3, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->c:Ljava/lang/String;

    iget v4, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->d:I

    iget-object v5, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->e:Ldd/i;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Custom(id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", ip="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", host="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", position="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", stats="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
