.class public final Ljd/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljd/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljd/a$c;

.field private final b:Linet/ipaddr/g;

.field private final c:Ljd/a$a;

.field private final d:LCc/a;

.field private final e:Ljd/a$d;


# direct methods
.method public constructor <init>(Ljd/a$c;Linet/ipaddr/g;Ljd/a$a;LCc/a;Ljd/a$d;)V
    .locals 1

    const-string v0, "role"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljd/a$b;->a:Ljd/a$c;

    iput-object p2, p0, Ljd/a$b;->b:Linet/ipaddr/g;

    iput-object p3, p0, Ljd/a$b;->c:Ljd/a$a;

    iput-object p4, p0, Ljd/a$b;->d:LCc/a;

    iput-object p5, p0, Ljd/a$b;->e:Ljd/a$d;

    return-void
.end method


# virtual methods
.method public final a()Ljd/a$a;
    .locals 1

    iget-object v0, p0, Ljd/a$b;->c:Ljd/a$a;

    return-object v0
.end method

.method public final b()LCc/a;
    .locals 1

    iget-object v0, p0, Ljd/a$b;->d:LCc/a;

    return-object v0
.end method

.method public final c()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Ljd/a$b;->b:Linet/ipaddr/g;

    return-object v0
.end method

.method public final d()Ljd/a$c;
    .locals 1

    iget-object v0, p0, Ljd/a$b;->a:Ljd/a$c;

    return-object v0
.end method

.method public final e()Ljd/a$d;
    .locals 1

    iget-object v0, p0, Ljd/a$b;->e:Ljd/a$d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljd/a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ljd/a$b;

    iget-object v1, p0, Ljd/a$b;->a:Ljd/a$c;

    iget-object v3, p1, Ljd/a$b;->a:Ljd/a$c;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ljd/a$b;->b:Linet/ipaddr/g;

    iget-object v3, p1, Ljd/a$b;->b:Linet/ipaddr/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ljd/a$b;->c:Ljd/a$a;

    iget-object v3, p1, Ljd/a$b;->c:Ljd/a$a;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ljd/a$b;->d:LCc/a;

    iget-object v3, p1, Ljd/a$b;->d:LCc/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ljd/a$b;->e:Ljd/a$d;

    iget-object p1, p1, Ljd/a$b;->e:Ljd/a$d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ljd/a$b;->a:Ljd/a$c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ljd/a$b;->b:Linet/ipaddr/g;

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

    iget-object v1, p0, Ljd/a$b;->c:Ljd/a$a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ljd/a$b;->d:LCc/a;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ljd/a$b;->e:Ljd/a$d;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljd/a$d;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Ljd/a$b;->a:Ljd/a$c;

    iget-object v1, p0, Ljd/a$b;->b:Linet/ipaddr/g;

    iget-object v2, p0, Ljd/a$b;->c:Ljd/a$a;

    iget-object v3, p0, Ljd/a$b;->d:LCc/a;

    iget-object v4, p0, Ljd/a$b;->e:Ljd/a$d;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Node(role="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ip="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", connection="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", device="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", wifimanApi="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
