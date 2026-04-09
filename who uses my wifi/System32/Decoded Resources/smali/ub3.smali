.class public final Lub3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le51;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:Lcom/google/android/gms/ads/internal/ClientApi;

.field public final e:Lt83;

.field public final f:Lym;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le51;Ljava/util/concurrent/ScheduledExecutorService;Lt83;Lym;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lub3;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lub3;->b:Le51;

    .line 7
    .line 8
    iput-object p3, p0, Lub3;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    new-instance p1, Lcom/google/android/gms/ads/internal/ClientApi;

    .line 11
    .line 12
    invoke-direct {p1}, Lcom/google/android/gms/ads/internal/ClientApi;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lub3;->d:Lcom/google/android/gms/ads/internal/ClientApi;

    .line 16
    .line 17
    iput-object p5, p0, Lub3;->f:Lym;

    .line 18
    .line 19
    iput-object p4, p0, Lub3;->e:Lt83;

    .line 20
    .line 21
    return-void
.end method

.method public static c()Lkb3;
    .locals 5

    .line 1
    new-instance v0, Lkb3;

    .line 2
    .line 3
    sget-object v1, Lmz1;->D:Liz1;

    .line 4
    .line 5
    sget-object v2, Ltw1;->e:Ltw1;

    .line 6
    .line 7
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 8
    .line 9
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Long;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    sget-object v1, Lmz1;->E:Liz1;

    .line 20
    .line 21
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/Long;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    invoke-direct {v0, v3, v4, v1, v2}, Lkb3;-><init>(JJ)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method


# virtual methods
.method public final a(Lae3;Lod2;)Ljb3;
    .locals 13

    .line 1
    iget v0, p1, Lae3;->g:I

    .line 2
    .line 3
    invoke-static {v0}, Ls2;->a(I)Ls2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    iget-object v4, p0, Lub3;->a:Landroid/content/Context;

    .line 16
    .line 17
    iget-object v2, p0, Lub3;->b:Le51;

    .line 18
    .line 19
    if-eq v0, v1, :cond_3

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    const/4 v1, 0x5

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    :goto_0
    const/4 p1, 0x0

    .line 28
    return-object p1

    .line 29
    :cond_1
    move-object v0, v2

    .line 30
    new-instance v2, Ljb3;

    .line 31
    .line 32
    iget v5, v0, Le51;->h:I

    .line 33
    .line 34
    invoke-static {}, Lub3;->c()Lkb3;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    const/4 v12, 0x0

    .line 39
    iget-object v3, p0, Lub3;->d:Lcom/google/android/gms/ads/internal/ClientApi;

    .line 40
    .line 41
    iget-object v6, p0, Lub3;->e:Lt83;

    .line 42
    .line 43
    iget-object v9, p0, Lub3;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 44
    .line 45
    iget-object v11, p0, Lub3;->f:Lym;

    .line 46
    .line 47
    move-object v7, p1

    .line 48
    move-object v8, p2

    .line 49
    invoke-direct/range {v2 .. v12}, Ljb3;-><init>(Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILt83;Lae3;Lod2;Ljava/util/concurrent/ScheduledExecutorService;Lkb3;Lym;I)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_2
    move-object v7, p1

    .line 54
    move-object v8, p2

    .line 55
    move-object v0, v2

    .line 56
    new-instance v2, Ljb3;

    .line 57
    .line 58
    iget v5, v0, Le51;->h:I

    .line 59
    .line 60
    invoke-static {}, Lub3;->c()Lkb3;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    const/4 v12, 0x2

    .line 65
    iget-object v3, p0, Lub3;->d:Lcom/google/android/gms/ads/internal/ClientApi;

    .line 66
    .line 67
    iget-object v6, p0, Lub3;->e:Lt83;

    .line 68
    .line 69
    iget-object v9, p0, Lub3;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 70
    .line 71
    iget-object v11, p0, Lub3;->f:Lym;

    .line 72
    .line 73
    invoke-direct/range {v2 .. v12}, Ljb3;-><init>(Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILt83;Lae3;Lod2;Ljava/util/concurrent/ScheduledExecutorService;Lkb3;Lym;I)V

    .line 74
    .line 75
    .line 76
    return-object v2

    .line 77
    :cond_3
    move-object v7, p1

    .line 78
    move-object v8, p2

    .line 79
    move-object v0, v2

    .line 80
    new-instance v2, Ljb3;

    .line 81
    .line 82
    iget v5, v0, Le51;->h:I

    .line 83
    .line 84
    invoke-static {}, Lub3;->c()Lkb3;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    const/4 v12, 0x1

    .line 89
    iget-object v3, p0, Lub3;->d:Lcom/google/android/gms/ads/internal/ClientApi;

    .line 90
    .line 91
    iget-object v6, p0, Lub3;->e:Lt83;

    .line 92
    .line 93
    iget-object v9, p0, Lub3;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 94
    .line 95
    iget-object v11, p0, Lub3;->f:Lym;

    .line 96
    .line 97
    invoke-direct/range {v2 .. v12}, Ljb3;-><init>(Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILt83;Lae3;Lod2;Ljava/util/concurrent/ScheduledExecutorService;Lkb3;Lym;I)V

    .line 98
    .line 99
    .line 100
    return-object v2
