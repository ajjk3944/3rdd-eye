.class Linet/ipaddr/ipv6/Q$a;
.super Linet/ipaddr/ipv6/e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Linet/ipaddr/ipv6/Q;->s3(I)Linet/ipaddr/ipv6/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:I

.field final synthetic e:Linet/ipaddr/ipv6/Q;


# direct methods
.method constructor <init>(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv6/e;Linet/ipaddr/ipv6/e$a$a;I)V
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv6/Q$a;->e:Linet/ipaddr/ipv6/Q;

    iput p4, p0, Linet/ipaddr/ipv6/Q$a;->d:I

    invoke-direct {p0, p2, p3}, Linet/ipaddr/ipv6/e$a;-><init>(Linet/ipaddr/ipv6/e;Linet/ipaddr/ipv6/e$a$a;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic G0([Linet/ipaddr/k;)Linet/ipaddr/j;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv6/V;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$a;->c1([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    return-object p1
.end method

.method protected Z0([Linet/ipaddr/ipv6/V;Ljava/lang/Integer;Z)Linet/ipaddr/ipv6/Q;
    .locals 7

    new-instance v6, Linet/ipaddr/ipv6/Q;

    iget v2, p0, Linet/ipaddr/ipv6/Q$a;->d:I

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Linet/ipaddr/ipv6/Q;-><init>([Linet/ipaddr/ipv6/V;IZLjava/lang/Integer;Z)V

    return-object v6
.end method

.method protected c1([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/e$a;->j1()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    iget v1, p0, Linet/ipaddr/ipv6/Q$a;->d:I

    invoke-virtual {v0, p1, v1}, Linet/ipaddr/ipv6/e$a;->d1([Linet/ipaddr/ipv6/V;I)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic q0([Linet/ipaddr/k;Ljava/lang/Integer;Z)Linet/ipaddr/j;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv6/V;

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/ipv6/Q$a;->Z0([Linet/ipaddr/ipv6/V;Ljava/lang/Integer;Z)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic r([LZf/d;Ljava/lang/Integer;Z)LZf/c;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv6/V;

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/ipv6/Q$a;->Z0([Linet/ipaddr/ipv6/V;Ljava/lang/Integer;Z)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic t([LZf/d;)LZf/c;
    .locals 0

    check-cast p1, [Linet/ipaddr/ipv6/V;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$a;->c1([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    return-object p1
.end method
