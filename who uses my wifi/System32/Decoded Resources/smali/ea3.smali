.class public final Lea3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final o:Ljava/lang/Object;

.field public static final p:Ljava/lang/Object;

.field public static final q:Ljava/lang/Object;

.field public static r:Ljava/lang/Boolean;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Le51;

.field public final h:Lha3;

.field public i:Ljava/lang/String;

.field public j:I

.field public final k:Lxu2;

.field public final l:Ljava/util/AbstractCollection;

.field public final m:Lch2;

.field public n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lea3;->o:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lea3;->p:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lea3;->q:Ljava/lang/Object;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le51;Lxu2;Lts0;Lch2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lka3;->B()Lha3;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    iput-object p4, p0, Lea3;->h:Lha3;

    .line 9
    .line 10
    const-string p4, ""

    .line 11
    .line 12
    iput-object p4, p0, Lea3;->i:Ljava/lang/String;

    .line 13
    .line 14
    const/4 p4, 0x0

    .line 15
    iput-boolean p4, p0, Lea3;->n:Z

    .line 16
    .line 17
    iput-object p1, p0, Lea3;->f:Landroid/content/Context;

    .line 18
    .line 19
    iput-object p2, p0, Lea3;->g:Le51;

    .line 20
    .line 21
    iput-object p3, p0, Lea3;->k:Lxu2;

    .line 22
    .line 23
    iput-object p5, p0, Lea3;->m:Lch2;

    .line 24
    .line 25
    sget-object p1, Lmz1;->y9:Liz1;

    .line 26
    .line 27
    sget-object p2, Ltw1;->e:Ltw1;

    .line 28
    .line 29
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 30
    .line 31
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-static {}, Llf4;->G()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Lea3;->l:Ljava/util/AbstractCollection;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    sget-object p1, Lxm3;->g:Lvm3;

    .line 51
    .line 52
    sget-object p1, Lsn3;->j:Lsn3;

    .line 53
    .line 54
    iput-object p1, p0, Lea3;->l:Ljava/util/AbstractCollection;

    .line 55
    .line 56
    return-void
.end method

.method public static a()Z
    .locals 5

    .line 1
    sget-object v0, Lea3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lea3;->r:Ljava/lang/Boolean;

    .line 5
    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    sget-object v1, Ln02;->b:Lso1;

    .line 9
    .line 10
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    sput-object v1, Lea3;->r:Ljava/lang/Boolean;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    sget-object v1, Ln02;->a:Lso1;

    .line 30
    .line 31
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/Double;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    cmpg-double v1, v3, v1

    .line 46
    .line 47
    if-gez v1, :cond_1

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v1, 0x0

    .line 52
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sput-object v1, Lea3;->r:Ljava/lang/Boolean;

    .line 57
    .line 58
    :cond_2
    :goto_1
    sget-object v1, Lea3;->r:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    monitor-exit v0

    .line 65
    return v1

    .line 66
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    throw v1
.end method


# virtual methods
.method public final b(Lca3;)V
    .locals 3

    .line 1
    sget-object v0, Lmd2;->a:Lld2;

    .line 2
    .line 3
    new-instance v1, Lsz2;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, v2}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lld2;->a(Ljava/lang/Runnable;)Ln70;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final run()V
    .locals 9

    .line 1
    invoke-static {}, Lea3;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    sget-object v1, Lea3;->p:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    iget-object v0, p0, Lea3;->h:Lha3;

    .line 12
    .line 13
    iget-object v0, v0, Ln54;->g:Lp54;

    .line 14
    .line 15
    check-cast v0, Lka3;

    .line 16
    .line 17
    invoke-virtual {v0}, Lka3;->A()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    monitor-exit v1

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_3

    .line 27
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    :try_start_1
    monitor-enter v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 29
    :try_start_2
    iget-object v0, p0, Lea3;->h:Lha3;

    .line 30
    .line 31
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lka3;

    .line 36
    .line 37
    invoke-virtual {v2}, Ls44;->b()[B

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v0}, Ln54;->b()V

    .line 42
    .line 43
    .line 44
    iget-object v0, v0, Ln54;->g:Lp54;

    .line 45
    .line 46
    check-cast v0, Lka3;

    .line 47
    .line 48
    invoke-virtual {v0}, Lka3;->D()V

    .line 49
    .line 50
    .line 51
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    :try_start_3
    new-instance v3, Lyy2;

    .line 53
    .line 54
    sget-object v0, Lmz1;->s9:Liz1;

    .line 55
    .line 56
    sget-object v1, Ltw1;->e:Ltw1;

    .line 57
    .line 58
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    move-object v4, v0

    .line 65
    check-cast v4, Ljava/lang/String;

    .line 66
    .line 67
    new-instance v6, Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v8, "application/x-protobuf"

    .line 73
    .line 74
    const v5, 0xea60

    .line 75
    .line 76
    .line 77
    invoke-direct/range {v3 .. v8}, Lyy2;-><init>(Ljava/lang/String;ILjava/util/HashMap;[BLjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lea3;->f:Landroid/content/Context;

    .line 81
    .line 82
    iget-object v1, p0, Lea3;->g:Le51;

    .line 83
    .line 84
    iget-object v1, v1, Le51;->f:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 87
    .line 88
    .line 89
    new-instance v2, Lxb4;

    .line 90
    .line 91
    const/4 v4, 0x0

    .line 92
    const/16 v5, 0x19

    .line 93
    .line 94
    invoke-direct {v2, v0, v1, v4, v5}, Lxb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v3}, Lxb4;->C(Lyy2;)Lzy2;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :catch_0
    move-exception v0

    .line 102
    goto :goto_0

    .line 103
    :catchall_1
    move-exception v0

    .line 104
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 105
    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 106
    :goto_0
    instance-of v1, v0, Lhx2;

    .line 107
    .line 108
    if-eqz v1, :cond_3

    .line 109
    .line 110
    move-object v1, v0

    .line 111
    check-cast v1, Lhx2;

    .line 112
    .line 113
    iget v1, v1, Lhx2;->f:I

    .line 114
    .line 115
    const/4 v2, 0x3

    .line 116
    if-eq v1, v2, :cond_2

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_2
    :goto_1
    return-void

    .line 120
    :cond_3
    :goto_2
    const-string v1, "CuiMonitor.sendCuiPing"

    .line 121
    .line 122
    sget-object v2, Lhg4;->C:Lhg4;

    .line 123
    .line 124
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 125
    .line 126
    invoke-virtual {v2, v1, v0}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :goto_3
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 131
    throw v0
.end method
