.class public final Lmd4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzt1;
.implements Lrh4;
.implements Lkf4;


# instance fields
.field public final f:Lpz;

.field public final g:Lsw1;

.field public final h:Lez1;

.field public final i:Lbu1;

.field public final j:Landroid/util/SparseArray;

.field public k:Lmu2;

.field public l:Lf74;

.field public m:Ld13;

.field public n:Z


# direct methods
.method public constructor <init>(Lpz;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lmd4;->f:Lpz;

    .line 8
    .line 9
    new-instance v0, Lmu2;

    .line 10
    .line 11
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    sget-object v2, Lid4;->g:Lid4;

    .line 25
    .line 26
    invoke-direct {v0, v1, p1, v2}, Lmu2;-><init>(Landroid/os/Looper;Lpz;Lvs2;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lmd4;->k:Lmu2;

    .line 30
    .line 31
    new-instance p1, Lsw1;

    .line 32
    .line 33
    invoke-direct {p1}, Lsw1;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lmd4;->g:Lsw1;

    .line 37
    .line 38
    new-instance v0, Lez1;

    .line 39
    .line 40
    invoke-direct {v0}, Lez1;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lmd4;->h:Lez1;

    .line 44
    .line 45
    new-instance v0, Lbu1;

    .line 46
    .line 47
    invoke-direct {v0, p1}, Lbu1;-><init>(Lsw1;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lmd4;->i:Lbu1;

    .line 51
    .line 52
    new-instance p1, Landroid/util/SparseArray;

    .line 53
    .line 54
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lmd4;->j:Landroid/util/SparseArray;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final A(Lmc4;Landroid/os/Looper;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lmd4;->l:Lf74;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lmd4;->i:Lbu1;

    .line 7
    .line 8
    iget-object v0, v0, Lbu1;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lxm3;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :cond_1
    :goto_0
    invoke-static {v1}, Lzt0;->b0(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lmd4;->l:Lf74;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iget-object v1, p0, Lmd4;->f:Lpz;

    .line 30
    .line 31
    invoke-virtual {v1, p2, v0}, Lpz;->p(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld13;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lmd4;->m:Ld13;

    .line 36
    .line 37
    iget-object v0, p0, Lmd4;->k:Lmu2;

    .line 38
    .line 39
    new-instance v5, Llv2;

    .line 40
    .line 41
    const/16 v1, 0xf

    .line 42
    .line 43
    invoke-direct {v5, p0, p1, v1}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lmu2;

    .line 47
    .line 48
    iget-boolean v6, v0, Lmu2;->b:Z

    .line 49
    .line 50
    iget-object p1, v0, Lmu2;->f:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v2, p1

    .line 53
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 54
    .line 55
    iget-object p1, v0, Lmu2;->c:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v4, p1

    .line 58
    check-cast v4, Lpz;

    .line 59
    .line 60
    move-object v3, p2

    .line 61
    invoke-direct/range {v1 .. v6}, Lmu2;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Lpz;Lvs2;Z)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, Lmd4;->k:Lmu2;

    .line 65
    .line 66
    return-void
.end method

.method public final B(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lh80;

    .line 6
    .line 7
    invoke-direct {v1, v0, p1}, Lh80;-><init>(Lad4;I)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x4

    .line 11
    invoke-virtual {p0, v0, p1, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final E()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd4;->y()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ly24;

    .line 6
    .line 7
    const/16 v2, 0x15

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ly24;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v2, 0x16

    .line 13
    .line 14
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final F(Lt82;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lmd4;->y()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lk34;

    .line 6
    .line 7
    invoke-direct {v1, v0, p1}, Lk34;-><init>(Lad4;Lt82;)V

    .line 8
    .line 9
    .line 10
    const/16 p1, 0x19

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final G(Lb84;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p1, Lb84;->m:Lkh4;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lmd4;->x(Lkh4;)Lad4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    new-instance v1, Lil3;

    .line 17
    .line 18
    invoke-direct {v1, v0, p1}, Lil3;-><init>(Lad4;Lb84;)V

    .line 19
    .line 20
    .line 21
    const/16 p1, 0xa

    .line 22
    .line 23
    invoke-virtual {p0, v0, p1, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final H(Lb84;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, Lb84;->m:Lkh4;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lmd4;->x(Lkh4;)Lad4;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    new-instance v0, Lhd4;

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    invoke-direct {v0, v1}, Lhd4;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/16 v1, 0xa

    .line 23
    .line 24
    invoke-virtual {p0, p1, v1, v0}, Lmd4;->s(Lad4;ILks2;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final I(Lxu1;Lxu1;I)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p3, v0, :cond_0

    .line 3
    .line 4
    const/4 p3, 0x0

    .line 5
    iput-boolean p3, p0, Lmd4;->n:Z

    .line 6
    .line 7
    move p3, v0

    .line 8
    :cond_0
    iget-object v0, p0, Lmd4;->l:Lf74;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lmd4;->i:Lbu1;

    .line 14
    .line 15
    iget-object v2, v1, Lbu1;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lxm3;

    .line 18
    .line 19
    iget-object v3, v1, Lbu1;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Lkh4;

    .line 22
    .line 23
    iget-object v4, v1, Lbu1;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Lsw1;

    .line 26
    .line 27
    invoke-static {v0, v2, v3, v4}, Lbu1;->D(Lf74;Lxm3;Lkh4;Lsw1;)Lkh4;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, v1, Lbu1;->j:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Lh80;

    .line 38
    .line 39
    invoke-direct {v1, v0, p3, p1, p2}, Lh80;-><init>(Lad4;ILxu1;Lxu1;)V

    .line 40
    .line 41
    .line 42
    const/16 p1, 0xb

    .line 43
    .line 44
    invoke-virtual {p0, v0, p1, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lhd4;

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    invoke-direct {v1, v2}, Lhd4;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 v2, 0xe

    .line 12
    .line 13
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ly24;

    .line 6
    .line 7
    const/16 v2, 0x1d

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ly24;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final d()V
    .locals 5

    .line 1
    iget-object v0, p0, Lmd4;->l:Lf74;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lmd4;->i:Lbu1;

    .line 7
    .line 8
    iget-object v2, v1, Lbu1;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lxm3;

    .line 11
    .line 12
    iget-object v3, v1, Lbu1;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lkh4;

    .line 15
    .line 16
    iget-object v4, v1, Lbu1;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Lsw1;

    .line 19
    .line 20
    invoke-static {v0, v2, v3, v4}, Lbu1;->D(Lf74;Lxm3;Lkh4;Lsw1;)Lkh4;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-object v2, v1, Lbu1;->j:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {v0}, Lf74;->K1()Loz1;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v1, v0}, Lbu1;->B(Loz1;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Lt24;

    .line 38
    .line 39
    const/16 v2, 0x1c

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v1, v2, v3}, Lt24;-><init>(IB)V

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lhd4;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v2}, Lhd4;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 v2, 0xd

    .line 12
    .line 13
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lid4;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v2}, Lid4;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lhd4;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, Lhd4;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x5

    .line 12
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final h()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ly24;

    .line 6
    .line 7
    const/16 v2, 0x1c

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ly24;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final i()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lid4;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v1, v2}, Lid4;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x7

    .line 12
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final j(ILkh4;Lch4;Lhh4;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lmd4;->z(ILkh4;)Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lt24;

    .line 6
    .line 7
    const/16 p3, 0x1b

    .line 8
    .line 9
    const/4 p4, 0x0

    .line 10
    invoke-direct {p2, p3, p4}, Lt24;-><init>(IB)V

    .line 11
    .line 12
    .line 13
    const/16 p3, 0x3ea

    .line 14
    .line 15
    invoke-virtual {p0, p1, p3, p2}, Lmd4;->s(Lad4;ILks2;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lhd4;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v1, v2}, Lhd4;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x6

    .line 12
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final l()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lt24;

    .line 6
    .line 7
    const/16 v2, 0x1d

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, v2, v3}, Lt24;-><init>(IB)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final m()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd4;->y()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lhd4;

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    invoke-direct {v1, v2}, Lhd4;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 v2, 0x15

    .line 12
    .line 13
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final n(ILkh4;Lch4;Lhh4;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lmd4;->z(ILkh4;)Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lt24;

    .line 6
    .line 7
    const/16 p3, 0x1a

    .line 8
    .line 9
    const/4 p4, 0x0

    .line 10
    invoke-direct {p2, p3, p4}, Lt24;-><init>(IB)V

    .line 11
    .line 12
    .line 13
    const/16 p3, 0x3e8

    .line 14
    .line 15
    invoke-virtual {p0, p1, p3, p2}, Lmd4;->s(Lad4;ILks2;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final o(ILkh4;Lch4;Lhh4;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lmd4;->z(ILkh4;)Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance p1, Lci3;

    .line 6
    .line 7
    invoke-direct/range {p1 .. p6}, Lci3;-><init>(Lad4;Lch4;Lhh4;Ljava/io/IOException;Z)V

    .line 8
    .line 9
    .line 10
    const/16 p3, 0x3eb

    .line 11
    .line 12
    invoke-virtual {p0, p2, p3, p1}, Lmd4;->s(Lad4;ILks2;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final p(ILkh4;Lhh4;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lmd4;->z(ILkh4;)Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lmr2;

    .line 6
    .line 7
    const/16 v0, 0x12

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p2, p1, p3, v0, v1}, Lmr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 11
    .line 12
    .line 13
    const/16 p3, 0x3ec

    .line 14
    .line 15
    invoke-virtual {p0, p1, p3, p2}, Lmd4;->s(Lad4;ILks2;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final q()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd4;->t()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lid4;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    invoke-direct {v1, v2}, Lid4;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 v2, 0xc

    .line 12
    .line 13
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final r(ILkh4;Lch4;Lhh4;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lmd4;->z(ILkh4;)Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Ly24;

    .line 6
    .line 7
    const/16 p3, 0x1a

    .line 8
    .line 9
    invoke-direct {p2, p3}, Ly24;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 p3, 0x3e9

    .line 13
    .line 14
    invoke-virtual {p0, p1, p3, p2}, Lmd4;->s(Lad4;ILks2;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final s(Lad4;ILks2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmd4;->j:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lmd4;->k:Lmu2;

    .line 7
    .line 8
    invoke-virtual {p1, p2, p3}, Lmu2;->c(ILks2;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lmu2;->d()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final t()Lad4;
    .locals 1

    .line 1
    iget-object v0, p0, Lmd4;->i:Lbu1;

    .line 2
    .line 3
    iget-object v0, v0, Lbu1;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lkh4;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lmd4;->x(Lkh4;)Lad4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final u()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd4;->y()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lid4;

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    invoke-direct {v1, v2}, Lid4;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 v2, 0x17

    .line 12
    .line 13
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final v()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd4;->y()Lad4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ly24;

    .line 6
    .line 7
    const/16 v2, 0x19

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ly24;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v2, 0x18

    .line 13
    .line 14
    invoke-virtual {p0, v0, v2, v1}, Lmd4;->s(Lad4;ILks2;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final w(Loz1;ILkh4;)Lad4;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move/from16 v5, p2

    .line 6
    .line 7
    invoke-virtual {v4}, Loz1;->g()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-ne v2, v1, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    move-object v6, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object/from16 v6, p3

    .line 18
    .line 19
    :goto_0
    iget-object v1, v0, Lmd4;->f:Lpz;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move v1, v2

    .line 25
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    iget-object v7, v0, Lmd4;->l:Lf74;

    .line 30
    .line 31
    invoke-virtual {v7}, Lf74;->K1()Loz1;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-virtual {v4, v7}, Loz1;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v7, :cond_1

    .line 41
    .line 42
    iget-object v7, v0, Lmd4;->l:Lf74;

    .line 43
    .line 44
    invoke-virtual {v7}, Lf74;->O1()I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-ne v5, v7, :cond_1

    .line 49
    .line 50
    move v8, v1

    .line 51
    :cond_1
    const-wide/16 v9, 0x0

    .line 52
    .line 53
    if-eqz v6, :cond_3

    .line 54
    .line 55
    invoke-virtual {v6}, Lkh4;->b()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    if-eqz v8, :cond_2

    .line 62
    .line 63
    iget-object v1, v0, Lmd4;->l:Lf74;

    .line 64
    .line 65
    invoke-virtual {v1}, Lf74;->d()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget v7, v6, Lkh4;->b:I

    .line 70
    .line 71
    if-ne v1, v7, :cond_2

    .line 72
    .line 73
    iget-object v1, v0, Lmd4;->l:Lf74;

    .line 74
    .line 75
    invoke-virtual {v1}, Lf74;->T1()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    iget v7, v6, Lkh4;->c:I

    .line 80
    .line 81
    if-ne v1, v7, :cond_2

    .line 82
    .line 83
    iget-object v1, v0, Lmd4;->l:Lf74;

    .line 84
    .line 85
    invoke-virtual {v1}, Lf74;->Q1()J

    .line 86
    .line 87
    .line 88
    move-result-wide v9

    .line 89
    :cond_2
    :goto_1
    move-wide v7, v9

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    if-eqz v8, :cond_4

    .line 92
    .line 93
    iget-object v1, v0, Lmd4;->l:Lf74;

    .line 94
    .line 95
    invoke-virtual {v1}, Lf74;->o1()J

    .line 96
    .line 97
    .line 98
    move-result-wide v9

    .line 99
    goto :goto_1

    .line 100
    :cond_4
    invoke-virtual {v4}, Loz1;->g()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    iget-object v1, v0, Lmd4;->h:Lez1;

    .line 108
    .line 109
    invoke-virtual {v4, v5, v1, v9, v10}, Loz1;->b(ILez1;J)Lez1;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {v9, v10}, Lv23;->q(J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v9

    .line 120
    goto :goto_1

    .line 121
    :goto_2
    iget-object v1, v0, Lmd4;->i:Lbu1;

    .line 122
    .line 123
    iget-object v1, v1, Lbu1;->j:Ljava/lang/Object;

    .line 124
    .line 125
    move-object v11, v1

    .line 126
    check-cast v11, Lkh4;

    .line 127
    .line 128
    new-instance v1, Lad4;

    .line 129
    .line 130
    iget-object v9, v0, Lmd4;->l:Lf74;

    .line 131
    .line 132
    invoke-virtual {v9}, Lf74;->K1()Loz1;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    iget-object v10, v0, Lmd4;->l:Lf74;

    .line 137
    .line 138
    invoke-virtual {v10}, Lf74;->O1()I

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    iget-object v12, v0, Lmd4;->l:Lf74;

    .line 143
    .line 144
    invoke-virtual {v12}, Lf74;->Q1()J

    .line 145
    .line 146
    .line 147
    move-result-wide v12

    .line 148
    iget-object v14, v0, Lmd4;->l:Lf74;

    .line 149
    .line 150
    invoke-virtual {v14}, Lf74;->R1()J

    .line 151
    .line 152
    .line 153
    move-result-wide v14

    .line 154
    invoke-direct/range {v1 .. v15}, Lad4;-><init>(JLoz1;ILkh4;JLoz1;ILkh4;JJ)V

    .line 155
    .line 156
    .line 157
    return-object v1
.end method

.method public final x(Lkh4;)Lad4;
    .locals 3

    .line 1
    iget-object v0, p0, Lmd4;->l:Lf74;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, Lmd4;->i:Lbu1;

    .line 12
    .line 13
    iget-object v1, v1, Lbu1;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lxn3;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lxn3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Loz1;

    .line 22
    .line 23
    :goto_0
    if-eqz p1, :cond_2

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    iget-object v0, p0, Lmd4;->g:Lsw1;

    .line 29
    .line 30
    iget-object v2, p1, Lkh4;->a:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {v1, v2, v0}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget v0, v0, Lsw1;->c:I

    .line 37
    .line 38
    invoke-virtual {p0, v1, v0, p1}, Lmd4;->w(Loz1;ILkh4;)Lad4;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_2
    :goto_1
    iget-object p1, p0, Lmd4;->l:Lf74;

    .line 44
    .line 45
    invoke-virtual {p1}, Lf74;->O1()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-object v1, p0, Lmd4;->l:Lf74;

    .line 50
    .line 51
    invoke-virtual {v1}, Lf74;->K1()Loz1;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Loz1;->a()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-lt p1, v2, :cond_3

    .line 60
    .line 61
    sget-object v1, Loz1;->a:Law1;

    .line 62
    .line 63
    :cond_3
    invoke-virtual {p0, v1, p1, v0}, Lmd4;->w(Loz1;ILkh4;)Lad4;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1
.end method

.method public final y()Lad4;
    .locals 1

    .line 1
    iget-object v0, p0, Lmd4;->i:Lbu1;

    .line 2
    .line 3
    iget-object v0, v0, Lbu1;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lkh4;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lmd4;->x(Lkh4;)Lad4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final z(ILkh4;)Lad4;
    .locals 1

    .line 1
    iget-object v0, p0, Lmd4;->l:Lf74;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lmd4;->i:Lbu1;

    .line 9
    .line 10
    iget-object v0, v0, Lbu1;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lxn3;

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Lxn3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Loz1;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, p2}, Lmd4;->x(Lkh4;)Lad4;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    sget-object v0, Loz1;->a:Law1;

    .line 28
    .line 29
    invoke-virtual {p0, v0, p1, p2}, Lmd4;->w(Loz1;ILkh4;)Lad4;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_1
    invoke-virtual {v0}, Lf74;->K1()Loz1;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, Loz1;->a()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-lt p1, v0, :cond_2

    .line 43
    .line 44
    sget-object p2, Loz1;->a:Law1;

    .line 45
    .line 46
    :cond_2
    const/4 v0, 0x0

    .line 47
    invoke-virtual {p0, p2, p1, v0}, Lmd4;->w(Loz1;ILkh4;)Lad4;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
.end method
