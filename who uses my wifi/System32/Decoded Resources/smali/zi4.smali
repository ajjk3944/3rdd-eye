.class public final synthetic Lzi4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lcl3;


# instance fields
.field public final synthetic f:Llj4;

.field public final synthetic g:Ldj4;


# direct methods
.method public synthetic constructor <init>(Llj4;Ldj4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzi4;->f:Llj4;

    .line 5
    .line 6
    iput-object p2, p0, Lzi4;->g:Ldj4;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    check-cast p1, Lph4;

    .line 2
    .line 3
    iget-object v0, p0, Lzi4;->g:Ldj4;

    .line 4
    .line 5
    iget-boolean v0, v0, Ldj4;->A:Z

    .line 6
    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    iget-object v0, p0, Lzi4;->f:Llj4;

    .line 10
    .line 11
    iget-object v1, v0, Llj4;->i:Ljava/lang/Boolean;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_a

    .line 20
    .line 21
    :cond_0
    iget v1, p1, Lph4;->E:I

    .line 22
    .line 23
    iget-object v2, p1, Lph4;->m:Ljava/lang/String;

    .line 24
    .line 25
    const/4 v3, -0x1

    .line 26
    if-eq v1, v3, :cond_a

    .line 27
    .line 28
    const/4 v4, 0x2

    .line 29
    if-le v1, v4, :cond_a

    .line 30
    .line 31
    const/16 v1, 0x20

    .line 32
    .line 33
    const-string v5, "audio/eac3-joc"

    .line 34
    .line 35
    const-string v6, "audio/ac4"

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    sparse-switch v7, :sswitch_data_0

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :sswitch_0
    const-string v7, "audio/eac3"

    .line 49
    .line 50
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :sswitch_1
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :sswitch_2
    const-string v7, "audio/ac3"

    .line 65
    .line 66
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :sswitch_3
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_2

    .line 78
    .line 79
    :goto_0
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 80
    .line 81
    if-lt v7, v1, :cond_a

    .line 82
    .line 83
    iget-object v7, v0, Llj4;->g:Lrl;

    .line 84
    .line 85
    if-eqz v7, :cond_a

    .line 86
    .line 87
    iget-boolean v7, v7, Lrl;->f:Z

    .line 88
    .line 89
    if-nez v7, :cond_2

    .line 90
    .line 91
    goto/16 :goto_4

    .line 92
    .line 93
    :cond_2
    :goto_1
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 94
    .line 95
    const/4 v8, 0x0

    .line 96
    if-lt v7, v1, :cond_9

    .line 97
    .line 98
    iget-object v1, v0, Llj4;->g:Lrl;

    .line 99
    .line 100
    if-eqz v1, :cond_9

    .line 101
    .line 102
    iget-boolean v7, v1, Lrl;->f:Z

    .line 103
    .line 104
    if-eqz v7, :cond_9

    .line 105
    .line 106
    iget-object v1, v1, Lrl;->g:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, Landroid/media/Spatializer;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {v1}, Ls0;->c(Ljava/lang/Object;)Landroid/media/Spatializer;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {v1}, Ls0;->l(Landroid/media/Spatializer;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_9

    .line 122
    .line 123
    iget-object v1, v0, Llj4;->g:Lrl;

    .line 124
    .line 125
    iget-object v1, v1, Lrl;->g:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Landroid/media/Spatializer;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {v1}, Ls0;->c(Ljava/lang/Object;)Landroid/media/Spatializer;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v1}, Ls0;->h(Landroid/media/Spatializer;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_9

    .line 141
    .line 142
    iget-object v1, v0, Llj4;->g:Lrl;

    .line 143
    .line 144
    iget-object v0, v0, Llj4;->h:Lin2;

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget v7, p1, Lph4;->E:I

    .line 150
    .line 151
    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_3

    .line 156
    .line 157
    const/16 v2, 0x10

    .line 158
    .line 159
    if-ne v7, v2, :cond_6

    .line 160
    .line 161
    const/16 v7, 0xc

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_3
    const-string v5, "audio/iamf"

    .line 165
    .line 166
    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-eqz v5, :cond_4

    .line 171
    .line 172
    if-ne v7, v3, :cond_6

    .line 173
    .line 174
    const/4 v7, 0x6

    .line 175
    goto :goto_2

    .line 176
    :cond_4
    invoke-static {v2, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_6

    .line 181
    .line 182
    const/16 v2, 0x12

    .line 183
    .line 184
    const/16 v5, 0x18

    .line 185
    .line 186
    if-eq v7, v2, :cond_5

    .line 187
    .line 188
    const/16 v2, 0x15

    .line 189
    .line 190
    if-ne v7, v2, :cond_6

    .line 191
    .line 192
    :cond_5
    move v7, v5

    .line 193
    :cond_6
    :goto_2
    invoke-static {v7}, Lv23;->b(I)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-nez v2, :cond_7

    .line 198
    .line 199
    move p1, v8

    .line 200
    goto :goto_3

    .line 201
    :cond_7
    new-instance v5, Landroid/media/AudioFormat$Builder;

    .line 202
    .line 203
    invoke-direct {v5}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v5, v4}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-virtual {v4, v2}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    iget p1, p1, Lph4;->F:I

    .line 215
    .line 216
    if-eq p1, v3, :cond_8

    .line 217
    .line 218
    invoke-virtual {v2, p1}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 219
    .line 220
    .line 221
    :cond_8
    iget-object p1, v1, Lrl;->g:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p1, Landroid/media/Spatializer;

    .line 224
    .line 225
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-static {p1}, Ls0;->c(Ljava/lang/Object;)Landroid/media/Spatializer;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {v0}, Lin2;->a()Landroid/media/AudioAttributes;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v2}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-static {p1, v0, v1}, Ls0;->i(Landroid/media/Spatializer;Landroid/media/AudioAttributes;Landroid/media/AudioFormat;)Z

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    :goto_3
    if-eqz p1, :cond_9

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_9
    return v8

    .line 248
    :cond_a
    :goto_4
    const/4 p1, 0x1

    .line 249
    return p1

    .line 250
    nop

    .line 251
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_3
        0xb269698 -> :sswitch_2
        0xb269699 -> :sswitch_1
        0x59ae0c65 -> :sswitch_0
    .end sparse-switch
.end method
