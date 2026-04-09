.class public final Lhd/a$b;
.super Lhd/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhd/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:J

.field private final b:Lhd/a$d$a;

.field private final c:Lhd/a$d;


# direct methods
.method public constructor <init>(JLhd/a$d$a;)V
    .locals 1

    const-string v0, "from"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lhd/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-wide p1, p0, Lhd/a$b;->a:J

    .line 5
    iput-object p3, p0, Lhd/a$b;->b:Lhd/a$d$a;

    .line 6
    sget-object p1, Lhd/a$d$b;->a:Lhd/a$d$b;

    iput-object p1, p0, Lhd/a$b;->c:Lhd/a$d;

    return-void
.end method

.method public synthetic constructor <init>(JLhd/a$d$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lhd/a$b;-><init>(JLhd/a$d$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lhd/a$d;
    .locals 1

    invoke-virtual {p0}, Lhd/a$b;->d()Lhd/a$d$a;

    move-result-object v0

    return-object v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lhd/a$b;->a:J

    return-wide v0
.end method

.method public c()Lhd/a$d;
    .locals 1

    iget-object v0, p0, Lhd/a$b;->c:Lhd/a$d;

    return-object v0
.end method

.method public d()Lhd/a$d$a;
    .locals 1

    iget-object v0, p0, Lhd/a$b;->b:Lhd/a$d$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lhd/a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lhd/a$b;

    iget-wide v3, p0, Lhd/a$b;->a:J

    iget-wide v5, p1, Lhd/a$b;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lhd/a$b;->b:Lhd/a$d$a;

    iget-object p1, p1, Lhd/a$b;->b:Lhd/a$d$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lhd/a$b;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lhd/a$b;->b:Lhd/a$d$a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-wide v0, p0, Lhd/a$b;->a:J

    iget-object v2, p0, Lhd/a$b;->b:Lhd/a$d$a;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Disconnection(timestamp="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", from="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
