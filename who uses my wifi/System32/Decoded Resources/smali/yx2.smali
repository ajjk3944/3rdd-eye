.class public final Lyx2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lly2;


# static fields
.field public static final h:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Lmc2;

.field public final b:Lpq3;

.field public final c:Ll83;

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public final e:Lez2;

.field public final f:Lda3;

.field public final g:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "Received error HTTP response code: (.*)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lyx2;->h:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ll83;Lmc2;Lpq3;Ljava/util/concurrent/ScheduledExecutorService;Lez2;Lda3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyx2;->g:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lyx2;->c:Ll83;

    .line 7
    .line 8
    iput-object p3, p0, Lyx2;->a:Lmc2;

    .line 9
    .line 10
    iput-object p4, p0, Lyx2;->b:Lpq3;

    .line 11
    .line 12
    iput-object p5, p0, Lyx2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 13
    .line 14
    iput-object p6, p0, Lyx2;->e:Lez2;

    .line 15
    .line 16
    iput-object p7, p0, Lyx2;->f:Lda3;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final e(Lfa2;)Ln70;
    .locals 6

    .line 1
    iget-object v0, p0, Lyx2;->a:Lmc2;

    .line 2
    .line 3
    iget-object v1, v0, Lmc2;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lpq3;

    .line 6
    .line 7
    iget-object v2, p1, Lfa2;->i:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v3, Lhg4;->C:Lhg4;

    .line 10
    .line 11
    iget-object v3, v3, Lhg4;->c:Llf4;

    .line 12
    .line 13
    invoke-static {v2}, Llf4;->e(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    new-instance v2, Lmy2;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-direct {v2, v3}, Lhx2;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v2, v0, Lmc2;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lpq3;

    .line 33
    .line 34
    new-instance v3, Lgs1;

    .line 35
    .line 36
    const/4 v4, 0x7

    .line 37
    invoke-direct {v3, v0, p1, v4}, Lgs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    check-cast v2, Lld2;

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-class v3, Ljava/util/concurrent/ExecutionException;

    .line 47
    .line 48
    sget-object v4, Lfi1;->d:Lfi1;

    .line 49
    .line 50
    invoke-static {v2, v3, v4, v1}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    :goto_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    new-instance v4, Lux2;

    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    invoke-direct {v4, v0, p1, v3, v5}, Lux2;-><init>(Ljava/lang/Object;Lfa2;II)V

    .line 62
    .line 63
    .line 64
    const-class p1, Lmy2;

    .line 65
    .line 66
    invoke-static {v2, p1, v4, v1}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/16 v0, 0xb

    .line 71
    .line 72
    iget-object v1, p0, Lyx2;->g:Landroid/content/Context;

    .line 73
    .line 74
    invoke-static {v1, v0}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {p1, v0}, Lqb1;->C(Ln70;Laa3;)V

    .line 79
    .line 80
    .line 81
    new-instance v1, Lu42;

    .line 82
    .line 83
    const/4 v2, 0x6

    .line 84
    invoke-direct {v1, v2, p0}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v2, p0, Lyx2;->b:Lpq3;

    .line 88
    .line 89
    invoke-static {p1, v1, v2}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    sget-object v1, Lmz1;->Y5:Liz1;

    .line 94
    .line 95
    sget-object v2, Ltw1;->e:Ltw1;

    .line 96
    .line 97
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 98
    .line 99
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_1

    .line 110
    .line 111
    sget-object v1, Lmz1;->Z5:Liz1;

    .line 112
    .line 113
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 114
    .line 115
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    int-to-long v1, v1

    .line 126
    iget-object v3, p0, Lyx2;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 127
    .line 128
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 129
    .line 130
    invoke-static {p1, v1, v2, v4, v3}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    sget-object v1, Lfi1;->e:Lfi1;

    .line 135
    .line 136
    sget-object v2, Lmd2;->g:Lld2;

    .line 137
    .line 138
    const-class v3, Ljava/util/concurrent/TimeoutException;

    .line 139
    .line 140
    invoke-static {p1, v3, v1, v2}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :cond_1
    iget-object v1, p0, Lyx2;->f:Lda3;

    .line 145
    .line 146
    const/4 v2, 0x0

    .line 147
    invoke-static {p1, v1, v0, v2}, Lqb1;->P(Ln70;Lda3;Laa3;Z)V

    .line 148
    .line 149
    .line 150
    new-instance v0, Lzs1;

    .line 151
    .line 152
    const/16 v1, 0x16

    .line 153
    .line 154
    invoke-direct {v0, v1, p0}, Lzs1;-><init>(ILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    sget-object v1, Lmd2;->g:Lld2;

    .line 158
    .line 159
    new-instance v2, Ljq3;

    .line 160
    .line 161
    const/4 v3, 0x0

    .line 162
    invoke-direct {v2, p1, v0, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v2, v1}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 166
    .line 167
    .line 168
    return-object p1
.end method
