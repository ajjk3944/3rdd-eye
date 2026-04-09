.class public Linet/ipaddr/j$c$a;
.super Lbg/d$i$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/j$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field protected k:Ljava/lang/String;

.field protected l:Linet/ipaddr/j$g$a;

.field protected m:C


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/16 v0, 0x20

    .line 1
    invoke-direct {p0, p1, v0}, Linet/ipaddr/j$c$a;-><init>(IC)V

    return-void
.end method

.method protected constructor <init>(IC)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lbg/d$i$a;-><init>(IC)V

    .line 3
    const-string p1, ""

    iput-object p1, p0, Linet/ipaddr/j$c$a;->k:Ljava/lang/String;

    .line 4
    sget-object p1, Linet/ipaddr/j$g$a;->NETWORK_ONLY:Linet/ipaddr/j$g$a;

    iput-object p1, p0, Linet/ipaddr/j$c$a;->l:Linet/ipaddr/j$g$a;

    const/16 p1, 0x25

    .line 5
    iput-char p1, p0, Linet/ipaddr/j$c$a;->m:C

    return-void
.end method


# virtual methods
.method public i(Ljava/lang/String;)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-super {p0, p1}, Lbg/d$i$a;->a(Ljava/lang/String;)Lbg/d$i$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/j$c$a;

    return-object p1
.end method

.method public j(Ljava/lang/String;)Linet/ipaddr/j$c$a;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/j$c$a;->k:Ljava/lang/String;

    return-object p0
.end method

.method public k(Z)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-super {p0, p1}, Lbg/d$i$a;->b(Z)Lbg/d$i$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/j$c$a;

    return-object p1
.end method

.method public l(I)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-super {p0, p1}, Lbg/d$i$a;->c(I)Lbg/d$i$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/j$c$a;

    return-object p1
.end method

.method public m(Z)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-super {p0, p1}, Lbg/d$i$a;->d(Z)Lbg/d$i$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/j$c$a;

    return-object p1
.end method

.method public n(Ljava/lang/String;)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-super {p0, p1}, Lbg/d$i$a;->e(Ljava/lang/String;)Lbg/d$i$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/j$c$a;

    return-object p1
.end method

.method public o(Ljava/lang/Character;)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-super {p0, p1}, Lbg/d$i$a;->f(Ljava/lang/Character;)Lbg/d$i$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/j$c$a;

    return-object p1
.end method

.method public p(Z)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-super {p0, p1}, Lbg/d$i$a;->g(Z)Lbg/d$i$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/j$c$a;

    return-object p1
.end method

.method public q(Linet/ipaddr/j$g$a;)Linet/ipaddr/j$c$a;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/j$c$a;->l:Linet/ipaddr/j$g$a;

    return-object p0
.end method

.method public r(Linet/ipaddr/j$g;)Linet/ipaddr/j$c$a;
    .locals 1

    iget-object v0, p1, Linet/ipaddr/j$g;->a:Linet/ipaddr/j$g$a;

    invoke-virtual {p0, v0}, Linet/ipaddr/j$c$a;->q(Linet/ipaddr/j$g$a;)Linet/ipaddr/j$c$a;

    iget-object p1, p1, Linet/ipaddr/j$g;->b:Lbg/d$i$b;

    invoke-virtual {p0, p1}, Linet/ipaddr/j$c$a;->s(Lbg/d$i$b;)Linet/ipaddr/j$c$a;

    move-result-object p1

    return-object p1
.end method

.method public s(Lbg/d$i$b;)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-super {p0, p1}, Lbg/d$i$a;->h(Lbg/d$i$b;)Lbg/d$i$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/j$c$a;

    return-object p1
.end method

.method public t(C)Linet/ipaddr/j$c$a;
    .locals 0

    iput-char p1, p0, Linet/ipaddr/j$c$a;->m:C

    return-object p0
.end method

.method public u()Linet/ipaddr/j$c;
    .locals 14

    new-instance v13, Linet/ipaddr/j$c;

    iget v1, p0, Lbg/d$i$a;->c:I

    iget-boolean v2, p0, Lbg/d$i$a;->b:Z

    iget-object v3, p0, Linet/ipaddr/j$c$a;->l:Linet/ipaddr/j$g$a;

    iget-object v4, p0, Lbg/d$i$a;->a:Lbg/d$i$b;

    iget-object v5, p0, Lbg/d$i$a;->d:Ljava/lang/String;

    iget-object v6, p0, Lbg/d$i$a;->e:Ljava/lang/Character;

    iget-char v7, p0, Linet/ipaddr/j$c$a;->m:C

    iget-object v8, p0, Lbg/d$i$a;->f:Ljava/lang/String;

    iget-object v9, p0, Linet/ipaddr/j$c$a;->k:Ljava/lang/String;

    iget-boolean v10, p0, Lbg/d$i$a;->g:Z

    iget-boolean v11, p0, Lbg/d$i$a;->h:Z

    iget-boolean v12, p0, Lbg/d$i$a;->i:Z

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, Linet/ipaddr/j$c;-><init>(IZLinet/ipaddr/j$g$a;Lbg/d$i$b;Ljava/lang/String;Ljava/lang/Character;CLjava/lang/String;Ljava/lang/String;ZZZ)V

    return-object v13
.end method
