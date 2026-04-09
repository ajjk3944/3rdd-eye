.class public final Lfs1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/content/pm/PackageManager$OnChecksumsReadyListener;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lfs1;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lwq3;

    .line 4
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object v0, p0, Lfs1;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lfs1;->a:I

    iput-object p2, p0, Lfs1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChecksumsReady(Ljava/util/List;)V
    .locals 8

    .line 1
    iget v0, p0, Lfs1;->a:I

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, Lfs1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v4, Lyc;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v4, v1}, Lyc;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    :goto_0
    if-ge v3, v0, :cond_2

    .line 26
    .line 27
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-static {v5}, Llb;->f(Ljava/lang/Object;)Landroid/content/pm/ApkChecksum;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-static {v5}, Llb;->a(Landroid/content/pm/ApkChecksum;)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-ne v6, v2, :cond_1

    .line 40
    .line 41
    sget-object p1, Ljo3;->f:Lgo3;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljo3;->f()Ljo3;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {v5}, Llb;->z(Landroid/content/pm/ApkChecksum;)[B

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    array-length v2, v0

    .line 52
    invoke-virtual {p1, v2, v0}, Ljo3;->g(I[B)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v4, p1}, Lyc;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    :cond_2
    invoke-virtual {v4, v1}, Lyc;->a(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :goto_1
    return-void

    .line 67
    :pswitch_0
    check-cast v4, Lwq3;

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    if-nez p1, :cond_3

    .line 71
    .line 72
    invoke-virtual {v4, v0}, Lgp3;->d(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_3
    :try_start_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    move v5, v3

    .line 81
    :goto_2
    if-ge v5, v1, :cond_6

    .line 82
    .line 83
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-static {v6}, Llb;->f(Ljava/lang/Object;)Landroid/content/pm/ApkChecksum;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-static {v6}, Llb;->a(Landroid/content/pm/ApkChecksum;)I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-ne v7, v2, :cond_5

    .line 96
    .line 97
    invoke-static {v6}, Llb;->z(Landroid/content/pm/ApkChecksum;)[B

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    sget-object v1, Llt1;->a:[C

    .line 102
    .line 103
    array-length v1, p1

    .line 104
    add-int/2addr v1, v1

    .line 105
    new-array v1, v1, [C

    .line 106
    .line 107
    :goto_3
    array-length v2, p1

    .line 108
    if-ge v3, v2, :cond_4

    .line 109
    .line 110
    aget-byte v2, p1, v3

    .line 111
    .line 112
    and-int/lit16 v5, v2, 0xff

    .line 113
    .line 114
    sget-object v6, Llt1;->a:[C

    .line 115
    .line 116
    ushr-int/lit8 v5, v5, 0x4

    .line 117
    .line 118
    aget-char v5, v6, v5

    .line 119
    .line 120
    add-int v7, v3, v3

    .line 121
    .line 122
    aput-char v5, v1, v7

    .line 123
    .line 124
    and-int/lit8 v2, v2, 0xf

    .line 125
    .line 126
    add-int/lit8 v7, v7, 0x1

    .line 127
    .line 128
    aget-char v2, v6, v2

    .line 129
    .line 130
    aput-char v2, v1, v7

    .line 131
    .line 132
    add-int/lit8 v3, v3, 0x1

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    new-instance p1, Ljava/lang/String;

    .line 136
    .line 137
    invoke-direct {p1, v1}, Ljava/lang/String;-><init>([C)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, p1}, Lgp3;->d(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    invoke-virtual {v4, v0}, Lgp3;->d(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :catchall_1
    invoke-virtual {v4, v0}, Lgp3;->d(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    :goto_4
    return-void

    .line 155
    :pswitch_1
    if-nez p1, :cond_7

    .line 156
    .line 157
    check-cast v4, Lwq3;

    .line 158
    .line 159
    invoke-virtual {v4, v1}, Lgp3;->d(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_7
    :try_start_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    :goto_5
    if-ge v3, v0, :cond_9

    .line 168
    .line 169
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-static {v5}, Llb;->f(Ljava/lang/Object;)Landroid/content/pm/ApkChecksum;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-static {v5}, Llb;->a(Landroid/content/pm/ApkChecksum;)I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    if-ne v6, v2, :cond_8

    .line 182
    .line 183
    move-object p1, v4

    .line 184
    check-cast p1, Lwq3;

    .line 185
    .line 186
    sget-object v0, Ljo3;->f:Lgo3;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljo3;->f()Ljo3;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v5}, Llb;->z(Landroid/content/pm/ApkChecksum;)[B

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    array-length v3, v2

    .line 197
    invoke-virtual {v0, v3, v2}, Ljo3;->g(I[B)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {p1, v0}, Lgp3;->d(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 202
    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :catchall_2
    :cond_9
    check-cast v4, Lwq3;

    .line 209
    .line 210
    invoke-virtual {v4, v1}, Lgp3;->d(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    :goto_6
    return-void

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