.end method

.method public final b(Ljava/lang/String;Lae3;Lbf2;)Ljb3;
    .locals 12

    .line 1
    iget v0, p2, Lae3;->g:I

    .line 2
    .line 3
    invoke-static {v0}, Ls2;->a(I)Ls2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    iget-object v3, p0, Lub3;->a:Landroid/content/Context;

    .line 16
    .line 17
    iget-object v2, p0, Lub3;->b:Le51;

    .line 18
    .line 19
    if-eq v0, v1, :cond_3

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    const/4 v1, 0x5

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    :goto_0
    const/4 v0, 0x0

    .line 28
    return-object v0

    .line 29
    :cond_1
    new-instance v0, Ljb3;

    .line 30
    .line 31
    iget v4, v2, Le51;->h:I

    .line 32
    .line 33
    invoke-static {}, Lub3;->c()Lkb3;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    const/4 v11, 0x0

    .line 38
    iget-object v2, p0, Lub3;->d:Lcom/google/android/gms/ads/internal/ClientApi;

    .line 39
    .line 40
    iget-object v5, p0, Lub3;->e:Lt83;

    .line 41
    .line 42
    iget-object v8, p0, Lub3;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 43
    .line 44
    iget-object v10, p0, Lub3;->f:Lym;

    .line 45
    .line 46
    move-object v1, p1

    .line 47
    move-object v6, p2

    .line 48
    move-object v7, p3

    .line 49
    invoke-direct/range {v0 .. v11}, Ljb3;-><init>(Ljava/lang/String;Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILt83;Lae3;Lbf2;Ljava/util/concurrent/ScheduledExecutorService;Lkb3;Lym;I)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    new-instance v0, Ljb3;

    .line 54
    .line 55
    iget v4, v2, Le51;->h:I

    .line 56
    .line 57
    invoke-static {}, Lub3;->c()Lkb3;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    const/4 v11, 0x2

    .line 62
    iget-object v2, p0, Lub3;->d:Lcom/google/android/gms/ads/internal/ClientApi;

    .line 63
    .line 64
    iget-object v5, p0, Lub3;->e:Lt83;

    .line 65
    .line 66
    iget-object v8, p0, Lub3;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 67
    .line 68
    iget-object v10, p0, Lub3;->f:Lym;

    .line 69
    .line 70
    move-object v1, p1

    .line 71
    move-object v6, p2

    .line 72
    move-object v7, p3

    .line 73
    invoke-direct/range {v0 .. v11}, Ljb3;-><init>(Ljava/lang/String;Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILt83;Lae3;Lbf2;Ljava/util/concurrent/ScheduledExecutorService;Lkb3;Lym;I)V

    .line 74
    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_3
    new-instance v0, Ljb3;

    .line 78
    .line 79
    iget v4, v2, Le51;->h:I

    .line 80
    .line 81
    invoke-static {}, Lub3;->c()Lkb3;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    const/4 v11, 0x1

    .line 86
    iget-object v2, p0, Lub3;->d:Lcom/google/android/gms/ads/internal/ClientApi;

    .line 87
    .line 88
    iget-object v5, p0, Lub3;->e:Lt83;

    .line 89
    .line 90
    iget-object v8, p0, Lub3;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 91
    .line 92
    iget-object v10, p0, Lub3;->f:Lym;

    .line 93
    .line 94
    move-object v1, p1

    .line 95
    move-object v6, p2

    .line 96
    move-object v7, p3

    .line 97
    invoke-direct/range {v0 .. v11}, Ljb3;-><init>(Ljava/lang/String;Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILt83;Lae3;Lbf2;Ljava/util/concurrent/ScheduledExecutorService;Lkb3;Lym;I)V

    .line 98
    .line 99
    .line 100
    return-object v0
.end method
