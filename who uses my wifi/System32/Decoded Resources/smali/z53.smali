.class public final synthetic Lz53;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzk3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La63;


# direct methods
.method public synthetic constructor <init>(La63;I)V
    .locals 0

    .line 1
    iput p2, p0, Lz53;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lz53;->b:La63;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lz53;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz53;->b:La63;

    .line 7
    .line 8
    check-cast p1, Lj3;

    .line 9
    .line 10
    new-instance v1, Lue;

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lue;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iget-boolean v2, v0, La63;->d:Z

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    sget-object v2, Lmz1;->w3:Liz1;

    .line 22
    .line 23
    sget-object v3, Ltw1;->e:Ltw1;

    .line 24
    .line 25
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 26
    .line 27
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    sget-object v2, Lmz1;->x3:Liz1;

    .line 41
    .line 42
    sget-object v3, Ltw1;->e:Ltw1;

    .line 43
    .line 44
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 45
    .line 46
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    :try_start_0
    iget-object v1, v0, La63;->a:Landroid/content/Context;

    .line 60
    .line 61
    invoke-static {v1}, Lmf3;->f(Landroid/content/Context;)Lmf3;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    iget-object v3, p1, Lj3;->a:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    sget-object v1, Lmz1;->C3:Liz1;

    .line 78
    .line 79
    sget-object v5, Ltw1;->e:Ltw1;

    .line 80
    .line 81
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 82
    .line 83
    invoke-virtual {v5, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Ljava/lang/Long;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 90
    .line 91
    .line 92
    move-result-wide v5

    .line 93
    iget-boolean v7, v0, La63;->e:Z

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    const-class v1, Lmf3;

    .line 99
    .line 100
    monitor-enter v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    :try_start_1
    invoke-virtual/range {v2 .. v7}, Llf3;->a(Ljava/lang/String;Ljava/lang/String;JZ)Lue;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    monitor-exit v1

    .line 106
    move-object v1, v0

    .line 107
    goto :goto_1

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 111
    :catch_0
    move-exception v0

    .line 112
    goto :goto_0

    .line 113
    :catch_1
    move-exception v0

    .line 114
    :goto_0
    const-string v1, "AdIdInfoSignalSource.getPaidV1"

    .line 115
    .line 116
    sget-object v2, Lhg4;->C:Lhg4;

    .line 117
    .line 118
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 119
    .line 120
    invoke-virtual {v2, v1, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    new-instance v1, Lue;

    .line 124
    .line 125
    const/16 v0, 0x8

    .line 126
    .line 127
    invoke-direct {v1, v0}, Lue;-><init>(I)V

    .line 128
    .line 129
    .line 130
    :goto_1
    new-instance v0, Lf33;

    .line 131
    .line 132
    const/4 v2, 0x0

    .line 133
    const/4 v3, 0x1

    .line 134
    invoke-direct {v0, p1, v2, v1, v3}, Lf33;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_0
    iget-object v0, p0, Lz53;->b:La63;

    .line 139
    .line 140
    check-cast p1, Ljava/lang/Throwable;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    sget-object p1, Lsv1;->f:Lsv1;

    .line 146
    .line 147
    iget-object p1, p1, Lsv1;->a:Lj63;

    .line 148
    .line 149
    iget-object p1, v0, La63;->a:Landroid/content/Context;

    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const/4 v0, 0x0

    .line 156
    if-nez p1, :cond_2

    .line 157
    .line 158
    move-object p1, v0

    .line 159
    goto :goto_2

    .line 160
    :cond_2
    const-string v1, "android_id"

    .line 161
    .line 162
    invoke-static {p1, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    :goto_2
    new-instance v1, Lf33;

    .line 167
    .line 168
    new-instance v2, Lue;

    .line 169
    .line 170
    const/16 v3, 0x8

    .line 171
    .line 172
    invoke-direct {v2, v3}, Lue;-><init>(I)V

    .line 173
    .line 174
    .line 175
    const/4 v3, 0x1

    .line 176
    invoke-direct {v1, v0, p1, v2, v3}, Lf33;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 177
    .line 178
    .line 179
    return-object v1

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
