.class public final Lvi3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lgk3;

.field public final c:Lwh3;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgk3;Lwh3;Lvf3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvi3;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lvi3;->b:Lgk3;

    .line 7
    .line 8
    iput-object p3, p0, Lvi3;->c:Lwh3;

    .line 9
    .line 10
    invoke-virtual {p4}, Lvf3;->E()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lvi3;->d:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(J)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lvi3;->b:Lgk3;

    .line 2
    .line 3
    const/16 v1, 0x37

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lgk3;->a(I)Lfk3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    invoke-virtual {v0}, Lfk3;->a()V

    .line 10
    .line 11
    .line 12
    const-string v1, "0.808261137"

    .line 13
    .line 14
    invoke-static {}, Lyr1;->A()Lxr1;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v3, p0, Lvi3;->d:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v2}, Ln54;->b()V

    .line 21
    .line 22
    .line 23
    iget-object v4, v2, Ln54;->g:Lp54;

    .line 24
    .line 25
    check-cast v4, Lyr1;

    .line 26
    .line 27
    invoke-virtual {v4, v3}, Lyr1;->C(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ln54;->b()V

    .line 31
    .line 32
    .line 33
    iget-object v3, v2, Ln54;->g:Lp54;

    .line 34
    .line 35
    check-cast v3, Lyr1;

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Lyr1;->B(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lvi3;->a:Landroid/content/Context;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v2}, Ln54;->b()V

    .line 47
    .line 48
    .line 49
    iget-object v4, v2, Ln54;->g:Lp54;

    .line 50
    .line 51
    check-cast v4, Lyr1;

    .line 52
    .line 53
    invoke-virtual {v4, v3}, Lyr1;->E(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v3

    .line 60
    const-wide/16 v5, 0x3e8

    .line 61
    .line 62
    div-long/2addr v3, v5

    .line 63
    invoke-virtual {v2}, Ln54;->b()V

    .line 64
    .line 65
    .line 66
    iget-object v7, v2, Ln54;->g:Lp54;

    .line 67
    .line 68
    check-cast v7, Lyr1;

    .line 69
    .line 70
    invoke-virtual {v7, v3, v4}, Lyr1;->D(J)V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 74
    .line 75
    .line 76
    move-result-wide v3

    .line 77
    sub-long/2addr v3, p1

    .line 78
    div-long/2addr v3, v5

    .line 79
    invoke-virtual {v2}, Ln54;->b()V

    .line 80
    .line 81
    .line 82
    iget-object p1, v2, Ln54;->g:Lp54;

    .line 83
    .line 84
    check-cast p1, Lyr1;

    .line 85
    .line 86
    invoke-virtual {p1, v3, v4}, Lyr1;->G(J)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    .line 89
    :try_start_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    const/4 v1, 0x0

    .line 98
    invoke-virtual {p1, p2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 103
    .line 104
    int-to-long p1, p1

    .line 105
    invoke-virtual {v2}, Ln54;->b()V

    .line 106
    .line 107
    .line 108
    iget-object v1, v2, Ln54;->g:Lp54;

    .line 109
    .line 110
    check-cast v1, Lyr1;

    .line 111
    .line 112
    invoke-virtual {v1, p1, p2}, Lyr1;->F(J)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :catchall_0
    move-exception p1

    .line 117
    goto :goto_2

    .line 118
    :catch_0
    move-exception p1

    .line 119
    goto :goto_3

    .line 120
    :catch_1
    :try_start_2
    invoke-virtual {v2}, Ln54;->b()V

    .line 121
    .line 122
    .line 123
    iget-object p1, v2, Ln54;->g:Lp54;

    .line 124
    .line 125
    check-cast p1, Lyr1;

    .line 126
    .line 127
    const-wide/16 v3, -0x1

    .line 128
    .line 129
    invoke-virtual {p1, v3, v4}, Lyr1;->F(J)V

    .line 130
    .line 131
    .line 132
    :goto_0
    iget-object p1, p0, Lvi3;->c:Lwh3;

    .line 133
    .line 134
    monitor-enter p1
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    :try_start_3
    iget-boolean p2, p1, Lwh3;->d:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 136
    .line 137
    :try_start_4
    monitor-exit p1

    .line 138
    if-nez p2, :cond_0

    .line 139
    .line 140
    invoke-virtual {p1}, Lwh3;->a()V

    .line 141
    .line 142
    .line 143
    :cond_0
    invoke-virtual {v2}, Ln54;->d()Lp54;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    check-cast p2, Lyr1;

    .line 148
    .line 149
    invoke-virtual {p2}, Ls44;->b()[B

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    const/4 v1, 0x0

    .line 154
    invoke-virtual {p1, v1, p2}, Lwh3;->d(Ljava/lang/String;[B)Lbs1;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, Ln54;->b()V

    .line 159
    .line 160
    .line 161
    iget-object p2, p1, Ln54;->g:Lp54;

    .line 162
    .line 163
    check-cast p2, Lcs1;

    .line 164
    .line 165
    const/4 v2, 0x5

    .line 166
    invoke-virtual {p2, v2}, Lcs1;->D(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Ln54;->b()V

    .line 170
    .line 171
    .line 172
    iget-object p2, p1, Ln54;->g:Lp54;

    .line 173
    .line 174
    check-cast p2, Lcs1;

    .line 175
    .line 176
    const/4 v2, 0x2

    .line 177
    invoke-virtual {p2, v2}, Lcs1;->E(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Ln54;->d()Lp54;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    check-cast p1, Lcs1;

    .line 185
    .line 186
    invoke-virtual {p1}, Ls44;->b()[B

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    sget-object p2, Ljo3;->e:Lho3;

    .line 191
    .line 192
    iget-object v2, p2, Ljo3;->b:Ljava/lang/Character;

    .line 193
    .line 194
    if-nez v2, :cond_1

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_1
    iget-object p2, p2, Ljo3;->a:Lfo3;

    .line 198
    .line 199
    new-instance v2, Lho3;

    .line 200
    .line 201
    invoke-direct {v2, p2, v1}, Lho3;-><init>(Lfo3;Ljava/lang/Character;)V

    .line 202
    .line 203
    .line 204
    move-object p2, v2

    .line 205
    :goto_1
    array-length v1, p1

    .line 206
    invoke-virtual {p2, v1, p1}, Ljo3;->g(I[B)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1
    :try_end_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 210
    goto :goto_4

    .line 211
    :catchall_1
    move-exception p2

    .line 212
    :try_start_5
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 213
    :try_start_6
    throw p2
    :try_end_6
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 214
    :goto_2
    :try_start_7
    invoke-virtual {v0, p1}, Lfk3;->b(Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    throw p1

    .line 218
    :catchall_2
    move-exception p1

    .line 219
    goto :goto_5

    .line 220
    :goto_3
    invoke-virtual {v0, p1}, Lfk3;->b(Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    const/4 p1, 0x7

    .line 224
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 228
    :goto_4
    invoke-virtual {v0}, Lfk3;->c()V

    .line 229
    .line 230
    .line 231
    return-object p1

    .line 232
    :goto_5
    invoke-virtual {v0}, Lfk3;->c()V

    .line 233
    .line 234
    .line 235
    throw p1
.end method
