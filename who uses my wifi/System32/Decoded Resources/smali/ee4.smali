.class public final synthetic Lee4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lwt2;


# direct methods
.method public synthetic constructor <init>(Lwt2;IJJ)V
    .locals 0

    const/4 p2, 0x3

    iput p2, p0, Lee4;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lee4;->g:Lwt2;

    return-void
.end method

.method public synthetic constructor <init>(Lwt2;J)V
    .locals 0

    const/4 p2, 0x2

    iput p2, p0, Lee4;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lee4;->g:Lwt2;

    return-void
.end method

.method public synthetic constructor <init>(Lwt2;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Lee4;->f:I

    iput-object p1, p0, Lee4;->g:Lwt2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lwt2;Ljava/lang/String;JJ)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, Lee4;->f:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lee4;->g:Lwt2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lee4;->f:I

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x14

    .line 6
    .line 7
    iget-object v4, p0, Lee4;->g:Lwt2;

    .line 8
    .line 9
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v0, v4, Lwt2;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Loa4;

    .line 20
    .line 21
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 22
    .line 23
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 24
    .line 25
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, Lid4;

    .line 30
    .line 31
    const/4 v3, 0x5

    .line 32
    invoke-direct {v2, v3}, Lid4;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const/16 v3, 0x3ef

    .line 36
    .line 37
    invoke-virtual {v0, v1, v3, v2}, Lmd4;->s(Lad4;ILks2;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v0, v4, Lwt2;->h:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Loa4;

    .line 46
    .line 47
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 48
    .line 49
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 50
    .line 51
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v2, Ly24;

    .line 56
    .line 57
    invoke-direct {v2, v3}, Ly24;-><init>(I)V

    .line 58
    .line 59
    .line 60
    const/16 v3, 0x407

    .line 61
    .line 62
    invoke-virtual {v0, v1, v3, v2}, Lmd4;->s(Lad4;ILks2;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_1
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v0, v4, Lwt2;->h:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Loa4;

    .line 71
    .line 72
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 73
    .line 74
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 75
    .line 76
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    new-instance v4, Lt24;

    .line 81
    .line 82
    invoke-direct {v4, v3, v2}, Lt24;-><init>(IB)V

    .line 83
    .line 84
    .line 85
    const/16 v2, 0x405

    .line 86
    .line 87
    invoke-virtual {v0, v1, v2, v4}, Lmd4;->s(Lad4;ILks2;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_2
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v0, v4, Lwt2;->h:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Loa4;

    .line 96
    .line 97
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 98
    .line 99
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 100
    .line 101
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    new-instance v2, Ly24;

    .line 106
    .line 107
    const/16 v3, 0x13

    .line 108
    .line 109
    invoke-direct {v2, v3}, Ly24;-><init>(I)V

    .line 110
    .line 111
    .line 112
    const/16 v3, 0x3f6

    .line 113
    .line 114
    invoke-virtual {v0, v1, v3, v2}, Lmd4;->s(Lad4;ILks2;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :pswitch_3
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v0, v4, Lwt2;->h:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Loa4;

    .line 123
    .line 124
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 125
    .line 126
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 127
    .line 128
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    new-instance v2, Lhd4;

    .line 133
    .line 134
    const/16 v3, 0x8

    .line 135
    .line 136
    invoke-direct {v2, v3}, Lhd4;-><init>(I)V

    .line 137
    .line 138
    .line 139
    const/16 v3, 0x3f4

    .line 140
    .line 141
    invoke-virtual {v0, v1, v3, v2}, Lmd4;->s(Lad4;ILks2;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_4
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v0, v4, Lwt2;->h:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Loa4;

    .line 150
    .line 151
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 152
    .line 153
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 154
    .line 155
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    new-instance v3, Lid4;

    .line 160
    .line 161
    invoke-direct {v3, v1}, Lid4;-><init>(I)V

    .line 162
    .line 163
    .line 164
    const/16 v1, 0x3f3

    .line 165
    .line 166
    invoke-virtual {v0, v2, v1, v3}, Lmd4;->s(Lad4;ILks2;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :pswitch_5
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 171
    .line 172
    iget-object v0, v4, Lwt2;->h:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Loa4;

    .line 175
    .line 176
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 177
    .line 178
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 179
    .line 180
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    new-instance v3, Lhd4;

    .line 185
    .line 186
    invoke-direct {v3, v1}, Lhd4;-><init>(I)V

    .line 187
    .line 188
    .line 189
    const/16 v1, 0x3f2

    .line 190
    .line 191
    invoke-virtual {v0, v2, v1, v3}, Lmd4;->s(Lad4;ILks2;)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :pswitch_6
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 196
    .line 197
    iget-object v0, v4, Lwt2;->h:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Loa4;

    .line 200
    .line 201
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 202
    .line 203
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 204
    .line 205
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    new-instance v3, Lt24;

    .line 210
    .line 211
    const/16 v4, 0x15

    .line 212
    .line 213
    invoke-direct {v3, v4, v2}, Lt24;-><init>(IB)V

    .line 214
    .line 215
    .line 216
    const/16 v2, 0x408

    .line 217
    .line 218
    invoke-virtual {v0, v1, v2, v3}, Lmd4;->s(Lad4;ILks2;)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :pswitch_7
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 223
    .line 224
    iget-object v0, v4, Lwt2;->h:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, Loa4;

    .line 227
    .line 228
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 229
    .line 230
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 231
    .line 232
    invoke-virtual {v0}, Lmd4;->y()Lad4;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    new-instance v2, Lid4;

    .line 237
    .line 238
    const/4 v3, 0x6

    .line 239
    invoke-direct {v2, v3}, Lid4;-><init>(I)V

    .line 240
    .line 241
    .line 242
    const/16 v3, 0x3f0

    .line 243
    .line 244
    invoke-virtual {v0, v1, v3, v2}, Lmd4;->s(Lad4;ILks2;)V

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
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
