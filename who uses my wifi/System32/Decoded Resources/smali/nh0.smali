.class public final Lnh0;
.super Ldh0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final n:Li80;


# instance fields
.field public final i:I

.field public final j:I

.field public final k:Ljava/security/SecureRandom;

.field public final l:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final m:Ljava/util/concurrent/ConcurrentLinkedQueue;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lnh0;

    .line 2
    .line 3
    invoke-static {v0}, Lk80;->d(Ljava/lang/Class;)Li80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lnh0;->n:Li80;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lnh0;->l:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lnh0;->m:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 17
    .line 18
    const-string v0, "os.name"

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "linux"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    const v0, 0x8000

    .line 37
    .line 38
    .line 39
    const v1, 0xee47

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const v0, 0xc000

    .line 44
    .line 45
    .line 46
    const v1, 0xffff

    .line 47
    .line 48
    .line 49
    :goto_0
    const-string v2, "dnsjava.udp.ephemeral.start"

    .line 50
    .line 51
    invoke-static {v2, v0}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iput v0, p0, Lnh0;->i:I

    .line 60
    .line 61
    const-string v2, "dnsjava.udp.ephemeral.end"

    .line 62
    .line 63
    invoke-static {v2, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    sub-int/2addr v1, v0

    .line 72
    iput v1, p0, Lnh0;->j:I

    .line 73
    .line 74
    const-string v0, "dnsjava.udp.ephemeral.use_ephemeral_port"

    .line 75
    .line 76
    invoke-static {v0}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    iput-object v0, p0, Lnh0;->k:Ljava/security/SecureRandom;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    new-instance v0, Ljava/security/SecureRandom;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lnh0;->k:Ljava/security/SecureRandom;

    .line 92
    .line 93
    :goto_1
    new-instance v0, Llh0;

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    invoke-direct {v0, p0, v1}, Llh0;-><init>(Lnh0;I)V

    .line 97
    .line 98
    .line 99
    const-class v1, Ldh0;

    .line 100
    .line 101
    monitor-enter v1

    .line 102
    :try_start_0
    sget-object v2, Ldh0;->c:[Ljava/lang/Runnable;

    .line 103
    .line 104
    const/4 v3, 0x1

    .line 105
    aput-object v0, v2, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 106
    .line 107
    monitor-exit v1

    .line 108
    new-instance v0, Llh0;

    .line 109
    .line 110
    const/4 v1, 0x1

    .line 111
    invoke-direct {v0, p0, v1}, Llh0;-><init>(Lnh0;I)V

    .line 112
    .line 113
    .line 114
    const-class v2, Ldh0;

    .line 115
    .line 116
    monitor-enter v2

    .line 117
    :try_start_1
    sget-object v1, Ldh0;->b:[Ljava/lang/Runnable;

    .line 118
    .line 119
    aput-object v0, v1, v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 120
    .line 121
    monitor-exit v2

    .line 122
    new-instance v0, Llh0;

    .line 123
    .line 124
    const/4 v1, 0x2

    .line 125
    invoke-direct {v0, p0, v1}, Llh0;-><init>(Lnh0;I)V

    .line 126
    .line 127
    .line 128
    const-class v1, Ldh0;

    .line 129
    .line 130
    monitor-enter v1

    .line 131
    :try_start_2
    sget-object v2, Ldh0;->d:[Ljava/lang/Runnable;

    .line 132
    .line 133
    aput-object v0, v2, v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 134
    .line 135
    monitor-exit v1

    .line 136
    return-void

    .line 137
    :catchall_0
    move-exception v0

    .line 138
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 139
    throw v0

    .line 140
    :catchall_1
    move-exception v0

    .line 141
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 142
    throw v0

    .line 143
    :catchall_2
    move-exception v0

    .line 144
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 145
    throw v0
.end method

.method public static e(Ljava/nio/channels/DatagramChannel;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :cond_0
    return-void
.end method
