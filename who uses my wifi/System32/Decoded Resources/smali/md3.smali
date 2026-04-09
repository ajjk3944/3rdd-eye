.class public final Lmd3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/os/Looper;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmd3;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lmd3;->b:Landroid/os/Looper;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-static {}, Lrd3;->A()Lqd3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lmd3;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0}, Ln54;->b()V

    .line 12
    .line 13
    .line 14
    iget-object v3, v0, Ln54;->g:Lp54;

    .line 15
    .line 16
    check-cast v3, Lrd3;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Lrd3;->B(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ln54;->b()V

    .line 22
    .line 23
    .line 24
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 25
    .line 26
    check-cast v2, Lrd3;

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    invoke-virtual {v2, v3}, Lrd3;->D(I)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lpd3;->A()Lod3;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ln54;->b()V

    .line 37
    .line 38
    .line 39
    iget-object v4, v2, Ln54;->g:Lp54;

    .line 40
    .line 41
    check-cast v4, Lpd3;

    .line 42
    .line 43
    invoke-virtual {v4, p1}, Lpd3;->B(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ln54;->b()V

    .line 47
    .line 48
    .line 49
    iget-object p1, v2, Ln54;->g:Lp54;

    .line 50
    .line 51
    check-cast p1, Lpd3;

    .line 52
    .line 53
    invoke-virtual {p1, v3}, Lpd3;->C(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ln54;->b()V

    .line 57
    .line 58
    .line 59
    iget-object p1, v0, Ln54;->g:Lp54;

    .line 60
    .line 61
    check-cast p1, Lrd3;

    .line 62
    .line 63
    invoke-virtual {v2}, Ln54;->d()Lp54;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Lpd3;

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Lrd3;->C(Lpd3;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Lrd3;

    .line 77
    .line 78
    iget-object v0, p0, Lmd3;->b:Landroid/os/Looper;

    .line 79
    .line 80
    new-instance v2, Lm30;

    .line 81
    .line 82
    invoke-direct {v2, v1, v0, p1}, Lm30;-><init>(Landroid/content/Context;Landroid/os/Looper;Lrd3;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, v2, Lm30;->j:Ljava/lang/Object;

    .line 86
    .line 87
    monitor-enter p1

    .line 88
    :try_start_0
    iget-boolean v0, v2, Lm30;->f:Z

    .line 89
    .line 90
    if-nez v0, :cond_0

    .line 91
    .line 92
    const/4 v0, 0x1

    .line 93
    iput-boolean v0, v2, Lm30;->f:Z

    .line 94
    .line 95
    iget-object v0, v2, Lm30;->h:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Lvd3;

    .line 98
    .line 99
    invoke-virtual {v0}, Lw9;->n()V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :catchall_0
    move-exception v0

    .line 104
    goto :goto_1

    .line 105
    :cond_0
    :goto_0
    monitor-exit p1

    .line 106
    return-void

    .line 107
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    throw v0
.end method
