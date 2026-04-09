.class public final Lml;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final g:I

.field public final h:I

.field public final i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lml;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lml;->j:Ljava/lang/Object;

    iput p2, p0, Lml;->g:I

    iput-object p3, p0, Lml;->i:Ljava/lang/Object;

    iput p4, p0, Lml;->h:I

    return-void
.end method

.method public constructor <init>(Lnl;IILandroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lml;->f:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lml;->j:Ljava/lang/Object;

    iput p2, p0, Lml;->g:I

    iput p3, p0, Lml;->h:I

    iput-object p4, p0, Lml;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lql0;Ljava/net/InetAddress;II)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lml;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lml;->j:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lml;->i:Ljava/lang/Object;

    .line 4
    iput p3, p0, Lml;->g:I

    .line 5
    iput p4, p0, Lml;->h:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lml;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lml;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/app/Notification;

    .line 9
    .line 10
    iget v1, p0, Lml;->g:I

    .line 11
    .line 12
    iget-object v2, p0, Lml;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 15
    .line 16
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v4, 0x1d

    .line 19
    .line 20
    if-lt v3, v4, :cond_0

    .line 21
    .line 22
    iget v3, p0, Lml;->h:I

    .line 23
    .line 24
    invoke-static {v2, v1, v0, v3}, Lr0;->r(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v2, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void

    .line 32
    :pswitch_0
    iget v0, p0, Lml;->h:I

    .line 33
    .line 34
    iget-object v1, p0, Lml;->i:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ljava/net/InetAddress;

    .line 37
    .line 38
    iget v2, p0, Lml;->g:I

    .line 39
    .line 40
    iget-object v3, p0, Lml;->j:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Lql0;

    .line 43
    .line 44
    iget-boolean v4, v3, Lql0;->d:Z

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    goto :goto_7

    .line 49
    :cond_1
    const/4 v4, 0x0

    .line 50
    :try_start_0
    new-instance v5, Ljava/net/Socket;

    .line 51
    .line 52
    invoke-direct {v5}, Ljava/net/Socket;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 53
    .line 54
    .line 55
    :try_start_1
    new-instance v4, Ljava/net/InetSocketAddress;

    .line 56
    .line 57
    invoke-direct {v4, v1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v4, v0}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    :try_start_2
    invoke-virtual {v5}, Ljava/net/Socket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_5

    .line 68
    :catch_0
    move-exception v1

    .line 69
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 70
    .line 71
    .line 72
    goto :goto_5

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    move-object v4, v5

    .line 75
    goto :goto_1

    .line 76
    :catch_1
    move-object v4, v5

    .line 77
    goto :goto_3

    .line 78
    :catchall_1
    move-exception v0

    .line 79
    :goto_1
    if-eqz v4, :cond_2

    .line 80
    .line 81
    :try_start_3
    invoke-virtual {v4}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :catch_2
    move-exception v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 87
    .line 88
    .line 89
    :cond_2
    :goto_2
    throw v0

    .line 90
    :catch_3
    :goto_3
    if-eqz v4, :cond_3

    .line 91
    .line 92
    :try_start_4
    invoke-virtual {v4}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :catch_4
    move-exception v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 98
    .line 99
    .line 100
    :cond_3
    :goto_4
    const/4 v0, 0x0

    .line 101
    :goto_5
    monitor-enter v3

    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    :try_start_5
    iget-object v1, v3, Lql0;->f:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_6

    .line 114
    :catchall_2
    move-exception v0

    .line 115
    goto :goto_8

    .line 116
    :cond_4
    :goto_6
    iget-object v1, v3, Lql0;->g:Lpl0;

    .line 117
    .line 118
    if-eqz v1, :cond_5

    .line 119
    .line 120
    invoke-interface {v1, v2, v0}, Lpl0;->k(IZ)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 121
    .line 122
    .line 123
    :cond_5
    monitor-exit v3

    .line 124
    :goto_7
    return-void

    .line 125
    :goto_8
    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 126
    throw v0

    .line 127
    :pswitch_1
    iget-object v0, p0, Lml;->j:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Lnl;

    .line 130
    .line 131
    iget-object v0, v0, Lnl;->g:Lil;

    .line 132
    .line 133
    iget v1, p0, Lml;->g:I

    .line 134
    .line 135
    iget v2, p0, Lml;->h:I

    .line 136
    .line 137
    iget-object v3, p0, Lml;->i:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, Landroid/os/Bundle;

    .line 140
    .line 141
    invoke-virtual {v0, v1, v2, v3}, Lil;->c(IILandroid/os/Bundle;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
