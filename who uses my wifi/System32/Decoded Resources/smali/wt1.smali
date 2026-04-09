.class public final Lwt1;
.super Lhu1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final h:Ljava/util/Map;

.field public final i:Landroid/view/View;

.field public final j:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljt1;Lfr1;ILjava/util/HashMap;Landroid/view/View;Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v3, "l48tDWlMY/G/BSkitRUvd80RiFbNrk8nR5qlkOsZWs8="

    .line 2
    .line 3
    const/16 v6, 0x55

    .line 4
    .line 5
    const-string v2, "ykIQv59ak7YBU+e791IU15tGonhZPUUBXST76bDGm7zXSjUSNn9qtHdf61t20THy"

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v4, p2

    .line 10
    move v5, p3

    .line 11
    invoke-direct/range {v0 .. v6}, Lhu1;-><init>(Ljt1;Ljava/lang/String;Ljava/lang/String;Lfr1;II)V

    .line 12
    .line 13
    .line 14
    iput-object p4, v0, Lwt1;->h:Ljava/util/Map;

    .line 15
    .line 16
    iput-object p5, v0, Lwt1;->i:Landroid/view/View;

    .line 17
    .line 18
    iput-object p6, v0, Lwt1;->j:Landroid/content/Context;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, p0, Lwt1;->h:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const-wide/high16 v4, -0x8000000000000000L

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/Long;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-wide v2, v4

    .line 28
    :goto_0
    iget-object v6, p0, Lwt1;->h:Ljava/util/Map;

    .line 29
    .line 30
    const/4 v7, 0x2

    .line 31
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-interface {v6, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    if-eqz v9, :cond_1

    .line 40
    .line 41
    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ljava/lang/Long;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    :cond_1
    new-array v6, v7, [J

    .line 52
    .line 53
    const/4 v8, 0x0

    .line 54
    aput-wide v2, v6, v8

    .line 55
    .line 56
    aput-wide v4, v6, v0

    .line 57
    .line 58
    iget-object v2, p0, Lwt1;->j:Landroid/content/Context;

    .line 59
    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    iget-object v2, p0, Lhu1;->a:Ljt1;

    .line 63
    .line 64
    iget-object v2, v2, Ljt1;->a:Landroid/content/Context;

    .line 65
    .line 66
    :cond_2
    iget-object v3, p0, Lhu1;->e:Ljava/lang/reflect/Method;

    .line 67
    .line 68
    iget-object v4, p0, Lwt1;->i:Landroid/view/View;

    .line 69
    .line 70
    filled-new-array {v6, v2, v4}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const/4 v4, 0x0

    .line 75
    invoke-virtual {v3, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, [J

    .line 80
    .line 81
    aget-wide v3, v2, v8

    .line 82
    .line 83
    iget-object v5, p0, Lwt1;->h:Ljava/util/Map;

    .line 84
    .line 85
    aget-wide v8, v2, v0

    .line 86
    .line 87
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {v5, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    aget-wide v0, v2, v7

    .line 95
    .line 96
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    const/4 v7, 0x3

    .line 101
    aget-wide v7, v2, v7

    .line 102
    .line 103
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-interface {v5, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    iget-object v2, p0, Lhu1;->d:Lfr1;

    .line 111
    .line 112
    monitor-enter v2

    .line 113
    :try_start_0
    invoke-virtual {v2}, Ln54;->b()V

    .line 114
    .line 115
    .line 116
    iget-object v5, v2, Ln54;->g:Lp54;

    .line 117
    .line 118
    check-cast v5, Lqr1;

    .line 119
    .line 120
    invoke-virtual {v5, v3, v4}, Lqr1;->j0(J)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Ln54;->b()V

    .line 124
    .line 125
    .line 126
    iget-object v3, v2, Ln54;->g:Lp54;

    .line 127
    .line 128
    check-cast v3, Lqr1;

    .line 129
    .line 130
    invoke-virtual {v3, v0, v1}, Lqr1;->k0(J)V

    .line 131
    .line 132
    .line 133
    monitor-exit v2

    .line 134
    return-void

    .line 135
    :catchall_0
    move-exception v0

    .line 136
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    throw v0
.end method
