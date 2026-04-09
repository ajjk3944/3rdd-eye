.class public final Liq1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lt3;

.field public final b:Lz71;

.field public final c:Lr2;


# direct methods
.method public constructor <init>(Lt3;Lr2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Liq1;->a:Lt3;

    .line 5
    .line 6
    iput-object p2, p0, Liq1;->c:Lr2;

    .line 7
    .line 8
    new-instance p1, Lz71;

    .line 9
    .line 10
    const/16 p2, 0xd

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lz71;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Liq1;->b:Lz71;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Optional;
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, Liq1;->b:Lz71;

    .line 2
    .line 3
    iget-object v0, v0, Lz71;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayDeque;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lbq1;

    .line 18
    .line 19
    iget-wide v1, v0, Lbq1;->a:J

    .line 20
    .line 21
    iget-wide v3, v0, Lbq1;->b:J

    .line 22
    .line 23
    iget-wide v5, v0, Lbq1;->c:J

    .line 24
    .line 25
    iget-object v0, p0, Liq1;->a:Lt3;

    .line 26
    .line 27
    iget v7, v0, Lt3;->g:I

    .line 28
    .line 29
    int-to-long v7, v7

    .line 30
    cmp-long v7, v7, v3

    .line 31
    .line 32
    if-gez v7, :cond_0

    .line 33
    .line 34
    sget-object v0, Lip1;->M:Lip1;

    .line 35
    .line 36
    invoke-static {v0}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :catch_0
    move-exception v0

    .line 42
    goto :goto_1

    .line 43
    :catch_1
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    iget-object v7, p0, Liq1;->c:Lr2;

    .line 46
    .line 47
    invoke-virtual {v7, v1, v2}, Lr2;->e(J)V

    .line 48
    .line 49
    .line 50
    const-wide/16 v1, 0x0

    .line 51
    .line 52
    cmp-long v1, v5, v1

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    :goto_0
    iget v1, v0, Lt3;->g:I

    .line 57
    .line 58
    int-to-long v1, v1

    .line 59
    cmp-long v1, v1, v3

    .line 60
    .line 61
    if-lez v1, :cond_1

    .line 62
    .line 63
    invoke-virtual {v0}, Lt3;->B()Loq1;
    :try_end_0
    .catch Ldq1; {:try_start_0 .. :try_end_0} :catch_3
    .catch Leq1; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lyp1; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lzp1; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    :cond_2
    :try_start_1
    new-instance v0, Ldq1;

    .line 73
    .line 74
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 75
    .line 76
    .line 77
    throw v0
    :try_end_1
    .catch Ldq1; {:try_start_1 .. :try_end_1} :catch_3
    .catch Leq1; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lyp1; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lzp1; {:try_start_1 .. :try_end_1} :catch_0

    .line 78
    :goto_1
    new-instance v1, Ljava/lang/AssertionError;

    .line 79
    .line 80
    const-string v2, "CEiv6BFfPnitUE+D"

    .line 81
    .line 82
    invoke-static {v2}, Lup1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-direct {v1, v2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    throw v1

    .line 90
    :catch_2
    sget-object v0, Lip1;->M:Lip1;

    .line 91
    .line 92
    :goto_2
    invoke-static {v0}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :catch_3
    sget-object v0, Lip1;->C:Lip1;

    .line 98
    .line 99
    goto :goto_2
.end method
