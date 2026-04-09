.class final Lcom/bumptech/glide/load/engine/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE2/c;
.implements LX2/a$f;


# static fields
.field private static final e:LE1/e;


# instance fields
.field private final a:LX2/c;

.field private b:LE2/c;

.field private c:Z

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/bumptech/glide/load/engine/r$a;

    invoke-direct {v0}, Lcom/bumptech/glide/load/engine/r$a;-><init>()V

    const/16 v1, 0x14

    invoke-static {v1, v0}, LX2/a;->d(ILX2/a$d;)LE1/e;

    move-result-object v0

    sput-object v0, Lcom/bumptech/glide/load/engine/r;->e:LE1/e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LX2/c;->a()LX2/c;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/r;->a:LX2/c;

    return-void
.end method

.method private e(LE2/c;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/load/engine/r;->d:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/engine/r;->c:Z

    iput-object p1, p0, Lcom/bumptech/glide/load/engine/r;->b:LE2/c;

    return-void
.end method

.method static f(LE2/c;)Lcom/bumptech/glide/load/engine/r;
    .locals 1

    sget-object v0, Lcom/bumptech/glide/load/engine/r;->e:LE1/e;

    invoke-interface {v0}, LE1/e;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/engine/r;

    invoke-static {v0}, LW2/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/engine/r;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/load/engine/r;->e(LE2/c;)V

    return-object v0
.end method

.method private g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/r;->b:LE2/c;

    sget-object v0, Lcom/bumptech/glide/load/engine/r;->e:LE1/e;

    invoke-interface {v0, p0}, LE1/e;->a(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/r;->b:LE2/c;

    invoke-interface {v0}, LE2/c;->a()I

    move-result v0

    return v0
.end method

.method public b()LX2/c;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/r;->a:LX2/c;

    return-object v0
.end method

.method public declared-synchronized c()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/r;->a:LX2/c;

    invoke-virtual {v0}, LX2/c;->c()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/engine/r;->d:Z

    iget-boolean v0, p0, Lcom/bumptech/glide/load/engine/r;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/r;->b:LE2/c;

    invoke-interface {v0}, LE2/c;->c()V

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/r;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public d()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/r;->b:LE2/c;

    invoke-interface {v0}, LE2/c;->d()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/r;->b:LE2/c;

    invoke-interface {v0}, LE2/c;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method declared-synchronized h()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/r;->a:LX2/c;

    invoke-virtual {v0}, LX2/c;->c()V

    iget-boolean v0, p0, Lcom/bumptech/glide/load/engine/r;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/load/engine/r;->c:Z

    iget-boolean v0, p0, Lcom/bumptech/glide/load/engine/r;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/r;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already unlocked"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
