.class public final Lno0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/List;

.field public e:I

.field public f:I

.field public g:Lmo0;

.field public final synthetic h:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lno0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lno0;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lno0;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lno0;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lno0;->d:Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    iput p1, p0, Lno0;->e:I

    .line 31
    .line 32
    iput p1, p0, Lno0;->f:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Lwo0;Z)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Lwo0;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lwo0;->a:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, Lno0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->r0:Lyo0;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {v2}, Lyo0;->j()Lp0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    instance-of v4, v2, Lxo0;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    check-cast v2, Lxo0;

    .line 22
    .line 23
    iget-object v2, v2, Lxo0;->e:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lp0;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v2, v3

    .line 33
    :goto_0
    invoke-static {v0, v2}, Le61;->l(Landroid/view/View;Lp0;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    if-eqz p2, :cond_3

    .line 37
    .line 38
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->s:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-gtz v0, :cond_2

    .line 45
    .line 46
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->k0:Lto0;

    .line 47
    .line 48
    if-eqz p2, :cond_3

    .line 49
    .line 50
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->k:Lgw3;

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Lgw3;->B(Lwo0;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const/4 p1, 0x0

    .line 57
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance p1, Ljava/lang/ClassCastException;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_3
    :goto_1
    iput-object v3, p1, Lwo0;->s:Lao0;

    .line 71
    .line 72
    iput-object v3, p1, Lwo0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 73
    .line 74
    invoke-virtual {p0}, Lno0;->c()Lmo0;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget v0, p1, Lwo0;->f:I

    .line 82
    .line 83
    invoke-virtual {p2, v0}, Lmo0;->a(I)Llo0;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v1, v1, Llo0;->a:Ljava/util/ArrayList;

    .line 88
    .line 89
    iget-object p2, p2, Lmo0;->a:Landroid/util/SparseArray;

    .line 90
    .line 91
    invoke-virtual {p2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, Llo0;

    .line 96
    .line 97
    iget p2, p2, Llo0;->b:I

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-gt p2, v0, :cond_4

    .line 104
    .line 105
    return-void

    .line 106
    :cond_4
    invoke-virtual {p1}, Lwo0;->m()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final b(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lno0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-ltz p1, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->k0:Lto0;

    .line 6
    .line 7
    invoke-virtual {v1}, Lto0;->b()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge p1, v1, :cond_1

    .line 12
    .line 13
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->k0:Lto0;

    .line 14
    .line 15
    iget-boolean v1, v1, Lto0;->g:Z

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->i:Lfw3;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, p1, v1}, Lfw3;->g(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v3, "invalid position "

    .line 33
    .line 34
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, ". State item count is "

    .line 41
    .line 42
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->k0:Lto0;

    .line 46
    .line 47
    invoke-virtual {p1}, Lto0;->b()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1
.end method

.method public final c()Lmo0;
    .locals 2

    .line 1
    iget-object v0, p0, Lno0;->g:Lmo0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lmo0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lmo0;->a:Landroid/util/SparseArray;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lmo0;->b:I

    .line 19
    .line 20
    iput-object v0, p0, Lno0;->g:Lmo0;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lno0;->g:Lmo0;

    .line 23
    .line 24
    return-object v0
.end method

.method public final d(I)Landroid/view/View;
    .locals 2

    .line 1
    const-wide v0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, v1}, Lno0;->j(IJ)Lwo0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p1, p1, Lwo0;->a:Landroid/view/View;

    .line 11
    .line 12
    return-object p1
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lno0;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lno0;->f(I)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->D0:[I

    .line 21
    .line 22
    iget-object v0, p0, Lno0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Lef;

    .line 25
    .line 26
    iget-object v1, v0, Lef;->c:[I

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    const/4 v2, -0x1

    .line 31
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    .line 32
    .line 33
    .line 34
    :cond_1
    const/4 v1, 0x0

    .line 35
    iput v1, v0, Lef;->d:I

    .line 36
    .line 37
    return-void
.end method

.method public final f(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lno0;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lwo0;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {p0, v1, v2}, Lno0;->a(Lwo0;Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final g(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lwo0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lwo0;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lno0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Lwo0;->i()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, Lwo0;->n:Lno0;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lno0;->k(Lwo0;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Lwo0;->p()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget p1, v0, Lwo0;->j:I

    .line 36
    .line 37
    and-int/lit8 p1, p1, -0x21

    .line 38
    .line 39
    iput p1, v0, Lwo0;->j:I

    .line 40
    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Lno0;->h(Lwo0;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->P:Leo0;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Lwo0;->g()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->P:Leo0;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Leo0;->d(Lwo0;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public final h(Lwo0;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lno0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Lef;

    .line 4
    .line 5
    invoke-virtual {p1}, Lwo0;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, p1, Lwo0;->a:Landroid/view/View;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez v2, :cond_f

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_9

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Lwo0;->j()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_e

    .line 28
    .line 29
    invoke-virtual {p1}, Lwo0;->o()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_d

    .line 34
    .line 35
    iget v2, p1, Lwo0;->j:I

    .line 36
    .line 37
    and-int/lit8 v2, v2, 0x10

    .line 38
    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    sget-object v2, Le61;->a:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-virtual {v3}, Landroid/view/View;->hasTransientState()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    move v2, v5

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v2, v4

    .line 52
    :goto_0
    invoke-virtual {p1}, Lwo0;->g()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_b

    .line 57
    .line 58
    iget v3, p0, Lno0;->f:I

    .line 59
    .line 60
    if-lez v3, :cond_9

    .line 61
    .line 62
    iget v3, p1, Lwo0;->j:I

    .line 63
    .line 64
    and-int/lit16 v3, v3, 0x20e

    .line 65
    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_2
    iget-object v3, p0, Lno0;->c:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    iget v7, p0, Lno0;->f:I

    .line 76
    .line 77
    if-lt v6, v7, :cond_3

    .line 78
    .line 79
    if-lez v6, :cond_3

    .line 80
    .line 81
    invoke-virtual {p0, v4}, Lno0;->f(I)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v6, v6, -0x1

    .line 85
    .line 86
    :cond_3
    sget-object v7, Landroidx/recyclerview/widget/RecyclerView;->D0:[I

    .line 87
    .line 88
    if-lez v6, :cond_8

    .line 89
    .line 90
    iget v7, p1, Lwo0;->c:I

    .line 91
    .line 92
    iget-object v8, v1, Lef;->c:[I

    .line 93
    .line 94
    if-eqz v8, :cond_5

    .line 95
    .line 96
    iget v8, v1, Lef;->d:I

    .line 97
    .line 98
    mul-int/lit8 v8, v8, 0x2

    .line 99
    .line 100
    move v9, v4

    .line 101
    :goto_1
    if-ge v9, v8, :cond_5

    .line 102
    .line 103
    iget-object v10, v1, Lef;->c:[I

    .line 104
    .line 105
    aget v10, v10, v9

    .line 106
    .line 107
    if-ne v10, v7, :cond_4

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_4
    add-int/lit8 v9, v9, 0x2

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    add-int/lit8 v6, v6, -0x1

    .line 114
    .line 115
    :goto_2
    if-ltz v6, :cond_7

    .line 116
    .line 117
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    check-cast v7, Lwo0;

    .line 122
    .line 123
    iget v7, v7, Lwo0;->c:I

    .line 124
    .line 125
    iget-object v8, v1, Lef;->c:[I

    .line 126
    .line 127
    if-eqz v8, :cond_7

    .line 128
    .line 129
    iget v8, v1, Lef;->d:I

    .line 130
    .line 131
    mul-int/lit8 v8, v8, 0x2

    .line 132
    .line 133
    move v9, v4

    .line 134
    :goto_3
    if-ge v9, v8, :cond_7

    .line 135
    .line 136
    iget-object v10, v1, Lef;->c:[I

    .line 137
    .line 138
    aget v10, v10, v9

    .line 139
    .line 140
    if-ne v10, v7, :cond_6

    .line 141
    .line 142
    add-int/lit8 v6, v6, -0x1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_6
    add-int/lit8 v9, v9, 0x2

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_7
    add-int/2addr v6, v5

    .line 149
    :cond_8
    :goto_4
    invoke-virtual {v3, v6, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    move v1, v5

    .line 153
    goto :goto_6

    .line 154
    :cond_9
    :goto_5
    move v1, v4

    .line 155
    :goto_6
    if-nez v1, :cond_a

    .line 156
    .line 157
    invoke-virtual {p0, p1, v5}, Lno0;->a(Lwo0;Z)V

    .line 158
    .line 159
    .line 160
    :goto_7
    move v4, v1

    .line 161
    goto :goto_8

    .line 162
    :cond_a
    move v5, v4

    .line 163
    goto :goto_7

    .line 164
    :cond_b
    move v5, v4

    .line 165
    :goto_8
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->k:Lgw3;

    .line 166
    .line 167
    invoke-virtual {v0, p1}, Lgw3;->B(Lwo0;)V

    .line 168
    .line 169
    .line 170
    if-nez v4, :cond_c

    .line 171
    .line 172
    if-nez v5, :cond_c

    .line 173
    .line 174
    if-eqz v2, :cond_c

    .line 175
    .line 176
    const/4 v0, 0x0

    .line 177
    iput-object v0, p1, Lwo0;->s:Lao0;

    .line 178
    .line 179
    iput-object v0, p1, Lwo0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 180
    .line 181
    :cond_c
    return-void

    .line 182
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 183
    .line 184
    new-instance v1, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string v2, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 187
    .line 188
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw p1

    .line 206
    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 207
    .line 208
    new-instance v2, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    const-string v3, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 211
    .line 212
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v1

    .line 233
    :cond_f
    :goto_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 234
    .line 235
    new-instance v2, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    const-string v6, "Scrapped or attached views may not be recycled. isScrap:"

    .line 238
    .line 239
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1}, Lwo0;->i()Z

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    const-string p1, " isAttached:"

    .line 250
    .line 251
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    if-eqz p1, :cond_10

    .line 259
    .line 260
    move v4, v5

    .line 261
    :cond_10
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v1
.end method

.method public final i(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lwo0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p1, Lwo0;->j:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0xc

    .line 8
    .line 9
    iget-object v1, p0, Lno0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Lwo0;->k()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->P:Leo0;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Lwo0;->c()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v0, Lln;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iget-boolean v0, v0, Lln;->g:Z

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Lwo0;->f()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p0, Lno0;->b:Ljava/util/ArrayList;

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lno0;->b:Ljava/util/ArrayList;

    .line 57
    .line 58
    :cond_2
    iput-object p0, p1, Lwo0;->n:Lno0;

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    iput-boolean v0, p1, Lwo0;->o:Z

    .line 62
    .line 63
    iget-object v0, p0, Lno0;->b:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lwo0;->f()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-virtual {p1}, Lwo0;->h()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->q:Lao0;

    .line 82
    .line 83
    iget-boolean v0, v0, Lao0;->g:Z

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 89
    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v2, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 93
    .line 94
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_5
    :goto_1
    iput-object p0, p1, Lwo0;->n:Lno0;

    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    iput-boolean v0, p1, Lwo0;->o:Z

    .line 116
    .line 117
    iget-object v0, p0, Lno0;->a:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final j(IJ)Lwo0;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lno0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView;->k0:Lto0;

    .line 8
    .line 9
    if-ltz v0, :cond_4d

    .line 10
    .line 11
    invoke-virtual {v3}, Lto0;->b()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ge v0, v4, :cond_4d

    .line 16
    .line 17
    iget-boolean v4, v3, Lto0;->g:Z

    .line 18
    .line 19
    const/16 v5, 0x20

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    if-eqz v4, :cond_6

    .line 23
    .line 24
    iget-object v4, v1, Lno0;->b:Ljava/util/ArrayList;

    .line 25
    .line 26
    if-eqz v4, :cond_4

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    move v9, v8

    .line 36
    :goto_0
    if-ge v9, v4, :cond_2

    .line 37
    .line 38
    iget-object v10, v1, Lno0;->b:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    check-cast v10, Lwo0;

    .line 45
    .line 46
    invoke-virtual {v10}, Lwo0;->p()Z

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    if-nez v11, :cond_1

    .line 51
    .line 52
    invoke-virtual {v10}, Lwo0;->b()I

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    if-ne v11, v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {v10, v5}, Lwo0;->a(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->q:Lao0;

    .line 66
    .line 67
    iget-boolean v9, v9, Lao0;->g:Z

    .line 68
    .line 69
    if-eqz v9, :cond_4

    .line 70
    .line 71
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->i:Lfw3;

    .line 72
    .line 73
    invoke-virtual {v9, v0, v8}, Lfw3;->g(II)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-lez v9, :cond_4

    .line 78
    .line 79
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->q:Lao0;

    .line 80
    .line 81
    invoke-virtual {v10}, Lao0;->a()I

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-ge v9, v10, :cond_4

    .line 86
    .line 87
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->q:Lao0;

    .line 88
    .line 89
    invoke-virtual {v10, v9}, Lao0;->b(I)J

    .line 90
    .line 91
    .line 92
    move-result-wide v9

    .line 93
    move v11, v8

    .line 94
    :goto_1
    if-ge v11, v4, :cond_4

    .line 95
    .line 96
    iget-object v12, v1, Lno0;->b:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    check-cast v12, Lwo0;

    .line 103
    .line 104
    invoke-virtual {v12}, Lwo0;->p()Z

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    if-nez v13, :cond_3

    .line 109
    .line 110
    iget-wide v13, v12, Lwo0;->e:J

    .line 111
    .line 112
    cmp-long v13, v13, v9

    .line 113
    .line 114
    if-nez v13, :cond_3

    .line 115
    .line 116
    invoke-virtual {v12, v5}, Lwo0;->a(I)V

    .line 117
    .line 118
    .line 119
    move-object v10, v12

    .line 120
    goto :goto_3

    .line 121
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_4
    :goto_2
    const/4 v10, 0x0

    .line 125
    :goto_3
    if-eqz v10, :cond_5

    .line 126
    .line 127
    const/4 v4, 0x1

    .line 128
    goto :goto_4

    .line 129
    :cond_5
    move v4, v8

    .line 130
    goto :goto_4

    .line 131
    :cond_6
    move v4, v8

    .line 132
    const/4 v10, 0x0

    .line 133
    :goto_4
    iget-object v9, v1, Lno0;->a:Ljava/util/ArrayList;

    .line 134
    .line 135
    iget-object v11, v1, Lno0;->c:Ljava/util/ArrayList;

    .line 136
    .line 137
    if-nez v10, :cond_1c

    .line 138
    .line 139
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    move v12, v8

    .line 144
    :goto_5
    if-ge v12, v10, :cond_9

    .line 145
    .line 146
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    check-cast v13, Lwo0;

    .line 151
    .line 152
    invoke-virtual {v13}, Lwo0;->p()Z

    .line 153
    .line 154
    .line 155
    move-result v14

    .line 156
    if-nez v14, :cond_8

    .line 157
    .line 158
    invoke-virtual {v13}, Lwo0;->b()I

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    if-ne v14, v0, :cond_8

    .line 163
    .line 164
    invoke-virtual {v13}, Lwo0;->f()Z

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    if-nez v14, :cond_8

    .line 169
    .line 170
    iget-boolean v14, v3, Lto0;->g:Z

    .line 171
    .line 172
    if-nez v14, :cond_7

    .line 173
    .line 174
    invoke-virtual {v13}, Lwo0;->h()Z

    .line 175
    .line 176
    .line 177
    move-result v14

    .line 178
    if-nez v14, :cond_8

    .line 179
    .line 180
    :cond_7
    invoke-virtual {v13, v5}, Lwo0;->a(I)V

    .line 181
    .line 182
    .line 183
    move-object v10, v13

    .line 184
    const/16 v16, 0x1

    .line 185
    .line 186
    goto/16 :goto_b

    .line 187
    .line 188
    :cond_8
    add-int/lit8 v12, v12, 0x1

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_9
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->j:Lt83;

    .line 192
    .line 193
    iget-object v10, v10, Lt83;->i:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v10, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    move v13, v8

    .line 202
    :goto_6
    if-ge v13, v12, :cond_b

    .line 203
    .line 204
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v14

    .line 208
    check-cast v14, Landroid/view/View;

    .line 209
    .line 210
    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lwo0;

    .line 211
    .line 212
    .line 213
    move-result-object v15

    .line 214
    const/16 v16, 0x1

    .line 215
    .line 216
    invoke-virtual {v15}, Lwo0;->b()I

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    if-ne v7, v0, :cond_a

    .line 221
    .line 222
    invoke-virtual {v15}, Lwo0;->f()Z

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    if-nez v7, :cond_a

    .line 227
    .line 228
    invoke-virtual {v15}, Lwo0;->h()Z

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    if-nez v7, :cond_a

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_b
    const/16 v16, 0x1

    .line 239
    .line 240
    const/4 v14, 0x0

    .line 241
    :goto_7
    if-eqz v14, :cond_11

    .line 242
    .line 243
    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lwo0;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->j:Lt83;

    .line 248
    .line 249
    iget-object v12, v10, Lt83;->h:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v12, Lue;

    .line 252
    .line 253
    iget-object v13, v10, Lt83;->g:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v13, Lz71;

    .line 256
    .line 257
    iget-object v13, v13, Lz71;->g:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v13, Landroidx/recyclerview/widget/RecyclerView;

    .line 260
    .line 261
    invoke-virtual {v13, v14}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 262
    .line 263
    .line 264
    move-result v13

    .line 265
    if-ltz v13, :cond_10

    .line 266
    .line 267
    invoke-virtual {v12, v13}, Lue;->q(I)Z

    .line 268
    .line 269
    .line 270
    move-result v15

    .line 271
    if-eqz v15, :cond_f

    .line 272
    .line 273
    invoke-virtual {v12, v13}, Lue;->e(I)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v10, v14}, Lt83;->Q(Landroid/view/View;)V

    .line 277
    .line 278
    .line 279
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->j:Lt83;

    .line 280
    .line 281
    iget-object v12, v10, Lt83;->h:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v12, Lue;

    .line 284
    .line 285
    iget-object v10, v10, Lt83;->g:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v10, Lz71;

    .line 288
    .line 289
    iget-object v10, v10, Lz71;->g:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    .line 292
    .line 293
    invoke-virtual {v10, v14}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 294
    .line 295
    .line 296
    move-result v10

    .line 297
    const/4 v13, -0x1

    .line 298
    if-ne v10, v13, :cond_c

    .line 299
    .line 300
    :goto_8
    move v10, v13

    .line 301
    goto :goto_9

    .line 302
    :cond_c
    invoke-virtual {v12, v10}, Lue;->q(I)Z

    .line 303
    .line 304
    .line 305
    move-result v15

    .line 306
    if-eqz v15, :cond_d

    .line 307
    .line 308
    goto :goto_8

    .line 309
    :cond_d
    invoke-virtual {v12, v10}, Lue;->f(I)I

    .line 310
    .line 311
    .line 312
    move-result v12

    .line 313
    sub-int/2addr v10, v12

    .line 314
    :goto_9
    if-eq v10, v13, :cond_e

    .line 315
    .line 316
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->j:Lt83;

    .line 317
    .line 318
    invoke-virtual {v12, v10}, Lt83;->y(I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1, v14}, Lno0;->i(Landroid/view/View;)V

    .line 322
    .line 323
    .line 324
    const/16 v10, 0x2020

    .line 325
    .line 326
    invoke-virtual {v7, v10}, Lwo0;->a(I)V

    .line 327
    .line 328
    .line 329
    move-object v10, v7

    .line 330
    goto :goto_b

    .line 331
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 332
    .line 333
    new-instance v3, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    const-string v4, "layout index should not be -1 after unhiding a view:"

    .line 336
    .line 337
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    throw v0

    .line 358
    :cond_f
    new-instance v0, Ljava/lang/RuntimeException;

    .line 359
    .line 360
    new-instance v2, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    const-string v3, "trying to unhide a view that was not hidden"

    .line 363
    .line 364
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    throw v0

    .line 378
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 379
    .line 380
    new-instance v2, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    const-string v3, "view is not a child, cannot hide "

    .line 383
    .line 384
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw v0

    .line 398
    :cond_11
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 399
    .line 400
    .line 401
    move-result v7

    .line 402
    move v10, v8

    .line 403
    :goto_a
    if-ge v10, v7, :cond_13

    .line 404
    .line 405
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v12

    .line 409
    check-cast v12, Lwo0;

    .line 410
    .line 411
    invoke-virtual {v12}, Lwo0;->f()Z

    .line 412
    .line 413
    .line 414
    move-result v13

    .line 415
    if-nez v13, :cond_12

    .line 416
    .line 417
    invoke-virtual {v12}, Lwo0;->b()I

    .line 418
    .line 419
    .line 420
    move-result v13

    .line 421
    if-ne v13, v0, :cond_12

    .line 422
    .line 423
    invoke-virtual {v12}, Lwo0;->d()Z

    .line 424
    .line 425
    .line 426
    move-result v13

    .line 427
    if-nez v13, :cond_12

    .line 428
    .line 429
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-object v10, v12

    .line 433
    goto :goto_b

    .line 434
    :cond_12
    add-int/lit8 v10, v10, 0x1

    .line 435
    .line 436
    goto :goto_a

    .line 437
    :cond_13
    const/4 v10, 0x0

    .line 438
    :goto_b
    if-eqz v10, :cond_1d

    .line 439
    .line 440
    invoke-virtual {v10}, Lwo0;->h()Z

    .line 441
    .line 442
    .line 443
    move-result v7

    .line 444
    if-eqz v7, :cond_14

    .line 445
    .line 446
    iget-boolean v7, v3, Lto0;->g:Z

    .line 447
    .line 448
    goto :goto_c

    .line 449
    :cond_14
    iget v7, v10, Lwo0;->c:I

    .line 450
    .line 451
    if-ltz v7, :cond_1b

    .line 452
    .line 453
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->q:Lao0;

    .line 454
    .line 455
    invoke-virtual {v12}, Lao0;->a()I

    .line 456
    .line 457
    .line 458
    move-result v12

    .line 459
    if-ge v7, v12, :cond_1b

    .line 460
    .line 461
    iget-boolean v7, v3, Lto0;->g:Z

    .line 462
    .line 463
    if-nez v7, :cond_16

    .line 464
    .line 465
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->q:Lao0;

    .line 466
    .line 467
    iget v12, v10, Lwo0;->c:I

    .line 468
    .line 469
    invoke-virtual {v7, v12}, Lao0;->c(I)I

    .line 470
    .line 471
    .line 472
    move-result v7

    .line 473
    iget v12, v10, Lwo0;->f:I

    .line 474
    .line 475
    if-eq v7, v12, :cond_16

    .line 476
    .line 477
    :cond_15
    move v7, v8

    .line 478
    goto :goto_c

    .line 479
    :cond_16
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->q:Lao0;

    .line 480
    .line 481
    iget-boolean v12, v7, Lao0;->g:Z

    .line 482
    .line 483
    if-eqz v12, :cond_17

    .line 484
    .line 485
    iget-wide v12, v10, Lwo0;->e:J

    .line 486
    .line 487
    iget v14, v10, Lwo0;->c:I

    .line 488
    .line 489
    invoke-virtual {v7, v14}, Lao0;->b(I)J

    .line 490
    .line 491
    .line 492
    move-result-wide v14

    .line 493
    cmp-long v7, v12, v14

    .line 494
    .line 495
    if-nez v7, :cond_15

    .line 496
    .line 497
    :cond_17
    move/from16 v7, v16

    .line 498
    .line 499
    :goto_c
    if-nez v7, :cond_1a

    .line 500
    .line 501
    const/4 v7, 0x4

    .line 502
    invoke-virtual {v10, v7}, Lwo0;->a(I)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v10}, Lwo0;->i()Z

    .line 506
    .line 507
    .line 508
    move-result v7

    .line 509
    if-eqz v7, :cond_18

    .line 510
    .line 511
    iget-object v7, v10, Lwo0;->a:Landroid/view/View;

    .line 512
    .line 513
    invoke-virtual {v2, v7, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 514
    .line 515
    .line 516
    iget-object v7, v10, Lwo0;->n:Lno0;

    .line 517
    .line 518
    invoke-virtual {v7, v10}, Lno0;->k(Lwo0;)V

    .line 519
    .line 520
    .line 521
    goto :goto_d

    .line 522
    :cond_18
    invoke-virtual {v10}, Lwo0;->p()Z

    .line 523
    .line 524
    .line 525
    move-result v7

    .line 526
    if-eqz v7, :cond_19

    .line 527
    .line 528
    iget v7, v10, Lwo0;->j:I

    .line 529
    .line 530
    and-int/lit8 v7, v7, -0x21

    .line 531
    .line 532
    iput v7, v10, Lwo0;->j:I

    .line 533
    .line 534
    :cond_19
    :goto_d
    invoke-virtual {v1, v10}, Lno0;->h(Lwo0;)V

    .line 535
    .line 536
    .line 537
    const/4 v10, 0x0

    .line 538
    goto :goto_e

    .line 539
    :cond_1a
    move/from16 v4, v16

    .line 540
    .line 541
    goto :goto_e

    .line 542
    :cond_1b
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 543
    .line 544
    new-instance v3, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    const-string v4, "Inconsistency detected. Invalid view holder adapter position"

    .line 547
    .line 548
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    invoke-direct {v0, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    throw v0

    .line 569
    :cond_1c
    const/16 v16, 0x1

    .line 570
    .line 571
    :cond_1d
    :goto_e
    const-wide/16 v17, 0x0

    .line 572
    .line 573
    const-wide v19, 0x7fffffffffffffffL

    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    if-nez v10, :cond_31

    .line 579
    .line 580
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->i:Lfw3;

    .line 581
    .line 582
    invoke-virtual {v7, v0, v8}, Lfw3;->g(II)I

    .line 583
    .line 584
    .line 585
    move-result v7

    .line 586
    if-ltz v7, :cond_30

    .line 587
    .line 588
    const-wide/16 v21, 0x3

    .line 589
    .line 590
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->q:Lao0;

    .line 591
    .line 592
    invoke-virtual {v12}, Lao0;->a()I

    .line 593
    .line 594
    .line 595
    move-result v12

    .line 596
    if-ge v7, v12, :cond_30

    .line 597
    .line 598
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->q:Lao0;

    .line 599
    .line 600
    invoke-virtual {v12, v7}, Lao0;->c(I)I

    .line 601
    .line 602
    .line 603
    move-result v12

    .line 604
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->q:Lao0;

    .line 605
    .line 606
    const-wide/16 v23, 0x4

    .line 607
    .line 608
    iget-boolean v14, v13, Lao0;->g:Z

    .line 609
    .line 610
    if-eqz v14, :cond_25

    .line 611
    .line 612
    invoke-virtual {v13, v7}, Lao0;->b(I)J

    .line 613
    .line 614
    .line 615
    move-result-wide v13

    .line 616
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 617
    .line 618
    .line 619
    move-result v10

    .line 620
    add-int/lit8 v10, v10, -0x1

    .line 621
    .line 622
    :goto_f
    if-ltz v10, :cond_21

    .line 623
    .line 624
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v15

    .line 628
    check-cast v15, Lwo0;

    .line 629
    .line 630
    move/from16 v26, v7

    .line 631
    .line 632
    iget-wide v6, v15, Lwo0;->e:J

    .line 633
    .line 634
    iget-object v8, v15, Lwo0;->a:Landroid/view/View;

    .line 635
    .line 636
    cmp-long v6, v6, v13

    .line 637
    .line 638
    if-nez v6, :cond_20

    .line 639
    .line 640
    invoke-virtual {v15}, Lwo0;->p()Z

    .line 641
    .line 642
    .line 643
    move-result v6

    .line 644
    if-nez v6, :cond_20

    .line 645
    .line 646
    iget v6, v15, Lwo0;->f:I

    .line 647
    .line 648
    if-ne v12, v6, :cond_1f

    .line 649
    .line 650
    invoke-virtual {v15, v5}, Lwo0;->a(I)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v15}, Lwo0;->h()Z

    .line 654
    .line 655
    .line 656
    move-result v5

    .line 657
    if-eqz v5, :cond_1e

    .line 658
    .line 659
    iget-boolean v5, v3, Lto0;->g:Z

    .line 660
    .line 661
    if-nez v5, :cond_1e

    .line 662
    .line 663
    iget v5, v15, Lwo0;->j:I

    .line 664
    .line 665
    and-int/lit8 v5, v5, -0xf

    .line 666
    .line 667
    or-int/lit8 v5, v5, 0x2

    .line 668
    .line 669
    iput v5, v15, Lwo0;->j:I

    .line 670
    .line 671
    :cond_1e
    move-object v10, v15

    .line 672
    goto :goto_11

    .line 673
    :cond_1f
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    const/4 v6, 0x0

    .line 677
    invoke-virtual {v2, v8, v6}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 678
    .line 679
    .line 680
    invoke-static {v8}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lwo0;

    .line 681
    .line 682
    .line 683
    move-result-object v7

    .line 684
    const/4 v8, 0x0

    .line 685
    iput-object v8, v7, Lwo0;->n:Lno0;

    .line 686
    .line 687
    iput-boolean v6, v7, Lwo0;->o:Z

    .line 688
    .line 689
    iget v6, v7, Lwo0;->j:I

    .line 690
    .line 691
    and-int/lit8 v6, v6, -0x21

    .line 692
    .line 693
    iput v6, v7, Lwo0;->j:I

    .line 694
    .line 695
    invoke-virtual {v1, v7}, Lno0;->h(Lwo0;)V

    .line 696
    .line 697
    .line 698
    :cond_20
    add-int/lit8 v10, v10, -0x1

    .line 699
    .line 700
    move/from16 v7, v26

    .line 701
    .line 702
    const/4 v8, 0x0

    .line 703
    goto :goto_f

    .line 704
    :cond_21
    move/from16 v26, v7

    .line 705
    .line 706
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 707
    .line 708
    .line 709
    move-result v5

    .line 710
    add-int/lit8 v5, v5, -0x1

    .line 711
    .line 712
    :goto_10
    if-ltz v5, :cond_23

    .line 713
    .line 714
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v6

    .line 718
    check-cast v6, Lwo0;

    .line 719
    .line 720
    iget-wide v7, v6, Lwo0;->e:J

    .line 721
    .line 722
    cmp-long v7, v7, v13

    .line 723
    .line 724
    if-nez v7, :cond_24

    .line 725
    .line 726
    invoke-virtual {v6}, Lwo0;->d()Z

    .line 727
    .line 728
    .line 729
    move-result v7

    .line 730
    if-nez v7, :cond_24

    .line 731
    .line 732
    iget v7, v6, Lwo0;->f:I

    .line 733
    .line 734
    if-ne v12, v7, :cond_22

    .line 735
    .line 736
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-object v10, v6

    .line 740
    goto :goto_11

    .line 741
    :cond_22
    invoke-virtual {v1, v5}, Lno0;->f(I)V

    .line 742
    .line 743
    .line 744
    :cond_23
    const/4 v10, 0x0

    .line 745
    goto :goto_11

    .line 746
    :cond_24
    add-int/lit8 v5, v5, -0x1

    .line 747
    .line 748
    goto :goto_10

    .line 749
    :goto_11
    if-eqz v10, :cond_25

    .line 750
    .line 751
    move/from16 v5, v26

    .line 752
    .line 753
    iput v5, v10, Lwo0;->c:I

    .line 754
    .line 755
    move/from16 v4, v16

    .line 756
    .line 757
    :cond_25
    if-nez v10, :cond_29

    .line 758
    .line 759
    invoke-virtual {v1}, Lno0;->c()Lmo0;

    .line 760
    .line 761
    .line 762
    move-result-object v5

    .line 763
    iget-object v5, v5, Lmo0;->a:Landroid/util/SparseArray;

    .line 764
    .line 765
    invoke-virtual {v5, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v5

    .line 769
    check-cast v5, Llo0;

    .line 770
    .line 771
    if-eqz v5, :cond_27

    .line 772
    .line 773
    iget-object v5, v5, Llo0;->a:Ljava/util/ArrayList;

    .line 774
    .line 775
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 776
    .line 777
    .line 778
    move-result v6

    .line 779
    if-nez v6, :cond_27

    .line 780
    .line 781
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 782
    .line 783
    .line 784
    move-result v6

    .line 785
    add-int/lit8 v6, v6, -0x1

    .line 786
    .line 787
    :goto_12
    if-ltz v6, :cond_27

    .line 788
    .line 789
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v7

    .line 793
    check-cast v7, Lwo0;

    .line 794
    .line 795
    invoke-virtual {v7}, Lwo0;->d()Z

    .line 796
    .line 797
    .line 798
    move-result v7

    .line 799
    if-nez v7, :cond_26

    .line 800
    .line 801
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v5

    .line 805
    check-cast v5, Lwo0;

    .line 806
    .line 807
    goto :goto_13

    .line 808
    :cond_26
    add-int/lit8 v6, v6, -0x1

    .line 809
    .line 810
    goto :goto_12

    .line 811
    :cond_27
    const/4 v5, 0x0

    .line 812
    :goto_13
    if-eqz v5, :cond_28

    .line 813
    .line 814
    invoke-virtual {v5}, Lwo0;->m()V

    .line 815
    .line 816
    .line 817
    sget-object v6, Landroidx/recyclerview/widget/RecyclerView;->D0:[I

    .line 818
    .line 819
    :cond_28
    move-object v10, v5

    .line 820
    :cond_29
    if-nez v10, :cond_32

    .line 821
    .line 822
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 823
    .line 824
    .line 825
    move-result-wide v5

    .line 826
    cmp-long v7, p2, v19

    .line 827
    .line 828
    if-eqz v7, :cond_2c

    .line 829
    .line 830
    iget-object v7, v1, Lno0;->g:Lmo0;

    .line 831
    .line 832
    invoke-virtual {v7, v12}, Lmo0;->a(I)Llo0;

    .line 833
    .line 834
    .line 835
    move-result-object v7

    .line 836
    iget-wide v7, v7, Llo0;->c:J

    .line 837
    .line 838
    cmp-long v9, v7, v17

    .line 839
    .line 840
    if-eqz v9, :cond_2b

    .line 841
    .line 842
    add-long/2addr v7, v5

    .line 843
    cmp-long v7, v7, p2

    .line 844
    .line 845
    if-gez v7, :cond_2a

    .line 846
    .line 847
    goto :goto_14

    .line 848
    :cond_2a
    const/4 v7, 0x0

    .line 849
    goto :goto_15

    .line 850
    :cond_2b
    :goto_14
    move/from16 v7, v16

    .line 851
    .line 852
    :goto_15
    if-nez v7, :cond_2c

    .line 853
    .line 854
    const/16 v25, 0x0

    .line 855
    .line 856
    return-object v25

    .line 857
    :cond_2c
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->q:Lao0;

    .line 858
    .line 859
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    :try_start_0
    const-string v8, "RV CreateView"

    .line 863
    .line 864
    sget v9, Lo21;->a:I

    .line 865
    .line 866
    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v7, v2, v12}, Lao0;->e(Landroid/view/ViewGroup;I)Lwo0;

    .line 870
    .line 871
    .line 872
    move-result-object v10

    .line 873
    iget-object v7, v10, Lwo0;->a:Landroid/view/View;

    .line 874
    .line 875
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 876
    .line 877
    .line 878
    move-result-object v8

    .line 879
    if-nez v8, :cond_2f

    .line 880
    .line 881
    iput v12, v10, Lwo0;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 882
    .line 883
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 884
    .line 885
    .line 886
    sget-object v8, Landroidx/recyclerview/widget/RecyclerView;->D0:[I

    .line 887
    .line 888
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 889
    .line 890
    .line 891
    move-result-object v7

    .line 892
    if-eqz v7, :cond_2d

    .line 893
    .line 894
    new-instance v8, Ljava/lang/ref/WeakReference;

    .line 895
    .line 896
    invoke-direct {v8, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    iput-object v8, v10, Lwo0;->b:Ljava/lang/ref/WeakReference;

    .line 900
    .line 901
    :cond_2d
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 902
    .line 903
    .line 904
    move-result-wide v7

    .line 905
    iget-object v9, v1, Lno0;->g:Lmo0;

    .line 906
    .line 907
    sub-long/2addr v7, v5

    .line 908
    invoke-virtual {v9, v12}, Lmo0;->a(I)Llo0;

    .line 909
    .line 910
    .line 911
    move-result-object v5

    .line 912
    iget-wide v11, v5, Llo0;->c:J

    .line 913
    .line 914
    cmp-long v6, v11, v17

    .line 915
    .line 916
    if-nez v6, :cond_2e

    .line 917
    .line 918
    goto :goto_16

    .line 919
    :cond_2e
    div-long v11, v11, v23

    .line 920
    .line 921
    mul-long v11, v11, v21

    .line 922
    .line 923
    div-long v7, v7, v23

    .line 924
    .line 925
    add-long/2addr v7, v11

    .line 926
    :goto_16
    iput-wide v7, v5, Llo0;->c:J

    .line 927
    .line 928
    goto :goto_18

    .line 929
    :catchall_0
    move-exception v0

    .line 930
    goto :goto_17

    .line 931
    :cond_2f
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 932
    .line 933
    const-string v2, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    .line 934
    .line 935
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 936
    .line 937
    .line 938
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 939
    :goto_17
    sget v2, Lo21;->a:I

    .line 940
    .line 941
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 942
    .line 943
    .line 944
    throw v0

    .line 945
    :cond_30
    move v5, v7

    .line 946
    new-instance v4, Ljava/lang/IndexOutOfBoundsException;

    .line 947
    .line 948
    new-instance v6, Ljava/lang/StringBuilder;

    .line 949
    .line 950
    const-string v7, "Inconsistency detected. Invalid item position "

    .line 951
    .line 952
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 956
    .line 957
    .line 958
    const-string v0, "(offset:"

    .line 959
    .line 960
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 961
    .line 962
    .line 963
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 964
    .line 965
    .line 966
    const-string v0, ").state:"

    .line 967
    .line 968
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v3}, Lto0;->b()I

    .line 972
    .line 973
    .line 974
    move-result v0

    .line 975
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 976
    .line 977
    .line 978
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 983
    .line 984
    .line 985
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    invoke-direct {v4, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 990
    .line 991
    .line 992
    throw v4

    .line 993
    :cond_31
    const-wide/16 v21, 0x3

    .line 994
    .line 995
    const-wide/16 v23, 0x4

    .line 996
    .line 997
    :cond_32
    :goto_18
    iget-object v5, v10, Lwo0;->a:Landroid/view/View;

    .line 998
    .line 999
    if-eqz v4, :cond_34

    .line 1000
    .line 1001
    iget-boolean v6, v3, Lto0;->g:Z

    .line 1002
    .line 1003
    if-nez v6, :cond_34

    .line 1004
    .line 1005
    iget v6, v10, Lwo0;->j:I

    .line 1006
    .line 1007
    and-int/lit16 v7, v6, 0x2000

    .line 1008
    .line 1009
    if-eqz v7, :cond_33

    .line 1010
    .line 1011
    move/from16 v7, v16

    .line 1012
    .line 1013
    goto :goto_19

    .line 1014
    :cond_33
    const/4 v7, 0x0

    .line 1015
    :goto_19
    if-eqz v7, :cond_34

    .line 1016
    .line 1017
    and-int/lit16 v6, v6, -0x2001

    .line 1018
    .line 1019
    iput v6, v10, Lwo0;->j:I

    .line 1020
    .line 1021
    iget-boolean v6, v3, Lto0;->j:Z

    .line 1022
    .line 1023
    if-eqz v6, :cond_34

    .line 1024
    .line 1025
    invoke-static {v10}, Leo0;->b(Lwo0;)V

    .line 1026
    .line 1027
    .line 1028
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->P:Leo0;

    .line 1029
    .line 1030
    invoke-virtual {v10}, Lwo0;->c()Ljava/util/List;

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1034
    .line 1035
    .line 1036
    new-instance v6, Ltg0;

    .line 1037
    .line 1038
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v6, v10}, Ltg0;->a(Lwo0;)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v2, v10, v6}, Landroidx/recyclerview/widget/RecyclerView;->V(Lwo0;Ltg0;)V

    .line 1045
    .line 1046
    .line 1047
    :cond_34
    iget-boolean v6, v3, Lto0;->g:Z

    .line 1048
    .line 1049
    if-eqz v6, :cond_35

    .line 1050
    .line 1051
    invoke-virtual {v10}, Lwo0;->e()Z

    .line 1052
    .line 1053
    .line 1054
    move-result v6

    .line 1055
    if-eqz v6, :cond_35

    .line 1056
    .line 1057
    iput v0, v10, Lwo0;->g:I

    .line 1058
    .line 1059
    goto :goto_1b

    .line 1060
    :cond_35
    invoke-virtual {v10}, Lwo0;->e()Z

    .line 1061
    .line 1062
    .line 1063
    move-result v6

    .line 1064
    if-eqz v6, :cond_38

    .line 1065
    .line 1066
    iget v6, v10, Lwo0;->j:I

    .line 1067
    .line 1068
    and-int/lit8 v6, v6, 0x2

    .line 1069
    .line 1070
    if-eqz v6, :cond_36

    .line 1071
    .line 1072
    move/from16 v6, v16

    .line 1073
    .line 1074
    goto :goto_1a

    .line 1075
    :cond_36
    const/4 v6, 0x0

    .line 1076
    :goto_1a
    if-nez v6, :cond_38

    .line 1077
    .line 1078
    invoke-virtual {v10}, Lwo0;->f()Z

    .line 1079
    .line 1080
    .line 1081
    move-result v6

    .line 1082
    if-eqz v6, :cond_37

    .line 1083
    .line 1084
    goto :goto_1c

    .line 1085
    :cond_37
    :goto_1b
    move/from16 v9, v16

    .line 1086
    .line 1087
    const/4 v6, 0x0

    .line 1088
    const/4 v7, 0x0

    .line 1089
    goto/16 :goto_23

    .line 1090
    .line 1091
    :cond_38
    :goto_1c
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->i:Lfw3;

    .line 1092
    .line 1093
    const/4 v7, 0x0

    .line 1094
    invoke-virtual {v6, v0, v7}, Lfw3;->g(II)I

    .line 1095
    .line 1096
    .line 1097
    move-result v6

    .line 1098
    const/4 v8, 0x0

    .line 1099
    iput-object v8, v10, Lwo0;->s:Lao0;

    .line 1100
    .line 1101
    iput-object v2, v10, Lwo0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 1102
    .line 1103
    iget v9, v10, Lwo0;->f:I

    .line 1104
    .line 1105
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1106
    .line 1107
    .line 1108
    move-result-wide v11

    .line 1109
    cmp-long v13, p2, v19

    .line 1110
    .line 1111
    if-eqz v13, :cond_3a

    .line 1112
    .line 1113
    iget-object v13, v1, Lno0;->g:Lmo0;

    .line 1114
    .line 1115
    invoke-virtual {v13, v9}, Lmo0;->a(I)Llo0;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v9

    .line 1119
    iget-wide v13, v9, Llo0;->d:J

    .line 1120
    .line 1121
    cmp-long v9, v13, v17

    .line 1122
    .line 1123
    if-eqz v9, :cond_3a

    .line 1124
    .line 1125
    add-long/2addr v13, v11

    .line 1126
    cmp-long v9, v13, p2

    .line 1127
    .line 1128
    if-gez v9, :cond_39

    .line 1129
    .line 1130
    goto :goto_1d

    .line 1131
    :cond_39
    move v6, v7

    .line 1132
    move/from16 v9, v16

    .line 1133
    .line 1134
    goto/16 :goto_23

    .line 1135
    .line 1136
    :cond_3a
    :goto_1d
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->q:Lao0;

    .line 1137
    .line 1138
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1139
    .line 1140
    .line 1141
    iget-object v13, v10, Lwo0;->s:Lao0;

    .line 1142
    .line 1143
    if-nez v13, :cond_3b

    .line 1144
    .line 1145
    move/from16 v13, v16

    .line 1146
    .line 1147
    goto :goto_1e

    .line 1148
    :cond_3b
    move v13, v7

    .line 1149
    :goto_1e
    if-eqz v13, :cond_3d

    .line 1150
    .line 1151
    iput v6, v10, Lwo0;->c:I

    .line 1152
    .line 1153
    iget-boolean v14, v9, Lao0;->g:Z

    .line 1154
    .line 1155
    if-eqz v14, :cond_3c

    .line 1156
    .line 1157
    invoke-virtual {v9, v6}, Lao0;->b(I)J

    .line 1158
    .line 1159
    .line 1160
    move-result-wide v14

    .line 1161
    iput-wide v14, v10, Lwo0;->e:J

    .line 1162
    .line 1163
    :cond_3c
    iget v14, v10, Lwo0;->j:I

    .line 1164
    .line 1165
    and-int/lit16 v14, v14, -0x208

    .line 1166
    .line 1167
    or-int/lit8 v14, v14, 0x1

    .line 1168
    .line 1169
    iput v14, v10, Lwo0;->j:I

    .line 1170
    .line 1171
    sget v14, Lo21;->a:I

    .line 1172
    .line 1173
    const-string v14, "RV OnBindView"

    .line 1174
    .line 1175
    invoke-static {v14}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    :cond_3d
    iput-object v9, v10, Lwo0;->s:Lao0;

    .line 1179
    .line 1180
    invoke-virtual {v10}, Lwo0;->c()Ljava/util/List;

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v9, v10, v6}, Lao0;->d(Lwo0;I)V

    .line 1184
    .line 1185
    .line 1186
    if-eqz v13, :cond_40

    .line 1187
    .line 1188
    iget-object v6, v10, Lwo0;->k:Ljava/util/ArrayList;

    .line 1189
    .line 1190
    if-eqz v6, :cond_3e

    .line 1191
    .line 1192
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 1193
    .line 1194
    .line 1195
    :cond_3e
    iget v6, v10, Lwo0;->j:I

    .line 1196
    .line 1197
    and-int/lit16 v6, v6, -0x401

    .line 1198
    .line 1199
    iput v6, v10, Lwo0;->j:I

    .line 1200
    .line 1201
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v6

    .line 1205
    instance-of v9, v6, Lio0;

    .line 1206
    .line 1207
    if-eqz v9, :cond_3f

    .line 1208
    .line 1209
    check-cast v6, Lio0;

    .line 1210
    .line 1211
    move/from16 v9, v16

    .line 1212
    .line 1213
    iput-boolean v9, v6, Lio0;->c:Z

    .line 1214
    .line 1215
    :cond_3f
    sget v6, Lo21;->a:I

    .line 1216
    .line 1217
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1218
    .line 1219
    .line 1220
    :cond_40
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1221
    .line 1222
    .line 1223
    move-result-wide v13

    .line 1224
    iget-object v6, v1, Lno0;->g:Lmo0;

    .line 1225
    .line 1226
    iget v9, v10, Lwo0;->f:I

    .line 1227
    .line 1228
    sub-long/2addr v13, v11

    .line 1229
    invoke-virtual {v6, v9}, Lmo0;->a(I)Llo0;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v6

    .line 1233
    iget-wide v11, v6, Llo0;->d:J

    .line 1234
    .line 1235
    cmp-long v9, v11, v17

    .line 1236
    .line 1237
    if-nez v9, :cond_41

    .line 1238
    .line 1239
    goto :goto_1f

    .line 1240
    :cond_41
    div-long v11, v11, v23

    .line 1241
    .line 1242
    mul-long v11, v11, v21

    .line 1243
    .line 1244
    div-long v13, v13, v23

    .line 1245
    .line 1246
    add-long/2addr v13, v11

    .line 1247
    :goto_1f
    iput-wide v13, v6, Llo0;->d:J

    .line 1248
    .line 1249
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/view/accessibility/AccessibilityManager;

    .line 1250
    .line 1251
    if-eqz v6, :cond_42

    .line 1252
    .line 1253
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1254
    .line 1255
    .line 1256
    move-result v6

    .line 1257
    if-eqz v6, :cond_42

    .line 1258
    .line 1259
    const/4 v6, 0x1

    .line 1260
    goto :goto_20

    .line 1261
    :cond_42
    move v6, v7

    .line 1262
    :goto_20
    if-eqz v6, :cond_48

    .line 1263
    .line 1264
    sget-object v6, Le61;->a:Ljava/util/WeakHashMap;

    .line 1265
    .line 1266
    invoke-virtual {v5}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1267
    .line 1268
    .line 1269
    move-result v6

    .line 1270
    const/4 v9, 0x1

    .line 1271
    if-nez v6, :cond_43

    .line 1272
    .line 1273
    invoke-virtual {v5, v9}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1274
    .line 1275
    .line 1276
    :cond_43
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->r0:Lyo0;

    .line 1277
    .line 1278
    if-nez v6, :cond_44

    .line 1279
    .line 1280
    goto :goto_22

    .line 1281
    :cond_44
    invoke-virtual {v6}, Lyo0;->j()Lp0;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v6

    .line 1285
    instance-of v11, v6, Lxo0;

    .line 1286
    .line 1287
    if-eqz v11, :cond_47

    .line 1288
    .line 1289
    move-object v11, v6

    .line 1290
    check-cast v11, Lxo0;

    .line 1291
    .line 1292
    invoke-static {v5}, Le61;->c(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v12

    .line 1296
    if-nez v12, :cond_45

    .line 1297
    .line 1298
    goto :goto_21

    .line 1299
    :cond_45
    instance-of v8, v12, Lo0;

    .line 1300
    .line 1301
    if-eqz v8, :cond_46

    .line 1302
    .line 1303
    check-cast v12, Lo0;

    .line 1304
    .line 1305
    iget-object v8, v12, Lo0;->a:Lp0;

    .line 1306
    .line 1307
    goto :goto_21

    .line 1308
    :cond_46
    new-instance v8, Lp0;

    .line 1309
    .line 1310
    invoke-direct {v8, v12}, Lp0;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 1311
    .line 1312
    .line 1313
    :goto_21
    if-eqz v8, :cond_47

    .line 1314
    .line 1315
    if-eq v8, v11, :cond_47

    .line 1316
    .line 1317
    iget-object v11, v11, Lxo0;->e:Ljava/util/WeakHashMap;

    .line 1318
    .line 1319
    invoke-virtual {v11, v5, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1320
    .line 1321
    .line 1322
    :cond_47
    invoke-static {v5, v6}, Le61;->l(Landroid/view/View;Lp0;)V

    .line 1323
    .line 1324
    .line 1325
    goto :goto_22

    .line 1326
    :cond_48
    const/4 v9, 0x1

    .line 1327
    :goto_22
    iget-boolean v3, v3, Lto0;->g:Z

    .line 1328
    .line 1329
    if-eqz v3, :cond_49

    .line 1330
    .line 1331
    iput v0, v10, Lwo0;->g:I

    .line 1332
    .line 1333
    :cond_49
    move v6, v9

    .line 1334
    :goto_23
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v0

    .line 1338
    if-nez v0, :cond_4a

    .line 1339
    .line 1340
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v0

    .line 1344
    check-cast v0, Lio0;

    .line 1345
    .line 1346
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1347
    .line 1348
    .line 1349
    goto :goto_24

    .line 1350
    :cond_4a
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1351
    .line 1352
    .line 1353
    move-result v3

    .line 1354
    if-nez v3, :cond_4b

    .line 1355
    .line 1356
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v0

    .line 1360
    check-cast v0, Lio0;

    .line 1361
    .line 1362
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1363
    .line 1364
    .line 1365
    goto :goto_24

    .line 1366
    :cond_4b
    check-cast v0, Lio0;

    .line 1367
    .line 1368
    :goto_24
    iput-object v10, v0, Lio0;->a:Lwo0;

    .line 1369
    .line 1370
    if-eqz v4, :cond_4c

    .line 1371
    .line 1372
    if-eqz v6, :cond_4c

    .line 1373
    .line 1374
    move v7, v9

    .line 1375
    :cond_4c
    iput-boolean v7, v0, Lio0;->d:Z

    .line 1376
    .line 1377
    return-object v10

    .line 1378
    :cond_4d
    new-instance v4, Ljava/lang/IndexOutOfBoundsException;

    .line 1379
    .line 1380
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1381
    .line 1382
    const-string v6, "Invalid item position "

    .line 1383
    .line 1384
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1385
    .line 1386
    .line 1387
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1388
    .line 1389
    .line 1390
    const-string v6, "("

    .line 1391
    .line 1392
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1396
    .line 1397
    .line 1398
    const-string v0, "). Item count:"

    .line 1399
    .line 1400
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v3}, Lto0;->b()I

    .line 1404
    .line 1405
    .line 1406
    move-result v0

    .line 1407
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v0

    .line 1414
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v0

    .line 1421
    invoke-direct {v4, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1422
    .line 1423
    .line 1424
    throw v4
.end method

.method public final k(Lwo0;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lwo0;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lno0;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lno0;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p1, Lwo0;->n:Lno0;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p1, Lwo0;->o:Z

    .line 21
    .line 22
    iget v0, p1, Lwo0;->j:I

    .line 23
    .line 24
    and-int/lit8 v0, v0, -0x21

    .line 25
    .line 26
    iput v0, p1, Lwo0;->j:I

    .line 27
    .line 28
    return-void
.end method

.method public final l()V
    .locals 4

    .line 1
    iget-object v0, p0, Lno0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->r:Lho0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lho0;->j:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Lno0;->e:I

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    iput v1, p0, Lno0;->f:I

    .line 15
    .line 16
    iget-object v0, p0, Lno0;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    :goto_1
    if-ltz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget v3, p0, Lno0;->f:I

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lno0;->f(I)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return-void
.end method
