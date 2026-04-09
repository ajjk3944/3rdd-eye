.class public final Lt71;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:Z

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public static l(Lkg4;)Z
    .locals 0

    .line 1
    iget p0, p0, Lkg4;->m:I

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static final n(Lkg4;)V
    .locals 3

    .line 1
    iget v0, p0, Lkg4;->m:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 13
    .line 14
    .line 15
    iput v2, p0, Lkg4;->m:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lkg4;->h()V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method


# virtual methods
.method public A(Lpb4;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lt71;->h(Lpb4;Lkg4;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lkg4;

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0}, Lt71;->h(Lpb4;Lkg4;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public B(JJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    invoke-static {v0}, Lt71;->l(Lkg4;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3, p4}, Lkg4;->s(JJ)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lkg4;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget v1, v0, Lkg4;->m:I

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2, p3, p4}, Lkg4;->s(JJ)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public C(Lpb4;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lt71;->m(Lpb4;)Lkg4;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lkg4;->n0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Lkg4;->t()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lkg4;->u()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public D()V
    .locals 7

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    iget v1, v0, Lkg4;->m:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-ne v1, v4, :cond_2

    .line 11
    .line 12
    iget v5, p0, Lt71;->b:I

    .line 13
    .line 14
    const/4 v6, 0x4

    .line 15
    if-ne v5, v6, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-ne v1, v4, :cond_1

    .line 19
    .line 20
    move v3, v4

    .line 21
    :cond_1
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 22
    .line 23
    .line 24
    iput v2, v0, Lkg4;->m:I

    .line 25
    .line 26
    invoke-virtual {v0}, Lkg4;->d()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    :goto_0
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lkg4;

    .line 33
    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    iget v1, v0, Lkg4;->m:I

    .line 37
    .line 38
    if-ne v1, v4, :cond_4

    .line 39
    .line 40
    iget v5, p0, Lt71;->b:I

    .line 41
    .line 42
    const/4 v6, 0x3

    .line 43
    if-eq v5, v6, :cond_4

    .line 44
    .line 45
    if-ne v1, v4, :cond_3

    .line 46
    .line 47
    move v3, v4

    .line 48
    :cond_3
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 49
    .line 50
    .line 51
    iput v2, v0, Lkg4;->m:I

    .line 52
    .line 53
    invoke-virtual {v0}, Lkg4;->d()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-void
.end method

.method public a()V
    .locals 7

    .line 1
    iget v0, p0, Lt71;->b:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x4

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    if-ne v0, v3, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x2

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iput v2, p0, Lt71;->b:I

    .line 15
    .line 16
    :cond_1
    return-void

    .line 17
    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 18
    if-ne v0, v3, :cond_3

    .line 19
    .line 20
    move v0, v1

    .line 21
    goto :goto_1

    .line 22
    :cond_3
    move v0, v2

    .line 23
    :goto_1
    iget-object v4, p0, Lt71;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Lkg4;

    .line 26
    .line 27
    iget-object v5, p0, Lt71;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v5, Lkg4;

    .line 30
    .line 31
    const/16 v6, 0x11

    .line 32
    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-interface {v5, v6, v4}, Lfc4;->a(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-interface {v4, v6, v5}, Lfc4;->a(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :goto_2
    iget v0, p0, Lt71;->b:I

    .line 49
    .line 50
    if-ne v0, v3, :cond_5

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_5
    move v2, v1

    .line 54
    :goto_3
    iput v2, p0, Lt71;->b:I

    .line 55
    .line 56
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    invoke-static {v0}, Lt71;->l(Lkg4;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, Lt71;->j(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lkg4;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget v0, v0, Lkg4;->m:I

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p0, v0}, Lt71;->j(Z)V

    .line 28
    .line 29
    .line 30
    :cond_2
    :goto_0
    return-void
.end method

.method public c(Lpb4;Lpj4;Lg53;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1, p2, p3}, Lt71;->k(Lkg4;Lpb4;Lpj4;Lg53;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lt71;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lkg4;

    .line 12
    .line 13
    invoke-virtual {p0, v1, p1, p2, p3}, Lt71;->k(Lkg4;Lpb4;Lpj4;Lg53;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 p2, 0x1

    .line 18
    if-ne v0, p2, :cond_0

    .line 19
    .line 20
    return p1

    .line 21
    :cond_0
    return v0
.end method

.method public d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    iget v1, v0, Lkg4;->m:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    move v1, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v1, v3

    .line 14
    :goto_0
    invoke-static {v1}, Lzt0;->b0(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lkg4;->k()V

    .line 18
    .line 19
    .line 20
    iput-boolean v3, p0, Lt71;->c:Z

    .line 21
    .line 22
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lkg4;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget v1, v0, Lkg4;->m:I

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v2, v3

    .line 34
    :goto_1
    invoke-static {v2}, Lzt0;->b0(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lkg4;->k()V

    .line 38
    .line 39
    .line 40
    iput-boolean v3, p0, Lt71;->d:Z

    .line 41
    .line 42
    :cond_2
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    iget v1, v0, Lkg4;->g:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget v1, p0, Lt71;->b:I

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eq v1, v2, :cond_2

    .line 16
    .line 17
    if-ne v1, v3, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-interface {v0, v3, p1}, Lfc4;->a(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    :goto_0
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lkg4;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v3, p1}, Lfc4;->a(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public f(Lbe1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    iget v1, v0, Lkg4;->g:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x7

    .line 11
    invoke-interface {v0, v1, p1}, Lfc4;->a(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lkg4;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {v0, v1, p1}, Lfc4;->a(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public g()Z
    .locals 2

    .line 1
    iget v0, p0, Lt71;->b:I

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkg4;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget v0, v0, Lkg4;->m:I

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0

    .line 27
    :cond_2
    :goto_0
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lkg4;

    .line 30
    .line 31
    invoke-static {v0}, Lt71;->l(Lkg4;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    return v0
.end method

.method public h(Lpb4;Lkg4;)Z
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p1, Lpb4;->c:[Lli4;

    .line 5
    .line 6
    iget v1, p0, Lt71;->a:I

    .line 7
    .line 8
    aget-object v0, v0, v1

    .line 9
    .line 10
    iget-object v2, p2, Lkg4;->n:Lli4;

    .line 11
    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    if-ne v2, v0, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {p2}, Lkg4;->n0()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    :cond_1
    iget-object p1, p1, Lpb4;->m:Lpb4;

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    iget-object p1, p1, Lpb4;->c:[Lli4;

    .line 29
    .line 30
    aget-object p1, p1, v1

    .line 31
    .line 32
    iget-object p2, p2, Lkg4;->n:Lli4;

    .line 33
    .line 34
    if-ne p1, p2, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/4 p1, 0x0

    .line 38
    return p1

    .line 39
    :cond_3
    :goto_0
    const/4 p1, 0x1

    .line 40
    return p1
.end method

.method public i(Lkg4;Lg53;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lkg4;

    .line 12
    .line 13
    if-ne v0, p1, :cond_1

    .line 14
    .line 15
    :cond_0
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move v0, v1

    .line 18
    :goto_0
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lt71;->l(Lkg4;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    iget-object v0, p2, Lg53;->j:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lkg4;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    if-ne p1, v0, :cond_3

    .line 34
    .line 35
    iput-object v3, p2, Lg53;->k:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v3, p2, Lg53;->j:Ljava/lang/Object;

    .line 38
    .line 39
    iput-boolean v2, p2, Lg53;->f:Z

    .line 40
    .line 41
    :cond_3
    invoke-static {p1}, Lt71;->n(Lkg4;)V

    .line 42
    .line 43
    .line 44
    iget p2, p1, Lkg4;->m:I

    .line 45
    .line 46
    if-ne p2, v2, :cond_4

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    move v2, v1

    .line 50
    :goto_1
    invoke-static {v2}, Lzt0;->b0(Z)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p1, Lkg4;->h:Lmr2;

    .line 54
    .line 55
    iput-object v3, p2, Lmr2;->g:Ljava/lang/Object;

    .line 56
    .line 57
    iput-object v3, p2, Lmr2;->h:Ljava/lang/Object;

    .line 58
    .line 59
    iput v1, p1, Lkg4;->m:I

    .line 60
    .line 61
    iput-object v3, p1, Lkg4;->n:Lli4;

    .line 62
    .line 63
    iput-object v3, p1, Lkg4;->o:[Lph4;

    .line 64
    .line 65
    iput-boolean v1, p1, Lkg4;->s:Z

    .line 66
    .line 67
    invoke-virtual {p1}, Lkg4;->i()V

    .line 68
    .line 69
    .line 70
    iput-object v3, p1, Lkg4;->v:Lkh4;

    .line 71
    .line 72
    return-void
.end method

.method public j(Z)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iget-boolean p1, p0, Lt71;->c:Z

    .line 7
    .line 8
    if-eqz p1, :cond_3

    .line 9
    .line 10
    iget-object p1, p0, Lt71;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lkg4;

    .line 13
    .line 14
    iget v3, p1, Lkg4;->m:I

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v2

    .line 20
    :goto_0
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p1, Lkg4;->h:Lmr2;

    .line 24
    .line 25
    iput-object v1, v0, Lmr2;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v1, v0, Lmr2;->h:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {p1}, Lkg4;->j()V

    .line 30
    .line 31
    .line 32
    iput-boolean v2, p0, Lt71;->c:Z

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-boolean p1, p0, Lt71;->d:Z

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    iget-object p1, p0, Lt71;->f:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lkg4;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget v3, p1, Lkg4;->m:I

    .line 47
    .line 48
    if-nez v3, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v0, v2

    .line 52
    :goto_1
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p1, Lkg4;->h:Lmr2;

    .line 56
    .line 57
    iput-object v1, v0, Lmr2;->g:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object v1, v0, Lmr2;->h:Ljava/lang/Object;

    .line 60
    .line 61
    invoke-virtual {p1}, Lkg4;->j()V

    .line 62
    .line 63
    .line 64
    iput-boolean v2, p0, Lt71;->d:Z

    .line 65
    .line 66
    :cond_3
    return-void
.end method

.method public k(Lkg4;Lpb4;Lpj4;Lg53;)I
    .locals 12

    .line 1
    move-object v1, p2

    .line 2
    move-object v2, p3

    .line 3
    const/4 v3, 0x1

    .line 4
    if-eqz p1, :cond_a

    .line 5
    .line 6
    iget v4, p1, Lkg4;->m:I

    .line 7
    .line 8
    if-eqz v4, :cond_a

    .line 9
    .line 10
    iget-object v4, p0, Lt71;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v4, Lkg4;

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-ne p1, v4, :cond_0

    .line 16
    .line 17
    move v6, v5

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v6, v3

    .line 20
    :goto_0
    if-ne p1, v4, :cond_2

    .line 21
    .line 22
    iget v4, p0, Lt71;->b:I

    .line 23
    .line 24
    const/4 v7, 0x2

    .line 25
    if-eq v4, v7, :cond_1

    .line 26
    .line 27
    const/4 v7, 0x4

    .line 28
    if-ne v4, v7, :cond_2

    .line 29
    .line 30
    :cond_1
    return v3

    .line 31
    :cond_2
    iget-object v4, p0, Lt71;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, Lkg4;

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    if-ne p1, v4, :cond_3

    .line 37
    .line 38
    iget v4, p0, Lt71;->b:I

    .line 39
    .line 40
    if-ne v4, v8, :cond_3

    .line 41
    .line 42
    return v3

    .line 43
    :cond_3
    iget-object v4, p1, Lkg4;->n:Lli4;

    .line 44
    .line 45
    iget-object v7, v1, Lpb4;->c:[Lli4;

    .line 46
    .line 47
    iget v9, p0, Lt71;->a:I

    .line 48
    .line 49
    aget-object v10, v7, v9

    .line 50
    .line 51
    invoke-virtual {p3, v9}, Lpj4;->a(I)Z

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    if-eqz v11, :cond_4

    .line 56
    .line 57
    if-eq v4, v10, :cond_a

    .line 58
    .line 59
    :cond_4
    iget-boolean v4, p1, Lkg4;->s:Z

    .line 60
    .line 61
    if-nez v4, :cond_7

    .line 62
    .line 63
    iget-object v2, v2, Lpj4;->h:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, [Lnj4;

    .line 66
    .line 67
    aget-object v2, v2, v9

    .line 68
    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    invoke-interface {v2}, Lnj4;->b()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    goto :goto_1

    .line 76
    :cond_5
    move v3, v5

    .line 77
    :goto_1
    new-array v4, v3, [Lph4;

    .line 78
    .line 79
    :goto_2
    if-ge v5, v3, :cond_6

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-interface {v2, v5}, Lnj4;->c(I)Lph4;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    aput-object v6, v4, v5

    .line 89
    .line 90
    add-int/lit8 v5, v5, 0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    aget-object v2, v7, v9

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-object v5, v4

    .line 99
    invoke-virtual {p2}, Lpb4;->a()J

    .line 100
    .line 101
    .line 102
    move-result-wide v3

    .line 103
    move-object v7, v5

    .line 104
    iget-wide v5, v1, Lpb4;->p:J

    .line 105
    .line 106
    iget-object v1, v1, Lpb4;->g:Lqb4;

    .line 107
    .line 108
    iget-object v1, v1, Lqb4;->a:Lkh4;

    .line 109
    .line 110
    move-object v0, v7

    .line 111
    move-object v7, v1

    .line 112
    move-object v1, v0

    .line 113
    move-object v0, p1

    .line 114
    invoke-virtual/range {v0 .. v7}, Lkg4;->l0([Lph4;Lli4;JJLkh4;)V

    .line 115
    .line 116
    .line 117
    return v8

    .line 118
    :cond_7
    invoke-virtual {p1}, Lkg4;->u()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_9

    .line 123
    .line 124
    move-object/from16 v1, p4

    .line 125
    .line 126
    invoke-virtual {p0, p1, v1}, Lt71;->i(Lkg4;Lg53;)V

    .line 127
    .line 128
    .line 129
    if-eqz v11, :cond_8

    .line 130
    .line 131
    invoke-virtual {p0}, Lt71;->q()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_a

    .line 136
    .line 137
    :cond_8
    xor-int/lit8 v0, v6, 0x1

    .line 138
    .line 139
    invoke-virtual {p0, v0}, Lt71;->j(Z)V

    .line 140
    .line 141
    .line 142
    return v3

    .line 143
    :cond_9
    return v5

    .line 144
    :cond_a
    return v3
.end method

.method public m(Lpb4;)Lkg4;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    iget v1, p0, Lt71;->a:I

    .line 5
    .line 6
    iget-object p1, p1, Lpb4;->c:[Lli4;

    .line 7
    .line 8
    aget-object p1, p1, v1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v1, p0, Lt71;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lkg4;

    .line 16
    .line 17
    iget-object v2, v1, Lkg4;->n:Lli4;

    .line 18
    .line 19
    if-ne v2, p1, :cond_1

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_1
    iget-object v1, p0, Lt71;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lkg4;

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iget-object v2, v1, Lkg4;->n:Lli4;

    .line 29
    .line 30
    if-ne v2, p1, :cond_2

    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_2
    :goto_0
    return-object v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public p()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt71;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lkg4;

    .line 13
    .line 14
    invoke-static {v0}, Lt71;->l(Lkg4;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lkg4;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget v0, v0, Lkg4;->m:I

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v0, v1

    .line 36
    :goto_0
    iput v0, p0, Lt71;->b:I

    .line 37
    .line 38
    return-void
.end method

.method public q()Z
    .locals 2

    .line 1
    iget v0, p0, Lt71;->b:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x3

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public r()I
    .locals 3

    .line 1
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    iget-object v1, p0, Lt71;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lkg4;

    .line 8
    .line 9
    invoke-static {v1}, Lt71;->l(Lkg4;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget v0, v0, Lkg4;->m:I

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    :cond_0
    add-int/2addr v1, v2

    .line 22
    return v1
.end method

.method public s()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    iget v0, v0, Lkg4;->g:I

    .line 6
    .line 7
    return-void
.end method

.method public t(Lpb4;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lt71;->m(Lpb4;)Lkg4;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lkg4;->n0()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public u(Lpb4;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lt71;->m(Lpb4;)Lkg4;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p1, Lkg4;->s:Z

    .line 10
    .line 11
    return-void
.end method

.method public v(Lpj4;Lpj4;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    iget v1, p0, Lt71;->a:I

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Lpj4;->a(I)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p2, v1}, Lpj4;->a(I)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    iget-object v4, p0, Lt71;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Lkg4;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    iget v5, p0, Lt71;->b:I

    .line 22
    .line 23
    const/4 v6, 0x3

    .line 24
    if-eq v5, v6, :cond_0

    .line 25
    .line 26
    if-nez v5, :cond_1

    .line 27
    .line 28
    invoke-static {v0}, Lt71;->l(Lkg4;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    :cond_0
    move-object v4, v0

    .line 35
    :cond_1
    if-eqz v2, :cond_3

    .line 36
    .line 37
    iget-boolean v2, v4, Lkg4;->s:Z

    .line 38
    .line 39
    if-nez v2, :cond_3

    .line 40
    .line 41
    iget v0, v0, Lkg4;->g:I

    .line 42
    .line 43
    iget-object p1, p1, Lpj4;->g:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, [Ljc4;

    .line 46
    .line 47
    aget-object p1, p1, v1

    .line 48
    .line 49
    iget-object p2, p2, Lpj4;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p2, [Ljc4;

    .line 52
    .line 53
    aget-object p2, p2, v1

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-static {p2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0}, Lt71;->q()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    :cond_2
    const/4 p1, 0x1

    .line 70
    iput-boolean p1, v4, Lkg4;->s:Z

    .line 71
    .line 72
    :cond_3
    return-void
.end method

.method public w()V
    .locals 4

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    invoke-static {v0}, Lt71;->l(Lkg4;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget v1, p0, Lt71;->b:I

    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    if-eq v1, v3, :cond_0

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    if-eq v1, v3, :cond_0

    .line 19
    .line 20
    iput-boolean v2, v0, Lkg4;->s:Z

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lkg4;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget v1, v0, Lkg4;->m:I

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget v1, p0, Lt71;->b:I

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    if-eq v1, v3, :cond_1

    .line 36
    .line 37
    iput-boolean v2, v0, Lkg4;->s:Z

    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public x()V
    .locals 2

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    invoke-static {v0}, Lt71;->l(Lkg4;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lkg4;->r()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lt71;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lkg4;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget v1, v0, Lkg4;->m:I

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lkg4;->r()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public y()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lt71;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkg4;

    .line 4
    .line 5
    invoke-static {v0}, Lt71;->l(Lkg4;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lkg4;->u()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    :goto_0
    iget-object v1, p0, Lt71;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lkg4;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget v2, v1, Lkg4;->m:I

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Lkg4;->u()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    and-int/2addr v0, v1

    .line 32
    :cond_1
    return v0
.end method

.method public z(Lpb4;)Z
    .locals 5

    .line 1
    iget v0, p0, Lt71;->b:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v3

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lt71;->m(Lpb4;)Lkg4;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lt71;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lkg4;

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    move v0, v2

    .line 25
    :goto_1
    iget v1, p0, Lt71;->b:I

    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    if-ne v1, v4, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lt71;->m(Lpb4;)Lkg4;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object v1, p0, Lt71;->f:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lkg4;

    .line 37
    .line 38
    if-ne p1, v1, :cond_2

    .line 39
    .line 40
    move p1, v2

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move p1, v3

    .line 43
    :goto_2
    if-nez v0, :cond_4

    .line 44
    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    return v3

    .line 49
    :cond_4
    :goto_3
    return v2
.end method
