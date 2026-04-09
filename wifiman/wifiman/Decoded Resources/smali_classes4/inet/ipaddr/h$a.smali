.class public Linet/ipaddr/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Linet/ipaddr/g;)Linet/ipaddr/ipv4/b;
    .locals 1

    invoke-virtual {p0, p1}, Linet/ipaddr/h$a;->c(Linet/ipaddr/g;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Linet/ipaddr/g;->e1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Linet/ipaddr/g;->n1()Linet/ipaddr/ipv4/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Linet/ipaddr/g;->o1()Linet/ipaddr/ipv6/b;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv6/b;->D1()Linet/ipaddr/ipv4/b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Linet/ipaddr/g;)Linet/ipaddr/ipv6/b;
    .locals 1

    invoke-virtual {p1}, Linet/ipaddr/g;->f1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Linet/ipaddr/g;->o1()Linet/ipaddr/ipv6/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Linet/ipaddr/g;->n1()Linet/ipaddr/ipv4/b;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv4/b;->A1()Linet/ipaddr/ipv6/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public c(Linet/ipaddr/g;)Z
    .locals 1

    invoke-virtual {p1}, Linet/ipaddr/g;->e1()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Linet/ipaddr/g;->o1()Linet/ipaddr/ipv6/b;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv6/b;->R1()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
