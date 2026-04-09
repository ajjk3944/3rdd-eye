.class public Linet/ipaddr/o;
.super Linet/ipaddr/d;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/o$b;,
        Linet/ipaddr/o$a;
    }
.end annotation


# instance fields
.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field private j:Linet/ipaddr/ipv6/j0;

.field private k:Linet/ipaddr/ipv4/Z;


# direct methods
.method public constructor <init>(ZZZZZZZZZLinet/ipaddr/ipv4/Z;Linet/ipaddr/ipv6/j0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Linet/ipaddr/d;-><init>(ZZZ)V

    iput-boolean p7, p0, Linet/ipaddr/o;->d:Z

    iput-boolean p4, p0, Linet/ipaddr/o;->e:Z

    iput-boolean p5, p0, Linet/ipaddr/o;->f:Z

    iput-boolean p6, p0, Linet/ipaddr/o;->g:Z

    iput-boolean p8, p0, Linet/ipaddr/o;->i:Z

    iput-boolean p9, p0, Linet/ipaddr/o;->h:Z

    iput-object p11, p0, Linet/ipaddr/o;->j:Linet/ipaddr/ipv6/j0;

    iput-object p10, p0, Linet/ipaddr/o;->k:Linet/ipaddr/ipv4/Z;

    return-void
.end method


# virtual methods
.method public B()Linet/ipaddr/o$a;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Linet/ipaddr/o;->E(Z)Linet/ipaddr/o$a;

    move-result-object v0

    return-object v0
.end method

.method public E(Z)Linet/ipaddr/o$a;
    .locals 2

    new-instance v0, Linet/ipaddr/o$a;

    invoke-direct {v0}, Linet/ipaddr/o$a;-><init>()V

    invoke-super {p0, v0}, Linet/ipaddr/d;->h(Linet/ipaddr/d$b;)Linet/ipaddr/d$b;

    iget-boolean v1, p0, Linet/ipaddr/o;->d:Z

    invoke-static {v0, v1}, Linet/ipaddr/o$a;->d(Linet/ipaddr/o$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/o;->e:Z

    invoke-static {v0, v1}, Linet/ipaddr/o$a;->e(Linet/ipaddr/o$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/o;->f:Z

    invoke-static {v0, v1}, Linet/ipaddr/o$a;->f(Linet/ipaddr/o$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/o;->g:Z

    invoke-static {v0, v1}, Linet/ipaddr/o$a;->g(Linet/ipaddr/o$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/o;->h:Z

    invoke-static {v0, v1}, Linet/ipaddr/o$a;->h(Linet/ipaddr/o$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/o;->i:Z

    invoke-static {v0, v1}, Linet/ipaddr/o$a;->i(Linet/ipaddr/o$a;Z)Z

    iget-object v1, p0, Linet/ipaddr/o;->k:Linet/ipaddr/ipv4/Z;

    invoke-virtual {v1}, Linet/ipaddr/ipv4/Z;->t()Linet/ipaddr/ipv4/Z$a;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/o$a;->j:Linet/ipaddr/ipv4/Z$a;

    iget-object v1, p0, Linet/ipaddr/o;->j:Linet/ipaddr/ipv6/j0;

    invoke-virtual {v1, p1}, Linet/ipaddr/ipv6/j0;->B(Z)Linet/ipaddr/ipv6/j0$a;

    move-result-object p1

    iput-object p1, v0, Linet/ipaddr/o$a;->k:Linet/ipaddr/ipv6/j0$a;

    iget-boolean p1, p0, Linet/ipaddr/d;->c:Z

    iput-boolean p1, v0, Linet/ipaddr/d$b;->c:Z

    iget-boolean p1, p0, Linet/ipaddr/d;->a:Z

    iput-boolean p1, v0, Linet/ipaddr/d$b;->a:Z

    iget-boolean p1, p0, Linet/ipaddr/d;->b:Z

    iput-boolean p1, v0, Linet/ipaddr/d$b;->b:Z

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/o;->l()Linet/ipaddr/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Linet/ipaddr/o;

    invoke-virtual {p0, p1}, Linet/ipaddr/o;->n(Linet/ipaddr/o;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Linet/ipaddr/o;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Linet/ipaddr/o;

    invoke-super {p0, p1}, Linet/ipaddr/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Linet/ipaddr/o;->k:Linet/ipaddr/ipv4/Z;

    iget-object v2, v0, Linet/ipaddr/o;->k:Linet/ipaddr/ipv4/Z;

    invoke-virtual {p1, v2}, Linet/ipaddr/ipv4/Z;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Linet/ipaddr/o;->j:Linet/ipaddr/ipv6/j0;

    iget-object v2, v0, Linet/ipaddr/o;->j:Linet/ipaddr/ipv6/j0;

    invoke-virtual {p1, v2}, Linet/ipaddr/ipv6/j0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Linet/ipaddr/o;->e:Z

    iget-boolean v2, v0, Linet/ipaddr/o;->e:Z

    if-ne p1, v2, :cond_0

    iget-boolean p1, p0, Linet/ipaddr/o;->f:Z

    iget-boolean v2, v0, Linet/ipaddr/o;->f:Z

    if-ne p1, v2, :cond_0

    iget-boolean p1, p0, Linet/ipaddr/o;->d:Z

    iget-boolean v2, v0, Linet/ipaddr/o;->d:Z

    if-ne p1, v2, :cond_0

    iget-boolean p1, p0, Linet/ipaddr/o;->g:Z

    iget-boolean v2, v0, Linet/ipaddr/o;->g:Z

    if-ne p1, v2, :cond_0

    iget-boolean p1, p0, Linet/ipaddr/o;->h:Z

    iget-boolean v2, v0, Linet/ipaddr/o;->h:Z

    if-ne p1, v2, :cond_0

    iget-boolean p1, p0, Linet/ipaddr/o;->i:Z

    iget-boolean v0, v0, Linet/ipaddr/o;->i:Z

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Linet/ipaddr/o;->k:Linet/ipaddr/ipv4/Z;

    invoke-virtual {v0}, Linet/ipaddr/ipv4/Z;->hashCode()I

    move-result v0

    iget-object v1, p0, Linet/ipaddr/o;->j:Linet/ipaddr/ipv6/j0;

    invoke-virtual {v1}, Linet/ipaddr/ipv6/j0;->hashCode()I

    move-result v1

    shl-int/lit8 v1, v1, 0x9

    or-int/2addr v0, v1

    iget-boolean v1, p0, Linet/ipaddr/o;->e:Z

    if-eqz v1, :cond_0

    const/high16 v1, 0x8000000

    or-int/2addr v0, v1

    :cond_0
    iget-boolean v1, p0, Linet/ipaddr/o;->f:Z

    if-eqz v1, :cond_1

    const/high16 v1, 0x10000000

    or-int/2addr v0, v1

    :cond_1
    iget-boolean v1, p0, Linet/ipaddr/o;->g:Z

    if-eqz v1, :cond_2

    const/high16 v1, 0x20000000

    or-int/2addr v0, v1

    :cond_2
    iget-boolean v1, p0, Linet/ipaddr/d;->a:Z

    if-eqz v1, :cond_3

    const/high16 v1, 0x40000000    # 2.0f

    or-int/2addr v0, v1

    :cond_3
    iget-boolean v1, p0, Linet/ipaddr/d;->c:Z

    if-eqz v1, :cond_4

    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    :cond_4
    return v0
.end method

.method public l()Linet/ipaddr/o;
    .locals 2

    invoke-super {p0}, Linet/ipaddr/d;->c()Linet/ipaddr/d;

    move-result-object v0

    check-cast v0, Linet/ipaddr/o;

    iget-object v1, p0, Linet/ipaddr/o;->k:Linet/ipaddr/ipv4/Z;

    invoke-virtual {v1}, Linet/ipaddr/ipv4/Z;->n()Linet/ipaddr/ipv4/Z;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/o;->k:Linet/ipaddr/ipv4/Z;

    iget-object v1, p0, Linet/ipaddr/o;->j:Linet/ipaddr/ipv6/j0;

    invoke-virtual {v1}, Linet/ipaddr/ipv6/j0;->n()Linet/ipaddr/ipv6/j0;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/o;->j:Linet/ipaddr/ipv6/j0;

    return-object v0
.end method

.method public n(Linet/ipaddr/o;)I
    .locals 2

    invoke-super {p0, p1}, Linet/ipaddr/d;->d(Linet/ipaddr/d;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/o;->k:Linet/ipaddr/ipv4/Z;

    iget-object v1, p1, Linet/ipaddr/o;->k:Linet/ipaddr/ipv4/Z;

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv4/Z;->p(Linet/ipaddr/ipv4/Z;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/o;->j:Linet/ipaddr/ipv6/j0;

    iget-object v1, p1, Linet/ipaddr/o;->j:Linet/ipaddr/ipv6/j0;

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv6/j0;->p(Linet/ipaddr/ipv6/j0;)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/o;->e:Z

    iget-boolean v1, p1, Linet/ipaddr/o;->e:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/o;->f:Z

    iget-boolean v1, p1, Linet/ipaddr/o;->f:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/o;->d:Z

    iget-boolean v1, p1, Linet/ipaddr/o;->d:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/o;->g:Z

    iget-boolean v1, p1, Linet/ipaddr/o;->g:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/o;->h:Z

    iget-boolean v1, p1, Linet/ipaddr/o;->h:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/o;->i:Z

    iget-boolean p1, p1, Linet/ipaddr/o;->i:Z

    invoke-static {v0, p1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    :cond_0
    return v0
.end method

.method public p()Linet/ipaddr/ipv4/Z;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/o;->k:Linet/ipaddr/ipv4/Z;

    return-object v0
.end method

.method public r()Linet/ipaddr/ipv6/j0;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/o;->j:Linet/ipaddr/ipv6/j0;

    return-object v0
.end method

.method public t()Linet/ipaddr/g$a;
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/o;->h:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/o;->i:Z

    if-nez v0, :cond_1

    sget-object v0, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    return-object v0

    :cond_0
    iget-boolean v0, p0, Linet/ipaddr/o;->i:Z

    if-eqz v0, :cond_1

    sget-object v0, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
