.class public final Lpb3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lrj4;
.implements Lws2;
.implements Lnp2;
.implements Lgj4;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lpb3;->f:I

    const/4 p1, 0x0

    iput-object p1, p0, Lpb3;->g:Ljava/lang/Object;

    iput-object p1, p0, Lpb3;->h:Ljava/lang/Object;

    iput-object p1, p0, Lpb3;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ldf4;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lpb3;->f:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb3;->i:Ljava/lang/Object;

    new-instance p1, Landroid/os/Handler;

    .line 8
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lpb3;->g:Ljava/lang/Object;

    .line 9
    new-instance p1, Lcf4;

    invoke-direct {p1, p0}, Lcf4;-><init>(Lpb3;)V

    iput-object p1, p0, Lpb3;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ldj4;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lpb3;->f:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb3;->i:Ljava/lang/Object;

    iput-object p2, p0, Lpb3;->g:Ljava/lang/Object;

    iput-object p3, p0, Lpb3;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lpb3;->f:I

    iput-object p1, p0, Lpb3;->g:Ljava/lang/Object;

    iput-object p2, p0, Lpb3;->h:Ljava/lang/Object;

    iput-object p3, p0, Lpb3;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lpb3;->f:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwt2;

    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, v1}, Lwt2;-><init>(I)V

    .line 12
    iput-object v0, p0, Lpb3;->h:Ljava/lang/Object;

    iput-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 13
    iput-object p1, p0, Lpb3;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ls2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lpb3;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb3;->g:Ljava/lang/Object;

    iput-object p2, p0, Lpb3;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lw54;Lxd4;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lpb3;->f:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb3;->i:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashMap;

    .line 6
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lpb3;->g:Ljava/lang/Object;

    iput-object p2, p0, Lpb3;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    check-cast v0, Lls2;

    invoke-virtual {v0}, Lls2;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmo1;

    iget-object v1, p0, Lpb3;->h:Ljava/lang/Object;

    check-cast v1, Luk1;

    .line 2
    invoke-virtual {v1}, Luk1;->j()Lgi1;

    move-result-object v1

    iget-object v2, p0, Lpb3;->i:Ljava/lang/Object;

    check-cast v2, Lls2;

    .line 3
    invoke-virtual {v2}, Lls2;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz42;

    new-instance v3, Lva4;

    .line 4
    invoke-direct {v3, v0, v1, v2}, Lva4;-><init>(Lmo1;Lgi1;Lz42;)V

    return-object v3
.end method

.method public declared-synchronized a()Lqj4;
    .locals 4

    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    check-cast v0, Lw54;

    .line 6
    iget-object v1, v0, Lw54;->c:Lvj4;

    .line 7
    iget-object v2, p0, Lpb3;->g:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v1}, Lvj4;->a()Lqj4;

    move-result-object v1

    iget-object v3, p0, Lpb3;->h:Ljava/lang/Object;

    check-cast v3, Lxd4;

    .line 8
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    iget-object v0, v0, Lw54;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li54;

    if-eqz v0, :cond_0

    .line 11
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget v2, v0, Li54;->d:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Li54;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 12
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v1

    :catchall_1
    move-exception v0

    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0
.end method

