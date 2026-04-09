.class public final Ldf4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final f0:Ljava/lang/Object;

.field public static g0:Ljava/util/concurrent/ScheduledExecutorService;

.field public static h0:I


# instance fields
.field public A:J

.field public B:J

.field public C:J

.field public D:J

.field public E:I

.field public F:Z

.field public G:Z

.field public H:J

.field public I:F

.field public J:Ljava/nio/ByteBuffer;

.field public K:I

.field public L:Ljava/nio/ByteBuffer;

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:I

.field public R:Z

.field public S:Ljx2;

.field public T:Landroid/media/AudioDeviceInfo;

.field public U:J

.field public V:Z

.field public W:Landroid/os/Looper;

.field public X:J

.field public Y:J

.field public Z:Landroid/os/Handler;

.field public final a:Landroid/content/Context;

.field public a0:Landroid/content/Context;

.field public final b:Lre4;

.field public final b0:Z

.field public final c:Lhf4;

.field public c0:I

.field public final d:Lih2;

.field public final d0:Ljr3;

.field public final e:Lgf4;

.field public final e0:Lwt2;

.field public final f:Lsn3;

.field public final g:Lqe4;

.field public final h:Ljava/util/ArrayDeque;

.field public i:Lpb3;

.field public final j:Lrn1;

.field public final k:Lrn1;

.field public final l:I

.field public m:Lxd4;

.field public n:Lbi3;

.field public o:Lse4;

.field public p:Lse4;

.field public q:Lnd2;

.field public r:Landroid/media/AudioTrack;

.field public s:Lae4;

.field public t:Lx03;

.field public u:Lmc2;

.field public v:Lin2;

.field public w:Lue4;

.field public x:Lue4;

