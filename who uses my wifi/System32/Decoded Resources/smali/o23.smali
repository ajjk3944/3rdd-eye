.class public final Lo23;
.super Lh72;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Lth2;

.field public final h:Lk83;

.field public final i:Luk1;

.field public j:Ld32;


# direct methods
.method public constructor <init>(Lth2;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lh72;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lk83;

    .line 5
    .line 6
    invoke-direct {v0}, Lk83;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lo23;->h:Lk83;

    .line 10
    .line 11
    new-instance v1, Luk1;

    .line 12
    .line 13
    invoke-direct {v1}, Luk1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lo23;->i:Luk1;

    .line 17
    .line 18
    iput-object p1, p0, Lo23;->g:Lth2;

    .line 19
    .line 20
    iput-object p3, v0, Lk83;->c:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p2, p0, Lo23;->f:Landroid/content/Context;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final C0(Lvm0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo23;->h:Lk83;

    .line 2
    .line 3
    iput-object p1, v0, Lk83;->k:Lvm0;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-boolean v1, p1, Lvm0;->f:Z

    .line 8
    .line 9
    iput-boolean v1, v0, Lk83;->e:Z

    .line 10
    .line 11
    iget-object p1, p1, Lvm0;->g:Lwi2;

    .line 12
    .line 13
    iput-object p1, v0, Lk83;->l:Lwi2;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final F0(Lz2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo23;->h:Lk83;

    .line 2
    .line 3
    iput-object p1, v0, Lk83;->j:Lz2;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-boolean p1, p1, Lz2;->f:Z

    .line 8
    .line 9
    iput-boolean p1, v0, Lk83;->e:Z

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final N2(Lpk2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo23;->h:Lk83;

    .line 2
    .line 3
    iput-object p1, v0, Lk83;->v:Lpk2;

    .line 4
    .line 5
    return-void
.end method

.method public final Y1(Lx22;Lxe4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo23;->i:Luk1;

    .line 2
    .line 3
    iput-object p1, v0, Luk1;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p1, p0, Lo23;->h:Lk83;

    .line 6
    .line 7
    iput-object p2, p1, Lk83;->b:Lxe4;

    .line 8
    .line 9
    return-void
.end method

.method public final b()La62;
    .locals 7

    .line 1
    iget-object v0, p0, Lo23;->i:Luk1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v5, Lyr2;

    .line 7
    .line 8
    invoke-direct {v5, v0}, Lyr2;-><init>(Luk1;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, v5, Lyr2;->c:Lz22;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x6

    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v1, v5, Lyr2;->a:Lr22;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v1, v5, Lyr2;->b:Lq22;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x2

    .line 45
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v1, v5, Lyr2;->f:Lbw0;

    .line 53
    .line 54
    invoke-virtual {v1}, Lbw0;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    const/4 v2, 0x3

    .line 61
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :cond_3
    iget-object v2, v5, Lyr2;->e:Lj52;

    .line 69
    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    const/4 v2, 0x7

    .line 73
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_4
    iget-object v4, p0, Lo23;->h:Lk83;

    .line 81
    .line 82
    iput-object v0, v4, Lk83;->f:Ljava/util/ArrayList;

    .line 83
    .line 84
    new-instance v0, Ljava/util/ArrayList;

    .line 85
    .line 86
    iget v2, v1, Lbw0;->h:I

    .line 87
    .line 88
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    :goto_0
    iget v3, v1, Lbw0;->h:I

    .line 93
    .line 94
    if-ge v2, v3, :cond_5

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Lbw0;->f(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    add-int/lit8 v2, v2, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    iput-object v0, v4, Lk83;->g:Ljava/util/ArrayList;

    .line 109
    .line 110
    iget-object v0, v4, Lk83;->b:Lxe4;

    .line 111
    .line 112
    if-nez v0, :cond_6

    .line 113
    .line 114
    invoke-static {}, Lxe4;->a()Lxe4;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iput-object v0, v4, Lk83;->b:Lxe4;

    .line 119
    .line 120
    :cond_6
    new-instance v1, Lp23;

    .line 121
    .line 122
    iget-object v6, p0, Lo23;->j:Ld32;

    .line 123
    .line 124
    iget-object v2, p0, Lo23;->f:Landroid/content/Context;

    .line 125
    .line 126
    iget-object v3, p0, Lo23;->g:Lth2;

    .line 127
    .line 128
    invoke-direct/range {v1 .. v6}, Lp23;-><init>(Landroid/content/Context;Lth2;Lk83;Lyr2;Ld32;)V

    .line 129
    .line 130
    .line 131
    return-object v1
.end method

.method public final m1(Ljava/lang/String;Lv22;Lt22;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo23;->i:Luk1;

    .line 2
    .line 3
    iget-object v1, v0, Luk1;->k:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lbw0;

    .line 6
    .line 7
    invoke-virtual {v1, p1, p2}, Lbw0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    iget-object p2, v0, Luk1;->l:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Lbw0;

    .line 15
    .line 16
    invoke-virtual {p2, p1, p3}, Lbw0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final m3(Lq22;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo23;->i:Luk1;

    .line 2
    .line 3
    iput-object p1, v0, Luk1;->g:Ljava/lang/Object;

    .line 4
    .line 5
    return-void
.end method

.method public final q1(Lz22;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo23;->i:Luk1;

    .line 2
    .line 3
    iput-object p1, v0, Luk1;->h:Ljava/lang/Object;

    .line 4
    .line 5
    return-void
.end method

.method public final u0(Lj52;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo23;->i:Luk1;

    .line 2
    .line 3
    iput-object p1, v0, Luk1;->j:Ljava/lang/Object;

    .line 4
    .line 5
    return-void
.end method

.method public final v0(Ld32;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo23;->j:Ld32;

    .line 2
    .line 3
    return-void
.end method

.method public final v3(Lr22;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo23;->i:Luk1;

    .line 2
    .line 3
    iput-object p1, v0, Luk1;->f:Ljava/lang/Object;

    .line 4
    .line 5
    return-void
.end method

.method public final w1(Lr12;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo23;->h:Lk83;

    .line 2
    .line 3
    iput-object p1, v0, Lk83;->h:Lr12;

    .line 4
    .line 5
    return-void
.end method

.method public final x3(Lf52;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo23;->h:Lk83;

    .line 2
    .line 3
    iput-object p1, v0, Lk83;->n:Lf52;

    .line 4
    .line 5
    new-instance p1, Lih3;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {p1, v1, v2, v1}, Lih3;-><init>(ZZZ)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lk83;->d:Lih3;

    .line 13
    .line 14
    return-void
.end method
