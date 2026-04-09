.class public final Lhd/a$a$b;
.super Lhd/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhd/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:J

.field private final b:Lhd/a$d;

.field private final c:Lhd/a$d$a$b;


# direct methods
.method public constructor <init>(JLhd/a$d;Lhd/a$d$a$b;)V
    .locals 1

    const-string v0, "from"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "to"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lhd/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-wide p1, p0, Lhd/a$a$b;->a:J

    .line 5
    iput-object p3, p0, Lhd/a$a$b;->b:Lhd/a$d;

    .line 6
    iput-object p4, p0, Lhd/a$a$b;->c:Lhd/a$d$a$b;

    return-void
.end method

.method public synthetic constructor <init>(JLhd/a$d;Lhd/a$d$a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x1

    if-eqz p5, :cond_0

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lhd/a$a$b;-><init>(JLhd/a$d;Lhd/a$d$a$b;)V

    return-void
.end method


# virtual methods
.method public a()Lhd/a$d;
    .locals 1

    iget-object v0, p0, Lhd/a$a$b;->b:Lhd/a$d;

    return-object v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lhd/a$a$b;->a:J

    return-wide v0
.end method

.method public bridge synthetic c()Lhd/a$d;
    .locals 1

    invoke-virtual {p0}, Lhd/a$a$b;->d()Lhd/a$d$a$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lhd/a$d$a$b;
    .locals 1

    iget-object v0, p0, Lhd/a$a$b;->c:Lhd/a$d$a$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lhd/a$a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lhd/a$a$b;

    iget-wide v3, p0, Lhd/a$a$b;->a:J

    iget-wide v5, p1, Lhd/a$a$b;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lhd/a$a$b;->b:Lhd/a$d;

    iget-object v3, p1, Lhd/a$a$b;->b:Lhd/a$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lhd/a$a$b;->c:Lhd/a$d$a$b;

    iget-object p1, p1, Lhd/a$a$b;->c:Lhd/a$d$a$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lhd/a$a$b;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lhd/a$a$b;->b:Lhd/a$d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lhd/a$a$b;->c:Lhd/a$d$a$b;

    invoke-virtual {v1}, Lhd/a$d$a$b;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lhd/a$a$b;->a:J

    iget-object v2, p0, Lhd/a$a$b;->b:Lhd/a$d;

    iget-object v3, p0, Lhd/a$a$b;->c:Lhd/a$d$a$b;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "WiFiNetworkConnection(timestamp="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", from="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", to="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
