.class public final Lky2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lly2;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Lpq3;

.field public final c:Lio2;


# direct methods
.method public constructor <init>(Ljava/util/Map;Lpq3;Lio2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lky2;->a:Ljava/util/Map;

    .line 5
    .line 6
    iput-object p2, p0, Lky2;->b:Lpq3;

    .line 7
    .line 8
    iput-object p3, p0, Lky2;->c:Lio2;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final e(Lfa2;)Ln70;
    .locals 7

    .line 1
    iget-object v0, p0, Lky2;->c:Lio2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio2;->G0(Lfa2;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lhx2;

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-direct {v0, v1}, Lhx2;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lmz1;->R8:Liz1;

    .line 17
    .line 18
    sget-object v2, Ltw1;->e:Ltw1;

    .line 19
    .line 20
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    const-string v2, ","

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    array-length v2, v1

    .line 35
    const/4 v3, 0x0

    .line 36
    :goto_0
    if-ge v3, v2, :cond_1

    .line 37
    .line 38
    aget-object v4, v1, v3

    .line 39
    .line 40
    iget-object v5, p0, Lky2;->a:Ljava/util/Map;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Lga4;

    .line 51
    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    new-instance v5, Lz02;

    .line 55
    .line 56
    const/16 v6, 0x8

    .line 57
    .line 58
    invoke-direct {v5, v4, p1, v6}, Lz02;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    iget-object v4, p0, Lky2;->b:Lpq3;

    .line 62
    .line 63
    const-class v6, Lhx2;

    .line 64
    .line 65
    invoke-static {v0, v6, v5, v4}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    new-instance p1, Lof3;

    .line 73
    .line 74
    const/16 v1, 0x15

    .line 75
    .line 76
    invoke-direct {p1, v1, p0}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object v1, Lmd2;->g:Lld2;

    .line 80
    .line 81
    new-instance v2, Ljq3;

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    invoke-direct {v2, v0, p1, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v0, v2, v1}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 88
    .line 89
    .line 90
    return-object v0
.end method
