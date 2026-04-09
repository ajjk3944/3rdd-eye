.class public final Lm80;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final A:Ljava/util/ArrayList;

.field public static final B:Ljava/util/HashMap;

.field public static final C:I

.field public static final D:Lj10;

.field public static final y:Li80;

.field public static final z:Lwt;


# instance fields
.field public a:Lvp0;

.field public final b:Ljava/util/ArrayList;

.field public final c:I

.field public d:Ltc;

.field public e:Z

.field public final f:I

.field public final g:Lgg0;

.field public final h:I

.field public final i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Ljava/util/ArrayList;

.field public o:[Ltn0;

.field public p:I

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public final w:I

.field public final x:Lj10;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lm80;

    .line 2
    .line 3
    invoke-static {v0}, Lk80;->d(Ljava/lang/Class;)Li80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lm80;->y:Li80;

    .line 8
    .line 9
    const-class v0, Lm80;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    new-instance v1, Lwt;

    .line 13
    .line 14
    invoke-direct {v1}, Lwt;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lm80;->z:Lwt;

    .line 18
    .line 19
    invoke-static {}, Lwp0;->a()Lwp0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v1, v1, Lwp0;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    sput-object v1, Lm80;->A:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v1, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v1, Lm80;->B:Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-static {}, Lwp0;->a()Lwp0;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget v1, v1, Lwp0;->c:I

    .line 39
    .line 40
    sput v1, Lm80;->C:I

    .line 41
    .line 42
    new-instance v1, Lj10;

    .line 43
    .line 44
    invoke-direct {v1}, Lj10;-><init>()V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lm80;->D:Lj10;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw v1
.end method

.method public constructor <init>(Lgg0;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xc

    .line 5
    .line 6
    invoke-static {v0}, Lk31;->a(I)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-static {v1}, Lyl;->a(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lm80;->g:Lgg0;

    .line 14
    .line 15
    iput v0, p0, Lm80;->h:I

    .line 16
    .line 17
    iput v1, p0, Lm80;->i:I

    .line 18
    .line 19
    const-class p1, Lm80;

    .line 20
    .line 21
    monitor-enter p1

    .line 22
    :try_start_0
    const-class v0, Lm80;

    .line 23
    .line 24
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 25
    :try_start_1
    sget-object v2, Lm80;->z:Lwt;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 26
    .line 27
    :try_start_2
    monitor-exit v0

    .line 28
    iput-object v2, p0, Lm80;->a:Lvp0;

    .line 29
    .line 30
    const-class v0, Lm80;

    .line 31
    .line 32
    monitor-enter v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 33
    :try_start_3
    sget-object v2, Lm80;->A:Ljava/util/ArrayList;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 34
    .line 35
    :try_start_4
    monitor-exit v0

    .line 36
    iput-object v2, p0, Lm80;->b:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-class v2, Lm80;

    .line 43
    .line 44
    monitor-enter v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 45
    :try_start_5
    invoke-static {v1}, Lyl;->a(I)V

    .line 46
    .line 47
    .line 48
    sget-object v3, Lm80;->B:Ljava/util/HashMap;

    .line 49
    .line 50
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ltc;

    .line 55
    .line 56
    if-nez v3, :cond_0

    .line 57
    .line 58
    new-instance v3, Ltc;

    .line 59
    .line 60
    invoke-direct {v3, v1}, Ltc;-><init>(I)V

    .line 61
    .line 62
    .line 63
    sget-object v1, Lm80;->B:Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto :goto_1

    .line 71
    :cond_0
    :goto_0
    :try_start_6
    monitor-exit v2

    .line 72
    iput-object v3, p0, Lm80;->d:Ltc;

    .line 73
    .line 74
    monitor-exit p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 75
    sget p1, Lm80;->C:I

    .line 76
    .line 77
    iput p1, p0, Lm80;->c:I

    .line 78
    .line 79
    const/4 p1, 0x3

    .line 80
    iput p1, p0, Lm80;->f:I

    .line 81
    .line 82
    const/4 p1, -0x1

    .line 83
    iput p1, p0, Lm80;->p:I

    .line 84
    .line 85
    const-string p1, "dnsjava.lookup.max_iterations"

    .line 86
    .line 87
    const-string v0, "16"

    .line 88
    .line 89
    invoke-static {p1, v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    iput p1, p0, Lm80;->w:I

    .line 98
    .line 99
    const-string p1, "dnsjava.lookup.use_hosts_file"

    .line 100
    .line 101
    const-string v0, "true"

    .line 102
    .line 103
    invoke-static {p1, v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_1

    .line 112
    .line 113
    const-class p1, Lm80;

    .line 114
    .line 115
    monitor-enter p1

    .line 116
    :try_start_7
    sget-object v0, Lm80;->D:Lj10;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 117
    .line 118
    monitor-exit p1

    .line 119
    iput-object v0, p0, Lm80;->x:Lj10;

    .line 120
    .line 121
    return-void

    .line 122
    :catchall_1
    move-exception v0

    .line 123
    :try_start_8
    monitor-exit p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 124
    throw v0

    .line 125
    :cond_1
    return-void

    .line 126
    :catchall_2
    move-exception v0

    .line 127
    goto :goto_2

    .line 128
    :goto_1
    :try_start_9
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 129
    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 130
    :catchall_3
    move-exception v1

    .line 131
    :try_start_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 132
    :try_start_c
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 133
    :catchall_4
    move-exception v1

    .line 134
    :try_start_d
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 135
    :try_start_e
    throw v1

    .line 136
    :goto_2
    monitor-exit p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 137
    throw v0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lm80;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lm80;->p:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Lookup of "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lm80;->g:Lgg0;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, " "

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    iget v3, p0, Lm80;->i:I

    .line 39
    .line 40
    if-eq v3, v1, :cond_1

    .line 41
    .line 42
    sget-object v1, Lyl;->a:Lxl;

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Lue0;->e(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    :cond_1
    iget v1, p0, Lm80;->h:I

    .line 55
    .line 56
    sget-object v2, Lk31;->a:Lbs0;

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Lue0;->e(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, " isn\'t done"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1
.end method

.method public final b(Lgg0;Lgg0;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lm80;->k:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lm80;->r:Z

    .line 6
    .line 7
    iput-boolean v1, p0, Lm80;->s:Z

    .line 8
    .line 9
    iput-boolean v1, p0, Lm80;->t:Z

    .line 10
    .line 11
    iput-boolean v1, p0, Lm80;->q:Z

    .line 12
    .line 13
    iput-boolean v1, p0, Lm80;->v:Z

    .line 14
    .line 15
    iget v1, p0, Lm80;->j:I

    .line 16
    .line 17
    add-int/2addr v1, v0

    .line 18
    iput v1, p0, Lm80;->j:I

    .line 19
    .line 20
    iget v2, p0, Lm80;->w:I

    .line 21
    .line 22
    if-ge v1, v2, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, Lm80;->n:Ljava/util/ArrayList;

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lm80;->n:Ljava/util/ArrayList;

    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lm80;->n:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lm80;->c(Lgg0;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    :goto_0
    iput v0, p0, Lm80;->p:I

    .line 52
    .line 53
    iput-boolean v0, p0, Lm80;->l:Z

    .line 54
    .line 55
    return-void
.end method

.method public final c(Lgg0;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Lm80;->h:I

    .line 6
    .line 7
    iget-object v3, v1, Lm80;->x:Lj10;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/16 v5, 0x1c

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    if-eqz v3, :cond_5

    .line 15
    .line 16
    if-eq v0, v7, :cond_0

    .line 17
    .line 18
    if-ne v0, v5, :cond_5

    .line 19
    .line 20
    :cond_0
    :try_start_0
    invoke-virtual {v3, v2, v0}, Lj10;->a(Lgg0;I)Ljava/util/Optional;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Ljava/util/Optional;->isPresent()Z

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    if-eqz v8, :cond_5

    .line 29
    .line 30
    iput v6, v1, Lm80;->p:I

    .line 31
    .line 32
    iput-boolean v7, v1, Lm80;->l:Z

    .line 33
    .line 34
    if-ne v0, v7, :cond_2

    .line 35
    .line 36
    new-instance v0, Lf;

    .line 37
    .line 38
    iget v8, v1, Lm80;->i:I

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/net/InetAddress;

    .line 45
    .line 46
    invoke-direct {v0, v2, v7, v8}, Ltn0;-><init>(Lgg0;II)V

    .line 47
    .line 48
    .line 49
    invoke-static {v3}, La30;->d(Ljava/net/InetAddress;)I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    if-ne v8, v7, :cond_1

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/net/InetAddress;->getAddress()[B

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {v3}, Lf;->q([B)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    iput v3, v0, Lf;->k:I

    .line 64
    .line 65
    filled-new-array {v0}, [Lf;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, v1, Lm80;->o:[Ltn0;

    .line 70
    .line 71
    return-void

    .line 72
    :catch_0
    move-exception v0

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 75
    .line 76
    const-string v3, "invalid IPv4 address"

    .line 77
    .line 78
    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_2
    new-instance v0, Lb;

    .line 83
    .line 84
    iget v8, v1, Lm80;->i:I

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Ljava/net/InetAddress;

    .line 91
    .line 92
    invoke-direct {v0, v2, v5, v8}, Ltn0;-><init>(Lgg0;II)V

    .line 93
    .line 94
    .line 95
    invoke-static {v3}, La30;->d(Ljava/net/InetAddress;)I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eq v8, v7, :cond_4

    .line 100
    .line 101
    invoke-static {v3}, La30;->d(Ljava/net/InetAddress;)I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-ne v8, v4, :cond_3

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 109
    .line 110
    const-string v3, "invalid IPv4/IPv6 address"

    .line 111
    .line 112
    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v0

    .line 116
    :cond_4
    :goto_0
    invoke-virtual {v3}, Ljava/net/InetAddress;->getAddress()[B

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    iput-object v3, v0, Lb;->k:[B

    .line 121
    .line 122
    filled-new-array {v0}, [Lb;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iput-object v0, v1, Lm80;->o:[Ltn0;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    .line 128
    return-void

    .line 129
    :goto_1
    sget-object v3, Lm80;->y:Li80;

    .line 130
    .line 131
    invoke-interface {v3, v0}, Li80;->t(Ljava/io/IOException;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    iget-object v0, v1, Lm80;->d:Ltc;

    .line 135
    .line 136
    iget v3, v1, Lm80;->h:I

    .line 137
    .line 138
    iget v8, v1, Lm80;->f:I

    .line 139
    .line 140
    invoke-virtual {v0, v2, v3, v8}, Ltc;->g(Lgg0;II)Lnu0;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    sget-object v3, Lm80;->y:Li80;

    .line 145
    .line 146
    const-string v8, "Lookup for {}/{}, cache answer: {}"

    .line 147
    .line 148
    iget v9, v1, Lm80;->h:I

    .line 149
    .line 150
    sget-object v10, Lk31;->a:Lbs0;

    .line 151
    .line 152
    invoke-virtual {v10, v9}, Lue0;->e(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    filled-new-array {v2, v9, v0}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    invoke-interface {v3, v8, v9}, Li80;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v2, v0}, Lm80;->d(Lgg0;Lnu0;)V

    .line 164
    .line 165
    .line 166
    iget-boolean v0, v1, Lm80;->l:Z

    .line 167
    .line 168
    if-nez v0, :cond_2c

    .line 169
    .line 170
    iget-boolean v0, v1, Lm80;->m:Z

    .line 171
    .line 172
    if-eqz v0, :cond_6

    .line 173
    .line 174
    goto/16 :goto_18

    .line 175
    .line 176
    :cond_6
    iget v0, v1, Lm80;->h:I

    .line 177
    .line 178
    iget v3, v1, Lm80;->i:I

    .line 179
    .line 180
    const-wide/16 v8, 0x0

    .line 181
    .line 182
    invoke-static {v2, v0, v3, v8, v9}, Ltn0;->i(Lgg0;IIJ)Ltn0;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    new-instance v3, Lme0;

    .line 187
    .line 188
    invoke-direct {v3}, Lme0;-><init>()V

    .line 189
    .line 190
    .line 191
    iget-object v10, v3, Lme0;->f:Ll00;

    .line 192
    .line 193
    invoke-virtual {v10}, Ll00;->e()V

    .line 194
    .line 195
    .line 196
    iget-object v10, v3, Lme0;->f:Ll00;

    .line 197
    .line 198
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    const/4 v11, 0x7

    .line 202
    invoke-static {v11}, Ll00;->a(I)V

    .line 203
    .line 204
    .line 205
    iget v12, v10, Ll00;->g:I

    .line 206
    .line 207
    invoke-static {v11}, Ll00;->a(I)V

    .line 208
    .line 209
    .line 210
    or-int/lit16 v12, v12, 0x100

    .line 211
    .line 212
    iput v12, v10, Ll00;->g:I

    .line 213
    .line 214
    invoke-virtual {v3, v0, v6}, Lme0;->b(Ltn0;I)V

    .line 215
    .line 216
    .line 217
    :try_start_1
    iget-object v0, v1, Lm80;->a:Lvp0;

    .line 218
    .line 219
    invoke-interface {v0, v3}, Lvp0;->c(Lme0;)Lme0;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    .line 224
    .line 225
    .line 226
    :try_start_2
    invoke-virtual {v0, v3}, Lme0;->j(Lme0;)Lme0;

    .line 227
    .line 228
    .line 229
    move-result-object v0
    :try_end_2
    .catch Lt91; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 230
    goto :goto_2

    .line 231
    :catch_1
    const/4 v0, 0x0

    .line 232
    :goto_2
    iget-object v12, v0, Lme0;->f:Ll00;

    .line 233
    .line 234
    iget v12, v12, Ll00;->g:I

    .line 235
    .line 236
    and-int/lit8 v12, v12, 0xf

    .line 237
    .line 238
    const/4 v13, 0x3

    .line 239
    if-eqz v12, :cond_7

    .line 240
    .line 241
    if-eq v12, v13, :cond_7

    .line 242
    .line 243
    iput-boolean v7, v1, Lm80;->r:Z

    .line 244
    .line 245
    sget-object v0, Lpn0;->a:Lue0;

    .line 246
    .line 247
    invoke-virtual {v0, v12}, Lue0;->e(I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_7
    invoke-virtual {v3}, Lme0;->e()Ltn0;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    invoke-virtual {v0}, Lme0;->e()Ltn0;

    .line 256
    .line 257
    .line 258
    move-result-object v12

    .line 259
    invoke-virtual {v3, v12}, Ltn0;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    if-nez v3, :cond_8

    .line 264
    .line 265
    iput-boolean v7, v1, Lm80;->r:Z

    .line 266
    .line 267
    return-void

    .line 268
    :cond_8
    iget-object v3, v1, Lm80;->d:Ltc;

    .line 269
    .line 270
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    iget-object v12, v0, Lme0;->f:Ll00;

    .line 274
    .line 275
    iget v12, v12, Ll00;->g:I

    .line 276
    .line 277
    const/4 v14, 0x5

    .line 278
    invoke-static {v12, v14}, Ll00;->c(II)Z

    .line 279
    .line 280
    .line 281
    move-result v12

    .line 282
    iget-object v15, v0, Lme0;->f:Ll00;

    .line 283
    .line 284
    move-wide/from16 v16, v8

    .line 285
    .line 286
    const/16 v8, 0xa

    .line 287
    .line 288
    iget v9, v15, Ll00;->g:I

    .line 289
    .line 290
    invoke-static {v9, v8}, Ll00;->c(II)Z

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    invoke-virtual {v0}, Lme0;->e()Ltn0;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    iget-object v15, v0, Lme0;->f:Ll00;

    .line 299
    .line 300
    iget v15, v15, Ll00;->g:I

    .line 301
    .line 302
    and-int/lit8 v15, v15, 0xf

    .line 303
    .line 304
    if-eqz v15, :cond_9

    .line 305
    .line 306
    if-ne v15, v13, :cond_a

    .line 307
    .line 308
    :cond_9
    if-nez v9, :cond_b

    .line 309
    .line 310
    :cond_a
    move-object v7, v0

    .line 311
    const/4 v10, 0x0

    .line 312
    goto/16 :goto_16

    .line 313
    .line 314
    :cond_b
    iget-object v5, v9, Ltn0;->f:Lgg0;

    .line 315
    .line 316
    iget v13, v9, Ltn0;->g:I

    .line 317
    .line 318
    iget v9, v9, Ltn0;->h:I

    .line 319
    .line 320
    new-instance v4, Ljava/util/HashSet;

    .line 321
    .line 322
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v7}, Lme0;->g(I)Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object v14

    .line 329
    move-object v10, v5

    .line 330
    move/from16 v19, v6

    .line 331
    .line 332
    const/16 v18, 0x0

    .line 333
    .line 334
    :goto_3
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    if-ge v6, v11, :cond_13

    .line 339
    .line 340
    invoke-interface {v14, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v11

    .line 344
    check-cast v11, Lkn0;

    .line 345
    .line 346
    invoke-virtual {v11}, Lkn0;->e()Ltn0;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    iget v7, v7, Ltn0;->h:I

    .line 351
    .line 352
    if-eq v7, v9, :cond_c

    .line 353
    .line 354
    move/from16 v20, v6

    .line 355
    .line 356
    move/from16 v21, v9

    .line 357
    .line 358
    goto/16 :goto_7

    .line 359
    .line 360
    :cond_c
    invoke-virtual {v11}, Lkn0;->getType()I

    .line 361
    .line 362
    .line 363
    move-result v7

    .line 364
    move/from16 v20, v6

    .line 365
    .line 366
    invoke-virtual {v11}, Lkn0;->e()Ltn0;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    iget-object v6, v6, Ltn0;->f:Lgg0;

    .line 371
    .line 372
    move/from16 v21, v9

    .line 373
    .line 374
    const/4 v9, 0x1

    .line 375
    invoke-static {v9, v12}, Ltc;->f(IZ)I

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    if-eq v7, v13, :cond_d

    .line 380
    .line 381
    const/16 v9, 0xff

    .line 382
    .line 383
    if-ne v13, v9, :cond_10

    .line 384
    .line 385
    :cond_d
    invoke-virtual {v6, v10}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v9

    .line 389
    if-eqz v9, :cond_10

    .line 390
    .line 391
    invoke-virtual {v3, v2, v11, v8}, Ltc;->c(ILkn0;Z)V

    .line 392
    .line 393
    .line 394
    if-ne v10, v5, :cond_f

    .line 395
    .line 396
    if-nez v18, :cond_e

    .line 397
    .line 398
    const/4 v2, 0x0

    .line 399
    const/4 v6, 0x0

    .line 400
    const/4 v9, 0x7

    .line 401
    invoke-static {v9, v2, v6}, Lnu0;->b(ILkn0;Z)Lnu0;

    .line 402
    .line 403
    .line 404
    move-result-object v18

    .line 405
    :goto_4
    move-object/from16 v2, v18

    .line 406
    .line 407
    goto :goto_5

    .line 408
    :cond_e
    const/4 v9, 0x7

    .line 409
    goto :goto_4

    .line 410
    :goto_5
    invoke-virtual {v2, v11}, Lnu0;->a(Lkn0;)V

    .line 411
    .line 412
    .line 413
    move-object/from16 v18, v2

    .line 414
    .line 415
    goto :goto_6

    .line 416
    :cond_f
    const/4 v9, 0x7

    .line 417
    :goto_6
    invoke-static {v11, v4}, Ltc;->h(Lkn0;Ljava/util/HashSet;)V

    .line 418
    .line 419
    .line 420
    const/4 v9, 0x5

    .line 421
    const/16 v19, 0x1

    .line 422
    .line 423
    goto :goto_8

    .line 424
    :cond_10
    const/16 v9, 0x27

    .line 425
    .line 426
    if-ne v7, v9, :cond_14

    .line 427
    .line 428
    invoke-virtual {v10, v6}, Lgg0;->o(Lgg0;)Z

    .line 429
    .line 430
    .line 431
    move-result v9

    .line 432
    if-eqz v9, :cond_14

    .line 433
    .line 434
    invoke-virtual {v3, v2, v11, v8}, Ltc;->c(ILkn0;Z)V

    .line 435
    .line 436
    .line 437
    if-ne v10, v5, :cond_11

    .line 438
    .line 439
    const/4 v2, 0x6

    .line 440
    invoke-static {v2, v11, v8}, Lnu0;->b(ILkn0;Z)Lnu0;

    .line 441
    .line 442
    .line 443
    move-result-object v18

    .line 444
    :cond_11
    add-int/lit8 v6, v20, 0x1

    .line 445
    .line 446
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    if-ge v6, v2, :cond_12

    .line 451
    .line 452
    invoke-interface {v14, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    check-cast v2, Lkn0;

    .line 457
    .line 458
    invoke-virtual {v2}, Lkn0;->getType()I

    .line 459
    .line 460
    .line 461
    move-result v6

    .line 462
    const/4 v7, 0x5

    .line 463
    if-ne v6, v7, :cond_12

    .line 464
    .line 465
    invoke-virtual {v2}, Lkn0;->e()Ltn0;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    iget-object v2, v2, Ltn0;->f:Lgg0;

    .line 470
    .line 471
    invoke-virtual {v2, v10}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    if-eqz v2, :cond_12

    .line 476
    .line 477
    :goto_7
    const/4 v9, 0x5

    .line 478
    goto :goto_8

    .line 479
    :cond_12
    invoke-virtual {v11}, Lkn0;->e()Ltn0;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    check-cast v2, Lbm;

    .line 484
    .line 485
    :try_start_3
    invoke-virtual {v10, v2}, Lgg0;->i(Lbm;)Lgg0;

    .line 486
    .line 487
    .line 488
    move-result-object v10
    :try_end_3
    .catch Lhg0; {:try_start_3 .. :try_end_3} :catch_2

    .line 489
    goto :goto_7

    .line 490
    :catch_2
    :cond_13
    const/4 v2, 0x2

    .line 491
    goto :goto_9

    .line 492
    :cond_14
    const/4 v9, 0x5

    .line 493
    if-ne v7, v9, :cond_16

    .line 494
    .line 495
    invoke-virtual {v6, v10}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v6

    .line 499
    if-eqz v6, :cond_16

    .line 500
    .line 501
    invoke-virtual {v3, v2, v11, v8}, Ltc;->c(ILkn0;Z)V

    .line 502
    .line 503
    .line 504
    if-ne v10, v5, :cond_15

    .line 505
    .line 506
    invoke-static {v9, v11, v8}, Lnu0;->b(ILkn0;Z)Lnu0;

    .line 507
    .line 508
    .line 509
    move-result-object v18

    .line 510
    :cond_15
    invoke-virtual {v11}, Lkn0;->e()Ltn0;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    check-cast v2, Loc;

    .line 515
    .line 516
    iget-object v10, v2, Lgw0;->k:Lgg0;

    .line 517
    .line 518
    :cond_16
    :goto_8
    add-int/lit8 v6, v20, 0x1

    .line 519
    .line 520
    move-object/from16 v2, p1

    .line 521
    .line 522
    move/from16 v9, v21

    .line 523
    .line 524
    const/4 v7, 0x1

    .line 525
    goto/16 :goto_3

    .line 526
    .line 527
    :goto_9
    invoke-virtual {v0, v2}, Lme0;->g(I)Ljava/util/List;

    .line 528
    .line 529
    .line 530
    move-result-object v5

    .line 531
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    const/4 v5, 0x0

    .line 536
    const/4 v6, 0x0

    .line 537
    :cond_17
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 538
    .line 539
    .line 540
    move-result v7

    .line 541
    if-eqz v7, :cond_19

    .line 542
    .line 543
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v7

    .line 547
    check-cast v7, Lkn0;

    .line 548
    .line 549
    invoke-virtual {v7}, Lkn0;->getType()I

    .line 550
    .line 551
    .line 552
    move-result v9

    .line 553
    const/4 v11, 0x6

    .line 554
    if-ne v9, v11, :cond_18

    .line 555
    .line 556
    invoke-virtual {v7}, Lkn0;->e()Ltn0;

    .line 557
    .line 558
    .line 559
    move-result-object v9

    .line 560
    iget-object v9, v9, Ltn0;->f:Lgg0;

    .line 561
    .line 562
    invoke-virtual {v10, v9}, Lgg0;->o(Lgg0;)Z

    .line 563
    .line 564
    .line 565
    move-result v9

    .line 566
    if-eqz v9, :cond_18

    .line 567
    .line 568
    move-object v6, v7

    .line 569
    goto :goto_a

    .line 570
    :cond_18
    invoke-virtual {v7}, Lkn0;->getType()I

    .line 571
    .line 572
    .line 573
    move-result v9

    .line 574
    const/4 v14, 0x2

    .line 575
    if-ne v9, v14, :cond_17

    .line 576
    .line 577
    invoke-virtual {v7}, Lkn0;->e()Ltn0;

    .line 578
    .line 579
    .line 580
    move-result-object v9

    .line 581
    iget-object v9, v9, Ltn0;->f:Lgg0;

    .line 582
    .line 583
    invoke-virtual {v10, v9}, Lgg0;->o(Lgg0;)Z

    .line 584
    .line 585
    .line 586
    move-result v9

    .line 587
    if-eqz v9, :cond_17

    .line 588
    .line 589
    move-object v5, v7

    .line 590
    goto :goto_a

    .line 591
    :cond_19
    if-nez v19, :cond_26

    .line 592
    .line 593
    const/4 v2, 0x3

    .line 594
    if-ne v15, v2, :cond_1a

    .line 595
    .line 596
    const/4 v13, 0x0

    .line 597
    :cond_1a
    if-eq v15, v2, :cond_1b

    .line 598
    .line 599
    if-nez v6, :cond_1b

    .line 600
    .line 601
    if-nez v5, :cond_1c

    .line 602
    .line 603
    :cond_1b
    const/4 v14, 0x2

    .line 604
    goto :goto_b

    .line 605
    :cond_1c
    const/4 v14, 0x2

    .line 606
    invoke-static {v14, v12}, Ltc;->f(IZ)I

    .line 607
    .line 608
    .line 609
    move-result v2

    .line 610
    invoke-virtual {v3, v2, v5, v8}, Ltc;->c(ILkn0;Z)V

    .line 611
    .line 612
    .line 613
    invoke-static {v5, v4}, Ltc;->h(Lkn0;Ljava/util/HashSet;)V

    .line 614
    .line 615
    .line 616
    if-nez v18, :cond_1d

    .line 617
    .line 618
    const/4 v2, 0x4

    .line 619
    invoke-static {v2, v5, v8}, Lnu0;->b(ILkn0;Z)Lnu0;

    .line 620
    .line 621
    .line 622
    move-result-object v18

    .line 623
    :cond_1d
    move-object v7, v0

    .line 624
    goto/16 :goto_12

    .line 625
    .line 626
    :goto_b
    invoke-static {v14, v12}, Ltc;->f(IZ)I

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    if-eqz v6, :cond_1e

    .line 631
    .line 632
    invoke-virtual {v6}, Lkn0;->e()Ltn0;

    .line 633
    .line 634
    .line 635
    move-result-object v5

    .line 636
    check-cast v5, Lrr0;

    .line 637
    .line 638
    goto :goto_c

    .line 639
    :cond_1e
    const/4 v5, 0x0

    .line 640
    :goto_c
    monitor-enter v3

    .line 641
    if-eqz v5, :cond_1f

    .line 642
    .line 643
    :try_start_4
    iget-wide v6, v5, Lrr0;->q:J

    .line 644
    .line 645
    iget-wide v11, v5, Ltn0;->i:J

    .line 646
    .line 647
    invoke-static {v6, v7, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 648
    .line 649
    .line 650
    move-result-wide v6

    .line 651
    goto :goto_d

    .line 652
    :catchall_0
    move-exception v0

    .line 653
    goto :goto_13

    .line 654
    :cond_1f
    move-wide/from16 v6, v16

    .line 655
    .line 656
    :goto_d
    invoke-virtual {v3, v10, v13}, Ltc;->e(Lgg0;I)Lrc;

    .line 657
    .line 658
    .line 659
    move-result-object v9

    .line 660
    cmp-long v6, v6, v16

    .line 661
    .line 662
    if-nez v6, :cond_21

    .line 663
    .line 664
    if-eqz v9, :cond_20

    .line 665
    .line 666
    invoke-interface {v9, v2}, Lrc;->a(I)I

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    if-gtz v2, :cond_20

    .line 671
    .line 672
    invoke-virtual {v3, v10, v13}, Ltc;->j(Lgg0;I)V

    .line 673
    .line 674
    .line 675
    :cond_20
    move-object v7, v0

    .line 676
    goto :goto_f

    .line 677
    :cond_21
    if-eqz v9, :cond_22

    .line 678
    .line 679
    invoke-interface {v9, v2}, Lrc;->a(I)I

    .line 680
    .line 681
    .line 682
    move-result v6

    .line 683
    if-gtz v6, :cond_22

    .line 684
    .line 685
    const/4 v9, 0x0

    .line 686
    :cond_22
    if-nez v9, :cond_20

    .line 687
    .line 688
    new-instance v6, Lsc;

    .line 689
    .line 690
    const/4 v7, -0x1

    .line 691
    int-to-long v11, v7

    .line 692
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 693
    .line 694
    .line 695
    iput-object v10, v6, Lsc;->g:Lgg0;

    .line 696
    .line 697
    iput v13, v6, Lsc;->f:I

    .line 698
    .line 699
    if-eqz v5, :cond_23

    .line 700
    .line 701
    iget-wide v13, v5, Lrr0;->q:J

    .line 702
    .line 703
    move-object v7, v0

    .line 704
    iget-wide v0, v5, Ltn0;->i:J

    .line 705
    .line 706
    invoke-static {v13, v14, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 707
    .line 708
    .line 709
    move-result-wide v0

    .line 710
    goto :goto_e

    .line 711
    :cond_23
    move-object v7, v0

    .line 712
    move-wide/from16 v0, v16

    .line 713
    .line 714
    :goto_e
    iput v2, v6, Lsc;->h:I

    .line 715
    .line 716
    invoke-static {v0, v1, v11, v12}, Ltc;->a(JJ)I

    .line 717
    .line 718
    .line 719
    move-result v0

    .line 720
    iput v0, v6, Lsc;->i:I

    .line 721
    .line 722
    invoke-virtual {v3, v10, v6}, Ltc;->b(Lgg0;Lrc;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 723
    .line 724
    .line 725
    :goto_f
    monitor-exit v3

    .line 726
    if-nez v18, :cond_25

    .line 727
    .line 728
    const/4 v2, 0x3

    .line 729
    if-ne v15, v2, :cond_24

    .line 730
    .line 731
    const/4 v0, 0x2

    .line 732
    :goto_10
    const/4 v2, 0x0

    .line 733
    const/4 v6, 0x0

    .line 734
    goto :goto_11

    .line 735
    :cond_24
    const/4 v0, 0x3

    .line 736
    goto :goto_10

    .line 737
    :goto_11
    invoke-static {v0, v2, v6}, Lnu0;->b(ILkn0;Z)Lnu0;

    .line 738
    .line 739
    .line 740
    move-result-object v18

    .line 741
    :cond_25
    :goto_12
    move-object/from16 v10, v18

    .line 742
    .line 743
    const/4 v2, 0x3

    .line 744
    goto :goto_14

    .line 745
    :goto_13
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 746
    throw v0

    .line 747
    :cond_26
    move-object v7, v0

    .line 748
    if-nez v15, :cond_25

    .line 749
    .line 750
    if-eqz v5, :cond_25

    .line 751
    .line 752
    const/4 v14, 0x2

    .line 753
    invoke-static {v14, v12}, Ltc;->f(IZ)I

    .line 754
    .line 755
    .line 756
    move-result v0

    .line 757
    invoke-virtual {v3, v0, v5, v8}, Ltc;->c(ILkn0;Z)V

    .line 758
    .line 759
    .line 760
    invoke-static {v5, v4}, Ltc;->h(Lkn0;Ljava/util/HashSet;)V

    .line 761
    .line 762
    .line 763
    goto :goto_12

    .line 764
    :goto_14
    invoke-virtual {v7, v2}, Lme0;->g(I)Ljava/util/List;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 773
    .line 774
    .line 775
    move-result v1

    .line 776
    if-eqz v1, :cond_29

    .line 777
    .line 778
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v1

    .line 782
    check-cast v1, Lkn0;

    .line 783
    .line 784
    invoke-virtual {v1}, Lkn0;->getType()I

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    const/4 v9, 0x1

    .line 789
    const/16 v5, 0x1c

    .line 790
    .line 791
    if-eq v2, v9, :cond_27

    .line 792
    .line 793
    if-eq v2, v5, :cond_27

    .line 794
    .line 795
    const/16 v6, 0x26

    .line 796
    .line 797
    if-eq v2, v6, :cond_27

    .line 798
    .line 799
    goto :goto_15

    .line 800
    :cond_27
    invoke-virtual {v1}, Lkn0;->e()Ltn0;

    .line 801
    .line 802
    .line 803
    move-result-object v2

    .line 804
    iget-object v2, v2, Ltn0;->f:Lgg0;

    .line 805
    .line 806
    invoke-virtual {v4, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    if-nez v2, :cond_28

    .line 811
    .line 812
    goto :goto_15

    .line 813
    :cond_28
    const/4 v9, 0x1

    .line 814
    invoke-virtual {v3, v9, v1, v8}, Ltc;->c(ILkn0;Z)V

    .line 815
    .line 816
    .line 817
    goto :goto_15

    .line 818
    :cond_29
    sget-object v0, Ltc;->b:Li80;

    .line 819
    .line 820
    const-string v1, "Caching {} for {}/{}"

    .line 821
    .line 822
    invoke-virtual {v7}, Lme0;->e()Ltn0;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    iget-object v2, v2, Ltn0;->f:Lgg0;

    .line 827
    .line 828
    invoke-virtual {v7}, Lme0;->e()Ltn0;

    .line 829
    .line 830
    .line 831
    move-result-object v3

    .line 832
    iget v3, v3, Ltn0;->g:I

    .line 833
    .line 834
    sget-object v4, Lk31;->a:Lbs0;

    .line 835
    .line 836
    invoke-virtual {v4, v3}, Lue0;->e(I)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v3

    .line 840
    filled-new-array {v10, v2, v3}, [Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    invoke-interface {v0, v1, v2}, Li80;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    :goto_16
    move-object/from16 v1, p0

    .line 848
    .line 849
    if-nez v10, :cond_2a

    .line 850
    .line 851
    iget-object v0, v1, Lm80;->d:Ltc;

    .line 852
    .line 853
    iget v2, v1, Lm80;->h:I

    .line 854
    .line 855
    iget v3, v1, Lm80;->f:I

    .line 856
    .line 857
    move-object/from16 v4, p1

    .line 858
    .line 859
    invoke-virtual {v0, v4, v2, v3}, Ltc;->g(Lgg0;II)Lnu0;

    .line 860
    .line 861
    .line 862
    move-result-object v10

    .line 863
    goto :goto_17

    .line 864
    :cond_2a
    move-object/from16 v4, p1

    .line 865
    .line 866
    :goto_17
    sget-object v0, Lm80;->y:Li80;

    .line 867
    .line 868
    const-string v2, "Queried {}/{}, id={}: {}"

    .line 869
    .line 870
    iget v3, v1, Lm80;->h:I

    .line 871
    .line 872
    sget-object v5, Lk31;->a:Lbs0;

    .line 873
    .line 874
    invoke-virtual {v5, v3}, Lue0;->e(I)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v3

    .line 878
    iget-object v5, v7, Lme0;->f:Ll00;

    .line 879
    .line 880
    iget v5, v5, Ll00;->f:I

    .line 881
    .line 882
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 883
    .line 884
    .line 885
    move-result-object v5

    .line 886
    filled-new-array {v4, v3, v5, v10}, [Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v3

    .line 890
    invoke-interface {v0, v2, v3}, Li80;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v1, v4, v10}, Lm80;->d(Lgg0;Lnu0;)V

    .line 894
    .line 895
    .line 896
    return-void

    .line 897
    :catch_3
    move-exception v0

    .line 898
    move-object v4, v2

    .line 899
    sget-object v2, Lm80;->y:Li80;

    .line 900
    .line 901
    const-string v5, "Lookup for {}/{}, id={} failed using resolver {}"

    .line 902
    .line 903
    invoke-virtual {v3}, Lme0;->e()Ltn0;

    .line 904
    .line 905
    .line 906
    move-result-object v6

    .line 907
    iget v6, v6, Ltn0;->g:I

    .line 908
    .line 909
    sget-object v7, Lk31;->a:Lbs0;

    .line 910
    .line 911
    invoke-virtual {v7, v6}, Lue0;->e(I)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v6

    .line 915
    iget-object v3, v3, Lme0;->f:Ll00;

    .line 916
    .line 917
    iget v3, v3, Ll00;->f:I

    .line 918
    .line 919
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 920
    .line 921
    .line 922
    move-result-object v3

    .line 923
    iget-object v7, v1, Lm80;->a:Lvp0;

    .line 924
    .line 925
    filled-new-array {v4, v6, v3, v7, v0}, [Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v3

    .line 929
    invoke-interface {v2, v5, v3}, Li80;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 930
    .line 931
    .line 932
    instance-of v0, v0, Ljava/io/InterruptedIOException;

    .line 933
    .line 934
    if-eqz v0, :cond_2b

    .line 935
    .line 936
    const/4 v9, 0x1

    .line 937
    iput-boolean v9, v1, Lm80;->t:Z

    .line 938
    .line 939
    goto :goto_18

    .line 940
    :cond_2b
    const/4 v9, 0x1

    .line 941
    iput-boolean v9, v1, Lm80;->s:Z

    .line 942
    .line 943
    :cond_2c
    :goto_18
    return-void
.end method

.method public final d(Lgg0;Lnu0;)V
    .locals 6

    .line 1
    iget v0, p2, Lnu0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x7

    .line 7
    if-ne v0, v4, :cond_2

    .line 8
    .line 9
    if-eq v0, v4, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p2, Lnu0;->c:Ljava/util/ArrayList;

    .line 13
    .line 14
    :goto_0
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    move v0, v2

    .line 24
    :goto_1
    if-ge v0, p2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    check-cast v4, Lkn0;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, Lkn0;->f(Z)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iput v2, p0, Lm80;->p:I

    .line 43
    .line 44
    new-array p2, v2, [Ltn0;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, [Ltn0;

    .line 51
    .line 52
    iput-object p1, p0, Lm80;->o:[Ltn0;

    .line 53
    .line 54
    iput-boolean v3, p0, Lm80;->l:Z

    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    const/4 v4, 0x2

    .line 58
    const/4 v5, 0x3

    .line 59
    if-ne v0, v4, :cond_3

    .line 60
    .line 61
    iput-boolean v3, p0, Lm80;->q:Z

    .line 62
    .line 63
    iput-boolean v3, p0, Lm80;->m:Z

    .line 64
    .line 65
    iget p1, p0, Lm80;->j:I

    .line 66
    .line 67
    if-lez p1, :cond_7

    .line 68
    .line 69
    iput v5, p0, Lm80;->p:I

    .line 70
    .line 71
    iput-boolean v3, p0, Lm80;->l:Z

    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    const/4 v4, 0x4

    .line 75
    if-ne v0, v5, :cond_4

    .line 76
    .line 77
    iput v4, p0, Lm80;->p:I

    .line 78
    .line 79
    iput-object v1, p0, Lm80;->o:[Ltn0;

    .line 80
    .line 81
    iput-boolean v3, p0, Lm80;->l:Z

    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    const/4 v1, 0x5

    .line 85
    if-ne v0, v1, :cond_5

    .line 86
    .line 87
    iget-object p2, p2, Lnu0;->c:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    check-cast p2, Lkn0;

    .line 94
    .line 95
    invoke-virtual {p2}, Lkn0;->e()Ltn0;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    check-cast p2, Loc;

    .line 100
    .line 101
    iget-object p2, p2, Lgw0;->k:Lgg0;

    .line 102
    .line 103
    invoke-virtual {p0, p2, p1}, Lm80;->b(Lgg0;Lgg0;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_5
    const/4 v1, 0x6

    .line 108
    if-ne v0, v1, :cond_6

    .line 109
    .line 110
    iget-object p2, p2, Lnu0;->c:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, Lkn0;

    .line 117
    .line 118
    invoke-virtual {p2}, Lkn0;->e()Ltn0;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    check-cast p2, Lbm;

    .line 123
    .line 124
    :try_start_0
    invoke-virtual {p1, p2}, Lgg0;->i(Lbm;)Lgg0;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {p0, p2, p1}, Lm80;->b(Lgg0;Lgg0;)V
    :try_end_0
    .catch Lhg0; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :catch_0
    iput v3, p0, Lm80;->p:I

    .line 133
    .line 134
    iput-boolean v3, p0, Lm80;->l:Z

    .line 135
    .line 136
    return-void

    .line 137
    :cond_6
    if-ne v0, v4, :cond_7

    .line 138
    .line 139
    iput-boolean v3, p0, Lm80;->v:Z

    .line 140
    .line 141
    :cond_7
    return-void
.end method

.method public final e(Lgg0;Lgg0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm80;->m:Z

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    :try_start_0
    invoke-static {p1, p2}, Lgg0;->e(Lgg0;Lgg0;)Lgg0;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catch Lhg0; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :goto_0
    invoke-virtual {p0, p1}, Lm80;->c(Lgg0;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lm80;->u:Z

    .line 17
    .line 18
    return-void
.end method

.method public final f()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lm80;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput v2, p0, Lm80;->j:I

    .line 8
    .line 9
    iput-boolean v2, p0, Lm80;->k:Z

    .line 10
    .line 11
    iput-boolean v2, p0, Lm80;->l:Z

    .line 12
    .line 13
    iput-boolean v2, p0, Lm80;->m:Z

    .line 14
    .line 15
    iput-object v1, p0, Lm80;->n:Ljava/util/ArrayList;

    .line 16
    .line 17
    iput-object v1, p0, Lm80;->o:[Ltn0;

    .line 18
    .line 19
    const/4 v0, -0x1

    .line 20
    iput v0, p0, Lm80;->p:I

    .line 21
    .line 22
    iput-boolean v2, p0, Lm80;->q:Z

    .line 23
    .line 24
    iput-boolean v2, p0, Lm80;->r:Z

    .line 25
    .line 26
    iput-boolean v2, p0, Lm80;->s:Z

    .line 27
    .line 28
    iput-boolean v2, p0, Lm80;->t:Z

    .line 29
    .line 30
    iput-boolean v2, p0, Lm80;->u:Z

    .line 31
    .line 32
    iput-boolean v2, p0, Lm80;->v:Z

    .line 33
    .line 34
    iget-boolean v0, p0, Lm80;->e:Z

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    iget-object v0, p0, Lm80;->d:Ltc;

    .line 39
    .line 40
    monitor-enter v0

    .line 41
    :try_start_0
    iget-object v3, v0, Ltc;->a:Lpc;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/AbstractMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    monitor-exit v0

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw v1

    .line 51
    :cond_0
    :goto_0
    iget-object v0, p0, Lm80;->g:Lgg0;

    .line 52
    .line 53
    invoke-virtual {v0}, Lgg0;->isAbsolute()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    iget-object v0, p0, Lm80;->g:Lgg0;

    .line 60
    .line 61
    invoke-virtual {p0, v0, v1}, Lm80;->e(Lgg0;Lgg0;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    iget-object v0, p0, Lm80;->b:Ljava/util/ArrayList;

    .line 66
    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    iget-object v0, p0, Lm80;->g:Lgg0;

    .line 70
    .line 71
    sget-object v1, Lgg0;->l:Lgg0;

    .line 72
    .line 73
    invoke-virtual {p0, v0, v1}, Lm80;->e(Lgg0;Lgg0;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    iget-object v0, p0, Lm80;->g:Lgg0;

    .line 78
    .line 79
    iget v1, v0, Lgg0;->i:I

    .line 80
    .line 81
    iget v3, p0, Lm80;->c:I

    .line 82
    .line 83
    if-le v1, v3, :cond_3

    .line 84
    .line 85
    sget-object v1, Lgg0;->l:Lgg0;

    .line 86
    .line 87
    invoke-virtual {p0, v0, v1}, Lm80;->e(Lgg0;Lgg0;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    iget-boolean v0, p0, Lm80;->l:Z

    .line 91
    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    return-void

    .line 95
    :cond_4
    iget-object v0, p0, Lm80;->b:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    :cond_5
    if-ge v2, v1, :cond_7

    .line 102
    .line 103
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    check-cast v3, Lgg0;

    .line 110
    .line 111
    iget-object v4, p0, Lm80;->g:Lgg0;

    .line 112
    .line 113
    invoke-virtual {p0, v4, v3}, Lm80;->e(Lgg0;Lgg0;)V

    .line 114
    .line 115
    .line 116
    iget-boolean v3, p0, Lm80;->l:Z

    .line 117
    .line 118
    if-eqz v3, :cond_6

    .line 119
    .line 120
    return-void

    .line 121
    :cond_6
    iget-boolean v3, p0, Lm80;->k:Z

    .line 122
    .line 123
    if-eqz v3, :cond_5

    .line 124
    .line 125
    :cond_7
    iget-object v0, p0, Lm80;->g:Lgg0;

    .line 126
    .line 127
    sget-object v1, Lgg0;->l:Lgg0;

    .line 128
    .line 129
    invoke-virtual {p0, v0, v1}, Lm80;->e(Lgg0;Lgg0;)V

    .line 130
    .line 131
    .line 132
    :goto_1
    iget-boolean v0, p0, Lm80;->l:Z

    .line 133
    .line 134
    if-nez v0, :cond_d

    .line 135
    .line 136
    iget-boolean v0, p0, Lm80;->r:Z

    .line 137
    .line 138
    const/4 v1, 0x2

    .line 139
    const/4 v2, 0x1

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    iput v1, p0, Lm80;->p:I

    .line 143
    .line 144
    iput-boolean v2, p0, Lm80;->l:Z

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_8
    iget-boolean v0, p0, Lm80;->t:Z

    .line 148
    .line 149
    if-eqz v0, :cond_9

    .line 150
    .line 151
    iput v1, p0, Lm80;->p:I

    .line 152
    .line 153
    iput-boolean v2, p0, Lm80;->l:Z

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_9
    iget-boolean v0, p0, Lm80;->s:Z

    .line 157
    .line 158
    if-eqz v0, :cond_a

    .line 159
    .line 160
    iput v1, p0, Lm80;->p:I

    .line 161
    .line 162
    iput-boolean v2, p0, Lm80;->l:Z

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_a
    iget-boolean v0, p0, Lm80;->q:Z

    .line 166
    .line 167
    if-eqz v0, :cond_b

    .line 168
    .line 169
    const/4 v0, 0x3

    .line 170
    iput v0, p0, Lm80;->p:I

    .line 171
    .line 172
    iput-boolean v2, p0, Lm80;->l:Z

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_b
    iget-boolean v0, p0, Lm80;->v:Z

    .line 176
    .line 177
    if-eqz v0, :cond_c

    .line 178
    .line 179
    iput v2, p0, Lm80;->p:I

    .line 180
    .line 181
    iput-boolean v2, p0, Lm80;->l:Z

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_c
    iget-boolean v0, p0, Lm80;->u:Z

    .line 185
    .line 186
    if-eqz v0, :cond_d

    .line 187
    .line 188
    iput v2, p0, Lm80;->p:I

    .line 189
    .line 190
    iput-boolean v2, p0, Lm80;->l:Z

    .line 191
    .line 192
    :cond_d
    :goto_2
    return-void
.end method
