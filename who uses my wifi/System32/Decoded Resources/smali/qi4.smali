.class public final Lqi4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljh4;
.implements Lih4;


# instance fields
.field public final f:Ljh4;

.field public final g:J

.field public h:Lih4;


# direct methods
.method public constructor <init>(Ljh4;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqi4;->f:Ljh4;

    .line 5
    .line 6
    iput-wide p2, p0, Lqi4;->g:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lih4;J)V
    .locals 2

    .line 1
    iput-object p1, p0, Lqi4;->h:Lih4;

    .line 2
    .line 3
    iget-wide v0, p0, Lqi4;->g:J

    .line 4
    .line 5
    sub-long/2addr p2, v0

    .line 6
    iget-object p1, p0, Lqi4;->f:Ljh4;

    .line 7
    .line 8
    invoke-interface {p1, p0, p2, p3}, Ljh4;->a(Lih4;J)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(Lnb4;)Z
    .locals 5

    .line 1
    iget-wide v0, p1, Lnb4;->a:J

    .line 2
    .line 3
    new-instance v2, Lmb4;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iget v3, p1, Lnb4;->b:F

    .line 9
    .line 10
    iput v3, v2, Lmb4;->b:F

    .line 11
    .line 12
    iget-wide v3, p1, Lnb4;->c:J

    .line 13
    .line 14
    iput-wide v3, v2, Lmb4;->c:J

    .line 15
    .line 16
    iget-wide v3, p0, Lqi4;->g:J

    .line 17
    .line 18
    sub-long/2addr v0, v3

    .line 19
    iput-wide v0, v2, Lmb4;->a:J

    .line 20
    .line 21
    new-instance p1, Lnb4;

    .line 22
    .line 23
    invoke-direct {p1, v2}, Lnb4;-><init>(Lmb4;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lqi4;->f:Ljh4;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Lmi4;->b(Lnb4;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public final bridge synthetic c(Lmi4;)V
    .locals 0

    .line 1
    check-cast p1, Ljh4;

    .line 2
    .line 3
    iget-object p1, p0, Lqi4;->h:Lih4;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p0}, Lih4;->c(Lmi4;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final d(J)J
    .locals 3

    .line 1
    iget-object v0, p0, Lqi4;->f:Ljh4;

    .line 2
    .line 3
    iget-wide v1, p0, Lqi4;->g:J

    .line 4
    .line 5
    sub-long/2addr p1, v1

    .line 6
    invoke-interface {v0, p1, p2}, Ljh4;->d(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    add-long/2addr p1, v1

    .line 11
    return-wide p1
.end method

.method public final e(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lqi4;->f:Ljh4;

    .line 2
    .line 3
    iget-wide v1, p0, Lqi4;->g:J

    .line 4
    .line 5
    sub-long/2addr p1, v1

    .line 6
    invoke-interface {v0, p1, p2}, Ljh4;->e(J)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final f()J
    .locals 5

    .line 1
    iget-object v0, p0, Lqi4;->f:Ljh4;

    .line 2
    .line 3
    invoke-interface {v0}, Ljh4;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v4, v0, v2

    .line 13
    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    return-wide v2

    .line 17
    :cond_0
    iget-wide v2, p0, Lqi4;->g:J

    .line 18
    .line 19
    add-long/2addr v0, v2

    .line 20
    return-wide v0
.end method

.method public final g(Ljh4;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lqi4;->h:Lih4;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0}, Lih4;->g(Ljh4;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final h(JLlc4;)J
    .locals 3

    .line 1
    iget-object v0, p0, Lqi4;->f:Ljh4;

    .line 2
    .line 3
    iget-wide v1, p0, Lqi4;->g:J

    .line 4
    .line 5
    sub-long/2addr p1, v1

    .line 6
    invoke-interface {v0, p1, p2, p3}, Ljh4;->h(JLlc4;)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    add-long/2addr p1, v1

    .line 11
    return-wide p1
.end method

.method public final i()J
    .locals 5

    .line 1
    iget-object v0, p0, Lqi4;->f:Ljh4;

    .line 2
    .line 3
    invoke-interface {v0}, Lmi4;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    return-wide v2

    .line 14
    :cond_0
    iget-wide v2, p0, Lqi4;->g:J

    .line 15
    .line 16
    add-long/2addr v0, v2

    .line 17
    return-wide v0
.end method

.method public final j()J
    .locals 5

    .line 1
    iget-object v0, p0, Lqi4;->f:Ljh4;

    .line 2
    .line 3
    invoke-interface {v0}, Lmi4;->j()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    return-wide v2

    .line 14
    :cond_0
    iget-wide v2, p0, Lqi4;->g:J

    .line 15
    .line 16
    add-long/2addr v0, v2

    .line 17
    return-wide v0
.end method

.method public final k(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lqi4;->f:Ljh4;

    .line 2
    .line 3
    iget-wide v1, p0, Lqi4;->g:J

    .line 4
    .line 5
    sub-long/2addr p1, v1

    .line 6
    invoke-interface {v0, p1, p2}, Lmi4;->k(J)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final l()Lri4;
    .locals 1

    .line 1
    iget-object v0, p0, Lqi4;->f:Ljh4;

    .line 2
    .line 3
    invoke-interface {v0}, Ljh4;->l()Lri4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final m([Lnj4;[Z[Lli4;[ZJ)J
    .locals 11

    .line 1
    array-length v0, p3

    .line 2
    new-array v4, v0, [Lli4;

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    array-length v2, p3

    .line 7
    const/4 v8, 0x0

    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    aget-object v2, p3, v1

    .line 11
    .line 12
    check-cast v2, Lpi4;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v8, v2, Lpi4;->a:Lli4;

    .line 17
    .line 18
    :cond_0
    aput-object v8, v4, v1

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-wide v9, p0, Lqi4;->g:J

    .line 24
    .line 25
    sub-long v6, p5, v9

    .line 26
    .line 27
    iget-object v1, p0, Lqi4;->f:Ljh4;

    .line 28
    .line 29
    move-object v2, p1

    .line 30
    move-object v3, p2

    .line 31
    move-object v5, p4

    .line 32
    invoke-interface/range {v1 .. v7}, Ljh4;->m([Lnj4;[Z[Lli4;[ZJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    :goto_1
    array-length v1, p3

    .line 37
    if-ge v0, v1, :cond_5

    .line 38
    .line 39
    aget-object v1, v4, v0

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    aput-object v8, p3, v0

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    aget-object v2, p3, v0

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    check-cast v2, Lpi4;

    .line 51
    .line 52
    iget-object v2, v2, Lpi4;->a:Lli4;

    .line 53
    .line 54
    if-eq v2, v1, :cond_4

    .line 55
    .line 56
    :cond_3
    new-instance v2, Lpi4;

    .line 57
    .line 58
    invoke-direct {v2, v1, v9, v10}, Lpi4;-><init>(Lli4;J)V

    .line 59
    .line 60
    .line 61
    aput-object v2, p3, v0

    .line 62
    .line 63
    :cond_4
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_5
    add-long/2addr p1, v9

    .line 67
    return-wide p1
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lqi4;->f:Ljh4;

    .line 2
    .line 3
    invoke-interface {v0}, Lmi4;->o()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final r()V
    .locals 1

    .line 1
    iget-object v0, p0, Lqi4;->f:Ljh4;

    .line 2
    .line 3
    invoke-interface {v0}, Ljh4;->r()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
