.class public final Lss1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lrs1;


# static fields
.field public static volatile C:Ljt1; = null

.field public static final D:Ljava/lang/Object;

.field public static E:Z = false

.field public static F:J

.field public static G:Lzs1;

.field public static H:Lpt1;

.field public static I:Lxe1;

.field public static J:Lt83;

.field public static K:Lvg0;


# instance fields
.field public A:Lnt1;

.field public final B:Ljava/util/HashMap;

.field public f:Landroid/view/MotionEvent;

.field public final g:Ljava/util/LinkedList;

.field public h:J

.field public i:J

.field public j:J

.field public k:J

.field public l:J

.field public m:J

.field public n:J

.field public o:D

.field public p:D

.field public q:D

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:Z

.field public w:Z

.field public final x:Landroid/util/DisplayMetrics;

.field public final y:Ldm1;

.field public final z:Lwy0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lss1;->D:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lwy0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lss1;->g:Ljava/util/LinkedList;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Lss1;->h:J

    .line 14
    .line 15
    iput-wide v0, p0, Lss1;->i:J

    .line 16
    .line 17
    iput-wide v0, p0, Lss1;->j:J

    .line 18
    .line 19
    iput-wide v0, p0, Lss1;->k:J

    .line 20
    .line 21
    iput-wide v0, p0, Lss1;->l:J

    .line 22
    .line 23
    iput-wide v0, p0, Lss1;->m:J

    .line 24
    .line 25
    iput-wide v0, p0, Lss1;->n:J

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lss1;->v:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Lss1;->w:Z

    .line 31
    .line 32
    :try_start_0
    invoke-static {}, Lhs1;->a()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 44
    .line 45
    sget-object p1, Lmz1;->b3:Liz1;

    .line 46
    .line 47
    sget-object v0, Ltw1;->e:Ltw1;

    .line 48
    .line 49
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_0

    .line 62
    .line 63
    new-instance p1, Ldm1;

    .line 64
    .line 65
    invoke-direct {p1}, Ldm1;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lss1;->y:Ldm1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    :catchall_0
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lss1;->B:Ljava/util/HashMap;

    .line 76
    .line 77
    iput-object p2, p0, Lss1;->z:Lwy0;

    .line 78
    .line 79
    return-void
.end method

