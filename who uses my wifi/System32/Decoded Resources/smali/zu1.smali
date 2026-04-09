.class public abstract Lzu1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lek2;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.client.IClientApi"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    const-class v2, Lbu1;

    .line 5
    .line 6
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-string v3, "com.google.android.gms.ads.internal.ClientApi"

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    instance-of v3, v2, Landroid/os/IBinder;

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    const-string v0, "ClientApi class is not an instance of IBinder."

    .line 29
    .line 30
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    check-cast v2, Landroid/os/IBinder;

    .line 35
    .line 36
    invoke-interface {v2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    instance-of v4, v3, Lek2;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    check-cast v3, Lek2;

    .line 45
    .line 46
    :goto_0
    move-object v1, v3

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance v3, Lej2;

    .line 49
    .line 50
    const/4 v4, 0x2

    .line 51
    invoke-direct {v3, v2, v0, v4}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    const-string v0, "Failed to instantiate ClientApi class."

    .line 56
    .line 57
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    sput-object v1, Lzu1;->a:Lek2;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/Object;
.end method

.method public abstract b()Ljava/lang/Object;
.end method

.method public abstract c(Lek2;)Ljava/lang/Object;
.end method

.method public final d(Landroid/content/Context;Z)Ljava/lang/Object;
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p2, :cond_1

    .line 3
    .line 4
    sget-object v1, Lsv1;->f:Lsv1;

    .line 5
    .line 6
    iget-object v1, v1, Lsv1;->a:Lj63;

    .line 7
    .line 8
    const v1, 0xbdfcb8

    .line 9
    .line 10
    .line 11
    sget-object v2, Lgz;->b:Lgz;

    .line 12
    .line 13
    invoke-virtual {v2, p1, v1}, Lgz;->c(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p2, "Google Play Services is not available."

    .line 21
    .line 22
    invoke-static {p2}, Lgi2;->U(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    move p2, v0

    .line 26
    :cond_1
    :goto_0
    invoke-static {p1}, Lar;->a(Landroid/content/Context;)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-static {p1, v2}, Lar;->d(Landroid/content/Context;Z)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-le v1, v3, :cond_2

    .line 36
    .line 37
    move v1, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move v1, v0

    .line 40
    :goto_1
    xor-int/2addr v1, v0

    .line 41
    invoke-static {p1}, Lmz1;->a(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    sget-object v3, Lo02;->a:Lso1;

    .line 45
    .line 46
    invoke-virtual {v3}, Lso1;->w()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    move p2, v2

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    sget-object v3, Lo02;->b:Lso1;

    .line 61
    .line 62
    invoke-virtual {v3}, Lso1;->w()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    move p2, v0

    .line 75
    move v2, p2

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    or-int/2addr p2, v1

    .line 78
    move v9, v2

    .line 79
    move v2, p2

    .line 80
    move p2, v9

    .line 81
    :goto_2
    const-string v1, "ClientApi class cannot be loaded."

    .line 82
    .line 83
    sget-object v3, Lzu1;->a:Lek2;

    .line 84
    .line 85
    const/4 v4, 0x5

    .line 86
    const/4 v5, 0x0

    .line 87
    if-eqz v2, :cond_6

    .line 88
    .line 89
    if-eqz v3, :cond_5

    .line 90
    .line 91
    :try_start_0
    invoke-virtual {p0, v3}, Lzu1;->c(Lek2;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    goto :goto_4

    .line 96
    :catch_0
    invoke-static {v4}, Lgi2;->q0(I)Z

    .line 97
    .line 98
    .line 99
    :goto_3
    move-object p1, v5

    .line 100
    goto :goto_4

    .line 101
    :cond_5
    invoke-static {v1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :goto_4
    if-nez p1, :cond_a

    .line 106
    .line 107
    if-nez p2, :cond_a

    .line 108
    .line 109
    :try_start_1
    invoke-virtual {p0}, Lzu1;->b()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 113
    goto :goto_5

    .line 114
    :catch_1
    invoke-static {v4}, Lgi2;->q0(I)Z

    .line 115
    .line 116
    .line 117
    :goto_5
    move-object p1, v5

    .line 118
    goto :goto_7

    .line 119
    :cond_6
    :try_start_2
    invoke-virtual {p0}, Lzu1;->b()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 123
    goto :goto_6

    .line 124
    :catch_2
    invoke-static {v4}, Lgi2;->q0(I)Z

    .line 125
    .line 126
    .line 127
    move-object p2, v5

    .line 128
    :goto_6
    if-nez p2, :cond_7

    .line 129
    .line 130
    sget-object v2, Lf12;->a:Lso1;

    .line 131
    .line 132
    invoke-virtual {v2}, Lso1;->w()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Ljava/lang/Long;

    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/Long;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    sget-object v6, Lsv1;->f:Lsv1;

    .line 143
    .line 144
    iget-object v7, v6, Lsv1;->e:Ljava/util/Random;

    .line 145
    .line 146
    invoke-virtual {v7, v2}, Ljava/util/Random;->nextInt(I)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-nez v2, :cond_7

    .line 151
    .line 152
    new-instance v2, Landroid/os/Bundle;

    .line 153
    .line 154
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v7, "action"

    .line 158
    .line 159
    const-string v8, "dynamite_load"

    .line 160
    .line 161
    invoke-virtual {v2, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const-string v7, "is_missing"

    .line 165
    .line 166
    invoke-virtual {v2, v7, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 167
    .line 168
    .line 169
    iget-object v0, v6, Lsv1;->a:Lj63;

    .line 170
    .line 171
    iget-object v6, v6, Lsv1;->d:Le51;

    .line 172
    .line 173
    iget-object v6, v6, Le51;->f:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    new-instance v7, Ll92;

    .line 179
    .line 180
    const/4 v8, 0x0

    .line 181
    invoke-direct {v7, v0, p1, v8}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 182
    .line 183
    .line 184
    invoke-static {p1, v6, v2, v7}, Lj63;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lpx2;)V

    .line 185
    .line 186
    .line 187
    :cond_7
    if-nez p2, :cond_9

    .line 188
    .line 189
    if-eqz v3, :cond_8

    .line 190
    .line 191
    :try_start_3
    invoke-virtual {p0, v3}, Lzu1;->c(Lek2;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    .line 195
    goto :goto_5

    .line 196
    :catch_3
    invoke-static {v4}, Lgi2;->q0(I)Z

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_8
    invoke-static {v1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_9
    move-object p1, p2

    .line 205
    :cond_a
    :goto_7
    if-nez p1, :cond_b

    .line 206
    .line 207
    invoke-virtual {p0}, Lzu1;->a()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    :cond_b
    return-object p1
.end method
