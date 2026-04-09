.class public final Landroidx/compose/ui/platform/Q;
.super LIi/J;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/Q$c;
    }
.end annotation


# static fields
.field public static final m:Landroidx/compose/ui/platform/Q$c;

.field public static final n:I

.field private static final o:LYg/m;

.field private static final p:Ljava/lang/ThreadLocal;


# instance fields
.field private final c:Landroid/view/Choreographer;

.field private final d:Landroid/os/Handler;

.field private final e:Ljava/lang/Object;

.field private final f:LZg/m;

.field private g:Ljava/util/List;

.field private h:Ljava/util/List;

.field private i:Z

.field private j:Z

.field private final k:Landroidx/compose/ui/platform/Q$d;

.field private final l:LT/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/Q$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/Q$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/platform/Q;->m:Landroidx/compose/ui/platform/Q$c;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/Q;->n:I

    sget-object v0, Landroidx/compose/ui/platform/Q$a;->a:Landroidx/compose/ui/platform/Q$a;

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/platform/Q;->o:LYg/m;

    new-instance v0, Landroidx/compose/ui/platform/Q$b;

    invoke-direct {v0}, Landroidx/compose/ui/platform/Q$b;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/Q;->p:Ljava/lang/ThreadLocal;

    return-void
.end method

.method private constructor <init>(Landroid/view/Choreographer;Landroid/os/Handler;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LIi/J;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/compose/ui/platform/Q;->c:Landroid/view/Choreographer;

    .line 4
    iput-object p2, p0, Landroidx/compose/ui/platform/Q;->d:Landroid/os/Handler;

    .line 5
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/Q;->e:Ljava/lang/Object;

    .line 6
    new-instance p2, LZg/m;

    invoke-direct {p2}, LZg/m;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/Q;->f:LZg/m;

    .line 7
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/Q;->g:Ljava/util/List;

    .line 8
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/Q;->h:Ljava/util/List;

    .line 9
    new-instance p2, Landroidx/compose/ui/platform/Q$d;

    invoke-direct {p2, p0}, Landroidx/compose/ui/platform/Q$d;-><init>(Landroidx/compose/ui/platform/Q;)V

    iput-object p2, p0, Landroidx/compose/ui/platform/Q;->k:Landroidx/compose/ui/platform/Q$d;

    .line 10
    new-instance p2, Landroidx/compose/ui/platform/T;

    invoke-direct {p2, p1, p0}, Landroidx/compose/ui/platform/T;-><init>(Landroid/view/Choreographer;Landroidx/compose/ui/platform/Q;)V

    iput-object p2, p0, Landroidx/compose/ui/platform/Q;->l:LT/g0;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/Choreographer;Landroid/os/Handler;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/platform/Q;-><init>(Landroid/view/Choreographer;Landroid/os/Handler;)V

    return-void
.end method

.method private final A0(J)V
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/platform/Q;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Landroidx/compose/ui/platform/Q;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_1
    iput-boolean v1, p0, Landroidx/compose/ui/platform/Q;->j:Z

    iget-object v2, p0, Landroidx/compose/ui/platform/Q;->g:Ljava/util/List;

    iget-object v3, p0, Landroidx/compose/ui/platform/Q;->h:Ljava/util/List;

    iput-object v3, p0, Landroidx/compose/ui/platform/Q;->g:Ljava/util/List;

    iput-object v2, p0, Landroidx/compose/ui/platform/Q;->h:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/Choreographer$FrameCallback;

    invoke-interface {v3, p1, p2}, Landroid/view/Choreographer$FrameCallback;->doFrame(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->clear()V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method private final B0()V
    .locals 2

    :cond_0
    invoke-direct {p0}, Landroidx/compose/ui/platform/Q;->z0()Ljava/lang/Runnable;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    invoke-direct {p0}, Landroidx/compose/ui/platform/Q;->z0()Ljava/lang/Runnable;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/Q;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/compose/ui/platform/Q;->f:LZg/m;

    invoke-virtual {v1}, LZg/m;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/compose/ui/platform/Q;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    if-nez v1, :cond_0

    return-void

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method public static final synthetic p0()Ljava/lang/ThreadLocal;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/Q;->p:Ljava/lang/ThreadLocal;

    return-object v0
.end method

.method public static final synthetic q0(Landroidx/compose/ui/platform/Q;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/Q;->d:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic r0(Landroidx/compose/ui/platform/Q;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/Q;->e:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic s0()LYg/m;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/Q;->o:LYg/m;

    return-object v0
.end method

.method public static final synthetic t0(Landroidx/compose/ui/platform/Q;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/Q;->g:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic u0(Landroidx/compose/ui/platform/Q;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/platform/Q;->A0(J)V

    return-void
.end method

.method public static final synthetic v0(Landroidx/compose/ui/platform/Q;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/Q;->B0()V

    return-void
.end method

.method public static final synthetic w0(Landroidx/compose/ui/platform/Q;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/Q;->j:Z

    return-void
.end method

.method private final z0()Ljava/lang/Runnable;
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/Q;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/compose/ui/platform/Q;->f:LZg/m;

    invoke-virtual {v1}, LZg/m;->N0()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public final C0(Landroid/view/Choreographer$FrameCallback;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/Q;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/compose/ui/platform/Q;->g:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean p1, p0, Landroidx/compose/ui/platform/Q;->j:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/platform/Q;->j:Z

    iget-object p1, p0, Landroidx/compose/ui/platform/Q;->c:Landroid/view/Choreographer;

    iget-object v1, p0, Landroidx/compose/ui/platform/Q;->k:Landroidx/compose/ui/platform/Q$d;

    invoke-virtual {p1, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final D0(Landroid/view/Choreographer$FrameCallback;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/Q;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/compose/ui/platform/Q;->g:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public Y(Ldh/i;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, Landroidx/compose/ui/platform/Q;->e:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/platform/Q;->f:LZg/m;

    invoke-virtual {v0, p2}, LZg/m;->addLast(Ljava/lang/Object;)V

    iget-boolean p2, p0, Landroidx/compose/ui/platform/Q;->i:Z

    if-nez p2, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p0, Landroidx/compose/ui/platform/Q;->i:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/Q;->d:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/compose/ui/platform/Q;->k:Landroidx/compose/ui/platform/Q$d;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-boolean v0, p0, Landroidx/compose/ui/platform/Q;->j:Z

    if-nez v0, :cond_0

    iput-boolean p2, p0, Landroidx/compose/ui/platform/Q;->j:Z

    iget-object p2, p0, Landroidx/compose/ui/platform/Q;->c:Landroid/view/Choreographer;

    iget-object v0, p0, Landroidx/compose/ui/platform/Q;->k:Landroidx/compose/ui/platform/Q$d;

    invoke-virtual {p2, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p2, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1

    throw p2
.end method

.method public final x0()Landroid/view/Choreographer;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/Q;->c:Landroid/view/Choreographer;

    return-object v0
.end method

.method public final y0()LT/g0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/Q;->l:LT/g0;

    return-object v0
.end method
