.class public final Lnc4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lob4;


# instance fields
.field public f:Z

.field public g:J

.field public h:J

.field public i:Lsr1;


# virtual methods
.method public final a(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lnc4;->g:J

    .line 2
    .line 3
    iget-boolean p1, p0, Lnc4;->f:Z

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    iput-wide p1, p0, Lnc4;->h:J

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final b(Lsr1;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lnc4;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lnc4;->e()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, v0, v1}, Lnc4;->a(J)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-object p1, p0, Lnc4;->i:Lsr1;

    .line 13
    .line 14
    return-void
.end method

.method public final e()J
    .locals 7

    .line 1
    iget-wide v0, p0, Lnc4;->g:J

    .line 2
    .line 3
    iget-boolean v2, p0, Lnc4;->f:Z

    .line 4
    .line 5
    if-eqz v2, :cond_1

    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    iget-wide v4, p0, Lnc4;->h:J

    .line 12
    .line 13
    sub-long/2addr v2, v4

    .line 14
    iget-object v4, p0, Lnc4;->i:Lsr1;

    .line 15
    .line 16
    iget v5, v4, Lsr1;->a:F

    .line 17
    .line 18
    const/high16 v6, 0x3f800000    # 1.0f

    .line 19
    .line 20
    cmpl-float v5, v5, v6

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    invoke-static {v2, v3}, Lv23;->r(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    :goto_0
    add-long/2addr v2, v0

    .line 29
    return-wide v2

    .line 30
    :cond_0
    iget v4, v4, Lsr1;->c:I

    .line 31
    .line 32
    int-to-long v4, v4

    .line 33
    mul-long/2addr v2, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-wide v0
.end method

.method public final g()Lsr1;
    .locals 1

    .line 1
    iget-object v0, p0, Lnc4;->i:Lsr1;

    .line 2
    .line 3
    return-object v0
.end method
