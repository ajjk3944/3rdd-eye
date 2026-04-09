.class Linet/ipaddr/ipv6/b$a;
.super Linet/ipaddr/ipv6/e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Linet/ipaddr/ipv6/b;->A1()Linet/ipaddr/ipv6/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Linet/ipaddr/ipv6/b;


# direct methods
.method constructor <init>(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/e;Linet/ipaddr/ipv6/e$a$a;)V
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv6/b$a;->d:Linet/ipaddr/ipv6/b;

    invoke-direct {p0, p2, p3}, Linet/ipaddr/ipv6/e$a;-><init>(Linet/ipaddr/ipv6/e;Linet/ipaddr/ipv6/e$a$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic E(Linet/ipaddr/j;)Linet/ipaddr/g;
    .locals 0

    check-cast p1, Linet/ipaddr/ipv6/Q;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b$a;->N0(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method public N0(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv6/b$a;->d:Linet/ipaddr/ipv6/b;

    invoke-virtual {v0}, Linet/ipaddr/ipv6/b;->B1()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    iget-object v1, p0, Linet/ipaddr/ipv6/b$a;->d:Linet/ipaddr/ipv6/b;

    invoke-static {v1}, Linet/ipaddr/ipv6/b;->v1(Linet/ipaddr/ipv6/b;)Linet/ipaddr/ipv6/b$c;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Linet/ipaddr/ipv6/e$a;->P0(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv6/b$c;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic S([Linet/ipaddr/k;)Linet/ipaddr/g;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv6/V;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b$a;->W0([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method protected W0([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/b;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv6/b$a;->d:Linet/ipaddr/ipv6/b;

    invoke-virtual {v0}, Linet/ipaddr/ipv6/b;->B1()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    iget-object v1, p0, Linet/ipaddr/ipv6/b$a;->d:Linet/ipaddr/ipv6/b;

    invoke-static {v1}, Linet/ipaddr/ipv6/b;->v1(Linet/ipaddr/ipv6/b;)Linet/ipaddr/ipv6/b$c;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Linet/ipaddr/ipv6/e$a;->T0([Linet/ipaddr/ipv6/V;Linet/ipaddr/ipv6/b$c;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method
