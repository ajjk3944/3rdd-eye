.class public final Lrv1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lrv1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lfp2;)V
    .locals 0

    const/16 p1, 0x14

    iput p1, p0, Lrv1;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lrv1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "interstitial"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    sget-object v0, Ldx1;->j:Ldx1;

    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_1
    new-instance v0, Lpp2;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_2
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 19
    .line 20
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_3
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 25
    .line 26
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_4
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 31
    .line 32
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_5
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 37
    .line 38
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_6
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 43
    .line 44
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_7
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 49
    .line 50
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_8
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 55
    .line 56
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_9
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 61
    .line 62
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_a
    new-instance v0, Lwo2;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    sget-object v1, Lmz1;->p1:Liz1;

    .line 72
    .line 73
    sget-object v2, Ltw1;->e:Ltw1;

    .line 74
    .line 75
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 76
    .line 77
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    iput v1, v0, Lwo2;->f:I

    .line 88
    .line 89
    sget-object v1, Lmz1;->Hd:Liz1;

    .line 90
    .line 91
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 92
    .line 93
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    iput v1, v0, Lwo2;->g:I

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_b
    new-instance v0, Lpo2;

    .line 107
    .line 108
    invoke-direct {v0}, Lpo2;-><init>()V

    .line 109
    .line 110
    .line 111
    return-object v0

    .line 112
    :pswitch_c
    new-instance v0, Lul2;

    .line 113
    .line 114
    invoke-direct {v0}, Lul2;-><init>()V

    .line 115
    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_d
    const-string v0, "banner"

    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_e
    sget-object v0, Ldx1;->h:Ldx1;

    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_f
    const-string v0, "app_open_ad"

    .line 125
    .line 126
    return-object v0

    .line 127
    :pswitch_10
    sget-object v0, Ldx1;->q:Ldx1;

    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_11
    new-instance v0, Laj2;

    .line 131
    .line 132
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 133
    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_12
    sget-object v0, Lhg4;->C:Lhg4;

    .line 137
    .line 138
    iget-object v0, v0, Lhg4;->y:Loc2;

    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_13
    new-instance v0, Lus0;

    .line 142
    .line 143
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_14
    new-instance v0, Lts0;

    .line 148
    .line 149
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 150
    .line 151
    .line 152
    return-object v0

    .line 153
    :pswitch_15
    new-instance v0, Lts0;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 156
    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_16
    new-instance v0, Ljava/util/ArrayDeque;

    .line 160
    .line 161
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 162
    .line 163
    .line 164
    return-object v0

    .line 165
    :pswitch_17
    sget-object v0, Lsv1;->f:Lsv1;

    .line 166
    .line 167
    iget-object v0, v0, Lsv1;->c:Ljava/lang/String;

    .line 168
    .line 169
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_18
    new-instance v0, Landroid/content/Intent;

    .line 174
    .line 175
    const-string v1, "android.intent.action.VIEW"

    .line 176
    .line 177
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    const-string v1, "com.android.vending"

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 183
    .line 184
    .line 185
    const-string v1, "https://play.google.com/d"

    .line 186
    .line 187
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 192
    .line 193
    .line 194
    return-object v0

    .line 195
    :pswitch_19
    sget-object v0, Lmd2;->a:Lld2;

    .line 196
    .line 197
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    new-instance v1, Lkf3;

    .line 201
    .line 202
    const/16 v2, 0x1b

    .line 203
    .line 204
    invoke-direct {v1, v2, v0}, Lkf3;-><init>(ILjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    return-object v1

    .line 208
    :pswitch_1a
    sget-object v0, Lhg4;->C:Lhg4;

    .line 209
    .line 210
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 211
    .line 212
    return-object v0

    .line 213
    :pswitch_1b
    new-instance v0, Lwg2;

    .line 214
    .line 215
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 216
    .line 217
    .line 218
    const/4 v1, 0x0

    .line 219
    iput-object v1, v0, Lwg2;->a:Lpm0;

    .line 220
    .line 221
    return-object v0

    .line 222
    :pswitch_1c
    new-instance v0, Lqv1;

    .line 223
    .line 224
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 225
    .line 226
    .line 227
    return-object v0

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
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
