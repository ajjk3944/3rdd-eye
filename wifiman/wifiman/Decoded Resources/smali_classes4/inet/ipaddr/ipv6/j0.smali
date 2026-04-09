.class public Linet/ipaddr/ipv6/j0;
.super Linet/ipaddr/o$b;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/ipv6/j0$a;
    }
.end annotation


# instance fields
.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field private final m:Linet/ipaddr/ipv6/e;

.field private n:Linet/ipaddr/o;


# direct methods
.method public constructor <init>(ZZZZLinet/ipaddr/o;ZZZLinet/ipaddr/d$c;ZZZLinet/ipaddr/ipv6/e;)V
    .locals 9

    move-object v8, p0

    move-object v0, p0

    move/from16 v1, p12

    move v2, p1

    move v3, p2

    move v4, p3

    move-object/from16 v5, p9

    move/from16 v6, p10

    move/from16 v7, p11

    invoke-direct/range {v0 .. v7}, Linet/ipaddr/o$b;-><init>(ZZZZLinet/ipaddr/d$c;ZZ)V

    move v0, p4

    iput-boolean v0, v8, Linet/ipaddr/ipv6/j0;->i:Z

    move v0, p6

    iput-boolean v0, v8, Linet/ipaddr/ipv6/j0;->j:Z

    move/from16 v0, p7

    iput-boolean v0, v8, Linet/ipaddr/ipv6/j0;->k:Z

    move/from16 v0, p8

    iput-boolean v0, v8, Linet/ipaddr/ipv6/j0;->l:Z

    move-object v0, p5

    iput-object v0, v8, Linet/ipaddr/ipv6/j0;->n:Linet/ipaddr/o;

    move-object/from16 v0, p13

    iput-object v0, v8, Linet/ipaddr/ipv6/j0;->m:Linet/ipaddr/ipv6/e;

    return-void
.end method


