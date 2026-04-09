.class public final Lxw;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public A:Lvq2;

.field public B:Lvq2;

.field public C:Ljava/util/ArrayDeque;

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Ljava/util/ArrayList;

.field public J:Ljava/util/ArrayList;

.field public K:Ljava/util/ArrayList;

.field public L:Lax;

.field public final M:La9;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Lp21;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Lnw;

.field public g:Laj0;

.field public final h:Lqw;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;

.field public final k:Ljava/util/Map;

.field public final l:Ll92;

.field public final m:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final n:Low;

.field public final o:Low;

.field public final p:Low;

.field public final q:Low;

.field public final r:Lrw;

.field public s:I

.field public t:Lkw;

.field public u:Li30;

.field public v:Liw;

.field public w:Liw;

.field public final x:Lsw;

.field public final y:Lfr;

.field public z:Lvq2;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lp21;

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    invoke-direct {v0, v1}, Lp21;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lxw;->c:Lp21;

    .line 18
    .line 19
    new-instance v0, Lnw;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lnw;-><init>(Lxw;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lxw;->f:Lnw;

    .line 25
    .line 26
    new-instance v0, Lqw;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lqw;-><init>(Lxw;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lxw;->h:Lqw;

    .line 32
    .line 33
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lxw;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 39
    .line 40
    new-instance v0, Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lxw;->j:Ljava/util/Map;

    .line 50
    .line 51
    new-instance v0, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lxw;->k:Ljava/util/Map;

    .line 61
    .line 62
    new-instance v0, Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 68
    .line 69
    .line 70
    new-instance v0, Ll92;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 76
    .line 77
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v1, v0, Ll92;->f:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p0, v0, Ll92;->g:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object v0, p0, Lxw;->l:Ll92;

    .line 85
    .line 86
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lxw;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 92
    .line 93
    new-instance v0, Low;

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    invoke-direct {v0, p0, v1}, Low;-><init>(Lxw;I)V

    .line 97
    .line 98
    .line 99
    iput-object v0, p0, Lxw;->n:Low;

    .line 100
    .line 101
    new-instance v0, Low;

    .line 102
    .line 103
    const/4 v1, 0x1

    .line 104
    invoke-direct {v0, p0, v1}, Low;-><init>(Lxw;I)V

    .line 105
    .line 106
    .line 107
    iput-object v0, p0, Lxw;->o:Low;

    .line 108
    .line 109
    new-instance v0, Low;

    .line 110
    .line 111
    const/4 v1, 0x2

    .line 112
    invoke-direct {v0, p0, v1}, Low;-><init>(Lxw;I)V

    .line 113
    .line 114
    .line 115
    iput-object v0, p0, Lxw;->p:Low;

    .line 116
    .line 117
    new-instance v0, Low;

    .line 118
    .line 119
    const/4 v1, 0x3

    .line 120
    invoke-direct {v0, p0, v1}, Low;-><init>(Lxw;I)V

    .line 121
    .line 122
    .line 123
    iput-object v0, p0, Lxw;->q:Low;

    .line 124
    .line 125
    new-instance v0, Lrw;

    .line 126
    .line 127
    invoke-direct {v0, p0}, Lrw;-><init>(Lxw;)V

    .line 128
    .line 129
    .line 130
    iput-object v0, p0, Lxw;->r:Lrw;

    .line 131
    .line 132
    const/4 v0, -0x1

    .line 133
    iput v0, p0, Lxw;->s:I

    .line 134
    .line 135
    new-instance v0, Lsw;

    .line 136
    .line 137
    invoke-direct {v0, p0}, Lsw;-><init>(Lxw;)V

    .line 138
    .line 139
    .line 140
    iput-object v0, p0, Lxw;->x:Lsw;

    .line 141
    .line 142
    new-instance v0, Lfr;

    .line 143
    .line 144
    const/16 v1, 0x16

    .line 145
    .line 146
    invoke-direct {v0, v1}, Lfr;-><init>(I)V

    .line 147
    .line 148
    .line 149
    iput-object v0, p0, Lxw;->y:Lfr;

    .line 150
    .line 151
    new-instance v0, Ljava/util/ArrayDeque;

    .line 152
    .line 153
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 154
    .line 155
    .line 156
    iput-object v0, p0, Lxw;->C:Ljava/util/ArrayDeque;

    .line 157
    .line 158
    new-instance v0, La9;

    .line 159
    .line 160
    const/16 v1, 0x8

    .line 161
    .line 162
    invoke-direct {v0, v1, p0}, La9;-><init>(ILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iput-object v0, p0, Lxw;->M:La9;

    .line 166
    .line 167
    return-void
.end method

.method public static F(I)Z
    .locals 1

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static G(Liw;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Liw;->y:Lxw;

    .line 5
    .line 6
    iget-object p0, p0, Lxw;->c:Lp21;

    .line 7
    .line 8
    invoke-virtual {p0}, Lp21;->m()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    move v2, v1

    .line 18
    move v3, v2

    .line 19
    :cond_0
    if-ge v3, v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    check-cast v4, Liw;

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-static {v4}, Lxw;->G(Liw;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    :cond_1
    if-eqz v2, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_2
    return v1
.end method

.method public static I(Liw;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v0, p0, Liw;->G:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Liw;->w:Lxw;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Liw;->z:Liw;

    .line 13
    .line 14
    invoke-static {p0}, Lxw;->I(Liw;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_2
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static J(Liw;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Liw;->w:Lxw;

    .line 5
    .line 6
    iget-object v1, v0, Lxw;->w:Liw;

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, v0, Lxw;->v:Liw;

    .line 15
    .line 16
    invoke-static {p0}, Lxw;->J(Liw;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method


# virtual methods
.method public final A(I)Liw;
    .locals 5

    .line 1
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 2
    .line 3
    iget-object v1, v0, Lp21;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Liw;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget v4, v3, Liw;->A:I

    .line 24
    .line 25
    if-ne v4, p1, :cond_0

    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, v0, Lp21;->g:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lex;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    iget-object v1, v1, Lex;->c:Liw;

    .line 58
    .line 59
    iget v2, v1, Liw;->A:I

    .line 60
    .line 61
    if-ne v2, p1, :cond_2

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    const/4 p1, 0x0

    .line 65
    return-object p1
.end method

.method public final B(Ljava/lang/String;)Liw;
    .locals 5

    .line 1
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 2
    .line 3
    iget-object v1, v0, Lp21;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Liw;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget-object v4, v3, Liw;->C:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    return-object v3

    .line 32
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, v0, Lp21;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lex;

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    iget-object v1, v1, Lex;->c:Liw;

    .line 62
    .line 63
    iget-object v2, v1, Liw;->C:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    const/4 p1, 0x0

    .line 73
    return-object p1
.end method

.method public final C(Liw;)Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p1, Liw;->I:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p1, Liw;->B:I

    .line 7
    .line 8
    if-gtz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Lxw;->u:Li30;

    .line 12
    .line 13
    invoke-virtual {v0}, Li30;->L()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lxw;->u:Li30;

    .line 20
    .line 21
    iget p1, p1, Liw;->B:I

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Li30;->K(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    check-cast p1, Landroid/view/ViewGroup;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method public final D()Lsw;
    .locals 1

    .line 1
    iget-object v0, p0, Lxw;->v:Liw;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Liw;->w:Lxw;

    .line 6
    .line 7
    invoke-virtual {v0}, Lxw;->D()Lsw;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lxw;->x:Lsw;

    .line 13
    .line 14
    return-object v0
.end method

.method public final E()Lfr;
    .locals 1

    .line 1
    iget-object v0, p0, Lxw;->v:Liw;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Liw;->w:Lxw;

    .line 6
    .line 7
    invoke-virtual {v0}, Lxw;->E()Lfr;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lxw;->y:Lfr;

    .line 13
    .line 14
    return-object v0
.end method

.method public final H()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lxw;->v:Liw;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, v0, Liw;->x:Lkw;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget-boolean v1, v0, Liw;->p:Z

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Liw;->k()Lxw;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lxw;->H()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    :goto_0
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method public final K(IZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string p2, "No activity"

    .line 12
    .line 13
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 18
    .line 19
    iget p2, p0, Lxw;->s:I

    .line 20
    .line 21
    if-ne p1, p2, :cond_2

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_2
    iput p1, p0, Lxw;->s:I

    .line 25
    .line 26
    iget-object p1, p0, Lxw;->c:Lp21;

    .line 27
    .line 28
    iget-object p2, p1, Lp21;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p2, Ljava/util/HashMap;

    .line 31
    .line 32
    iget-object v0, p1, Lp21;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    move v3, v2

    .line 42
    :cond_3
    :goto_1
    if-ge v3, v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    check-cast v4, Liw;

    .line 51
    .line 52
    iget-object v4, v4, Liw;->j:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Lex;

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    invoke-virtual {v4}, Lex;->k()V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lex;

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    invoke-virtual {v0}, Lex;->k()V

    .line 89
    .line 90
    .line 91
    iget-object v1, v0, Lex;->c:Liw;

    .line 92
    .line 93
    iget-boolean v3, v1, Liw;->q:Z

    .line 94
    .line 95
    if-eqz v3, :cond_5

    .line 96
    .line 97
    invoke-virtual {v1}, Liw;->q()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_5

    .line 102
    .line 103
    invoke-virtual {p1, v0}, Lp21;->u(Lex;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    invoke-virtual {p0}, Lxw;->Y()V

    .line 108
    .line 109
    .line 110
    iget-boolean p1, p0, Lxw;->D:Z

    .line 111
    .line 112
    if-eqz p1, :cond_7

    .line 113
    .line 114
    iget-object p1, p0, Lxw;->t:Lkw;

    .line 115
    .line 116
    if-eqz p1, :cond_7

    .line 117
    .line 118
    iget p2, p0, Lxw;->s:I

    .line 119
    .line 120
    const/4 v0, 0x7

    .line 121
    if-ne p2, v0, :cond_7

    .line 122
    .line 123
    iget-object p1, p1, Lkw;->A:Li5;

    .line 124
    .line 125
    invoke-virtual {p1}, Li5;->invalidateOptionsMenu()V

    .line 126
    .line 127
    .line 128
    iput-boolean v2, p0, Lxw;->D:Z

    .line 129
    .line 130
    :cond_7
    :goto_3
    return-void
.end method

.method public final L()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lxw;->E:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lxw;->F:Z

    .line 10
    .line 11
    iget-object v1, p0, Lxw;->L:Lax;

    .line 12
    .line 13
    iput-boolean v0, v1, Lax;->g:Z

    .line 14
    .line 15
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 16
    .line 17
    invoke-virtual {v0}, Lp21;->n()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Liw;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v1, v1, Liw;->y:Lxw;

    .line 40
    .line 41
    invoke-virtual {v1}, Lxw;->L()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    return-void
.end method

.method public final M()Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Lxw;->N(II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final N(II)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lxw;->y(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Lxw;->x(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lxw;->w:Liw;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Liw;->h()Lxw;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lxw;->M()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return v0

    .line 26
    :cond_0
    iget-object v1, p0, Lxw;->I:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v2, p0, Lxw;->J:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p0, v1, v2, p1, p2}, Lxw;->O(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iput-boolean v0, p0, Lxw;->b:Z

    .line 37
    .line 38
    :try_start_0
    iget-object p2, p0, Lxw;->I:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v0, p0, Lxw;->J:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p0, p2, v0}, Lxw;->Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lxw;->d()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-virtual {p0}, Lxw;->d()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lxw;->a0()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lxw;->u()V

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, Lxw;->c:Lp21;

    .line 61
    .line 62
    iget-object p2, p2, Lp21;->g:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface {p2, v0}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 76
    .line 77
    .line 78
    return p1
.end method

.method public final O(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p4, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move p4, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p4, v1

    .line 9
    :goto_0
    iget-object v2, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-eqz v2, :cond_9

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_1
    if-gez p3, :cond_3

    .line 22
    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    move v3, v1

    .line 26
    goto :goto_4

    .line 27
    :cond_2
    iget-object p3, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    add-int/lit8 v3, p3, -0x1

    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_3
    iget-object v2, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    sub-int/2addr v2, v0

    .line 43
    :goto_1
    if-ltz v2, :cond_5

    .line 44
    .line 45
    iget-object v4, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lg9;

    .line 52
    .line 53
    if-ltz p3, :cond_4

    .line 54
    .line 55
    iget v4, v4, Lg9;->s:I

    .line 56
    .line 57
    if-ne p3, v4, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_5
    :goto_2
    if-gez v2, :cond_6

    .line 64
    .line 65
    move v3, v2

    .line 66
    goto :goto_4

    .line 67
    :cond_6
    if-eqz p4, :cond_7

    .line 68
    .line 69
    move v3, v2

    .line 70
    :goto_3
    if-lez v3, :cond_9

    .line 71
    .line 72
    iget-object p4, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 73
    .line 74
    add-int/lit8 v2, v3, -0x1

    .line 75
    .line 76
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p4

    .line 80
    check-cast p4, Lg9;

    .line 81
    .line 82
    if-ltz p3, :cond_9

    .line 83
    .line 84
    iget p4, p4, Lg9;->s:I

    .line 85
    .line 86
    if-ne p3, p4, :cond_9

    .line 87
    .line 88
    add-int/lit8 v3, v3, -0x1

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_7
    iget-object p3, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    sub-int/2addr p3, v0

    .line 98
    if-ne v2, p3, :cond_8

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_8
    add-int/lit8 v3, v2, 0x1

    .line 102
    .line 103
    :cond_9
    :goto_4
    if-gez v3, :cond_a

    .line 104
    .line 105
    return v1

    .line 106
    :cond_a
    iget-object p3, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    sub-int/2addr p3, v0

    .line 113
    :goto_5
    if-lt p3, v3, :cond_b

    .line 114
    .line 115
    iget-object p4, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p4

    .line 121
    check-cast p4, Lg9;

    .line 122
    .line 123
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    add-int/lit8 p3, p3, -0x1

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_b
    return v0
.end method

.method public final P(Liw;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Liw;->q()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-boolean v1, p1, Liw;->E:Z

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-void

    .line 23
    :cond_2
    :goto_0
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 24
    .line 25
    iget-object v1, v0, Lp21;->f:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    monitor-enter v1

    .line 30
    :try_start_0
    iget-object v0, v0, Lp21;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p1, Liw;->p:Z

    .line 40
    .line 41
    invoke-static {p1}, Lxw;->G(Liw;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v1, 0x1

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iput-boolean v1, p0, Lxw;->D:Z

    .line 49
    .line 50
    :cond_3
    iput-boolean v1, p1, Liw;->q:Z

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lxw;->X(Liw;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p1
.end method

.method public final Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v1, v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lg9;

    .line 31
    .line 32
    iget-boolean v3, v3, Lg9;->p:Z

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    if-eq v2, v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, v2, v1}, Lxw;->z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    :goto_1
    if-ge v2, v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lg9;

    .line 74
    .line 75
    iget-boolean v3, v3, Lg9;->p:Z

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Lxw;->z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v1, v2, -0x1

    .line 86
    .line 87
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    if-eq v2, v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0, p1, p2, v2, v0}, Lxw;->z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_2
    return-void

    .line 96
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string p2, "Internal error with the back stack records"

    .line 99
    .line 100
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p1
.end method

.method public final R(Landroid/os/Parcelable;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/String;

    .line 26
    .line 27
    const-string v4, "result_"

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    iget-object v5, v0, Lxw;->t:Lkw;

    .line 42
    .line 43
    iget-object v5, v5, Lkw;->x:Li5;

    .line 44
    .line 45
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 50
    .line 51
    .line 52
    const/4 v5, 0x7

    .line 53
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget-object v5, v0, Lxw;->k:Ljava/util/Map;

    .line 58
    .line 59
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const-string v5, "state"

    .line 81
    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    const-string v6, "fragment_"

    .line 91
    .line 92
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_2

    .line 97
    .line 98
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    iget-object v6, v0, Lxw;->t:Lkw;

    .line 105
    .line 106
    iget-object v6, v6, Lkw;->x:Li5;

    .line 107
    .line 108
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, Ldx;

    .line 120
    .line 121
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_3
    iget-object v3, v0, Lxw;->c:Lp21;

    .line 126
    .line 127
    iget-object v4, v3, Lp21;->h:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v4, Ljava/util/HashMap;

    .line 130
    .line 131
    iget-object v6, v3, Lp21;->g:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v6, Ljava/util/HashMap;

    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    const/4 v9, 0x0

    .line 143
    :goto_2
    if-ge v9, v7, :cond_4

    .line 144
    .line 145
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    add-int/lit8 v9, v9, 0x1

    .line 150
    .line 151
    check-cast v10, Ldx;

    .line 152
    .line 153
    iget-object v11, v10, Ldx;->g:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v4, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Lyw;

    .line 164
    .line 165
    if-nez v1, :cond_5

    .line 166
    .line 167
    return-void

    .line 168
    :cond_5
    invoke-virtual {v6}, Ljava/util/HashMap;->clear()V

    .line 169
    .line 170
    .line 171
    iget-object v2, v1, Lyw;->f:Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    const/4 v5, 0x0

    .line 178
    :cond_6
    :goto_3
    iget-object v7, v0, Lxw;->l:Ll92;

    .line 179
    .line 180
    const/4 v9, 0x2

    .line 181
    if-ge v5, v4, :cond_a

    .line 182
    .line 183
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    add-int/lit8 v5, v5, 0x1

    .line 188
    .line 189
    check-cast v10, Ljava/lang/String;

    .line 190
    .line 191
    iget-object v11, v3, Lp21;->h:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v11, Ljava/util/HashMap;

    .line 194
    .line 195
    invoke-virtual {v11, v10}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    check-cast v10, Ldx;

    .line 200
    .line 201
    if-eqz v10, :cond_6

    .line 202
    .line 203
    iget-object v11, v0, Lxw;->L:Lax;

    .line 204
    .line 205
    iget-object v12, v10, Ldx;->g:Ljava/lang/String;

    .line 206
    .line 207
    iget-object v11, v11, Lax;->b:Ljava/util/HashMap;

    .line 208
    .line 209
    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    check-cast v11, Liw;

    .line 214
    .line 215
    if-eqz v11, :cond_8

    .line 216
    .line 217
    invoke-static {v9}, Lxw;->F(I)Z

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    if-eqz v12, :cond_7

    .line 222
    .line 223
    invoke-virtual {v11}, Liw;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    :cond_7
    new-instance v12, Lex;

    .line 227
    .line 228
    invoke-direct {v12, v7, v3, v11, v10}, Lex;-><init>(Ll92;Lp21;Liw;Ldx;)V

    .line 229
    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_8
    new-instance v11, Lex;

    .line 233
    .line 234
    iget-object v7, v0, Lxw;->t:Lkw;

    .line 235
    .line 236
    iget-object v7, v7, Lkw;->x:Li5;

    .line 237
    .line 238
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 239
    .line 240
    .line 241
    move-result-object v14

    .line 242
    invoke-virtual {v0}, Lxw;->D()Lsw;

    .line 243
    .line 244
    .line 245
    move-result-object v15

    .line 246
    iget-object v12, v0, Lxw;->l:Ll92;

    .line 247
    .line 248
    iget-object v13, v0, Lxw;->c:Lp21;

    .line 249
    .line 250
    move-object/from16 v16, v10

    .line 251
    .line 252
    invoke-direct/range {v11 .. v16}, Lex;-><init>(Ll92;Lp21;Ljava/lang/ClassLoader;Lsw;Ldx;)V

    .line 253
    .line 254
    .line 255
    move-object v12, v11

    .line 256
    :goto_4
    iget-object v7, v12, Lex;->c:Liw;

    .line 257
    .line 258
    iput-object v0, v7, Liw;->w:Lxw;

    .line 259
    .line 260
    invoke-static {v9}, Lxw;->F(I)Z

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    if-eqz v9, :cond_9

    .line 265
    .line 266
    invoke-virtual {v7}, Liw;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    :cond_9
    iget-object v7, v0, Lxw;->t:Lkw;

    .line 270
    .line 271
    iget-object v7, v7, Lkw;->x:Li5;

    .line 272
    .line 273
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-virtual {v12, v7}, Lex;->m(Ljava/lang/ClassLoader;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3, v12}, Lp21;->t(Lex;)V

    .line 281
    .line 282
    .line 283
    iget v7, v0, Lxw;->s:I

    .line 284
    .line 285
    iput v7, v12, Lex;->e:I

    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_a
    iget-object v2, v0, Lxw;->L:Lax;

    .line 289
    .line 290
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    new-instance v4, Ljava/util/ArrayList;

    .line 294
    .line 295
    iget-object v2, v2, Lax;->b:Ljava/util/HashMap;

    .line 296
    .line 297
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    const/4 v5, 0x0

    .line 309
    :goto_5
    const/4 v10, 0x1

    .line 310
    if-ge v5, v2, :cond_d

    .line 311
    .line 312
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v11

    .line 316
    add-int/lit8 v5, v5, 0x1

    .line 317
    .line 318
    check-cast v11, Liw;

    .line 319
    .line 320
    iget-object v12, v11, Liw;->j:Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v6, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v12

    .line 326
    if-eqz v12, :cond_b

    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_b
    invoke-static {v9}, Lxw;->F(I)Z

    .line 330
    .line 331
    .line 332
    move-result v12

    .line 333
    if-eqz v12, :cond_c

    .line 334
    .line 335
    invoke-virtual {v11}, Liw;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    iget-object v12, v1, Lyw;->f:Ljava/util/ArrayList;

    .line 339
    .line 340
    invoke-static {v12}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    :cond_c
    iget-object v12, v0, Lxw;->L:Lax;

    .line 344
    .line 345
    invoke-virtual {v12, v11}, Lax;->d(Liw;)V

    .line 346
    .line 347
    .line 348
    iput-object v0, v11, Liw;->w:Lxw;

    .line 349
    .line 350
    new-instance v12, Lex;

    .line 351
    .line 352
    invoke-direct {v12, v7, v3, v11}, Lex;-><init>(Ll92;Lp21;Liw;)V

    .line 353
    .line 354
    .line 355
    iput v10, v12, Lex;->e:I

    .line 356
    .line 357
    invoke-virtual {v12}, Lex;->k()V

    .line 358
    .line 359
    .line 360
    iput-boolean v10, v11, Liw;->q:Z

    .line 361
    .line 362
    invoke-virtual {v12}, Lex;->k()V

    .line 363
    .line 364
    .line 365
    goto :goto_5

    .line 366
    :cond_d
    iget-object v2, v1, Lyw;->g:Ljava/util/ArrayList;

    .line 367
    .line 368
    iget-object v4, v3, Lp21;->f:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v4, Ljava/util/ArrayList;

    .line 371
    .line 372
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 373
    .line 374
    .line 375
    if-eqz v2, :cond_10

    .line 376
    .line 377
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    const/4 v5, 0x0

    .line 382
    :goto_6
    if-ge v5, v4, :cond_10

    .line 383
    .line 384
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v6

    .line 388
    add-int/lit8 v5, v5, 0x1

    .line 389
    .line 390
    check-cast v6, Ljava/lang/String;

    .line 391
    .line 392
    invoke-virtual {v3, v6}, Lp21;->i(Ljava/lang/String;)Liw;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    if-eqz v7, :cond_f

    .line 397
    .line 398
    invoke-static {v9}, Lxw;->F(I)Z

    .line 399
    .line 400
    .line 401
    move-result v6

    .line 402
    if-eqz v6, :cond_e

    .line 403
    .line 404
    invoke-virtual {v7}, Liw;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    :cond_e
    invoke-virtual {v3, v7}, Lp21;->f(Liw;)V

    .line 408
    .line 409
    .line 410
    goto :goto_6

    .line 411
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 412
    .line 413
    const-string v2, "No instantiated fragment for ("

    .line 414
    .line 415
    const-string v3, ")"

    .line 416
    .line 417
    invoke-static {v2, v6, v3}, Lex0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    throw v1

    .line 425
    :cond_10
    iget-object v2, v1, Lyw;->h:[Lh9;

    .line 426
    .line 427
    if-eqz v2, :cond_18

    .line 428
    .line 429
    new-instance v2, Ljava/util/ArrayList;

    .line 430
    .line 431
    iget-object v4, v1, Lyw;->h:[Lh9;

    .line 432
    .line 433
    array-length v4, v4

    .line 434
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 435
    .line 436
    .line 437
    iput-object v2, v0, Lxw;->d:Ljava/util/ArrayList;

    .line 438
    .line 439
    const/4 v2, 0x0

    .line 440
    :goto_7
    iget-object v4, v1, Lyw;->h:[Lh9;

    .line 441
    .line 442
    array-length v5, v4

    .line 443
    if-ge v2, v5, :cond_17

    .line 444
    .line 445
    aget-object v4, v4, v2

    .line 446
    .line 447
    iget-object v5, v4, Lh9;->g:Ljava/util/ArrayList;

    .line 448
    .line 449
    new-instance v6, Lg9;

    .line 450
    .line 451
    invoke-direct {v6, v0}, Lg9;-><init>(Lxw;)V

    .line 452
    .line 453
    .line 454
    iget-object v7, v4, Lh9;->f:[I

    .line 455
    .line 456
    const/4 v11, 0x0

    .line 457
    const/4 v12, 0x0

    .line 458
    :goto_8
    array-length v13, v7

    .line 459
    if-ge v11, v13, :cond_13

    .line 460
    .line 461
    new-instance v13, Lix;

    .line 462
    .line 463
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 464
    .line 465
    .line 466
    add-int/lit8 v14, v11, 0x1

    .line 467
    .line 468
    aget v15, v7, v11

    .line 469
    .line 470
    iput v15, v13, Lix;->a:I

    .line 471
    .line 472
    invoke-static {v9}, Lxw;->F(I)Z

    .line 473
    .line 474
    .line 475
    move-result v15

    .line 476
    if-eqz v15, :cond_11

    .line 477
    .line 478
    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    aget v15, v7, v14

    .line 482
    .line 483
    :cond_11
    invoke-static {}, Lu50;->values()[Lu50;

    .line 484
    .line 485
    .line 486
    move-result-object v15

    .line 487
    move/from16 p1, v9

    .line 488
    .line 489
    iget-object v9, v4, Lh9;->h:[I

    .line 490
    .line 491
    aget v9, v9, v12

    .line 492
    .line 493
    aget-object v9, v15, v9

    .line 494
    .line 495
    iput-object v9, v13, Lix;->h:Lu50;

    .line 496
    .line 497
    invoke-static {}, Lu50;->values()[Lu50;

    .line 498
    .line 499
    .line 500
    move-result-object v9

    .line 501
    iget-object v15, v4, Lh9;->i:[I

    .line 502
    .line 503
    aget v15, v15, v12

    .line 504
    .line 505
    aget-object v9, v9, v15

    .line 506
    .line 507
    iput-object v9, v13, Lix;->i:Lu50;

    .line 508
    .line 509
    add-int/lit8 v9, v11, 0x2

    .line 510
    .line 511
    aget v14, v7, v14

    .line 512
    .line 513
    if-eqz v14, :cond_12

    .line 514
    .line 515
    move v14, v10

    .line 516
    goto :goto_9

    .line 517
    :cond_12
    const/4 v14, 0x0

    .line 518
    :goto_9
    iput-boolean v14, v13, Lix;->c:Z

    .line 519
    .line 520
    add-int/lit8 v14, v11, 0x3

    .line 521
    .line 522
    aget v9, v7, v9

    .line 523
    .line 524
    iput v9, v13, Lix;->d:I

    .line 525
    .line 526
    add-int/lit8 v15, v11, 0x4

    .line 527
    .line 528
    aget v14, v7, v14

    .line 529
    .line 530
    iput v14, v13, Lix;->e:I

    .line 531
    .line 532
    add-int/lit8 v16, v11, 0x5

    .line 533
    .line 534
    aget v15, v7, v15

    .line 535
    .line 536
    iput v15, v13, Lix;->f:I

    .line 537
    .line 538
    add-int/lit8 v11, v11, 0x6

    .line 539
    .line 540
    aget v8, v7, v16

    .line 541
    .line 542
    iput v8, v13, Lix;->g:I

    .line 543
    .line 544
    iput v9, v6, Lg9;->b:I

    .line 545
    .line 546
    iput v14, v6, Lg9;->c:I

    .line 547
    .line 548
    iput v15, v6, Lg9;->d:I

    .line 549
    .line 550
    iput v8, v6, Lg9;->e:I

    .line 551
    .line 552
    invoke-virtual {v6, v13}, Lg9;->b(Lix;)V

    .line 553
    .line 554
    .line 555
    add-int/lit8 v12, v12, 0x1

    .line 556
    .line 557
    move/from16 v9, p1

    .line 558
    .line 559
    goto :goto_8

    .line 560
    :cond_13
    move/from16 p1, v9

    .line 561
    .line 562
    iget v7, v4, Lh9;->j:I

    .line 563
    .line 564
    iput v7, v6, Lg9;->f:I

    .line 565
    .line 566
    iget-object v7, v4, Lh9;->k:Ljava/lang/String;

    .line 567
    .line 568
    iput-object v7, v6, Lg9;->i:Ljava/lang/String;

    .line 569
    .line 570
    iput-boolean v10, v6, Lg9;->g:Z

    .line 571
    .line 572
    iget v7, v4, Lh9;->m:I

    .line 573
    .line 574
    iput v7, v6, Lg9;->j:I

    .line 575
    .line 576
    iget-object v7, v4, Lh9;->n:Ljava/lang/CharSequence;

    .line 577
    .line 578
    iput-object v7, v6, Lg9;->k:Ljava/lang/CharSequence;

    .line 579
    .line 580
    iget v7, v4, Lh9;->o:I

    .line 581
    .line 582
    iput v7, v6, Lg9;->l:I

    .line 583
    .line 584
    iget-object v7, v4, Lh9;->p:Ljava/lang/CharSequence;

    .line 585
    .line 586
    iput-object v7, v6, Lg9;->m:Ljava/lang/CharSequence;

    .line 587
    .line 588
    iget-object v7, v4, Lh9;->q:Ljava/util/ArrayList;

    .line 589
    .line 590
    iput-object v7, v6, Lg9;->n:Ljava/util/ArrayList;

    .line 591
    .line 592
    iget-object v7, v4, Lh9;->r:Ljava/util/ArrayList;

    .line 593
    .line 594
    iput-object v7, v6, Lg9;->o:Ljava/util/ArrayList;

    .line 595
    .line 596
    iget-boolean v7, v4, Lh9;->s:Z

    .line 597
    .line 598
    iput-boolean v7, v6, Lg9;->p:Z

    .line 599
    .line 600
    iget v4, v4, Lh9;->l:I

    .line 601
    .line 602
    iput v4, v6, Lg9;->s:I

    .line 603
    .line 604
    const/4 v4, 0x0

    .line 605
    :goto_a
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 606
    .line 607
    .line 608
    move-result v7

    .line 609
    if-ge v4, v7, :cond_15

    .line 610
    .line 611
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v7

    .line 615
    check-cast v7, Ljava/lang/String;

    .line 616
    .line 617
    if-eqz v7, :cond_14

    .line 618
    .line 619
    iget-object v8, v6, Lg9;->a:Ljava/util/ArrayList;

    .line 620
    .line 621
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v8

    .line 625
    check-cast v8, Lix;

    .line 626
    .line 627
    invoke-virtual {v3, v7}, Lp21;->i(Ljava/lang/String;)Liw;

    .line 628
    .line 629
    .line 630
    move-result-object v7

    .line 631
    iput-object v7, v8, Lix;->b:Liw;

    .line 632
    .line 633
    :cond_14
    add-int/lit8 v4, v4, 0x1

    .line 634
    .line 635
    goto :goto_a

    .line 636
    :cond_15
    invoke-virtual {v6, v10}, Lg9;->c(I)V

    .line 637
    .line 638
    .line 639
    invoke-static/range {p1 .. p1}, Lxw;->F(I)Z

    .line 640
    .line 641
    .line 642
    move-result v4

    .line 643
    if-eqz v4, :cond_16

    .line 644
    .line 645
    invoke-virtual {v6}, Lg9;->toString()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    new-instance v4, Lf80;

    .line 649
    .line 650
    invoke-direct {v4}, Lf80;-><init>()V

    .line 651
    .line 652
    .line 653
    new-instance v5, Ljava/io/PrintWriter;

    .line 654
    .line 655
    invoke-direct {v5, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 656
    .line 657
    .line 658
    const-string v4, "  "

    .line 659
    .line 660
    const/4 v7, 0x0

    .line 661
    invoke-virtual {v6, v4, v5, v7}, Lg9;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    .line 665
    .line 666
    .line 667
    goto :goto_b

    .line 668
    :cond_16
    const/4 v7, 0x0

    .line 669
    :goto_b
    iget-object v4, v0, Lxw;->d:Ljava/util/ArrayList;

    .line 670
    .line 671
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    add-int/lit8 v2, v2, 0x1

    .line 675
    .line 676
    move/from16 v9, p1

    .line 677
    .line 678
    goto/16 :goto_7

    .line 679
    .line 680
    :cond_17
    const/4 v7, 0x0

    .line 681
    goto :goto_c

    .line 682
    :cond_18
    const/4 v7, 0x0

    .line 683
    const/4 v2, 0x0

    .line 684
    iput-object v2, v0, Lxw;->d:Ljava/util/ArrayList;

    .line 685
    .line 686
    :goto_c
    iget-object v2, v0, Lxw;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 687
    .line 688
    iget v4, v1, Lyw;->i:I

    .line 689
    .line 690
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 691
    .line 692
    .line 693
    iget-object v2, v1, Lyw;->j:Ljava/lang/String;

    .line 694
    .line 695
    if-eqz v2, :cond_19

    .line 696
    .line 697
    invoke-virtual {v3, v2}, Lp21;->i(Ljava/lang/String;)Liw;

    .line 698
    .line 699
    .line 700
    move-result-object v2

    .line 701
    iput-object v2, v0, Lxw;->w:Liw;

    .line 702
    .line 703
    invoke-virtual {v0, v2}, Lxw;->q(Liw;)V

    .line 704
    .line 705
    .line 706
    :cond_19
    iget-object v2, v1, Lyw;->k:Ljava/util/ArrayList;

    .line 707
    .line 708
    if-eqz v2, :cond_1a

    .line 709
    .line 710
    move v8, v7

    .line 711
    :goto_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 712
    .line 713
    .line 714
    move-result v3

    .line 715
    if-ge v8, v3, :cond_1a

    .line 716
    .line 717
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v3

    .line 721
    check-cast v3, Ljava/lang/String;

    .line 722
    .line 723
    iget-object v4, v1, Lyw;->l:Ljava/util/ArrayList;

    .line 724
    .line 725
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v4

    .line 729
    check-cast v4, Li9;

    .line 730
    .line 731
    iget-object v5, v0, Lxw;->j:Ljava/util/Map;

    .line 732
    .line 733
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    add-int/lit8 v8, v8, 0x1

    .line 737
    .line 738
    goto :goto_d

    .line 739
    :cond_1a
    new-instance v2, Ljava/util/ArrayDeque;

    .line 740
    .line 741
    iget-object v1, v1, Lyw;->m:Ljava/util/ArrayList;

    .line 742
    .line 743
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 744
    .line 745
    .line 746
    iput-object v2, v0, Lxw;->C:Ljava/util/ArrayDeque;

    .line 747
    .line 748
    return-void
.end method

.method public final S()Landroid/os/Bundle;
    .locals 13

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lxw;->e()Ljava/util/HashSet;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ltn;

    .line 27
    .line 28
    iget-boolean v5, v2, Ltn;->e:Z

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-static {v4}, Lxw;->F(I)Z

    .line 33
    .line 34
    .line 35
    iput-boolean v3, v2, Ltn;->e:Z

    .line 36
    .line 37
    invoke-virtual {v2}, Ltn;->c()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0}, Lxw;->e()Ljava/util/HashSet;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ltn;

    .line 60
    .line 61
    invoke-virtual {v2}, Ltn;->e()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const/4 v1, 0x1

    .line 66
    invoke-virtual {p0, v1}, Lxw;->y(Z)Z

    .line 67
    .line 68
    .line 69
    iput-boolean v1, p0, Lxw;->E:Z

    .line 70
    .line 71
    iget-object v2, p0, Lxw;->L:Lax;

    .line 72
    .line 73
    iput-boolean v1, v2, Lax;->g:Z

    .line 74
    .line 75
    iget-object v1, p0, Lxw;->c:Lp21;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v2, Ljava/util/ArrayList;

    .line 81
    .line 82
    iget-object v1, v1, Lp21;->g:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Ljava/util/HashMap;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    const/4 v6, 0x0

    .line 106
    if-eqz v5, :cond_f

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    check-cast v5, Lex;

    .line 113
    .line 114
    if-eqz v5, :cond_3

    .line 115
    .line 116
    iget-object v7, v5, Lex;->c:Liw;

    .line 117
    .line 118
    new-instance v8, Ldx;

    .line 119
    .line 120
    invoke-direct {v8, v7}, Ldx;-><init>(Liw;)V

    .line 121
    .line 122
    .line 123
    iget v9, v7, Liw;->f:I

    .line 124
    .line 125
    const/4 v10, -0x1

    .line 126
    if-le v9, v10, :cond_d

    .line 127
    .line 128
    iget-object v9, v8, Ldx;->r:Landroid/os/Bundle;

    .line 129
    .line 130
    if-nez v9, :cond_d

    .line 131
    .line 132
    new-instance v9, Landroid/os/Bundle;

    .line 133
    .line 134
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7, v9}, Liw;->z(Landroid/os/Bundle;)V

    .line 138
    .line 139
    .line 140
    iget-object v10, v7, Liw;->V:Lgw3;

    .line 141
    .line 142
    invoke-virtual {v10, v9}, Lgw3;->y(Landroid/os/Bundle;)V

    .line 143
    .line 144
    .line 145
    iget-object v10, v7, Liw;->y:Lxw;

    .line 146
    .line 147
    invoke-virtual {v10}, Lxw;->S()Landroid/os/Bundle;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    const-string v11, "android:support:fragments"

    .line 152
    .line 153
    invoke-virtual {v9, v11, v10}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 154
    .line 155
    .line 156
    iget-object v10, v5, Lex;->a:Ll92;

    .line 157
    .line 158
    invoke-virtual {v10, v3}, Ll92;->q(Z)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result v10

    .line 165
    if-eqz v10, :cond_4

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_4
    move-object v6, v9

    .line 169
    :goto_3
    iget-object v9, v7, Liw;->J:Landroid/view/View;

    .line 170
    .line 171
    if-eqz v9, :cond_5

    .line 172
    .line 173
    invoke-virtual {v5}, Lex;->o()V

    .line 174
    .line 175
    .line 176
    :cond_5
    iget-object v9, v7, Liw;->h:Landroid/util/SparseArray;

    .line 177
    .line 178
    if-eqz v9, :cond_7

    .line 179
    .line 180
    if-nez v6, :cond_6

    .line 181
    .line 182
    new-instance v6, Landroid/os/Bundle;

    .line 183
    .line 184
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 185
    .line 186
    .line 187
    :cond_6
    const-string v9, "android:view_state"

    .line 188
    .line 189
    iget-object v10, v7, Liw;->h:Landroid/util/SparseArray;

    .line 190
    .line 191
    invoke-virtual {v6, v9, v10}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 192
    .line 193
    .line 194
    :cond_7
    iget-object v9, v7, Liw;->i:Landroid/os/Bundle;

    .line 195
    .line 196
    if-eqz v9, :cond_9

    .line 197
    .line 198
    if-nez v6, :cond_8

    .line 199
    .line 200
    new-instance v6, Landroid/os/Bundle;

    .line 201
    .line 202
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 203
    .line 204
    .line 205
    :cond_8
    const-string v9, "android:view_registry_state"

    .line 206
    .line 207
    iget-object v10, v7, Liw;->i:Landroid/os/Bundle;

    .line 208
    .line 209
    invoke-virtual {v6, v9, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 210
    .line 211
    .line 212
    :cond_9
    iget-boolean v9, v7, Liw;->L:Z

    .line 213
    .line 214
    if-nez v9, :cond_b

    .line 215
    .line 216
    if-nez v6, :cond_a

    .line 217
    .line 218
    new-instance v6, Landroid/os/Bundle;

    .line 219
    .line 220
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 221
    .line 222
    .line 223
    :cond_a
    const-string v9, "android:user_visible_hint"

    .line 224
    .line 225
    iget-boolean v10, v7, Liw;->L:Z

    .line 226
    .line 227
    invoke-virtual {v6, v9, v10}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 228
    .line 229
    .line 230
    :cond_b
    iput-object v6, v8, Ldx;->r:Landroid/os/Bundle;

    .line 231
    .line 232
    iget-object v9, v7, Liw;->m:Ljava/lang/String;

    .line 233
    .line 234
    if-eqz v9, :cond_e

    .line 235
    .line 236
    if-nez v6, :cond_c

    .line 237
    .line 238
    new-instance v6, Landroid/os/Bundle;

    .line 239
    .line 240
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 241
    .line 242
    .line 243
    iput-object v6, v8, Ldx;->r:Landroid/os/Bundle;

    .line 244
    .line 245
    :cond_c
    iget-object v6, v8, Ldx;->r:Landroid/os/Bundle;

    .line 246
    .line 247
    const-string v9, "android:target_state"

    .line 248
    .line 249
    iget-object v10, v7, Liw;->m:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v6, v9, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    iget v6, v7, Liw;->n:I

    .line 255
    .line 256
    if-eqz v6, :cond_e

    .line 257
    .line 258
    iget-object v9, v8, Ldx;->r:Landroid/os/Bundle;

    .line 259
    .line 260
    const-string v10, "android:target_req_state"

    .line 261
    .line 262
    invoke-virtual {v9, v10, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 263
    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_d
    iget-object v6, v7, Liw;->g:Landroid/os/Bundle;

    .line 267
    .line 268
    iput-object v6, v8, Ldx;->r:Landroid/os/Bundle;

    .line 269
    .line 270
    :cond_e
    :goto_4
    iget-object v5, v5, Lex;->b:Lp21;

    .line 271
    .line 272
    iget-object v6, v7, Liw;->j:Ljava/lang/String;

    .line 273
    .line 274
    iget-object v5, v5, Lp21;->h:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v5, Ljava/util/HashMap;

    .line 277
    .line 278
    invoke-virtual {v5, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    check-cast v5, Ldx;

    .line 283
    .line 284
    iget-object v5, v7, Liw;->j:Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    invoke-static {v4}, Lxw;->F(I)Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-eqz v5, :cond_3

    .line 294
    .line 295
    invoke-virtual {v7}, Liw;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    iget-object v5, v7, Liw;->g:Landroid/os/Bundle;

    .line 299
    .line 300
    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    goto/16 :goto_2

    .line 304
    .line 305
    :cond_f
    iget-object v1, p0, Lxw;->c:Lp21;

    .line 306
    .line 307
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    new-instance v5, Ljava/util/ArrayList;

    .line 311
    .line 312
    iget-object v1, v1, Lp21;->h:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v1, Ljava/util/HashMap;

    .line 315
    .line 316
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    if-eqz v1, :cond_10

    .line 328
    .line 329
    invoke-static {v4}, Lxw;->F(I)Z

    .line 330
    .line 331
    .line 332
    return-object v0

    .line 333
    :cond_10
    iget-object v1, p0, Lxw;->c:Lp21;

    .line 334
    .line 335
    iget-object v7, v1, Lp21;->f:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v7, Ljava/util/ArrayList;

    .line 338
    .line 339
    monitor-enter v7

    .line 340
    :try_start_0
    iget-object v8, v1, Lp21;->f:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v8, Ljava/util/ArrayList;

    .line 343
    .line 344
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 345
    .line 346
    .line 347
    move-result v8

    .line 348
    if-eqz v8, :cond_11

    .line 349
    .line 350
    monitor-exit v7

    .line 351
    move-object v8, v6

    .line 352
    goto :goto_6

    .line 353
    :catchall_0
    move-exception v0

    .line 354
    goto/16 :goto_a

    .line 355
    .line 356
    :cond_11
    new-instance v8, Ljava/util/ArrayList;

    .line 357
    .line 358
    iget-object v9, v1, Lp21;->f:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v9, Ljava/util/ArrayList;

    .line 361
    .line 362
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 363
    .line 364
    .line 365
    move-result v9

    .line 366
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 367
    .line 368
    .line 369
    iget-object v1, v1, Lp21;->f:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v1, Ljava/util/ArrayList;

    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 374
    .line 375
    .line 376
    move-result v9

    .line 377
    move v10, v3

    .line 378
    :cond_12
    :goto_5
    if-ge v10, v9, :cond_13

    .line 379
    .line 380
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v11

    .line 384
    add-int/lit8 v10, v10, 0x1

    .line 385
    .line 386
    check-cast v11, Liw;

    .line 387
    .line 388
    iget-object v12, v11, Liw;->j:Ljava/lang/String;

    .line 389
    .line 390
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    invoke-static {v4}, Lxw;->F(I)Z

    .line 394
    .line 395
    .line 396
    move-result v12

    .line 397
    if-eqz v12, :cond_12

    .line 398
    .line 399
    invoke-virtual {v11}, Liw;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    goto :goto_5

    .line 403
    :cond_13
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 404
    :goto_6
    iget-object v1, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 405
    .line 406
    if-eqz v1, :cond_15

    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    if-lez v1, :cond_15

    .line 413
    .line 414
    new-array v7, v1, [Lh9;

    .line 415
    .line 416
    move v9, v3

    .line 417
    :goto_7
    if-ge v9, v1, :cond_16

    .line 418
    .line 419
    new-instance v10, Lh9;

    .line 420
    .line 421
    iget-object v11, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 422
    .line 423
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v11

    .line 427
    check-cast v11, Lg9;

    .line 428
    .line 429
    invoke-direct {v10, v11}, Lh9;-><init>(Lg9;)V

    .line 430
    .line 431
    .line 432
    aput-object v10, v7, v9

    .line 433
    .line 434
    invoke-static {v4}, Lxw;->F(I)Z

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    if-eqz v10, :cond_14

    .line 439
    .line 440
    iget-object v10, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 441
    .line 442
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v10

    .line 446
    invoke-static {v10}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    :cond_14
    add-int/lit8 v9, v9, 0x1

    .line 450
    .line 451
    goto :goto_7

    .line 452
    :cond_15
    move-object v7, v6

    .line 453
    :cond_16
    new-instance v1, Lyw;

    .line 454
    .line 455
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 456
    .line 457
    .line 458
    iput-object v6, v1, Lyw;->j:Ljava/lang/String;

    .line 459
    .line 460
    new-instance v4, Ljava/util/ArrayList;

    .line 461
    .line 462
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 463
    .line 464
    .line 465
    iput-object v4, v1, Lyw;->k:Ljava/util/ArrayList;

    .line 466
    .line 467
    new-instance v6, Ljava/util/ArrayList;

    .line 468
    .line 469
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 470
    .line 471
    .line 472
    iput-object v6, v1, Lyw;->l:Ljava/util/ArrayList;

    .line 473
    .line 474
    iput-object v2, v1, Lyw;->f:Ljava/util/ArrayList;

    .line 475
    .line 476
    iput-object v8, v1, Lyw;->g:Ljava/util/ArrayList;

    .line 477
    .line 478
    iput-object v7, v1, Lyw;->h:[Lh9;

    .line 479
    .line 480
    iget-object v2, p0, Lxw;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 481
    .line 482
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    iput v2, v1, Lyw;->i:I

    .line 487
    .line 488
    iget-object v2, p0, Lxw;->w:Liw;

    .line 489
    .line 490
    if-eqz v2, :cond_17

    .line 491
    .line 492
    iget-object v2, v2, Liw;->j:Ljava/lang/String;

    .line 493
    .line 494
    iput-object v2, v1, Lyw;->j:Ljava/lang/String;

    .line 495
    .line 496
    :cond_17
    iget-object v2, p0, Lxw;->j:Ljava/util/Map;

    .line 497
    .line 498
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 503
    .line 504
    .line 505
    iget-object v2, p0, Lxw;->j:Ljava/util/Map;

    .line 506
    .line 507
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 512
    .line 513
    .line 514
    new-instance v2, Ljava/util/ArrayList;

    .line 515
    .line 516
    iget-object v4, p0, Lxw;->C:Ljava/util/ArrayDeque;

    .line 517
    .line 518
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 519
    .line 520
    .line 521
    iput-object v2, v1, Lyw;->m:Ljava/util/ArrayList;

    .line 522
    .line 523
    const-string v2, "state"

    .line 524
    .line 525
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 526
    .line 527
    .line 528
    iget-object v1, p0, Lxw;->k:Ljava/util/Map;

    .line 529
    .line 530
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    if-eqz v2, :cond_18

    .line 543
    .line 544
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    check-cast v2, Ljava/lang/String;

    .line 549
    .line 550
    new-instance v4, Ljava/lang/StringBuilder;

    .line 551
    .line 552
    const-string v6, "result_"

    .line 553
    .line 554
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v4

    .line 564
    iget-object v6, p0, Lxw;->k:Ljava/util/Map;

    .line 565
    .line 566
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    check-cast v2, Landroid/os/Bundle;

    .line 571
    .line 572
    invoke-virtual {v0, v4, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 573
    .line 574
    .line 575
    goto :goto_8

    .line 576
    :cond_18
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    :goto_9
    if-ge v3, v1, :cond_19

    .line 581
    .line 582
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    add-int/lit8 v3, v3, 0x1

    .line 587
    .line 588
    check-cast v2, Ldx;

    .line 589
    .line 590
    new-instance v4, Landroid/os/Bundle;

    .line 591
    .line 592
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 593
    .line 594
    .line 595
    const-string v6, "state"

    .line 596
    .line 597
    invoke-virtual {v4, v6, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 598
    .line 599
    .line 600
    new-instance v6, Ljava/lang/StringBuilder;

    .line 601
    .line 602
    const-string v7, "fragment_"

    .line 603
    .line 604
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    iget-object v2, v2, Ldx;->g:Ljava/lang/String;

    .line 608
    .line 609
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    invoke-virtual {v0, v2, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 617
    .line 618
    .line 619
    goto :goto_9

    .line 620
    :cond_19
    return-object v0

    .line 621
    :goto_a
    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 622
    throw v0
.end method

.method public final T()V
    .locals 3

    .line 1
    iget-object v0, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lxw;->t:Lkw;

    .line 14
    .line 15
    iget-object v1, v1, Lkw;->y:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v2, p0, Lxw;->M:La9;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lxw;->t:Lkw;

    .line 23
    .line 24
    iget-object v1, v1, Lkw;->y:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object v2, p0, Lxw;->M:La9;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lxw;->a0()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw v1
.end method

.method public final U(Liw;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lxw;->C(Liw;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    instance-of v0, p1, Landroidx/fragment/app/FragmentContainerView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Landroidx/fragment/app/FragmentContainerView;

    .line 12
    .line 13
    xor-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final V(Liw;Lu50;)V
    .locals 2

    .line 1
    iget-object v0, p1, Liw;->j:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lxw;->c:Lp21;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lp21;->i(Ljava/lang/String;)Liw;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p1, Liw;->x:Lkw;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p1, Liw;->w:Lxw;

    .line 20
    .line 21
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    :cond_0
    iput-object p2, p1, Liw;->R:Lu50;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Fragment "

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, " is not an active fragment of FragmentManager "

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p2
.end method

.method public final W(Liw;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Liw;->j:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lxw;->c:Lp21;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lp21;->i(Ljava/lang/String;)Liw;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Liw;->x:Lkw;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p1, Liw;->w:Lxw;

    .line 22
    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "Fragment "

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, " is not an active fragment of FragmentManager "

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_1
    :goto_0
    iget-object v0, p0, Lxw;->w:Liw;

    .line 55
    .line 56
    iput-object p1, p0, Lxw;->w:Liw;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lxw;->q(Liw;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lxw;->w:Liw;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lxw;->q(Liw;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final X(Liw;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Lxw;->C(Liw;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    iget-object v1, p1, Liw;->M:Lhw;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    move v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v3, v1, Lhw;->b:I

    .line 15
    .line 16
    :goto_0
    if-nez v1, :cond_1

    .line 17
    .line 18
    move v4, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget v4, v1, Lhw;->c:I

    .line 21
    .line 22
    :goto_1
    add-int/2addr v4, v3

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    move v3, v2

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    iget v3, v1, Lhw;->d:I

    .line 28
    .line 29
    :goto_2
    add-int/2addr v3, v4

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    move v1, v2

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    iget v1, v1, Lhw;->e:I

    .line 35
    .line 36
    :goto_3
    add-int/2addr v1, v3

    .line 37
    if-lez v1, :cond_7

    .line 38
    .line 39
    const v1, 0x7f0902b2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-nez v3, :cond_4

    .line 47
    .line 48
    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Liw;

    .line 56
    .line 57
    iget-object p1, p1, Liw;->M:Lhw;

    .line 58
    .line 59
    if-nez p1, :cond_5

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_5
    iget-boolean v2, p1, Lhw;->a:Z

    .line 63
    .line 64
    :goto_4
    iget-object p1, v0, Liw;->M:Lhw;

    .line 65
    .line 66
    if-nez p1, :cond_6

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_6
    invoke-virtual {v0}, Liw;->f()Lhw;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-boolean v2, p1, Lhw;->a:Z

    .line 74
    .line 75
    :cond_7
    :goto_5
    return-void
.end method

.method public final Y()V
    .locals 7

    .line 1
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp21;->l()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :cond_0
    :goto_0
    if-ge v3, v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    check-cast v4, Lex;

    .line 22
    .line 23
    iget-object v5, v4, Lex;->c:Liw;

    .line 24
    .line 25
    iget-boolean v6, v5, Liw;->K:Z

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    iget-boolean v6, p0, Lxw;->b:Z

    .line 30
    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    iput-boolean v4, p0, Lxw;->H:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iput-boolean v2, v5, Liw;->K:Z

    .line 38
    .line 39
    invoke-virtual {v4}, Lex;->k()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-void
.end method

.method public final Z(Ljava/lang/IllegalStateException;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "FragmentManager"

    .line 6
    .line 7
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    const-string v0, "Activity state:"

    .line 11
    .line 12
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    new-instance v0, Lf80;

    .line 16
    .line 17
    invoke-direct {v0}, Lf80;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/io/PrintWriter;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 26
    .line 27
    const-string v3, "Failed dumping state"

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const-string v6, "  "

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    :try_start_0
    new-array v4, v4, [Ljava/lang/String;

    .line 36
    .line 37
    iget-object v0, v0, Lkw;->A:Li5;

    .line 38
    .line 39
    invoke-virtual {v0, v6, v5, v2, v4}, Li5;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    :try_start_1
    new-array v0, v4, [Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0, v6, v5, v2, v0}, Lxw;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_1
    move-exception v0

    .line 55
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 56
    .line 57
    .line 58
    :goto_0
    throw p1
.end method

.method public final a(Liw;)Lex;
    .locals 3

    .line 1
    iget-object v0, p1, Liw;->Q:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, v0}, Lgx;->c(Liw;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Lxw;->F(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Liw;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-virtual {p0, p1}, Lxw;->f(Liw;)Lex;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object p0, p1, Liw;->w:Lxw;

    .line 23
    .line 24
    iget-object v1, p0, Lxw;->c:Lp21;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lp21;->t(Lex;)V

    .line 27
    .line 28
    .line 29
    iget-boolean v2, p1, Liw;->E:Z

    .line 30
    .line 31
    if-nez v2, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Lp21;->f(Liw;)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    iput-boolean v1, p1, Liw;->q:Z

    .line 38
    .line 39
    iget-object v2, p1, Liw;->J:Landroid/view/View;

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    iput-boolean v1, p1, Liw;->N:Z

    .line 44
    .line 45
    :cond_2
    invoke-static {p1}, Lxw;->G(Liw;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    iput-boolean p1, p0, Lxw;->D:Z

    .line 53
    .line 54
    :cond_3
    return-object v0
.end method

.method public final a0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lxw;->h:Lqw;

    .line 14
    .line 15
    iput-boolean v2, v1, Lqw;->a:Z

    .line 16
    .line 17
    iget-object v1, v1, Lqw;->c:Lry;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Lrx;->a()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    iget-object v0, p0, Lxw;->h:Lqw;

    .line 30
    .line 31
    iget-object v1, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move v1, v3

    .line 42
    :goto_0
    if-lez v1, :cond_3

    .line 43
    .line 44
    iget-object v1, p0, Lxw;->v:Liw;

    .line 45
    .line 46
    invoke-static {v1}, Lxw;->J(Liw;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move v2, v3

    .line 54
    :goto_1
    iput-boolean v2, v0, Lqw;->a:Z

    .line 55
    .line 56
    iget-object v0, v0, Lqw;->c:Lry;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-interface {v0}, Lrx;->a()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_4
    return-void

    .line 64
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw v1
.end method

.method public final b(Lkw;Li30;Liw;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 2
    .line 3
    if-nez v0, :cond_12

    .line 4
    .line 5
    iput-object p1, p0, Lxw;->t:Lkw;

    .line 6
    .line 7
    iput-object p2, p0, Lxw;->u:Li30;

    .line 8
    .line 9
    iput-object p3, p0, Lxw;->v:Liw;

    .line 10
    .line 11
    iget-object p2, p0, Lxw;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance v0, Ltw;

    .line 16
    .line 17
    invoke-direct {v0, p3}, Ltw;-><init>(Liw;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    iget-object p2, p0, Lxw;->v:Liw;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lxw;->a0()V

    .line 34
    .line 35
    .line 36
    :cond_2
    if-eqz p1, :cond_4

    .line 37
    .line 38
    iget-object p2, p1, Lkw;->A:Li5;

    .line 39
    .line 40
    invoke-virtual {p2}, Lch;->i()Laj0;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p0, Lxw;->g:Laj0;

    .line 45
    .line 46
    if-eqz p3, :cond_3

    .line 47
    .line 48
    move-object v0, p3

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move-object v0, p1

    .line 51
    :goto_1
    iget-object v1, p0, Lxw;->h:Lqw;

    .line 52
    .line 53
    invoke-virtual {p2, v0, v1}, Laj0;->a(Lb60;Lqw;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    const/4 p2, 0x0

    .line 57
    if-eqz p3, :cond_6

    .line 58
    .line 59
    iget-object p1, p3, Liw;->w:Lxw;

    .line 60
    .line 61
    iget-object p1, p1, Lxw;->L:Lax;

    .line 62
    .line 63
    iget-object v0, p1, Lax;->c:Ljava/util/HashMap;

    .line 64
    .line 65
    iget-object v1, p3, Liw;->j:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lax;

    .line 72
    .line 73
    if-nez v1, :cond_5

    .line 74
    .line 75
    new-instance v1, Lax;

    .line 76
    .line 77
    iget-boolean p1, p1, Lax;->e:Z

    .line 78
    .line 79
    invoke-direct {v1, p1}, Lax;-><init>(Z)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p3, Liw;->j:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_5
    iput-object v1, p0, Lxw;->L:Lax;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    if-eqz p1, :cond_7

    .line 91
    .line 92
    iget-object p1, p1, Lkw;->A:Li5;

    .line 93
    .line 94
    invoke-virtual {p1}, Lch;->d()Lq61;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    new-instance v0, Lug0;

    .line 99
    .line 100
    sget-object v1, Lax;->h:Lzw;

    .line 101
    .line 102
    invoke-direct {v0, p1, v1}, Lug0;-><init>(Lq61;Lp61;)V

    .line 103
    .line 104
    .line 105
    const-class p1, Lax;

    .line 106
    .line 107
    invoke-virtual {v0, p1}, Lug0;->t(Ljava/lang/Class;)Lm61;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Lax;

    .line 112
    .line 113
    iput-object p1, p0, Lxw;->L:Lax;

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_7
    new-instance p1, Lax;

    .line 117
    .line 118
    invoke-direct {p1, p2}, Lax;-><init>(Z)V

    .line 119
    .line 120
    .line 121
    iput-object p1, p0, Lxw;->L:Lax;

    .line 122
    .line 123
    :goto_2
    iget-object p1, p0, Lxw;->L:Lax;

    .line 124
    .line 125
    iget-boolean v0, p0, Lxw;->E:Z

    .line 126
    .line 127
    if-nez v0, :cond_8

    .line 128
    .line 129
    iget-boolean v0, p0, Lxw;->F:Z

    .line 130
    .line 131
    if-eqz v0, :cond_9

    .line 132
    .line 133
    :cond_8
    const/4 p2, 0x1

    .line 134
    :cond_9
    iput-boolean p2, p1, Lax;->g:Z

    .line 135
    .line 136
    iget-object p2, p0, Lxw;->c:Lp21;

    .line 137
    .line 138
    iput-object p1, p2, Lp21;->i:Ljava/lang/Object;

    .line 139
    .line 140
    iget-object p1, p0, Lxw;->t:Lkw;

    .line 141
    .line 142
    if-eqz p1, :cond_a

    .line 143
    .line 144
    if-nez p3, :cond_a

    .line 145
    .line 146
    invoke-virtual {p1}, Lkw;->a()Lvq2;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance p2, Lpw;

    .line 151
    .line 152
    const/4 v0, 0x0

    .line 153
    invoke-direct {p2, v0, p0}, Lpw;-><init>(ILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    const-string v0, "android:support:fragments"

    .line 157
    .line 158
    invoke-virtual {p1, v0, p2}, Lvq2;->q(Ljava/lang/String;Lys0;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v0}, Lvq2;->e(Ljava/lang/String;)Landroid/os/Bundle;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-eqz p1, :cond_a

    .line 166
    .line 167
    invoke-virtual {p0, p1}, Lxw;->R(Landroid/os/Parcelable;)V

    .line 168
    .line 169
    .line 170
    :cond_a
    iget-object p1, p0, Lxw;->t:Lkw;

    .line 171
    .line 172
    if-eqz p1, :cond_c

    .line 173
    .line 174
    iget-object p1, p1, Lkw;->A:Li5;

    .line 175
    .line 176
    iget-object p1, p1, Lch;->m:Lbh;

    .line 177
    .line 178
    if-eqz p3, :cond_b

    .line 179
    .line 180
    new-instance p2, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    iget-object v0, p3, Liw;->j:Ljava/lang/String;

    .line 186
    .line 187
    const-string v1, ":"

    .line 188
    .line 189
    invoke-static {p2, v0, v1}, Lex0;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    goto :goto_3

    .line 194
    :cond_b
    const-string p2, ""

    .line 195
    .line 196
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    const-string v1, "FragmentManager:"

    .line 199
    .line 200
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    const-string v0, "StartActivityForResult"

    .line 211
    .line 212
    invoke-static {p2, v0}, Lex0;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    new-instance v1, Ln2;

    .line 217
    .line 218
    const/4 v2, 0x1

    .line 219
    invoke-direct {v1, v2}, Ln2;-><init>(I)V

    .line 220
    .line 221
    .line 222
    new-instance v2, Lf20;

    .line 223
    .line 224
    const/4 v3, 0x5

    .line 225
    invoke-direct {v2, v3, p0}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, v0, v1, v2}, Lbh;->b(Ljava/lang/String;Lyb;Lm2;)Lvq2;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iput-object v0, p0, Lxw;->z:Lvq2;

    .line 233
    .line 234
    const-string v0, "StartIntentSenderForResult"

    .line 235
    .line 236
    invoke-static {p2, v0}, Lex0;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    new-instance v1, Ln2;

    .line 241
    .line 242
    const/4 v2, 0x2

    .line 243
    invoke-direct {v1, v2}, Ln2;-><init>(I)V

    .line 244
    .line 245
    .line 246
    new-instance v2, Lug0;

    .line 247
    .line 248
    invoke-direct {v2, v3, p0}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, v0, v1, v2}, Lbh;->b(Ljava/lang/String;Lyb;Lm2;)Lvq2;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iput-object v0, p0, Lxw;->A:Lvq2;

    .line 256
    .line 257
    const-string v0, "RequestPermissions"

    .line 258
    .line 259
    invoke-static {p2, v0}, Lex0;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    new-instance v0, Ln2;

    .line 264
    .line 265
    const/4 v1, 0x0

    .line 266
    invoke-direct {v0, v1}, Ln2;-><init>(I)V

    .line 267
    .line 268
    .line 269
    new-instance v1, Lsq0;

    .line 270
    .line 271
    const/4 v2, 0x4

    .line 272
    invoke-direct {v1, v2, p0}, Lsq0;-><init>(ILjava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, p2, v0, v1}, Lbh;->b(Ljava/lang/String;Lyb;Lm2;)Lvq2;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    iput-object p1, p0, Lxw;->B:Lvq2;

    .line 280
    .line 281
    :cond_c
    iget-object p1, p0, Lxw;->t:Lkw;

    .line 282
    .line 283
    if-eqz p1, :cond_d

    .line 284
    .line 285
    iget-object p2, p0, Lxw;->n:Low;

    .line 286
    .line 287
    iget-object p1, p1, Lkw;->A:Li5;

    .line 288
    .line 289
    invoke-virtual {p1, p2}, Lch;->g(Lui;)V

    .line 290
    .line 291
    .line 292
    :cond_d
    iget-object p1, p0, Lxw;->t:Lkw;

    .line 293
    .line 294
    if-eqz p1, :cond_e

    .line 295
    .line 296
    iget-object p1, p1, Lkw;->A:Li5;

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    const-string p2, "listener"

    .line 302
    .line 303
    iget-object v0, p0, Lxw;->o:Low;

    .line 304
    .line 305
    invoke-static {v0, p2}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    iget-object p1, p1, Lch;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 309
    .line 310
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    :cond_e
    iget-object p1, p0, Lxw;->t:Lkw;

    .line 314
    .line 315
    if-eqz p1, :cond_f

    .line 316
    .line 317
    iget-object p1, p1, Lkw;->A:Li5;

    .line 318
    .line 319
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    const-string p2, "listener"

    .line 323
    .line 324
    iget-object v0, p0, Lxw;->p:Low;

    .line 325
    .line 326
    invoke-static {v0, p2}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    iget-object p1, p1, Lch;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 330
    .line 331
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    :cond_f
    iget-object p1, p0, Lxw;->t:Lkw;

    .line 335
    .line 336
    if-eqz p1, :cond_10

    .line 337
    .line 338
    iget-object p1, p1, Lkw;->A:Li5;

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    const-string p2, "listener"

    .line 344
    .line 345
    iget-object v0, p0, Lxw;->q:Low;

    .line 346
    .line 347
    invoke-static {v0, p2}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    iget-object p1, p1, Lch;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 351
    .line 352
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    :cond_10
    iget-object p1, p0, Lxw;->t:Lkw;

    .line 356
    .line 357
    if-eqz p1, :cond_11

    .line 358
    .line 359
    if-nez p3, :cond_11

    .line 360
    .line 361
    iget-object p1, p1, Lkw;->A:Li5;

    .line 362
    .line 363
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    const-string p2, "provider"

    .line 367
    .line 368
    iget-object p3, p0, Lxw;->r:Lrw;

    .line 369
    .line 370
    invoke-static {p3, p2}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    iget-object p1, p1, Lch;->h:Lxb4;

    .line 374
    .line 375
    iget-object p2, p1, Lxb4;->h:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 378
    .line 379
    invoke-virtual {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    iget-object p1, p1, Lxb4;->g:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast p1, Ljava/lang/Runnable;

    .line 385
    .line 386
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 387
    .line 388
    .line 389
    :cond_11
    return-void

    .line 390
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 391
    .line 392
    const-string p2, "Already attached"

    .line 393
    .line 394
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw p1
.end method

.method public final c(Liw;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-boolean v1, p1, Liw;->E:Z

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-boolean v1, p1, Liw;->E:Z

    .line 17
    .line 18
    iget-boolean v1, p1, Liw;->p:Z

    .line 19
    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Lxw;->c:Lp21;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lp21;->f(Liw;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lxw;->F(I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Liw;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-static {p1}, Lxw;->G(Liw;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    iput-boolean p1, p0, Lxw;->D:Z

    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lxw;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Lxw;->J:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lxw;->I:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e()Ljava/util/HashSet;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lxw;->c:Lp21;

    .line 7
    .line 8
    invoke-virtual {v1}, Lp21;->l()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    check-cast v4, Lex;

    .line 26
    .line 27
    iget-object v4, v4, Lex;->c:Liw;

    .line 28
    .line 29
    iget-object v4, v4, Liw;->I:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Lxw;->E()Lfr;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-static {v4, v5}, Ltn;->f(Landroid/view/ViewGroup;Lfr;)Ltn;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-object v0
.end method

.method public final f(Liw;)Lex;
    .locals 3

    .line 1
    iget-object v0, p1, Liw;->j:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lxw;->c:Lp21;

    .line 4
    .line 5
    iget-object v2, v1, Lp21;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lex;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Lex;

    .line 19
    .line 20
    iget-object v2, p0, Lxw;->l:Ll92;

    .line 21
    .line 22
    invoke-direct {v0, v2, v1, p1}, Lex;-><init>(Ll92;Lp21;Liw;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lxw;->t:Lkw;

    .line 26
    .line 27
    iget-object p1, p1, Lkw;->x:Li5;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Lex;->m(Ljava/lang/ClassLoader;)V

    .line 34
    .line 35
    .line 36
    iget p1, p0, Lxw;->s:I

    .line 37
    .line 38
    iput p1, v0, Lex;->e:I

    .line 39
    .line 40
    return-object v0
.end method

.method public final g(Liw;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lxw;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-boolean v1, p1, Liw;->E:Z

    .line 12
    .line 13
    if-nez v1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    iput-boolean v1, p1, Liw;->E:Z

    .line 17
    .line 18
    iget-boolean v2, p1, Liw;->p:Z

    .line 19
    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-static {v0}, Lxw;->F(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Liw;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 32
    .line 33
    iget-object v2, v0, Lp21;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Ljava/util/ArrayList;

    .line 36
    .line 37
    monitor-enter v2

    .line 38
    :try_start_0
    iget-object v0, v0, Lp21;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    const/4 v0, 0x0

    .line 47
    iput-boolean v0, p1, Liw;->p:Z

    .line 48
    .line 49
    invoke-static {p1}, Lxw;->G(Liw;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    iput-boolean v1, p0, Lxw;->D:Z

    .line 56
    .line 57
    :cond_2
    invoke-virtual {p0, p1}, Lxw;->X(Liw;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw p1

    .line 64
    :cond_3
    return-void
.end method

.method public final h(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lxw;->Z(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 21
    .line 22
    invoke-virtual {v0}, Lp21;->n()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Liw;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    iput-boolean v2, v1, Liw;->H:Z

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v1, v1, Liw;->y:Lxw;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lxw;->h(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
.end method

.method public final i()Z
    .locals 5

    .line 1
    iget v0, p0, Lxw;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 9
    .line 10
    invoke-virtual {v0}, Lp21;->n()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Liw;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v3, Liw;->D:Z

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    iget-object v3, v3, Liw;->y:Lxw;

    .line 37
    .line 38
    invoke-virtual {v3}, Lxw;->i()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v3, v1

    .line 44
    :goto_0
    if-eqz v3, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final j()Z
    .locals 7

    .line 1
    iget v0, p0, Lxw;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 9
    .line 10
    invoke-virtual {v0}, Lp21;->n()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_4

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Liw;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-static {v5}, Lxw;->I(Liw;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget-boolean v6, v5, Liw;->D:Z

    .line 41
    .line 42
    if-nez v6, :cond_2

    .line 43
    .line 44
    iget-object v6, v5, Liw;->y:Lxw;

    .line 45
    .line 46
    invoke-virtual {v6}, Lxw;->j()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v6, v1

    .line 52
    :goto_1
    if-eqz v6, :cond_1

    .line 53
    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    new-instance v3, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move v4, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    iget-object v0, p0, Lxw;->e:Ljava/util/ArrayList;

    .line 67
    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    :goto_2
    iget-object v0, p0, Lxw;->e:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-ge v1, v0, :cond_7

    .line 77
    .line 78
    iget-object v0, p0, Lxw;->e:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Liw;

    .line 85
    .line 86
    if-eqz v3, :cond_5

    .line 87
    .line 88
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_6

    .line 93
    .line 94
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_7
    iput-object v3, p0, Lxw;->e:Ljava/util/ArrayList;

    .line 101
    .line 102
    return v4
.end method

.method public final k()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lxw;->G:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lxw;->y(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lxw;->e()Ljava/util/HashSet;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ltn;

    .line 26
    .line 27
    invoke-virtual {v2}, Ltn;->e()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, p0, Lxw;->t:Lkw;

    .line 32
    .line 33
    iget-object v2, p0, Lxw;->c:Lp21;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v0, v2, Lp21;->i:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lax;

    .line 40
    .line 41
    iget-boolean v0, v0, Lax;->f:Z

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    iget-object v1, v1, Lkw;->x:Li5;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    xor-int/2addr v0, v1

    .line 53
    :cond_2
    :goto_1
    if-eqz v0, :cond_4

    .line 54
    .line 55
    iget-object v0, p0, Lxw;->j:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Li9;

    .line 76
    .line 77
    iget-object v1, v1, Li9;->f:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    const/4 v4, 0x0

    .line 84
    :goto_2
    if-ge v4, v3, :cond_3

    .line 85
    .line 86
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    check-cast v5, Ljava/lang/String;

    .line 93
    .line 94
    iget-object v6, v2, Lp21;->i:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v6, Lax;

    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const/4 v7, 0x3

    .line 102
    invoke-static {v7}, Lxw;->F(I)Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6, v5}, Lax;->c(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    const/4 v0, -0x1

    .line 110
    invoke-virtual {p0, v0}, Lxw;->t(I)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 114
    .line 115
    if-eqz v0, :cond_5

    .line 116
    .line 117
    iget-object v0, v0, Lkw;->A:Li5;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    const-string v1, "listener"

    .line 123
    .line 124
    iget-object v2, p0, Lxw;->o:Low;

    .line 125
    .line 126
    invoke-static {v2, v1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, v0, Lch;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 130
    .line 131
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    :cond_5
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 135
    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    iget-object v0, v0, Lkw;->A:Li5;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    const-string v1, "listener"

    .line 144
    .line 145
    iget-object v2, p0, Lxw;->n:Low;

    .line 146
    .line 147
    invoke-static {v2, v1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, v0, Lch;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 151
    .line 152
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    :cond_6
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 156
    .line 157
    if-eqz v0, :cond_7

    .line 158
    .line 159
    iget-object v0, v0, Lkw;->A:Li5;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    const-string v1, "listener"

    .line 165
    .line 166
    iget-object v2, p0, Lxw;->p:Low;

    .line 167
    .line 168
    invoke-static {v2, v1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, v0, Lch;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 172
    .line 173
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    :cond_7
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 177
    .line 178
    if-eqz v0, :cond_8

    .line 179
    .line 180
    iget-object v0, v0, Lkw;->A:Li5;

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    const-string v1, "listener"

    .line 186
    .line 187
    iget-object v2, p0, Lxw;->q:Low;

    .line 188
    .line 189
    invoke-static {v2, v1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    iget-object v0, v0, Lch;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 193
    .line 194
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    :cond_8
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 198
    .line 199
    if-eqz v0, :cond_a

    .line 200
    .line 201
    iget-object v0, v0, Lkw;->A:Li5;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    const-string v1, "provider"

    .line 207
    .line 208
    iget-object v2, p0, Lxw;->r:Lrw;

    .line 209
    .line 210
    invoke-static {v2, v1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    iget-object v0, v0, Lch;->h:Lxb4;

    .line 214
    .line 215
    iget-object v1, v0, Lxb4;->h:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 218
    .line 219
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    iget-object v1, v0, Lxb4;->i:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v1, Ljava/util/HashMap;

    .line 225
    .line 226
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    if-nez v1, :cond_9

    .line 231
    .line 232
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, Ljava/lang/Runnable;

    .line 235
    .line 236
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 237
    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_9
    new-instance v0, Ljava/lang/ClassCastException;

    .line 241
    .line 242
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 243
    .line 244
    .line 245
    throw v0

    .line 246
    :cond_a
    :goto_3
    const/4 v0, 0x0

    .line 247
    iput-object v0, p0, Lxw;->t:Lkw;

    .line 248
    .line 249
    iput-object v0, p0, Lxw;->u:Li30;

    .line 250
    .line 251
    iput-object v0, p0, Lxw;->v:Liw;

    .line 252
    .line 253
    iget-object v1, p0, Lxw;->g:Laj0;

    .line 254
    .line 255
    if-eqz v1, :cond_c

    .line 256
    .line 257
    iget-object v1, p0, Lxw;->h:Lqw;

    .line 258
    .line 259
    iget-object v1, v1, Lqw;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_b

    .line 270
    .line 271
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    check-cast v2, Lid;

    .line 276
    .line 277
    invoke-interface {v2}, Lid;->cancel()V

    .line 278
    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_b
    iput-object v0, p0, Lxw;->g:Laj0;

    .line 282
    .line 283
    :cond_c
    iget-object v0, p0, Lxw;->z:Lvq2;

    .line 284
    .line 285
    if-eqz v0, :cond_d

    .line 286
    .line 287
    invoke-virtual {v0}, Lvq2;->t()V

    .line 288
    .line 289
    .line 290
    iget-object v0, p0, Lxw;->A:Lvq2;

    .line 291
    .line 292
    invoke-virtual {v0}, Lvq2;->t()V

    .line 293
    .line 294
    .line 295
    iget-object v0, p0, Lxw;->B:Lvq2;

    .line 296
    .line 297
    invoke-virtual {v0}, Lvq2;->t()V

    .line 298
    .line 299
    .line 300
    :cond_d
    return-void
.end method

.method public final l(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lxw;->Z(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 21
    .line 22
    invoke-virtual {v0}, Lp21;->n()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Liw;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    iput-boolean v2, v1, Liw;->H:Z

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v1, v1, Liw;->y:Lxw;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lxw;->l(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
.end method

.method public final m(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lxw;->Z(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 21
    .line 22
    invoke-virtual {v0}, Lp21;->n()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Liw;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v1, v1, Liw;->y:Lxw;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {v1, v2}, Lxw;->m(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
.end method

.method public final n()V
    .locals 4

    .line 1
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp21;->m()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    check-cast v3, Liw;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v3}, Liw;->p()Z

    .line 25
    .line 26
    .line 27
    iget-object v3, v3, Liw;->y:Lxw;

    .line 28
    .line 29
    invoke-virtual {v3}, Lxw;->n()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method public final o()Z
    .locals 5

    .line 1
    iget v0, p0, Lxw;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 9
    .line 10
    invoke-virtual {v0}, Lp21;->n()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Liw;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v3, Liw;->D:Z

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    iget-object v3, v3, Liw;->y:Lxw;

    .line 37
    .line 38
    invoke-virtual {v3}, Lxw;->o()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v3, v1

    .line 44
    :goto_0
    if-eqz v3, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final p()V
    .locals 3

    .line 1
    iget v0, p0, Lxw;->s:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 8
    .line 9
    invoke-virtual {v0}, Lp21;->n()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Liw;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-boolean v2, v1, Liw;->D:Z

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    iget-object v1, v1, Liw;->y:Lxw;

    .line 36
    .line 37
    invoke-virtual {v1}, Lxw;->p()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    return-void
.end method

.method public final q(Liw;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Liw;->j:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lxw;->c:Lp21;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lp21;->i(Ljava/lang/String;)Liw;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p1, Liw;->w:Lxw;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lxw;->J(Liw;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p1, Liw;->o:Ljava/lang/Boolean;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eq v1, v0, :cond_1

    .line 35
    .line 36
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p1, Liw;->o:Ljava/lang/Boolean;

    .line 41
    .line 42
    iget-object p1, p1, Liw;->y:Lxw;

    .line 43
    .line 44
    invoke-virtual {p1}, Lxw;->a0()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p1, Lxw;->w:Liw;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lxw;->q(Liw;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public final r(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lxw;->Z(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 21
    .line 22
    invoke-virtual {v0}, Lp21;->n()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Liw;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v1, v1, Liw;->y:Lxw;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {v1, v2}, Lxw;->r(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
.end method

.method public final s()Z
    .locals 6

    .line 1
    iget v0, p0, Lxw;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Lxw;->c:Lp21;

    .line 9
    .line 10
    invoke-virtual {v0}, Lp21;->n()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move v3, v1

    .line 19
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Liw;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-static {v4}, Lxw;->I(Liw;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    iget-boolean v5, v4, Liw;->D:Z

    .line 40
    .line 41
    if-nez v5, :cond_2

    .line 42
    .line 43
    iget-object v4, v4, Liw;->y:Lxw;

    .line 44
    .line 45
    invoke-virtual {v4}, Lxw;->s()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v4, v1

    .line 51
    :goto_1
    if-eqz v4, :cond_1

    .line 52
    .line 53
    move v3, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    return v3
.end method

.method public final t(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lxw;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Lxw;->c:Lp21;

    .line 6
    .line 7
    iget-object v2, v2, Lp21;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lex;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iput p1, v3, Lex;->e:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1, v1}, Lxw;->K(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lxw;->e()Ljava/util/HashSet;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Ltn;

    .line 58
    .line 59
    invoke-virtual {v2}, Ltn;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    iput-boolean v1, p0, Lxw;->b:Z

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lxw;->y(Z)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_2
    iput-boolean v1, p0, Lxw;->b:Z

    .line 72
    .line 73
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "FragmentManager{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " in "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lxw;->v:Liw;

    .line 30
    .line 31
    const-string v2, "}"

    .line 32
    .line 33
    const-string v3, "{"

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lxw;->v:Liw;

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v1, p0, Lxw;->t:Lkw;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Lxw;->t:Lkw;

    .line 87
    .line 88
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const-string v1, "null"

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    :goto_0
    const-string v1, "}}"

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0
.end method

.method public final u()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxw;->H:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lxw;->H:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lxw;->Y()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "    "

    .line 2
    .line 3
    invoke-static {p1, v0}, Lex0;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lxw;->c:Lp21;

    .line 8
    .line 9
    iget-object v2, v1, Lp21;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    const-string v3, "    "

    .line 14
    .line 15
    invoke-static {p1, v3}, Lex0;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v1, v1, Lp21;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_1b

    .line 28
    .line 29
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v4, "Active Fragments:"

    .line 33
    .line 34
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1b

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Lex;

    .line 56
    .line 57
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    if-eqz v4, :cond_1a

    .line 61
    .line 62
    iget-object v4, v4, Lex;->c:Liw;

    .line 63
    .line 64
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v5, "mFragmentId=#"

    .line 74
    .line 75
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget v5, v4, Liw;->A:I

    .line 79
    .line 80
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const-string v5, " mContainerId=#"

    .line 88
    .line 89
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget v5, v4, Liw;->B:I

    .line 93
    .line 94
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string v5, " mTag="

    .line 102
    .line 103
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v5, v4, Liw;->C:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const-string v5, "mState="

    .line 115
    .line 116
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget v5, v4, Liw;->f:I

    .line 120
    .line 121
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    .line 122
    .line 123
    .line 124
    const-string v5, " mWho="

    .line 125
    .line 126
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object v5, v4, Liw;->j:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const-string v5, " mBackStackNesting="

    .line 135
    .line 136
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget v5, v4, Liw;->v:I

    .line 140
    .line 141
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const-string v5, "mAdded="

    .line 148
    .line 149
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-boolean v5, v4, Liw;->p:Z

    .line 153
    .line 154
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 155
    .line 156
    .line 157
    const-string v5, " mRemoving="

    .line 158
    .line 159
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget-boolean v5, v4, Liw;->q:Z

    .line 163
    .line 164
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 165
    .line 166
    .line 167
    const-string v5, " mFromLayout="

    .line 168
    .line 169
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-boolean v5, v4, Liw;->r:Z

    .line 173
    .line 174
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 175
    .line 176
    .line 177
    const-string v5, " mInLayout="

    .line 178
    .line 179
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    iget-boolean v5, v4, Liw;->s:Z

    .line 183
    .line 184
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    const-string v5, "mHidden="

    .line 191
    .line 192
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    iget-boolean v5, v4, Liw;->D:Z

    .line 196
    .line 197
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 198
    .line 199
    .line 200
    const-string v5, " mDetached="

    .line 201
    .line 202
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iget-boolean v5, v4, Liw;->E:Z

    .line 206
    .line 207
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 208
    .line 209
    .line 210
    const-string v5, " mMenuVisible="

    .line 211
    .line 212
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    iget-boolean v5, v4, Liw;->G:Z

    .line 216
    .line 217
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 218
    .line 219
    .line 220
    const-string v5, " mHasMenu="

    .line 221
    .line 222
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const/4 v5, 0x0

    .line 226
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    const-string v6, "mRetainInstance="

    .line 233
    .line 234
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    iget-boolean v6, v4, Liw;->F:Z

    .line 238
    .line 239
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 240
    .line 241
    .line 242
    const-string v6, " mUserVisibleHint="

    .line 243
    .line 244
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    iget-boolean v6, v4, Liw;->L:Z

    .line 248
    .line 249
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 250
    .line 251
    .line 252
    iget-object v6, v4, Liw;->w:Lxw;

    .line 253
    .line 254
    if-eqz v6, :cond_0

    .line 255
    .line 256
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const-string v6, "mFragmentManager="

    .line 260
    .line 261
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    iget-object v6, v4, Liw;->w:Lxw;

    .line 265
    .line 266
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    :cond_0
    iget-object v6, v4, Liw;->x:Lkw;

    .line 270
    .line 271
    if-eqz v6, :cond_1

    .line 272
    .line 273
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const-string v6, "mHost="

    .line 277
    .line 278
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    iget-object v6, v4, Liw;->x:Lkw;

    .line 282
    .line 283
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_1
    iget-object v6, v4, Liw;->z:Liw;

    .line 287
    .line 288
    if-eqz v6, :cond_2

    .line 289
    .line 290
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    const-string v6, "mParentFragment="

    .line 294
    .line 295
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    iget-object v6, v4, Liw;->z:Liw;

    .line 299
    .line 300
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    :cond_2
    iget-object v6, v4, Liw;->k:Landroid/os/Bundle;

    .line 304
    .line 305
    if-eqz v6, :cond_3

    .line 306
    .line 307
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    const-string v6, "mArguments="

    .line 311
    .line 312
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    iget-object v6, v4, Liw;->k:Landroid/os/Bundle;

    .line 316
    .line 317
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_3
    iget-object v6, v4, Liw;->g:Landroid/os/Bundle;

    .line 321
    .line 322
    if-eqz v6, :cond_4

    .line 323
    .line 324
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    const-string v6, "mSavedFragmentState="

    .line 328
    .line 329
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    iget-object v6, v4, Liw;->g:Landroid/os/Bundle;

    .line 333
    .line 334
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :cond_4
    iget-object v6, v4, Liw;->h:Landroid/util/SparseArray;

    .line 338
    .line 339
    if-eqz v6, :cond_5

    .line 340
    .line 341
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    const-string v6, "mSavedViewState="

    .line 345
    .line 346
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    iget-object v6, v4, Liw;->h:Landroid/util/SparseArray;

    .line 350
    .line 351
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_5
    iget-object v6, v4, Liw;->i:Landroid/os/Bundle;

    .line 355
    .line 356
    if-eqz v6, :cond_6

    .line 357
    .line 358
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    const-string v6, "mSavedViewRegistryState="

    .line 362
    .line 363
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    iget-object v6, v4, Liw;->i:Landroid/os/Bundle;

    .line 367
    .line 368
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_6
    invoke-virtual {v4, v5}, Liw;->m(Z)Liw;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    if-eqz v6, :cond_7

    .line 376
    .line 377
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    const-string v7, "mTarget="

    .line 381
    .line 382
    invoke-virtual {p3, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    const-string v6, " mTargetRequestCode="

    .line 389
    .line 390
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    iget v6, v4, Liw;->n:I

    .line 394
    .line 395
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 396
    .line 397
    .line 398
    :cond_7
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    const-string v6, "mPopDirection="

    .line 402
    .line 403
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    iget-object v6, v4, Liw;->M:Lhw;

    .line 407
    .line 408
    if-nez v6, :cond_8

    .line 409
    .line 410
    move v6, v5

    .line 411
    goto :goto_1

    .line 412
    :cond_8
    iget-boolean v6, v6, Lhw;->a:Z

    .line 413
    .line 414
    :goto_1
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 415
    .line 416
    .line 417
    iget-object v6, v4, Liw;->M:Lhw;

    .line 418
    .line 419
    if-nez v6, :cond_9

    .line 420
    .line 421
    move v6, v5

    .line 422
    goto :goto_2

    .line 423
    :cond_9
    iget v6, v6, Lhw;->b:I

    .line 424
    .line 425
    :goto_2
    if-eqz v6, :cond_b

    .line 426
    .line 427
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    const-string v6, "getEnterAnim="

    .line 431
    .line 432
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    iget-object v6, v4, Liw;->M:Lhw;

    .line 436
    .line 437
    if-nez v6, :cond_a

    .line 438
    .line 439
    move v6, v5

    .line 440
    goto :goto_3

    .line 441
    :cond_a
    iget v6, v6, Lhw;->b:I

    .line 442
    .line 443
    :goto_3
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 444
    .line 445
    .line 446
    :cond_b
    iget-object v6, v4, Liw;->M:Lhw;

    .line 447
    .line 448
    if-nez v6, :cond_c

    .line 449
    .line 450
    move v6, v5

    .line 451
    goto :goto_4

    .line 452
    :cond_c
    iget v6, v6, Lhw;->c:I

    .line 453
    .line 454
    :goto_4
    if-eqz v6, :cond_e

    .line 455
    .line 456
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    const-string v6, "getExitAnim="

    .line 460
    .line 461
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    iget-object v6, v4, Liw;->M:Lhw;

    .line 465
    .line 466
    if-nez v6, :cond_d

    .line 467
    .line 468
    move v6, v5

    .line 469
    goto :goto_5

    .line 470
    :cond_d
    iget v6, v6, Lhw;->c:I

    .line 471
    .line 472
    :goto_5
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 473
    .line 474
    .line 475
    :cond_e
    iget-object v6, v4, Liw;->M:Lhw;

    .line 476
    .line 477
    if-nez v6, :cond_f

    .line 478
    .line 479
    move v6, v5

    .line 480
    goto :goto_6

    .line 481
    :cond_f
    iget v6, v6, Lhw;->d:I

    .line 482
    .line 483
    :goto_6
    if-eqz v6, :cond_11

    .line 484
    .line 485
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    const-string v6, "getPopEnterAnim="

    .line 489
    .line 490
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    iget-object v6, v4, Liw;->M:Lhw;

    .line 494
    .line 495
    if-nez v6, :cond_10

    .line 496
    .line 497
    move v6, v5

    .line 498
    goto :goto_7

    .line 499
    :cond_10
    iget v6, v6, Lhw;->d:I

    .line 500
    .line 501
    :goto_7
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 502
    .line 503
    .line 504
    :cond_11
    iget-object v6, v4, Liw;->M:Lhw;

    .line 505
    .line 506
    if-nez v6, :cond_12

    .line 507
    .line 508
    move v6, v5

    .line 509
    goto :goto_8

    .line 510
    :cond_12
    iget v6, v6, Lhw;->e:I

    .line 511
    .line 512
    :goto_8
    if-eqz v6, :cond_14

    .line 513
    .line 514
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    const-string v6, "getPopExitAnim="

    .line 518
    .line 519
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    iget-object v6, v4, Liw;->M:Lhw;

    .line 523
    .line 524
    if-nez v6, :cond_13

    .line 525
    .line 526
    move v6, v5

    .line 527
    goto :goto_9

    .line 528
    :cond_13
    iget v6, v6, Lhw;->e:I

    .line 529
    .line 530
    :goto_9
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 531
    .line 532
    .line 533
    :cond_14
    iget-object v6, v4, Liw;->I:Landroid/view/ViewGroup;

    .line 534
    .line 535
    if-eqz v6, :cond_15

    .line 536
    .line 537
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    const-string v6, "mContainer="

    .line 541
    .line 542
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    iget-object v6, v4, Liw;->I:Landroid/view/ViewGroup;

    .line 546
    .line 547
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    :cond_15
    iget-object v6, v4, Liw;->J:Landroid/view/View;

    .line 551
    .line 552
    if-eqz v6, :cond_16

    .line 553
    .line 554
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    const-string v6, "mView="

    .line 558
    .line 559
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    iget-object v6, v4, Liw;->J:Landroid/view/View;

    .line 563
    .line 564
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 565
    .line 566
    .line 567
    :cond_16
    invoke-virtual {v4}, Liw;->i()Landroid/content/Context;

    .line 568
    .line 569
    .line 570
    move-result-object v6

    .line 571
    if-eqz v6, :cond_19

    .line 572
    .line 573
    invoke-interface {v4}, Lr61;->d()Lq61;

    .line 574
    .line 575
    .line 576
    move-result-object v6

    .line 577
    new-instance v7, Lug0;

    .line 578
    .line 579
    sget-object v8, Lv70;->c:Lzw;

    .line 580
    .line 581
    invoke-direct {v7, v6, v8}, Lug0;-><init>(Lq61;Lp61;)V

    .line 582
    .line 583
    .line 584
    const-class v6, Lv70;

    .line 585
    .line 586
    invoke-virtual {v7, v6}, Lug0;->t(Ljava/lang/Class;)Lm61;

    .line 587
    .line 588
    .line 589
    move-result-object v6

    .line 590
    check-cast v6, Lv70;

    .line 591
    .line 592
    iget-object v6, v6, Lv70;->b:Ljx0;

    .line 593
    .line 594
    iget v7, v6, Ljx0;->h:I

    .line 595
    .line 596
    if-lez v7, :cond_19

    .line 597
    .line 598
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    const-string v7, "Loaders:"

    .line 602
    .line 603
    invoke-virtual {p3, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    iget v7, v6, Ljx0;->h:I

    .line 607
    .line 608
    if-gtz v7, :cond_17

    .line 609
    .line 610
    goto :goto_a

    .line 611
    :cond_17
    iget-object p1, v6, Ljx0;->g:[Ljava/lang/Object;

    .line 612
    .line 613
    aget-object p1, p1, v5

    .line 614
    .line 615
    if-nez p1, :cond_18

    .line 616
    .line 617
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    const-string p1, "  #"

    .line 621
    .line 622
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    iget-object p1, v6, Ljx0;->f:[I

    .line 626
    .line 627
    aget p1, p1, v5

    .line 628
    .line 629
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    .line 630
    .line 631
    .line 632
    const-string p1, ": "

    .line 633
    .line 634
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    const/4 p1, 0x0

    .line 638
    throw p1

    .line 639
    :cond_18
    new-instance p1, Ljava/lang/ClassCastException;

    .line 640
    .line 641
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 642
    .line 643
    .line 644
    throw p1

    .line 645
    :cond_19
    :goto_a
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    new-instance v5, Ljava/lang/StringBuilder;

    .line 649
    .line 650
    const-string v6, "Child "

    .line 651
    .line 652
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    iget-object v6, v4, Liw;->y:Lxw;

    .line 656
    .line 657
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    const-string v6, ":"

    .line 661
    .line 662
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v5

    .line 669
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    iget-object v4, v4, Liw;->y:Lxw;

    .line 673
    .line 674
    const-string v5, "  "

    .line 675
    .line 676
    invoke-static {v3, v5}, Lex0;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v5

    .line 680
    invoke-virtual {v4, v5, p2, p3, p4}, Lxw;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    goto/16 :goto_0

    .line 684
    .line 685
    :cond_1a
    const-string v4, "null"

    .line 686
    .line 687
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    goto/16 :goto_0

    .line 691
    .line 692
    :cond_1b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 693
    .line 694
    .line 695
    move-result p2

    .line 696
    const/4 p4, 0x0

    .line 697
    if-lez p2, :cond_1c

    .line 698
    .line 699
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    const-string v1, "Added Fragments:"

    .line 703
    .line 704
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    move v1, p4

    .line 708
    :goto_b
    if-ge v1, p2, :cond_1c

    .line 709
    .line 710
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v3

    .line 714
    check-cast v3, Liw;

    .line 715
    .line 716
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    const-string v4, "  #"

    .line 720
    .line 721
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 725
    .line 726
    .line 727
    const-string v4, ": "

    .line 728
    .line 729
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v3}, Liw;->toString()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v3

    .line 736
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    add-int/lit8 v1, v1, 0x1

    .line 740
    .line 741
    goto :goto_b

    .line 742
    :cond_1c
    iget-object p2, p0, Lxw;->e:Ljava/util/ArrayList;

    .line 743
    .line 744
    if-eqz p2, :cond_1d

    .line 745
    .line 746
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 747
    .line 748
    .line 749
    move-result p2

    .line 750
    if-lez p2, :cond_1d

    .line 751
    .line 752
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 753
    .line 754
    .line 755
    const-string v1, "Fragments Created Menus:"

    .line 756
    .line 757
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    move v1, p4

    .line 761
    :goto_c
    if-ge v1, p2, :cond_1d

    .line 762
    .line 763
    iget-object v2, p0, Lxw;->e:Ljava/util/ArrayList;

    .line 764
    .line 765
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    check-cast v2, Liw;

    .line 770
    .line 771
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    const-string v3, "  #"

    .line 775
    .line 776
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 780
    .line 781
    .line 782
    const-string v3, ": "

    .line 783
    .line 784
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v2}, Liw;->toString()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v2

    .line 791
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    add-int/lit8 v1, v1, 0x1

    .line 795
    .line 796
    goto :goto_c

    .line 797
    :cond_1d
    iget-object p2, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 798
    .line 799
    if-eqz p2, :cond_1e

    .line 800
    .line 801
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 802
    .line 803
    .line 804
    move-result p2

    .line 805
    if-lez p2, :cond_1e

    .line 806
    .line 807
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    const-string v1, "Back Stack:"

    .line 811
    .line 812
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    move v1, p4

    .line 816
    :goto_d
    if-ge v1, p2, :cond_1e

    .line 817
    .line 818
    iget-object v2, p0, Lxw;->d:Ljava/util/ArrayList;

    .line 819
    .line 820
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v2

    .line 824
    check-cast v2, Lg9;

    .line 825
    .line 826
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    const-string v3, "  #"

    .line 830
    .line 831
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 832
    .line 833
    .line 834
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 835
    .line 836
    .line 837
    const-string v3, ": "

    .line 838
    .line 839
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v2}, Lg9;->toString()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v3

    .line 846
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 847
    .line 848
    .line 849
    const/4 v3, 0x1

    .line 850
    invoke-virtual {v2, v0, p3, v3}, Lg9;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 851
    .line 852
    .line 853
    add-int/lit8 v1, v1, 0x1

    .line 854
    .line 855
    goto :goto_d

    .line 856
    :cond_1e
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 857
    .line 858
    .line 859
    new-instance p2, Ljava/lang/StringBuilder;

    .line 860
    .line 861
    const-string v0, "Back Stack Index: "

    .line 862
    .line 863
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    iget-object v0, p0, Lxw;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 867
    .line 868
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 869
    .line 870
    .line 871
    move-result v0

    .line 872
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 873
    .line 874
    .line 875
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object p2

    .line 879
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    iget-object p2, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 883
    .line 884
    monitor-enter p2

    .line 885
    :try_start_0
    iget-object v0, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 886
    .line 887
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 888
    .line 889
    .line 890
    move-result v0

    .line 891
    if-lez v0, :cond_1f

    .line 892
    .line 893
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 894
    .line 895
    .line 896
    const-string v1, "Pending Actions:"

    .line 897
    .line 898
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    :goto_e
    if-ge p4, v0, :cond_1f

    .line 902
    .line 903
    iget-object v1, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 904
    .line 905
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v1

    .line 909
    check-cast v1, Lvw;

    .line 910
    .line 911
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    const-string v2, "  #"

    .line 915
    .line 916
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 920
    .line 921
    .line 922
    const-string v2, ": "

    .line 923
    .line 924
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    add-int/lit8 p4, p4, 0x1

    .line 931
    .line 932
    goto :goto_e

    .line 933
    :catchall_0
    move-exception p1

    .line 934
    goto :goto_f

    .line 935
    :cond_1f
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 936
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    const-string p2, "FragmentManager misc state:"

    .line 940
    .line 941
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 942
    .line 943
    .line 944
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 945
    .line 946
    .line 947
    const-string p2, "  mHost="

    .line 948
    .line 949
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    iget-object p2, p0, Lxw;->t:Lkw;

    .line 953
    .line 954
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 955
    .line 956
    .line 957
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 958
    .line 959
    .line 960
    const-string p2, "  mContainer="

    .line 961
    .line 962
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    iget-object p2, p0, Lxw;->u:Li30;

    .line 966
    .line 967
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 968
    .line 969
    .line 970
    iget-object p2, p0, Lxw;->v:Liw;

    .line 971
    .line 972
    if-eqz p2, :cond_20

    .line 973
    .line 974
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 975
    .line 976
    .line 977
    const-string p2, "  mParent="

    .line 978
    .line 979
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    iget-object p2, p0, Lxw;->v:Liw;

    .line 983
    .line 984
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 985
    .line 986
    .line 987
    :cond_20
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 988
    .line 989
    .line 990
    const-string p2, "  mCurState="

    .line 991
    .line 992
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 993
    .line 994
    .line 995
    iget p2, p0, Lxw;->s:I

    .line 996
    .line 997
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 998
    .line 999
    .line 1000
    const-string p2, " mStateSaved="

    .line 1001
    .line 1002
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1003
    .line 1004
    .line 1005
    iget-boolean p2, p0, Lxw;->E:Z

    .line 1006
    .line 1007
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1008
    .line 1009
    .line 1010
    const-string p2, " mStopped="

    .line 1011
    .line 1012
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1013
    .line 1014
    .line 1015
    iget-boolean p2, p0, Lxw;->F:Z

    .line 1016
    .line 1017
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1018
    .line 1019
    .line 1020
    const-string p2, " mDestroyed="

    .line 1021
    .line 1022
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    iget-boolean p2, p0, Lxw;->G:Z

    .line 1026
    .line 1027
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 1028
    .line 1029
    .line 1030
    iget-boolean p2, p0, Lxw;->D:Z

    .line 1031
    .line 1032
    if-eqz p2, :cond_21

    .line 1033
    .line 1034
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1035
    .line 1036
    .line 1037
    const-string p1, "  mNeedMenuInvalidate="

    .line 1038
    .line 1039
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1040
    .line 1041
    .line 1042
    iget-boolean p1, p0, Lxw;->D:Z

    .line 1043
    .line 1044
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    .line 1045
    .line 1046
    .line 1047
    :cond_21
    return-void

    .line 1048
    :goto_f
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1049
    throw p1
.end method

.method public final w(Lvw;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p1, p0, Lxw;->G:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string p2, "FragmentManager has been destroyed"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string p2, "FragmentManager has not been attached to a host."

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    iget-boolean v0, p0, Lxw;->E:Z

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    iget-boolean v0, p0, Lxw;->F:Z

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p2, "Can not perform this action after onSaveInstanceState"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_3
    :goto_0
    iget-object v0, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 45
    .line 46
    monitor-enter v0

    .line 47
    :try_start_0
    iget-object v1, p0, Lxw;->t:Lkw;

    .line 48
    .line 49
    if-nez v1, :cond_5

    .line 50
    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    monitor-exit v0

    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "Activity has been destroyed"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_5
    iget-object p2, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lxw;->T()V

    .line 71
    .line 72
    .line 73
    monitor-exit v0

    .line 74
    return-void

    .line 75
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    throw p1
.end method

.method public final x(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxw;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Lxw;->G:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "FragmentManager has been destroyed"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "FragmentManager has not been attached to a host."

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Lxw;->t:Lkw;

    .line 34
    .line 35
    iget-object v1, v1, Lkw;->y:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-ne v0, v1, :cond_5

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    iget-boolean p1, p0, Lxw;->E:Z

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    iget-boolean p1, p0, Lxw;->F:Z

    .line 50
    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "Can not perform this action after onSaveInstanceState"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_3
    :goto_0
    iget-object p1, p0, Lxw;->I:Ljava/util/ArrayList;

    .line 63
    .line 64
    if-nez p1, :cond_4

    .line 65
    .line 66
    new-instance p1, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lxw;->I:Ljava/util/ArrayList;

    .line 72
    .line 73
    new-instance p1, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lxw;->J:Ljava/util/ArrayList;

    .line 79
    .line 80
    :cond_4
    return-void

    .line 81
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    const-string v0, "Must be called from main thread of fragment host"

    .line 84
    .line 85
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string v0, "FragmentManager is already executing transactions"

    .line 92
    .line 93
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1
.end method

.method public final y(Z)Z
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Lxw;->x(Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    move v0, p1

    .line 6
    :goto_0
    iget-object v1, p0, Lxw;->I:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v2, p0, Lxw;->J:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v3, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    monitor-enter v3

    .line 13
    :try_start_0
    iget-object v4, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    move v6, p1

    .line 23
    goto :goto_2

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_4

    .line 26
    :cond_0
    :try_start_1
    iget-object v4, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    move v5, p1

    .line 33
    move v6, v5

    .line 34
    :goto_1
    if-ge v5, v4, :cond_1

    .line 35
    .line 36
    iget-object v7, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, Lvw;

    .line 43
    .line 44
    invoke-interface {v7, v1, v2}, Lvw;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 45
    .line 46
    .line 47
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    or-int/2addr v6, v7

    .line 49
    add-int/lit8 v5, v5, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_1
    move-exception p1

    .line 53
    goto :goto_3

    .line 54
    :cond_1
    :try_start_2
    iget-object v1, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lxw;->t:Lkw;

    .line 60
    .line 61
    iget-object v1, v1, Lkw;->y:Landroid/os/Handler;

    .line 62
    .line 63
    iget-object v2, p0, Lxw;->M:La9;

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    :goto_2
    if-eqz v6, :cond_2

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p0, Lxw;->b:Z

    .line 73
    .line 74
    :try_start_3
    iget-object v1, p0, Lxw;->I:Ljava/util/ArrayList;

    .line 75
    .line 76
    iget-object v2, p0, Lxw;->J:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {p0, v1, v2}, Lxw;->Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lxw;->d()V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catchall_2
    move-exception p1

    .line 86
    invoke-virtual {p0}, Lxw;->d()V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_2
    invoke-virtual {p0}, Lxw;->a0()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lxw;->u()V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lxw;->c:Lp21;

    .line 97
    .line 98
    iget-object p1, p1, Lp21;->g:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const/4 v1, 0x0

    .line 107
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-interface {p1, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 112
    .line 113
    .line 114
    return v0

    .line 115
    :goto_3
    :try_start_4
    iget-object v0, p0, Lxw;->a:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lxw;->t:Lkw;

    .line 121
    .line 122
    iget-object v0, v0, Lkw;->y:Landroid/os/Handler;

    .line 123
    .line 124
    iget-object v1, p0, Lxw;->M:La9;

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :goto_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 131
    throw p1
.end method

.method public final z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    iget-object v4, v1, Lxw;->c:Lp21;

    .line 10
    .line 11
    move/from16 v5, p3

    .line 12
    .line 13
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    check-cast v6, Lg9;

    .line 18
    .line 19
    iget-boolean v6, v6, Lg9;->p:Z

    .line 20
    .line 21
    iget-object v7, v1, Lxw;->K:Ljava/util/ArrayList;

    .line 22
    .line 23
    if-nez v7, :cond_0

    .line 24
    .line 25
    new-instance v7, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v7, v1, Lxw;->K:Ljava/util/ArrayList;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v7, v1, Lxw;->K:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v4}, Lp21;->n()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    iget-object v7, v1, Lxw;->w:Liw;

    .line 46
    .line 47
    move v9, v5

    .line 48
    const/4 v10, 0x0

    .line 49
    :goto_1
    const/4 v13, 0x1

    .line 50
    if-ge v9, v3, :cond_13

    .line 51
    .line 52
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v14

    .line 56
    check-cast v14, Lg9;

    .line 57
    .line 58
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v15

    .line 62
    check-cast v15, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v15

    .line 68
    if-nez v15, :cond_d

    .line 69
    .line 70
    iget-object v15, v1, Lxw;->K:Ljava/util/ArrayList;

    .line 71
    .line 72
    iget-object v8, v14, Lg9;->a:Ljava/util/ArrayList;

    .line 73
    .line 74
    const/4 v12, 0x0

    .line 75
    :goto_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    if-ge v12, v11, :cond_c

    .line 80
    .line 81
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    check-cast v11, Lix;

    .line 86
    .line 87
    iget v5, v11, Lix;->a:I

    .line 88
    .line 89
    if-eq v5, v13, :cond_b

    .line 90
    .line 91
    const/4 v13, 0x2

    .line 92
    if-eq v5, v13, :cond_5

    .line 93
    .line 94
    const/4 v13, 0x3

    .line 95
    if-eq v5, v13, :cond_4

    .line 96
    .line 97
    const/4 v13, 0x6

    .line 98
    if-eq v5, v13, :cond_4

    .line 99
    .line 100
    const/4 v13, 0x7

    .line 101
    if-eq v5, v13, :cond_3

    .line 102
    .line 103
    const/16 v13, 0x8

    .line 104
    .line 105
    if-eq v5, v13, :cond_1

    .line 106
    .line 107
    move/from16 v19, v6

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_1
    new-instance v5, Lix;

    .line 111
    .line 112
    move/from16 v19, v6

    .line 113
    .line 114
    const/16 v6, 0x9

    .line 115
    .line 116
    const/4 v13, 0x0

    .line 117
    invoke-direct {v5, v6, v7, v13}, Lix;-><init>(ILiw;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v8, v12, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    const/4 v5, 0x1

    .line 124
    iput-boolean v5, v11, Lix;->c:Z

    .line 125
    .line 126
    add-int/lit8 v12, v12, 0x1

    .line 127
    .line 128
    iget-object v5, v11, Lix;->b:Liw;

    .line 129
    .line 130
    move-object v7, v5

    .line 131
    :cond_2
    :goto_3
    move/from16 v22, v9

    .line 132
    .line 133
    move/from16 v21, v10

    .line 134
    .line 135
    const/4 v6, 0x1

    .line 136
    goto/16 :goto_9

    .line 137
    .line 138
    :cond_3
    move/from16 v19, v6

    .line 139
    .line 140
    const/4 v6, 0x1

    .line 141
    :goto_4
    move/from16 v22, v9

    .line 142
    .line 143
    move/from16 v21, v10

    .line 144
    .line 145
    goto/16 :goto_8

    .line 146
    .line 147
    :cond_4
    move/from16 v19, v6

    .line 148
    .line 149
    iget-object v5, v11, Lix;->b:Liw;

    .line 150
    .line 151
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    iget-object v5, v11, Lix;->b:Liw;

    .line 155
    .line 156
    if-ne v5, v7, :cond_2

    .line 157
    .line 158
    new-instance v6, Lix;

    .line 159
    .line 160
    const/16 v7, 0x9

    .line 161
    .line 162
    invoke-direct {v6, v7, v5}, Lix;-><init>(ILiw;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v8, v12, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    add-int/lit8 v12, v12, 0x1

    .line 169
    .line 170
    move/from16 v22, v9

    .line 171
    .line 172
    move/from16 v21, v10

    .line 173
    .line 174
    const/4 v6, 0x1

    .line 175
    const/4 v7, 0x0

    .line 176
    goto/16 :goto_9

    .line 177
    .line 178
    :cond_5
    move/from16 v19, v6

    .line 179
    .line 180
    iget-object v5, v11, Lix;->b:Liw;

    .line 181
    .line 182
    iget v6, v5, Liw;->B:I

    .line 183
    .line 184
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 185
    .line 186
    .line 187
    move-result v13

    .line 188
    const/16 v17, 0x1

    .line 189
    .line 190
    add-int/lit8 v13, v13, -0x1

    .line 191
    .line 192
    const/16 v20, 0x0

    .line 193
    .line 194
    :goto_5
    if-ltz v13, :cond_9

    .line 195
    .line 196
    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v21

    .line 200
    move/from16 v22, v9

    .line 201
    .line 202
    move-object/from16 v9, v21

    .line 203
    .line 204
    check-cast v9, Liw;

    .line 205
    .line 206
    move/from16 v21, v10

    .line 207
    .line 208
    iget v10, v9, Liw;->B:I

    .line 209
    .line 210
    if-ne v10, v6, :cond_8

    .line 211
    .line 212
    if-ne v9, v5, :cond_6

    .line 213
    .line 214
    move/from16 v18, v6

    .line 215
    .line 216
    const/4 v6, 0x1

    .line 217
    const/16 v20, 0x1

    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_6
    if-ne v9, v7, :cond_7

    .line 221
    .line 222
    new-instance v7, Lix;

    .line 223
    .line 224
    move/from16 v18, v6

    .line 225
    .line 226
    const/16 v6, 0x9

    .line 227
    .line 228
    const/4 v10, 0x0

    .line 229
    invoke-direct {v7, v6, v9, v10}, Lix;-><init>(ILiw;I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v8, v12, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    add-int/lit8 v12, v12, 0x1

    .line 236
    .line 237
    const/4 v7, 0x0

    .line 238
    goto :goto_6

    .line 239
    :cond_7
    move/from16 v18, v6

    .line 240
    .line 241
    const/16 v6, 0x9

    .line 242
    .line 243
    const/4 v10, 0x0

    .line 244
    :goto_6
    new-instance v6, Lix;

    .line 245
    .line 246
    move-object/from16 v23, v7

    .line 247
    .line 248
    const/4 v7, 0x3

    .line 249
    invoke-direct {v6, v7, v9, v10}, Lix;-><init>(ILiw;I)V

    .line 250
    .line 251
    .line 252
    iget v7, v11, Lix;->d:I

    .line 253
    .line 254
    iput v7, v6, Lix;->d:I

    .line 255
    .line 256
    iget v7, v11, Lix;->f:I

    .line 257
    .line 258
    iput v7, v6, Lix;->f:I

    .line 259
    .line 260
    iget v7, v11, Lix;->e:I

    .line 261
    .line 262
    iput v7, v6, Lix;->e:I

    .line 263
    .line 264
    iget v7, v11, Lix;->g:I

    .line 265
    .line 266
    iput v7, v6, Lix;->g:I

    .line 267
    .line 268
    invoke-virtual {v8, v12, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    const/4 v6, 0x1

    .line 275
    add-int/2addr v12, v6

    .line 276
    move-object/from16 v7, v23

    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_8
    move/from16 v18, v6

    .line 280
    .line 281
    const/4 v6, 0x1

    .line 282
    :goto_7
    add-int/lit8 v13, v13, -0x1

    .line 283
    .line 284
    move/from16 v6, v18

    .line 285
    .line 286
    move/from16 v10, v21

    .line 287
    .line 288
    move/from16 v9, v22

    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_9
    move/from16 v22, v9

    .line 292
    .line 293
    move/from16 v21, v10

    .line 294
    .line 295
    const/4 v6, 0x1

    .line 296
    if-eqz v20, :cond_a

    .line 297
    .line 298
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    add-int/lit8 v12, v12, -0x1

    .line 302
    .line 303
    goto :goto_9

    .line 304
    :cond_a
    iput v6, v11, Lix;->a:I

    .line 305
    .line 306
    iput-boolean v6, v11, Lix;->c:Z

    .line 307
    .line 308
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    goto :goto_9

    .line 312
    :cond_b
    move/from16 v19, v6

    .line 313
    .line 314
    move v6, v13

    .line 315
    goto/16 :goto_4

    .line 316
    .line 317
    :goto_8
    iget-object v5, v11, Lix;->b:Liw;

    .line 318
    .line 319
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    :goto_9
    add-int/2addr v12, v6

    .line 323
    move/from16 v5, p3

    .line 324
    .line 325
    move v13, v6

    .line 326
    move/from16 v6, v19

    .line 327
    .line 328
    move/from16 v10, v21

    .line 329
    .line 330
    move/from16 v9, v22

    .line 331
    .line 332
    goto/16 :goto_2

    .line 333
    .line 334
    :cond_c
    move/from16 v19, v6

    .line 335
    .line 336
    move/from16 v22, v9

    .line 337
    .line 338
    move/from16 v21, v10

    .line 339
    .line 340
    goto :goto_c

    .line 341
    :cond_d
    move/from16 v19, v6

    .line 342
    .line 343
    move/from16 v22, v9

    .line 344
    .line 345
    move/from16 v21, v10

    .line 346
    .line 347
    move v6, v13

    .line 348
    iget-object v5, v1, Lxw;->K:Ljava/util/ArrayList;

    .line 349
    .line 350
    iget-object v8, v14, Lg9;->a:Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 353
    .line 354
    .line 355
    move-result v9

    .line 356
    sub-int/2addr v9, v6

    .line 357
    :goto_a
    if-ltz v9, :cond_10

    .line 358
    .line 359
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v10

    .line 363
    check-cast v10, Lix;

    .line 364
    .line 365
    iget v11, v10, Lix;->a:I

    .line 366
    .line 367
    const/4 v13, 0x3

    .line 368
    if-eq v11, v6, :cond_f

    .line 369
    .line 370
    if-eq v11, v13, :cond_e

    .line 371
    .line 372
    packed-switch v11, :pswitch_data_0

    .line 373
    .line 374
    .line 375
    goto :goto_b

    .line 376
    :pswitch_0
    iget-object v6, v10, Lix;->h:Lu50;

    .line 377
    .line 378
    iput-object v6, v10, Lix;->i:Lu50;

    .line 379
    .line 380
    goto :goto_b

    .line 381
    :pswitch_1
    iget-object v6, v10, Lix;->b:Liw;

    .line 382
    .line 383
    move-object v7, v6

    .line 384
    goto :goto_b

    .line 385
    :pswitch_2
    const/4 v7, 0x0

    .line 386
    goto :goto_b

    .line 387
    :cond_e
    :pswitch_3
    iget-object v6, v10, Lix;->b:Liw;

    .line 388
    .line 389
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    goto :goto_b

    .line 393
    :cond_f
    :pswitch_4
    iget-object v6, v10, Lix;->b:Liw;

    .line 394
    .line 395
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    :goto_b
    add-int/lit8 v9, v9, -0x1

    .line 399
    .line 400
    const/4 v6, 0x1

    .line 401
    goto :goto_a

    .line 402
    :cond_10
    :goto_c
    if-nez v21, :cond_12

    .line 403
    .line 404
    iget-boolean v5, v14, Lg9;->g:Z

    .line 405
    .line 406
    if-eqz v5, :cond_11

    .line 407
    .line 408
    goto :goto_d

    .line 409
    :cond_11
    const/4 v10, 0x0

    .line 410
    goto :goto_e

    .line 411
    :cond_12
    :goto_d
    const/4 v10, 0x1

    .line 412
    :goto_e
    add-int/lit8 v9, v22, 0x1

    .line 413
    .line 414
    move/from16 v5, p3

    .line 415
    .line 416
    move/from16 v6, v19

    .line 417
    .line 418
    goto/16 :goto_1

    .line 419
    .line 420
    :cond_13
    move/from16 v19, v6

    .line 421
    .line 422
    iget-object v5, v1, Lxw;->K:Ljava/util/ArrayList;

    .line 423
    .line 424
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 425
    .line 426
    .line 427
    if-nez v19, :cond_16

    .line 428
    .line 429
    iget v5, v1, Lxw;->s:I

    .line 430
    .line 431
    const/4 v6, 0x1

    .line 432
    if-lt v5, v6, :cond_16

    .line 433
    .line 434
    move/from16 v5, p3

    .line 435
    .line 436
    :goto_f
    if-ge v5, v3, :cond_16

    .line 437
    .line 438
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    check-cast v6, Lg9;

    .line 443
    .line 444
    iget-object v6, v6, Lg9;->a:Ljava/util/ArrayList;

    .line 445
    .line 446
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 447
    .line 448
    .line 449
    move-result v7

    .line 450
    const/4 v8, 0x0

    .line 451
    :cond_14
    :goto_10
    if-ge v8, v7, :cond_15

    .line 452
    .line 453
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v9

    .line 457
    add-int/lit8 v8, v8, 0x1

    .line 458
    .line 459
    check-cast v9, Lix;

    .line 460
    .line 461
    iget-object v9, v9, Lix;->b:Liw;

    .line 462
    .line 463
    if-eqz v9, :cond_14

    .line 464
    .line 465
    iget-object v10, v9, Liw;->w:Lxw;

    .line 466
    .line 467
    if-eqz v10, :cond_14

    .line 468
    .line 469
    invoke-virtual {v1, v9}, Lxw;->f(Liw;)Lex;

    .line 470
    .line 471
    .line 472
    move-result-object v9

    .line 473
    invoke-virtual {v4, v9}, Lp21;->t(Lex;)V

    .line 474
    .line 475
    .line 476
    goto :goto_10

    .line 477
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 478
    .line 479
    goto :goto_f

    .line 480
    :cond_16
    const-string v4, "Unknown cmd: "

    .line 481
    .line 482
    move/from16 v5, p3

    .line 483
    .line 484
    :goto_11
    const/4 v6, -0x1

    .line 485
    if-ge v5, v3, :cond_29

    .line 486
    .line 487
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v7

    .line 491
    check-cast v7, Lg9;

    .line 492
    .line 493
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v8

    .line 497
    check-cast v8, Ljava/lang/Boolean;

    .line 498
    .line 499
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 500
    .line 501
    .line 502
    move-result v8

    .line 503
    if-eqz v8, :cond_21

    .line 504
    .line 505
    invoke-virtual {v7, v6}, Lg9;->c(I)V

    .line 506
    .line 507
    .line 508
    iget-object v6, v7, Lg9;->q:Lxw;

    .line 509
    .line 510
    iget-object v8, v7, Lg9;->a:Ljava/util/ArrayList;

    .line 511
    .line 512
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 513
    .line 514
    .line 515
    move-result v9

    .line 516
    const/4 v10, 0x1

    .line 517
    sub-int/2addr v9, v10

    .line 518
    :goto_12
    if-ltz v9, :cond_20

    .line 519
    .line 520
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v11

    .line 524
    check-cast v11, Lix;

    .line 525
    .line 526
    iget-object v12, v11, Lix;->b:Liw;

    .line 527
    .line 528
    if-eqz v12, :cond_1c

    .line 529
    .line 530
    iget-object v13, v12, Liw;->M:Lhw;

    .line 531
    .line 532
    if-nez v13, :cond_17

    .line 533
    .line 534
    goto :goto_13

    .line 535
    :cond_17
    invoke-virtual {v12}, Liw;->f()Lhw;

    .line 536
    .line 537
    .line 538
    move-result-object v13

    .line 539
    iput-boolean v10, v13, Lhw;->a:Z

    .line 540
    .line 541
    :goto_13
    iget v10, v7, Lg9;->f:I

    .line 542
    .line 543
    const/16 v13, 0x2002

    .line 544
    .line 545
    const/16 v14, 0x1001

    .line 546
    .line 547
    if-eq v10, v14, :cond_1a

    .line 548
    .line 549
    if-eq v10, v13, :cond_18

    .line 550
    .line 551
    const/16 v13, 0x1004

    .line 552
    .line 553
    const/16 v14, 0x2005

    .line 554
    .line 555
    if-eq v10, v14, :cond_1a

    .line 556
    .line 557
    const/16 v15, 0x1003

    .line 558
    .line 559
    if-eq v10, v15, :cond_19

    .line 560
    .line 561
    if-eq v10, v13, :cond_18

    .line 562
    .line 563
    const/4 v13, 0x0

    .line 564
    goto :goto_14

    .line 565
    :cond_18
    move v13, v14

    .line 566
    goto :goto_14

    .line 567
    :cond_19
    move v13, v15

    .line 568
    :cond_1a
    :goto_14
    iget-object v10, v12, Liw;->M:Lhw;

    .line 569
    .line 570
    if-nez v10, :cond_1b

    .line 571
    .line 572
    if-nez v13, :cond_1b

    .line 573
    .line 574
    goto :goto_15

    .line 575
    :cond_1b
    invoke-virtual {v12}, Liw;->f()Lhw;

    .line 576
    .line 577
    .line 578
    iget-object v10, v12, Liw;->M:Lhw;

    .line 579
    .line 580
    iput v13, v10, Lhw;->f:I

    .line 581
    .line 582
    :goto_15
    invoke-virtual {v12}, Liw;->f()Lhw;

    .line 583
    .line 584
    .line 585
    iget-object v10, v12, Liw;->M:Lhw;

    .line 586
    .line 587
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    :cond_1c
    iget v10, v11, Lix;->a:I

    .line 591
    .line 592
    packed-switch v10, :pswitch_data_1

    .line 593
    .line 594
    .line 595
    :pswitch_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 596
    .line 597
    new-instance v2, Ljava/lang/StringBuilder;

    .line 598
    .line 599
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    iget v3, v11, Lix;->a:I

    .line 603
    .line 604
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    throw v0

    .line 615
    :pswitch_6
    iget-object v10, v11, Lix;->h:Lu50;

    .line 616
    .line 617
    invoke-virtual {v6, v12, v10}, Lxw;->V(Liw;Lu50;)V

    .line 618
    .line 619
    .line 620
    :cond_1d
    :goto_16
    const/4 v10, 0x1

    .line 621
    goto/16 :goto_17

    .line 622
    .line 623
    :pswitch_7
    invoke-virtual {v6, v12}, Lxw;->W(Liw;)V

    .line 624
    .line 625
    .line 626
    goto :goto_16

    .line 627
    :pswitch_8
    const/4 v10, 0x0

    .line 628
    invoke-virtual {v6, v10}, Lxw;->W(Liw;)V

    .line 629
    .line 630
    .line 631
    goto :goto_16

    .line 632
    :pswitch_9
    iget v10, v11, Lix;->d:I

    .line 633
    .line 634
    iget v13, v11, Lix;->e:I

    .line 635
    .line 636
    iget v14, v11, Lix;->f:I

    .line 637
    .line 638
    iget v11, v11, Lix;->g:I

    .line 639
    .line 640
    invoke-virtual {v12, v10, v13, v14, v11}, Liw;->J(IIII)V

    .line 641
    .line 642
    .line 643
    const/4 v10, 0x1

    .line 644
    invoke-virtual {v6, v12, v10}, Lxw;->U(Liw;Z)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v6, v12}, Lxw;->g(Liw;)V

    .line 648
    .line 649
    .line 650
    goto :goto_16

    .line 651
    :pswitch_a
    iget v10, v11, Lix;->d:I

    .line 652
    .line 653
    iget v13, v11, Lix;->e:I

    .line 654
    .line 655
    iget v14, v11, Lix;->f:I

    .line 656
    .line 657
    iget v11, v11, Lix;->g:I

    .line 658
    .line 659
    invoke-virtual {v12, v10, v13, v14, v11}, Liw;->J(IIII)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v6, v12}, Lxw;->c(Liw;)V

    .line 663
    .line 664
    .line 665
    goto :goto_16

    .line 666
    :pswitch_b
    iget v10, v11, Lix;->d:I

    .line 667
    .line 668
    iget v13, v11, Lix;->e:I

    .line 669
    .line 670
    iget v14, v11, Lix;->f:I

    .line 671
    .line 672
    iget v11, v11, Lix;->g:I

    .line 673
    .line 674
    invoke-virtual {v12, v10, v13, v14, v11}, Liw;->J(IIII)V

    .line 675
    .line 676
    .line 677
    const/4 v10, 0x1

    .line 678
    invoke-virtual {v6, v12, v10}, Lxw;->U(Liw;Z)V

    .line 679
    .line 680
    .line 681
    const/16 v16, 0x2

    .line 682
    .line 683
    invoke-static/range {v16 .. v16}, Lxw;->F(I)Z

    .line 684
    .line 685
    .line 686
    move-result v11

    .line 687
    if-eqz v11, :cond_1e

    .line 688
    .line 689
    invoke-static {v12}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    :cond_1e
    iget-boolean v11, v12, Liw;->D:Z

    .line 693
    .line 694
    if-nez v11, :cond_1d

    .line 695
    .line 696
    iput-boolean v10, v12, Liw;->D:Z

    .line 697
    .line 698
    iget-boolean v11, v12, Liw;->N:Z

    .line 699
    .line 700
    xor-int/2addr v11, v10

    .line 701
    iput-boolean v11, v12, Liw;->N:Z

    .line 702
    .line 703
    invoke-virtual {v6, v12}, Lxw;->X(Liw;)V

    .line 704
    .line 705
    .line 706
    goto :goto_16

    .line 707
    :pswitch_c
    iget v10, v11, Lix;->d:I

    .line 708
    .line 709
    iget v13, v11, Lix;->e:I

    .line 710
    .line 711
    iget v14, v11, Lix;->f:I

    .line 712
    .line 713
    iget v11, v11, Lix;->g:I

    .line 714
    .line 715
    invoke-virtual {v12, v10, v13, v14, v11}, Liw;->J(IIII)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    const/16 v16, 0x2

    .line 722
    .line 723
    invoke-static/range {v16 .. v16}, Lxw;->F(I)Z

    .line 724
    .line 725
    .line 726
    move-result v10

    .line 727
    if-eqz v10, :cond_1f

    .line 728
    .line 729
    invoke-static {v12}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    :cond_1f
    iget-boolean v10, v12, Liw;->D:Z

    .line 733
    .line 734
    if-eqz v10, :cond_1d

    .line 735
    .line 736
    const/4 v13, 0x0

    .line 737
    iput-boolean v13, v12, Liw;->D:Z

    .line 738
    .line 739
    iget-boolean v10, v12, Liw;->N:Z

    .line 740
    .line 741
    const/16 v17, 0x1

    .line 742
    .line 743
    xor-int/lit8 v10, v10, 0x1

    .line 744
    .line 745
    iput-boolean v10, v12, Liw;->N:Z

    .line 746
    .line 747
    goto :goto_16

    .line 748
    :pswitch_d
    iget v10, v11, Lix;->d:I

    .line 749
    .line 750
    iget v13, v11, Lix;->e:I

    .line 751
    .line 752
    iget v14, v11, Lix;->f:I

    .line 753
    .line 754
    iget v11, v11, Lix;->g:I

    .line 755
    .line 756
    invoke-virtual {v12, v10, v13, v14, v11}, Liw;->J(IIII)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v6, v12}, Lxw;->a(Liw;)Lex;

    .line 760
    .line 761
    .line 762
    goto/16 :goto_16

    .line 763
    .line 764
    :pswitch_e
    iget v10, v11, Lix;->d:I

    .line 765
    .line 766
    iget v13, v11, Lix;->e:I

    .line 767
    .line 768
    iget v14, v11, Lix;->f:I

    .line 769
    .line 770
    iget v11, v11, Lix;->g:I

    .line 771
    .line 772
    invoke-virtual {v12, v10, v13, v14, v11}, Liw;->J(IIII)V

    .line 773
    .line 774
    .line 775
    const/4 v10, 0x1

    .line 776
    invoke-virtual {v6, v12, v10}, Lxw;->U(Liw;Z)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v6, v12}, Lxw;->P(Liw;)V

    .line 780
    .line 781
    .line 782
    :goto_17
    add-int/lit8 v9, v9, -0x1

    .line 783
    .line 784
    goto/16 :goto_12

    .line 785
    .line 786
    :cond_20
    const/4 v14, 0x0

    .line 787
    const/16 v16, 0x2

    .line 788
    .line 789
    goto/16 :goto_1e

    .line 790
    .line 791
    :cond_21
    const/4 v10, 0x1

    .line 792
    invoke-virtual {v7, v10}, Lg9;->c(I)V

    .line 793
    .line 794
    .line 795
    iget-object v6, v7, Lg9;->q:Lxw;

    .line 796
    .line 797
    iget-object v8, v7, Lg9;->a:Ljava/util/ArrayList;

    .line 798
    .line 799
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 800
    .line 801
    .line 802
    move-result v9

    .line 803
    const/4 v13, 0x0

    .line 804
    :goto_18
    if-ge v13, v9, :cond_20

    .line 805
    .line 806
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v10

    .line 810
    check-cast v10, Lix;

    .line 811
    .line 812
    iget-object v11, v10, Lix;->b:Liw;

    .line 813
    .line 814
    if-eqz v11, :cond_24

    .line 815
    .line 816
    iget-object v12, v11, Liw;->M:Lhw;

    .line 817
    .line 818
    if-nez v12, :cond_22

    .line 819
    .line 820
    goto :goto_19

    .line 821
    :cond_22
    invoke-virtual {v11}, Liw;->f()Lhw;

    .line 822
    .line 823
    .line 824
    move-result-object v12

    .line 825
    const/4 v14, 0x0

    .line 826
    iput-boolean v14, v12, Lhw;->a:Z

    .line 827
    .line 828
    :goto_19
    iget v12, v7, Lg9;->f:I

    .line 829
    .line 830
    iget-object v14, v11, Liw;->M:Lhw;

    .line 831
    .line 832
    if-nez v14, :cond_23

    .line 833
    .line 834
    if-nez v12, :cond_23

    .line 835
    .line 836
    goto :goto_1a

    .line 837
    :cond_23
    invoke-virtual {v11}, Liw;->f()Lhw;

    .line 838
    .line 839
    .line 840
    iget-object v14, v11, Liw;->M:Lhw;

    .line 841
    .line 842
    iput v12, v14, Lhw;->f:I

    .line 843
    .line 844
    :goto_1a
    invoke-virtual {v11}, Liw;->f()Lhw;

    .line 845
    .line 846
    .line 847
    iget-object v12, v11, Liw;->M:Lhw;

    .line 848
    .line 849
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    :cond_24
    iget v12, v10, Lix;->a:I

    .line 853
    .line 854
    packed-switch v12, :pswitch_data_2

    .line 855
    .line 856
    .line 857
    :pswitch_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 858
    .line 859
    new-instance v2, Ljava/lang/StringBuilder;

    .line 860
    .line 861
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    iget v3, v10, Lix;->a:I

    .line 865
    .line 866
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object v2

    .line 873
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    throw v0

    .line 877
    :pswitch_10
    iget-object v10, v10, Lix;->i:Lu50;

    .line 878
    .line 879
    invoke-virtual {v6, v11, v10}, Lxw;->V(Liw;Lu50;)V

    .line 880
    .line 881
    .line 882
    :cond_25
    :goto_1b
    const/4 v14, 0x0

    .line 883
    const/16 v16, 0x2

    .line 884
    .line 885
    goto/16 :goto_1d

    .line 886
    .line 887
    :pswitch_11
    const/4 v12, 0x0

    .line 888
    invoke-virtual {v6, v12}, Lxw;->W(Liw;)V

    .line 889
    .line 890
    .line 891
    goto :goto_1b

    .line 892
    :pswitch_12
    const/4 v12, 0x0

    .line 893
    invoke-virtual {v6, v11}, Lxw;->W(Liw;)V

    .line 894
    .line 895
    .line 896
    goto :goto_1b

    .line 897
    :pswitch_13
    const/4 v12, 0x0

    .line 898
    iget v14, v10, Lix;->d:I

    .line 899
    .line 900
    iget v15, v10, Lix;->e:I

    .line 901
    .line 902
    iget v12, v10, Lix;->f:I

    .line 903
    .line 904
    iget v10, v10, Lix;->g:I

    .line 905
    .line 906
    invoke-virtual {v11, v14, v15, v12, v10}, Liw;->J(IIII)V

    .line 907
    .line 908
    .line 909
    const/4 v14, 0x0

    .line 910
    invoke-virtual {v6, v11, v14}, Lxw;->U(Liw;Z)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v6, v11}, Lxw;->c(Liw;)V

    .line 914
    .line 915
    .line 916
    goto :goto_1b

    .line 917
    :pswitch_14
    iget v12, v10, Lix;->d:I

    .line 918
    .line 919
    iget v14, v10, Lix;->e:I

    .line 920
    .line 921
    iget v15, v10, Lix;->f:I

    .line 922
    .line 923
    iget v10, v10, Lix;->g:I

    .line 924
    .line 925
    invoke-virtual {v11, v12, v14, v15, v10}, Liw;->J(IIII)V

    .line 926
    .line 927
    .line 928
    invoke-virtual {v6, v11}, Lxw;->g(Liw;)V

    .line 929
    .line 930
    .line 931
    goto :goto_1b

    .line 932
    :pswitch_15
    iget v12, v10, Lix;->d:I

    .line 933
    .line 934
    iget v14, v10, Lix;->e:I

    .line 935
    .line 936
    iget v15, v10, Lix;->f:I

    .line 937
    .line 938
    iget v10, v10, Lix;->g:I

    .line 939
    .line 940
    invoke-virtual {v11, v12, v14, v15, v10}, Liw;->J(IIII)V

    .line 941
    .line 942
    .line 943
    const/4 v14, 0x0

    .line 944
    invoke-virtual {v6, v11, v14}, Lxw;->U(Liw;Z)V

    .line 945
    .line 946
    .line 947
    const/16 v16, 0x2

    .line 948
    .line 949
    invoke-static/range {v16 .. v16}, Lxw;->F(I)Z

    .line 950
    .line 951
    .line 952
    move-result v10

    .line 953
    if-eqz v10, :cond_26

    .line 954
    .line 955
    invoke-static {v11}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    :cond_26
    iget-boolean v10, v11, Liw;->D:Z

    .line 959
    .line 960
    if-eqz v10, :cond_25

    .line 961
    .line 962
    iput-boolean v14, v11, Liw;->D:Z

    .line 963
    .line 964
    iget-boolean v10, v11, Liw;->N:Z

    .line 965
    .line 966
    const/16 v17, 0x1

    .line 967
    .line 968
    xor-int/lit8 v10, v10, 0x1

    .line 969
    .line 970
    iput-boolean v10, v11, Liw;->N:Z

    .line 971
    .line 972
    goto :goto_1b

    .line 973
    :pswitch_16
    iget v12, v10, Lix;->d:I

    .line 974
    .line 975
    iget v14, v10, Lix;->e:I

    .line 976
    .line 977
    iget v15, v10, Lix;->f:I

    .line 978
    .line 979
    iget v10, v10, Lix;->g:I

    .line 980
    .line 981
    invoke-virtual {v11, v12, v14, v15, v10}, Liw;->J(IIII)V

    .line 982
    .line 983
    .line 984
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 985
    .line 986
    .line 987
    const/16 v16, 0x2

    .line 988
    .line 989
    invoke-static/range {v16 .. v16}, Lxw;->F(I)Z

    .line 990
    .line 991
    .line 992
    move-result v10

    .line 993
    if-eqz v10, :cond_27

    .line 994
    .line 995
    invoke-static {v11}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    :cond_27
    iget-boolean v10, v11, Liw;->D:Z

    .line 999
    .line 1000
    if-nez v10, :cond_28

    .line 1001
    .line 1002
    const/4 v10, 0x1

    .line 1003
    iput-boolean v10, v11, Liw;->D:Z

    .line 1004
    .line 1005
    iget-boolean v12, v11, Liw;->N:Z

    .line 1006
    .line 1007
    xor-int/2addr v12, v10

    .line 1008
    iput-boolean v12, v11, Liw;->N:Z

    .line 1009
    .line 1010
    invoke-virtual {v6, v11}, Lxw;->X(Liw;)V

    .line 1011
    .line 1012
    .line 1013
    :cond_28
    :goto_1c
    const/4 v14, 0x0

    .line 1014
    goto :goto_1d

    .line 1015
    :pswitch_17
    const/16 v16, 0x2

    .line 1016
    .line 1017
    iget v12, v10, Lix;->d:I

    .line 1018
    .line 1019
    iget v14, v10, Lix;->e:I

    .line 1020
    .line 1021
    iget v15, v10, Lix;->f:I

    .line 1022
    .line 1023
    iget v10, v10, Lix;->g:I

    .line 1024
    .line 1025
    invoke-virtual {v11, v12, v14, v15, v10}, Liw;->J(IIII)V

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v6, v11}, Lxw;->P(Liw;)V

    .line 1029
    .line 1030
    .line 1031
    goto :goto_1c

    .line 1032
    :pswitch_18
    const/16 v16, 0x2

    .line 1033
    .line 1034
    iget v12, v10, Lix;->d:I

    .line 1035
    .line 1036
    iget v14, v10, Lix;->e:I

    .line 1037
    .line 1038
    iget v15, v10, Lix;->f:I

    .line 1039
    .line 1040
    iget v10, v10, Lix;->g:I

    .line 1041
    .line 1042
    invoke-virtual {v11, v12, v14, v15, v10}, Liw;->J(IIII)V

    .line 1043
    .line 1044
    .line 1045
    const/4 v14, 0x0

    .line 1046
    invoke-virtual {v6, v11, v14}, Lxw;->U(Liw;Z)V

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v6, v11}, Lxw;->a(Liw;)Lex;

    .line 1050
    .line 1051
    .line 1052
    :goto_1d
    add-int/lit8 v13, v13, 0x1

    .line 1053
    .line 1054
    goto/16 :goto_18

    .line 1055
    .line 1056
    :goto_1e
    add-int/lit8 v5, v5, 0x1

    .line 1057
    .line 1058
    goto/16 :goto_11

    .line 1059
    .line 1060
    :cond_29
    const/4 v14, 0x0

    .line 1061
    add-int/lit8 v4, v3, -0x1

    .line 1062
    .line 1063
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v4

    .line 1067
    check-cast v4, Ljava/lang/Boolean;

    .line 1068
    .line 1069
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1070
    .line 1071
    .line 1072
    move-result v4

    .line 1073
    move/from16 v5, p3

    .line 1074
    .line 1075
    :goto_1f
    if-ge v5, v3, :cond_2e

    .line 1076
    .line 1077
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v7

    .line 1081
    check-cast v7, Lg9;

    .line 1082
    .line 1083
    if-eqz v4, :cond_2b

    .line 1084
    .line 1085
    iget-object v8, v7, Lg9;->a:Ljava/util/ArrayList;

    .line 1086
    .line 1087
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1088
    .line 1089
    .line 1090
    move-result v8

    .line 1091
    const/16 v17, 0x1

    .line 1092
    .line 1093
    add-int/lit8 v8, v8, -0x1

    .line 1094
    .line 1095
    :goto_20
    if-ltz v8, :cond_2d

    .line 1096
    .line 1097
    iget-object v9, v7, Lg9;->a:Ljava/util/ArrayList;

    .line 1098
    .line 1099
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v9

    .line 1103
    check-cast v9, Lix;

    .line 1104
    .line 1105
    iget-object v9, v9, Lix;->b:Liw;

    .line 1106
    .line 1107
    if-eqz v9, :cond_2a

    .line 1108
    .line 1109
    invoke-virtual {v1, v9}, Lxw;->f(Liw;)Lex;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v9

    .line 1113
    invoke-virtual {v9}, Lex;->k()V

    .line 1114
    .line 1115
    .line 1116
    :cond_2a
    add-int/lit8 v8, v8, -0x1

    .line 1117
    .line 1118
    goto :goto_20

    .line 1119
    :cond_2b
    iget-object v7, v7, Lg9;->a:Ljava/util/ArrayList;

    .line 1120
    .line 1121
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1122
    .line 1123
    .line 1124
    move-result v8

    .line 1125
    move v13, v14

    .line 1126
    :cond_2c
    :goto_21
    if-ge v13, v8, :cond_2d

    .line 1127
    .line 1128
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v9

    .line 1132
    add-int/lit8 v13, v13, 0x1

    .line 1133
    .line 1134
    check-cast v9, Lix;

    .line 1135
    .line 1136
    iget-object v9, v9, Lix;->b:Liw;

    .line 1137
    .line 1138
    if-eqz v9, :cond_2c

    .line 1139
    .line 1140
    invoke-virtual {v1, v9}, Lxw;->f(Liw;)Lex;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v9

    .line 1144
    invoke-virtual {v9}, Lex;->k()V

    .line 1145
    .line 1146
    .line 1147
    goto :goto_21

    .line 1148
    :cond_2d
    add-int/lit8 v5, v5, 0x1

    .line 1149
    .line 1150
    goto :goto_1f

    .line 1151
    :cond_2e
    iget v5, v1, Lxw;->s:I

    .line 1152
    .line 1153
    const/4 v10, 0x1

    .line 1154
    invoke-virtual {v1, v5, v10}, Lxw;->K(IZ)V

    .line 1155
    .line 1156
    .line 1157
    new-instance v5, Ljava/util/HashSet;

    .line 1158
    .line 1159
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 1160
    .line 1161
    .line 1162
    move/from16 v7, p3

    .line 1163
    .line 1164
    :goto_22
    if-ge v7, v3, :cond_31

    .line 1165
    .line 1166
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v8

    .line 1170
    check-cast v8, Lg9;

    .line 1171
    .line 1172
    iget-object v8, v8, Lg9;->a:Ljava/util/ArrayList;

    .line 1173
    .line 1174
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1175
    .line 1176
    .line 1177
    move-result v9

    .line 1178
    move v13, v14

    .line 1179
    :cond_2f
    :goto_23
    if-ge v13, v9, :cond_30

    .line 1180
    .line 1181
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v10

    .line 1185
    add-int/lit8 v13, v13, 0x1

    .line 1186
    .line 1187
    check-cast v10, Lix;

    .line 1188
    .line 1189
    iget-object v10, v10, Lix;->b:Liw;

    .line 1190
    .line 1191
    if-eqz v10, :cond_2f

    .line 1192
    .line 1193
    iget-object v10, v10, Liw;->I:Landroid/view/ViewGroup;

    .line 1194
    .line 1195
    if-eqz v10, :cond_2f

    .line 1196
    .line 1197
    invoke-virtual {v1}, Lxw;->E()Lfr;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v11

    .line 1201
    invoke-static {v10, v11}, Ltn;->f(Landroid/view/ViewGroup;Lfr;)Ltn;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v10

    .line 1205
    invoke-virtual {v5, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1206
    .line 1207
    .line 1208
    goto :goto_23

    .line 1209
    :cond_30
    add-int/lit8 v7, v7, 0x1

    .line 1210
    .line 1211
    goto :goto_22

    .line 1212
    :cond_31
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v5

    .line 1216
    :goto_24
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1217
    .line 1218
    .line 1219
    move-result v7

    .line 1220
    if-eqz v7, :cond_34

    .line 1221
    .line 1222
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v7

    .line 1226
    check-cast v7, Ltn;

    .line 1227
    .line 1228
    iput-boolean v4, v7, Ltn;->d:Z

    .line 1229
    .line 1230
    iget-object v8, v7, Ltn;->b:Ljava/util/ArrayList;

    .line 1231
    .line 1232
    monitor-enter v8

    .line 1233
    :try_start_0
    invoke-virtual {v7}, Ltn;->g()V

    .line 1234
    .line 1235
    .line 1236
    const/4 v9, 0x0

    .line 1237
    iput-boolean v9, v7, Ltn;->e:Z

    .line 1238
    .line 1239
    iget-object v10, v7, Ltn;->b:Ljava/util/ArrayList;

    .line 1240
    .line 1241
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1242
    .line 1243
    .line 1244
    move-result v10

    .line 1245
    add-int/lit8 v10, v10, -0x1

    .line 1246
    .line 1247
    :goto_25
    if-ltz v10, :cond_33

    .line 1248
    .line 1249
    iget-object v11, v7, Ltn;->b:Ljava/util/ArrayList;

    .line 1250
    .line 1251
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v11

    .line 1255
    check-cast v11, Llx0;

    .line 1256
    .line 1257
    iget-object v12, v11, Llx0;->c:Liw;

    .line 1258
    .line 1259
    iget-object v12, v12, Liw;->J:Landroid/view/View;

    .line 1260
    .line 1261
    invoke-static {v12}, Lex0;->c(Landroid/view/View;)I

    .line 1262
    .line 1263
    .line 1264
    move-result v12

    .line 1265
    iget v13, v11, Llx0;->a:I

    .line 1266
    .line 1267
    const/4 v14, 0x2

    .line 1268
    if-ne v13, v14, :cond_32

    .line 1269
    .line 1270
    if-eq v12, v14, :cond_32

    .line 1271
    .line 1272
    iget-object v10, v11, Llx0;->c:Liw;

    .line 1273
    .line 1274
    iget-object v10, v10, Liw;->M:Lhw;

    .line 1275
    .line 1276
    iput-boolean v9, v7, Ltn;->e:Z

    .line 1277
    .line 1278
    goto :goto_26

    .line 1279
    :catchall_0
    move-exception v0

    .line 1280
    goto :goto_27

    .line 1281
    :cond_32
    add-int/lit8 v10, v10, -0x1

    .line 1282
    .line 1283
    goto :goto_25

    .line 1284
    :cond_33
    :goto_26
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1285
    invoke-virtual {v7}, Ltn;->c()V

    .line 1286
    .line 1287
    .line 1288
    goto :goto_24

    .line 1289
    :goto_27
    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1290
    throw v0

    .line 1291
    :cond_34
    move/from16 v4, p3

    .line 1292
    .line 1293
    :goto_28
    if-ge v4, v3, :cond_36

    .line 1294
    .line 1295
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v5

    .line 1299
    check-cast v5, Lg9;

    .line 1300
    .line 1301
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v7

    .line 1305
    check-cast v7, Ljava/lang/Boolean;

    .line 1306
    .line 1307
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1308
    .line 1309
    .line 1310
    move-result v7

    .line 1311
    if-eqz v7, :cond_35

    .line 1312
    .line 1313
    iget v7, v5, Lg9;->s:I

    .line 1314
    .line 1315
    if-ltz v7, :cond_35

    .line 1316
    .line 1317
    iput v6, v5, Lg9;->s:I

    .line 1318
    .line 1319
    :cond_35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1320
    .line 1321
    .line 1322
    add-int/lit8 v4, v4, 0x1

    .line 1323
    .line 1324
    goto :goto_28

    .line 1325
    :cond_36
    return-void

    .line 1326
    nop

    .line 1327
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method
