.class public Linet/ipaddr/ipv6/Q$g;
.super Linet/ipaddr/j$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv6/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/ipv6/Q$g$a;
    }
.end annotation


# instance fields
.field public final n:Linet/ipaddr/j$c;

.field public final o:Linet/ipaddr/ipv6/Q$c;


# direct methods
.method constructor <init>(IZLinet/ipaddr/j$g$a;Lbg/d$i$b;Ljava/lang/String;ZLinet/ipaddr/j$c;Linet/ipaddr/ipv6/Q$c;Ljava/lang/Character;CLjava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 14

    move-object v13, p0

    move-object v0, p0

    move v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p9

    move/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move/from16 v10, p13

    move/from16 v11, p14

    move/from16 v12, p15

    invoke-direct/range {v0 .. v12}, Linet/ipaddr/j$c;-><init>(IZLinet/ipaddr/j$g$a;Lbg/d$i$b;Ljava/lang/String;Ljava/lang/Character;CLjava/lang/String;Ljava/lang/String;ZZZ)V

    move-object/from16 v0, p8

    iput-object v0, v13, Linet/ipaddr/ipv6/Q$g;->o:Linet/ipaddr/ipv6/Q$c;

    if-eqz p6, :cond_1

    if-nez p7, :cond_0

    new-instance v0, Linet/ipaddr/ipv4/I$d$a;

    invoke-direct {v0}, Linet/ipaddr/ipv4/I$d$a;-><init>()V

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Linet/ipaddr/j$c$a;->k(Z)Linet/ipaddr/j$c$a;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Linet/ipaddr/j$c$a;->q(Linet/ipaddr/j$g$a;)Linet/ipaddr/j$c$a;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-virtual {v0, v1}, Linet/ipaddr/j$c$a;->s(Lbg/d$i$b;)Linet/ipaddr/j$c$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object/from16 v0, p7

    :goto_0
    iput-object v0, v13, Linet/ipaddr/ipv6/Q$g;->n:Linet/ipaddr/j$c;

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    iput-object v0, v13, Linet/ipaddr/ipv6/Q$g;->n:Linet/ipaddr/j$c;

    :goto_1
    return-void
.end method

.method static synthetic a(Linet/ipaddr/ipv6/Q$g;Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/Q$h;
    .locals 0

    invoke-direct {p0, p1}, Linet/ipaddr/ipv6/Q$g;->b(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/Q$h;

    move-result-object p0

    return-object p0
.end method

.method private b(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/Q$h;
    .locals 6

    new-instance v0, Linet/ipaddr/ipv6/Q$h;

    invoke-direct {v0}, Linet/ipaddr/ipv6/Q$h;-><init>()V

    iget-object v1, p0, Linet/ipaddr/ipv6/Q$g;->o:Linet/ipaddr/ipv6/Q$c;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/Q$g;->d()Z

    move-result v1

    iget-object v2, p0, Linet/ipaddr/ipv6/Q$g;->o:Linet/ipaddr/ipv6/Q$c;

    invoke-static {p1, v2, v1}, Linet/ipaddr/ipv6/Q;->j3(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv6/Q$c;Z)[I

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    aget v3, v1, v2

    const/4 v4, 0x1

    aget v1, v1, v4

    iput v3, v0, Linet/ipaddr/ipv6/Q$h;->p:I

    add-int/2addr v3, v1

    iput v3, v0, Linet/ipaddr/ipv6/Q$h;->q:I

    iget-object v1, p0, Linet/ipaddr/ipv6/Q$g;->o:Linet/ipaddr/ipv6/Q$c;

    iget-object v1, v1, Linet/ipaddr/ipv6/Q$c;->b:Linet/ipaddr/ipv6/Q$c$a;

    invoke-virtual {v1}, Linet/ipaddr/ipv6/Q$c$a;->compressHost()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lag/d;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, v0, Linet/ipaddr/ipv6/Q$h;->q:I

    invoke-virtual {p1}, Lbg/f;->F0()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v3, 0x2

    const/16 v5, 0x10

    invoke-static {p1, v3, v5}, Linet/ipaddr/ipv6/Q;->k3(III)I

    move-result p1

    if-le v1, p1, :cond_0

    move v2, v4

    :cond_0
    iput-boolean v2, v0, Linet/ipaddr/ipv6/Q$h;->r:Z

    :cond_1
    iget-boolean p1, p0, Lbg/d$i;->c:Z

    invoke-virtual {v0, p1}, Lag/d$b;->u(Z)V

    iget-object p1, p0, Linet/ipaddr/j$c;->l:Linet/ipaddr/j$g$a;

    invoke-virtual {v0, p1}, Lag/d$c;->g0(Linet/ipaddr/j$g$a;)V

    iget-object p1, p0, Lbg/d$i;->b:Lbg/d$i$b;

    invoke-virtual {v0, p1}, Lag/d$b;->O(Lbg/d$i$b;)V

    iget-object p1, p0, Lbg/d$i;->f:Ljava/lang/Character;

    invoke-virtual {v0, p1}, Lag/d$b;->L(Ljava/lang/Character;)V

    iget-object p1, p0, Linet/ipaddr/j$c;->k:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lag/d$c;->f0(Ljava/lang/String;)V

    iget-object p1, p0, Lbg/d$i;->g:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lag/d$b;->G(Ljava/lang/String;)V

    iget-boolean p1, p0, Lbg/d$i;->h:Z

    invoke-virtual {v0, p1}, Lag/d$b;->I(Z)V

    iget-boolean p1, p0, Lbg/d$i;->i:Z

    invoke-virtual {v0, p1}, Lag/d$b;->M(Z)V

    iget-char p1, p0, Linet/ipaddr/j$c;->m:C

    invoke-virtual {v0, p1}, Lag/d$b;->P(C)V

    iget-boolean p1, p0, Lbg/d$i;->j:Z

    invoke-virtual {v0, p1}, Lag/d$b;->N(Z)V

    iget p1, p0, Lbg/d$i;->d:I

    invoke-virtual {v0, p1}, Lag/d$b;->H(I)V

    iget-object p1, p0, Lbg/d$i;->e:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lag/d$b;->K(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method c()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$g;->o:Linet/ipaddr/ipv6/Q$c;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method d()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/Q$g;->n:Linet/ipaddr/j$c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
