.class public final Lu83;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lw62;


# direct methods
.method public constructor <init>(Lw62;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu83;->a:Lw62;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lu83;->a:Lw62;

    .line 2
    .line 3
    invoke-interface {v0}, Lw62;->m()Z

    .line 4
    .line 5
    .line 6
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    return v0

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    new-instance v1, Ln83;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    throw v1
.end method

.method public final b(Z)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lu83;->a:Lw62;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lw62;->i3(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    new-instance v0, Ln83;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method
