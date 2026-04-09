.class public final Lcd/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcd/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:Linet/ipaddr/g;

.field private final b:I

.field private final c:I

.field private final d:Lcd/a$c;

.field private final e:F


# direct methods
.method public constructor <init>(Linet/ipaddr/g;IILcd/a$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd/a$d;->a:Linet/ipaddr/g;

    iput p2, p0, Lcd/a$d;->b:I

    iput p3, p0, Lcd/a$d;->c:I

    iput-object p4, p0, Lcd/a$d;->d:Lcd/a$c;

    if-eqz p2, :cond_0

    int-to-float p1, p3

    int-to-float p2, p2

    div-float/2addr p1, p2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lcd/a$d;->e:F

    return-void
.end method

.method public static synthetic b(Lcd/a$d;Linet/ipaddr/g;IILcd/a$c;ILjava/lang/Object;)Lcd/a$d;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcd/a$d;->a:Linet/ipaddr/g;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcd/a$d;->b:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcd/a$d;->c:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcd/a$d;->d:Lcd/a$c;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcd/a$d;->a(Linet/ipaddr/g;IILcd/a$c;)Lcd/a$d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Linet/ipaddr/g;IILcd/a$c;)Lcd/a$d;
    .locals 1

    new-instance v0, Lcd/a$d;

    invoke-direct {v0, p1, p2, p3, p4}, Lcd/a$d;-><init>(Linet/ipaddr/g;IILcd/a$c;)V

    return-object v0
.end method

.method public final c()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Lcd/a$d;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public final d()Lcd/a$c;
    .locals 1

    iget-object v0, p0, Lcd/a$d;->d:Lcd/a$c;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lcd/a$d;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcd/a$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcd/a$d;

    iget-object v1, p0, Lcd/a$d;->a:Linet/ipaddr/g;

    iget-object v3, p1, Lcd/a$d;->a:Linet/ipaddr/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcd/a$d;->b:I

    iget v3, p1, Lcd/a$d;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcd/a$d;->c:I

    iget v3, p1, Lcd/a$d;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcd/a$d;->d:Lcd/a$c;

    iget-object p1, p1, Lcd/a$d;->d:Lcd/a$c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lcd/a$d;->b:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcd/a$d;->a:Linet/ipaddr/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Linet/ipaddr/a;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcd/a$d;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcd/a$d;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcd/a$d;->d:Lcd/a$c;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcd/a$d;->a:Linet/ipaddr/g;

    iget v1, p0, Lcd/a$d;->b:I

    iget v2, p0, Lcd/a$d;->c:I

    iget-object v3, p0, Lcd/a$d;->d:Lcd/a$c;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Stats(ip="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", packetsTransmitted="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", packetsReceived="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", latest="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
