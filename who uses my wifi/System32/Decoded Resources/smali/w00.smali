.class public final synthetic Lw00;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ly00;


# direct methods
.method public synthetic constructor <init>(Ly00;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw00;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lw00;->g:Ly00;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget p1, p0, Lw00;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lw00;->g:Ly00;

    .line 7
    .line 8
    invoke-virtual {p1}, Liw;->G()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Landroid/content/Intent;

    .line 13
    .line 14
    const-string v2, "https://play.google.com/store/apps/dev?id=9038809124293846666"

    .line 15
    .line 16
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "android.intent.action.VIEW"

    .line 21
    .line 22
    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "com.android.vending"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    const/high16 v2, 0x10000000

    .line 31
    .line 32
    :try_start_0
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {p1}, Lwb;->R()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_0
    iget-object p1, p0, Lw00;->g:Ly00;

    .line 48
    .line 49
    invoke-virtual {p1}, Liw;->G()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v1, Landroid/content/Intent;

    .line 54
    .line 55
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v2, "android.intent.action.SEND"

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 61
    .line 62
    .line 63
    const v2, 0x7f12002a

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const v4, 0x7f12012c

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const-string v4, "android.intent.extra.SUBJECT"

    .line 82
    .line 83
    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    new-instance v4, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v5, "https://play.google.com/store/apps/details?id="

    .line 97
    .line 98
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    const v3, 0x7f120148

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    const-string v3, "android.intent.extra.TEXT"

    .line 120
    .line 121
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 122
    .line 123
    .line 124
    const-string v2, "text/plain"

    .line 125
    .line 126
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 127
    .line 128
    .line 129
    const/high16 v2, 0x10000000

    .line 130
    .line 131
    :try_start_1
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :catch_1
    move-exception v0

    .line 139
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 140
    .line 141
    .line 142
    :goto_1
    invoke-virtual {p1}, Lwb;->R()V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_1
    iget-object p1, p0, Lw00;->g:Ly00;

    .line 147
    .line 148
    invoke-virtual {p1}, Liw;->G()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    new-instance v1, Landroid/content/Intent;

    .line 153
    .line 154
    const-string v2, "market://details?id=com.phuongpn.whousemywifi.networkscanner.pro"

    .line 155
    .line 156
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    const-string v3, "android.intent.action.VIEW"

    .line 161
    .line 162
    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 163
    .line 164
    .line 165
    const/high16 v2, 0x10000000

    .line 166
    .line 167
    :try_start_2
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :catch_2
    move-exception v0

    .line 175
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 176
    .line 177
    .line 178
    :goto_2
    invoke-virtual {p1}, Lwb;->R()V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :pswitch_2
    new-instance p1, Landroid/content/Intent;

    .line 183
    .line 184
    iget-object v0, p0, Lw00;->g:Ly00;

    .line 185
    .line 186
    invoke-virtual {v0}, Liw;->g()Li5;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    const-class v2, Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity;

    .line 191
    .line 192
    invoke-direct {p1, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, p1}, Liw;->M(Landroid/content/Intent;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Lwb;->R()V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :pswitch_3
    new-instance p1, Landroid/content/Intent;

    .line 203
    .line 204
    iget-object v0, p0, Lw00;->g:Ly00;

    .line 205
    .line 206
    invoke-virtual {v0}, Liw;->g()Li5;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    const-class v2, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;

    .line 211
    .line 212
    invoke-direct {p1, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, p1}, Liw;->M(Landroid/content/Intent;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Lwb;->R()V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :pswitch_4
    new-instance p1, Landroid/content/Intent;

    .line 223
    .line 224
    iget-object v0, p0, Lw00;->g:Ly00;

    .line 225
    .line 226
    invoke-virtual {v0}, Liw;->g()Li5;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    const-class v2, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;

    .line 231
    .line 232
    invoke-direct {p1, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, p1}, Liw;->M(Landroid/content/Intent;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, Lwb;->R()V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :pswitch_5
    new-instance p1, Landroid/content/Intent;

    .line 243
    .line 244
    iget-object v0, p0, Lw00;->g:Ly00;

    .line 245
    .line 246
    invoke-virtual {v0}, Liw;->g()Li5;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    const-class v2, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;

    .line 251
    .line 252
    invoke-direct {p1, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, p1}, Liw;->M(Landroid/content/Intent;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Lwb;->R()V

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :pswitch_6
    new-instance p1, Landroid/content/Intent;

    .line 263
    .line 264
    iget-object v0, p0, Lw00;->g:Ly00;

    .line 265
    .line 266
    invoke-virtual {v0}, Liw;->g()Li5;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    const-class v2, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;

    .line 271
    .line 272
    invoke-direct {p1, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, p1}, Liw;->M(Landroid/content/Intent;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0}, Lwb;->R()V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    nop

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
