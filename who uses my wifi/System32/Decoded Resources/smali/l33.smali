.class public final Ll33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ln53;


# instance fields
.field public final a:Lxe4;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:F

.field public final f:I

.field public final g:I

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Ly20;


# direct methods
.method public constructor <init>(Lxe4;Ljava/lang/String;ZLjava/lang/String;FIILjava/lang/String;ZLy20;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "the adSize must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lou1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ll33;->a:Lxe4;

    .line 10
    .line 11
    iput-object p2, p0, Ll33;->b:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p3, p0, Ll33;->c:Z

    .line 14
    .line 15
    iput-object p4, p0, Ll33;->d:Ljava/lang/String;

    .line 16
    .line 17
    iput p5, p0, Ll33;->e:F

    .line 18
    .line 19
    iput p6, p0, Ll33;->f:I

    .line 20
    .line 21
    iput p7, p0, Ll33;->g:I

    .line 22
    .line 23
    iput-object p8, p0, Ll33;->h:Ljava/lang/String;

    .line 24
    .line 25
    iput-boolean p9, p0, Ll33;->i:Z

    .line 26
    .line 27
    iput-object p10, p0, Ll33;->j:Ly20;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    iget-object v0, p0, Ll33;->a:Lxe4;

    .line 2
    .line 3
    iget v1, v0, Lxe4;->j:I

    .line 4
    .line 5
    iget-boolean v2, v0, Lxe4;->t:Z

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    move v3, v5

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v3, v4

    .line 15
    :goto_0
    const-string v6, "smart_w"

    .line 16
    .line 17
    const-string v7, "full"

    .line 18
    .line 19
    invoke-static {p1, v6, v7, v3}, Li30;->h0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    iget v3, v0, Lxe4;->g:I

    .line 23
    .line 24
    const/4 v6, -0x2

    .line 25
    if-ne v3, v6, :cond_1

    .line 26
    .line 27
    move v6, v5

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v6, v4

    .line 30
    :goto_1
    const-string v7, "smart_h"

    .line 31
    .line 32
    const-string v8, "auto"

    .line 33
    .line 34
    invoke-static {p1, v7, v8, v6}, Li30;->h0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    iget-boolean v6, v0, Lxe4;->o:Z

    .line 38
    .line 39
    const-string v7, "ene"

    .line 40
    .line 41
    invoke-static {p1, v7, v5, v6}, Li30;->n0(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 42
    .line 43
    .line 44
    const-string v6, "102"

    .line 45
    .line 46
    iget-boolean v7, v0, Lxe4;->r:Z

    .line 47
    .line 48
    const-string v8, "rafmt"

    .line 49
    .line 50
    invoke-static {p1, v8, v6, v7}, Li30;->h0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v6, "103"

    .line 54
    .line 55
    iget-boolean v7, v0, Lxe4;->s:Z

    .line 56
    .line 57
    invoke-static {p1, v8, v6, v7}, Li30;->h0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    const-string v6, "105"

    .line 61
    .line 62
    invoke-static {p1, v8, v6, v2}, Li30;->h0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 63
    .line 64
    .line 65
    iget-boolean v6, p0, Ll33;->i:Z

    .line 66
    .line 67
    const-string v7, "inline_adaptive_slot"

    .line 68
    .line 69
    invoke-static {p1, v7, v5, v6}, Li30;->n0(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 70
    .line 71
    .line 72
    const-string v6, "interscroller_slot"

    .line 73
    .line 74
    invoke-static {p1, v6, v5, v2}, Li30;->n0(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 75
    .line 76
    .line 77
    const-string v2, "format"

    .line 78
    .line 79
    iget-object v6, p0, Ll33;->b:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v2, p1, v6}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v2, "fluid"

    .line 85
    .line 86
    iget-boolean v6, p0, Ll33;->c:Z

    .line 87
    .line 88
    const-string v7, "height"

    .line 89
    .line 90
    invoke-static {p1, v2, v7, v6}, Li30;->h0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    iget-object v2, p0, Ll33;->d:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    xor-int/2addr v6, v5

    .line 100
    const-string v8, "sz"

    .line 101
    .line 102
    invoke-static {p1, v8, v2, v6}, Li30;->h0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 103
    .line 104
    .line 105
    const-string v2, "u_sd"

    .line 106
    .line 107
    iget v6, p0, Ll33;->e:F

    .line 108
    .line 109
    invoke-virtual {p1, v2, v6}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 110
    .line 111
    .line 112
    const-string v2, "sw"

    .line 113
    .line 114
    iget v6, p0, Ll33;->f:I

    .line 115
    .line 116
    invoke-virtual {p1, v2, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 117
    .line 118
    .line 119
    const-string v2, "sh"

    .line 120
    .line 121
    iget v6, p0, Ll33;->g:I

    .line 122
    .line 123
    invoke-virtual {p1, v2, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    iget-object v2, p0, Ll33;->h:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    xor-int/2addr v5, v6

    .line 133
    const-string v6, "sc"

    .line 134
    .line 135
    invoke-static {p1, v6, v2, v5}, Li30;->h0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 136
    .line 137
    .line 138
    sget-object v2, Lmz1;->de:Liz1;

    .line 139
    .line 140
    sget-object v5, Ltw1;->e:Ltw1;

    .line 141
    .line 142
    iget-object v6, v5, Ltw1;->c:Lkz1;

    .line 143
    .line 144
    invoke-virtual {v6, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-nez v2, :cond_2

    .line 155
    .line 156
    sget-object v2, Lmz1;->ee:Liz1;

    .line 157
    .line 158
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 159
    .line 160
    invoke-virtual {v5, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eqz v2, :cond_3

    .line 171
    .line 172
    :cond_2
    iget-object v2, p0, Ll33;->j:Ly20;

    .line 173
    .line 174
    if-eqz v2, :cond_3

    .line 175
    .line 176
    const-string v5, "sam_t"

    .line 177
    .line 178
    iget v6, v2, Ly20;->b:I

    .line 179
    .line 180
    invoke-virtual {p1, v5, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 181
    .line 182
    .line 183
    const-string v5, "sam_b"

    .line 184
    .line 185
    iget v6, v2, Ly20;->d:I

    .line 186
    .line 187
    invoke-virtual {p1, v5, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 188
    .line 189
    .line 190
    const-string v5, "sam_l"

    .line 191
    .line 192
    iget v6, v2, Ly20;->a:I

    .line 193
    .line 194
    invoke-virtual {p1, v5, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 195
    .line 196
    .line 197
    const-string v5, "sam_r"

    .line 198
    .line 199
    iget v2, v2, Ly20;->c:I

    .line 200
    .line 201
    invoke-virtual {p1, v5, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 202
    .line 203
    .line 204
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 207
    .line 208
    .line 209
    iget-object v5, v0, Lxe4;->l:[Lxe4;

    .line 210
    .line 211
    const-string v6, "is_fluid_height"

    .line 212
    .line 213
    const-string v8, "width"

    .line 214
    .line 215
    if-nez v5, :cond_4

    .line 216
    .line 217
    new-instance v4, Landroid/os/Bundle;

    .line 218
    .line 219
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4, v7, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4, v8, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 226
    .line 227
    .line 228
    iget-boolean v0, v0, Lxe4;->n:Z

    .line 229
    .line 230
    invoke-virtual {v4, v6, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_4
    :goto_2
    array-length v0, v5

    .line 238
    if-ge v4, v0, :cond_5

    .line 239
    .line 240
    aget-object v0, v5, v4

    .line 241
    .line 242
    new-instance v1, Landroid/os/Bundle;

    .line 243
    .line 244
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 245
    .line 246
    .line 247
    iget-boolean v3, v0, Lxe4;->n:Z

    .line 248
    .line 249
    invoke-virtual {v1, v6, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 250
    .line 251
    .line 252
    iget v3, v0, Lxe4;->g:I

    .line 253
    .line 254
    invoke-virtual {v1, v7, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 255
    .line 256
    .line 257
    iget v0, v0, Lxe4;->j:I

    .line 258
    .line 259
    invoke-virtual {v1, v8, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    add-int/lit8 v4, v4, 0x1

    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_5
    :goto_3
    const-string v0, "valid_ad_sizes"

    .line 269
    .line 270
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 271
    .line 272
    .line 273
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljm2;

    .line 2
    .line 3
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ll33;->a(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final synthetic p(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljm2;

    .line 2
    .line 3
    iget-object p1, p1, Ljm2;->b:Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ll33;->a(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
