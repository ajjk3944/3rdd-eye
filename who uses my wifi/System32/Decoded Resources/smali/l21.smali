.class public final Ll21;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ln21;


# direct methods
.method public constructor <init>(Ln21;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll21;->a:Ln21;

    .line 5
    .line 6
    return-void
.end method

.method public static final a(Landroid/content/Context;)Ll21;
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lc3;->a:Lc3;

    .line 5
    .line 6
    const/16 v3, 0x1e

    .line 7
    .line 8
    if-lt v0, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {v2}, Lc3;->a()I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v4, v1

    .line 16
    :goto_0
    const/4 v5, 0x5

    .line 17
    const/4 v6, 0x0

    .line 18
    const-string v7, "context.getSystemService\u2026opicsManager::class.java)"

    .line 19
    .line 20
    if-lt v4, v5, :cond_1

    .line 21
    .line 22
    new-instance v0, Lk21;

    .line 23
    .line 24
    invoke-static {}, Ltc0;->v()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Ltc0;->k(Ljava/lang/Object;)Landroid/adservices/topics/TopicsManager;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-direct {v0, p0, v1}, Lk21;-><init>(Landroid/adservices/topics/TopicsManager;I)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    if-lt v0, v3, :cond_2

    .line 45
    .line 46
    invoke-virtual {v2}, Lc3;->a()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    :cond_2
    const/4 v0, 0x4

    .line 51
    if-ne v1, v0, :cond_3

    .line 52
    .line 53
    new-instance v0, Lk21;

    .line 54
    .line 55
    invoke-static {}, Ltc0;->v()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, Ltc0;->k(Ljava/lang/Object;)Landroid/adservices/topics/TopicsManager;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const/4 v1, 0x0

    .line 71
    invoke-direct {v0, p0, v1}, Lk21;-><init>(Landroid/adservices/topics/TopicsManager;I)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move-object v0, v6

    .line 76
    :goto_1
    if-eqz v0, :cond_4

    .line 77
    .line 78
    new-instance p0, Ll21;

    .line 79
    .line 80
    invoke-direct {p0, v0}, Ll21;-><init>(Ln21;)V

    .line 81
    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_4
    return-object v6
.end method


# virtual methods
.method public b(Lzy;)Ln70;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzy;",
            ")",
            "Ln70;"
        }
    .end annotation

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lfp;->a:Lon;

    .line 7
    .line 8
    sget-object v0, Lza0;->a:Li00;

    .line 9
    .line 10
    invoke-static {v0}, Lwl2;->a(Lhk;)Lmj;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lkm;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x6

    .line 18
    invoke-direct {v1, p0, p1, v2, v3}, Lkm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Loj;I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lgi2;->b(Lmj;Lhy;)Lyn;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Lpu1;->f(Lyn;)Lbd;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method
