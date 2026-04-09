.class public final Lp64;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final c:Lp64;


# instance fields
.field public final a:Lvg0;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp64;

    .line 2
    .line 3
    invoke-direct {v0}, Lp64;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp64;->c:Lp64;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lp64;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Lvg0;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Lvg0;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lp64;->a:Lvg0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lv64;
    .locals 5

    .line 1
    sget-object v0, Ly54;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Lp64;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lv64;

    .line 12
    .line 13
    if-nez v1, :cond_4

    .line 14
    .line 15
    iget-object v1, p0, Lp64;->a:Lvg0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v2, Lw64;->a:Lpz;

    .line 21
    .line 22
    const-class v2, Lp54;

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    sget v2, Lu44;->a:I

    .line 31
    .line 32
    :cond_0
    iget-object v1, v1, Lvg0;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lrc3;

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Lrc3;->j(Ljava/lang/Class;)Lr64;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget v2, v1, Lr64;->d:I

    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    and-int/2addr v2, v3

    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    sget v2, Lu44;->a:I

    .line 47
    .line 48
    sget-object v2, Lw64;->a:Lpz;

    .line 49
    .line 50
    sget-object v3, Lj54;->a:Lt24;

    .line 51
    .line 52
    iget-object v1, v1, Lr64;->a:Ls44;

    .line 53
    .line 54
    new-instance v3, Ll64;

    .line 55
    .line 56
    invoke-direct {v3, v2, v1}, Ll64;-><init>(Lpz;Ls44;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    sget v2, Lu44;->a:I

    .line 61
    .line 62
    sget v2, Lm64;->a:I

    .line 63
    .line 64
    sget v2, Ld64;->a:I

    .line 65
    .line 66
    sget-object v2, Lw64;->a:Lpz;

    .line 67
    .line 68
    invoke-virtual {v1}, Lr64;->a()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    add-int/lit8 v3, v3, -0x1

    .line 73
    .line 74
    const/4 v4, 0x1

    .line 75
    if-eq v3, v4, :cond_2

    .line 76
    .line 77
    sget-object v3, Lj54;->a:Lt24;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    const/4 v3, 0x0

    .line 81
    :goto_0
    sget v4, Lh64;->a:I

    .line 82
    .line 83
    invoke-static {v1, v2, v3}, Lk64;->z(Lr64;Lpz;Lt24;)Lk64;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    :goto_1
    invoke-virtual {v0, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lv64;

    .line 92
    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_3
    return-object v3

    .line 97
    :cond_4
    return-object v1

    .line 98
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    .line 99
    .line 100
    const-string v0, "messageType"

    .line 101
    .line 102
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1
.end method
