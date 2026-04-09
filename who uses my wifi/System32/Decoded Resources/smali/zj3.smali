.class public final Lzj3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyj3;
.implements Lng3;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/Context;

.field public final c:Lgk3;

.field public final d:Lpq3;

.field public final e:Lvf3;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public g:Ln70;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgk3;Lpq3;Lvf3;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lzj3;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lzj3;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    sget-object v0, Llq3;->g:Llq3;

    .line 5
    iput-object v0, p0, Lzj3;->g:Ln70;

    iput-object p1, p0, Lzj3;->b:Landroid/content/Context;

    iput-object p2, p0, Lzj3;->c:Lgk3;

    iput-object p3, p0, Lzj3;->d:Lpq3;

    iput-object p4, p0, Lzj3;->e:Lvf3;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lgk3;Lvf3;Lpq3;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lzj3;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lzj3;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v0, "E"

    .line 2
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    move-result-object v0

    iput-object v0, p0, Lzj3;->g:Ln70;

    iput-object p1, p0, Lzj3;->b:Landroid/content/Context;

    iput-object p2, p0, Lzj3;->c:Lgk3;

    iput-object p3, p0, Lzj3;->e:Lvf3;

    iput-object p4, p0, Lzj3;->d:Lpq3;

    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 2

    .line 1
    iget v0, p0, Lzj3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzj3;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lzj3;->e:Lvf3;

    .line 16
    .line 17
    invoke-virtual {v0}, Lvf3;->F()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Lbh3;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, v1, p0}, Lbh3;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lzj3;->d:Lpq3;

    .line 31
    .line 32
    check-cast v1, Lld2;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lld2;->a(Ljava/lang/Runnable;)Ln70;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    sget-object v0, Llq3;->g:Llq3;

    .line 40
    .line 41
    :goto_1
    return-object v0

    .line 42
    :pswitch_0
    iget-object v0, p0, Lzj3;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    sget-object v0, Llq3;->g:Llq3;

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    new-instance v0, Lw53;

    .line 55
    .line 56
    const/16 v1, 0x9

    .line 57
    .line 58
    invoke-direct {v0, v1, p0}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lzj3;->d:Lpq3;

    .line 62
    .line 63
    check-cast v1, Lld2;

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :goto_2
    return-object v0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/util/HashMap;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    iget p2, p0, Lzj3;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p2, "gs"

    .line 7
    .line 8
    iget-object p3, p0, Lzj3;->g:Ln70;

    .line 9
    .line 10
    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p0, p1}, Lzj3;->e(Ljava/util/HashMap;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/util/HashMap;)V
    .locals 2

    .line 1
    iget v0, p0, Lzj3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "gs"

    .line 7
    .line 8
    iget-object v1, p0, Lzj3;->g:Ln70;

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p0, p1}, Lzj3;->e(Ljava/util/HashMap;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/util/HashMap;)V
    .locals 2

    .line 1
    iget v0, p0, Lzj3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "gs"

    .line 7
    .line 8
    iget-object v1, p0, Lzj3;->g:Ln70;

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p0, p1}, Lzj3;->e(Ljava/util/HashMap;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(Ljava/util/HashMap;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "ai"

    .line 3
    .line 4
    iget-object v1, p0, Lzj3;->g:Ln70;

    .line 5
    .line 6
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method
