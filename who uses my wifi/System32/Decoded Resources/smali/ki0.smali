.class public final Lki0;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    sget-object v0, Lgg0;->l:Lgg0;

    .line 2
    .line 3
    const/16 v1, 0x29

    .line 4
    .line 5
    const/16 v2, 0x500

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, v2}, Ltn0;-><init>(Lgg0;II)V

    .line 8
    .line 9
    .line 10
    const-string v0, "payloadSize"

    .line 11
    .line 12
    invoke-static {v0, v2}, Ltn0;->c(Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    const-string v0, "flags"

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-static {v0, v1}, Ltn0;->c(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    int-to-long v0, v1

    .line 22
    const/16 v2, 0x18

    .line 23
    .line 24
    shl-long v2, v0, v2

    .line 25
    .line 26
    const/16 v4, 0x10

    .line 27
    .line 28
    shl-long v4, v0, v4

    .line 29
    .line 30
    add-long/2addr v2, v4

    .line 31
    add-long/2addr v2, v0

    .line 32
    iput-wide v2, p0, Ltn0;->i:J

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    invoke-super {p0, p1}, Ltn0;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Ltn0;->i:J

    .line 8
    .line 9
    check-cast p1, Lki0;

    .line 10
    .line 11
    iget-wide v2, p1, Ltn0;->i:J

    .line 12
    .line 13
    cmp-long p1, v0, v2

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ltn0;->p(Z)[B

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    array-length v2, v1

    .line 7
    move v3, v0

    .line 8
    :goto_0
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    aget-byte v4, v1, v0

    .line 11
    .line 12
    shl-int/lit8 v5, v3, 0x3

    .line 13
    .line 14
    and-int/lit16 v4, v4, 0xff

    .line 15
    .line 16
    add-int/2addr v5, v4

    .line 17
    add-int/2addr v3, v5

    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return v3
.end method

.method public final k(Lcm;)V
    .locals 8

    .line 1
    iget v0, p1, Lcm;->g:I

    .line 2
    .line 3
    iget-object v1, p1, Lcm;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-lez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v2, p0, Lki0;->k:Ljava/util/ArrayList;

    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-lez v2, :cond_a

    .line 25
    .line 26
    invoke-virtual {p1}, Lcm;->f()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget v3, p1, Lcm;->f:I

    .line 31
    .line 32
    invoke-virtual {p1}, Lcm;->f()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-lt v5, v4, :cond_9

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    sub-int/2addr v5, v3

    .line 47
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    sub-int v6, v0, v6

    .line 52
    .line 53
    const-string v7, "cannot set active region past end of input"

    .line 54
    .line 55
    if-gt v4, v6, :cond_8

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    add-int/2addr v6, v4

    .line 62
    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 63
    .line 64
    .line 65
    const/4 v4, 0x3

    .line 66
    if-eq v2, v4, :cond_6

    .line 67
    .line 68
    const/16 v4, 0xf

    .line 69
    .line 70
    if-eq v2, v4, :cond_5

    .line 71
    .line 72
    const/4 v4, 0x5

    .line 73
    if-eq v2, v4, :cond_4

    .line 74
    .line 75
    const/4 v4, 0x6

    .line 76
    if-eq v2, v4, :cond_4

    .line 77
    .line 78
    const/4 v4, 0x7

    .line 79
    if-eq v2, v4, :cond_4

    .line 80
    .line 81
    const/16 v4, 0x8

    .line 82
    .line 83
    if-eq v2, v4, :cond_3

    .line 84
    .line 85
    const/16 v4, 0xa

    .line 86
    .line 87
    if-eq v2, v4, :cond_2

    .line 88
    .line 89
    const/16 v4, 0xb

    .line 90
    .line 91
    if-eq v2, v4, :cond_1

    .line 92
    .line 93
    new-instance v4, Lop;

    .line 94
    .line 95
    invoke-direct {v4, v2}, Lop;-><init>(I)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_1
    new-instance v2, Lp01;

    .line 100
    .line 101
    invoke-direct {v2, v4}, Lcr;-><init>(I)V

    .line 102
    .line 103
    .line 104
    const/4 v4, 0x0

    .line 105
    iput-object v4, v2, Lp01;->g:Ljava/lang/Integer;

    .line 106
    .line 107
    :goto_1
    move-object v4, v2

    .line 108
    goto :goto_2

    .line 109
    :cond_2
    new-instance v2, Ltj;

    .line 110
    .line 111
    invoke-direct {v2, v4}, Lcr;-><init>(I)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    new-instance v2, Lrf;

    .line 116
    .line 117
    invoke-direct {v2, v4}, Lcr;-><init>(I)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    new-instance v4, Lop;

    .line 122
    .line 123
    const/4 v6, 0x0

    .line 124
    new-array v6, v6, [I

    .line 125
    .line 126
    invoke-direct {v4, v6, v2}, Lop;-><init>([II)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    new-instance v2, Lpt;

    .line 131
    .line 132
    invoke-direct {v2, v4}, Lcr;-><init>(I)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_6
    new-instance v2, Lcg0;

    .line 137
    .line 138
    invoke-direct {v2, v4}, Lop;-><init>(I)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :goto_2
    invoke-virtual {v4, p1}, Lcr;->a(Lcm;)V

    .line 143
    .line 144
    .line 145
    add-int/2addr v5, v3

    .line 146
    if-gt v5, v0, :cond_7

    .line 147
    .line 148
    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 149
    .line 150
    .line 151
    iget-object v2, p0, Lki0;->k:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 159
    .line 160
    invoke-direct {p1, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p1

    .line 164
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 165
    .line 166
    invoke-direct {p1, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :cond_9
    new-instance p1, Lt91;

    .line 171
    .line 172
    const-string v0, "truncated option"

    .line 173
    .line 174
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p1

    .line 178
    :cond_a
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lki0;->k:Ljava/util/ArrayList;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    :cond_0
    const-string v1, " ; payload "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget v1, p0, Ltn0;->h:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", xrcode "

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-wide v1, p0, Ltn0;->i:J

    .line 34
    .line 35
    const/16 v3, 0x18

    .line 36
    .line 37
    ushr-long/2addr v1, v3

    .line 38
    long-to-int v1, v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", version "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-wide v1, p0, Ltn0;->i:J

    .line 48
    .line 49
    const/16 v3, 0x10

    .line 50
    .line 51
    ushr-long/2addr v1, v3

    .line 52
    const-wide/16 v3, 0xff

    .line 53
    .line 54
    and-long/2addr v1, v3

    .line 55
    long-to-int v1, v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, ", flags "

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-wide v1, p0, Ltn0;->i:J

    .line 65
    .line 66
    const-wide/32 v3, 0xffff

    .line 67
    .line 68
    .line 69
    and-long/2addr v1, v3

    .line 70
    long-to-int v1, v1

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 4

    .line 1
    iget-object p2, p0, Lki0;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    const/4 v0, 0x0

    .line 11
    move v1, v0

    .line 12
    :goto_0
    if-ge v1, p3, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    check-cast v2, Lcr;

    .line 21
    .line 22
    iget v3, v2, Lcr;->f:I

    .line 23
    .line 24
    invoke-virtual {p1, v3}, Lt3;->m(I)V

    .line 25
    .line 26
    .line 27
    iget v3, p1, Lt3;->g:I

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lt3;->m(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p1}, Lcr;->c(Lt3;)V

    .line 33
    .line 34
    .line 35
    iget v2, p1, Lt3;->g:I

    .line 36
    .line 37
    sub-int/2addr v2, v3

    .line 38
    add-int/lit8 v2, v2, -0x2

    .line 39
    .line 40
    invoke-virtual {p1, v2, v3}, Lt3;->n(II)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :goto_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lgg0;->l:Lgg0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "\t\t\t\t"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget v1, p0, Ltn0;->g:I

    .line 17
    .line 18
    sget-object v2, Lk31;->a:Lbs0;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lue0;->e(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, "\t"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lki0;->l()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
.end method
