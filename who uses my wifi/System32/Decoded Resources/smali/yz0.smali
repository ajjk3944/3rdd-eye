.class public final Lyz0;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:Lgg0;

.field public l:Ljava/time/Instant;

.field public m:Ljava/time/Instant;

.field public n:I

.field public o:I

.field public p:[B

.field public q:[B


# virtual methods
.method public final k(Lcm;)V
    .locals 2

    .line 1
    new-instance v0, Lgg0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lgg0;-><init>(Lcm;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lyz0;->k:Lgg0;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcm;->g()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochSecond(J)Ljava/time/Instant;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lyz0;->l:Ljava/time/Instant;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcm;->g()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochSecond(J)Ljava/time/Instant;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lyz0;->m:Ljava/time/Instant;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcm;->f()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput v0, p0, Lyz0;->n:I

    .line 33
    .line 34
    invoke-virtual {p1}, Lcm;->f()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iput v0, p0, Lyz0;->o:I

    .line 39
    .line 40
    invoke-virtual {p1}, Lcm;->f()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x0

    .line 45
    if-lez v0, :cond_0

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lcm;->c(I)[B

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lyz0;->p:[B

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iput-object v1, p0, Lyz0;->p:[B

    .line 55
    .line 56
    :goto_0
    invoke-virtual {p1}, Lcm;->f()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-lez v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lcm;->c(I)[B

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lyz0;->q:[B

    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    iput-object v1, p0, Lyz0;->q:[B

    .line 70
    .line 71
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lyz0;->k:Lgg0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Ltj0;->a()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const-string v2, "(\n\t"

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v2, p0, Lyz0;->l:Ljava/time/Instant;

    .line 28
    .line 29
    sget-object v3, Lcw;->a:Ljava/time/format/DateTimeFormatter;

    .line 30
    .line 31
    invoke-virtual {v3, v2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lyz0;->m:Ljava/time/Instant;

    .line 42
    .line 43
    invoke-virtual {v3, v2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget v2, p0, Lyz0;->n:I

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    if-eq v2, v3, :cond_5

    .line 57
    .line 58
    const/4 v3, 0x2

    .line 59
    if-eq v2, v3, :cond_4

    .line 60
    .line 61
    const/4 v3, 0x3

    .line 62
    if-eq v2, v3, :cond_3

    .line 63
    .line 64
    const/4 v3, 0x4

    .line 65
    if-eq v2, v3, :cond_2

    .line 66
    .line 67
    const/4 v3, 0x5

    .line 68
    if-eq v2, v3, :cond_1

    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    const-string v2, "DELETE"

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const-string v2, "RESOLVERASSIGNED"

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    const-string v2, "GSSAPI"

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    const-string v2, "DIFFIEHELLMAN"

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    const-string v2, "SERVERASSIGNED"

    .line 88
    .line 89
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget v2, p0, Lyz0;->o:I

    .line 96
    .line 97
    const/16 v3, 0x10

    .line 98
    .line 99
    if-ne v2, v3, :cond_6

    .line 100
    .line 101
    sget-object v2, Lpn0;->a:Lue0;

    .line 102
    .line 103
    const-string v2, "BADSIG"

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    sget-object v3, Lpn0;->a:Lue0;

    .line 107
    .line 108
    invoke-virtual {v3, v2}, Lue0;->e(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-static {}, Ltj0;->a()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_9

    .line 120
    .line 121
    const-string v1, "\n"

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    iget-object v2, p0, Lyz0;->p:[B

    .line 127
    .line 128
    const/4 v3, 0x0

    .line 129
    if-eqz v2, :cond_7

    .line 130
    .line 131
    invoke-static {v2, v3}, Lum;->i([BZ)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    :cond_7
    iget-object v1, p0, Lyz0;->q:[B

    .line 142
    .line 143
    if-eqz v1, :cond_8

    .line 144
    .line 145
    invoke-static {v1, v3}, Lum;->i([BZ)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    :cond_8
    const-string v1, " )"

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    iget-object v2, p0, Lyz0;->p:[B

    .line 162
    .line 163
    if-eqz v2, :cond_a

    .line 164
    .line 165
    invoke-static {v2}, Lum;->y([B)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    :cond_a
    iget-object v1, p0, Lyz0;->q:[B

    .line 176
    .line 177
    if-eqz v1, :cond_b

    .line 178
    .line 179
    invoke-static {v1}, Lum;->y([B)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    :cond_b
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 1

    .line 1
    iget-object p2, p0, Lyz0;->k:Lgg0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p2, p1, v0, p3}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 5
    .line 6
    .line 7
    iget-object p2, p0, Lyz0;->l:Ljava/time/Instant;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/time/Instant;->getEpochSecond()J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    invoke-virtual {p1, p2, p3}, Lt3;->o(J)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lyz0;->m:Ljava/time/Instant;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/time/Instant;->getEpochSecond()J

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    invoke-virtual {p1, p2, p3}, Lt3;->o(J)V

    .line 23
    .line 24
    .line 25
    iget p2, p0, Lyz0;->n:I

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 28
    .line 29
    .line 30
    iget p2, p0, Lyz0;->o:I

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Lyz0;->p:[B

    .line 36
    .line 37
    const/4 p3, 0x0

    .line 38
    if-eqz p2, :cond_0

    .line 39
    .line 40
    array-length p2, p2

    .line 41
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p0, Lyz0;->p:[B

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lt3;->j([B)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p1, p3}, Lt3;->m(I)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object p2, p0, Lyz0;->q:[B

    .line 54
    .line 55
    if-eqz p2, :cond_1

    .line 56
    .line 57
    array-length p2, p2

    .line 58
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 59
    .line 60
    .line 61
    iget-object p2, p0, Lyz0;->q:[B

    .line 62
    .line 63
    invoke-virtual {p1, p2}, Lt3;->j([B)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    invoke-virtual {p1, p3}, Lt3;->m(I)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
