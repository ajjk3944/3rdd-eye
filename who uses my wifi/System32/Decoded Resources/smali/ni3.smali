.class public final Lni3;
.super Lti3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic f:I

.field public final g:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lfr1;Lgi3;Landroid/content/Context;Lgk3;I)V
    .locals 6

    .line 1
    iput p5, p0, Lni3;->f:I

    .line 2
    .line 3
    packed-switch p5, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 v2, 0x73

    .line 7
    .line 8
    invoke-virtual {p4, v2}, Lgk3;->a(I)Lfk3;

    .line 9
    .line 10
    .line 11
    move-result-object v5

    .line 12
    const-string v1, "BhNDAdNbKVCXLou3UwS6SQycA6O/T9ZMbr2NWffNFtsRs3WScUuYHsaYRJ0jHvCA"

    .line 13
    .line 14
    const-string v2, "oaC5CLMjwUmi/i48MFPdrATPzdM8HcSPBi81Io4IqyU="

    .line 15
    .line 16
    move-object v0, p0

    .line 17
    move-object v3, p1

    .line 18
    move-object v4, p2

    .line 19
    invoke-direct/range {v0 .. v5}, Lti3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfr1;Lgi3;Lfk3;)V

    .line 20
    .line 21
    .line 22
    iput-object p3, p0, Lni3;->g:Landroid/content/Context;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    const/16 v2, 0x77

    .line 26
    .line 27
    invoke-virtual {p4, v2}, Lgk3;->a(I)Lfk3;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const-string v1, "fPyGoeDuTUuDJV03GsNFpCGRO2J3Ui8HA6QvnuqOeQaxvLcgOY5Y2sf90BXpAioC"

    .line 32
    .line 33
    const-string v2, "znAIQ1vWTnsSA3nf0QmMCBs/bj4g6mmUyXonbfu9VUs="

    .line 34
    .line 35
    move-object v0, p0

    .line 36
    move-object v3, p1

    .line 37
    move-object v4, p2

    .line 38
    invoke-direct/range {v0 .. v5}, Lti3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfr1;Lgi3;Lfk3;)V

    .line 39
    .line 40
    .line 41
    iput-object p3, p0, Lni3;->g:Landroid/content/Context;

    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Method;Lfr1;)V
    .locals 6

    .line 1
    iget v0, p0, Lni3;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lni3;->g:Landroid/content/Context;

    .line 7
    .line 8
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, ""

    .line 13
    .line 14
    invoke-virtual {p1, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, [Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    monitor-enter p2

    .line 24
    const/4 v0, 0x0

    .line 25
    :try_start_0
    aget-object v0, p1, v0

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Long;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-virtual {p2}, Ln54;->b()V

    .line 34
    .line 35
    .line 36
    iget-object v2, p2, Ln54;->g:Lp54;

    .line 37
    .line 38
    check-cast v2, Lqr1;

    .line 39
    .line 40
    invoke-virtual {v2, v0, v1}, Lqr1;->G0(J)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    aget-object p1, p1, v0

    .line 45
    .line 46
    check-cast p1, Ljava/lang/Long;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    invoke-virtual {p2}, Ln54;->b()V

    .line 53
    .line 54
    .line 55
    iget-object p1, p2, Ln54;->g:Lp54;

    .line 56
    .line 57
    check-cast p1, Lqr1;

    .line 58
    .line 59
    invoke-virtual {p1, v0, v1}, Lqr1;->Z(J)V

    .line 60
    .line 61
    .line 62
    monitor-exit p2

    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    throw p1

    .line 67
    :pswitch_0
    iget-object v0, p0, Lni3;->g:Landroid/content/Context;

    .line 68
    .line 69
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v1, ""

    .line 74
    .line 75
    invoke-virtual {p1, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, [Ljava/lang/Object;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    monitor-enter p2

    .line 85
    const/4 v0, 0x0

    .line 86
    :try_start_1
    aget-object v0, p1, v0

    .line 87
    .line 88
    check-cast v0, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    int-to-long v0, v0

    .line 95
    invoke-virtual {p2}, Ln54;->b()V

    .line 96
    .line 97
    .line 98
    iget-object v2, p2, Ln54;->g:Lp54;

    .line 99
    .line 100
    check-cast v2, Lqr1;

    .line 101
    .line 102
    invoke-virtual {v2, v0, v1}, Lqr1;->Y(J)V

    .line 103
    .line 104
    .line 105
    const/4 v0, 0x1

    .line 106
    aget-object v1, p1, v0

    .line 107
    .line 108
    check-cast v1, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    int-to-long v1, v1

    .line 115
    invoke-virtual {p2}, Ln54;->b()V

    .line 116
    .line 117
    .line 118
    iget-object v3, p2, Ln54;->g:Lp54;

    .line 119
    .line 120
    check-cast v3, Lqr1;

    .line 121
    .line 122
    invoke-virtual {v3, v1, v2}, Lqr1;->H0(J)V

    .line 123
    .line 124
    .line 125
    const/4 v1, 0x2

    .line 126
    aget-object v2, p1, v1

    .line 127
    .line 128
    check-cast v2, Ljava/lang/Integer;

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    int-to-long v2, v2

    .line 135
    invoke-virtual {p2}, Ln54;->b()V

    .line 136
    .line 137
    .line 138
    iget-object v4, p2, Ln54;->g:Lp54;

    .line 139
    .line 140
    check-cast v4, Lqr1;

    .line 141
    .line 142
    invoke-virtual {v4, v2, v3}, Lqr1;->I0(J)V

    .line 143
    .line 144
    .line 145
    const/4 v2, 0x3

    .line 146
    aget-object v3, p1, v2

    .line 147
    .line 148
    check-cast v3, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    int-to-long v3, v3

    .line 155
    invoke-virtual {p2}, Ln54;->b()V

    .line 156
    .line 157
    .line 158
    iget-object v5, p2, Ln54;->g:Lp54;

    .line 159
    .line 160
    check-cast v5, Lqr1;

    .line 161
    .line 162
    invoke-virtual {v5, v3, v4}, Lqr1;->m0(J)V

    .line 163
    .line 164
    .line 165
    const/4 v3, 0x4

    .line 166
    aget-object v3, p1, v3

    .line 167
    .line 168
    check-cast v3, Ljava/lang/Boolean;

    .line 169
    .line 170
    if-nez v3, :cond_0

    .line 171
    .line 172
    invoke-virtual {p2}, Ln54;->b()V

    .line 173
    .line 174
    .line 175
    iget-object v3, p2, Ln54;->g:Lp54;

    .line 176
    .line 177
    check-cast v3, Lqr1;

    .line 178
    .line 179
    invoke-virtual {v3, v2}, Lqr1;->q0(I)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-eq v0, v3, :cond_1

    .line 188
    .line 189
    move v3, v0

    .line 190
    goto :goto_0

    .line 191
    :cond_1
    move v3, v1

    .line 192
    :goto_0
    invoke-virtual {p2}, Ln54;->b()V

    .line 193
    .line 194
    .line 195
    iget-object v4, p2, Ln54;->g:Lp54;

    .line 196
    .line 197
    check-cast v4, Lqr1;

    .line 198
    .line 199
    invoke-virtual {v4, v3}, Lqr1;->q0(I)V

    .line 200
    .line 201
    .line 202
    :goto_1
    const/4 v3, 0x5

    .line 203
    aget-object p1, p1, v3

    .line 204
    .line 205
    check-cast p1, Ljava/lang/Boolean;

    .line 206
    .line 207
    if-nez p1, :cond_2

    .line 208
    .line 209
    invoke-virtual {p2, v2}, Lfr1;->g(I)V

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :catchall_1
    move-exception p1

    .line 214
    goto :goto_4

    .line 215
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-eq v0, p1, :cond_3

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_3
    move v0, v1

    .line 223
    :goto_2
    invoke-virtual {p2, v0}, Lfr1;->g(I)V

    .line 224
    .line 225
    .line 226
    :goto_3
    monitor-exit p2

    .line 227
    return-void

    .line 228
    :goto_4
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 229
    throw p1

    .line 230
    nop

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
