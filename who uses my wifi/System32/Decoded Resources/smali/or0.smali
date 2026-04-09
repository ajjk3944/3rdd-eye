.class public abstract Lor0;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:I

.field public l:I

.field public m:I

.field public n:J

.field public o:Ljava/time/Instant;

.field public p:Ljava/time/Instant;

.field public q:I

.field public r:Lgg0;

.field public s:[B


# virtual methods
.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lor0;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final k(Lcm;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcm;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lor0;->k:I

    .line 6
    .line 7
    invoke-virtual {p1}, Lcm;->i()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lor0;->l:I

    .line 12
    .line 13
    invoke-virtual {p1}, Lcm;->i()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lor0;->m:I

    .line 18
    .line 19
    invoke-virtual {p1}, Lcm;->g()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iput-wide v0, p0, Lor0;->n:J

    .line 24
    .line 25
    invoke-virtual {p1}, Lcm;->g()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochSecond(J)Ljava/time/Instant;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lor0;->o:Ljava/time/Instant;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcm;->g()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochSecond(J)Ljava/time/Instant;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lor0;->p:Ljava/time/Instant;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcm;->f()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iput v0, p0, Lor0;->q:I

    .line 50
    .line 51
    new-instance v0, Lgg0;

    .line 52
    .line 53
    invoke-direct {v0, p1}, Lgg0;-><init>(Lcm;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lor0;->r:Lgg0;

    .line 57
    .line 58
    invoke-virtual {p1}, Lcm;->b()[B

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lor0;->s:[B

    .line 63
    .line 64
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
    iget v1, p0, Lor0;->k:I

    .line 7
    .line 8
    sget-object v2, Lk31;->a:Lbs0;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Lue0;->e(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, " "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget v2, p0, Lor0;->l:I

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget v2, p0, Lor0;->m:I

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-wide v2, p0, Lor0;->n:J

    .line 39
    .line 40
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Ltj0;->a()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    const-string v2, "(\n\t"

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    :cond_0
    iget-object v2, p0, Lor0;->o:Ljava/time/Instant;

    .line 58
    .line 59
    sget-object v3, Lcw;->a:Ljava/time/format/DateTimeFormatter;

    .line 60
    .line 61
    invoke-virtual {v3, v2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v2, p0, Lor0;->p:Ljava/time/Instant;

    .line 72
    .line 73
    invoke-virtual {v3, v2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget v2, p0, Lor0;->q:I

    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object v2, p0, Lor0;->r:Lgg0;

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-static {}, Ltj0;->a()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_1

    .line 101
    .line 102
    const-string v1, "\n"

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lor0;->s:[B

    .line 108
    .line 109
    const/4 v2, 0x1

    .line 110
    invoke-static {v1, v2}, Lum;->i([BZ)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Lor0;->s:[B

    .line 122
    .line 123
    invoke-static {v1}, Lum;->y([B)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 2

    .line 1
    iget p2, p0, Lor0;->k:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lor0;->l:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 9
    .line 10
    .line 11
    iget p2, p0, Lor0;->m:I

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 14
    .line 15
    .line 16
    iget-wide v0, p0, Lor0;->n:J

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Lt3;->o(J)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lor0;->o:Ljava/time/Instant;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/time/Instant;->getEpochSecond()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-virtual {p1, v0, v1}, Lt3;->o(J)V

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, Lor0;->p:Ljava/time/Instant;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/time/Instant;->getEpochSecond()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-virtual {p1, v0, v1}, Lt3;->o(J)V

    .line 37
    .line 38
    .line 39
    iget p2, p0, Lor0;->q:I

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p0, Lor0;->r:Lgg0;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-virtual {p2, p1, v0, p3}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Lor0;->s:[B

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lt3;->j([B)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
