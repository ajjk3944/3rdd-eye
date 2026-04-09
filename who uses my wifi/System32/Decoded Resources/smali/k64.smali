.class public final Lk64;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lv64;


# static fields
.field public static final k:[I

.field public static final l:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Ls44;

.field public final f:Z

.field public final g:[I

.field public final h:I

.field public final i:I

.field public final j:Lpz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lk64;->k:[I

    .line 5
    .line 6
    invoke-static {}, Lg74;->o()Lsun/misc/Unsafe;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lk64;->l:Lsun/misc/Unsafe;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILs44;[IIILpz;Lt24;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk64;->a:[I

    .line 5
    .line 6
    iput-object p2, p0, Lk64;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, Lk64;->c:I

    .line 9
    .line 10
    iput p4, p0, Lk64;->d:I

    .line 11
    .line 12
    instance-of p1, p5, Lp54;

    .line 13
    .line 14
    iput-boolean p1, p0, Lk64;->f:Z

    .line 15
    .line 16
    iput-object p6, p0, Lk64;->g:[I

    .line 17
    .line 18
    iput p7, p0, Lk64;->h:I

    .line 19
    .line 20
    iput p8, p0, Lk64;->i:I

    .line 21
    .line 22
    iput-object p9, p0, Lk64;->j:Lpz;

    .line 23
    .line 24
    iput-object p5, p0, Lk64;->e:Ls44;

    .line 25
    .line 26
    return-void
.end method

.method public static A(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    array-length v2, v1

    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_0
    if-ge v3, v2, :cond_1

    .line 14
    .line 15
    aget-object v4, v1, v3

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    return-object v4

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    add-int/lit8 v3, v3, 0xb

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    add-int/2addr v3, v4

    .line 60
    add-int/lit8 v3, v3, 0x1d

    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    new-instance v5, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    add-int/2addr v3, v4

    .line 69
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 70
    .line 71
    .line 72
    const-string v3, "Field "

    .line 73
    .line 74
    const-string v4, " for "

    .line 75
    .line 76
    invoke-static {v5, v3, p1, v4, p0}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string p0, " not found. Known fields are "

    .line 80
    .line 81
    invoke-static {v5, p0, v1}, Lex0;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {v2, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    throw v2
.end method

.method public static l(I)I
    .locals 0

    .line 1
    ushr-int/lit8 p0, p0, 0x14

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
    .line 5
    return p0
.end method

.method public static m(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p0, Lp54;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p0, Lp54;

    .line 10
    .line 11
    invoke-virtual {p0}, Lp54;->h()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static n(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lk64;->m(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v1, "Mutating immutable message: "

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public static o(JLjava/lang/Object;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static p(JLjava/lang/Object;)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Long;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method public static final x([BIILj74;Ljava/lang/Class;Lv44;)I
    .locals 6

    .line 1
    sget-object v0, Lj74;->h:Lj74;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    packed-switch p3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    new-instance p0, Ljava/lang/RuntimeException;

    .line 11
    .line 12
    const-string p1, "unsupported field type."

    .line 13
    .line 14
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0

    .line 18
    :pswitch_1
    invoke-static {p0, p1, p5}, Lm54;->O([BILv44;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    iget-wide p1, p5, Lv44;->b:J

    .line 23
    .line 24
    invoke-static {p1, p2}, Lm0;->i(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p5, Lv44;->c:Ljava/lang/Object;

    .line 33
    .line 34
    return p0

    .line 35
    :pswitch_2
    invoke-static {p0, p1, p5}, Lm54;->C([BILv44;)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    iget p1, p5, Lv44;->a:I

    .line 40
    .line 41
    invoke-static {p1}, Lm0;->h(I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p5, Lv44;->c:Ljava/lang/Object;

    .line 50
    .line 51
    return p0

    .line 52
    :pswitch_3
    invoke-static {p0, p1, p5}, Lm54;->a0([BILv44;)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :pswitch_4
    sget-object p3, Lp64;->c:Lp64;

    .line 58
    .line 59
    invoke-virtual {p3, p4}, Lp64;->a(Ljava/lang/Class;)Lv64;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Lv64;->a()Lp54;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-object v2, p0

    .line 68
    move v3, p1

    .line 69
    move v4, p2

    .line 70
    move-object v5, p5

    .line 71
    invoke-static/range {v0 .. v5}, Lm54;->b0(Ljava/lang/Object;Lv64;[BIILv44;)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    invoke-interface {v1, v0}, Lv64;->h(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, v5, Lv44;->c:Ljava/lang/Object;

    .line 79
    .line 80
    return p0

    .line 81
    :pswitch_5
    move-object v2, p0

    .line 82
    move v3, p1

    .line 83
    move-object v5, p5

    .line 84
    invoke-static {v2, v3, v5}, Lm54;->Y([BILv44;)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    return p0

    .line 89
    :pswitch_6
    move-object v2, p0

    .line 90
    move v3, p1

    .line 91
    move-object v5, p5

    .line 92
    invoke-static {v2, v3, v5}, Lm54;->O([BILv44;)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    iget-wide p1, v5, Lv44;->b:J

    .line 97
    .line 98
    const-wide/16 p3, 0x0

    .line 99
    .line 100
    cmp-long p1, p1, p3

    .line 101
    .line 102
    if-eqz p1, :cond_0

    .line 103
    .line 104
    const/4 p1, 0x1

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    const/4 p1, 0x0

    .line 107
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, v5, Lv44;->c:Ljava/lang/Object;

    .line 112
    .line 113
    return p0

    .line 114
    :pswitch_7
    move-object v2, p0

    .line 115
    move v3, p1

    .line 116
    move-object v5, p5

    .line 117
    add-int/lit8 p1, v3, 0x4

    .line 118
    .line 119
    invoke-static {v3, v2}, Lm54;->Q(I[B)I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    iput-object p0, v5, Lv44;->c:Ljava/lang/Object;

    .line 128
    .line 129
    return p1

    .line 130
    :pswitch_8
    move-object v2, p0

    .line 131
    move v3, p1

    .line 132
    move-object v5, p5

    .line 133
    add-int/lit8 p1, v3, 0x8

    .line 134
    .line 135
    invoke-static {v3, v2}, Lm54;->W(I[B)J

    .line 136
    .line 137
    .line 138
    move-result-wide p2

    .line 139
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    iput-object p0, v5, Lv44;->c:Ljava/lang/Object;

    .line 144
    .line 145
    return p1

    .line 146
    :pswitch_9
    move-object v2, p0

    .line 147
    move v3, p1

    .line 148
    move-object v5, p5

    .line 149
    invoke-static {v2, v3, v5}, Lm54;->C([BILv44;)I

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    iget p1, v5, Lv44;->a:I

    .line 154
    .line 155
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iput-object p1, v5, Lv44;->c:Ljava/lang/Object;

    .line 160
    .line 161
    return p0

    .line 162
    :pswitch_a
    move-object v2, p0

    .line 163
    move v3, p1

    .line 164
    move-object v5, p5

    .line 165
    invoke-static {v2, v3, v5}, Lm54;->O([BILv44;)I

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    iget-wide p1, v5, Lv44;->b:J

    .line 170
    .line 171
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    iput-object p1, v5, Lv44;->c:Ljava/lang/Object;

    .line 176
    .line 177
    return p0

    .line 178
    :pswitch_b
    move-object v2, p0

    .line 179
    move v3, p1

    .line 180
    move-object v5, p5

    .line 181
    add-int/lit8 p1, v3, 0x4

    .line 182
    .line 183
    invoke-static {v3, v2}, Lm54;->Q(I[B)I

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 188
    .line 189
    .line 190
    move-result p0

    .line 191
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    iput-object p0, v5, Lv44;->c:Ljava/lang/Object;

    .line 196
    .line 197
    return p1

    .line 198
    :pswitch_c
    move-object v2, p0

    .line 199
    move v3, p1

    .line 200
    move-object v5, p5

    .line 201
    add-int/lit8 p1, v3, 0x8

    .line 202
    .line 203
    invoke-static {v3, v2}, Lm54;->W(I[B)J

    .line 204
    .line 205
    .line 206
    move-result-wide p2

    .line 207
    invoke-static {p2, p3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 208
    .line 209
    .line 210
    move-result-wide p2

    .line 211
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    iput-object p0, v5, Lv44;->c:Ljava/lang/Object;

    .line 216
    .line 217
    return p1

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_9
        :pswitch_7
        :pswitch_8
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static z(Lr64;Lpz;Lt24;)Lk64;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    instance-of v1, v0, Lr64;

    .line 4
    .line 5
    if-eqz v1, :cond_37

    .line 6
    .line 7
    iget-object v1, v0, Lr64;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const v5, 0xd800

    .line 19
    .line 20
    .line 21
    if-lt v4, v5, :cond_0

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    :goto_0
    add-int/lit8 v7, v4, 0x1

    .line 25
    .line 26
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-lt v4, v5, :cond_1

    .line 31
    .line 32
    move v4, v7

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v7, 0x1

    .line 35
    :cond_1
    add-int/lit8 v4, v7, 0x1

    .line 36
    .line 37
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-lt v7, v5, :cond_3

    .line 42
    .line 43
    and-int/lit16 v7, v7, 0x1fff

    .line 44
    .line 45
    const/16 v9, 0xd

    .line 46
    .line 47
    :goto_1
    add-int/lit8 v10, v4, 0x1

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-lt v4, v5, :cond_2

    .line 54
    .line 55
    and-int/lit16 v4, v4, 0x1fff

    .line 56
    .line 57
    shl-int/2addr v4, v9

    .line 58
    or-int/2addr v7, v4

    .line 59
    add-int/lit8 v9, v9, 0xd

    .line 60
    .line 61
    move v4, v10

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    shl-int/2addr v4, v9

    .line 64
    or-int/2addr v7, v4

    .line 65
    move v4, v10

    .line 66
    :cond_3
    if-nez v7, :cond_4

    .line 67
    .line 68
    sget-object v7, Lk64;->k:[I

    .line 69
    .line 70
    move v9, v3

    .line 71
    move v10, v9

    .line 72
    move v11, v10

    .line 73
    move v12, v11

    .line 74
    move v13, v12

    .line 75
    move/from16 v16, v13

    .line 76
    .line 77
    move-object v15, v7

    .line 78
    move/from16 v7, v16

    .line 79
    .line 80
    goto/16 :goto_a

    .line 81
    .line 82
    :cond_4
    add-int/lit8 v7, v4, 0x1

    .line 83
    .line 84
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-lt v4, v5, :cond_6

    .line 89
    .line 90
    and-int/lit16 v4, v4, 0x1fff

    .line 91
    .line 92
    const/16 v9, 0xd

    .line 93
    .line 94
    :goto_2
    add-int/lit8 v10, v7, 0x1

    .line 95
    .line 96
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-lt v7, v5, :cond_5

    .line 101
    .line 102
    and-int/lit16 v7, v7, 0x1fff

    .line 103
    .line 104
    shl-int/2addr v7, v9

    .line 105
    or-int/2addr v4, v7

    .line 106
    add-int/lit8 v9, v9, 0xd

    .line 107
    .line 108
    move v7, v10

    .line 109
    goto :goto_2

    .line 110
    :cond_5
    shl-int/2addr v7, v9

    .line 111
    or-int/2addr v4, v7

    .line 112
    move v7, v10

    .line 113
    :cond_6
    add-int/lit8 v9, v7, 0x1

    .line 114
    .line 115
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-lt v7, v5, :cond_8

    .line 120
    .line 121
    and-int/lit16 v7, v7, 0x1fff

    .line 122
    .line 123
    const/16 v10, 0xd

    .line 124
    .line 125
    :goto_3
    add-int/lit8 v11, v9, 0x1

    .line 126
    .line 127
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-lt v9, v5, :cond_7

    .line 132
    .line 133
    and-int/lit16 v9, v9, 0x1fff

    .line 134
    .line 135
    shl-int/2addr v9, v10

    .line 136
    or-int/2addr v7, v9

    .line 137
    add-int/lit8 v10, v10, 0xd

    .line 138
    .line 139
    move v9, v11

    .line 140
    goto :goto_3

    .line 141
    :cond_7
    shl-int/2addr v9, v10

    .line 142
    or-int/2addr v7, v9

    .line 143
    move v9, v11

    .line 144
    :cond_8
    add-int/lit8 v10, v9, 0x1

    .line 145
    .line 146
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-lt v9, v5, :cond_a

    .line 151
    .line 152
    and-int/lit16 v9, v9, 0x1fff

    .line 153
    .line 154
    const/16 v11, 0xd

    .line 155
    .line 156
    :goto_4
    add-int/lit8 v12, v10, 0x1

    .line 157
    .line 158
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-lt v10, v5, :cond_9

    .line 163
    .line 164
    and-int/lit16 v10, v10, 0x1fff

    .line 165
    .line 166
    shl-int/2addr v10, v11

    .line 167
    or-int/2addr v9, v10

    .line 168
    add-int/lit8 v11, v11, 0xd

    .line 169
    .line 170
    move v10, v12

    .line 171
    goto :goto_4

    .line 172
    :cond_9
    shl-int/2addr v10, v11

    .line 173
    or-int/2addr v9, v10

    .line 174
    move v10, v12

    .line 175
    :cond_a
    add-int/lit8 v11, v10, 0x1

    .line 176
    .line 177
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    if-lt v10, v5, :cond_c

    .line 182
    .line 183
    and-int/lit16 v10, v10, 0x1fff

    .line 184
    .line 185
    const/16 v12, 0xd

    .line 186
    .line 187
    :goto_5
    add-int/lit8 v13, v11, 0x1

    .line 188
    .line 189
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    if-lt v11, v5, :cond_b

    .line 194
    .line 195
    and-int/lit16 v11, v11, 0x1fff

    .line 196
    .line 197
    shl-int/2addr v11, v12

    .line 198
    or-int/2addr v10, v11

    .line 199
    add-int/lit8 v12, v12, 0xd

    .line 200
    .line 201
    move v11, v13

    .line 202
    goto :goto_5

    .line 203
    :cond_b
    shl-int/2addr v11, v12

    .line 204
    or-int/2addr v10, v11

    .line 205
    move v11, v13

    .line 206
    :cond_c
    add-int/lit8 v12, v11, 0x1

    .line 207
    .line 208
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    if-lt v11, v5, :cond_e

    .line 213
    .line 214
    and-int/lit16 v11, v11, 0x1fff

    .line 215
    .line 216
    const/16 v13, 0xd

    .line 217
    .line 218
    :goto_6
    add-int/lit8 v14, v12, 0x1

    .line 219
    .line 220
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 221
    .line 222
    .line 223
    move-result v12

    .line 224
    if-lt v12, v5, :cond_d

    .line 225
    .line 226
    and-int/lit16 v12, v12, 0x1fff

    .line 227
    .line 228
    shl-int/2addr v12, v13

    .line 229
    or-int/2addr v11, v12

    .line 230
    add-int/lit8 v13, v13, 0xd

    .line 231
    .line 232
    move v12, v14

    .line 233
    goto :goto_6

    .line 234
    :cond_d
    shl-int/2addr v12, v13

    .line 235
    or-int/2addr v11, v12

    .line 236
    move v12, v14

    .line 237
    :cond_e
    add-int/lit8 v13, v12, 0x1

    .line 238
    .line 239
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 240
    .line 241
    .line 242
    move-result v12

    .line 243
    if-lt v12, v5, :cond_10

    .line 244
    .line 245
    and-int/lit16 v12, v12, 0x1fff

    .line 246
    .line 247
    const/16 v14, 0xd

    .line 248
    .line 249
    :goto_7
    add-int/lit8 v15, v13, 0x1

    .line 250
    .line 251
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 252
    .line 253
    .line 254
    move-result v13

    .line 255
    if-lt v13, v5, :cond_f

    .line 256
    .line 257
    and-int/lit16 v13, v13, 0x1fff

    .line 258
    .line 259
    shl-int/2addr v13, v14

    .line 260
    or-int/2addr v12, v13

    .line 261
    add-int/lit8 v14, v14, 0xd

    .line 262
    .line 263
    move v13, v15

    .line 264
    goto :goto_7

    .line 265
    :cond_f
    shl-int/2addr v13, v14

    .line 266
    or-int/2addr v12, v13

    .line 267
    move v13, v15

    .line 268
    :cond_10
    add-int/lit8 v14, v13, 0x1

    .line 269
    .line 270
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 271
    .line 272
    .line 273
    move-result v13

    .line 274
    if-lt v13, v5, :cond_12

    .line 275
    .line 276
    and-int/lit16 v13, v13, 0x1fff

    .line 277
    .line 278
    const/16 v15, 0xd

    .line 279
    .line 280
    :goto_8
    add-int/lit8 v16, v14, 0x1

    .line 281
    .line 282
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 283
    .line 284
    .line 285
    move-result v14

    .line 286
    if-lt v14, v5, :cond_11

    .line 287
    .line 288
    and-int/lit16 v14, v14, 0x1fff

    .line 289
    .line 290
    shl-int/2addr v14, v15

    .line 291
    or-int/2addr v13, v14

    .line 292
    add-int/lit8 v15, v15, 0xd

    .line 293
    .line 294
    move/from16 v14, v16

    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_11
    shl-int/2addr v14, v15

    .line 298
    or-int/2addr v13, v14

    .line 299
    move/from16 v14, v16

    .line 300
    .line 301
    :cond_12
    add-int/lit8 v15, v14, 0x1

    .line 302
    .line 303
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 304
    .line 305
    .line 306
    move-result v14

    .line 307
    if-lt v14, v5, :cond_14

    .line 308
    .line 309
    and-int/lit16 v14, v14, 0x1fff

    .line 310
    .line 311
    const/16 v16, 0xd

    .line 312
    .line 313
    :goto_9
    add-int/lit8 v17, v15, 0x1

    .line 314
    .line 315
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 316
    .line 317
    .line 318
    move-result v15

    .line 319
    if-lt v15, v5, :cond_13

    .line 320
    .line 321
    and-int/lit16 v15, v15, 0x1fff

    .line 322
    .line 323
    shl-int v15, v15, v16

    .line 324
    .line 325
    or-int/2addr v14, v15

    .line 326
    add-int/lit8 v16, v16, 0xd

    .line 327
    .line 328
    move/from16 v15, v17

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_13
    shl-int v15, v15, v16

    .line 332
    .line 333
    or-int/2addr v14, v15

    .line 334
    move/from16 v15, v17

    .line 335
    .line 336
    :cond_14
    add-int v16, v14, v12

    .line 337
    .line 338
    add-int v13, v16, v13

    .line 339
    .line 340
    add-int v16, v4, v4

    .line 341
    .line 342
    add-int v16, v16, v7

    .line 343
    .line 344
    new-array v7, v13, [I

    .line 345
    .line 346
    move-object v13, v7

    .line 347
    move v7, v4

    .line 348
    move v4, v15

    .line 349
    move-object v15, v13

    .line 350
    move v13, v12

    .line 351
    move v12, v9

    .line 352
    move v9, v13

    .line 353
    move v13, v10

    .line 354
    move/from16 v10, v16

    .line 355
    .line 356
    move/from16 v16, v14

    .line 357
    .line 358
    :goto_a
    sget-object v14, Lk64;->l:Lsun/misc/Unsafe;

    .line 359
    .line 360
    iget-object v3, v0, Lr64;->c:[Ljava/lang/Object;

    .line 361
    .line 362
    iget-object v8, v0, Lr64;->a:Ls44;

    .line 363
    .line 364
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    move-result-object v8

    .line 368
    add-int v9, v16, v9

    .line 369
    .line 370
    add-int v6, v11, v11

    .line 371
    .line 372
    mul-int/lit8 v11, v11, 0x3

    .line 373
    .line 374
    new-array v11, v11, [I

    .line 375
    .line 376
    new-array v6, v6, [Ljava/lang/Object;

    .line 377
    .line 378
    move/from16 v23, v9

    .line 379
    .line 380
    move/from16 v22, v16

    .line 381
    .line 382
    const/16 v20, 0x0

    .line 383
    .line 384
    const/16 v21, 0x0

    .line 385
    .line 386
    :goto_b
    if-ge v4, v2, :cond_36

    .line 387
    .line 388
    add-int/lit8 v24, v4, 0x1

    .line 389
    .line 390
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 391
    .line 392
    .line 393
    move-result v4

    .line 394
    if-lt v4, v5, :cond_16

    .line 395
    .line 396
    and-int/lit16 v4, v4, 0x1fff

    .line 397
    .line 398
    move/from16 v5, v24

    .line 399
    .line 400
    const/16 v24, 0xd

    .line 401
    .line 402
    :goto_c
    add-int/lit8 v26, v5, 0x1

    .line 403
    .line 404
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    move/from16 v27, v2

    .line 409
    .line 410
    const v2, 0xd800

    .line 411
    .line 412
    .line 413
    if-lt v5, v2, :cond_15

    .line 414
    .line 415
    and-int/lit16 v2, v5, 0x1fff

    .line 416
    .line 417
    shl-int v2, v2, v24

    .line 418
    .line 419
    or-int/2addr v4, v2

    .line 420
    add-int/lit8 v24, v24, 0xd

    .line 421
    .line 422
    move/from16 v5, v26

    .line 423
    .line 424
    move/from16 v2, v27

    .line 425
    .line 426
    goto :goto_c

    .line 427
    :cond_15
    shl-int v2, v5, v24

    .line 428
    .line 429
    or-int/2addr v4, v2

    .line 430
    move/from16 v2, v26

    .line 431
    .line 432
    goto :goto_d

    .line 433
    :cond_16
    move/from16 v27, v2

    .line 434
    .line 435
    move/from16 v2, v24

    .line 436
    .line 437
    :goto_d
    add-int/lit8 v5, v2, 0x1

    .line 438
    .line 439
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    move-object/from16 v24, v3

    .line 444
    .line 445
    const v3, 0xd800

    .line 446
    .line 447
    .line 448
    if-lt v2, v3, :cond_18

    .line 449
    .line 450
    and-int/lit16 v2, v2, 0x1fff

    .line 451
    .line 452
    const/16 v26, 0xd

    .line 453
    .line 454
    :goto_e
    add-int/lit8 v28, v5, 0x1

    .line 455
    .line 456
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    if-lt v5, v3, :cond_17

    .line 461
    .line 462
    and-int/lit16 v3, v5, 0x1fff

    .line 463
    .line 464
    shl-int v3, v3, v26

    .line 465
    .line 466
    or-int/2addr v2, v3

    .line 467
    add-int/lit8 v26, v26, 0xd

    .line 468
    .line 469
    move/from16 v5, v28

    .line 470
    .line 471
    const v3, 0xd800

    .line 472
    .line 473
    .line 474
    goto :goto_e

    .line 475
    :cond_17
    shl-int v3, v5, v26

    .line 476
    .line 477
    or-int/2addr v2, v3

    .line 478
    move/from16 v5, v28

    .line 479
    .line 480
    :cond_18
    and-int/lit16 v3, v2, 0x400

    .line 481
    .line 482
    if-eqz v3, :cond_19

    .line 483
    .line 484
    add-int/lit8 v3, v20, 0x1

    .line 485
    .line 486
    aput v21, v15, v20

    .line 487
    .line 488
    move/from16 v20, v3

    .line 489
    .line 490
    :cond_19
    and-int/lit16 v3, v2, 0xff

    .line 491
    .line 492
    move/from16 v26, v4

    .line 493
    .line 494
    and-int/lit16 v4, v2, 0x800

    .line 495
    .line 496
    move/from16 v28, v4

    .line 497
    .line 498
    const/16 v4, 0x33

    .line 499
    .line 500
    if-lt v3, v4, :cond_23

    .line 501
    .line 502
    add-int/lit8 v4, v5, 0x1

    .line 503
    .line 504
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 505
    .line 506
    .line 507
    move-result v5

    .line 508
    move/from16 v29, v4

    .line 509
    .line 510
    const v4, 0xd800

    .line 511
    .line 512
    .line 513
    if-lt v5, v4, :cond_1b

    .line 514
    .line 515
    and-int/lit16 v5, v5, 0x1fff

    .line 516
    .line 517
    move/from16 v33, v29

    .line 518
    .line 519
    move/from16 v29, v5

    .line 520
    .line 521
    move/from16 v5, v33

    .line 522
    .line 523
    const/16 v33, 0xd

    .line 524
    .line 525
    :goto_f
    add-int/lit8 v34, v5, 0x1

    .line 526
    .line 527
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    if-lt v5, v4, :cond_1a

    .line 532
    .line 533
    and-int/lit16 v4, v5, 0x1fff

    .line 534
    .line 535
    shl-int v4, v4, v33

    .line 536
    .line 537
    or-int v29, v29, v4

    .line 538
    .line 539
    add-int/lit8 v33, v33, 0xd

    .line 540
    .line 541
    move/from16 v5, v34

    .line 542
    .line 543
    const v4, 0xd800

    .line 544
    .line 545
    .line 546
    goto :goto_f

    .line 547
    :cond_1a
    shl-int v4, v5, v33

    .line 548
    .line 549
    or-int v5, v29, v4

    .line 550
    .line 551
    move/from16 v4, v34

    .line 552
    .line 553
    goto :goto_10

    .line 554
    :cond_1b
    move/from16 v4, v29

    .line 555
    .line 556
    :goto_10
    move/from16 v29, v4

    .line 557
    .line 558
    add-int/lit8 v4, v3, -0x33

    .line 559
    .line 560
    move/from16 v33, v5

    .line 561
    .line 562
    const/16 v5, 0x9

    .line 563
    .line 564
    if-eq v4, v5, :cond_1c

    .line 565
    .line 566
    const/16 v5, 0x11

    .line 567
    .line 568
    if-ne v4, v5, :cond_1d

    .line 569
    .line 570
    :cond_1c
    const/4 v5, 0x1

    .line 571
    goto :goto_13

    .line 572
    :cond_1d
    const/16 v5, 0xc

    .line 573
    .line 574
    if-ne v4, v5, :cond_20

    .line 575
    .line 576
    invoke-virtual {v0}, Lr64;->a()I

    .line 577
    .line 578
    .line 579
    move-result v4

    .line 580
    const/4 v5, 0x1

    .line 581
    if-eq v4, v5, :cond_1f

    .line 582
    .line 583
    if-eqz v28, :cond_1e

    .line 584
    .line 585
    goto :goto_11

    .line 586
    :cond_1e
    const/4 v4, 0x0

    .line 587
    goto :goto_14

    .line 588
    :cond_1f
    :goto_11
    add-int/lit8 v4, v10, 0x1

    .line 589
    .line 590
    div-int/lit8 v19, v21, 0x3

    .line 591
    .line 592
    add-int v19, v19, v19

    .line 593
    .line 594
    add-int/lit8 v19, v19, 0x1

    .line 595
    .line 596
    aget-object v10, v24, v10

    .line 597
    .line 598
    aput-object v10, v6, v19

    .line 599
    .line 600
    :goto_12
    move v10, v4

    .line 601
    :cond_20
    move/from16 v4, v28

    .line 602
    .line 603
    goto :goto_14

    .line 604
    :goto_13
    add-int/lit8 v4, v10, 0x1

    .line 605
    .line 606
    div-int/lit8 v19, v21, 0x3

    .line 607
    .line 608
    add-int v19, v19, v19

    .line 609
    .line 610
    add-int/lit8 v30, v19, 0x1

    .line 611
    .line 612
    aget-object v5, v24, v10

    .line 613
    .line 614
    aput-object v5, v6, v30

    .line 615
    .line 616
    goto :goto_12

    .line 617
    :goto_14
    add-int v5, v33, v33

    .line 618
    .line 619
    move/from16 v28, v4

    .line 620
    .line 621
    aget-object v4, v24, v5

    .line 622
    .line 623
    move/from16 v30, v5

    .line 624
    .line 625
    instance-of v5, v4, Ljava/lang/reflect/Field;

    .line 626
    .line 627
    if-eqz v5, :cond_21

    .line 628
    .line 629
    check-cast v4, Ljava/lang/reflect/Field;

    .line 630
    .line 631
    goto :goto_15

    .line 632
    :cond_21
    check-cast v4, Ljava/lang/String;

    .line 633
    .line 634
    invoke-static {v8, v4}, Lk64;->A(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 635
    .line 636
    .line 637
    move-result-object v4

    .line 638
    aput-object v4, v24, v30

    .line 639
    .line 640
    :goto_15
    invoke-virtual {v14, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 641
    .line 642
    .line 643
    move-result-wide v4

    .line 644
    long-to-int v4, v4

    .line 645
    add-int/lit8 v5, v30, 0x1

    .line 646
    .line 647
    move/from16 v30, v4

    .line 648
    .line 649
    aget-object v4, v24, v5

    .line 650
    .line 651
    move/from16 v31, v5

    .line 652
    .line 653
    instance-of v5, v4, Ljava/lang/reflect/Field;

    .line 654
    .line 655
    if-eqz v5, :cond_22

    .line 656
    .line 657
    check-cast v4, Ljava/lang/reflect/Field;

    .line 658
    .line 659
    goto :goto_16

    .line 660
    :cond_22
    check-cast v4, Ljava/lang/String;

    .line 661
    .line 662
    invoke-static {v8, v4}, Lk64;->A(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 663
    .line 664
    .line 665
    move-result-object v4

    .line 666
    aput-object v4, v24, v31

    .line 667
    .line 668
    :goto_16
    invoke-virtual {v14, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 669
    .line 670
    .line 671
    move-result-wide v4

    .line 672
    long-to-int v4, v4

    .line 673
    move/from16 v31, v29

    .line 674
    .line 675
    move/from16 v5, v30

    .line 676
    .line 677
    const v25, 0xd800

    .line 678
    .line 679
    .line 680
    move-object/from16 v29, v6

    .line 681
    .line 682
    move/from16 v30, v7

    .line 683
    .line 684
    move-object v6, v8

    .line 685
    const/4 v7, 0x0

    .line 686
    move v8, v4

    .line 687
    :goto_17
    move/from16 v4, v28

    .line 688
    .line 689
    goto/16 :goto_24

    .line 690
    .line 691
    :cond_23
    add-int/lit8 v4, v10, 0x1

    .line 692
    .line 693
    aget-object v29, v24, v10

    .line 694
    .line 695
    move/from16 v33, v4

    .line 696
    .line 697
    move-object/from16 v4, v29

    .line 698
    .line 699
    check-cast v4, Ljava/lang/String;

    .line 700
    .line 701
    invoke-static {v8, v4}, Lk64;->A(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 702
    .line 703
    .line 704
    move-result-object v4

    .line 705
    move-object/from16 v29, v6

    .line 706
    .line 707
    const/16 v6, 0x9

    .line 708
    .line 709
    if-eq v3, v6, :cond_24

    .line 710
    .line 711
    const/16 v6, 0x11

    .line 712
    .line 713
    if-ne v3, v6, :cond_25

    .line 714
    .line 715
    :cond_24
    move/from16 v30, v7

    .line 716
    .line 717
    const/4 v7, 0x1

    .line 718
    goto/16 :goto_1d

    .line 719
    .line 720
    :cond_25
    const/16 v6, 0x1b

    .line 721
    .line 722
    if-eq v3, v6, :cond_2d

    .line 723
    .line 724
    const/16 v6, 0x31

    .line 725
    .line 726
    if-ne v3, v6, :cond_26

    .line 727
    .line 728
    add-int/lit8 v10, v10, 0x2

    .line 729
    .line 730
    move/from16 v30, v7

    .line 731
    .line 732
    const/4 v7, 0x1

    .line 733
    goto/16 :goto_1c

    .line 734
    .line 735
    :cond_26
    const/16 v6, 0xc

    .line 736
    .line 737
    if-eq v3, v6, :cond_2a

    .line 738
    .line 739
    const/16 v6, 0x1e

    .line 740
    .line 741
    if-eq v3, v6, :cond_2a

    .line 742
    .line 743
    const/16 v6, 0x2c

    .line 744
    .line 745
    if-ne v3, v6, :cond_27

    .line 746
    .line 747
    goto :goto_19

    .line 748
    :cond_27
    const/16 v6, 0x32

    .line 749
    .line 750
    if-ne v3, v6, :cond_29

    .line 751
    .line 752
    add-int/lit8 v6, v10, 0x2

    .line 753
    .line 754
    add-int/lit8 v30, v22, 0x1

    .line 755
    .line 756
    aput v21, v15, v22

    .line 757
    .line 758
    div-int/lit8 v22, v21, 0x3

    .line 759
    .line 760
    aget-object v31, v24, v33

    .line 761
    .line 762
    add-int v22, v22, v22

    .line 763
    .line 764
    aput-object v31, v29, v22

    .line 765
    .line 766
    if-eqz v28, :cond_28

    .line 767
    .line 768
    add-int/lit8 v22, v22, 0x1

    .line 769
    .line 770
    add-int/lit8 v10, v10, 0x3

    .line 771
    .line 772
    aget-object v6, v24, v6

    .line 773
    .line 774
    aput-object v6, v29, v22

    .line 775
    .line 776
    move-object v6, v8

    .line 777
    move/from16 v22, v30

    .line 778
    .line 779
    :goto_18
    move/from16 v30, v7

    .line 780
    .line 781
    goto :goto_1f

    .line 782
    :cond_28
    move v10, v6

    .line 783
    move-object v6, v8

    .line 784
    move/from16 v22, v30

    .line 785
    .line 786
    const/16 v28, 0x0

    .line 787
    .line 788
    goto :goto_18

    .line 789
    :cond_29
    move/from16 v30, v7

    .line 790
    .line 791
    const/4 v7, 0x1

    .line 792
    goto :goto_1e

    .line 793
    :cond_2a
    :goto_19
    invoke-virtual {v0}, Lr64;->a()I

    .line 794
    .line 795
    .line 796
    move-result v6

    .line 797
    move/from16 v30, v7

    .line 798
    .line 799
    const/4 v7, 0x1

    .line 800
    if-eq v6, v7, :cond_2c

    .line 801
    .line 802
    if-eqz v28, :cond_2b

    .line 803
    .line 804
    goto :goto_1a

    .line 805
    :cond_2b
    move-object v6, v8

    .line 806
    move/from16 v10, v33

    .line 807
    .line 808
    const/16 v28, 0x0

    .line 809
    .line 810
    goto :goto_1f

    .line 811
    :cond_2c
    :goto_1a
    add-int/lit8 v10, v10, 0x2

    .line 812
    .line 813
    div-int/lit8 v6, v21, 0x3

    .line 814
    .line 815
    add-int/2addr v6, v6

    .line 816
    add-int/2addr v6, v7

    .line 817
    aget-object v19, v24, v33

    .line 818
    .line 819
    aput-object v19, v29, v6

    .line 820
    .line 821
    :goto_1b
    move-object v6, v8

    .line 822
    goto :goto_1f

    .line 823
    :cond_2d
    move/from16 v30, v7

    .line 824
    .line 825
    const/4 v7, 0x1

    .line 826
    add-int/lit8 v10, v10, 0x2

    .line 827
    .line 828
    :goto_1c
    div-int/lit8 v6, v21, 0x3

    .line 829
    .line 830
    add-int/2addr v6, v6

    .line 831
    add-int/2addr v6, v7

    .line 832
    aget-object v19, v24, v33

    .line 833
    .line 834
    aput-object v19, v29, v6

    .line 835
    .line 836
    goto :goto_1b

    .line 837
    :goto_1d
    div-int/lit8 v6, v21, 0x3

    .line 838
    .line 839
    add-int/2addr v6, v6

    .line 840
    add-int/2addr v6, v7

    .line 841
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 842
    .line 843
    .line 844
    move-result-object v10

    .line 845
    aput-object v10, v29, v6

    .line 846
    .line 847
    :goto_1e
    move-object v6, v8

    .line 848
    move/from16 v10, v33

    .line 849
    .line 850
    :goto_1f
    invoke-virtual {v14, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 851
    .line 852
    .line 853
    move-result-wide v7

    .line 854
    long-to-int v4, v7

    .line 855
    and-int/lit16 v7, v2, 0x1000

    .line 856
    .line 857
    const v8, 0xfffff

    .line 858
    .line 859
    .line 860
    if-eqz v7, :cond_31

    .line 861
    .line 862
    const/16 v7, 0x11

    .line 863
    .line 864
    if-gt v3, v7, :cond_31

    .line 865
    .line 866
    add-int/lit8 v7, v5, 0x1

    .line 867
    .line 868
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 869
    .line 870
    .line 871
    move-result v5

    .line 872
    const v8, 0xd800

    .line 873
    .line 874
    .line 875
    if-lt v5, v8, :cond_2f

    .line 876
    .line 877
    and-int/lit16 v5, v5, 0x1fff

    .line 878
    .line 879
    const/16 v25, 0xd

    .line 880
    .line 881
    :goto_20
    add-int/lit8 v31, v7, 0x1

    .line 882
    .line 883
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 884
    .line 885
    .line 886
    move-result v7

    .line 887
    if-lt v7, v8, :cond_2e

    .line 888
    .line 889
    and-int/lit16 v7, v7, 0x1fff

    .line 890
    .line 891
    shl-int v7, v7, v25

    .line 892
    .line 893
    or-int/2addr v5, v7

    .line 894
    add-int/lit8 v25, v25, 0xd

    .line 895
    .line 896
    move/from16 v7, v31

    .line 897
    .line 898
    goto :goto_20

    .line 899
    :cond_2e
    shl-int v7, v7, v25

    .line 900
    .line 901
    or-int/2addr v5, v7

    .line 902
    goto :goto_21

    .line 903
    :cond_2f
    move/from16 v31, v7

    .line 904
    .line 905
    :goto_21
    add-int v7, v30, v30

    .line 906
    .line 907
    div-int/lit8 v25, v5, 0x20

    .line 908
    .line 909
    add-int v25, v25, v7

    .line 910
    .line 911
    aget-object v7, v24, v25

    .line 912
    .line 913
    instance-of v8, v7, Ljava/lang/reflect/Field;

    .line 914
    .line 915
    if-eqz v8, :cond_30

    .line 916
    .line 917
    check-cast v7, Ljava/lang/reflect/Field;

    .line 918
    .line 919
    goto :goto_22

    .line 920
    :cond_30
    check-cast v7, Ljava/lang/String;

    .line 921
    .line 922
    invoke-static {v6, v7}, Lk64;->A(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 923
    .line 924
    .line 925
    move-result-object v7

    .line 926
    aput-object v7, v24, v25

    .line 927
    .line 928
    :goto_22
    invoke-virtual {v14, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 929
    .line 930
    .line 931
    move-result-wide v7

    .line 932
    long-to-int v7, v7

    .line 933
    rem-int/lit8 v5, v5, 0x20

    .line 934
    .line 935
    move v8, v7

    .line 936
    const v25, 0xd800

    .line 937
    .line 938
    .line 939
    goto :goto_23

    .line 940
    :cond_31
    const v25, 0xd800

    .line 941
    .line 942
    .line 943
    move/from16 v31, v5

    .line 944
    .line 945
    const/4 v5, 0x0

    .line 946
    :goto_23
    const/16 v7, 0x12

    .line 947
    .line 948
    if-lt v3, v7, :cond_32

    .line 949
    .line 950
    const/16 v7, 0x31

    .line 951
    .line 952
    if-gt v3, v7, :cond_32

    .line 953
    .line 954
    add-int/lit8 v7, v23, 0x1

    .line 955
    .line 956
    aput v4, v15, v23

    .line 957
    .line 958
    move/from16 v23, v7

    .line 959
    .line 960
    :cond_32
    move v7, v5

    .line 961
    move v5, v4

    .line 962
    goto/16 :goto_17

    .line 963
    .line 964
    :goto_24
    add-int/lit8 v28, v21, 0x1

    .line 965
    .line 966
    aput v26, v11, v21

    .line 967
    .line 968
    add-int/lit8 v26, v21, 0x2

    .line 969
    .line 970
    move-object/from16 v32, v1

    .line 971
    .line 972
    and-int/lit16 v1, v2, 0x200

    .line 973
    .line 974
    if-eqz v1, :cond_33

    .line 975
    .line 976
    const/high16 v1, 0x20000000

    .line 977
    .line 978
    goto :goto_25

    .line 979
    :cond_33
    const/4 v1, 0x0

    .line 980
    :goto_25
    and-int/lit16 v2, v2, 0x100

    .line 981
    .line 982
    if-eqz v2, :cond_34

    .line 983
    .line 984
    const/high16 v2, 0x10000000

    .line 985
    .line 986
    goto :goto_26

    .line 987
    :cond_34
    const/4 v2, 0x0

    .line 988
    :goto_26
    if-eqz v4, :cond_35

    .line 989
    .line 990
    const/high16 v4, -0x80000000

    .line 991
    .line 992
    goto :goto_27

    .line 993
    :cond_35
    const/4 v4, 0x0

    .line 994
    :goto_27
    shl-int/lit8 v3, v3, 0x14

    .line 995
    .line 996
    or-int/2addr v1, v2

    .line 997
    or-int/2addr v1, v4

    .line 998
    or-int/2addr v1, v3

    .line 999
    or-int/2addr v1, v5

    .line 1000
    aput v1, v11, v28

    .line 1001
    .line 1002
    add-int/lit8 v21, v21, 0x3

    .line 1003
    .line 1004
    shl-int/lit8 v1, v7, 0x14

    .line 1005
    .line 1006
    or-int/2addr v1, v8

    .line 1007
    aput v1, v11, v26

    .line 1008
    .line 1009
    move-object v8, v6

    .line 1010
    move-object/from16 v3, v24

    .line 1011
    .line 1012
    move/from16 v5, v25

    .line 1013
    .line 1014
    move/from16 v2, v27

    .line 1015
    .line 1016
    move-object/from16 v6, v29

    .line 1017
    .line 1018
    move/from16 v7, v30

    .line 1019
    .line 1020
    move/from16 v4, v31

    .line 1021
    .line 1022
    move-object/from16 v1, v32

    .line 1023
    .line 1024
    goto/16 :goto_b

    .line 1025
    .line 1026
    :cond_36
    move-object/from16 v29, v6

    .line 1027
    .line 1028
    new-instance v1, Lk64;

    .line 1029
    .line 1030
    iget-object v14, v0, Lr64;->a:Ls44;

    .line 1031
    .line 1032
    move-object/from16 v18, p1

    .line 1033
    .line 1034
    move-object/from16 v19, p2

    .line 1035
    .line 1036
    move/from16 v17, v9

    .line 1037
    .line 1038
    move-object v10, v11

    .line 1039
    move-object/from16 v11, v29

    .line 1040
    .line 1041
    move-object v9, v1

    .line 1042
    invoke-direct/range {v9 .. v19}, Lk64;-><init>([I[Ljava/lang/Object;IILs44;[IIILpz;Lt24;)V

    .line 1043
    .line 1044
    .line 1045
    return-object v9

    .line 1046
    :cond_37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1047
    .line 1048
    .line 1049
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1050
    .line 1051
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1052
    .line 1053
    .line 1054
    throw v0
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p3}, Lk64;->s(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lk64;->k(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v0, v1

    .line 16
    sget-object v1, Lk64;->l:Lsun/misc/Unsafe;

    .line 17
    .line 18
    int-to-long v2, v0

    .line 19
    invoke-virtual {v1, p3, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lk64;->D(I)Lv64;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {p0, p1, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_2

    .line 34
    .line 35
    invoke-static {v0}, Lk64;->m(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1, p2, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-interface {p3}, Lv64;->a()Lp54;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {p3, v4, v0}, Lv64;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p2, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0, p1, p2}, Lk64;->t(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-virtual {v1, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Lk64;->m(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    invoke-interface {p3}, Lv64;->a()Lp54;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {p3, v4, p1}, Lv64;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p2, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object p1, v4

    .line 80
    :cond_3
    invoke-interface {p3, p1, v0}, Lv64;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    iget-object v0, p0, Lk64;->a:[I

    .line 87
    .line 88
    aget p1, v0, p1

    .line 89
    .line 90
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    const/16 v0, 0x26

    .line 95
    .line 96
    invoke-static {p1, v0}, Lga1;->f(II)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    add-int/2addr v0, v1

    .line 107
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 108
    .line 109
    .line 110
    const-string v0, "Source subfield "

    .line 111
    .line 112
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string p1, " is present but null: "

    .line 119
    .line 120
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p2
.end method

.method public final C(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lk64;->a:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {p0, v1, p3, p1}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lk64;->k(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const v3, 0xfffff

    .line 17
    .line 18
    .line 19
    and-int/2addr v2, v3

    .line 20
    sget-object v3, Lk64;->l:Lsun/misc/Unsafe;

    .line 21
    .line 22
    int-to-long v4, v2

    .line 23
    invoke-virtual {v3, p3, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lk64;->D(I)Lv64;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p0, v1, p2, p1}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    invoke-static {v2}, Lk64;->m(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v3, p2, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-interface {p3}, Lv64;->a()Lp54;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {p3, v0, v2}, Lv64;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, p2, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-virtual {p0, v1, p2, p1}, Lk64;->v(ILjava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    invoke-virtual {v3, p2, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, Lk64;->m(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    invoke-interface {p3}, Lv64;->a()Lp54;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {p3, v0, p1}, Lv64;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, p2, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object p1, v0

    .line 84
    :cond_3
    invoke-interface {p3, p1, v2}, Lv64;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    aget p1, v0, p1

    .line 91
    .line 92
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    const/16 v0, 0x26

    .line 97
    .line 98
    invoke-static {p1, v0}, Lga1;->f(II)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    new-instance v2, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    add-int/2addr v0, v1

    .line 109
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 110
    .line 111
    .line 112
    const-string v0, "Source subfield "

    .line 113
    .line 114
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string p1, " is present but null: "

    .line 121
    .line 122
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p2
.end method

.method public final D(I)Lv64;
    .locals 3

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    add-int/2addr p1, p1

    .line 4
    iget-object v0, p0, Lk64;->b:[Ljava/lang/Object;

    .line 5
    .line 6
    aget-object v1, v0, p1

    .line 7
    .line 8
    check-cast v1, Lv64;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    add-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    sget-object v2, Lp64;->c:Lp64;

    .line 16
    .line 17
    aget-object v1, v0, v1

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Class;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Lp64;->a(Ljava/lang/Class;)Lv64;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    aput-object v1, v0, p1

    .line 26
    .line 27
    return-object v1
.end method

.method public final E(I)Ljava/lang/Object;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    iget-object v0, p0, Lk64;->b:[Ljava/lang/Object;

    .line 4
    .line 5
    add-int/2addr p1, p1

    .line 6
    aget-object p1, v0, p1

    .line 7
    .line 8
    return-object p1
.end method

.method public final F(I)Ls54;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    add-int/2addr p1, p1

    .line 4
    add-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    iget-object v0, p0, Lk64;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    aget-object p1, v0, p1

    .line 9
    .line 10
    check-cast p1, Ls54;

    .line 11
    .line 12
    return-object p1
.end method

.method public final G(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lk64;->D(I)Lv64;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1}, Lk64;->k(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    invoke-virtual {p0, p1, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Lv64;->a()Lp54;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    int-to-long v1, v1

    .line 25
    sget-object p1, Lk64;->l:Lsun/misc/Unsafe;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lk64;->m(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-interface {v0}, Lv64;->a()Lp54;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p2, p1}, Lv64;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p2
.end method

.method public final H(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lk64;->l:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lk64;->k(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v1, v1

    .line 12
    invoke-virtual {v0, p2, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lk64;->t(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final I(ILjava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p3}, Lk64;->D(I)Lv64;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lv64;->a()Lp54;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lk64;->l:Lsun/misc/Unsafe;

    .line 17
    .line 18
    invoke-virtual {p0, p3}, Lk64;->k(I)I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    const v1, 0xfffff

    .line 23
    .line 24
    .line 25
    and-int/2addr p3, v1

    .line 26
    int-to-long v1, p3

    .line 27
    invoke-virtual {p1, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lk64;->m(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-interface {v0}, Lv64;->a()Lp54;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p2, p1}, Lv64;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p2
.end method

.method public final J(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 3

    .line 1
    sget-object v0, Lk64;->l:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p4}, Lk64;->k(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v1, v1

    .line 12
    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p2, p1, p4}, Lk64;->v(ILjava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final K(Ljava/lang/Object;ILjava/lang/Object;Lpz;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    move/from16 v0, p2

    .line 1
    iget-object v2, v1, Lk64;->a:[I

    aget v2, v2, v0

    .line 2
    invoke-virtual {v1, v0}, Lk64;->k(I)I

    move-result v3

    const v4, 0xfffff

    and-int/2addr v3, v4

    int-to-long v3, v3

    move-object/from16 v5, p1

    .line 3
    invoke-static {v3, v4, v5}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v1, v0}, Lk64;->F(I)Ls54;

    move-result-object v4

    if-nez v4, :cond_1

    :goto_0
    return-object p3

    .line 5
    :cond_1
    check-cast v3, Lg64;

    .line 6
    invoke-virtual {v1, v0}, Lk64;->E(I)Ljava/lang/Object;

    move-result-object v0

    .line 7
    check-cast v0, Lf64;

    .line 8
    iget-object v0, v0, Lf64;->a:Ljr3;

    .line 9
    invoke-virtual {v3}, Lg64;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object/from16 v5, p3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    .line 10
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 11
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-interface {v4, v7}, Ls54;->a(I)Z

    move-result v7

    if-nez v7, :cond_2

    if-nez v5, :cond_3

    .line 12
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {p5 .. p5}, Lpz;->q(Ljava/lang/Object;)Lb74;

    move-result-object v5

    .line 13
    :cond_3
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    .line 14
    iget-object v9, v0, Ljr3;->g:Ljava/lang/Object;

    check-cast v9, Lj74;

    iget-object v10, v0, Ljr3;->h:Ljava/lang/Object;

    check-cast v10, Lj74;

    sget v11, Lk54;->c:I

    const/16 v11, 0x8

    .line 15
    invoke-static {v11}, Lg54;->D(I)I

    move-result v12

    .line 16
    sget-object v13, Lj74;->i:Lj74;

    if-ne v9, v13, :cond_4

    add-int/2addr v12, v12

    .line 17
    :cond_4
    sget-object v14, Lk74;->f:Lk74;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    const/16 v15, 0x3f

    const-string v11, "There is no way to get here, but the compiler thinks otherwise."

    const/16 v16, 0x4

    packed-switch v9, :pswitch_data_0

    .line 18
    new-instance v0, Ljava/lang/RuntimeException;

    .line 19
    invoke-direct {v0, v11}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 20
    :pswitch_0
    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    add-long v19, v17, v17

    shr-long v17, v17, v15

    xor-long v17, v19, v17

    .line 21
    invoke-static/range {v17 .. v18}, Lg54;->E(J)I

    move-result v7

    :goto_2
    move/from16 p3, v15

    goto/16 :goto_6

    .line 22
    :pswitch_1
    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    add-int v9, v7, v7

    shr-int/lit8 v7, v7, 0x1f

    xor-int/2addr v7, v9

    .line 23
    invoke-static {v7}, Lg54;->D(I)I

    move-result v7

    goto :goto_2

    .line 24
    :pswitch_2
    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 p3, v15

    :goto_3
    const/16 v7, 0x8

    goto/16 :goto_6

    .line 25
    :pswitch_3
    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 p3, v15

    :goto_4
    move/from16 v7, v16

    goto/16 :goto_6

    .line 26
    :pswitch_4
    instance-of v9, v7, Lr54;

    if-eqz v9, :cond_5

    .line 27
    check-cast v7, Lr54;

    invoke-interface {v7}, Lr54;->a()I

    move-result v7

    move/from16 p3, v15

    int-to-long v14, v7

    .line 28
    invoke-static {v14, v15}, Lg54;->E(J)I

    move-result v7

    goto/16 :goto_6

    :cond_5
    move/from16 p3, v15

    .line 29
    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    int-to-long v14, v7

    .line 30
    invoke-static {v14, v15}, Lg54;->E(J)I

    move-result v7

    goto/16 :goto_6

    :pswitch_5
    move/from16 p3, v15

    .line 31
    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static {v7}, Lg54;->D(I)I

    move-result v7

    goto/16 :goto_6

    :pswitch_6
    move/from16 p3, v15

    .line 32
    instance-of v14, v7, La54;

    if-eqz v14, :cond_6

    .line 33
    check-cast v7, La54;

    .line 34
    invoke-virtual {v7}, La54;->d()I

    move-result v7

    .line 35
    invoke-static {v7}, Lg54;->D(I)I

    move-result v14

    :goto_5
    add-int/2addr v7, v14

    goto/16 :goto_6

    .line 36
    :cond_6
    check-cast v7, [B

    .line 37
    array-length v7, v7

    .line 38
    invoke-static {v7}, Lg54;->D(I)I

    move-result v14

    goto :goto_5

    :pswitch_7
    move/from16 p3, v15

    .line 39
    check-cast v7, Ls44;

    .line 40
    check-cast v7, Lp54;

    const/4 v9, 0x0

    .line 41
    invoke-virtual {v7, v9}, Lp54;->d(Lv64;)I

    move-result v7

    .line 42
    invoke-static {v7}, Lg54;->D(I)I

    move-result v14

    goto :goto_5

    :pswitch_8
    move/from16 p3, v15

    const/4 v9, 0x0

    .line 43
    check-cast v7, Ls44;

    check-cast v7, Lp54;

    .line 44
    invoke-virtual {v7, v9}, Lp54;->d(Lv64;)I

    move-result v7

    goto/16 :goto_6

    :pswitch_9
    move/from16 p3, v15

    .line 45
    instance-of v14, v7, La54;

    if-eqz v14, :cond_7

    .line 46
    check-cast v7, La54;

    .line 47
    invoke-virtual {v7}, La54;->d()I

    move-result v7

    .line 48
    invoke-static {v7}, Lg54;->D(I)I

    move-result v14

    goto :goto_5

    .line 49
    :cond_7
    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Lg54;->F(Ljava/lang/String;)I

    move-result v7

    goto :goto_6

    :pswitch_a
    move/from16 p3, v15

    .line 50
    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v7, 0x1

    goto :goto_6

    :pswitch_b
    move/from16 p3, v15

    .line 51
    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_4

    :pswitch_c
    move/from16 p3, v15

    .line 52
    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_3

    :pswitch_d
    move/from16 p3, v15

    .line 53
    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    int-to-long v14, v7

    .line 54
    invoke-static {v14, v15}, Lg54;->E(J)I

    move-result v7

    goto :goto_6

    :pswitch_e
    move/from16 p3, v15

    .line 55
    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    invoke-static {v14, v15}, Lg54;->E(J)I

    move-result v7

    goto :goto_6

    :pswitch_f
    move/from16 p3, v15

    .line 56
    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    .line 57
    invoke-static {v14, v15}, Lg54;->E(J)I

    move-result v7

    goto :goto_6

    :pswitch_10
    move/from16 p3, v15

    .line 58
    check-cast v7, Ljava/lang/Float;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_4

    :pswitch_11
    move/from16 p3, v15

    .line 59
    check-cast v7, Ljava/lang/Double;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_3

    :goto_6
    add-int/2addr v7, v12

    const/16 v12, 0x10

    .line 60
    invoke-static {v12}, Lg54;->D(I)I

    move-result v12

    if-ne v10, v13, :cond_8

    add-int/2addr v12, v12

    .line 61
    :cond_8
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    packed-switch v10, :pswitch_data_1

    .line 62
    new-instance v0, Ljava/lang/RuntimeException;

    .line 63
    invoke-direct {v0, v11}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :pswitch_12
    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    add-long v10, v8, v8

    shr-long v8, v8, p3

    xor-long/2addr v8, v10

    .line 65
    invoke-static {v8, v9}, Lg54;->E(J)I

    move-result v11

    goto/16 :goto_a

    .line 66
    :pswitch_13
    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    add-int v9, v8, v8

    shr-int/lit8 v8, v8, 0x1f

    xor-int/2addr v8, v9

    .line 67
    invoke-static {v8}, Lg54;->D(I)I

    move-result v11

    goto/16 :goto_a

    .line 68
    :pswitch_14
    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_7
    const/16 v11, 0x8

    goto/16 :goto_a

    .line 69
    :pswitch_15
    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_8
    move/from16 v11, v16

    goto/16 :goto_a

    .line 70
    :pswitch_16
    instance-of v9, v8, Lr54;

    if-eqz v9, :cond_9

    .line 71
    check-cast v8, Lr54;

    invoke-interface {v8}, Lr54;->a()I

    move-result v8

    int-to-long v8, v8

    .line 72
    invoke-static {v8, v9}, Lg54;->E(J)I

    move-result v11

    goto/16 :goto_a

    .line 73
    :cond_9
    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    int-to-long v8, v8

    .line 74
    invoke-static {v8, v9}, Lg54;->E(J)I

    move-result v11

    goto/16 :goto_a

    .line 75
    :pswitch_17
    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v8}, Lg54;->D(I)I

    move-result v11

    goto/16 :goto_a

    .line 76
    :pswitch_18
    instance-of v9, v8, La54;

    if-eqz v9, :cond_a

    .line 77
    check-cast v8, La54;

    .line 78
    invoke-virtual {v8}, La54;->d()I

    move-result v8

    .line 79
    invoke-static {v8}, Lg54;->D(I)I

    move-result v9

    :goto_9
    add-int v11, v9, v8

    goto/16 :goto_a

    .line 80
    :cond_a
    check-cast v8, [B

    .line 81
    array-length v8, v8

    .line 82
    invoke-static {v8}, Lg54;->D(I)I

    move-result v9

    goto :goto_9

    .line 83
    :pswitch_19
    check-cast v8, Ls44;

    .line 84
    check-cast v8, Lp54;

    const/4 v9, 0x0

    .line 85
    invoke-virtual {v8, v9}, Lp54;->d(Lv64;)I

    move-result v8

    .line 86
    invoke-static {v8}, Lg54;->D(I)I

    move-result v9

    goto :goto_9

    :pswitch_1a
    const/4 v9, 0x0

    .line 87
    check-cast v8, Ls44;

    check-cast v8, Lp54;

    .line 88
    invoke-virtual {v8, v9}, Lp54;->d(Lv64;)I

    move-result v11

    goto :goto_a

    .line 89
    :pswitch_1b
    instance-of v9, v8, La54;

    if-eqz v9, :cond_b

    .line 90
    check-cast v8, La54;

    .line 91
    invoke-virtual {v8}, La54;->d()I

    move-result v8

    .line 92
    invoke-static {v8}, Lg54;->D(I)I

    move-result v9

    goto :goto_9

    .line 93
    :cond_b
    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Lg54;->F(Ljava/lang/String;)I

    move-result v11

    goto :goto_a

    .line 94
    :pswitch_1c
    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x1

    goto :goto_a

    .line 95
    :pswitch_1d
    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_8

    .line 96
    :pswitch_1e
    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_7

    .line 97
    :pswitch_1f
    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    int-to-long v8, v8

    .line 98
    invoke-static {v8, v9}, Lg54;->E(J)I

    move-result v11

    goto :goto_a

    .line 99
    :pswitch_20
    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-static {v8, v9}, Lg54;->E(J)I

    move-result v11

    goto :goto_a

    .line 100
    :pswitch_21
    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    .line 101
    invoke-static {v8, v9}, Lg54;->E(J)I

    move-result v11

    goto :goto_a

    .line 102
    :pswitch_22
    check-cast v8, Ljava/lang/Float;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_8

    .line 103
    :pswitch_23
    check-cast v8, Ljava/lang/Double;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_7

    :goto_a
    add-int/2addr v11, v12

    add-int/2addr v11, v7

    .line 104
    sget-object v7, La54;->g:Ly44;

    .line 105
    new-array v7, v11, [B

    .line 106
    new-instance v8, Le54;

    invoke-direct {v8, v11, v7}, Le54;-><init>(I[B)V

    .line 107
    :try_start_0
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v8, v0, v9, v6}, Lf64;->a(Lg54;Ljr3;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    invoke-virtual {v8}, Lg54;->G()V

    .line 109
    new-instance v6, Ly44;

    invoke-direct {v6, v7}, Ly44;-><init>([B)V

    .line 110
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    shl-int/lit8 v7, v2, 0x3

    .line 111
    move-object v8, v5

    check-cast v8, Lb74;

    or-int/lit8 v7, v7, 0x2

    .line 112
    invoke-virtual {v8, v7, v6}, Lb74;->d(ILjava/lang/Object;)V

    .line 113
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto/16 :goto_1

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/RuntimeException;

    .line 114
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :cond_c
    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method

.method public final L(ILo9;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p2, Lo9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0;

    .line 4
    .line 5
    const/high16 v1, 0x20000000

    .line 6
    .line 7
    and-int/2addr v1, p1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    const v2, 0xfffff

    .line 14
    .line 15
    .line 16
    and-int/2addr p1, v2

    .line 17
    int-to-long v2, p1

    .line 18
    const/4 p1, 0x2

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lo9;->t(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lm0;->v()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p3, v2, v3, p1}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-boolean v1, p0, Lk64;->f:Z

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Lo9;->t(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lm0;->u()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p3, v2, v3, p1}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    invoke-virtual {p2}, Lo9;->B()La54;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p3, v2, v3, p1}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final a()Lp54;
    .locals 1

    .line 1
    iget-object v0, p0, Lk64;->e:Ls44;

    .line 2
    .line 3
    check-cast v0, Lp54;

    .line 4
    .line 5
    invoke-virtual {v0}, Lp54;->p()Lp54;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final b(Lp54;)I
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lk64;->a:[I

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    if-ge v0, v3, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lk64;->k(I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const v4, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v4, v3

    .line 16
    invoke-static {v3}, Lk64;->l(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    aget v2, v2, v0

    .line 21
    .line 22
    int-to-long v4, v4

    .line 23
    const/16 v6, 0x4d5

    .line 24
    .line 25
    const/16 v7, 0x4cf

    .line 26
    .line 27
    const/16 v8, 0x25

    .line 28
    .line 29
    const/16 v9, 0x20

    .line 30
    .line 31
    packed-switch v3, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :pswitch_0
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    mul-int/lit8 v1, v1, 0x35

    .line 43
    .line 44
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    :goto_1
    add-int/2addr v2, v1

    .line 53
    move v1, v2

    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :pswitch_1
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    mul-int/lit8 v1, v1, 0x35

    .line 63
    .line 64
    invoke-static {v4, v5, p1}, Lk64;->p(JLjava/lang/Object;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    sget-object v4, Ly54;->a:Ljava/nio/charset/Charset;

    .line 69
    .line 70
    :goto_2
    ushr-long v4, v2, v9

    .line 71
    .line 72
    xor-long/2addr v2, v4

    .line 73
    long-to-int v2, v2

    .line 74
    add-int/2addr v1, v2

    .line 75
    goto/16 :goto_5

    .line 76
    .line 77
    :pswitch_2
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_2

    .line 82
    .line 83
    mul-int/lit8 v1, v1, 0x35

    .line 84
    .line 85
    invoke-static {v4, v5, p1}, Lk64;->o(JLjava/lang/Object;)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    goto :goto_1

    .line 90
    :pswitch_3
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_2

    .line 95
    .line 96
    mul-int/lit8 v1, v1, 0x35

    .line 97
    .line 98
    invoke-static {v4, v5, p1}, Lk64;->p(JLjava/lang/Object;)J

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    sget-object v4, Ly54;->a:Ljava/nio/charset/Charset;

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :pswitch_4
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_2

    .line 110
    .line 111
    mul-int/lit8 v1, v1, 0x35

    .line 112
    .line 113
    invoke-static {v4, v5, p1}, Lk64;->o(JLjava/lang/Object;)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    goto :goto_1

    .line 118
    :pswitch_5
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_2

    .line 123
    .line 124
    mul-int/lit8 v1, v1, 0x35

    .line 125
    .line 126
    invoke-static {v4, v5, p1}, Lk64;->o(JLjava/lang/Object;)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    goto :goto_1

    .line 131
    :pswitch_6
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_2

    .line 136
    .line 137
    mul-int/lit8 v1, v1, 0x35

    .line 138
    .line 139
    invoke-static {v4, v5, p1}, Lk64;->o(JLjava/lang/Object;)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    goto :goto_1

    .line 144
    :pswitch_7
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_2

    .line 149
    .line 150
    mul-int/lit8 v1, v1, 0x35

    .line 151
    .line 152
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    goto :goto_1

    .line 161
    :pswitch_8
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_2

    .line 166
    .line 167
    mul-int/lit8 v1, v1, 0x35

    .line 168
    .line 169
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    goto :goto_1

    .line 178
    :pswitch_9
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_2

    .line 183
    .line 184
    mul-int/lit8 v1, v1, 0x35

    .line 185
    .line 186
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    check-cast v2, Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    goto/16 :goto_1

    .line 197
    .line 198
    :pswitch_a
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_2

    .line 203
    .line 204
    mul-int/lit8 v1, v1, 0x35

    .line 205
    .line 206
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    check-cast v2, Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    sget-object v3, Ly54;->a:Ljava/nio/charset/Charset;

    .line 217
    .line 218
    if-eqz v2, :cond_0

    .line 219
    .line 220
    :goto_3
    move v6, v7

    .line 221
    :cond_0
    add-int/2addr v6, v1

    .line 222
    move v1, v6

    .line 223
    goto/16 :goto_5

    .line 224
    .line 225
    :pswitch_b
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-eqz v2, :cond_2

    .line 230
    .line 231
    mul-int/lit8 v1, v1, 0x35

    .line 232
    .line 233
    invoke-static {v4, v5, p1}, Lk64;->o(JLjava/lang/Object;)I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    goto/16 :goto_1

    .line 238
    .line 239
    :pswitch_c
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_2

    .line 244
    .line 245
    mul-int/lit8 v1, v1, 0x35

    .line 246
    .line 247
    invoke-static {v4, v5, p1}, Lk64;->p(JLjava/lang/Object;)J

    .line 248
    .line 249
    .line 250
    move-result-wide v2

    .line 251
    sget-object v4, Ly54;->a:Ljava/nio/charset/Charset;

    .line 252
    .line 253
    goto/16 :goto_2

    .line 254
    .line 255
    :pswitch_d
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_2

    .line 260
    .line 261
    mul-int/lit8 v1, v1, 0x35

    .line 262
    .line 263
    invoke-static {v4, v5, p1}, Lk64;->o(JLjava/lang/Object;)I

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :pswitch_e
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-eqz v2, :cond_2

    .line 274
    .line 275
    mul-int/lit8 v1, v1, 0x35

    .line 276
    .line 277
    invoke-static {v4, v5, p1}, Lk64;->p(JLjava/lang/Object;)J

    .line 278
    .line 279
    .line 280
    move-result-wide v2

    .line 281
    sget-object v4, Ly54;->a:Ljava/nio/charset/Charset;

    .line 282
    .line 283
    goto/16 :goto_2

    .line 284
    .line 285
    :pswitch_f
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_2

    .line 290
    .line 291
    mul-int/lit8 v1, v1, 0x35

    .line 292
    .line 293
    invoke-static {v4, v5, p1}, Lk64;->p(JLjava/lang/Object;)J

    .line 294
    .line 295
    .line 296
    move-result-wide v2

    .line 297
    sget-object v4, Ly54;->a:Ljava/nio/charset/Charset;

    .line 298
    .line 299
    goto/16 :goto_2

    .line 300
    .line 301
    :pswitch_10
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-eqz v2, :cond_2

    .line 306
    .line 307
    mul-int/lit8 v1, v1, 0x35

    .line 308
    .line 309
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    check-cast v2, Ljava/lang/Float;

    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    goto/16 :goto_1

    .line 324
    .line 325
    :pswitch_11
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    if-eqz v2, :cond_2

    .line 330
    .line 331
    mul-int/lit8 v1, v1, 0x35

    .line 332
    .line 333
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    check-cast v2, Ljava/lang/Double;

    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 340
    .line 341
    .line 342
    move-result-wide v2

    .line 343
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 344
    .line 345
    .line 346
    move-result-wide v2

    .line 347
    sget-object v4, Ly54;->a:Ljava/nio/charset/Charset;

    .line 348
    .line 349
    goto/16 :goto_2

    .line 350
    .line 351
    :pswitch_12
    mul-int/lit8 v1, v1, 0x35

    .line 352
    .line 353
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    goto/16 :goto_1

    .line 362
    .line 363
    :pswitch_13
    mul-int/lit8 v1, v1, 0x35

    .line 364
    .line 365
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    goto/16 :goto_1

    .line 374
    .line 375
    :pswitch_14
    mul-int/lit8 v1, v1, 0x35

    .line 376
    .line 377
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    if-eqz v2, :cond_1

    .line 382
    .line 383
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 384
    .line 385
    .line 386
    move-result v8

    .line 387
    :cond_1
    :goto_4
    add-int/2addr v1, v8

    .line 388
    goto/16 :goto_5

    .line 389
    .line 390
    :pswitch_15
    mul-int/lit8 v1, v1, 0x35

    .line 391
    .line 392
    invoke-static {v4, v5, p1}, Lg74;->i(JLjava/lang/Object;)J

    .line 393
    .line 394
    .line 395
    move-result-wide v2

    .line 396
    sget-object v4, Ly54;->a:Ljava/nio/charset/Charset;

    .line 397
    .line 398
    goto/16 :goto_2

    .line 399
    .line 400
    :pswitch_16
    mul-int/lit8 v1, v1, 0x35

    .line 401
    .line 402
    invoke-static {v4, v5, p1}, Lg74;->g(JLjava/lang/Object;)I

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    goto/16 :goto_1

    .line 407
    .line 408
    :pswitch_17
    mul-int/lit8 v1, v1, 0x35

    .line 409
    .line 410
    invoke-static {v4, v5, p1}, Lg74;->i(JLjava/lang/Object;)J

    .line 411
    .line 412
    .line 413
    move-result-wide v2

    .line 414
    sget-object v4, Ly54;->a:Ljava/nio/charset/Charset;

    .line 415
    .line 416
    goto/16 :goto_2

    .line 417
    .line 418
    :pswitch_18
    mul-int/lit8 v1, v1, 0x35

    .line 419
    .line 420
    invoke-static {v4, v5, p1}, Lg74;->g(JLjava/lang/Object;)I

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    goto/16 :goto_1

    .line 425
    .line 426
    :pswitch_19
    mul-int/lit8 v1, v1, 0x35

    .line 427
    .line 428
    invoke-static {v4, v5, p1}, Lg74;->g(JLjava/lang/Object;)I

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    goto/16 :goto_1

    .line 433
    .line 434
    :pswitch_1a
    mul-int/lit8 v1, v1, 0x35

    .line 435
    .line 436
    invoke-static {v4, v5, p1}, Lg74;->g(JLjava/lang/Object;)I

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    goto/16 :goto_1

    .line 441
    .line 442
    :pswitch_1b
    mul-int/lit8 v1, v1, 0x35

    .line 443
    .line 444
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    goto/16 :goto_1

    .line 453
    .line 454
    :pswitch_1c
    mul-int/lit8 v1, v1, 0x35

    .line 455
    .line 456
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    if-eqz v2, :cond_1

    .line 461
    .line 462
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 463
    .line 464
    .line 465
    move-result v8

    .line 466
    goto :goto_4

    .line 467
    :pswitch_1d
    mul-int/lit8 v1, v1, 0x35

    .line 468
    .line 469
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    check-cast v2, Ljava/lang/String;

    .line 474
    .line 475
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    goto/16 :goto_1

    .line 480
    .line 481
    :pswitch_1e
    mul-int/lit8 v1, v1, 0x35

    .line 482
    .line 483
    sget-object v2, Lg74;->c:Lf74;

    .line 484
    .line 485
    invoke-virtual {v2, v4, v5, p1}, Lf74;->t1(JLjava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    sget-object v3, Ly54;->a:Ljava/nio/charset/Charset;

    .line 490
    .line 491
    if-eqz v2, :cond_0

    .line 492
    .line 493
    goto/16 :goto_3

    .line 494
    .line 495
    :pswitch_1f
    mul-int/lit8 v1, v1, 0x35

    .line 496
    .line 497
    invoke-static {v4, v5, p1}, Lg74;->g(JLjava/lang/Object;)I

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    goto/16 :goto_1

    .line 502
    .line 503
    :pswitch_20
    mul-int/lit8 v1, v1, 0x35

    .line 504
    .line 505
    invoke-static {v4, v5, p1}, Lg74;->i(JLjava/lang/Object;)J

    .line 506
    .line 507
    .line 508
    move-result-wide v2

    .line 509
    sget-object v4, Ly54;->a:Ljava/nio/charset/Charset;

    .line 510
    .line 511
    goto/16 :goto_2

    .line 512
    .line 513
    :pswitch_21
    mul-int/lit8 v1, v1, 0x35

    .line 514
    .line 515
    invoke-static {v4, v5, p1}, Lg74;->g(JLjava/lang/Object;)I

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    goto/16 :goto_1

    .line 520
    .line 521
    :pswitch_22
    mul-int/lit8 v1, v1, 0x35

    .line 522
    .line 523
    invoke-static {v4, v5, p1}, Lg74;->i(JLjava/lang/Object;)J

    .line 524
    .line 525
    .line 526
    move-result-wide v2

    .line 527
    sget-object v4, Ly54;->a:Ljava/nio/charset/Charset;

    .line 528
    .line 529
    goto/16 :goto_2

    .line 530
    .line 531
    :pswitch_23
    mul-int/lit8 v1, v1, 0x35

    .line 532
    .line 533
    invoke-static {v4, v5, p1}, Lg74;->i(JLjava/lang/Object;)J

    .line 534
    .line 535
    .line 536
    move-result-wide v2

    .line 537
    sget-object v4, Ly54;->a:Ljava/nio/charset/Charset;

    .line 538
    .line 539
    goto/16 :goto_2

    .line 540
    .line 541
    :pswitch_24
    mul-int/lit8 v1, v1, 0x35

    .line 542
    .line 543
    sget-object v2, Lg74;->c:Lf74;

    .line 544
    .line 545
    invoke-virtual {v2, v4, v5, p1}, Lf74;->w1(JLjava/lang/Object;)F

    .line 546
    .line 547
    .line 548
    move-result v2

    .line 549
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 550
    .line 551
    .line 552
    move-result v2

    .line 553
    goto/16 :goto_1

    .line 554
    .line 555
    :pswitch_25
    mul-int/lit8 v1, v1, 0x35

    .line 556
    .line 557
    sget-object v2, Lg74;->c:Lf74;

    .line 558
    .line 559
    invoke-virtual {v2, v4, v5, p1}, Lf74;->y1(JLjava/lang/Object;)D

    .line 560
    .line 561
    .line 562
    move-result-wide v2

    .line 563
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 564
    .line 565
    .line 566
    move-result-wide v2

    .line 567
    sget-object v4, Ly54;->a:Ljava/nio/charset/Charset;

    .line 568
    .line 569
    goto/16 :goto_2

    .line 570
    .line 571
    :cond_2
    :goto_5
    add-int/lit8 v0, v0, 0x3

    .line 572
    .line 573
    goto/16 :goto_0

    .line 574
    .line 575
    :cond_3
    mul-int/lit8 v1, v1, 0x35

    .line 576
    .line 577
    iget-object p1, p1, Lp54;->zzt:Lb74;

    .line 578
    .line 579
    invoke-virtual {p1}, Lb74;->hashCode()I

    .line 580
    .line 581
    .line 582
    move-result p1

    .line 583
    add-int/2addr p1, v1

    .line 584
    return p1

    .line 585
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/Object;Lo9;Lh54;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    iget-object v0, v7, Lo9;->d:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v9, v0

    .line 10
    check-cast v9, Lm0;

    .line 11
    .line 12
    iget-object v10, v1, Lk64;->g:[I

    .line 13
    .line 14
    iget v11, v1, Lk64;->i:I

    .line 15
    .line 16
    iget v12, v1, Lk64;->h:I

    .line 17
    .line 18
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, Lk64;->n(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, Lk64;->j:Lpz;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    move-object v2, v0

    .line 28
    :goto_0
    :try_start_0
    invoke-virtual {v7}, Lo9;->A()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget v3, v1, Lk64;->c:I

    .line 33
    .line 34
    const/4 v13, 0x0

    .line 35
    if-lt v0, v3, :cond_0

    .line 36
    .line 37
    iget v3, v1, Lk64;->d:I

    .line 38
    .line 39
    if-gt v0, v3, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1, v0, v13}, Lk64;->w(II)I

    .line 42
    .line 43
    .line 44
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 45
    :goto_1
    move v6, v3

    .line 46
    goto :goto_2

    .line 47
    :cond_0
    const/4 v3, -0x1

    .line 48
    goto :goto_1

    .line 49
    :goto_2
    if-gez v6, :cond_5

    .line 50
    .line 51
    const v3, 0x7fffffff

    .line 52
    .line 53
    .line 54
    if-ne v0, v3, :cond_1

    .line 55
    .line 56
    move-object v4, v2

    .line 57
    :goto_3
    if-ge v12, v11, :cond_15

    .line 58
    .line 59
    aget v3, v10, v12

    .line 60
    .line 61
    move-object/from16 v6, p1

    .line 62
    .line 63
    move-object/from16 v2, p1

    .line 64
    .line 65
    invoke-virtual/range {v1 .. v6}, Lk64;->K(Ljava/lang/Object;ILjava/lang/Object;Lpz;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    add-int/lit8 v12, v12, 0x1

    .line 70
    .line 71
    move-object/from16 v1, p0

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_1
    if-nez v2, :cond_2

    .line 75
    .line 76
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static/range {p1 .. p1}, Lpz;->q(Ljava/lang/Object;)Lb74;

    .line 80
    .line 81
    .line 82
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 83
    move-object v2, v0

    .line 84
    goto :goto_5

    .line 85
    :goto_4
    move-object/from16 v18, v2

    .line 86
    .line 87
    goto/16 :goto_1c

    .line 88
    .line 89
    :cond_2
    :goto_5
    :try_start_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {v13, v7, v2}, Lpz;->r(ILo9;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 96
    if-nez v0, :cond_4

    .line 97
    .line 98
    move-object v4, v2

    .line 99
    :goto_6
    if-ge v12, v11, :cond_3

    .line 100
    .line 101
    aget v3, v10, v12

    .line 102
    .line 103
    move-object/from16 v6, p1

    .line 104
    .line 105
    move-object/from16 v1, p0

    .line 106
    .line 107
    move-object/from16 v2, p1

    .line 108
    .line 109
    invoke-virtual/range {v1 .. v6}, Lk64;->K(Ljava/lang/Object;ILjava/lang/Object;Lpz;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    add-int/lit8 v12, v12, 0x1

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_3
    move-object/from16 v1, p0

    .line 117
    .line 118
    goto/16 :goto_1b

    .line 119
    .line 120
    :cond_4
    move-object/from16 v1, p0

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    move-object/from16 v1, p0

    .line 125
    .line 126
    goto/16 :goto_1d

    .line 127
    .line 128
    :cond_5
    :try_start_3
    invoke-virtual {v1, v6}, Lk64;->k(I)I

    .line 129
    .line 130
    .line 131
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 132
    :try_start_4
    invoke-static {v3}, Lk64;->l(I)I

    .line 133
    .line 134
    .line 135
    move-result v4
    :try_end_4
    .catch Lz54; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_a

    .line 136
    const/4 v15, 0x3

    .line 137
    const/4 v14, 0x1

    .line 138
    const v16, 0xfffff

    .line 139
    .line 140
    .line 141
    packed-switch v4, :pswitch_data_0

    .line 142
    .line 143
    .line 144
    if-nez v2, :cond_6

    .line 145
    .line 146
    :try_start_5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-static/range {p1 .. p1}, Lpz;->q(Ljava/lang/Object;)Lb74;

    .line 150
    .line 151
    .line 152
    move-result-object v0
    :try_end_5
    .catch Lz54; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 153
    move-object v2, v0

    .line 154
    goto :goto_7

    .line 155
    :catch_0
    move-object v15, v1

    .line 156
    move-object/from16 v18, v2

    .line 157
    .line 158
    move-object/from16 v17, v5

    .line 159
    .line 160
    move-object/from16 v1, p1

    .line 161
    .line 162
    goto/16 :goto_18

    .line 163
    .line 164
    :cond_6
    :goto_7
    :try_start_6
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {v13, v7, v2}, Lpz;->r(ILo9;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v0
    :try_end_6
    .catch Lz54; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 171
    if-nez v0, :cond_9

    .line 172
    .line 173
    move-object v4, v2

    .line 174
    :goto_8
    if-ge v12, v11, :cond_7

    .line 175
    .line 176
    aget v3, v10, v12

    .line 177
    .line 178
    move-object/from16 v6, p1

    .line 179
    .line 180
    move-object/from16 v2, p1

    .line 181
    .line 182
    invoke-virtual/range {v1 .. v6}, Lk64;->K(Ljava/lang/Object;ILjava/lang/Object;Lpz;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    move-object/from16 v17, v5

    .line 187
    .line 188
    move-object v5, v2

    .line 189
    add-int/lit8 v12, v12, 0x1

    .line 190
    .line 191
    move-object/from16 v5, v17

    .line 192
    .line 193
    goto :goto_8

    .line 194
    :cond_7
    move-object/from16 v17, v5

    .line 195
    .line 196
    move-object/from16 v5, p1

    .line 197
    .line 198
    :cond_8
    move-object/from16 v5, v17

    .line 199
    .line 200
    goto/16 :goto_1b

    .line 201
    .line 202
    :cond_9
    move-object/from16 v17, v5

    .line 203
    .line 204
    move-object/from16 v5, p1

    .line 205
    .line 206
    :goto_9
    move-object/from16 v5, v17

    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :catchall_1
    move-exception v0

    .line 211
    move-object/from16 v17, v5

    .line 212
    .line 213
    move-object/from16 v5, p1

    .line 214
    .line 215
    goto :goto_a

    .line 216
    :catch_1
    move-object/from16 v17, v5

    .line 217
    .line 218
    move-object/from16 v5, p1

    .line 219
    .line 220
    goto :goto_b

    .line 221
    :goto_a
    move-object/from16 v5, v17

    .line 222
    .line 223
    goto/16 :goto_1d

    .line 224
    .line 225
    :goto_b
    move-object v15, v1

    .line 226
    move-object v1, v5

    .line 227
    goto/16 :goto_19

    .line 228
    .line 229
    :pswitch_0
    move-object/from16 v17, v5

    .line 230
    .line 231
    move-object/from16 v5, p1

    .line 232
    .line 233
    :try_start_7
    invoke-virtual {v1, v0, v5, v6}, Lk64;->I(ILjava/lang/Object;I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    check-cast v3, Ls44;

    .line 238
    .line 239
    invoke-virtual {v1, v6}, Lk64;->D(I)Lv64;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-virtual {v7, v15}, Lo9;->t(I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7, v3, v4, v8}, Lo9;->v(Ljava/lang/Object;Lv64;Lh54;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1, v5, v0, v3, v6}, Lk64;->J(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 250
    .line 251
    .line 252
    :goto_c
    move-object v15, v1

    .line 253
    move-object/from16 v18, v2

    .line 254
    .line 255
    move-object v1, v5

    .line 256
    goto/16 :goto_17

    .line 257
    .line 258
    :catchall_2
    move-exception v0

    .line 259
    move-object/from16 v18, v2

    .line 260
    .line 261
    :goto_d
    move-object/from16 v5, v17

    .line 262
    .line 263
    goto/16 :goto_1c

    .line 264
    .line 265
    :catch_2
    move-object v15, v1

    .line 266
    move-object/from16 v18, v2

    .line 267
    .line 268
    move-object v1, v5

    .line 269
    goto/16 :goto_18

    .line 270
    .line 271
    :pswitch_1
    move-object/from16 v17, v5

    .line 272
    .line 273
    move-object/from16 v5, p1

    .line 274
    .line 275
    and-int v3, v3, v16

    .line 276
    .line 277
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v9}, Lm0;->C()J

    .line 281
    .line 282
    .line 283
    move-result-wide v14

    .line 284
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    int-to-long v14, v3

    .line 289
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 293
    .line 294
    .line 295
    goto :goto_c

    .line 296
    :pswitch_2
    move-object/from16 v17, v5

    .line 297
    .line 298
    move-object/from16 v5, p1

    .line 299
    .line 300
    and-int v3, v3, v16

    .line 301
    .line 302
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v9}, Lm0;->B()I

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    int-to-long v14, v3

    .line 314
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 318
    .line 319
    .line 320
    goto :goto_c

    .line 321
    :pswitch_3
    move-object/from16 v17, v5

    .line 322
    .line 323
    move-object/from16 v5, p1

    .line 324
    .line 325
    and-int v3, v3, v16

    .line 326
    .line 327
    invoke-virtual {v7, v14}, Lo9;->t(I)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v9}, Lm0;->A()J

    .line 331
    .line 332
    .line 333
    move-result-wide v14

    .line 334
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    int-to-long v14, v3

    .line 339
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 343
    .line 344
    .line 345
    goto :goto_c

    .line 346
    :pswitch_4
    move-object/from16 v17, v5

    .line 347
    .line 348
    move-object/from16 v5, p1

    .line 349
    .line 350
    and-int v3, v3, v16

    .line 351
    .line 352
    const/4 v4, 0x5

    .line 353
    invoke-virtual {v7, v4}, Lo9;->t(I)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v9}, Lm0;->z()I

    .line 357
    .line 358
    .line 359
    move-result v4

    .line 360
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    int-to-long v14, v3

    .line 365
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 369
    .line 370
    .line 371
    goto :goto_c

    .line 372
    :pswitch_5
    move-object/from16 v17, v5

    .line 373
    .line 374
    move-object/from16 v5, p1

    .line 375
    .line 376
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v9}, Lm0;->y()I

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    invoke-virtual {v1, v6}, Lk64;->F(I)Ls54;

    .line 384
    .line 385
    .line 386
    move-result-object v14

    .line 387
    if-eqz v14, :cond_c

    .line 388
    .line 389
    invoke-interface {v14, v4}, Ls54;->a(I)Z

    .line 390
    .line 391
    .line 392
    move-result v14

    .line 393
    if-eqz v14, :cond_a

    .line 394
    .line 395
    goto :goto_10

    .line 396
    :cond_a
    sget-object v3, Lw64;->a:Lpz;

    .line 397
    .line 398
    if-nez v2, :cond_b

    .line 399
    .line 400
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-static {v5}, Lpz;->q(Ljava/lang/Object;)Lb74;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    goto :goto_e

    .line 408
    :cond_b
    move-object v3, v2

    .line 409
    :goto_e
    int-to-long v14, v4

    .line 410
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    move-object v4, v3

    .line 414
    check-cast v4, Lb74;

    .line 415
    .line 416
    shl-int/lit8 v0, v0, 0x3

    .line 417
    .line 418
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    invoke-virtual {v4, v0, v6}, Lb74;->d(ILjava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    :goto_f
    move-object v2, v3

    .line 426
    goto/16 :goto_9

    .line 427
    .line 428
    :cond_c
    :goto_10
    and-int v3, v3, v16

    .line 429
    .line 430
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 431
    .line 432
    .line 433
    move-result-object v4

    .line 434
    int-to-long v14, v3

    .line 435
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 439
    .line 440
    .line 441
    goto/16 :goto_c

    .line 442
    .line 443
    :pswitch_6
    move-object/from16 v17, v5

    .line 444
    .line 445
    move-object/from16 v5, p1

    .line 446
    .line 447
    and-int v3, v3, v16

    .line 448
    .line 449
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v9}, Lm0;->x()I

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    int-to-long v14, v3

    .line 461
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 465
    .line 466
    .line 467
    goto/16 :goto_c

    .line 468
    .line 469
    :pswitch_7
    move-object/from16 v17, v5

    .line 470
    .line 471
    move-object/from16 v5, p1

    .line 472
    .line 473
    and-int v3, v3, v16

    .line 474
    .line 475
    invoke-virtual {v7}, Lo9;->B()La54;

    .line 476
    .line 477
    .line 478
    move-result-object v4

    .line 479
    int-to-long v14, v3

    .line 480
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 484
    .line 485
    .line 486
    goto/16 :goto_c

    .line 487
    .line 488
    :pswitch_8
    move-object/from16 v17, v5

    .line 489
    .line 490
    move-object/from16 v5, p1

    .line 491
    .line 492
    invoke-virtual {v1, v0, v5, v6}, Lk64;->I(ILjava/lang/Object;I)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    check-cast v3, Ls44;

    .line 497
    .line 498
    invoke-virtual {v1, v6}, Lk64;->D(I)Lv64;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    const/4 v14, 0x2

    .line 503
    invoke-virtual {v7, v14}, Lo9;->t(I)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v7, v3, v4, v8}, Lo9;->u(Ljava/lang/Object;Lv64;Lh54;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1, v5, v0, v3, v6}, Lk64;->J(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 510
    .line 511
    .line 512
    goto/16 :goto_c

    .line 513
    .line 514
    :pswitch_9
    move-object/from16 v17, v5

    .line 515
    .line 516
    move-object/from16 v5, p1

    .line 517
    .line 518
    invoke-virtual {v1, v3, v7, v5}, Lk64;->L(ILo9;Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 522
    .line 523
    .line 524
    goto/16 :goto_c

    .line 525
    .line 526
    :pswitch_a
    move-object/from16 v17, v5

    .line 527
    .line 528
    move-object/from16 v5, p1

    .line 529
    .line 530
    and-int v3, v3, v16

    .line 531
    .line 532
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v9}, Lm0;->t()Z

    .line 536
    .line 537
    .line 538
    move-result v4

    .line 539
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 540
    .line 541
    .line 542
    move-result-object v4

    .line 543
    int-to-long v14, v3

    .line 544
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 548
    .line 549
    .line 550
    goto/16 :goto_c

    .line 551
    .line 552
    :pswitch_b
    move-object/from16 v17, v5

    .line 553
    .line 554
    move-object/from16 v5, p1

    .line 555
    .line 556
    and-int v3, v3, v16

    .line 557
    .line 558
    const/4 v4, 0x5

    .line 559
    invoke-virtual {v7, v4}, Lo9;->t(I)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v9}, Lm0;->s()I

    .line 563
    .line 564
    .line 565
    move-result v4

    .line 566
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    int-to-long v14, v3

    .line 571
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 575
    .line 576
    .line 577
    goto/16 :goto_c

    .line 578
    .line 579
    :pswitch_c
    move-object/from16 v17, v5

    .line 580
    .line 581
    move-object/from16 v5, p1

    .line 582
    .line 583
    and-int v3, v3, v16

    .line 584
    .line 585
    invoke-virtual {v7, v14}, Lo9;->t(I)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v9}, Lm0;->r()J

    .line 589
    .line 590
    .line 591
    move-result-wide v14

    .line 592
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 593
    .line 594
    .line 595
    move-result-object v4

    .line 596
    int-to-long v14, v3

    .line 597
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 601
    .line 602
    .line 603
    goto/16 :goto_c

    .line 604
    .line 605
    :pswitch_d
    move-object/from16 v17, v5

    .line 606
    .line 607
    move-object/from16 v5, p1

    .line 608
    .line 609
    and-int v3, v3, v16

    .line 610
    .line 611
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v9}, Lm0;->q()I

    .line 615
    .line 616
    .line 617
    move-result v4

    .line 618
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 619
    .line 620
    .line 621
    move-result-object v4

    .line 622
    int-to-long v14, v3

    .line 623
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 627
    .line 628
    .line 629
    goto/16 :goto_c

    .line 630
    .line 631
    :pswitch_e
    move-object/from16 v17, v5

    .line 632
    .line 633
    move-object/from16 v5, p1

    .line 634
    .line 635
    and-int v3, v3, v16

    .line 636
    .line 637
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v9}, Lm0;->o()J

    .line 641
    .line 642
    .line 643
    move-result-wide v14

    .line 644
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 645
    .line 646
    .line 647
    move-result-object v4

    .line 648
    int-to-long v14, v3

    .line 649
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 653
    .line 654
    .line 655
    goto/16 :goto_c

    .line 656
    .line 657
    :pswitch_f
    move-object/from16 v17, v5

    .line 658
    .line 659
    move-object/from16 v5, p1

    .line 660
    .line 661
    and-int v3, v3, v16

    .line 662
    .line 663
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v9}, Lm0;->p()J

    .line 667
    .line 668
    .line 669
    move-result-wide v14

    .line 670
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 671
    .line 672
    .line 673
    move-result-object v4

    .line 674
    int-to-long v14, v3

    .line 675
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 679
    .line 680
    .line 681
    goto/16 :goto_c

    .line 682
    .line 683
    :pswitch_10
    move-object/from16 v17, v5

    .line 684
    .line 685
    move-object/from16 v5, p1

    .line 686
    .line 687
    and-int v3, v3, v16

    .line 688
    .line 689
    const/4 v4, 0x5

    .line 690
    invoke-virtual {v7, v4}, Lo9;->t(I)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v9}, Lm0;->n()F

    .line 694
    .line 695
    .line 696
    move-result v4

    .line 697
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 698
    .line 699
    .line 700
    move-result-object v4

    .line 701
    int-to-long v14, v3

    .line 702
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 706
    .line 707
    .line 708
    goto/16 :goto_c

    .line 709
    .line 710
    :pswitch_11
    move-object/from16 v17, v5

    .line 711
    .line 712
    move-object/from16 v5, p1

    .line 713
    .line 714
    and-int v3, v3, v16

    .line 715
    .line 716
    invoke-virtual {v7, v14}, Lo9;->t(I)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v9}, Lm0;->m()D

    .line 720
    .line 721
    .line 722
    move-result-wide v14

    .line 723
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 724
    .line 725
    .line 726
    move-result-object v4

    .line 727
    int-to-long v14, v3

    .line 728
    invoke-static {v5, v14, v15, v4}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v1, v0, v5, v6}, Lk64;->v(ILjava/lang/Object;I)V

    .line 732
    .line 733
    .line 734
    goto/16 :goto_c

    .line 735
    .line 736
    :pswitch_12
    move-object/from16 v17, v5

    .line 737
    .line 738
    move-object/from16 v5, p1

    .line 739
    .line 740
    invoke-virtual {v1, v6}, Lk64;->E(I)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual {v1, v6}, Lk64;->k(I)I

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    and-int v3, v3, v16

    .line 749
    .line 750
    int-to-long v3, v3

    .line 751
    invoke-static {v3, v4, v5}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v6

    .line 755
    if-nez v6, :cond_d

    .line 756
    .line 757
    sget-object v6, Lg64;->g:Lg64;

    .line 758
    .line 759
    invoke-virtual {v6}, Lg64;->a()Lg64;

    .line 760
    .line 761
    .line 762
    move-result-object v6

    .line 763
    invoke-static {v5, v3, v4, v6}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 764
    .line 765
    .line 766
    goto :goto_11

    .line 767
    :cond_d
    move-object v14, v6

    .line 768
    check-cast v14, Lg64;

    .line 769
    .line 770
    iget-boolean v14, v14, Lg64;->f:Z

    .line 771
    .line 772
    if-nez v14, :cond_e

    .line 773
    .line 774
    sget-object v14, Lg64;->g:Lg64;

    .line 775
    .line 776
    invoke-virtual {v14}, Lg64;->a()Lg64;

    .line 777
    .line 778
    .line 779
    move-result-object v14

    .line 780
    invoke-static {v14, v6}, Ly24;->h(Ljava/lang/Object;Ljava/lang/Object;)Lg64;

    .line 781
    .line 782
    .line 783
    invoke-static {v5, v3, v4, v14}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 784
    .line 785
    .line 786
    move-object v6, v14

    .line 787
    :cond_e
    :goto_11
    check-cast v6, Lg64;

    .line 788
    .line 789
    check-cast v0, Lf64;

    .line 790
    .line 791
    invoke-virtual {v0}, Lf64;->b()Ljr3;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    invoke-virtual {v7, v6, v0, v8}, Lo9;->s(Lg64;Ljr3;Lh54;)V

    .line 796
    .line 797
    .line 798
    goto/16 :goto_c

    .line 799
    .line 800
    :pswitch_13
    move-object/from16 v17, v5

    .line 801
    .line 802
    move-object/from16 v5, p1

    .line 803
    .line 804
    and-int v0, v3, v16

    .line 805
    .line 806
    invoke-virtual {v1, v6}, Lk64;->D(I)Lv64;

    .line 807
    .line 808
    .line 809
    move-result-object v3

    .line 810
    int-to-long v14, v0

    .line 811
    invoke-static {v14, v15, v5}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    invoke-virtual {v7, v0, v3, v8}, Lo9;->k(Lx54;Lv64;Lh54;)V

    .line 816
    .line 817
    .line 818
    goto/16 :goto_c

    .line 819
    .line 820
    :pswitch_14
    move-object/from16 v17, v5

    .line 821
    .line 822
    move-object/from16 v5, p1

    .line 823
    .line 824
    and-int v0, v3, v16

    .line 825
    .line 826
    int-to-long v3, v0

    .line 827
    invoke-static {v3, v4, v5}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    invoke-virtual {v7, v0}, Lo9;->r(Lx54;)V

    .line 832
    .line 833
    .line 834
    goto/16 :goto_c

    .line 835
    .line 836
    :pswitch_15
    move-object/from16 v17, v5

    .line 837
    .line 838
    move-object/from16 v5, p1

    .line 839
    .line 840
    and-int v0, v3, v16

    .line 841
    .line 842
    int-to-long v3, v0

    .line 843
    invoke-static {v3, v4, v5}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    invoke-virtual {v7, v0}, Lo9;->q(Lx54;)V

    .line 848
    .line 849
    .line 850
    goto/16 :goto_c

    .line 851
    .line 852
    :pswitch_16
    move-object/from16 v17, v5

    .line 853
    .line 854
    move-object/from16 v5, p1

    .line 855
    .line 856
    and-int v0, v3, v16

    .line 857
    .line 858
    int-to-long v3, v0

    .line 859
    invoke-static {v3, v4, v5}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-virtual {v7, v0}, Lo9;->p(Lx54;)V

    .line 864
    .line 865
    .line 866
    goto/16 :goto_c

    .line 867
    .line 868
    :pswitch_17
    move-object/from16 v17, v5

    .line 869
    .line 870
    move-object/from16 v5, p1

    .line 871
    .line 872
    and-int v0, v3, v16

    .line 873
    .line 874
    int-to-long v3, v0

    .line 875
    invoke-static {v3, v4, v5}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    invoke-virtual {v7, v0}, Lo9;->o(Lx54;)V
    :try_end_7
    .catch Lz54; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 880
    .line 881
    .line 882
    goto/16 :goto_c

    .line 883
    .line 884
    :pswitch_18
    move-object/from16 v17, v5

    .line 885
    .line 886
    move-object/from16 v5, p1

    .line 887
    .line 888
    and-int v3, v3, v16

    .line 889
    .line 890
    int-to-long v3, v3

    .line 891
    :try_start_8
    invoke-static {v3, v4, v5}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 892
    .line 893
    .line 894
    move-result-object v3

    .line 895
    invoke-virtual {v7, v3}, Lo9;->n(Lx54;)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v1, v6}, Lk64;->F(I)Ls54;

    .line 899
    .line 900
    .line 901
    move-result-object v4
    :try_end_8
    .catch Lz54; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 902
    move-object v15, v1

    .line 903
    move-object v1, v5

    .line 904
    move-object/from16 v6, v17

    .line 905
    .line 906
    move-object v5, v2

    .line 907
    move v2, v0

    .line 908
    :try_start_9
    invoke-static/range {v1 .. v6}, Lw64;->e(Ljava/lang/Object;ILx54;Ls54;Ljava/lang/Object;Lpz;)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v2
    :try_end_9
    .catch Lz54; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 912
    move-object v5, v6

    .line 913
    move-object v1, v15

    .line 914
    goto/16 :goto_0

    .line 915
    .line 916
    :catchall_3
    move-exception v0

    .line 917
    move-object v2, v5

    .line 918
    move-object v5, v6

    .line 919
    goto/16 :goto_4

    .line 920
    .line 921
    :catch_3
    move-object/from16 v18, v5

    .line 922
    .line 923
    move-object/from16 v17, v6

    .line 924
    .line 925
    goto/16 :goto_18

    .line 926
    .line 927
    :catchall_4
    move-exception v0

    .line 928
    move-object v15, v1

    .line 929
    move-object v1, v5

    .line 930
    move-object/from16 v5, v17

    .line 931
    .line 932
    goto/16 :goto_4

    .line 933
    .line 934
    :catch_4
    move-object v15, v1

    .line 935
    move-object v1, v5

    .line 936
    move-object/from16 v18, v2

    .line 937
    .line 938
    goto/16 :goto_18

    .line 939
    .line 940
    :pswitch_19
    move-object v15, v1

    .line 941
    move-object/from16 v1, p1

    .line 942
    .line 943
    and-int v0, v3, v16

    .line 944
    .line 945
    int-to-long v3, v0

    .line 946
    :try_start_a
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    invoke-virtual {v7, v0}, Lo9;->m(Lx54;)V

    .line 951
    .line 952
    .line 953
    :goto_12
    move-object/from16 v18, v2

    .line 954
    .line 955
    move-object/from16 v17, v5

    .line 956
    .line 957
    goto/16 :goto_17

    .line 958
    .line 959
    :catchall_5
    move-exception v0

    .line 960
    goto/16 :goto_4

    .line 961
    .line 962
    :catch_5
    move-object/from16 v18, v2

    .line 963
    .line 964
    move-object/from16 v17, v5

    .line 965
    .line 966
    goto/16 :goto_18

    .line 967
    .line 968
    :pswitch_1a
    move-object v15, v1

    .line 969
    move-object/from16 v1, p1

    .line 970
    .line 971
    and-int v0, v3, v16

    .line 972
    .line 973
    int-to-long v3, v0

    .line 974
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    invoke-virtual {v7, v0}, Lo9;->h(Lx54;)V

    .line 979
    .line 980
    .line 981
    goto :goto_12

    .line 982
    :pswitch_1b
    move-object v15, v1

    .line 983
    move-object/from16 v1, p1

    .line 984
    .line 985
    and-int v0, v3, v16

    .line 986
    .line 987
    int-to-long v3, v0

    .line 988
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    invoke-virtual {v7, v0}, Lo9;->g(Lx54;)V

    .line 993
    .line 994
    .line 995
    goto :goto_12

    .line 996
    :pswitch_1c
    move-object v15, v1

    .line 997
    move-object/from16 v1, p1

    .line 998
    .line 999
    and-int v0, v3, v16

    .line 1000
    .line 1001
    int-to-long v3, v0

    .line 1002
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    invoke-virtual {v7, v0}, Lo9;->f(Lx54;)V

    .line 1007
    .line 1008
    .line 1009
    goto :goto_12

    .line 1010
    :pswitch_1d
    move-object v15, v1

    .line 1011
    move-object/from16 v1, p1

    .line 1012
    .line 1013
    and-int v0, v3, v16

    .line 1014
    .line 1015
    int-to-long v3, v0

    .line 1016
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    invoke-virtual {v7, v0}, Lo9;->e(Lx54;)V

    .line 1021
    .line 1022
    .line 1023
    goto :goto_12

    .line 1024
    :pswitch_1e
    move-object v15, v1

    .line 1025
    move-object/from16 v1, p1

    .line 1026
    .line 1027
    and-int v0, v3, v16

    .line 1028
    .line 1029
    int-to-long v3, v0

    .line 1030
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    invoke-virtual {v7, v0}, Lo9;->E(Lx54;)V

    .line 1035
    .line 1036
    .line 1037
    goto :goto_12

    .line 1038
    :pswitch_1f
    move-object v15, v1

    .line 1039
    move-object/from16 v1, p1

    .line 1040
    .line 1041
    and-int v0, v3, v16

    .line 1042
    .line 1043
    int-to-long v3, v0

    .line 1044
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    invoke-virtual {v7, v0}, Lo9;->d(Lx54;)V

    .line 1049
    .line 1050
    .line 1051
    goto :goto_12

    .line 1052
    :pswitch_20
    move-object v15, v1

    .line 1053
    move-object/from16 v1, p1

    .line 1054
    .line 1055
    and-int v0, v3, v16

    .line 1056
    .line 1057
    int-to-long v3, v0

    .line 1058
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v0

    .line 1062
    invoke-virtual {v7, v0}, Lo9;->D(Lx54;)V

    .line 1063
    .line 1064
    .line 1065
    goto :goto_12

    .line 1066
    :pswitch_21
    move-object v15, v1

    .line 1067
    move-object/from16 v1, p1

    .line 1068
    .line 1069
    and-int v0, v3, v16

    .line 1070
    .line 1071
    int-to-long v3, v0

    .line 1072
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v0

    .line 1076
    invoke-virtual {v7, v0}, Lo9;->C(Lx54;)V

    .line 1077
    .line 1078
    .line 1079
    goto :goto_12

    .line 1080
    :pswitch_22
    move-object v15, v1

    .line 1081
    move-object/from16 v1, p1

    .line 1082
    .line 1083
    and-int v0, v3, v16

    .line 1084
    .line 1085
    int-to-long v3, v0

    .line 1086
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    invoke-virtual {v7, v0}, Lo9;->r(Lx54;)V

    .line 1091
    .line 1092
    .line 1093
    goto/16 :goto_12

    .line 1094
    .line 1095
    :pswitch_23
    move-object v15, v1

    .line 1096
    move-object/from16 v1, p1

    .line 1097
    .line 1098
    and-int v0, v3, v16

    .line 1099
    .line 1100
    int-to-long v3, v0

    .line 1101
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    invoke-virtual {v7, v0}, Lo9;->q(Lx54;)V

    .line 1106
    .line 1107
    .line 1108
    goto/16 :goto_12

    .line 1109
    .line 1110
    :pswitch_24
    move-object v15, v1

    .line 1111
    move-object/from16 v1, p1

    .line 1112
    .line 1113
    and-int v0, v3, v16

    .line 1114
    .line 1115
    int-to-long v3, v0

    .line 1116
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v0

    .line 1120
    invoke-virtual {v7, v0}, Lo9;->p(Lx54;)V

    .line 1121
    .line 1122
    .line 1123
    goto/16 :goto_12

    .line 1124
    .line 1125
    :pswitch_25
    move-object v15, v1

    .line 1126
    move-object/from16 v1, p1

    .line 1127
    .line 1128
    and-int v0, v3, v16

    .line 1129
    .line 1130
    int-to-long v3, v0

    .line 1131
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    invoke-virtual {v7, v0}, Lo9;->o(Lx54;)V
    :try_end_a
    .catch Lz54; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 1136
    .line 1137
    .line 1138
    goto/16 :goto_12

    .line 1139
    .line 1140
    :pswitch_26
    move-object v15, v1

    .line 1141
    move-object/from16 v17, v5

    .line 1142
    .line 1143
    move-object/from16 v1, p1

    .line 1144
    .line 1145
    move-object v5, v2

    .line 1146
    move v2, v0

    .line 1147
    and-int v0, v3, v16

    .line 1148
    .line 1149
    int-to-long v3, v0

    .line 1150
    :try_start_b
    invoke-static {v3, v4, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v3

    .line 1154
    invoke-virtual {v7, v3}, Lo9;->n(Lx54;)V

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v15, v6}, Lk64;->F(I)Ls54;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v4
    :try_end_b
    .catch Lz54; {:try_start_b .. :try_end_b} :catch_6
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 1161
    move-object/from16 v6, v17

    .line 1162
    .line 1163
    :try_start_c
    invoke-static/range {v1 .. v6}, Lw64;->e(Ljava/lang/Object;ILx54;Ls54;Ljava/lang/Object;Lpz;)Ljava/lang/Object;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v2
    :try_end_c
    .catch Lz54; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 1167
    move-object/from16 v17, v6

    .line 1168
    .line 1169
    move-object v1, v15

    .line 1170
    goto/16 :goto_9

    .line 1171
    .line 1172
    :catchall_6
    move-exception v0

    .line 1173
    move-object/from16 v18, v5

    .line 1174
    .line 1175
    move-object/from16 v17, v6

    .line 1176
    .line 1177
    goto/16 :goto_d

    .line 1178
    .line 1179
    :catchall_7
    move-exception v0

    .line 1180
    move-object/from16 v18, v5

    .line 1181
    .line 1182
    goto/16 :goto_d

    .line 1183
    .line 1184
    :catch_6
    move-object/from16 v18, v5

    .line 1185
    .line 1186
    goto/16 :goto_18

    .line 1187
    .line 1188
    :pswitch_27
    move-object v15, v1

    .line 1189
    move-object/from16 v18, v2

    .line 1190
    .line 1191
    move-object/from16 v17, v5

    .line 1192
    .line 1193
    move-object/from16 v1, p1

    .line 1194
    .line 1195
    and-int v0, v3, v16

    .line 1196
    .line 1197
    int-to-long v2, v0

    .line 1198
    :try_start_d
    invoke-static {v2, v3, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    invoke-virtual {v7, v0}, Lo9;->m(Lx54;)V

    .line 1203
    .line 1204
    .line 1205
    goto/16 :goto_17

    .line 1206
    .line 1207
    :catchall_8
    move-exception v0

    .line 1208
    goto/16 :goto_d

    .line 1209
    .line 1210
    :pswitch_28
    move-object v15, v1

    .line 1211
    move-object/from16 v18, v2

    .line 1212
    .line 1213
    move-object/from16 v17, v5

    .line 1214
    .line 1215
    move-object/from16 v1, p1

    .line 1216
    .line 1217
    and-int v0, v3, v16

    .line 1218
    .line 1219
    int-to-long v2, v0

    .line 1220
    invoke-static {v2, v3, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v0

    .line 1224
    invoke-virtual {v7, v0}, Lo9;->l(Lx54;)V

    .line 1225
    .line 1226
    .line 1227
    goto/16 :goto_17

    .line 1228
    .line 1229
    :pswitch_29
    move-object v15, v1

    .line 1230
    move-object/from16 v18, v2

    .line 1231
    .line 1232
    move-object/from16 v17, v5

    .line 1233
    .line 1234
    move-object/from16 v1, p1

    .line 1235
    .line 1236
    invoke-virtual {v15, v6}, Lk64;->D(I)Lv64;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    and-int v2, v3, v16

    .line 1241
    .line 1242
    int-to-long v2, v2

    .line 1243
    invoke-static {v2, v3, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v2

    .line 1247
    invoke-virtual {v7, v2, v0, v8}, Lo9;->j(Lx54;Lv64;Lh54;)V

    .line 1248
    .line 1249
    .line 1250
    goto/16 :goto_17

    .line 1251
    .line 1252
    :pswitch_2a
    move-object v15, v1

    .line 1253
    move-object/from16 v18, v2

    .line 1254
    .line 1255
    move-object/from16 v17, v5

    .line 1256
    .line 1257
    move-object/from16 v1, p1

    .line 1258
    .line 1259
    const/high16 v0, 0x20000000

    .line 1260
    .line 1261
    and-int/2addr v0, v3

    .line 1262
    if-eqz v0, :cond_f

    .line 1263
    .line 1264
    move v0, v14

    .line 1265
    goto :goto_13

    .line 1266
    :cond_f
    move v0, v13

    .line 1267
    :goto_13
    if-eqz v0, :cond_10

    .line 1268
    .line 1269
    and-int v0, v3, v16

    .line 1270
    .line 1271
    int-to-long v2, v0

    .line 1272
    invoke-static {v2, v3, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v0

    .line 1276
    invoke-virtual {v7, v0, v14}, Lo9;->i(Lx54;Z)V

    .line 1277
    .line 1278
    .line 1279
    goto/16 :goto_17

    .line 1280
    .line 1281
    :cond_10
    and-int v0, v3, v16

    .line 1282
    .line 1283
    int-to-long v2, v0

    .line 1284
    invoke-static {v2, v3, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v0

    .line 1288
    invoke-virtual {v7, v0, v13}, Lo9;->i(Lx54;Z)V

    .line 1289
    .line 1290
    .line 1291
    goto/16 :goto_17

    .line 1292
    .line 1293
    :pswitch_2b
    move-object v15, v1

    .line 1294
    move-object/from16 v18, v2

    .line 1295
    .line 1296
    move-object/from16 v17, v5

    .line 1297
    .line 1298
    move-object/from16 v1, p1

    .line 1299
    .line 1300
    and-int v0, v3, v16

    .line 1301
    .line 1302
    int-to-long v2, v0

    .line 1303
    invoke-static {v2, v3, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    invoke-virtual {v7, v0}, Lo9;->h(Lx54;)V

    .line 1308
    .line 1309
    .line 1310
    goto/16 :goto_17

    .line 1311
    .line 1312
    :pswitch_2c
    move-object v15, v1

    .line 1313
    move-object/from16 v18, v2

    .line 1314
    .line 1315
    move-object/from16 v17, v5

    .line 1316
    .line 1317
    move-object/from16 v1, p1

    .line 1318
    .line 1319
    and-int v0, v3, v16

    .line 1320
    .line 1321
    int-to-long v2, v0

    .line 1322
    invoke-static {v2, v3, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v0

    .line 1326
    invoke-virtual {v7, v0}, Lo9;->g(Lx54;)V

    .line 1327
    .line 1328
    .line 1329
    goto/16 :goto_17

    .line 1330
    .line 1331
    :pswitch_2d
    move-object v15, v1

    .line 1332
    move-object/from16 v18, v2

    .line 1333
    .line 1334
    move-object/from16 v17, v5

    .line 1335
    .line 1336
    move-object/from16 v1, p1

    .line 1337
    .line 1338
    and-int v0, v3, v16

    .line 1339
    .line 1340
    int-to-long v2, v0

    .line 1341
    invoke-static {v2, v3, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v0

    .line 1345
    invoke-virtual {v7, v0}, Lo9;->f(Lx54;)V

    .line 1346
    .line 1347
    .line 1348
    goto/16 :goto_17

    .line 1349
    .line 1350
    :pswitch_2e
    move-object v15, v1

    .line 1351
    move-object/from16 v18, v2

    .line 1352
    .line 1353
    move-object/from16 v17, v5

    .line 1354
    .line 1355
    move-object/from16 v1, p1

    .line 1356
    .line 1357
    and-int v0, v3, v16

    .line 1358
    .line 1359
    int-to-long v2, v0

    .line 1360
    invoke-static {v2, v3, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v0

    .line 1364
    invoke-virtual {v7, v0}, Lo9;->e(Lx54;)V

    .line 1365
    .line 1366
    .line 1367
    goto/16 :goto_17

    .line 1368
    .line 1369
    :pswitch_2f
    move-object v15, v1

    .line 1370
    move-object/from16 v18, v2

    .line 1371
    .line 1372
    move-object/from16 v17, v5

    .line 1373
    .line 1374
    move-object/from16 v1, p1

    .line 1375
    .line 1376
    and-int v0, v3, v16

    .line 1377
    .line 1378
    int-to-long v2, v0

    .line 1379
    invoke-static {v2, v3, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v0

    .line 1383
    invoke-virtual {v7, v0}, Lo9;->E(Lx54;)V

    .line 1384
    .line 1385
    .line 1386
    goto/16 :goto_17

    .line 1387
    .line 1388
    :pswitch_30
    move-object v15, v1

    .line 1389
    move-object/from16 v18, v2

    .line 1390
    .line 1391
    move-object/from16 v17, v5

    .line 1392
    .line 1393
    move-object/from16 v1, p1

    .line 1394
    .line 1395
    and-int v0, v3, v16

    .line 1396
    .line 1397
    int-to-long v2, v0

    .line 1398
    invoke-static {v2, v3, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v0

    .line 1402
    invoke-virtual {v7, v0}, Lo9;->d(Lx54;)V

    .line 1403
    .line 1404
    .line 1405
    goto/16 :goto_17

    .line 1406
    .line 1407
    :pswitch_31
    move-object v15, v1

    .line 1408
    move-object/from16 v18, v2

    .line 1409
    .line 1410
    move-object/from16 v17, v5

    .line 1411
    .line 1412
    move-object/from16 v1, p1

    .line 1413
    .line 1414
    and-int v0, v3, v16

    .line 1415
    .line 1416
    int-to-long v2, v0

    .line 1417
    invoke-static {v2, v3, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v0

    .line 1421
    invoke-virtual {v7, v0}, Lo9;->D(Lx54;)V

    .line 1422
    .line 1423
    .line 1424
    goto/16 :goto_17

    .line 1425
    .line 1426
    :pswitch_32
    move-object v15, v1

    .line 1427
    move-object/from16 v18, v2

    .line 1428
    .line 1429
    move-object/from16 v17, v5

    .line 1430
    .line 1431
    move-object/from16 v1, p1

    .line 1432
    .line 1433
    and-int v0, v3, v16

    .line 1434
    .line 1435
    int-to-long v2, v0

    .line 1436
    invoke-static {v2, v3, v1}, Ly24;->a(JLjava/lang/Object;)Lx54;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v0

    .line 1440
    invoke-virtual {v7, v0}, Lo9;->C(Lx54;)V
    :try_end_d
    .catch Lz54; {:try_start_d .. :try_end_d} :catch_8
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 1441
    .line 1442
    .line 1443
    goto/16 :goto_17

    .line 1444
    .line 1445
    :pswitch_33
    move-object/from16 v18, v2

    .line 1446
    .line 1447
    move-object/from16 v17, v5

    .line 1448
    .line 1449
    move-object v2, v1

    .line 1450
    move-object/from16 v1, p1

    .line 1451
    .line 1452
    :try_start_e
    invoke-virtual {v2, v6, v1}, Lk64;->G(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v0

    .line 1456
    check-cast v0, Ls44;

    .line 1457
    .line 1458
    invoke-virtual {v2, v6}, Lk64;->D(I)Lv64;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v3

    .line 1462
    invoke-virtual {v7, v15}, Lo9;->t(I)V

    .line 1463
    .line 1464
    .line 1465
    invoke-virtual {v7, v0, v3, v8}, Lo9;->v(Ljava/lang/Object;Lv64;Lh54;)V

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {v2, v6, v1, v0}, Lk64;->H(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1469
    .line 1470
    .line 1471
    :goto_14
    move-object v15, v2

    .line 1472
    goto/16 :goto_17

    .line 1473
    .line 1474
    :catch_7
    move-object v15, v2

    .line 1475
    goto/16 :goto_18

    .line 1476
    .line 1477
    :pswitch_34
    move-object/from16 v18, v2

    .line 1478
    .line 1479
    move-object/from16 v17, v5

    .line 1480
    .line 1481
    move-object v2, v1

    .line 1482
    move-object/from16 v1, p1

    .line 1483
    .line 1484
    and-int v0, v3, v16

    .line 1485
    .line 1486
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 1487
    .line 1488
    .line 1489
    invoke-virtual {v9}, Lm0;->C()J

    .line 1490
    .line 1491
    .line 1492
    move-result-wide v3

    .line 1493
    int-to-long v14, v0

    .line 1494
    invoke-static {v1, v14, v15, v3, v4}, Lg74;->j(Ljava/lang/Object;JJ)V

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1498
    .line 1499
    .line 1500
    goto :goto_14

    .line 1501
    :pswitch_35
    move-object/from16 v18, v2

    .line 1502
    .line 1503
    move-object/from16 v17, v5

    .line 1504
    .line 1505
    move-object v2, v1

    .line 1506
    move-object/from16 v1, p1

    .line 1507
    .line 1508
    and-int v0, v3, v16

    .line 1509
    .line 1510
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 1511
    .line 1512
    .line 1513
    invoke-virtual {v9}, Lm0;->B()I

    .line 1514
    .line 1515
    .line 1516
    move-result v3

    .line 1517
    int-to-long v4, v0

    .line 1518
    invoke-static {v4, v5, v1, v3}, Lg74;->h(JLjava/lang/Object;I)V

    .line 1519
    .line 1520
    .line 1521
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1522
    .line 1523
    .line 1524
    goto :goto_14

    .line 1525
    :pswitch_36
    move-object/from16 v18, v2

    .line 1526
    .line 1527
    move-object/from16 v17, v5

    .line 1528
    .line 1529
    move-object v2, v1

    .line 1530
    move-object/from16 v1, p1

    .line 1531
    .line 1532
    and-int v0, v3, v16

    .line 1533
    .line 1534
    invoke-virtual {v7, v14}, Lo9;->t(I)V

    .line 1535
    .line 1536
    .line 1537
    invoke-virtual {v9}, Lm0;->A()J

    .line 1538
    .line 1539
    .line 1540
    move-result-wide v3

    .line 1541
    int-to-long v14, v0

    .line 1542
    invoke-static {v1, v14, v15, v3, v4}, Lg74;->j(Ljava/lang/Object;JJ)V

    .line 1543
    .line 1544
    .line 1545
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1546
    .line 1547
    .line 1548
    goto :goto_14

    .line 1549
    :pswitch_37
    move-object/from16 v18, v2

    .line 1550
    .line 1551
    move-object/from16 v17, v5

    .line 1552
    .line 1553
    move-object v2, v1

    .line 1554
    move-object/from16 v1, p1

    .line 1555
    .line 1556
    and-int v0, v3, v16

    .line 1557
    .line 1558
    const/4 v4, 0x5

    .line 1559
    invoke-virtual {v7, v4}, Lo9;->t(I)V

    .line 1560
    .line 1561
    .line 1562
    invoke-virtual {v9}, Lm0;->z()I

    .line 1563
    .line 1564
    .line 1565
    move-result v3

    .line 1566
    int-to-long v4, v0

    .line 1567
    invoke-static {v4, v5, v1, v3}, Lg74;->h(JLjava/lang/Object;I)V

    .line 1568
    .line 1569
    .line 1570
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1571
    .line 1572
    .line 1573
    goto :goto_14

    .line 1574
    :pswitch_38
    move-object/from16 v18, v2

    .line 1575
    .line 1576
    move-object/from16 v17, v5

    .line 1577
    .line 1578
    move-object v2, v1

    .line 1579
    move-object/from16 v1, p1

    .line 1580
    .line 1581
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 1582
    .line 1583
    .line 1584
    invoke-virtual {v9}, Lm0;->y()I

    .line 1585
    .line 1586
    .line 1587
    move-result v4

    .line 1588
    invoke-virtual {v2, v6}, Lk64;->F(I)Ls54;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v5

    .line 1592
    if-eqz v5, :cond_13

    .line 1593
    .line 1594
    invoke-interface {v5, v4}, Ls54;->a(I)Z

    .line 1595
    .line 1596
    .line 1597
    move-result v5

    .line 1598
    if-eqz v5, :cond_11

    .line 1599
    .line 1600
    goto :goto_16

    .line 1601
    :cond_11
    sget-object v3, Lw64;->a:Lpz;

    .line 1602
    .line 1603
    if-nez v18, :cond_12

    .line 1604
    .line 1605
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1606
    .line 1607
    .line 1608
    invoke-static {v1}, Lpz;->q(Ljava/lang/Object;)Lb74;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v3

    .line 1612
    goto :goto_15

    .line 1613
    :cond_12
    move-object/from16 v3, v18

    .line 1614
    .line 1615
    :goto_15
    int-to-long v4, v4

    .line 1616
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1617
    .line 1618
    .line 1619
    move-object v6, v3

    .line 1620
    check-cast v6, Lb74;

    .line 1621
    .line 1622
    shl-int/lit8 v0, v0, 0x3

    .line 1623
    .line 1624
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v4

    .line 1628
    invoke-virtual {v6, v0, v4}, Lb74;->d(ILjava/lang/Object;)V

    .line 1629
    .line 1630
    .line 1631
    move-object v1, v2

    .line 1632
    goto/16 :goto_f

    .line 1633
    .line 1634
    :cond_13
    :goto_16
    and-int v0, v3, v16

    .line 1635
    .line 1636
    int-to-long v14, v0

    .line 1637
    invoke-static {v14, v15, v1, v4}, Lg74;->h(JLjava/lang/Object;I)V

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1641
    .line 1642
    .line 1643
    goto/16 :goto_14

    .line 1644
    .line 1645
    :pswitch_39
    move-object/from16 v18, v2

    .line 1646
    .line 1647
    move-object/from16 v17, v5

    .line 1648
    .line 1649
    move-object v2, v1

    .line 1650
    move-object/from16 v1, p1

    .line 1651
    .line 1652
    and-int v0, v3, v16

    .line 1653
    .line 1654
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 1655
    .line 1656
    .line 1657
    invoke-virtual {v9}, Lm0;->x()I

    .line 1658
    .line 1659
    .line 1660
    move-result v3

    .line 1661
    int-to-long v4, v0

    .line 1662
    invoke-static {v4, v5, v1, v3}, Lg74;->h(JLjava/lang/Object;I)V

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1666
    .line 1667
    .line 1668
    goto/16 :goto_14

    .line 1669
    .line 1670
    :pswitch_3a
    move-object/from16 v18, v2

    .line 1671
    .line 1672
    move-object/from16 v17, v5

    .line 1673
    .line 1674
    move-object v2, v1

    .line 1675
    move-object/from16 v1, p1

    .line 1676
    .line 1677
    and-int v0, v3, v16

    .line 1678
    .line 1679
    invoke-virtual {v7}, Lo9;->B()La54;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v3

    .line 1683
    int-to-long v4, v0

    .line 1684
    invoke-static {v1, v4, v5, v3}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 1685
    .line 1686
    .line 1687
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1688
    .line 1689
    .line 1690
    goto/16 :goto_14

    .line 1691
    .line 1692
    :pswitch_3b
    move-object/from16 v18, v2

    .line 1693
    .line 1694
    move-object/from16 v17, v5

    .line 1695
    .line 1696
    move-object v2, v1

    .line 1697
    move-object/from16 v1, p1

    .line 1698
    .line 1699
    invoke-virtual {v2, v6, v1}, Lk64;->G(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v0

    .line 1703
    check-cast v0, Ls44;

    .line 1704
    .line 1705
    invoke-virtual {v2, v6}, Lk64;->D(I)Lv64;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v3

    .line 1709
    const/4 v14, 0x2

    .line 1710
    invoke-virtual {v7, v14}, Lo9;->t(I)V

    .line 1711
    .line 1712
    .line 1713
    invoke-virtual {v7, v0, v3, v8}, Lo9;->u(Ljava/lang/Object;Lv64;Lh54;)V

    .line 1714
    .line 1715
    .line 1716
    invoke-virtual {v2, v6, v1, v0}, Lk64;->H(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1717
    .line 1718
    .line 1719
    goto/16 :goto_14

    .line 1720
    .line 1721
    :pswitch_3c
    move-object/from16 v18, v2

    .line 1722
    .line 1723
    move-object/from16 v17, v5

    .line 1724
    .line 1725
    move-object v2, v1

    .line 1726
    move-object/from16 v1, p1

    .line 1727
    .line 1728
    invoke-virtual {v2, v3, v7, v1}, Lk64;->L(ILo9;Ljava/lang/Object;)V

    .line 1729
    .line 1730
    .line 1731
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1732
    .line 1733
    .line 1734
    goto/16 :goto_14

    .line 1735
    .line 1736
    :pswitch_3d
    move-object/from16 v18, v2

    .line 1737
    .line 1738
    move-object/from16 v17, v5

    .line 1739
    .line 1740
    move-object v2, v1

    .line 1741
    move-object/from16 v1, p1

    .line 1742
    .line 1743
    and-int v0, v3, v16

    .line 1744
    .line 1745
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 1746
    .line 1747
    .line 1748
    invoke-virtual {v9}, Lm0;->t()Z

    .line 1749
    .line 1750
    .line 1751
    move-result v3

    .line 1752
    int-to-long v4, v0

    .line 1753
    sget-object v0, Lg74;->c:Lf74;

    .line 1754
    .line 1755
    invoke-virtual {v0, v1, v4, v5, v3}, Lf74;->v1(Ljava/lang/Object;JZ)V

    .line 1756
    .line 1757
    .line 1758
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1759
    .line 1760
    .line 1761
    goto/16 :goto_14

    .line 1762
    .line 1763
    :pswitch_3e
    move-object/from16 v18, v2

    .line 1764
    .line 1765
    move-object/from16 v17, v5

    .line 1766
    .line 1767
    move-object v2, v1

    .line 1768
    move-object/from16 v1, p1

    .line 1769
    .line 1770
    and-int v0, v3, v16

    .line 1771
    .line 1772
    const/4 v4, 0x5

    .line 1773
    invoke-virtual {v7, v4}, Lo9;->t(I)V

    .line 1774
    .line 1775
    .line 1776
    invoke-virtual {v9}, Lm0;->s()I

    .line 1777
    .line 1778
    .line 1779
    move-result v3

    .line 1780
    int-to-long v4, v0

    .line 1781
    invoke-static {v4, v5, v1, v3}, Lg74;->h(JLjava/lang/Object;I)V

    .line 1782
    .line 1783
    .line 1784
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1785
    .line 1786
    .line 1787
    goto/16 :goto_14

    .line 1788
    .line 1789
    :pswitch_3f
    move-object/from16 v18, v2

    .line 1790
    .line 1791
    move-object/from16 v17, v5

    .line 1792
    .line 1793
    move-object v2, v1

    .line 1794
    move-object/from16 v1, p1

    .line 1795
    .line 1796
    and-int v0, v3, v16

    .line 1797
    .line 1798
    invoke-virtual {v7, v14}, Lo9;->t(I)V

    .line 1799
    .line 1800
    .line 1801
    invoke-virtual {v9}, Lm0;->r()J

    .line 1802
    .line 1803
    .line 1804
    move-result-wide v3

    .line 1805
    int-to-long v14, v0

    .line 1806
    invoke-static {v1, v14, v15, v3, v4}, Lg74;->j(Ljava/lang/Object;JJ)V

    .line 1807
    .line 1808
    .line 1809
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1810
    .line 1811
    .line 1812
    goto/16 :goto_14

    .line 1813
    .line 1814
    :pswitch_40
    move-object/from16 v18, v2

    .line 1815
    .line 1816
    move-object/from16 v17, v5

    .line 1817
    .line 1818
    move-object v2, v1

    .line 1819
    move-object/from16 v1, p1

    .line 1820
    .line 1821
    and-int v0, v3, v16

    .line 1822
    .line 1823
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 1824
    .line 1825
    .line 1826
    invoke-virtual {v9}, Lm0;->q()I

    .line 1827
    .line 1828
    .line 1829
    move-result v3

    .line 1830
    int-to-long v4, v0

    .line 1831
    invoke-static {v4, v5, v1, v3}, Lg74;->h(JLjava/lang/Object;I)V

    .line 1832
    .line 1833
    .line 1834
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1835
    .line 1836
    .line 1837
    goto/16 :goto_14

    .line 1838
    .line 1839
    :pswitch_41
    move-object/from16 v18, v2

    .line 1840
    .line 1841
    move-object/from16 v17, v5

    .line 1842
    .line 1843
    move-object v2, v1

    .line 1844
    move-object/from16 v1, p1

    .line 1845
    .line 1846
    and-int v0, v3, v16

    .line 1847
    .line 1848
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 1849
    .line 1850
    .line 1851
    invoke-virtual {v9}, Lm0;->o()J

    .line 1852
    .line 1853
    .line 1854
    move-result-wide v3

    .line 1855
    int-to-long v14, v0

    .line 1856
    invoke-static {v1, v14, v15, v3, v4}, Lg74;->j(Ljava/lang/Object;JJ)V

    .line 1857
    .line 1858
    .line 1859
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1860
    .line 1861
    .line 1862
    goto/16 :goto_14

    .line 1863
    .line 1864
    :pswitch_42
    move-object/from16 v18, v2

    .line 1865
    .line 1866
    move-object/from16 v17, v5

    .line 1867
    .line 1868
    move-object v2, v1

    .line 1869
    move-object/from16 v1, p1

    .line 1870
    .line 1871
    and-int v0, v3, v16

    .line 1872
    .line 1873
    invoke-virtual {v7, v13}, Lo9;->t(I)V

    .line 1874
    .line 1875
    .line 1876
    invoke-virtual {v9}, Lm0;->p()J

    .line 1877
    .line 1878
    .line 1879
    move-result-wide v3

    .line 1880
    int-to-long v14, v0

    .line 1881
    invoke-static {v1, v14, v15, v3, v4}, Lg74;->j(Ljava/lang/Object;JJ)V

    .line 1882
    .line 1883
    .line 1884
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V

    .line 1885
    .line 1886
    .line 1887
    goto/16 :goto_14

    .line 1888
    .line 1889
    :pswitch_43
    move-object/from16 v18, v2

    .line 1890
    .line 1891
    move-object/from16 v17, v5

    .line 1892
    .line 1893
    move-object v2, v1

    .line 1894
    move-object/from16 v1, p1

    .line 1895
    .line 1896
    and-int v0, v3, v16

    .line 1897
    .line 1898
    const/4 v4, 0x5

    .line 1899
    invoke-virtual {v7, v4}, Lo9;->t(I)V

    .line 1900
    .line 1901
    .line 1902
    invoke-virtual {v9}, Lm0;->n()F

    .line 1903
    .line 1904
    .line 1905
    move-result v3

    .line 1906
    int-to-long v4, v0

    .line 1907
    sget-object v0, Lg74;->c:Lf74;

    .line 1908
    .line 1909
    invoke-virtual {v0, v1, v4, v5, v3}, Lf74;->x1(Ljava/lang/Object;JF)V

    .line 1910
    .line 1911
    .line 1912
    invoke-virtual {v2, v6, v1}, Lk64;->t(ILjava/lang/Object;)V
    :try_end_e
    .catch Lz54; {:try_start_e .. :try_end_e} :catch_7
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 1913
    .line 1914
    .line 1915
    goto/16 :goto_14

    .line 1916
    .line 1917
    :pswitch_44
    move-object/from16 v18, v2

    .line 1918
    .line 1919
    move-object/from16 v17, v5

    .line 1920
    .line 1921
    move-object v2, v1

    .line 1922
    move-object/from16 v1, p1

    .line 1923
    .line 1924
    and-int v0, v3, v16

    .line 1925
    .line 1926
    :try_start_f
    invoke-virtual {v7, v14}, Lo9;->t(I)V

    .line 1927
    .line 1928
    .line 1929
    invoke-virtual {v9}, Lm0;->m()D

    .line 1930
    .line 1931
    .line 1932
    move-result-wide v4

    .line 1933
    int-to-long v14, v0

    .line 1934
    sget-object v0, Lg74;->c:Lf74;
    :try_end_f
    .catch Lz54; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 1935
    .line 1936
    move-wide/from16 v19, v14

    .line 1937
    .line 1938
    move-object v15, v2

    .line 1939
    move-wide/from16 v2, v19

    .line 1940
    .line 1941
    :try_start_10
    invoke-virtual/range {v0 .. v5}, Lf74;->z1(Ljava/lang/Object;JD)V

    .line 1942
    .line 1943
    .line 1944
    invoke-virtual {v15, v6, v1}, Lk64;->t(ILjava/lang/Object;)V
    :try_end_10
    .catch Lz54; {:try_start_10 .. :try_end_10} :catch_8
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 1945
    .line 1946
    .line 1947
    :goto_17
    move-object v1, v15

    .line 1948
    move-object/from16 v5, v17

    .line 1949
    .line 1950
    move-object/from16 v2, v18

    .line 1951
    .line 1952
    goto/16 :goto_0

    .line 1953
    .line 1954
    :catchall_9
    move-exception v0

    .line 1955
    move-object v15, v2

    .line 1956
    goto/16 :goto_d

    .line 1957
    .line 1958
    :catchall_a
    move-exception v0

    .line 1959
    move-object v15, v1

    .line 1960
    move-object/from16 v18, v2

    .line 1961
    .line 1962
    move-object/from16 v17, v5

    .line 1963
    .line 1964
    move-object/from16 v1, p1

    .line 1965
    .line 1966
    goto :goto_1c

    .line 1967
    :catch_8
    :goto_18
    move-object/from16 v2, v18

    .line 1968
    .line 1969
    :goto_19
    if-nez v2, :cond_14

    .line 1970
    .line 1971
    :try_start_11
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1972
    .line 1973
    .line 1974
    invoke-static {v1}, Lpz;->q(Ljava/lang/Object;)Lb74;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v0

    .line 1978
    move-object v2, v0

    .line 1979
    :cond_14
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1980
    .line 1981
    .line 1982
    invoke-static {v13, v7, v2}, Lpz;->r(ILo9;Ljava/lang/Object;)Z

    .line 1983
    .line 1984
    .line 1985
    move-result v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    .line 1986
    if-nez v0, :cond_17

    .line 1987
    .line 1988
    move-object v4, v2

    .line 1989
    :goto_1a
    if-ge v12, v11, :cond_8

    .line 1990
    .line 1991
    aget v3, v10, v12

    .line 1992
    .line 1993
    move-object/from16 v6, p1

    .line 1994
    .line 1995
    move-object v2, v1

    .line 1996
    move-object v1, v15

    .line 1997
    move-object/from16 v5, v17

    .line 1998
    .line 1999
    invoke-virtual/range {v1 .. v6}, Lk64;->K(Ljava/lang/Object;ILjava/lang/Object;Lpz;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v4

    .line 2003
    add-int/lit8 v12, v12, 0x1

    .line 2004
    .line 2005
    move-object/from16 v15, p0

    .line 2006
    .line 2007
    move-object/from16 v1, p1

    .line 2008
    .line 2009
    goto :goto_1a

    .line 2010
    :cond_15
    :goto_1b
    if-eqz v4, :cond_16

    .line 2011
    .line 2012
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2013
    .line 2014
    .line 2015
    check-cast v4, Lb74;

    .line 2016
    .line 2017
    move-object/from16 v0, p1

    .line 2018
    .line 2019
    check-cast v0, Lp54;

    .line 2020
    .line 2021
    iput-object v4, v0, Lp54;->zzt:Lb74;

    .line 2022
    .line 2023
    :cond_16
    return-void

    .line 2024
    :cond_17
    move-object/from16 v1, p0

    .line 2025
    .line 2026
    goto/16 :goto_9

    .line 2027
    .line 2028
    :catchall_b
    move-exception v0

    .line 2029
    goto/16 :goto_a

    .line 2030
    .line 2031
    :goto_1c
    move-object/from16 v2, v18

    .line 2032
    .line 2033
    :goto_1d
    move-object v4, v2

    .line 2034
    :goto_1e
    if-ge v12, v11, :cond_18

    .line 2035
    .line 2036
    aget v3, v10, v12

    .line 2037
    .line 2038
    move-object/from16 v6, p1

    .line 2039
    .line 2040
    move-object/from16 v1, p0

    .line 2041
    .line 2042
    move-object/from16 v2, p1

    .line 2043
    .line 2044
    invoke-virtual/range {v1 .. v6}, Lk64;->K(Ljava/lang/Object;ILjava/lang/Object;Lpz;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2045
    .line 2046
    .line 2047
    move-result-object v4

    .line 2048
    add-int/lit8 v12, v12, 0x1

    .line 2049
    .line 2050
    goto :goto_1e

    .line 2051
    :cond_18
    if-eqz v4, :cond_19

    .line 2052
    .line 2053
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2054
    .line 2055
    .line 2056
    check-cast v4, Lb74;

    .line 2057
    .line 2058
    move-object/from16 v1, p1

    .line 2059
    .line 2060
    check-cast v1, Lp54;

    .line 2061
    .line 2062
    iput-object v4, v1, Lp54;->zzt:Lb74;

    .line 2063
    .line 2064
    :cond_19
    throw v0

    .line 2065
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 10

    .line 1
    invoke-static {p1}, Lk64;->n(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v1, p0, Lk64;->a:[I

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    if-ge v0, v2, :cond_4

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lk64;->k(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const v3, 0xfffff

    .line 18
    .line 19
    .line 20
    and-int/2addr v3, v2

    .line 21
    invoke-static {v2}, Lk64;->l(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    aget v1, v1, v0

    .line 26
    .line 27
    int-to-long v6, v3

    .line 28
    packed-switch v2, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    :cond_0
    :goto_1
    move-object v5, p1

    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :pswitch_0
    invoke-virtual {p0, v0, p1, p2}, Lk64;->C(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :pswitch_1
    invoke-virtual {p0, v1, p2, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-static {v6, v7, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {p1, v6, v7, v2}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1, p1, v0}, Lk64;->v(ILjava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :pswitch_2
    invoke-virtual {p0, v0, p1, p2}, Lk64;->C(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :pswitch_3
    invoke-virtual {p0, v1, p2, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    invoke-static {v6, v7, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {p1, v6, v7, v2}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v1, p1, v0}, Lk64;->v(ILjava/lang/Object;I)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :pswitch_4
    sget-object v1, Lw64;->a:Lpz;

    .line 77
    .line 78
    invoke-static {v6, v7, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v6, v7, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v1, v2}, Ly24;->h(Ljava/lang/Object;Ljava/lang/Object;)Lg64;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {p1, v6, v7, v1}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :pswitch_5
    invoke-static {v6, v7, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Lx54;

    .line 99
    .line 100
    invoke-static {v6, v7, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lx54;

    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-lez v3, :cond_2

    .line 115
    .line 116
    if-lez v4, :cond_2

    .line 117
    .line 118
    move-object v5, v1

    .line 119
    check-cast v5, Lt44;

    .line 120
    .line 121
    iget-boolean v5, v5, Lt44;->f:Z

    .line 122
    .line 123
    if-nez v5, :cond_1

    .line 124
    .line 125
    add-int/2addr v4, v3

    .line 126
    invoke-interface {v1, v4}, Lx54;->z(I)Lx54;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    :cond_1
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 131
    .line 132
    .line 133
    :cond_2
    if-gtz v3, :cond_3

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    move-object v2, v1

    .line 137
    :goto_2
    invoke-static {p1, v6, v7, v2}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :pswitch_6
    invoke-virtual {p0, v0, p1, p2}, Lk64;->B(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :pswitch_7
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_0

    .line 150
    .line 151
    invoke-static {v6, v7, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 152
    .line 153
    .line 154
    move-result-wide v1

    .line 155
    invoke-static {p1, v6, v7, v1, v2}, Lg74;->j(Ljava/lang/Object;JJ)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_1

    .line 162
    .line 163
    :pswitch_8
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_0

    .line 168
    .line 169
    invoke-static {v6, v7, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    invoke-static {v6, v7, p1, v1}, Lg74;->h(JLjava/lang/Object;I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto/16 :goto_1

    .line 180
    .line 181
    :pswitch_9
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_0

    .line 186
    .line 187
    invoke-static {v6, v7, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 188
    .line 189
    .line 190
    move-result-wide v1

    .line 191
    invoke-static {p1, v6, v7, v1, v2}, Lg74;->j(Ljava/lang/Object;JJ)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :pswitch_a
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-eqz v1, :cond_0

    .line 204
    .line 205
    invoke-static {v6, v7, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    invoke-static {v6, v7, p1, v1}, Lg74;->h(JLjava/lang/Object;I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    :pswitch_b
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_0

    .line 222
    .line 223
    invoke-static {v6, v7, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    invoke-static {v6, v7, p1, v1}, Lg74;->h(JLjava/lang/Object;I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :pswitch_c
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-eqz v1, :cond_0

    .line 240
    .line 241
    invoke-static {v6, v7, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    invoke-static {v6, v7, p1, v1}, Lg74;->h(JLjava/lang/Object;I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_1

    .line 252
    .line 253
    :pswitch_d
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    if-eqz v1, :cond_0

    .line 258
    .line 259
    invoke-static {v6, v7, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-static {p1, v6, v7, v1}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_1

    .line 270
    .line 271
    :pswitch_e
    invoke-virtual {p0, v0, p1, p2}, Lk64;->B(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_1

    .line 275
    .line 276
    :pswitch_f
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-eqz v1, :cond_0

    .line 281
    .line 282
    invoke-static {v6, v7, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-static {p1, v6, v7, v1}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    goto/16 :goto_1

    .line 293
    .line 294
    :pswitch_10
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-eqz v1, :cond_0

    .line 299
    .line 300
    sget-object v1, Lg74;->c:Lf74;

    .line 301
    .line 302
    invoke-virtual {v1, v6, v7, p2}, Lf74;->t1(JLjava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    invoke-virtual {v1, p1, v6, v7, v2}, Lf74;->v1(Ljava/lang/Object;JZ)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    goto/16 :goto_1

    .line 313
    .line 314
    :pswitch_11
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    if-eqz v1, :cond_0

    .line 319
    .line 320
    invoke-static {v6, v7, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    invoke-static {v6, v7, p1, v1}, Lg74;->h(JLjava/lang/Object;I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    goto/16 :goto_1

    .line 331
    .line 332
    :pswitch_12
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    if-eqz v1, :cond_0

    .line 337
    .line 338
    invoke-static {v6, v7, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 339
    .line 340
    .line 341
    move-result-wide v1

    .line 342
    invoke-static {p1, v6, v7, v1, v2}, Lg74;->j(Ljava/lang/Object;JJ)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_1

    .line 349
    .line 350
    :pswitch_13
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eqz v1, :cond_0

    .line 355
    .line 356
    invoke-static {v6, v7, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    invoke-static {v6, v7, p1, v1}, Lg74;->h(JLjava/lang/Object;I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    goto/16 :goto_1

    .line 367
    .line 368
    :pswitch_14
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-eqz v1, :cond_0

    .line 373
    .line 374
    invoke-static {v6, v7, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 375
    .line 376
    .line 377
    move-result-wide v1

    .line 378
    invoke-static {p1, v6, v7, v1, v2}, Lg74;->j(Ljava/lang/Object;JJ)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    goto/16 :goto_1

    .line 385
    .line 386
    :pswitch_15
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    if-eqz v1, :cond_0

    .line 391
    .line 392
    invoke-static {v6, v7, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 393
    .line 394
    .line 395
    move-result-wide v1

    .line 396
    invoke-static {p1, v6, v7, v1, v2}, Lg74;->j(Ljava/lang/Object;JJ)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    goto/16 :goto_1

    .line 403
    .line 404
    :pswitch_16
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    if-eqz v1, :cond_0

    .line 409
    .line 410
    sget-object v1, Lg74;->c:Lf74;

    .line 411
    .line 412
    invoke-virtual {v1, v6, v7, p2}, Lf74;->w1(JLjava/lang/Object;)F

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    invoke-virtual {v1, p1, v6, v7, v2}, Lf74;->x1(Ljava/lang/Object;JF)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {p0, v0, p1}, Lk64;->t(ILjava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    goto/16 :goto_1

    .line 423
    .line 424
    :pswitch_17
    invoke-virtual {p0, v0, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-eqz v1, :cond_0

    .line 429
    .line 430
    sget-object v4, Lg74;->c:Lf74;

    .line 431
    .line 432
    invoke-virtual {v4, v6, v7, p2}, Lf74;->y1(JLjava/lang/Object;)D

    .line 433
    .line 434
    .line 435
    move-result-wide v8

    .line 436
    move-object v5, p1

    .line 437
    invoke-virtual/range {v4 .. v9}, Lf74;->z1(Ljava/lang/Object;JD)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p0, v0, v5}, Lk64;->t(ILjava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    :goto_3
    add-int/lit8 v0, v0, 0x3

    .line 444
    .line 445
    move-object p1, v5

    .line 446
    goto/16 :goto_0

    .line 447
    .line 448
    :cond_4
    move-object v5, p1

    .line 449
    invoke-static {v5, p2}, Lw64;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    return-void

    .line 453
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Lit3;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    iget-object v2, v6, Lit3;->g:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v7, v2

    .line 10
    check-cast v7, Lg54;

    .line 11
    .line 12
    sget-object v8, Lk64;->l:Lsun/misc/Unsafe;

    .line 13
    .line 14
    const v10, 0xfffff

    .line 15
    .line 16
    .line 17
    move v3, v10

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    :goto_0
    iget-object v5, v0, Lk64;->a:[I

    .line 21
    .line 22
    array-length v11, v5

    .line 23
    if-ge v2, v11, :cond_12

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lk64;->k(I)I

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    invoke-static {v11}, Lk64;->l(I)I

    .line 30
    .line 31
    .line 32
    move-result v12

    .line 33
    aget v13, v5, v2

    .line 34
    .line 35
    const/16 v14, 0x11

    .line 36
    .line 37
    const/4 v15, 0x1

    .line 38
    if-gt v12, v14, :cond_2

    .line 39
    .line 40
    add-int/lit8 v14, v2, 0x2

    .line 41
    .line 42
    aget v14, v5, v14

    .line 43
    .line 44
    and-int v9, v14, v10

    .line 45
    .line 46
    if-eq v9, v3, :cond_1

    .line 47
    .line 48
    if-ne v9, v10, :cond_0

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    int-to-long v3, v9

    .line 53
    invoke-virtual {v8, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    move v4, v3

    .line 58
    :goto_1
    move v3, v9

    .line 59
    :cond_1
    ushr-int/lit8 v9, v14, 0x14

    .line 60
    .line 61
    shl-int v9, v15, v9

    .line 62
    .line 63
    move/from16 v26, v9

    .line 64
    .line 65
    move-object v9, v5

    .line 66
    move/from16 v5, v26

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    move-object v9, v5

    .line 70
    const/4 v5, 0x0

    .line 71
    :goto_2
    and-int/2addr v11, v10

    .line 72
    int-to-long v10, v11

    .line 73
    const/16 v16, 0x3f

    .line 74
    .line 75
    const/4 v14, 0x4

    .line 76
    const/4 v15, 0x3

    .line 77
    packed-switch v12, :pswitch_data_0

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_3
    move-object v12, v6

    .line 81
    :goto_4
    const/4 v6, 0x0

    .line 82
    goto/16 :goto_16

    .line 83
    .line 84
    :pswitch_0
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_3

    .line 89
    .line 90
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v0, v2}, Lk64;->D(I)Lv64;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    check-cast v5, Ls44;

    .line 99
    .line 100
    invoke-virtual {v7, v13, v15}, Lg54;->I(II)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v9, v5, v6}, Lv64;->e(Ljava/lang/Object;Lit3;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v7, v13, v14}, Lg54;->I(II)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :pswitch_1
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-eqz v5, :cond_3

    .line 115
    .line 116
    invoke-static {v10, v11, v1}, Lk64;->p(JLjava/lang/Object;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v9

    .line 120
    add-long v11, v9, v9

    .line 121
    .line 122
    shr-long v9, v9, v16

    .line 123
    .line 124
    xor-long/2addr v9, v11

    .line 125
    invoke-virtual {v7, v13, v9, v10}, Lg54;->M(IJ)V

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :pswitch_2
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_3

    .line 134
    .line 135
    invoke-static {v10, v11, v1}, Lk64;->o(JLjava/lang/Object;)I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    add-int v9, v5, v5

    .line 140
    .line 141
    shr-int/lit8 v5, v5, 0x1f

    .line 142
    .line 143
    xor-int/2addr v5, v9

    .line 144
    invoke-virtual {v7, v13, v5}, Lg54;->K(II)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :pswitch_3
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-eqz v5, :cond_3

    .line 153
    .line 154
    invoke-static {v10, v11, v1}, Lk64;->p(JLjava/lang/Object;)J

    .line 155
    .line 156
    .line 157
    move-result-wide v9

    .line 158
    invoke-virtual {v7, v13, v9, v10}, Lg54;->O(IJ)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :pswitch_4
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-eqz v5, :cond_3

    .line 167
    .line 168
    invoke-static {v10, v11, v1}, Lk64;->o(JLjava/lang/Object;)I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    invoke-virtual {v7, v13, v5}, Lg54;->L(II)V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :pswitch_5
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-eqz v5, :cond_3

    .line 181
    .line 182
    invoke-static {v10, v11, v1}, Lk64;->o(JLjava/lang/Object;)I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    invoke-virtual {v7, v13, v5}, Lg54;->J(II)V

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :pswitch_6
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-eqz v5, :cond_3

    .line 195
    .line 196
    invoke-static {v10, v11, v1}, Lk64;->o(JLjava/lang/Object;)I

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    invoke-virtual {v7, v13, v5}, Lg54;->K(II)V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :pswitch_7
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    if-eqz v5, :cond_3

    .line 209
    .line 210
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    check-cast v5, La54;

    .line 215
    .line 216
    invoke-virtual {v7, v13, v5}, Lg54;->R(ILa54;)V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_3

    .line 220
    .line 221
    :pswitch_8
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-eqz v5, :cond_3

    .line 226
    .line 227
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-virtual {v0, v2}, Lk64;->D(I)Lv64;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    invoke-virtual {v6, v13, v5, v9}, Lit3;->e(ILjava/lang/Object;Lv64;)V

    .line 236
    .line 237
    .line 238
    goto/16 :goto_3

    .line 239
    .line 240
    :pswitch_9
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-eqz v5, :cond_3

    .line 245
    .line 246
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    instance-of v9, v5, Ljava/lang/String;

    .line 251
    .line 252
    if-eqz v9, :cond_4

    .line 253
    .line 254
    check-cast v5, Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {v7, v5, v13}, Lg54;->Q(Ljava/lang/String;I)V

    .line 257
    .line 258
    .line 259
    goto/16 :goto_3

    .line 260
    .line 261
    :cond_4
    check-cast v5, La54;

    .line 262
    .line 263
    invoke-virtual {v7, v13, v5}, Lg54;->R(ILa54;)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_3

    .line 267
    .line 268
    :pswitch_a
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-eqz v5, :cond_3

    .line 273
    .line 274
    invoke-static {v10, v11, v1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    check-cast v5, Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    invoke-virtual {v7, v13, v5}, Lg54;->P(IZ)V

    .line 285
    .line 286
    .line 287
    goto/16 :goto_3

    .line 288
    .line 289
    :pswitch_b
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-eqz v5, :cond_3

    .line 294
    .line 295
    invoke-static {v10, v11, v1}, Lk64;->o(JLjava/lang/Object;)I

    .line 296
    .line 297
    .line 298
    move-result v5

    .line 299
    invoke-virtual {v7, v13, v5}, Lg54;->L(II)V

    .line 300
    .line 301
    .line 302
    goto/16 :goto_3

    .line 303
    .line 304
    :pswitch_c
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    if-eqz v5, :cond_3

    .line 309
    .line 310
    invoke-static {v10, v11, v1}, Lk64;->p(JLjava/lang/Object;)J

    .line 311
    .line 312
    .line 313
    move-result-wide v9

    .line 314
    invoke-virtual {v7, v13, v9, v10}, Lg54;->O(IJ)V

    .line 315
    .line 316
    .line 317
    goto/16 :goto_3

    .line 318
    .line 319
    :pswitch_d
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    if-eqz v5, :cond_3

    .line 324
    .line 325
    invoke-static {v10, v11, v1}, Lk64;->o(JLjava/lang/Object;)I

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    invoke-virtual {v7, v13, v5}, Lg54;->J(II)V

    .line 330
    .line 331
    .line 332
    goto/16 :goto_3

    .line 333
    .line 334
    :pswitch_e
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 335
    .line 336
    .line 337
    move-result v5

    .line 338
    if-eqz v5, :cond_3

    .line 339
    .line 340
    invoke-static {v10, v11, v1}, Lk64;->p(JLjava/lang/Object;)J

    .line 341
    .line 342
    .line 343
    move-result-wide v9

    .line 344
    invoke-virtual {v7, v13, v9, v10}, Lg54;->M(IJ)V

    .line 345
    .line 346
    .line 347
    goto/16 :goto_3

    .line 348
    .line 349
    :pswitch_f
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 350
    .line 351
    .line 352
    move-result v5

    .line 353
    if-eqz v5, :cond_3

    .line 354
    .line 355
    invoke-static {v10, v11, v1}, Lk64;->p(JLjava/lang/Object;)J

    .line 356
    .line 357
    .line 358
    move-result-wide v9

    .line 359
    invoke-virtual {v7, v13, v9, v10}, Lg54;->M(IJ)V

    .line 360
    .line 361
    .line 362
    goto/16 :goto_3

    .line 363
    .line 364
    :pswitch_10
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    if-eqz v5, :cond_3

    .line 369
    .line 370
    invoke-static {v10, v11, v1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    check-cast v5, Ljava/lang/Float;

    .line 375
    .line 376
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 377
    .line 378
    .line 379
    move-result v5

    .line 380
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    invoke-virtual {v7, v13, v5}, Lg54;->L(II)V

    .line 385
    .line 386
    .line 387
    goto/16 :goto_3

    .line 388
    .line 389
    :pswitch_11
    invoke-virtual {v0, v13, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    if-eqz v5, :cond_3

    .line 394
    .line 395
    invoke-static {v10, v11, v1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    check-cast v5, Ljava/lang/Double;

    .line 400
    .line 401
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 402
    .line 403
    .line 404
    move-result-wide v9

    .line 405
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 406
    .line 407
    .line 408
    move-result-wide v9

    .line 409
    invoke-virtual {v7, v13, v9, v10}, Lg54;->O(IJ)V

    .line 410
    .line 411
    .line 412
    goto/16 :goto_3

    .line 413
    .line 414
    :pswitch_12
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v5

    .line 418
    if-eqz v5, :cond_d

    .line 419
    .line 420
    invoke-virtual {v0, v2}, Lk64;->E(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v9

    .line 424
    check-cast v9, Lf64;

    .line 425
    .line 426
    iget-object v9, v9, Lf64;->a:Ljr3;

    .line 427
    .line 428
    check-cast v5, Lg64;

    .line 429
    .line 430
    invoke-virtual {v5}, Lg64;->entrySet()Ljava/util/Set;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 439
    .line 440
    .line 441
    move-result v10

    .line 442
    if-eqz v10, :cond_d

    .line 443
    .line 444
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v10

    .line 448
    check-cast v10, Ljava/util/Map$Entry;

    .line 449
    .line 450
    const/4 v11, 0x2

    .line 451
    invoke-virtual {v7, v13, v11}, Lg54;->I(II)V

    .line 452
    .line 453
    .line 454
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v11

    .line 458
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v12

    .line 462
    iget-object v15, v9, Ljr3;->g:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v15, Lj74;

    .line 465
    .line 466
    iget-object v14, v9, Ljr3;->h:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v14, Lj74;

    .line 469
    .line 470
    sget v17, Lk54;->c:I

    .line 471
    .line 472
    const/16 v17, 0x8

    .line 473
    .line 474
    invoke-static/range {v17 .. v17}, Lg54;->D(I)I

    .line 475
    .line 476
    .line 477
    move-result v18

    .line 478
    move/from16 v19, v3

    .line 479
    .line 480
    sget-object v3, Lj74;->i:Lj74;

    .line 481
    .line 482
    if-ne v15, v3, :cond_5

    .line 483
    .line 484
    add-int v18, v18, v18

    .line 485
    .line 486
    :cond_5
    sget-object v20, Lk74;->f:Lk74;

    .line 487
    .line 488
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 489
    .line 490
    .line 491
    move-result v15

    .line 492
    move/from16 v20, v4

    .line 493
    .line 494
    const-string v4, "There is no way to get here, but the compiler thinks otherwise."

    .line 495
    .line 496
    move-object/from16 v21, v5

    .line 497
    .line 498
    packed-switch v15, :pswitch_data_1

    .line 499
    .line 500
    .line 501
    new-instance v1, Ljava/lang/RuntimeException;

    .line 502
    .line 503
    invoke-direct {v1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    throw v1

    .line 507
    :pswitch_13
    check-cast v11, Ljava/lang/Long;

    .line 508
    .line 509
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 510
    .line 511
    .line 512
    move-result-wide v22

    .line 513
    add-long v24, v22, v22

    .line 514
    .line 515
    shr-long v22, v22, v16

    .line 516
    .line 517
    xor-long v22, v24, v22

    .line 518
    .line 519
    invoke-static/range {v22 .. v23}, Lg54;->E(J)I

    .line 520
    .line 521
    .line 522
    move-result v11

    .line 523
    :goto_6
    move v5, v11

    .line 524
    goto/16 :goto_a

    .line 525
    .line 526
    :pswitch_14
    check-cast v11, Ljava/lang/Integer;

    .line 527
    .line 528
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 529
    .line 530
    .line 531
    move-result v11

    .line 532
    add-int v15, v11, v11

    .line 533
    .line 534
    shr-int/lit8 v11, v11, 0x1f

    .line 535
    .line 536
    xor-int/2addr v11, v15

    .line 537
    invoke-static {v11}, Lg54;->D(I)I

    .line 538
    .line 539
    .line 540
    move-result v11

    .line 541
    goto :goto_6

    .line 542
    :pswitch_15
    check-cast v11, Ljava/lang/Long;

    .line 543
    .line 544
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    :goto_7
    move/from16 v5, v17

    .line 548
    .line 549
    goto/16 :goto_a

    .line 550
    .line 551
    :pswitch_16
    check-cast v11, Ljava/lang/Integer;

    .line 552
    .line 553
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    :goto_8
    const/4 v5, 0x4

    .line 557
    goto/16 :goto_a

    .line 558
    .line 559
    :pswitch_17
    instance-of v15, v11, Lr54;

    .line 560
    .line 561
    if-eqz v15, :cond_6

    .line 562
    .line 563
    check-cast v11, Lr54;

    .line 564
    .line 565
    invoke-interface {v11}, Lr54;->a()I

    .line 566
    .line 567
    .line 568
    move-result v11

    .line 569
    int-to-long v5, v11

    .line 570
    invoke-static {v5, v6}, Lg54;->E(J)I

    .line 571
    .line 572
    .line 573
    move-result v5

    .line 574
    goto/16 :goto_a

    .line 575
    .line 576
    :cond_6
    check-cast v11, Ljava/lang/Integer;

    .line 577
    .line 578
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 579
    .line 580
    .line 581
    move-result v5

    .line 582
    int-to-long v5, v5

    .line 583
    invoke-static {v5, v6}, Lg54;->E(J)I

    .line 584
    .line 585
    .line 586
    move-result v5

    .line 587
    goto/16 :goto_a

    .line 588
    .line 589
    :pswitch_18
    check-cast v11, Ljava/lang/Integer;

    .line 590
    .line 591
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 592
    .line 593
    .line 594
    move-result v5

    .line 595
    invoke-static {v5}, Lg54;->D(I)I

    .line 596
    .line 597
    .line 598
    move-result v5

    .line 599
    goto/16 :goto_a

    .line 600
    .line 601
    :pswitch_19
    instance-of v5, v11, La54;

    .line 602
    .line 603
    if-eqz v5, :cond_7

    .line 604
    .line 605
    check-cast v11, La54;

    .line 606
    .line 607
    invoke-virtual {v11}, La54;->d()I

    .line 608
    .line 609
    .line 610
    move-result v5

    .line 611
    invoke-static {v5}, Lg54;->D(I)I

    .line 612
    .line 613
    .line 614
    move-result v6

    .line 615
    :goto_9
    add-int/2addr v5, v6

    .line 616
    goto/16 :goto_a

    .line 617
    .line 618
    :cond_7
    check-cast v11, [B

    .line 619
    .line 620
    array-length v5, v11

    .line 621
    invoke-static {v5}, Lg54;->D(I)I

    .line 622
    .line 623
    .line 624
    move-result v6

    .line 625
    goto :goto_9

    .line 626
    :pswitch_1a
    check-cast v11, Ls44;

    .line 627
    .line 628
    check-cast v11, Lp54;

    .line 629
    .line 630
    const/4 v15, 0x0

    .line 631
    invoke-virtual {v11, v15}, Lp54;->d(Lv64;)I

    .line 632
    .line 633
    .line 634
    move-result v5

    .line 635
    invoke-static {v5}, Lg54;->D(I)I

    .line 636
    .line 637
    .line 638
    move-result v6

    .line 639
    goto :goto_9

    .line 640
    :pswitch_1b
    const/4 v15, 0x0

    .line 641
    check-cast v11, Ls44;

    .line 642
    .line 643
    check-cast v11, Lp54;

    .line 644
    .line 645
    invoke-virtual {v11, v15}, Lp54;->d(Lv64;)I

    .line 646
    .line 647
    .line 648
    move-result v5

    .line 649
    goto :goto_a

    .line 650
    :pswitch_1c
    instance-of v5, v11, La54;

    .line 651
    .line 652
    if-eqz v5, :cond_8

    .line 653
    .line 654
    check-cast v11, La54;

    .line 655
    .line 656
    invoke-virtual {v11}, La54;->d()I

    .line 657
    .line 658
    .line 659
    move-result v5

    .line 660
    invoke-static {v5}, Lg54;->D(I)I

    .line 661
    .line 662
    .line 663
    move-result v6

    .line 664
    goto :goto_9

    .line 665
    :cond_8
    check-cast v11, Ljava/lang/String;

    .line 666
    .line 667
    invoke-static {v11}, Lg54;->F(Ljava/lang/String;)I

    .line 668
    .line 669
    .line 670
    move-result v5

    .line 671
    goto :goto_a

    .line 672
    :pswitch_1d
    check-cast v11, Ljava/lang/Boolean;

    .line 673
    .line 674
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    const/4 v5, 0x1

    .line 678
    goto :goto_a

    .line 679
    :pswitch_1e
    check-cast v11, Ljava/lang/Integer;

    .line 680
    .line 681
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    goto/16 :goto_8

    .line 685
    .line 686
    :pswitch_1f
    check-cast v11, Ljava/lang/Long;

    .line 687
    .line 688
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    goto/16 :goto_7

    .line 692
    .line 693
    :pswitch_20
    check-cast v11, Ljava/lang/Integer;

    .line 694
    .line 695
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 696
    .line 697
    .line 698
    move-result v5

    .line 699
    int-to-long v5, v5

    .line 700
    invoke-static {v5, v6}, Lg54;->E(J)I

    .line 701
    .line 702
    .line 703
    move-result v5

    .line 704
    goto :goto_a

    .line 705
    :pswitch_21
    check-cast v11, Ljava/lang/Long;

    .line 706
    .line 707
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 708
    .line 709
    .line 710
    move-result-wide v5

    .line 711
    invoke-static {v5, v6}, Lg54;->E(J)I

    .line 712
    .line 713
    .line 714
    move-result v5

    .line 715
    goto :goto_a

    .line 716
    :pswitch_22
    check-cast v11, Ljava/lang/Long;

    .line 717
    .line 718
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 719
    .line 720
    .line 721
    move-result-wide v5

    .line 722
    invoke-static {v5, v6}, Lg54;->E(J)I

    .line 723
    .line 724
    .line 725
    move-result v5

    .line 726
    goto :goto_a

    .line 727
    :pswitch_23
    check-cast v11, Ljava/lang/Float;

    .line 728
    .line 729
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    goto/16 :goto_8

    .line 733
    .line 734
    :pswitch_24
    check-cast v11, Ljava/lang/Double;

    .line 735
    .line 736
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    goto/16 :goto_7

    .line 740
    .line 741
    :goto_a
    add-int v5, v5, v18

    .line 742
    .line 743
    const/16 v6, 0x10

    .line 744
    .line 745
    invoke-static {v6}, Lg54;->D(I)I

    .line 746
    .line 747
    .line 748
    move-result v6

    .line 749
    if-ne v14, v3, :cond_9

    .line 750
    .line 751
    add-int/2addr v6, v6

    .line 752
    :cond_9
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 753
    .line 754
    .line 755
    move-result v3

    .line 756
    packed-switch v3, :pswitch_data_2

    .line 757
    .line 758
    .line 759
    new-instance v1, Ljava/lang/RuntimeException;

    .line 760
    .line 761
    invoke-direct {v1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    throw v1

    .line 765
    :pswitch_25
    check-cast v12, Ljava/lang/Long;

    .line 766
    .line 767
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 768
    .line 769
    .line 770
    move-result-wide v3

    .line 771
    add-long v11, v3, v3

    .line 772
    .line 773
    shr-long v3, v3, v16

    .line 774
    .line 775
    xor-long/2addr v3, v11

    .line 776
    invoke-static {v3, v4}, Lg54;->E(J)I

    .line 777
    .line 778
    .line 779
    move-result v3

    .line 780
    goto/16 :goto_e

    .line 781
    .line 782
    :pswitch_26
    check-cast v12, Ljava/lang/Integer;

    .line 783
    .line 784
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 785
    .line 786
    .line 787
    move-result v3

    .line 788
    add-int v4, v3, v3

    .line 789
    .line 790
    shr-int/lit8 v3, v3, 0x1f

    .line 791
    .line 792
    xor-int/2addr v3, v4

    .line 793
    invoke-static {v3}, Lg54;->D(I)I

    .line 794
    .line 795
    .line 796
    move-result v3

    .line 797
    goto/16 :goto_e

    .line 798
    .line 799
    :pswitch_27
    check-cast v12, Ljava/lang/Long;

    .line 800
    .line 801
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    :goto_b
    move/from16 v3, v17

    .line 805
    .line 806
    goto/16 :goto_e

    .line 807
    .line 808
    :pswitch_28
    check-cast v12, Ljava/lang/Integer;

    .line 809
    .line 810
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    :goto_c
    const/4 v3, 0x4

    .line 814
    goto/16 :goto_e

    .line 815
    .line 816
    :pswitch_29
    instance-of v3, v12, Lr54;

    .line 817
    .line 818
    if-eqz v3, :cond_a

    .line 819
    .line 820
    check-cast v12, Lr54;

    .line 821
    .line 822
    invoke-interface {v12}, Lr54;->a()I

    .line 823
    .line 824
    .line 825
    move-result v3

    .line 826
    int-to-long v3, v3

    .line 827
    invoke-static {v3, v4}, Lg54;->E(J)I

    .line 828
    .line 829
    .line 830
    move-result v3

    .line 831
    goto/16 :goto_e

    .line 832
    .line 833
    :cond_a
    check-cast v12, Ljava/lang/Integer;

    .line 834
    .line 835
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 836
    .line 837
    .line 838
    move-result v3

    .line 839
    int-to-long v3, v3

    .line 840
    invoke-static {v3, v4}, Lg54;->E(J)I

    .line 841
    .line 842
    .line 843
    move-result v3

    .line 844
    goto/16 :goto_e

    .line 845
    .line 846
    :pswitch_2a
    check-cast v12, Ljava/lang/Integer;

    .line 847
    .line 848
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 849
    .line 850
    .line 851
    move-result v3

    .line 852
    invoke-static {v3}, Lg54;->D(I)I

    .line 853
    .line 854
    .line 855
    move-result v3

    .line 856
    goto/16 :goto_e

    .line 857
    .line 858
    :pswitch_2b
    instance-of v3, v12, La54;

    .line 859
    .line 860
    if-eqz v3, :cond_b

    .line 861
    .line 862
    check-cast v12, La54;

    .line 863
    .line 864
    invoke-virtual {v12}, La54;->d()I

    .line 865
    .line 866
    .line 867
    move-result v3

    .line 868
    invoke-static {v3}, Lg54;->D(I)I

    .line 869
    .line 870
    .line 871
    move-result v4

    .line 872
    :goto_d
    add-int/2addr v3, v4

    .line 873
    goto/16 :goto_e

    .line 874
    .line 875
    :cond_b
    check-cast v12, [B

    .line 876
    .line 877
    array-length v3, v12

    .line 878
    invoke-static {v3}, Lg54;->D(I)I

    .line 879
    .line 880
    .line 881
    move-result v4

    .line 882
    goto :goto_d

    .line 883
    :pswitch_2c
    check-cast v12, Ls44;

    .line 884
    .line 885
    check-cast v12, Lp54;

    .line 886
    .line 887
    const/4 v15, 0x0

    .line 888
    invoke-virtual {v12, v15}, Lp54;->d(Lv64;)I

    .line 889
    .line 890
    .line 891
    move-result v3

    .line 892
    invoke-static {v3}, Lg54;->D(I)I

    .line 893
    .line 894
    .line 895
    move-result v4

    .line 896
    goto :goto_d

    .line 897
    :pswitch_2d
    const/4 v15, 0x0

    .line 898
    check-cast v12, Ls44;

    .line 899
    .line 900
    check-cast v12, Lp54;

    .line 901
    .line 902
    invoke-virtual {v12, v15}, Lp54;->d(Lv64;)I

    .line 903
    .line 904
    .line 905
    move-result v3

    .line 906
    goto :goto_e

    .line 907
    :pswitch_2e
    instance-of v3, v12, La54;

    .line 908
    .line 909
    if-eqz v3, :cond_c

    .line 910
    .line 911
    check-cast v12, La54;

    .line 912
    .line 913
    invoke-virtual {v12}, La54;->d()I

    .line 914
    .line 915
    .line 916
    move-result v3

    .line 917
    invoke-static {v3}, Lg54;->D(I)I

    .line 918
    .line 919
    .line 920
    move-result v4

    .line 921
    goto :goto_d

    .line 922
    :cond_c
    check-cast v12, Ljava/lang/String;

    .line 923
    .line 924
    invoke-static {v12}, Lg54;->F(Ljava/lang/String;)I

    .line 925
    .line 926
    .line 927
    move-result v3

    .line 928
    goto :goto_e

    .line 929
    :pswitch_2f
    check-cast v12, Ljava/lang/Boolean;

    .line 930
    .line 931
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 932
    .line 933
    .line 934
    const/4 v3, 0x1

    .line 935
    goto :goto_e

    .line 936
    :pswitch_30
    check-cast v12, Ljava/lang/Integer;

    .line 937
    .line 938
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 939
    .line 940
    .line 941
    goto/16 :goto_c

    .line 942
    .line 943
    :pswitch_31
    check-cast v12, Ljava/lang/Long;

    .line 944
    .line 945
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 946
    .line 947
    .line 948
    goto/16 :goto_b

    .line 949
    .line 950
    :pswitch_32
    check-cast v12, Ljava/lang/Integer;

    .line 951
    .line 952
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 953
    .line 954
    .line 955
    move-result v3

    .line 956
    int-to-long v3, v3

    .line 957
    invoke-static {v3, v4}, Lg54;->E(J)I

    .line 958
    .line 959
    .line 960
    move-result v3

    .line 961
    goto :goto_e

    .line 962
    :pswitch_33
    check-cast v12, Ljava/lang/Long;

    .line 963
    .line 964
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 965
    .line 966
    .line 967
    move-result-wide v3

    .line 968
    invoke-static {v3, v4}, Lg54;->E(J)I

    .line 969
    .line 970
    .line 971
    move-result v3

    .line 972
    goto :goto_e

    .line 973
    :pswitch_34
    check-cast v12, Ljava/lang/Long;

    .line 974
    .line 975
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 976
    .line 977
    .line 978
    move-result-wide v3

    .line 979
    invoke-static {v3, v4}, Lg54;->E(J)I

    .line 980
    .line 981
    .line 982
    move-result v3

    .line 983
    goto :goto_e

    .line 984
    :pswitch_35
    check-cast v12, Ljava/lang/Float;

    .line 985
    .line 986
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    goto/16 :goto_c

    .line 990
    .line 991
    :pswitch_36
    check-cast v12, Ljava/lang/Double;

    .line 992
    .line 993
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 994
    .line 995
    .line 996
    goto/16 :goto_b

    .line 997
    .line 998
    :goto_e
    add-int/2addr v3, v6

    .line 999
    add-int/2addr v3, v5

    .line 1000
    invoke-virtual {v7, v3}, Lg54;->X(I)V

    .line 1001
    .line 1002
    .line 1003
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v3

    .line 1007
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v4

    .line 1011
    invoke-static {v7, v9, v3, v4}, Lf64;->a(Lg54;Ljr3;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1012
    .line 1013
    .line 1014
    move-object/from16 v6, p2

    .line 1015
    .line 1016
    move/from16 v3, v19

    .line 1017
    .line 1018
    move/from16 v4, v20

    .line 1019
    .line 1020
    move-object/from16 v5, v21

    .line 1021
    .line 1022
    const/4 v14, 0x4

    .line 1023
    goto/16 :goto_5

    .line 1024
    .line 1025
    :cond_d
    move-object/from16 v12, p2

    .line 1026
    .line 1027
    goto/16 :goto_4

    .line 1028
    .line 1029
    :pswitch_37
    move/from16 v19, v3

    .line 1030
    .line 1031
    move/from16 v20, v4

    .line 1032
    .line 1033
    aget v3, v9, v2

    .line 1034
    .line 1035
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v4

    .line 1039
    check-cast v4, Ljava/util/List;

    .line 1040
    .line 1041
    invoke-virtual {v0, v2}, Lk64;->D(I)Lv64;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v5

    .line 1045
    sget-object v6, Lw64;->a:Lpz;

    .line 1046
    .line 1047
    if-eqz v4, :cond_e

    .line 1048
    .line 1049
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1050
    .line 1051
    .line 1052
    move-result v6

    .line 1053
    if-nez v6, :cond_e

    .line 1054
    .line 1055
    const/4 v6, 0x0

    .line 1056
    :goto_f
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1057
    .line 1058
    .line 1059
    move-result v9

    .line 1060
    if-ge v6, v9, :cond_e

    .line 1061
    .line 1062
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v9

    .line 1066
    check-cast v9, Ls44;

    .line 1067
    .line 1068
    invoke-virtual {v7, v3, v15}, Lg54;->I(II)V

    .line 1069
    .line 1070
    .line 1071
    move-object/from16 v12, p2

    .line 1072
    .line 1073
    invoke-interface {v5, v9, v12}, Lv64;->e(Ljava/lang/Object;Lit3;)V

    .line 1074
    .line 1075
    .line 1076
    const/4 v9, 0x4

    .line 1077
    invoke-virtual {v7, v3, v9}, Lg54;->I(II)V

    .line 1078
    .line 1079
    .line 1080
    add-int/lit8 v6, v6, 0x1

    .line 1081
    .line 1082
    goto :goto_f

    .line 1083
    :cond_e
    move-object/from16 v12, p2

    .line 1084
    .line 1085
    :cond_f
    :goto_10
    move/from16 v3, v19

    .line 1086
    .line 1087
    move/from16 v4, v20

    .line 1088
    .line 1089
    goto/16 :goto_4

    .line 1090
    .line 1091
    :pswitch_38
    move/from16 v19, v3

    .line 1092
    .line 1093
    move/from16 v20, v4

    .line 1094
    .line 1095
    move-object v12, v6

    .line 1096
    aget v3, v9, v2

    .line 1097
    .line 1098
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v4

    .line 1102
    check-cast v4, Ljava/util/List;

    .line 1103
    .line 1104
    const/4 v5, 0x1

    .line 1105
    invoke-static {v3, v4, v12, v5}, Lw64;->j(ILjava/util/List;Lit3;Z)V

    .line 1106
    .line 1107
    .line 1108
    goto :goto_10

    .line 1109
    :pswitch_39
    move/from16 v19, v3

    .line 1110
    .line 1111
    move/from16 v20, v4

    .line 1112
    .line 1113
    move-object v12, v6

    .line 1114
    const/4 v5, 0x1

    .line 1115
    aget v3, v9, v2

    .line 1116
    .line 1117
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v4

    .line 1121
    check-cast v4, Ljava/util/List;

    .line 1122
    .line 1123
    invoke-static {v3, v4, v12, v5}, Lw64;->o(ILjava/util/List;Lit3;Z)V

    .line 1124
    .line 1125
    .line 1126
    goto :goto_10

    .line 1127
    :pswitch_3a
    move/from16 v19, v3

    .line 1128
    .line 1129
    move/from16 v20, v4

    .line 1130
    .line 1131
    move-object v12, v6

    .line 1132
    const/4 v5, 0x1

    .line 1133
    aget v3, v9, v2

    .line 1134
    .line 1135
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v4

    .line 1139
    check-cast v4, Ljava/util/List;

    .line 1140
    .line 1141
    invoke-static {v3, v4, v12, v5}, Lw64;->l(ILjava/util/List;Lit3;Z)V

    .line 1142
    .line 1143
    .line 1144
    goto :goto_10

    .line 1145
    :pswitch_3b
    move/from16 v19, v3

    .line 1146
    .line 1147
    move/from16 v20, v4

    .line 1148
    .line 1149
    move-object v12, v6

    .line 1150
    const/4 v5, 0x1

    .line 1151
    aget v3, v9, v2

    .line 1152
    .line 1153
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v4

    .line 1157
    check-cast v4, Ljava/util/List;

    .line 1158
    .line 1159
    invoke-static {v3, v4, v12, v5}, Lw64;->q(ILjava/util/List;Lit3;Z)V

    .line 1160
    .line 1161
    .line 1162
    goto :goto_10

    .line 1163
    :pswitch_3c
    move/from16 v19, v3

    .line 1164
    .line 1165
    move/from16 v20, v4

    .line 1166
    .line 1167
    move-object v12, v6

    .line 1168
    const/4 v5, 0x1

    .line 1169
    aget v3, v9, v2

    .line 1170
    .line 1171
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v4

    .line 1175
    check-cast v4, Ljava/util/List;

    .line 1176
    .line 1177
    invoke-static {v3, v4, v12, v5}, Lw64;->r(ILjava/util/List;Lit3;Z)V

    .line 1178
    .line 1179
    .line 1180
    goto :goto_10

    .line 1181
    :pswitch_3d
    move/from16 v19, v3

    .line 1182
    .line 1183
    move/from16 v20, v4

    .line 1184
    .line 1185
    move-object v12, v6

    .line 1186
    const/4 v5, 0x1

    .line 1187
    aget v3, v9, v2

    .line 1188
    .line 1189
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v4

    .line 1193
    check-cast v4, Ljava/util/List;

    .line 1194
    .line 1195
    invoke-static {v3, v4, v12, v5}, Lw64;->n(ILjava/util/List;Lit3;Z)V

    .line 1196
    .line 1197
    .line 1198
    goto :goto_10

    .line 1199
    :pswitch_3e
    move/from16 v19, v3

    .line 1200
    .line 1201
    move/from16 v20, v4

    .line 1202
    .line 1203
    move-object v12, v6

    .line 1204
    const/4 v5, 0x1

    .line 1205
    aget v3, v9, v2

    .line 1206
    .line 1207
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v4

    .line 1211
    check-cast v4, Ljava/util/List;

    .line 1212
    .line 1213
    invoke-static {v3, v4, v12, v5}, Lw64;->s(ILjava/util/List;Lit3;Z)V

    .line 1214
    .line 1215
    .line 1216
    goto/16 :goto_10

    .line 1217
    .line 1218
    :pswitch_3f
    move/from16 v19, v3

    .line 1219
    .line 1220
    move/from16 v20, v4

    .line 1221
    .line 1222
    move-object v12, v6

    .line 1223
    const/4 v5, 0x1

    .line 1224
    aget v3, v9, v2

    .line 1225
    .line 1226
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v4

    .line 1230
    check-cast v4, Ljava/util/List;

    .line 1231
    .line 1232
    invoke-static {v3, v4, v12, v5}, Lw64;->p(ILjava/util/List;Lit3;Z)V

    .line 1233
    .line 1234
    .line 1235
    goto/16 :goto_10

    .line 1236
    .line 1237
    :pswitch_40
    move/from16 v19, v3

    .line 1238
    .line 1239
    move/from16 v20, v4

    .line 1240
    .line 1241
    move-object v12, v6

    .line 1242
    const/4 v5, 0x1

    .line 1243
    aget v3, v9, v2

    .line 1244
    .line 1245
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v4

    .line 1249
    check-cast v4, Ljava/util/List;

    .line 1250
    .line 1251
    invoke-static {v3, v4, v12, v5}, Lw64;->k(ILjava/util/List;Lit3;Z)V

    .line 1252
    .line 1253
    .line 1254
    goto/16 :goto_10

    .line 1255
    .line 1256
    :pswitch_41
    move/from16 v19, v3

    .line 1257
    .line 1258
    move/from16 v20, v4

    .line 1259
    .line 1260
    move-object v12, v6

    .line 1261
    const/4 v5, 0x1

    .line 1262
    aget v3, v9, v2

    .line 1263
    .line 1264
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v4

    .line 1268
    check-cast v4, Ljava/util/List;

    .line 1269
    .line 1270
    invoke-static {v3, v4, v12, v5}, Lw64;->m(ILjava/util/List;Lit3;Z)V

    .line 1271
    .line 1272
    .line 1273
    goto/16 :goto_10

    .line 1274
    .line 1275
    :pswitch_42
    move/from16 v19, v3

    .line 1276
    .line 1277
    move/from16 v20, v4

    .line 1278
    .line 1279
    move-object v12, v6

    .line 1280
    const/4 v5, 0x1

    .line 1281
    aget v3, v9, v2

    .line 1282
    .line 1283
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v4

    .line 1287
    check-cast v4, Ljava/util/List;

    .line 1288
    .line 1289
    invoke-static {v3, v4, v12, v5}, Lw64;->i(ILjava/util/List;Lit3;Z)V

    .line 1290
    .line 1291
    .line 1292
    goto/16 :goto_10

    .line 1293
    .line 1294
    :pswitch_43
    move/from16 v19, v3

    .line 1295
    .line 1296
    move/from16 v20, v4

    .line 1297
    .line 1298
    move-object v12, v6

    .line 1299
    const/4 v5, 0x1

    .line 1300
    aget v3, v9, v2

    .line 1301
    .line 1302
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v4

    .line 1306
    check-cast v4, Ljava/util/List;

    .line 1307
    .line 1308
    invoke-static {v3, v4, v12, v5}, Lw64;->h(ILjava/util/List;Lit3;Z)V

    .line 1309
    .line 1310
    .line 1311
    goto/16 :goto_10

    .line 1312
    .line 1313
    :pswitch_44
    move/from16 v19, v3

    .line 1314
    .line 1315
    move/from16 v20, v4

    .line 1316
    .line 1317
    move-object v12, v6

    .line 1318
    const/4 v5, 0x1

    .line 1319
    aget v3, v9, v2

    .line 1320
    .line 1321
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v4

    .line 1325
    check-cast v4, Ljava/util/List;

    .line 1326
    .line 1327
    invoke-static {v3, v4, v12, v5}, Lw64;->g(ILjava/util/List;Lit3;Z)V

    .line 1328
    .line 1329
    .line 1330
    goto/16 :goto_10

    .line 1331
    .line 1332
    :pswitch_45
    move/from16 v19, v3

    .line 1333
    .line 1334
    move/from16 v20, v4

    .line 1335
    .line 1336
    move-object v12, v6

    .line 1337
    const/4 v5, 0x1

    .line 1338
    aget v3, v9, v2

    .line 1339
    .line 1340
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v4

    .line 1344
    check-cast v4, Ljava/util/List;

    .line 1345
    .line 1346
    invoke-static {v3, v4, v12, v5}, Lw64;->f(ILjava/util/List;Lit3;Z)V

    .line 1347
    .line 1348
    .line 1349
    goto/16 :goto_10

    .line 1350
    .line 1351
    :pswitch_46
    move/from16 v19, v3

    .line 1352
    .line 1353
    move/from16 v20, v4

    .line 1354
    .line 1355
    move-object v12, v6

    .line 1356
    aget v3, v9, v2

    .line 1357
    .line 1358
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v4

    .line 1362
    check-cast v4, Ljava/util/List;

    .line 1363
    .line 1364
    const/4 v5, 0x0

    .line 1365
    invoke-static {v3, v4, v12, v5}, Lw64;->j(ILjava/util/List;Lit3;Z)V

    .line 1366
    .line 1367
    .line 1368
    :goto_11
    move v6, v5

    .line 1369
    :goto_12
    move/from16 v3, v19

    .line 1370
    .line 1371
    move/from16 v4, v20

    .line 1372
    .line 1373
    goto/16 :goto_16

    .line 1374
    .line 1375
    :pswitch_47
    move/from16 v19, v3

    .line 1376
    .line 1377
    move/from16 v20, v4

    .line 1378
    .line 1379
    move-object v12, v6

    .line 1380
    const/4 v5, 0x0

    .line 1381
    aget v3, v9, v2

    .line 1382
    .line 1383
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v4

    .line 1387
    check-cast v4, Ljava/util/List;

    .line 1388
    .line 1389
    invoke-static {v3, v4, v12, v5}, Lw64;->o(ILjava/util/List;Lit3;Z)V

    .line 1390
    .line 1391
    .line 1392
    goto :goto_11

    .line 1393
    :pswitch_48
    move/from16 v19, v3

    .line 1394
    .line 1395
    move/from16 v20, v4

    .line 1396
    .line 1397
    move-object v12, v6

    .line 1398
    const/4 v5, 0x0

    .line 1399
    aget v3, v9, v2

    .line 1400
    .line 1401
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v4

    .line 1405
    check-cast v4, Ljava/util/List;

    .line 1406
    .line 1407
    invoke-static {v3, v4, v12, v5}, Lw64;->l(ILjava/util/List;Lit3;Z)V

    .line 1408
    .line 1409
    .line 1410
    goto :goto_11

    .line 1411
    :pswitch_49
    move/from16 v19, v3

    .line 1412
    .line 1413
    move/from16 v20, v4

    .line 1414
    .line 1415
    move-object v12, v6

    .line 1416
    const/4 v5, 0x0

    .line 1417
    aget v3, v9, v2

    .line 1418
    .line 1419
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v4

    .line 1423
    check-cast v4, Ljava/util/List;

    .line 1424
    .line 1425
    invoke-static {v3, v4, v12, v5}, Lw64;->q(ILjava/util/List;Lit3;Z)V

    .line 1426
    .line 1427
    .line 1428
    goto :goto_11

    .line 1429
    :pswitch_4a
    move/from16 v19, v3

    .line 1430
    .line 1431
    move/from16 v20, v4

    .line 1432
    .line 1433
    move-object v12, v6

    .line 1434
    const/4 v5, 0x0

    .line 1435
    aget v3, v9, v2

    .line 1436
    .line 1437
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v4

    .line 1441
    check-cast v4, Ljava/util/List;

    .line 1442
    .line 1443
    invoke-static {v3, v4, v12, v5}, Lw64;->r(ILjava/util/List;Lit3;Z)V

    .line 1444
    .line 1445
    .line 1446
    goto :goto_11

    .line 1447
    :pswitch_4b
    move/from16 v19, v3

    .line 1448
    .line 1449
    move/from16 v20, v4

    .line 1450
    .line 1451
    move-object v12, v6

    .line 1452
    const/4 v5, 0x0

    .line 1453
    aget v3, v9, v2

    .line 1454
    .line 1455
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v4

    .line 1459
    check-cast v4, Ljava/util/List;

    .line 1460
    .line 1461
    invoke-static {v3, v4, v12, v5}, Lw64;->n(ILjava/util/List;Lit3;Z)V

    .line 1462
    .line 1463
    .line 1464
    goto :goto_11

    .line 1465
    :pswitch_4c
    move/from16 v19, v3

    .line 1466
    .line 1467
    move/from16 v20, v4

    .line 1468
    .line 1469
    move-object v12, v6

    .line 1470
    aget v3, v9, v2

    .line 1471
    .line 1472
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v4

    .line 1476
    check-cast v4, Ljava/util/List;

    .line 1477
    .line 1478
    sget-object v5, Lw64;->a:Lpz;

    .line 1479
    .line 1480
    if-eqz v4, :cond_f

    .line 1481
    .line 1482
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1483
    .line 1484
    .line 1485
    move-result v5

    .line 1486
    if-nez v5, :cond_f

    .line 1487
    .line 1488
    const/4 v5, 0x0

    .line 1489
    :goto_13
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1490
    .line 1491
    .line 1492
    move-result v6

    .line 1493
    if-ge v5, v6, :cond_f

    .line 1494
    .line 1495
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v6

    .line 1499
    check-cast v6, La54;

    .line 1500
    .line 1501
    invoke-virtual {v7, v3, v6}, Lg54;->R(ILa54;)V

    .line 1502
    .line 1503
    .line 1504
    add-int/lit8 v5, v5, 0x1

    .line 1505
    .line 1506
    goto :goto_13

    .line 1507
    :pswitch_4d
    move/from16 v19, v3

    .line 1508
    .line 1509
    move/from16 v20, v4

    .line 1510
    .line 1511
    move-object v12, v6

    .line 1512
    aget v3, v9, v2

    .line 1513
    .line 1514
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v4

    .line 1518
    check-cast v4, Ljava/util/List;

    .line 1519
    .line 1520
    invoke-virtual {v0, v2}, Lk64;->D(I)Lv64;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v5

    .line 1524
    sget-object v6, Lw64;->a:Lpz;

    .line 1525
    .line 1526
    if-eqz v4, :cond_f

    .line 1527
    .line 1528
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1529
    .line 1530
    .line 1531
    move-result v6

    .line 1532
    if-nez v6, :cond_f

    .line 1533
    .line 1534
    const/4 v6, 0x0

    .line 1535
    :goto_14
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1536
    .line 1537
    .line 1538
    move-result v9

    .line 1539
    if-ge v6, v9, :cond_f

    .line 1540
    .line 1541
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v9

    .line 1545
    invoke-virtual {v12, v3, v9, v5}, Lit3;->e(ILjava/lang/Object;Lv64;)V

    .line 1546
    .line 1547
    .line 1548
    add-int/lit8 v6, v6, 0x1

    .line 1549
    .line 1550
    goto :goto_14

    .line 1551
    :pswitch_4e
    move/from16 v19, v3

    .line 1552
    .line 1553
    move/from16 v20, v4

    .line 1554
    .line 1555
    move-object v12, v6

    .line 1556
    aget v3, v9, v2

    .line 1557
    .line 1558
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v4

    .line 1562
    check-cast v4, Ljava/util/List;

    .line 1563
    .line 1564
    sget-object v5, Lw64;->a:Lpz;

    .line 1565
    .line 1566
    if-eqz v4, :cond_f

    .line 1567
    .line 1568
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1569
    .line 1570
    .line 1571
    move-result v5

    .line 1572
    if-nez v5, :cond_f

    .line 1573
    .line 1574
    const/4 v5, 0x0

    .line 1575
    :goto_15
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1576
    .line 1577
    .line 1578
    move-result v6

    .line 1579
    if-ge v5, v6, :cond_f

    .line 1580
    .line 1581
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v6

    .line 1585
    check-cast v6, Ljava/lang/String;

    .line 1586
    .line 1587
    invoke-virtual {v7, v6, v3}, Lg54;->Q(Ljava/lang/String;I)V

    .line 1588
    .line 1589
    .line 1590
    add-int/lit8 v5, v5, 0x1

    .line 1591
    .line 1592
    goto :goto_15

    .line 1593
    :pswitch_4f
    move/from16 v19, v3

    .line 1594
    .line 1595
    move/from16 v20, v4

    .line 1596
    .line 1597
    move-object v12, v6

    .line 1598
    aget v3, v9, v2

    .line 1599
    .line 1600
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v4

    .line 1604
    check-cast v4, Ljava/util/List;

    .line 1605
    .line 1606
    const/4 v6, 0x0

    .line 1607
    invoke-static {v3, v4, v12, v6}, Lw64;->s(ILjava/util/List;Lit3;Z)V

    .line 1608
    .line 1609
    .line 1610
    goto/16 :goto_12

    .line 1611
    .line 1612
    :pswitch_50
    move/from16 v19, v3

    .line 1613
    .line 1614
    move/from16 v20, v4

    .line 1615
    .line 1616
    move-object v12, v6

    .line 1617
    const/4 v6, 0x0

    .line 1618
    aget v3, v9, v2

    .line 1619
    .line 1620
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v4

    .line 1624
    check-cast v4, Ljava/util/List;

    .line 1625
    .line 1626
    invoke-static {v3, v4, v12, v6}, Lw64;->p(ILjava/util/List;Lit3;Z)V

    .line 1627
    .line 1628
    .line 1629
    goto/16 :goto_12

    .line 1630
    .line 1631
    :pswitch_51
    move/from16 v19, v3

    .line 1632
    .line 1633
    move/from16 v20, v4

    .line 1634
    .line 1635
    move-object v12, v6

    .line 1636
    const/4 v6, 0x0

    .line 1637
    aget v3, v9, v2

    .line 1638
    .line 1639
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v4

    .line 1643
    check-cast v4, Ljava/util/List;

    .line 1644
    .line 1645
    invoke-static {v3, v4, v12, v6}, Lw64;->k(ILjava/util/List;Lit3;Z)V

    .line 1646
    .line 1647
    .line 1648
    goto/16 :goto_12

    .line 1649
    .line 1650
    :pswitch_52
    move/from16 v19, v3

    .line 1651
    .line 1652
    move/from16 v20, v4

    .line 1653
    .line 1654
    move-object v12, v6

    .line 1655
    const/4 v6, 0x0

    .line 1656
    aget v3, v9, v2

    .line 1657
    .line 1658
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v4

    .line 1662
    check-cast v4, Ljava/util/List;

    .line 1663
    .line 1664
    invoke-static {v3, v4, v12, v6}, Lw64;->m(ILjava/util/List;Lit3;Z)V

    .line 1665
    .line 1666
    .line 1667
    goto/16 :goto_12

    .line 1668
    .line 1669
    :pswitch_53
    move/from16 v19, v3

    .line 1670
    .line 1671
    move/from16 v20, v4

    .line 1672
    .line 1673
    move-object v12, v6

    .line 1674
    const/4 v6, 0x0

    .line 1675
    aget v3, v9, v2

    .line 1676
    .line 1677
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v4

    .line 1681
    check-cast v4, Ljava/util/List;

    .line 1682
    .line 1683
    invoke-static {v3, v4, v12, v6}, Lw64;->i(ILjava/util/List;Lit3;Z)V

    .line 1684
    .line 1685
    .line 1686
    goto/16 :goto_12

    .line 1687
    .line 1688
    :pswitch_54
    move/from16 v19, v3

    .line 1689
    .line 1690
    move/from16 v20, v4

    .line 1691
    .line 1692
    move-object v12, v6

    .line 1693
    const/4 v6, 0x0

    .line 1694
    aget v3, v9, v2

    .line 1695
    .line 1696
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v4

    .line 1700
    check-cast v4, Ljava/util/List;

    .line 1701
    .line 1702
    invoke-static {v3, v4, v12, v6}, Lw64;->h(ILjava/util/List;Lit3;Z)V

    .line 1703
    .line 1704
    .line 1705
    goto/16 :goto_12

    .line 1706
    .line 1707
    :pswitch_55
    move/from16 v19, v3

    .line 1708
    .line 1709
    move/from16 v20, v4

    .line 1710
    .line 1711
    move-object v12, v6

    .line 1712
    const/4 v6, 0x0

    .line 1713
    aget v3, v9, v2

    .line 1714
    .line 1715
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v4

    .line 1719
    check-cast v4, Ljava/util/List;

    .line 1720
    .line 1721
    invoke-static {v3, v4, v12, v6}, Lw64;->g(ILjava/util/List;Lit3;Z)V

    .line 1722
    .line 1723
    .line 1724
    goto/16 :goto_12

    .line 1725
    .line 1726
    :pswitch_56
    move/from16 v19, v3

    .line 1727
    .line 1728
    move/from16 v20, v4

    .line 1729
    .line 1730
    move-object v12, v6

    .line 1731
    const/4 v6, 0x0

    .line 1732
    aget v3, v9, v2

    .line 1733
    .line 1734
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v4

    .line 1738
    check-cast v4, Ljava/util/List;

    .line 1739
    .line 1740
    invoke-static {v3, v4, v12, v6}, Lw64;->f(ILjava/util/List;Lit3;Z)V

    .line 1741
    .line 1742
    .line 1743
    goto/16 :goto_12

    .line 1744
    .line 1745
    :pswitch_57
    move-object v12, v6

    .line 1746
    const/4 v6, 0x0

    .line 1747
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 1748
    .line 1749
    .line 1750
    move-result v5

    .line 1751
    if-eqz v5, :cond_11

    .line 1752
    .line 1753
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v5

    .line 1757
    invoke-virtual {v0, v2}, Lk64;->D(I)Lv64;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v9

    .line 1761
    check-cast v5, Ls44;

    .line 1762
    .line 1763
    invoke-virtual {v7, v13, v15}, Lg54;->I(II)V

    .line 1764
    .line 1765
    .line 1766
    invoke-interface {v9, v5, v12}, Lv64;->e(Ljava/lang/Object;Lit3;)V

    .line 1767
    .line 1768
    .line 1769
    const/4 v9, 0x4

    .line 1770
    invoke-virtual {v7, v13, v9}, Lg54;->I(II)V

    .line 1771
    .line 1772
    .line 1773
    goto/16 :goto_16

    .line 1774
    .line 1775
    :pswitch_58
    move-object v12, v6

    .line 1776
    const/4 v6, 0x0

    .line 1777
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 1778
    .line 1779
    .line 1780
    move-result v5

    .line 1781
    if-eqz v5, :cond_11

    .line 1782
    .line 1783
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1784
    .line 1785
    .line 1786
    move-result-wide v9

    .line 1787
    add-long v14, v9, v9

    .line 1788
    .line 1789
    shr-long v9, v9, v16

    .line 1790
    .line 1791
    xor-long/2addr v9, v14

    .line 1792
    invoke-virtual {v7, v13, v9, v10}, Lg54;->M(IJ)V

    .line 1793
    .line 1794
    .line 1795
    goto/16 :goto_16

    .line 1796
    .line 1797
    :pswitch_59
    move-object v12, v6

    .line 1798
    const/4 v6, 0x0

    .line 1799
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 1800
    .line 1801
    .line 1802
    move-result v5

    .line 1803
    if-eqz v5, :cond_11

    .line 1804
    .line 1805
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1806
    .line 1807
    .line 1808
    move-result v0

    .line 1809
    add-int v5, v0, v0

    .line 1810
    .line 1811
    shr-int/lit8 v0, v0, 0x1f

    .line 1812
    .line 1813
    xor-int/2addr v0, v5

    .line 1814
    invoke-virtual {v7, v13, v0}, Lg54;->K(II)V

    .line 1815
    .line 1816
    .line 1817
    goto/16 :goto_16

    .line 1818
    .line 1819
    :pswitch_5a
    move-object v12, v6

    .line 1820
    const/4 v6, 0x0

    .line 1821
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 1822
    .line 1823
    .line 1824
    move-result v5

    .line 1825
    if-eqz v5, :cond_11

    .line 1826
    .line 1827
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1828
    .line 1829
    .line 1830
    move-result-wide v9

    .line 1831
    invoke-virtual {v7, v13, v9, v10}, Lg54;->O(IJ)V

    .line 1832
    .line 1833
    .line 1834
    goto/16 :goto_16

    .line 1835
    .line 1836
    :pswitch_5b
    move-object v12, v6

    .line 1837
    const/4 v6, 0x0

    .line 1838
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 1839
    .line 1840
    .line 1841
    move-result v5

    .line 1842
    if-eqz v5, :cond_11

    .line 1843
    .line 1844
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1845
    .line 1846
    .line 1847
    move-result v0

    .line 1848
    invoke-virtual {v7, v13, v0}, Lg54;->L(II)V

    .line 1849
    .line 1850
    .line 1851
    goto/16 :goto_16

    .line 1852
    .line 1853
    :pswitch_5c
    move-object v12, v6

    .line 1854
    const/4 v6, 0x0

    .line 1855
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 1856
    .line 1857
    .line 1858
    move-result v5

    .line 1859
    if-eqz v5, :cond_11

    .line 1860
    .line 1861
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1862
    .line 1863
    .line 1864
    move-result v0

    .line 1865
    invoke-virtual {v7, v13, v0}, Lg54;->J(II)V

    .line 1866
    .line 1867
    .line 1868
    goto/16 :goto_16

    .line 1869
    .line 1870
    :pswitch_5d
    move-object v12, v6

    .line 1871
    const/4 v6, 0x0

    .line 1872
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 1873
    .line 1874
    .line 1875
    move-result v5

    .line 1876
    if-eqz v5, :cond_11

    .line 1877
    .line 1878
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1879
    .line 1880
    .line 1881
    move-result v0

    .line 1882
    invoke-virtual {v7, v13, v0}, Lg54;->K(II)V

    .line 1883
    .line 1884
    .line 1885
    goto/16 :goto_16

    .line 1886
    .line 1887
    :pswitch_5e
    move-object v12, v6

    .line 1888
    const/4 v6, 0x0

    .line 1889
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 1890
    .line 1891
    .line 1892
    move-result v5

    .line 1893
    if-eqz v5, :cond_11

    .line 1894
    .line 1895
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v0

    .line 1899
    check-cast v0, La54;

    .line 1900
    .line 1901
    invoke-virtual {v7, v13, v0}, Lg54;->R(ILa54;)V

    .line 1902
    .line 1903
    .line 1904
    goto/16 :goto_16

    .line 1905
    .line 1906
    :pswitch_5f
    move-object v12, v6

    .line 1907
    const/4 v6, 0x0

    .line 1908
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 1909
    .line 1910
    .line 1911
    move-result v5

    .line 1912
    if-eqz v5, :cond_11

    .line 1913
    .line 1914
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v5

    .line 1918
    invoke-virtual {v0, v2}, Lk64;->D(I)Lv64;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v9

    .line 1922
    invoke-virtual {v12, v13, v5, v9}, Lit3;->e(ILjava/lang/Object;Lv64;)V

    .line 1923
    .line 1924
    .line 1925
    goto/16 :goto_16

    .line 1926
    .line 1927
    :pswitch_60
    move-object v12, v6

    .line 1928
    const/4 v6, 0x0

    .line 1929
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 1930
    .line 1931
    .line 1932
    move-result v5

    .line 1933
    if-eqz v5, :cond_11

    .line 1934
    .line 1935
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1936
    .line 1937
    .line 1938
    move-result-object v0

    .line 1939
    instance-of v5, v0, Ljava/lang/String;

    .line 1940
    .line 1941
    if-eqz v5, :cond_10

    .line 1942
    .line 1943
    check-cast v0, Ljava/lang/String;

    .line 1944
    .line 1945
    invoke-virtual {v7, v0, v13}, Lg54;->Q(Ljava/lang/String;I)V

    .line 1946
    .line 1947
    .line 1948
    goto/16 :goto_16

    .line 1949
    .line 1950
    :cond_10
    check-cast v0, La54;

    .line 1951
    .line 1952
    invoke-virtual {v7, v13, v0}, Lg54;->R(ILa54;)V

    .line 1953
    .line 1954
    .line 1955
    goto/16 :goto_16

    .line 1956
    .line 1957
    :pswitch_61
    move-object v12, v6

    .line 1958
    const/4 v6, 0x0

    .line 1959
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 1960
    .line 1961
    .line 1962
    move-result v5

    .line 1963
    if-eqz v5, :cond_11

    .line 1964
    .line 1965
    sget-object v0, Lg74;->c:Lf74;

    .line 1966
    .line 1967
    invoke-virtual {v0, v10, v11, v1}, Lf74;->t1(JLjava/lang/Object;)Z

    .line 1968
    .line 1969
    .line 1970
    move-result v0

    .line 1971
    invoke-virtual {v7, v13, v0}, Lg54;->P(IZ)V

    .line 1972
    .line 1973
    .line 1974
    goto/16 :goto_16

    .line 1975
    .line 1976
    :pswitch_62
    move-object v12, v6

    .line 1977
    const/4 v6, 0x0

    .line 1978
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 1979
    .line 1980
    .line 1981
    move-result v5

    .line 1982
    if-eqz v5, :cond_11

    .line 1983
    .line 1984
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1985
    .line 1986
    .line 1987
    move-result v0

    .line 1988
    invoke-virtual {v7, v13, v0}, Lg54;->L(II)V

    .line 1989
    .line 1990
    .line 1991
    goto/16 :goto_16

    .line 1992
    .line 1993
    :pswitch_63
    move-object v12, v6

    .line 1994
    const/4 v6, 0x0

    .line 1995
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 1996
    .line 1997
    .line 1998
    move-result v5

    .line 1999
    if-eqz v5, :cond_11

    .line 2000
    .line 2001
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2002
    .line 2003
    .line 2004
    move-result-wide v9

    .line 2005
    invoke-virtual {v7, v13, v9, v10}, Lg54;->O(IJ)V

    .line 2006
    .line 2007
    .line 2008
    goto :goto_16

    .line 2009
    :pswitch_64
    move-object v12, v6

    .line 2010
    const/4 v6, 0x0

    .line 2011
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2012
    .line 2013
    .line 2014
    move-result v5

    .line 2015
    if-eqz v5, :cond_11

    .line 2016
    .line 2017
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2018
    .line 2019
    .line 2020
    move-result v0

    .line 2021
    invoke-virtual {v7, v13, v0}, Lg54;->J(II)V

    .line 2022
    .line 2023
    .line 2024
    goto :goto_16

    .line 2025
    :pswitch_65
    move-object v12, v6

    .line 2026
    const/4 v6, 0x0

    .line 2027
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2028
    .line 2029
    .line 2030
    move-result v5

    .line 2031
    if-eqz v5, :cond_11

    .line 2032
    .line 2033
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2034
    .line 2035
    .line 2036
    move-result-wide v9

    .line 2037
    invoke-virtual {v7, v13, v9, v10}, Lg54;->M(IJ)V

    .line 2038
    .line 2039
    .line 2040
    goto :goto_16

    .line 2041
    :pswitch_66
    move-object v12, v6

    .line 2042
    const/4 v6, 0x0

    .line 2043
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2044
    .line 2045
    .line 2046
    move-result v5

    .line 2047
    if-eqz v5, :cond_11

    .line 2048
    .line 2049
    invoke-virtual {v8, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2050
    .line 2051
    .line 2052
    move-result-wide v9

    .line 2053
    invoke-virtual {v7, v13, v9, v10}, Lg54;->M(IJ)V

    .line 2054
    .line 2055
    .line 2056
    goto :goto_16

    .line 2057
    :pswitch_67
    move-object v12, v6

    .line 2058
    const/4 v6, 0x0

    .line 2059
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2060
    .line 2061
    .line 2062
    move-result v5

    .line 2063
    if-eqz v5, :cond_11

    .line 2064
    .line 2065
    sget-object v0, Lg74;->c:Lf74;

    .line 2066
    .line 2067
    invoke-virtual {v0, v10, v11, v1}, Lf74;->w1(JLjava/lang/Object;)F

    .line 2068
    .line 2069
    .line 2070
    move-result v0

    .line 2071
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2072
    .line 2073
    .line 2074
    move-result v0

    .line 2075
    invoke-virtual {v7, v13, v0}, Lg54;->L(II)V

    .line 2076
    .line 2077
    .line 2078
    goto :goto_16

    .line 2079
    :pswitch_68
    move-object v12, v6

    .line 2080
    const/4 v6, 0x0

    .line 2081
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2082
    .line 2083
    .line 2084
    move-result v5

    .line 2085
    if-eqz v5, :cond_11

    .line 2086
    .line 2087
    sget-object v0, Lg74;->c:Lf74;

    .line 2088
    .line 2089
    invoke-virtual {v0, v10, v11, v1}, Lf74;->y1(JLjava/lang/Object;)D

    .line 2090
    .line 2091
    .line 2092
    move-result-wide v9

    .line 2093
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 2094
    .line 2095
    .line 2096
    move-result-wide v9

    .line 2097
    invoke-virtual {v7, v13, v9, v10}, Lg54;->O(IJ)V

    .line 2098
    .line 2099
    .line 2100
    :cond_11
    :goto_16
    add-int/lit8 v2, v2, 0x3

    .line 2101
    .line 2102
    move-object/from16 v0, p0

    .line 2103
    .line 2104
    move-object v6, v12

    .line 2105
    const v10, 0xfffff

    .line 2106
    .line 2107
    .line 2108
    goto/16 :goto_0

    .line 2109
    .line 2110
    :cond_12
    move-object v12, v6

    .line 2111
    move-object v0, v1

    .line 2112
    check-cast v0, Lp54;

    .line 2113
    .line 2114
    iget-object v0, v0, Lp54;->zzt:Lb74;

    .line 2115
    .line 2116
    invoke-virtual {v0, v12}, Lb74;->b(Lit3;)V

    .line 2117
    .line 2118
    .line 2119
    return-void

    .line 2120
    nop

    .line 2121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch

    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
    .end packed-switch
.end method

.method public final f(Ljava/lang/Object;)Z
    .locals 14

    .line 1
    const/4 v6, 0x0

    .line 2
    const v7, 0xfffff

    .line 3
    .line 4
    .line 5
    move v3, v6

    .line 6
    move v8, v3

    .line 7
    move v2, v7

    .line 8
    :goto_0
    iget v4, p0, Lk64;->h:I

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    if-ge v8, v4, :cond_c

    .line 12
    .line 13
    iget-object v4, p0, Lk64;->g:[I

    .line 14
    .line 15
    aget v4, v4, v8

    .line 16
    .line 17
    iget-object v9, p0, Lk64;->a:[I

    .line 18
    .line 19
    aget v10, v9, v4

    .line 20
    .line 21
    invoke-virtual {p0, v4}, Lk64;->k(I)I

    .line 22
    .line 23
    .line 24
    move-result v11

    .line 25
    add-int/lit8 v12, v4, 0x2

    .line 26
    .line 27
    aget v9, v9, v12

    .line 28
    .line 29
    and-int v12, v9, v7

    .line 30
    .line 31
    ushr-int/lit8 v9, v9, 0x14

    .line 32
    .line 33
    shl-int/2addr v5, v9

    .line 34
    if-eq v12, v2, :cond_1

    .line 35
    .line 36
    if-eq v12, v7, :cond_0

    .line 37
    .line 38
    int-to-long v2, v12

    .line 39
    sget-object v9, Lk64;->l:Lsun/misc/Unsafe;

    .line 40
    .line 41
    invoke-virtual {v9, p1, v2, v3}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    :cond_0
    move v2, v4

    .line 46
    move v4, v3

    .line 47
    move v3, v12

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v13, v3

    .line 50
    move v3, v2

    .line 51
    move v2, v4

    .line 52
    move v4, v13

    .line 53
    :goto_1
    const/high16 v9, 0x10000000

    .line 54
    .line 55
    and-int/2addr v9, v11

    .line 56
    if-eqz v9, :cond_2

    .line 57
    .line 58
    move-object v0, p0

    .line 59
    move-object v1, p1

    .line 60
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-eqz v9, :cond_a

    .line 65
    .line 66
    :cond_2
    invoke-static {v11}, Lk64;->l(I)I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    const/16 v12, 0x9

    .line 71
    .line 72
    if-eq v9, v12, :cond_9

    .line 73
    .line 74
    const/16 v12, 0x11

    .line 75
    .line 76
    if-eq v9, v12, :cond_9

    .line 77
    .line 78
    const/16 v5, 0x1b

    .line 79
    .line 80
    if-eq v9, v5, :cond_7

    .line 81
    .line 82
    const/16 v5, 0x3c

    .line 83
    .line 84
    if-eq v9, v5, :cond_6

    .line 85
    .line 86
    const/16 v5, 0x44

    .line 87
    .line 88
    if-eq v9, v5, :cond_6

    .line 89
    .line 90
    const/16 v5, 0x31

    .line 91
    .line 92
    if-eq v9, v5, :cond_7

    .line 93
    .line 94
    const/16 v5, 0x32

    .line 95
    .line 96
    if-eq v9, v5, :cond_3

    .line 97
    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :cond_3
    and-int v5, v11, v7

    .line 101
    .line 102
    int-to-long v9, v5

    .line 103
    invoke-static {v9, v10, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Lg64;

    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-nez v9, :cond_b

    .line 114
    .line 115
    invoke-virtual {p0, v2}, Lk64;->E(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, Lf64;

    .line 120
    .line 121
    iget-object v2, v2, Lf64;->a:Ljr3;

    .line 122
    .line 123
    iget-object v2, v2, Ljr3;->h:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v2, Lj74;

    .line 126
    .line 127
    iget-object v2, v2, Lj74;->f:Lk74;

    .line 128
    .line 129
    sget-object v9, Lk74;->n:Lk74;

    .line 130
    .line 131
    if-ne v2, v9, :cond_b

    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    const/4 v5, 0x0

    .line 142
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-eqz v9, :cond_b

    .line 147
    .line 148
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    if-nez v5, :cond_5

    .line 153
    .line 154
    sget-object v5, Lp64;->c:Lp64;

    .line 155
    .line 156
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    invoke-virtual {v5, v10}, Lp64;->a(Ljava/lang/Class;)Lv64;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    :cond_5
    invoke-interface {v5, v9}, Lv64;->f(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-nez v9, :cond_4

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_6
    invoke-virtual {p0, v10, p1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_b

    .line 176
    .line 177
    invoke-virtual {p0, v2}, Lk64;->D(I)Lv64;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    and-int v5, v11, v7

    .line 182
    .line 183
    int-to-long v9, v5

    .line 184
    invoke-static {v9, v10, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    invoke-interface {v2, v5}, Lv64;->f(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-nez v2, :cond_b

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_7
    and-int v5, v11, v7

    .line 196
    .line 197
    int-to-long v9, v5

    .line 198
    invoke-static {v9, v10, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    check-cast v5, Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    if-nez v9, :cond_b

    .line 209
    .line 210
    invoke-virtual {p0, v2}, Lk64;->D(I)Lv64;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    move v9, v6

    .line 215
    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    if-ge v9, v10, :cond_b

    .line 220
    .line 221
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    invoke-interface {v2, v10}, Lv64;->f(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    if-nez v10, :cond_8

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_9
    move-object v0, p0

    .line 236
    move-object v1, p1

    .line 237
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-eqz v5, :cond_b

    .line 242
    .line 243
    invoke-virtual {p0, v2}, Lk64;->D(I)Lv64;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    and-int v5, v11, v7

    .line 248
    .line 249
    int-to-long v9, v5

    .line 250
    invoke-static {v9, v10, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    invoke-interface {v2, v5}, Lv64;->f(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-nez v2, :cond_b

    .line 259
    .line 260
    :cond_a
    :goto_3
    return v6

    .line 261
    :cond_b
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 262
    .line 263
    move v2, v3

    .line 264
    move v3, v4

    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :cond_c
    return v5
.end method

.method public final g(Lp54;)I
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v6, Lk64;->l:Lsun/misc/Unsafe;

    .line 6
    .line 7
    const v8, 0xfffff

    .line 8
    .line 9
    .line 10
    move v3, v8

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v9, 0x0

    .line 14
    :goto_0
    iget-object v5, v0, Lk64;->a:[I

    .line 15
    .line 16
    array-length v10, v5

    .line 17
    if-ge v2, v10, :cond_23

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lk64;->k(I)I

    .line 20
    .line 21
    .line 22
    move-result v10

    .line 23
    invoke-static {v10}, Lk64;->l(I)I

    .line 24
    .line 25
    .line 26
    move-result v11

    .line 27
    aget v12, v5, v2

    .line 28
    .line 29
    add-int/lit8 v13, v2, 0x2

    .line 30
    .line 31
    aget v5, v5, v13

    .line 32
    .line 33
    and-int v13, v5, v8

    .line 34
    .line 35
    const/16 v14, 0x11

    .line 36
    .line 37
    const/4 v15, 0x1

    .line 38
    if-gt v11, v14, :cond_2

    .line 39
    .line 40
    if-eq v13, v3, :cond_1

    .line 41
    .line 42
    if-ne v13, v8, :cond_0

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    int-to-long v3, v13

    .line 47
    invoke-virtual {v6, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    move v4, v3

    .line 52
    :goto_1
    move v3, v13

    .line 53
    :cond_1
    ushr-int/lit8 v5, v5, 0x14

    .line 54
    .line 55
    shl-int v5, v15, v5

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/4 v5, 0x0

    .line 59
    :goto_2
    and-int/2addr v10, v8

    .line 60
    sget-object v13, Ll54;->g:Ll54;

    .line 61
    .line 62
    iget v13, v13, Ll54;->f:I

    .line 63
    .line 64
    if-lt v11, v13, :cond_3

    .line 65
    .line 66
    sget-object v13, Ll54;->h:Ll54;

    .line 67
    .line 68
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    :cond_3
    int-to-long v13, v10

    .line 72
    const/16 v10, 0x3f

    .line 73
    .line 74
    const/4 v7, 0x4

    .line 75
    const/16 v8, 0x8

    .line 76
    .line 77
    packed-switch v11, :pswitch_data_0

    .line 78
    .line 79
    .line 80
    goto/16 :goto_2b

    .line 81
    .line 82
    :pswitch_0
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_22

    .line 87
    .line 88
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, Ls44;

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Lk64;->D(I)Lv64;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    sget-object v8, Lw64;->a:Lpz;

    .line 99
    .line 100
    shl-int/lit8 v8, v12, 0x3

    .line 101
    .line 102
    invoke-static {v8}, Lg54;->D(I)I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    add-int/2addr v8, v8

    .line 107
    invoke-virtual {v5, v7}, Ls44;->d(Lv64;)I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    :goto_3
    add-int/2addr v5, v8

    .line 112
    :goto_4
    add-int/2addr v9, v5

    .line 113
    goto/16 :goto_2b

    .line 114
    .line 115
    :pswitch_1
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_22

    .line 120
    .line 121
    shl-int/lit8 v5, v12, 0x3

    .line 122
    .line 123
    invoke-static {v13, v14, v1}, Lk64;->p(JLjava/lang/Object;)J

    .line 124
    .line 125
    .line 126
    move-result-wide v7

    .line 127
    add-long v11, v7, v7

    .line 128
    .line 129
    shr-long/2addr v7, v10

    .line 130
    invoke-static {v5}, Lg54;->D(I)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    xor-long/2addr v7, v11

    .line 135
    invoke-static {v7, v8}, Lg54;->E(J)I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    :goto_5
    add-int/2addr v7, v5

    .line 140
    add-int/2addr v9, v7

    .line 141
    goto/16 :goto_2b

    .line 142
    .line 143
    :pswitch_2
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_22

    .line 148
    .line 149
    shl-int/lit8 v5, v12, 0x3

    .line 150
    .line 151
    invoke-static {v13, v14, v1}, Lk64;->o(JLjava/lang/Object;)I

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    add-int v8, v7, v7

    .line 156
    .line 157
    shr-int/lit8 v7, v7, 0x1f

    .line 158
    .line 159
    invoke-static {v5}, Lg54;->D(I)I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    xor-int/2addr v7, v8

    .line 164
    :goto_6
    invoke-static {v7, v5, v9}, Lga1;->g(III)I

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    goto/16 :goto_2b

    .line 169
    .line 170
    :pswitch_3
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-eqz v5, :cond_22

    .line 175
    .line 176
    :goto_7
    shl-int/lit8 v5, v12, 0x3

    .line 177
    .line 178
    invoke-static {v5, v8, v9}, Lga1;->g(III)I

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    goto/16 :goto_2b

    .line 183
    .line 184
    :pswitch_4
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    if-eqz v5, :cond_22

    .line 189
    .line 190
    :goto_8
    shl-int/lit8 v5, v12, 0x3

    .line 191
    .line 192
    invoke-static {v5, v7, v9}, Lga1;->g(III)I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    goto/16 :goto_2b

    .line 197
    .line 198
    :pswitch_5
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-eqz v5, :cond_22

    .line 203
    .line 204
    shl-int/lit8 v5, v12, 0x3

    .line 205
    .line 206
    invoke-static {v13, v14, v1}, Lk64;->o(JLjava/lang/Object;)I

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    int-to-long v7, v7

    .line 211
    invoke-static {v5}, Lg54;->D(I)I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    invoke-static {v7, v8}, Lg54;->E(J)I

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    goto :goto_5

    .line 220
    :pswitch_6
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_22

    .line 225
    .line 226
    shl-int/lit8 v5, v12, 0x3

    .line 227
    .line 228
    invoke-static {v13, v14, v1}, Lk64;->o(JLjava/lang/Object;)I

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    invoke-static {v5}, Lg54;->D(I)I

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    goto :goto_6

    .line 237
    :pswitch_7
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-eqz v5, :cond_22

    .line 242
    .line 243
    shl-int/lit8 v5, v12, 0x3

    .line 244
    .line 245
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    check-cast v7, La54;

    .line 250
    .line 251
    invoke-static {v5}, Lg54;->D(I)I

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    invoke-virtual {v7}, La54;->d()I

    .line 256
    .line 257
    .line 258
    move-result v7

    .line 259
    :goto_9
    invoke-static {v7, v7, v5, v9}, Lga1;->r(IIII)I

    .line 260
    .line 261
    .line 262
    move-result v9

    .line 263
    goto/16 :goto_2b

    .line 264
    .line 265
    :pswitch_8
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    if-eqz v5, :cond_22

    .line 270
    .line 271
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    invoke-virtual {v0, v2}, Lk64;->D(I)Lv64;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    sget-object v8, Lw64;->a:Lpz;

    .line 280
    .line 281
    shl-int/lit8 v8, v12, 0x3

    .line 282
    .line 283
    check-cast v5, Ls44;

    .line 284
    .line 285
    invoke-static {v8}, Lg54;->D(I)I

    .line 286
    .line 287
    .line 288
    move-result v8

    .line 289
    invoke-virtual {v5, v7}, Ls44;->d(Lv64;)I

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    :goto_a
    invoke-static {v5, v5, v8, v9}, Lga1;->r(IIII)I

    .line 294
    .line 295
    .line 296
    move-result v9

    .line 297
    goto/16 :goto_2b

    .line 298
    .line 299
    :pswitch_9
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    if-eqz v5, :cond_22

    .line 304
    .line 305
    shl-int/lit8 v5, v12, 0x3

    .line 306
    .line 307
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    instance-of v8, v7, La54;

    .line 312
    .line 313
    if-eqz v8, :cond_4

    .line 314
    .line 315
    check-cast v7, La54;

    .line 316
    .line 317
    invoke-static {v5}, Lg54;->D(I)I

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    invoke-virtual {v7}, La54;->d()I

    .line 322
    .line 323
    .line 324
    move-result v7

    .line 325
    goto :goto_9

    .line 326
    :cond_4
    check-cast v7, Ljava/lang/String;

    .line 327
    .line 328
    invoke-static {v5}, Lg54;->D(I)I

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    invoke-static {v7}, Lg54;->F(Ljava/lang/String;)I

    .line 333
    .line 334
    .line 335
    move-result v7

    .line 336
    goto/16 :goto_5

    .line 337
    .line 338
    :pswitch_a
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    if-eqz v5, :cond_22

    .line 343
    .line 344
    shl-int/lit8 v5, v12, 0x3

    .line 345
    .line 346
    invoke-static {v5, v15, v9}, Lga1;->g(III)I

    .line 347
    .line 348
    .line 349
    move-result v9

    .line 350
    goto/16 :goto_2b

    .line 351
    .line 352
    :pswitch_b
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    if-eqz v5, :cond_22

    .line 357
    .line 358
    goto/16 :goto_8

    .line 359
    .line 360
    :pswitch_c
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    if-eqz v5, :cond_22

    .line 365
    .line 366
    goto/16 :goto_7

    .line 367
    .line 368
    :pswitch_d
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    if-eqz v5, :cond_22

    .line 373
    .line 374
    shl-int/lit8 v5, v12, 0x3

    .line 375
    .line 376
    invoke-static {v13, v14, v1}, Lk64;->o(JLjava/lang/Object;)I

    .line 377
    .line 378
    .line 379
    move-result v7

    .line 380
    int-to-long v7, v7

    .line 381
    invoke-static {v5}, Lg54;->D(I)I

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    invoke-static {v7, v8}, Lg54;->E(J)I

    .line 386
    .line 387
    .line 388
    move-result v7

    .line 389
    goto/16 :goto_5

    .line 390
    .line 391
    :pswitch_e
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 392
    .line 393
    .line 394
    move-result v5

    .line 395
    if-eqz v5, :cond_22

    .line 396
    .line 397
    shl-int/lit8 v5, v12, 0x3

    .line 398
    .line 399
    invoke-static {v13, v14, v1}, Lk64;->p(JLjava/lang/Object;)J

    .line 400
    .line 401
    .line 402
    move-result-wide v7

    .line 403
    invoke-static {v5}, Lg54;->D(I)I

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    invoke-static {v7, v8}, Lg54;->E(J)I

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    goto/16 :goto_5

    .line 412
    .line 413
    :pswitch_f
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    if-eqz v5, :cond_22

    .line 418
    .line 419
    shl-int/lit8 v5, v12, 0x3

    .line 420
    .line 421
    invoke-static {v13, v14, v1}, Lk64;->p(JLjava/lang/Object;)J

    .line 422
    .line 423
    .line 424
    move-result-wide v7

    .line 425
    invoke-static {v5}, Lg54;->D(I)I

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    invoke-static {v7, v8}, Lg54;->E(J)I

    .line 430
    .line 431
    .line 432
    move-result v7

    .line 433
    goto/16 :goto_5

    .line 434
    .line 435
    :pswitch_10
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    if-eqz v5, :cond_22

    .line 440
    .line 441
    goto/16 :goto_8

    .line 442
    .line 443
    :pswitch_11
    invoke-virtual {v0, v12, v1, v2}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 444
    .line 445
    .line 446
    move-result v5

    .line 447
    if-eqz v5, :cond_22

    .line 448
    .line 449
    goto/16 :goto_7

    .line 450
    .line 451
    :pswitch_12
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v5

    .line 455
    invoke-virtual {v0, v2}, Lk64;->E(I)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v11

    .line 459
    check-cast v5, Lg64;

    .line 460
    .line 461
    check-cast v11, Lf64;

    .line 462
    .line 463
    invoke-virtual {v5}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 464
    .line 465
    .line 466
    move-result v13

    .line 467
    if-eqz v13, :cond_6

    .line 468
    .line 469
    const/4 v13, 0x0

    .line 470
    :cond_5
    move/from16 v21, v3

    .line 471
    .line 472
    move/from16 v22, v4

    .line 473
    .line 474
    move-object/from16 v24, v6

    .line 475
    .line 476
    goto/16 :goto_16

    .line 477
    .line 478
    :cond_6
    invoke-virtual {v5}, Lg64;->entrySet()Ljava/util/Set;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 483
    .line 484
    .line 485
    move-result-object v5

    .line 486
    const/4 v13, 0x0

    .line 487
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 488
    .line 489
    .line 490
    move-result v14

    .line 491
    if-eqz v14, :cond_5

    .line 492
    .line 493
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v14

    .line 497
    check-cast v14, Ljava/util/Map$Entry;

    .line 498
    .line 499
    move/from16 v16, v10

    .line 500
    .line 501
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v10

    .line 505
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v14

    .line 509
    move/from16 v17, v15

    .line 510
    .line 511
    iget-object v15, v11, Lf64;->a:Ljr3;

    .line 512
    .line 513
    shl-int/lit8 v18, v12, 0x3

    .line 514
    .line 515
    move/from16 v19, v7

    .line 516
    .line 517
    invoke-static/range {v18 .. v18}, Lg54;->D(I)I

    .line 518
    .line 519
    .line 520
    move-result v7

    .line 521
    move/from16 v18, v8

    .line 522
    .line 523
    iget-object v8, v15, Ljr3;->g:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v8, Lj74;

    .line 526
    .line 527
    iget-object v15, v15, Ljr3;->h:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v15, Lj74;

    .line 530
    .line 531
    sget v20, Lk54;->c:I

    .line 532
    .line 533
    invoke-static/range {v18 .. v18}, Lg54;->D(I)I

    .line 534
    .line 535
    .line 536
    move-result v20

    .line 537
    move/from16 v21, v3

    .line 538
    .line 539
    sget-object v3, Lj74;->i:Lj74;

    .line 540
    .line 541
    if-ne v8, v3, :cond_7

    .line 542
    .line 543
    add-int v20, v20, v20

    .line 544
    .line 545
    :cond_7
    sget-object v22, Lk74;->f:Lk74;

    .line 546
    .line 547
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 548
    .line 549
    .line 550
    move-result v8

    .line 551
    move/from16 v22, v4

    .line 552
    .line 553
    const-string v4, "There is no way to get here, but the compiler thinks otherwise."

    .line 554
    .line 555
    move-object/from16 v23, v5

    .line 556
    .line 557
    packed-switch v8, :pswitch_data_1

    .line 558
    .line 559
    .line 560
    new-instance v1, Ljava/lang/RuntimeException;

    .line 561
    .line 562
    invoke-direct {v1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    throw v1

    .line 566
    :pswitch_13
    check-cast v10, Ljava/lang/Long;

    .line 567
    .line 568
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 569
    .line 570
    .line 571
    move-result-wide v24

    .line 572
    add-long v26, v24, v24

    .line 573
    .line 574
    shr-long v24, v24, v16

    .line 575
    .line 576
    xor-long v24, v26, v24

    .line 577
    .line 578
    invoke-static/range {v24 .. v25}, Lg54;->E(J)I

    .line 579
    .line 580
    .line 581
    move-result v8

    .line 582
    :goto_c
    move-object/from16 v24, v6

    .line 583
    .line 584
    move v5, v8

    .line 585
    goto/16 :goto_11

    .line 586
    .line 587
    :pswitch_14
    check-cast v10, Ljava/lang/Integer;

    .line 588
    .line 589
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 590
    .line 591
    .line 592
    move-result v8

    .line 593
    add-int v10, v8, v8

    .line 594
    .line 595
    shr-int/lit8 v8, v8, 0x1f

    .line 596
    .line 597
    xor-int/2addr v8, v10

    .line 598
    invoke-static {v8}, Lg54;->D(I)I

    .line 599
    .line 600
    .line 601
    move-result v8

    .line 602
    goto :goto_c

    .line 603
    :pswitch_15
    check-cast v10, Ljava/lang/Long;

    .line 604
    .line 605
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    move-object/from16 v24, v6

    .line 609
    .line 610
    :goto_d
    move/from16 v5, v18

    .line 611
    .line 612
    goto/16 :goto_11

    .line 613
    .line 614
    :pswitch_16
    check-cast v10, Ljava/lang/Integer;

    .line 615
    .line 616
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 617
    .line 618
    .line 619
    move-object/from16 v24, v6

    .line 620
    .line 621
    :goto_e
    move/from16 v5, v19

    .line 622
    .line 623
    goto/16 :goto_11

    .line 624
    .line 625
    :pswitch_17
    instance-of v8, v10, Lr54;

    .line 626
    .line 627
    if-eqz v8, :cond_8

    .line 628
    .line 629
    check-cast v10, Lr54;

    .line 630
    .line 631
    invoke-interface {v10}, Lr54;->a()I

    .line 632
    .line 633
    .line 634
    move-result v8

    .line 635
    move-object/from16 v24, v6

    .line 636
    .line 637
    int-to-long v5, v8

    .line 638
    invoke-static {v5, v6}, Lg54;->E(J)I

    .line 639
    .line 640
    .line 641
    move-result v5

    .line 642
    goto/16 :goto_11

    .line 643
    .line 644
    :cond_8
    move-object/from16 v24, v6

    .line 645
    .line 646
    check-cast v10, Ljava/lang/Integer;

    .line 647
    .line 648
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 649
    .line 650
    .line 651
    move-result v5

    .line 652
    int-to-long v5, v5

    .line 653
    invoke-static {v5, v6}, Lg54;->E(J)I

    .line 654
    .line 655
    .line 656
    move-result v5

    .line 657
    goto/16 :goto_11

    .line 658
    .line 659
    :pswitch_18
    move-object/from16 v24, v6

    .line 660
    .line 661
    check-cast v10, Ljava/lang/Integer;

    .line 662
    .line 663
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 664
    .line 665
    .line 666
    move-result v5

    .line 667
    invoke-static {v5}, Lg54;->D(I)I

    .line 668
    .line 669
    .line 670
    move-result v5

    .line 671
    goto/16 :goto_11

    .line 672
    .line 673
    :pswitch_19
    move-object/from16 v24, v6

    .line 674
    .line 675
    instance-of v5, v10, La54;

    .line 676
    .line 677
    if-eqz v5, :cond_9

    .line 678
    .line 679
    check-cast v10, La54;

    .line 680
    .line 681
    invoke-virtual {v10}, La54;->d()I

    .line 682
    .line 683
    .line 684
    move-result v5

    .line 685
    invoke-static {v5}, Lg54;->D(I)I

    .line 686
    .line 687
    .line 688
    move-result v6

    .line 689
    :goto_f
    add-int/2addr v5, v6

    .line 690
    goto/16 :goto_11

    .line 691
    .line 692
    :cond_9
    check-cast v10, [B

    .line 693
    .line 694
    array-length v5, v10

    .line 695
    invoke-static {v5}, Lg54;->D(I)I

    .line 696
    .line 697
    .line 698
    move-result v6

    .line 699
    goto :goto_f

    .line 700
    :pswitch_1a
    move-object/from16 v24, v6

    .line 701
    .line 702
    check-cast v10, Ls44;

    .line 703
    .line 704
    check-cast v10, Lp54;

    .line 705
    .line 706
    const/4 v5, 0x0

    .line 707
    invoke-virtual {v10, v5}, Lp54;->d(Lv64;)I

    .line 708
    .line 709
    .line 710
    move-result v6

    .line 711
    invoke-static {v6}, Lg54;->D(I)I

    .line 712
    .line 713
    .line 714
    move-result v8

    .line 715
    add-int/2addr v6, v8

    .line 716
    :goto_10
    move v5, v6

    .line 717
    goto/16 :goto_11

    .line 718
    .line 719
    :pswitch_1b
    move-object/from16 v24, v6

    .line 720
    .line 721
    const/4 v5, 0x0

    .line 722
    check-cast v10, Ls44;

    .line 723
    .line 724
    check-cast v10, Lp54;

    .line 725
    .line 726
    invoke-virtual {v10, v5}, Lp54;->d(Lv64;)I

    .line 727
    .line 728
    .line 729
    move-result v6

    .line 730
    goto :goto_10

    .line 731
    :pswitch_1c
    move-object/from16 v24, v6

    .line 732
    .line 733
    instance-of v5, v10, La54;

    .line 734
    .line 735
    if-eqz v5, :cond_a

    .line 736
    .line 737
    check-cast v10, La54;

    .line 738
    .line 739
    invoke-virtual {v10}, La54;->d()I

    .line 740
    .line 741
    .line 742
    move-result v5

    .line 743
    invoke-static {v5}, Lg54;->D(I)I

    .line 744
    .line 745
    .line 746
    move-result v6

    .line 747
    goto :goto_f

    .line 748
    :cond_a
    check-cast v10, Ljava/lang/String;

    .line 749
    .line 750
    invoke-static {v10}, Lg54;->F(Ljava/lang/String;)I

    .line 751
    .line 752
    .line 753
    move-result v5

    .line 754
    goto :goto_11

    .line 755
    :pswitch_1d
    move-object/from16 v24, v6

    .line 756
    .line 757
    check-cast v10, Ljava/lang/Boolean;

    .line 758
    .line 759
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    move/from16 v5, v17

    .line 763
    .line 764
    goto :goto_11

    .line 765
    :pswitch_1e
    move-object/from16 v24, v6

    .line 766
    .line 767
    check-cast v10, Ljava/lang/Integer;

    .line 768
    .line 769
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    goto/16 :goto_e

    .line 773
    .line 774
    :pswitch_1f
    move-object/from16 v24, v6

    .line 775
    .line 776
    check-cast v10, Ljava/lang/Long;

    .line 777
    .line 778
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    goto/16 :goto_d

    .line 782
    .line 783
    :pswitch_20
    move-object/from16 v24, v6

    .line 784
    .line 785
    check-cast v10, Ljava/lang/Integer;

    .line 786
    .line 787
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 788
    .line 789
    .line 790
    move-result v5

    .line 791
    int-to-long v5, v5

    .line 792
    invoke-static {v5, v6}, Lg54;->E(J)I

    .line 793
    .line 794
    .line 795
    move-result v5

    .line 796
    goto :goto_11

    .line 797
    :pswitch_21
    move-object/from16 v24, v6

    .line 798
    .line 799
    check-cast v10, Ljava/lang/Long;

    .line 800
    .line 801
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 802
    .line 803
    .line 804
    move-result-wide v5

    .line 805
    invoke-static {v5, v6}, Lg54;->E(J)I

    .line 806
    .line 807
    .line 808
    move-result v5

    .line 809
    goto :goto_11

    .line 810
    :pswitch_22
    move-object/from16 v24, v6

    .line 811
    .line 812
    check-cast v10, Ljava/lang/Long;

    .line 813
    .line 814
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 815
    .line 816
    .line 817
    move-result-wide v5

    .line 818
    invoke-static {v5, v6}, Lg54;->E(J)I

    .line 819
    .line 820
    .line 821
    move-result v5

    .line 822
    goto :goto_11

    .line 823
    :pswitch_23
    move-object/from16 v24, v6

    .line 824
    .line 825
    check-cast v10, Ljava/lang/Float;

    .line 826
    .line 827
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 828
    .line 829
    .line 830
    goto/16 :goto_e

    .line 831
    .line 832
    :pswitch_24
    move-object/from16 v24, v6

    .line 833
    .line 834
    check-cast v10, Ljava/lang/Double;

    .line 835
    .line 836
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 837
    .line 838
    .line 839
    goto/16 :goto_d

    .line 840
    .line 841
    :goto_11
    add-int v5, v5, v20

    .line 842
    .line 843
    const/16 v6, 0x10

    .line 844
    .line 845
    invoke-static {v6}, Lg54;->D(I)I

    .line 846
    .line 847
    .line 848
    move-result v6

    .line 849
    if-ne v15, v3, :cond_b

    .line 850
    .line 851
    add-int/2addr v6, v6

    .line 852
    :cond_b
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 853
    .line 854
    .line 855
    move-result v3

    .line 856
    packed-switch v3, :pswitch_data_2

    .line 857
    .line 858
    .line 859
    new-instance v1, Ljava/lang/RuntimeException;

    .line 860
    .line 861
    invoke-direct {v1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    throw v1

    .line 865
    :pswitch_25
    check-cast v14, Ljava/lang/Long;

    .line 866
    .line 867
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 868
    .line 869
    .line 870
    move-result-wide v3

    .line 871
    add-long v14, v3, v3

    .line 872
    .line 873
    shr-long v3, v3, v16

    .line 874
    .line 875
    xor-long/2addr v3, v14

    .line 876
    invoke-static {v3, v4}, Lg54;->E(J)I

    .line 877
    .line 878
    .line 879
    move-result v3

    .line 880
    goto/16 :goto_15

    .line 881
    .line 882
    :pswitch_26
    check-cast v14, Ljava/lang/Integer;

    .line 883
    .line 884
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 885
    .line 886
    .line 887
    move-result v3

    .line 888
    add-int v4, v3, v3

    .line 889
    .line 890
    shr-int/lit8 v3, v3, 0x1f

    .line 891
    .line 892
    xor-int/2addr v3, v4

    .line 893
    invoke-static {v3}, Lg54;->D(I)I

    .line 894
    .line 895
    .line 896
    move-result v3

    .line 897
    goto/16 :goto_15

    .line 898
    .line 899
    :pswitch_27
    check-cast v14, Ljava/lang/Long;

    .line 900
    .line 901
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 902
    .line 903
    .line 904
    :goto_12
    move/from16 v3, v18

    .line 905
    .line 906
    goto/16 :goto_15

    .line 907
    .line 908
    :pswitch_28
    check-cast v14, Ljava/lang/Integer;

    .line 909
    .line 910
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    :goto_13
    move/from16 v3, v19

    .line 914
    .line 915
    goto/16 :goto_15

    .line 916
    .line 917
    :pswitch_29
    instance-of v3, v14, Lr54;

    .line 918
    .line 919
    if-eqz v3, :cond_c

    .line 920
    .line 921
    check-cast v14, Lr54;

    .line 922
    .line 923
    invoke-interface {v14}, Lr54;->a()I

    .line 924
    .line 925
    .line 926
    move-result v3

    .line 927
    int-to-long v3, v3

    .line 928
    invoke-static {v3, v4}, Lg54;->E(J)I

    .line 929
    .line 930
    .line 931
    move-result v3

    .line 932
    goto/16 :goto_15

    .line 933
    .line 934
    :cond_c
    check-cast v14, Ljava/lang/Integer;

    .line 935
    .line 936
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 937
    .line 938
    .line 939
    move-result v3

    .line 940
    int-to-long v3, v3

    .line 941
    invoke-static {v3, v4}, Lg54;->E(J)I

    .line 942
    .line 943
    .line 944
    move-result v3

    .line 945
    goto/16 :goto_15

    .line 946
    .line 947
    :pswitch_2a
    check-cast v14, Ljava/lang/Integer;

    .line 948
    .line 949
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 950
    .line 951
    .line 952
    move-result v3

    .line 953
    invoke-static {v3}, Lg54;->D(I)I

    .line 954
    .line 955
    .line 956
    move-result v3

    .line 957
    goto/16 :goto_15

    .line 958
    .line 959
    :pswitch_2b
    instance-of v3, v14, La54;

    .line 960
    .line 961
    if-eqz v3, :cond_d

    .line 962
    .line 963
    check-cast v14, La54;

    .line 964
    .line 965
    invoke-virtual {v14}, La54;->d()I

    .line 966
    .line 967
    .line 968
    move-result v3

    .line 969
    invoke-static {v3}, Lg54;->D(I)I

    .line 970
    .line 971
    .line 972
    move-result v4

    .line 973
    :goto_14
    add-int/2addr v3, v4

    .line 974
    goto/16 :goto_15

    .line 975
    .line 976
    :cond_d
    check-cast v14, [B

    .line 977
    .line 978
    array-length v3, v14

    .line 979
    invoke-static {v3}, Lg54;->D(I)I

    .line 980
    .line 981
    .line 982
    move-result v4

    .line 983
    goto :goto_14

    .line 984
    :pswitch_2c
    check-cast v14, Ls44;

    .line 985
    .line 986
    check-cast v14, Lp54;

    .line 987
    .line 988
    const/4 v3, 0x0

    .line 989
    invoke-virtual {v14, v3}, Lp54;->d(Lv64;)I

    .line 990
    .line 991
    .line 992
    move-result v3

    .line 993
    invoke-static {v3}, Lg54;->D(I)I

    .line 994
    .line 995
    .line 996
    move-result v4

    .line 997
    goto :goto_14

    .line 998
    :pswitch_2d
    const/4 v3, 0x0

    .line 999
    check-cast v14, Ls44;

    .line 1000
    .line 1001
    check-cast v14, Lp54;

    .line 1002
    .line 1003
    invoke-virtual {v14, v3}, Lp54;->d(Lv64;)I

    .line 1004
    .line 1005
    .line 1006
    move-result v3

    .line 1007
    goto :goto_15

    .line 1008
    :pswitch_2e
    instance-of v3, v14, La54;

    .line 1009
    .line 1010
    if-eqz v3, :cond_e

    .line 1011
    .line 1012
    check-cast v14, La54;

    .line 1013
    .line 1014
    invoke-virtual {v14}, La54;->d()I

    .line 1015
    .line 1016
    .line 1017
    move-result v3

    .line 1018
    invoke-static {v3}, Lg54;->D(I)I

    .line 1019
    .line 1020
    .line 1021
    move-result v4

    .line 1022
    goto :goto_14

    .line 1023
    :cond_e
    check-cast v14, Ljava/lang/String;

    .line 1024
    .line 1025
    invoke-static {v14}, Lg54;->F(Ljava/lang/String;)I

    .line 1026
    .line 1027
    .line 1028
    move-result v3

    .line 1029
    goto :goto_15

    .line 1030
    :pswitch_2f
    check-cast v14, Ljava/lang/Boolean;

    .line 1031
    .line 1032
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1033
    .line 1034
    .line 1035
    move/from16 v3, v17

    .line 1036
    .line 1037
    goto :goto_15

    .line 1038
    :pswitch_30
    check-cast v14, Ljava/lang/Integer;

    .line 1039
    .line 1040
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1041
    .line 1042
    .line 1043
    goto/16 :goto_13

    .line 1044
    .line 1045
    :pswitch_31
    check-cast v14, Ljava/lang/Long;

    .line 1046
    .line 1047
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1048
    .line 1049
    .line 1050
    goto/16 :goto_12

    .line 1051
    .line 1052
    :pswitch_32
    check-cast v14, Ljava/lang/Integer;

    .line 1053
    .line 1054
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 1055
    .line 1056
    .line 1057
    move-result v3

    .line 1058
    int-to-long v3, v3

    .line 1059
    invoke-static {v3, v4}, Lg54;->E(J)I

    .line 1060
    .line 1061
    .line 1062
    move-result v3

    .line 1063
    goto :goto_15

    .line 1064
    :pswitch_33
    check-cast v14, Ljava/lang/Long;

    .line 1065
    .line 1066
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 1067
    .line 1068
    .line 1069
    move-result-wide v3

    .line 1070
    invoke-static {v3, v4}, Lg54;->E(J)I

    .line 1071
    .line 1072
    .line 1073
    move-result v3

    .line 1074
    goto :goto_15

    .line 1075
    :pswitch_34
    check-cast v14, Ljava/lang/Long;

    .line 1076
    .line 1077
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 1078
    .line 1079
    .line 1080
    move-result-wide v3

    .line 1081
    invoke-static {v3, v4}, Lg54;->E(J)I

    .line 1082
    .line 1083
    .line 1084
    move-result v3

    .line 1085
    goto :goto_15

    .line 1086
    :pswitch_35
    check-cast v14, Ljava/lang/Float;

    .line 1087
    .line 1088
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1089
    .line 1090
    .line 1091
    goto/16 :goto_13

    .line 1092
    .line 1093
    :pswitch_36
    check-cast v14, Ljava/lang/Double;

    .line 1094
    .line 1095
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1096
    .line 1097
    .line 1098
    goto/16 :goto_12

    .line 1099
    .line 1100
    :goto_15
    add-int/2addr v3, v6

    .line 1101
    add-int/2addr v3, v5

    .line 1102
    invoke-static {v3, v3, v7, v13}, Lga1;->r(IIII)I

    .line 1103
    .line 1104
    .line 1105
    move-result v13

    .line 1106
    move/from16 v10, v16

    .line 1107
    .line 1108
    move/from16 v15, v17

    .line 1109
    .line 1110
    move/from16 v8, v18

    .line 1111
    .line 1112
    move/from16 v7, v19

    .line 1113
    .line 1114
    move/from16 v3, v21

    .line 1115
    .line 1116
    move/from16 v4, v22

    .line 1117
    .line 1118
    move-object/from16 v5, v23

    .line 1119
    .line 1120
    move-object/from16 v6, v24

    .line 1121
    .line 1122
    goto/16 :goto_b

    .line 1123
    .line 1124
    :goto_16
    add-int/2addr v9, v13

    .line 1125
    move/from16 v3, v21

    .line 1126
    .line 1127
    move/from16 v4, v22

    .line 1128
    .line 1129
    move-object/from16 v6, v24

    .line 1130
    .line 1131
    goto/16 :goto_2b

    .line 1132
    .line 1133
    :pswitch_37
    move/from16 v21, v3

    .line 1134
    .line 1135
    move/from16 v22, v4

    .line 1136
    .line 1137
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v3

    .line 1141
    check-cast v3, Ljava/util/List;

    .line 1142
    .line 1143
    invoke-virtual {v0, v2}, Lk64;->D(I)Lv64;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v4

    .line 1147
    sget-object v5, Lw64;->a:Lpz;

    .line 1148
    .line 1149
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1150
    .line 1151
    .line 1152
    move-result v5

    .line 1153
    if-nez v5, :cond_f

    .line 1154
    .line 1155
    const/4 v8, 0x0

    .line 1156
    goto :goto_18

    .line 1157
    :cond_f
    const/4 v7, 0x0

    .line 1158
    const/4 v8, 0x0

    .line 1159
    :goto_17
    if-ge v7, v5, :cond_10

    .line 1160
    .line 1161
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v10

    .line 1165
    check-cast v10, Ls44;

    .line 1166
    .line 1167
    shl-int/lit8 v11, v12, 0x3

    .line 1168
    .line 1169
    invoke-static {v11}, Lg54;->D(I)I

    .line 1170
    .line 1171
    .line 1172
    move-result v11

    .line 1173
    add-int/2addr v11, v11

    .line 1174
    invoke-virtual {v10, v4}, Ls44;->d(Lv64;)I

    .line 1175
    .line 1176
    .line 1177
    move-result v10

    .line 1178
    add-int/2addr v10, v11

    .line 1179
    add-int/2addr v8, v10

    .line 1180
    add-int/lit8 v7, v7, 0x1

    .line 1181
    .line 1182
    goto :goto_17

    .line 1183
    :cond_10
    :goto_18
    add-int/2addr v9, v8

    .line 1184
    :cond_11
    :goto_19
    move/from16 v3, v21

    .line 1185
    .line 1186
    move/from16 v4, v22

    .line 1187
    .line 1188
    goto/16 :goto_2b

    .line 1189
    .line 1190
    :pswitch_38
    move/from16 v21, v3

    .line 1191
    .line 1192
    move/from16 v22, v4

    .line 1193
    .line 1194
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v3

    .line 1198
    check-cast v3, Ljava/util/List;

    .line 1199
    .line 1200
    invoke-static {v3}, Lw64;->v(Ljava/util/List;)I

    .line 1201
    .line 1202
    .line 1203
    move-result v3

    .line 1204
    if-lez v3, :cond_11

    .line 1205
    .line 1206
    shl-int/lit8 v4, v12, 0x3

    .line 1207
    .line 1208
    invoke-static {v4}, Lg54;->D(I)I

    .line 1209
    .line 1210
    .line 1211
    move-result v4

    .line 1212
    :goto_1a
    invoke-static {v3, v4, v3, v9}, Lga1;->r(IIII)I

    .line 1213
    .line 1214
    .line 1215
    move-result v9

    .line 1216
    goto :goto_19

    .line 1217
    :pswitch_39
    move/from16 v21, v3

    .line 1218
    .line 1219
    move/from16 v22, v4

    .line 1220
    .line 1221
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v3

    .line 1225
    check-cast v3, Ljava/util/List;

    .line 1226
    .line 1227
    invoke-static {v3}, Lw64;->z(Ljava/util/List;)I

    .line 1228
    .line 1229
    .line 1230
    move-result v3

    .line 1231
    if-lez v3, :cond_11

    .line 1232
    .line 1233
    shl-int/lit8 v4, v12, 0x3

    .line 1234
    .line 1235
    invoke-static {v4}, Lg54;->D(I)I

    .line 1236
    .line 1237
    .line 1238
    move-result v4

    .line 1239
    goto :goto_1a

    .line 1240
    :pswitch_3a
    move/from16 v21, v3

    .line 1241
    .line 1242
    move/from16 v22, v4

    .line 1243
    .line 1244
    move/from16 v18, v8

    .line 1245
    .line 1246
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v3

    .line 1250
    check-cast v3, Ljava/util/List;

    .line 1251
    .line 1252
    sget-object v4, Lw64;->a:Lpz;

    .line 1253
    .line 1254
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1255
    .line 1256
    .line 1257
    move-result v3

    .line 1258
    mul-int/lit8 v3, v3, 0x8

    .line 1259
    .line 1260
    if-lez v3, :cond_11

    .line 1261
    .line 1262
    shl-int/lit8 v4, v12, 0x3

    .line 1263
    .line 1264
    invoke-static {v4}, Lg54;->D(I)I

    .line 1265
    .line 1266
    .line 1267
    move-result v4

    .line 1268
    goto :goto_1a

    .line 1269
    :pswitch_3b
    move/from16 v21, v3

    .line 1270
    .line 1271
    move/from16 v22, v4

    .line 1272
    .line 1273
    move/from16 v19, v7

    .line 1274
    .line 1275
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v3

    .line 1279
    check-cast v3, Ljava/util/List;

    .line 1280
    .line 1281
    sget-object v4, Lw64;->a:Lpz;

    .line 1282
    .line 1283
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1284
    .line 1285
    .line 1286
    move-result v3

    .line 1287
    mul-int/lit8 v3, v3, 0x4

    .line 1288
    .line 1289
    if-lez v3, :cond_11

    .line 1290
    .line 1291
    shl-int/lit8 v4, v12, 0x3

    .line 1292
    .line 1293
    invoke-static {v4}, Lg54;->D(I)I

    .line 1294
    .line 1295
    .line 1296
    move-result v4

    .line 1297
    goto :goto_1a

    .line 1298
    :pswitch_3c
    move/from16 v21, v3

    .line 1299
    .line 1300
    move/from16 v22, v4

    .line 1301
    .line 1302
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v3

    .line 1306
    check-cast v3, Ljava/util/List;

    .line 1307
    .line 1308
    invoke-static {v3}, Lw64;->w(Ljava/util/List;)I

    .line 1309
    .line 1310
    .line 1311
    move-result v3

    .line 1312
    if-lez v3, :cond_11

    .line 1313
    .line 1314
    shl-int/lit8 v4, v12, 0x3

    .line 1315
    .line 1316
    invoke-static {v4}, Lg54;->D(I)I

    .line 1317
    .line 1318
    .line 1319
    move-result v4

    .line 1320
    goto :goto_1a

    .line 1321
    :pswitch_3d
    move/from16 v21, v3

    .line 1322
    .line 1323
    move/from16 v22, v4

    .line 1324
    .line 1325
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v3

    .line 1329
    check-cast v3, Ljava/util/List;

    .line 1330
    .line 1331
    invoke-static {v3}, Lw64;->y(Ljava/util/List;)I

    .line 1332
    .line 1333
    .line 1334
    move-result v3

    .line 1335
    if-lez v3, :cond_11

    .line 1336
    .line 1337
    shl-int/lit8 v4, v12, 0x3

    .line 1338
    .line 1339
    invoke-static {v4}, Lg54;->D(I)I

    .line 1340
    .line 1341
    .line 1342
    move-result v4

    .line 1343
    goto/16 :goto_1a

    .line 1344
    .line 1345
    :pswitch_3e
    move/from16 v21, v3

    .line 1346
    .line 1347
    move/from16 v22, v4

    .line 1348
    .line 1349
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v3

    .line 1353
    check-cast v3, Ljava/util/List;

    .line 1354
    .line 1355
    sget-object v4, Lw64;->a:Lpz;

    .line 1356
    .line 1357
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1358
    .line 1359
    .line 1360
    move-result v3

    .line 1361
    if-lez v3, :cond_11

    .line 1362
    .line 1363
    shl-int/lit8 v4, v12, 0x3

    .line 1364
    .line 1365
    invoke-static {v4}, Lg54;->D(I)I

    .line 1366
    .line 1367
    .line 1368
    move-result v4

    .line 1369
    goto/16 :goto_1a

    .line 1370
    .line 1371
    :pswitch_3f
    move/from16 v21, v3

    .line 1372
    .line 1373
    move/from16 v22, v4

    .line 1374
    .line 1375
    move/from16 v19, v7

    .line 1376
    .line 1377
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v3

    .line 1381
    check-cast v3, Ljava/util/List;

    .line 1382
    .line 1383
    sget-object v4, Lw64;->a:Lpz;

    .line 1384
    .line 1385
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1386
    .line 1387
    .line 1388
    move-result v3

    .line 1389
    mul-int/lit8 v3, v3, 0x4

    .line 1390
    .line 1391
    if-lez v3, :cond_11

    .line 1392
    .line 1393
    shl-int/lit8 v4, v12, 0x3

    .line 1394
    .line 1395
    invoke-static {v4}, Lg54;->D(I)I

    .line 1396
    .line 1397
    .line 1398
    move-result v4

    .line 1399
    goto/16 :goto_1a

    .line 1400
    .line 1401
    :pswitch_40
    move/from16 v21, v3

    .line 1402
    .line 1403
    move/from16 v22, v4

    .line 1404
    .line 1405
    move/from16 v18, v8

    .line 1406
    .line 1407
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v3

    .line 1411
    check-cast v3, Ljava/util/List;

    .line 1412
    .line 1413
    sget-object v4, Lw64;->a:Lpz;

    .line 1414
    .line 1415
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1416
    .line 1417
    .line 1418
    move-result v3

    .line 1419
    mul-int/lit8 v3, v3, 0x8

    .line 1420
    .line 1421
    if-lez v3, :cond_11

    .line 1422
    .line 1423
    shl-int/lit8 v4, v12, 0x3

    .line 1424
    .line 1425
    invoke-static {v4}, Lg54;->D(I)I

    .line 1426
    .line 1427
    .line 1428
    move-result v4

    .line 1429
    goto/16 :goto_1a

    .line 1430
    .line 1431
    :pswitch_41
    move/from16 v21, v3

    .line 1432
    .line 1433
    move/from16 v22, v4

    .line 1434
    .line 1435
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v3

    .line 1439
    check-cast v3, Ljava/util/List;

    .line 1440
    .line 1441
    invoke-static {v3}, Lw64;->x(Ljava/util/List;)I

    .line 1442
    .line 1443
    .line 1444
    move-result v3

    .line 1445
    if-lez v3, :cond_11

    .line 1446
    .line 1447
    shl-int/lit8 v4, v12, 0x3

    .line 1448
    .line 1449
    invoke-static {v4}, Lg54;->D(I)I

    .line 1450
    .line 1451
    .line 1452
    move-result v4

    .line 1453
    goto/16 :goto_1a

    .line 1454
    .line 1455
    :pswitch_42
    move/from16 v21, v3

    .line 1456
    .line 1457
    move/from16 v22, v4

    .line 1458
    .line 1459
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v3

    .line 1463
    check-cast v3, Ljava/util/List;

    .line 1464
    .line 1465
    invoke-static {v3}, Lw64;->u(Ljava/util/List;)I

    .line 1466
    .line 1467
    .line 1468
    move-result v3

    .line 1469
    if-lez v3, :cond_11

    .line 1470
    .line 1471
    shl-int/lit8 v4, v12, 0x3

    .line 1472
    .line 1473
    invoke-static {v4}, Lg54;->D(I)I

    .line 1474
    .line 1475
    .line 1476
    move-result v4

    .line 1477
    goto/16 :goto_1a

    .line 1478
    .line 1479
    :pswitch_43
    move/from16 v21, v3

    .line 1480
    .line 1481
    move/from16 v22, v4

    .line 1482
    .line 1483
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v3

    .line 1487
    check-cast v3, Ljava/util/List;

    .line 1488
    .line 1489
    invoke-static {v3}, Lw64;->t(Ljava/util/List;)I

    .line 1490
    .line 1491
    .line 1492
    move-result v3

    .line 1493
    if-lez v3, :cond_11

    .line 1494
    .line 1495
    shl-int/lit8 v4, v12, 0x3

    .line 1496
    .line 1497
    invoke-static {v4}, Lg54;->D(I)I

    .line 1498
    .line 1499
    .line 1500
    move-result v4

    .line 1501
    goto/16 :goto_1a

    .line 1502
    .line 1503
    :pswitch_44
    move/from16 v21, v3

    .line 1504
    .line 1505
    move/from16 v22, v4

    .line 1506
    .line 1507
    move/from16 v19, v7

    .line 1508
    .line 1509
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v3

    .line 1513
    check-cast v3, Ljava/util/List;

    .line 1514
    .line 1515
    sget-object v4, Lw64;->a:Lpz;

    .line 1516
    .line 1517
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1518
    .line 1519
    .line 1520
    move-result v3

    .line 1521
    mul-int/lit8 v3, v3, 0x4

    .line 1522
    .line 1523
    if-lez v3, :cond_11

    .line 1524
    .line 1525
    shl-int/lit8 v4, v12, 0x3

    .line 1526
    .line 1527
    invoke-static {v4}, Lg54;->D(I)I

    .line 1528
    .line 1529
    .line 1530
    move-result v4

    .line 1531
    goto/16 :goto_1a

    .line 1532
    .line 1533
    :pswitch_45
    move/from16 v21, v3

    .line 1534
    .line 1535
    move/from16 v22, v4

    .line 1536
    .line 1537
    move/from16 v18, v8

    .line 1538
    .line 1539
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v3

    .line 1543
    check-cast v3, Ljava/util/List;

    .line 1544
    .line 1545
    sget-object v4, Lw64;->a:Lpz;

    .line 1546
    .line 1547
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1548
    .line 1549
    .line 1550
    move-result v3

    .line 1551
    mul-int/lit8 v3, v3, 0x8

    .line 1552
    .line 1553
    if-lez v3, :cond_11

    .line 1554
    .line 1555
    shl-int/lit8 v4, v12, 0x3

    .line 1556
    .line 1557
    invoke-static {v4}, Lg54;->D(I)I

    .line 1558
    .line 1559
    .line 1560
    move-result v4

    .line 1561
    goto/16 :goto_1a

    .line 1562
    .line 1563
    :pswitch_46
    move/from16 v21, v3

    .line 1564
    .line 1565
    move/from16 v22, v4

    .line 1566
    .line 1567
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v3

    .line 1571
    check-cast v3, Ljava/util/List;

    .line 1572
    .line 1573
    sget-object v4, Lw64;->a:Lpz;

    .line 1574
    .line 1575
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1576
    .line 1577
    .line 1578
    move-result v4

    .line 1579
    if-nez v4, :cond_12

    .line 1580
    .line 1581
    :goto_1b
    const/4 v5, 0x0

    .line 1582
    goto :goto_1d

    .line 1583
    :cond_12
    shl-int/lit8 v5, v12, 0x3

    .line 1584
    .line 1585
    invoke-static {v3}, Lw64;->v(Ljava/util/List;)I

    .line 1586
    .line 1587
    .line 1588
    move-result v3

    .line 1589
    invoke-static {v5}, Lg54;->D(I)I

    .line 1590
    .line 1591
    .line 1592
    move-result v5

    .line 1593
    :goto_1c
    mul-int/2addr v5, v4

    .line 1594
    add-int/2addr v5, v3

    .line 1595
    :cond_13
    :goto_1d
    add-int/2addr v9, v5

    .line 1596
    goto/16 :goto_19

    .line 1597
    .line 1598
    :pswitch_47
    move/from16 v21, v3

    .line 1599
    .line 1600
    move/from16 v22, v4

    .line 1601
    .line 1602
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v3

    .line 1606
    check-cast v3, Ljava/util/List;

    .line 1607
    .line 1608
    sget-object v4, Lw64;->a:Lpz;

    .line 1609
    .line 1610
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1611
    .line 1612
    .line 1613
    move-result v4

    .line 1614
    if-nez v4, :cond_14

    .line 1615
    .line 1616
    goto :goto_1b

    .line 1617
    :cond_14
    shl-int/lit8 v5, v12, 0x3

    .line 1618
    .line 1619
    invoke-static {v3}, Lw64;->z(Ljava/util/List;)I

    .line 1620
    .line 1621
    .line 1622
    move-result v3

    .line 1623
    invoke-static {v5}, Lg54;->D(I)I

    .line 1624
    .line 1625
    .line 1626
    move-result v5

    .line 1627
    goto :goto_1c

    .line 1628
    :pswitch_48
    move/from16 v21, v3

    .line 1629
    .line 1630
    move/from16 v22, v4

    .line 1631
    .line 1632
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v3

    .line 1636
    check-cast v3, Ljava/util/List;

    .line 1637
    .line 1638
    invoke-static {v12, v3}, Lw64;->b(ILjava/util/List;)I

    .line 1639
    .line 1640
    .line 1641
    move-result v3

    .line 1642
    :goto_1e
    add-int/2addr v9, v3

    .line 1643
    move/from16 v3, v21

    .line 1644
    .line 1645
    goto/16 :goto_2b

    .line 1646
    .line 1647
    :pswitch_49
    move/from16 v21, v3

    .line 1648
    .line 1649
    move/from16 v22, v4

    .line 1650
    .line 1651
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v3

    .line 1655
    check-cast v3, Ljava/util/List;

    .line 1656
    .line 1657
    invoke-static {v12, v3}, Lw64;->a(ILjava/util/List;)I

    .line 1658
    .line 1659
    .line 1660
    move-result v3

    .line 1661
    goto :goto_1e

    .line 1662
    :pswitch_4a
    move/from16 v21, v3

    .line 1663
    .line 1664
    move/from16 v22, v4

    .line 1665
    .line 1666
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v3

    .line 1670
    check-cast v3, Ljava/util/List;

    .line 1671
    .line 1672
    sget-object v4, Lw64;->a:Lpz;

    .line 1673
    .line 1674
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1675
    .line 1676
    .line 1677
    move-result v4

    .line 1678
    if-nez v4, :cond_15

    .line 1679
    .line 1680
    goto :goto_1b

    .line 1681
    :cond_15
    shl-int/lit8 v5, v12, 0x3

    .line 1682
    .line 1683
    invoke-static {v3}, Lw64;->w(Ljava/util/List;)I

    .line 1684
    .line 1685
    .line 1686
    move-result v3

    .line 1687
    invoke-static {v5}, Lg54;->D(I)I

    .line 1688
    .line 1689
    .line 1690
    move-result v5

    .line 1691
    goto :goto_1c

    .line 1692
    :pswitch_4b
    move/from16 v21, v3

    .line 1693
    .line 1694
    move/from16 v22, v4

    .line 1695
    .line 1696
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v3

    .line 1700
    check-cast v3, Ljava/util/List;

    .line 1701
    .line 1702
    sget-object v4, Lw64;->a:Lpz;

    .line 1703
    .line 1704
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1705
    .line 1706
    .line 1707
    move-result v4

    .line 1708
    if-nez v4, :cond_16

    .line 1709
    .line 1710
    goto/16 :goto_1b

    .line 1711
    .line 1712
    :cond_16
    shl-int/lit8 v5, v12, 0x3

    .line 1713
    .line 1714
    invoke-static {v3}, Lw64;->y(Ljava/util/List;)I

    .line 1715
    .line 1716
    .line 1717
    move-result v3

    .line 1718
    invoke-static {v5}, Lg54;->D(I)I

    .line 1719
    .line 1720
    .line 1721
    move-result v5

    .line 1722
    goto/16 :goto_1c

    .line 1723
    .line 1724
    :pswitch_4c
    move/from16 v21, v3

    .line 1725
    .line 1726
    move/from16 v22, v4

    .line 1727
    .line 1728
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v3

    .line 1732
    check-cast v3, Ljava/util/List;

    .line 1733
    .line 1734
    sget-object v4, Lw64;->a:Lpz;

    .line 1735
    .line 1736
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1737
    .line 1738
    .line 1739
    move-result v4

    .line 1740
    if-nez v4, :cond_17

    .line 1741
    .line 1742
    goto/16 :goto_1b

    .line 1743
    .line 1744
    :cond_17
    shl-int/lit8 v5, v12, 0x3

    .line 1745
    .line 1746
    invoke-static {v5}, Lg54;->D(I)I

    .line 1747
    .line 1748
    .line 1749
    move-result v5

    .line 1750
    mul-int/2addr v5, v4

    .line 1751
    const/4 v4, 0x0

    .line 1752
    :goto_1f
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1753
    .line 1754
    .line 1755
    move-result v7

    .line 1756
    if-ge v4, v7, :cond_13

    .line 1757
    .line 1758
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v7

    .line 1762
    check-cast v7, La54;

    .line 1763
    .line 1764
    invoke-virtual {v7}, La54;->d()I

    .line 1765
    .line 1766
    .line 1767
    move-result v7

    .line 1768
    invoke-static {v7, v7, v5}, Lga1;->g(III)I

    .line 1769
    .line 1770
    .line 1771
    move-result v5

    .line 1772
    add-int/lit8 v4, v4, 0x1

    .line 1773
    .line 1774
    goto :goto_1f

    .line 1775
    :pswitch_4d
    move/from16 v21, v3

    .line 1776
    .line 1777
    move/from16 v22, v4

    .line 1778
    .line 1779
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v3

    .line 1783
    check-cast v3, Ljava/util/List;

    .line 1784
    .line 1785
    invoke-virtual {v0, v2}, Lk64;->D(I)Lv64;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v4

    .line 1789
    sget-object v5, Lw64;->a:Lpz;

    .line 1790
    .line 1791
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1792
    .line 1793
    .line 1794
    move-result v5

    .line 1795
    if-nez v5, :cond_18

    .line 1796
    .line 1797
    const/4 v7, 0x0

    .line 1798
    goto :goto_21

    .line 1799
    :cond_18
    shl-int/lit8 v7, v12, 0x3

    .line 1800
    .line 1801
    invoke-static {v7}, Lg54;->D(I)I

    .line 1802
    .line 1803
    .line 1804
    move-result v7

    .line 1805
    mul-int/2addr v7, v5

    .line 1806
    const/4 v8, 0x0

    .line 1807
    :goto_20
    if-ge v8, v5, :cond_19

    .line 1808
    .line 1809
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v10

    .line 1813
    check-cast v10, Ls44;

    .line 1814
    .line 1815
    invoke-virtual {v10, v4}, Ls44;->d(Lv64;)I

    .line 1816
    .line 1817
    .line 1818
    move-result v10

    .line 1819
    invoke-static {v10, v10, v7}, Lga1;->g(III)I

    .line 1820
    .line 1821
    .line 1822
    move-result v7

    .line 1823
    add-int/lit8 v8, v8, 0x1

    .line 1824
    .line 1825
    goto :goto_20

    .line 1826
    :cond_19
    :goto_21
    add-int/2addr v9, v7

    .line 1827
    goto/16 :goto_19

    .line 1828
    .line 1829
    :pswitch_4e
    move/from16 v21, v3

    .line 1830
    .line 1831
    move/from16 v22, v4

    .line 1832
    .line 1833
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v3

    .line 1837
    check-cast v3, Ljava/util/List;

    .line 1838
    .line 1839
    sget-object v4, Lw64;->a:Lpz;

    .line 1840
    .line 1841
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1842
    .line 1843
    .line 1844
    move-result v4

    .line 1845
    if-nez v4, :cond_1a

    .line 1846
    .line 1847
    goto/16 :goto_1b

    .line 1848
    .line 1849
    :cond_1a
    shl-int/lit8 v5, v12, 0x3

    .line 1850
    .line 1851
    invoke-static {v5}, Lg54;->D(I)I

    .line 1852
    .line 1853
    .line 1854
    move-result v5

    .line 1855
    mul-int/2addr v5, v4

    .line 1856
    const/4 v7, 0x0

    .line 1857
    :goto_22
    if-ge v7, v4, :cond_13

    .line 1858
    .line 1859
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v8

    .line 1863
    instance-of v10, v8, La54;

    .line 1864
    .line 1865
    if-eqz v10, :cond_1b

    .line 1866
    .line 1867
    check-cast v8, La54;

    .line 1868
    .line 1869
    invoke-virtual {v8}, La54;->d()I

    .line 1870
    .line 1871
    .line 1872
    move-result v8

    .line 1873
    invoke-static {v8, v8, v5}, Lga1;->g(III)I

    .line 1874
    .line 1875
    .line 1876
    move-result v5

    .line 1877
    goto :goto_23

    .line 1878
    :cond_1b
    check-cast v8, Ljava/lang/String;

    .line 1879
    .line 1880
    invoke-static {v8}, Lg54;->F(Ljava/lang/String;)I

    .line 1881
    .line 1882
    .line 1883
    move-result v8

    .line 1884
    add-int/2addr v8, v5

    .line 1885
    move v5, v8

    .line 1886
    :goto_23
    add-int/lit8 v7, v7, 0x1

    .line 1887
    .line 1888
    goto :goto_22

    .line 1889
    :pswitch_4f
    move/from16 v21, v3

    .line 1890
    .line 1891
    move/from16 v22, v4

    .line 1892
    .line 1893
    move/from16 v17, v15

    .line 1894
    .line 1895
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v3

    .line 1899
    check-cast v3, Ljava/util/List;

    .line 1900
    .line 1901
    sget-object v4, Lw64;->a:Lpz;

    .line 1902
    .line 1903
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1904
    .line 1905
    .line 1906
    move-result v3

    .line 1907
    if-nez v3, :cond_1c

    .line 1908
    .line 1909
    :goto_24
    const/4 v4, 0x0

    .line 1910
    goto :goto_25

    .line 1911
    :cond_1c
    shl-int/lit8 v4, v12, 0x3

    .line 1912
    .line 1913
    invoke-static {v4}, Lg54;->D(I)I

    .line 1914
    .line 1915
    .line 1916
    move-result v4

    .line 1917
    add-int/lit8 v4, v4, 0x1

    .line 1918
    .line 1919
    mul-int/2addr v4, v3

    .line 1920
    :goto_25
    add-int/2addr v9, v4

    .line 1921
    goto/16 :goto_19

    .line 1922
    .line 1923
    :pswitch_50
    move/from16 v21, v3

    .line 1924
    .line 1925
    move/from16 v22, v4

    .line 1926
    .line 1927
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v3

    .line 1931
    check-cast v3, Ljava/util/List;

    .line 1932
    .line 1933
    invoke-static {v12, v3}, Lw64;->a(ILjava/util/List;)I

    .line 1934
    .line 1935
    .line 1936
    move-result v3

    .line 1937
    goto/16 :goto_1e

    .line 1938
    .line 1939
    :pswitch_51
    move/from16 v21, v3

    .line 1940
    .line 1941
    move/from16 v22, v4

    .line 1942
    .line 1943
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v3

    .line 1947
    check-cast v3, Ljava/util/List;

    .line 1948
    .line 1949
    invoke-static {v12, v3}, Lw64;->b(ILjava/util/List;)I

    .line 1950
    .line 1951
    .line 1952
    move-result v3

    .line 1953
    goto/16 :goto_1e

    .line 1954
    .line 1955
    :pswitch_52
    move/from16 v21, v3

    .line 1956
    .line 1957
    move/from16 v22, v4

    .line 1958
    .line 1959
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1960
    .line 1961
    .line 1962
    move-result-object v3

    .line 1963
    check-cast v3, Ljava/util/List;

    .line 1964
    .line 1965
    sget-object v4, Lw64;->a:Lpz;

    .line 1966
    .line 1967
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1968
    .line 1969
    .line 1970
    move-result v4

    .line 1971
    if-nez v4, :cond_1d

    .line 1972
    .line 1973
    goto/16 :goto_1b

    .line 1974
    .line 1975
    :cond_1d
    shl-int/lit8 v5, v12, 0x3

    .line 1976
    .line 1977
    invoke-static {v3}, Lw64;->x(Ljava/util/List;)I

    .line 1978
    .line 1979
    .line 1980
    move-result v3

    .line 1981
    invoke-static {v5}, Lg54;->D(I)I

    .line 1982
    .line 1983
    .line 1984
    move-result v5

    .line 1985
    goto/16 :goto_1c

    .line 1986
    .line 1987
    :pswitch_53
    move/from16 v21, v3

    .line 1988
    .line 1989
    move/from16 v22, v4

    .line 1990
    .line 1991
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v3

    .line 1995
    check-cast v3, Ljava/util/List;

    .line 1996
    .line 1997
    sget-object v4, Lw64;->a:Lpz;

    .line 1998
    .line 1999
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2000
    .line 2001
    .line 2002
    move-result v4

    .line 2003
    if-nez v4, :cond_1e

    .line 2004
    .line 2005
    goto/16 :goto_1b

    .line 2006
    .line 2007
    :cond_1e
    shl-int/lit8 v5, v12, 0x3

    .line 2008
    .line 2009
    invoke-static {v3}, Lw64;->u(Ljava/util/List;)I

    .line 2010
    .line 2011
    .line 2012
    move-result v3

    .line 2013
    invoke-static {v5}, Lg54;->D(I)I

    .line 2014
    .line 2015
    .line 2016
    move-result v5

    .line 2017
    goto/16 :goto_1c

    .line 2018
    .line 2019
    :pswitch_54
    move/from16 v21, v3

    .line 2020
    .line 2021
    move/from16 v22, v4

    .line 2022
    .line 2023
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v3

    .line 2027
    check-cast v3, Ljava/util/List;

    .line 2028
    .line 2029
    sget-object v4, Lw64;->a:Lpz;

    .line 2030
    .line 2031
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2032
    .line 2033
    .line 2034
    move-result v4

    .line 2035
    if-nez v4, :cond_1f

    .line 2036
    .line 2037
    goto/16 :goto_24

    .line 2038
    .line 2039
    :cond_1f
    shl-int/lit8 v4, v12, 0x3

    .line 2040
    .line 2041
    invoke-static {v3}, Lw64;->t(Ljava/util/List;)I

    .line 2042
    .line 2043
    .line 2044
    move-result v5

    .line 2045
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2046
    .line 2047
    .line 2048
    move-result v3

    .line 2049
    invoke-static {v4}, Lg54;->D(I)I

    .line 2050
    .line 2051
    .line 2052
    move-result v4

    .line 2053
    mul-int/2addr v4, v3

    .line 2054
    add-int/2addr v4, v5

    .line 2055
    goto/16 :goto_25

    .line 2056
    .line 2057
    :pswitch_55
    move/from16 v21, v3

    .line 2058
    .line 2059
    move/from16 v22, v4

    .line 2060
    .line 2061
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2062
    .line 2063
    .line 2064
    move-result-object v3

    .line 2065
    check-cast v3, Ljava/util/List;

    .line 2066
    .line 2067
    invoke-static {v12, v3}, Lw64;->a(ILjava/util/List;)I

    .line 2068
    .line 2069
    .line 2070
    move-result v3

    .line 2071
    goto/16 :goto_1e

    .line 2072
    .line 2073
    :pswitch_56
    move/from16 v21, v3

    .line 2074
    .line 2075
    move/from16 v22, v4

    .line 2076
    .line 2077
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v3

    .line 2081
    check-cast v3, Ljava/util/List;

    .line 2082
    .line 2083
    invoke-static {v12, v3}, Lw64;->b(ILjava/util/List;)I

    .line 2084
    .line 2085
    .line 2086
    move-result v3

    .line 2087
    goto/16 :goto_1e

    .line 2088
    .line 2089
    :pswitch_57
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2090
    .line 2091
    .line 2092
    move-result v5

    .line 2093
    if-eqz v5, :cond_22

    .line 2094
    .line 2095
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2096
    .line 2097
    .line 2098
    move-result-object v5

    .line 2099
    check-cast v5, Ls44;

    .line 2100
    .line 2101
    invoke-virtual {v0, v2}, Lk64;->D(I)Lv64;

    .line 2102
    .line 2103
    .line 2104
    move-result-object v7

    .line 2105
    sget-object v8, Lw64;->a:Lpz;

    .line 2106
    .line 2107
    shl-int/lit8 v8, v12, 0x3

    .line 2108
    .line 2109
    invoke-static {v8}, Lg54;->D(I)I

    .line 2110
    .line 2111
    .line 2112
    move-result v8

    .line 2113
    add-int/2addr v8, v8

    .line 2114
    invoke-virtual {v5, v7}, Ls44;->d(Lv64;)I

    .line 2115
    .line 2116
    .line 2117
    move-result v5

    .line 2118
    goto/16 :goto_3

    .line 2119
    .line 2120
    :pswitch_58
    move/from16 v16, v10

    .line 2121
    .line 2122
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2123
    .line 2124
    .line 2125
    move-result v5

    .line 2126
    if-eqz v5, :cond_22

    .line 2127
    .line 2128
    shl-int/lit8 v0, v12, 0x3

    .line 2129
    .line 2130
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2131
    .line 2132
    .line 2133
    move-result-wide v7

    .line 2134
    add-long v10, v7, v7

    .line 2135
    .line 2136
    shr-long v7, v7, v16

    .line 2137
    .line 2138
    invoke-static {v0}, Lg54;->D(I)I

    .line 2139
    .line 2140
    .line 2141
    move-result v0

    .line 2142
    xor-long/2addr v7, v10

    .line 2143
    invoke-static {v7, v8}, Lg54;->E(J)I

    .line 2144
    .line 2145
    .line 2146
    move-result v5

    .line 2147
    :goto_26
    add-int/2addr v5, v0

    .line 2148
    goto/16 :goto_4

    .line 2149
    .line 2150
    :pswitch_59
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2151
    .line 2152
    .line 2153
    move-result v5

    .line 2154
    if-eqz v5, :cond_22

    .line 2155
    .line 2156
    shl-int/lit8 v0, v12, 0x3

    .line 2157
    .line 2158
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2159
    .line 2160
    .line 2161
    move-result v5

    .line 2162
    add-int v7, v5, v5

    .line 2163
    .line 2164
    shr-int/lit8 v5, v5, 0x1f

    .line 2165
    .line 2166
    invoke-static {v0}, Lg54;->D(I)I

    .line 2167
    .line 2168
    .line 2169
    move-result v0

    .line 2170
    xor-int/2addr v5, v7

    .line 2171
    :goto_27
    invoke-static {v5, v0, v9}, Lga1;->g(III)I

    .line 2172
    .line 2173
    .line 2174
    move-result v9

    .line 2175
    goto/16 :goto_2b

    .line 2176
    .line 2177
    :pswitch_5a
    move/from16 v18, v8

    .line 2178
    .line 2179
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2180
    .line 2181
    .line 2182
    move-result v5

    .line 2183
    if-eqz v5, :cond_20

    .line 2184
    .line 2185
    shl-int/lit8 v0, v12, 0x3

    .line 2186
    .line 2187
    move/from16 v1, v18

    .line 2188
    .line 2189
    :goto_28
    invoke-static {v0, v1, v9}, Lga1;->g(III)I

    .line 2190
    .line 2191
    .line 2192
    move-result v9

    .line 2193
    :cond_20
    move-object/from16 v1, p1

    .line 2194
    .line 2195
    goto/16 :goto_2b

    .line 2196
    .line 2197
    :pswitch_5b
    move/from16 v19, v7

    .line 2198
    .line 2199
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2200
    .line 2201
    .line 2202
    move-result v5

    .line 2203
    if-eqz v5, :cond_20

    .line 2204
    .line 2205
    shl-int/lit8 v0, v12, 0x3

    .line 2206
    .line 2207
    move/from16 v1, v19

    .line 2208
    .line 2209
    goto :goto_28

    .line 2210
    :pswitch_5c
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2211
    .line 2212
    .line 2213
    move-result v5

    .line 2214
    if-eqz v5, :cond_22

    .line 2215
    .line 2216
    shl-int/lit8 v0, v12, 0x3

    .line 2217
    .line 2218
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2219
    .line 2220
    .line 2221
    move-result v5

    .line 2222
    int-to-long v7, v5

    .line 2223
    invoke-static {v0}, Lg54;->D(I)I

    .line 2224
    .line 2225
    .line 2226
    move-result v0

    .line 2227
    invoke-static {v7, v8}, Lg54;->E(J)I

    .line 2228
    .line 2229
    .line 2230
    move-result v5

    .line 2231
    goto :goto_26

    .line 2232
    :pswitch_5d
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2233
    .line 2234
    .line 2235
    move-result v5

    .line 2236
    if-eqz v5, :cond_22

    .line 2237
    .line 2238
    shl-int/lit8 v0, v12, 0x3

    .line 2239
    .line 2240
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2241
    .line 2242
    .line 2243
    move-result v5

    .line 2244
    invoke-static {v0}, Lg54;->D(I)I

    .line 2245
    .line 2246
    .line 2247
    move-result v0

    .line 2248
    goto :goto_27

    .line 2249
    :pswitch_5e
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2250
    .line 2251
    .line 2252
    move-result v5

    .line 2253
    if-eqz v5, :cond_22

    .line 2254
    .line 2255
    shl-int/lit8 v0, v12, 0x3

    .line 2256
    .line 2257
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v5

    .line 2261
    check-cast v5, La54;

    .line 2262
    .line 2263
    invoke-static {v0}, Lg54;->D(I)I

    .line 2264
    .line 2265
    .line 2266
    move-result v0

    .line 2267
    invoke-virtual {v5}, La54;->d()I

    .line 2268
    .line 2269
    .line 2270
    move-result v5

    .line 2271
    :goto_29
    invoke-static {v5, v5, v0, v9}, Lga1;->r(IIII)I

    .line 2272
    .line 2273
    .line 2274
    move-result v9

    .line 2275
    goto/16 :goto_2b

    .line 2276
    .line 2277
    :pswitch_5f
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2278
    .line 2279
    .line 2280
    move-result v5

    .line 2281
    if-eqz v5, :cond_22

    .line 2282
    .line 2283
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2284
    .line 2285
    .line 2286
    move-result-object v5

    .line 2287
    invoke-virtual {v0, v2}, Lk64;->D(I)Lv64;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v7

    .line 2291
    sget-object v8, Lw64;->a:Lpz;

    .line 2292
    .line 2293
    shl-int/lit8 v8, v12, 0x3

    .line 2294
    .line 2295
    check-cast v5, Ls44;

    .line 2296
    .line 2297
    invoke-static {v8}, Lg54;->D(I)I

    .line 2298
    .line 2299
    .line 2300
    move-result v8

    .line 2301
    invoke-virtual {v5, v7}, Ls44;->d(Lv64;)I

    .line 2302
    .line 2303
    .line 2304
    move-result v5

    .line 2305
    goto/16 :goto_a

    .line 2306
    .line 2307
    :pswitch_60
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2308
    .line 2309
    .line 2310
    move-result v5

    .line 2311
    if-eqz v5, :cond_22

    .line 2312
    .line 2313
    shl-int/lit8 v0, v12, 0x3

    .line 2314
    .line 2315
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2316
    .line 2317
    .line 2318
    move-result-object v5

    .line 2319
    instance-of v7, v5, La54;

    .line 2320
    .line 2321
    if-eqz v7, :cond_21

    .line 2322
    .line 2323
    check-cast v5, La54;

    .line 2324
    .line 2325
    invoke-static {v0}, Lg54;->D(I)I

    .line 2326
    .line 2327
    .line 2328
    move-result v0

    .line 2329
    invoke-virtual {v5}, La54;->d()I

    .line 2330
    .line 2331
    .line 2332
    move-result v5

    .line 2333
    goto :goto_29

    .line 2334
    :cond_21
    check-cast v5, Ljava/lang/String;

    .line 2335
    .line 2336
    invoke-static {v0}, Lg54;->D(I)I

    .line 2337
    .line 2338
    .line 2339
    move-result v0

    .line 2340
    invoke-static {v5}, Lg54;->F(Ljava/lang/String;)I

    .line 2341
    .line 2342
    .line 2343
    move-result v5

    .line 2344
    goto/16 :goto_26

    .line 2345
    .line 2346
    :pswitch_61
    move/from16 v17, v15

    .line 2347
    .line 2348
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2349
    .line 2350
    .line 2351
    move-result v5

    .line 2352
    if-eqz v5, :cond_20

    .line 2353
    .line 2354
    shl-int/lit8 v0, v12, 0x3

    .line 2355
    .line 2356
    move/from16 v1, v17

    .line 2357
    .line 2358
    goto/16 :goto_28

    .line 2359
    .line 2360
    :pswitch_62
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2361
    .line 2362
    .line 2363
    move-result v5

    .line 2364
    if-eqz v5, :cond_20

    .line 2365
    .line 2366
    :goto_2a
    shl-int/lit8 v0, v12, 0x3

    .line 2367
    .line 2368
    const/4 v1, 0x4

    .line 2369
    goto/16 :goto_28

    .line 2370
    .line 2371
    :pswitch_63
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2372
    .line 2373
    .line 2374
    move-result v5

    .line 2375
    if-eqz v5, :cond_20

    .line 2376
    .line 2377
    shl-int/lit8 v0, v12, 0x3

    .line 2378
    .line 2379
    const/16 v1, 0x8

    .line 2380
    .line 2381
    goto/16 :goto_28

    .line 2382
    .line 2383
    :pswitch_64
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2384
    .line 2385
    .line 2386
    move-result v5

    .line 2387
    if-eqz v5, :cond_22

    .line 2388
    .line 2389
    shl-int/lit8 v0, v12, 0x3

    .line 2390
    .line 2391
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2392
    .line 2393
    .line 2394
    move-result v5

    .line 2395
    int-to-long v7, v5

    .line 2396
    invoke-static {v0}, Lg54;->D(I)I

    .line 2397
    .line 2398
    .line 2399
    move-result v0

    .line 2400
    invoke-static {v7, v8}, Lg54;->E(J)I

    .line 2401
    .line 2402
    .line 2403
    move-result v5

    .line 2404
    goto/16 :goto_26

    .line 2405
    .line 2406
    :pswitch_65
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2407
    .line 2408
    .line 2409
    move-result v5

    .line 2410
    if-eqz v5, :cond_22

    .line 2411
    .line 2412
    shl-int/lit8 v0, v12, 0x3

    .line 2413
    .line 2414
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2415
    .line 2416
    .line 2417
    move-result-wide v7

    .line 2418
    invoke-static {v0}, Lg54;->D(I)I

    .line 2419
    .line 2420
    .line 2421
    move-result v0

    .line 2422
    invoke-static {v7, v8}, Lg54;->E(J)I

    .line 2423
    .line 2424
    .line 2425
    move-result v5

    .line 2426
    goto/16 :goto_26

    .line 2427
    .line 2428
    :pswitch_66
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2429
    .line 2430
    .line 2431
    move-result v5

    .line 2432
    if-eqz v5, :cond_22

    .line 2433
    .line 2434
    shl-int/lit8 v0, v12, 0x3

    .line 2435
    .line 2436
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2437
    .line 2438
    .line 2439
    move-result-wide v7

    .line 2440
    invoke-static {v0}, Lg54;->D(I)I

    .line 2441
    .line 2442
    .line 2443
    move-result v0

    .line 2444
    invoke-static {v7, v8}, Lg54;->E(J)I

    .line 2445
    .line 2446
    .line 2447
    move-result v5

    .line 2448
    goto/16 :goto_26

    .line 2449
    .line 2450
    :pswitch_67
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2451
    .line 2452
    .line 2453
    move-result v5

    .line 2454
    if-eqz v5, :cond_20

    .line 2455
    .line 2456
    goto :goto_2a

    .line 2457
    :pswitch_68
    invoke-virtual/range {v0 .. v5}, Lk64;->r(Ljava/lang/Object;IIII)Z

    .line 2458
    .line 2459
    .line 2460
    move-result v5

    .line 2461
    if-eqz v5, :cond_22

    .line 2462
    .line 2463
    shl-int/lit8 v0, v12, 0x3

    .line 2464
    .line 2465
    const/16 v5, 0x8

    .line 2466
    .line 2467
    invoke-static {v0, v5, v9}, Lga1;->g(III)I

    .line 2468
    .line 2469
    .line 2470
    move-result v9

    .line 2471
    :cond_22
    :goto_2b
    add-int/lit8 v2, v2, 0x3

    .line 2472
    .line 2473
    const v8, 0xfffff

    .line 2474
    .line 2475
    .line 2476
    move-object/from16 v0, p0

    .line 2477
    .line 2478
    goto/16 :goto_0

    .line 2479
    .line 2480
    :cond_23
    iget-object v0, v1, Lp54;->zzt:Lb74;

    .line 2481
    .line 2482
    invoke-virtual {v0}, Lb74;->c()I

    .line 2483
    .line 2484
    .line 2485
    move-result v0

    .line 2486
    add-int/2addr v0, v9

    .line 2487
    return v0

    .line 2488
    nop

    .line 2489
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch

    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-static {p1}, Lk64;->m(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    instance-of v0, p1, Lp54;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Lp54;

    .line 16
    .line 17
    const v2, 0x7fffffff

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Lp54;->g(I)V

    .line 21
    .line 22
    .line 23
    iput v1, v0, Ls44;->zzq:I

    .line 24
    .line 25
    invoke-virtual {v0}, Lp54;->i()V

    .line 26
    .line 27
    .line 28
    :cond_1
    move v0, v1

    .line 29
    :goto_0
    iget-object v2, p0, Lk64;->a:[I

    .line 30
    .line 31
    array-length v3, v2

    .line 32
    if-ge v0, v3, :cond_5

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lk64;->k(I)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const v4, 0xfffff

    .line 39
    .line 40
    .line 41
    and-int/2addr v4, v3

    .line 42
    invoke-static {v3}, Lk64;->l(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    int-to-long v4, v4

    .line 47
    const/16 v6, 0x9

    .line 48
    .line 49
    if-eq v3, v6, :cond_3

    .line 50
    .line 51
    const/16 v6, 0x3c

    .line 52
    .line 53
    if-eq v3, v6, :cond_2

    .line 54
    .line 55
    const/16 v6, 0x44

    .line 56
    .line 57
    if-eq v3, v6, :cond_2

    .line 58
    .line 59
    packed-switch v3, :pswitch_data_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :pswitch_0
    sget-object v2, Lk64;->l:Lsun/misc/Unsafe;

    .line 64
    .line 65
    invoke-virtual {v2, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    move-object v6, v3

    .line 72
    check-cast v6, Lg64;

    .line 73
    .line 74
    iput-boolean v1, v6, Lg64;->f:Z

    .line 75
    .line 76
    invoke-virtual {v2, p1, v4, v5, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :pswitch_1
    invoke-static {v4, v5, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lx54;

    .line 85
    .line 86
    check-cast v2, Lt44;

    .line 87
    .line 88
    iget-boolean v3, v2, Lt44;->f:Z

    .line 89
    .line 90
    if-eqz v3, :cond_4

    .line 91
    .line 92
    iput-boolean v1, v2, Lt44;->f:Z

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    aget v2, v2, v0

    .line 96
    .line 97
    invoke-virtual {p0, v2, p1, v0}, Lk64;->u(ILjava/lang/Object;I)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Lk64;->D(I)Lv64;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    sget-object v3, Lk64;->l:Lsun/misc/Unsafe;

    .line 108
    .line 109
    invoke-virtual {v3, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-interface {v2, v3}, Lv64;->h(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    :pswitch_2
    invoke-virtual {p0, v0, p1}, Lk64;->s(ILjava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_4

    .line 122
    .line 123
    invoke-virtual {p0, v0}, Lk64;->D(I)Lv64;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    sget-object v3, Lk64;->l:Lsun/misc/Unsafe;

    .line 128
    .line 129
    invoke-virtual {v3, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-interface {v2, v3}, Lv64;->h(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_4
    :goto_1
    add-int/lit8 v0, v0, 0x3

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_5
    iget-object v0, p0, Lk64;->j:Lpz;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    check-cast p1, Lp54;

    .line 145
    .line 146
    iget-object p1, p1, Lp54;->zzt:Lb74;

    .line 147
    .line 148
    iget-boolean v0, p1, Lb74;->e:Z

    .line 149
    .line 150
    if-eqz v0, :cond_6

    .line 151
    .line 152
    iput-boolean v1, p1, Lb74;->e:Z

    .line 153
    .line 154
    :cond_6
    :goto_2
    return-void

    .line 155
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;[BIILv44;)V
    .locals 7

    .line 1
    const/4 v5, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move-object v6, p5

    .line 8
    invoke-virtual/range {v0 .. v6}, Lk64;->y(Ljava/lang/Object;[BIIILv44;)I

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final j(Lp54;Lp54;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lk64;->a:[I

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    if-ge v1, v3, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lk64;->k(I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const v4, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int v5, v3, v4

    .line 16
    .line 17
    invoke-static {v3}, Lk64;->l(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    int-to-long v5, v5

    .line 22
    packed-switch v3, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :pswitch_0
    add-int/lit8 v3, v1, 0x2

    .line 28
    .line 29
    aget v2, v2, v3

    .line 30
    .line 31
    and-int/2addr v2, v4

    .line 32
    int-to-long v2, v2

    .line 33
    invoke-static {v2, v3, p1}, Lg74;->g(JLjava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-static {v2, v3, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-ne v4, v2, :cond_2

    .line 42
    .line 43
    invoke-static {v5, v6, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v5, v6, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v2, v3}, Lw64;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_0

    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :pswitch_1
    invoke-static {v5, v6, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v5, v6, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v2, v3}, Lw64;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    goto :goto_1

    .line 72
    :pswitch_2
    invoke-static {v5, v6, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {v5, v6, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-static {v2, v3}, Lw64;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    :goto_1
    if-nez v2, :cond_0

    .line 85
    .line 86
    goto/16 :goto_3

    .line 87
    .line 88
    :pswitch_3
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_2

    .line 93
    .line 94
    invoke-static {v5, v6, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v5, v6, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v2, v3}, Lw64;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    goto/16 :goto_2

    .line 109
    .line 110
    :pswitch_4
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_2

    .line 115
    .line 116
    invoke-static {v5, v6, p1}, Lg74;->i(JLjava/lang/Object;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    invoke-static {v5, v6, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 121
    .line 122
    .line 123
    move-result-wide v4

    .line 124
    cmp-long v2, v2, v4

    .line 125
    .line 126
    if-nez v2, :cond_2

    .line 127
    .line 128
    goto/16 :goto_2

    .line 129
    .line 130
    :pswitch_5
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_2

    .line 135
    .line 136
    invoke-static {v5, v6, p1}, Lg74;->g(JLjava/lang/Object;)I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-static {v5, v6, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-ne v2, v3, :cond_2

    .line 145
    .line 146
    goto/16 :goto_2

    .line 147
    .line 148
    :pswitch_6
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_2

    .line 153
    .line 154
    invoke-static {v5, v6, p1}, Lg74;->i(JLjava/lang/Object;)J

    .line 155
    .line 156
    .line 157
    move-result-wide v2

    .line 158
    invoke-static {v5, v6, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v4

    .line 162
    cmp-long v2, v2, v4

    .line 163
    .line 164
    if-nez v2, :cond_2

    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :pswitch_7
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_2

    .line 173
    .line 174
    invoke-static {v5, v6, p1}, Lg74;->g(JLjava/lang/Object;)I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    invoke-static {v5, v6, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-ne v2, v3, :cond_2

    .line 183
    .line 184
    goto/16 :goto_2

    .line 185
    .line 186
    :pswitch_8
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_2

    .line 191
    .line 192
    invoke-static {v5, v6, p1}, Lg74;->g(JLjava/lang/Object;)I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-static {v5, v6, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-ne v2, v3, :cond_2

    .line 201
    .line 202
    goto/16 :goto_2

    .line 203
    .line 204
    :pswitch_9
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_2

    .line 209
    .line 210
    invoke-static {v5, v6, p1}, Lg74;->g(JLjava/lang/Object;)I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    invoke-static {v5, v6, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-ne v2, v3, :cond_2

    .line 219
    .line 220
    goto/16 :goto_2

    .line 221
    .line 222
    :pswitch_a
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-eqz v2, :cond_2

    .line 227
    .line 228
    invoke-static {v5, v6, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-static {v5, v6, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-static {v2, v3}, Lw64;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_2

    .line 241
    .line 242
    goto/16 :goto_2

    .line 243
    .line 244
    :pswitch_b
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-eqz v2, :cond_2

    .line 249
    .line 250
    invoke-static {v5, v6, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-static {v5, v6, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-static {v2, v3}, Lw64;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    if-eqz v2, :cond_2

    .line 263
    .line 264
    goto/16 :goto_2

    .line 265
    .line 266
    :pswitch_c
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-eqz v2, :cond_2

    .line 271
    .line 272
    invoke-static {v5, v6, p1}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-static {v5, v6, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-static {v2, v3}, Lw64;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-eqz v2, :cond_2

    .line 285
    .line 286
    goto/16 :goto_2

    .line 287
    .line 288
    :pswitch_d
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v2, :cond_2

    .line 293
    .line 294
    sget-object v2, Lg74;->c:Lf74;

    .line 295
    .line 296
    invoke-virtual {v2, v5, v6, p1}, Lf74;->t1(JLjava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    invoke-virtual {v2, v5, v6, p2}, Lf74;->t1(JLjava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    if-ne v3, v2, :cond_2

    .line 305
    .line 306
    goto/16 :goto_2

    .line 307
    .line 308
    :pswitch_e
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    if-eqz v2, :cond_2

    .line 313
    .line 314
    invoke-static {v5, v6, p1}, Lg74;->g(JLjava/lang/Object;)I

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    invoke-static {v5, v6, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-ne v2, v3, :cond_2

    .line 323
    .line 324
    goto/16 :goto_2

    .line 325
    .line 326
    :pswitch_f
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-eqz v2, :cond_2

    .line 331
    .line 332
    invoke-static {v5, v6, p1}, Lg74;->i(JLjava/lang/Object;)J

    .line 333
    .line 334
    .line 335
    move-result-wide v2

    .line 336
    invoke-static {v5, v6, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 337
    .line 338
    .line 339
    move-result-wide v4

    .line 340
    cmp-long v2, v2, v4

    .line 341
    .line 342
    if-nez v2, :cond_2

    .line 343
    .line 344
    goto/16 :goto_2

    .line 345
    .line 346
    :pswitch_10
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    if-eqz v2, :cond_2

    .line 351
    .line 352
    invoke-static {v5, v6, p1}, Lg74;->g(JLjava/lang/Object;)I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    invoke-static {v5, v6, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    if-ne v2, v3, :cond_2

    .line 361
    .line 362
    goto :goto_2

    .line 363
    :pswitch_11
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-eqz v2, :cond_2

    .line 368
    .line 369
    invoke-static {v5, v6, p1}, Lg74;->i(JLjava/lang/Object;)J

    .line 370
    .line 371
    .line 372
    move-result-wide v2

    .line 373
    invoke-static {v5, v6, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 374
    .line 375
    .line 376
    move-result-wide v4

    .line 377
    cmp-long v2, v2, v4

    .line 378
    .line 379
    if-nez v2, :cond_2

    .line 380
    .line 381
    goto :goto_2

    .line 382
    :pswitch_12
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-eqz v2, :cond_2

    .line 387
    .line 388
    invoke-static {v5, v6, p1}, Lg74;->i(JLjava/lang/Object;)J

    .line 389
    .line 390
    .line 391
    move-result-wide v2

    .line 392
    invoke-static {v5, v6, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 393
    .line 394
    .line 395
    move-result-wide v4

    .line 396
    cmp-long v2, v2, v4

    .line 397
    .line 398
    if-nez v2, :cond_2

    .line 399
    .line 400
    goto :goto_2

    .line 401
    :pswitch_13
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    if-eqz v2, :cond_2

    .line 406
    .line 407
    sget-object v2, Lg74;->c:Lf74;

    .line 408
    .line 409
    invoke-virtual {v2, v5, v6, p1}, Lf74;->w1(JLjava/lang/Object;)F

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    invoke-virtual {v2, v5, v6, p2}, Lf74;->w1(JLjava/lang/Object;)F

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-ne v3, v2, :cond_2

    .line 426
    .line 427
    goto :goto_2

    .line 428
    :pswitch_14
    invoke-virtual {p0, p1, p2, v1}, Lk64;->q(Lp54;Lp54;I)Z

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    if-eqz v2, :cond_2

    .line 433
    .line 434
    sget-object v2, Lg74;->c:Lf74;

    .line 435
    .line 436
    invoke-virtual {v2, v5, v6, p1}, Lf74;->y1(JLjava/lang/Object;)D

    .line 437
    .line 438
    .line 439
    move-result-wide v3

    .line 440
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 441
    .line 442
    .line 443
    move-result-wide v3

    .line 444
    invoke-virtual {v2, v5, v6, p2}, Lf74;->y1(JLjava/lang/Object;)D

    .line 445
    .line 446
    .line 447
    move-result-wide v5

    .line 448
    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 449
    .line 450
    .line 451
    move-result-wide v5

    .line 452
    cmp-long v2, v3, v5

    .line 453
    .line 454
    if-nez v2, :cond_2

    .line 455
    .line 456
    :cond_0
    :goto_2
    add-int/lit8 v1, v1, 0x3

    .line 457
    .line 458
    goto/16 :goto_0

    .line 459
    .line 460
    :cond_1
    iget-object p1, p1, Lp54;->zzt:Lb74;

    .line 461
    .line 462
    iget-object p2, p2, Lp54;->zzt:Lb74;

    .line 463
    .line 464
    invoke-virtual {p1, p2}, Lb74;->equals(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result p1

    .line 468
    if-nez p1, :cond_3

    .line 469
    .line 470
    :cond_2
    :goto_3
    return v0

    .line 471
    :cond_3
    const/4 p1, 0x1

    .line 472
    return p1

    .line 473
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final k(I)I
    .locals 1

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget-object v0, p0, Lk64;->a:[I

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method public final q(Lp54;Lp54;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p1}, Lk64;->s(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p3, p2}, Lk64;->s(ILjava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public final r(Ljava/lang/Object;IIII)Z
    .locals 1

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    if-ne p3, v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p2, p1}, Lk64;->s(ILjava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_0
    and-int p1, p4, p5

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method public final s(ILjava/lang/Object;)Z
    .locals 6

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    iget-object v1, p0, Lk64;->a:[I

    .line 4
    .line 5
    aget v0, v1, v0

    .line 6
    .line 7
    const v1, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int v2, v0, v1

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    const-wide/32 v4, 0xfffff

    .line 14
    .line 15
    .line 16
    cmp-long v4, v2, v4

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    if-nez v4, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lk64;->k(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    and-int v0, p1, v1

    .line 26
    .line 27
    invoke-static {p1}, Lk64;->l(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    int-to-long v0, v0

    .line 32
    const-wide/16 v2, 0x0

    .line 33
    .line 34
    packed-switch p1, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :pswitch_0
    invoke-static {v0, v1, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :pswitch_1
    invoke-static {v0, v1, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    cmp-long p1, p1, v2

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :pswitch_2
    invoke-static {v0, v1, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :pswitch_3
    invoke-static {v0, v1, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 70
    .line 71
    .line 72
    move-result-wide p1

    .line 73
    cmp-long p1, p1, v2

    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    goto/16 :goto_0

    .line 78
    .line 79
    :pswitch_4
    invoke-static {v0, v1, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :pswitch_5
    invoke-static {v0, v1, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :pswitch_6
    invoke-static {v0, v1, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_3

    .line 100
    .line 101
    goto/16 :goto_0

    .line 102
    .line 103
    :pswitch_7
    sget-object p1, La54;->g:Ly44;

    .line 104
    .line 105
    invoke-static {v0, v1, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-virtual {p1, p2}, Ly44;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_3

    .line 114
    .line 115
    goto/16 :goto_0

    .line 116
    .line 117
    :pswitch_8
    invoke-static {v0, v1, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-eqz p1, :cond_3

    .line 122
    .line 123
    goto/16 :goto_0

    .line 124
    .line 125
    :pswitch_9
    invoke-static {v0, v1, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    instance-of p2, p1, Ljava/lang/String;

    .line 130
    .line 131
    if-eqz p2, :cond_0

    .line 132
    .line 133
    check-cast p1, Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-nez p1, :cond_3

    .line 140
    .line 141
    goto/16 :goto_0

    .line 142
    .line 143
    :cond_0
    instance-of p2, p1, La54;

    .line 144
    .line 145
    if-eqz p2, :cond_1

    .line 146
    .line 147
    sget-object p2, La54;->g:Ly44;

    .line 148
    .line 149
    invoke-virtual {p2, p1}, Ly44;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-nez p1, :cond_3

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 157
    .line 158
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 159
    .line 160
    .line 161
    throw p1

    .line 162
    :pswitch_a
    sget-object p1, Lg74;->c:Lf74;

    .line 163
    .line 164
    invoke-virtual {p1, v0, v1, p2}, Lf74;->t1(JLjava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    return p1

    .line 169
    :pswitch_b
    invoke-static {v0, v1, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_3

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :pswitch_c
    invoke-static {v0, v1, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 177
    .line 178
    .line 179
    move-result-wide p1

    .line 180
    cmp-long p1, p1, v2

    .line 181
    .line 182
    if-eqz p1, :cond_3

    .line 183
    .line 184
    goto :goto_0

    .line 185
    :pswitch_d
    invoke-static {v0, v1, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_3

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :pswitch_e
    invoke-static {v0, v1, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 193
    .line 194
    .line 195
    move-result-wide p1

    .line 196
    cmp-long p1, p1, v2

    .line 197
    .line 198
    if-eqz p1, :cond_3

    .line 199
    .line 200
    goto :goto_0

    .line 201
    :pswitch_f
    invoke-static {v0, v1, p2}, Lg74;->i(JLjava/lang/Object;)J

    .line 202
    .line 203
    .line 204
    move-result-wide p1

    .line 205
    cmp-long p1, p1, v2

    .line 206
    .line 207
    if-eqz p1, :cond_3

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :pswitch_10
    sget-object p1, Lg74;->c:Lf74;

    .line 211
    .line 212
    invoke-virtual {p1, v0, v1, p2}, Lf74;->w1(JLjava/lang/Object;)F

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-eqz p1, :cond_3

    .line 221
    .line 222
    goto :goto_0

    .line 223
    :pswitch_11
    sget-object p1, Lg74;->c:Lf74;

    .line 224
    .line 225
    invoke-virtual {p1, v0, v1, p2}, Lf74;->y1(JLjava/lang/Object;)D

    .line 226
    .line 227
    .line 228
    move-result-wide p1

    .line 229
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 230
    .line 231
    .line 232
    move-result-wide p1

    .line 233
    cmp-long p1, p1, v2

    .line 234
    .line 235
    if-eqz p1, :cond_3

    .line 236
    .line 237
    goto :goto_0

    .line 238
    :cond_2
    ushr-int/lit8 p1, v0, 0x14

    .line 239
    .line 240
    shl-int p1, v5, p1

    .line 241
    .line 242
    invoke-static {v2, v3, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 243
    .line 244
    .line 245
    move-result p2

    .line 246
    and-int/2addr p1, p2

    .line 247
    if-eqz p1, :cond_3

    .line 248
    .line 249
    :goto_0
    return v5

    .line 250
    :cond_3
    const/4 p1, 0x0

    .line 251
    return p1

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final t(ILjava/lang/Object;)V
    .locals 4

    .line 1
    add-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Lk64;->a:[I

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    const v0, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v0, p1

    .line 11
    int-to-long v0, v0

    .line 12
    const-wide/32 v2, 0xfffff

    .line 13
    .line 14
    .line 15
    cmp-long v2, v0, v2

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    ushr-int/lit8 p1, p1, 0x14

    .line 21
    .line 22
    invoke-static {v0, v1, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x1

    .line 27
    shl-int p1, v3, p1

    .line 28
    .line 29
    or-int/2addr p1, v2

    .line 30
    invoke-static {v0, v1, p2, p1}, Lg74;->h(JLjava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final u(ILjava/lang/Object;I)Z
    .locals 2

    .line 1
    add-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Lk64;->a:[I

    .line 4
    .line 5
    aget p3, v0, p3

    .line 6
    .line 7
    const v0, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p3, v0

    .line 11
    int-to-long v0, p3

    .line 12
    invoke-static {v0, v1, p2}, Lg74;->g(JLjava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-ne p2, p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public final v(ILjava/lang/Object;I)V
    .locals 2

    .line 1
    add-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Lk64;->a:[I

    .line 4
    .line 5
    aget p3, v0, p3

    .line 6
    .line 7
    const v0, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p3, v0

    .line 11
    int-to-long v0, p3

    .line 12
    invoke-static {v0, v1, p2, p1}, Lg74;->h(JLjava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final w(II)I
    .locals 6

    .line 1
    iget-object v0, p0, Lk64;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    div-int/lit8 v1, v1, 0x3

    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    add-int/2addr v1, v2

    .line 8
    :goto_0
    if-gt p2, v1, :cond_2

    .line 9
    .line 10
    add-int v3, v1, p2

    .line 11
    .line 12
    ushr-int/lit8 v3, v3, 0x1

    .line 13
    .line 14
    mul-int/lit8 v4, v3, 0x3

    .line 15
    .line 16
    aget v5, v0, v4

    .line 17
    .line 18
    if-ne p1, v5, :cond_0

    .line 19
    .line 20
    return v4

    .line 21
    :cond_0
    if-ge p1, v5, :cond_1

    .line 22
    .line 23
    add-int/lit8 v1, v3, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    add-int/lit8 p2, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    return v2
.end method

.method public final y(Ljava/lang/Object;[BIIILv44;)I
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v6, p6

    .line 1
    invoke-static {v2}, Lk64;->n(Ljava/lang/Object;)V

    sget-object v1, Lk64;->l:Lsun/misc/Unsafe;

    move/from16 v4, p3

    const/4 v7, -0x1

    const/4 v8, 0x0

    const v9, 0xfffff

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_0
    const v16, 0xfffff

    :goto_1
    const-string v13, "Failed to parse the message."

    const/16 v17, 0x0

    if-ge v4, v5, :cond_85

    add-int/lit8 v15, v4, 0x1

    .line 2
    aget-byte v4, v3, v4

    if-gez v4, :cond_0

    .line 3
    invoke-static {v4, v3, v15, v6}, Lm54;->I(I[BILv44;)I

    move-result v15

    iget v4, v6, Lv44;->a:I

    :cond_0
    move/from16 v32, v15

    move v15, v4

    move/from16 v4, v32

    ushr-int/lit8 v12, v15, 0x3

    iget v11, v0, Lk64;->d:I

    iget v3, v0, Lk64;->c:I

    move/from16 p3, v4

    const/4 v4, 0x3

    if-le v12, v7, :cond_2

    div-int/2addr v8, v4

    if-lt v12, v3, :cond_1

    if-gt v12, v11, :cond_1

    .line 4
    invoke-virtual {v0, v12, v8}, Lk64;->w(II)I

    move-result v3

    goto :goto_2

    :cond_1
    const/4 v3, -0x1

    :goto_2
    const/4 v11, 0x0

    goto :goto_3

    :cond_2
    if-lt v12, v3, :cond_3

    if-gt v12, v11, :cond_3

    const/4 v11, 0x0

    .line 5
    invoke-virtual {v0, v12, v11}, Lk64;->w(II)I

    move-result v3

    goto :goto_3

    :cond_3
    const/4 v11, 0x0

    const/4 v3, -0x1

    .line 6
    :goto_3
    sget-object v8, Lb74;->f:Lb74;

    const/4 v7, -0x1

    if-ne v3, v7, :cond_4

    move-object/from16 v4, p2

    move/from16 v3, p3

    move-object v10, v6

    move/from16 v18, v7

    move/from16 v27, v9

    move/from16 v19, v11

    move-object/from16 v26, v13

    move v13, v15

    move/from16 v7, p5

    move-object v11, v1

    move-object v9, v2

    goto/16 :goto_49

    :cond_4
    and-int/lit8 v7, v15, 0x7

    add-int/lit8 v19, v3, 0x1

    .line 7
    iget-object v11, v0, Lk64;->a:[I

    aget v4, v11, v19

    invoke-static {v4}, Lk64;->l(I)I

    move-result v5

    and-int v6, v4, v16

    move-object/from16 v21, v11

    move/from16 v19, v12

    int-to-long v11, v6

    const/high16 v22, 0x20000000

    const-wide/16 v23, 0x0

    const-string v6, ""

    move-wide/from16 v26, v11

    const-string v11, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    const/16 v28, 0x1

    const/16 v12, 0x11

    if-gt v5, v12, :cond_17

    add-int/lit8 v12, v3, 0x2

    .line 8
    aget v12, v21, v12

    ushr-int/lit8 v21, v12, 0x14

    shl-int v21, v28, v21

    and-int v12, v12, v16

    if-eq v12, v9, :cond_7

    move/from16 v10, v16

    move-object/from16 v25, v11

    if-eq v9, v10, :cond_5

    int-to-long v10, v9

    .line 9
    invoke-virtual {v1, v2, v10, v11, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const v10, 0xfffff

    :cond_5
    if-ne v12, v10, :cond_6

    const/4 v9, 0x0

    goto :goto_4

    :cond_6
    int-to-long v9, v12

    .line 10
    invoke-virtual {v1, v2, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v9

    :goto_4
    move v14, v9

    goto :goto_5

    :cond_7
    move-object/from16 v25, v11

    move v12, v9

    :goto_5
    packed-switch v5, :pswitch_data_0

    const/4 v5, 0x3

    if-ne v7, v5, :cond_8

    or-int v14, v14, v21

    .line 11
    invoke-virtual {v0, v3, v2}, Lk64;->G(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    shl-int/lit8 v5, v19, 0x3

    or-int/lit8 v8, v5, 0x4

    move-object v5, v4

    .line 12
    invoke-virtual {v0, v3}, Lk64;->D(I)Lv64;

    move-result-object v4

    move/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v9, p6

    move v10, v3

    move-object v3, v5

    const/16 v18, -0x1

    move-object/from16 v5, p2

    .line 13
    invoke-static/range {v3 .. v9}, Lm54;->c0(Ljava/lang/Object;Lv64;[BIIILv44;)I

    move-result v4

    move-object v11, v9

    move-object v9, v5

    .line 14
    invoke-virtual {v0, v10, v2, v3}, Lk64;->H(ILjava/lang/Object;Ljava/lang/Object;)V

    :goto_6
    move/from16 v5, p4

    :goto_7
    move-object v3, v9

    move v8, v10

    move-object v6, v11

    :goto_8
    move v9, v12

    move/from16 v7, v19

    goto/16 :goto_0

    :cond_8
    move v10, v3

    const/16 v18, -0x1

    move-object/from16 v11, p2

    move/from16 v3, p3

    move-object v9, v1

    move-object v1, v2

    move/from16 v20, v14

    move/from16 p3, v15

    move-object/from16 v15, p6

    goto/16 :goto_14

    :pswitch_0
    move-object/from16 v9, p2

    move-object/from16 v11, p6

    move v10, v3

    const/16 v18, -0x1

    move/from16 v3, p3

    if-nez v7, :cond_9

    or-int v14, v14, v21

    .line 15
    invoke-static {v9, v3, v11}, Lm54;->O([BILv44;)I

    move-result v7

    iget-wide v3, v11, Lv44;->b:J

    .line 16
    invoke-static {v3, v4}, Lm0;->i(J)J

    move-result-wide v5

    move-wide/from16 v3, v26

    .line 17
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object/from16 v32, v2

    move-object v2, v1

    move-object/from16 v1, v32

    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move/from16 v5, p4

    move v4, v7

    goto :goto_7

    :cond_9
    move-object/from16 v32, v2

    move-object v2, v1

    move-object/from16 v1, v32

    :cond_a
    move/from16 v20, v14

    move/from16 p3, v15

    move-object v15, v11

    move-object v11, v9

    move-object v9, v2

    goto/16 :goto_14

    :pswitch_1
    move-object v5, v2

    move-object v2, v1

    move-object v1, v5

    move-object/from16 v9, p2

    move-object/from16 v11, p6

    move v10, v3

    move-wide/from16 v5, v26

    const/16 v18, -0x1

    move/from16 v3, p3

    if-nez v7, :cond_a

    or-int v14, v14, v21

    .line 18
    invoke-static {v9, v3, v11}, Lm54;->C([BILv44;)I

    move-result v4

    iget v3, v11, Lv44;->a:I

    .line 19
    invoke-static {v3}, Lm0;->h(I)I

    move-result v3

    .line 20
    invoke-virtual {v2, v1, v5, v6, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_9
    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    goto :goto_6

    :pswitch_2
    move-object v5, v2

    move-object v2, v1

    move-object v1, v5

    move-object/from16 v9, p2

    move-object/from16 v11, p6

    move v10, v3

    move-wide/from16 v5, v26

    const/16 v18, -0x1

    move/from16 v3, p3

    if-nez v7, :cond_a

    .line 21
    invoke-static {v9, v3, v11}, Lm54;->C([BILv44;)I

    move-result v3

    iget v7, v11, Lv44;->a:I

    .line 22
    invoke-virtual {v0, v10}, Lk64;->F(I)Ls54;

    move-result-object v13

    const/high16 v17, -0x80000000

    and-int v4, v4, v17

    if-eqz v4, :cond_d

    if-eqz v13, :cond_d

    .line 23
    invoke-interface {v13, v7}, Ls54;->a(I)Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_b

    .line 24
    :cond_b
    move-object v4, v1

    check-cast v4, Lp54;

    iget-object v5, v4, Lp54;->zzt:Lb74;

    if-ne v5, v8, :cond_c

    invoke-static {}, Lb74;->a()Lb74;

    move-result-object v5

    .line 25
    iput-object v5, v4, Lp54;->zzt:Lb74;

    :cond_c
    int-to-long v6, v7

    .line 26
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v5, v15, v4}, Lb74;->d(ILjava/lang/Object;)V

    :goto_a
    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    move/from16 v5, p4

    move v4, v3

    goto/16 :goto_7

    :cond_d
    :goto_b
    or-int v14, v14, v21

    .line 27
    invoke-virtual {v2, v1, v5, v6, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_a

    :pswitch_3
    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    move-object/from16 v9, p2

    move-object/from16 v11, p6

    move v10, v3

    move-wide/from16 v5, v26

    const/4 v4, 0x2

    const/16 v18, -0x1

    move/from16 v3, p3

    if-ne v7, v4, :cond_a

    or-int v14, v14, v21

    .line 28
    invoke-static {v9, v3, v11}, Lm54;->a0([BILv44;)I

    move-result v4

    iget-object v3, v11, Lv44;->c:Ljava/lang/Object;

    .line 29
    invoke-virtual {v2, v1, v5, v6, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_9

    :pswitch_4
    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    move-object/from16 v9, p2

    move-object/from16 v11, p6

    move v10, v3

    const/4 v4, 0x2

    const/16 v18, -0x1

    move/from16 v3, p3

    if-ne v7, v4, :cond_e

    or-int v14, v14, v21

    move-object v4, v1

    .line 30
    invoke-virtual {v0, v10, v4}, Lk64;->G(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v2

    .line 31
    invoke-virtual {v0, v10}, Lk64;->D(I)Lv64;

    move-result-object v2

    move-object v6, v4

    move v4, v3

    move-object v3, v9

    move-object v9, v6

    move-object v6, v11

    move-object v11, v5

    move/from16 v5, p4

    .line 32
    invoke-static/range {v1 .. v6}, Lm54;->b0(Ljava/lang/Object;Lv64;[BIILv44;)I

    move-result v4

    move-object v2, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v6

    .line 33
    invoke-virtual {v0, v10, v9, v3}, Lk64;->H(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object v3, v1

    move-object v2, v9

    move v8, v10

    move-object v1, v11

    goto/16 :goto_8

    :cond_e
    move-object/from16 v32, v9

    move-object v9, v1

    move-object/from16 v1, v32

    move-object/from16 v32, v11

    move-object v11, v2

    move-object/from16 v2, v32

    move-object/from16 p3, v11

    move-object v11, v1

    move-object v1, v9

    move-object/from16 v9, p3

    move/from16 v20, v14

    move/from16 p3, v15

    :goto_c
    move-object v15, v2

    goto/16 :goto_14

    :pswitch_5
    move-object v11, v1

    move-object v9, v2

    move v10, v3

    move/from16 v20, v14

    const/4 v5, 0x2

    const/16 v18, -0x1

    move-object/from16 v1, p2

    move/from16 v3, p3

    move-object/from16 v2, p6

    move/from16 p3, v15

    move-wide/from16 v14, v26

    if-ne v7, v5, :cond_12

    or-int v5, v20, v21

    and-int v4, v4, v22

    if-eqz v4, :cond_f

    .line 34
    invoke-static {v1, v3, v2}, Lm54;->Y([BILv44;)I

    move-result v3

    :goto_d
    move v4, v3

    goto :goto_e

    .line 35
    :cond_f
    invoke-static {v1, v3, v2}, Lm54;->C([BILv44;)I

    move-result v3

    iget v4, v2, Lv44;->a:I

    if-ltz v4, :cond_11

    if-nez v4, :cond_10

    .line 36
    iput-object v6, v2, Lv44;->c:Ljava/lang/Object;

    goto :goto_d

    :cond_10
    new-instance v6, Ljava/lang/String;

    .line 37
    sget-object v7, Ly54;->a:Ljava/nio/charset/Charset;

    invoke-direct {v6, v1, v3, v4, v7}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v6, v2, Lv44;->c:Ljava/lang/Object;

    add-int/2addr v3, v4

    goto :goto_d

    .line 38
    :goto_e
    iget-object v3, v2, Lv44;->c:Ljava/lang/Object;

    .line 39
    invoke-virtual {v11, v9, v14, v15, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_f
    move/from16 v15, p3

    move-object v3, v1

    move-object v6, v2

    move v14, v5

    move-object v2, v9

    move v8, v10

    move-object v1, v11

    move v9, v12

    move/from16 v7, v19

    const v16, 0xfffff

    move/from16 v5, p4

    goto/16 :goto_1

    .line 40
    :cond_11
    new-instance v1, La64;

    move-object/from16 v2, v25

    .line 41
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 42
    throw v1

    :cond_12
    move-object v15, v11

    move-object v11, v1

    move-object v1, v9

    move-object v9, v15

    goto :goto_c

    :pswitch_6
    move-object v11, v1

    move-object v9, v2

    move v10, v3

    move/from16 v20, v14

    const/16 v18, -0x1

    move-object/from16 v1, p2

    move/from16 v3, p3

    move-object/from16 v2, p6

    move/from16 p3, v15

    move-wide/from16 v14, v26

    if-nez v7, :cond_12

    or-int v4, v20, v21

    .line 43
    invoke-static {v1, v3, v2}, Lm54;->O([BILv44;)I

    move-result v3

    iget-wide v5, v2, Lv44;->b:J

    cmp-long v5, v5, v23

    if-eqz v5, :cond_13

    move/from16 v5, v28

    goto :goto_10

    :cond_13
    const/4 v5, 0x0

    .line 44
    :goto_10
    sget-object v6, Lg74;->c:Lf74;

    invoke-virtual {v6, v9, v14, v15, v5}, Lf74;->v1(Ljava/lang/Object;JZ)V

    move/from16 v15, p3

    move/from16 v5, p4

    move-object v6, v2

    move v14, v4

    move-object v2, v9

    move v8, v10

    move v9, v12

    move/from16 v7, v19

    const v16, 0xfffff

    move v4, v3

    move-object v3, v1

    :goto_11
    move-object v1, v11

    goto/16 :goto_1

    :pswitch_7
    move-object v11, v1

    move-object v9, v2

    move v10, v3

    move/from16 v20, v14

    const/4 v4, 0x5

    const/16 v18, -0x1

    move-object/from16 v1, p2

    move/from16 v3, p3

    move-object/from16 v2, p6

    move/from16 p3, v15

    move-wide/from16 v14, v26

    if-ne v7, v4, :cond_12

    add-int/lit8 v4, v3, 0x4

    or-int v5, v20, v21

    .line 45
    invoke-static {v3, v1}, Lm54;->Q(I[B)I

    move-result v3

    invoke-virtual {v11, v9, v14, v15, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_f

    :pswitch_8
    move-object v11, v1

    move-object v9, v2

    move v10, v3

    move/from16 v20, v14

    move/from16 v4, v28

    const/16 v18, -0x1

    move-object/from16 v1, p2

    move/from16 v3, p3

    move-object/from16 v2, p6

    move/from16 p3, v15

    move-wide/from16 v14, v26

    if-ne v7, v4, :cond_14

    add-int/lit8 v7, v3, 0x8

    or-int v8, v20, v21

    .line 46
    invoke-static {v3, v1}, Lm54;->W(I[B)J

    move-result-wide v5

    move-object v3, v11

    move-object v11, v1

    move-object v1, v3

    move-wide v3, v14

    move-object v15, v2

    move-object v2, v9

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move/from16 v5, p4

    move v4, v7

    move v14, v8

    :goto_12
    move v8, v10

    move-object v3, v11

    move v9, v12

    move-object v6, v15

    move/from16 v7, v19

    const v16, 0xfffff

    move/from16 v15, p3

    goto/16 :goto_1

    :cond_14
    move-object v15, v11

    move-object v11, v1

    move-object v1, v15

    move-object v15, v2

    move-object/from16 v32, v9

    move-object v9, v1

    move-object/from16 v1, v32

    goto/16 :goto_14

    :pswitch_9
    move-object/from16 v11, p2

    move v10, v3

    move/from16 v20, v14

    move-wide/from16 v5, v26

    const/16 v18, -0x1

    move/from16 v3, p3

    move/from16 p3, v15

    move-object/from16 v15, p6

    if-nez v7, :cond_15

    or-int v14, v20, v21

    .line 47
    invoke-static {v11, v3, v15}, Lm54;->C([BILv44;)I

    move-result v4

    iget v3, v15, Lv44;->a:I

    .line 48
    invoke-virtual {v1, v2, v5, v6, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move/from16 v5, p4

    goto :goto_12

    :cond_15
    move-object v9, v1

    :cond_16
    move-object v1, v2

    goto/16 :goto_14

    :pswitch_a
    move-object/from16 v11, p2

    move v10, v3

    move/from16 v20, v14

    move-wide/from16 v5, v26

    const/16 v18, -0x1

    move/from16 v3, p3

    move/from16 p3, v15

    move-object/from16 v15, p6

    if-nez v7, :cond_15

    or-int v14, v20, v21

    .line 49
    invoke-static {v11, v3, v15}, Lm54;->O([BILv44;)I

    move-result v7

    move-wide v3, v5

    iget-wide v5, v15, Lv44;->b:J

    .line 50
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move/from16 v5, p4

    move v4, v7

    goto :goto_12

    :pswitch_b
    move-object/from16 v11, p2

    move-object v9, v1

    move v10, v3

    move/from16 v20, v14

    move-wide/from16 v5, v26

    const/4 v4, 0x5

    const/16 v18, -0x1

    move/from16 v3, p3

    move/from16 p3, v15

    move-object/from16 v15, p6

    if-ne v7, v4, :cond_16

    add-int/lit8 v4, v3, 0x4

    or-int v14, v20, v21

    .line 51
    invoke-static {v3, v11}, Lm54;->Q(I[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 52
    sget-object v3, Lg74;->c:Lf74;

    invoke-virtual {v3, v2, v5, v6, v1}, Lf74;->x1(Ljava/lang/Object;JF)V

    move/from16 v5, p4

    :goto_13
    move-object v1, v9

    goto/16 :goto_12

    :pswitch_c
    move-object/from16 v11, p2

    move-object v9, v1

    move v10, v3

    move/from16 v20, v14

    move-wide/from16 v5, v26

    move/from16 v4, v28

    const/16 v18, -0x1

    move/from16 v3, p3

    move/from16 p3, v15

    move-object/from16 v15, p6

    if-ne v7, v4, :cond_16

    add-int/lit8 v7, v3, 0x8

    or-int v14, v20, v21

    .line 53
    invoke-static {v3, v11}, Lm54;->W(I[B)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    .line 54
    sget-object v1, Lg74;->c:Lf74;

    move-wide/from16 v32, v5

    move-wide v5, v3

    move-wide/from16 v3, v32

    invoke-virtual/range {v1 .. v6}, Lf74;->z1(Ljava/lang/Object;JD)V

    move/from16 v5, p4

    move v4, v7

    goto :goto_13

    :goto_14
    move/from16 v7, p5

    move-object v4, v11

    move/from16 v27, v12

    move-object/from16 v26, v13

    move/from16 v12, v19

    move/from16 v14, v20

    move/from16 v13, p3

    move-object v11, v9

    move/from16 v19, v10

    move-object v10, v15

    move-object v9, v1

    goto/16 :goto_49

    :cond_17
    move-object v12, v1

    move-object v1, v2

    move v10, v3

    move-object v2, v11

    move/from16 v25, v14

    const/16 v18, -0x1

    move-object/from16 v11, p2

    move-wide/from16 v32, v26

    move/from16 v26, p3

    move/from16 p3, v15

    move-wide/from16 v14, v32

    const/16 v3, 0x1b

    move/from16 v27, v9

    if-ne v5, v3, :cond_1b

    const/4 v3, 0x2

    if-ne v7, v3, :cond_1a

    .line 55
    invoke-virtual {v12, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx54;

    .line 56
    move-object v3, v2

    check-cast v3, Lt44;

    .line 57
    iget-boolean v3, v3, Lt44;->f:Z

    if-nez v3, :cond_19

    .line 58
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_18

    const/16 v9, 0xa

    goto :goto_15

    :cond_18
    add-int v9, v3, v3

    .line 59
    :goto_15
    invoke-interface {v2, v9}, Lx54;->z(I)Lx54;

    move-result-object v2

    .line 60
    invoke-virtual {v12, v1, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_19
    move-object v6, v2

    .line 61
    invoke-virtual {v0, v10}, Lk64;->D(I)Lv64;

    move-result-object v1

    move/from16 v2, p3

    move/from16 v5, p4

    move-object/from16 v7, p6

    move-object v3, v11

    move/from16 v4, v26

    move-object/from16 v11, p1

    .line 62
    invoke-static/range {v1 .. v7}, Lm54;->f0(Lv64;I[BIILx54;Lv44;)I

    move-result v4

    move v1, v2

    move-object/from16 v3, p2

    move-object/from16 v6, p6

    move v15, v1

    move v8, v10

    move-object v2, v11

    move-object v1, v12

    move/from16 v7, v19

    move/from16 v14, v25

    move/from16 v9, v27

    goto/16 :goto_0

    :cond_1a
    move-object v11, v1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v5, p6

    move-object/from16 v31, v8

    move-object v9, v11

    move-object v7, v12

    move-object v8, v13

    move/from16 v12, v26

    move/from16 v13, p3

    goto/16 :goto_3c

    :cond_1b
    move-object v11, v1

    move/from16 v3, v26

    move/from16 v1, p3

    const/16 v9, 0x31

    move/from16 v26, v1

    const-string v1, "Protocol message had invalid UTF-8."

    move/from16 v30, v3

    const-string v3, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    if-gt v5, v9, :cond_67

    move-object/from16 v31, v8

    int-to-long v8, v4

    .line 63
    invoke-virtual {v12, v11, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx54;

    move-wide/from16 v21, v8

    .line 64
    move-object v8, v4

    check-cast v8, Lt44;

    .line 65
    iget-boolean v8, v8, Lt44;->f:Z

    if-nez v8, :cond_1c

    .line 66
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    add-int/2addr v8, v8

    .line 67
    invoke-interface {v4, v8}, Lx54;->z(I)Lx54;

    move-result-object v4

    .line 68
    invoke-virtual {v12, v11, v14, v15, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1c
    move-object v8, v4

    packed-switch v5, :pswitch_data_1

    const/4 v5, 0x3

    if-ne v7, v5, :cond_1e

    and-int/lit8 v1, v26, -0x8

    or-int/lit8 v6, v1, 0x4

    .line 69
    invoke-virtual {v0, v10}, Lk64;->D(I)Lv64;

    move-result-object v2

    .line 70
    invoke-interface {v2}, Lv64;->a()Lp54;

    move-result-object v1

    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v7, p6

    move/from16 v9, v26

    move/from16 v4, v30

    .line 71
    invoke-static/range {v1 .. v7}, Lm54;->c0(Ljava/lang/Object;Lv64;[BIIILv44;)I

    move-result v14

    move v15, v4

    move-object v4, v1

    move v1, v6

    move-object v6, v7

    .line 72
    invoke-interface {v2, v4}, Lv64;->h(Ljava/lang/Object;)V

    iput-object v4, v6, Lv44;->c:Ljava/lang/Object;

    .line 73
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_16
    if-ge v14, v5, :cond_1d

    .line 74
    invoke-static {v3, v14, v6}, Lm54;->C([BILv44;)I

    move-result v4

    iget v7, v6, Lv44;->a:I

    if-ne v9, v7, :cond_1d

    move v6, v1

    .line 75
    invoke-interface {v2}, Lv64;->a()Lp54;

    move-result-object v1

    move-object/from16 v7, p6

    .line 76
    invoke-static/range {v1 .. v7}, Lm54;->c0(Ljava/lang/Object;Lv64;[BIIILv44;)I

    move-result v14

    move-object v4, v1

    move-object v1, v3

    move-object v3, v2

    move v2, v6

    move-object v6, v7

    .line 77
    invoke-interface {v3, v4}, Lv64;->h(Ljava/lang/Object;)V

    iput-object v4, v6, Lv44;->c:Ljava/lang/Object;

    .line 78
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v32, v3

    move-object v3, v1

    move v1, v2

    move-object/from16 v2, v32

    goto :goto_16

    :cond_1d
    move-object v1, v3

    move-object v2, v1

    move v8, v5

    move-object v11, v6

    move-object/from16 v26, v13

    move v4, v14

    move v13, v9

    move-object v9, v12

    move v12, v15

    goto/16 :goto_36

    :cond_1e
    move/from16 v2, v26

    move-object/from16 v26, v13

    move v13, v2

    move-object/from16 v2, p2

    move/from16 v8, p4

    move-object/from16 v11, p6

    move-object v9, v12

    move/from16 v12, v30

    goto/16 :goto_35

    :pswitch_d
    move-object/from16 v1, p2

    move/from16 v5, p4

    move-object/from16 v6, p6

    move/from16 v9, v26

    move/from16 v15, v30

    const/4 v4, 0x2

    if-ne v7, v4, :cond_22

    .line 79
    check-cast v8, Le64;

    .line 80
    invoke-static {v1, v15, v6}, Lm54;->C([BILv44;)I

    move-result v2

    iget v4, v6, Lv44;->a:I

    add-int/2addr v4, v2

    :goto_17
    if-ge v2, v4, :cond_1f

    .line 81
    invoke-static {v1, v2, v6}, Lm54;->O([BILv44;)I

    move-result v2

    move-object/from16 v26, v13

    iget-wide v13, v6, Lv44;->b:J

    .line 82
    invoke-static {v13, v14}, Lm0;->i(J)J

    move-result-wide v13

    invoke-virtual {v8, v13, v14}, Le64;->c(J)V

    move-object/from16 v13, v26

    goto :goto_17

    :cond_1f
    move-object/from16 v26, v13

    if-ne v2, v4, :cond_21

    :cond_20
    :goto_18
    move v4, v2

    move v8, v5

    move-object v11, v6

    move v13, v9

    move-object v9, v12

    move v12, v15

    move-object v2, v1

    goto/16 :goto_36

    .line 83
    :cond_21
    new-instance v1, La64;

    .line 84
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 85
    throw v1

    :cond_22
    move-object/from16 v26, v13

    if-nez v7, :cond_23

    .line 86
    check-cast v8, Le64;

    .line 87
    invoke-static {v1, v15, v6}, Lm54;->O([BILv44;)I

    move-result v2

    iget-wide v3, v6, Lv44;->b:J

    .line 88
    invoke-static {v3, v4}, Lm0;->i(J)J

    move-result-wide v3

    invoke-virtual {v8, v3, v4}, Le64;->c(J)V

    :goto_19
    if-ge v2, v5, :cond_20

    .line 89
    invoke-static {v1, v2, v6}, Lm54;->C([BILv44;)I

    move-result v3

    iget v4, v6, Lv44;->a:I

    if-ne v9, v4, :cond_20

    .line 90
    invoke-static {v1, v3, v6}, Lm54;->O([BILv44;)I

    move-result v2

    iget-wide v3, v6, Lv44;->b:J

    invoke-static {v3, v4}, Lm0;->i(J)J

    move-result-wide v3

    .line 91
    invoke-virtual {v8, v3, v4}, Le64;->c(J)V

    goto :goto_19

    :cond_23
    move-object v2, v1

    move v8, v5

    move-object v11, v6

    move v13, v9

    :goto_1a
    move-object v9, v12

    move v12, v15

    goto/16 :goto_35

    :pswitch_e
    move-object/from16 v1, p2

    move/from16 v5, p4

    move-object/from16 v6, p6

    move/from16 v9, v26

    move/from16 v15, v30

    const/4 v4, 0x2

    move-object/from16 v26, v13

    if-ne v7, v4, :cond_26

    .line 92
    check-cast v8, Lq54;

    .line 93
    invoke-static {v1, v15, v6}, Lm54;->C([BILv44;)I

    move-result v2

    iget v4, v6, Lv44;->a:I

    add-int/2addr v4, v2

    :goto_1b
    if-ge v2, v4, :cond_24

    .line 94
    invoke-static {v1, v2, v6}, Lm54;->C([BILv44;)I

    move-result v2

    iget v7, v6, Lv44;->a:I

    .line 95
    invoke-static {v7}, Lm0;->h(I)I

    move-result v7

    invoke-virtual {v8, v7}, Lq54;->d(I)V

    goto :goto_1b

    :cond_24
    if-ne v2, v4, :cond_25

    goto :goto_18

    .line 96
    :cond_25
    new-instance v1, La64;

    .line 97
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 98
    throw v1

    :cond_26
    if-nez v7, :cond_23

    .line 99
    check-cast v8, Lq54;

    .line 100
    invoke-static {v1, v15, v6}, Lm54;->C([BILv44;)I

    move-result v2

    iget v3, v6, Lv44;->a:I

    .line 101
    invoke-static {v3}, Lm0;->h(I)I

    move-result v3

    invoke-virtual {v8, v3}, Lq54;->d(I)V

    :goto_1c
    if-ge v2, v5, :cond_20

    .line 102
    invoke-static {v1, v2, v6}, Lm54;->C([BILv44;)I

    move-result v3

    iget v4, v6, Lv44;->a:I

    if-ne v9, v4, :cond_20

    .line 103
    invoke-static {v1, v3, v6}, Lm54;->C([BILv44;)I

    move-result v2

    iget v3, v6, Lv44;->a:I

    invoke-static {v3}, Lm0;->h(I)I

    move-result v3

    .line 104
    invoke-virtual {v8, v3}, Lq54;->d(I)V

    goto :goto_1c

    :pswitch_f
    move-object/from16 v1, p2

    move/from16 v5, p4

    move-object/from16 v6, p6

    move/from16 v9, v26

    move/from16 v15, v30

    const/4 v4, 0x2

    move-object/from16 v26, v13

    if-ne v7, v4, :cond_27

    .line 105
    invoke-static {v1, v15, v8, v6}, Lm54;->e0([BILx54;Lv44;)I

    move-result v2

    move-object v7, v8

    move v8, v5

    move-object v5, v7

    move v7, v2

    move v13, v9

    move v14, v15

    move-object v9, v1

    :goto_1d
    move-object v15, v6

    goto :goto_1e

    :cond_27
    if-nez v7, :cond_28

    move-object v2, v1

    move v4, v5

    move-object v5, v8

    move v1, v9

    move v3, v15

    .line 106
    invoke-static/range {v1 .. v6}, Lm54;->d0(I[BIILx54;Lv44;)I

    move-result v7

    move v13, v1

    move-object v9, v2

    move v14, v3

    move v8, v4

    goto :goto_1d

    .line 107
    :goto_1e
    invoke-virtual {v0, v10}, Lk64;->F(I)Ls54;

    move-result-object v4

    move-object v3, v5

    const/4 v5, 0x0

    iget-object v6, v0, Lk64;->j:Lpz;

    move-object v1, v11

    move/from16 v2, v19

    .line 108
    invoke-static/range {v1 .. v6}, Lw64;->e(Ljava/lang/Object;ILx54;Ls54;Ljava/lang/Object;Lpz;)Ljava/lang/Object;

    move v4, v7

    move-object v2, v9

    :goto_1f
    move-object v9, v12

    :goto_20
    move v12, v14

    move-object v11, v15

    goto/16 :goto_36

    :cond_28
    move v13, v9

    move-object v2, v1

    move v8, v5

    move-object v11, v6

    goto/16 :goto_1a

    :pswitch_10
    move/from16 v4, v26

    move-object/from16 v26, v13

    move v13, v4

    move-object/from16 v9, p2

    move-object/from16 v15, p6

    move-object v5, v8

    move/from16 v11, v19

    move/from16 v14, v30

    const/4 v4, 0x2

    move/from16 v8, p4

    if-ne v7, v4, :cond_30

    .line 109
    invoke-static {v9, v14, v15}, Lm54;->C([BILv44;)I

    move-result v1

    iget v4, v15, Lv44;->a:I

    if-ltz v4, :cond_2f

    .line 110
    array-length v6, v9

    sub-int/2addr v6, v1

    if-gt v4, v6, :cond_2e

    if-nez v4, :cond_29

    .line 111
    sget-object v4, La54;->g:Ly44;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_22

    .line 112
    :cond_29
    invoke-static {v9, v1, v4}, La54;->n([BII)Ly44;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_21
    add-int/2addr v1, v4

    :goto_22
    if-ge v1, v8, :cond_2d

    .line 113
    invoke-static {v9, v1, v15}, Lm54;->C([BILv44;)I

    move-result v4

    iget v6, v15, Lv44;->a:I

    if-ne v13, v6, :cond_2d

    .line 114
    invoke-static {v9, v4, v15}, Lm54;->C([BILv44;)I

    move-result v1

    iget v4, v15, Lv44;->a:I

    if-ltz v4, :cond_2c

    .line 115
    array-length v6, v9

    sub-int/2addr v6, v1

    if-gt v4, v6, :cond_2b

    if-nez v4, :cond_2a

    .line 116
    sget-object v4, La54;->g:Ly44;

    .line 117
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_22

    .line 118
    :cond_2a
    invoke-static {v9, v1, v4}, La54;->n([BII)Ly44;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_21

    .line 119
    :cond_2b
    new-instance v1, La64;

    .line 120
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 121
    throw v1

    .line 122
    :cond_2c
    new-instance v1, La64;

    .line 123
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 124
    throw v1

    :cond_2d
    move v4, v1

    move-object v2, v9

    move/from16 v19, v11

    goto :goto_1f

    .line 125
    :cond_2e
    new-instance v1, La64;

    .line 126
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 127
    throw v1

    .line 128
    :cond_2f
    new-instance v1, La64;

    .line 129
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 130
    throw v1

    :cond_30
    move-object v2, v9

    move/from16 v19, v11

    :goto_23
    move-object v9, v12

    :goto_24
    move v12, v14

    move-object v11, v15

    goto/16 :goto_35

    :pswitch_11
    move/from16 v4, v26

    move-object/from16 v26, v13

    move v13, v4

    move-object/from16 v9, p2

    move-object/from16 v15, p6

    move-object v5, v8

    move/from16 v11, v19

    move/from16 v14, v30

    const/4 v4, 0x2

    move/from16 v8, p4

    if-ne v7, v4, :cond_30

    .line 131
    invoke-virtual {v0, v10}, Lk64;->D(I)Lv64;

    move-result-object v1

    move-object v6, v5

    move v5, v8

    move-object v3, v9

    move v2, v13

    move v4, v14

    move-object v7, v15

    .line 132
    invoke-static/range {v1 .. v7}, Lm54;->f0(Lv64;I[BIILx54;Lv44;)I

    move-result v1

    move-object v2, v3

    move/from16 v19, v11

    move-object v9, v12

    move v12, v4

    move-object v11, v7

    move v4, v1

    goto/16 :goto_36

    :pswitch_12
    move/from16 v3, v26

    move-object/from16 v26, v13

    move v13, v3

    move-object/from16 v5, p2

    move-object/from16 v15, p6

    move-object v3, v8

    move/from16 v11, v19

    move/from16 v14, v30

    const/4 v4, 0x2

    move/from16 v8, p4

    if-ne v7, v4, :cond_3e

    const-wide/32 v28, 0x20000000

    and-long v20, v21, v28

    cmp-long v4, v20, v23

    if-nez v4, :cond_37

    .line 133
    invoke-static {v5, v14, v15}, Lm54;->C([BILv44;)I

    move-result v1

    iget v4, v15, Lv44;->a:I

    if-ltz v4, :cond_36

    if-nez v4, :cond_31

    .line 134
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v19, v11

    goto :goto_26

    .line 135
    :cond_31
    new-instance v7, Ljava/lang/String;

    move/from16 v19, v11

    .line 136
    sget-object v11, Ly54;->a:Ljava/nio/charset/Charset;

    invoke-direct {v7, v5, v1, v4, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 137
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_25
    add-int/2addr v1, v4

    :goto_26
    if-ge v1, v8, :cond_34

    .line 138
    invoke-static {v5, v1, v15}, Lm54;->C([BILv44;)I

    move-result v4

    iget v7, v15, Lv44;->a:I

    if-ne v13, v7, :cond_34

    .line 139
    invoke-static {v5, v4, v15}, Lm54;->C([BILv44;)I

    move-result v1

    iget v4, v15, Lv44;->a:I

    if-ltz v4, :cond_33

    if-nez v4, :cond_32

    .line 140
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_26

    :cond_32
    new-instance v7, Ljava/lang/String;

    .line 141
    sget-object v11, Ly54;->a:Ljava/nio/charset/Charset;

    invoke-direct {v7, v5, v1, v4, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 142
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_25

    .line 143
    :cond_33
    new-instance v1, La64;

    .line 144
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 145
    throw v1

    :cond_34
    :goto_27
    move v4, v1

    :cond_35
    :goto_28
    move-object v2, v5

    goto/16 :goto_1f

    .line 146
    :cond_36
    new-instance v1, La64;

    .line 147
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 148
    throw v1

    :cond_37
    move/from16 v19, v11

    .line 149
    invoke-static {v5, v14, v15}, Lm54;->C([BILv44;)I

    move-result v4

    iget v7, v15, Lv44;->a:I

    if-ltz v7, :cond_3d

    if-nez v7, :cond_38

    .line 150
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2a

    :cond_38
    add-int v11, v4, v7

    .line 151
    invoke-static {v5, v4, v11}, Li74;->a([BII)Z

    move-result v20

    if-eqz v20, :cond_3c

    move/from16 p3, v11

    .line 152
    new-instance v11, Ljava/lang/String;

    .line 153
    sget-object v9, Ly54;->a:Ljava/nio/charset/Charset;

    invoke-direct {v11, v5, v4, v7, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 154
    invoke-interface {v3, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_29
    move/from16 v4, p3

    :goto_2a
    if-ge v4, v8, :cond_35

    .line 155
    invoke-static {v5, v4, v15}, Lm54;->C([BILv44;)I

    move-result v7

    iget v9, v15, Lv44;->a:I

    if-ne v13, v9, :cond_35

    .line 156
    invoke-static {v5, v7, v15}, Lm54;->C([BILv44;)I

    move-result v4

    iget v7, v15, Lv44;->a:I

    if-ltz v7, :cond_3b

    if-nez v7, :cond_39

    .line 157
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2a

    :cond_39
    add-int v9, v4, v7

    .line 158
    invoke-static {v5, v4, v9}, Li74;->a([BII)Z

    move-result v11

    if-eqz v11, :cond_3a

    .line 159
    new-instance v11, Ljava/lang/String;

    move/from16 p3, v9

    .line 160
    sget-object v9, Ly54;->a:Ljava/nio/charset/Charset;

    invoke-direct {v11, v5, v4, v7, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 161
    invoke-interface {v3, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_29

    .line 162
    :cond_3a
    new-instance v2, La64;

    .line 163
    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 164
    throw v2

    .line 165
    :cond_3b
    new-instance v1, La64;

    .line 166
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 167
    throw v1

    .line 168
    :cond_3c
    new-instance v2, La64;

    .line 169
    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 170
    throw v2

    .line 171
    :cond_3d
    new-instance v1, La64;

    .line 172
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 173
    throw v1

    :cond_3e
    move/from16 v19, v11

    :cond_3f
    :goto_2b
    move-object v2, v5

    goto/16 :goto_23

    :pswitch_13
    move/from16 v4, v26

    move-object/from16 v26, v13

    move v13, v4

    move-object/from16 v5, p2

    move-object/from16 v15, p6

    move-object v6, v8

    move/from16 v14, v30

    const/4 v4, 0x2

    move/from16 v8, p4

    if-ne v7, v4, :cond_43

    if-nez v6, :cond_42

    .line 174
    invoke-static {v5, v14, v15}, Lm54;->C([BILv44;)I

    move-result v1

    iget v2, v15, Lv44;->a:I

    add-int/2addr v2, v1

    if-lt v1, v2, :cond_41

    if-ne v1, v2, :cond_40

    goto/16 :goto_27

    .line 175
    :cond_40
    new-instance v1, La64;

    .line 176
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 177
    throw v1

    .line 178
    :cond_41
    invoke-static {v5, v1, v15}, Lm54;->O([BILv44;)I

    .line 179
    throw v17

    .line 180
    :cond_42
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_43
    if-eqz v7, :cond_44

    goto :goto_2b

    :cond_44
    if-nez v6, :cond_45

    .line 181
    invoke-static {v5, v14, v15}, Lm54;->O([BILv44;)I

    .line 182
    throw v17

    .line 183
    :cond_45
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :pswitch_14
    move/from16 v4, v26

    move-object/from16 v26, v13

    move v13, v4

    move-object/from16 v5, p2

    move-object/from16 v15, p6

    move-object v6, v8

    move/from16 v14, v30

    const/4 v4, 0x2

    move/from16 v8, p4

    if-ne v7, v4, :cond_4c

    .line 184
    move-object v1, v6

    check-cast v1, Lq54;

    .line 185
    invoke-static {v5, v14, v15}, Lm54;->C([BILv44;)I

    move-result v2

    iget v4, v15, Lv44;->a:I

    add-int v6, v2, v4

    .line 186
    array-length v7, v5

    if-gt v6, v7, :cond_4b

    .line 187
    iget v7, v1, Lq54;->h:I

    .line 188
    div-int/lit8 v4, v4, 0x4

    add-int/2addr v4, v7

    .line 189
    iget-object v7, v1, Lq54;->g:[I

    array-length v7, v7

    if-gt v4, v7, :cond_46

    goto :goto_2d

    :cond_46
    if-eqz v7, :cond_48

    :goto_2c
    if-ge v7, v4, :cond_47

    mul-int/lit8 v7, v7, 0x3

    const/16 v29, 0x2

    .line 190
    div-int/lit8 v7, v7, 0x2

    const/16 v28, 0x1

    add-int/lit8 v7, v7, 0x1

    const/16 v9, 0xa

    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v7

    goto :goto_2c

    .line 191
    :cond_47
    iget-object v4, v1, Lq54;->g:[I

    .line 192
    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v4

    iput-object v4, v1, Lq54;->g:[I

    goto :goto_2d

    :cond_48
    const/16 v9, 0xa

    .line 193
    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    move-result v4

    new-array v4, v4, [I

    iput-object v4, v1, Lq54;->g:[I

    :goto_2d
    if-ge v2, v6, :cond_49

    .line 194
    invoke-static {v2, v5}, Lm54;->Q(I[B)I

    move-result v4

    invoke-virtual {v1, v4}, Lq54;->d(I)V

    add-int/lit8 v2, v2, 0x4

    goto :goto_2d

    :cond_49
    if-ne v2, v6, :cond_4a

    move v4, v2

    goto/16 :goto_28

    .line 195
    :cond_4a
    new-instance v1, La64;

    .line 196
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 197
    throw v1

    .line 198
    :cond_4b
    new-instance v1, La64;

    .line 199
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 200
    throw v1

    :cond_4c
    const/4 v4, 0x5

    if-ne v7, v4, :cond_3f

    add-int/lit8 v4, v14, 0x4

    .line 201
    move-object v1, v6

    check-cast v1, Lq54;

    .line 202
    invoke-static {v14, v5}, Lm54;->Q(I[B)I

    move-result v2

    invoke-virtual {v1, v2}, Lq54;->d(I)V

    :goto_2e
    if-ge v4, v8, :cond_35

    .line 203
    invoke-static {v5, v4, v15}, Lm54;->C([BILv44;)I

    move-result v2

    iget v3, v15, Lv44;->a:I

    if-ne v13, v3, :cond_35

    .line 204
    invoke-static {v2, v5}, Lm54;->Q(I[B)I

    move-result v3

    invoke-virtual {v1, v3}, Lq54;->d(I)V

    add-int/lit8 v4, v2, 0x4

    goto :goto_2e

    :pswitch_15
    move/from16 v4, v26

    move-object/from16 v26, v13

    move v13, v4

    move-object/from16 v5, p2

    move-object/from16 v15, p6

    move-object v6, v8

    move/from16 v14, v30

    const/4 v4, 0x2

    move/from16 v8, p4

    if-ne v7, v4, :cond_54

    .line 205
    move-object v1, v6

    check-cast v1, Le64;

    .line 206
    invoke-static {v5, v14, v15}, Lm54;->C([BILv44;)I

    move-result v2

    iget v4, v15, Lv44;->a:I

    add-int v6, v2, v4

    .line 207
    array-length v7, v5

    if-gt v6, v7, :cond_53

    .line 208
    iget v7, v1, Le64;->h:I

    .line 209
    div-int/lit8 v4, v4, 0x8

    add-int/2addr v4, v7

    .line 210
    iget-object v7, v1, Le64;->g:[J

    array-length v7, v7

    if-gt v4, v7, :cond_4d

    goto :goto_30

    :cond_4d
    if-eqz v7, :cond_4f

    :goto_2f
    if-ge v7, v4, :cond_4e

    mul-int/lit8 v7, v7, 0x3

    const/16 v29, 0x2

    .line 211
    div-int/lit8 v7, v7, 0x2

    const/16 v28, 0x1

    add-int/lit8 v7, v7, 0x1

    const/16 v9, 0xa

    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v7

    goto :goto_2f

    .line 212
    :cond_4e
    iget-object v4, v1, Le64;->g:[J

    .line 213
    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    iput-object v4, v1, Le64;->g:[J

    goto :goto_30

    :cond_4f
    const/16 v9, 0xa

    .line 214
    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    move-result v4

    new-array v4, v4, [J

    iput-object v4, v1, Le64;->g:[J

    :goto_30
    if-ge v2, v6, :cond_50

    move-object v9, v12

    .line 215
    invoke-static {v2, v5}, Lm54;->W(I[B)J

    move-result-wide v11

    invoke-virtual {v1, v11, v12}, Le64;->c(J)V

    add-int/lit8 v2, v2, 0x8

    move-object v12, v9

    goto :goto_30

    :cond_50
    move-object v9, v12

    if-ne v2, v6, :cond_52

    move v4, v2

    :cond_51
    :goto_31
    move-object v2, v5

    goto/16 :goto_20

    .line 216
    :cond_52
    new-instance v1, La64;

    .line 217
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 218
    throw v1

    .line 219
    :cond_53
    new-instance v1, La64;

    .line 220
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 221
    throw v1

    :cond_54
    move-object v9, v12

    const/4 v4, 0x1

    if-ne v7, v4, :cond_55

    add-int/lit8 v4, v14, 0x8

    .line 222
    move-object v1, v6

    check-cast v1, Le64;

    .line 223
    invoke-static {v14, v5}, Lm54;->W(I[B)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Le64;->c(J)V

    :goto_32
    if-ge v4, v8, :cond_51

    .line 224
    invoke-static {v5, v4, v15}, Lm54;->C([BILv44;)I

    move-result v2

    iget v3, v15, Lv44;->a:I

    if-ne v13, v3, :cond_51

    .line 225
    invoke-static {v2, v5}, Lm54;->W(I[B)J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Le64;->c(J)V

    add-int/lit8 v4, v2, 0x8

    goto :goto_32

    :cond_55
    move-object v2, v5

    goto/16 :goto_24

    :pswitch_16
    move/from16 v4, v26

    move-object/from16 v26, v13

    move v13, v4

    move-object/from16 v5, p2

    move-object/from16 v15, p6

    move-object v6, v8

    move-object v9, v12

    move/from16 v14, v30

    const/4 v4, 0x2

    move/from16 v8, p4

    if-ne v7, v4, :cond_56

    .line 226
    invoke-static {v5, v14, v6, v15}, Lm54;->e0([BILx54;Lv44;)I

    move-result v1

    move v4, v1

    goto :goto_31

    :cond_56
    if-nez v7, :cond_55

    move-object v2, v5

    move-object v5, v6

    move v4, v8

    move v1, v13

    move v3, v14

    move-object v6, v15

    .line 227
    invoke-static/range {v1 .. v6}, Lm54;->d0(I[BIILx54;Lv44;)I

    move-result v5

    move v12, v3

    move-object v11, v6

    move v4, v5

    goto/16 :goto_36

    :pswitch_17
    move/from16 v2, v26

    move-object/from16 v26, v13

    move v13, v2

    move-object/from16 v2, p2

    move-object/from16 v11, p6

    move-object v5, v8

    move-object v9, v12

    move/from16 v12, v30

    const/4 v4, 0x2

    move/from16 v8, p4

    if-ne v7, v4, :cond_59

    .line 228
    move-object v1, v5

    check-cast v1, Le64;

    .line 229
    invoke-static {v2, v12, v11}, Lm54;->C([BILv44;)I

    move-result v4

    iget v5, v11, Lv44;->a:I

    add-int/2addr v5, v4

    :goto_33
    if-ge v4, v5, :cond_57

    .line 230
    invoke-static {v2, v4, v11}, Lm54;->O([BILv44;)I

    move-result v4

    iget-wide v6, v11, Lv44;->b:J

    .line 231
    invoke-virtual {v1, v6, v7}, Le64;->c(J)V

    goto :goto_33

    :cond_57
    if-ne v4, v5, :cond_58

    goto/16 :goto_36

    .line 232
    :cond_58
    new-instance v1, La64;

    .line 233
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 234
    throw v1

    :cond_59
    if-nez v7, :cond_63

    .line 235
    move-object v1, v5

    check-cast v1, Le64;

    .line 236
    invoke-static {v2, v12, v11}, Lm54;->O([BILv44;)I

    move-result v3

    iget-wide v4, v11, Lv44;->b:J

    .line 237
    invoke-virtual {v1, v4, v5}, Le64;->c(J)V

    :goto_34
    if-ge v3, v8, :cond_5a

    .line 238
    invoke-static {v2, v3, v11}, Lm54;->C([BILv44;)I

    move-result v4

    iget v5, v11, Lv44;->a:I

    if-ne v13, v5, :cond_5a

    .line 239
    invoke-static {v2, v4, v11}, Lm54;->O([BILv44;)I

    move-result v3

    iget-wide v4, v11, Lv44;->b:J

    .line 240
    invoke-virtual {v1, v4, v5}, Le64;->c(J)V

    goto :goto_34

    :cond_5a
    move v4, v3

    goto/16 :goto_36

    :pswitch_18
    move/from16 v2, v26

    move-object/from16 v26, v13

    move v13, v2

    move-object/from16 v2, p2

    move-object/from16 v11, p6

    move-object v5, v8

    move-object v9, v12

    move/from16 v12, v30

    const/4 v4, 0x2

    move/from16 v8, p4

    if-ne v7, v4, :cond_5d

    if-nez v5, :cond_5c

    .line 241
    invoke-static {v2, v12, v11}, Lm54;->C([BILv44;)I

    move-result v1

    iget v4, v11, Lv44;->a:I

    add-int/2addr v1, v4

    .line 242
    array-length v2, v2

    if-le v1, v2, :cond_5b

    new-instance v1, La64;

    .line 243
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 244
    throw v1

    .line 245
    :cond_5b
    throw v17

    .line 246
    :cond_5c
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_5d
    const/4 v4, 0x5

    if-eq v7, v4, :cond_5e

    goto :goto_35

    :cond_5e
    if-nez v5, :cond_5f

    .line 247
    invoke-static {v12, v2}, Lm54;->Q(I[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 248
    throw v17

    .line 249
    :cond_5f
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :pswitch_19
    move/from16 v2, v26

    move-object/from16 v26, v13

    move v13, v2

    move-object/from16 v2, p2

    move-object/from16 v11, p6

    move-object v5, v8

    move-object v9, v12

    move/from16 v12, v30

    const/4 v4, 0x2

    move/from16 v8, p4

    if-ne v7, v4, :cond_62

    if-nez v5, :cond_61

    .line 250
    invoke-static {v2, v12, v11}, Lm54;->C([BILv44;)I

    move-result v1

    iget v4, v11, Lv44;->a:I

    add-int/2addr v1, v4

    .line 251
    array-length v2, v2

    if-le v1, v2, :cond_60

    new-instance v1, La64;

    .line 252
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 253
    throw v1

    .line 254
    :cond_60
    throw v17

    .line 255
    :cond_61
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_62
    const/4 v4, 0x1

    if-eq v7, v4, :cond_65

    :cond_63
    :goto_35
    move v4, v12

    :goto_36
    if-eq v4, v12, :cond_64

    move-object v3, v2

    move v5, v8

    move-object v1, v9

    move v8, v10

    move-object v6, v11

    move v15, v13

    move/from16 v7, v19

    move/from16 v14, v25

    move/from16 v9, v27

    const v16, 0xfffff

    move-object/from16 v2, p1

    goto/16 :goto_1

    :cond_64
    move/from16 v7, p5

    move v3, v4

    move/from16 v12, v19

    move/from16 v14, v25

    move-object/from16 v8, v31

    move-object v4, v2

    move/from16 v19, v10

    move-object v10, v11

    move-object v11, v9

    move-object/from16 v9, p1

    goto/16 :goto_49

    :cond_65
    if-nez v5, :cond_66

    .line 256
    invoke-static {v12, v2}, Lm54;->W(I[B)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 257
    throw v17

    .line 258
    :cond_66
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_67
    move/from16 p3, v26

    move-object/from16 v26, v13

    move/from16 v13, p3

    move-object/from16 v2, p2

    move-object/from16 v11, p6

    move/from16 p3, v4

    move-object/from16 v31, v8

    move-object v9, v12

    move/from16 v12, v30

    move/from16 v8, p4

    const/16 v4, 0x32

    if-ne v5, v4, :cond_73

    const/4 v4, 0x2

    if-ne v7, v4, :cond_72

    .line 259
    invoke-virtual {v0, v10}, Lk64;->E(I)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v9

    move-object/from16 v9, p1

    .line 260
    invoke-virtual {v7, v9, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    .line 261
    move-object v5, v4

    check-cast v5, Lg64;

    .line 262
    iget-boolean v5, v5, Lg64;->f:Z

    if-nez v5, :cond_68

    .line 263
    sget-object v5, Lg64;->g:Lg64;

    .line 264
    invoke-virtual {v5}, Lg64;->a()Lg64;

    move-result-object v5

    .line 265
    invoke-static {v5, v4}, Ly24;->h(Ljava/lang/Object;Ljava/lang/Object;)Lg64;

    .line 266
    invoke-virtual {v7, v9, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v4, v5

    .line 267
    :cond_68
    check-cast v1, Lf64;

    .line 268
    iget-object v14, v1, Lf64;->a:Ljr3;

    .line 269
    move-object v15, v4

    check-cast v15, Lg64;

    .line 270
    invoke-static {v2, v12, v11}, Lm54;->C([BILv44;)I

    move-result v1

    iget v4, v11, Lv44;->a:I

    if-ltz v4, :cond_71

    sub-int v5, v8, v1

    if-gt v4, v5, :cond_71

    add-int v3, v1, v4

    .line 271
    iget-object v4, v14, Ljr3;->i:Ljava/lang/Object;

    move-object v5, v4

    :goto_37
    if-ge v1, v3, :cond_6e

    move/from16 p3, v3

    add-int/lit8 v3, v1, 0x1

    .line 272
    aget-byte v1, v2, v1

    if-gez v1, :cond_69

    .line 273
    invoke-static {v1, v2, v3, v11}, Lm54;->I(I[BILv44;)I

    move-result v3

    iget v1, v11, Lv44;->a:I

    :cond_69
    ushr-int/lit8 v2, v1, 0x3

    move/from16 v20, v3

    and-int/lit8 v3, v1, 0x7

    move-object/from16 v21, v4

    const/4 v4, 0x1

    if-eq v2, v4, :cond_6d

    const/4 v4, 0x2

    if-eq v2, v4, :cond_6a

    move-object/from16 v3, p2

    move-object v2, v5

    move v4, v8

    move-object v5, v11

    move/from16 v11, p3

    move-object v8, v6

    :goto_38
    move/from16 v6, v20

    goto/16 :goto_3a

    .line 274
    :cond_6a
    iget-object v2, v14, Ljr3;->h:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Lj74;

    .line 275
    iget v2, v4, Lj74;->g:I

    if-ne v3, v2, :cond_6b

    .line 276
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    move-object/from16 v1, p2

    move v3, v8

    move/from16 v2, v20

    move-object v8, v6

    move-object v6, v11

    move/from16 v11, p3

    .line 277
    invoke-static/range {v1 .. v6}, Lk64;->x([BIILj74;Ljava/lang/Class;Lv44;)I

    move-result v2

    iget-object v5, v6, Lv44;->c:Ljava/lang/Object;

    move v1, v2

    move v3, v11

    move-object/from16 v4, v21

    move-object/from16 v2, p2

    move-object v11, v6

    move-object v6, v8

    move/from16 v8, p4

    goto :goto_37

    :cond_6b
    move-object v8, v6

    move-object v6, v11

    move/from16 v11, p3

    :cond_6c
    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object v2, v5

    move-object v5, v6

    goto :goto_38

    :cond_6d
    move-object v8, v6

    move-object v6, v11

    move/from16 v2, v20

    move/from16 v11, p3

    iget-object v4, v14, Ljr3;->g:Ljava/lang/Object;

    check-cast v4, Lj74;

    .line 278
    iget v2, v4, Lj74;->g:I

    if-ne v3, v2, :cond_6c

    move-object v2, v5

    const/4 v5, 0x0

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object v8, v2

    move/from16 v2, v20

    .line 279
    invoke-static/range {v1 .. v6}, Lk64;->x([BIILj74;Ljava/lang/Class;Lv44;)I

    move-result v2

    move v4, v3

    move-object v5, v6

    move-object v3, v1

    iget-object v6, v5, Lv44;->c:Ljava/lang/Object;

    move v1, v2

    move-object v2, v3

    move v3, v11

    move-object v11, v5

    move-object v5, v8

    :goto_39
    move v8, v4

    move-object/from16 v4, v21

    goto/16 :goto_37

    .line 280
    :goto_3a
    invoke-static {v1, v3, v6, v4, v5}, Lm54;->h0(I[BIILv44;)I

    move-result v1

    move-object v6, v5

    move-object v5, v2

    move-object v2, v3

    move v3, v11

    move-object v11, v6

    move-object v6, v8

    goto :goto_39

    :cond_6e
    move v4, v3

    move-object v3, v2

    move-object v2, v5

    move-object v5, v11

    move v11, v4

    move v4, v8

    move-object v8, v6

    if-ne v1, v11, :cond_70

    .line 281
    invoke-virtual {v15, v8, v2}, Lg64;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v11, v12, :cond_6f

    move-object v6, v5

    move-object v1, v7

    move-object v2, v9

    move v8, v10

    move v15, v13

    move/from16 v7, v19

    move/from16 v14, v25

    move/from16 v9, v27

    const v16, 0xfffff

    move v5, v4

    move v4, v11

    goto/16 :goto_1

    :cond_6f
    move-object v4, v3

    move v3, v11

    move/from16 v12, v19

    move/from16 v14, v25

    move-object/from16 v8, v31

    move-object v11, v7

    move/from16 v19, v10

    move/from16 v7, p5

    :goto_3b
    move-object v10, v5

    goto/16 :goto_49

    .line 282
    :cond_70
    new-instance v1, La64;

    move-object/from16 v8, v26

    .line 283
    invoke-direct {v1, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 284
    throw v1

    .line 285
    :cond_71
    new-instance v1, La64;

    .line 286
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 287
    throw v1

    :cond_72
    move-object v3, v2

    move v4, v8

    move-object v7, v9

    move-object v5, v11

    move-object/from16 v8, v26

    move-object/from16 v9, p1

    :goto_3c
    move-object v4, v3

    move-object v11, v7

    move-object/from16 v26, v8

    move v3, v12

    move/from16 v12, v19

    move/from16 v14, v25

    move-object/from16 v8, v31

    move/from16 v7, p5

    move/from16 v19, v10

    goto :goto_3b

    :cond_73
    move-object v3, v2

    move v4, v8

    move-object v11, v9

    move-object/from16 v8, v26

    move-object/from16 v9, p1

    add-int/lit8 v2, v10, 0x2

    .line 288
    aget v2, v21, v2

    const v16, 0xfffff

    and-int v2, v2, v16

    int-to-long v2, v2

    packed-switch v5, :pswitch_data_2

    :cond_74
    move-object/from16 v4, p2

    move-object/from16 v26, v8

    move v0, v12

    move/from16 v12, v19

    move-object/from16 v8, v31

    :goto_3d
    move/from16 v19, v10

    move-object/from16 v10, p6

    goto/16 :goto_47

    :pswitch_1a
    const/4 v5, 0x3

    if-ne v7, v5, :cond_74

    and-int/lit8 v1, v13, -0x8

    or-int/lit8 v6, v1, 0x4

    move/from16 v14, v19

    .line 289
    invoke-virtual {v0, v14, v9, v10}, Lk64;->I(ILjava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    .line 290
    invoke-virtual {v0, v10}, Lk64;->D(I)Lv64;

    move-result-object v2

    move-object/from16 v3, p2

    move-object/from16 v7, p6

    move v5, v4

    move v4, v12

    .line 291
    invoke-static/range {v1 .. v7}, Lm54;->c0(Ljava/lang/Object;Lv64;[BIIILv44;)I

    move-result v2

    move-object v6, v3

    move-object v3, v1

    move-object v1, v6

    move-object v6, v7

    .line 292
    invoke-virtual {v0, v9, v14, v3, v10}, Lk64;->J(Ljava/lang/Object;ILjava/lang/Object;I)V

    move v0, v4

    move-object/from16 v26, v8

    move/from16 v19, v10

    move v12, v14

    move-object/from16 v8, v31

    move-object v4, v1

    move v1, v2

    :goto_3e
    move-object v10, v6

    goto/16 :goto_48

    :pswitch_1b
    move-object/from16 v1, p2

    move-object/from16 v6, p6

    move v4, v12

    move/from16 v12, v19

    if-nez v7, :cond_75

    .line 293
    invoke-static {v1, v4, v6}, Lm54;->O([BILv44;)I

    move-result v5

    move-object/from16 v26, v8

    iget-wide v7, v6, Lv44;->b:J

    .line 294
    invoke-static {v7, v8}, Lm0;->i(J)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v11, v9, v14, v15, v7}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 295
    invoke-virtual {v11, v9, v2, v3, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_3f
    move v0, v4

    move/from16 v19, v10

    move-object/from16 v8, v31

    :goto_40
    move-object v4, v1

    move v1, v5

    goto :goto_3e

    :cond_75
    move-object/from16 v26, v8

    :cond_76
    move v0, v4

    move/from16 v19, v10

    move-object/from16 v8, v31

    :goto_41
    move-object v4, v1

    move-object v10, v6

    goto/16 :goto_47

    :pswitch_1c
    move-object/from16 v1, p2

    move-object/from16 v6, p6

    move-object/from16 v26, v8

    move v4, v12

    move/from16 v12, v19

    if-nez v7, :cond_76

    .line 296
    invoke-static {v1, v4, v6}, Lm54;->C([BILv44;)I

    move-result v5

    iget v7, v6, Lv44;->a:I

    .line 297
    invoke-static {v7}, Lm0;->h(I)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v11, v9, v14, v15, v7}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 298
    invoke-virtual {v11, v9, v2, v3, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_3f

    :pswitch_1d
    move-object/from16 v1, p2

    move-object/from16 v6, p6

    move-object/from16 v26, v8

    move v4, v12

    move/from16 v12, v19

    if-nez v7, :cond_7a

    .line 299
    invoke-static {v1, v4, v6}, Lm54;->C([BILv44;)I

    move-result v5

    iget v7, v6, Lv44;->a:I

    .line 300
    invoke-virtual {v0, v10}, Lk64;->F(I)Ls54;

    move-result-object v8

    if-eqz v8, :cond_77

    .line 301
    invoke-interface {v8, v7}, Ls54;->a(I)Z

    move-result v8

    if-eqz v8, :cond_78

    :cond_77
    move-object/from16 v8, v31

    goto :goto_42

    .line 302
    :cond_78
    move-object v2, v9

    check-cast v2, Lp54;

    iget-object v3, v2, Lp54;->zzt:Lb74;

    move-object/from16 v8, v31

    if-ne v3, v8, :cond_79

    invoke-static {}, Lb74;->a()Lb74;

    move-result-object v3

    .line 303
    iput-object v3, v2, Lp54;->zzt:Lb74;

    :cond_79
    int-to-long v14, v7

    .line 304
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v3, v13, v2}, Lb74;->d(ILjava/lang/Object;)V

    goto :goto_43

    .line 305
    :goto_42
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v11, v9, v14, v15, v7}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 306
    invoke-virtual {v11, v9, v2, v3, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_43
    move v0, v4

    move/from16 v19, v10

    goto :goto_40

    :cond_7a
    move-object/from16 v8, v31

    :cond_7b
    move v0, v4

    move/from16 v19, v10

    goto :goto_41

    :pswitch_1e
    move-object/from16 v1, p2

    move-object/from16 v6, p6

    move-object/from16 v26, v8

    move v4, v12

    move/from16 v12, v19

    move-object/from16 v8, v31

    const/4 v5, 0x2

    if-ne v7, v5, :cond_7b

    .line 307
    invoke-static {v1, v4, v6}, Lm54;->a0([BILv44;)I

    move-result v5

    iget-object v7, v6, Lv44;->c:Ljava/lang/Object;

    .line 308
    invoke-virtual {v11, v9, v14, v15, v7}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 309
    invoke-virtual {v11, v9, v2, v3, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_43

    :pswitch_1f
    move-object/from16 v1, p2

    move-object/from16 v6, p6

    move-object/from16 v26, v8

    move v4, v12

    move/from16 v12, v19

    move-object/from16 v8, v31

    const/4 v5, 0x2

    if-ne v7, v5, :cond_7c

    .line 310
    invoke-virtual {v0, v12, v9, v10}, Lk64;->I(ILjava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    .line 311
    invoke-virtual {v0, v10}, Lk64;->D(I)Lv64;

    move-result-object v2

    move-object/from16 v3, p2

    move/from16 v5, p4

    .line 312
    invoke-static/range {v1 .. v6}, Lm54;->b0(Ljava/lang/Object;Lv64;[BIILv44;)I

    move-result v2

    move/from16 v32, v4

    move-object v4, v3

    move/from16 v3, v32

    .line 313
    invoke-virtual {v0, v9, v12, v1, v10}, Lk64;->J(Ljava/lang/Object;ILjava/lang/Object;I)V

    move v1, v2

    move v0, v3

    move/from16 v19, v10

    move-object/from16 v10, p6

    goto/16 :goto_48

    :cond_7c
    move v3, v4

    move-object v4, v1

    move v0, v3

    goto/16 :goto_3d

    :pswitch_20
    move-object/from16 v4, p2

    move-object/from16 v26, v8

    move v0, v12

    move/from16 v12, v19

    move-object/from16 v8, v31

    const/4 v5, 0x2

    move/from16 v19, v10

    move-object/from16 v10, p6

    if-ne v7, v5, :cond_81

    .line 314
    invoke-static {v4, v0, v10}, Lm54;->C([BILv44;)I

    move-result v5

    iget v7, v10, Lv44;->a:I

    if-nez v7, :cond_7d

    .line 315
    invoke-virtual {v11, v9, v14, v15, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_45

    :cond_7d
    add-int v6, v5, v7

    and-int v20, p3, v22

    if-eqz v20, :cond_7f

    .line 316
    invoke-static {v4, v5, v6}, Li74;->a([BII)Z

    move-result v20

    if-eqz v20, :cond_7e

    goto :goto_44

    .line 317
    :cond_7e
    new-instance v0, La64;

    .line 318
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 319
    throw v0

    .line 320
    :cond_7f
    :goto_44
    new-instance v1, Ljava/lang/String;

    move/from16 p3, v6

    .line 321
    sget-object v6, Ly54;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, v4, v5, v7, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 322
    invoke-virtual {v11, v9, v14, v15, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move/from16 v5, p3

    .line 323
    :goto_45
    invoke-virtual {v11, v9, v2, v3, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v1, v5

    goto/16 :goto_48

    :pswitch_21
    move-object/from16 v4, p2

    move-object/from16 v26, v8

    move v0, v12

    move/from16 v12, v19

    move-object/from16 v8, v31

    move/from16 v19, v10

    move-object/from16 v10, p6

    if-nez v7, :cond_81

    .line 324
    invoke-static {v4, v0, v10}, Lm54;->O([BILv44;)I

    move-result v1

    iget-wide v5, v10, Lv44;->b:J

    cmp-long v5, v5, v23

    if-eqz v5, :cond_80

    const/16 v28, 0x1

    goto :goto_46

    :cond_80
    const/16 v28, 0x0

    .line 325
    :goto_46
    invoke-static/range {v28 .. v28}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v11, v9, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 326
    invoke-virtual {v11, v9, v2, v3, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_48

    :pswitch_22
    move-object/from16 v4, p2

    move-object/from16 v26, v8

    move v0, v12

    move/from16 v12, v19

    move-object/from16 v8, v31

    const/4 v1, 0x5

    move/from16 v19, v10

    move-object/from16 v10, p6

    if-ne v7, v1, :cond_81

    add-int/lit8 v1, v0, 0x4

    .line 327
    invoke-static {v0, v4}, Lm54;->Q(I[B)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v11, v9, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 328
    invoke-virtual {v11, v9, v2, v3, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_48

    :pswitch_23
    move-object/from16 v4, p2

    move-object/from16 v26, v8

    move v0, v12

    move/from16 v12, v19

    move-object/from16 v8, v31

    const/4 v1, 0x1

    move/from16 v19, v10

    move-object/from16 v10, p6

    if-ne v7, v1, :cond_81

    add-int/lit8 v1, v0, 0x8

    .line 329
    invoke-static {v0, v4}, Lm54;->W(I[B)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v11, v9, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 330
    invoke-virtual {v11, v9, v2, v3, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_48

    :pswitch_24
    move-object/from16 v4, p2

    move-object/from16 v26, v8

    move v0, v12

    move/from16 v12, v19

    move-object/from16 v8, v31

    move/from16 v19, v10

    move-object/from16 v10, p6

    if-nez v7, :cond_81

    .line 331
    invoke-static {v4, v0, v10}, Lm54;->C([BILv44;)I

    move-result v1

    iget v5, v10, Lv44;->a:I

    .line 332
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v11, v9, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 333
    invoke-virtual {v11, v9, v2, v3, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_48

    :pswitch_25
    move-object/from16 v4, p2

    move-object/from16 v26, v8

    move v0, v12

    move/from16 v12, v19

    move-object/from16 v8, v31

    move/from16 v19, v10

    move-object/from16 v10, p6

    if-nez v7, :cond_81

    .line 334
    invoke-static {v4, v0, v10}, Lm54;->O([BILv44;)I

    move-result v1

    iget-wide v5, v10, Lv44;->b:J

    .line 335
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v11, v9, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 336
    invoke-virtual {v11, v9, v2, v3, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_48

    :pswitch_26
    move-object/from16 v4, p2

    move-object/from16 v26, v8

    move v0, v12

    move/from16 v12, v19

    move-object/from16 v8, v31

    const/4 v1, 0x5

    move/from16 v19, v10

    move-object/from16 v10, p6

    if-ne v7, v1, :cond_81

    add-int/lit8 v1, v0, 0x4

    .line 337
    invoke-static {v0, v4}, Lm54;->Q(I[B)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 338
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v11, v9, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 339
    invoke-virtual {v11, v9, v2, v3, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_48

    :pswitch_27
    move-object/from16 v4, p2

    move-object/from16 v26, v8

    move v0, v12

    move/from16 v12, v19

    move-object/from16 v8, v31

    const/4 v1, 0x1

    move/from16 v19, v10

    move-object/from16 v10, p6

    if-ne v7, v1, :cond_81

    add-int/lit8 v1, v0, 0x8

    .line 340
    invoke-static {v0, v4}, Lm54;->W(I[B)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v5

    .line 341
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v11, v9, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 342
    invoke-virtual {v11, v9, v2, v3, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_48

    :cond_81
    :goto_47
    move v1, v0

    :goto_48
    if-eq v1, v0, :cond_82

    move-object/from16 v0, p0

    move/from16 v5, p4

    move-object v3, v4

    move-object v2, v9

    move-object v6, v10

    move v7, v12

    move v15, v13

    move/from16 v8, v19

    move/from16 v14, v25

    move/from16 v9, v27

    const v16, 0xfffff

    move v4, v1

    goto/16 :goto_11

    :cond_82
    move/from16 v7, p5

    move v3, v1

    move/from16 v14, v25

    :goto_49
    if-ne v13, v7, :cond_83

    if-eqz v7, :cond_83

    move/from16 v8, p4

    move v6, v3

    move v15, v13

    :goto_4a
    move/from16 v0, v27

    const v10, 0xfffff

    goto :goto_4b

    .line 343
    :cond_83
    move-object v0, v9

    check-cast v0, Lp54;

    iget-object v1, v0, Lp54;->zzt:Lb74;

    if-ne v1, v8, :cond_84

    invoke-static {}, Lb74;->a()Lb74;

    move-result-object v1

    .line 344
    iput-object v1, v0, Lp54;->zzt:Lb74;

    :cond_84
    move-object v5, v1

    move-object v2, v4

    move-object v6, v10

    move v1, v13

    move/from16 v4, p4

    .line 345
    invoke-static/range {v1 .. v6}, Lm54;->g0(I[BIILb74;Lv44;)I

    move-result v0

    move-object/from16 v3, p2

    move-object/from16 v6, p6

    move v15, v1

    move v5, v4

    move-object v2, v9

    move-object v1, v11

    move v7, v12

    move/from16 v8, v19

    move/from16 v9, v27

    const v16, 0xfffff

    move v4, v0

    move-object/from16 v0, p0

    goto/16 :goto_1

    :cond_85
    move/from16 v7, p5

    move-object v11, v1

    move v8, v5

    move/from16 v27, v9

    move-object/from16 v26, v13

    move/from16 v25, v14

    move-object v9, v2

    move v6, v4

    goto :goto_4a

    :goto_4b
    if-eq v0, v10, :cond_86

    int-to-long v0, v0

    .line 346
    invoke-virtual {v11, v9, v0, v1, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_86
    move-object/from16 v0, p0

    iget v1, v0, Lk64;->h:I

    move v10, v1

    move-object/from16 v3, v17

    :goto_4c
    iget v1, v0, Lk64;->i:I

    if-ge v10, v1, :cond_87

    iget-object v4, v0, Lk64;->j:Lpz;

    .line 347
    iget-object v1, v0, Lk64;->g:[I

    aget v2, v1, v10

    move-object/from16 v5, p1

    move-object v1, v9

    .line 348
    invoke-virtual/range {v0 .. v5}, Lk64;->K(Ljava/lang/Object;ILjava/lang/Object;Lpz;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lb74;

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v9, p1

    goto :goto_4c

    :cond_87
    if-eqz v3, :cond_88

    iget-object v1, v0, Lk64;->j:Lpz;

    .line 349
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    move-object/from16 v1, p1

    check-cast v1, Lp54;

    iput-object v3, v1, Lp54;->zzt:Lb74;

    :cond_88
    if-nez v7, :cond_8a

    if-ne v6, v8, :cond_89

    goto :goto_4d

    .line 351
    :cond_89
    new-instance v1, La64;

    move-object/from16 v2, v26

    .line 352
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 353
    throw v1

    :cond_8a
    move-object/from16 v2, v26

    if-gt v6, v8, :cond_8b

    if-ne v15, v7, :cond_8b

    :goto_4d
    return v6

    :cond_8b
    new-instance v1, La64;

    .line 354
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 355
    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x12
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x33
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_24
        :pswitch_1d
        :pswitch_22
        :pswitch_23
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch
.end method