.method public static q(Landroid/content/Context;Z)Ljt1;
    .locals 7

    .line 1
    sget-object v0, Lss1;->C:Ljt1;

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    sget-object v0, Lss1;->D:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lss1;->C:Ljt1;

    .line 9
    .line 10
    if-nez v1, :cond_7

    .line 11
    .line 12
    sget-object v1, Lss1;->K:Lvg0;

    .line 13
    .line 14
    invoke-static {p0, p1, v1}, Ljt1;->a(Landroid/content/Context;ZLvg0;)Ljt1;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-boolean p1, p0, Ljt1;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    if-eqz p1, :cond_6

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    :try_start_1
    sget-object v1, Lmz1;->F3:Liz1;

    .line 24
    .line 25
    sget-object v2, Ltw1;->e:Ltw1;

    .line 26
    .line 27
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    :try_start_2
    const-string v1, "hTLiiIA7LJpRCIVGwbLw56sBtWYdpFA3KN/lVIAoqlyIo4UMQoQK3mH52LWi8hnG"

    .line 42
    .line 43
    const-string v2, "S64wW/9/kcrI6i+T76YThiZ/p514KjvGlvxi0Ei4eDg="

    .line 44
    .line 45
    new-array v3, p1, [Ljava/lang/Class;

    .line 46
    .line 47
    invoke-virtual {p0, v1, v2, v3}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :catch_0
    :cond_0
    :goto_0
    const-string v1, "Fl0NzymWHJhyDpr9GrhyVi62KX+d2kj13lp1AwiYQHKKCKe1X2FxmeM5KLeNR5D2"

    .line 55
    .line 56
    const-string v2, "WhU/3eeIEz43+QqYTIKNH8p88w1+Uh4fQMNHsNTU34U="

    .line 57
    .line 58
    const-class v3, Landroid/content/Context;

    .line 59
    .line 60
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {p0, v1, v2, v3}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 65
    .line 66
    .line 67
    sget-object v1, Lmz1;->N3:Liz1;

    .line 68
    .line 69
    sget-object v2, Ltw1;->e:Ltw1;

    .line 70
    .line 71
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 72
    .line 73
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    const-string v1, "gyMGe4SoPVIhBgFM+VlZQFWek2IoqCotue6ayBNgVb95WbB68suDu+Zv4jWiM6iG"

    .line 86
    .line 87
    const-string v3, "etp1batKULd2kwg+5GPfxliTu8RjfdN0zKvZOjQe8mU="

    .line 88
    .line 89
    new-array v4, p1, [Ljava/lang/Class;

    .line 90
    .line 91
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    const-string v1, "yCCrg1bENISzqqs7fgrfIgqRoB89Hc58RpoZe38mDWknXggRGBdzPAEdsprm/nAh"

    .line 95
    .line 96
    const-string v3, "ygsxUks9qSJOiPMXEo9qlLCVVsFNNRfyc6WjXaB0M8U="

    .line 97
    .line 98
    const-class v4, Landroid/content/Context;

    .line 99
    .line 100
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 105
    .line 106
    .line 107
    const-string v1, "JC98YOkW1OV00In88Kxh39aoA4/Lc5LugpNahl16Tw21h78xPzCO3AkqsFSMWF+O"

    .line 108
    .line 109
    const-string v3, "uHu4aeoXgHtmEAr/p8TbphROLjKobmRTgSnNeTPf/24="

    .line 110
    .line 111
    const-class v4, Landroid/content/Context;

    .line 112
    .line 113
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 118
    .line 119
    .line 120
    const-string v1, "0k0HoJtCvAtrnTz0UbiSqrs0BGKzSTMoo+ZxCfyJrLcMn8tbsvf/NG2/ui2bKbWP"

    .line 121
    .line 122
    const-string v3, "z6GzXqyR8kvBYJKVLhMc9mqmsbq6ZkNeWqgTkONnpqg="

    .line 123
    .line 124
    const-class v4, Landroid/content/Context;

    .line 125
    .line 126
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 131
    .line 132
    .line 133
    const-string v1, "01PVhP+doaGKdC1W6GrY+2IWUVFKtg3RWpQDin/wN/cS8wkuezVXqSDwZNREySxt"

    .line 134
    .line 135
    const-string v3, "hY1jxg+6DUCngCe0vbxb4cMsyHNENce67SGKWd6hzv8="

    .line 136
    .line 137
    const-class v4, Landroid/content/Context;

    .line 138
    .line 139
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 144
    .line 145
    .line 146
    const-string v1, "8W5EiIZWvw8ca0gdEf2baMelwD0v1LgWFEv6AqIRDGIzRlZJKgzzVYcusXATxgKN"

    .line 147
    .line 148
    const-string v3, "ZXwHOojdfPkjtU4/T1kRX8Zucxdzz/LL+/XimOcPDrc="

    .line 149
    .line 150
    const-class v4, Landroid/content/Context;

    .line 151
    .line 152
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 153
    .line 154
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 159
    .line 160
    .line 161
    const-string v1, "f5uC0Q5BJBhs1YfPGy7Wx7MnBjWVUX5JNaW+Lz6dfUOfz0sIXH0KubqvIhiUByWt"

    .line 162
    .line 163
    const-string v3, "klWlopX/vpRWeyQx7GUjF52wT93EUJwbeMp05ev02yc="

    .line 164
    .line 165
    const-class v4, Landroid/content/Context;

    .line 166
    .line 167
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 172
    .line 173
    .line 174
    const-string v1, "Ps5Xy95qN5Bq7sgqC6/M4zZXLDS2M1Isx7H/g2/CV37zoy2ILxNb7iAARKvnhAcR"

    .line 175
    .line 176
    const-string v3, "UDDHIUrqun7cz3t6d4j2iVVfWcHKtBQnSOoDChOFM5Y="

    .line 177
    .line 178
    const-class v4, Landroid/content/Context;

    .line 179
    .line 180
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 185
    .line 186
    .line 187
    const-string v1, "6ZjnfgvB9wgS+Y8hZDivPhgjxRZbCY4q7zFEc6BukViF66w3fH7pDgMpCmaLCsbG"

    .line 188
    .line 189
    const-string v3, "yV5Ezpu/FJ5eBLvg/Gvr42qBX8KcXLyHBG0rFZzzuBY="

    .line 190
    .line 191
    const-class v4, Landroid/view/MotionEvent;

    .line 192
    .line 193
    const-class v6, Landroid/util/DisplayMetrics;

    .line 194
    .line 195
    filled-new-array {v4, v6}, [Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 200
    .line 201
    .line 202
    const-string v1, "0F2tRPtJ+oackwCEaR1ilzSWBDq3birdEdy954kTVJ/3hlaiiP5kh1SmVilvcwVI"

    .line 203
    .line 204
    const-string v3, "bSUQaKDGEujzsstvFAmuaLuv9mtefCQQKWZn9uZj/LI="

    .line 205
    .line 206
    const-class v4, Landroid/view/MotionEvent;

    .line 207
    .line 208
    const-class v6, Landroid/util/DisplayMetrics;

    .line 209
    .line 210
    filled-new-array {v4, v6}, [Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 215
    .line 216
    .line 217
    const-string v1, "6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L"

    .line 218
    .line 219
    const-string v3, "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc="

    .line 220
    .line 221
    new-array v4, p1, [Ljava/lang/Class;

    .line 222
    .line 223
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 224
    .line 225
    .line 226
    const-string v1, "VYNLVwJcUVwKHNYqtTAMU2Cbdf8xQvz3Fr3MGMTI+Feinwv11ysZpnAq/2AMk2I1"

    .line 227
    .line 228
    const-string v3, "XCAdtiyR5t8AMQ7u4CMXLD5NJ9dD+Tw+KRPDn9OS+vQ="

    .line 229
    .line 230
    new-array v4, p1, [Ljava/lang/Class;

    .line 231
    .line 232
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 233
    .line 234
    .line 235
    const-string v1, "MMDDWI2IGLmF5pG/RRqJJZVb/JAirVaBalbjWCkub0DwWmFp7b+bfaTjmPK9uiWU"

    .line 236
    .line 237
    const-string v3, "m1dpreCDNlkoMOYdr+vmzaz+jSmUZiIrETih78jZTqg="

    .line 238
    .line 239
    new-array v4, p1, [Ljava/lang/Class;

    .line 240
    .line 241
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 242
    .line 243
    .line 244
    const-string v1, "N+SNt584k90MWn4aBLIhSutg85cYgcNyu+q+5WGRUo/oWkmPivq/1xlEIBG+GcFK"

    .line 245
    .line 246
    const-string v3, "VOVDFi9LxFQe2QWzKEnmStNUha/UwjqmQV12jeIMYds="

    .line 247
    .line 248
    new-array v4, p1, [Ljava/lang/Class;

    .line 249
    .line 250
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 251
    .line 252
    .line 253
    const-string v1, "b8WdxwEW5LYMXGC6g6q07uNIFUV3fs77AEo1YVb/4q/M8KyV69so1cxJ+MsKyWwh"

    .line 254
    .line 255
    const-string v3, "kazSW9iygMpHEkKh5zVqXBXYRU+noi3Tzu4hpFfxZG4="

    .line 256
    .line 257
    new-array v4, p1, [Ljava/lang/Class;

    .line 258
    .line 259
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 260
    .line 261
    .line 262
    const-string v1, "cOth2BAAthu6X8KDmzC58653OwqftcurhEiV9l+3uxMh7KBnOgbdhGM0zSnSPufi"

    .line 263
    .line 264
    const-string v3, "2EDSTVCwfkpT+1duJ+umEyNIZ3jEP0NWyK78oeLPLhI="

    .line 265
    .line 266
    new-array v4, p1, [Ljava/lang/Class;

    .line 267
    .line 268
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 269
    .line 270
    .line 271
    const-string v1, "yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0"

    .line 272
    .line 273
    const-string v3, "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko="

    .line 274
    .line 275
    const-class v4, Landroid/content/Context;

    .line 276
    .line 277
    const-class v6, Ljava/lang/String;

    .line 278
    .line 279
    filled-new-array {v4, v5, v6}, [Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 284
    .line 285
    .line 286
    const-string v1, "ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD"

    .line 287
    .line 288
    const-string v3, "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk="

    .line 289
    .line 290
    const-class v4, [Ljava/lang/StackTraceElement;

    .line 291
    .line 292
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 297
    .line 298
    .line 299
    const-string v1, "UGogIgDf9q+IGA3QKHqW/91b9ZzRTVJqtfmUoLBkD310fwrDg1hJZvDQk8/WK1MH"

    .line 300
    .line 301
    const-string v3, "sEqRe1gPhw/PwjhUj/qVAEUjKSVJDrXHsmrE44pcjTE="

    .line 302
    .line 303
    const-class v4, Landroid/view/View;

    .line 304
    .line 305
    const-class v6, Landroid/util/DisplayMetrics;

    .line 306
    .line 307
    filled-new-array {v4, v6, v5, v5}, [Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 312
    .line 313
    .line 314
    const-string v1, "i1MP+hbN0GtKV+UrtunReVDE3xh08srd5laBoZPswSp8P1i6BkpyGoiKZr6P+aBQ"

    .line 315
    .line 316
    const-string v3, "NQ1lo07HyX6R6o9xhF+JysjB/gJoli3QRzxLpFE7RH8="

    .line 317
    .line 318
    const-class v4, Landroid/content/Context;

    .line 319
    .line 320
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 325
    .line 326
    .line 327
    const-string v1, "YJMz4lZ/SFOXN6kW19UKnvAqcLtndNv4f6er9d24/5MuXcrsMTIC+9Jfbhpe2HMW"

    .line 328
    .line 329
    const-string v3, "6iuDHA2XEqaGCIdpenyLvoYWzHjKpoW5EjYN40bz5Cs="

    .line 330
    .line 331
    const-class v4, Landroid/view/View;

    .line 332
    .line 333
    const-class v6, Landroid/app/Activity;

    .line 334
    .line 335
    filled-new-array {v4, v6, v5}, [Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 340
    .line 341
    .line 342
    const-string v1, "7i2iPrjrwVOXQymI9kbzBw+Saen0JiBKsL25H084g9vqkkZvrS3PC/gXCAaliMdd"

    .line 343
    .line 344
    const-string v3, "jjLuguQ1TtUBIYvLkWHGRHLEQB49t1f8VaYjdD5pX6Q="

    .line 345
    .line 346
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 347
    .line 348
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-virtual {p0, v1, v3, v4}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 353
    .line 354
    .line 355
    const-string v1, "zPJzhz1QtGvdwoq8b/etTeYWv9LDeLRPadnOSNl7lohby1/0Z3YfZB4nvs0ev2QM"

    .line 356
    .line 357
    const-string v3, "fVJK5Q/FtQnQT4sQUZztmOn3k4N5bqyd4pz/QTy2bEo="

    .line 358
    .line 359
    new-array p1, p1, [Ljava/lang/Class;

    .line 360
    .line 361
    invoke-virtual {p0, v1, v3, p1}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 362
    .line 363
    .line 364
    :try_start_3
    sget-object p1, Lmz1;->I3:Liz1;

    .line 365
    .line 366
    iget-object v1, v2, Ltw1;->c:Lkz1;

    .line 367
    .line 368
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    check-cast p1, Ljava/lang/Boolean;

    .line 373
    .line 374
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 375
    .line 376
    .line 377
    move-result p1
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 378
    if-eqz p1, :cond_2

    .line 379
    .line 380
    :try_start_4
    const-string p1, "ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb"

    .line 381
    .line 382
    const-string v1, "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA="

    .line 383
    .line 384
    const-class v2, Landroid/content/Context;

    .line 385
    .line 386
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-virtual {p0, p1, v1, v2}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 391
    .line 392
    .line 393
    :catch_1
    :cond_2
    const-string p1, "71OvRH8RKLL5CGPm3dKOf5cGs3Y2jxvT4WismqAQzm1qJBvyLIz7vuBnvO3+wiyt"

    .line 394
    .line 395
    const-string v1, "6gmo4xnyZNalDG+/4eFYRg3H75rhcg0JPASG/y34gQ8="

    .line 396
    .line 397
    const-class v2, Landroid/content/Context;

    .line 398
    .line 399
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    invoke-virtual {p0, p1, v1, v2}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 404
    .line 405
    .line 406
    :try_start_5
    sget-object p1, Lmz1;->J3:Liz1;

    .line 407
    .line 408
    sget-object v1, Ltw1;->e:Ltw1;

    .line 409
    .line 410
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 411
    .line 412
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    check-cast p1, Ljava/lang/Boolean;

    .line 417
    .line 418
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 419
    .line 420
    .line 421
    move-result p1
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 422
    if-eqz p1, :cond_3

    .line 423
    .line 424
    :try_start_6
    const-string p1, "1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG"

    .line 425
    .line 426
    const-string v1, "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14="

    .line 427
    .line 428
    const-class v2, Landroid/net/NetworkCapabilities;

    .line 429
    .line 430
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 431
    .line 432
    filled-new-array {v2, v3, v3}, [Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    invoke-virtual {p0, p1, v1, v2}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 437
    .line 438
    .line 439
    :catch_2
    :cond_3
    :try_start_7
    sget-object p1, Lmz1;->b3:Liz1;

    .line 440
    .line 441
    sget-object v1, Ltw1;->e:Ltw1;

    .line 442
    .line 443
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 444
    .line 445
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    check-cast p1, Ljava/lang/Boolean;

    .line 450
    .line 451
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 452
    .line 453
    .line 454
    move-result p1
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 455
    if-eqz p1, :cond_4

    .line 456
    .line 457
    :try_start_8
    const-string p1, "sl6J6ogR1CQFBNHXqYqYlsoHhQEQ3GzqykotbgjuxxtAslvwVDD28XhO/FGDcWNY"

    .line 458
    .line 459
    const-string v1, "etPaLFHhmzrmC9guV7/txSJ19uqkwWx/gSnrE4vBCvs="

    .line 460
    .line 461
    const-class v2, Ljava/util/List;

    .line 462
    .line 463
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    invoke-virtual {p0, p1, v1, v2}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 468
    .line 469
    .line 470
    :catch_3
    :cond_4
    :try_start_9
    sget-object p1, Lmz1;->S2:Liz1;

    .line 471
    .line 472
    sget-object v1, Ltw1;->e:Ltw1;

    .line 473
    .line 474
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 475
    .line 476
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    check-cast p1, Ljava/lang/Boolean;

    .line 481
    .line 482
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 483
    .line 484
    .line 485
    move-result p1
    :try_end_9
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 486
    if-eqz p1, :cond_5

    .line 487
    .line 488
    :try_start_a
    const-string p1, "OKoG374XK3cB1cjYFPuO/Bg6vy6AufzuCyu4QCURxkWhJwL4+NqQjs8XziSHB+CQ"

    .line 489
    .line 490
    const-string v1, "PjHrXBXcXoGkJe75zH8RZ0khapXmOV4o2gX+YgkGdus="

    .line 491
    .line 492
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 493
    .line 494
    filled-new-array {v2, v2, v2, v2}, [Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    invoke-virtual {p0, p1, v1, v2}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 499
    .line 500
    .line 501
    goto :goto_1

    .line 502
    :catch_4
    :cond_5
    :try_start_b
    sget-object p1, Lmz1;->R2:Liz1;

    .line 503
    .line 504
    sget-object v1, Ltw1;->e:Ltw1;

    .line 505
    .line 506
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 507
    .line 508
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object p1

    .line 512
    check-cast p1, Ljava/lang/Boolean;

    .line 513
    .line 514
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 515
    .line 516
    .line 517
    move-result p1
    :try_end_b
    .catch Ljava/lang/IllegalStateException; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 518
    if-eqz p1, :cond_6

    .line 519
    .line 520
    :try_start_c
    const-string p1, "ykIQv59ak7YBU+e791IU15tGonhZPUUBXST76bDGm7zXSjUSNn9qtHdf61t20THy"

    .line 521
    .line 522
    const-string v1, "l48tDWlMY/G/BSkitRUvd80RiFbNrk8nR5qlkOsZWs8="

    .line 523
    .line 524
    const-class v2, [J

    .line 525
    .line 526
    const-class v3, Landroid/content/Context;

    .line 527
    .line 528
    const-class v4, Landroid/view/View;

    .line 529
    .line 530
    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    invoke-virtual {p0, p1, v1, v2}, Ljt1;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 535
    .line 536
    .line 537
    :catch_5
    :cond_6
    :goto_1
    sput-object p0, Lss1;->C:Ljt1;

    .line 538
    .line 539
    :cond_7
    monitor-exit v0

    .line 540
    goto :goto_3

    .line 541
    :goto_2
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 542
    throw p0

    .line 543
    :cond_8
    :goto_3
    sget-object p0, Lss1;->C:Ljt1;

    .line 544
    .line 545
    return-object p0
.end method

.method public static r(Ljt1;Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Lkt1;
    .locals 2

    .line 1
    const-string v0, "6ZjnfgvB9wgS+Y8hZDivPhgjxRZbCY4q7zFEc6BukViF66w3fH7pDgMpCmaLCsbG"

    .line 2
    .line 3
    const-string v1, "yV5Ezpu/FJ5eBLvg/Gvr42qBX8KcXLyHBG0rFZzzuBY="

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Ljt1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    :try_start_0
    new-instance v0, Lkt1;

    .line 14
    .line 15
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-virtual {p0, p2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lkt1;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :catch_0
    move-exception p0

    .line 31
    new-instance p1, Ldt1;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_0
    new-instance p0, Ldt1;

    .line 38
    .line 39
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public static final t(Ljava/util/List;)V
    .locals 4

    .line 1
    sget-object v0, Lss1;->C:Ljt1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lss1;->C:Ljt1;

    .line 7
    .line 8
    iget-object v0, v0, Ljt1;->b:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    :try_start_0
    sget-object v1, Lmz1;->N2:Liz1;

    .line 19
    .line 20
    sget-object v2, Ltw1;->e:Ltw1;

    .line 21
    .line 22
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/Long;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 35
    .line 36
    invoke-interface {v0, p0, v1, v2, v3}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception p0

    .line 41
    sget-object v0, Llt1;->a:[C

    .line 42
    .line 43
    new-instance v0, Ljava/io/StringWriter;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v1, Ljava/io/PrintWriter;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(III)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, v1, Lss1;->f:Landroid/view/MotionEvent;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    sget-object v0, Lmz1;->K2:Liz1;

    .line 9
    .line 10
    sget-object v2, Ltw1;->e:Ltw1;

    .line 11
    .line 12
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Lss1;->o()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_2

    .line 32
    :cond_0
    iget-object v0, v1, Lss1;->f:Landroid/view/MotionEvent;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    iget-object v0, v1, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    move/from16 v2, p3

    .line 42
    .line 43
    int-to-long v4, v2

    .line 44
    move/from16 v2, p1

    .line 45
    .line 46
    int-to-float v2, v2

    .line 47
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 48
    .line 49
    mul-float v7, v2, v0

    .line 50
    .line 51
    move/from16 v2, p2

    .line 52
    .line 53
    int-to-float v2, v2

    .line 54
    mul-float v8, v2, v0

    .line 55
    .line 56
    const/4 v14, 0x0

    .line 57
    const/4 v15, 0x0

    .line 58
    const-wide/16 v2, 0x0

    .line 59
    .line 60
    const/4 v6, 0x1

    .line 61
    const/4 v9, 0x0

    .line 62
    const/4 v10, 0x0

    .line 63
    const/4 v11, 0x0

    .line 64
    const/4 v12, 0x0

    .line 65
    const/4 v13, 0x0

    .line 66
    invoke-static/range {v2 .. v15}, Landroid/view/MotionEvent;->obtain(JJIFFFFIFFII)Landroid/view/MotionEvent;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, v1, Lss1;->f:Landroid/view/MotionEvent;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const/4 v0, 0x0

    .line 74
    iput-object v0, v1, Lss1;->f:Landroid/view/MotionEvent;

    .line 75
    .line 76
    :goto_1
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, v1, Lss1;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    monitor-exit p0

    .line 80
    return-void

    .line 81
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    throw v0
.end method

.method public final b(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    const-string p1, "19"

    .line 2
    .line 3
    return-object p1
.end method

.method public final c([Ljava/lang/StackTraceElement;)V
    .locals 2

    .line 1
    sget-object v0, Lmz1;->b3:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lss1;->y:Ldm1;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, v0, Ldm1;->a:Ljava/util/List;

    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final d(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    .line 1
    sget-object v0, Llt1;->a:[C

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    move-object v2, p0

    .line 18
    move-object v3, p1

    .line 19
    invoke-virtual/range {v2 .. v7}, Lss1;->p(Landroid/content/Context;Ljava/lang/String;ILandroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "The caller must not be called from the UI thread."

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1
.end method

.method public final e(Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lmz1;->Q2:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lss1;->A:Lnt1;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Lss1;->C:Ljt1;

    .line 25
    .line 26
    new-instance v1, Lnt1;

    .line 27
    .line 28
    iget-object v2, v0, Ljt1;->a:Landroid/content/Context;

    .line 29
    .line 30
    iget-object v0, v0, Ljt1;->o:Let1;

    .line 31
    .line 32
    invoke-direct {v1, v2, v0}, Lnt1;-><init>(Landroid/content/Context;Let1;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lss1;->A:Lnt1;

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lss1;->A:Lnt1;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lnt1;->a(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final declared-synchronized f(Landroid/view/MotionEvent;)V
    .locals 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lss1;->v:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lss1;->o()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lss1;->v:Z

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x2

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    if-eq v0, v2, :cond_1

    .line 25
    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    float-to-double v3, v0

    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    float-to-double v5, v0

    .line 39
    iget-wide v7, p0, Lss1;->p:D

    .line 40
    .line 41
    sub-double v7, v3, v7

    .line 42
    .line 43
    iget-wide v9, p0, Lss1;->q:D

    .line 44
    .line 45
    sub-double v9, v5, v9

    .line 46
    .line 47
    iget-wide v11, p0, Lss1;->o:D

    .line 48
    .line 49
    mul-double/2addr v7, v7

    .line 50
    mul-double/2addr v9, v9

    .line 51
    add-double/2addr v9, v7

    .line 52
    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    add-double/2addr v11, v7

    .line 57
    iput-wide v11, p0, Lss1;->o:D

    .line 58
    .line 59
    iput-wide v3, p0, Lss1;->p:D

    .line 60
    .line 61
    iput-wide v5, p0, Lss1;->q:D

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    const-wide/16 v3, 0x0

    .line 65
    .line 66
    iput-wide v3, p0, Lss1;->o:D

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    float-to-double v3, v0

    .line 73
    iput-wide v3, p0, Lss1;->p:D

    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    float-to-double v3, v0

    .line 80
    iput-wide v3, p0, Lss1;->q:D

    .line 81
    .line 82
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    const-wide/16 v3, 0x1

    .line 87
    .line 88
    if-eqz v0, :cond_8

    .line 89
    .line 90
    if-eq v0, v2, :cond_6

    .line 91
    .line 92
    if-eq v0, v1, :cond_4

    .line 93
    .line 94
    const/4 p1, 0x3

    .line 95
    if-eq v0, p1, :cond_3

    .line 96
    .line 97
    goto/16 :goto_2

    .line 98
    .line 99
    :cond_3
    iget-wide v0, p0, Lss1;->k:J

    .line 100
    .line 101
    add-long/2addr v0, v3

    .line 102
    iput-wide v0, p0, Lss1;->k:J

    .line 103
    .line 104
    goto/16 :goto_2

    .line 105
    .line 106
    :cond_4
    iget-wide v0, p0, Lss1;->i:J

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    add-int/2addr v3, v2

    .line 113
    int-to-long v3, v3

    .line 114
    add-long/2addr v0, v3

    .line 115
    iput-wide v0, p0, Lss1;->i:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    :try_start_1
    invoke-virtual {p0, p1}, Lss1;->m(Landroid/view/MotionEvent;)Lkt1;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object v0, p1, Lkt1;->w:Ljava/lang/Long;

    .line 122
    .line 123
    if-eqz v0, :cond_5

    .line 124
    .line 125
    iget-object v1, p1, Lkt1;->z:Ljava/lang/Long;

    .line 126
    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    iget-wide v3, p0, Lss1;->m:J

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 132
    .line 133
    .line 134
    move-result-wide v0

    .line 135
    iget-object v5, p1, Lkt1;->z:Ljava/lang/Long;

    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 138
    .line 139
    .line 140
    move-result-wide v5

    .line 141
    add-long/2addr v0, v5

    .line 142
    add-long/2addr v0, v3

    .line 143
    iput-wide v0, p0, Lss1;->m:J

    .line 144
    .line 145
    :cond_5
    iget-object v0, p0, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 146
    .line 147
    if-eqz v0, :cond_9

    .line 148
    .line 149
    iget-object v0, p1, Lkt1;->x:Ljava/lang/Long;

    .line 150
    .line 151
    if-eqz v0, :cond_9

    .line 152
    .line 153
    iget-object v1, p1, Lkt1;->A:Ljava/lang/Long;

    .line 154
    .line 155
    if-eqz v1, :cond_9

    .line 156
    .line 157
    iget-wide v3, p0, Lss1;->n:J

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 160
    .line 161
    .line 162
    move-result-wide v0

    .line 163
    iget-object p1, p1, Lkt1;->A:Ljava/lang/Long;

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 166
    .line 167
    .line 168
    move-result-wide v5

    .line 169
    add-long/2addr v0, v5

    .line 170
    add-long/2addr v0, v3

    .line 171
    iput-wide v0, p0, Lss1;->n:J
    :try_end_1
    .catch Ldt1; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_6
    :try_start_2
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iput-object p1, p0, Lss1;->f:Landroid/view/MotionEvent;

    .line 179
    .line 180
    iget-object v0, p0, Lss1;->g:Ljava/util/LinkedList;

    .line 181
    .line 182
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    const/4 v1, 0x6

    .line 190
    if-le p1, v1, :cond_7

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, Landroid/view/MotionEvent;

    .line 197
    .line 198
    invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V

    .line 199
    .line 200
    .line 201
    :cond_7
    iget-wide v0, p0, Lss1;->j:J

    .line 202
    .line 203
    add-long/2addr v0, v3

    .line 204
    iput-wide v0, p0, Lss1;->j:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 205
    .line 206
    :try_start_3
    new-instance p1, Ljava/lang/Throwable;

    .line 207
    .line 208
    invoke-direct {p1}, Ljava/lang/Throwable;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-virtual {p0, p1}, Lss1;->n([Ljava/lang/StackTraceElement;)J

    .line 216
    .line 217
    .line 218
    move-result-wide v0

    .line 219
    iput-wide v0, p0, Lss1;->l:J
    :try_end_3
    .catch Ldt1; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_8
    :try_start_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    iput v0, p0, Lss1;->r:F

    .line 227
    .line 228
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    iput v0, p0, Lss1;->s:F

    .line 233
    .line 234
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    iput v0, p0, Lss1;->t:F

    .line 239
    .line 240
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    iput p1, p0, Lss1;->u:F

    .line 245
    .line 246
    iget-wide v0, p0, Lss1;->h:J

    .line 247
    .line 248
    add-long/2addr v0, v3

    .line 249
    iput-wide v0, p0, Lss1;->h:J

    .line 250
    .line 251
    :catch_0
    :cond_9
    :goto_2
    iput-boolean v2, p0, Lss1;->w:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 252
    .line 253
    monitor-exit p0

    .line 254
    return-void

    .line 255
    :goto_3
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 256
    throw p1
.end method

.method public final g(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v3, 0x3

    .line 2
    const/4 v5, 0x0

    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v4, p3

    .line 7
    invoke-virtual/range {v0 .. v5}, Lss1;->p(Landroid/content/Context;Ljava/lang/String;ILandroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final h(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v3, 0x3

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v4, p3

    .line 6
    move-object v5, p4

    .line 7
    invoke-virtual/range {v0 .. v5}, Lss1;->p(Landroid/content/Context;Ljava/lang/String;ILandroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final i(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v2, 0x0

    .line 2
    const/4 v3, 0x2

    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v4, p2

    .line 6
    move-object v5, p3

    .line 7
    invoke-virtual/range {v0 .. v5}, Lss1;->p(Landroid/content/Context;Ljava/lang/String;ILandroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final j(Landroid/content/Context;)Lfr1;
    .locals 13

    .line 1
    sget-object v0, Lss1;->H:Lpt1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, Lpt1;->d:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iput-wide v1, v0, Lpt1;->b:J

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lmz1;->S2:Liz1;

    .line 16
    .line 17
    sget-object v1, Ltw1;->e:Ltw1;

    .line 18
    .line 19
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 20
    .line 21
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    sget-object v0, Lss1;->I:Lxe1;

    .line 36
    .line 37
    iget-wide v2, v0, Lxe1;->a:J

    .line 38
    .line 39
    iput-wide v2, v0, Lxe1;->b:J

    .line 40
    .line 41
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    iput-wide v2, v0, Lxe1;->a:J

    .line 46
    .line 47
    :cond_1
    invoke-static {}, Lqr1;->C0()Lfr1;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget-object v0, p0, Lss1;->z:Lwy0;

    .line 52
    .line 53
    iget-object v2, v0, Lwy0;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    invoke-virtual {v6}, Ln54;->b()V

    .line 64
    .line 65
    .line 66
    iget-object v3, v6, Ln54;->g:Lp54;

    .line 67
    .line 68
    check-cast v3, Lqr1;

    .line 69
    .line 70
    invoke-virtual {v3, v2}, Lqr1;->F0(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    iget-boolean v2, v0, Lwy0;->f:Z

    .line 74
    .line 75
    invoke-static {p1, v2}, Lss1;->q(Landroid/content/Context;Z)Ljt1;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iget-object v2, v5, Ljt1;->b:Ljava/util/concurrent/ExecutorService;

    .line 80
    .line 81
    if-nez v2, :cond_3

    .line 82
    .line 83
    return-object v6

    .line 84
    :cond_3
    invoke-virtual {v5}, Ljt1;->e()I

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    new-instance v2, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    iget-boolean v3, v5, Ljt1;->n:Z

    .line 94
    .line 95
    if-nez v3, :cond_4

    .line 96
    .line 97
    const-wide/16 v0, 0x4000

    .line 98
    .line 99
    invoke-virtual {v6, v0, v1}, Lfr1;->h(J)V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_2

    .line 103
    .line 104
    :cond_4
    iget-object v0, v0, Lwy0;->h:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lyq1;

    .line 107
    .line 108
    new-instance v4, Lst1;

    .line 109
    .line 110
    sget-object v10, Lss1;->J:Lt83;

    .line 111
    .line 112
    move-object v8, p1

    .line 113
    move v7, v9

    .line 114
    move-object v9, v0

    .line 115
    invoke-direct/range {v4 .. v10}, Lst1;-><init>(Ljt1;Lfr1;ILandroid/content/Context;Lyq1;Lt83;)V

    .line 116
    .line 117
    .line 118
    move v9, v7

    .line 119
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    new-instance v4, Lut1;

    .line 123
    .line 124
    sget-wide v7, Lss1;->F:J

    .line 125
    .line 126
    invoke-direct/range {v4 .. v9}, Lut1;-><init>(Ljt1;Lfr1;JI)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    new-instance v0, Ltt1;

    .line 133
    .line 134
    const/4 v3, 0x3

    .line 135
    invoke-direct {v0, v5, v6, v9, v3}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    new-instance v0, Lqt1;

    .line 142
    .line 143
    invoke-direct {v0, v5, v6, v9, p1}, Lqt1;-><init>(Ljt1;Lfr1;ILandroid/content/Context;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    new-instance v0, Ltt1;

    .line 150
    .line 151
    const/4 v3, 0x4

    .line 152
    invoke-direct {v0, v5, v6, v9, v3}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    new-instance v0, Lrt1;

    .line 159
    .line 160
    invoke-direct {v0, v5, v6, v9, p1}, Lrt1;-><init>(Ljt1;Lfr1;ILandroid/content/Context;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    new-instance p1, Ltt1;

    .line 167
    .line 168
    const/4 v0, 0x7

    .line 169
    invoke-direct {p1, v5, v6, v9, v0}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    new-instance p1, Ltt1;

    .line 176
    .line 177
    const/16 v0, 0x9

    .line 178
    .line 179
    invoke-direct {p1, v5, v6, v9, v0}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    new-instance p1, Ltt1;

    .line 186
    .line 187
    const/16 v0, 0xa

    .line 188
    .line 189
    invoke-direct {p1, v5, v6, v9, v0}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    new-instance p1, Ltt1;

    .line 196
    .line 197
    const/4 v0, 0x0

    .line 198
    invoke-direct {p1, v5, v6, v9, v0}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    new-instance p1, Ltt1;

    .line 205
    .line 206
    const/4 v0, 0x2

    .line 207
    invoke-direct {p1, v5, v6, v9, v0}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    new-instance p1, Ltt1;

    .line 214
    .line 215
    const/16 v0, 0xd

    .line 216
    .line 217
    invoke-direct {p1, v5, v6, v9, v0}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    new-instance p1, Ltt1;

    .line 224
    .line 225
    const/4 v0, 0x6

    .line 226
    invoke-direct {p1, v5, v6, v9, v0}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    new-instance p1, Ltt1;

    .line 233
    .line 234
    const/16 v0, 0xc

    .line 235
    .line 236
    invoke-direct {p1, v5, v6, v9, v0}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    new-instance p1, Ldu1;

    .line 243
    .line 244
    invoke-direct {p1, v5, v6, v9}, Ldu1;-><init>(Ljt1;Lfr1;I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    sget-object p1, Lmz1;->J3:Liz1;

    .line 251
    .line 252
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    check-cast p1, Ljava/lang/Boolean;

    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    if-eqz p1, :cond_7

    .line 263
    .line 264
    sget-object p1, Lss1;->H:Lpt1;

    .line 265
    .line 266
    const-wide/16 v3, -0x1

    .line 267
    .line 268
    if-eqz p1, :cond_6

    .line 269
    .line 270
    iget-boolean v0, p1, Lpt1;->d:Z

    .line 271
    .line 272
    if-eqz v0, :cond_5

    .line 273
    .line 274
    iget-wide v7, p1, Lpt1;->b:J

    .line 275
    .line 276
    iget-wide v10, p1, Lpt1;->a:J

    .line 277
    .line 278
    sub-long/2addr v7, v10

    .line 279
    goto :goto_0

    .line 280
    :cond_5
    move-wide v7, v3

    .line 281
    :goto_0
    iget-wide v10, p1, Lpt1;->c:J

    .line 282
    .line 283
    iput-wide v3, p1, Lpt1;->c:J

    .line 284
    .line 285
    move-wide v3, v7

    .line 286
    move-wide v11, v10

    .line 287
    goto :goto_1

    .line 288
    :cond_6
    move-wide v11, v3

    .line 289
    :goto_1
    new-instance p1, Lcu1;

    .line 290
    .line 291
    sget-object v8, Lss1;->G:Lzs1;

    .line 292
    .line 293
    move v7, v9

    .line 294
    move-wide v9, v3

    .line 295
    move-object v4, p1

    .line 296
    invoke-direct/range {v4 .. v12}, Lcu1;-><init>(Ljt1;Lfr1;ILzs1;JJ)V

    .line 297
    .line 298
    .line 299
    move v9, v7

    .line 300
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    :cond_7
    sget-object p1, Lmz1;->I3:Liz1;

    .line 304
    .line 305
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    check-cast p1, Ljava/lang/Boolean;

    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    if-eqz p1, :cond_8

    .line 316
    .line 317
    new-instance p1, Ltt1;

    .line 318
    .line 319
    const/16 v0, 0xb

    .line 320
    .line 321
    invoke-direct {p1, v5, v6, v9, v0}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    :cond_8
    new-instance v4, Ltt1;

    .line 328
    .line 329
    const/16 v10, 0x4c

    .line 330
    .line 331
    const/16 v11, 0x8

    .line 332
    .line 333
    move-object v8, v6

    .line 334
    const-string v6, "71OvRH8RKLL5CGPm3dKOf5cGs3Y2jxvT4WismqAQzm1qJBvyLIz7vuBnvO3+wiyt"

    .line 335
    .line 336
    const-string v7, "6gmo4xnyZNalDG+/4eFYRg3H75rhcg0JPASG/y34gQ8="

    .line 337
    .line 338
    invoke-direct/range {v4 .. v11}, Ltt1;-><init>(Ljt1;Ljava/lang/String;Ljava/lang/String;Lfr1;III)V

    .line 339
    .line 340
    .line 341
    move-object v6, v8

    .line 342
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    sget-object p1, Lmz1;->M3:Liz1;

    .line 346
    .line 347
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    check-cast p1, Ljava/lang/Boolean;

    .line 352
    .line 353
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 354
    .line 355
    .line 356
    move-result p1

    .line 357
    if-eqz p1, :cond_9

    .line 358
    .line 359
    new-instance p1, Ltt1;

    .line 360
    .line 361
    const/4 v0, 0x5

    .line 362
    invoke-direct {p1, v5, v6, v9, v0}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    :cond_9
    sget-object p1, Lmz1;->N3:Liz1;

    .line 369
    .line 370
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    check-cast p1, Ljava/lang/Boolean;

    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 377
    .line 378
    .line 379
    move-result p1

    .line 380
    if-eqz p1, :cond_a

    .line 381
    .line 382
    new-instance v4, Ltt1;

    .line 383
    .line 384
    const/16 v10, 0x52

    .line 385
    .line 386
    const/4 v11, 0x1

    .line 387
    move-object v8, v6

    .line 388
    const-string v6, "gyMGe4SoPVIhBgFM+VlZQFWek2IoqCotue6ayBNgVb95WbB68suDu+Zv4jWiM6iG"

    .line 389
    .line 390
    const-string v7, "etp1batKULd2kwg+5GPfxliTu8RjfdN0zKvZOjQe8mU="

    .line 391
    .line 392
    invoke-direct/range {v4 .. v11}, Ltt1;-><init>(Ljt1;Ljava/lang/String;Ljava/lang/String;Lfr1;III)V

    .line 393
    .line 394
    .line 395
    move-object v6, v8

    .line 396
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    :cond_a
    :goto_2
    invoke-static {v2}, Lss1;->t(Ljava/util/List;)V

    .line 400
    .line 401
    .line 402
    return-object v6
.end method

.method public final k(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Lfr1;
    .locals 10

    .line 1
    sget-object v0, Lss1;->H:Lpt1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, Lpt1;->d:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iput-wide v1, v0, Lpt1;->b:J

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lmz1;->S2:Liz1;

    .line 16
    .line 17
    sget-object v1, Ltw1;->e:Ltw1;

    .line 18
    .line 19
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    sget-object v0, Lss1;->I:Lxe1;

    .line 34
    .line 35
    iget-wide v1, v0, Lxe1;->g:J

    .line 36
    .line 37
    iput-wide v1, v0, Lxe1;->h:J

    .line 38
    .line 39
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    iput-wide v1, v0, Lxe1;->g:J

    .line 44
    .line 45
    :cond_1
    invoke-static {}, Lqr1;->C0()Lfr1;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    iget-object v0, p0, Lss1;->z:Lwy0;

    .line 50
    .line 51
    iget-object v1, v0, Lwy0;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_2

    .line 60
    .line 61
    invoke-virtual {v5}, Ln54;->b()V

    .line 62
    .line 63
    .line 64
    iget-object v2, v5, Ln54;->g:Lp54;

    .line 65
    .line 66
    check-cast v2, Lqr1;

    .line 67
    .line 68
    invoke-virtual {v2, v1}, Lqr1;->F0(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    iget-boolean v0, v0, Lwy0;->f:Z

    .line 72
    .line 73
    invoke-static {p1, v0}, Lss1;->q(Landroid/content/Context;Z)Ljt1;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    const/4 v8, 0x1

    .line 78
    move-object v3, p0

    .line 79
    move-object v9, p1

    .line 80
    move-object v6, p2

    .line 81
    move-object v7, p3

    .line 82
    invoke-virtual/range {v3 .. v9}, Lss1;->s(Ljt1;Lfr1;Landroid/view/View;Landroid/app/Activity;ZLandroid/content/Context;)V

    .line 83
    .line 84
    .line 85
    return-object v5
.end method

.method public final l(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Lfr1;
    .locals 8

    .line 1
    sget-object v0, Lss1;->H:Lpt1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, Lpt1;->d:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iput-wide v1, v0, Lpt1;->b:J

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lmz1;->S2:Liz1;

    .line 16
    .line 17
    sget-object v1, Ltw1;->e:Ltw1;

    .line 18
    .line 19
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    sget-object v0, Lss1;->I:Lxe1;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2}, Lxe1;->b(Landroid/content/Context;Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-static {}, Lqr1;->C0()Lfr1;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v0, p0, Lss1;->z:Lwy0;

    .line 43
    .line 44
    iget-object v1, v0, Lwy0;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v3}, Ln54;->b()V

    .line 49
    .line 50
    .line 51
    iget-object v2, v3, Ln54;->g:Lp54;

    .line 52
    .line 53
    check-cast v2, Lqr1;

    .line 54
    .line 55
    invoke-virtual {v2, v1}, Lqr1;->F0(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-boolean v0, v0, Lwy0;->f:Z

    .line 59
    .line 60
    invoke-static {p1, v0}, Lss1;->q(Landroid/content/Context;Z)Ljt1;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const/4 v6, 0x0

    .line 65
    move-object v1, p0

    .line 66
    move-object v7, p1

    .line 67
    move-object v4, p2

    .line 68
    move-object v5, p3

    .line 69
    invoke-virtual/range {v1 .. v7}, Lss1;->s(Ljt1;Lfr1;Landroid/view/View;Landroid/app/Activity;ZLandroid/content/Context;)V

    .line 70
    .line 71
    .line 72
    return-object v3
.end method

.method public final m(Landroid/view/MotionEvent;)Lkt1;
    .locals 3

    .line 1
    sget-object v0, Lss1;->C:Ljt1;

    .line 2
    .line 3
    const-string v1, "0F2tRPtJ+oackwCEaR1ilzSWBDq3birdEdy954kTVJ/3hlaiiP5kh1SmVilvcwVI"

    .line 4
    .line 5
    const-string v2, "bSUQaKDGEujzsstvFAmuaLuv9mtefCQQKWZn9uZj/LI="

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ljt1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    :try_start_0
    new-instance v1, Lkt1;

    .line 16
    .line 17
    iget-object v2, p0, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    filled-new-array {p1, v2}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v0, v2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-direct {v1, p1}, Lkt1;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :catch_0
    move-exception p1

    .line 35
    goto :goto_0

    .line 36
    :catch_1
    move-exception p1

    .line 37
    :goto_0
    new-instance v0, Ldt1;

    .line 38
    .line 39
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_0
    new-instance p1, Ldt1;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 46
    .line 47
    .line 48
    throw p1
.end method

.method public final n([Ljava/lang/StackTraceElement;)J
    .locals 3

    .line 1
    sget-object v0, Lss1;->C:Ljt1;

    .line 2
    .line 3
    const-string v1, "ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD"

    .line 4
    .line 5
    const-string v2, "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk="

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ljt1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    :try_start_0
    new-instance v1, Lys1;

    .line 16
    .line 17
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {v0, v2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {v1, p1}, Lys1;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v1, Lys1;->u:Ljava/lang/Long;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    return-wide v0

    .line 38
    :catch_0
    move-exception p1

    .line 39
    goto :goto_0

    .line 40
    :catch_1
    move-exception p1

    .line 41
    :goto_0
    new-instance v0, Ldt1;

    .line 42
    .line 43
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_0
    new-instance p1, Ldt1;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public final o()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lss1;->l:J

    .line 4
    .line 5
    iput-wide v0, p0, Lss1;->h:J

    .line 6
    .line 7
    iput-wide v0, p0, Lss1;->i:J

    .line 8
    .line 9
    iput-wide v0, p0, Lss1;->j:J

    .line 10
    .line 11
    iput-wide v0, p0, Lss1;->k:J

    .line 12
    .line 13
    iput-wide v0, p0, Lss1;->m:J

    .line 14
    .line 15
    iput-wide v0, p0, Lss1;->n:J

    .line 16
    .line 17
    iget-object v0, p0, Lss1;->g:Ljava/util/LinkedList;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Landroid/view/MotionEvent;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v0, p0, Lss1;->f:Landroid/view/MotionEvent;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 57
    iput-object v0, p0, Lss1;->f:Landroid/view/MotionEvent;

    .line 58
    .line 59
    return-void
.end method

.method public final p(Landroid/content/Context;Ljava/lang/String;ILandroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v6

    .line 17
    sget-object v8, Lmz1;->M2:Liz1;

    .line 18
    .line 19
    sget-object v9, Ltw1;->e:Ltw1;

    .line 20
    .line 21
    iget-object v9, v9, Ltw1;->c:Lkz1;

    .line 22
    .line 23
    invoke-virtual {v9, v8}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    check-cast v8, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    const/4 v9, 0x0

    .line 34
    if-eqz v8, :cond_1

    .line 35
    .line 36
    sget-object v10, Lss1;->C:Ljt1;

    .line 37
    .line 38
    if-eqz v10, :cond_0

    .line 39
    .line 40
    sget-object v10, Lss1;->C:Ljt1;

    .line 41
    .line 42
    iget-object v10, v10, Ljt1;->k:Lqs1;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v10, v9

    .line 46
    :goto_0
    const-string v11, "be"

    .line 47
    .line 48
    move-object v12, v10

    .line 49
    move-object/from16 v17, v11

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move-object v12, v9

    .line 53
    move-object/from16 v17, v12

    .line 54
    .line 55
    :goto_1
    const/4 v10, 0x1

    .line 56
    const/4 v11, 0x2

    .line 57
    const/4 v13, 0x3

    .line 58
    if-ne v3, v13, :cond_2

    .line 59
    .line 60
    :try_start_0
    invoke-virtual {v1, v0, v4, v5}, Lss1;->k(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Lfr1;

    .line 61
    .line 62
    .line 63
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 64
    :try_start_1
    iput-boolean v10, v1, Lss1;->v:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    .line 66
    const/16 v0, 0x3ea

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catch_0
    move-exception v0

    .line 70
    move-object/from16 v18, v0

    .line 71
    .line 72
    move v5, v13

    .line 73
    goto :goto_5

    .line 74
    :catch_1
    move-exception v0

    .line 75
    move v5, v13

    .line 76
    goto :goto_4

    .line 77
    :cond_2
    if-ne v3, v11, :cond_3

    .line 78
    .line 79
    :try_start_2
    invoke-virtual {v1, v0, v4, v5}, Lss1;->l(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Lfr1;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const/16 v0, 0x3f0

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    invoke-virtual/range {p0 .. p1}, Lss1;->j(Landroid/content/Context;)Lfr1;

    .line 87
    .line 88
    .line 89
    move-result-object v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 90
    const/16 v0, 0x3e8

    .line 91
    .line 92
    :goto_2
    if-eqz v8, :cond_4

    .line 93
    .line 94
    if-eqz v12, :cond_4

    .line 95
    .line 96
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 97
    .line 98
    .line 99
    move-result-wide v14
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 100
    sub-long v15, v14, v6

    .line 101
    .line 102
    const/4 v14, -0x1

    .line 103
    const/16 v18, 0x0

    .line 104
    .line 105
    move v5, v13

    .line 106
    move v13, v0

    .line 107
    :try_start_4
    invoke-virtual/range {v12 .. v18}, Lqs1;->a(IIJLjava/lang/String;Ljava/lang/Exception;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 108
    .line 109
    .line 110
    goto :goto_8

    .line 111
    :catch_2
    move-exception v0

    .line 112
    goto :goto_3

    .line 113
    :catch_3
    move-exception v0

    .line 114
    move v5, v13

    .line 115
    :goto_3
    move-object/from16 v18, v0

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_4
    move v5, v13

    .line 119
    goto :goto_8

    .line 120
    :goto_4
    move-object/from16 v18, v0

    .line 121
    .line 122
    move-object v4, v9

    .line 123
    :goto_5
    if-eqz v8, :cond_7

    .line 124
    .line 125
    if-eqz v12, :cond_7

    .line 126
    .line 127
    if-ne v3, v5, :cond_5

    .line 128
    .line 129
    const/16 v0, 0x3eb

    .line 130
    .line 131
    :goto_6
    move v13, v0

    .line 132
    goto :goto_7

    .line 133
    :cond_5
    if-ne v3, v11, :cond_6

    .line 134
    .line 135
    const/16 v0, 0x3f1

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_6
    const/16 v0, 0x3e9

    .line 139
    .line 140
    move v13, v0

    .line 141
    move v3, v10

    .line 142
    :goto_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 143
    .line 144
    .line 145
    move-result-wide v14

    .line 146
    sub-long v15, v14, v6

    .line 147
    .line 148
    const/4 v14, -0x1

    .line 149
    invoke-virtual/range {v12 .. v18}, Lqs1;->a(IIJLjava/lang/String;Ljava/lang/Exception;)V

    .line 150
    .line 151
    .line 152
    :cond_7
    :goto_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 153
    .line 154
    .line 155
    move-result-wide v6

    .line 156
    if-eqz v4, :cond_c

    .line 157
    .line 158
    :try_start_5
    invoke-virtual {v4}, Ln54;->d()Lp54;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Lqr1;

    .line 163
    .line 164
    invoke-virtual {v0, v9}, Lp54;->d(Lv64;)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_8

    .line 169
    .line 170
    goto :goto_c

    .line 171
    :cond_8
    invoke-virtual {v4}, Ln54;->d()Lp54;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, Lqr1;

    .line 176
    .line 177
    sget-boolean v4, Lhs1;->a:Z

    .line 178
    .line 179
    invoke-virtual {v0}, Ls44;->b()[B

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {v2, v0}, Lhs1;->b(Ljava/lang/String;[B)Lbs1;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    if-nez v0, :cond_9

    .line 188
    .line 189
    invoke-static {}, Lqr1;->C0()Lfr1;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-wide/16 v13, 0x1000

    .line 194
    .line 195
    invoke-virtual {v0, v13, v14}, Lfr1;->h(J)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Lqr1;

    .line 203
    .line 204
    invoke-virtual {v0}, Ls44;->b()[B

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v0, v2, v10}, Lhs1;->d([BLjava/lang/String;Z)[B

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    goto :goto_9

    .line 213
    :cond_9
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    check-cast v0, Lcs1;

    .line 218
    .line 219
    invoke-virtual {v0}, Ls44;->b()[B

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    :goto_9
    const/16 v2, 0xb

    .line 224
    .line 225
    invoke-static {v0, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    if-eqz v8, :cond_f

    .line 230
    .line 231
    if-eqz v12, :cond_f

    .line 232
    .line 233
    if-ne v3, v5, :cond_a

    .line 234
    .line 235
    const/16 v2, 0x3ee

    .line 236
    .line 237
    :goto_a
    move v13, v2

    .line 238
    goto :goto_b

    .line 239
    :cond_a
    if-ne v3, v11, :cond_b

    .line 240
    .line 241
    const/16 v2, 0x3f2

    .line 242
    .line 243
    goto :goto_a

    .line 244
    :cond_b
    const/16 v2, 0x3ec

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :goto_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 248
    .line 249
    .line 250
    move-result-wide v9

    .line 251
    sub-long v15, v9, v6

    .line 252
    .line 253
    const/4 v14, -0x1

    .line 254
    const/16 v18, 0x0

    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Lqs1;->a(IIJLjava/lang/String;Ljava/lang/Exception;)V

    .line 257
    .line 258
    .line 259
    goto :goto_10

    .line 260
    :catch_4
    move-exception v0

    .line 261
    move-object/from16 v18, v0

    .line 262
    .line 263
    goto :goto_d

    .line 264
    :cond_c
    :goto_c
    const/4 v0, 0x5

    .line 265
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 269
    goto :goto_10

    .line 270
    :goto_d
    const/4 v0, 0x7

    .line 271
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    if-eqz v8, :cond_f

    .line 276
    .line 277
    if-eqz v12, :cond_f

    .line 278
    .line 279
    if-ne v3, v5, :cond_d

    .line 280
    .line 281
    const/16 v2, 0x3ef

    .line 282
    .line 283
    :goto_e
    move v13, v2

    .line 284
    goto :goto_f

    .line 285
    :cond_d
    if-ne v3, v11, :cond_e

    .line 286
    .line 287
    const/16 v2, 0x3f3

    .line 288
    .line 289
    goto :goto_e

    .line 290
    :cond_e
    const/16 v2, 0x3ed

    .line 291
    .line 292
    goto :goto_e

    .line 293
    :goto_f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 294
    .line 295
    .line 296
    move-result-wide v2

    .line 297
    sub-long v15, v2, v6

    .line 298
    .line 299
    const/4 v14, -0x1

    .line 300
    invoke-virtual/range {v12 .. v18}, Lqs1;->a(IIJLjava/lang/String;Ljava/lang/Exception;)V

    .line 301
    .line 302
    .line 303
    :cond_f
    :goto_10
    return-object v0
.end method

.method public final s(Ljt1;Lfr1;Landroid/view/View;Landroid/app/Activity;ZLandroid/content/Context;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move-object/from16 v4, p2

    .line 6
    .line 7
    iget-boolean v0, v3, Ljt1;->n:Z

    .line 8
    .line 9
    const/4 v11, 0x0

    .line 10
    const/4 v12, 0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-wide/16 v5, 0x4000

    .line 14
    .line 15
    invoke-virtual {v4, v5, v6}, Lfr1;->h(J)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lgs1;

    .line 19
    .line 20
    invoke-direct {v0, v3, v4, v12}, Lgs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    new-array v2, v12, [Ljava/util/concurrent/Callable;

    .line 24
    .line 25
    aput-object v0, v2, v11

    .line 26
    .line 27
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto/16 :goto_c

    .line 32
    .line 33
    :cond_0
    monitor-enter p0

    .line 34
    :try_start_0
    iget-object v0, v1, Lss1;->f:Landroid/view/MotionEvent;

    .line 35
    .line 36
    iget-object v2, v1, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 37
    .line 38
    invoke-static {v3, v0, v2}, Lss1;->r(Ljt1;Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Lkt1;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v2, v0, Lkt1;->t:Ljava/lang/Long;

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    invoke-virtual {v4}, Ln54;->b()V

    .line 51
    .line 52
    .line 53
    iget-object v2, v4, Ln54;->g:Lp54;

    .line 54
    .line 55
    check-cast v2, Lqr1;

    .line 56
    .line 57
    invoke-virtual {v2, v5, v6}, Lqr1;->L0(J)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto/16 :goto_d

    .line 63
    .line 64
    :cond_1
    :goto_0
    iget-object v2, v0, Lkt1;->u:Ljava/lang/Long;

    .line 65
    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v5

    .line 72
    invoke-virtual {v4}, Ln54;->b()V

    .line 73
    .line 74
    .line 75
    iget-object v2, v4, Ln54;->g:Lp54;

    .line 76
    .line 77
    check-cast v2, Lqr1;

    .line 78
    .line 79
    invoke-virtual {v2, v5, v6}, Lqr1;->M0(J)V

    .line 80
    .line 81
    .line 82
    :cond_2
    iget-object v2, v0, Lkt1;->v:Ljava/lang/Long;

    .line 83
    .line 84
    if-eqz v2, :cond_3

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v5

    .line 90
    invoke-virtual {v4}, Ln54;->b()V

    .line 91
    .line 92
    .line 93
    iget-object v2, v4, Ln54;->g:Lp54;

    .line 94
    .line 95
    check-cast v2, Lqr1;

    .line 96
    .line 97
    invoke-virtual {v2, v5, v6}, Lqr1;->N0(J)V

    .line 98
    .line 99
    .line 100
    :cond_3
    iget-boolean v2, v1, Lss1;->w:Z

    .line 101
    .line 102
    if-eqz v2, :cond_5

    .line 103
    .line 104
    iget-object v2, v0, Lkt1;->w:Ljava/lang/Long;

    .line 105
    .line 106
    if-eqz v2, :cond_4

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 109
    .line 110
    .line 111
    move-result-wide v5

    .line 112
    invoke-virtual {v4}, Ln54;->b()V

    .line 113
    .line 114
    .line 115
    iget-object v2, v4, Ln54;->g:Lp54;

    .line 116
    .line 117
    check-cast v2, Lqr1;

    .line 118
    .line 119
    invoke-virtual {v2, v5, v6}, Lqr1;->G(J)V

    .line 120
    .line 121
    .line 122
    :cond_4
    iget-object v0, v0, Lkt1;->x:Ljava/lang/Long;

    .line 123
    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v5

    .line 130
    invoke-virtual {v4}, Ln54;->b()V

    .line 131
    .line 132
    .line 133
    iget-object v0, v4, Ln54;->g:Lp54;

    .line 134
    .line 135
    check-cast v0, Lqr1;

    .line 136
    .line 137
    invoke-virtual {v0, v5, v6}, Lqr1;->H(J)V
    :try_end_0
    .catch Ldt1; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    .line 139
    .line 140
    :catch_0
    :cond_5
    :try_start_1
    invoke-static {}, Lnr1;->A()Lmr1;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iget-wide v5, v1, Lss1;->h:J

    .line 145
    .line 146
    const-wide/16 v7, 0x0

    .line 147
    .line 148
    cmp-long v2, v5, v7

    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    if-lez v2, :cond_8

    .line 152
    .line 153
    iget-object v2, v1, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 154
    .line 155
    sget-object v6, Llt1;->a:[C

    .line 156
    .line 157
    if-eqz v2, :cond_6

    .line 158
    .line 159
    iget v6, v2, Landroid/util/DisplayMetrics;->density:F

    .line 160
    .line 161
    cmpl-float v6, v6, v5

    .line 162
    .line 163
    if-eqz v6, :cond_6

    .line 164
    .line 165
    move v6, v12

    .line 166
    goto :goto_1

    .line 167
    :cond_6
    move v6, v11

    .line 168
    :goto_1
    if-eqz v6, :cond_8

    .line 169
    .line 170
    iget-wide v9, v1, Lss1;->o:D

    .line 171
    .line 172
    invoke-static {v9, v10, v2}, Llt1;->b(DLandroid/util/DisplayMetrics;)J

    .line 173
    .line 174
    .line 175
    move-result-wide v9

    .line 176
    invoke-virtual {v0}, Ln54;->b()V

    .line 177
    .line 178
    .line 179
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 180
    .line 181
    check-cast v2, Lnr1;

    .line 182
    .line 183
    invoke-virtual {v2, v9, v10}, Lnr1;->M(J)V

    .line 184
    .line 185
    .line 186
    iget v2, v1, Lss1;->t:F

    .line 187
    .line 188
    iget v6, v1, Lss1;->r:F

    .line 189
    .line 190
    sub-float/2addr v2, v6

    .line 191
    iget-object v6, v1, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 192
    .line 193
    float-to-double v9, v2

    .line 194
    invoke-static {v9, v10, v6}, Llt1;->b(DLandroid/util/DisplayMetrics;)J

    .line 195
    .line 196
    .line 197
    move-result-wide v9

    .line 198
    invoke-virtual {v0}, Ln54;->b()V

    .line 199
    .line 200
    .line 201
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 202
    .line 203
    check-cast v2, Lnr1;

    .line 204
    .line 205
    invoke-virtual {v2, v9, v10}, Lnr1;->N(J)V

    .line 206
    .line 207
    .line 208
    iget v2, v1, Lss1;->u:F

    .line 209
    .line 210
    iget v6, v1, Lss1;->s:F

    .line 211
    .line 212
    sub-float/2addr v2, v6

    .line 213
    iget-object v6, v1, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 214
    .line 215
    float-to-double v9, v2

    .line 216
    invoke-static {v9, v10, v6}, Llt1;->b(DLandroid/util/DisplayMetrics;)J

    .line 217
    .line 218
    .line 219
    move-result-wide v9

    .line 220
    invoke-virtual {v0}, Ln54;->b()V

    .line 221
    .line 222
    .line 223
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 224
    .line 225
    check-cast v2, Lnr1;

    .line 226
    .line 227
    invoke-virtual {v2, v9, v10}, Lnr1;->O(J)V

    .line 228
    .line 229
    .line 230
    iget v2, v1, Lss1;->r:F

    .line 231
    .line 232
    float-to-double v9, v2

    .line 233
    iget-object v2, v1, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 234
    .line 235
    invoke-static {v9, v10, v2}, Llt1;->b(DLandroid/util/DisplayMetrics;)J

    .line 236
    .line 237
    .line 238
    move-result-wide v9

    .line 239
    invoke-virtual {v0}, Ln54;->b()V

    .line 240
    .line 241
    .line 242
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 243
    .line 244
    check-cast v2, Lnr1;

    .line 245
    .line 246
    invoke-virtual {v2, v9, v10}, Lnr1;->R(J)V

    .line 247
    .line 248
    .line 249
    iget v2, v1, Lss1;->s:F

    .line 250
    .line 251
    float-to-double v9, v2

    .line 252
    iget-object v2, v1, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 253
    .line 254
    invoke-static {v9, v10, v2}, Llt1;->b(DLandroid/util/DisplayMetrics;)J

    .line 255
    .line 256
    .line 257
    move-result-wide v9

    .line 258
    invoke-virtual {v0}, Ln54;->b()V

    .line 259
    .line 260
    .line 261
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 262
    .line 263
    check-cast v2, Lnr1;

    .line 264
    .line 265
    invoke-virtual {v2, v9, v10}, Lnr1;->S(J)V

    .line 266
    .line 267
    .line 268
    iget-boolean v2, v1, Lss1;->w:Z

    .line 269
    .line 270
    if-eqz v2, :cond_8

    .line 271
    .line 272
    iget-object v2, v1, Lss1;->f:Landroid/view/MotionEvent;

    .line 273
    .line 274
    if-eqz v2, :cond_8

    .line 275
    .line 276
    iget v6, v1, Lss1;->r:F

    .line 277
    .line 278
    iget v9, v1, Lss1;->t:F

    .line 279
    .line 280
    sub-float/2addr v6, v9

    .line 281
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getRawX()F

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    add-float/2addr v6, v2

    .line 286
    iget-object v2, v1, Lss1;->f:Landroid/view/MotionEvent;

    .line 287
    .line 288
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    sub-float/2addr v6, v2

    .line 293
    iget-object v2, v1, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 294
    .line 295
    float-to-double v9, v6

    .line 296
    invoke-static {v9, v10, v2}, Llt1;->b(DLandroid/util/DisplayMetrics;)J

    .line 297
    .line 298
    .line 299
    move-result-wide v9

    .line 300
    cmp-long v2, v9, v7

    .line 301
    .line 302
    if-eqz v2, :cond_7

    .line 303
    .line 304
    invoke-virtual {v0}, Ln54;->b()V

    .line 305
    .line 306
    .line 307
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 308
    .line 309
    check-cast v2, Lnr1;

    .line 310
    .line 311
    invoke-virtual {v2, v9, v10}, Lnr1;->P(J)V

    .line 312
    .line 313
    .line 314
    :cond_7
    iget v2, v1, Lss1;->s:F

    .line 315
    .line 316
    iget v6, v1, Lss1;->u:F

    .line 317
    .line 318
    sub-float/2addr v2, v6

    .line 319
    iget-object v6, v1, Lss1;->f:Landroid/view/MotionEvent;

    .line 320
    .line 321
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getRawY()F

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    add-float/2addr v2, v6

    .line 326
    iget-object v6, v1, Lss1;->f:Landroid/view/MotionEvent;

    .line 327
    .line 328
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    sub-float/2addr v2, v6

    .line 333
    iget-object v6, v1, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 334
    .line 335
    float-to-double v9, v2

    .line 336
    invoke-static {v9, v10, v6}, Llt1;->b(DLandroid/util/DisplayMetrics;)J

    .line 337
    .line 338
    .line 339
    move-result-wide v9

    .line 340
    cmp-long v2, v9, v7

    .line 341
    .line 342
    if-eqz v2, :cond_8

    .line 343
    .line 344
    invoke-virtual {v0}, Ln54;->b()V

    .line 345
    .line 346
    .line 347
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 348
    .line 349
    check-cast v2, Lnr1;

    .line 350
    .line 351
    invoke-virtual {v2, v9, v10}, Lnr1;->Q(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 352
    .line 353
    .line 354
    :cond_8
    :try_start_2
    iget-object v2, v1, Lss1;->f:Landroid/view/MotionEvent;

    .line 355
    .line 356
    invoke-virtual {v1, v2}, Lss1;->m(Landroid/view/MotionEvent;)Lkt1;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    iget-object v6, v2, Lkt1;->t:Ljava/lang/Long;

    .line 361
    .line 362
    if-eqz v6, :cond_9

    .line 363
    .line 364
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 365
    .line 366
    .line 367
    move-result-wide v9

    .line 368
    invoke-virtual {v0}, Ln54;->b()V

    .line 369
    .line 370
    .line 371
    iget-object v6, v0, Ln54;->g:Lp54;

    .line 372
    .line 373
    check-cast v6, Lnr1;

    .line 374
    .line 375
    invoke-virtual {v6, v9, v10}, Lnr1;->B(J)V

    .line 376
    .line 377
    .line 378
    :cond_9
    iget-object v6, v2, Lkt1;->u:Ljava/lang/Long;

    .line 379
    .line 380
    if-eqz v6, :cond_a

    .line 381
    .line 382
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 383
    .line 384
    .line 385
    move-result-wide v9

    .line 386
    invoke-virtual {v0}, Ln54;->b()V

    .line 387
    .line 388
    .line 389
    iget-object v6, v0, Ln54;->g:Lp54;

    .line 390
    .line 391
    check-cast v6, Lnr1;

    .line 392
    .line 393
    invoke-virtual {v6, v9, v10}, Lnr1;->C(J)V

    .line 394
    .line 395
    .line 396
    :cond_a
    iget-object v6, v2, Lkt1;->v:Ljava/lang/Long;

    .line 397
    .line 398
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 399
    .line 400
    .line 401
    move-result-wide v9

    .line 402
    invoke-virtual {v0}, Ln54;->b()V

    .line 403
    .line 404
    .line 405
    iget-object v6, v0, Ln54;->g:Lp54;

    .line 406
    .line 407
    check-cast v6, Lnr1;

    .line 408
    .line 409
    invoke-virtual {v6, v9, v10}, Lnr1;->I(J)V

    .line 410
    .line 411
    .line 412
    iget-boolean v6, v1, Lss1;->w:Z

    .line 413
    .line 414
    if-eqz v6, :cond_16

    .line 415
    .line 416
    iget-object v6, v2, Lkt1;->x:Ljava/lang/Long;

    .line 417
    .line 418
    if-eqz v6, :cond_b

    .line 419
    .line 420
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 421
    .line 422
    .line 423
    move-result-wide v9

    .line 424
    invoke-virtual {v0}, Ln54;->b()V

    .line 425
    .line 426
    .line 427
    iget-object v6, v0, Ln54;->g:Lp54;

    .line 428
    .line 429
    check-cast v6, Lnr1;

    .line 430
    .line 431
    invoke-virtual {v6, v9, v10}, Lnr1;->D(J)V

    .line 432
    .line 433
    .line 434
    :cond_b
    iget-object v6, v2, Lkt1;->w:Ljava/lang/Long;

    .line 435
    .line 436
    if-eqz v6, :cond_c

    .line 437
    .line 438
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 439
    .line 440
    .line 441
    move-result-wide v9

    .line 442
    invoke-virtual {v0}, Ln54;->b()V

    .line 443
    .line 444
    .line 445
    iget-object v6, v0, Ln54;->g:Lp54;

    .line 446
    .line 447
    check-cast v6, Lnr1;

    .line 448
    .line 449
    invoke-virtual {v6, v9, v10}, Lnr1;->G(J)V

    .line 450
    .line 451
    .line 452
    :cond_c
    iget-object v6, v2, Lkt1;->y:Ljava/lang/Long;

    .line 453
    .line 454
    if-eqz v6, :cond_e

    .line 455
    .line 456
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 457
    .line 458
    .line 459
    move-result-wide v9

    .line 460
    cmp-long v6, v9, v7

    .line 461
    .line 462
    if-eqz v6, :cond_d

    .line 463
    .line 464
    const/4 v6, 0x2

    .line 465
    goto :goto_2

    .line 466
    :cond_d
    move v6, v12

    .line 467
    :goto_2
    invoke-virtual {v0}, Ln54;->b()V

    .line 468
    .line 469
    .line 470
    iget-object v9, v0, Ln54;->g:Lp54;

    .line 471
    .line 472
    check-cast v9, Lnr1;

    .line 473
    .line 474
    invoke-virtual {v9, v6}, Lnr1;->T(I)V

    .line 475
    .line 476
    .line 477
    :cond_e
    iget-wide v9, v1, Lss1;->i:J

    .line 478
    .line 479
    cmp-long v6, v9, v7

    .line 480
    .line 481
    if-lez v6, :cond_12

    .line 482
    .line 483
    iget-object v6, v1, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 484
    .line 485
    sget-object v14, Llt1;->a:[C

    .line 486
    .line 487
    if-eqz v6, :cond_f

    .line 488
    .line 489
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 490
    .line 491
    cmpl-float v5, v6, v5

    .line 492
    .line 493
    if-eqz v5, :cond_f

    .line 494
    .line 495
    move v5, v12

    .line 496
    goto :goto_3

    .line 497
    :cond_f
    move v5, v11

    .line 498
    :goto_3
    if-eqz v5, :cond_10

    .line 499
    .line 500
    iget-wide v5, v1, Lss1;->n:J

    .line 501
    .line 502
    long-to-double v5, v5

    .line 503
    long-to-double v9, v9

    .line 504
    div-double/2addr v5, v9

    .line 505
    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    .line 506
    .line 507
    .line 508
    move-result-wide v5

    .line 509
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    goto :goto_4

    .line 514
    :cond_10
    const/4 v5, 0x0

    .line 515
    :goto_4
    if-eqz v5, :cond_11

    .line 516
    .line 517
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 518
    .line 519
    .line 520
    move-result-wide v5

    .line 521
    invoke-virtual {v0}, Ln54;->b()V

    .line 522
    .line 523
    .line 524
    iget-object v9, v0, Ln54;->g:Lp54;

    .line 525
    .line 526
    check-cast v9, Lnr1;

    .line 527
    .line 528
    invoke-virtual {v9, v5, v6}, Lnr1;->E(J)V

    .line 529
    .line 530
    .line 531
    goto :goto_5

    .line 532
    :cond_11
    invoke-virtual {v0}, Ln54;->b()V

    .line 533
    .line 534
    .line 535
    iget-object v5, v0, Ln54;->g:Lp54;

    .line 536
    .line 537
    check-cast v5, Lnr1;

    .line 538
    .line 539
    invoke-virtual {v5}, Lnr1;->F()V

    .line 540
    .line 541
    .line 542
    :goto_5
    iget-wide v5, v1, Lss1;->m:J

    .line 543
    .line 544
    long-to-double v5, v5

    .line 545
    iget-wide v9, v1, Lss1;->i:J

    .line 546
    .line 547
    long-to-double v9, v9

    .line 548
    div-double/2addr v5, v9

    .line 549
    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    .line 550
    .line 551
    .line 552
    move-result-wide v5

    .line 553
    invoke-virtual {v0}, Ln54;->b()V

    .line 554
    .line 555
    .line 556
    iget-object v9, v0, Ln54;->g:Lp54;

    .line 557
    .line 558
    check-cast v9, Lnr1;

    .line 559
    .line 560
    invoke-virtual {v9, v5, v6}, Lnr1;->H(J)V

    .line 561
    .line 562
    .line 563
    :cond_12
    iget-object v5, v2, Lkt1;->B:Ljava/lang/Long;

    .line 564
    .line 565
    if-eqz v5, :cond_13

    .line 566
    .line 567
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 568
    .line 569
    .line 570
    move-result-wide v5

    .line 571
    invoke-virtual {v0}, Ln54;->b()V

    .line 572
    .line 573
    .line 574
    iget-object v9, v0, Ln54;->g:Lp54;

    .line 575
    .line 576
    check-cast v9, Lnr1;

    .line 577
    .line 578
    invoke-virtual {v9, v5, v6}, Lnr1;->K(J)V

    .line 579
    .line 580
    .line 581
    :cond_13
    iget-object v5, v2, Lkt1;->C:Ljava/lang/Long;

    .line 582
    .line 583
    if-eqz v5, :cond_14

    .line 584
    .line 585
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 586
    .line 587
    .line 588
    move-result-wide v5

    .line 589
    invoke-virtual {v0}, Ln54;->b()V

    .line 590
    .line 591
    .line 592
    iget-object v9, v0, Ln54;->g:Lp54;

    .line 593
    .line 594
    check-cast v9, Lnr1;

    .line 595
    .line 596
    invoke-virtual {v9, v5, v6}, Lnr1;->J(J)V

    .line 597
    .line 598
    .line 599
    :cond_14
    iget-object v2, v2, Lkt1;->D:Ljava/lang/Long;

    .line 600
    .line 601
    if-eqz v2, :cond_16

    .line 602
    .line 603
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 604
    .line 605
    .line 606
    move-result-wide v5

    .line 607
    cmp-long v2, v5, v7

    .line 608
    .line 609
    if-eqz v2, :cond_15

    .line 610
    .line 611
    const/4 v2, 0x2

    .line 612
    goto :goto_6

    .line 613
    :cond_15
    move v2, v12

    .line 614
    :goto_6
    invoke-virtual {v0}, Ln54;->b()V

    .line 615
    .line 616
    .line 617
    iget-object v5, v0, Ln54;->g:Lp54;

    .line 618
    .line 619
    check-cast v5, Lnr1;

    .line 620
    .line 621
    invoke-virtual {v5, v2}, Lnr1;->U(I)V
    :try_end_2
    .catch Ldt1; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 622
    .line 623
    .line 624
    :catch_1
    :cond_16
    :try_start_3
    iget-wide v5, v1, Lss1;->l:J

    .line 625
    .line 626
    cmp-long v2, v5, v7

    .line 627
    .line 628
    if-lez v2, :cond_17

    .line 629
    .line 630
    invoke-virtual {v0}, Ln54;->b()V

    .line 631
    .line 632
    .line 633
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 634
    .line 635
    check-cast v2, Lnr1;

    .line 636
    .line 637
    invoke-virtual {v2, v5, v6}, Lnr1;->L(J)V

    .line 638
    .line 639
    .line 640
    :cond_17
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    check-cast v0, Lnr1;

    .line 645
    .line 646
    invoke-virtual {v4}, Ln54;->b()V

    .line 647
    .line 648
    .line 649
    iget-object v2, v4, Ln54;->g:Lp54;

    .line 650
    .line 651
    check-cast v2, Lqr1;

    .line 652
    .line 653
    invoke-virtual {v2, v0}, Lqr1;->T(Lnr1;)V

    .line 654
    .line 655
    .line 656
    iget-wide v5, v1, Lss1;->h:J

    .line 657
    .line 658
    cmp-long v0, v5, v7

    .line 659
    .line 660
    if-lez v0, :cond_18

    .line 661
    .line 662
    invoke-virtual {v4}, Ln54;->b()V

    .line 663
    .line 664
    .line 665
    iget-object v0, v4, Ln54;->g:Lp54;

    .line 666
    .line 667
    check-cast v0, Lqr1;

    .line 668
    .line 669
    invoke-virtual {v0, v5, v6}, Lqr1;->K(J)V

    .line 670
    .line 671
    .line 672
    :cond_18
    iget-wide v5, v1, Lss1;->i:J

    .line 673
    .line 674
    cmp-long v0, v5, v7

    .line 675
    .line 676
    if-lez v0, :cond_19

    .line 677
    .line 678
    invoke-virtual {v4}, Ln54;->b()V

    .line 679
    .line 680
    .line 681
    iget-object v0, v4, Ln54;->g:Lp54;

    .line 682
    .line 683
    check-cast v0, Lqr1;

    .line 684
    .line 685
    invoke-virtual {v0, v5, v6}, Lqr1;->J(J)V

    .line 686
    .line 687
    .line 688
    :cond_19
    iget-wide v5, v1, Lss1;->j:J

    .line 689
    .line 690
    cmp-long v0, v5, v7

    .line 691
    .line 692
    if-lez v0, :cond_1a

    .line 693
    .line 694
    invoke-virtual {v4}, Ln54;->b()V

    .line 695
    .line 696
    .line 697
    iget-object v0, v4, Ln54;->g:Lp54;

    .line 698
    .line 699
    check-cast v0, Lqr1;

    .line 700
    .line 701
    invoke-virtual {v0, v5, v6}, Lqr1;->I(J)V

    .line 702
    .line 703
    .line 704
    :cond_1a
    iget-wide v5, v1, Lss1;->k:J

    .line 705
    .line 706
    cmp-long v0, v5, v7

    .line 707
    .line 708
    if-lez v0, :cond_1b

    .line 709
    .line 710
    invoke-virtual {v4}, Ln54;->b()V

    .line 711
    .line 712
    .line 713
    iget-object v0, v4, Ln54;->g:Lp54;

    .line 714
    .line 715
    check-cast v0, Lqr1;

    .line 716
    .line 717
    invoke-virtual {v0, v5, v6}, Lqr1;->L(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 718
    .line 719
    .line 720
    :cond_1b
    :try_start_4
    iget-object v0, v1, Lss1;->g:Ljava/util/LinkedList;

    .line 721
    .line 722
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 723
    .line 724
    .line 725
    move-result v2

    .line 726
    add-int/lit8 v2, v2, -0x1

    .line 727
    .line 728
    if-lez v2, :cond_1c

    .line 729
    .line 730
    invoke-virtual {v4}, Ln54;->b()V

    .line 731
    .line 732
    .line 733
    iget-object v5, v4, Ln54;->g:Lp54;

    .line 734
    .line 735
    check-cast v5, Lqr1;

    .line 736
    .line 737
    invoke-virtual {v5}, Lqr1;->V()V

    .line 738
    .line 739
    .line 740
    move v5, v11

    .line 741
    :goto_7
    if-ge v5, v2, :cond_1c

    .line 742
    .line 743
    sget-object v6, Lss1;->C:Ljt1;

    .line 744
    .line 745
    invoke-virtual {v0, v5}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v7

    .line 749
    check-cast v7, Landroid/view/MotionEvent;

    .line 750
    .line 751
    iget-object v8, v1, Lss1;->x:Landroid/util/DisplayMetrics;

    .line 752
    .line 753
    invoke-static {v6, v7, v8}, Lss1;->r(Ljt1;Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Lkt1;

    .line 754
    .line 755
    .line 756
    move-result-object v6

    .line 757
    invoke-static {}, Lnr1;->A()Lmr1;

    .line 758
    .line 759
    .line 760
    move-result-object v7

    .line 761
    iget-object v8, v6, Lkt1;->t:Ljava/lang/Long;

    .line 762
    .line 763
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 764
    .line 765
    .line 766
    move-result-wide v8

    .line 767
    invoke-virtual {v7}, Ln54;->b()V

    .line 768
    .line 769
    .line 770
    iget-object v10, v7, Ln54;->g:Lp54;

    .line 771
    .line 772
    check-cast v10, Lnr1;

    .line 773
    .line 774
    invoke-virtual {v10, v8, v9}, Lnr1;->B(J)V

    .line 775
    .line 776
    .line 777
    iget-object v6, v6, Lkt1;->u:Ljava/lang/Long;

    .line 778
    .line 779
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 780
    .line 781
    .line 782
    move-result-wide v8

    .line 783
    invoke-virtual {v7}, Ln54;->b()V

    .line 784
    .line 785
    .line 786
    iget-object v6, v7, Ln54;->g:Lp54;

    .line 787
    .line 788
    check-cast v6, Lnr1;

    .line 789
    .line 790
    invoke-virtual {v6, v8, v9}, Lnr1;->C(J)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v7}, Ln54;->d()Lp54;

    .line 794
    .line 795
    .line 796
    move-result-object v6

    .line 797
    check-cast v6, Lnr1;

    .line 798
    .line 799
    invoke-virtual {v4}, Ln54;->b()V

    .line 800
    .line 801
    .line 802
    iget-object v7, v4, Ln54;->g:Lp54;

    .line 803
    .line 804
    check-cast v7, Lqr1;

    .line 805
    .line 806
    invoke-virtual {v7, v6}, Lqr1;->U(Lnr1;)V
    :try_end_4
    .catch Ldt1; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 807
    .line 808
    .line 809
    add-int/lit8 v5, v5, 0x1

    .line 810
    .line 811
    goto :goto_7

    .line 812
    :cond_1c
    monitor-exit p0

    .line 813
    goto :goto_8

    .line 814
    :catch_2
    :try_start_5
    invoke-virtual {v4}, Ln54;->b()V

    .line 815
    .line 816
    .line 817
    iget-object v0, v4, Ln54;->g:Lp54;

    .line 818
    .line 819
    check-cast v0, Lqr1;

    .line 820
    .line 821
    invoke-virtual {v0}, Lqr1;->V()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 822
    .line 823
    .line 824
    monitor-exit p0

    .line 825
    :goto_8
    new-instance v0, Ljava/util/ArrayList;

    .line 826
    .line 827
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 828
    .line 829
    .line 830
    iget-object v2, v3, Ljt1;->b:Ljava/util/concurrent/ExecutorService;

    .line 831
    .line 832
    if-nez v2, :cond_1d

    .line 833
    .line 834
    goto/16 :goto_c

    .line 835
    .line 836
    :cond_1d
    invoke-virtual {v3}, Ljt1;->e()I

    .line 837
    .line 838
    .line 839
    move-result v5

    .line 840
    sget-object v2, Lmz1;->a3:Liz1;

    .line 841
    .line 842
    sget-object v14, Ltw1;->e:Ltw1;

    .line 843
    .line 844
    iget-object v6, v14, Ltw1;->c:Lkz1;

    .line 845
    .line 846
    invoke-virtual {v6, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v2

    .line 850
    check-cast v2, Ljava/lang/Boolean;

    .line 851
    .line 852
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 853
    .line 854
    .line 855
    move-result v2

    .line 856
    if-eqz v2, :cond_20

    .line 857
    .line 858
    iget-object v2, v1, Lss1;->z:Lwy0;

    .line 859
    .line 860
    new-instance v6, Lst1;

    .line 861
    .line 862
    iget-object v2, v2, Lwy0;->h:Ljava/lang/Object;

    .line 863
    .line 864
    move-object v7, v2

    .line 865
    check-cast v7, Lyq1;

    .line 866
    .line 867
    sget-object v8, Lss1;->J:Lt83;

    .line 868
    .line 869
    move-object v2, v6

    .line 870
    move-object/from16 v6, p6

    .line 871
    .line 872
    invoke-direct/range {v2 .. v8}, Lst1;-><init>(Ljt1;Lfr1;ILandroid/content/Context;Lyq1;Lt83;)V

    .line 873
    .line 874
    .line 875
    move-object v15, v6

    .line 876
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 877
    .line 878
    .line 879
    new-instance v2, Lrt1;

    .line 880
    .line 881
    invoke-direct {v2, v3, v4, v5, v15}, Lrt1;-><init>(Ljt1;Lfr1;ILandroid/content/Context;)V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 885
    .line 886
    .line 887
    new-instance v2, Lqt1;

    .line 888
    .line 889
    invoke-direct {v2, v3, v4, v5, v15}, Lqt1;-><init>(Ljt1;Lfr1;ILandroid/content/Context;)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    new-instance v2, Ltt1;

    .line 896
    .line 897
    const/4 v6, 0x4

    .line 898
    invoke-direct {v2, v3, v4, v5, v6}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 902
    .line 903
    .line 904
    sget-object v2, Lss1;->H:Lpt1;

    .line 905
    .line 906
    const-wide/16 v6, -0x1

    .line 907
    .line 908
    if-eqz v2, :cond_1f

    .line 909
    .line 910
    iget-boolean v8, v2, Lpt1;->d:Z

    .line 911
    .line 912
    if-eqz v8, :cond_1e

    .line 913
    .line 914
    iget-wide v8, v2, Lpt1;->b:J

    .line 915
    .line 916
    move-object/from16 v16, v14

    .line 917
    .line 918
    iget-wide v13, v2, Lpt1;->a:J

    .line 919
    .line 920
    sub-long/2addr v8, v13

    .line 921
    goto :goto_9

    .line 922
    :cond_1e
    move-object/from16 v16, v14

    .line 923
    .line 924
    move-wide v8, v6

    .line 925
    :goto_9
    iget-wide v13, v2, Lpt1;->c:J

    .line 926
    .line 927
    iput-wide v6, v2, Lpt1;->c:J

    .line 928
    .line 929
    move-wide v7, v8

    .line 930
    move-wide v9, v13

    .line 931
    goto :goto_a

    .line 932
    :cond_1f
    move-object/from16 v16, v14

    .line 933
    .line 934
    move-wide v9, v6

    .line 935
    move-wide v7, v9

    .line 936
    :goto_a
    new-instance v2, Lcu1;

    .line 937
    .line 938
    sget-object v6, Lss1;->G:Lzs1;

    .line 939
    .line 940
    invoke-direct/range {v2 .. v10}, Lcu1;-><init>(Ljt1;Lfr1;ILzs1;JJ)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 944
    .line 945
    .line 946
    new-instance v2, Ltt1;

    .line 947
    .line 948
    const/16 v6, 0xb

    .line 949
    .line 950
    invoke-direct {v2, v3, v4, v5, v6}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    goto :goto_b

    .line 957
    :cond_20
    move-object/from16 v15, p6

    .line 958
    .line 959
    move-object/from16 v16, v14

    .line 960
    .line 961
    :goto_b
    new-instance v2, Lgs1;

    .line 962
    .line 963
    invoke-direct {v2, v3, v4, v12}, Lgs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 967
    .line 968
    .line 969
    new-instance v2, Ltt1;

    .line 970
    .line 971
    const/4 v6, 0x3

    .line 972
    invoke-direct {v2, v3, v4, v5, v6}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 973
    .line 974
    .line 975
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 976
    .line 977
    .line 978
    new-instance v2, Lut1;

    .line 979
    .line 980
    move v7, v5

    .line 981
    sget-wide v5, Lss1;->F:J

    .line 982
    .line 983
    invoke-direct/range {v2 .. v7}, Lut1;-><init>(Ljt1;Lfr1;JI)V

    .line 984
    .line 985
    .line 986
    move v5, v7

    .line 987
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 988
    .line 989
    .line 990
    new-instance v2, Ltt1;

    .line 991
    .line 992
    invoke-direct {v2, v3, v4, v5, v11}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 993
    .line 994
    .line 995
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 996
    .line 997
    .line 998
    new-instance v2, Ltt1;

    .line 999
    .line 1000
    const/16 v6, 0x9

    .line 1001
    .line 1002
    invoke-direct {v2, v3, v4, v5, v6}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1006
    .line 1007
    .line 1008
    new-instance v2, Ltt1;

    .line 1009
    .line 1010
    const/16 v6, 0xa

    .line 1011
    .line 1012
    invoke-direct {v2, v3, v4, v5, v6}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1016
    .line 1017
    .line 1018
    new-instance v2, Ltt1;

    .line 1019
    .line 1020
    const/4 v6, 0x2

    .line 1021
    invoke-direct {v2, v3, v4, v5, v6}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1025
    .line 1026
    .line 1027
    new-instance v2, Ltt1;

    .line 1028
    .line 1029
    const/4 v6, 0x7

    .line 1030
    invoke-direct {v2, v3, v4, v5, v6}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    new-instance v2, Ltt1;

    .line 1037
    .line 1038
    const/16 v6, 0xd

    .line 1039
    .line 1040
    invoke-direct {v2, v3, v4, v5, v6}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1044
    .line 1045
    .line 1046
    new-instance v2, Ltt1;

    .line 1047
    .line 1048
    const/4 v6, 0x6

    .line 1049
    invoke-direct {v2, v3, v4, v5, v6}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1053
    .line 1054
    .line 1055
    new-instance v2, Ltt1;

    .line 1056
    .line 1057
    const/16 v6, 0xc

    .line 1058
    .line 1059
    invoke-direct {v2, v3, v4, v5, v6}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1063
    .line 1064
    .line 1065
    new-instance v2, Lvt1;

    .line 1066
    .line 1067
    new-instance v6, Ljava/lang/Throwable;

    .line 1068
    .line 1069
    invoke-direct {v6}, Ljava/lang/Throwable;-><init>()V

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v6}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v6

    .line 1076
    invoke-direct {v2, v3, v4, v5, v6}, Lvt1;-><init>(Ljt1;Lfr1;I[Ljava/lang/StackTraceElement;)V

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1080
    .line 1081
    .line 1082
    new-instance v2, Lvt1;

    .line 1083
    .line 1084
    move-object/from16 v6, p3

    .line 1085
    .line 1086
    invoke-direct {v2, v3, v4, v5, v6}, Lvt1;-><init>(Ljt1;Lfr1;ILandroid/view/View;)V

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1090
    .line 1091
    .line 1092
    new-instance v2, Ldu1;

    .line 1093
    .line 1094
    invoke-direct {v2, v3, v4, v5}, Ldu1;-><init>(Ljt1;Lfr1;I)V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1098
    .line 1099
    .line 1100
    sget-object v2, Lmz1;->O2:Liz1;

    .line 1101
    .line 1102
    move-object/from16 v8, v16

    .line 1103
    .line 1104
    iget-object v7, v8, Ltw1;->c:Lkz1;

    .line 1105
    .line 1106
    invoke-virtual {v7, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    check-cast v2, Ljava/lang/Boolean;

    .line 1111
    .line 1112
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1113
    .line 1114
    .line 1115
    move-result v2

    .line 1116
    if-eqz v2, :cond_21

    .line 1117
    .line 1118
    new-instance v2, Lqt1;

    .line 1119
    .line 1120
    move-object/from16 v7, p4

    .line 1121
    .line 1122
    invoke-direct/range {v2 .. v7}, Lqt1;-><init>(Ljt1;Lfr1;ILandroid/view/View;Landroid/app/Activity;)V

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1126
    .line 1127
    .line 1128
    :cond_21
    sget-object v2, Lmz1;->M3:Liz1;

    .line 1129
    .line 1130
    iget-object v6, v8, Ltw1;->c:Lkz1;

    .line 1131
    .line 1132
    invoke-virtual {v6, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v2

    .line 1136
    check-cast v2, Ljava/lang/Boolean;

    .line 1137
    .line 1138
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1139
    .line 1140
    .line 1141
    move-result v2

    .line 1142
    if-eqz v2, :cond_22

    .line 1143
    .line 1144
    new-instance v2, Ltt1;

    .line 1145
    .line 1146
    const/4 v6, 0x5

    .line 1147
    invoke-direct {v2, v3, v4, v5, v6}, Ltt1;-><init>(Ljt1;Lfr1;II)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1151
    .line 1152
    .line 1153
    :cond_22
    if-eqz p5, :cond_23

    .line 1154
    .line 1155
    sget-object v2, Lmz1;->Q2:Liz1;

    .line 1156
    .line 1157
    iget-object v6, v8, Ltw1;->c:Lkz1;

    .line 1158
    .line 1159
    invoke-virtual {v6, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v2

    .line 1163
    check-cast v2, Ljava/lang/Boolean;

    .line 1164
    .line 1165
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1166
    .line 1167
    .line 1168
    move-result v2

    .line 1169
    if-eqz v2, :cond_26

    .line 1170
    .line 1171
    new-instance v2, Leu1;

    .line 1172
    .line 1173
    iget-object v6, v1, Lss1;->A:Lnt1;

    .line 1174
    .line 1175
    invoke-direct {v2, v3, v4, v5, v6}, Leu1;-><init>(Ljt1;Lfr1;ILnt1;)V

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1179
    .line 1180
    .line 1181
    goto :goto_c

    .line 1182
    :cond_23
    :try_start_6
    sget-object v2, Lmz1;->R2:Liz1;

    .line 1183
    .line 1184
    iget-object v6, v8, Ltw1;->c:Lkz1;

    .line 1185
    .line 1186
    invoke-virtual {v6, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v2

    .line 1190
    check-cast v2, Ljava/lang/Boolean;

    .line 1191
    .line 1192
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1193
    .line 1194
    .line 1195
    move-result v2
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_3

    .line 1196
    if-eqz v2, :cond_24

    .line 1197
    .line 1198
    iget-object v6, v1, Lss1;->B:Ljava/util/HashMap;

    .line 1199
    .line 1200
    new-instance v2, Lwt1;

    .line 1201
    .line 1202
    move-object/from16 v7, p3

    .line 1203
    .line 1204
    move-object v8, v15

    .line 1205
    invoke-direct/range {v2 .. v8}, Lwt1;-><init>(Ljt1;Lfr1;ILjava/util/HashMap;Landroid/view/View;Landroid/content/Context;)V

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1209
    .line 1210
    .line 1211
    :catch_3
    :cond_24
    :try_start_7
    sget-object v2, Lmz1;->S2:Liz1;

    .line 1212
    .line 1213
    sget-object v6, Ltw1;->e:Ltw1;

    .line 1214
    .line 1215
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 1216
    .line 1217
    invoke-virtual {v6, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v2

    .line 1221
    check-cast v2, Ljava/lang/Boolean;

    .line 1222
    .line 1223
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1224
    .line 1225
    .line 1226
    move-result v2
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_4

    .line 1227
    if-eqz v2, :cond_25

    .line 1228
    .line 1229
    new-instance v2, Lvt1;

    .line 1230
    .line 1231
    sget-object v6, Lss1;->I:Lxe1;

    .line 1232
    .line 1233
    invoke-direct {v2, v3, v4, v5, v6}, Lvt1;-><init>(Ljt1;Lfr1;ILxe1;)V

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    :catch_4
    :cond_25
    sget-object v2, Lmz1;->b3:Liz1;

    .line 1240
    .line 1241
    sget-object v6, Ltw1;->e:Ltw1;

    .line 1242
    .line 1243
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 1244
    .line 1245
    invoke-virtual {v6, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v2

    .line 1249
    check-cast v2, Ljava/lang/Boolean;

    .line 1250
    .line 1251
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1252
    .line 1253
    .line 1254
    move-result v2

    .line 1255
    if-eqz v2, :cond_26

    .line 1256
    .line 1257
    new-instance v2, Lvt1;

    .line 1258
    .line 1259
    iget-object v6, v1, Lss1;->y:Ldm1;

    .line 1260
    .line 1261
    invoke-direct {v2, v3, v4, v5, v6}, Lvt1;-><init>(Ljt1;Lfr1;ILdm1;)V

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1265
    .line 1266
    .line 1267
    :cond_26
    :goto_c
    invoke-static {v0}, Lss1;->t(Ljava/util/List;)V

    .line 1268
    .line 1269
    .line 1270
    return-void

    .line 1271
    :goto_d
    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 1272
    throw v0
.end method
