.class public final Ldh4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljh4;
.implements Lih4;


# instance fields
.field public final f:Lkh4;

.field public final g:J

.field public final h:Lrj4;

.field public i:Lpg4;

.field public j:Ljh4;

.field public k:Lih4;

.field public l:J


# direct methods
.method public constructor <init>(Lkh4;Lrj4;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldh4;->f:Lkh4;

    .line 5
    .line 6
    iput-object p2, p0, Ldh4;->h:Lrj4;

    .line 7
    .line 8
    iput-wide p3, p0, Ldh4;->g:J

    .line 9
    .line 10
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, Ldh4;->l:J

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Lih4;J)V
    .locals 2

    .line 1
    iput-object p1, p0, Ldh4;->k:Lih4;

    .line 2
    .line 3
    iget-object p1, p0, Ldh4;->j:Ljh4;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-wide p2, p0, Ldh4;->l:J

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, p2, v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-wide p2, p0, Ldh4;->g:J

    .line 20
    .line 21
    :goto_0
    invoke-interface {p1, p0, p2, p3}, Ljh4;->a(Lih4;J)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final b(Lnb4;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldh4;->j:Ljh4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lmi4;->b(Lnb4;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public final bridge synthetic c(Lmi4;)V
    .locals 1

    .line 1
    check-cast p1, Ljh4;

    .line 2
    .line 3
    iget-object p1, p0, Ldh4;->k:Lih4;

    .line 4
    .line 5
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {p1, p0}, Lih4;->c(Lmi4;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final d(J)J
    .locals 2

    .line 1
    iget-object v0, p0, Ldh4;->j:Ljh4;

    .line 2
    .line 3
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Ljh4;->d(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    return-wide p1
.end method

.method public final e(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldh4;->j:Ljh4;

    .line 2
    .line 3
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Ljh4;->e(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-object v0, p0, Ldh4;->j:Ljh4;

    .line 2
    .line 3
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0}, Ljh4;->f()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final g(Ljh4;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ldh4;->k:Lih4;

    .line 2
    .line 3
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lih4;->g(Ljh4;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final h(JLlc4;)J
    .locals 2

    .line 1
    iget-object v0, p0, Ldh4;->j:Ljh4;

    .line 2
    .line 3
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Ljh4;->h(JLlc4;)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    return-wide p1
.end method

.method public final i()J
    .locals 2

    .line 1
    iget-object v0, p0, Ldh4;->j:Ljh4;

    .line 2
    .line 3
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0}, Lmi4;->i()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final j()J
    .locals 2

    .line 1
    iget-object v0, p0, Ldh4;->j:Ljh4;

    .line 2
    .line 3
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0}, Lmi4;->j()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final k(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldh4;->j:Ljh4;

    .line 2
    .line 3
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lmi4;->k(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final l()Lri4;
    .locals 2

    .line 1
    iget-object v0, p0, Ldh4;->j:Ljh4;

    .line 2
    .line 3
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0}, Ljh4;->l()Lri4;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final m([Lnj4;[Z[Lli4;[ZJ)J
    .locals 12

    .line 1
    iget-wide v0, p0, Ldh4;->l:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    iget-wide v4, p0, Ldh4;->g:J

    .line 13
    .line 14
    cmp-long v4, p5, v4

    .line 15
    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    move-wide v10, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-wide/from16 v10, p5

    .line 21
    .line 22
    :goto_0
    iput-wide v2, p0, Ldh4;->l:J

    .line 23
    .line 24
    iget-object v5, p0, Ldh4;->j:Ljh4;

    .line 25
    .line 26
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 27
    .line 28
    move-object v6, p1

    .line 29
    move-object v7, p2

    .line 30
    move-object v8, p3

    .line 31
    move-object/from16 v9, p4

    .line 32
    .line 33
    invoke-interface/range {v5 .. v11}, Ljh4;->m([Lnj4;[Z[Lli4;[ZJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    return-wide p1
.end method

.method public final n(Lkh4;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Ldh4;->l:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-wide v0, p0, Ldh4;->g:J

    .line 14
    .line 15
    :goto_0
    iget-object v2, p0, Ldh4;->i:Lpg4;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, Ldh4;->h:Lrj4;

    .line 21
    .line 22
    invoke-virtual {v2, p1, v3, v0, v1}, Lpg4;->c(Lkh4;Lrj4;J)Ljh4;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Ldh4;->j:Ljh4;

    .line 27
    .line 28
    iget-object v2, p0, Ldh4;->k:Lih4;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {p1, p0, v0, v1}, Ljh4;->a(Lih4;J)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldh4;->j:Ljh4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lmi4;->o()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final r()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldh4;->j:Ljh4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljh4;->r()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Ldh4;->i:Lpg4;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Lpg4;->r()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method
