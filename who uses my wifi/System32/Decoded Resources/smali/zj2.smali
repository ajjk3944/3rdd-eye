.class public final Lzj2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lov1;


# instance fields
.field public f:Lag2;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Lrj2;

.field public final i:Lym;

.field public j:Z

.field public k:Z

.field public final l:Lwj2;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lrj2;Lym;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lzj2;->j:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lzj2;->k:Z

    .line 8
    .line 9
    new-instance v0, Lwj2;

    .line 10
    .line 11
    invoke-direct {v0}, Lwj2;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lzj2;->l:Lwj2;

    .line 15
    .line 16
    iput-object p1, p0, Lzj2;->g:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    iput-object p2, p0, Lzj2;->h:Lrj2;

    .line 19
    .line 20
    iput-object p3, p0, Lzj2;->i:Lym;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final S0(Lnv1;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lzj2;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-boolean v0, p1, Lnv1;->j:Z

    .line 8
    .line 9
    :goto_0
    iget-object v1, p0, Lzj2;->l:Lwj2;

    .line 10
    .line 11
    iput-boolean v0, v1, Lwj2;->a:Z

    .line 12
    .line 13
    iget-object v0, p0, Lzj2;->i:Lym;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    iput-wide v2, v1, Lwj2;->c:J

    .line 23
    .line 24
    iput-object p1, v1, Lwj2;->e:Lnv1;

    .line 25
    .line 26
    iget-boolean p1, p0, Lzj2;->j:Z

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lzj2;->a()V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final a()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lzj2;->h:Lrj2;

    .line 2
    .line 3
    iget-object v1, p0, Lzj2;->l:Lwj2;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lrj2;->a(Lwj2;)Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lzj2;->f:Lag2;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lzj2;->g:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    new-instance v2, Ln62;

    .line 16
    .line 17
    const/16 v3, 0xe

    .line 18
    .line 19
    invoke-direct {v2, p0, v0, v3}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :catch_0
    invoke-static {}, Lgi2;->R()Z

    .line 27
    .line 28
    .line 29
    return-void
.end method
