.class public final Lrd4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lbd4;


# instance fields
.field public A:Z

.field public B:I

.field public C:I

.field public D:I

.field public E:Z

.field public final f:Landroid/content/Context;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Lod4;

.field public final i:Landroid/media/metrics/PlaybackSession;

.field public final j:J

.field public final k:Lez1;

.field public final l:Lsw1;

.field public final m:Ljava/util/HashMap;

.field public final n:Ljava/util/HashMap;

.field public o:Ljava/lang/String;

.field public p:Landroid/media/metrics/PlaybackMetrics$Builder;

.field public q:I

.field public r:I

.field public s:Lb84;

.field public t:Llv2;

.field public u:Llv2;

.field public v:Llv2;

.field public w:Lph4;

.field public x:Lph4;

.field public y:Lph4;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lrd4;->f:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lrd4;->i:Landroid/media/metrics/PlaybackSession;

    .line 11
    .line 12
    invoke-static {}, Lwl2;->B()Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lrd4;->g:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance p1, Lez1;

    .line 19
    .line 20
    invoke-direct {p1}, Lez1;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lrd4;->k:Lez1;

    .line 24
    .line 25
    new-instance p1, Lsw1;

    .line 26
    .line 27
    invoke-direct {p1}, Lsw1;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lrd4;->l:Lsw1;

    .line 31
    .line 32
    new-instance p1, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lrd4;->n:Ljava/util/HashMap;

    .line 38
    .line 39
    new-instance p1, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lrd4;->m:Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    iput-wide p1, p0, Lrd4;->j:J

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    iput p1, p0, Lrd4;->q:I

    .line 54
    .line 55
    iput p1, p0, Lrd4;->r:I

    .line 56
    .line 57
    new-instance p1, Lod4;

    .line 58
    .line 59
    invoke-direct {p1}, Lod4;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lrd4;->h:Lod4;

    .line 63
    .line 64
    iput-object p0, p1, Lod4;->d:Lrd4;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final b(Ln34;)V
    .locals 2

    .line 1
    iget v0, p0, Lrd4;->B:I

    .line 2
    .line 3
    iget v1, p1, Ln34;->g:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    iput v0, p0, Lrd4;->B:I

    .line 7
    .line 8
    iget v0, p0, Lrd4;->C:I

    .line 9
    .line 10
    iget p1, p1, Ln34;->e:I

    .line 11
    .line 12
    add-int/2addr v0, p1

    .line 13
    iput v0, p0, Lrd4;->C:I

    .line 14
    .line 15
    return-void
.end method

