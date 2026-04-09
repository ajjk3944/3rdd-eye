.class public final Lvc4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:I

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public e:J

.field public f:Z

.field public g:J

.field public final synthetic h:Lyc4;


# direct methods
.method public constructor <init>(Lyc4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvc4;->h:Lyc4;

    .line 5
    .line 6
    iput p2, p0, Lvc4;->a:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 14

    .line 1
    iget-object v0, p0, Lvc4;->h:Lyc4;

    .line 2
    .line 3
    iget-object v1, v0, Lyc4;->f:Lya4;

    .line 4
    .line 5
    iget-object v2, v0, Lyc4;->i:Ld13;

    .line 6
    .line 7
    invoke-virtual {v1}, Lf74;->C1()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x2

    .line 13
    if-ne v3, v4, :cond_4

    .line 14
    .line 15
    invoke-virtual {v1}, Lf74;->H1()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_4

    .line 20
    .line 21
    invoke-virtual {v1}, Lf74;->D1()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_4

    .line 26
    .line 27
    invoke-virtual {v1}, Lya4;->K1()Loz1;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Loz1;->g()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v1}, Lya4;->N1()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {v3, v4}, Loz1;->f(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    :goto_0
    invoke-virtual {v1}, Lya4;->d()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    invoke-virtual {v1}, Lya4;->T1()I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    invoke-virtual {v1}, Lya4;->Q1()J

    .line 56
    .line 57
    .line 58
    move-result-wide v8

    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    const/4 v1, -0x1

    .line 62
    if-ne v6, v1, :cond_1

    .line 63
    .line 64
    iget-object v6, v0, Lyc4;->h:Lsw1;

    .line 65
    .line 66
    invoke-virtual {v3, v4, v6}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 67
    .line 68
    .line 69
    const-wide/16 v10, 0x0

    .line 70
    .line 71
    invoke-static {v10, v11}, Lv23;->q(J)J

    .line 72
    .line 73
    .line 74
    move-result-wide v10

    .line 75
    sub-long/2addr v8, v10

    .line 76
    move v6, v1

    .line 77
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v10

    .line 81
    iget-boolean v1, p0, Lvc4;->f:Z

    .line 82
    .line 83
    iget v3, p0, Lvc4;->a:I

    .line 84
    .line 85
    if-eqz v1, :cond_3

    .line 86
    .line 87
    iget-object v1, p0, Lvc4;->b:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-static {v4, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    iget v1, p0, Lvc4;->c:I

    .line 96
    .line 97
    if-ne v6, v1, :cond_3

    .line 98
    .line 99
    iget v1, p0, Lvc4;->d:I

    .line 100
    .line 101
    if-ne v7, v1, :cond_3

    .line 102
    .line 103
    iget-wide v12, p0, Lvc4;->e:J

    .line 104
    .line 105
    cmp-long v1, v8, v12

    .line 106
    .line 107
    if-nez v1, :cond_3

    .line 108
    .line 109
    iget-wide v1, p0, Lvc4;->g:J

    .line 110
    .line 111
    sub-long/2addr v10, v1

    .line 112
    int-to-long v1, v3

    .line 113
    cmp-long v1, v10, v1

    .line 114
    .line 115
    if-ltz v1, :cond_2

    .line 116
    .line 117
    iget-object v0, v0, Lyc4;->g:Loa4;

    .line 118
    .line 119
    new-instance v1, Lzc4;

    .line 120
    .line 121
    invoke-direct {v1, v5, v3}, Lzc4;-><init>(II)V

    .line 122
    .line 123
    .line 124
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 125
    .line 126
    new-instance v2, Lb84;

    .line 127
    .line 128
    const/16 v3, 0x3eb

    .line 129
    .line 130
    invoke-direct {v2, v5, v1, v3}, Lb84;-><init>(ILjava/lang/Exception;I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v2}, Lya4;->Y1(Lb84;)V

    .line 134
    .line 135
    .line 136
    :cond_2
    return-void

    .line 137
    :cond_3
    const/4 v0, 0x1

    .line 138
    iput-boolean v0, p0, Lvc4;->f:Z

    .line 139
    .line 140
    iput-wide v10, p0, Lvc4;->g:J

    .line 141
    .line 142
    iput-object v4, p0, Lvc4;->b:Ljava/lang/Object;

    .line 143
    .line 144
    iput v6, p0, Lvc4;->c:I

    .line 145
    .line 146
    iput v7, p0, Lvc4;->d:I

    .line 147
    .line 148
    iput-wide v8, p0, Lvc4;->e:J

    .line 149
    .line 150
    invoke-virtual {v2, v5}, Ld13;->c(I)V

    .line 151
    .line 152
    .line 153
    int-to-long v0, v3

    .line 154
    iget-object v2, v2, Ld13;->a:Landroid/os/Handler;

    .line 155
    .line 156
    invoke-virtual {v2, v5, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_4
    iget-boolean v0, p0, Lvc4;->f:Z

    .line 161
    .line 162
    if-eqz v0, :cond_5

    .line 163
    .line 164
    invoke-virtual {v2, v5}, Ld13;->c(I)V

    .line 165
    .line 166
    .line 167
    :cond_5
    const/4 v0, 0x0

    .line 168
    iput-boolean v0, p0, Lvc4;->f:Z

    .line 169
    .line 170
    return-void
.end method
