.class Linet/ipaddr/ipv6/Q$d;
.super Linet/ipaddr/ipv6/Q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv6/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private final A:Linet/ipaddr/j;


# direct methods
.method constructor <init>(Linet/ipaddr/j;[Linet/ipaddr/ipv6/V;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p2, p3, v0}, Linet/ipaddr/ipv6/Q;-><init>([Linet/ipaddr/ipv6/V;IZ)V

    iput-object p1, p0, Linet/ipaddr/ipv6/Q$d;->A:Linet/ipaddr/j;

    return-void
.end method


# virtual methods
.method public bridge synthetic G1(I)Lbg/e;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic V0(I)Lag/b;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a2(I)Linet/ipaddr/k;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e()Linet/ipaddr/c;
    .locals 1

    .line 1
    invoke-super {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Linet/ipaddr/i;
    .locals 1

    .line 2
    invoke-super {p0}, Linet/ipaddr/ipv6/Q;->B3()Linet/ipaddr/ipv6/e;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic e2()[Linet/ipaddr/k;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/ipv6/Q;->F3()[Linet/ipaddr/ipv6/V;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic k(I)Lag/f;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lag/l;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lcg/c;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m1(I)Lbg/b;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/ipv6/Q;->v3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(I)LZf/d;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(I)Linet/ipaddr/k;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/ipv6/Q;->v4()Ldg/b;

    move-result-object v0

    return-object v0
.end method

.method public x()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$d;->A:Linet/ipaddr/j;

    invoke-virtual {v0}, Lbg/f;->x()Z

    move-result v0

    return v0
.end method
