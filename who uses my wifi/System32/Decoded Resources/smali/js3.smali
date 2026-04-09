.class public final Ljs3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lth3;


# instance fields
.field public final f:Lth3;

.field public g:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lth3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljs3;->f:Lth3;

    .line 5
    .line 6
    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 7
    .line 8
    iput-object p1, p0, Ljs3;->g:Landroid/net/Uri;

    .line 9
    .line 10
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lij3;)J
    .locals 3

    .line 1
    iget-object v0, p0, Ljs3;->f:Lth3;

    .line 2
    .line 3
    iget-object v1, p1, Lij3;->a:Landroid/net/Uri;

    .line 4
    .line 5
    iput-object v1, p0, Ljs3;->g:Landroid/net/Uri;

    .line 6
    .line 7
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 8
    .line 9
    :try_start_0
    invoke-interface {v0, p1}, Lth3;->a(Lij3;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-interface {v0}, Lth3;->h()Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iput-object p1, p0, Ljs3;->g:Landroid/net/Uri;

    .line 20
    .line 21
    :cond_0
    invoke-interface {v0}, Lth3;->g()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    return-wide v1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    invoke-interface {v0}, Lth3;->h()Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iput-object v1, p0, Ljs3;->g:Landroid/net/Uri;

    .line 34
    .line 35
    :goto_0
    invoke-interface {v0}, Lth3;->g()Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method public final b(Lws3;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ljs3;->f:Lth3;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lth3;->b(Lws3;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final d([BII)I
    .locals 1

    .line 1
    iget-object v0, p0, Ljs3;->f:Lth3;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lua4;->d([BII)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final g()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Ljs3;->f:Lth3;

    .line 2
    .line 3
    invoke-interface {v0}, Lth3;->g()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final h()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Ljs3;->f:Lth3;

    .line 2
    .line 3
    invoke-interface {v0}, Lth3;->h()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final l()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljs3;->f:Lth3;

    .line 2
    .line 3
    invoke-interface {v0}, Lth3;->l()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
