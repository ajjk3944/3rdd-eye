.class public final Lda1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic l:I


# instance fields
.field public final f:Lou0;

.field public final g:Landroid/content/Context;

.field public final h:Loa1;

.field public final i:Landroidx/work/ListenableWorker;

.field public final j:Lfa1;

.field public final k:Ll01;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WorkForegroundRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Lh80;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Loa1;Landroidx/work/ListenableWorker;Lfa1;Lxb4;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lou0;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lda1;->f:Lou0;

    .line 10
    .line 11
    iput-object p1, p0, Lda1;->g:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p2, p0, Lda1;->h:Loa1;

    .line 14
    .line 15
    iput-object p3, p0, Lda1;->i:Landroidx/work/ListenableWorker;

    .line 16
    .line 17
    iput-object p4, p0, Lda1;->j:Lfa1;

    .line 18
    .line 19
    iput-object p5, p0, Lda1;->k:Ll01;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lda1;->h:Loa1;

    .line 2
    .line 3
    iget-boolean v0, v0, Loa1;->q:Z

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lgc;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Lou0;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lda1;->k:Ll01;

    .line 20
    .line 21
    check-cast v1, Lxb4;

    .line 22
    .line 23
    iget-object v2, v1, Lxb4;->i:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lia1;

    .line 26
    .line 27
    new-instance v3, Lca1;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct {v3, p0, v0, v4}, Lca1;-><init>(Lda1;Lou0;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lia1;->execute(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Lca1;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-direct {v2, p0, v0, v3}, Lca1;-><init>(Lda1;Lou0;I)V

    .line 40
    .line 41
    .line 42
    iget-object v1, v1, Lxb4;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lia1;

    .line 45
    .line 46
    invoke-virtual {v0, v2, v1}, Ly;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    :goto_0
    iget-object v0, p0, Lda1;->f:Lou0;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-virtual {v0, v1}, Lou0;->i(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    return-void
.end method
