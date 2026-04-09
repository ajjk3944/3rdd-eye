.class public Linet/ipaddr/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/f$a;
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Linet/ipaddr/o;


# direct methods
.method public constructor <init>(Linet/ipaddr/o;ZZZZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Linet/ipaddr/f;->a:Z

    iput-boolean p3, p0, Linet/ipaddr/f;->b:Z

    iput-boolean p4, p0, Linet/ipaddr/f;->d:Z

    iput-boolean p5, p0, Linet/ipaddr/f;->c:Z

    iput-boolean p6, p0, Linet/ipaddr/f;->e:Z

    iput-boolean p7, p0, Linet/ipaddr/f;->f:Z

    iput-boolean p8, p0, Linet/ipaddr/f;->g:Z

    iput-boolean p9, p0, Linet/ipaddr/f;->i:Z

    iput-boolean p10, p0, Linet/ipaddr/f;->h:Z

    iput-object p1, p0, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    return-void
.end method


# virtual methods
.method public c()Linet/ipaddr/f;
    .locals 1

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/f;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/f;->c()Linet/ipaddr/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Linet/ipaddr/f;

    invoke-virtual {p0, p1}, Linet/ipaddr/f;->d(Linet/ipaddr/f;)I

    move-result p1

    return p1
.end method

.method public d(Linet/ipaddr/f;)I
    .locals 2

    iget-boolean v0, p0, Linet/ipaddr/f;->a:Z

    iget-boolean v1, p1, Linet/ipaddr/f;->a:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->d:Z

    iget-boolean v1, p1, Linet/ipaddr/f;->d:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->c:Z

    iget-boolean v1, p1, Linet/ipaddr/f;->c:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->e:Z

    iget-boolean v1, p1, Linet/ipaddr/f;->e:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->f:Z

    iget-boolean v1, p1, Linet/ipaddr/f;->f:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->g:Z

    iget-boolean v1, p1, Linet/ipaddr/f;->g:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->i:Z

    iget-boolean v1, p1, Linet/ipaddr/f;->i:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->h:Z

    iget-boolean v1, p1, Linet/ipaddr/f;->h:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    iget-object p1, p1, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    invoke-virtual {v0, p1}, Linet/ipaddr/o;->n(Linet/ipaddr/o;)I

    move-result v0

    :cond_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Linet/ipaddr/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Linet/ipaddr/f;

    iget-boolean v0, p0, Linet/ipaddr/f;->a:Z

    iget-boolean v2, p1, Linet/ipaddr/f;->a:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->d:Z

    iget-boolean v2, p1, Linet/ipaddr/f;->d:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->c:Z

    iget-boolean v2, p1, Linet/ipaddr/f;->c:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->e:Z

    iget-boolean v2, p1, Linet/ipaddr/f;->e:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->f:Z

    iget-boolean v2, p1, Linet/ipaddr/f;->f:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->g:Z

    iget-boolean v2, p1, Linet/ipaddr/f;->g:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->i:Z

    iget-boolean v2, p1, Linet/ipaddr/f;->i:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/f;->h:Z

    iget-boolean v2, p1, Linet/ipaddr/f;->h:Z

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    iget-object p1, p1, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    invoke-virtual {v0, p1}, Linet/ipaddr/o;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public h()Linet/ipaddr/o$a;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    invoke-virtual {v0}, Linet/ipaddr/o;->B()Linet/ipaddr/o$a;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Linet/ipaddr/f;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    invoke-virtual {v0}, Linet/ipaddr/o;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-boolean v1, p0, Linet/ipaddr/f;->a:Z

    if-eqz v1, :cond_1

    const/high16 v1, 0x20000000

    or-int/2addr v0, v1

    :cond_1
    iget-boolean v1, p0, Linet/ipaddr/f;->f:Z

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Linet/ipaddr/f;->d:Z

    if-nez v1, :cond_2

    iget-boolean v1, p0, Linet/ipaddr/f;->c:Z

    if-eqz v1, :cond_3

    :cond_2
    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    :cond_3
    iget-boolean v1, p0, Linet/ipaddr/f;->g:Z

    if-nez v1, :cond_4

    iget-boolean v1, p0, Linet/ipaddr/f;->h:Z

    if-nez v1, :cond_4

    iget-boolean v1, p0, Linet/ipaddr/f;->i:Z

    if-eqz v1, :cond_5

    :cond_4
    const/high16 v1, 0x40000000    # 2.0f

    or-int/2addr v0, v1

    :cond_5
    return v0
.end method

.method public l()Linet/ipaddr/f$a;
    .locals 2

    new-instance v0, Linet/ipaddr/f$a;

    invoke-direct {v0}, Linet/ipaddr/f$a;-><init>()V

    iget-boolean v1, p0, Linet/ipaddr/f;->a:Z

    invoke-static {v0, v1}, Linet/ipaddr/f$a;->a(Linet/ipaddr/f$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/f;->b:Z

    invoke-static {v0, v1}, Linet/ipaddr/f$a;->b(Linet/ipaddr/f$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/f;->c:Z

    invoke-static {v0, v1}, Linet/ipaddr/f$a;->c(Linet/ipaddr/f$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/f;->d:Z

    invoke-static {v0, v1}, Linet/ipaddr/f$a;->d(Linet/ipaddr/f$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/f;->e:Z

    invoke-static {v0, v1}, Linet/ipaddr/f$a;->e(Linet/ipaddr/f$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/f;->f:Z

    invoke-static {v0, v1}, Linet/ipaddr/f$a;->f(Linet/ipaddr/f$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/f;->g:Z

    invoke-static {v0, v1}, Linet/ipaddr/f$a;->g(Linet/ipaddr/f$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/f;->h:Z

    invoke-static {v0, v1}, Linet/ipaddr/f$a;->h(Linet/ipaddr/f$a;Z)Z

    invoke-virtual {p0}, Linet/ipaddr/f;->h()Linet/ipaddr/o$a;

    move-result-object v1

    invoke-static {v0, v1}, Linet/ipaddr/f$a;->i(Linet/ipaddr/f$a;Linet/ipaddr/o$a;)Linet/ipaddr/o$a;

    return-object v0
.end method
