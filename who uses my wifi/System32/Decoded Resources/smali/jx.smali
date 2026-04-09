.class public final Ljx;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lk00;
.implements Lat0;
.implements Lr61;


# instance fields
.field public final f:Liw;

.field public final g:Lq61;

.field public h:Ld60;

.field public i:Lgw3;


# direct methods
.method public constructor <init>(Liw;Lq61;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Ljx;->h:Ld60;

    .line 6
    .line 7
    iput-object v0, p0, Ljx;->i:Lgw3;

    .line 8
    .line 9
    iput-object p1, p0, Ljx;->f:Liw;

    .line 10
    .line 11
    iput-object p2, p0, Ljx;->g:Lq61;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Lvq2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljx;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ljx;->i:Lgw3;

    .line 5
    .line 6
    iget-object v0, v0, Lgw3;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvq2;

    .line 9
    .line 10
    return-object v0
.end method

.method public final b(Lt50;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljx;->h:Ld60;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ld60;->d(Lt50;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c()Lmf0;
    .locals 5

    .line 1
    iget-object v0, p0, Ljx;->f:Liw;

    .line 2
    .line 3
    invoke-virtual {v0}, Liw;->G()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    instance-of v2, v1, Landroid/app/Application;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, Landroid/app/Application;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    check-cast v1, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_1
    new-instance v2, Lmf0;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {v2, v3}, Lmf0;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iget-object v3, v2, Lwk;->a:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    sget-object v4, Lo61;->l:Lts0;

    .line 41
    .line 42
    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_2
    sget-object v1, Lg82;->g:Lpz;

    .line 46
    .line 47
    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object v1, Lg82;->h:Lts0;

    .line 51
    .line 52
    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    iget-object v0, v0, Liw;->k:Landroid/os/Bundle;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    sget-object v1, Lg82;->i:Lus0;

    .line 60
    .line 61
    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_3
    return-object v2
.end method

.method public final d()Lq61;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljx;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ljx;->g:Lq61;

    .line 5
    .line 6
    return-object v0
.end method

.method public final e()Ld60;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljx;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ljx;->h:Ld60;

    .line 5
    .line 6
    return-object v0
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Ljx;->h:Ld60;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ld60;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Ld60;-><init>(Lb60;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ljx;->h:Ld60;

    .line 11
    .line 12
    new-instance v0, Lzs0;

    .line 13
    .line 14
    new-instance v1, Lga0;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v1, v2, p0}, Lga0;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, p0, v1}, Lzs0;-><init>(Lat0;Lga0;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lgw3;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lgw3;-><init>(Lzs0;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Ljx;->i:Lgw3;

    .line 29
    .line 30
    invoke-virtual {v1}, Lgw3;->x()V

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Lg82;->g(Lat0;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method
