.class public Landroidx/work/impl/foreground/SystemForegroundService;
.super Le60;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public g:Landroid/os/Handler;

.field public h:Z

.field public i:Lrz0;

.field public j:Landroid/app/NotificationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "SystemFgService"

    .line 2
    .line 3
    invoke-static {v0}, Lh80;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le60;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/work/impl/foreground/SystemForegroundService;->g:Landroid/os/Handler;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "notification"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/app/NotificationManager;

    .line 23
    .line 24
    iput-object v0, p0, Landroidx/work/impl/foreground/SystemForegroundService;->j:Landroid/app/NotificationManager;

    .line 25
    .line 26
    new-instance v0, Lrz0;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {v0, v1}, Lrz0;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroidx/work/impl/foreground/SystemForegroundService;->i:Lrz0;

    .line 36
    .line 37
    iget-object v1, v0, Lrz0;->n:Landroidx/work/impl/foreground/SystemForegroundService;

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-static {}, Lh80;->d()Lh80;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, Lrz0;->o:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 49
    .line 50
    const-string v3, "A callback already exists."

    .line 51
    .line 52
    invoke-virtual {v0, v1, v3, v2}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    iput-object p0, v0, Lrz0;->n:Landroidx/work/impl/foreground/SystemForegroundService;

    .line 57
    .line 58
    return-void
.end method

.method public final onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Le60;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/work/impl/foreground/SystemForegroundService;->b()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Le60;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/work/impl/foreground/SystemForegroundService;->i:Lrz0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lrz0;->g()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 6

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 2
    .line 3
    .line 4
    iget-boolean p2, p0, Landroidx/work/impl/foreground/SystemForegroundService;->h:Z

    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lh80;->d()Lh80;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    new-array v0, p3, [Ljava/lang/Throwable;

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Lh80;->e([Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Landroidx/work/impl/foreground/SystemForegroundService;->i:Lrz0;

    .line 19
    .line 20
    invoke-virtual {p2}, Lrz0;->g()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/work/impl/foreground/SystemForegroundService;->b()V

    .line 24
    .line 25
    .line 26
    iput-boolean p3, p0, Landroidx/work/impl/foreground/SystemForegroundService;->h:Z

    .line 27
    .line 28
    :cond_0
    if-eqz p1, :cond_4

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/work/impl/foreground/SystemForegroundService;->i:Lrz0;

    .line 31
    .line 32
    iget-object p2, v1, Lrz0;->f:Lha1;

    .line 33
    .line 34
    sget-object v0, Lrz0;->o:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v2, "ACTION_START_FOREGROUND"

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const-string v3, "KEY_WORKSPEC_ID"

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-static {}, Lh80;->d()Lh80;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v2, "Started foreground service %s"

    .line 55
    .line 56
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    new-array p3, p3, [Ljava/lang/Throwable;

    .line 64
    .line 65
    invoke-virtual {v0, p3}, Lh80;->e([Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget-object v2, p2, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 73
    .line 74
    iget-object p2, v1, Lrz0;->g:Ll01;

    .line 75
    .line 76
    new-instance v0, Lgi;

    .line 77
    .line 78
    const/4 v4, 0x5

    .line 79
    const/4 v5, 0x0

    .line 80
    invoke-direct/range {v0 .. v5}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 81
    .line 82
    .line 83
    check-cast p2, Lxb4;

    .line 84
    .line 85
    invoke-virtual {p2, v0}, Lxb4;->j(Ljava/lang/Runnable;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, p1}, Lrz0;->f(Landroid/content/Intent;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    const-string v2, "ACTION_NOTIFY"

    .line 93
    .line 94
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    invoke-virtual {v1, p1}, Lrz0;->f(Landroid/content/Intent;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    const-string v2, "ACTION_CANCEL_WORK"

    .line 105
    .line 106
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    invoke-static {}, Lh80;->d()Lh80;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-string v1, "Stopping foreground work for %s"

    .line 117
    .line 118
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    new-array p3, p3, [Ljava/lang/Throwable;

    .line 126
    .line 127
    invoke-virtual {v0, p3}, Lh80;->e([Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-eqz p1, :cond_4

    .line 135
    .line 136
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result p3

    .line 140
    if-nez p3, :cond_4

    .line 141
    .line 142
    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    new-instance p3, Led;

    .line 150
    .line 151
    invoke-direct {p3, p2, p1}, Led;-><init>(Lha1;Ljava/util/UUID;)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p2, Lha1;->s:Lxb4;

    .line 155
    .line 156
    invoke-virtual {p1, p3}, Lxb4;->j(Ljava/lang/Runnable;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_3
    const-string p1, "ACTION_STOP_FOREGROUND"

    .line 161
    .line 162
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_4

    .line 167
    .line 168
    invoke-static {}, Lh80;->d()Lh80;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    new-array p2, p3, [Ljava/lang/Throwable;

    .line 173
    .line 174
    invoke-virtual {p1, p2}, Lh80;->e([Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    iget-object p1, v1, Lrz0;->n:Landroidx/work/impl/foreground/SystemForegroundService;

    .line 178
    .line 179
    if-eqz p1, :cond_4

    .line 180
    .line 181
    const/4 p2, 0x1

    .line 182
    iput-boolean p2, p1, Landroidx/work/impl/foreground/SystemForegroundService;->h:Z

    .line 183
    .line 184
    invoke-static {}, Lh80;->d()Lh80;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    new-array p3, p3, [Ljava/lang/Throwable;

    .line 189
    .line 190
    invoke-virtual {v0, p3}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, p2}, Landroid/app/Service;->stopForeground(Z)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Landroid/app/Service;->stopSelf()V

    .line 197
    .line 198
    .line 199
    :cond_4
    :goto_0
    const/4 p1, 0x3

    .line 200
    return p1
.end method
