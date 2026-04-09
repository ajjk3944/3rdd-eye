.class public final synthetic Lkv2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Llv2;


# direct methods
.method public synthetic constructor <init>(Llv2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkv2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lkv2;->g:Llv2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lkv2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkv2;->g:Llv2;

    .line 7
    .line 8
    iget-object v1, v0, Llv2;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lmv2;

    .line 11
    .line 12
    iget-object v1, v1, Lmv2;->a:Lpv2;

    .line 13
    .line 14
    iget-object v0, v0, Llv2;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lpv2;->a(Ljava/util/Map;Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object v0, p0, Lkv2;->g:Llv2;

    .line 24
    .line 25
    iget-object v1, v0, Llv2;->h:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lmv2;

    .line 28
    .line 29
    iget-object v1, v1, Lmv2;->a:Lpv2;

    .line 30
    .line 31
    iget-object v0, v0, Llv2;->g:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-virtual {v1, v0, v2}, Lpv2;->a(Ljava/util/Map;Z)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    iget-object v0, p0, Lkv2;->g:Llv2;

    .line 41
    .line 42
    iget-object v1, v0, Llv2;->h:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lmv2;

    .line 45
    .line 46
    iget-object v1, v1, Lmv2;->a:Lpv2;

    .line 47
    .line 48
    iget-object v0, v0, Llv2;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_0

    .line 60
    .line 61
    const-string v0, "Empty paramMap."

    .line 62
    .line 63
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v1, v0}, Lpv2;->b(Ljava/util/Map;)V

    .line 68
    .line 69
    .line 70
    iget-object v2, v1, Lpv2;->f:Lgs3;

    .line 71
    .line 72
    invoke-virtual {v2, v0}, Lgs3;->a(Ljava/util/Map;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    sget-object v2, Lmz1;->Wd:Liz1;

    .line 80
    .line 81
    sget-object v3, Ltw1;->e:Ltw1;

    .line 82
    .line 83
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 84
    .line 85
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_1

    .line 96
    .line 97
    iget-boolean v2, v1, Lpv2;->e:Z

    .line 98
    .line 99
    if-eqz v2, :cond_2

    .line 100
    .line 101
    :cond_1
    iget-object v2, v1, Lpv2;->c:Ljava/util/concurrent/Executor;

    .line 102
    .line 103
    new-instance v3, Lqv2;

    .line 104
    .line 105
    const/4 v4, 0x1

    .line 106
    invoke-direct {v3, v1, v0, v4}, Lqv2;-><init>(Lpv2;Ljava/lang/String;I)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 110
    .line 111
    .line 112
    :cond_2
    :goto_0
    return-void

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
