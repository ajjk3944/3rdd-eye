.class public final Lgg0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final j:Li80;

.field public static final k:[B

.field public static final l:Lgg0;

.field public static final m:Lgg0;

.field public static final n:[B


# instance fields
.field public f:[B

.field public g:J

.field public transient h:I

.field public i:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-class v0, Lgg0;

    .line 2
    .line 3
    invoke-static {v0}, Lk80;->d(Ljava/lang/Class;)Li80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lgg0;->j:Li80;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    new-array v1, v0, [B

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aput-byte v2, v1, v2

    .line 14
    .line 15
    sput-object v1, Lgg0;->k:[B

    .line 16
    .line 17
    const/16 v1, 0x100

    .line 18
    .line 19
    new-array v1, v1, [B

    .line 20
    .line 21
    sput-object v1, Lgg0;->n:[B

    .line 22
    .line 23
    move v1, v2

    .line 24
    :goto_0
    sget-object v3, Lgg0;->n:[B

    .line 25
    .line 26
    array-length v4, v3

    .line 27
    if-ge v1, v4, :cond_2

    .line 28
    .line 29
    const/16 v4, 0x41

    .line 30
    .line 31
    if-lt v1, v4, :cond_1

    .line 32
    .line 33
    const/16 v4, 0x5a

    .line 34
    .line 35
    if-le v1, v4, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    add-int/lit8 v4, v1, 0x20

    .line 39
    .line 40
    int-to-byte v4, v4

    .line 41
    aput-byte v4, v3, v1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    :goto_1
    int-to-byte v4, v1

    .line 45
    aput-byte v4, v3, v1

    .line 46
    .line 47
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    new-instance v1, Lgg0;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    sput-object v1, Lgg0;->l:Lgg0;

    .line 56
    .line 57
    sget-object v3, Lgg0;->k:[B

    .line 58
    .line 59
    iput-object v3, v1, Lgg0;->f:[B

    .line 60
    .line 61
    iput v0, v1, Lgg0;->i:I

    .line 62
    .line 63
    new-instance v0, Lgg0;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    sput-object v0, Lgg0;->m:Lgg0;

    .line 69
    .line 70
    new-array v1, v2, [B

    .line 71
    .line 72
    iput-object v1, v0, Lgg0;->f:[B

    .line 73
    .line 74
    return-void
.end method

.method public constructor <init>(Lcm;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x40

    .line 2
    new-array v0, v0, [B

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-nez v2, :cond_6

    .line 3
    invoke-virtual {p1}, Lcm;->i()I

    move-result v4

    iget v5, p1, Lcm;->f:I

    iget-object v6, p1, Lcm;->j:Ljava/lang/Object;

    check-cast v6, Ljava/nio/ByteBuffer;

    and-int/lit16 v7, v4, 0xc0

    const/4 v8, 0x1

    if-eqz v7, :cond_4

    const/16 v9, 0xc0

    if-ne v7, v9, :cond_3

    .line 4
    invoke-virtual {p1}, Lcm;->i()I

    move-result v7

    and-int/lit16 v4, v4, -0xc1

    shl-int/lit8 v4, v4, 0x8

    add-int/2addr v7, v4

    .line 5
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    move-result v4

    sub-int/2addr v4, v5

    .line 6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    sget-object v10, Lgg0;->j:Li80;

    const-string v11, "currently {}, pointer to {}"

    invoke-interface {v10, v11, v4, v9}, Li80;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    move-result v4

    sub-int/2addr v4, v5

    add-int/lit8 v4, v4, -0x2

    if-ge v7, v4, :cond_2

    if-nez v3, :cond_0

    .line 8
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    move-result v3

    iput v3, p1, Lcm;->h:I

    .line 9
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    move-result v3

    iput v3, p1, Lcm;->i:I

    move v3, v8

    :cond_0
    add-int/2addr v5, v7

    .line 10
    iget v4, p1, Lcm;->g:I

    if-ge v5, v4, :cond_1

    .line 11
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 12
    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 13
    const-string v4, "current name \'{}\', seeking to {}"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v10, v4, p0, v5}, Li80;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 14
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "cannot jump past end of input"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_2
    new-instance p1, Lt91;

    const-string v0, "bad compression"

    .line 16
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 17
    throw p1

    .line 18
    :cond_3
    new-instance p1, Lt91;

    const-string v0, "bad label type"

    .line 19
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 20
    throw p1

    :cond_4
    if-nez v4, :cond_5

    .line 21
    sget-object v2, Lgg0;->k:[B

    invoke-virtual {p0, v8, v2}, Lgg0;->a(I[B)V

    move v2, v8

    goto :goto_0

    :cond_5
    int-to-byte v5, v4

    .line 22
    aput-byte v5, v0, v1

    .line 23
    invoke-virtual {p1, v4}, Lcm;->j(I)V

    .line 24
    invoke-virtual {v6, v0, v8, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 25
    invoke-virtual {p0, v8, v0}, Lgg0;->a(I[B)V

    goto/16 :goto_0

    :cond_6
    if-eqz v3, :cond_8

    .line 26
    iget-object v0, p1, Lcm;->j:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 27
    iget v1, p1, Lcm;->h:I

    if-ltz v1, :cond_7

    .line 28
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 29
    iget v1, p1, Lcm;->i:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    const/4 v0, -0x1

    .line 30
    iput v0, p1, Lcm;->h:I

    .line 31
    iput v0, p1, Lcm;->i:I

    return-void

    .line 32
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "no previous state"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    return-void
.end method

.method public constructor <init>(Lgg0;I)V
    .locals 3

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iget v0, p1, Lgg0;->i:I

    if-gt p2, v0, :cond_2

    if-ne p2, v0, :cond_0

    .line 35
    sget-object p1, Lgg0;->m:Lgg0;

    invoke-static {p1, p0}, Lgg0;->f(Lgg0;Lgg0;)V

    return-void

    :cond_0
    sub-int/2addr v0, p2

    .line 36
    iput v0, p0, Lgg0;->i:I

    .line 37
    iget-object v0, p1, Lgg0;->f:[B

    invoke-virtual {p1, p2}, Lgg0;->l(I)I

    move-result v1

    iget-object v2, p1, Lgg0;->f:[B

    array-length v2, v2

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    iput-object v0, p0, Lgg0;->f:[B

    .line 38
    invoke-virtual {p1, p2}, Lgg0;->l(I)I

    move-result v0

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0x9

    if-ge v1, v2, :cond_1

    .line 39
    iget v2, p0, Lgg0;->i:I

    if-ge v1, v2, :cond_1

    add-int v2, v1, p2

    .line 40
    invoke-virtual {p1, v2}, Lgg0;->l(I)I

    move-result v2

    sub-int/2addr v2, v0

    invoke-virtual {p0, v1, v2}, Lgg0;->n(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void

    .line 41
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "attempted to remove too many labels"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static e(Lgg0;Lgg0;)Lgg0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lgg0;->isAbsolute()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Lgg0;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lgg0;->f:[B

    .line 14
    .line 15
    iget p0, p0, Lgg0;->i:I

    .line 16
    .line 17
    invoke-virtual {v0, p0, v1}, Lgg0;->a(I[B)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p1, Lgg0;->f:[B

    .line 21
    .line 22
    iget p1, p1, Lgg0;->i:I

    .line 23
    .line 24
    invoke-virtual {v0, p1, p0}, Lgg0;->a(I[B)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public static f(Lgg0;Lgg0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgg0;->f:[B

    .line 2
    .line 3
    iput-object v0, p1, Lgg0;->f:[B

    .line 4
    .line 5
    iget-wide v0, p0, Lgg0;->g:J

    .line 6
    .line 7
    iput-wide v0, p1, Lgg0;->g:J

    .line 8
    .line 9
    iget p0, p0, Lgg0;->i:I

    .line 10
    .line 11
    iput p0, p1, Lgg0;->i:I

    .line 12
    .line 13
    return-void
.end method

.method public static h(Ljava/lang/String;)Lgg0;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0, v0}, Lgg0;->j(Ljava/lang/String;Lgg0;)Lgg0;

    .line 3
    .line 4
    .line 5
    move-result-object p0
    :try_end_0
    .catch Lf11; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    return-object p0

    .line 7
    :catch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    const-string v1, "Invalid name \'"

    .line 10
    .line 11
    const-string v2, "\'"

    .line 12
    .line 13
    invoke-static {v1, p0, v2}, Lex0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public static j(Ljava/lang/String;Lgg0;)Lgg0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "@"

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    sget-object v4, Lgg0;->m:Lgg0;

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    return-object v4

    .line 19
    :cond_1
    const-string v3, "."

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    sget-object v6, Lgg0;->l:Lgg0;

    .line 26
    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    return-object v6

    .line 30
    :cond_2
    new-instance v5, Lgg0;

    .line 31
    .line 32
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    sparse-switch v7, :sswitch_data_0

    .line 40
    .line 41
    .line 42
    :goto_0
    const/4 v2, -0x1

    .line 43
    goto :goto_1

    .line 44
    :sswitch_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_3

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    const/4 v2, 0x2

    .line 52
    goto :goto_1

    .line 53
    :sswitch_1
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_4

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    const/4 v2, 0x1

    .line 61
    goto :goto_1

    .line 62
    :sswitch_2
    const-string v2, ""

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_5

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_5
    const/4 v2, 0x0

    .line 72
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 73
    .line 74
    .line 75
    const/16 v2, 0x3f

    .line 76
    .line 77
    new-array v3, v2, [C

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    const/4 v6, 0x0

    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v11, -0x1

    .line 83
    const/4 v12, 0x0

    .line 84
    const/4 v13, 0x0

    .line 85
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    const-string v15, "bad escape"

    .line 90
    .line 91
    const/16 v8, 0xff

    .line 92
    .line 93
    const/4 v9, 0x3

    .line 94
    if-ge v4, v14, :cond_13

    .line 95
    .line 96
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 97
    .line 98
    .line 99
    move-result v14

    .line 100
    if-gt v14, v8, :cond_12

    .line 101
    .line 102
    const-string v10, "label too long"

    .line 103
    .line 104
    if-eqz v7, :cond_c

    .line 105
    .line 106
    const/16 v2, 0x30

    .line 107
    .line 108
    if-lt v14, v2, :cond_9

    .line 109
    .line 110
    const/16 v2, 0x39

    .line 111
    .line 112
    if-gt v14, v2, :cond_9

    .line 113
    .line 114
    if-ge v6, v9, :cond_9

    .line 115
    .line 116
    add-int/lit8 v6, v6, 0x1

    .line 117
    .line 118
    mul-int/lit8 v13, v13, 0xa

    .line 119
    .line 120
    add-int/lit8 v14, v14, -0x30

    .line 121
    .line 122
    add-int/2addr v13, v14

    .line 123
    if-gt v13, v8, :cond_8

    .line 124
    .line 125
    if-ge v6, v9, :cond_6

    .line 126
    .line 127
    :goto_3
    const/16 v2, 0x3f

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_6
    int-to-char v14, v13

    .line 131
    :cond_7
    :goto_4
    const/16 v2, 0x3f

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_8
    new-instance v1, Lf11;

    .line 135
    .line 136
    invoke-direct {v1, v0, v15}, Lf11;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v1

    .line 140
    :cond_9
    if-lez v6, :cond_7

    .line 141
    .line 142
    if-lt v6, v9, :cond_a

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_a
    new-instance v1, Lf11;

    .line 146
    .line 147
    invoke-direct {v1, v0, v15}, Lf11;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v1

    .line 151
    :goto_5
    if-ge v12, v2, :cond_b

    .line 152
    .line 153
    add-int/lit8 v2, v12, 0x1

    .line 154
    .line 155
    aput-char v14, v3, v12

    .line 156
    .line 157
    move v11, v12

    .line 158
    const/4 v7, 0x0

    .line 159
    move v12, v2

    .line 160
    goto :goto_3

    .line 161
    :cond_b
    new-instance v1, Lf11;

    .line 162
    .line 163
    invoke-direct {v1, v0, v10}, Lf11;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v1

    .line 167
    :cond_c
    const/16 v2, 0x5c

    .line 168
    .line 169
    if-ne v14, v2, :cond_d

    .line 170
    .line 171
    const/16 v2, 0x3f

    .line 172
    .line 173
    const/4 v6, 0x0

    .line 174
    const/4 v7, 0x1

    .line 175
    const/4 v13, 0x0

    .line 176
    goto :goto_6

    .line 177
    :cond_d
    const/16 v2, 0x2e

    .line 178
    .line 179
    if-ne v14, v2, :cond_f

    .line 180
    .line 181
    const/4 v2, -0x1

    .line 182
    if-eq v11, v2, :cond_e

    .line 183
    .line 184
    invoke-virtual {v5, v0, v3, v12}, Lgg0;->c(Ljava/lang/String;[CI)V

    .line 185
    .line 186
    .line 187
    move v11, v2

    .line 188
    const/16 v2, 0x3f

    .line 189
    .line 190
    const/4 v12, 0x0

    .line 191
    goto :goto_6

    .line 192
    :cond_e
    new-instance v1, Lf11;

    .line 193
    .line 194
    const-string v2, "invalid empty label"

    .line 195
    .line 196
    invoke-direct {v1, v0, v2}, Lf11;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v1

    .line 200
    :cond_f
    const/4 v2, -0x1

    .line 201
    if-ne v11, v2, :cond_10

    .line 202
    .line 203
    move v11, v4

    .line 204
    :cond_10
    const/16 v2, 0x3f

    .line 205
    .line 206
    if-ge v12, v2, :cond_11

    .line 207
    .line 208
    add-int/lit8 v8, v12, 0x1

    .line 209
    .line 210
    aput-char v14, v3, v12

    .line 211
    .line 212
    move v12, v8

    .line 213
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 214
    .line 215
    goto/16 :goto_2

    .line 216
    .line 217
    :cond_11
    new-instance v1, Lf11;

    .line 218
    .line 219
    invoke-direct {v1, v0, v10}, Lf11;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw v1

    .line 223
    :cond_12
    new-instance v1, Lf11;

    .line 224
    .line 225
    const-string v2, "Illegal character in name"

    .line 226
    .line 227
    invoke-direct {v1, v0, v2}, Lf11;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw v1

    .line 231
    :cond_13
    if-lez v6, :cond_14

    .line 232
    .line 233
    if-lt v6, v9, :cond_19

    .line 234
    .line 235
    :cond_14
    if-nez v7, :cond_19

    .line 236
    .line 237
    const-string v2, "Name too long"

    .line 238
    .line 239
    const/4 v4, -0x1

    .line 240
    if-ne v11, v4, :cond_15

    .line 241
    .line 242
    sget-object v3, Lgg0;->k:[B

    .line 243
    .line 244
    const/4 v4, 0x1

    .line 245
    :try_start_0
    invoke-virtual {v5, v4, v3}, Lgg0;->a(I[B)V
    :try_end_0
    .catch Lhg0; {:try_start_0 .. :try_end_0} :catch_0

    .line 246
    .line 247
    .line 248
    move/from16 v16, v4

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :catch_0
    new-instance v1, Lf11;

    .line 252
    .line 253
    invoke-direct {v1, v0, v2}, Lf11;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v1

    .line 257
    :cond_15
    invoke-virtual {v5, v0, v3, v12}, Lgg0;->c(Ljava/lang/String;[CI)V

    .line 258
    .line 259
    .line 260
    const/16 v16, 0x0

    .line 261
    .line 262
    :goto_7
    if-eqz v1, :cond_16

    .line 263
    .line 264
    if-nez v16, :cond_16

    .line 265
    .line 266
    invoke-virtual {v1}, Lgg0;->isAbsolute()Z

    .line 267
    .line 268
    .line 269
    move-result v16

    .line 270
    iget-object v3, v1, Lgg0;->f:[B

    .line 271
    .line 272
    iget v1, v1, Lgg0;->i:I

    .line 273
    .line 274
    :try_start_1
    invoke-virtual {v5, v1, v3}, Lgg0;->a(I[B)V
    :try_end_1
    .catch Lhg0; {:try_start_1 .. :try_end_1} :catch_1

    .line 275
    .line 276
    .line 277
    goto :goto_8

    .line 278
    :catch_1
    new-instance v1, Lf11;

    .line 279
    .line 280
    invoke-direct {v1, v0, v2}, Lf11;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v1

    .line 284
    :cond_16
    :goto_8
    if-nez v16, :cond_18

    .line 285
    .line 286
    invoke-virtual {v5}, Lgg0;->k()S

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    if-eq v1, v8, :cond_17

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_17
    new-instance v1, Lf11;

    .line 294
    .line 295
    invoke-direct {v1, v0, v2}, Lf11;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v1

    .line 299
    :cond_18
    :goto_9
    return-object v5

    .line 300
    :cond_19
    new-instance v1, Lf11;

    .line 301
    .line 302
    invoke-direct {v1, v0, v15}, Lf11;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw v1

    .line 306
    :pswitch_0
    if-nez v1, :cond_1a

    .line 307
    .line 308
    invoke-static {v4, v5}, Lgg0;->f(Lgg0;Lgg0;)V

    .line 309
    .line 310
    .line 311
    return-object v5

    .line 312
    :cond_1a
    invoke-static {v1, v5}, Lgg0;->f(Lgg0;Lgg0;)V

    .line 313
    .line 314
    .line 315
    return-object v5

    .line 316
    :pswitch_1
    invoke-static {v6, v5}, Lgg0;->f(Lgg0;Lgg0;)V

    .line 317
    .line 318
    .line 319
    return-object v5

    .line 320
    :pswitch_2
    new-instance v0, Lf11;

    .line 321
    .line 322
    const-string v1, "empty name"

    .line 323
    .line 324
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    throw v0

    .line 328
    nop

    .line 329
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x2e -> :sswitch_1
        0x40 -> :sswitch_0
    .end sparse-switch

    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(I[B)V
    .locals 6

    .line 1
    iget-object v0, p0, Lgg0;->f:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    array-length v0, v0

    .line 9
    :goto_0
    move v2, v1

    .line 10
    move v3, v2

    .line 11
    move v4, v3

    .line 12
    :goto_1
    if-ge v2, p1, :cond_1

    .line 13
    .line 14
    aget-byte v5, p2, v4

    .line 15
    .line 16
    add-int/lit8 v5, v5, 0x1

    .line 17
    .line 18
    add-int/2addr v4, v5

    .line 19
    add-int/2addr v3, v5

    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    add-int v2, v0, v3

    .line 24
    .line 25
    const/16 v4, 0xff

    .line 26
    .line 27
    if-gt v2, v4, :cond_4

    .line 28
    .line 29
    iget-object v4, p0, Lgg0;->f:[B

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    new-array v2, v2, [B

    .line 39
    .line 40
    :goto_2
    invoke-static {p2, v1, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Lgg0;->f:[B

    .line 44
    .line 45
    :goto_3
    if-ge v1, p1, :cond_3

    .line 46
    .line 47
    const/16 p2, 0x9

    .line 48
    .line 49
    if-ge v1, p2, :cond_3

    .line 50
    .line 51
    iget p2, p0, Lgg0;->i:I

    .line 52
    .line 53
    add-int/2addr p2, v1

    .line 54
    invoke-virtual {p0, p2, v0}, Lgg0;->n(II)V

    .line 55
    .line 56
    .line 57
    aget-byte p2, v2, v0

    .line 58
    .line 59
    add-int/lit8 p2, p2, 0x1

    .line 60
    .line 61
    add-int/2addr v0, p2

    .line 62
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    iget p2, p0, Lgg0;->i:I

    .line 66
    .line 67
    add-int/2addr p2, p1

    .line 68
    iput p2, p0, Lgg0;->i:I

    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    new-instance p1, Lhg0;

    .line 72
    .line 73
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 74
    .line 75
    .line 76
    throw p1
.end method

.method public final b([CI)V
    .locals 6

    .line 1
    iget-object v0, p0, Lgg0;->f:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    array-length v2, v0

    .line 9
    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 10
    .line 11
    add-int v4, v3, p2

    .line 12
    .line 13
    const/16 v5, 0xff

    .line 14
    .line 15
    if-gt v4, v5, :cond_3

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    new-array v0, v4, [B

    .line 25
    .line 26
    :goto_1
    int-to-byte v4, p2

    .line 27
    aput-byte v4, v0, v2

    .line 28
    .line 29
    iput-object v0, p0, Lgg0;->f:[B

    .line 30
    .line 31
    iget v0, p0, Lgg0;->i:I

    .line 32
    .line 33
    invoke-virtual {p0, v0, v2}, Lgg0;->n(II)V

    .line 34
    .line 35
    .line 36
    iget v0, p0, Lgg0;->i:I

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    iput v0, p0, Lgg0;->i:I

    .line 41
    .line 42
    :goto_2
    if-ge v1, p2, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Lgg0;->f:[B

    .line 45
    .line 46
    add-int v2, v3, v1

    .line 47
    .line 48
    aget-char v4, p1, v1

    .line 49
    .line 50
    int-to-byte v4, v4

    .line 51
    aput-byte v4, v0, v2

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    return-void

    .line 57
    :cond_3
    new-instance p1, Lhg0;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 60
    .line 61
    .line 62
    throw p1
.end method

.method public final c(Ljava/lang/String;[CI)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0, p2, p3}, Lgg0;->b([CI)V
    :try_end_0
    .catch Lhg0; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p2

    .line 6
    new-instance p3, Lf11;

    .line 7
    .line 8
    const-string v0, "\'"

    .line 9
    .line 10
    const-string v1, "\': Name too long"

    .line 11
    .line 12
    invoke-static {v0, p1, v1}, Lex0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {p3, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw p3
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lgg0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgg0;->d(Lgg0;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final d(Lgg0;)I
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget v1, p1, Lgg0;->i:I

    .line 6
    .line 7
    iget v2, p0, Lgg0;->i:I

    .line 8
    .line 9
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    move v4, v3

    .line 15
    :goto_0
    if-gt v4, v2, :cond_4

    .line 16
    .line 17
    iget v5, p0, Lgg0;->i:I

    .line 18
    .line 19
    sub-int/2addr v5, v4

    .line 20
    invoke-virtual {p0, v5}, Lgg0;->l(I)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    sub-int v6, v1, v4

    .line 25
    .line 26
    invoke-virtual {p1, v6}, Lgg0;->l(I)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    iget-object v7, p0, Lgg0;->f:[B

    .line 31
    .line 32
    aget-byte v7, v7, v5

    .line 33
    .line 34
    iget-object v8, p1, Lgg0;->f:[B

    .line 35
    .line 36
    aget-byte v8, v8, v6

    .line 37
    .line 38
    move v9, v0

    .line 39
    :goto_1
    if-ge v9, v7, :cond_2

    .line 40
    .line 41
    if-ge v9, v8, :cond_2

    .line 42
    .line 43
    iget-object v10, p0, Lgg0;->f:[B

    .line 44
    .line 45
    add-int v11, v9, v5

    .line 46
    .line 47
    add-int/2addr v11, v3

    .line 48
    aget-byte v10, v10, v11

    .line 49
    .line 50
    and-int/lit16 v10, v10, 0xff

    .line 51
    .line 52
    sget-object v11, Lgg0;->n:[B

    .line 53
    .line 54
    aget-byte v10, v11, v10

    .line 55
    .line 56
    and-int/lit16 v10, v10, 0xff

    .line 57
    .line 58
    iget-object v12, p1, Lgg0;->f:[B

    .line 59
    .line 60
    add-int v13, v9, v6

    .line 61
    .line 62
    add-int/2addr v13, v3

    .line 63
    aget-byte v12, v12, v13

    .line 64
    .line 65
    and-int/lit16 v12, v12, 0xff

    .line 66
    .line 67
    aget-byte v11, v11, v12

    .line 68
    .line 69
    and-int/lit16 v11, v11, 0xff

    .line 70
    .line 71
    sub-int/2addr v10, v11

    .line 72
    if-eqz v10, :cond_1

    .line 73
    .line 74
    return v10

    .line 75
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    if-eq v7, v8, :cond_3

    .line 79
    .line 80
    sub-int/2addr v7, v8

    .line 81
    return v7

    .line 82
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    iget p1, p0, Lgg0;->i:I

    .line 86
    .line 87
    sub-int/2addr p1, v1

    .line 88
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lgg0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v1

    .line 11
    :cond_1
    check-cast p1, Lgg0;

    .line 12
    .line 13
    iget v0, p1, Lgg0;->i:I

    .line 14
    .line 15
    iget v2, p0, Lgg0;->i:I

    .line 16
    .line 17
    if-eq v0, v2, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    invoke-virtual {p1}, Lgg0;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Lgg0;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eq v0, v2, :cond_3

    .line 29
    .line 30
    return v1

    .line 31
    :cond_3
    iget-object p1, p1, Lgg0;->f:[B

    .line 32
    .line 33
    invoke-virtual {p0, v1, p1}, Lgg0;->g(I[B)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
.end method

.method public final g(I[B)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    iget v3, p0, Lgg0;->i:I

    .line 5
    .line 6
    if-ge v1, v3, :cond_3

    .line 7
    .line 8
    iget-object v3, p0, Lgg0;->f:[B

    .line 9
    .line 10
    aget-byte v3, v3, v2

    .line 11
    .line 12
    aget-byte v4, p2, p1

    .line 13
    .line 14
    if-eq v3, v4, :cond_0

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    move v4, v0

    .line 22
    :goto_1
    if-ge v4, v3, :cond_2

    .line 23
    .line 24
    iget-object v5, p0, Lgg0;->f:[B

    .line 25
    .line 26
    add-int/lit8 v6, v2, 0x1

    .line 27
    .line 28
    aget-byte v2, v5, v2

    .line 29
    .line 30
    and-int/lit16 v2, v2, 0xff

    .line 31
    .line 32
    sget-object v5, Lgg0;->n:[B

    .line 33
    .line 34
    aget-byte v2, v5, v2

    .line 35
    .line 36
    add-int/lit8 v7, p1, 0x1

    .line 37
    .line 38
    aget-byte p1, p2, p1

    .line 39
    .line 40
    and-int/lit16 p1, p1, 0xff

    .line 41
    .line 42
    aget-byte p1, v5, p1

    .line 43
    .line 44
    if-eq v2, p1, :cond_1

    .line 45
    .line 46
    return v0

    .line 47
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    move v2, v6

    .line 50
    move p1, v7

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const/4 p1, 0x1

    .line 56
    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget v0, p0, Lgg0;->h:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Lgg0;->l(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    :goto_0
    iget-object v2, p0, Lgg0;->f:[B

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-ge v1, v3, :cond_1

    .line 15
    .line 16
    shl-int/lit8 v3, v0, 0x3

    .line 17
    .line 18
    aget-byte v2, v2, v1

    .line 19
    .line 20
    and-int/lit16 v2, v2, 0xff

    .line 21
    .line 22
    sget-object v4, Lgg0;->n:[B

    .line 23
    .line 24
    aget-byte v2, v4, v2

    .line 25
    .line 26
    and-int/lit16 v2, v2, 0xff

    .line 27
    .line 28
    add-int/2addr v3, v2

    .line 29
    add-int/2addr v0, v3

    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iput v0, p0, Lgg0;->h:I

    .line 34
    .line 35
    return v0
.end method

.method public final i(Lbm;)Lgg0;
    .locals 6

    .line 1
    iget-object v0, p1, Ltn0;->f:Lgg0;

    .line 2
    .line 3
    iget-object p1, p1, Lgw0;->k:Lgg0;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lgg0;->o(Lgg0;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    iget v1, p0, Lgg0;->i:I

    .line 14
    .line 15
    iget v2, v0, Lgg0;->i:I

    .line 16
    .line 17
    sub-int/2addr v1, v2

    .line 18
    invoke-virtual {p0}, Lgg0;->k()S

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0}, Lgg0;->k()S

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sub-int/2addr v2, v0

    .line 27
    iget v0, p1, Lgg0;->i:I

    .line 28
    .line 29
    invoke-virtual {p1}, Lgg0;->k()S

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    add-int v4, v2, v3

    .line 34
    .line 35
    const/16 v5, 0xff

    .line 36
    .line 37
    if-gt v4, v5, :cond_2

    .line 38
    .line 39
    new-instance v5, Lgg0;

    .line 40
    .line 41
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    add-int/2addr v1, v0

    .line 45
    iput v1, v5, Lgg0;->i:I

    .line 46
    .line 47
    iget-object v0, p0, Lgg0;->f:[B

    .line 48
    .line 49
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, v5, Lgg0;->f:[B

    .line 54
    .line 55
    iget-object p1, p1, Lgg0;->f:[B

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-static {p1, v4, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    move p1, v4

    .line 62
    :goto_0
    const/16 v0, 0x9

    .line 63
    .line 64
    if-ge v4, v0, :cond_1

    .line 65
    .line 66
    if-ge v4, v1, :cond_1

    .line 67
    .line 68
    invoke-virtual {v5, v4, p1}, Lgg0;->n(II)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v5, Lgg0;->f:[B

    .line 72
    .line 73
    aget-byte v0, v0, p1

    .line 74
    .line 75
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    add-int/2addr p1, v0

    .line 78
    add-int/lit8 v4, v4, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    return-object v5

    .line 82
    :cond_2
    new-instance p1, Lhg0;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 85
    .line 86
    .line 87
    throw p1
.end method

.method public final isAbsolute()Z
    .locals 4

    .line 1
    iget v0, p0, Lgg0;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v2, p0, Lgg0;->f:[B

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    sub-int/2addr v0, v3

    .line 11
    invoke-virtual {p0, v0}, Lgg0;->l(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget-byte v0, v2, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    return v3

    .line 20
    :cond_1
    return v1
.end method

.method public final k()S
    .locals 1

    .line 1
    iget v0, p0, Lgg0;->i:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget-object v0, p0, Lgg0;->f:[B

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    int-to-short v0, v0

    .line 11
    return v0
.end method

.method public final l(I)I
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    const/4 v0, 0x1

    .line 6
    if-lt p1, v0, :cond_3

    .line 7
    .line 8
    iget v1, p0, Lgg0;->i:I

    .line 9
    .line 10
    if-ge p1, v1, :cond_3

    .line 11
    .line 12
    const/16 v1, 0x9

    .line 13
    .line 14
    const/16 v2, 0x8

    .line 15
    .line 16
    if-ge p1, v1, :cond_1

    .line 17
    .line 18
    sub-int/2addr p1, v0

    .line 19
    mul-int/2addr p1, v2

    .line 20
    iget-wide v0, p0, Lgg0;->g:J

    .line 21
    .line 22
    ushr-long/2addr v0, p1

    .line 23
    long-to-int p1, v0

    .line 24
    and-int/lit16 p1, p1, 0xff

    .line 25
    .line 26
    return p1

    .line 27
    :cond_1
    iget-wide v3, p0, Lgg0;->g:J

    .line 28
    .line 29
    const/16 v1, 0x38

    .line 30
    .line 31
    ushr-long/2addr v3, v1

    .line 32
    long-to-int v1, v3

    .line 33
    and-int/lit16 v1, v1, 0xff

    .line 34
    .line 35
    :goto_0
    if-ge v2, p1, :cond_2

    .line 36
    .line 37
    iget-object v3, p0, Lgg0;->f:[B

    .line 38
    .line 39
    aget-byte v3, v3, v1

    .line 40
    .line 41
    add-int/2addr v3, v0

    .line 42
    add-int/2addr v1, v3

    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return v1

    .line 47
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string v0, "label out of range"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public final m(Lgg0;)Lgg0;
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgg0;->o(Lgg0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lgg0;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lgg0;->k()S

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p1}, Lgg0;->k()S

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    sub-int/2addr v1, v2

    .line 24
    iget v2, p0, Lgg0;->i:I

    .line 25
    .line 26
    iget p1, p1, Lgg0;->i:I

    .line 27
    .line 28
    sub-int/2addr v2, p1

    .line 29
    iput v2, v0, Lgg0;->i:I

    .line 30
    .line 31
    iget-wide v2, p0, Lgg0;->g:J

    .line 32
    .line 33
    iput-wide v2, v0, Lgg0;->g:J

    .line 34
    .line 35
    new-array p1, v1, [B

    .line 36
    .line 37
    iput-object p1, v0, Lgg0;->f:[B

    .line 38
    .line 39
    iget-object v2, p0, Lgg0;->f:[B

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {v2, v3, p1, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_1
    :goto_0
    return-object p0
.end method

.method public final n(II)V
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/16 v0, 0x9

    .line 4
    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 9
    .line 10
    mul-int/lit8 p1, p1, 0x8

    .line 11
    .line 12
    iget-wide v0, p0, Lgg0;->g:J

    .line 13
    .line 14
    const-wide/16 v2, 0xff

    .line 15
    .line 16
    shl-long/2addr v2, p1

    .line 17
    not-long v2, v2

    .line 18
    and-long/2addr v0, v2

    .line 19
    int-to-long v2, p2

    .line 20
    shl-long p1, v2, p1

    .line 21
    .line 22
    or-long/2addr p1, v0

    .line 23
    iput-wide p1, p0, Lgg0;->g:J

    .line 24
    .line 25
    :cond_1
    :goto_0
    return-void
.end method

.method public final o(Lgg0;)Z
    .locals 3

    .line 1
    iget v0, p1, Lgg0;->i:I

    .line 2
    .line 3
    iget v1, p0, Lgg0;->i:I

    .line 4
    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_1
    iget-object v2, p0, Lgg0;->f:[B

    .line 17
    .line 18
    sub-int/2addr v1, v0

    .line 19
    invoke-virtual {p0, v1}, Lgg0;->l(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1, v0, v2}, Lgg0;->g(I[B)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method

.method public final p(Z)Ljava/lang/String;
    .locals 13

    .line 1
    iget v0, p0, Lgg0;->i:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "@"

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v0, v2, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lgg0;->f:[B

    .line 13
    .line 14
    aget-byte v0, v0, v1

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string p1, "."

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    move v2, v1

    .line 27
    :goto_0
    iget v3, p0, Lgg0;->i:I

    .line 28
    .line 29
    if-ge v1, v3, :cond_b

    .line 30
    .line 31
    iget-object v3, p0, Lgg0;->f:[B

    .line 32
    .line 33
    aget-byte v3, v3, v2

    .line 34
    .line 35
    const/16 v4, 0x2e

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    if-nez p1, :cond_b

    .line 40
    .line 41
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :cond_2
    if-lez v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :cond_3
    iget-object v5, p0, Lgg0;->f:[B

    .line 52
    .line 53
    new-instance v6, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v7, v2, 0x1

    .line 59
    .line 60
    aget-byte v8, v5, v2

    .line 61
    .line 62
    move v9, v7

    .line 63
    :goto_1
    add-int v10, v7, v8

    .line 64
    .line 65
    if-ge v9, v10, :cond_a

    .line 66
    .line 67
    aget-byte v10, v5, v9

    .line 68
    .line 69
    and-int/lit16 v10, v10, 0xff

    .line 70
    .line 71
    const/16 v11, 0x20

    .line 72
    .line 73
    const/16 v12, 0x5c

    .line 74
    .line 75
    if-le v10, v11, :cond_7

    .line 76
    .line 77
    const/16 v11, 0x7f

    .line 78
    .line 79
    if-lt v10, v11, :cond_4

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    const/16 v11, 0x22

    .line 83
    .line 84
    if-eq v10, v11, :cond_6

    .line 85
    .line 86
    const/16 v11, 0x28

    .line 87
    .line 88
    if-eq v10, v11, :cond_6

    .line 89
    .line 90
    const/16 v11, 0x29

    .line 91
    .line 92
    if-eq v10, v11, :cond_6

    .line 93
    .line 94
    if-eq v10, v4, :cond_6

    .line 95
    .line 96
    const/16 v11, 0x3b

    .line 97
    .line 98
    if-eq v10, v11, :cond_6

    .line 99
    .line 100
    if-eq v10, v12, :cond_6

    .line 101
    .line 102
    const/16 v11, 0x40

    .line 103
    .line 104
    if-eq v10, v11, :cond_6

    .line 105
    .line 106
    const/16 v11, 0x24

    .line 107
    .line 108
    if-ne v10, v11, :cond_5

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    int-to-char v10, v10

    .line 112
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_6
    :goto_2
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    int-to-char v10, v10

    .line 120
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_7
    :goto_3
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const/16 v11, 0xa

    .line 128
    .line 129
    if-ge v10, v11, :cond_8

    .line 130
    .line 131
    const-string v11, "00"

    .line 132
    .line 133
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_8
    const/16 v11, 0x64

    .line 138
    .line 139
    if-ge v10, v11, :cond_9

    .line 140
    .line 141
    const/16 v11, 0x30

    .line 142
    .line 143
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    :cond_9
    :goto_4
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    :goto_5
    add-int/lit8 v9, v9, 0x1

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_a
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    add-int/lit8 v3, v3, 0x1

    .line 160
    .line 161
    add-int/2addr v2, v3

    .line 162
    add-int/lit8 v1, v1, 0x1

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_b
    :goto_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    return-object p1
.end method

.method public final q(Lt3;Ljh;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lgg0;->isAbsolute()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    iget v2, p0, Lgg0;->i:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    if-ge v1, v2, :cond_7

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    move-object v2, p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v2, Lgg0;

    .line 20
    .line 21
    invoke-direct {v2, p0, v1}, Lgg0;-><init>(Lgg0;I)V

    .line 22
    .line 23
    .line 24
    :goto_1
    const v3, 0x7fffffff

    .line 25
    .line 26
    .line 27
    const/4 v4, -0x1

    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    invoke-virtual {v2}, Lgg0;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    and-int/2addr v5, v3

    .line 35
    rem-int/lit8 v5, v5, 0x11

    .line 36
    .line 37
    iget-object v6, p2, Ljh;->a:[Lso1;

    .line 38
    .line 39
    aget-object v5, v6, v5

    .line 40
    .line 41
    :goto_2
    if-eqz v5, :cond_2

    .line 42
    .line 43
    iget-object v6, v5, Lso1;->g:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v6, Lgg0;

    .line 46
    .line 47
    invoke-virtual {v6, v2}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_1

    .line 52
    .line 53
    iget v4, v5, Lso1;->f:I

    .line 54
    .line 55
    :cond_1
    iget-object v5, v5, Lso1;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v5, Lso1;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    sget-object v5, Ljh;->b:Li80;

    .line 61
    .line 62
    const-string v6, "Looking for {}, found {}"

    .line 63
    .line 64
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-interface {v5, v6, v2, v7}, Li80;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    if-ltz v4, :cond_4

    .line 72
    .line 73
    const p2, 0xc000

    .line 74
    .line 75
    .line 76
    or-int/2addr p2, v4

    .line 77
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    if-eqz p2, :cond_6

    .line 82
    .line 83
    iget v4, p1, Lt3;->g:I

    .line 84
    .line 85
    const/16 v5, 0x3fff

    .line 86
    .line 87
    if-le v4, v5, :cond_5

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    invoke-virtual {v2}, Lgg0;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    and-int/2addr v3, v5

    .line 95
    rem-int/lit8 v3, v3, 0x11

    .line 96
    .line 97
    new-instance v5, Lso1;

    .line 98
    .line 99
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v2, v5, Lso1;->g:Ljava/lang/Object;

    .line 103
    .line 104
    iput v4, v5, Lso1;->f:I

    .line 105
    .line 106
    iget-object v6, p2, Ljh;->a:[Lso1;

    .line 107
    .line 108
    aget-object v7, v6, v3

    .line 109
    .line 110
    iput-object v7, v5, Lso1;->h:Ljava/lang/Object;

    .line 111
    .line 112
    aput-object v5, v6, v3

    .line 113
    .line 114
    sget-object v3, Ljh;->b:Li80;

    .line 115
    .line 116
    const-string v5, "Adding {} at {}"

    .line 117
    .line 118
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-interface {v3, v5, v2, v4}, Li80;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_6
    :goto_3
    invoke-virtual {p0, v1}, Lgg0;->l(I)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    iget-object v3, p0, Lgg0;->f:[B

    .line 130
    .line 131
    aget-byte v4, v3, v2

    .line 132
    .line 133
    add-int/lit8 v4, v4, 0x1

    .line 134
    .line 135
    invoke-virtual {p1, v3, v2, v4}, Lt3;->k([BII)V

    .line 136
    .line 137
    .line 138
    add-int/lit8 v1, v1, 0x1

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :cond_7
    invoke-virtual {p1, v0}, Lt3;->q(I)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 147
    .line 148
    const-string p2, "toWire() called on non-absolute name"

    .line 149
    .line 150
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p1
.end method

.method public final r(Lt3;Ljh;Z)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgg0;->s(Lt3;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lgg0;->q(Lt3;Ljh;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final s(Lt3;)V
    .locals 10

    .line 1
    iget v0, p0, Lgg0;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-array v0, v1, [B

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    iget-object v0, p0, Lgg0;->f:[B

    .line 10
    .line 11
    array-length v0, v0

    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    move v2, v1

    .line 15
    move v3, v2

    .line 16
    move v4, v3

    .line 17
    :goto_0
    iget v5, p0, Lgg0;->i:I

    .line 18
    .line 19
    if-ge v2, v5, :cond_2

    .line 20
    .line 21
    iget-object v5, p0, Lgg0;->f:[B

    .line 22
    .line 23
    aget-byte v5, v5, v3

    .line 24
    .line 25
    add-int/lit8 v6, v4, 0x1

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    aput-byte v5, v0, v4

    .line 30
    .line 31
    move v4, v6

    .line 32
    move v6, v1

    .line 33
    :goto_1
    if-ge v6, v5, :cond_1

    .line 34
    .line 35
    add-int/lit8 v7, v4, 0x1

    .line 36
    .line 37
    iget-object v8, p0, Lgg0;->f:[B

    .line 38
    .line 39
    add-int/lit8 v9, v3, 0x1

    .line 40
    .line 41
    aget-byte v3, v8, v3

    .line 42
    .line 43
    and-int/lit16 v3, v3, 0xff

    .line 44
    .line 45
    sget-object v8, Lgg0;->n:[B

    .line 46
    .line 47
    aget-byte v3, v8, v3

    .line 48
    .line 49
    aput-byte v3, v0, v4

    .line 50
    .line 51
    add-int/lit8 v6, v6, 0x1

    .line 52
    .line 53
    move v4, v7

    .line 54
    move v3, v9

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    array-length v2, v0

    .line 63
    invoke-virtual {p1, v0, v1, v2}, Lt3;->k([BII)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lgg0;->p(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method