.method public final c(IJLph4;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Lqd4;->p(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-wide v0, p0, Lrd4;->j:J

    .line 6
    .line 7
    sub-long/2addr p2, v0

    .line 8
    invoke-static {p1, p2, p3}, Lpd4;->i(Landroid/media/metrics/TrackChangeEvent$Builder;J)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 p2, 0x1

    .line 13
    if-eqz p4, :cond_b

    .line 14
    .line 15
    invoke-static {p1}, Lpd4;->s(Landroid/media/metrics/TrackChangeEvent$Builder;)V

    .line 16
    .line 17
    .line 18
    const/4 p3, 0x2

    .line 19
    if-eq p5, p2, :cond_0

    .line 20
    .line 21
    move p5, p2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p5, p3

    .line 24
    :goto_0
    invoke-static {p1, p5}, Lpd4;->t(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 25
    .line 26
    .line 27
    iget-object p5, p4, Lph4;->l:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p5, :cond_1

    .line 30
    .line 31
    invoke-static {p1, p5}, Lpd4;->x(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object p5, p4, Lph4;->m:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p5, :cond_2

    .line 37
    .line 38
    invoke-static {p1, p5}, Lpd4;->A(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object p5, p4, Lph4;->j:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz p5, :cond_3

    .line 44
    .line 45
    invoke-static {p1, p5}, Lpd4;->C(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    iget p5, p4, Lph4;->i:I

    .line 49
    .line 50
    const/4 v0, -0x1

    .line 51
    if-eq p5, v0, :cond_4

    .line 52
    .line 53
    invoke-static {p1, p5}, Lpd4;->w(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 54
    .line 55
    .line 56
    :cond_4
    iget p5, p4, Lph4;->t:I

    .line 57
    .line 58
    if-eq p5, v0, :cond_5

    .line 59
    .line 60
    invoke-static {p1, p5}, Lpd4;->z(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 61
    .line 62
    .line 63
    :cond_5
    iget p5, p4, Lph4;->u:I

    .line 64
    .line 65
    if-eq p5, v0, :cond_6

    .line 66
    .line 67
    invoke-static {p1, p5}, Lpd4;->B(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 68
    .line 69
    .line 70
    :cond_6
    iget p5, p4, Lph4;->E:I

    .line 71
    .line 72
    if-eq p5, v0, :cond_7

    .line 73
    .line 74
    invoke-static {p1, p5}, Lpd4;->D(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 75
    .line 76
    .line 77
    :cond_7
    iget p5, p4, Lph4;->F:I

    .line 78
    .line 79
    if-eq p5, v0, :cond_8

    .line 80
    .line 81
    invoke-static {p1, p5}, Lpd4;->o(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 82
    .line 83
    .line 84
    :cond_8
    iget-object p5, p4, Lph4;->d:Ljava/lang/String;

    .line 85
    .line 86
    if-eqz p5, :cond_a

    .line 87
    .line 88
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 89
    .line 90
    const-string v1, "-"

    .line 91
    .line 92
    invoke-virtual {p5, v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p5

    .line 96
    const/4 v0, 0x0

    .line 97
    aget-object v0, p5, v0

    .line 98
    .line 99
    array-length v1, p5

    .line 100
    if-lt v1, p3, :cond_9

    .line 101
    .line 102
    aget-object p3, p5, p2

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_9
    const/4 p3, 0x0

    .line 106
    :goto_1
    invoke-static {v0, p3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    iget-object p5, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p5, Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {p1, p5}, Lpd4;->p(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object p3, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 118
    .line 119
    if-eqz p3, :cond_a

    .line 120
    .line 121
    check-cast p3, Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {p1, p3}, Lpd4;->u(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_a
    iget p3, p4, Lph4;->x:F

    .line 127
    .line 128
    const/high16 p4, -0x40800000    # -1.0f

    .line 129
    .line 130
    cmpl-float p4, p3, p4

    .line 131
    .line 132
    if-eqz p4, :cond_c

    .line 133
    .line 134
    invoke-static {p1, p3}, Lpd4;->n(Landroid/media/metrics/TrackChangeEvent$Builder;F)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_b
    invoke-static {p1}, Lpd4;->m(Landroid/media/metrics/TrackChangeEvent$Builder;)V

    .line 139
    .line 140
    .line 141
    :cond_c
    :goto_2
    iput-boolean p2, p0, Lrd4;->E:Z

    .line 142
    .line 143
    invoke-static {p1}, Lpd4;->j(Landroid/media/metrics/TrackChangeEvent$Builder;)Landroid/media/metrics/TrackChangeEvent;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    new-instance p2, Lsz2;

    .line 148
    .line 149
    const/16 p3, 0x1a

    .line 150
    .line 151
    invoke-direct {p2, p0, p1, p3}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lrd4;->g:Ljava/util/concurrent/Executor;

    .line 155
    .line 156
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method public final e(Loz1;Lkh4;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lrd4;->p:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto/16 :goto_7

    .line 6
    .line 7
    :cond_0
    iget-object p2, p2, Lkh4;->a:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Loz1;->e(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v1, -0x1

    .line 14
    if-eq p2, v1, :cond_10

    .line 15
    .line 16
    iget-object v1, p0, Lrd4;->l:Lsw1;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p1, p2, v1, v2}, Loz1;->d(ILsw1;Z)Lsw1;

    .line 20
    .line 21
    .line 22
    iget p2, v1, Lsw1;->c:I

    .line 23
    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    iget-object v1, p0, Lrd4;->k:Lez1;

    .line 27
    .line 28
    invoke-virtual {p1, p2, v1, v3, v4}, Loz1;->b(ILez1;J)Lez1;

    .line 29
    .line 30
    .line 31
    iget-object p1, v1, Lez1;->b:Lfk1;

    .line 32
    .line 33
    iget-object p1, p1, Lfk1;->b:Lkh1;

    .line 34
    .line 35
    const/4 p2, 0x2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    goto/16 :goto_6

    .line 40
    .line 41
    :cond_1
    iget-object p1, p1, Lkh1;->a:Landroid/net/Uri;

    .line 42
    .line 43
    sget-object v4, Lv23;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const/4 v5, 0x3

    .line 50
    const/4 v6, 0x4

    .line 51
    if-eqz v4, :cond_3

    .line 52
    .line 53
    const-string v7, "rtsp"

    .line 54
    .line 55
    invoke-static {v7, v4}, Lum;->L(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-nez v7, :cond_2

    .line 60
    .line 61
    const-string v7, "rtspt"

    .line 62
    .line 63
    invoke-static {v7, v4}, Lum;->L(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move v2, v5

    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_3
    :goto_0
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    if-nez v4, :cond_5

    .line 78
    .line 79
    :cond_4
    move v2, v6

    .line 80
    goto/16 :goto_5

    .line 81
    .line 82
    :cond_5
    const/16 v7, 0x2e

    .line 83
    .line 84
    invoke-virtual {v4, v7}, Ljava/lang/String;->lastIndexOf(I)I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-ltz v7, :cond_8

    .line 89
    .line 90
    add-int/2addr v7, v3

    .line 91
    invoke-virtual {v4, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-static {v4}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    sparse-switch v7, :sswitch_data_0

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :sswitch_0
    const-string v7, "m3u8"

    .line 108
    .line 109
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_6

    .line 114
    .line 115
    move v4, p2

    .line 116
    goto :goto_3

    .line 117
    :sswitch_1
    const-string v7, "isml"

    .line 118
    .line 119
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_6

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :sswitch_2
    const-string v7, "mpd"

    .line 127
    .line 128
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_6

    .line 133
    .line 134
    move v4, v2

    .line 135
    goto :goto_3

    .line 136
    :sswitch_3
    const-string v7, "ism"

    .line 137
    .line 138
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_6

    .line 143
    .line 144
    :goto_1
    move v4, v3

    .line 145
    goto :goto_3

    .line 146
    :cond_6
    :goto_2
    move v4, v6

    .line 147
    :goto_3
    if-ne v4, v6, :cond_7

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_7
    move v2, v4

    .line 151
    goto :goto_5

    .line 152
    :cond_8
    :goto_4
    sget-object v4, Lv23;->c:Ljava/util/regex/Pattern;

    .line 153
    .line 154
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_4

    .line 170
    .line 171
    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    if-eqz p1, :cond_a

    .line 176
    .line 177
    const-string v4, "format=mpd-time-csf"

    .line 178
    .line 179
    invoke-virtual {p1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_9

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_9
    const-string v2, "format=m3u8-aapl"

    .line 187
    .line 188
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    if-eqz p1, :cond_a

    .line 193
    .line 194
    move v2, p2

    .line 195
    goto :goto_5

    .line 196
    :cond_a
    move v2, v3

    .line 197
    :goto_5
    if-eqz v2, :cond_d

    .line 198
    .line 199
    if-eq v2, v3, :cond_c

    .line 200
    .line 201
    if-eq v2, p2, :cond_b

    .line 202
    .line 203
    move v2, v3

    .line 204
    goto :goto_6

    .line 205
    :cond_b
    move v2, v6

    .line 206
    goto :goto_6

    .line 207
    :cond_c
    const/4 v2, 0x5

    .line 208
    goto :goto_6

    .line 209
    :cond_d
    move v2, v5

    .line 210
    :goto_6
    invoke-static {v0, v2}, Lqd4;->r(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 211
    .line 212
    .line 213
    iget-wide v4, v1, Lez1;->j:J

    .line 214
    .line 215
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    cmp-long p1, v4, v6

    .line 221
    .line 222
    if-eqz p1, :cond_e

    .line 223
    .line 224
    iget-boolean p1, v1, Lez1;->i:Z

    .line 225
    .line 226
    if-nez p1, :cond_e

    .line 227
    .line 228
    iget-boolean p1, v1, Lez1;->g:Z

    .line 229
    .line 230
    if-nez p1, :cond_e

    .line 231
    .line 232
    invoke-virtual {v1}, Lez1;->b()Z

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    if-nez p1, :cond_e

    .line 237
    .line 238
    invoke-static {v4, v5}, Lv23;->q(J)J

    .line 239
    .line 240
    .line 241
    move-result-wide v4

    .line 242
    invoke-static {v0, v4, v5}, Lqd4;->s(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 243
    .line 244
    .line 245
    :cond_e
    invoke-virtual {v1}, Lez1;->b()Z

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    if-eq v3, p1, :cond_f

    .line 250
    .line 251
    move p2, v3

    .line 252
    :cond_f
    invoke-static {v0, p2}, Lqd4;->C(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 253
    .line 254
    .line 255
    iput-boolean v3, p0, Lrd4;->E:Z

    .line 256
    .line 257
    :cond_10
    :goto_7
    return-void

    .line 258
    nop

    .line 259
    :sswitch_data_0
    .sparse-switch
        0x19883 -> :sswitch_3
        0x1a721 -> :sswitch_2
        0x317849 -> :sswitch_1
        0x325a49 -> :sswitch_0
    .end sparse-switch
.end method

.method public final f()V
    .locals 7

    .line 1
    iget-object v0, p0, Lrd4;->p:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-boolean v2, p0, Lrd4;->E:Z

    .line 7
    .line 8
    if-eqz v2, :cond_3

    .line 9
    .line 10
    iget v2, p0, Lrd4;->D:I

    .line 11
    .line 12
    invoke-static {v0, v2}, Lpd4;->k(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lrd4;->p:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 16
    .line 17
    iget v2, p0, Lrd4;->B:I

    .line 18
    .line 19
    invoke-static {v0, v2}, Lpd4;->q(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lrd4;->p:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 23
    .line 24
    iget v2, p0, Lrd4;->C:I

    .line 25
    .line 26
    invoke-static {v0, v2}, Lpd4;->v(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lrd4;->m:Ljava/util/HashMap;

    .line 30
    .line 31
    iget-object v2, p0, Lrd4;->o:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Long;

    .line 38
    .line 39
    iget-object v2, p0, Lrd4;->p:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 40
    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    move-wide v5, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    :goto_0
    invoke-static {v2, v5, v6}, Lpd4;->l(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lrd4;->n:Ljava/util/HashMap;

    .line 55
    .line 56
    iget-object v2, p0, Lrd4;->o:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Long;

    .line 63
    .line 64
    iget-object v2, p0, Lrd4;->p:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    move-wide v5, v3

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    :goto_1
    invoke-static {v2, v5, v6}, Lpd4;->r(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, Lrd4;->p:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    cmp-long v0, v5, v3

    .line 86
    .line 87
    if-lez v0, :cond_2

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move v0, v1

    .line 92
    :goto_2
    invoke-static {v2, v0}, Lpd4;->y(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lrd4;->p:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 96
    .line 97
    invoke-static {v0}, Lpd4;->e(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    new-instance v2, Lsz2;

    .line 102
    .line 103
    const/16 v3, 0x1b

    .line 104
    .line 105
    invoke-direct {v2, p0, v0, v3}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lrd4;->g:Ljava/util/concurrent/Executor;

    .line 109
    .line 110
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    const/4 v0, 0x0

    .line 114
    iput-object v0, p0, Lrd4;->p:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 115
    .line 116
    iput-object v0, p0, Lrd4;->o:Ljava/lang/String;

    .line 117
    .line 118
    iput v1, p0, Lrd4;->D:I

    .line 119
    .line 120
    iput v1, p0, Lrd4;->B:I

    .line 121
    .line 122
    iput v1, p0, Lrd4;->C:I

    .line 123
    .line 124
    iput-object v0, p0, Lrd4;->w:Lph4;

    .line 125
    .line 126
    iput-object v0, p0, Lrd4;->x:Lph4;

    .line 127
    .line 128
    iput-object v0, p0, Lrd4;->y:Lph4;

    .line 129
    .line 130
    iput-boolean v1, p0, Lrd4;->E:Z

    .line 131
    .line 132
    return-void
.end method

.method public final h(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iput-boolean v0, p0, Lrd4;->z:Z

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public final i(Lad4;IJ)V
    .locals 8

    .line 1
    iget-object v0, p1, Lad4;->d:Lkh4;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lrd4;->h:Lod4;

    .line 6
    .line 7
    iget-object p1, p1, Lad4;->b:Loz1;

    .line 8
    .line 9
    invoke-virtual {v1, p1, v0}, Lod4;->a(Loz1;Lkh4;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lrd4;->n:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Long;

    .line 20
    .line 21
    iget-object v2, p0, Lrd4;->m:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ljava/lang/Long;

    .line 28
    .line 29
    const-wide/16 v4, 0x0

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    move-wide v6, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    :goto_0
    add-long/2addr v6, p3

    .line 40
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    if-nez v3, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    :goto_1
    int-to-long p2, p2

    .line 55
    add-long/2addr v4, p2

    .line 56
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {v2, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_2
    return-void
.end method

.method public final j(Lb84;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd4;->s:Lb84;

    .line 2
    .line 3
    return-void
.end method

.method public final k(Lt82;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lrd4;->t:Llv2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Llv2;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lph4;

    .line 8
    .line 9
    iget v2, v1, Lph4;->u:I

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    new-instance v2, Lgg4;

    .line 15
    .line 16
    invoke-direct {v2, v1}, Lgg4;-><init>(Lph4;)V

    .line 17
    .line 18
    .line 19
    iget v1, p1, Lt82;->a:I

    .line 20
    .line 21
    iput v1, v2, Lgg4;->s:I

    .line 22
    .line 23
    iget p1, p1, Lt82;->b:I

    .line 24
    .line 25
    iput p1, v2, Lgg4;->t:I

    .line 26
    .line 27
    new-instance p1, Lph4;

    .line 28
    .line 29
    invoke-direct {p1, v2}, Lph4;-><init>(Lgg4;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, Llv2;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/lang/String;

    .line 35
    .line 36
    new-instance v1, Llv2;

    .line 37
    .line 38
    const/16 v2, 0x10

    .line 39
    .line 40
    invoke-direct {v1, p1, v0, v2}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lrd4;->t:Llv2;

    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public final m(Lf74;Lmr2;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    iget-object v2, v0, Lmr2;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lof4;

    .line 8
    .line 9
    iget-object v2, v2, Lof4;->a:Landroid/util/SparseBooleanArray;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2c

    .line 18
    .line 19
    :cond_0
    const/4 v7, 0x0

    .line 20
    move v2, v7

    .line 21
    :goto_0
    iget-object v3, v0, Lmr2;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lof4;

    .line 24
    .line 25
    iget-object v3, v3, Lof4;->a:Landroid/util/SparseBooleanArray;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/util/SparseBooleanArray;->size()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/16 v8, 0xb

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    if-ge v2, v3, :cond_c

    .line 35
    .line 36
    iget-object v3, v0, Lmr2;->g:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Lof4;

    .line 39
    .line 40
    invoke-virtual {v3, v2}, Lof4;->a(I)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    iget-object v4, v0, Lmr2;->h:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Landroid/util/SparseArray;

    .line 47
    .line 48
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Lad4;

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    if-nez v3, :cond_6

    .line 58
    .line 59
    iget-object v6, v1, Lrd4;->h:Lod4;

    .line 60
    .line 61
    monitor-enter v6

    .line 62
    :try_start_0
    iget-object v3, v6, Lod4;->d:Lrd4;

    .line 63
    .line 64
    if-eqz v3, :cond_5

    .line 65
    .line 66
    iget-object v3, v6, Lod4;->e:Loz1;

    .line 67
    .line 68
    iget-object v5, v4, Lad4;->b:Loz1;

    .line 69
    .line 70
    iput-object v5, v6, Lod4;->e:Loz1;

    .line 71
    .line 72
    iget-object v5, v6, Lod4;->c:Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    :cond_1
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-eqz v8, :cond_4

    .line 87
    .line 88
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    check-cast v8, Lnd4;

    .line 93
    .line 94
    iget-object v9, v6, Lod4;->e:Loz1;

    .line 95
    .line 96
    invoke-virtual {v8, v3, v9}, Lnd4;->a(Loz1;Loz1;)Z

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    if-eqz v9, :cond_2

    .line 101
    .line 102
    invoke-virtual {v8, v4}, Lnd4;->b(Lad4;)Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    if-eqz v9, :cond_1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catchall_0
    move-exception v0

    .line 110
    goto :goto_3

    .line 111
    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 112
    .line 113
    .line 114
    iget-boolean v9, v8, Lnd4;->e:Z

    .line 115
    .line 116
    if-eqz v9, :cond_1

    .line 117
    .line 118
    iget-object v9, v8, Lnd4;->a:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v10, v6, Lod4;->f:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    if-eqz v9, :cond_3

    .line 127
    .line 128
    invoke-virtual {v6, v8}, Lod4;->d(Lnd4;)V

    .line 129
    .line 130
    .line 131
    :cond_3
    iget-object v9, v6, Lod4;->d:Lrd4;

    .line 132
    .line 133
    iget-object v8, v8, Lnd4;->a:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v9, v4, v8}, Lrd4;->q(Lad4;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    invoke-virtual {v6, v4}, Lod4;->c(Lad4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    .line 142
    monitor-exit v6

    .line 143
    goto :goto_7

    .line 144
    :cond_5
    :try_start_1
    throw v5

    .line 145
    :goto_3
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 146
    throw v0

    .line 147
    :cond_6
    if-ne v3, v8, :cond_b

    .line 148
    .line 149
    iget-object v3, v1, Lrd4;->h:Lod4;

    .line 150
    .line 151
    monitor-enter v3

    .line 152
    :try_start_2
    iget-object v6, v3, Lod4;->d:Lrd4;

    .line 153
    .line 154
    if-eqz v6, :cond_a

    .line 155
    .line 156
    iget-object v5, v3, Lod4;->c:Ljava/util/HashMap;

    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    :cond_7
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    if-eqz v6, :cond_9

    .line 171
    .line 172
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    check-cast v6, Lnd4;

    .line 177
    .line 178
    invoke-virtual {v6, v4}, Lnd4;->b(Lad4;)Z

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    if-eqz v8, :cond_7

    .line 183
    .line 184
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 185
    .line 186
    .line 187
    iget-boolean v8, v6, Lnd4;->e:Z

    .line 188
    .line 189
    if-eqz v8, :cond_7

    .line 190
    .line 191
    iget-object v8, v6, Lnd4;->a:Ljava/lang/String;

    .line 192
    .line 193
    iget-object v9, v3, Lod4;->f:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    if-eqz v8, :cond_8

    .line 200
    .line 201
    invoke-virtual {v3, v6}, Lod4;->d(Lnd4;)V

    .line 202
    .line 203
    .line 204
    goto :goto_5

    .line 205
    :catchall_1
    move-exception v0

    .line 206
    goto :goto_6

    .line 207
    :cond_8
    :goto_5
    iget-object v8, v3, Lod4;->d:Lrd4;

    .line 208
    .line 209
    iget-object v6, v6, Lnd4;->a:Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {v8, v4, v6}, Lrd4;->q(Lad4;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_9
    invoke-virtual {v3, v4}, Lod4;->c(Lad4;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 216
    .line 217
    .line 218
    monitor-exit v3

    .line 219
    goto :goto_7

    .line 220
    :cond_a
    :try_start_3
    throw v5

    .line 221
    :goto_6
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 222
    throw v0

    .line 223
    :cond_b
    iget-object v3, v1, Lrd4;->h:Lod4;

    .line 224
    .line 225
    invoke-virtual {v3, v4}, Lod4;->b(Lad4;)V

    .line 226
    .line 227
    .line 228
    :goto_7
    add-int/lit8 v2, v2, 0x1

    .line 229
    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :cond_c
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 233
    .line 234
    .line 235
    move-result-wide v3

    .line 236
    invoke-virtual {v0, v7}, Lmr2;->A(I)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_d

    .line 241
    .line 242
    iget-object v2, v0, Lmr2;->h:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v2, Landroid/util/SparseArray;

    .line 245
    .line 246
    invoke-virtual {v2, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    check-cast v2, Lad4;

    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    iget-object v6, v1, Lrd4;->p:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 256
    .line 257
    if-eqz v6, :cond_d

    .line 258
    .line 259
    iget-object v6, v2, Lad4;->b:Loz1;

    .line 260
    .line 261
    iget-object v2, v2, Lad4;->d:Lkh4;

    .line 262
    .line 263
    invoke-virtual {v1, v6, v2}, Lrd4;->e(Loz1;Lkh4;)V

    .line 264
    .line 265
    .line 266
    :cond_d
    const/4 v9, 0x2

    .line 267
    invoke-virtual {v0, v9}, Lmr2;->A(I)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    const/4 v11, 0x3

    .line 272
    const/4 v12, 0x1

    .line 273
    if-eqz v2, :cond_15

    .line 274
    .line 275
    iget-object v2, v1, Lrd4;->p:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 276
    .line 277
    if-eqz v2, :cond_15

    .line 278
    .line 279
    invoke-virtual/range {p1 .. p1}, Lf74;->J1()Lo42;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    iget-object v2, v2, Lo42;->a:Lxm3;

    .line 284
    .line 285
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    move v13, v7

    .line 290
    :goto_8
    if-ge v13, v6, :cond_10

    .line 291
    .line 292
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v14

    .line 296
    check-cast v14, Lc42;

    .line 297
    .line 298
    move v15, v7

    .line 299
    :goto_9
    iget v8, v14, Lc42;->a:I

    .line 300
    .line 301
    add-int/lit8 v16, v13, 0x1

    .line 302
    .line 303
    if-ge v15, v8, :cond_f

    .line 304
    .line 305
    iget-object v8, v14, Lc42;->e:[Z

    .line 306
    .line 307
    aget-boolean v8, v8, v15

    .line 308
    .line 309
    if-eqz v8, :cond_e

    .line 310
    .line 311
    iget-object v8, v14, Lc42;->b:Ld02;

    .line 312
    .line 313
    iget-object v8, v8, Ld02;->d:[Lph4;

    .line 314
    .line 315
    aget-object v8, v8, v15

    .line 316
    .line 317
    iget-object v8, v8, Lph4;->q:Lie4;

    .line 318
    .line 319
    if-eqz v8, :cond_e

    .line 320
    .line 321
    goto :goto_a

    .line 322
    :cond_e
    add-int/lit8 v15, v15, 0x1

    .line 323
    .line 324
    goto :goto_9

    .line 325
    :cond_f
    move/from16 v13, v16

    .line 326
    .line 327
    const/16 v8, 0xb

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_10
    move-object v8, v5

    .line 331
    :goto_a
    if-eqz v8, :cond_15

    .line 332
    .line 333
    iget-object v2, v1, Lrd4;->p:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 334
    .line 335
    sget-object v6, Lv23;->a:Ljava/lang/String;

    .line 336
    .line 337
    invoke-static {v2}, Lpd4;->d(Ljava/lang/Object;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    move v6, v7

    .line 342
    :goto_b
    iget v13, v8, Lie4;->i:I

    .line 343
    .line 344
    if-ge v6, v13, :cond_14

    .line 345
    .line 346
    iget-object v13, v8, Lie4;->f:[Lvd4;

    .line 347
    .line 348
    aget-object v13, v13, v6

    .line 349
    .line 350
    iget-object v13, v13, Lvd4;->g:Ljava/util/UUID;

    .line 351
    .line 352
    sget-object v14, Lfh3;->d:Ljava/util/UUID;

    .line 353
    .line 354
    invoke-virtual {v13, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v14

    .line 358
    if-eqz v14, :cond_11

    .line 359
    .line 360
    move v6, v11

    .line 361
    goto :goto_c

    .line 362
    :cond_11
    sget-object v14, Lfh3;->e:Ljava/util/UUID;

    .line 363
    .line 364
    invoke-virtual {v13, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v14

    .line 368
    if-eqz v14, :cond_12

    .line 369
    .line 370
    move v6, v9

    .line 371
    goto :goto_c

    .line 372
    :cond_12
    sget-object v14, Lfh3;->c:Ljava/util/UUID;

    .line 373
    .line 374
    invoke-virtual {v13, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v13

    .line 378
    if-eqz v13, :cond_13

    .line 379
    .line 380
    const/4 v6, 0x6

    .line 381
    goto :goto_c

    .line 382
    :cond_13
    add-int/lit8 v6, v6, 0x1

    .line 383
    .line 384
    goto :goto_b

    .line 385
    :cond_14
    move v6, v12

    .line 386
    :goto_c
    invoke-static {v2, v6}, Lqd4;->D(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 387
    .line 388
    .line 389
    :cond_15
    const/16 v2, 0x3f3

    .line 390
    .line 391
    invoke-virtual {v0, v2}, Lmr2;->A(I)Z

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    if-eqz v2, :cond_16

    .line 396
    .line 397
    iget v2, v1, Lrd4;->D:I

    .line 398
    .line 399
    add-int/2addr v2, v12

    .line 400
    iput v2, v1, Lrd4;->D:I

    .line 401
    .line 402
    :cond_16
    iget-object v2, v1, Lrd4;->s:Lb84;

    .line 403
    .line 404
    const/16 v16, 0x7

    .line 405
    .line 406
    const/16 v17, 0x5

    .line 407
    .line 408
    const/16 v18, 0x9

    .line 409
    .line 410
    if-nez v2, :cond_17

    .line 411
    .line 412
    goto/16 :goto_16

    .line 413
    .line 414
    :cond_17
    iget-object v6, v1, Lrd4;->f:Landroid/content/Context;

    .line 415
    .line 416
    iget v10, v2, Lb84;->f:I

    .line 417
    .line 418
    const/16 v14, 0x3e9

    .line 419
    .line 420
    const/16 v15, 0x1c

    .line 421
    .line 422
    if-ne v10, v14, :cond_18

    .line 423
    .line 424
    const/16 v6, 0x14

    .line 425
    .line 426
    goto/16 :goto_15

    .line 427
    .line 428
    :cond_18
    iget v14, v2, Lb84;->h:I

    .line 429
    .line 430
    if-ne v14, v12, :cond_19

    .line 431
    .line 432
    move v14, v12

    .line 433
    goto :goto_d

    .line 434
    :cond_19
    move v14, v7

    .line 435
    :goto_d
    iget v8, v2, Lb84;->l:I

    .line 436
    .line 437
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 438
    .line 439
    .line 440
    move-result-object v7

    .line 441
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    instance-of v13, v7, Ljava/io/IOException;

    .line 445
    .line 446
    const/16 v19, 0x1a

    .line 447
    .line 448
    const/16 v20, 0x1b

    .line 449
    .line 450
    const/16 v21, 0x17

    .line 451
    .line 452
    if-eqz v13, :cond_2c

    .line 453
    .line 454
    instance-of v8, v7, Lko3;

    .line 455
    .line 456
    if-eqz v8, :cond_1a

    .line 457
    .line 458
    check-cast v7, Lko3;

    .line 459
    .line 460
    iget v6, v7, Lko3;->h:I

    .line 461
    .line 462
    move v7, v6

    .line 463
    move/from16 v6, v17

    .line 464
    .line 465
    goto/16 :goto_15

    .line 466
    .line 467
    :cond_1a
    instance-of v8, v7, Llq1;

    .line 468
    .line 469
    if-eqz v8, :cond_1c

    .line 470
    .line 471
    const/16 v6, 0xb

    .line 472
    .line 473
    :cond_1b
    :goto_e
    const/4 v7, 0x0

    .line 474
    goto/16 :goto_15

    .line 475
    .line 476
    :cond_1c
    instance-of v8, v7, Lkn3;

    .line 477
    .line 478
    if-nez v8, :cond_27

    .line 479
    .line 480
    instance-of v13, v7, Lkt3;

    .line 481
    .line 482
    if-eqz v13, :cond_1d

    .line 483
    .line 484
    goto/16 :goto_13

    .line 485
    .line 486
    :cond_1d
    const/16 v6, 0x3ea

    .line 487
    .line 488
    if-ne v10, v6, :cond_1e

    .line 489
    .line 490
    const/16 v6, 0x15

    .line 491
    .line 492
    goto :goto_e

    .line 493
    :cond_1e
    instance-of v6, v7, Lif4;

    .line 494
    .line 495
    if-eqz v6, :cond_24

    .line 496
    .line 497
    invoke-virtual {v7}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 498
    .line 499
    .line 500
    move-result-object v6

    .line 501
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    instance-of v7, v6, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 505
    .line 506
    if-eqz v7, :cond_1f

    .line 507
    .line 508
    check-cast v6, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 509
    .line 510
    invoke-virtual {v6}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v6

    .line 514
    invoke-static {v6}, Lv23;->i(Ljava/lang/String;)I

    .line 515
    .line 516
    .line 517
    move-result v6

    .line 518
    invoke-static {v6}, Lv23;->e(I)I

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    packed-switch v7, :pswitch_data_0

    .line 523
    .line 524
    .line 525
    :goto_f
    move/from16 v19, v20

    .line 526
    .line 527
    goto :goto_10

    .line 528
    :pswitch_0
    const/16 v19, 0x19

    .line 529
    .line 530
    goto :goto_10

    .line 531
    :pswitch_1
    move/from16 v19, v15

    .line 532
    .line 533
    goto :goto_10

    .line 534
    :pswitch_2
    const/16 v19, 0x18

    .line 535
    .line 536
    :goto_10
    :pswitch_3
    move v7, v6

    .line 537
    move/from16 v6, v19

    .line 538
    .line 539
    goto/16 :goto_15

    .line 540
    .line 541
    :cond_1f
    instance-of v7, v6, Landroid/media/MediaDrmResetException;

    .line 542
    .line 543
    if-eqz v7, :cond_20

    .line 544
    .line 545
    move/from16 v6, v20

    .line 546
    .line 547
    goto :goto_e

    .line 548
    :cond_20
    instance-of v7, v6, Landroid/media/NotProvisionedException;

    .line 549
    .line 550
    if-eqz v7, :cond_21

    .line 551
    .line 552
    const/16 v6, 0x18

    .line 553
    .line 554
    goto :goto_e

    .line 555
    :cond_21
    instance-of v7, v6, Landroid/media/DeniedByServerException;

    .line 556
    .line 557
    if-eqz v7, :cond_22

    .line 558
    .line 559
    const/16 v6, 0x1d

    .line 560
    .line 561
    goto :goto_e

    .line 562
    :cond_22
    instance-of v6, v6, Lrf4;

    .line 563
    .line 564
    if-eqz v6, :cond_23

    .line 565
    .line 566
    :goto_11
    move/from16 v6, v21

    .line 567
    .line 568
    goto :goto_e

    .line 569
    :cond_23
    const/16 v6, 0x1e

    .line 570
    .line 571
    goto :goto_e

    .line 572
    :cond_24
    instance-of v6, v7, Lol3;

    .line 573
    .line 574
    if-eqz v6, :cond_26

    .line 575
    .line 576
    invoke-virtual {v7}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 577
    .line 578
    .line 579
    move-result-object v6

    .line 580
    instance-of v6, v6, Ljava/io/FileNotFoundException;

    .line 581
    .line 582
    if-eqz v6, :cond_26

    .line 583
    .line 584
    invoke-virtual {v7}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 585
    .line 586
    .line 587
    move-result-object v6

    .line 588
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v6}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 592
    .line 593
    .line 594
    move-result-object v6

    .line 595
    instance-of v7, v6, Landroid/system/ErrnoException;

    .line 596
    .line 597
    const/16 v8, 0x1f

    .line 598
    .line 599
    if-eqz v7, :cond_25

    .line 600
    .line 601
    check-cast v6, Landroid/system/ErrnoException;

    .line 602
    .line 603
    iget v6, v6, Landroid/system/ErrnoException;->errno:I

    .line 604
    .line 605
    sget v7, Landroid/system/OsConstants;->EACCES:I

    .line 606
    .line 607
    if-ne v6, v7, :cond_25

    .line 608
    .line 609
    const/16 v6, 0x20

    .line 610
    .line 611
    goto/16 :goto_e

    .line 612
    .line 613
    :cond_25
    :goto_12
    move v6, v8

    .line 614
    goto/16 :goto_e

    .line 615
    .line 616
    :cond_26
    move/from16 v6, v18

    .line 617
    .line 618
    goto/16 :goto_e

    .line 619
    .line 620
    :cond_27
    :goto_13
    invoke-static {v6}, Lvy2;->a(Landroid/content/Context;)Lvy2;

    .line 621
    .line 622
    .line 623
    move-result-object v6

    .line 624
    invoke-virtual {v6}, Lvy2;->b()I

    .line 625
    .line 626
    .line 627
    move-result v6

    .line 628
    if-ne v6, v12, :cond_28

    .line 629
    .line 630
    move v6, v11

    .line 631
    goto/16 :goto_e

    .line 632
    .line 633
    :cond_28
    invoke-virtual {v7}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 634
    .line 635
    .line 636
    move-result-object v6

    .line 637
    instance-of v10, v6, Ljava/net/UnknownHostException;

    .line 638
    .line 639
    if-eqz v10, :cond_29

    .line 640
    .line 641
    const/4 v6, 0x6

    .line 642
    goto/16 :goto_e

    .line 643
    .line 644
    :cond_29
    instance-of v6, v6, Ljava/net/SocketTimeoutException;

    .line 645
    .line 646
    if-eqz v6, :cond_2a

    .line 647
    .line 648
    move/from16 v6, v16

    .line 649
    .line 650
    goto/16 :goto_e

    .line 651
    .line 652
    :cond_2a
    if-eqz v8, :cond_2b

    .line 653
    .line 654
    check-cast v7, Lkn3;

    .line 655
    .line 656
    iget v6, v7, Lkn3;->g:I

    .line 657
    .line 658
    if-ne v6, v12, :cond_2b

    .line 659
    .line 660
    const/4 v6, 0x4

    .line 661
    goto/16 :goto_e

    .line 662
    .line 663
    :cond_2b
    const/16 v6, 0x8

    .line 664
    .line 665
    goto/16 :goto_e

    .line 666
    .line 667
    :cond_2c
    if-eqz v14, :cond_2d

    .line 668
    .line 669
    const/16 v6, 0x23

    .line 670
    .line 671
    if-eqz v8, :cond_1b

    .line 672
    .line 673
    if-ne v8, v12, :cond_2d

    .line 674
    .line 675
    goto/16 :goto_e

    .line 676
    .line 677
    :cond_2d
    if-eqz v14, :cond_2e

    .line 678
    .line 679
    if-ne v8, v11, :cond_2e

    .line 680
    .line 681
    const/16 v6, 0xf

    .line 682
    .line 683
    goto/16 :goto_e

    .line 684
    .line 685
    :cond_2e
    if-eqz v14, :cond_2f

    .line 686
    .line 687
    if-ne v8, v9, :cond_2f

    .line 688
    .line 689
    goto :goto_11

    .line 690
    :cond_2f
    instance-of v6, v7, Lig4;

    .line 691
    .line 692
    if-eqz v6, :cond_30

    .line 693
    .line 694
    check-cast v7, Lig4;

    .line 695
    .line 696
    iget-object v6, v7, Lig4;->h:Ljava/lang/String;

    .line 697
    .line 698
    invoke-static {v6}, Lv23;->i(Ljava/lang/String;)I

    .line 699
    .line 700
    .line 701
    move-result v6

    .line 702
    move v7, v6

    .line 703
    const/16 v6, 0xd

    .line 704
    .line 705
    goto :goto_15

    .line 706
    :cond_30
    instance-of v6, v7, Lag4;

    .line 707
    .line 708
    const/16 v8, 0xe

    .line 709
    .line 710
    if-eqz v6, :cond_31

    .line 711
    .line 712
    check-cast v7, Lag4;

    .line 713
    .line 714
    iget v6, v7, Lag4;->f:I

    .line 715
    .line 716
    move v7, v6

    .line 717
    move v6, v8

    .line 718
    goto :goto_15

    .line 719
    :cond_31
    instance-of v6, v7, Ljava/lang/OutOfMemoryError;

    .line 720
    .line 721
    if-eqz v6, :cond_32

    .line 722
    .line 723
    goto :goto_12

    .line 724
    :cond_32
    instance-of v6, v7, Lne4;

    .line 725
    .line 726
    if-eqz v6, :cond_33

    .line 727
    .line 728
    check-cast v7, Lne4;

    .line 729
    .line 730
    iget v6, v7, Lne4;->f:I

    .line 731
    .line 732
    const/16 v7, 0x11

    .line 733
    .line 734
    :goto_14
    move/from16 v22, v7

    .line 735
    .line 736
    move v7, v6

    .line 737
    move/from16 v6, v22

    .line 738
    .line 739
    goto :goto_15

    .line 740
    :cond_33
    instance-of v6, v7, Loe4;

    .line 741
    .line 742
    if-eqz v6, :cond_34

    .line 743
    .line 744
    check-cast v7, Loe4;

    .line 745
    .line 746
    iget v6, v7, Loe4;->f:I

    .line 747
    .line 748
    const/16 v7, 0x12

    .line 749
    .line 750
    goto :goto_14

    .line 751
    :cond_34
    instance-of v6, v7, Landroid/media/MediaCodec$CryptoException;

    .line 752
    .line 753
    if-eqz v6, :cond_35

    .line 754
    .line 755
    check-cast v7, Landroid/media/MediaCodec$CryptoException;

    .line 756
    .line 757
    invoke-virtual {v7}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 758
    .line 759
    .line 760
    move-result v6

    .line 761
    invoke-static {v6}, Lv23;->e(I)I

    .line 762
    .line 763
    .line 764
    move-result v7

    .line 765
    packed-switch v7, :pswitch_data_1

    .line 766
    .line 767
    .line 768
    goto/16 :goto_f

    .line 769
    .line 770
    :cond_35
    const/16 v6, 0x16

    .line 771
    .line 772
    goto/16 :goto_e

    .line 773
    .line 774
    :goto_15
    invoke-static {}, Lqd4;->i()Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 775
    .line 776
    .line 777
    move-result-object v8

    .line 778
    iget-wide v13, v1, Lrd4;->j:J

    .line 779
    .line 780
    sub-long v13, v3, v13

    .line 781
    .line 782
    invoke-static {v8, v13, v14}, Lpd4;->c(Landroid/media/metrics/PlaybackErrorEvent$Builder;J)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 783
    .line 784
    .line 785
    move-result-object v8

    .line 786
    invoke-static {v8, v6}, Lpd4;->b(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 787
    .line 788
    .line 789
    move-result-object v6

    .line 790
    invoke-static {v6, v7}, Lqd4;->j(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 791
    .line 792
    .line 793
    move-result-object v6

    .line 794
    invoke-static {v6, v2}, Lqd4;->k(Landroid/media/metrics/PlaybackErrorEvent$Builder;Ljava/lang/Exception;)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 795
    .line 796
    .line 797
    move-result-object v2

    .line 798
    invoke-static {v2}, Lqd4;->l(Landroid/media/metrics/PlaybackErrorEvent$Builder;)Landroid/media/metrics/PlaybackErrorEvent;

    .line 799
    .line 800
    .line 801
    move-result-object v2

    .line 802
    iget-object v6, v1, Lrd4;->g:Ljava/util/concurrent/Executor;

    .line 803
    .line 804
    new-instance v7, Lsz2;

    .line 805
    .line 806
    invoke-direct {v7, v1, v2, v15}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 807
    .line 808
    .line 809
    invoke-interface {v6, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 810
    .line 811
    .line 812
    iput-boolean v12, v1, Lrd4;->E:Z

    .line 813
    .line 814
    iput-object v5, v1, Lrd4;->s:Lb84;

    .line 815
    .line 816
    :goto_16
    invoke-virtual {v0, v9}, Lmr2;->A(I)Z

    .line 817
    .line 818
    .line 819
    move-result v2

    .line 820
    if-eqz v2, :cond_36

    .line 821
    .line 822
    invoke-virtual/range {p1 .. p1}, Lf74;->J1()Lo42;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    invoke-virtual {v2, v9}, Lo42;->a(I)Z

    .line 827
    .line 828
    .line 829
    move-result v6

    .line 830
    invoke-virtual {v2, v12}, Lo42;->a(I)Z

    .line 831
    .line 832
    .line 833
    move-result v7

    .line 834
    invoke-virtual {v2, v11}, Lo42;->a(I)Z

    .line 835
    .line 836
    .line 837
    move-result v2

    .line 838
    if-nez v6, :cond_37

    .line 839
    .line 840
    if-nez v7, :cond_37

    .line 841
    .line 842
    if-eqz v2, :cond_36

    .line 843
    .line 844
    move v8, v12

    .line 845
    goto :goto_17

    .line 846
    :cond_36
    move-object v7, v5

    .line 847
    const/4 v10, 0x4

    .line 848
    goto :goto_1f

    .line 849
    :cond_37
    move v8, v2

    .line 850
    :goto_17
    if-nez v6, :cond_3a

    .line 851
    .line 852
    iget-object v2, v1, Lrd4;->w:Lph4;

    .line 853
    .line 854
    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    move-result v2

    .line 858
    if-eqz v2, :cond_38

    .line 859
    .line 860
    goto :goto_19

    .line 861
    :cond_38
    iget-object v2, v1, Lrd4;->w:Lph4;

    .line 862
    .line 863
    if-nez v2, :cond_39

    .line 864
    .line 865
    move v6, v12

    .line 866
    goto :goto_18

    .line 867
    :cond_39
    const/4 v6, 0x0

    .line 868
    :goto_18
    iput-object v5, v1, Lrd4;->w:Lph4;

    .line 869
    .line 870
    const/4 v2, 0x1

    .line 871
    const/4 v10, 0x4

    .line 872
    invoke-virtual/range {v1 .. v6}, Lrd4;->c(IJLph4;I)V

    .line 873
    .line 874
    .line 875
    goto :goto_1a

    .line 876
    :cond_3a
    :goto_19
    const/4 v10, 0x4

    .line 877
    :goto_1a
    if-nez v7, :cond_3d

    .line 878
    .line 879
    iget-object v2, v1, Lrd4;->x:Lph4;

    .line 880
    .line 881
    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 882
    .line 883
    .line 884
    move-result v2

    .line 885
    if-eqz v2, :cond_3b

    .line 886
    .line 887
    goto :goto_1c

    .line 888
    :cond_3b
    iget-object v2, v1, Lrd4;->x:Lph4;

    .line 889
    .line 890
    if-nez v2, :cond_3c

    .line 891
    .line 892
    move v6, v12

    .line 893
    goto :goto_1b

    .line 894
    :cond_3c
    const/4 v6, 0x0

    .line 895
    :goto_1b
    iput-object v5, v1, Lrd4;->x:Lph4;

    .line 896
    .line 897
    const/4 v2, 0x0

    .line 898
    invoke-virtual/range {v1 .. v6}, Lrd4;->c(IJLph4;I)V

    .line 899
    .line 900
    .line 901
    :cond_3d
    :goto_1c
    if-nez v8, :cond_40

    .line 902
    .line 903
    iget-object v2, v1, Lrd4;->y:Lph4;

    .line 904
    .line 905
    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 906
    .line 907
    .line 908
    move-result v2

    .line 909
    if-eqz v2, :cond_3e

    .line 910
    .line 911
    goto :goto_1e

    .line 912
    :cond_3e
    iget-object v2, v1, Lrd4;->y:Lph4;

    .line 913
    .line 914
    if-nez v2, :cond_3f

    .line 915
    .line 916
    move v6, v12

    .line 917
    goto :goto_1d

    .line 918
    :cond_3f
    const/4 v6, 0x0

    .line 919
    :goto_1d
    iput-object v5, v1, Lrd4;->y:Lph4;

    .line 920
    .line 921
    const/4 v2, 0x2

    .line 922
    invoke-virtual/range {v1 .. v6}, Lrd4;->c(IJLph4;I)V

    .line 923
    .line 924
    .line 925
    :cond_40
    :goto_1e
    move-object v7, v5

    .line 926
    :goto_1f
    iget-object v2, v1, Lrd4;->t:Llv2;

    .line 927
    .line 928
    invoke-virtual {v1, v2}, Lrd4;->r(Llv2;)Z

    .line 929
    .line 930
    .line 931
    move-result v2

    .line 932
    if-eqz v2, :cond_43

    .line 933
    .line 934
    iget-object v2, v1, Lrd4;->t:Llv2;

    .line 935
    .line 936
    iget-object v2, v2, Llv2;->g:Ljava/lang/Object;

    .line 937
    .line 938
    move-object v5, v2

    .line 939
    check-cast v5, Lph4;

    .line 940
    .line 941
    iget v2, v5, Lph4;->u:I

    .line 942
    .line 943
    const/4 v6, -0x1

    .line 944
    if-eq v2, v6, :cond_43

    .line 945
    .line 946
    iget-object v2, v1, Lrd4;->w:Lph4;

    .line 947
    .line 948
    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 949
    .line 950
    .line 951
    move-result v2

    .line 952
    if-eqz v2, :cond_41

    .line 953
    .line 954
    goto :goto_21

    .line 955
    :cond_41
    iget-object v2, v1, Lrd4;->w:Lph4;

    .line 956
    .line 957
    if-nez v2, :cond_42

    .line 958
    .line 959
    move v6, v12

    .line 960
    goto :goto_20

    .line 961
    :cond_42
    const/4 v6, 0x0

    .line 962
    :goto_20
    iput-object v5, v1, Lrd4;->w:Lph4;

    .line 963
    .line 964
    const/4 v2, 0x1

    .line 965
    invoke-virtual/range {v1 .. v6}, Lrd4;->c(IJLph4;I)V

    .line 966
    .line 967
    .line 968
    :goto_21
    iput-object v7, v1, Lrd4;->t:Llv2;

    .line 969
    .line 970
    :cond_43
    iget-object v2, v1, Lrd4;->u:Llv2;

    .line 971
    .line 972
    invoke-virtual {v1, v2}, Lrd4;->r(Llv2;)Z

    .line 973
    .line 974
    .line 975
    move-result v2

    .line 976
    if-eqz v2, :cond_46

    .line 977
    .line 978
    iget-object v2, v1, Lrd4;->u:Llv2;

    .line 979
    .line 980
    iget-object v2, v2, Llv2;->g:Ljava/lang/Object;

    .line 981
    .line 982
    move-object v5, v2

    .line 983
    check-cast v5, Lph4;

    .line 984
    .line 985
    iget-object v2, v1, Lrd4;->x:Lph4;

    .line 986
    .line 987
    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 988
    .line 989
    .line 990
    move-result v2

    .line 991
    if-eqz v2, :cond_44

    .line 992
    .line 993
    goto :goto_23

    .line 994
    :cond_44
    iget-object v2, v1, Lrd4;->x:Lph4;

    .line 995
    .line 996
    if-nez v2, :cond_45

    .line 997
    .line 998
    move v6, v12

    .line 999
    goto :goto_22

    .line 1000
    :cond_45
    const/4 v6, 0x0

    .line 1001
    :goto_22
    iput-object v5, v1, Lrd4;->x:Lph4;

    .line 1002
    .line 1003
    const/4 v2, 0x0

    .line 1004
    invoke-virtual/range {v1 .. v6}, Lrd4;->c(IJLph4;I)V

    .line 1005
    .line 1006
    .line 1007
    :goto_23
    iput-object v7, v1, Lrd4;->u:Llv2;

    .line 1008
    .line 1009
    :cond_46
    iget-object v2, v1, Lrd4;->v:Llv2;

    .line 1010
    .line 1011
    invoke-virtual {v1, v2}, Lrd4;->r(Llv2;)Z

    .line 1012
    .line 1013
    .line 1014
    move-result v2

    .line 1015
    if-eqz v2, :cond_49

    .line 1016
    .line 1017
    iget-object v2, v1, Lrd4;->v:Llv2;

    .line 1018
    .line 1019
    iget-object v2, v2, Llv2;->g:Ljava/lang/Object;

    .line 1020
    .line 1021
    move-object v5, v2

    .line 1022
    check-cast v5, Lph4;

    .line 1023
    .line 1024
    iget-object v2, v1, Lrd4;->y:Lph4;

    .line 1025
    .line 1026
    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1027
    .line 1028
    .line 1029
    move-result v2

    .line 1030
    if-eqz v2, :cond_47

    .line 1031
    .line 1032
    goto :goto_25

    .line 1033
    :cond_47
    iget-object v2, v1, Lrd4;->y:Lph4;

    .line 1034
    .line 1035
    if-nez v2, :cond_48

    .line 1036
    .line 1037
    move v6, v12

    .line 1038
    goto :goto_24

    .line 1039
    :cond_48
    const/4 v6, 0x0

    .line 1040
    :goto_24
    iput-object v5, v1, Lrd4;->y:Lph4;

    .line 1041
    .line 1042
    const/4 v2, 0x2

    .line 1043
    invoke-virtual/range {v1 .. v6}, Lrd4;->c(IJLph4;I)V

    .line 1044
    .line 1045
    .line 1046
    :goto_25
    iput-object v7, v1, Lrd4;->v:Llv2;

    .line 1047
    .line 1048
    :cond_49
    iget-object v2, v1, Lrd4;->f:Landroid/content/Context;

    .line 1049
    .line 1050
    invoke-static {v2}, Lvy2;->a(Landroid/content/Context;)Lvy2;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v2

    .line 1054
    invoke-virtual {v2}, Lvy2;->b()I

    .line 1055
    .line 1056
    .line 1057
    move-result v2

    .line 1058
    packed-switch v2, :pswitch_data_2

    .line 1059
    .line 1060
    .line 1061
    :pswitch_4
    move v15, v12

    .line 1062
    goto :goto_26

    .line 1063
    :pswitch_5
    move/from16 v15, v16

    .line 1064
    .line 1065
    goto :goto_26

    .line 1066
    :pswitch_6
    const/16 v15, 0x8

    .line 1067
    .line 1068
    goto :goto_26

    .line 1069
    :pswitch_7
    move v15, v11

    .line 1070
    goto :goto_26

    .line 1071
    :pswitch_8
    const/4 v15, 0x6

    .line 1072
    goto :goto_26

    .line 1073
    :pswitch_9
    move/from16 v15, v17

    .line 1074
    .line 1075
    goto :goto_26

    .line 1076
    :pswitch_a
    move v15, v10

    .line 1077
    goto :goto_26

    .line 1078
    :pswitch_b
    move v15, v9

    .line 1079
    goto :goto_26

    .line 1080
    :pswitch_c
    move/from16 v15, v18

    .line 1081
    .line 1082
    goto :goto_26

    .line 1083
    :pswitch_d
    const/4 v15, 0x0

    .line 1084
    :goto_26
    iget v2, v1, Lrd4;->r:I

    .line 1085
    .line 1086
    if-eq v15, v2, :cond_4a

    .line 1087
    .line 1088
    iput v15, v1, Lrd4;->r:I

    .line 1089
    .line 1090
    invoke-static {}, Lqd4;->e()Landroid/media/metrics/NetworkEvent$Builder;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v2

    .line 1094
    invoke-static {v2, v15}, Lqd4;->f(Landroid/media/metrics/NetworkEvent$Builder;I)Landroid/media/metrics/NetworkEvent$Builder;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v2

    .line 1098
    iget-wide v5, v1, Lrd4;->j:J

    .line 1099
    .line 1100
    sub-long v5, v3, v5

    .line 1101
    .line 1102
    invoke-static {v2, v5, v6}, Lqd4;->g(Landroid/media/metrics/NetworkEvent$Builder;J)Landroid/media/metrics/NetworkEvent$Builder;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v2

    .line 1106
    invoke-static {v2}, Lqd4;->h(Landroid/media/metrics/NetworkEvent$Builder;)Landroid/media/metrics/NetworkEvent;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    iget-object v5, v1, Lrd4;->g:Ljava/util/concurrent/Executor;

    .line 1111
    .line 1112
    new-instance v6, Lsz2;

    .line 1113
    .line 1114
    const/16 v8, 0x18

    .line 1115
    .line 1116
    invoke-direct {v6, v1, v2, v8}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1117
    .line 1118
    .line 1119
    invoke-interface {v5, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1120
    .line 1121
    .line 1122
    :cond_4a
    invoke-virtual/range {p1 .. p1}, Lf74;->C1()I

    .line 1123
    .line 1124
    .line 1125
    move-result v2

    .line 1126
    if-eq v2, v9, :cond_4b

    .line 1127
    .line 1128
    const/4 v2, 0x0

    .line 1129
    iput-boolean v2, v1, Lrd4;->z:Z

    .line 1130
    .line 1131
    :cond_4b
    move-object/from16 v2, p1

    .line 1132
    .line 1133
    check-cast v2, Lmc4;

    .line 1134
    .line 1135
    iget-object v5, v2, Lmc4;->j:Lhp2;

    .line 1136
    .line 1137
    invoke-virtual {v5}, Lhp2;->b()V

    .line 1138
    .line 1139
    .line 1140
    iget-object v2, v2, Lmc4;->i:Lya4;

    .line 1141
    .line 1142
    invoke-virtual {v2}, Lya4;->j2()V

    .line 1143
    .line 1144
    .line 1145
    iget-object v2, v2, Lya4;->c0:Ldc4;

    .line 1146
    .line 1147
    iget-object v2, v2, Ldc4;->f:Lb84;

    .line 1148
    .line 1149
    const/16 v5, 0xa

    .line 1150
    .line 1151
    if-nez v2, :cond_4c

    .line 1152
    .line 1153
    const/4 v2, 0x0

    .line 1154
    iput-boolean v2, v1, Lrd4;->A:Z

    .line 1155
    .line 1156
    goto :goto_27

    .line 1157
    :cond_4c
    invoke-virtual {v0, v5}, Lmr2;->A(I)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v2

    .line 1161
    if-eqz v2, :cond_4d

    .line 1162
    .line 1163
    iput-boolean v12, v1, Lrd4;->A:Z

    .line 1164
    .line 1165
    :cond_4d
    :goto_27
    invoke-virtual/range {p1 .. p1}, Lf74;->C1()I

    .line 1166
    .line 1167
    .line 1168
    move-result v2

    .line 1169
    iget-boolean v6, v1, Lrd4;->z:Z

    .line 1170
    .line 1171
    if-eqz v6, :cond_4e

    .line 1172
    .line 1173
    move/from16 v8, v17

    .line 1174
    .line 1175
    goto :goto_28

    .line 1176
    :cond_4e
    iget-boolean v6, v1, Lrd4;->A:Z

    .line 1177
    .line 1178
    if-eqz v6, :cond_4f

    .line 1179
    .line 1180
    const/16 v8, 0xd

    .line 1181
    .line 1182
    goto :goto_28

    .line 1183
    :cond_4f
    if-ne v2, v10, :cond_50

    .line 1184
    .line 1185
    const/16 v8, 0xb

    .line 1186
    .line 1187
    goto :goto_28

    .line 1188
    :cond_50
    const/16 v8, 0xc

    .line 1189
    .line 1190
    if-ne v2, v9, :cond_55

    .line 1191
    .line 1192
    iget v2, v1, Lrd4;->q:I

    .line 1193
    .line 1194
    if-eqz v2, :cond_51

    .line 1195
    .line 1196
    if-eq v2, v9, :cond_51

    .line 1197
    .line 1198
    if-ne v2, v8, :cond_52

    .line 1199
    .line 1200
    :cond_51
    move v8, v9

    .line 1201
    goto :goto_28

    .line 1202
    :cond_52
    invoke-virtual/range {p1 .. p1}, Lf74;->H1()Z

    .line 1203
    .line 1204
    .line 1205
    move-result v2

    .line 1206
    if-nez v2, :cond_53

    .line 1207
    .line 1208
    move/from16 v8, v16

    .line 1209
    .line 1210
    goto :goto_28

    .line 1211
    :cond_53
    invoke-virtual/range {p1 .. p1}, Lf74;->D1()I

    .line 1212
    .line 1213
    .line 1214
    move-result v2

    .line 1215
    if-eqz v2, :cond_54

    .line 1216
    .line 1217
    move v8, v5

    .line 1218
    goto :goto_28

    .line 1219
    :cond_54
    const/4 v8, 0x6

    .line 1220
    goto :goto_28

    .line 1221
    :cond_55
    if-ne v2, v11, :cond_58

    .line 1222
    .line 1223
    invoke-virtual/range {p1 .. p1}, Lf74;->H1()Z

    .line 1224
    .line 1225
    .line 1226
    move-result v2

    .line 1227
    if-nez v2, :cond_56

    .line 1228
    .line 1229
    move v8, v10

    .line 1230
    goto :goto_28

    .line 1231
    :cond_56
    invoke-virtual/range {p1 .. p1}, Lf74;->D1()I

    .line 1232
    .line 1233
    .line 1234
    move-result v2

    .line 1235
    if-eqz v2, :cond_57

    .line 1236
    .line 1237
    move/from16 v8, v18

    .line 1238
    .line 1239
    goto :goto_28

    .line 1240
    :cond_57
    move v8, v11

    .line 1241
    goto :goto_28

    .line 1242
    :cond_58
    if-ne v2, v12, :cond_59

    .line 1243
    .line 1244
    iget v2, v1, Lrd4;->q:I

    .line 1245
    .line 1246
    if-eqz v2, :cond_59

    .line 1247
    .line 1248
    goto :goto_28

    .line 1249
    :cond_59
    iget v8, v1, Lrd4;->q:I

    .line 1250
    .line 1251
    :goto_28
    iget v2, v1, Lrd4;->q:I

    .line 1252
    .line 1253
    if-eq v2, v8, :cond_5a

    .line 1254
    .line 1255
    iput v8, v1, Lrd4;->q:I

    .line 1256
    .line 1257
    iput-boolean v12, v1, Lrd4;->E:Z

    .line 1258
    .line 1259
    invoke-static {}, Lqd4;->o()Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v2

    .line 1263
    iget v5, v1, Lrd4;->q:I

    .line 1264
    .line 1265
    invoke-static {v2, v5}, Llb;->j(Landroid/media/metrics/PlaybackStateEvent$Builder;I)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v2

    .line 1269
    iget-wide v5, v1, Lrd4;->j:J

    .line 1270
    .line 1271
    sub-long/2addr v3, v5

    .line 1272
    invoke-static {v2, v3, v4}, Lpd4;->g(Landroid/media/metrics/PlaybackStateEvent$Builder;J)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v2

    .line 1276
    invoke-static {v2}, Lpd4;->h(Landroid/media/metrics/PlaybackStateEvent$Builder;)Landroid/media/metrics/PlaybackStateEvent;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v2

    .line 1280
    iget-object v3, v1, Lrd4;->g:Ljava/util/concurrent/Executor;

    .line 1281
    .line 1282
    new-instance v4, Lsz2;

    .line 1283
    .line 1284
    const/16 v5, 0x19

    .line 1285
    .line 1286
    invoke-direct {v4, v1, v2, v5}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1287
    .line 1288
    .line 1289
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1290
    .line 1291
    .line 1292
    :cond_5a
    const/16 v2, 0x404

    .line 1293
    .line 1294
    invoke-virtual {v0, v2}, Lmr2;->A(I)Z

    .line 1295
    .line 1296
    .line 1297
    move-result v3

    .line 1298
    if-eqz v3, :cond_5f

    .line 1299
    .line 1300
    iget-object v3, v1, Lrd4;->h:Lod4;

    .line 1301
    .line 1302
    iget-object v0, v0, Lmr2;->h:Ljava/lang/Object;

    .line 1303
    .line 1304
    check-cast v0, Landroid/util/SparseArray;

    .line 1305
    .line 1306
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v0

    .line 1310
    check-cast v0, Lad4;

    .line 1311
    .line 1312
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1313
    .line 1314
    .line 1315
    monitor-enter v3

    .line 1316
    :try_start_4
    iget-object v2, v3, Lod4;->f:Ljava/lang/String;

    .line 1317
    .line 1318
    if-eqz v2, :cond_5c

    .line 1319
    .line 1320
    iget-object v4, v3, Lod4;->c:Ljava/util/HashMap;

    .line 1321
    .line 1322
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v2

    .line 1326
    check-cast v2, Lnd4;

    .line 1327
    .line 1328
    if-eqz v2, :cond_5b

    .line 1329
    .line 1330
    invoke-virtual {v3, v2}, Lod4;->d(Lnd4;)V

    .line 1331
    .line 1332
    .line 1333
    goto :goto_29

    .line 1334
    :catchall_2
    move-exception v0

    .line 1335
    goto :goto_2b

    .line 1336
    :cond_5b
    throw v7

    .line 1337
    :cond_5c
    :goto_29
    iget-object v2, v3, Lod4;->c:Ljava/util/HashMap;

    .line 1338
    .line 1339
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v2

    .line 1343
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    :cond_5d
    :goto_2a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1348
    .line 1349
    .line 1350
    move-result v4

    .line 1351
    if-eqz v4, :cond_5e

    .line 1352
    .line 1353
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v4

    .line 1357
    check-cast v4, Lnd4;

    .line 1358
    .line 1359
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 1360
    .line 1361
    .line 1362
    iget-boolean v5, v4, Lnd4;->e:Z

    .line 1363
    .line 1364
    if-eqz v5, :cond_5d

    .line 1365
    .line 1366
    iget-object v5, v3, Lod4;->d:Lrd4;

    .line 1367
    .line 1368
    if-eqz v5, :cond_5d

    .line 1369
    .line 1370
    iget-object v4, v4, Lnd4;->a:Ljava/lang/String;

    .line 1371
    .line 1372
    invoke-virtual {v5, v0, v4}, Lrd4;->q(Lad4;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1373
    .line 1374
    .line 1375
    goto :goto_2a

    .line 1376
    :cond_5e
    monitor-exit v3

    .line 1377
    return-void

    .line 1378
    :goto_2b
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1379
    throw v0

    .line 1380
    :cond_5f
    :goto_2c
    return-void

    .line 1381
    :pswitch_data_0
    .packed-switch 0x1772
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch

    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    :pswitch_data_1
    .packed-switch 0x1772
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch

    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_4
        :pswitch_7
        :pswitch_4
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method public final n(Lad4;Lhh4;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lad4;->d:Lkh4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p2, Lhh4;->b:Lph4;

    .line 7
    .line 8
    new-instance v2, Llv2;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lrd4;->h:Lod4;

    .line 14
    .line 15
    iget-object p1, p1, Lad4;->b:Loz1;

    .line 16
    .line 17
    invoke-virtual {v3, p1, v0}, Lod4;->a(Loz1;Lkh4;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    invoke-direct {v2, v1, p1, v0}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    iget p1, p2, Lhh4;->a:I

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    const/4 p2, 0x1

    .line 31
    if-eq p1, p2, :cond_2

    .line 32
    .line 33
    const/4 p2, 0x2

    .line 34
    if-eq p1, p2, :cond_3

    .line 35
    .line 36
    const/4 p2, 0x3

    .line 37
    if-eq p1, p2, :cond_1

    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    :cond_1
    iput-object v2, p0, Lrd4;->v:Llv2;

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    iput-object v2, p0, Lrd4;->u:Llv2;

    .line 44
    .line 45
    return-void

    .line 46
    :cond_3
    iput-object v2, p0, Lrd4;->t:Llv2;

    .line 47
    .line 48
    return-void
.end method

.method public final o(Ljava/io/IOException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final q(Lad4;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p1, Lad4;->d:Lkh4;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lkh4;->b()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lrd4;->o:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lrd4;->f()V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p1, p0, Lrd4;->m:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lrd4;->n:Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final r(Llv2;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lrd4;->h:Lod4;

    .line 4
    .line 5
    iget-object p1, p1, Llv2;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, v0, Lod4;->f:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
.end method
