.class public final Lpk0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lgx0;


# instance fields
.field public final f:Lec;

.field public final g:Lac;

.field public h:Lxt0;

.field public i:I

.field public j:Z

.field public k:J


# direct methods
.method public constructor <init>(Lec;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpk0;->f:Lec;

    .line 5
    .line 6
    invoke-interface {p1}, Lec;->b()Lac;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lpk0;->g:Lac;

    .line 11
    .line 12
    iget-object p1, p1, Lac;->f:Lxt0;

    .line 13
    .line 14
    iput-object p1, p0, Lpk0;->h:Lxt0;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget p1, p1, Lxt0;->b:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, -0x1

    .line 22
    :goto_0
    iput p1, p0, Lpk0;->i:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lpk0;->j:Z

    .line 3
    .line 4
    return-void
.end method

.method public final e(Lac;J)J
    .locals 10

    .line 1
    iget-boolean p2, p0, Lpk0;->j:Z

    .line 2
    .line 3
    if-nez p2, :cond_8

    .line 4
    .line 5
    iget-object p2, p0, Lpk0;->h:Lxt0;

    .line 6
    .line 7
    iget-object p3, p0, Lpk0;->g:Lac;

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    iget-object v0, p3, Lac;->f:Lxt0;

    .line 12
    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    iget p2, p0, Lpk0;->i:I

    .line 16
    .line 17
    iget v0, v0, Lxt0;->b:I

    .line 18
    .line 19
    if-ne p2, v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string p2, "Peek source is invalid because upstream source was used"

    .line 25
    .line 26
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    :goto_0
    iget-wide v0, p0, Lpk0;->k:J

    .line 31
    .line 32
    const-wide/16 v2, 0x1

    .line 33
    .line 34
    add-long/2addr v0, v2

    .line 35
    iget-object p2, p0, Lpk0;->f:Lec;

    .line 36
    .line 37
    invoke-interface {p2, v0, v1}, Lec;->d(J)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-nez p2, :cond_2

    .line 42
    .line 43
    const-wide/16 p1, -0x1

    .line 44
    .line 45
    return-wide p1

    .line 46
    :cond_2
    iget-object p2, p0, Lpk0;->h:Lxt0;

    .line 47
    .line 48
    if-nez p2, :cond_3

    .line 49
    .line 50
    iget-object p2, p3, Lac;->f:Lxt0;

    .line 51
    .line 52
    if-eqz p2, :cond_3

    .line 53
    .line 54
    iput-object p2, p0, Lpk0;->h:Lxt0;

    .line 55
    .line 56
    iget p2, p2, Lxt0;->b:I

    .line 57
    .line 58
    iput p2, p0, Lpk0;->i:I

    .line 59
    .line 60
    :cond_3
    iget-wide v0, p3, Lac;->g:J

    .line 61
    .line 62
    iget-wide v2, p0, Lpk0;->k:J

    .line 63
    .line 64
    sub-long/2addr v0, v2

    .line 65
    const-wide/16 v2, 0x2000

    .line 66
    .line 67
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 68
    .line 69
    .line 70
    move-result-wide v8

    .line 71
    iget-wide v6, p0, Lpk0;->k:J

    .line 72
    .line 73
    iget-wide v4, p3, Lac;->g:J

    .line 74
    .line 75
    invoke-static/range {v4 .. v9}, Lj41;->a(JJJ)V

    .line 76
    .line 77
    .line 78
    const-wide/16 v0, 0x0

    .line 79
    .line 80
    cmp-long p2, v8, v0

    .line 81
    .line 82
    if-nez p2, :cond_4

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_4
    iget-wide v2, p1, Lac;->g:J

    .line 86
    .line 87
    add-long/2addr v2, v8

    .line 88
    iput-wide v2, p1, Lac;->g:J

    .line 89
    .line 90
    iget-object p2, p3, Lac;->f:Lxt0;

    .line 91
    .line 92
    :goto_1
    iget p3, p2, Lxt0;->c:I

    .line 93
    .line 94
    iget v2, p2, Lxt0;->b:I

    .line 95
    .line 96
    sub-int/2addr p3, v2

    .line 97
    int-to-long v2, p3

    .line 98
    cmp-long p3, v6, v2

    .line 99
    .line 100
    if-ltz p3, :cond_5

    .line 101
    .line 102
    sub-long/2addr v6, v2

    .line 103
    iget-object p2, p2, Lxt0;->f:Lxt0;

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    move-wide v2, v8

    .line 107
    :goto_2
    cmp-long p3, v2, v0

    .line 108
    .line 109
    if-lez p3, :cond_7

    .line 110
    .line 111
    invoke-virtual {p2}, Lxt0;->c()Lxt0;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    iget v4, p3, Lxt0;->b:I

    .line 116
    .line 117
    int-to-long v4, v4

    .line 118
    add-long/2addr v4, v6

    .line 119
    long-to-int v4, v4

    .line 120
    iput v4, p3, Lxt0;->b:I

    .line 121
    .line 122
    long-to-int v5, v2

    .line 123
    add-int/2addr v4, v5

    .line 124
    iget v5, p3, Lxt0;->c:I

    .line 125
    .line 126
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    iput v4, p3, Lxt0;->c:I

    .line 131
    .line 132
    iget-object v4, p1, Lac;->f:Lxt0;

    .line 133
    .line 134
    if-nez v4, :cond_6

    .line 135
    .line 136
    iput-object p3, p3, Lxt0;->g:Lxt0;

    .line 137
    .line 138
    iput-object p3, p3, Lxt0;->f:Lxt0;

    .line 139
    .line 140
    iput-object p3, p1, Lac;->f:Lxt0;

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    iget-object v4, v4, Lxt0;->g:Lxt0;

    .line 144
    .line 145
    invoke-virtual {v4, p3}, Lxt0;->b(Lxt0;)V

    .line 146
    .line 147
    .line 148
    :goto_3
    iget v4, p3, Lxt0;->c:I

    .line 149
    .line 150
    iget p3, p3, Lxt0;->b:I

    .line 151
    .line 152
    sub-int/2addr v4, p3

    .line 153
    int-to-long v4, v4

    .line 154
    sub-long/2addr v2, v4

    .line 155
    iget-object p2, p2, Lxt0;->f:Lxt0;

    .line 156
    .line 157
    move-wide v6, v0

    .line 158
    goto :goto_2

    .line 159
    :cond_7
    :goto_4
    iget-wide p1, p0, Lpk0;->k:J

    .line 160
    .line 161
    add-long/2addr p1, v8

    .line 162
    iput-wide p1, p0, Lpk0;->k:J

    .line 163
    .line 164
    return-wide v8

    .line 165
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 166
    .line 167
    const-string p2, "closed"

    .line 168
    .line 169
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p1
.end method
