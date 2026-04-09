.class public abstract Lbg/e;
.super Lbg/b;
.source "SourceFile"

# interfaces
.implements Lag/l;


# instance fields
.field private final p:Ljava/lang/Integer;

.field protected transient q:Ljava/lang/String;

.field private transient r:Ljava/lang/Boolean;


# direct methods
.method protected constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lbg/e;-><init>(Ljava/lang/Integer;)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/Integer;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lbg/b;-><init>()V

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Linet/ipaddr/PrefixLenException;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {v0, p1}, Linet/ipaddr/PrefixLenException;-><init>(I)V

    throw v0

    .line 5
    :cond_1
    :goto_0
    iput-object p1, p0, Lbg/e;->p:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public B0(I)Z
    .locals 6

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v1

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v3

    move-object v0, p0

    move v5, p1

    invoke-virtual/range {v0 .. v5}, Lbg/e;->p2(JJI)Z

    move-result p1

    return p1
.end method

.method protected D1(IZLjava/lang/StringBuilder;)V
    .locals 10

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v0

    invoke-virtual {p0}, Lbg/e;->g()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p0, v2}, Lbg/e;->n2(I)J

    move-result-wide v2

    and-long v4, v0, v2

    const/4 v7, 0x0

    move v6, p1

    move v8, p2

    move-object v9, p3

    invoke-static/range {v4 .. v9}, Lag/b;->H1(JIIZLjava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public E1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lag/b;->a:Ljava/lang/String;

    if-nez v0, :cond_5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lag/b;->a:Ljava/lang/String;

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lbg/b;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Lag/l;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lag/b;->a1()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lbg/b;->U1()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lbg/e;->z1()Ljava/lang/String;

    move-result-object v0

    :cond_3
    :goto_2
    iput-object v0, p0, Lag/b;->a:Ljava/lang/String;

    :cond_4
    monitor-exit p0

    goto :goto_4

    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_5
    :goto_4
    return-object v0
.end method

.method protected Y0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbg/e;->q:Ljava/lang/String;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lbg/e;->q:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lbg/b;->T1()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbg/e;->q:Ljava/lang/String;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_2
    return-object v0
.end method

.method public g()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lbg/e;->p:Ljava/lang/Integer;

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lbg/e;->p:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l2(Z)Ljava/lang/Integer;
    .locals 5

    invoke-virtual {p0, p1}, Lbg/e;->o2(Z)I

    move-result v0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v1

    not-long v1, v1

    invoke-virtual {p0}, Lbg/b;->X1()J

    move-result-wide v3

    and-long/2addr v1, v3

    :goto_0
    ushr-long/2addr v1, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v1

    goto :goto_0

    :goto_1
    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-nez p1, :cond_1

    invoke-interface {p0}, Lag/g;->f()I

    move-result p1

    sub-int/2addr p1, v0

    invoke-static {p1}, Lbg/d;->s(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    :goto_2
    return-object p1
.end method

.method protected abstract m2(I)J
.end method

.method protected abstract n2(I)J
.end method

.method public o2(Z)I
    .locals 4

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    invoke-interface {p0}, Lag/g;->f()I

    move-result p1

    shl-long/2addr v2, p1

    or-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v0

    not-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result p1

    return p1
.end method

.method protected p2(JJI)Z
    .locals 10

    if-nez p5, :cond_1

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lbg/b;->X1()J

    move-result-wide p1

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    invoke-virtual {p0, p5}, Lbg/e;->n2(I)J

    move-result-wide v6

    invoke-virtual {p0, p5}, Lbg/e;->m2(I)J

    move-result-wide v8

    move-wide v0, p1

    move-wide v2, p3

    move-wide v4, p3

    invoke-static/range {v0 .. v9}, Lbg/b;->g2(JJJJJ)Z

    move-result p1

    return p1
.end method

.method q2(JI)Z
    .locals 6

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v3

    move-object v0, p0

    move-wide v1, p1

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Lbg/e;->r2(JJI)Z

    move-result p1

    return p1
.end method

.method protected r2(JJI)Z
    .locals 10

    if-nez p5, :cond_1

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lbg/b;->X1()J

    move-result-wide p1

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    invoke-virtual {p0, p5}, Lbg/e;->n2(I)J

    move-result-wide v6

    invoke-virtual {p0, p5}, Lbg/e;->m2(I)J

    move-result-wide v8

    move-wide v0, p1

    move-wide v2, p1

    move-wide v4, p3

    invoke-static/range {v0 .. v9}, Lbg/b;->g2(JJJJJ)Z

    move-result p1

    return p1
.end method

.method public s2(JLjava/lang/Integer;)Z
    .locals 4

    if-nez p3, :cond_0

    invoke-virtual {p0, p1, p2}, Lbg/b;->e2(J)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p0, p3}, Lbg/e;->n2(I)J

    move-result-wide v0

    and-long/2addr p1, v0

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v2

    and-long/2addr v2, v0

    cmp-long p3, p1, v2

    if-nez p3, :cond_1

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v2

    and-long/2addr v0, v2

    cmp-long p1, p1, v0

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, Lbg/e;->r:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbg/e;->g()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lbg/e;->u0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lbg/e;->r:Ljava/lang/Boolean;

    :cond_1
    iget-object v0, p0, Lbg/e;->r:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public u0(I)Z
    .locals 6

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v1

    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v3

    move-object v0, p0

    move v5, p1

    invoke-virtual/range {v0 .. v5}, Lbg/e;->r2(JJI)Z

    move-result p1

    return p1
.end method

.method public x()Z
    .locals 1

    invoke-virtual {p0}, Lbg/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbg/e;->g()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lbg/e;->B0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public y(ILdg/d;Ljava/lang/StringBuilder;)I
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lag/b;->y(ILdg/d;Ljava/lang/StringBuilder;)I

    move-result p1

    return p1
.end method

.method public z1()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lbg/e;->q:Ljava/lang/String;

    if-nez v0, :cond_6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lbg/e;->q:Ljava/lang/String;

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lbg/e;->u()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lbg/b;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Lag/l;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lag/b;->a1()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lbg/b;->a2()J

    move-result-wide v0

    invoke-virtual {p0}, Lbg/e;->x()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lbg/e;->g()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p0, v2}, Lbg/e;->n2(I)J

    move-result-wide v2

    and-long/2addr v0, v2

    :cond_2
    move-wide v4, v0

    invoke-virtual {p0}, Lbg/b;->W1()J

    move-result-wide v2

    invoke-virtual {p0}, Lag/b;->b1()I

    move-result v6

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lbg/b;->V1(JJI)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lbg/b;->T1()Ljava/lang/String;

    move-result-object v0

    :cond_4
    :goto_2
    iput-object v0, p0, Lbg/e;->q:Ljava/lang/String;

    :cond_5
    monitor-exit p0

    goto :goto_4

    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_6
    :goto_4
    return-object v0
.end method
