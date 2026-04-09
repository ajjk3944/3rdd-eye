.class public final Lvl2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljo2;
.implements Ldq2;


# instance fields
.field public f:Lg4;

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final h:Landroid/content/Context;

.field public final i:Lea3;

.field public final j:Le51;

.field public final k:Ljava/util/concurrent/Executor;

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lea3;Le51;Lld2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lvl2;->l:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lvl2;->m:Z

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lvl2;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    iput-object p1, p0, Lvl2;->h:Landroid/content/Context;

    .line 17
    .line 18
    iput-object p2, p0, Lvl2;->i:Lea3;

    .line 19
    .line 20
    iput-object p3, p0, Lvl2;->j:Le51;

    .line 21
    .line 22
    iput-object p4, p0, Lvl2;->k:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final B(Lh83;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final G(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lvl2;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final G0(Lfa2;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lvl2;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final a(Ll22;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lvl2;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lvl2;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    :cond_0
    sget-object v0, Ls02;->l:Lso1;

    .line 13
    .line 14
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

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
    const/4 v2, 0x2

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    :goto_0
    move v3, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    sget-object v0, Ls02;->m:Lso1;

    .line 30
    .line 31
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v3, 0x3

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    sget-object v0, Ls02;->k:Lso1;

    .line 46
    .line 47
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    :catch_0
    :cond_3
    move v3, v1

    .line 60
    goto :goto_1

    .line 61
    :cond_4
    sget-object v0, Lhg4;->C:Lhg4;

    .line 62
    .line 63
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 64
    .line 65
    invoke-virtual {v0}, Lgd2;->g()Lra4;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lra4;->m()Led2;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v0, v0, Led2;->e:Ljava/lang/String;

    .line 74
    .line 75
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    .line 76
    .line 77
    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string v0, "local_flag_write"

    .line 81
    .line 82
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v4, "client"

    .line 87
    .line 88
    invoke-static {v0, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_5

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_5
    const-string v4, "service"

    .line 96
    .line 97
    invoke-static {v0, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    :goto_1
    add-int/lit8 v3, v3, -0x1

    .line 104
    .line 105
    iget-object v0, p0, Lvl2;->i:Lea3;

    .line 106
    .line 107
    iget-object v4, p0, Lvl2;->h:Landroid/content/Context;

    .line 108
    .line 109
    if-eq v3, v1, :cond_7

    .line 110
    .line 111
    if-eq v3, v2, :cond_6

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_6
    sget-object v2, Lhg4;->C:Lhg4;

    .line 115
    .line 116
    iget-object v2, v2, Lhg4;->r:Lp21;

    .line 117
    .line 118
    invoke-static {}, Le51;->a()Le51;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v2, v4, v3, v0}, Lp21;->z(Landroid/content/Context;Le51;Lea3;)Li62;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    goto :goto_2

    .line 127
    :cond_7
    sget-object v2, Lhg4;->C:Lhg4;

    .line 128
    .line 129
    iget-object v2, v2, Lhg4;->r:Lp21;

    .line 130
    .line 131
    invoke-static {}, Le51;->a()Le51;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v2, v4, v3, v0}, Lp21;->C(Landroid/content/Context;Le51;Lea3;)Li62;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :goto_2
    const-string v2, "google.afma.sdkConstants.getSdkConstants"

    .line 140
    .line 141
    sget-object v3, Lh62;->b:Lus0;

    .line 142
    .line 143
    invoke-virtual {v0, v2, v3, v3}, Li62;->a(Ljava/lang/String;Lg62;Lf62;)Lk62;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    new-instance v2, Lg4;

    .line 148
    .line 149
    iget-object v3, p0, Lvl2;->j:Le51;

    .line 150
    .line 151
    invoke-direct {v2, v4, v0, v3}, Lg4;-><init>(Landroid/content/Context;Lk62;Le51;)V

    .line 152
    .line 153
    .line 154
    iput-object v2, p0, Lvl2;->f:Lg4;

    .line 155
    .line 156
    iput-boolean v1, p0, Lvl2;->l:Z

    .line 157
    .line 158
    :goto_3
    iget-boolean v0, p0, Lvl2;->l:Z

    .line 159
    .line 160
    if-nez v0, :cond_8

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_8
    iget-object v0, p0, Lvl2;->f:Lg4;

    .line 164
    .line 165
    if-eqz v0, :cond_a

    .line 166
    .line 167
    invoke-virtual {v0}, Lg4;->f()Ln70;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iget-boolean v1, p0, Lvl2;->m:Z

    .line 172
    .line 173
    if-nez v1, :cond_9

    .line 174
    .line 175
    sget-object v1, Lm02;->i:Lso1;

    .line 176
    .line 177
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    check-cast v1, Ljava/lang/Boolean;

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_9

    .line 188
    .line 189
    new-instance v1, Lfu1;

    .line 190
    .line 191
    const/16 v2, 0x19

    .line 192
    .line 193
    invoke-direct {v1, v2, p0}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    iget-object v2, p0, Lvl2;->k:Ljava/util/concurrent/Executor;

    .line 197
    .line 198
    invoke-interface {v0, v1, v2}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 199
    .line 200
    .line 201
    :cond_9
    const-string v1, "persistFlagsClient"

    .line 202
    .line 203
    invoke-static {v0, v1}, Lum;->F(Ln70;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :cond_a
    :goto_4
    return-void
.end method
