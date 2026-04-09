.class public final Lca1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lou0;

.field public final synthetic h:Lda1;


# direct methods
.method public synthetic constructor <init>(Lda1;Lou0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lca1;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lca1;->h:Lda1;

    .line 4
    .line 5
    iput-object p2, p0, Lca1;->g:Lou0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, Lca1;->f:I

    .line 2
    .line 3
    iget-object v1, p0, Lca1;->g:Lou0;

    .line 4
    .line 5
    iget-object v2, p0, Lca1;->h:Lda1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v3, v2, Lda1;->f:Lou0;

    .line 11
    .line 12
    iget-object v0, v2, Lda1;->i:Landroidx/work/ListenableWorker;

    .line 13
    .line 14
    iget-object v4, v2, Lda1;->h:Loa1;

    .line 15
    .line 16
    const-string v5, "Worker was marked important ("

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {v1}, Ly;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v10, v1

    .line 23
    check-cast v10, Lyv;

    .line 24
    .line 25
    if-eqz v10, :cond_0

    .line 26
    .line 27
    invoke-static {}, Lh80;->d()Lh80;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget v5, Lda1;->l:I

    .line 32
    .line 33
    iget-object v4, v4, Loa1;->c:Ljava/lang/String;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 37
    .line 38
    invoke-virtual {v1, v4}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-virtual {v0, v1}, Landroidx/work/ListenableWorker;->setRunInForeground(Z)V

    .line 43
    .line 44
    .line 45
    iget-object v7, v2, Lda1;->j:Lfa1;

    .line 46
    .line 47
    iget-object v11, v2, Lda1;->g:Landroid/content/Context;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getId()Ljava/util/UUID;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance v8, Lou0;

    .line 57
    .line 58
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    iget-object v0, v7, Lfa1;->a:Ll01;

    .line 62
    .line 63
    new-instance v6, Lea1;

    .line 64
    .line 65
    const/4 v12, 0x0

    .line 66
    invoke-direct/range {v6 .. v12}, Lea1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    check-cast v0, Lxb4;

    .line 70
    .line 71
    invoke-virtual {v0, v6}, Lxb4;->j(Ljava/lang/Runnable;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v8}, Lou0;->k(Ln70;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    iget-object v0, v4, Loa1;->c:Ljava/lang/String;

    .line 81
    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v0, ") but did not provide ForegroundInfo"

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    :goto_0
    invoke-virtual {v3, v0}, Lou0;->j(Ljava/lang/Throwable;)Z

    .line 106
    .line 107
    .line 108
    :goto_1
    return-void

    .line 109
    :pswitch_0
    iget-object v0, v2, Lda1;->i:Landroidx/work/ListenableWorker;

    .line 110
    .line 111
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getForegroundInfoAsync()Ln70;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v1, v0}, Lou0;->k(Ln70;)Z

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