.field public y:Lsr1;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldf4;->f0:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lde3;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lde3;->g:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/content/Context;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    :goto_0
    iput-object v2, p0, Ldf4;->a:Landroid/content/Context;

    .line 18
    .line 19
    sget-object v3, Lin2;->b:Lin2;

    .line 20
    .line 21
    iput-object v3, p0, Ldf4;->v:Lin2;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    iget-object v1, p1, Lde3;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lae4;

    .line 29
    .line 30
    :goto_1
    iput-object v1, p0, Ldf4;->s:Lae4;

    .line 31
    .line 32
    iget-object v1, p1, Lde3;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljr3;

    .line 35
    .line 36
    iput-object v1, p0, Ldf4;->d0:Ljr3;

    .line 37
    .line 38
    iget-object p1, p1, Lde3;->j:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lwt2;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Ldf4;->e0:Lwt2;

    .line 46
    .line 47
    new-instance p1, Lqe4;

    .line 48
    .line 49
    new-instance v1, Lrc3;

    .line 50
    .line 51
    const/16 v2, 0x9

    .line 52
    .line 53
    invoke-direct {v1, v2, p0}, Lrc3;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, v1}, Lqe4;-><init>(Lrc3;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Ldf4;->g:Lqe4;

    .line 60
    .line 61
    new-instance p1, Lre4;

    .line 62
    .line 63
    invoke-direct {p1}, Lbg2;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Ldf4;->b:Lre4;

    .line 67
    .line 68
    new-instance v1, Lhf4;

    .line 69
    .line 70
    invoke-direct {v1}, Lbg2;-><init>()V

    .line 71
    .line 72
    .line 73
    sget-object v2, Lv23;->b:[B

    .line 74
    .line 75
    iput-object v2, v1, Lhf4;->m:[B

    .line 76
    .line 77
    iput-object v1, p0, Ldf4;->c:Lhf4;

    .line 78
    .line 79
    new-instance v2, Lih2;

    .line 80
    .line 81
    invoke-direct {v2}, Lbg2;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v2, p0, Ldf4;->d:Lih2;

    .line 85
    .line 86
    new-instance v2, Lgf4;

    .line 87
    .line 88
    invoke-direct {v2}, Lbg2;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v2, p0, Ldf4;->e:Lgf4;

    .line 92
    .line 93
    invoke-static {v1, p1}, Lxm3;->j(Ljava/lang/Object;Ljava/lang/Object;)Lsn3;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, Ldf4;->f:Lsn3;

    .line 98
    .line 99
    const/high16 p1, 0x3f800000    # 1.0f

    .line 100
    .line 101
    iput p1, p0, Ldf4;->I:F

    .line 102
    .line 103
    const/4 p1, 0x0

    .line 104
    iput p1, p0, Ldf4;->Q:I

    .line 105
    .line 106
    new-instance v1, Ljx2;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v1, p0, Ldf4;->S:Ljx2;

    .line 112
    .line 113
    new-instance v2, Lue4;

    .line 114
    .line 115
    sget-object v3, Lsr1;->d:Lsr1;

    .line 116
    .line 117
    const-wide/16 v4, 0x0

    .line 118
    .line 119
    const-wide/16 v6, 0x0

    .line 120
    .line 121
    invoke-direct/range {v2 .. v7}, Lue4;-><init>(Lsr1;JJ)V

    .line 122
    .line 123
    .line 124
    iput-object v2, p0, Ldf4;->x:Lue4;

    .line 125
    .line 126
    iput-object v3, p0, Ldf4;->y:Lsr1;

    .line 127
    .line 128
    iput-boolean p1, p0, Ldf4;->z:Z

    .line 129
    .line 130
    new-instance p1, Ljava/util/ArrayDeque;

    .line 131
    .line 132
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 133
    .line 134
    .line 135
    iput-object p1, p0, Ldf4;->h:Ljava/util/ArrayDeque;

    .line 136
    .line 137
    new-instance p1, Lrn1;

    .line 138
    .line 139
    invoke-direct {p1}, Lrn1;-><init>()V

    .line 140
    .line 141
    .line 142
    iput-object p1, p0, Ldf4;->j:Lrn1;

    .line 143
    .line 144
    new-instance p1, Lrn1;

    .line 145
    .line 146
    invoke-direct {p1}, Lrn1;-><init>()V

    .line 147
    .line 148
    .line 149
    iput-object p1, p0, Ldf4;->k:Lrn1;

    .line 150
    .line 151
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 152
    .line 153
    const/16 v1, 0x22

    .line 154
    .line 155
    const/4 v2, -0x1

    .line 156
    if-lt p1, v1, :cond_4

    .line 157
    .line 158
    if-nez v0, :cond_2

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_2
    invoke-static {v0}, Ltc0;->b(Landroid/content/Context;)I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_4

    .line 166
    .line 167
    if-ne p1, v2, :cond_3

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_3
    move v2, p1

    .line 171
    :cond_4
    :goto_2
    iput v2, p0, Ldf4;->l:I

    .line 172
    .line 173
    const/4 p1, 0x1

    .line 174
    iput-boolean p1, p0, Ldf4;->b0:Z

    .line 175
    .line 176
    return-void
.end method

.method public static l(Landroid/media/AudioTrack;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Li71;->t(Landroid/media/AudioTrack;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static final n(Lle4;Lin2;ILph4;Landroid/content/Context;)Landroid/media/AudioTrack;
    .locals 11

    .line 1
    :try_start_0
    iget v0, p0, Lle4;->b:I

    .line 2
    .line 3
    iget v1, p0, Lle4;->c:I

    .line 4
    .line 5
    iget v2, p0, Lle4;->a:I
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3

    .line 6
    .line 7
    :try_start_1
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v3, Landroid/media/AudioFormat$Builder;

    .line 10
    .line 11
    invoke-direct {v3}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, v1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, v2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 27
    .line 28
    .line 29
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_5

    .line 30
    :try_start_2
    invoke-virtual {p1}, Lin2;->a()Landroid/media/AudioAttributes;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v1, Landroid/media/AudioTrack$Builder;

    .line 35
    .line 36
    invoke-direct {v1}, Landroid/media/AudioTrack$Builder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Landroid/media/AudioTrack$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1, v0}, Landroid/media/AudioTrack$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v0, 0x1

    .line 48
    invoke-virtual {p1, v0}, Landroid/media/AudioTrack$Builder;->setTransferMode(I)Landroid/media/AudioTrack$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget v1, p0, Lle4;->e:I

    .line 53
    .line 54
    invoke-virtual {p1, v1}, Landroid/media/AudioTrack$Builder;->setBufferSizeInBytes(I)Landroid/media/AudioTrack$Builder;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1, p2}, Landroid/media/AudioTrack$Builder;->setSessionId(I)Landroid/media/AudioTrack$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_2
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_3

    .line 63
    .line 64
    const/16 v1, 0x1d

    .line 65
    .line 66
    if-lt p2, v1, :cond_0

    .line 67
    .line 68
    :try_start_3
    iget-boolean v1, p0, Lle4;->d:Z

    .line 69
    .line 70
    invoke-static {p1, v1}, Li71;->l(Landroid/media/AudioTrack$Builder;Z)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catch_0
    move-exception v0

    .line 75
    :goto_0
    move-object p1, v0

    .line 76
    move-object v10, p1

    .line 77
    move-object v7, p3

    .line 78
    goto :goto_3

    .line 79
    :catch_1
    move-exception v0

    .line 80
    goto :goto_0

    .line 81
    :cond_0
    :goto_1
    const/16 v1, 0x22

    .line 82
    .line 83
    if-lt p2, v1, :cond_1

    .line 84
    .line 85
    if-eqz p4, :cond_1

    .line 86
    .line 87
    invoke-static {p1, p4}, Ltc0;->t(Landroid/media/AudioTrack$Builder;Landroid/content/Context;)V
    :try_end_3
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0

    .line 88
    .line 89
    .line 90
    :cond_1
    :try_start_4
    invoke-virtual {p1}, Landroid/media/AudioTrack$Builder;->build()Landroid/media/AudioTrack;

    .line 91
    .line 92
    .line 93
    move-result-object p1
    :try_end_4
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_3

    .line 94
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getState()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-ne v2, v0, :cond_2

    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_2
    :try_start_5
    invoke-virtual {p1}, Landroid/media/AudioTrack;->release()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 102
    .line 103
    .line 104
    :catch_2
    iget v3, p0, Lle4;->b:I

    .line 105
    .line 106
    iget v4, p0, Lle4;->c:I

    .line 107
    .line 108
    iget v5, p0, Lle4;->a:I

    .line 109
    .line 110
    iget v6, p0, Lle4;->e:I

    .line 111
    .line 112
    iget-boolean v8, p0, Lle4;->d:Z

    .line 113
    .line 114
    new-instance v1, Lne4;

    .line 115
    .line 116
    const/4 v9, 0x0

    .line 117
    move-object v7, p3

    .line 118
    invoke-direct/range {v1 .. v9}, Lne4;-><init>(IIIIILph4;ZLjava/lang/RuntimeException;)V

    .line 119
    .line 120
    .line 121
    throw v1

    .line 122
    :catch_3
    move-exception v0

    .line 123
    :goto_2
    move-object v7, p3

    .line 124
    move-object p1, v0

    .line 125
    move-object v10, p1

    .line 126
    goto :goto_3

    .line 127
    :catch_4
    move-exception v0

    .line 128
    goto :goto_2

    .line 129
    :catch_5
    move-exception v0

    .line 130
    goto :goto_2

    .line 131
    :catch_6
    move-exception v0

    .line 132
    goto :goto_2

    .line 133
    :goto_3
    iget v4, p0, Lle4;->b:I

    .line 134
    .line 135
    iget v5, p0, Lle4;->c:I

    .line 136
    .line 137
    iget v6, p0, Lle4;->a:I

    .line 138
    .line 139
    move-object v8, v7

    .line 140
    iget v7, p0, Lle4;->e:I

    .line 141
    .line 142
    iget-boolean v9, p0, Lle4;->d:Z

    .line 143
    .line 144
    new-instance v2, Lne4;

    .line 145
    .line 146
    const/4 v3, 0x0

    .line 147
    invoke-direct/range {v2 .. v10}, Lne4;-><init>(IIIIILph4;ZLjava/lang/RuntimeException;)V

    .line 148
    .line 149
    .line 150
    throw v2
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldf4;->t()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldf4;->f:Lsn3;

    .line 5
    .line 6
    iget v1, v0, Lsn3;->i:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_0
    if-ge v3, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Lsn3;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, Lqf2;

    .line 17
    .line 18
    invoke-interface {v4}, Lqf2;->g()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Ldf4;->d:Lih2;

    .line 25
    .line 26
    invoke-virtual {v0}, Lbg2;->g()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Ldf4;->e:Lgf4;

    .line 30
    .line 31
    invoke-virtual {v0}, Lbg2;->g()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Ldf4;->q:Lnd2;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    move v1, v2

    .line 39
    :goto_1
    iget-object v3, v0, Lnd2;->a:Lxm3;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-ge v1, v4, :cond_1

    .line 46
    .line 47
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lqf2;

    .line 52
    .line 53
    sget-object v4, Lpe2;->b:Lpe2;

    .line 54
    .line 55
    invoke-interface {v3}, Lqf2;->j()V

    .line 56
    .line 57
    .line 58
    invoke-interface {v3}, Lqf2;->g()V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    new-array v1, v2, [Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    iput-object v1, v0, Lnd2;->c:[Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    sget-object v1, Lce2;->e:Lce2;

    .line 69
    .line 70
    iput-boolean v2, v0, Lnd2;->d:Z

    .line 71
    .line 72
    :cond_2
    iput-boolean v2, p0, Ldf4;->P:Z

    .line 73
    .line 74
    iput-boolean v2, p0, Ldf4;->V:Z

    .line 75
    .line 76
    return-void
.end method

.method public final b(Lse4;)Landroid/media/AudioTrack;
    .locals 6

    .line 1
    :try_start_0
    iget v0, p0, Ldf4;->Q:I

    .line 2
    .line 3
    iget v1, p0, Ldf4;->l:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    iget-object v2, p0, Ldf4;->a:Landroid/content/Context;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v5, 0x22

    .line 16
    .line 17
    if-lt v4, v5, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Ldf4;->a0:Landroid/content/Context;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-static {v2, v1}, Ltc0;->l(Landroid/content/Context;I)Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Ldf4;->a0:Landroid/content/Context;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    iget-object v3, p0, Ldf4;->a0:Landroid/content/Context;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    :cond_1
    invoke-virtual {p1}, Lse4;->a()Lle4;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, p0, Ldf4;->v:Lin2;

    .line 40
    .line 41
    iget-object p1, p1, Lse4;->a:Lph4;

    .line 42
    .line 43
    invoke-static {v1, v2, v0, p1, v3}, Ldf4;->n(Lle4;Lin2;ILph4;Landroid/content/Context;)Landroid/media/AudioTrack;

    .line 44
    .line 45
    .line 46
    move-result-object p1
    :try_end_0
    .catch Lne4; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    return-object p1

    .line 48
    :goto_1
    iget-object v0, p0, Ldf4;->n:Lbi3;

    .line 49
    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    invoke-virtual {v0, p1}, Lbi3;->a(Ljava/lang/Exception;)V

    .line 54
    .line 55
    .line 56
    :goto_2
    throw p1
.end method

.method public final c()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldf4;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldf4;->L:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Ldf4;->q:Lnd2;

    .line 11
    .line 12
    invoke-virtual {v0}, Lnd2;->c()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_7

    .line 17
    .line 18
    :cond_1
    :goto_0
    iget-object v0, p0, Ldf4;->q:Lnd2;

    .line 19
    .line 20
    invoke-virtual {v0}, Lnd2;->d()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_8

    .line 25
    .line 26
    :cond_2
    iget-object v0, p0, Ldf4;->q:Lnd2;

    .line 27
    .line 28
    invoke-virtual {v0}, Lnd2;->c()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    sget-object v0, Lqf2;->a:Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    iget-object v1, v0, Lnd2;->c:[Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    invoke-virtual {v0}, Lnd2;->f()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    aget-object v1, v1, v2

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    move-object v0, v1

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    sget-object v1, Lqf2;->a:Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lnd2;->e(Ljava/nio/ByteBuffer;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, v0, Lnd2;->c:[Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    invoke-virtual {v0}, Lnd2;->f()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    aget-object v0, v1, v0

    .line 65
    .line 66
    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_5

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Ldf4;->e(Ljava/nio/ByteBuffer;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ldf4;->f()V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Ldf4;->L:Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    iget-object v0, p0, Ldf4;->J:Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    if-eqz v0, :cond_8

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_8

    .line 92
    .line 93
    iget-object v0, p0, Ldf4;->q:Lnd2;

    .line 94
    .line 95
    iget-object v1, p0, Ldf4;->J:Ljava/nio/ByteBuffer;

    .line 96
    .line 97
    invoke-virtual {v0}, Lnd2;->c()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_1

    .line 102
    .line 103
    iget-boolean v2, v0, Lnd2;->d:Z

    .line 104
    .line 105
    if-eqz v2, :cond_6

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_6
    invoke-virtual {v0, v1}, Lnd2;->e(Ljava/nio/ByteBuffer;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_7
    iget-object v0, p0, Ldf4;->J:Ljava/nio/ByteBuffer;

    .line 113
    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Ldf4;->e(Ljava/nio/ByteBuffer;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Ldf4;->f()V

    .line 120
    .line 121
    .line 122
    :cond_8
    :goto_2
    return-void
.end method

.method public final d()Z
    .locals 4

    .line 1
    iget-object v0, p0, Ldf4;->q:Lnd2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnd2;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ldf4;->f()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Ldf4;->L:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    if-nez v0, :cond_4

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object v0, p0, Ldf4;->q:Lnd2;

    .line 20
    .line 21
    invoke-virtual {v0}, Lnd2;->c()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    iget-boolean v3, v0, Lnd2;->d:Z

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iput-boolean v2, v0, Lnd2;->d:Z

    .line 33
    .line 34
    iget-object v0, v0, Lnd2;->b:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lqf2;

    .line 41
    .line 42
    invoke-interface {v0}, Lqf2;->b()V

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ldf4;->c()V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Ldf4;->q:Lnd2;

    .line 49
    .line 50
    invoke-virtual {v0}, Lnd2;->d()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    iget-object v0, p0, Ldf4;->L:Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    :goto_1
    return v2

    .line 68
    :cond_4
    :goto_2
    return v1
.end method

.method public final e(Ljava/nio/ByteBuffer;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldf4;->L:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-static {v1}, Lzt0;->b0(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_16

    .line 18
    .line 19
    iget-object v1, v0, Ldf4;->p:Lse4;

    .line 20
    .line 21
    iget v1, v1, Lse4;->c:I

    .line 22
    .line 23
    if-nez v1, :cond_15

    .line 24
    .line 25
    const-wide/16 v1, 0x14

    .line 26
    .line 27
    invoke-static {v1, v2}, Lv23;->r(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    iget-object v1, v0, Ldf4;->p:Lse4;

    .line 32
    .line 33
    iget v1, v1, Lse4;->e:I

    .line 34
    .line 35
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 36
    .line 37
    int-to-long v5, v1

    .line 38
    const-wide/32 v7, 0xf4240

    .line 39
    .line 40
    .line 41
    invoke-static/range {v3 .. v9}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    long-to-int v1, v1

    .line 46
    invoke-virtual {v0}, Ldf4;->j()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    int-to-long v4, v1

    .line 51
    cmp-long v6, v2, v4

    .line 52
    .line 53
    if-gez v6, :cond_15

    .line 54
    .line 55
    iget-object v6, v0, Ldf4;->p:Lse4;

    .line 56
    .line 57
    iget v7, v6, Lse4;->g:I

    .line 58
    .line 59
    iget v6, v6, Lse4;->d:I

    .line 60
    .line 61
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->remaining()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    long-to-int v2, v2

    .line 82
    :cond_1
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_14

    .line 87
    .line 88
    if-ge v2, v1, :cond_14

    .line 89
    .line 90
    const/high16 v12, 0x50000000

    .line 91
    .line 92
    const/high16 v13, 0x10000000

    .line 93
    .line 94
    const/16 v14, 0x16

    .line 95
    .line 96
    const/16 v15, 0x15

    .line 97
    .line 98
    const/high16 v16, 0x4f000000

    .line 99
    .line 100
    const/4 v3, 0x4

    .line 101
    const/high16 v17, -0x31000000

    .line 102
    .line 103
    const/4 v10, 0x3

    .line 104
    const/4 v11, 0x2

    .line 105
    if-eq v7, v11, :cond_a

    .line 106
    .line 107
    if-eq v7, v10, :cond_9

    .line 108
    .line 109
    if-eq v7, v3, :cond_7

    .line 110
    .line 111
    if-eq v7, v15, :cond_6

    .line 112
    .line 113
    if-eq v7, v14, :cond_5

    .line 114
    .line 115
    if-eq v7, v13, :cond_4

    .line 116
    .line 117
    if-eq v7, v12, :cond_3

    .line 118
    .line 119
    const/high16 v12, 0x60000000

    .line 120
    .line 121
    if-ne v7, v12, :cond_2

    .line 122
    .line 123
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    and-int/lit16 v12, v12, 0xff

    .line 128
    .line 129
    shl-int/lit8 v12, v12, 0x18

    .line 130
    .line 131
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    and-int/lit16 v13, v13, 0xff

    .line 136
    .line 137
    shl-int/lit8 v13, v13, 0x10

    .line 138
    .line 139
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 140
    .line 141
    .line 142
    move-result v14

    .line 143
    and-int/lit16 v14, v14, 0xff

    .line 144
    .line 145
    shl-int/lit8 v14, v14, 0x8

    .line 146
    .line 147
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 148
    .line 149
    .line 150
    move-result v15

    .line 151
    and-int/lit16 v15, v15, 0xff

    .line 152
    .line 153
    :goto_2
    or-int/2addr v12, v13

    .line 154
    or-int/2addr v12, v14

    .line 155
    or-int/2addr v12, v15

    .line 156
    goto/16 :goto_6

    .line 157
    .line 158
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 159
    .line 160
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 161
    .line 162
    .line 163
    throw v1

    .line 164
    :cond_3
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    and-int/lit16 v12, v12, 0xff

    .line 169
    .line 170
    shl-int/lit8 v12, v12, 0x18

    .line 171
    .line 172
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    and-int/lit16 v13, v13, 0xff

    .line 177
    .line 178
    shl-int/lit8 v13, v13, 0x10

    .line 179
    .line 180
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 181
    .line 182
    .line 183
    move-result v14

    .line 184
    and-int/lit16 v14, v14, 0xff

    .line 185
    .line 186
    shl-int/lit8 v14, v14, 0x8

    .line 187
    .line 188
    :goto_3
    or-int/2addr v12, v13

    .line 189
    or-int/2addr v12, v14

    .line 190
    goto/16 :goto_6

    .line 191
    .line 192
    :cond_4
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 193
    .line 194
    .line 195
    move-result v12

    .line 196
    and-int/lit16 v12, v12, 0xff

    .line 197
    .line 198
    shl-int/lit8 v12, v12, 0x18

    .line 199
    .line 200
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 201
    .line 202
    .line 203
    move-result v13

    .line 204
    and-int/lit16 v13, v13, 0xff

    .line 205
    .line 206
    shl-int/lit8 v13, v13, 0x10

    .line 207
    .line 208
    :goto_4
    or-int/2addr v12, v13

    .line 209
    goto :goto_6

    .line 210
    :cond_5
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 211
    .line 212
    .line 213
    move-result v12

    .line 214
    and-int/lit16 v12, v12, 0xff

    .line 215
    .line 216
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 217
    .line 218
    .line 219
    move-result v13

    .line 220
    and-int/lit16 v13, v13, 0xff

    .line 221
    .line 222
    shl-int/lit8 v13, v13, 0x8

    .line 223
    .line 224
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 225
    .line 226
    .line 227
    move-result v14

    .line 228
    and-int/lit16 v14, v14, 0xff

    .line 229
    .line 230
    shl-int/lit8 v14, v14, 0x10

    .line 231
    .line 232
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 233
    .line 234
    .line 235
    move-result v15

    .line 236
    and-int/lit16 v15, v15, 0xff

    .line 237
    .line 238
    shl-int/lit8 v15, v15, 0x18

    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_6
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 242
    .line 243
    .line 244
    move-result v12

    .line 245
    and-int/lit16 v12, v12, 0xff

    .line 246
    .line 247
    shl-int/lit8 v12, v12, 0x8

    .line 248
    .line 249
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 250
    .line 251
    .line 252
    move-result v13

    .line 253
    and-int/lit16 v13, v13, 0xff

    .line 254
    .line 255
    shl-int/lit8 v13, v13, 0x10

    .line 256
    .line 257
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 258
    .line 259
    .line 260
    move-result v14

    .line 261
    and-int/lit16 v14, v14, 0xff

    .line 262
    .line 263
    shl-int/lit8 v14, v14, 0x18

    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 267
    .line 268
    .line 269
    move-result v12

    .line 270
    const/high16 v13, 0x3f800000    # 1.0f

    .line 271
    .line 272
    invoke-static {v12, v13}, Ljava/lang/Math;->min(FF)F

    .line 273
    .line 274
    .line 275
    move-result v12

    .line 276
    const/high16 v13, -0x40800000    # -1.0f

    .line 277
    .line 278
    invoke-static {v13, v12}, Ljava/lang/Math;->max(FF)F

    .line 279
    .line 280
    .line 281
    move-result v12

    .line 282
    const/4 v13, 0x0

    .line 283
    cmpg-float v13, v12, v13

    .line 284
    .line 285
    if-gez v13, :cond_8

    .line 286
    .line 287
    neg-float v12, v12

    .line 288
    mul-float v12, v12, v17

    .line 289
    .line 290
    :goto_5
    float-to-int v12, v12

    .line 291
    goto :goto_6

    .line 292
    :cond_8
    mul-float v12, v12, v16

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_9
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 296
    .line 297
    .line 298
    move-result v12

    .line 299
    and-int/lit16 v12, v12, 0xff

    .line 300
    .line 301
    shl-int/lit8 v12, v12, 0x18

    .line 302
    .line 303
    goto :goto_6

    .line 304
    :cond_a
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 305
    .line 306
    .line 307
    move-result v12

    .line 308
    and-int/lit16 v12, v12, 0xff

    .line 309
    .line 310
    shl-int/lit8 v12, v12, 0x10

    .line 311
    .line 312
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 313
    .line 314
    .line 315
    move-result v13

    .line 316
    and-int/lit16 v13, v13, 0xff

    .line 317
    .line 318
    shl-int/lit8 v13, v13, 0x18

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :goto_6
    int-to-long v12, v12

    .line 322
    int-to-long v14, v2

    .line 323
    mul-long/2addr v12, v14

    .line 324
    div-long/2addr v12, v4

    .line 325
    long-to-int v12, v12

    .line 326
    if-eq v7, v11, :cond_13

    .line 327
    .line 328
    if-eq v7, v10, :cond_12

    .line 329
    .line 330
    if-eq v7, v3, :cond_10

    .line 331
    .line 332
    const/16 v3, 0x15

    .line 333
    .line 334
    if-eq v7, v3, :cond_f

    .line 335
    .line 336
    const/16 v3, 0x16

    .line 337
    .line 338
    if-eq v7, v3, :cond_e

    .line 339
    .line 340
    const/high16 v3, 0x10000000

    .line 341
    .line 342
    if-eq v7, v3, :cond_d

    .line 343
    .line 344
    const/high16 v3, 0x50000000

    .line 345
    .line 346
    if-eq v7, v3, :cond_c

    .line 347
    .line 348
    const/high16 v3, 0x60000000

    .line 349
    .line 350
    if-ne v7, v3, :cond_b

    .line 351
    .line 352
    shr-int/lit8 v3, v12, 0x8

    .line 353
    .line 354
    shr-int/lit8 v10, v12, 0x10

    .line 355
    .line 356
    shr-int/lit8 v11, v12, 0x18

    .line 357
    .line 358
    int-to-byte v12, v12

    .line 359
    int-to-byte v11, v11

    .line 360
    invoke-virtual {v8, v11}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 361
    .line 362
    .line 363
    int-to-byte v10, v10

    .line 364
    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 365
    .line 366
    .line 367
    int-to-byte v3, v3

    .line 368
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v8, v12}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 372
    .line 373
    .line 374
    goto/16 :goto_7

    .line 375
    .line 376
    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 377
    .line 378
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 379
    .line 380
    .line 381
    throw v1

    .line 382
    :cond_c
    shr-int/lit8 v3, v12, 0x8

    .line 383
    .line 384
    shr-int/lit8 v10, v12, 0x10

    .line 385
    .line 386
    shr-int/lit8 v11, v12, 0x18

    .line 387
    .line 388
    int-to-byte v11, v11

    .line 389
    invoke-virtual {v8, v11}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 390
    .line 391
    .line 392
    int-to-byte v10, v10

    .line 393
    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 394
    .line 395
    .line 396
    int-to-byte v3, v3

    .line 397
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 398
    .line 399
    .line 400
    goto :goto_7

    .line 401
    :cond_d
    shr-int/lit8 v3, v12, 0x10

    .line 402
    .line 403
    shr-int/lit8 v10, v12, 0x18

    .line 404
    .line 405
    int-to-byte v10, v10

    .line 406
    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 407
    .line 408
    .line 409
    int-to-byte v3, v3

    .line 410
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 411
    .line 412
    .line 413
    goto :goto_7

    .line 414
    :cond_e
    shr-int/lit8 v3, v12, 0x8

    .line 415
    .line 416
    shr-int/lit8 v10, v12, 0x10

    .line 417
    .line 418
    shr-int/lit8 v11, v12, 0x18

    .line 419
    .line 420
    int-to-byte v12, v12

    .line 421
    invoke-virtual {v8, v12}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 422
    .line 423
    .line 424
    int-to-byte v3, v3

    .line 425
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 426
    .line 427
    .line 428
    int-to-byte v3, v10

    .line 429
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 430
    .line 431
    .line 432
    int-to-byte v3, v11

    .line 433
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 434
    .line 435
    .line 436
    goto :goto_7

    .line 437
    :cond_f
    shr-int/lit8 v3, v12, 0x8

    .line 438
    .line 439
    shr-int/lit8 v10, v12, 0x10

    .line 440
    .line 441
    shr-int/lit8 v11, v12, 0x18

    .line 442
    .line 443
    int-to-byte v3, v3

    .line 444
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 445
    .line 446
    .line 447
    int-to-byte v3, v10

    .line 448
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 449
    .line 450
    .line 451
    int-to-byte v3, v11

    .line 452
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 453
    .line 454
    .line 455
    goto :goto_7

    .line 456
    :cond_10
    if-gez v12, :cond_11

    .line 457
    .line 458
    int-to-float v3, v12

    .line 459
    neg-float v3, v3

    .line 460
    div-float v3, v3, v17

    .line 461
    .line 462
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 463
    .line 464
    .line 465
    goto :goto_7

    .line 466
    :cond_11
    int-to-float v3, v12

    .line 467
    div-float v3, v3, v16

    .line 468
    .line 469
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 470
    .line 471
    .line 472
    goto :goto_7

    .line 473
    :cond_12
    shr-int/lit8 v3, v12, 0x18

    .line 474
    .line 475
    int-to-byte v3, v3

    .line 476
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 477
    .line 478
    .line 479
    goto :goto_7

    .line 480
    :cond_13
    shr-int/lit8 v3, v12, 0x10

    .line 481
    .line 482
    shr-int/lit8 v10, v12, 0x18

    .line 483
    .line 484
    int-to-byte v3, v3

    .line 485
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 486
    .line 487
    .line 488
    int-to-byte v3, v10

    .line 489
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 490
    .line 491
    .line 492
    :goto_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    add-int v10, v9, v6

    .line 497
    .line 498
    if-ne v3, v10, :cond_1

    .line 499
    .line 500
    add-int/lit8 v2, v2, 0x1

    .line 501
    .line 502
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 503
    .line 504
    .line 505
    move-result v9

    .line 506
    goto/16 :goto_1

    .line 507
    .line 508
    :cond_14
    move-object/from16 v1, p1

    .line 509
    .line 510
    invoke-virtual {v8, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 514
    .line 515
    .line 516
    move-object v1, v8

    .line 517
    goto :goto_8

    .line 518
    :cond_15
    move-object/from16 v1, p1

    .line 519
    .line 520
    :goto_8
    iput-object v1, v0, Ldf4;->L:Ljava/nio/ByteBuffer;

    .line 521
    .line 522
    :cond_16
    return-void
.end method

.method public final f()V
    .locals 10

    .line 1
    iget-object v0, p0, Ldf4;->L:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Ldf4;->k:Lrn1;

    .line 8
    .line 9
    iget-object v1, v0, Lrn1;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/Exception;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    sget-object v1, Ldf4;->f0:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    sget v4, Ldf4;->h0:I

    .line 22
    .line 23
    if-lez v4, :cond_2

    .line 24
    .line 25
    move v4, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_2
    move v4, v2

    .line 28
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-eqz v4, :cond_3

    .line 30
    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    iget-wide v6, v0, Lrn1;->g:J

    .line 38
    .line 39
    cmp-long v1, v4, v6

    .line 40
    .line 41
    if-gez v1, :cond_4

    .line 42
    .line 43
    goto/16 :goto_5

    .line 44
    .line 45
    :cond_4
    :goto_1
    iget-object v1, p0, Ldf4;->L:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget-object v4, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 52
    .line 53
    iget-object v5, p0, Ldf4;->L:Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    invoke-virtual {v4, v5, v1, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 60
    .line 61
    .line 62
    move-result-wide v5

    .line 63
    iput-wide v5, p0, Ldf4;->U:J

    .line 64
    .line 65
    if-gez v4, :cond_c

    .line 66
    .line 67
    const/4 v1, -0x6

    .line 68
    if-eq v4, v1, :cond_5

    .line 69
    .line 70
    const/16 v1, -0x20

    .line 71
    .line 72
    if-ne v4, v1, :cond_8

    .line 73
    .line 74
    :cond_5
    invoke-virtual {p0}, Ldf4;->j()J

    .line 75
    .line 76
    .line 77
    move-result-wide v5

    .line 78
    const-wide/16 v7, 0x0

    .line 79
    .line 80
    cmp-long v1, v5, v7

    .line 81
    .line 82
    if-lez v1, :cond_7

    .line 83
    .line 84
    :cond_6
    :goto_2
    move v2, v3

    .line 85
    goto :goto_3

    .line 86
    :cond_7
    iget-object v1, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 87
    .line 88
    invoke-static {v1}, Ldf4;->l(Landroid/media/AudioTrack;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_8

    .line 93
    .line 94
    iget-object v1, p0, Ldf4;->p:Lse4;

    .line 95
    .line 96
    iget v1, v1, Lse4;->c:I

    .line 97
    .line 98
    if-ne v1, v3, :cond_6

    .line 99
    .line 100
    iput-boolean v3, p0, Ldf4;->V:Z

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_8
    :goto_3
    new-instance v1, Loe4;

    .line 104
    .line 105
    iget-object v3, p0, Ldf4;->p:Lse4;

    .line 106
    .line 107
    iget-object v3, v3, Lse4;->a:Lph4;

    .line 108
    .line 109
    invoke-direct {v1, v4, v3, v2}, Loe4;-><init>(ILph4;Z)V

    .line 110
    .line 111
    .line 112
    iget-object v2, p0, Ldf4;->n:Lbi3;

    .line 113
    .line 114
    if-eqz v2, :cond_9

    .line 115
    .line 116
    invoke-virtual {v2, v1}, Lbi3;->a(Ljava/lang/Exception;)V

    .line 117
    .line 118
    .line 119
    :cond_9
    iget-boolean v2, v1, Loe4;->g:Z

    .line 120
    .line 121
    if-eqz v2, :cond_b

    .line 122
    .line 123
    iget-object v2, p0, Ldf4;->a:Landroid/content/Context;

    .line 124
    .line 125
    if-nez v2, :cond_a

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_a
    sget-object v0, Lae4;->c:Lae4;

    .line 129
    .line 130
    iput-object v0, p0, Ldf4;->s:Lae4;

    .line 131
    .line 132
    iget-object v2, p0, Ldf4;->t:Lx03;

    .line 133
    .line 134
    invoke-virtual {v2, v0}, Lx03;->b(Lae4;)V

    .line 135
    .line 136
    .line 137
    throw v1

    .line 138
    :cond_b
    :goto_4
    invoke-virtual {v0, v1}, Lrn1;->b(Ljava/lang/Exception;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_c
    const/4 v5, 0x0

    .line 143
    iput-object v5, v0, Lrn1;->h:Ljava/lang/Object;

    .line 144
    .line 145
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    iput-wide v6, v0, Lrn1;->f:J

    .line 151
    .line 152
    iput-wide v6, v0, Lrn1;->g:J

    .line 153
    .line 154
    iget-object v0, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 155
    .line 156
    invoke-static {v0}, Ldf4;->l(Landroid/media/AudioTrack;)Z

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Ldf4;->p:Lse4;

    .line 160
    .line 161
    iget v0, v0, Lse4;->c:I

    .line 162
    .line 163
    if-nez v0, :cond_d

    .line 164
    .line 165
    iget-wide v6, p0, Ldf4;->C:J

    .line 166
    .line 167
    int-to-long v8, v4

    .line 168
    add-long/2addr v6, v8

    .line 169
    iput-wide v6, p0, Ldf4;->C:J

    .line 170
    .line 171
    :cond_d
    if-ne v4, v1, :cond_10

    .line 172
    .line 173
    if-eqz v0, :cond_f

    .line 174
    .line 175
    iget-object v0, p0, Ldf4;->L:Ljava/nio/ByteBuffer;

    .line 176
    .line 177
    iget-object v1, p0, Ldf4;->J:Ljava/nio/ByteBuffer;

    .line 178
    .line 179
    if-ne v0, v1, :cond_e

    .line 180
    .line 181
    move v2, v3

    .line 182
    :cond_e
    invoke-static {v2}, Lzt0;->b0(Z)V

    .line 183
    .line 184
    .line 185
    iget-wide v0, p0, Ldf4;->D:J

    .line 186
    .line 187
    iget v2, p0, Ldf4;->E:I

    .line 188
    .line 189
    int-to-long v2, v2

    .line 190
    iget v4, p0, Ldf4;->K:I

    .line 191
    .line 192
    int-to-long v6, v4

    .line 193
    mul-long/2addr v2, v6

    .line 194
    add-long/2addr v2, v0

    .line 195
    iput-wide v2, p0, Ldf4;->D:J

    .line 196
    .line 197
    :cond_f
    iput-object v5, p0, Ldf4;->L:Ljava/nio/ByteBuffer;

    .line 198
    .line 199
    :cond_10
    :goto_5
    return-void

    .line 200
    :catchall_0
    move-exception v0

    .line 201
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 202
    throw v0
.end method

.method public final g(J)V
    .locals 10

    .line 1
    iget-object v0, p0, Ldf4;->p:Lse4;

    .line 2
    .line 3
    iget v1, v0, Lse4;->c:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Ldf4;->d0:Ljr3;

    .line 7
    .line 8
    if-nez v1, :cond_4

    .line 9
    .line 10
    iget-object v0, v0, Lse4;->a:Lph4;

    .line 11
    .line 12
    iget v0, v0, Lph4;->G:I

    .line 13
    .line 14
    iget-object v0, p0, Ldf4;->y:Lsr1;

    .line 15
    .line 16
    iget-object v1, v3, Ljr3;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lxg2;

    .line 19
    .line 20
    iget v4, v0, Lsr1;->a:F

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    cmpl-float v6, v4, v5

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    if-lez v6, :cond_0

    .line 30
    .line 31
    move v6, v7

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v6, v2

    .line 34
    :goto_0
    invoke-static {v6}, Lzt0;->D(Z)V

    .line 35
    .line 36
    .line 37
    iget v6, v1, Lxg2;->c:F

    .line 38
    .line 39
    cmpl-float v6, v6, v4

    .line 40
    .line 41
    if-eqz v6, :cond_1

    .line 42
    .line 43
    iput v4, v1, Lxg2;->c:F

    .line 44
    .line 45
    iput-boolean v7, v1, Lxg2;->i:Z

    .line 46
    .line 47
    :cond_1
    iget v4, v0, Lsr1;->b:F

    .line 48
    .line 49
    cmpl-float v5, v4, v5

    .line 50
    .line 51
    if-lez v5, :cond_2

    .line 52
    .line 53
    move v5, v7

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v5, v2

    .line 56
    :goto_1
    invoke-static {v5}, Lzt0;->D(Z)V

    .line 57
    .line 58
    .line 59
    iget v5, v1, Lxg2;->d:F

    .line 60
    .line 61
    cmpl-float v5, v5, v4

    .line 62
    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    iput v4, v1, Lxg2;->d:F

    .line 66
    .line 67
    iput-boolean v7, v1, Lxg2;->i:Z

    .line 68
    .line 69
    :cond_3
    :goto_2
    move-object v5, v0

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    sget-object v0, Lsr1;->d:Lsr1;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :goto_3
    iput-object v5, p0, Ldf4;->y:Lsr1;

    .line 75
    .line 76
    iget-object v0, p0, Ldf4;->p:Lse4;

    .line 77
    .line 78
    iget v1, v0, Lse4;->c:I

    .line 79
    .line 80
    if-nez v1, :cond_5

    .line 81
    .line 82
    iget-object v0, v0, Lse4;->a:Lph4;

    .line 83
    .line 84
    iget v0, v0, Lph4;->G:I

    .line 85
    .line 86
    iget-boolean v2, p0, Ldf4;->z:Z

    .line 87
    .line 88
    iget-object v0, v3, Ljr3;->h:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Lff4;

    .line 91
    .line 92
    iput-boolean v2, v0, Lff4;->j:Z

    .line 93
    .line 94
    :cond_5
    iput-boolean v2, p0, Ldf4;->z:Z

    .line 95
    .line 96
    new-instance v4, Lue4;

    .line 97
    .line 98
    const-wide/16 v0, 0x0

    .line 99
    .line 100
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 101
    .line 102
    .line 103
    move-result-wide v6

    .line 104
    iget-object p1, p0, Ldf4;->p:Lse4;

    .line 105
    .line 106
    invoke-virtual {p0}, Ldf4;->j()J

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    iget p1, p1, Lse4;->e:I

    .line 111
    .line 112
    invoke-static {p1, v0, v1}, Lv23;->s(IJ)J

    .line 113
    .line 114
    .line 115
    move-result-wide v8

    .line 116
    invoke-direct/range {v4 .. v9}, Lue4;-><init>(Lsr1;JJ)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, Ldf4;->h:Ljava/util/ArrayDeque;

    .line 120
    .line 121
    invoke-virtual {p1, v4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Ldf4;->p:Lse4;

    .line 125
    .line 126
    iget-object p1, p1, Lse4;->i:Lnd2;

    .line 127
    .line 128
    iput-object p1, p0, Ldf4;->q:Lnd2;

    .line 129
    .line 130
    sget-object p2, Lpe2;->b:Lpe2;

    .line 131
    .line 132
    invoke-virtual {p1, p2}, Lnd2;->b(Lpe2;)V

    .line 133
    .line 134
    .line 135
    iget-object p1, p0, Ldf4;->n:Lbi3;

    .line 136
    .line 137
    if-eqz p1, :cond_6

    .line 138
    .line 139
    iget-boolean p2, p0, Ldf4;->z:Z

    .line 140
    .line 141
    iget-object p1, p1, Lbi3;->g:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p1, Lef4;

    .line 144
    .line 145
    iget-object p1, p1, Lef4;->A0:Lwt2;

    .line 146
    .line 147
    iget-object v0, p1, Lwt2;->g:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Landroid/os/Handler;

    .line 150
    .line 151
    if-eqz v0, :cond_6

    .line 152
    .line 153
    new-instance v1, Ln82;

    .line 154
    .line 155
    const/4 v2, 0x4

    .line 156
    invoke-direct {v1, p1, p2, v2}, Ln82;-><init>(Ljava/lang/Object;ZI)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 160
    .line 161
    .line 162
    :cond_6
    return-void
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final i()J
    .locals 5

    .line 1
    iget-object v0, p0, Ldf4;->p:Lse4;

    .line 2
    .line 3
    iget v1, v0, Lse4;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Ldf4;->A:J

    .line 8
    .line 9
    iget v0, v0, Lse4;->b:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    div-long/2addr v1, v3

    .line 13
    return-wide v1

    .line 14
    :cond_0
    iget-wide v0, p0, Ldf4;->B:J

    .line 15
    .line 16
    return-wide v0
.end method

.method public final j()J
    .locals 7

    .line 1
    iget-object v0, p0, Ldf4;->p:Lse4;

    .line 2
    .line 3
    iget v1, v0, Lse4;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Ldf4;->C:J

    .line 8
    .line 9
    iget v0, v0, Lse4;->d:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 13
    .line 14
    add-long/2addr v1, v3

    .line 15
    const-wide/16 v5, -0x1

    .line 16
    .line 17
    add-long/2addr v1, v5

    .line 18
    div-long/2addr v1, v3

    .line 19
    return-wide v1

    .line 20
    :cond_0
    iget-wide v0, p0, Ldf4;->D:J

    .line 21
    .line 22
    return-wide v0
.end method

.method public final k()V
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ldf4;->t:Lx03;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Ldf4;->W:Landroid/os/Looper;

    .line 12
    .line 13
    if-ne v1, v0, :cond_1

    .line 14
    .line 15
    :cond_0
    move v1, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move v1, v2

    .line 18
    :goto_0
    iget-object v4, p0, Ldf4;->W:Landroid/os/Looper;

    .line 19
    .line 20
    const-string v5, "null"

    .line 21
    .line 22
    if-nez v4, :cond_2

    .line 23
    .line 24
    move-object v4, v5

    .line 25
    goto :goto_1

    .line 26
    :cond_2
    invoke-virtual {v4}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    :goto_1
    if-nez v0, :cond_3

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v5}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    :goto_2
    if-eqz v1, :cond_7

    .line 46
    .line 47
    iget-object v1, p0, Ldf4;->t:Lx03;

    .line 48
    .line 49
    if-nez v1, :cond_6

    .line 50
    .line 51
    iget-object v1, p0, Ldf4;->a:Landroid/content/Context;

    .line 52
    .line 53
    if-eqz v1, :cond_6

    .line 54
    .line 55
    iput-object v0, p0, Ldf4;->W:Landroid/os/Looper;

    .line 56
    .line 57
    new-instance v0, Lx03;

    .line 58
    .line 59
    new-instance v4, Lit3;

    .line 60
    .line 61
    const/4 v5, 0x5

    .line 62
    invoke-direct {v4, v5, p0}, Lit3;-><init>(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v5, p0, Ldf4;->v:Lin2;

    .line 66
    .line 67
    iget-object v6, p0, Ldf4;->T:Landroid/media/AudioDeviceInfo;

    .line 68
    .line 69
    invoke-direct {v0, v1, v4, v5, v6}, Lx03;-><init>(Landroid/content/Context;Lit3;Lin2;Landroid/media/AudioDeviceInfo;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Ldf4;->t:Lx03;

    .line 73
    .line 74
    iget-boolean v1, v0, Lx03;->f:Z

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    iget-object v0, v0, Lx03;->m:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lae4;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    iput-boolean v3, v0, Lx03;->f:Z

    .line 87
    .line 88
    iget-object v1, v0, Lx03;->l:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Lce4;

    .line 91
    .line 92
    if-eqz v1, :cond_5

    .line 93
    .line 94
    iget-object v3, v1, Lce4;->a:Landroid/content/ContentResolver;

    .line 95
    .line 96
    iget-object v4, v1, Lce4;->b:Landroid/net/Uri;

    .line 97
    .line 98
    invoke-virtual {v3, v4, v2, v1}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 99
    .line 100
    .line 101
    :cond_5
    iget-object v1, v0, Lx03;->g:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v1, Landroid/content/Context;

    .line 104
    .line 105
    iget-object v2, v0, Lx03;->j:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Lbe4;

    .line 108
    .line 109
    iget-object v3, v0, Lx03;->i:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Landroid/os/Handler;

    .line 112
    .line 113
    invoke-static {v1}, Lbd2;->B(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v4, v2, v3}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 118
    .line 119
    .line 120
    iget-object v2, v0, Lx03;->k:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v2, Ld6;

    .line 123
    .line 124
    new-instance v4, Landroid/content/IntentFilter;

    .line 125
    .line 126
    const-string v5, "android.media.action.HDMI_AUDIO_PLUG"

    .line 127
    .line 128
    invoke-direct {v4, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const/4 v5, 0x0

    .line 132
    invoke-virtual {v1, v2, v4, v5, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    iget-object v3, v0, Lx03;->o:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v3, Lin2;

    .line 139
    .line 140
    iget-object v4, v0, Lx03;->n:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v4, Landroid/media/AudioDeviceInfo;

    .line 143
    .line 144
    invoke-static {v1, v2, v3, v4}, Lae4;->b(Landroid/content/Context;Landroid/content/Intent;Lin2;Landroid/media/AudioDeviceInfo;)Lae4;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iput-object v1, v0, Lx03;->m:Ljava/lang/Object;

    .line 149
    .line 150
    move-object v0, v1

    .line 151
    :goto_3
    iput-object v0, p0, Ldf4;->s:Lae4;

    .line 152
    .line 153
    :cond_6
    iget-object v0, p0, Ldf4;->s:Lae4;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    const-string v2, "DefaultAudioSink accessed on multiple threads: %s and %s"

    .line 166
    .line 167
    invoke-static {v2, v1}, Lqb1;->J(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v0
.end method

.method public final m()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Ldf4;->N:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ldf4;->N:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Ldf4;->j()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, Ldf4;->g:Lqe4;

    .line 13
    .line 14
    invoke-virtual {v2}, Lqe4;->e()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    iput-wide v3, v2, Lqe4;->w:J

    .line 19
    .line 20
    iget-object v3, v2, Lqe4;->B:Lpz;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    invoke-static {v3, v4}, Lv23;->r(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    iput-wide v3, v2, Lqe4;->u:J

    .line 34
    .line 35
    iput-wide v0, v2, Lqe4;->x:J

    .line 36
    .line 37
    iget-object v0, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 38
    .line 39
    invoke-static {v0}, Ldf4;->l(Landroid/media/AudioTrack;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Ldf4;->O:Z

    .line 47
    .line 48
    :cond_0
    iget-object v0, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
.end method

.method public final o(Lph4;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldf4;->k()V

    .line 2
    .line 3
    .line 4
    const-string v0, "audio/raw"

    .line 5
    .line 6
    iget-object v1, p1, Lph4;->m:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x2

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget p1, p1, Lph4;->G:I

    .line 17
    .line 18
    invoke-static {p1}, Lv23;->a(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x16

    .line 35
    .line 36
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const-string v0, "Invalid PCM encoding: "

    .line 40
    .line 41
    invoke-static {v2, p1, v0}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return v1

    .line 45
    :cond_0
    if-eq p1, v2, :cond_2

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    return p1

    .line 49
    :cond_1
    iget-object v0, p0, Ldf4;->s:Lae4;

    .line 50
    .line 51
    iget-object v3, p0, Ldf4;->v:Lin2;

    .line 52
    .line 53
    invoke-virtual {v0, p1, v3}, Lae4;->c(Lph4;Lin2;)Landroid/util/Pair;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    :cond_2
    return v2

    .line 60
    :cond_3
    return v1
.end method

.method public final p(Lph4;[I)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ldf4;->k()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v3, Lph4;->m:Ljava/lang/String;

    .line 9
    .line 10
    iget v2, v3, Lph4;->F:I

    .line 11
    .line 12
    const-string v4, "audio/raw"

    .line 13
    .line 14
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v4, 0x2

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, -0x1

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget v0, v3, Lph4;->G:I

    .line 24
    .line 25
    invoke-static {v0}, Lv23;->a(I)Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-static {v7}, Lzt0;->D(Z)V

    .line 30
    .line 31
    .line 32
    iget v7, v3, Lph4;->E:I

    .line 33
    .line 34
    invoke-static {v0}, Lv23;->d(I)I

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    mul-int/2addr v8, v7

    .line 39
    new-instance v9, Lum3;

    .line 40
    .line 41
    const/4 v10, 0x4

    .line 42
    invoke-direct {v9, v10}, Lrm3;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iget-object v10, v1, Ldf4;->f:Lsn3;

    .line 46
    .line 47
    invoke-virtual {v9, v10}, Lrm3;->b(Ljava/lang/Iterable;)V

    .line 48
    .line 49
    .line 50
    iget-object v10, v1, Ldf4;->d:Lih2;

    .line 51
    .line 52
    invoke-virtual {v9, v10}, Lrm3;->a(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v10, v1, Ldf4;->d0:Ljr3;

    .line 56
    .line 57
    iget-object v10, v10, Ljr3;->g:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v10, [Lqf2;

    .line 60
    .line 61
    invoke-static {v10, v4}, Lwl2;->G([Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v9, v4}, Lrm3;->e(I)V

    .line 65
    .line 66
    .line 67
    iget-object v11, v9, Lrm3;->a:[Ljava/lang/Object;

    .line 68
    .line 69
    iget v12, v9, Lrm3;->b:I

    .line 70
    .line 71
    invoke-static {v10, v5, v11, v12, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 72
    .line 73
    .line 74
    iget v10, v9, Lrm3;->b:I

    .line 75
    .line 76
    add-int/2addr v10, v4

    .line 77
    iput v10, v9, Lrm3;->b:I

    .line 78
    .line 79
    new-instance v4, Lnd2;

    .line 80
    .line 81
    invoke-virtual {v9}, Lum3;->f()Lsn3;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-direct {v4, v9}, Lnd2;-><init>(Lxm3;)V

    .line 86
    .line 87
    .line 88
    iget-object v9, v1, Ldf4;->q:Lnd2;

    .line 89
    .line 90
    invoke-virtual {v4, v9}, Lnd2;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_0

    .line 95
    .line 96
    iget-object v4, v1, Ldf4;->q:Lnd2;

    .line 97
    .line 98
    :cond_0
    iget v9, v3, Lph4;->H:I

    .line 99
    .line 100
    iget v10, v3, Lph4;->I:I

    .line 101
    .line 102
    iget-object v11, v1, Ldf4;->c:Lhf4;

    .line 103
    .line 104
    iput v9, v11, Lhf4;->i:I

    .line 105
    .line 106
    iput v10, v11, Lhf4;->j:I

    .line 107
    .line 108
    iget-object v9, v1, Ldf4;->b:Lre4;

    .line 109
    .line 110
    move-object/from16 v10, p2

    .line 111
    .line 112
    iput-object v10, v9, Lre4;->i:[I

    .line 113
    .line 114
    new-instance v9, Lce2;

    .line 115
    .line 116
    invoke-direct {v9, v2, v7, v0}, Lce2;-><init>(III)V

    .line 117
    .line 118
    .line 119
    :try_start_0
    invoke-virtual {v4, v9}, Lnd2;->a(Lce2;)Lce2;

    .line 120
    .line 121
    .line 122
    move-result-object v0
    :try_end_0
    .catch Laf2; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    iget v2, v0, Lce2;->c:I

    .line 124
    .line 125
    iget v7, v0, Lce2;->a:I

    .line 126
    .line 127
    iget v0, v0, Lce2;->b:I

    .line 128
    .line 129
    invoke-static {v0}, Lv23;->b(I)I

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    invoke-static {v2}, Lv23;->d(I)I

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    mul-int/2addr v10, v0

    .line 138
    move-object v11, v4

    .line 139
    move v4, v5

    .line 140
    move v0, v9

    .line 141
    move v9, v2

    .line 142
    goto :goto_0

    .line 143
    :catch_0
    move-exception v0

    .line 144
    new-instance v2, Lme4;

    .line 145
    .line 146
    invoke-direct {v2, v0, v3}, Lme4;-><init>(Laf2;Lph4;)V

    .line 147
    .line 148
    .line 149
    throw v2

    .line 150
    :cond_1
    new-instance v0, Lnd2;

    .line 151
    .line 152
    sget-object v7, Lsn3;->j:Lsn3;

    .line 153
    .line 154
    invoke-direct {v0, v7}, Lnd2;-><init>(Lxm3;)V

    .line 155
    .line 156
    .line 157
    sget-object v7, Lde4;->d:Lde4;

    .line 158
    .line 159
    iget-object v7, v1, Ldf4;->s:Lae4;

    .line 160
    .line 161
    iget-object v8, v1, Ldf4;->v:Lin2;

    .line 162
    .line 163
    invoke-virtual {v7, v3, v8}, Lae4;->c(Lph4;Lin2;)Landroid/util/Pair;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    if-eqz v7, :cond_f

    .line 168
    .line 169
    iget-object v8, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v8, Ljava/lang/Integer;

    .line 172
    .line 173
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v7, Ljava/lang/Integer;

    .line 180
    .line 181
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    move-object v11, v0

    .line 186
    move v7, v2

    .line 187
    move v10, v6

    .line 188
    move v0, v9

    .line 189
    move v9, v8

    .line 190
    move v8, v10

    .line 191
    :goto_0
    const-string v2, ") for: "

    .line 192
    .line 193
    if-eqz v9, :cond_e

    .line 194
    .line 195
    if-eqz v0, :cond_d

    .line 196
    .line 197
    iget v2, v3, Lph4;->i:I

    .line 198
    .line 199
    iget-object v12, v3, Lph4;->m:Ljava/lang/String;

    .line 200
    .line 201
    const-string v13, "audio/vnd.dts.hd;profile=lbr"

    .line 202
    .line 203
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    if-eqz v12, :cond_2

    .line 208
    .line 209
    if-ne v2, v6, :cond_2

    .line 210
    .line 211
    const v2, 0xbb800

    .line 212
    .line 213
    .line 214
    :cond_2
    invoke-static {v7, v0, v9}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    const/4 v13, -0x2

    .line 219
    const/4 v14, 0x1

    .line 220
    if-eq v12, v13, :cond_3

    .line 221
    .line 222
    move v13, v14

    .line 223
    goto :goto_1

    .line 224
    :cond_3
    move v13, v5

    .line 225
    :goto_1
    invoke-static {v13}, Lzt0;->b0(Z)V

    .line 226
    .line 227
    .line 228
    if-eq v10, v6, :cond_4

    .line 229
    .line 230
    move v13, v10

    .line 231
    goto :goto_2

    .line 232
    :cond_4
    move v13, v14

    .line 233
    :goto_2
    const-wide/32 v16, 0xf4240

    .line 234
    .line 235
    .line 236
    if-eqz v4, :cond_b

    .line 237
    .line 238
    const v5, -0x7fffffff

    .line 239
    .line 240
    .line 241
    if-eq v4, v14, :cond_9

    .line 242
    .line 243
    const/4 v14, 0x5

    .line 244
    const/16 v15, 0x8

    .line 245
    .line 246
    if-ne v9, v14, :cond_5

    .line 247
    .line 248
    const v14, 0x7a120

    .line 249
    .line 250
    .line 251
    move/from16 v18, v9

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_5
    if-ne v9, v15, :cond_6

    .line 255
    .line 256
    const v14, 0xf4240

    .line 257
    .line 258
    .line 259
    move/from16 v18, v15

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_6
    move/from16 v18, v9

    .line 263
    .line 264
    const v14, 0x3d090

    .line 265
    .line 266
    .line 267
    :goto_3
    if-eq v2, v6, :cond_7

    .line 268
    .line 269
    sget-object v5, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 270
    .line 271
    invoke-static {v2, v15}, La30;->r(II)I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    goto :goto_5

    .line 276
    :cond_7
    invoke-static/range {v18 .. v18}, Lqb1;->M(I)I

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    if-eq v2, v5, :cond_8

    .line 281
    .line 282
    const/4 v5, 0x1

    .line 283
    goto :goto_4

    .line 284
    :cond_8
    const/4 v5, 0x0

    .line 285
    :goto_4
    invoke-static {v5}, Lzt0;->b0(Z)V

    .line 286
    .line 287
    .line 288
    :goto_5
    int-to-long v14, v14

    .line 289
    move/from16 v19, v6

    .line 290
    .line 291
    move/from16 v20, v7

    .line 292
    .line 293
    int-to-long v6, v2

    .line 294
    mul-long/2addr v14, v6

    .line 295
    div-long v14, v14, v16

    .line 296
    .line 297
    invoke-static {v14, v15}, Lzt0;->y(J)I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    :goto_6
    move/from16 p2, v4

    .line 302
    .line 303
    move/from16 v7, v20

    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_9
    move/from16 v19, v6

    .line 307
    .line 308
    move/from16 v20, v7

    .line 309
    .line 310
    invoke-static {v9}, Lqb1;->M(I)I

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-eq v2, v5, :cond_a

    .line 315
    .line 316
    const/4 v14, 0x1

    .line 317
    goto :goto_7

    .line 318
    :cond_a
    const/4 v14, 0x0

    .line 319
    :goto_7
    invoke-static {v14}, Lzt0;->b0(Z)V

    .line 320
    .line 321
    .line 322
    int-to-long v5, v2

    .line 323
    const-wide/32 v14, 0x2faf080

    .line 324
    .line 325
    .line 326
    mul-long/2addr v5, v14

    .line 327
    div-long v5, v5, v16

    .line 328
    .line 329
    invoke-static {v5, v6}, Lzt0;->y(J)I

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    goto :goto_6

    .line 334
    :cond_b
    move/from16 v19, v6

    .line 335
    .line 336
    move/from16 v20, v7

    .line 337
    .line 338
    mul-int/lit8 v2, v12, 0x4

    .line 339
    .line 340
    const v5, 0x3d090

    .line 341
    .line 342
    .line 343
    int-to-long v5, v5

    .line 344
    int-to-long v14, v7

    .line 345
    mul-long/2addr v5, v14

    .line 346
    move/from16 p2, v4

    .line 347
    .line 348
    int-to-long v3, v13

    .line 349
    mul-long/2addr v5, v3

    .line 350
    div-long v5, v5, v16

    .line 351
    .line 352
    invoke-static {v5, v6}, Lzt0;->y(J)I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    const v6, 0xb71b0

    .line 357
    .line 358
    .line 359
    move-wide/from16 v20, v3

    .line 360
    .line 361
    int-to-long v3, v6

    .line 362
    mul-long/2addr v3, v14

    .line 363
    mul-long v3, v3, v20

    .line 364
    .line 365
    div-long v3, v3, v16

    .line 366
    .line 367
    invoke-static {v3, v4}, Lzt0;->y(J)I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    sget-object v4, Lv23;->a:Ljava/lang/String;

    .line 372
    .line 373
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 378
    .line 379
    .line 380
    move-result v2

    .line 381
    :goto_8
    int-to-double v2, v2

    .line 382
    double-to-int v2, v2

    .line 383
    invoke-static {v12, v2}, Ljava/lang/Math;->max(II)I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    add-int/2addr v2, v13

    .line 388
    add-int/lit8 v2, v2, -0x1

    .line 389
    .line 390
    div-int/2addr v2, v13

    .line 391
    mul-int/2addr v2, v13

    .line 392
    const/4 v3, 0x0

    .line 393
    iput-boolean v3, v1, Ldf4;->V:Z

    .line 394
    .line 395
    move v6, v10

    .line 396
    move v10, v2

    .line 397
    new-instance v2, Lse4;

    .line 398
    .line 399
    move-object/from16 v3, p1

    .line 400
    .line 401
    move/from16 v5, p2

    .line 402
    .line 403
    move v4, v8

    .line 404
    move v8, v0

    .line 405
    invoke-direct/range {v2 .. v11}, Lse4;-><init>(Lph4;IIIIIIILnd2;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1}, Ldf4;->h()Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-eqz v0, :cond_c

    .line 413
    .line 414
    iput-object v2, v1, Ldf4;->o:Lse4;

    .line 415
    .line 416
    return-void

    .line 417
    :cond_c
    iput-object v2, v1, Ldf4;->p:Lse4;

    .line 418
    .line 419
    return-void

    .line 420
    :cond_d
    move v5, v4

    .line 421
    new-instance v0, Lme4;

    .line 422
    .line 423
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    const/16 v6, 0x2b

    .line 428
    .line 429
    invoke-static {v5, v6}, Lga1;->f(II)I

    .line 430
    .line 431
    .line 432
    move-result v6

    .line 433
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 434
    .line 435
    .line 436
    move-result v7

    .line 437
    new-instance v8, Ljava/lang/StringBuilder;

    .line 438
    .line 439
    add-int/2addr v6, v7

    .line 440
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 441
    .line 442
    .line 443
    const-string v6, "Invalid output channel config (mode="

    .line 444
    .line 445
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    invoke-direct {v0, v2, v3}, Lme4;-><init>(Ljava/lang/String;Lph4;)V

    .line 462
    .line 463
    .line 464
    throw v0

    .line 465
    :cond_e
    move v5, v4

    .line 466
    new-instance v0, Lme4;

    .line 467
    .line 468
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    const/16 v6, 0x25

    .line 473
    .line 474
    invoke-static {v5, v6}, Lga1;->f(II)I

    .line 475
    .line 476
    .line 477
    move-result v6

    .line 478
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 479
    .line 480
    .line 481
    move-result v7

    .line 482
    new-instance v8, Ljava/lang/StringBuilder;

    .line 483
    .line 484
    add-int/2addr v6, v7

    .line 485
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 486
    .line 487
    .line 488
    const-string v6, "Invalid output encoding (mode="

    .line 489
    .line 490
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    invoke-direct {v0, v2, v3}, Lme4;-><init>(Ljava/lang/String;Lph4;)V

    .line 507
    .line 508
    .line 509
    throw v0

    .line 510
    :cond_f
    new-instance v0, Lme4;

    .line 511
    .line 512
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    const-string v4, "Unable to configure passthrough for: "

    .line 517
    .line 518
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    invoke-direct {v0, v2, v3}, Lme4;-><init>(Ljava/lang/String;Lph4;)V

    .line 523
    .line 524
    .line 525
    throw v0
.end method

.method public final q()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldf4;->P:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Ldf4;->h()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Ldf4;->g:Lqe4;

    .line 11
    .line 12
    iget-wide v1, v0, Lqe4;->u:J

    .line 13
    .line 14
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v1, v1, v3

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, v0, Lqe4;->B:Lpz;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-static {v1, v2}, Lv23;->r(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    iput-wide v1, v0, Lqe4;->u:J

    .line 37
    .line 38
    :cond_0
    invoke-virtual {v0}, Lqe4;->e()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    iget v3, v0, Lqe4;->e:I

    .line 43
    .line 44
    invoke-static {v3, v1, v2}, Lv23;->s(IJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    iput-wide v1, v0, Lqe4;->i:J

    .line 49
    .line 50
    iget-object v0, v0, Lqe4;->d:Lpe4;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-virtual {v0, v1}, Lpe4;->a(I)V

    .line 57
    .line 58
    .line 59
    iget-boolean v0, p0, Ldf4;->N:Z

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    iget-object v0, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 64
    .line 65
    invoke-static {v0}, Ldf4;->l(Landroid/media/AudioTrack;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    :cond_1
    iget-object v0, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void
.end method

.method public final r(Ljava/nio/ByteBuffer;JI)Z
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v3, p2

    .line 6
    .line 7
    move/from16 v5, p4

    .line 8
    .line 9
    iget-object v6, v1, Ldf4;->j:Lrn1;

    .line 10
    .line 11
    iget-object v0, v1, Ldf4;->J:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    if-ne v2, v0, :cond_1

    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    :goto_0
    invoke-static {v0}, Lzt0;->D(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v1, Ldf4;->o:Lse4;

    .line 24
    .line 25
    const/4 v9, 0x0

    .line 26
    if-eqz v0, :cond_7

    .line 27
    .line 28
    invoke-virtual {v1}, Ldf4;->d()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    :cond_2
    :goto_1
    const/16 v30, 0x0

    .line 35
    .line 36
    goto/16 :goto_24

    .line 37
    .line 38
    :cond_3
    iget-object v0, v1, Ldf4;->o:Lse4;

    .line 39
    .line 40
    iget-object v10, v1, Ldf4;->p:Lse4;

    .line 41
    .line 42
    iget v11, v10, Lse4;->c:I

    .line 43
    .line 44
    iget v12, v0, Lse4;->c:I

    .line 45
    .line 46
    if-ne v11, v12, :cond_4

    .line 47
    .line 48
    iget v11, v10, Lse4;->g:I

    .line 49
    .line 50
    iget v12, v0, Lse4;->g:I

    .line 51
    .line 52
    if-ne v11, v12, :cond_4

    .line 53
    .line 54
    iget v11, v10, Lse4;->e:I

    .line 55
    .line 56
    iget v12, v0, Lse4;->e:I

    .line 57
    .line 58
    if-ne v11, v12, :cond_4

    .line 59
    .line 60
    iget v11, v10, Lse4;->f:I

    .line 61
    .line 62
    iget v12, v0, Lse4;->f:I

    .line 63
    .line 64
    if-ne v11, v12, :cond_4

    .line 65
    .line 66
    iget v10, v10, Lse4;->d:I

    .line 67
    .line 68
    iget v11, v0, Lse4;->d:I

    .line 69
    .line 70
    if-ne v10, v11, :cond_4

    .line 71
    .line 72
    iput-object v0, v1, Ldf4;->p:Lse4;

    .line 73
    .line 74
    iput-object v9, v1, Ldf4;->o:Lse4;

    .line 75
    .line 76
    iget-object v0, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 77
    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    invoke-static {v0}, Ldf4;->l(Landroid/media/AudioTrack;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    iget-object v0, v1, Ldf4;->p:Lse4;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    invoke-virtual {v1}, Ldf4;->m()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ldf4;->s()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    invoke-virtual {v1}, Ldf4;->t()V

    .line 103
    .line 104
    .line 105
    :cond_6
    :goto_2
    invoke-virtual {v1, v3, v4}, Ldf4;->g(J)V

    .line 106
    .line 107
    .line 108
    :cond_7
    invoke-virtual {v1}, Ldf4;->h()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const/4 v11, 0x3

    .line 113
    if-eqz v0, :cond_8

    .line 114
    .line 115
    move-object v7, v9

    .line 116
    goto/16 :goto_b

    .line 117
    .line 118
    :cond_8
    :try_start_0
    iget-object v0, v6, Lrn1;->h:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Ljava/lang/Exception;

    .line 121
    .line 122
    if-nez v0, :cond_9

    .line 123
    .line 124
    move-object/from16 v16, v9

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_9
    sget-object v14, Ldf4;->f0:Ljava/lang/Object;

    .line 128
    .line 129
    monitor-enter v14
    :try_end_0
    .catch Lne4; {:try_start_0 .. :try_end_0} :catch_1

    .line 130
    :try_start_1
    sget v0, Ldf4;->h0:I

    .line 131
    .line 132
    if-lez v0, :cond_a

    .line 133
    .line 134
    const/4 v0, 0x1

    .line 135
    goto :goto_3

    .line 136
    :cond_a
    const/4 v0, 0x0

    .line 137
    :goto_3
    monitor-exit v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 138
    if-eqz v0, :cond_b

    .line 139
    .line 140
    move-object/from16 v16, v9

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_b
    :try_start_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 144
    .line 145
    .line 146
    move-result-wide v14

    .line 147
    move-object/from16 v16, v9

    .line 148
    .line 149
    iget-wide v9, v6, Lrn1;->g:J
    :try_end_2
    .catch Lne4; {:try_start_2 .. :try_end_2} :catch_1

    .line 150
    .line 151
    cmp-long v0, v14, v9

    .line 152
    .line 153
    if-gez v0, :cond_c

    .line 154
    .line 155
    :goto_4
    const/4 v0, 0x1

    .line 156
    goto :goto_6

    .line 157
    :cond_c
    :goto_5
    const/4 v0, 0x0

    .line 158
    :goto_6
    if-eqz v0, :cond_d

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_d
    :try_start_3
    iget-object v0, v1, Ldf4;->p:Lse4;

    .line 162
    .line 163
    if-eqz v0, :cond_e

    .line 164
    .line 165
    invoke-virtual {v1, v0}, Ldf4;->b(Lse4;)Landroid/media/AudioTrack;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    goto :goto_8

    .line 170
    :catch_0
    move-exception v0

    .line 171
    move-object v9, v0

    .line 172
    goto :goto_7

    .line 173
    :cond_e
    throw v16
    :try_end_3
    .catch Lne4; {:try_start_3 .. :try_end_3} :catch_0

    .line 174
    :goto_7
    :try_start_4
    iget-object v0, v1, Ldf4;->p:Lse4;

    .line 175
    .line 176
    iget v10, v0, Lse4;->h:I

    .line 177
    .line 178
    const v14, 0xf4240

    .line 179
    .line 180
    .line 181
    if-le v10, v14, :cond_43

    .line 182
    .line 183
    new-instance v18, Lse4;

    .line 184
    .line 185
    iget-object v10, v0, Lse4;->a:Lph4;

    .line 186
    .line 187
    iget v14, v0, Lse4;->b:I

    .line 188
    .line 189
    iget v15, v0, Lse4;->c:I

    .line 190
    .line 191
    iget v13, v0, Lse4;->d:I

    .line 192
    .line 193
    iget v7, v0, Lse4;->e:I

    .line 194
    .line 195
    iget v8, v0, Lse4;->f:I

    .line 196
    .line 197
    iget v12, v0, Lse4;->g:I

    .line 198
    .line 199
    iget-object v0, v0, Lse4;->i:Lnd2;

    .line 200
    .line 201
    const v26, 0xf4240

    .line 202
    .line 203
    .line 204
    move-object/from16 v27, v0

    .line 205
    .line 206
    move/from16 v23, v7

    .line 207
    .line 208
    move/from16 v24, v8

    .line 209
    .line 210
    move-object/from16 v19, v10

    .line 211
    .line 212
    move/from16 v25, v12

    .line 213
    .line 214
    move/from16 v22, v13

    .line 215
    .line 216
    move/from16 v20, v14

    .line 217
    .line 218
    move/from16 v21, v15

    .line 219
    .line 220
    invoke-direct/range {v18 .. v27}, Lse4;-><init>(Lph4;IIIIIIILnd2;)V
    :try_end_4
    .catch Lne4; {:try_start_4 .. :try_end_4} :catch_1

    .line 221
    .line 222
    .line 223
    move-object/from16 v0, v18

    .line 224
    .line 225
    :try_start_5
    invoke-virtual {v1, v0}, Ldf4;->b(Lse4;)Landroid/media/AudioTrack;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    iput-object v0, v1, Ldf4;->p:Lse4;
    :try_end_5
    .catch Lne4; {:try_start_5 .. :try_end_5} :catch_2

    .line 230
    .line 231
    move-object v0, v7

    .line 232
    :goto_8
    :try_start_6
    iput-object v0, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 233
    .line 234
    invoke-static {v0}, Ldf4;->l(Landroid/media/AudioTrack;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_10

    .line 239
    .line 240
    iget-object v0, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 241
    .line 242
    iget-object v7, v1, Ldf4;->i:Lpb3;

    .line 243
    .line 244
    if-nez v7, :cond_f

    .line 245
    .line 246
    new-instance v7, Lpb3;

    .line 247
    .line 248
    invoke-direct {v7, v1}, Lpb3;-><init>(Ldf4;)V

    .line 249
    .line 250
    .line 251
    iput-object v7, v1, Ldf4;->i:Lpb3;

    .line 252
    .line 253
    goto :goto_9

    .line 254
    :catch_1
    move-exception v0

    .line 255
    goto/16 :goto_25

    .line 256
    .line 257
    :cond_f
    :goto_9
    iget-object v7, v1, Ldf4;->i:Lpb3;

    .line 258
    .line 259
    iget-object v8, v7, Lpb3;->g:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v8, Landroid/os/Handler;

    .line 262
    .line 263
    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    new-instance v9, Lvb1;

    .line 267
    .line 268
    invoke-direct {v9, v8, v11}, Lvb1;-><init>(Landroid/os/Handler;I)V

    .line 269
    .line 270
    .line 271
    iget-object v7, v7, Lpb3;->h:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v7, Lcf4;

    .line 274
    .line 275
    invoke-static {v0, v9, v7}, Li71;->m(Landroid/media/AudioTrack;Lvb1;Lcf4;)V

    .line 276
    .line 277
    .line 278
    iget-object v0, v1, Ldf4;->p:Lse4;

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    :cond_10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 284
    .line 285
    const/16 v7, 0x1f

    .line 286
    .line 287
    if-lt v0, v7, :cond_12

    .line 288
    .line 289
    iget-object v7, v1, Ldf4;->m:Lxd4;

    .line 290
    .line 291
    if-eqz v7, :cond_12

    .line 292
    .line 293
    iget-object v8, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 294
    .line 295
    monitor-enter v7
    :try_end_6
    .catch Lne4; {:try_start_6 .. :try_end_6} :catch_1

    .line 296
    :try_start_7
    iget-object v9, v7, Lxd4;->b:Lx34;

    .line 297
    .line 298
    if-eqz v9, :cond_11

    .line 299
    .line 300
    iget-object v9, v9, Lx34;->f:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v9, Landroid/media/metrics/LogSessionId;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 303
    .line 304
    :try_start_8
    monitor-exit v7

    .line 305
    invoke-static {}, Lqd4;->d()Landroid/media/metrics/LogSessionId;

    .line 306
    .line 307
    .line 308
    invoke-static {v9}, Lqd4;->y(Landroid/media/metrics/LogSessionId;)Z

    .line 309
    .line 310
    .line 311
    move-result v7

    .line 312
    if-nez v7, :cond_12

    .line 313
    .line 314
    invoke-static {v8, v9}, Lzd4;->c(Landroid/media/AudioTrack;Landroid/media/metrics/LogSessionId;)V
    :try_end_8
    .catch Lne4; {:try_start_8 .. :try_end_8} :catch_1

    .line 315
    .line 316
    .line 317
    goto :goto_a

    .line 318
    :cond_11
    :try_start_9
    throw v16

    .line 319
    :catchall_0
    move-exception v0

    .line 320
    monitor-exit v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 321
    :try_start_a
    throw v0

    .line 322
    :cond_12
    :goto_a
    iget-object v7, v1, Ldf4;->g:Lqe4;

    .line 323
    .line 324
    iget-object v8, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 325
    .line 326
    iget-object v9, v1, Ldf4;->p:Lse4;

    .line 327
    .line 328
    iget v10, v9, Lse4;->g:I

    .line 329
    .line 330
    iget v12, v9, Lse4;->d:I

    .line 331
    .line 332
    iget v9, v9, Lse4;->h:I

    .line 333
    .line 334
    iget-boolean v13, v1, Ldf4;->b0:Z

    .line 335
    .line 336
    move-object/from16 v18, v7

    .line 337
    .line 338
    move-object/from16 v19, v8

    .line 339
    .line 340
    move/from16 v22, v9

    .line 341
    .line 342
    move/from16 v20, v10

    .line 343
    .line 344
    move/from16 v21, v12

    .line 345
    .line 346
    move/from16 v23, v13

    .line 347
    .line 348
    invoke-virtual/range {v18 .. v23}, Lqe4;->a(Landroid/media/AudioTrack;IIIZ)V

    .line 349
    .line 350
    .line 351
    const/4 v7, 0x0

    .line 352
    iput v7, v1, Ldf4;->c0:I

    .line 353
    .line 354
    invoke-virtual {v1}, Ldf4;->h()Z

    .line 355
    .line 356
    .line 357
    move-result v7

    .line 358
    if-eqz v7, :cond_13

    .line 359
    .line 360
    iget-object v7, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 361
    .line 362
    iget v8, v1, Ldf4;->I:F

    .line 363
    .line 364
    invoke-virtual {v7, v8}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 365
    .line 366
    .line 367
    :cond_13
    iget-object v7, v1, Ldf4;->S:Ljx2;

    .line 368
    .line 369
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    iget-object v7, v1, Ldf4;->T:Landroid/media/AudioDeviceInfo;

    .line 373
    .line 374
    if-eqz v7, :cond_14

    .line 375
    .line 376
    iget-object v8, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 377
    .line 378
    invoke-virtual {v8, v7}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    .line 379
    .line 380
    .line 381
    iget-object v7, v1, Ldf4;->t:Lx03;

    .line 382
    .line 383
    if-eqz v7, :cond_14

    .line 384
    .line 385
    iget-object v8, v1, Ldf4;->T:Landroid/media/AudioDeviceInfo;

    .line 386
    .line 387
    invoke-virtual {v7, v8}, Lx03;->a(Landroid/media/AudioDeviceInfo;)V

    .line 388
    .line 389
    .line 390
    :cond_14
    iget-object v7, v1, Ldf4;->t:Lx03;

    .line 391
    .line 392
    if-eqz v7, :cond_15

    .line 393
    .line 394
    new-instance v8, Lmc2;

    .line 395
    .line 396
    iget-object v9, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 397
    .line 398
    invoke-direct {v8, v9, v7}, Lmc2;-><init>(Landroid/media/AudioTrack;Lx03;)V

    .line 399
    .line 400
    .line 401
    iput-object v8, v1, Ldf4;->u:Lmc2;

    .line 402
    .line 403
    :cond_15
    const/4 v7, 0x1

    .line 404
    iput-boolean v7, v1, Ldf4;->G:Z

    .line 405
    .line 406
    iget-object v7, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 407
    .line 408
    invoke-virtual {v7}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 409
    .line 410
    .line 411
    move-result v7

    .line 412
    iget v8, v1, Ldf4;->Q:I

    .line 413
    .line 414
    iput v7, v1, Ldf4;->Q:I

    .line 415
    .line 416
    iget-object v9, v1, Ldf4;->n:Lbi3;

    .line 417
    .line 418
    if-eqz v9, :cond_18

    .line 419
    .line 420
    iget-object v10, v1, Ldf4;->p:Lse4;

    .line 421
    .line 422
    invoke-virtual {v10}, Lse4;->a()Lle4;

    .line 423
    .line 424
    .line 425
    move-result-object v10

    .line 426
    iget-object v9, v9, Lbi3;->g:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v9, Lef4;

    .line 429
    .line 430
    iget-object v9, v9, Lef4;->A0:Lwt2;

    .line 431
    .line 432
    iget-object v12, v9, Lwt2;->g:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v12, Landroid/os/Handler;

    .line 435
    .line 436
    if-eqz v12, :cond_16

    .line 437
    .line 438
    new-instance v13, Lee4;

    .line 439
    .line 440
    const/4 v14, 0x7

    .line 441
    invoke-direct {v13, v9, v10, v14}, Lee4;-><init>(Lwt2;Ljava/lang/Object;I)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v13}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 445
    .line 446
    .line 447
    :cond_16
    if-eq v7, v8, :cond_18

    .line 448
    .line 449
    const/4 v7, 0x1

    .line 450
    iput-boolean v7, v1, Ldf4;->R:Z

    .line 451
    .line 452
    iget-object v7, v1, Ldf4;->n:Lbi3;

    .line 453
    .line 454
    iget v8, v1, Ldf4;->Q:I

    .line 455
    .line 456
    const/16 v9, 0x23

    .line 457
    .line 458
    if-lt v0, v9, :cond_17

    .line 459
    .line 460
    iget-object v0, v7, Lbi3;->g:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v0, Lef4;

    .line 463
    .line 464
    iget-object v0, v0, Lef4;->C0:Lwt2;

    .line 465
    .line 466
    if-eqz v0, :cond_17

    .line 467
    .line 468
    invoke-virtual {v0, v8}, Lwt2;->d(I)V

    .line 469
    .line 470
    .line 471
    :cond_17
    iget-object v0, v7, Lbi3;->g:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v0, Lef4;

    .line 474
    .line 475
    iget-object v0, v0, Lef4;->A0:Lwt2;

    .line 476
    .line 477
    iget-object v7, v0, Lwt2;->g:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v7, Landroid/os/Handler;

    .line 480
    .line 481
    if-eqz v7, :cond_18

    .line 482
    .line 483
    new-instance v9, Lcd;

    .line 484
    .line 485
    const/16 v10, 0xa

    .line 486
    .line 487
    invoke-direct {v9, v0, v8, v10}, Lcd;-><init>(Ljava/lang/Object;II)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v7, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_a
    .catch Lne4; {:try_start_a .. :try_end_a} :catch_1

    .line 491
    .line 492
    .line 493
    :cond_18
    move-object/from16 v7, v16

    .line 494
    .line 495
    :goto_b
    iput-object v7, v6, Lrn1;->h:Ljava/lang/Object;

    .line 496
    .line 497
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    iput-wide v7, v6, Lrn1;->f:J

    .line 503
    .line 504
    iput-wide v7, v6, Lrn1;->g:J

    .line 505
    .line 506
    iget-boolean v0, v1, Ldf4;->G:Z

    .line 507
    .line 508
    const-wide/16 v9, 0x0

    .line 509
    .line 510
    if-eqz v0, :cond_19

    .line 511
    .line 512
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 513
    .line 514
    .line 515
    move-result-wide v12

    .line 516
    iput-wide v12, v1, Ldf4;->H:J

    .line 517
    .line 518
    const/4 v6, 0x0

    .line 519
    iput-boolean v6, v1, Ldf4;->F:Z

    .line 520
    .line 521
    iput-boolean v6, v1, Ldf4;->G:Z

    .line 522
    .line 523
    invoke-virtual {v1, v3, v4}, Ldf4;->g(J)V

    .line 524
    .line 525
    .line 526
    iget-boolean v0, v1, Ldf4;->P:Z

    .line 527
    .line 528
    if-eqz v0, :cond_19

    .line 529
    .line 530
    invoke-virtual {v1}, Ldf4;->q()V

    .line 531
    .line 532
    .line 533
    :cond_19
    invoke-virtual {v1}, Ldf4;->j()J

    .line 534
    .line 535
    .line 536
    iget-object v0, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 537
    .line 538
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getUnderrunCount()I

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    iget v6, v1, Ldf4;->c0:I

    .line 546
    .line 547
    iput v0, v1, Ldf4;->c0:I

    .line 548
    .line 549
    const/4 v12, -0x1

    .line 550
    if-le v0, v6, :cond_1b

    .line 551
    .line 552
    iget-object v0, v1, Ldf4;->n:Lbi3;

    .line 553
    .line 554
    if-eqz v0, :cond_1b

    .line 555
    .line 556
    iget-object v0, v1, Ldf4;->p:Lse4;

    .line 557
    .line 558
    iget v6, v0, Lse4;->d:I

    .line 559
    .line 560
    if-eq v6, v12, :cond_1a

    .line 561
    .line 562
    iget v0, v0, Lse4;->h:I

    .line 563
    .line 564
    div-int/2addr v0, v6

    .line 565
    int-to-long v13, v0

    .line 566
    iget-object v0, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 567
    .line 568
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    invoke-static {v0, v13, v14}, Lv23;->s(IJ)J

    .line 576
    .line 577
    .line 578
    move-result-wide v13

    .line 579
    goto :goto_c

    .line 580
    :cond_1a
    move-wide v13, v7

    .line 581
    :goto_c
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 582
    .line 583
    .line 584
    move-result-wide v18

    .line 585
    move-wide/from16 v20, v7

    .line 586
    .line 587
    iget-wide v7, v1, Ldf4;->U:J

    .line 588
    .line 589
    sub-long v36, v18, v7

    .line 590
    .line 591
    iget-object v0, v1, Ldf4;->n:Lbi3;

    .line 592
    .line 593
    iget-object v6, v1, Ldf4;->p:Lse4;

    .line 594
    .line 595
    iget v6, v6, Lse4;->h:I

    .line 596
    .line 597
    iget-object v0, v0, Lbi3;->g:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v0, Lef4;

    .line 600
    .line 601
    iget-object v0, v0, Lef4;->A0:Lwt2;

    .line 602
    .line 603
    invoke-static {v13, v14}, Lv23;->q(J)J

    .line 604
    .line 605
    .line 606
    move-result-wide v34

    .line 607
    iget-object v7, v0, Lwt2;->g:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v7, Landroid/os/Handler;

    .line 610
    .line 611
    if-eqz v7, :cond_1c

    .line 612
    .line 613
    new-instance v31, Lee4;

    .line 614
    .line 615
    move-object/from16 v32, v0

    .line 616
    .line 617
    move/from16 v33, v6

    .line 618
    .line 619
    invoke-direct/range {v31 .. v37}, Lee4;-><init>(Lwt2;IJJ)V

    .line 620
    .line 621
    .line 622
    move-object/from16 v0, v31

    .line 623
    .line 624
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 625
    .line 626
    .line 627
    goto :goto_d

    .line 628
    :cond_1b
    move-wide/from16 v20, v7

    .line 629
    .line 630
    :cond_1c
    :goto_d
    iget-object v0, v1, Ldf4;->J:Ljava/nio/ByteBuffer;

    .line 631
    .line 632
    if-nez v0, :cond_41

    .line 633
    .line 634
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 639
    .line 640
    if-ne v0, v6, :cond_1d

    .line 641
    .line 642
    const/4 v0, 0x1

    .line 643
    goto :goto_e

    .line 644
    :cond_1d
    const/4 v0, 0x0

    .line 645
    :goto_e
    invoke-static {v0}, Lzt0;->D(Z)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v2}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 649
    .line 650
    .line 651
    move-result v0

    .line 652
    if-nez v0, :cond_1f

    .line 653
    .line 654
    :cond_1e
    const/16 v29, 0x1

    .line 655
    .line 656
    goto/16 :goto_20

    .line 657
    .line 658
    :cond_1f
    iget-object v0, v1, Ldf4;->p:Lse4;

    .line 659
    .line 660
    iget v6, v0, Lse4;->c:I

    .line 661
    .line 662
    if-eqz v6, :cond_39

    .line 663
    .line 664
    iget v6, v1, Ldf4;->E:I

    .line 665
    .line 666
    if-nez v6, :cond_39

    .line 667
    .line 668
    iget v0, v0, Lse4;->g:I

    .line 669
    .line 670
    const/16 v6, 0x14

    .line 671
    .line 672
    const/4 v7, 0x2

    .line 673
    const/4 v8, 0x5

    .line 674
    if-eq v0, v6, :cond_34

    .line 675
    .line 676
    const/16 v6, 0x1e

    .line 677
    .line 678
    const/4 v13, -0x2

    .line 679
    const/16 v14, 0x400

    .line 680
    .line 681
    if-eq v0, v6, :cond_2c

    .line 682
    .line 683
    packed-switch v0, :pswitch_data_0

    .line 684
    .line 685
    .line 686
    const/16 v6, 0x10

    .line 687
    .line 688
    packed-switch v0, :pswitch_data_1

    .line 689
    .line 690
    .line 691
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 692
    .line 693
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    new-instance v4, Ljava/lang/StringBuilder;

    .line 702
    .line 703
    add-int/lit8 v3, v3, 0x1b

    .line 704
    .line 705
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 706
    .line 707
    .line 708
    const-string v3, "Unexpected audio encoding: "

    .line 709
    .line 710
    invoke-static {v4, v3, v0}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    throw v2

    .line 718
    :pswitch_0
    new-array v0, v6, [B

    .line 719
    .line 720
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 721
    .line 722
    .line 723
    move-result v7

    .line 724
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v2, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 728
    .line 729
    .line 730
    new-instance v7, Llg1;

    .line 731
    .line 732
    invoke-direct {v7, v6, v0}, Llg1;-><init>(I[B)V

    .line 733
    .line 734
    .line 735
    invoke-static {v7}, Lzt0;->H(Llg1;)Lzq;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    iget v0, v0, Lzq;->c:I

    .line 740
    .line 741
    goto/16 :goto_1f

    .line 742
    .line 743
    :cond_20
    :goto_f
    :pswitch_1
    move v0, v14

    .line 744
    goto/16 :goto_1f

    .line 745
    .line 746
    :pswitch_2
    const/16 v0, 0x200

    .line 747
    .line 748
    goto/16 :goto_1f

    .line 749
    .line 750
    :pswitch_3
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 751
    .line 752
    .line 753
    move-result v0

    .line 754
    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    .line 755
    .line 756
    .line 757
    move-result v7

    .line 758
    add-int/lit8 v7, v7, -0xa

    .line 759
    .line 760
    move v8, v0

    .line 761
    :goto_10
    if-gt v8, v7, :cond_23

    .line 762
    .line 763
    add-int/lit8 v11, v8, 0x4

    .line 764
    .line 765
    sget-object v14, Lv23;->a:Ljava/lang/String;

    .line 766
    .line 767
    invoke-virtual {v2, v11}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 768
    .line 769
    .line 770
    move-result v11

    .line 771
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 772
    .line 773
    .line 774
    move-result-object v14

    .line 775
    sget-object v15, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 776
    .line 777
    if-ne v14, v15, :cond_21

    .line 778
    .line 779
    goto :goto_11

    .line 780
    :cond_21
    invoke-static {v11}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 781
    .line 782
    .line 783
    move-result v11

    .line 784
    :goto_11
    and-int/2addr v11, v13

    .line 785
    const v14, -0x78d9046

    .line 786
    .line 787
    .line 788
    if-ne v11, v14, :cond_22

    .line 789
    .line 790
    sub-int/2addr v8, v0

    .line 791
    goto :goto_12

    .line 792
    :cond_22
    add-int/lit8 v8, v8, 0x1

    .line 793
    .line 794
    goto :goto_10

    .line 795
    :cond_23
    move v8, v12

    .line 796
    :goto_12
    if-ne v8, v12, :cond_24

    .line 797
    .line 798
    const/4 v0, 0x0

    .line 799
    goto/16 :goto_1f

    .line 800
    .line 801
    :cond_24
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 802
    .line 803
    .line 804
    move-result v0

    .line 805
    add-int/2addr v0, v8

    .line 806
    const/16 v28, 0x7

    .line 807
    .line 808
    add-int/lit8 v0, v0, 0x7

    .line 809
    .line 810
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 811
    .line 812
    .line 813
    move-result v0

    .line 814
    and-int/lit16 v0, v0, 0xff

    .line 815
    .line 816
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 817
    .line 818
    .line 819
    move-result v7

    .line 820
    add-int/2addr v7, v8

    .line 821
    const/16 v8, 0xbb

    .line 822
    .line 823
    if-ne v0, v8, :cond_25

    .line 824
    .line 825
    const/16 v0, 0x9

    .line 826
    .line 827
    goto :goto_13

    .line 828
    :cond_25
    const/16 v0, 0x8

    .line 829
    .line 830
    :goto_13
    add-int/2addr v7, v0

    .line 831
    invoke-virtual {v2, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 832
    .line 833
    .line 834
    move-result v0

    .line 835
    shr-int/lit8 v0, v0, 0x4

    .line 836
    .line 837
    const/16 v28, 0x7

    .line 838
    .line 839
    and-int/lit8 v0, v0, 0x7

    .line 840
    .line 841
    const/16 v7, 0x28

    .line 842
    .line 843
    shl-int v0, v7, v0

    .line 844
    .line 845
    mul-int/2addr v0, v6

    .line 846
    goto/16 :goto_1f

    .line 847
    .line 848
    :pswitch_4
    const/16 v0, 0x800

    .line 849
    .line 850
    goto/16 :goto_1f

    .line 851
    .line 852
    :pswitch_5
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 853
    .line 854
    .line 855
    move-result v0

    .line 856
    sget-object v6, Lv23;->a:Ljava/lang/String;

    .line 857
    .line 858
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 859
    .line 860
    .line 861
    move-result v0

    .line 862
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 863
    .line 864
    .line 865
    move-result-object v6

    .line 866
    sget-object v8, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 867
    .line 868
    if-ne v6, v8, :cond_26

    .line 869
    .line 870
    goto :goto_14

    .line 871
    :cond_26
    invoke-static {v0}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 872
    .line 873
    .line 874
    move-result v0

    .line 875
    :goto_14
    const/high16 v6, -0x200000

    .line 876
    .line 877
    and-int v8, v0, v6

    .line 878
    .line 879
    if-ne v8, v6, :cond_29

    .line 880
    .line 881
    ushr-int/lit8 v6, v0, 0x13

    .line 882
    .line 883
    and-int/2addr v6, v11

    .line 884
    const/4 v8, 0x1

    .line 885
    if-eq v6, v8, :cond_29

    .line 886
    .line 887
    ushr-int/lit8 v8, v0, 0x11

    .line 888
    .line 889
    and-int/2addr v8, v11

    .line 890
    if-eqz v8, :cond_29

    .line 891
    .line 892
    ushr-int/lit8 v13, v0, 0xc

    .line 893
    .line 894
    const/16 v17, 0xa

    .line 895
    .line 896
    ushr-int/lit8 v0, v0, 0xa

    .line 897
    .line 898
    and-int/2addr v0, v11

    .line 899
    const/16 v14, 0xf

    .line 900
    .line 901
    and-int/2addr v13, v14

    .line 902
    if-eqz v13, :cond_29

    .line 903
    .line 904
    if-eq v13, v14, :cond_29

    .line 905
    .line 906
    if-eq v0, v11, :cond_29

    .line 907
    .line 908
    const/16 v0, 0x480

    .line 909
    .line 910
    const/4 v13, 0x1

    .line 911
    if-eq v8, v13, :cond_27

    .line 912
    .line 913
    if-eq v8, v7, :cond_2a

    .line 914
    .line 915
    const/16 v0, 0x180

    .line 916
    .line 917
    goto :goto_15

    .line 918
    :cond_27
    if-ne v6, v11, :cond_28

    .line 919
    .line 920
    goto :goto_15

    .line 921
    :cond_28
    const/16 v0, 0x240

    .line 922
    .line 923
    goto :goto_15

    .line 924
    :cond_29
    move v0, v12

    .line 925
    :cond_2a
    :goto_15
    if-eq v0, v12, :cond_2b

    .line 926
    .line 927
    goto/16 :goto_1f

    .line 928
    .line 929
    :cond_2b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 930
    .line 931
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 932
    .line 933
    .line 934
    throw v0

    .line 935
    :cond_2c
    :pswitch_6
    const/4 v6, 0x0

    .line 936
    goto :goto_17

    .line 937
    :pswitch_7
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 938
    .line 939
    .line 940
    move-result v0

    .line 941
    add-int/2addr v0, v8

    .line 942
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 943
    .line 944
    .line 945
    move-result v0

    .line 946
    and-int/lit16 v0, v0, 0xf8

    .line 947
    .line 948
    shr-int/2addr v0, v11

    .line 949
    const/16 v6, 0xa

    .line 950
    .line 951
    if-le v0, v6, :cond_2e

    .line 952
    .line 953
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 954
    .line 955
    .line 956
    move-result v0

    .line 957
    add-int/lit8 v0, v0, 0x4

    .line 958
    .line 959
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 960
    .line 961
    .line 962
    move-result v0

    .line 963
    and-int/lit16 v0, v0, 0xc0

    .line 964
    .line 965
    shr-int/lit8 v0, v0, 0x6

    .line 966
    .line 967
    if-ne v0, v11, :cond_2d

    .line 968
    .line 969
    goto :goto_16

    .line 970
    :cond_2d
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 971
    .line 972
    .line 973
    move-result v0

    .line 974
    add-int/lit8 v0, v0, 0x4

    .line 975
    .line 976
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 977
    .line 978
    .line 979
    move-result v0

    .line 980
    and-int/lit8 v0, v0, 0x30

    .line 981
    .line 982
    shr-int/lit8 v11, v0, 0x4

    .line 983
    .line 984
    :goto_16
    sget-object v0, Lyc0;->c:[I

    .line 985
    .line 986
    aget v0, v0, v11

    .line 987
    .line 988
    mul-int/lit16 v0, v0, 0x100

    .line 989
    .line 990
    goto/16 :goto_1f

    .line 991
    .line 992
    :cond_2e
    const/16 v0, 0x600

    .line 993
    .line 994
    goto/16 :goto_1f

    .line 995
    .line 996
    :goto_17
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 997
    .line 998
    .line 999
    move-result v0

    .line 1000
    const v11, -0xde4bec0

    .line 1001
    .line 1002
    .line 1003
    if-eq v0, v11, :cond_20

    .line 1004
    .line 1005
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 1006
    .line 1007
    .line 1008
    move-result v0

    .line 1009
    const v11, -0x17bd3b8f

    .line 1010
    .line 1011
    .line 1012
    if-ne v0, v11, :cond_2f

    .line 1013
    .line 1014
    goto/16 :goto_f

    .line 1015
    .line 1016
    :cond_2f
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 1017
    .line 1018
    .line 1019
    move-result v0

    .line 1020
    const v6, 0x25205864

    .line 1021
    .line 1022
    .line 1023
    if-ne v0, v6, :cond_30

    .line 1024
    .line 1025
    const/16 v0, 0x1000

    .line 1026
    .line 1027
    goto/16 :goto_1f

    .line 1028
    .line 1029
    :cond_30
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 1030
    .line 1031
    .line 1032
    move-result v0

    .line 1033
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1034
    .line 1035
    .line 1036
    move-result v6

    .line 1037
    if-eq v6, v13, :cond_33

    .line 1038
    .line 1039
    if-eq v6, v12, :cond_32

    .line 1040
    .line 1041
    const/16 v11, 0x1f

    .line 1042
    .line 1043
    if-eq v6, v11, :cond_31

    .line 1044
    .line 1045
    add-int/lit8 v6, v0, 0x4

    .line 1046
    .line 1047
    add-int/2addr v0, v8

    .line 1048
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1049
    .line 1050
    .line 1051
    move-result v6

    .line 1052
    const/16 v29, 0x1

    .line 1053
    .line 1054
    and-int/lit8 v6, v6, 0x1

    .line 1055
    .line 1056
    shl-int/lit8 v6, v6, 0x6

    .line 1057
    .line 1058
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1059
    .line 1060
    .line 1061
    move-result v0

    .line 1062
    and-int/lit16 v0, v0, 0xfc

    .line 1063
    .line 1064
    :goto_18
    shr-int/2addr v0, v7

    .line 1065
    or-int/2addr v0, v6

    .line 1066
    const/16 v29, 0x1

    .line 1067
    .line 1068
    goto :goto_1a

    .line 1069
    :cond_31
    add-int/lit8 v6, v0, 0x5

    .line 1070
    .line 1071
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1072
    .line 1073
    .line 1074
    move-result v6

    .line 1075
    const/16 v28, 0x7

    .line 1076
    .line 1077
    and-int/lit8 v6, v6, 0x7

    .line 1078
    .line 1079
    shl-int/lit8 v6, v6, 0x4

    .line 1080
    .line 1081
    add-int/lit8 v0, v0, 0x6

    .line 1082
    .line 1083
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1084
    .line 1085
    .line 1086
    move-result v0

    .line 1087
    :goto_19
    and-int/lit8 v0, v0, 0x3c

    .line 1088
    .line 1089
    goto :goto_18

    .line 1090
    :cond_32
    const/16 v28, 0x7

    .line 1091
    .line 1092
    add-int/lit8 v6, v0, 0x4

    .line 1093
    .line 1094
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1095
    .line 1096
    .line 1097
    move-result v6

    .line 1098
    and-int/lit8 v6, v6, 0x7

    .line 1099
    .line 1100
    shl-int/lit8 v6, v6, 0x4

    .line 1101
    .line 1102
    add-int/lit8 v0, v0, 0x7

    .line 1103
    .line 1104
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1105
    .line 1106
    .line 1107
    move-result v0

    .line 1108
    goto :goto_19

    .line 1109
    :cond_33
    add-int/lit8 v6, v0, 0x4

    .line 1110
    .line 1111
    add-int/2addr v0, v8

    .line 1112
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1113
    .line 1114
    .line 1115
    move-result v0

    .line 1116
    const/16 v29, 0x1

    .line 1117
    .line 1118
    and-int/lit8 v0, v0, 0x1

    .line 1119
    .line 1120
    shl-int/lit8 v0, v0, 0x6

    .line 1121
    .line 1122
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1123
    .line 1124
    .line 1125
    move-result v6

    .line 1126
    and-int/lit16 v6, v6, 0xfc

    .line 1127
    .line 1128
    shr-int/2addr v6, v7

    .line 1129
    or-int/2addr v0, v6

    .line 1130
    :goto_1a
    add-int/lit8 v0, v0, 0x1

    .line 1131
    .line 1132
    mul-int/lit8 v0, v0, 0x20

    .line 1133
    .line 1134
    goto :goto_1f

    .line 1135
    :cond_34
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1136
    .line 1137
    .line 1138
    move-result v0

    .line 1139
    and-int/2addr v0, v7

    .line 1140
    if-nez v0, :cond_35

    .line 1141
    .line 1142
    const/4 v0, 0x0

    .line 1143
    goto :goto_1d

    .line 1144
    :cond_35
    const/16 v0, 0x1a

    .line 1145
    .line 1146
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1147
    .line 1148
    .line 1149
    move-result v0

    .line 1150
    const/16 v6, 0x1c

    .line 1151
    .line 1152
    move v8, v6

    .line 1153
    const/4 v7, 0x0

    .line 1154
    :goto_1b
    if-ge v7, v0, :cond_36

    .line 1155
    .line 1156
    add-int/lit8 v11, v7, 0x1b

    .line 1157
    .line 1158
    invoke-virtual {v2, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1159
    .line 1160
    .line 1161
    move-result v11

    .line 1162
    add-int/2addr v8, v11

    .line 1163
    add-int/lit8 v7, v7, 0x1

    .line 1164
    .line 1165
    goto :goto_1b

    .line 1166
    :cond_36
    add-int/lit8 v0, v8, 0x1a

    .line 1167
    .line 1168
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1169
    .line 1170
    .line 1171
    move-result v0

    .line 1172
    const/4 v7, 0x0

    .line 1173
    :goto_1c
    if-ge v7, v0, :cond_37

    .line 1174
    .line 1175
    add-int/lit8 v11, v8, 0x1b

    .line 1176
    .line 1177
    add-int/2addr v11, v7

    .line 1178
    invoke-virtual {v2, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1179
    .line 1180
    .line 1181
    move-result v11

    .line 1182
    add-int/2addr v6, v11

    .line 1183
    add-int/lit8 v7, v7, 0x1

    .line 1184
    .line 1185
    goto :goto_1c

    .line 1186
    :cond_37
    add-int v0, v8, v6

    .line 1187
    .line 1188
    :goto_1d
    add-int/lit8 v6, v0, 0x1a

    .line 1189
    .line 1190
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1191
    .line 1192
    .line 1193
    move-result v6

    .line 1194
    add-int/lit8 v6, v6, 0x1b

    .line 1195
    .line 1196
    add-int/2addr v6, v0

    .line 1197
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1198
    .line 1199
    .line 1200
    move-result v0

    .line 1201
    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    .line 1202
    .line 1203
    .line 1204
    move-result v7

    .line 1205
    sub-int/2addr v7, v6

    .line 1206
    const/4 v13, 0x1

    .line 1207
    if-le v7, v13, :cond_38

    .line 1208
    .line 1209
    add-int/2addr v6, v13

    .line 1210
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 1211
    .line 1212
    .line 1213
    move-result v6

    .line 1214
    goto :goto_1e

    .line 1215
    :cond_38
    const/4 v6, 0x0

    .line 1216
    :goto_1e
    invoke-static {v0, v6}, Lou1;->V(BB)J

    .line 1217
    .line 1218
    .line 1219
    move-result-wide v6

    .line 1220
    const-wide/32 v11, 0xbb80

    .line 1221
    .line 1222
    .line 1223
    mul-long/2addr v6, v11

    .line 1224
    const-wide/32 v11, 0xf4240

    .line 1225
    .line 1226
    .line 1227
    div-long/2addr v6, v11

    .line 1228
    long-to-int v0, v6

    .line 1229
    :goto_1f
    iput v0, v1, Ldf4;->E:I

    .line 1230
    .line 1231
    if-eqz v0, :cond_1e

    .line 1232
    .line 1233
    goto :goto_21

    .line 1234
    :goto_20
    return v29

    .line 1235
    :cond_39
    :goto_21
    iget-object v0, v1, Ldf4;->w:Lue4;

    .line 1236
    .line 1237
    if-eqz v0, :cond_3b

    .line 1238
    .line 1239
    invoke-virtual {v1}, Ldf4;->d()Z

    .line 1240
    .line 1241
    .line 1242
    move-result v0

    .line 1243
    if-nez v0, :cond_3a

    .line 1244
    .line 1245
    goto/16 :goto_1

    .line 1246
    .line 1247
    :cond_3a
    invoke-virtual {v1, v3, v4}, Ldf4;->g(J)V

    .line 1248
    .line 1249
    .line 1250
    const/4 v7, 0x0

    .line 1251
    iput-object v7, v1, Ldf4;->w:Lue4;

    .line 1252
    .line 1253
    :cond_3b
    iget-wide v6, v1, Ldf4;->H:J

    .line 1254
    .line 1255
    iget-object v0, v1, Ldf4;->p:Lse4;

    .line 1256
    .line 1257
    invoke-virtual {v1}, Ldf4;->i()J

    .line 1258
    .line 1259
    .line 1260
    move-result-wide v11

    .line 1261
    iget-object v8, v1, Ldf4;->c:Lhf4;

    .line 1262
    .line 1263
    iget-wide v13, v8, Lhf4;->o:J

    .line 1264
    .line 1265
    sub-long/2addr v11, v13

    .line 1266
    iget-object v0, v0, Lse4;->a:Lph4;

    .line 1267
    .line 1268
    iget v0, v0, Lph4;->F:I

    .line 1269
    .line 1270
    invoke-static {v0, v11, v12}, Lv23;->s(IJ)J

    .line 1271
    .line 1272
    .line 1273
    move-result-wide v11

    .line 1274
    add-long/2addr v11, v6

    .line 1275
    iget-boolean v0, v1, Ldf4;->F:Z

    .line 1276
    .line 1277
    if-nez v0, :cond_3d

    .line 1278
    .line 1279
    sub-long v6, v11, v3

    .line 1280
    .line 1281
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    .line 1282
    .line 1283
    .line 1284
    move-result-wide v6

    .line 1285
    const-wide/32 v13, 0x30d40

    .line 1286
    .line 1287
    .line 1288
    cmp-long v0, v6, v13

    .line 1289
    .line 1290
    if-lez v0, :cond_3d

    .line 1291
    .line 1292
    iget-object v0, v1, Ldf4;->n:Lbi3;

    .line 1293
    .line 1294
    if-eqz v0, :cond_3c

    .line 1295
    .line 1296
    new-instance v6, Le62;

    .line 1297
    .line 1298
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v7

    .line 1302
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1303
    .line 1304
    .line 1305
    move-result v7

    .line 1306
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v8

    .line 1310
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 1311
    .line 1312
    .line 1313
    move-result v8

    .line 1314
    new-instance v13, Ljava/lang/StringBuilder;

    .line 1315
    .line 1316
    add-int/lit8 v7, v7, 0x3f

    .line 1317
    .line 1318
    add-int/2addr v7, v8

    .line 1319
    invoke-direct {v13, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1320
    .line 1321
    .line 1322
    const-string v7, "Unexpected audio track timestamp discontinuity: expected "

    .line 1323
    .line 1324
    const-string v8, ", got "

    .line 1325
    .line 1326
    invoke-static {v13, v7, v11, v12, v8}, Lex0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 1327
    .line 1328
    .line 1329
    invoke-virtual {v13, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v7

    .line 1336
    invoke-direct {v6, v7}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v0, v6}, Lbi3;->a(Ljava/lang/Exception;)V

    .line 1340
    .line 1341
    .line 1342
    :cond_3c
    const/4 v13, 0x1

    .line 1343
    iput-boolean v13, v1, Ldf4;->F:Z

    .line 1344
    .line 1345
    :cond_3d
    iget-boolean v0, v1, Ldf4;->F:Z

    .line 1346
    .line 1347
    if-eqz v0, :cond_3f

    .line 1348
    .line 1349
    invoke-virtual {v1}, Ldf4;->d()Z

    .line 1350
    .line 1351
    .line 1352
    move-result v0

    .line 1353
    if-nez v0, :cond_3e

    .line 1354
    .line 1355
    goto/16 :goto_1

    .line 1356
    .line 1357
    :cond_3e
    sub-long v6, v3, v11

    .line 1358
    .line 1359
    iget-wide v11, v1, Ldf4;->H:J

    .line 1360
    .line 1361
    add-long/2addr v11, v6

    .line 1362
    iput-wide v11, v1, Ldf4;->H:J

    .line 1363
    .line 1364
    const/4 v8, 0x0

    .line 1365
    iput-boolean v8, v1, Ldf4;->F:Z

    .line 1366
    .line 1367
    invoke-virtual {v1, v3, v4}, Ldf4;->g(J)V

    .line 1368
    .line 1369
    .line 1370
    iget-object v0, v1, Ldf4;->n:Lbi3;

    .line 1371
    .line 1372
    if-eqz v0, :cond_3f

    .line 1373
    .line 1374
    cmp-long v3, v6, v9

    .line 1375
    .line 1376
    if-eqz v3, :cond_3f

    .line 1377
    .line 1378
    iget-object v0, v0, Lbi3;->g:Ljava/lang/Object;

    .line 1379
    .line 1380
    check-cast v0, Lef4;

    .line 1381
    .line 1382
    const/4 v13, 0x1

    .line 1383
    iput-boolean v13, v0, Lef4;->I0:Z

    .line 1384
    .line 1385
    :cond_3f
    iget-object v0, v1, Ldf4;->p:Lse4;

    .line 1386
    .line 1387
    iget v0, v0, Lse4;->c:I

    .line 1388
    .line 1389
    if-nez v0, :cond_40

    .line 1390
    .line 1391
    iget-wide v3, v1, Ldf4;->A:J

    .line 1392
    .line 1393
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 1394
    .line 1395
    .line 1396
    move-result v0

    .line 1397
    int-to-long v6, v0

    .line 1398
    add-long/2addr v3, v6

    .line 1399
    iput-wide v3, v1, Ldf4;->A:J

    .line 1400
    .line 1401
    goto :goto_22

    .line 1402
    :cond_40
    iget-wide v3, v1, Ldf4;->B:J

    .line 1403
    .line 1404
    iget v0, v1, Ldf4;->E:I

    .line 1405
    .line 1406
    int-to-long v6, v0

    .line 1407
    int-to-long v11, v5

    .line 1408
    mul-long/2addr v6, v11

    .line 1409
    add-long/2addr v6, v3

    .line 1410
    iput-wide v6, v1, Ldf4;->B:J

    .line 1411
    .line 1412
    :goto_22
    iput-object v2, v1, Ldf4;->J:Ljava/nio/ByteBuffer;

    .line 1413
    .line 1414
    iput v5, v1, Ldf4;->K:I

    .line 1415
    .line 1416
    :cond_41
    invoke-virtual {v1}, Ldf4;->c()V

    .line 1417
    .line 1418
    .line 1419
    iget-object v0, v1, Ldf4;->J:Ljava/nio/ByteBuffer;

    .line 1420
    .line 1421
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 1422
    .line 1423
    .line 1424
    move-result v0

    .line 1425
    if-nez v0, :cond_42

    .line 1426
    .line 1427
    const/4 v7, 0x0

    .line 1428
    iput-object v7, v1, Ldf4;->J:Ljava/nio/ByteBuffer;

    .line 1429
    .line 1430
    const/4 v6, 0x0

    .line 1431
    iput v6, v1, Ldf4;->K:I

    .line 1432
    .line 1433
    :goto_23
    const/16 v29, 0x1

    .line 1434
    .line 1435
    return v29

    .line 1436
    :cond_42
    iget-object v0, v1, Ldf4;->g:Lqe4;

    .line 1437
    .line 1438
    invoke-virtual {v1}, Ldf4;->j()J

    .line 1439
    .line 1440
    .line 1441
    move-result-wide v2

    .line 1442
    iget-wide v4, v0, Lqe4;->v:J

    .line 1443
    .line 1444
    cmp-long v4, v4, v20

    .line 1445
    .line 1446
    if-eqz v4, :cond_2

    .line 1447
    .line 1448
    cmp-long v2, v2, v9

    .line 1449
    .line 1450
    if-lez v2, :cond_2

    .line 1451
    .line 1452
    iget-object v2, v0, Lqe4;->B:Lpz;

    .line 1453
    .line 1454
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1455
    .line 1456
    .line 1457
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1458
    .line 1459
    .line 1460
    move-result-wide v2

    .line 1461
    iget-wide v4, v0, Lqe4;->v:J

    .line 1462
    .line 1463
    sub-long/2addr v2, v4

    .line 1464
    const-wide/16 v4, 0xc8

    .line 1465
    .line 1466
    cmp-long v0, v2, v4

    .line 1467
    .line 1468
    if-ltz v0, :cond_2

    .line 1469
    .line 1470
    const-string v0, "Resetting stalled audio track"

    .line 1471
    .line 1472
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v1}, Ldf4;->t()V

    .line 1476
    .line 1477
    .line 1478
    goto :goto_23

    .line 1479
    :goto_24
    return v30

    .line 1480
    :catch_2
    move-exception v0

    .line 1481
    :try_start_b
    invoke-virtual {v9, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1482
    .line 1483
    .line 1484
    :cond_43
    iget-object v0, v1, Ldf4;->p:Lse4;

    .line 1485
    .line 1486
    iget v0, v0, Lse4;->c:I

    .line 1487
    .line 1488
    const/4 v13, 0x1

    .line 1489
    if-ne v0, v13, :cond_44

    .line 1490
    .line 1491
    iput-boolean v13, v1, Ldf4;->V:Z

    .line 1492
    .line 1493
    :cond_44
    throw v9
    :try_end_b
    .catch Lne4; {:try_start_b .. :try_end_b} :catch_1

    .line 1494
    :catchall_1
    move-exception v0

    .line 1495
    :try_start_c
    monitor-exit v14
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 1496
    :try_start_d
    throw v0
    :try_end_d
    .catch Lne4; {:try_start_d .. :try_end_d} :catch_1

    .line 1497
    :goto_25
    iget-boolean v2, v0, Lne4;->g:Z

    .line 1498
    .line 1499
    if-nez v2, :cond_45

    .line 1500
    .line 1501
    invoke-virtual {v6, v0}, Lrn1;->b(Ljava/lang/Exception;)V

    .line 1502
    .line 1503
    .line 1504
    const/16 v30, 0x0

    .line 1505
    .line 1506
    return v30

    .line 1507
    :cond_45
    throw v0

    .line 1508
    nop

    .line 1509
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_1
        :pswitch_4
        :pswitch_4
    .end packed-switch

    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
    .end packed-switch
.end method

.method public final s()Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Ldf4;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 14
    .line 15
    invoke-static {v0}, Li71;->t(Landroid/media/AudioTrack;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Ldf4;->O:Z

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Ldf4;->j()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iget-object v2, p0, Ldf4;->g:Lqe4;

    .line 30
    .line 31
    invoke-virtual {v2}, Lqe4;->b()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    iget-object v2, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    sget-object v5, Lv23;->a:Ljava/lang/String;

    .line 45
    .line 46
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 47
    .line 48
    int-to-long v5, v2

    .line 49
    const-wide/32 v7, 0xf4240

    .line 50
    .line 51
    .line 52
    invoke-static/range {v3 .. v9}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    cmp-long v0, v0, v2

    .line 57
    .line 58
    if-lez v0, :cond_1

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    return v0

    .line 62
    :cond_1
    const/4 v0, 0x0

    .line 63
    return v0
.end method

.method public final t()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Ldf4;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    iput-wide v3, p0, Ldf4;->A:J

    .line 16
    .line 17
    iput-wide v3, p0, Ldf4;->B:J

    .line 18
    .line 19
    iput-wide v3, p0, Ldf4;->C:J

    .line 20
    .line 21
    iput-wide v3, p0, Ldf4;->D:J

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput v0, p0, Ldf4;->E:I

    .line 25
    .line 26
    new-instance v6, Lue4;

    .line 27
    .line 28
    iget-object v7, p0, Ldf4;->y:Lsr1;

    .line 29
    .line 30
    const-wide/16 v8, 0x0

    .line 31
    .line 32
    const-wide/16 v10, 0x0

    .line 33
    .line 34
    invoke-direct/range {v6 .. v11}, Lue4;-><init>(Lsr1;JJ)V

    .line 35
    .line 36
    .line 37
    iput-object v6, p0, Ldf4;->x:Lue4;

    .line 38
    .line 39
    iput-wide v3, p0, Ldf4;->H:J

    .line 40
    .line 41
    iput-object v5, p0, Ldf4;->w:Lue4;

    .line 42
    .line 43
    iget-object v6, p0, Ldf4;->h:Ljava/util/ArrayDeque;

    .line 44
    .line 45
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->clear()V

    .line 46
    .line 47
    .line 48
    iput-object v5, p0, Ldf4;->J:Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    iput v0, p0, Ldf4;->K:I

    .line 51
    .line 52
    iput-object v5, p0, Ldf4;->L:Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    iput-boolean v0, p0, Ldf4;->N:Z

    .line 55
    .line 56
    iput-boolean v0, p0, Ldf4;->M:Z

    .line 57
    .line 58
    iput-boolean v0, p0, Ldf4;->O:Z

    .line 59
    .line 60
    iget-object v6, p0, Ldf4;->c:Lhf4;

    .line 61
    .line 62
    iput-wide v3, v6, Lhf4;->o:J

    .line 63
    .line 64
    iget-object v6, p0, Ldf4;->p:Lse4;

    .line 65
    .line 66
    iget-object v6, v6, Lse4;->i:Lnd2;

    .line 67
    .line 68
    iput-object v6, p0, Ldf4;->q:Lnd2;

    .line 69
    .line 70
    sget-object v7, Lpe2;->b:Lpe2;

    .line 71
    .line 72
    invoke-virtual {v6, v7}, Lnd2;->b(Lpe2;)V

    .line 73
    .line 74
    .line 75
    iget-object v6, p0, Ldf4;->g:Lqe4;

    .line 76
    .line 77
    iget-object v7, v6, Lqe4;->c:Landroid/media/AudioTrack;

    .line 78
    .line 79
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7}, Landroid/media/AudioTrack;->getPlayState()I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    const/4 v8, 0x3

    .line 87
    if-ne v7, v8, :cond_0

    .line 88
    .line 89
    iget-object v7, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 90
    .line 91
    invoke-virtual {v7}, Landroid/media/AudioTrack;->pause()V

    .line 92
    .line 93
    .line 94
    :cond_0
    iget-object v7, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 95
    .line 96
    invoke-static {v7}, Ldf4;->l(Landroid/media/AudioTrack;)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-eqz v7, :cond_1

    .line 101
    .line 102
    iget-object v7, p0, Ldf4;->i:Lpb3;

    .line 103
    .line 104
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v8, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 108
    .line 109
    iget-object v9, v7, Lpb3;->h:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v9, Lcf4;

    .line 112
    .line 113
    invoke-static {v8, v9}, Li71;->n(Landroid/media/AudioTrack;Lcf4;)V

    .line 114
    .line 115
    .line 116
    iget-object v7, v7, Lpb3;->g:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v7, Landroid/os/Handler;

    .line 119
    .line 120
    invoke-virtual {v7, v5}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_1
    iget-object v7, p0, Ldf4;->p:Lse4;

    .line 124
    .line 125
    invoke-virtual {v7}, Lse4;->a()Lle4;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    iget-object v7, p0, Ldf4;->o:Lse4;

    .line 130
    .line 131
    if-eqz v7, :cond_2

    .line 132
    .line 133
    iput-object v7, p0, Ldf4;->p:Lse4;

    .line 134
    .line 135
    iput-object v5, p0, Ldf4;->o:Lse4;

    .line 136
    .line 137
    :cond_2
    iput-wide v3, v6, Lqe4;->j:J

    .line 138
    .line 139
    iput v0, v6, Lqe4;->t:I

    .line 140
    .line 141
    iput v0, v6, Lqe4;->s:I

    .line 142
    .line 143
    iput-wide v3, v6, Lqe4;->k:J

    .line 144
    .line 145
    iput-wide v1, v6, Lqe4;->z:J

    .line 146
    .line 147
    iput-wide v1, v6, Lqe4;->A:J

    .line 148
    .line 149
    iput-boolean v0, v6, Lqe4;->h:Z

    .line 150
    .line 151
    iput-object v5, v6, Lqe4;->c:Landroid/media/AudioTrack;

    .line 152
    .line 153
    iput-object v5, v6, Lqe4;->d:Lpe4;

    .line 154
    .line 155
    iget-object v0, p0, Ldf4;->u:Lmc2;

    .line 156
    .line 157
    if-eqz v0, :cond_3

    .line 158
    .line 159
    iget-object v6, v0, Lmc2;->j:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v6, Lbf4;

    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    iget-object v7, v0, Lmc2;->g:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v7, Landroid/media/AudioTrack;

    .line 169
    .line 170
    invoke-virtual {v7, v6}, Landroid/media/AudioTrack;->removeOnRoutingChangedListener(Landroid/media/AudioRouting$OnRoutingChangedListener;)V

    .line 171
    .line 172
    .line 173
    iput-object v5, v0, Lmc2;->j:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v5, p0, Ldf4;->u:Lmc2;

    .line 176
    .line 177
    :cond_3
    iget-object v9, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 178
    .line 179
    iget-object v10, p0, Ldf4;->n:Lbi3;

    .line 180
    .line 181
    new-instance v11, Landroid/os/Handler;

    .line 182
    .line 183
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-direct {v11, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 188
    .line 189
    .line 190
    sget-object v6, Ldf4;->f0:Ljava/lang/Object;

    .line 191
    .line 192
    monitor-enter v6

    .line 193
    :try_start_0
    sget-object v0, Ldf4;->g0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 194
    .line 195
    const/4 v7, 0x1

    .line 196
    if-nez v0, :cond_4

    .line 197
    .line 198
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 199
    .line 200
    new-instance v0, Lrp0;

    .line 201
    .line 202
    invoke-direct {v0, v7}, Lrp0;-><init>(I)V

    .line 203
    .line 204
    .line 205
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    sput-object v0, Ldf4;->g0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 210
    .line 211
    goto :goto_0

    .line 212
    :catchall_0
    move-exception v0

    .line 213
    goto :goto_1

    .line 214
    :cond_4
    :goto_0
    sget v0, Ldf4;->h0:I

    .line 215
    .line 216
    add-int/2addr v0, v7

    .line 217
    sput v0, Ldf4;->h0:I

    .line 218
    .line 219
    sget-object v0, Ldf4;->g0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 220
    .line 221
    new-instance v8, Lvd;

    .line 222
    .line 223
    const/16 v13, 0x8

    .line 224
    .line 225
    const/4 v14, 0x0

    .line 226
    invoke-direct/range {v8 .. v14}, Lvd;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 227
    .line 228
    .line 229
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 230
    .line 231
    const-wide/16 v9, 0x14

    .line 232
    .line 233
    invoke-interface {v0, v8, v9, v10, v7}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 234
    .line 235
    .line 236
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 237
    iput-object v5, p0, Ldf4;->r:Landroid/media/AudioTrack;

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :goto_1
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 241
    throw v0

    .line 242
    :cond_5
    :goto_2
    iget-object v0, p0, Ldf4;->k:Lrn1;

    .line 243
    .line 244
    iput-object v5, v0, Lrn1;->h:Ljava/lang/Object;

    .line 245
    .line 246
    iput-wide v1, v0, Lrn1;->f:J

    .line 247
    .line 248
    iput-wide v1, v0, Lrn1;->g:J

    .line 249
    .line 250
    iget-object v0, p0, Ldf4;->j:Lrn1;

    .line 251
    .line 252
    iput-object v5, v0, Lrn1;->h:Ljava/lang/Object;

    .line 253
    .line 254
    iput-wide v1, v0, Lrn1;->f:J

    .line 255
    .line 256
    iput-wide v1, v0, Lrn1;->g:J

    .line 257
    .line 258
    iput-wide v3, p0, Ldf4;->X:J

    .line 259
    .line 260
    iput-wide v3, p0, Ldf4;->Y:J

    .line 261
    .line 262
    iget-object v0, p0, Ldf4;->Z:Landroid/os/Handler;

    .line 263
    .line 264
    if-eqz v0, :cond_6

    .line 265
    .line 266
    invoke-virtual {v0, v5}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    :cond_6
    return-void
.end method