# virtual methods
.method public B(Z)Linet/ipaddr/ipv6/j0$a;
    .locals 2

    new-instance v0, Linet/ipaddr/ipv6/j0$a;

    invoke-direct {v0}, Linet/ipaddr/ipv6/j0$a;-><init>()V

    iget-boolean v1, p0, Linet/ipaddr/ipv6/j0;->i:Z

    invoke-static {v0, v1}, Linet/ipaddr/ipv6/j0$a;->j(Linet/ipaddr/ipv6/j0$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/ipv6/j0;->j:Z

    invoke-static {v0, v1}, Linet/ipaddr/ipv6/j0$a;->k(Linet/ipaddr/ipv6/j0$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/ipv6/j0;->k:Z

    invoke-static {v0, v1}, Linet/ipaddr/ipv6/j0$a;->l(Linet/ipaddr/ipv6/j0$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/ipv6/j0;->l:Z

    invoke-static {v0, v1}, Linet/ipaddr/ipv6/j0$a;->m(Linet/ipaddr/ipv6/j0$a;Z)Z

    iget-object v1, p0, Linet/ipaddr/ipv6/j0;->m:Linet/ipaddr/ipv6/e;

    invoke-static {v0, v1}, Linet/ipaddr/ipv6/j0$a;->n(Linet/ipaddr/ipv6/j0$a;Linet/ipaddr/ipv6/e;)Linet/ipaddr/ipv6/e;

    if-nez p1, :cond_0

    iget-object p1, p0, Linet/ipaddr/ipv6/j0;->n:Linet/ipaddr/o;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Linet/ipaddr/o;->E(Z)Linet/ipaddr/o$a;

    move-result-object p1

    invoke-static {v0, p1}, Linet/ipaddr/ipv6/j0$a;->o(Linet/ipaddr/ipv6/j0$a;Linet/ipaddr/o$a;)Linet/ipaddr/o$a;

    :cond_0
    invoke-virtual {p0, v0}, Linet/ipaddr/o$b;->l(Linet/ipaddr/o$b$a;)Linet/ipaddr/o$b$a;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/j0$a;

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/j0;->n()Linet/ipaddr/ipv6/j0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Linet/ipaddr/ipv6/j0;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/j0;->p(Linet/ipaddr/ipv6/j0;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Linet/ipaddr/ipv6/j0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Linet/ipaddr/o$b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Linet/ipaddr/ipv6/j0;

    iget-object v0, p0, Linet/ipaddr/ipv6/j0;->n:Linet/ipaddr/o;

    invoke-virtual {v0}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v0

    iget-object v2, p1, Linet/ipaddr/ipv6/j0;->n:Linet/ipaddr/o;

    invoke-virtual {v2}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv6/j0;->i:Z

    iget-boolean v2, p1, Linet/ipaddr/ipv6/j0;->i:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv6/j0;->j:Z

    iget-boolean v2, p1, Linet/ipaddr/ipv6/j0;->j:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv6/j0;->k:Z

    iget-boolean v2, p1, Linet/ipaddr/ipv6/j0;->k:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv6/j0;->l:Z

    iget-boolean p1, p1, Linet/ipaddr/ipv6/j0;->l:Z

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Linet/ipaddr/o$b;->hashCode()I

    move-result v0

    iget-object v1, p0, Linet/ipaddr/ipv6/j0;->n:Linet/ipaddr/o;

    invoke-virtual {v1}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv4/Z;->hashCode()I

    move-result v1

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v0, v1

    iget-boolean v1, p0, Linet/ipaddr/ipv6/j0;->i:Z

    if-eqz v1, :cond_0

    const v1, 0x8000

    or-int/2addr v0, v1

    :cond_0
    iget-boolean v1, p0, Linet/ipaddr/ipv6/j0;->j:Z

    if-eqz v1, :cond_1

    const/high16 v1, 0x10000

    or-int/2addr v0, v1

    :cond_1
    iget-boolean v1, p0, Linet/ipaddr/ipv6/j0;->l:Z

    if-eqz v1, :cond_2

    const/high16 v1, 0x20000

    or-int/2addr v0, v1

    :cond_2
    return v0
.end method

.method public n()Linet/ipaddr/ipv6/j0;
    .locals 2

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/j0;

    iget-object v1, p0, Linet/ipaddr/ipv6/j0;->n:Linet/ipaddr/o;

    invoke-virtual {v1}, Linet/ipaddr/o;->l()Linet/ipaddr/o;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/ipv6/j0;->n:Linet/ipaddr/o;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public p(Linet/ipaddr/ipv6/j0;)I
    .locals 2

    invoke-super {p0, p1}, Linet/ipaddr/o$b;->h(Linet/ipaddr/o$b;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv6/j0;->n:Linet/ipaddr/o;

    invoke-virtual {v0}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v0

    iget-object v1, p1, Linet/ipaddr/ipv6/j0;->n:Linet/ipaddr/o;

    invoke-virtual {v1}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv4/Z;->p(Linet/ipaddr/ipv4/Z;)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv6/j0;->i:Z

    iget-boolean v1, p1, Linet/ipaddr/ipv6/j0;->i:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv6/j0;->j:Z

    iget-boolean v1, p1, Linet/ipaddr/ipv6/j0;->j:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv6/j0;->k:Z

    iget-boolean v1, p1, Linet/ipaddr/ipv6/j0;->k:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv6/j0;->l:Z

    iget-boolean p1, p1, Linet/ipaddr/ipv6/j0;->l:Z

    invoke-static {v0, p1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    :cond_0
    return v0
.end method

.method public r()Linet/ipaddr/o;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/j0;->n:Linet/ipaddr/o;

    return-object v0
.end method

.method public t()Linet/ipaddr/ipv6/e;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/j0;->m:Linet/ipaddr/ipv6/e;

    if-nez v0, :cond_0

    invoke-static {}, Linet/ipaddr/a;->s()Linet/ipaddr/ipv6/e;

    move-result-object v0

    :cond_0
    return-object v0
.end method
