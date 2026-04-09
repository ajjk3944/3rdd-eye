.class public final Lb32;
.super Ljo1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final r:Lpd2;

.field public final s:Lwb4;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpd2;)V
    .locals 8

    .line 1
    new-instance v0, Lzs1;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lzs1;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {p0, v1, p1, v0}, Ljo1;-><init>(ILjava/lang/String;Llo1;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lb32;->r:Lpd2;

    .line 13
    .line 14
    new-instance p2, Lwb4;

    .line 15
    .line 16
    invoke-direct {p2}, Lwb4;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lb32;->s:Lwb4;

    .line 20
    .line 21
    invoke-static {}, Lwb4;->c()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    new-instance v1, Lmc2;

    .line 29
    .line 30
    const/16 v6, 0x1a

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    const-string v3, "GET"

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    move-object v5, v4

    .line 37
    move-object v2, p1

    .line 38
    invoke-direct/range {v1 .. v7}, Lmc2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 39
    .line 40
    .line 41
    const-string p1, "onNetworkRequest"

    .line 42
    .line 43
    invoke-virtual {p2, p1, v1}, Lwb4;->e(Ljava/lang/String;Lbb4;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final h(Lho1;)Lrl;
    .locals 2

    .line 1
    invoke-static {p1}, Lwl2;->C(Lho1;)Lao1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lrl;

    .line 6
    .line 7
    invoke-direct {v1, p1, v0}, Lrl;-><init>(Ljava/lang/Object;Lao1;)V

    .line 8
    .line 9
    .line 10
    return-object v1
.end method

.method public final i(Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, Lho1;

    .line 2
    .line 3
    iget-object v0, p1, Lho1;->c:Ljava/util/Map;

    .line 4
    .line 5
    iget v1, p1, Lho1;->a:I

    .line 6
    .line 7
    iget-object v2, p0, Lb32;->s:Lwb4;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lwb4;->c()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v3, Lt3;

    .line 20
    .line 21
    const/16 v4, 0x10

    .line 22
    .line 23
    invoke-direct {v3, v1, v0, v4}, Lt3;-><init>(ILjava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    const-string v0, "onNetworkResponse"

    .line 27
    .line 28
    invoke-virtual {v2, v0, v3}, Lwb4;->e(Ljava/lang/String;Lbb4;)V

    .line 29
    .line 30
    .line 31
    const/16 v0, 0xc8

    .line 32
    .line 33
    if-lt v1, v0, :cond_1

    .line 34
    .line 35
    const/16 v0, 0x12c

    .line 36
    .line 37
    if-lt v1, v0, :cond_2

    .line 38
    .line 39
    :cond_1
    new-instance v0, Ler3;

    .line 40
    .line 41
    const/4 v1, 0x5

    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-direct {v0, v3, v1}, Ler3;-><init>(Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    const-string v1, "onNetworkRequestError"

    .line 47
    .line 48
    invoke-virtual {v2, v1, v0}, Lwb4;->e(Ljava/lang/String;Lbb4;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    iget-object v0, p1, Lho1;->b:[B

    .line 52
    .line 53
    invoke-static {}, Lwb4;->c()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    if-eqz v0, :cond_4

    .line 61
    .line 62
    new-instance v1, Lit3;

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-direct {v1, v3, v0}, Lit3;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const-string v0, "onNetworkResponseBody"

    .line 69
    .line 70
    invoke-virtual {v2, v0, v1}, Lwb4;->e(Ljava/lang/String;Lbb4;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    :goto_1
    iget-object v0, p0, Lb32;->r:Lpd2;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    return-void
.end method
