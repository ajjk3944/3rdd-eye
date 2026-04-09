.class public final Lrd/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrd/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrd/b$a$a;
    }
.end annotation


# instance fields
.field private final a:Linet/ipaddr/g;

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:LS8/g;

.field private final f:Lrd/b$a$a;


# direct methods
.method public constructor <init>(Linet/ipaddr/g;ILjava/lang/String;Ljava/lang/String;LS8/g;Lrd/b$a$a;)V
    .locals 1

    const-string v0, "ipAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrd/b$a;->a:Linet/ipaddr/g;

    iput p2, p0, Lrd/b$a;->b:I

    iput-object p3, p0, Lrd/b$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lrd/b$a;->d:Ljava/lang/String;

    iput-object p5, p0, Lrd/b$a;->e:LS8/g;

    iput-object p6, p0, Lrd/b$a;->f:Lrd/b$a$a;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrd/b$a;->a:Linet/ipaddr/g;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Lrd/b$a;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrd/b$a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrd/b$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lrd/b$a;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lrd/b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lrd/b$a;

    iget-object v0, p1, Lrd/b$a;->a:Linet/ipaddr/g;

    iget-object v1, p0, Lrd/b$a;->a:Linet/ipaddr/g;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p1, Lrd/b$a;->b:I

    iget v1, p0, Lrd/b$a;->b:I

    if-ne v0, v1, :cond_0

    iget-object v0, p1, Lrd/b$a;->c:Ljava/lang/String;

    iget-object v1, p0, Lrd/b$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lrd/b$a;->d:Ljava/lang/String;

    iget-object v1, p0, Lrd/b$a;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lrd/b$a;->f:Lrd/b$a$a;

    iget-object v0, p0, Lrd/b$a;->f:Lrd/b$a$a;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f()Lrd/b$a$a;
    .locals 1

    iget-object v0, p0, Lrd/b$a;->f:Lrd/b$a$a;

    return-object v0
.end method

.method public final g()LS8/g;
    .locals 1

    iget-object v0, p0, Lrd/b$a;->e:LS8/g;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lrd/b$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lrd/b$a;->c:Ljava/lang/String;

    invoke-virtual {p0}, Lrd/b$a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lrd/b$a;->a:Linet/ipaddr/g;

    iget v3, p0, Lrd/b$a;->b:I

    iget-object v4, p0, Lrd/b$a;->f:Lrd/b$a$a;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "A2A Speedtest Endpoint - "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "(id:"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",host:"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ",port:"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ",type:"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
