.class public Linet/ipaddr/ipv6/Q$g$a;
.super Linet/ipaddr/j$c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv6/Q$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private n:Z

.field private o:Linet/ipaddr/j$c;

.field private p:Linet/ipaddr/ipv6/Q$c;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x10

    const/16 v1, 0x3a

    invoke-direct {p0, v0, v1}, Linet/ipaddr/j$c$a;-><init>(IC)V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/String;)Linet/ipaddr/ipv6/Q$g$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/j$c$a;->n(Ljava/lang/String;)Linet/ipaddr/j$c$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/Q$g$a;

    return-object p1
.end method

.method public B(Ljava/lang/Character;)Linet/ipaddr/ipv6/Q$g$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/j$c$a;->o(Ljava/lang/Character;)Linet/ipaddr/j$c$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/Q$g$a;

    return-object p1
.end method

.method public C(Z)Linet/ipaddr/ipv6/Q$g$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/j$c$a;->p(Z)Linet/ipaddr/j$c$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/Q$g$a;

    return-object p1
.end method

.method public D(Linet/ipaddr/j$g;)Linet/ipaddr/ipv6/Q$g$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/j$c$a;->r(Linet/ipaddr/j$g;)Linet/ipaddr/j$c$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/Q$g$a;

    return-object p1
.end method

.method public E(C)Linet/ipaddr/ipv6/Q$g$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/j$c$a;->t(C)Linet/ipaddr/j$c$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/Q$g$a;

    return-object p1
.end method

.method public F()Linet/ipaddr/ipv6/Q$g;
    .locals 18

    move-object/from16 v0, p0

    new-instance v17, Linet/ipaddr/ipv6/Q$g;

    iget v2, v0, Lbg/d$i$a;->c:I

    iget-boolean v3, v0, Lbg/d$i$a;->b:Z

    iget-object v4, v0, Linet/ipaddr/j$c$a;->l:Linet/ipaddr/j$g$a;

    iget-object v5, v0, Lbg/d$i$a;->a:Lbg/d$i$b;

    iget-object v6, v0, Lbg/d$i$a;->d:Ljava/lang/String;

    iget-boolean v7, v0, Linet/ipaddr/ipv6/Q$g$a;->n:Z

    iget-object v8, v0, Linet/ipaddr/ipv6/Q$g$a;->o:Linet/ipaddr/j$c;

    iget-object v9, v0, Linet/ipaddr/ipv6/Q$g$a;->p:Linet/ipaddr/ipv6/Q$c;

    iget-object v10, v0, Lbg/d$i$a;->e:Ljava/lang/Character;

    iget-char v11, v0, Linet/ipaddr/j$c$a;->m:C

    iget-object v12, v0, Lbg/d$i$a;->f:Ljava/lang/String;

    iget-object v13, v0, Linet/ipaddr/j$c$a;->k:Ljava/lang/String;

    iget-boolean v14, v0, Lbg/d$i$a;->g:Z

    iget-boolean v15, v0, Lbg/d$i$a;->h:Z

    iget-boolean v1, v0, Lbg/d$i$a;->i:Z

    move/from16 v16, v1

    move-object/from16 v1, v17

    invoke-direct/range {v1 .. v16}, Linet/ipaddr/ipv6/Q$g;-><init>(IZLinet/ipaddr/j$g$a;Lbg/d$i$b;Ljava/lang/String;ZLinet/ipaddr/j$c;Linet/ipaddr/ipv6/Q$c;Ljava/lang/Character;CLjava/lang/String;Ljava/lang/String;ZZZ)V

    return-object v17
.end method

.method public bridge synthetic j(Ljava/lang/String;)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$g$a;->v(Ljava/lang/String;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(Z)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$g$a;->x(Z)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Z)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$g$a;->z(Z)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n(Ljava/lang/String;)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$g$a;->A(Ljava/lang/String;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic o(Ljava/lang/Character;)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$g$a;->B(Ljava/lang/Character;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic r(Linet/ipaddr/j$g;)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$g$a;->D(Linet/ipaddr/j$g;)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic t(C)Linet/ipaddr/j$c$a;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/Q$g$a;->E(C)Linet/ipaddr/ipv6/Q$g$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u()Linet/ipaddr/j$c;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q$g$a;->F()Linet/ipaddr/ipv6/Q$g;

    move-result-object v0

    return-object v0
.end method

.method public v(Ljava/lang/String;)Linet/ipaddr/ipv6/Q$g$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/j$c$a;->j(Ljava/lang/String;)Linet/ipaddr/j$c$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/Q$g$a;

    return-object p1
.end method

.method public w(Linet/ipaddr/ipv6/Q$c;)Linet/ipaddr/ipv6/Q$g$a;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv6/Q$g$a;->p:Linet/ipaddr/ipv6/Q$c;

    return-object p0
.end method

.method public x(Z)Linet/ipaddr/ipv6/Q$g$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/j$c$a;->k(Z)Linet/ipaddr/j$c$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/Q$g$a;

    return-object p1
.end method

.method public y(Z)Linet/ipaddr/ipv6/Q$g$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/ipv6/Q$g$a;->n:Z

    return-object p0
.end method

.method public z(Z)Linet/ipaddr/ipv6/Q$g$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/j$c$a;->m(Z)Linet/ipaddr/j$c$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/Q$g$a;

    return-object p1
.end method
