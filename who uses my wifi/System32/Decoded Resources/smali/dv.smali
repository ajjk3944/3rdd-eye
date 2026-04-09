.class public final Ldv;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lav;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldv;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Ldv;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Lqj;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ldv;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lmw0;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lmw0;

    .line 12
    .line 13
    iget v1, v0, Lmw0;->j:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Lmw0;->j:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lmw0;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lmw0;-><init>(Ldv;Lqj;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Lmw0;->i:Ljava/lang/Object;

    .line 31
    .line 32
    iget v1, v0, Lmw0;->j:I

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p2, p0, Ldv;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p2, Lav;

    .line 57
    .line 58
    check-cast p1, Lyx0;

    .line 59
    .line 60
    instance-of v1, p1, Lqn0;

    .line 61
    .line 62
    if-nez v1, :cond_7

    .line 63
    .line 64
    instance-of v1, p1, Lmu;

    .line 65
    .line 66
    if-nez v1, :cond_6

    .line 67
    .line 68
    instance-of v1, p1, Ljm;

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    check-cast p1, Ljm;

    .line 73
    .line 74
    iget-object p1, p1, Ljm;->a:Ljava/lang/Object;

    .line 75
    .line 76
    iput v2, v0, Lmw0;->j:I

    .line 77
    .line 78
    invoke-interface {p2, p1, v0}, Lav;->d(Ljava/lang/Object;Lqj;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    sget-object p2, Lrk;->f:Lrk;

    .line 83
    .line 84
    if-ne p1, p2, :cond_3

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    :goto_1
    sget-object p2, Lz31;->a:Lz31;

    .line 88
    .line 89
    :goto_2
    return-object p2

    .line 90
    :cond_4
    instance-of p1, p1, Lv31;

    .line 91
    .line 92
    if-eqz p1, :cond_5

    .line 93
    .line 94
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    const-string p2, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 97
    .line 98
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_5
    new-instance p1, Lrg;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_6
    check-cast p1, Lmu;

    .line 109
    .line 110
    iget-object p1, p1, Lmu;->a:Ljava/lang/Throwable;

    .line 111
    .line 112
    throw p1

    .line 113
    :cond_7
    check-cast p1, Lqn0;

    .line 114
    .line 115
    iget-object p1, p1, Lqn0;->a:Ljava/lang/Throwable;

    .line 116
    .line 117
    throw p1

    .line 118
    :pswitch_0
    iget-object p2, p0, Ldv;->g:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p2, Lcp0;

    .line 121
    .line 122
    iput-object p1, p2, Lcp0;->f:Ljava/lang/Object;

    .line 123
    .line 124
    new-instance p1, Lg;

    .line 125
    .line 126
    invoke-direct {p1, p0}, Lg;-><init>(Ldv;)V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
