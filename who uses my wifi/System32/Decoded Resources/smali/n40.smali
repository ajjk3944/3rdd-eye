.class public abstract Ln40;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:I

.field public l:I

.field public m:I

.field public n:[B

.field public o:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Ln40;->o:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final k(Lcm;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcm;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Ln40;->k:I

    .line 6
    .line 7
    invoke-virtual {p1}, Lcm;->i()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Ln40;->l:I

    .line 12
    .line 13
    invoke-virtual {p1}, Lcm;->i()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Ln40;->m:I

    .line 18
    .line 19
    iget-object v0, p1, Lcm;->j:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-lez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Lcm;->b()[B

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Ln40;->n:[B

    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Ln40;->k:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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
    iget v2, p0, Ln40;->l:I

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget v2, p0, Ln40;->m:I

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Ln40;->n:[B

    .line 30
    .line 31
    if-eqz v2, :cond_5

    .line 32
    .line 33
    invoke-static {}, Ltj0;->a()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    const-string v1, " (\n"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Ln40;->n:[B

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-static {v1, v2}, Lum;->i([BZ)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, " ; key_tag = "

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget v1, p0, Ln40;->o:I

    .line 60
    .line 61
    if-ltz v1, :cond_0

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_0
    new-instance v1, Lt3;

    .line 65
    .line 66
    const/4 v3, 0x2

    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-direct {v1, v3, v4}, Lt3;-><init>(IB)V

    .line 69
    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-virtual {p0, v1, v3, v4}, Ln40;->m(Lt3;Ljh;Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lt3;->i()[B

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget v3, p0, Ln40;->m:I

    .line 80
    .line 81
    const v5, 0xffff

    .line 82
    .line 83
    .line 84
    if-ne v3, v2, :cond_1

    .line 85
    .line 86
    array-length v2, v1

    .line 87
    add-int/lit8 v2, v2, -0x3

    .line 88
    .line 89
    aget-byte v2, v1, v2

    .line 90
    .line 91
    and-int/lit16 v2, v2, 0xff

    .line 92
    .line 93
    array-length v3, v1

    .line 94
    add-int/lit8 v3, v3, -0x2

    .line 95
    .line 96
    aget-byte v1, v1, v3

    .line 97
    .line 98
    and-int/lit16 v1, v1, 0xff

    .line 99
    .line 100
    shl-int/lit8 v2, v2, 0x8

    .line 101
    .line 102
    add-int/2addr v2, v1

    .line 103
    goto :goto_1

    .line 104
    :cond_1
    move v3, v4

    .line 105
    :goto_0
    array-length v6, v1

    .line 106
    sub-int/2addr v6, v2

    .line 107
    if-ge v4, v6, :cond_2

    .line 108
    .line 109
    aget-byte v6, v1, v4

    .line 110
    .line 111
    and-int/lit16 v6, v6, 0xff

    .line 112
    .line 113
    add-int/lit8 v7, v4, 0x1

    .line 114
    .line 115
    aget-byte v7, v1, v7

    .line 116
    .line 117
    and-int/lit16 v7, v7, 0xff

    .line 118
    .line 119
    shl-int/lit8 v6, v6, 0x8

    .line 120
    .line 121
    add-int/2addr v6, v7

    .line 122
    add-int/2addr v3, v6

    .line 123
    add-int/lit8 v4, v4, 0x2

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    array-length v2, v1

    .line 127
    if-ge v4, v2, :cond_3

    .line 128
    .line 129
    aget-byte v1, v1, v4

    .line 130
    .line 131
    and-int/lit16 v1, v1, 0xff

    .line 132
    .line 133
    shl-int/lit8 v1, v1, 0x8

    .line 134
    .line 135
    add-int/2addr v3, v1

    .line 136
    :cond_3
    shr-int/lit8 v1, v3, 0x10

    .line 137
    .line 138
    and-int/2addr v1, v5

    .line 139
    add-int v2, v3, v1

    .line 140
    .line 141
    :goto_1
    and-int v1, v2, v5

    .line 142
    .line 143
    iput v1, p0, Ln40;->o:I

    .line 144
    .line 145
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    iget-object v1, p0, Ln40;->n:[B

    .line 153
    .line 154
    invoke-static {v1}, Lum;->y([B)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    :cond_5
    :goto_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 1

    .line 1
    iget p2, p0, Ln40;->k:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Ln40;->l:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 9
    .line 10
    .line 11
    iget p2, p0, Ln40;->m:I

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Ln40;->n:[B

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    const/4 p3, 0x0

    .line 21
    array-length v0, p2

    .line 22
    invoke-virtual {p1, p2, p3, v0}, Lt3;->k([BII)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