.method public declared-synchronized b(Lcj1;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lw54;

    .line 5
    .line 6
    iget-object v0, v0, Lw54;->c:Lvj4;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lvj4;->b(Lcj1;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    :goto_0
    if-eqz p1, :cond_2

    .line 12
    .line 13
    iget-object v0, p1, Lcj1;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lqj4;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lpb3;->k(Lqj4;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, Lcj1;->i:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lcj1;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object v0, p1, Lcj1;->h:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lqj4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    :cond_1
    const/4 p1, 0x0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwt2;

    .line 4
    .line 5
    iget-object v0, v0, Lwt2;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lkh4;

    .line 8
    .line 9
    check-cast p1, Lrh4;

    .line 10
    .line 11
    iget-object v1, p0, Lpb3;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lch4;

    .line 14
    .line 15
    iget-object v2, p0, Lpb3;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lhh4;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-interface {p1, v3, v0, v1, v2}, Lrh4;->r(ILkh4;Lch4;Lhh4;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public declared-synchronized d(Lqj4;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lw54;

    .line 5
    .line 6
    iget-object v0, v0, Lw54;->c:Lvj4;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lvj4;->d(Lqj4;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lpb3;->k(Lqj4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public e(ILd02;[I)Lsn3;
    .locals 10

    .line 1
    sget-object v0, Lxm3;->g:Lvm3;

    .line 2
    .line 3
    const-string v0, "initialCapacity"

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-static {v0, v1}, Lob1;->z(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-array v0, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    move v4, v1

    .line 13
    move v9, v4

    .line 14
    :goto_0
    iget v1, p2, Ld02;->a:I

    .line 15
    .line 16
    if-ge v4, v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Lpb3;->h:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v8, v1

    .line 21
    check-cast v8, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p0, Lpb3;->g:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v7, v1

    .line 26
    check-cast v7, Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p0, Lpb3;->i:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v5, v1

    .line 31
    check-cast v5, Ldj4;

    .line 32
    .line 33
    new-instance v1, Lfj4;

    .line 34
    .line 35
    aget v6, p3, v4

    .line 36
    .line 37
    move v2, p1

    .line 38
    move-object v3, p2

    .line 39
    invoke-direct/range {v1 .. v8}, Lfj4;-><init>(ILd02;ILdj4;ILjava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    array-length p1, v0

    .line 43
    add-int/lit8 p2, v9, 0x1

    .line 44
    .line 45
    invoke-static {p1, p2}, Lrm3;->d(II)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-gt v5, p1, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    move-object v0, p1

    .line 57
    :goto_1
    aput-object v1, v0, v9

    .line 58
    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    move v9, p2

    .line 62
    move p1, v2

    .line 63
    move-object p2, v3

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-static {v0, v9}, Lxm3;->o([Ljava/lang/Object;I)Lsn3;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method

.method public f()Les3;
    .locals 5

    .line 1
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lhs3;

    .line 4
    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    iget-object v1, p0, Lpb3;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lyf3;

    .line 10
    .line 11
    if-eqz v1, :cond_8

    .line 12
    .line 13
    iget v2, v0, Lhs3;->a:I

    .line 14
    .line 15
    iget-object v1, v1, Lyf3;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lv34;

    .line 18
    .line 19
    iget-object v1, v1, Lv34;->a:[B

    .line 20
    .line 21
    array-length v1, v1

    .line 22
    if-ne v2, v1, :cond_7

    .line 23
    .line 24
    invoke-virtual {v0}, Lhs3;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/lang/Integer;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 38
    .line 39
    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :cond_1
    :goto_0
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lhs3;

    .line 48
    .line 49
    invoke-virtual {v0}, Lhs3;->a()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Ljava/lang/Integer;

    .line 58
    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 63
    .line 64
    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_3
    :goto_1
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lhs3;

    .line 73
    .line 74
    iget-object v0, v0, Lhs3;->c:Lgs3;

    .line 75
    .line 76
    sget-object v1, Lgs3;->j:Lgs3;

    .line 77
    .line 78
    if-ne v0, v1, :cond_4

    .line 79
    .line 80
    sget-object v0, Lsv3;->a:Lv34;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    sget-object v1, Lgs3;->i:Lgs3;

    .line 84
    .line 85
    if-ne v0, v1, :cond_5

    .line 86
    .line 87
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {v0}, Lsv3;->a(I)Lv34;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto :goto_2

    .line 100
    :cond_5
    sget-object v1, Lgs3;->h:Lgs3;

    .line 101
    .line 102
    if-ne v0, v1, :cond_6

    .line 103
    .line 104
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-static {v0}, Lsv3;->b(I)Lv34;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_2
    new-instance v1, Les3;

    .line 117
    .line 118
    iget-object v2, p0, Lpb3;->g:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Lhs3;

    .line 121
    .line 122
    iget-object v3, p0, Lpb3;->h:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v3, Lyf3;

    .line 125
    .line 126
    iget-object v4, p0, Lpb3;->i:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v4, Ljava/lang/Integer;

    .line 129
    .line 130
    invoke-direct {v1, v2, v3, v0, v4}, Les3;-><init>(Lhs3;Lyf3;Lv34;Ljava/lang/Integer;)V

    .line 131
    .line 132
    .line 133
    return-object v1

    .line 134
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 135
    .line 136
    iget-object v1, p0, Lpb3;->g:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, Lhs3;

    .line 139
    .line 140
    iget-object v1, v1, Lhs3;->c:Lgs3;

    .line 141
    .line 142
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    const-string v2, "Unknown AesEaxParameters.Variant: "

    .line 147
    .line 148
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 157
    .line 158
    const-string v1, "Key size mismatch"

    .line 159
    .line 160
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v0

    .line 164
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 165
    .line 166
    const-string v1, "Cannot build without parameters and/or key material"

    .line 167
    .line 168
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v0
.end method

.method public g()Lns3;
    .locals 5

    .line 1
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqs3;

    .line 4
    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    iget-object v1, p0, Lpb3;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lyf3;

    .line 10
    .line 11
    if-eqz v1, :cond_8

    .line 12
    .line 13
    iget v2, v0, Lqs3;->a:I

    .line 14
    .line 15
    iget-object v1, v1, Lyf3;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lv34;

    .line 18
    .line 19
    iget-object v1, v1, Lv34;->a:[B

    .line 20
    .line 21
    array-length v1, v1

    .line 22
    if-ne v2, v1, :cond_7

    .line 23
    .line 24
    invoke-virtual {v0}, Lqs3;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/lang/Integer;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 38
    .line 39
    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :cond_1
    :goto_0
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lqs3;

    .line 48
    .line 49
    invoke-virtual {v0}, Lqs3;->a()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Ljava/lang/Integer;

    .line 58
    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 63
    .line 64
    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_3
    :goto_1
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lqs3;

    .line 73
    .line 74
    iget-object v0, v0, Lqs3;->b:Lps3;

    .line 75
    .line 76
    sget-object v1, Lps3;->j:Lps3;

    .line 77
    .line 78
    if-ne v0, v1, :cond_4

    .line 79
    .line 80
    sget-object v0, Lsv3;->a:Lv34;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    sget-object v1, Lps3;->i:Lps3;

    .line 84
    .line 85
    if-ne v0, v1, :cond_5

    .line 86
    .line 87
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {v0}, Lsv3;->a(I)Lv34;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto :goto_2

    .line 100
    :cond_5
    sget-object v1, Lps3;->h:Lps3;

    .line 101
    .line 102
    if-ne v0, v1, :cond_6

    .line 103
    .line 104
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-static {v0}, Lsv3;->b(I)Lv34;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_2
    new-instance v1, Lns3;

    .line 117
    .line 118
    iget-object v2, p0, Lpb3;->g:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Lqs3;

    .line 121
    .line 122
    iget-object v3, p0, Lpb3;->h:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v3, Lyf3;

    .line 125
    .line 126
    iget-object v4, p0, Lpb3;->i:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v4, Ljava/lang/Integer;

    .line 129
    .line 130
    invoke-direct {v1, v2, v3, v0, v4}, Lns3;-><init>(Lqs3;Lyf3;Lv34;Ljava/lang/Integer;)V

    .line 131
    .line 132
    .line 133
    return-object v1

    .line 134
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 135
    .line 136
    iget-object v1, p0, Lpb3;->g:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, Lqs3;

    .line 139
    .line 140
    iget-object v1, v1, Lqs3;->b:Lps3;

    .line 141
    .line 142
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    const-string v2, "Unknown AesGcmSivParameters.Variant: "

    .line 147
    .line 148
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 157
    .line 158
    const-string v1, "Key size mismatch"

    .line 159
    .line 160
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v0

    .line 164
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 165
    .line 166
    const-string v1, "Cannot build without parameters and/or key material"

    .line 167
    .line 168
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v0
.end method

.method public h()Lpw3;
    .locals 5

    .line 1
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrw3;

    .line 4
    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    iget-object v1, p0, Lpb3;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lyf3;

    .line 10
    .line 11
    if-eqz v1, :cond_9

    .line 12
    .line 13
    iget v2, v0, Lrw3;->a:I

    .line 14
    .line 15
    iget-object v1, v1, Lyf3;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lv34;

    .line 18
    .line 19
    iget-object v1, v1, Lv34;->a:[B

    .line 20
    .line 21
    array-length v1, v1

    .line 22
    if-ne v2, v1, :cond_8

    .line 23
    .line 24
    invoke-virtual {v0}, Lrw3;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/lang/Integer;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 38
    .line 39
    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :cond_1
    :goto_0
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lrw3;

    .line 48
    .line 49
    invoke-virtual {v0}, Lrw3;->a()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Ljava/lang/Integer;

    .line 58
    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 63
    .line 64
    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_3
    :goto_1
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lrw3;

    .line 73
    .line 74
    iget-object v0, v0, Lrw3;->c:Lgs3;

    .line 75
    .line 76
    sget-object v1, Lgs3;->n:Lgs3;

    .line 77
    .line 78
    if-ne v0, v1, :cond_4

    .line 79
    .line 80
    sget-object v0, Lsv3;->a:Lv34;

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    sget-object v1, Lgs3;->m:Lgs3;

    .line 84
    .line 85
    if-eq v0, v1, :cond_7

    .line 86
    .line 87
    sget-object v1, Lgs3;->l:Lgs3;

    .line 88
    .line 89
    if-ne v0, v1, :cond_5

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    sget-object v1, Lgs3;->k:Lgs3;

    .line 93
    .line 94
    if-ne v0, v1, :cond_6

    .line 95
    .line 96
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-static {v0}, Lsv3;->b(I)Lv34;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    goto :goto_3

    .line 109
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    iget-object v1, p0, Lpb3;->g:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Lrw3;

    .line 114
    .line 115
    iget-object v1, v1, Lrw3;->c:Lgs3;

    .line 116
    .line 117
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const-string v2, "Unknown AesCmacParametersParameters.Variant: "

    .line 122
    .line 123
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :cond_7
    :goto_2
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Ljava/lang/Integer;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    invoke-static {v0}, Lsv3;->a(I)Lv34;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    :goto_3
    new-instance v1, Lpw3;

    .line 144
    .line 145
    iget-object v2, p0, Lpb3;->g:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Lrw3;

    .line 148
    .line 149
    iget-object v3, p0, Lpb3;->h:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v3, Lyf3;

    .line 152
    .line 153
    iget-object v4, p0, Lpb3;->i:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v4, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-direct {v1, v2, v3, v0, v4}, Lpw3;-><init>(Lrw3;Lyf3;Lv34;Ljava/lang/Integer;)V

    .line 158
    .line 159
    .line 160
    return-object v1

    .line 161
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 162
    .line 163
    const-string v1, "Key size mismatch"

    .line 164
    .line 165
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v0

    .line 169
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 170
    .line 171
    const-string v1, "Cannot build without parameters and/or key material"

    .line 172
    .line 173
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v0
.end method

.method public i()Luw3;
    .locals 5

    .line 1
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzw3;

    .line 4
    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    iget-object v1, p0, Lpb3;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lyf3;

    .line 10
    .line 11
    if-eqz v1, :cond_9

    .line 12
    .line 13
    iget v2, v0, Lzw3;->a:I

    .line 14
    .line 15
    iget-object v1, v1, Lyf3;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lv34;

    .line 18
    .line 19
    iget-object v1, v1, Lv34;->a:[B

    .line 20
    .line 21
    array-length v1, v1

    .line 22
    if-ne v2, v1, :cond_8

    .line 23
    .line 24
    invoke-virtual {v0}, Lzw3;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/lang/Integer;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 38
    .line 39
    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :cond_1
    :goto_0
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lzw3;

    .line 48
    .line 49
    invoke-virtual {v0}, Lzw3;->a()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Ljava/lang/Integer;

    .line 58
    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 63
    .line 64
    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_3
    :goto_1
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lzw3;

    .line 73
    .line 74
    iget-object v0, v0, Lzw3;->c:Lyw3;

    .line 75
    .line 76
    sget-object v1, Lyw3;->e:Lyw3;

    .line 77
    .line 78
    if-ne v0, v1, :cond_4

    .line 79
    .line 80
    sget-object v0, Lsv3;->a:Lv34;

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    sget-object v1, Lyw3;->d:Lyw3;

    .line 84
    .line 85
    if-eq v0, v1, :cond_7

    .line 86
    .line 87
    sget-object v1, Lyw3;->c:Lyw3;

    .line 88
    .line 89
    if-ne v0, v1, :cond_5

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    sget-object v1, Lyw3;->b:Lyw3;

    .line 93
    .line 94
    if-ne v0, v1, :cond_6

    .line 95
    .line 96
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-static {v0}, Lsv3;->b(I)Lv34;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    goto :goto_3

    .line 109
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    iget-object v1, p0, Lpb3;->g:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Lzw3;

    .line 114
    .line 115
    iget-object v1, v1, Lzw3;->c:Lyw3;

    .line 116
    .line 117
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const-string v2, "Unknown HmacParameters.Variant: "

    .line 122
    .line 123
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :cond_7
    :goto_2
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Ljava/lang/Integer;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    invoke-static {v0}, Lsv3;->a(I)Lv34;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    :goto_3
    new-instance v1, Luw3;

    .line 144
    .line 145
    iget-object v2, p0, Lpb3;->g:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Lzw3;

    .line 148
    .line 149
    iget-object v3, p0, Lpb3;->h:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v3, Lyf3;

    .line 152
    .line 153
    iget-object v4, p0, Lpb3;->i:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v4, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-direct {v1, v2, v3, v0, v4}, Luw3;-><init>(Lzw3;Lyf3;Lv34;Ljava/lang/Integer;)V

    .line 158
    .line 159
    .line 160
    return-object v1

    .line 161
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 162
    .line 163
    const-string v1, "Key size mismatch"

    .line 164
    .line 165
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v0

    .line 169
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 170
    .line 171
    const-string v1, "Cannot build without parameters and/or key material"

    .line 172
    .line 173
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v0
.end method

.method public j()Le24;
    .locals 6

    .line 1
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc24;

    .line 4
    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    iget-object v0, p0, Lpb3;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/math/BigInteger;

    .line 10
    .line 11
    if-eqz v0, :cond_9

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lpb3;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lc24;

    .line 20
    .line 21
    iget v2, v1, Lc24;->a:I

    .line 22
    .line 23
    if-ne v0, v2, :cond_8

    .line 24
    .line 25
    invoke-virtual {v1}, Lc24;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/lang/Integer;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 39
    .line 40
    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    :goto_0
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lc24;

    .line 49
    .line 50
    invoke-virtual {v0}, Lc24;->a()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/lang/Integer;

    .line 59
    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 64
    .line 65
    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 66
    .line 67
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0

    .line 71
    :cond_3
    :goto_1
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lc24;

    .line 74
    .line 75
    iget-object v0, v0, Lc24;->c:Lb24;

    .line 76
    .line 77
    sget-object v1, Lb24;->e:Lb24;

    .line 78
    .line 79
    if-ne v0, v1, :cond_4

    .line 80
    .line 81
    sget-object v0, Lsv3;->a:Lv34;

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    sget-object v1, Lb24;->d:Lb24;

    .line 85
    .line 86
    if-eq v0, v1, :cond_7

    .line 87
    .line 88
    sget-object v1, Lb24;->c:Lb24;

    .line 89
    .line 90
    if-ne v0, v1, :cond_5

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_5
    sget-object v1, Lb24;->b:Lb24;

    .line 94
    .line 95
    if-ne v0, v1, :cond_6

    .line 96
    .line 97
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-static {v0}, Lsv3;->b(I)Lv34;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    goto :goto_3

    .line 110
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    iget-object v1, p0, Lpb3;->g:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Lc24;

    .line 115
    .line 116
    iget-object v1, v1, Lc24;->c:Lb24;

    .line 117
    .line 118
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const-string v2, "Unknown RsaSsaPkcs1Parameters.Variant: "

    .line 123
    .line 124
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :cond_7
    :goto_2
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Ljava/lang/Integer;

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    invoke-static {v0}, Lsv3;->a(I)Lv34;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    :goto_3
    new-instance v1, Le24;

    .line 145
    .line 146
    iget-object v2, p0, Lpb3;->g:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v2, Lc24;

    .line 149
    .line 150
    iget-object v3, p0, Lpb3;->h:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v3, Ljava/math/BigInteger;

    .line 153
    .line 154
    iget-object v4, p0, Lpb3;->i:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v4, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-direct {v1, v2, v3, v0, v4}, Le24;-><init>(Lc24;Ljava/math/BigInteger;Lv34;Ljava/lang/Integer;)V

    .line 159
    .line 160
    .line 161
    return-object v1

    .line 162
    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 163
    .line 164
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    add-int/lit8 v3, v3, 0x38

    .line 177
    .line 178
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    new-instance v5, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    add-int/2addr v3, v4

    .line 185
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 186
    .line 187
    .line 188
    const-string v3, "Got modulus size "

    .line 189
    .line 190
    const-string v4, ", but parameters requires modulus size "

    .line 191
    .line 192
    invoke-static {v5, v3, v0, v4, v2}, Lga1;->l(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v1

    .line 200
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 201
    .line 202
    const-string v1, "Cannot build without modulus"

    .line 203
    .line 204
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw v0

    .line 208
    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 209
    .line 210
    const-string v1, "Cannot build without parameters"

    .line 211
    .line 212
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v0
.end method

.method public k(Lqj4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lpb3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lxd4;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lw54;

    .line 17
    .line 18
    iget-object v0, v0, Lw54;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Li54;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    monitor-enter p1

    .line 29
    :try_start_0
    iget v0, p1, Li54;->d:I

    .line 30
    .line 31
    add-int/lit8 v0, v0, -0x1

    .line 32
    .line 33
    iput v0, p1, Li54;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    monitor-exit p1

    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw v0

    .line 40
    :cond_0
    return-void
.end method

.method public declared-synchronized l()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lpb3;->i:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lw54;

    .line 5
    .line 6
    iget-object v0, v0, Lw54;->c:Lvj4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lvj4;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lpb3;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lpb3;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x7b

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lpb3;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lwt2;

    .line 33
    .line 34
    iget-object v1, v1, Lwt2;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lwt2;

    .line 37
    .line 38
    const-string v2, ""

    .line 39
    .line 40
    :goto_0
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v3, v1, Lwt2;->g:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v2}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    add-int/lit8 v3, v3, -0x1

    .line 72
    .line 73
    const/4 v4, 0x1

    .line 74
    invoke-virtual {v0, v2, v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :goto_1
    iget-object v1, v1, Lwt2;->h:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, Lwt2;

    .line 84
    .line 85
    const-string v2, ", "

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    const/16 v1, 0x7d

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
