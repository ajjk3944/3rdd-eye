.class public final synthetic Lbh0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lbh0;->f:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lbh0;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    sput-boolean v0, Ldh0;->h:Z

    .line 8
    .line 9
    :try_start_0
    sget-object v0, Ldh0;->d:[Ljava/lang/Runnable;

    .line 10
    .line 11
    invoke-static {v0}, Ldh0;->b([Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    sget-object v1, Ldh0;->a:Li80;

    .line 17
    .line 18
    const-string v2, "Failed to execute shutdown task, ignoring and continuing close"

    .line 19
    .line 20
    invoke-interface {v1, v2, v0}, Li80;->p(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    sget-object v0, Ldh0;->g:Ljava/nio/channels/Selector;

    .line 24
    .line 25
    sget-object v1, Ldh0;->e:Ljava/lang/Thread;

    .line 26
    .line 27
    const-class v2, Ldh0;

    .line 28
    .line 29
    monitor-enter v2

    .line 30
    const/4 v3, 0x0

    .line 31
    :try_start_1
    sput-object v3, Ldh0;->g:Ljava/nio/channels/Selector;

    .line 32
    .line 33
    sput-object v3, Ldh0;->e:Ljava/lang/Thread;

    .line 34
    .line 35
    sput-object v3, Ldh0;->f:Ljava/lang/Thread;

    .line 36
    .line 37
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    .line 41
    .line 42
    .line 43
    :try_start_2
    invoke-virtual {v0}, Ljava/nio/channels/Selector;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catch_1
    move-exception v0

    .line 48
    sget-object v2, Ldh0;->a:Li80;

    .line 49
    .line 50
    const-string v3, "Failed to properly close selector, ignoring and continuing close"

    .line 51
    .line 52
    invoke-interface {v2, v3, v0}, Li80;->p(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    :goto_1
    if-eqz v1, :cond_1

    .line 56
    .line 57
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Thread;->join()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :catch_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 66
    .line 67
    .line 68
    :cond_1
    :goto_2
    return-void

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 71
    throw v0

    .line 72
    :pswitch_0
    const-string v0, "dnsjava.nio.selector_timeout"

    .line 73
    .line 74
    const/16 v1, 0x3e8

    .line 75
    .line 76
    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-lez v0, :cond_5

    .line 85
    .line 86
    if-gt v0, v1, :cond_5

    .line 87
    .line 88
    :catch_3
    :cond_2
    :goto_3
    sget-boolean v1, Ldh0;->h:Z

    .line 89
    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    :try_start_5
    sget-object v1, Ldh0;->g:Ljava/nio/channels/Selector;

    .line 93
    .line 94
    int-to-long v2, v0

    .line 95
    invoke-virtual {v1, v2, v3}, Ljava/nio/channels/Selector;->select(J)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_3

    .line 100
    .line 101
    sget-object v1, Ldh0;->b:[Ljava/lang/Runnable;

    .line 102
    .line 103
    invoke-static {v1}, Ldh0;->b([Ljava/lang/Runnable;)V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :catch_4
    move-exception v1

    .line 108
    goto :goto_5

    .line 109
    :cond_3
    :goto_4
    sget-boolean v1, Ldh0;->h:Z

    .line 110
    .line 111
    if-eqz v1, :cond_2

    .line 112
    .line 113
    sget-object v1, Ldh0;->c:[Ljava/lang/Runnable;

    .line 114
    .line 115
    invoke-static {v1}, Ldh0;->b([Ljava/lang/Runnable;)V

    .line 116
    .line 117
    .line 118
    invoke-static {}, Ldh0;->a()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/nio/channels/ClosedSelectorException; {:try_start_5 .. :try_end_5} :catch_3

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :goto_5
    sget-object v2, Ldh0;->a:Li80;

    .line 123
    .line 124
    invoke-interface {v2, v1}, Li80;->u(Ljava/io/IOException;)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_4
    sget-object v0, Ldh0;->a:Li80;

    .line 129
    .line 130
    const-string v1, "dnsjava NIO selector thread stopped"

    .line 131
    .line 132
    invoke-interface {v0, v1}, Li80;->r(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 137
    .line 138
    const-string v1, "Invalid selector_timeout, must be between 1 and 1000"

    .line 139
    .line 140
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
