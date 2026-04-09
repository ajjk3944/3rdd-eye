.class public Linet/ipaddr/ipv4/Z;
.super Linet/ipaddr/o$b;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/ipv4/Z$a;
    }
.end annotation


# instance fields
.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field private final n:Linet/ipaddr/ipv4/e;


# direct methods
.method public constructor <init>(ZZZLinet/ipaddr/d$c;ZZZZZZZZLinet/ipaddr/ipv4/e;)V
    .locals 9

    move-object v8, p0

    move-object v0, p0

    move/from16 v1, p7

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v0 .. v7}, Linet/ipaddr/o$b;-><init>(ZZZZLinet/ipaddr/d$c;ZZ)V

    move/from16 v0, p8

    iput-boolean v0, v8, Linet/ipaddr/ipv4/Z;->i:Z

    move/from16 v0, p9

    iput-boolean v0, v8, Linet/ipaddr/ipv4/Z;->j:Z

    move/from16 v0, p10

    iput-boolean v0, v8, Linet/ipaddr/ipv4/Z;->k:Z

    move/from16 v0, p11

    iput-boolean v0, v8, Linet/ipaddr/ipv4/Z;->l:Z

    move/from16 v0, p12

    iput-boolean v0, v8, Linet/ipaddr/ipv4/Z;->m:Z

    move-object/from16 v0, p13

    iput-object v0, v8, Linet/ipaddr/ipv4/Z;->n:Linet/ipaddr/ipv4/e;

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/Z;->n()Linet/ipaddr/ipv4/Z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Linet/ipaddr/ipv4/Z;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/Z;->p(Linet/ipaddr/ipv4/Z;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Linet/ipaddr/ipv4/Z;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Linet/ipaddr/o$b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Linet/ipaddr/ipv4/Z;

    iget-boolean v0, p0, Linet/ipaddr/ipv4/Z;->i:Z

    iget-boolean v2, p1, Linet/ipaddr/ipv4/Z;->i:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv4/Z;->j:Z

    iget-boolean v2, p1, Linet/ipaddr/ipv4/Z;->j:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv4/Z;->l:Z

    iget-boolean v2, p1, Linet/ipaddr/ipv4/Z;->l:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv4/Z;->k:Z

    iget-boolean v2, p1, Linet/ipaddr/ipv4/Z;->k:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv4/Z;->m:Z

    iget-boolean p1, p1, Linet/ipaddr/ipv4/Z;->m:Z

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Linet/ipaddr/o$b;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Linet/ipaddr/ipv4/Z;->i:Z

    if-eqz v1, :cond_0

    or-int/lit8 v0, v0, 0x40

    :cond_0
    iget-boolean v1, p0, Linet/ipaddr/ipv4/Z;->j:Z

    if-eqz v1, :cond_1

    or-int/lit16 v0, v0, 0x80

    :cond_1
    iget-boolean v1, p0, Linet/ipaddr/ipv4/Z;->l:Z

    if-eqz v1, :cond_2

    or-int/lit16 v0, v0, 0x100

    :cond_2
    return v0
.end method

.method public n()Linet/ipaddr/ipv4/Z;
    .locals 1

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/Z;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public p(Linet/ipaddr/ipv4/Z;)I
    .locals 2

    invoke-super {p0, p1}, Linet/ipaddr/o$b;->h(Linet/ipaddr/o$b;)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv4/Z;->i:Z

    iget-boolean v1, p1, Linet/ipaddr/ipv4/Z;->i:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv4/Z;->j:Z

    iget-boolean v1, p1, Linet/ipaddr/ipv4/Z;->j:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv4/Z;->l:Z

    iget-boolean v1, p1, Linet/ipaddr/ipv4/Z;->l:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv4/Z;->k:Z

    iget-boolean v1, p1, Linet/ipaddr/ipv4/Z;->k:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/ipv4/Z;->m:Z

    iget-boolean p1, p1, Linet/ipaddr/ipv4/Z;->m:Z

    invoke-static {v0, p1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    :cond_0
    return v0
.end method

.method public r()Linet/ipaddr/ipv4/e;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv4/Z;->n:Linet/ipaddr/ipv4/e;

    if-nez v0, :cond_0

    invoke-static {}, Linet/ipaddr/a;->j()Linet/ipaddr/ipv4/e;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public t()Linet/ipaddr/ipv4/Z$a;
    .locals 2

    new-instance v0, Linet/ipaddr/ipv4/Z$a;

    invoke-direct {v0}, Linet/ipaddr/ipv4/Z$a;-><init>()V

    iget-boolean v1, p0, Linet/ipaddr/ipv4/Z;->i:Z

    invoke-static {v0, v1}, Linet/ipaddr/ipv4/Z$a;->j(Linet/ipaddr/ipv4/Z$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/ipv4/Z;->j:Z

    invoke-static {v0, v1}, Linet/ipaddr/ipv4/Z$a;->k(Linet/ipaddr/ipv4/Z$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/ipv4/Z;->l:Z

    invoke-static {v0, v1}, Linet/ipaddr/ipv4/Z$a;->l(Linet/ipaddr/ipv4/Z$a;Z)Z

    iget-boolean v1, p0, Linet/ipaddr/ipv4/Z;->m:Z

    invoke-static {v0, v1}, Linet/ipaddr/ipv4/Z$a;->m(Linet/ipaddr/ipv4/Z$a;Z)Z

    iget-object v1, p0, Linet/ipaddr/ipv4/Z;->n:Linet/ipaddr/ipv4/e;

    invoke-static {v0, v1}, Linet/ipaddr/ipv4/Z$a;->n(Linet/ipaddr/ipv4/Z$a;Linet/ipaddr/ipv4/e;)Linet/ipaddr/ipv4/e;

    invoke-virtual {p0, v0}, Linet/ipaddr/o$b;->l(Linet/ipaddr/o$b$a;)Linet/ipaddr/o$b$a;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/Z$a;

    return-object v0
.end method
