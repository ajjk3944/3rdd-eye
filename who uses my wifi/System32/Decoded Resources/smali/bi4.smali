.class public final Lbi4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljh4;
.implements Lnf1;
.implements Lzj4;


# static fields
.field public static final S:Ljava/util/Map;

.field public static final T:Lph4;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Lp21;

.field public D:Lcg1;

.field public E:J

.field public F:Z

.field public G:I

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:I

.field public L:Z

.field public M:J

.field public N:J

.field public O:Z

.field public P:I

.field public Q:Z

.field public R:Z

.field public final f:Landroid/net/Uri;

.field public final g:Lth3;

.field public final h:Lpz;

.field public final i:Lwt2;

.field public final j:Llv2;

.field public final k:Lhi4;

.field public final l:Lrj4;

.field public final m:J

.field public final n:J

.field public final o:Lt83;

.field public final p:Ljr3;

.field public final q:Lhp2;

.field public final r:Lyh4;

.field public final s:Lyh4;

.field public final t:Landroid/os/Handler;

.field public u:Lih4;

.field public v:Loh1;

.field public w:[Lki4;

.field public x:[Lai4;

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Icy-MetaData"

    .line 7
    .line 8
    const-string v2, "1"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lbi4;->S:Ljava/util/Map;

    .line 18
    .line 19
    new-instance v0, Lgg4;

    .line 20
    .line 21
    invoke-direct {v0}, Lgg4;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "icy"

    .line 25
    .line 26
    iput-object v1, v0, Lgg4;->a:Ljava/lang/String;

    .line 27
    .line 28
    const-string v1, "application/x-icy"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lgg4;->e(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lph4;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lph4;-><init>(Lgg4;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Lbi4;->T:Lph4;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lth3;Ljr3;Lpz;Llv2;Lwt2;Lhi4;Lrj4;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbi4;->f:Landroid/net/Uri;

    .line 5
    .line 6
    iput-object p2, p0, Lbi4;->g:Lth3;

    .line 7
    .line 8
    iput-object p4, p0, Lbi4;->h:Lpz;

    .line 9
    .line 10
    iput-object p5, p0, Lbi4;->j:Llv2;

    .line 11
    .line 12
    iput-object p6, p0, Lbi4;->i:Lwt2;

    .line 13
    .line 14
    iput-object p7, p0, Lbi4;->k:Lhi4;

    .line 15
    .line 16
    iput-object p8, p0, Lbi4;->l:Lrj4;

    .line 17
    .line 18
    int-to-long p1, p9

    .line 19
    iput-wide p1, p0, Lbi4;->m:J

    .line 20
    .line 21
    new-instance p1, Lt83;

    .line 22
    .line 23
    const/4 p2, 0x2

    .line 24
    invoke-direct {p1, p2}, Lt83;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lbi4;->o:Lt83;

    .line 28
    .line 29
    iput-object p3, p0, Lbi4;->p:Ljr3;

    .line 30
    .line 31
    iput-wide p10, p0, Lbi4;->n:J

    .line 32
    .line 33
    new-instance p1, Lhp2;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lbi4;->q:Lhp2;

    .line 39
    .line 40
    new-instance p1, Lyh4;

    .line 41
    .line 42
    invoke-direct {p1, p0, p2}, Lyh4;-><init>(Lbi4;I)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lbi4;->r:Lyh4;

    .line 46
    .line 47
    new-instance p1, Lyh4;

    .line 48
    .line 49
    const/4 p2, 0x0

    .line 50
    invoke-direct {p1, p0, p2}, Lyh4;-><init>(Lbi4;I)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lbi4;->s:Lyh4;

    .line 54
    .line 55
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance p2, Landroid/os/Handler;

    .line 63
    .line 64
    const/4 p3, 0x0

    .line 65
    invoke-direct {p2, p1, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 66
    .line 67
    .line 68
    iput-object p2, p0, Lbi4;->t:Landroid/os/Handler;

    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    new-array p2, p1, [Lai4;

    .line 72
    .line 73
    iput-object p2, p0, Lbi4;->x:[Lai4;

    .line 74
    .line 75
    new-array p1, p1, [Lki4;

    .line 76
    .line 77
    iput-object p1, p0, Lbi4;->w:[Lki4;

    .line 78
    .line 79
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    iput-wide p1, p0, Lbi4;->N:J

    .line 85
    .line 86
    const/4 p1, 0x1

    .line 87
    iput p1, p0, Lbi4;->G:I

    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lbi4;->N:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public final B()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbi4;->z:Z

    .line 2
    .line 3
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbi4;->C:Lp21;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lbi4;->D:Lcg1;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final a(Lih4;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbi4;->u:Lih4;

    .line 2
    .line 3
    iget-object p1, p0, Lbi4;->q:Lhp2;

    .line 4
    .line 5
    invoke-virtual {p1}, Lhp2;->a()Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lbi4;->w()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(Lnb4;)Z
    .locals 1

    .line 1
    iget-boolean p1, p0, Lbi4;->Q:Z

    .line 2
    .line 3
    if-nez p1, :cond_4

    .line 4
    .line 5
    iget-object p1, p0, Lbi4;->o:Lt83;

    .line 6
    .line 7
    iget-object v0, p1, Lt83;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/io/IOException;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-boolean v0, p0, Lbi4;->O:Z

    .line 15
    .line 16
    if-nez v0, :cond_4

    .line 17
    .line 18
    iget-boolean v0, p0, Lbi4;->z:Z

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget v0, p0, Lbi4;->K:I

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    :goto_0
    iget-object v0, p0, Lbi4;->q:Lhp2;

    .line 29
    .line 30
    invoke-virtual {v0}, Lhp2;->a()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object p1, p1, Lt83;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lyj4;

    .line 37
    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    return v0

    .line 41
    :cond_3
    invoke-virtual {p0}, Lbi4;->w()V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    return p1

    .line 46
    :cond_4
    :goto_1
    const/4 p1, 0x0

    .line 47
    return p1
.end method

.method public final c(Lxh4;Z)V
    .locals 13

    .line 1
    iget-object v0, p1, Lxh4;->b:Ljs3;

    .line 2
    .line 3
    new-instance v1, Lch4;

    .line 4
    .line 5
    iget-object v0, v0, Ljs3;->g:Landroid/net/Uri;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-wide v2, p1, Lxh4;->i:J

    .line 11
    .line 12
    iget-wide v4, p0, Lbi4;->E:J

    .line 13
    .line 14
    new-instance v6, Lhh4;

    .line 15
    .line 16
    invoke-static {v2, v3}, Lv23;->q(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v9

    .line 20
    invoke-static {v4, v5}, Lv23;->q(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v11

    .line 24
    const/4 v7, -0x1

    .line 25
    const/4 v8, 0x0

    .line 26
    invoke-direct/range {v6 .. v12}, Lhh4;-><init>(ILph4;JJ)V

    .line 27
    .line 28
    .line 29
    new-instance p1, Ljr3;

    .line 30
    .line 31
    const/16 v0, 0x9

    .line 32
    .line 33
    iget-object v2, p0, Lbi4;->i:Lwt2;

    .line 34
    .line 35
    invoke-direct {p1, v2, v1, v6, v0}, Ljr3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p1}, Lwt2;->n(Lnp2;)V

    .line 39
    .line 40
    .line 41
    if-nez p2, :cond_1

    .line 42
    .line 43
    iget-object p1, p0, Lbi4;->w:[Lki4;

    .line 44
    .line 45
    array-length p2, p1

    .line 46
    const/4 v0, 0x0

    .line 47
    move v1, v0

    .line 48
    :goto_0
    if-ge v1, p2, :cond_0

    .line 49
    .line 50
    aget-object v2, p1, v1

    .line 51
    .line 52
    invoke-virtual {v2, v0}, Lki4;->i(Z)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget p1, p0, Lbi4;->K:I

    .line 59
    .line 60
    if-lez p1, :cond_1

    .line 61
    .line 62
    iget-object p1, p0, Lbi4;->u:Lih4;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, p0}, Lih4;->c(Lmi4;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    return-void
.end method

.method public final d(J)J
    .locals 12

    .line 1
    invoke-virtual {p0}, Lbi4;->B()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbi4;->C:Lp21;

    .line 5
    .line 6
    iget-object v0, v0, Lp21;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [Z

    .line 9
    .line 10
    iget-object v1, p0, Lbi4;->D:Lcg1;

    .line 11
    .line 12
    invoke-interface {v1}, Lcg1;->d()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eq v2, v1, :cond_0

    .line 18
    .line 19
    const-wide/16 p1, 0x0

    .line 20
    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    iput-boolean v1, p0, Lbi4;->I:Z

    .line 23
    .line 24
    iget-wide v3, p0, Lbi4;->M:J

    .line 25
    .line 26
    iput-wide p1, p0, Lbi4;->M:J

    .line 27
    .line 28
    invoke-virtual {p0}, Lbi4;->A()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    iput-wide p1, p0, Lbi4;->N:J

    .line 35
    .line 36
    return-wide p1

    .line 37
    :cond_1
    iget v5, p0, Lbi4;->G:I

    .line 38
    .line 39
    const/4 v6, 0x7

    .line 40
    if-eq v5, v6, :cond_8

    .line 41
    .line 42
    iget-boolean v5, p0, Lbi4;->Q:Z

    .line 43
    .line 44
    if-nez v5, :cond_2

    .line 45
    .line 46
    iget-object v5, p0, Lbi4;->o:Lt83;

    .line 47
    .line 48
    iget-object v5, v5, Lt83;->h:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v5, Lyj4;

    .line 51
    .line 52
    if-eqz v5, :cond_8

    .line 53
    .line 54
    :cond_2
    iget-object v5, p0, Lbi4;->w:[Lki4;

    .line 55
    .line 56
    array-length v5, v5

    .line 57
    move v6, v1

    .line 58
    :goto_0
    if-ge v6, v5, :cond_c

    .line 59
    .line 60
    iget-object v7, p0, Lbi4;->w:[Lki4;

    .line 61
    .line 62
    aget-object v7, v7, v6

    .line 63
    .line 64
    iget v8, v7, Lki4;->p:I

    .line 65
    .line 66
    iget v9, v7, Lki4;->r:I

    .line 67
    .line 68
    add-int/2addr v9, v8

    .line 69
    if-nez v9, :cond_3

    .line 70
    .line 71
    cmp-long v9, v3, p1

    .line 72
    .line 73
    if-nez v9, :cond_3

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_3
    iget-boolean v9, p0, Lbi4;->B:Z

    .line 77
    .line 78
    if-eqz v9, :cond_6

    .line 79
    .line 80
    monitor-enter v7

    .line 81
    :try_start_0
    monitor-enter v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    :try_start_1
    iput v1, v7, Lki4;->r:I

    .line 83
    .line 84
    iget-object v9, v7, Lki4;->a:Lii4;

    .line 85
    .line 86
    iget-object v10, v9, Lii4;->c:Lcj1;

    .line 87
    .line 88
    iput-object v10, v9, Lii4;->d:Lcj1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    :try_start_2
    monitor-exit v7

    .line 91
    iget v9, v7, Lki4;->p:I

    .line 92
    .line 93
    if-lt v8, v9, :cond_5

    .line 94
    .line 95
    iget v10, v7, Lki4;->o:I

    .line 96
    .line 97
    add-int/2addr v10, v9

    .line 98
    if-le v8, v10, :cond_4

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    const-wide/high16 v10, -0x8000000000000000L

    .line 102
    .line 103
    iput-wide v10, v7, Lki4;->s:J

    .line 104
    .line 105
    sub-int/2addr v8, v9

    .line 106
    iput v8, v7, Lki4;->r:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    .line 108
    monitor-exit v7

    .line 109
    move v7, v2

    .line 110
    goto :goto_3

    .line 111
    :catchall_0
    move-exception p1

    .line 112
    goto :goto_2

    .line 113
    :cond_5
    :goto_1
    monitor-exit v7

    .line 114
    move v7, v1

    .line 115
    goto :goto_3

    .line 116
    :catchall_1
    move-exception p1

    .line 117
    :try_start_3
    monitor-exit v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 118
    :try_start_4
    throw p1

    .line 119
    :goto_2
    monitor-exit v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 120
    throw p1

    .line 121
    :cond_6
    iget-boolean v8, p0, Lbi4;->Q:Z

    .line 122
    .line 123
    invoke-virtual {v7, p1, p2, v8}, Lki4;->k(JZ)Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    :goto_3
    if-nez v7, :cond_7

    .line 128
    .line 129
    aget-boolean v7, v0, v6

    .line 130
    .line 131
    if-nez v7, :cond_8

    .line 132
    .line 133
    iget-boolean v7, p0, Lbi4;->A:Z

    .line 134
    .line 135
    if-nez v7, :cond_7

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_7
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_8
    :goto_5
    iput-boolean v1, p0, Lbi4;->O:Z

    .line 142
    .line 143
    iput-wide p1, p0, Lbi4;->N:J

    .line 144
    .line 145
    iput-boolean v1, p0, Lbi4;->Q:Z

    .line 146
    .line 147
    iput-boolean v1, p0, Lbi4;->J:Z

    .line 148
    .line 149
    iget-object v0, p0, Lbi4;->o:Lt83;

    .line 150
    .line 151
    iget-object v3, v0, Lt83;->h:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v3, Lyj4;

    .line 154
    .line 155
    if-eqz v3, :cond_9

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_9
    move v2, v1

    .line 159
    :goto_6
    if-eqz v2, :cond_b

    .line 160
    .line 161
    iget-object v2, p0, Lbi4;->w:[Lki4;

    .line 162
    .line 163
    array-length v3, v2

    .line 164
    move v4, v1

    .line 165
    :goto_7
    if-ge v4, v3, :cond_a

    .line 166
    .line 167
    aget-object v5, v2, v4

    .line 168
    .line 169
    invoke-virtual {v5}, Lki4;->l()V

    .line 170
    .line 171
    .line 172
    add-int/lit8 v4, v4, 0x1

    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_a
    iget-object v0, v0, Lt83;->h:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Lyj4;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v1}, Lyj4;->a(Z)V

    .line 183
    .line 184
    .line 185
    return-wide p1

    .line 186
    :cond_b
    const/4 v2, 0x0

    .line 187
    iput-object v2, v0, Lt83;->i:Ljava/lang/Object;

    .line 188
    .line 189
    iget-object v0, p0, Lbi4;->w:[Lki4;

    .line 190
    .line 191
    array-length v2, v0

    .line 192
    move v3, v1

    .line 193
    :goto_8
    if-ge v3, v2, :cond_c

    .line 194
    .line 195
    aget-object v4, v0, v3

    .line 196
    .line 197
    invoke-virtual {v4, v1}, Lki4;->i(Z)V

    .line 198
    .line 199
    .line 200
    add-int/lit8 v3, v3, 0x1

    .line 201
    .line 202
    goto :goto_8

    .line 203
    :cond_c
    return-wide p1
.end method

.method public final e(J)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lbi4;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_5

    .line 6
    :cond_0
    invoke-virtual {p0}, Lbi4;->B()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lbi4;->A()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_5

    .line 14
    .line 15
    iget-object v0, p0, Lbi4;->C:Lp21;

    .line 16
    .line 17
    iget-object v0, v0, Lp21;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, [Z

    .line 20
    .line 21
    iget-object v1, p0, Lbi4;->w:[Lki4;

    .line 22
    .line 23
    array-length v1, v1

    .line 24
    const/4 v2, 0x0

    .line 25
    :goto_0
    if-ge v2, v1, :cond_5

    .line 26
    .line 27
    iget-object v3, p0, Lbi4;->w:[Lki4;

    .line 28
    .line 29
    aget-object v4, v3, v2

    .line 30
    .line 31
    aget-boolean v3, v0, v2

    .line 32
    .line 33
    iget-object v10, v4, Lki4;->a:Lii4;

    .line 34
    .line 35
    monitor-enter v4

    .line 36
    :try_start_0
    iget v5, v4, Lki4;->o:I

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    iget-object v6, v4, Lki4;->m:[J

    .line 41
    .line 42
    move v7, v5

    .line 43
    iget v5, v4, Lki4;->q:I

    .line 44
    .line 45
    aget-wide v8, v6, v5

    .line 46
    .line 47
    cmp-long v6, p1, v8

    .line 48
    .line 49
    if-gez v6, :cond_2

    .line 50
    .line 51
    :cond_1
    move-wide v7, p1

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    if-eqz v3, :cond_3

    .line 54
    .line 55
    iget v3, v4, Lki4;->r:I

    .line 56
    .line 57
    if-eq v3, v7, :cond_3

    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    move v6, v3

    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    move-object p1, v0

    .line 65
    goto :goto_4

    .line 66
    :cond_3
    move v6, v7

    .line 67
    :goto_1
    const/4 v9, 0x0

    .line 68
    move-wide v7, p1

    .line 69
    invoke-virtual/range {v4 .. v9}, Lki4;->f(IIJZ)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const/4 p2, -0x1

    .line 74
    if-eq p1, p2, :cond_4

    .line 75
    .line 76
    invoke-virtual {v4, p1}, Lki4;->g(I)J

    .line 77
    .line 78
    .line 79
    move-result-wide p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    monitor-exit v4

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    :goto_2
    monitor-exit v4

    .line 83
    const-wide/16 p1, -0x1

    .line 84
    .line 85
    :goto_3
    invoke-virtual {v10, p1, p2}, Lii4;->a(J)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    move-wide p1, v7

    .line 91
    goto :goto_0

    .line 92
    :goto_4
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p1

    .line 94
    :cond_5
    :goto_5
    return-void
.end method

.method public final f()J
    .locals 3

    .line 1
    iget-boolean v0, p0, Lbi4;->J:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lbi4;->J:Z

    .line 7
    .line 8
    :goto_0
    iget-wide v0, p0, Lbi4;->M:J

    .line 9
    .line 10
    return-wide v0

    .line 11
    :cond_0
    iget-boolean v0, p0, Lbi4;->I:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-boolean v0, p0, Lbi4;->Q:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lbi4;->x()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v2, p0, Lbi4;->P:I

    .line 24
    .line 25
    if-le v0, v2, :cond_2

    .line 26
    .line 27
    :cond_1
    iput-boolean v1, p0, Lbi4;->I:Z

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    return-wide v0
.end method

.method public final g(Lxh4;)V
    .locals 14

    .line 1
    iget-wide v0, p0, Lbi4;->E:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lbi4;->D:Lcg1;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lbi4;->y(Z)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    const-wide/high16 v4, -0x8000000000000000L

    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-wide/16 v4, 0x2710

    .line 31
    .line 32
    add-long/2addr v2, v4

    .line 33
    :goto_0
    iput-wide v2, p0, Lbi4;->E:J

    .line 34
    .line 35
    iget-object v0, p0, Lbi4;->D:Lcg1;

    .line 36
    .line 37
    iget-boolean v4, p0, Lbi4;->F:Z

    .line 38
    .line 39
    iget-object v5, p0, Lbi4;->k:Lhi4;

    .line 40
    .line 41
    invoke-virtual {v5, v2, v3, v0, v4}, Lhi4;->s(JLcg1;Z)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iget-object v0, p1, Lxh4;->b:Ljs3;

    .line 45
    .line 46
    new-instance v2, Lch4;

    .line 47
    .line 48
    iget-object v0, v0, Ljs3;->g:Landroid/net/Uri;

    .line 49
    .line 50
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    iget-wide v3, p1, Lxh4;->i:J

    .line 54
    .line 55
    iget-wide v5, p0, Lbi4;->E:J

    .line 56
    .line 57
    new-instance v7, Lhh4;

    .line 58
    .line 59
    invoke-static {v3, v4}, Lv23;->q(J)J

    .line 60
    .line 61
    .line 62
    move-result-wide v10

    .line 63
    invoke-static {v5, v6}, Lv23;->q(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v12

    .line 67
    const/4 v8, -0x1

    .line 68
    const/4 v9, 0x0

    .line 69
    invoke-direct/range {v7 .. v13}, Lhh4;-><init>(ILph4;JJ)V

    .line 70
    .line 71
    .line 72
    new-instance p1, Lpb3;

    .line 73
    .line 74
    const/16 v0, 0xa

    .line 75
    .line 76
    iget-object v3, p0, Lbi4;->i:Lwt2;

    .line 77
    .line 78
    invoke-direct {p1, v3, v2, v7, v0}, Lpb3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, p1}, Lwt2;->n(Lnp2;)V

    .line 82
    .line 83
    .line 84
    iput-boolean v1, p0, Lbi4;->Q:Z

    .line 85
    .line 86
    iget-object p1, p0, Lbi4;->u:Lih4;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, p0}, Lih4;->c(Lmi4;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final h(JLlc4;)J
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    invoke-virtual {v0}, Lbi4;->B()V

    .line 8
    .line 9
    .line 10
    iget-object v4, v0, Lbi4;->D:Lcg1;

    .line 11
    .line 12
    invoke-interface {v4}, Lcg1;->d()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const-wide/16 v5, 0x0

    .line 17
    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    return-wide v5

    .line 21
    :cond_0
    iget-object v4, v0, Lbi4;->D:Lcg1;

    .line 22
    .line 23
    invoke-interface {v4, v1, v2}, Lcg1;->b(J)Lbg1;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v7, v4, Lbg1;->a:Ldg1;

    .line 28
    .line 29
    iget-object v4, v4, Lbg1;->b:Ldg1;

    .line 30
    .line 31
    iget-wide v8, v3, Llc4;->a:J

    .line 32
    .line 33
    iget-wide v10, v3, Llc4;->b:J

    .line 34
    .line 35
    cmp-long v3, v8, v5

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    cmp-long v3, v10, v5

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    return-wide v1

    .line 44
    :cond_1
    move-wide v8, v5

    .line 45
    :cond_2
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 46
    .line 47
    sub-long v12, v1, v8

    .line 48
    .line 49
    xor-long/2addr v8, v1

    .line 50
    xor-long v14, v1, v12

    .line 51
    .line 52
    cmp-long v3, v14, v5

    .line 53
    .line 54
    const/4 v14, 0x1

    .line 55
    const/4 v15, 0x0

    .line 56
    if-ltz v3, :cond_3

    .line 57
    .line 58
    move v3, v14

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    move v3, v15

    .line 61
    :goto_0
    cmp-long v8, v8, v5

    .line 62
    .line 63
    if-ltz v8, :cond_4

    .line 64
    .line 65
    move v8, v14

    .line 66
    goto :goto_1

    .line 67
    :cond_4
    move v8, v15

    .line 68
    :goto_1
    or-int/2addr v3, v8

    .line 69
    const-wide/16 v8, 0x1

    .line 70
    .line 71
    const/16 v16, 0x3f

    .line 72
    .line 73
    const-wide v17, 0x7fffffffffffffffL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    if-eqz v3, :cond_5

    .line 79
    .line 80
    move-wide/from16 v19, v12

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    ushr-long v19, v12, v16

    .line 84
    .line 85
    xor-long v19, v19, v8

    .line 86
    .line 87
    add-long v19, v19, v17

    .line 88
    .line 89
    :goto_2
    const-wide/high16 v21, -0x8000000000000000L

    .line 90
    .line 91
    cmp-long v3, v19, v21

    .line 92
    .line 93
    if-nez v3, :cond_7

    .line 94
    .line 95
    cmp-long v3, v12, v21

    .line 96
    .line 97
    if-nez v3, :cond_6

    .line 98
    .line 99
    move-wide/from16 v12, v21

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_6
    :goto_3
    move-wide/from16 v19, v21

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_7
    :goto_4
    cmp-long v3, v19, v17

    .line 106
    .line 107
    if-nez v3, :cond_9

    .line 108
    .line 109
    cmp-long v3, v12, v17

    .line 110
    .line 111
    if-eqz v3, :cond_8

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_8
    move-wide/from16 v19, v17

    .line 115
    .line 116
    :cond_9
    :goto_5
    add-long v12, v1, v10

    .line 117
    .line 118
    xor-long/2addr v10, v1

    .line 119
    xor-long v23, v1, v12

    .line 120
    .line 121
    cmp-long v3, v23, v5

    .line 122
    .line 123
    if-ltz v3, :cond_a

    .line 124
    .line 125
    move v3, v14

    .line 126
    goto :goto_6

    .line 127
    :cond_a
    move v3, v15

    .line 128
    :goto_6
    cmp-long v5, v10, v5

    .line 129
    .line 130
    if-gez v5, :cond_b

    .line 131
    .line 132
    move v5, v14

    .line 133
    goto :goto_7

    .line 134
    :cond_b
    move v5, v15

    .line 135
    :goto_7
    or-int/2addr v3, v5

    .line 136
    if-eqz v3, :cond_c

    .line 137
    .line 138
    move-wide v5, v12

    .line 139
    goto :goto_8

    .line 140
    :cond_c
    ushr-long v5, v12, v16

    .line 141
    .line 142
    xor-long/2addr v5, v8

    .line 143
    add-long v5, v5, v17

    .line 144
    .line 145
    :goto_8
    cmp-long v3, v5, v21

    .line 146
    .line 147
    if-nez v3, :cond_d

    .line 148
    .line 149
    cmp-long v3, v12, v21

    .line 150
    .line 151
    if-nez v3, :cond_f

    .line 152
    .line 153
    goto :goto_9

    .line 154
    :cond_d
    move-wide/from16 v21, v12

    .line 155
    .line 156
    :goto_9
    cmp-long v3, v5, v17

    .line 157
    .line 158
    if-nez v3, :cond_e

    .line 159
    .line 160
    cmp-long v3, v21, v17

    .line 161
    .line 162
    goto :goto_a

    .line 163
    :cond_e
    move-wide/from16 v17, v5

    .line 164
    .line 165
    :cond_f
    :goto_a
    iget-wide v5, v7, Ldg1;->a:J

    .line 166
    .line 167
    cmp-long v3, v19, v5

    .line 168
    .line 169
    if-gtz v3, :cond_10

    .line 170
    .line 171
    cmp-long v3, v5, v17

    .line 172
    .line 173
    if-gtz v3, :cond_10

    .line 174
    .line 175
    move v3, v14

    .line 176
    goto :goto_b

    .line 177
    :cond_10
    move v3, v15

    .line 178
    :goto_b
    iget-wide v7, v4, Ldg1;->a:J

    .line 179
    .line 180
    cmp-long v4, v19, v7

    .line 181
    .line 182
    if-gtz v4, :cond_11

    .line 183
    .line 184
    cmp-long v4, v7, v17

    .line 185
    .line 186
    if-gtz v4, :cond_11

    .line 187
    .line 188
    goto :goto_c

    .line 189
    :cond_11
    move v14, v15

    .line 190
    :goto_c
    if-eqz v3, :cond_12

    .line 191
    .line 192
    if-eqz v14, :cond_12

    .line 193
    .line 194
    sub-long v3, v5, v1

    .line 195
    .line 196
    sub-long v1, v7, v1

    .line 197
    .line 198
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 199
    .line 200
    .line 201
    move-result-wide v3

    .line 202
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    .line 203
    .line 204
    .line 205
    move-result-wide v1

    .line 206
    cmp-long v1, v3, v1

    .line 207
    .line 208
    if-gtz v1, :cond_14

    .line 209
    .line 210
    goto :goto_d

    .line 211
    :cond_12
    if-eqz v3, :cond_13

    .line 212
    .line 213
    :goto_d
    return-wide v5

    .line 214
    :cond_13
    if-eqz v14, :cond_15

    .line 215
    .line 216
    :cond_14
    return-wide v7

    .line 217
    :cond_15
    return-wide v19
.end method

.method public final i()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lbi4;->j()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final j()J
    .locals 12

    .line 1
    invoke-virtual {p0}, Lbi4;->B()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lbi4;->Q:Z

    .line 5
    .line 6
    const-wide/high16 v1, -0x8000000000000000L

    .line 7
    .line 8
    if-nez v0, :cond_7

    .line 9
    .line 10
    iget v0, p0, Lbi4;->K:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {p0}, Lbi4;->A()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-wide v0, p0, Lbi4;->N:J

    .line 22
    .line 23
    return-wide v0

    .line 24
    :cond_1
    iget-boolean v0, p0, Lbi4;->A:Z

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const-wide v4, 0x7fffffffffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lbi4;->w:[Lki4;

    .line 35
    .line 36
    array-length v0, v0

    .line 37
    move v6, v3

    .line 38
    move-wide v7, v4

    .line 39
    :goto_0
    if-ge v6, v0, :cond_4

    .line 40
    .line 41
    iget-object v9, p0, Lbi4;->C:Lp21;

    .line 42
    .line 43
    iget-object v10, v9, Lp21;->g:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v10, [Z

    .line 46
    .line 47
    aget-boolean v10, v10, v6

    .line 48
    .line 49
    if-eqz v10, :cond_2

    .line 50
    .line 51
    iget-object v9, v9, Lp21;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, [Z

    .line 54
    .line 55
    aget-boolean v9, v9, v6

    .line 56
    .line 57
    if-eqz v9, :cond_2

    .line 58
    .line 59
    iget-object v9, p0, Lbi4;->w:[Lki4;

    .line 60
    .line 61
    aget-object v9, v9, v6

    .line 62
    .line 63
    monitor-enter v9

    .line 64
    :try_start_0
    iget-boolean v10, v9, Lki4;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 65
    .line 66
    monitor-exit v9

    .line 67
    if-nez v10, :cond_2

    .line 68
    .line 69
    iget-object v9, p0, Lbi4;->w:[Lki4;

    .line 70
    .line 71
    aget-object v9, v9, v6

    .line 72
    .line 73
    monitor-enter v9

    .line 74
    :try_start_1
    iget-wide v10, v9, Lki4;->u:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    monitor-exit v9

    .line 77
    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    :try_start_2
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 84
    throw v0

    .line 85
    :catchall_1
    move-exception v0

    .line 86
    :try_start_3
    monitor-exit v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 87
    throw v0

    .line 88
    :cond_2
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    move-wide v7, v4

    .line 92
    :cond_4
    cmp-long v0, v7, v4

    .line 93
    .line 94
    if-nez v0, :cond_5

    .line 95
    .line 96
    invoke-virtual {p0, v3}, Lbi4;->y(Z)J

    .line 97
    .line 98
    .line 99
    move-result-wide v7

    .line 100
    :cond_5
    cmp-long v0, v7, v1

    .line 101
    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    iget-wide v0, p0, Lbi4;->M:J

    .line 105
    .line 106
    return-wide v0

    .line 107
    :cond_6
    return-wide v7

    .line 108
    :cond_7
    :goto_2
    return-wide v1
.end method

.method public final k(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l()Lri4;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbi4;->B()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbi4;->C:Lp21;

    .line 5
    .line 6
    iget-object v0, v0, Lp21;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lri4;

    .line 9
    .line 10
    return-object v0
.end method

.method public final m([Lnj4;[Z[Lli4;[ZJ)J
    .locals 9

    .line 1
    invoke-virtual {p0}, Lbi4;->B()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbi4;->C:Lp21;

    .line 5
    .line 6
    iget-object v1, v0, Lp21;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lri4;

    .line 9
    .line 10
    iget-object v0, v0, Lp21;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [Z

    .line 13
    .line 14
    iget v2, p0, Lbi4;->K:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    array-length v5, p1

    .line 19
    const/4 v6, -0x1

    .line 20
    if-ge v4, v5, :cond_2

    .line 21
    .line 22
    aget-object v5, p3, v4

    .line 23
    .line 24
    if-eqz v5, :cond_1

    .line 25
    .line 26
    aget-object v7, p1, v4

    .line 27
    .line 28
    if-eqz v7, :cond_0

    .line 29
    .line 30
    aget-boolean v7, p2, v4

    .line 31
    .line 32
    if-nez v7, :cond_1

    .line 33
    .line 34
    :cond_0
    check-cast v5, Lzh4;

    .line 35
    .line 36
    iget v5, v5, Lzh4;->a:I

    .line 37
    .line 38
    aget-boolean v7, v0, v5

    .line 39
    .line 40
    invoke-static {v7}, Lzt0;->b0(Z)V

    .line 41
    .line 42
    .line 43
    iget v7, p0, Lbi4;->K:I

    .line 44
    .line 45
    add-int/2addr v7, v6

    .line 46
    iput v7, p0, Lbi4;->K:I

    .line 47
    .line 48
    aput-boolean v3, v0, v5

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    aput-object v5, p3, v4

    .line 52
    .line 53
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-boolean p2, p0, Lbi4;->H:Z

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    if-eqz p2, :cond_4

    .line 60
    .line 61
    if-nez v2, :cond_3

    .line 62
    .line 63
    :goto_1
    move p2, v4

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    move p2, v3

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    const-wide/16 v7, 0x0

    .line 68
    .line 69
    cmp-long p2, p5, v7

    .line 70
    .line 71
    if-eqz p2, :cond_3

    .line 72
    .line 73
    iget-boolean p2, p0, Lbi4;->B:Z

    .line 74
    .line 75
    if-nez p2, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :goto_2
    move v2, v3

    .line 79
    :goto_3
    array-length v5, p1

    .line 80
    if-ge v2, v5, :cond_a

    .line 81
    .line 82
    aget-object v5, p3, v2

    .line 83
    .line 84
    if-nez v5, :cond_9

    .line 85
    .line 86
    aget-object v5, p1, v2

    .line 87
    .line 88
    if-eqz v5, :cond_9

    .line 89
    .line 90
    invoke-interface {v5}, Lnj4;->b()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-ne v7, v4, :cond_5

    .line 95
    .line 96
    move v7, v4

    .line 97
    goto :goto_4

    .line 98
    :cond_5
    move v7, v3

    .line 99
    :goto_4
    invoke-static {v7}, Lzt0;->b0(Z)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v5, v3}, Lnj4;->t(I)I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-nez v7, :cond_6

    .line 107
    .line 108
    move v7, v4

    .line 109
    goto :goto_5

    .line 110
    :cond_6
    move v7, v3

    .line 111
    :goto_5
    invoke-static {v7}, Lzt0;->b0(Z)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v5}, Lnj4;->a()Ld02;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    iget-object v8, v1, Lri4;->b:Lsn3;

    .line 119
    .line 120
    invoke-virtual {v8, v7}, Lxm3;->indexOf(Ljava/lang/Object;)I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-ltz v7, :cond_7

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_7
    move v7, v6

    .line 128
    :goto_6
    aget-boolean v8, v0, v7

    .line 129
    .line 130
    xor-int/2addr v8, v4

    .line 131
    invoke-static {v8}, Lzt0;->b0(Z)V

    .line 132
    .line 133
    .line 134
    iget v8, p0, Lbi4;->K:I

    .line 135
    .line 136
    add-int/2addr v8, v4

    .line 137
    iput v8, p0, Lbi4;->K:I

    .line 138
    .line 139
    aput-boolean v4, v0, v7

    .line 140
    .line 141
    iget-boolean v8, p0, Lbi4;->J:Z

    .line 142
    .line 143
    invoke-interface {v5}, Lnj4;->h()Lph4;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    iget-boolean v5, v5, Lph4;->s:Z

    .line 148
    .line 149
    or-int/2addr v5, v8

    .line 150
    iput-boolean v5, p0, Lbi4;->J:Z

    .line 151
    .line 152
    new-instance v5, Lzh4;

    .line 153
    .line 154
    invoke-direct {v5, p0, v7}, Lzh4;-><init>(Lbi4;I)V

    .line 155
    .line 156
    .line 157
    aput-object v5, p3, v2

    .line 158
    .line 159
    aput-boolean v4, p4, v2

    .line 160
    .line 161
    if-nez p2, :cond_9

    .line 162
    .line 163
    iget-object p2, p0, Lbi4;->w:[Lki4;

    .line 164
    .line 165
    aget-object p2, p2, v7

    .line 166
    .line 167
    iget v5, p2, Lki4;->p:I

    .line 168
    .line 169
    iget v7, p2, Lki4;->r:I

    .line 170
    .line 171
    add-int/2addr v5, v7

    .line 172
    if-eqz v5, :cond_8

    .line 173
    .line 174
    invoke-virtual {p2, p5, p6, v4}, Lki4;->k(JZ)Z

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    if-nez p2, :cond_8

    .line 179
    .line 180
    move p2, v4

    .line 181
    goto :goto_7

    .line 182
    :cond_8
    move p2, v3

    .line 183
    :cond_9
    :goto_7
    add-int/lit8 v2, v2, 0x1

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_a
    iget p1, p0, Lbi4;->K:I

    .line 187
    .line 188
    if-nez p1, :cond_d

    .line 189
    .line 190
    iput-boolean v3, p0, Lbi4;->O:Z

    .line 191
    .line 192
    iput-boolean v3, p0, Lbi4;->I:Z

    .line 193
    .line 194
    iput-boolean v3, p0, Lbi4;->J:Z

    .line 195
    .line 196
    iget-object p1, p0, Lbi4;->o:Lt83;

    .line 197
    .line 198
    iget-object p2, p1, Lt83;->h:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast p2, Lyj4;

    .line 201
    .line 202
    if-eqz p2, :cond_c

    .line 203
    .line 204
    iget-object p2, p0, Lbi4;->w:[Lki4;

    .line 205
    .line 206
    array-length p3, p2

    .line 207
    move p4, v3

    .line 208
    :goto_8
    if-ge p4, p3, :cond_b

    .line 209
    .line 210
    aget-object v0, p2, p4

    .line 211
    .line 212
    invoke-virtual {v0}, Lki4;->l()V

    .line 213
    .line 214
    .line 215
    add-int/lit8 p4, p4, 0x1

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_b
    iget-object p1, p1, Lt83;->h:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p1, Lyj4;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v3}, Lyj4;->a(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_b

    .line 229
    :cond_c
    iput-boolean v3, p0, Lbi4;->Q:Z

    .line 230
    .line 231
    iget-object p1, p0, Lbi4;->w:[Lki4;

    .line 232
    .line 233
    array-length p2, p1

    .line 234
    move p3, v3

    .line 235
    :goto_9
    if-ge p3, p2, :cond_f

    .line 236
    .line 237
    aget-object p4, p1, p3

    .line 238
    .line 239
    invoke-virtual {p4, v3}, Lki4;->i(Z)V

    .line 240
    .line 241
    .line 242
    add-int/lit8 p3, p3, 0x1

    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_d
    if-eqz p2, :cond_f

    .line 246
    .line 247
    invoke-virtual {p0, p5, p6}, Lbi4;->d(J)J

    .line 248
    .line 249
    .line 250
    move-result-wide p5

    .line 251
    :goto_a
    array-length p1, p3

    .line 252
    if-ge v3, p1, :cond_f

    .line 253
    .line 254
    aget-object p1, p3, v3

    .line 255
    .line 256
    if-eqz p1, :cond_e

    .line 257
    .line 258
    aput-boolean v4, p4, v3

    .line 259
    .line 260
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 261
    .line 262
    goto :goto_a

    .line 263
    :cond_f
    :goto_b
    iput-boolean v4, p0, Lbi4;->H:Z

    .line 264
    .line 265
    return-wide p5
.end method

.method public final n(I)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lbi4;->B()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbi4;->C:Lp21;

    .line 5
    .line 6
    iget-object v1, v0, Lp21;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, [Z

    .line 9
    .line 10
    aget-boolean v2, v1, p1

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lp21;->f:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lri4;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lri4;->a(I)Ld02;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x0

    .line 23
    iget-object v0, v0, Ld02;->d:[Lph4;

    .line 24
    .line 25
    aget-object v5, v0, v2

    .line 26
    .line 27
    iget-object v0, v5, Lph4;->m:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Lpp1;->g(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    iget-wide v2, p0, Lbi4;->M:J

    .line 34
    .line 35
    move-wide v6, v2

    .line 36
    new-instance v3, Lhh4;

    .line 37
    .line 38
    invoke-static {v6, v7}, Lv23;->q(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v6

    .line 42
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-direct/range {v3 .. v9}, Lhh4;-><init>(ILph4;JJ)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Llv2;

    .line 51
    .line 52
    const/16 v2, 0x13

    .line 53
    .line 54
    iget-object v4, p0, Lbi4;->i:Lwt2;

    .line 55
    .line 56
    invoke-direct {v0, v4, v3, v2}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v0}, Lwt2;->n(Lnp2;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    aput-boolean v0, v1, p1

    .line 64
    .line 65
    :cond_0
    return-void
.end method

.method public final o()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbi4;->o:Lt83;

    .line 2
    .line 3
    iget-object v0, v0, Lt83;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lyj4;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lbi4;->q:Lhp2;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-boolean v1, v0, Lhp2;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v1

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method public final p(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lbi4;->B()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lbi4;->O:Z

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-boolean v0, p0, Lbi4;->A:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lbi4;->C:Lp21;

    .line 13
    .line 14
    iget-object v0, v0, Lp21;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, [Z

    .line 17
    .line 18
    aget-boolean v0, v0, p1

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lbi4;->w:[Lki4;

    .line 23
    .line 24
    aget-object p1, v0, p1

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, v0}, Lki4;->j(Z)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    iput-wide v1, p0, Lbi4;->N:J

    .line 37
    .line 38
    iput-boolean v0, p0, Lbi4;->O:Z

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Lbi4;->I:Z

    .line 42
    .line 43
    iput-wide v1, p0, Lbi4;->M:J

    .line 44
    .line 45
    iput v0, p0, Lbi4;->P:I

    .line 46
    .line 47
    iget-object p1, p0, Lbi4;->w:[Lki4;

    .line 48
    .line 49
    array-length v1, p1

    .line 50
    move v2, v0

    .line 51
    :goto_0
    if-ge v2, v1, :cond_2

    .line 52
    .line 53
    aget-object v3, p1, v2

    .line 54
    .line 55
    invoke-virtual {v3, v0}, Lki4;->i(Z)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-object p1, p0, Lbi4;->u:Lih4;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, p0}, Lih4;->c(Lmi4;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    :goto_1
    return-void
.end method

.method public final q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbi4;->I:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lbi4;->A()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public final r()V
    .locals 3

    .line 1
    iget v0, p0, Lbi4;->G:I

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x6

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x3

    .line 9
    :goto_0
    iget-object v1, p0, Lbi4;->o:Lt83;

    .line 10
    .line 11
    iget-object v2, v1, Lt83;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/io/IOException;

    .line 14
    .line 15
    if-nez v2, :cond_5

    .line 16
    .line 17
    iget-object v1, v1, Lt83;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lyj4;

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v2, v1, Lyj4;->h:Ljava/io/IOException;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    iget v1, v1, Lyj4;->i:I

    .line 28
    .line 29
    if-gt v1, v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    throw v2

    .line 33
    :cond_2
    :goto_1
    iget-boolean v0, p0, Lbi4;->Q:Z

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    iget-boolean v0, p0, Lbi4;->z:Z

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    const-string v0, "Loading finished before preparation is complete."

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-static {v1, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    throw v0

    .line 50
    :cond_4
    :goto_2
    return-void

    .line 51
    :cond_5
    throw v2
.end method

.method public final s()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lbi4;->y:Z

    .line 3
    .line 4
    iget-object v0, p0, Lbi4;->t:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, Lbi4;->r:Lyh4;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final t(Lai4;)Ljg1;
    .locals 5

    .line 1
    iget-object v0, p0, Lbi4;->w:[Lki4;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lbi4;->x:[Lai4;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Lai4;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lbi4;->w:[Lki4;

    .line 18
    .line 19
    aget-object p1, p1, v1

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-boolean v1, p0, Lbi4;->y:Z

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    iget p1, p1, Lai4;->a:I

    .line 30
    .line 31
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x37

    .line 42
    .line 43
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 44
    .line 45
    .line 46
    const-string v0, "Extractor added new track (id="

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, ") after finishing tracks."

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, La30;->x(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance p1, Lgf1;

    .line 67
    .line 68
    invoke-direct {p1}, Lgf1;-><init>()V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_2
    new-instance v1, Lki4;

    .line 73
    .line 74
    iget-object v2, p0, Lbi4;->l:Lrj4;

    .line 75
    .line 76
    iget-object v3, p0, Lbi4;->h:Lpz;

    .line 77
    .line 78
    iget-object v4, p0, Lbi4;->j:Llv2;

    .line 79
    .line 80
    invoke-direct {v1, v2, v3, v4}, Lki4;-><init>(Lrj4;Lpz;Llv2;)V

    .line 81
    .line 82
    .line 83
    iput-object p0, v1, Lki4;->e:Lbi4;

    .line 84
    .line 85
    iget-object v2, p0, Lbi4;->x:[Lai4;

    .line 86
    .line 87
    add-int/lit8 v3, v0, 0x1

    .line 88
    .line 89
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, [Lai4;

    .line 94
    .line 95
    aput-object p1, v2, v0

    .line 96
    .line 97
    sget-object p1, Lv23;->a:Ljava/lang/String;

    .line 98
    .line 99
    iput-object v2, p0, Lbi4;->x:[Lai4;

    .line 100
    .line 101
    iget-object p1, p0, Lbi4;->w:[Lki4;

    .line 102
    .line 103
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, [Lki4;

    .line 108
    .line 109
    aput-object v1, p1, v0

    .line 110
    .line 111
    iput-object p1, p0, Lbi4;->w:[Lki4;

    .line 112
    .line 113
    return-object v1
.end method

.method public final u()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-wide v2, v1, Lbi4;->n:J

    .line 4
    .line 5
    iget-boolean v0, v1, Lbi4;->R:Z

    .line 6
    .line 7
    if-nez v0, :cond_e

    .line 8
    .line 9
    iget-boolean v0, v1, Lbi4;->z:Z

    .line 10
    .line 11
    if-nez v0, :cond_e

    .line 12
    .line 13
    iget-boolean v0, v1, Lbi4;->y:Z

    .line 14
    .line 15
    if-eqz v0, :cond_e

    .line 16
    .line 17
    iget-object v0, v1, Lbi4;->D:Lcg1;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_9

    .line 22
    .line 23
    :cond_0
    iget-object v0, v1, Lbi4;->w:[Lki4;

    .line 24
    .line 25
    array-length v4, v0

    .line 26
    const/4 v5, 0x0

    .line 27
    move v6, v5

    .line 28
    :goto_0
    const/4 v7, 0x0

    .line 29
    if-ge v6, v4, :cond_2

    .line 30
    .line 31
    aget-object v8, v0, v6

    .line 32
    .line 33
    monitor-enter v8

    .line 34
    :try_start_0
    iget-boolean v9, v8, Lki4;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    if-eqz v9, :cond_1

    .line 37
    .line 38
    :goto_1
    monitor-exit v8

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    :try_start_1
    iget-object v7, v8, Lki4;->y:Lph4;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :goto_2
    if-eqz v7, :cond_e

    .line 44
    .line 45
    add-int/lit8 v6, v6, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw v0

    .line 51
    :cond_2
    iget-object v4, v1, Lbi4;->q:Lhp2;

    .line 52
    .line 53
    monitor-enter v4

    .line 54
    :try_start_2
    iput-boolean v5, v4, Lhp2;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 55
    .line 56
    monitor-exit v4

    .line 57
    iget-object v0, v1, Lbi4;->w:[Lki4;

    .line 58
    .line 59
    array-length v0, v0

    .line 60
    new-array v4, v0, [Ld02;

    .line 61
    .line 62
    new-array v6, v0, [Z

    .line 63
    .line 64
    move v8, v5

    .line 65
    :goto_3
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    const/4 v11, 0x1

    .line 71
    if-ge v8, v0, :cond_c

    .line 72
    .line 73
    iget-object v12, v1, Lbi4;->w:[Lki4;

    .line 74
    .line 75
    aget-object v12, v12, v8

    .line 76
    .line 77
    monitor-enter v12

    .line 78
    :try_start_3
    iget-boolean v13, v12, Lki4;->x:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 79
    .line 80
    if-eqz v13, :cond_3

    .line 81
    .line 82
    monitor-exit v12

    .line 83
    move-object v13, v7

    .line 84
    goto :goto_4

    .line 85
    :cond_3
    :try_start_4
    iget-object v13, v12, Lki4;->y:Lph4;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 86
    .line 87
    monitor-exit v12

    .line 88
    :goto_4
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object v12, v13, Lph4;->m:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v12}, Lpp1;->a(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v14

    .line 97
    if-nez v14, :cond_4

    .line 98
    .line 99
    invoke-static {v12}, Lpp1;->b(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v15

    .line 103
    if-eqz v15, :cond_5

    .line 104
    .line 105
    :cond_4
    move v15, v11

    .line 106
    goto :goto_5

    .line 107
    :cond_5
    move v15, v5

    .line 108
    :goto_5
    aput-boolean v15, v6, v8

    .line 109
    .line 110
    move/from16 v16, v5

    .line 111
    .line 112
    iget-boolean v5, v1, Lbi4;->A:Z

    .line 113
    .line 114
    or-int/2addr v5, v15

    .line 115
    iput-boolean v5, v1, Lbi4;->A:Z

    .line 116
    .line 117
    invoke-static {v12}, Lpp1;->c(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    cmp-long v9, v2, v9

    .line 122
    .line 123
    if-eqz v9, :cond_6

    .line 124
    .line 125
    if-ne v0, v11, :cond_6

    .line 126
    .line 127
    if-eqz v5, :cond_6

    .line 128
    .line 129
    move v5, v11

    .line 130
    goto :goto_6

    .line 131
    :cond_6
    move/from16 v5, v16

    .line 132
    .line 133
    :goto_6
    iput-boolean v5, v1, Lbi4;->B:Z

    .line 134
    .line 135
    iget-object v5, v1, Lbi4;->v:Loh1;

    .line 136
    .line 137
    if-eqz v5, :cond_a

    .line 138
    .line 139
    if-nez v14, :cond_7

    .line 140
    .line 141
    iget-object v9, v1, Lbi4;->x:[Lai4;

    .line 142
    .line 143
    aget-object v9, v9, v8

    .line 144
    .line 145
    iget-boolean v9, v9, Lai4;->b:Z

    .line 146
    .line 147
    if-eqz v9, :cond_9

    .line 148
    .line 149
    :cond_7
    iget-object v9, v13, Lph4;->k:Lwn1;

    .line 150
    .line 151
    if-nez v9, :cond_8

    .line 152
    .line 153
    new-instance v9, Lwn1;

    .line 154
    .line 155
    new-array v10, v11, [Len1;

    .line 156
    .line 157
    aput-object v5, v10, v16

    .line 158
    .line 159
    invoke-direct {v9, v10}, Lwn1;-><init>([Len1;)V

    .line 160
    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_8
    new-array v10, v11, [Len1;

    .line 164
    .line 165
    aput-object v5, v10, v16

    .line 166
    .line 167
    invoke-virtual {v9, v10}, Lwn1;->c([Len1;)Lwn1;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    :goto_7
    new-instance v10, Lgg4;

    .line 172
    .line 173
    invoke-direct {v10, v13}, Lgg4;-><init>(Lph4;)V

    .line 174
    .line 175
    .line 176
    iput-object v9, v10, Lgg4;->j:Lwn1;

    .line 177
    .line 178
    new-instance v13, Lph4;

    .line 179
    .line 180
    invoke-direct {v13, v10}, Lph4;-><init>(Lgg4;)V

    .line 181
    .line 182
    .line 183
    :cond_9
    if-eqz v14, :cond_a

    .line 184
    .line 185
    iget v9, v13, Lph4;->g:I

    .line 186
    .line 187
    const/4 v10, -0x1

    .line 188
    if-ne v9, v10, :cond_a

    .line 189
    .line 190
    iget v9, v13, Lph4;->h:I

    .line 191
    .line 192
    if-ne v9, v10, :cond_a

    .line 193
    .line 194
    iget v5, v5, Loh1;->a:I

    .line 195
    .line 196
    if-eq v5, v10, :cond_a

    .line 197
    .line 198
    new-instance v9, Lgg4;

    .line 199
    .line 200
    invoke-direct {v9, v13}, Lgg4;-><init>(Lph4;)V

    .line 201
    .line 202
    .line 203
    iput v5, v9, Lgg4;->g:I

    .line 204
    .line 205
    new-instance v13, Lph4;

    .line 206
    .line 207
    invoke-direct {v13, v9}, Lph4;-><init>(Lgg4;)V

    .line 208
    .line 209
    .line 210
    :cond_a
    iget-object v5, v1, Lbi4;->h:Lpz;

    .line 211
    .line 212
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    iget-object v5, v13, Lph4;->q:Lie4;

    .line 216
    .line 217
    if-eqz v5, :cond_b

    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_b
    move/from16 v11, v16

    .line 221
    .line 222
    :goto_8
    new-instance v5, Lgg4;

    .line 223
    .line 224
    invoke-direct {v5, v13}, Lgg4;-><init>(Lph4;)V

    .line 225
    .line 226
    .line 227
    iput v11, v5, Lgg4;->K:I

    .line 228
    .line 229
    new-instance v9, Lph4;

    .line 230
    .line 231
    invoke-direct {v9, v5}, Lph4;-><init>(Lgg4;)V

    .line 232
    .line 233
    .line 234
    new-instance v5, Ld02;

    .line 235
    .line 236
    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    filled-new-array {v9}, [Lph4;

    .line 241
    .line 242
    .line 243
    move-result-object v11

    .line 244
    invoke-direct {v5, v10, v11}, Ld02;-><init>(Ljava/lang/String;[Lph4;)V

    .line 245
    .line 246
    .line 247
    aput-object v5, v4, v8

    .line 248
    .line 249
    iget-boolean v5, v1, Lbi4;->J:Z

    .line 250
    .line 251
    iget-boolean v9, v9, Lph4;->s:Z

    .line 252
    .line 253
    or-int/2addr v5, v9

    .line 254
    iput-boolean v5, v1, Lbi4;->J:Z

    .line 255
    .line 256
    add-int/lit8 v8, v8, 0x1

    .line 257
    .line 258
    move/from16 v5, v16

    .line 259
    .line 260
    goto/16 :goto_3

    .line 261
    .line 262
    :catchall_1
    move-exception v0

    .line 263
    :try_start_5
    monitor-exit v12
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 264
    throw v0

    .line 265
    :cond_c
    new-instance v0, Lp21;

    .line 266
    .line 267
    new-instance v5, Lri4;

    .line 268
    .line 269
    invoke-direct {v5, v4}, Lri4;-><init>([Ld02;)V

    .line 270
    .line 271
    .line 272
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 273
    .line 274
    .line 275
    iput-object v5, v0, Lp21;->f:Ljava/lang/Object;

    .line 276
    .line 277
    iput-object v6, v0, Lp21;->g:Ljava/lang/Object;

    .line 278
    .line 279
    iget v4, v5, Lri4;->a:I

    .line 280
    .line 281
    new-array v5, v4, [Z

    .line 282
    .line 283
    iput-object v5, v0, Lp21;->h:Ljava/lang/Object;

    .line 284
    .line 285
    new-array v4, v4, [Z

    .line 286
    .line 287
    iput-object v4, v0, Lp21;->i:Ljava/lang/Object;

    .line 288
    .line 289
    iput-object v0, v1, Lbi4;->C:Lp21;

    .line 290
    .line 291
    iget-boolean v0, v1, Lbi4;->B:Z

    .line 292
    .line 293
    if-eqz v0, :cond_d

    .line 294
    .line 295
    iget-wide v4, v1, Lbi4;->E:J

    .line 296
    .line 297
    cmp-long v0, v4, v9

    .line 298
    .line 299
    if-nez v0, :cond_d

    .line 300
    .line 301
    iput-wide v2, v1, Lbi4;->E:J

    .line 302
    .line 303
    new-instance v0, Lwh4;

    .line 304
    .line 305
    iget-object v2, v1, Lbi4;->D:Lcg1;

    .line 306
    .line 307
    invoke-direct {v0, v1, v2}, Lwh4;-><init>(Lbi4;Lcg1;)V

    .line 308
    .line 309
    .line 310
    iput-object v0, v1, Lbi4;->D:Lcg1;

    .line 311
    .line 312
    :cond_d
    iget-object v0, v1, Lbi4;->k:Lhi4;

    .line 313
    .line 314
    iget-wide v2, v1, Lbi4;->E:J

    .line 315
    .line 316
    iget-object v4, v1, Lbi4;->D:Lcg1;

    .line 317
    .line 318
    iget-boolean v5, v1, Lbi4;->F:Z

    .line 319
    .line 320
    invoke-virtual {v0, v2, v3, v4, v5}, Lhi4;->s(JLcg1;Z)V

    .line 321
    .line 322
    .line 323
    iput-boolean v11, v1, Lbi4;->z:Z

    .line 324
    .line 325
    iget-object v0, v1, Lbi4;->u:Lih4;

    .line 326
    .line 327
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    invoke-interface {v0, v1}, Lih4;->g(Ljh4;)V

    .line 331
    .line 332
    .line 333
    return-void

    .line 334
    :catchall_2
    move-exception v0

    .line 335
    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 336
    throw v0

    .line 337
    :cond_e
    :goto_9
    return-void
.end method

.method public final v(Lcg1;)V
    .locals 2

    .line 1
    new-instance v0, Lve4;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lve4;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lbi4;->t:Landroid/os/Handler;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final w()V
    .locals 12

    .line 1
    new-instance v0, Lxh4;

    .line 2
    .line 3
    iget-object v4, p0, Lbi4;->p:Ljr3;

    .line 4
    .line 5
    iget-object v6, p0, Lbi4;->q:Lhp2;

    .line 6
    .line 7
    iget-object v2, p0, Lbi4;->f:Landroid/net/Uri;

    .line 8
    .line 9
    iget-object v3, p0, Lbi4;->g:Lth3;

    .line 10
    .line 11
    move-object v5, p0

    .line 12
    move-object v1, p0

    .line 13
    invoke-direct/range {v0 .. v6}, Lxh4;-><init>(Lbi4;Landroid/net/Uri;Lth3;Ljr3;Lbi4;Lhp2;)V

    .line 14
    .line 15
    .line 16
    iget-boolean v2, v1, Lbi4;->z:Z

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x1

    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, Lbi4;->A()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {v2}, Lzt0;->b0(Z)V

    .line 27
    .line 28
    .line 29
    iget-wide v2, v1, Lbi4;->E:J

    .line 30
    .line 31
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    cmp-long v6, v2, v4

    .line 37
    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget-wide v9, v1, Lbi4;->N:J

    .line 41
    .line 42
    cmp-long v2, v9, v2

    .line 43
    .line 44
    if-gtz v2, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iput-boolean v8, v1, Lbi4;->Q:Z

    .line 48
    .line 49
    iput-wide v4, v1, Lbi4;->N:J

    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    :goto_0
    iget-object v2, v1, Lbi4;->D:Lcg1;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-wide v9, v1, Lbi4;->N:J

    .line 58
    .line 59
    invoke-interface {v2, v9, v10}, Lcg1;->b(J)Lbg1;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget-object v2, v2, Lbg1;->a:Ldg1;

    .line 64
    .line 65
    iget-wide v9, v1, Lbi4;->N:J

    .line 66
    .line 67
    iget-wide v2, v2, Ldg1;->b:J

    .line 68
    .line 69
    iget-object v6, v0, Lxh4;->f:Lpf1;

    .line 70
    .line 71
    iput-wide v2, v6, Lpf1;->a:J

    .line 72
    .line 73
    iput-wide v9, v0, Lxh4;->i:J

    .line 74
    .line 75
    iput-boolean v8, v0, Lxh4;->h:Z

    .line 76
    .line 77
    iput-boolean v7, v0, Lxh4;->l:Z

    .line 78
    .line 79
    iget-object v2, v1, Lbi4;->w:[Lki4;

    .line 80
    .line 81
    array-length v3, v2

    .line 82
    move v6, v7

    .line 83
    :goto_1
    if-ge v6, v3, :cond_2

    .line 84
    .line 85
    aget-object v9, v2, v6

    .line 86
    .line 87
    iget-wide v10, v1, Lbi4;->N:J

    .line 88
    .line 89
    iput-wide v10, v9, Lki4;->s:J

    .line 90
    .line 91
    add-int/lit8 v6, v6, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    iput-wide v4, v1, Lbi4;->N:J

    .line 95
    .line 96
    :cond_3
    invoke-virtual {p0}, Lbi4;->x()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    iput v2, v1, Lbi4;->P:I

    .line 101
    .line 102
    move-object v4, v1

    .line 103
    iget-object v1, v4, Lbi4;->o:Lt83;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    const/4 v3, 0x0

    .line 116
    iput-object v3, v1, Lt83;->i:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 119
    .line 120
    .line 121
    move-result-wide v5

    .line 122
    move-object v3, v0

    .line 123
    new-instance v0, Lyj4;

    .line 124
    .line 125
    invoke-direct/range {v0 .. v6}, Lyj4;-><init>(Lt83;Landroid/os/Looper;Lxh4;Lbi4;J)V

    .line 126
    .line 127
    .line 128
    iget-object v1, v0, Lyj4;->m:Lt83;

    .line 129
    .line 130
    iget-object v2, v1, Lt83;->h:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v2, Lyj4;

    .line 133
    .line 134
    if-nez v2, :cond_4

    .line 135
    .line 136
    move v7, v8

    .line 137
    :cond_4
    invoke-static {v7}, Lzt0;->b0(Z)V

    .line 138
    .line 139
    .line 140
    iput-object v0, v1, Lt83;->h:Ljava/lang/Object;

    .line 141
    .line 142
    invoke-virtual {v0}, Lyj4;->b()V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public final x()I
    .locals 6

    .line 1
    iget-object v0, p0, Lbi4;->w:[Lki4;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v2, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v2

    .line 9
    .line 10
    iget v5, v4, Lki4;->p:I

    .line 11
    .line 12
    iget v4, v4, Lki4;->o:I

    .line 13
    .line 14
    add-int/2addr v5, v4

    .line 15
    add-int/2addr v3, v5

    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v3
.end method

.method public final y(Z)J
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const-wide/high16 v1, -0x8000000000000000L

    .line 3
    .line 4
    :goto_0
    iget-object v3, p0, Lbi4;->w:[Lki4;

    .line 5
    .line 6
    array-length v4, v3

    .line 7
    if-ge v0, v4, :cond_2

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object v4, p0, Lbi4;->C:Lp21;

    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v4, v4, Lp21;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, [Z

    .line 19
    .line 20
    aget-boolean v4, v4, v0

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    :cond_0
    aget-object v3, v3, v0

    .line 25
    .line 26
    monitor-enter v3

    .line 27
    :try_start_0
    iget-wide v4, v3, Lki4;->u:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    monitor-exit v3

    .line 30
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw p1

    .line 40
    :cond_2
    return-wide v1
.end method

.method public final z(II)Ljg1;
    .locals 1

    .line 1
    new-instance p2, Lai4;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p1, v0}, Lai4;-><init>(IZ)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lbi4;->t(Lai4;)Ljg1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
