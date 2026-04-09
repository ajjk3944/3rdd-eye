.class public final Lrj3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I

.field public final b:Llg3;

.field public final c:Llg3;

.field public final d:Lz94;

.field public final e:Lgk3;


# direct methods
.method public synthetic constructor <init>(Llg3;Llg3;Lz94;Lgk3;I)V
    .locals 0

    .line 1
    iput p5, p0, Lrj3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lrj3;->b:Llg3;

    .line 4
    .line 5
    iput-object p2, p0, Lrj3;->c:Llg3;

    .line 6
    .line 7
    iput-object p3, p0, Lrj3;->d:Lz94;

    .line 8
    .line 9
    iput-object p4, p0, Lrj3;->e:Lgk3;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Lar3;
    .locals 3

    .line 1
    iget v0, p0, Lrj3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrj3;->b:Llg3;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, Lw53;

    .line 12
    .line 13
    const/4 v2, 0x5

    .line 14
    invoke-direct {v1, v2, v0}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, Llg3;->b:Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    invoke-static {v1, v0}, Lpu1;->D(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lar3;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lrj3;->e:Lgk3;

    .line 24
    .line 25
    const/16 v2, 0x4f4e

    .line 26
    .line 27
    invoke-virtual {v1, v2, v0}, Lgk3;->d(ILn70;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_0
    iget-object v0, p0, Lrj3;->b:Llg3;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v1, Lw53;

    .line 37
    .line 38
    const/4 v2, 0x5

    .line 39
    invoke-direct {v1, v2, v0}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v0, Llg3;->b:Ljava/util/concurrent/ExecutorService;

    .line 43
    .line 44
    invoke-static {v1, v0}, Lpu1;->D(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lar3;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Lrj3;->e:Lgk3;

    .line 49
    .line 50
    const/16 v2, 0x3bc6

    .line 51
    .line 52
    invoke-virtual {v1, v2, v0}, Lgk3;->d(ILn70;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljh3;)Lar3;
    .locals 2

    .line 1
    iget v0, p0, Lrj3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrj3;->b:Llg3;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Llg3;->a(Ljava/lang/Object;)Lar3;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lrj3;->e:Lgk3;

    .line 13
    .line 14
    const/16 v1, 0x4f4f

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, Lgk3;->d(ILn70;)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    iget-object v0, p0, Lrj3;->b:Llg3;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Llg3;->a(Ljava/lang/Object;)Lar3;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v0, p0, Lrj3;->e:Lgk3;

    .line 27
    .line 28
    const/16 v1, 0x3bc7

    .line 29
    .line 30
    invoke-virtual {v0, v1, p1}, Lgk3;->d(ILn70;)V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c([B)Lar3;
    .locals 2

    .line 1
    iget v0, p0, Lrj3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrj3;->c:Llg3;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Llg3;->a(Ljava/lang/Object;)Lar3;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lrj3;->e:Lgk3;

    .line 13
    .line 14
    const/16 v1, 0x4f51

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, Lgk3;->d(ILn70;)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    iget-object v0, p0, Lrj3;->c:Llg3;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Llg3;->a(Ljava/lang/Object;)Lar3;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v0, p0, Lrj3;->e:Lgk3;

    .line 27
    .line 28
    const/16 v1, 0x3bc9

    .line 29
    .line 30
    invoke-virtual {v0, v1, p1}, Lgk3;->d(ILn70;)V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
