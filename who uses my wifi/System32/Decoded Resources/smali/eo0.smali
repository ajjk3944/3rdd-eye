.class public abstract Leo0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:Lf23;

.field public b:Ljava/util/ArrayList;

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public static b(Lwo0;)V
    .locals 2

    .line 1
    iget v0, p0, Lwo0;->j:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lwo0;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    and-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lwo0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->F(Lwo0;)I

    .line 20
    .line 21
    .line 22
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public abstract a(Lwo0;Lwo0;Ltg0;Ltg0;)Z
.end method

.method public final c(Lwo0;)V
    .locals 10

    .line 1
    iget-object v0, p0, Leo0;->a:Lf23;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v0, v0, Lf23;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p1, v1}, Lwo0;->n(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p1, Lwo0;->a:Landroid/view/View;

    .line 14
    .line 15
    iget-object v3, p1, Lwo0;->h:Lwo0;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-object v3, p1, Lwo0;->i:Lwo0;

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    iput-object v4, p1, Lwo0;->h:Lwo0;

    .line 25
    .line 26
    :cond_0
    iput-object v4, p1, Lwo0;->i:Lwo0;

    .line 27
    .line 28
    iget v3, p1, Lwo0;->j:I

    .line 29
    .line 30
    and-int/lit8 v3, v3, 0x10

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->g:Lno0;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->c0()V

    .line 38
    .line 39
    .line 40
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Lt83;

    .line 41
    .line 42
    iget-object v5, v4, Lt83;->h:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, Lue;

    .line 45
    .line 46
    iget-object v6, v4, Lt83;->g:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, Lz71;

    .line 49
    .line 50
    iget-object v7, v6, Lz71;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    .line 53
    .line 54
    invoke-virtual {v7, v2}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    const/4 v8, -0x1

    .line 59
    const/4 v9, 0x0

    .line 60
    if-ne v7, v8, :cond_2

    .line 61
    .line 62
    invoke-virtual {v4, v2}, Lt83;->Q(Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {v5, v7}, Lue;->q(I)Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-eqz v8, :cond_3

    .line 71
    .line 72
    invoke-virtual {v5, v7}, Lue;->C(I)Z

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v2}, Lt83;->Q(Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v7}, Lz71;->i(I)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    move v1, v9

    .line 83
    :goto_0
    if-eqz v1, :cond_4

    .line 84
    .line 85
    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lwo0;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v3, v4}, Lno0;->k(Lwo0;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v4}, Lno0;->h(Lwo0;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    xor-int/lit8 v3, v1, 0x1

    .line 96
    .line 97
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->d0(Z)V

    .line 98
    .line 99
    .line 100
    if-nez v1, :cond_5

    .line 101
    .line 102
    invoke-virtual {p1}, Lwo0;->j()Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_5

    .line 107
    .line 108
    invoke-virtual {v0, v2, v9}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 109
    .line 110
    .line 111
    :cond_5
    :goto_1
    return-void
.end method

.method public abstract d(Lwo0;)V
.end method

.method public abstract e()V
.end method

.method public abstract f()Z
.end method
