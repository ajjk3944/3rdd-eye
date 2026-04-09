.class public abstract LEc/t$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEc/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()LEc/t$c;
.end method

.method public b()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, LEc/t$b;->a()LEc/t$c;

    move-result-object v0

    invoke-virtual {p0}, LEc/t$b;->c()Linet/ipaddr/g;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract c()Linet/ipaddr/g;
.end method

.method public d()Linet/ipaddr/ipv4/b;
    .locals 2

    invoke-virtual {p0}, LEc/t$b;->c()Linet/ipaddr/g;

    move-result-object v0

    instance-of v1, v0, Linet/ipaddr/ipv4/b;

    if-eqz v1, :cond_0

    check-cast v0, Linet/ipaddr/ipv4/b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public e()Linet/ipaddr/ipv6/b;
    .locals 2

    invoke-virtual {p0}, LEc/t$b;->c()Linet/ipaddr/g;

    move-result-object v0

    instance-of v1, v0, Linet/ipaddr/ipv6/b;

    if-eqz v1, :cond_0

    check-cast v0, Linet/ipaddr/ipv6/b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public abstract f()J
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, LEc/t$b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
