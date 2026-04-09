.class public final Lz42;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lzs1;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/util/concurrent/atomic/AtomicReference;

.field public final d:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Lzs1;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz42;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lz42;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    iput-object p1, p0, Lz42;->a:Lzs1;

    .line 19
    .line 20
    iput-object p2, p0, Lz42;->b:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 13

    .line 1
    iget-object v0, p0, Lz42;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lz52;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "UserMessagingPlatform"

    .line 12
    .line 13
    const-string v1, "Failed to load and cache a form due to null consent form resources."

    .line 14
    .line 15
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v1, p0, Lz42;->a:Lzs1;

    .line 20
    .line 21
    invoke-virtual {v1}, Lzs1;->a()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lf20;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v1, v1, Lf20;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lgi1;

    .line 33
    .line 34
    iget-object v2, v1, Lgi1;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lax0;

    .line 37
    .line 38
    new-instance v3, Lvg0;

    .line 39
    .line 40
    const/16 v4, 0x10

    .line 41
    .line 42
    invoke-direct {v3, v4, v2}, Lvg0;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v3}, Lls2;->b(Lws2;)Lls2;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    new-instance v2, Lax0;

    .line 50
    .line 51
    invoke-direct {v2, v0}, Lax0;-><init>(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance v10, Lzs1;

    .line 55
    .line 56
    const/16 v0, 0x14

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-direct {v10, v0, v3}, Lzs1;-><init>(IZ)V

    .line 60
    .line 61
    .line 62
    iget-object v0, v1, Lgi1;->g:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v6, v0

    .line 65
    check-cast v6, Lax0;

    .line 66
    .line 67
    iget-object v0, v1, Lgi1;->k:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v8, v0

    .line 70
    check-cast v8, Lls2;

    .line 71
    .line 72
    iget-object v0, v1, Lgi1;->m:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v9, v0

    .line 75
    check-cast v9, Lxn1;

    .line 76
    .line 77
    iget-object v0, v1, Lgi1;->h:Ljava/lang/Object;

    .line 78
    .line 79
    move-object v11, v0

    .line 80
    check-cast v11, Lls2;

    .line 81
    .line 82
    new-instance v5, Lbu1;

    .line 83
    .line 84
    const/4 v12, 0x5

    .line 85
    invoke-direct/range {v5 .. v12}, Lbu1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    move-object v0, v10

    .line 89
    move-object v9, v11

    .line 90
    new-instance v11, Lvq2;

    .line 91
    .line 92
    const/16 v3, 0x19

    .line 93
    .line 94
    invoke-direct {v11, v7, v5, v3}, Lvq2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 95
    .line 96
    .line 97
    iget-object v1, v1, Lgi1;->i:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Lls2;

    .line 100
    .line 101
    new-instance v5, Lbu1;

    .line 102
    .line 103
    const/4 v12, 0x3

    .line 104
    move-object v10, v2

    .line 105
    move-object v8, v7

    .line 106
    move-object v7, v1

    .line 107
    invoke-direct/range {v5 .. v12}, Lbu1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 108
    .line 109
    .line 110
    invoke-static {v5}, Lls2;->b(Lws2;)Lls2;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget-object v2, v0, Lzs1;->g:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v2, Lls2;

    .line 117
    .line 118
    if-nez v2, :cond_1

    .line 119
    .line 120
    iput-object v1, v0, Lzs1;->g:Ljava/lang/Object;

    .line 121
    .line 122
    invoke-virtual {v0}, Lzs1;->a()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Lbw1;

    .line 127
    .line 128
    const/4 v1, 0x1

    .line 129
    iput-boolean v1, v0, Lbw1;->l:Z

    .line 130
    .line 131
    sget-object v1, Lok2;->a:Landroid/os/Handler;

    .line 132
    .line 133
    new-instance v2, Ljq3;

    .line 134
    .line 135
    const/16 v3, 0x1b

    .line 136
    .line 137
    invoke-direct {v2, p0, v0, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 147
    .line 148
    .line 149
    throw v0
.end method
